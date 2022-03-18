package com.bytedance.ee.bear.contract.export;

public enum ExportFormatEnum {
    DOCX("docx"),
    PDF("pdf"),
    XLSX("xlsx"),
    SLIDE2PDF("pdf"),
    SLIDE2PNG("zip");
    
    private String suffix;

    public String getSuffix() {
        return this.suffix;
    }

    public String toString() {
        return name().toLowerCase();
    }

    private ExportFormatEnum(String str) {
        this.suffix = str;
    }
}
