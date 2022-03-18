package com.bytedance.ee.bear.contract.route.parcelable;

import com.bytedance.ee.util.io.NonProguard;

public class WikNodePerm implements NonProguard, Cloneable {
    public boolean can_add_shortcut;
    public boolean can_clone;
    public boolean can_create;
    public boolean can_delete;
    public boolean can_destroy;
    public boolean can_move;
    public boolean can_rename;
    public boolean can_star;
    public boolean is_locked;

    @Override // java.lang.Object
    public WikNodePerm clone() {
        try {
            return (WikNodePerm) super.clone();
        } catch (Exception unused) {
            return null;
        }
    }

    public static WikNodePerm forbid() {
        WikNodePerm wikNodePerm = new WikNodePerm();
        wikNodePerm.can_add_shortcut = false;
        wikNodePerm.can_clone = false;
        wikNodePerm.can_create = false;
        wikNodePerm.can_delete = false;
        wikNodePerm.can_destroy = false;
        wikNodePerm.can_move = false;
        wikNodePerm.can_rename = false;
        wikNodePerm.can_star = false;
        wikNodePerm.is_locked = false;
        return wikNodePerm;
    }

    public String toString() {
        return "WikNodePerm{can_add_shortcut=" + this.can_add_shortcut + ", can_clone=" + this.can_clone + ", can_create=" + this.can_create + ", can_delete=" + this.can_delete + ", can_destroy=" + this.can_destroy + ", can_move=" + this.can_move + ", can_rename=" + this.can_rename + ", can_star=" + this.can_star + ", is_locked=" + this.is_locked + '}';
    }
}
