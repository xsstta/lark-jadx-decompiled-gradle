package com.bytedance.ee.bear.todocenter.template.entity;

import com.bytedance.ee.util.io.NonProguard;

public class TodoTemplateEntity implements NonProguard {
    public String obj_token;
    public String obj_url;
    public int type;

    public String getUrl() {
        return this.obj_url;
    }
}
