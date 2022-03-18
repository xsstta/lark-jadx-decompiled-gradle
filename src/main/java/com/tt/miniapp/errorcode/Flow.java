package com.tt.miniapp.errorcode;

public enum Flow {
    Meta("1"),
    Download("2"),
    Main("3"),
    WebView("4"),
    JsCore("5");
    
    private String code;

    public String getCode() {
        return this.code;
    }

    private Flow(String str) {
        this.code = str;
    }
}
