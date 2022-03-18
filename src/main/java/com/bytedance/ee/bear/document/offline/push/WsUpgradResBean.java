package com.bytedance.ee.bear.document.offline.push;

import java.io.Serializable;

public class WsUpgradResBean implements Serializable {
    private String type;
    private int version;

    public String getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
