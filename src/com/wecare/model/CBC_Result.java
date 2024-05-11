package com.wecare.model;

public class CBC_Result extends Result{

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMcv() {
        return mcv;
    }

    public void setMcv(int mcv) {
        this.mcv = mcv;
    }

    public double getMch() {
        return mch;
    }

    public void setMch(double mch) {
        this.mch = mch;
    }

    public double getMchc() {
        return mchc;
    }

    public void setMchc(double mchc) {
        this.mchc = mchc;
    }

    public int getNrbc() {
        return nrbc;
    }

    public void setNrbc(int nrbc) {
        this.nrbc = nrbc;
    }

    public int getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(int hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public double getRdw() {
        return rdw;
    }

    public void setRdw(double rdw) {
        this.rdw = rdw;
    }

    public double getRbc_count() {
        return rbc_count;
    }

    public void setRbc_count(double rbc_count) {
        this.rbc_count = rbc_count;
    }

    public double getPacked_cell_volume() {
        return packed_cell_volume;
    }

    public void setPacked_cell_volume(double packed_cell_volume) {
        this.packed_cell_volume = packed_cell_volume;
    }

    public double getTotal_leucocyte_count() {
        return total_leucocyte_count;
    }

    public void setTotal_leucocyte_count(double total_leucocyte_count) {
        this.total_leucocyte_count = total_leucocyte_count;
    }

    public double getAlc_basophils() {
        return alc_basophils;
    }

    public void setAlc_basophils(double alc_basophils) {
        this.alc_basophils = alc_basophils;
    }

    public double getAlc_eosinophils() {
        return alc_eosinophils;
    }

    public void setAlc_eosinophils(double alc_eosinophils) {
        this.alc_eosinophils = alc_eosinophils;
    }

    public double getAlc_lymphocytes() {
        return alc_lymphocytes;
    }

    public void setAlc_lymphocytes(double alc_lymphocytes) {
        this.alc_lymphocytes = alc_lymphocytes;
    }

    public double getAlc_monocytes() {
        return alc_monocytes;
    }

    public void setAlc_monocytes(double alc_monocytes) {
        this.alc_monocytes = alc_monocytes;
    }

    public double getAlc_neutrophils() {
        return alc_neutrophils;
    }

    public void setAlc_neutrophils(double alc_neutrophils) {
        this.alc_neutrophils = alc_neutrophils;
    }

    public double getDlc_basophils() {
        return dlc_basophils;
    }

    public void setDlc_basophils(double dlc_basophils) {
        this.dlc_basophils = dlc_basophils;
    }

    public int getDlc_eosinophils() {
        return dlc_eosinophils;
    }

    public void setDlc_eosinophils(int dlc_eosinophils) {
        this.dlc_eosinophils = dlc_eosinophils;
    }

    public int getDlc_lymphocytes() {
        return dlc_lymphocytes;
    }

    public void setDlc_lymphocytes(int dlc_lymphocytes) {
        this.dlc_lymphocytes = dlc_lymphocytes;
    }

    public int getDlc_monocytes() {
        return dlc_monocytes;
    }

    public void setDlc_monocytes(int dlc_monocytes) {
        this.dlc_monocytes = dlc_monocytes;
    }

    public int getDlc_neutrophils() {
        return dlc_neutrophils;
    }

    public void setDlc_neutrophils(int dlc_neutrophils) {
        this.dlc_neutrophils = dlc_neutrophils;
    }

    public int getPlatelet_count() {
        return platelet_count;
    }

    public void setPlatelet_count(int platelet_count) {
        this.platelet_count = platelet_count;
    }
    
    private String id;
    private int mcv;
    private double mch;
    private double mchc;
    private int nrbc;
    private int hemoglobin;
    private double rdw;
    private double rbc_count;
    private double packed_cell_volume;
    private double total_leucocyte_count;

    private double alc_basophils;
    private double alc_eosinophils;
    private double alc_lymphocytes;
    private double alc_monocytes;
    private double alc_neutrophils;

    private double dlc_basophils;
    private int dlc_eosinophils;
    private int dlc_lymphocytes;
    private int dlc_monocytes;
    private int dlc_neutrophils;
    private int platelet_count;
}
