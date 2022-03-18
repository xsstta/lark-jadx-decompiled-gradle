package com.bytedance.ee.plugin.common.pdftron.wrapper;

public class PendingHighlightInfo {
    Annot mHighlight;
    String mSelectedText;

    public PendingHighlightInfo() {
    }

    public Annot getHighlight() {
        return this.mHighlight;
    }

    public String getSelectedText() {
        return this.mSelectedText;
    }

    public void setHighlight(Annot annot) {
        this.mHighlight = annot;
    }

    public void setSelectedText(String str) {
        this.mSelectedText = str;
    }

    public PendingHighlightInfo(Annot annot, String str) {
        this.mHighlight = annot;
        this.mSelectedText = str;
    }
}
