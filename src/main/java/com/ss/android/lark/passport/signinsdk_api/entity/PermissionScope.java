package com.ss.android.lark.passport.signinsdk_api.entity;

import java.io.Serializable;

public class PermissionScope implements Serializable {
    public boolean isSelected = true;
    public String key;
    public boolean required;
    public String text;
}
