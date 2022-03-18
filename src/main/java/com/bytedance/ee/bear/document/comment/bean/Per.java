package com.bytedance.ee.bear.document.comment.bean;

import com.bytedance.ee.util.io.NonProguard;

public class Per implements NonProguard {
    public boolean comment;
    public boolean copy = true;
    public boolean delete = true;
    public boolean resolve;

    public String toString() {
        return "Per{resolve=" + this.resolve + ", comment=" + this.comment + ", delete=" + this.delete + ", copy=" + this.copy + '}';
    }
}
