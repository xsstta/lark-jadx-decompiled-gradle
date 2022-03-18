package com.bytedance.ee.lark.infra.network.ref.entity;

public enum MethodType {
    GET("get"),
    POST("post"),
    HEAD("head"),
    DELETE("delete"),
    PUT("put"),
    PATCH("patch");
    
    String method;

    public String getValue() {
        return this.method;
    }

    private MethodType(String str) {
        this.method = str;
    }
}
