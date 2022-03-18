package com.bytedance.ee.lark.infra.network.ref.entity;

public enum ECONetworkSchema {
    HTTP("http"),
    HTTPS("https");
    
    String schema;

    public String getSchema() {
        return this.schema;
    }

    private ECONetworkSchema(String str) {
        this.schema = str;
    }
}
