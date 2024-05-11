package com.wecare.assets.custom_controls.model;

import com.wecare.assets.custom_controls.component.TableCell_Status;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable {

    public int getStatus_column() {
        return status_column;
    }

    public void setStatus_column(int status_column) {
        this.status_column = status_column;
    }

    public boolean isHas_status() {
        return has_status;
    }

    public void setHas_status(boolean has_status) {
        this.has_status = has_status;
    }

    private BufferedImage imageShadow;

    public Table() {
        setRowHeight(50);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader h = new TableHeader(o + "");
                h.setHorizontalAlignment(JLabel.CENTER);
                return h;
            }
        });
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent ce) {
                createShadow();
            }
        });
    }

    private void createShadow() {
        int width = getWidth();
        int height = rowHeight;
        int space = 12;
        int margin = space / 2;
        imageShadow = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        g2.fillRect(0, 0, width - margin, height - margin);
        g2.drawImage(new ShadowRenderer(6, 0.3f, new Color(160, 160, 160)).createShadow(imageShadow), -4, -4, null);
        g2.fillRect(margin, margin, width - space, height - space);
        g2.setComposite(AlphaComposite.Clear);
        g2.fillRect(margin, margin, width - space, height - space);
        g2.dispose();
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) { 
        if (has_status && (i1 == status_column)) {
            TableCell_Status cell = new TableCell_Status(getValueAt(i, i1).toString());
            return cell;
        } else {
            String values = "";
            if (getValueAt(i, i1) != null) {
                values = getValueAt(i, i1).toString();
            }
            TableCell cell = new TableCell(values);
            cell.setHorizontalAlignment(JLabel.CENTER);
            return cell;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int space = 12;
        int margin = space / 2;
        for (int i = 0; i < getRowCount(); i++) {
            int row = i;
            Rectangle r = getCellRect(row, 0, true);
            if (isRowSelected(i)) {
                g2.setColor(new Color(17, 164, 232));
                g2.drawRect(margin, r.getLocation().y + margin, getWidth() - margin * 2, rowHeight - space);
            }
            g2.drawImage(imageShadow, 0, r.getLocation().y, null);
            g2.setColor(new Color(255, 109, 109));
            g2.fillRect(margin, r.getLocation().y + margin, 3, rowHeight - space);
        }
        g2.dispose();
    }

    public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new CustomScrollBar());
    }

    private int status_column;
    private boolean has_status;
}
