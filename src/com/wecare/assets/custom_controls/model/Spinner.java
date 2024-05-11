package com.wecare.assets.custom_controls.model;

import javax.swing.JSpinner;

public class Spinner extends JSpinner {

    public void setLabelText(String text) {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        editor.setLabelText(text);
    }

    public String getLabelText() {
        SpinnerUI.Editor editor = (SpinnerUI.Editor) getEditor();
        return editor.getLabelText();
    }

    public void setDecimals(boolean flg, int decimals) {
        SpinnerUI s = new SpinnerUI();
        s.setDecimal_places(2);
        s.setSetDecimals(true);
        this.setUI(s);
    }
    
    public Spinner() {
        setOpaque(false);
        setUI(new SpinnerUI());
    }
}
