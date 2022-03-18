package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class Env implements Serializable {
    public int clientType;
    public String did = "";
    public int flagType;
    public String ip = "";
    public String location = "";
    public String ua = "";

    public Env() {
    }

    public Env(int i, String str, String str2, String str3, String str4, int i2) {
        this.clientType = i;
        this.did = str;
        this.location = str2;
        this.ua = str3;
        this.ip = str4;
        this.flagType = i2;
    }
}
