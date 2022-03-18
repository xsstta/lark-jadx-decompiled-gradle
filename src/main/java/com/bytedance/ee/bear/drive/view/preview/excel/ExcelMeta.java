package com.bytedance.ee.bear.drive.view.preview.excel;

import com.bytedance.ee.util.io.NonProguard;

public class ExcelMeta implements NonProguard {
    private String apiPrefix;
    private int index;
    private String previewExtra;

    public String getApiPrefix() {
        return this.apiPrefix;
    }

    public int getIndex() {
        return this.index;
    }

    public String getPreviewExtra() {
        return this.previewExtra;
    }

    public void setApiPrefix(String str) {
        this.apiPrefix = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setPreviewExtra(String str) {
        this.previewExtra = str;
    }
}
