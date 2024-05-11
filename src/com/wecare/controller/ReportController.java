package com.wecare.controller;

import com.wecare.assets.db.Database;
import com.wecare.model.Report;
import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.view.JasperViewer;

public class ReportController {

    public static void generateInvoice(String id) {
        String sql = "SELECT i.invoice_id, "
                + "i.CID, "
                + "i.date_time, "
                + "i.total, "
                + "CONCAT(c.fname, \" \", c.lname) as customer_name, "
                + "t.TTID, tt.price, tt.description, "
                + "t.status FROM (( tbl_invoice i INNER JOIN tbl_test t ON i.invoice_id = t.IID ) "
                + "INNER JOIN tbl_test_type tt ON tt.test_type_id = t.TTID) "
                + "inner join tbl_customer c ON c.customer_id = i.CID where i.invoice_id = '" + id + "'";
        generateReport(new File("src\\com\\wecare\\report_layout\\invoice_layout.jrxml").getAbsolutePath(),
                sql,
                null);
    }

    public static void generate_CBC_Report(String id) {
        String sql = "SELECT r.date_time, "
                + "t.CID, "
                + "CONCAT(p.fname, \" \", p.lname) AS cname, "
                + "p.gender, c.*, ref.*, dat.* "
                + "FROM ( ( ( ( `tbl_result` r INNER JOIN `tbl_cbc_result` c ON r.result_id = c.cbc_id ) "
                + "INNER JOIN tbl_test t ON t.RID = r.result_id ) "
                + "INNER JOIN tbl_customer p ON p.customer_id = t.CID ) "
                + "RIGHT JOIN tbl_cbc_reference_unit ref ON ref.cbc_ref_unit_id = 1 ) "
                + "LEFT JOIN tbl_cbc_reference_data dat ON dat.cbc_ref_id = 1 "
                + "WHERE r.result_id = '" + id + "';";
        generateReport(new File("src\\com\\wecare\\report_layout\\cbc_report_layout.jrxml").getAbsolutePath(),
                sql,
                new HashMap<>() {
            {
                put("img_rbc", new File("src\\com\\wecare\\assets\\image\\logo\\rbc.jpg").getAbsolutePath());
            }
        });
    }

    public static void generate_Monthly_Income_Report() {
        LocalDate first = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        String sql = "SELECT sum(i.total) as \"Total\", "
                + "count(i.CID) As \"no_of_cus\", "
                + "cast(i.date_time as date) AS \"invDate\", "
                + "MONTHNAME('" + first.toString() + "') as \"MonName\" "
                + "FROM tbl_invoice i WHERE i.date_time BETWEEN '" + first.toString() + "' and '" + last.toString() + "' group by invDate;";
        generateReport(new File("src\\com\\wecare\\report_layout\\income_report_layout.jrxml").getAbsolutePath(),
                sql,
                new HashMap<>() {
            {
                put("img_bg", new File("src\\com\\wecare\\assets\\image\\logo\\income_report_bg.jpg").getAbsolutePath());
            }
        });
    }

    public static void generate_Stock_Availability_Report() {
        String sql = "select * from tbl_stock_item;";
        generateReport(new File("src\\com\\wecare\\report_layout\\stock_availability_report_layout.jrxml").getAbsolutePath(),
                sql,
                new HashMap<>() {
            {
                put("img_bg", new File("src\\com\\wecare\\assets\\image\\logo\\stock_availability_report_bg.jpg").getAbsolutePath());
            }
        });
    }

    private static void generateReport(String path, String sql, Map<String, Object> map) {
        try {
            JasperDesign design = net.sf.jasperreports.engine.xml.JRXmlLoader.load(path);
            JRDesignQuery update = new JRDesignQuery();
            update.setText(sql);
            design.setQuery(update);
            JasperReport newJasperReport = JasperCompileManager.compileReport(design);
            JasperPrint jprint = JasperFillManager.fillReport(newJasperReport, map, Database.getConnectionTo_SystemDB());
            JasperViewer.viewReport(jprint, false);
        } catch (SQLException | JRException | NoClassDefFoundError e) {
            JOptionPane.showMessageDialog(null,
                    "Reporting api has got into some problems.\nError: "+e.getMessage(),
                    "Api error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ReportController() {
    }

    public ReportController(Report report) {
        this.report = report;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    private Report report;
}
