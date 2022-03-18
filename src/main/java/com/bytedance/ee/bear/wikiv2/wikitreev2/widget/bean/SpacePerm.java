package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.NonProguard;

public class SpacePerm implements NonProguard, Cloneable {
    public boolean can_clone;
    public boolean can_copy_content;
    public boolean can_create_space;
    public boolean can_edit_first_level;
    public boolean can_export;
    public boolean can_manage_space;
    public boolean can_print;

    @Override // java.lang.Object
    public SpacePerm clone() {
        try {
            return (SpacePerm) super.clone();
        } catch (Exception e) {
            C13479a.m54759a("SpacePerm", "clone rootPermInfo fail. ", e);
            return null;
        }
    }
}
