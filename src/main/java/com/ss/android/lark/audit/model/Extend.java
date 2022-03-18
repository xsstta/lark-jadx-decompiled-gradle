package com.ss.android.lark.audit.model;

import java.io.Serializable;

public class Extend implements Serializable {
    public int appDetail;
    public int commentType;
    public int createGroup;
    public int dissGroup;

    public Extend() {
    }

    public Extend(int i, int i2, int i3, int i4) {
        this.commentType = i;
        this.appDetail = i2;
        this.createGroup = i3;
        this.dissGroup = i4;
    }
}
