package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class GoogleAuthURL implements Serializable {
    String authUrl;
    boolean tokenExist;

    public String getAuthUrl() {
        return this.authUrl;
    }

    public boolean isTokenExist() {
        return this.tokenExist;
    }

    public void setAuthUrl(String str) {
        this.authUrl = str;
    }

    public void setTokenExist(boolean z) {
        this.tokenExist = z;
    }
}
