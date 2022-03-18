package com.ss.android.lark.location.dto;

import java.io.Serializable;

public class POIConfig implements Serializable {
    private static final long serialVersionUID = 6805193021257208981L;
    private String mActionText;
    private boolean mNeedWGSLatLng;
    private boolean mSelfDefine;
    private boolean mSnapshot;

    public String getActionText() {
        return this.mActionText;
    }

    public boolean isNeedWGSLatLng() {
        return this.mNeedWGSLatLng;
    }

    public boolean isSelfDefine() {
        return this.mSelfDefine;
    }

    public boolean isSnapshot() {
        return this.mSnapshot;
    }

    public void setActionText(String str) {
        this.mActionText = str;
    }

    public void setNeedWGSLatLng(boolean z) {
        this.mNeedWGSLatLng = z;
    }

    public void setSelfDefine(boolean z) {
        this.mSelfDefine = z;
    }

    public void setSnapshot(boolean z) {
        this.mSnapshot = z;
    }
}
