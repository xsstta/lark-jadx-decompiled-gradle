package com.bytedance.ee.bear.document.bridgestatus;

import java.io.Serializable;

public class BridgeReadyModel implements Serializable {
    private String data;
    private String type;

    public String getData() {
        return this.data;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "BridgeReadyModel{type='" + this.type + '\'' + ", data='" + this.data + '\'' + '}';
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
