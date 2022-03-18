package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import java.io.Serializable;

public class PermissionDataV2 implements Serializable {
    private int code;
    private String message;
    private int permission;
    private int permission_v2;
    private boolean readAble;
    private String token;

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getPermission() {
        return this.permission;
    }

    public int getPermission_v2() {
        return this.permission_v2;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isReadAble() {
        return this.readAble;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPermission(int i) {
        this.permission = i;
    }

    public void setPermission_v2(int i) {
        this.permission_v2 = i;
    }

    public void setReadAble(boolean z) {
        this.readAble = z;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
