package com.ss.android.lark.chatsetting.dto;

import java.io.Serializable;

public class Profile implements Serializable {
    private String department;
    private String email;

    public String getDepartment() {
        return this.department;
    }

    public String getEmail() {
        return this.email;
    }

    public Profile(String str, String str2) {
        this.email = str;
        this.department = str2;
    }
}
