package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class ObjectDetail implements Serializable {
    public String cloneSource = "";
    public String containerID = "";
    public int containerType;
    public String currentPage;
    public String fileName = "";
    public int permissionSettingType;
    public String textDetail = "";
    public String thridPartyAppId = "";

    public ObjectDetail() {
    }

    public ObjectDetail(String str, String str2, String str3, String str4, int i) {
        this.cloneSource = str;
        this.textDetail = str2;
        this.fileName = str3;
        this.thridPartyAppId = str4;
        this.permissionSettingType = i;
    }

    public ObjectDetail(String str, String str2, String str3, String str4, int i, int i2, String str5) {
        this.cloneSource = str;
        this.textDetail = str2;
        this.fileName = str3;
        this.thridPartyAppId = str4;
        this.permissionSettingType = i;
    }
}
