package com.chad.library.adapter.base.entity;

import java.io.Serializable;

public abstract class SectionEntity<T> implements Serializable {
    public String header;
    public boolean isHeader;

    /* renamed from: t */
    public T f51255t;

    public SectionEntity(T t) {
        this.f51255t = t;
    }

    public SectionEntity(boolean z, String str) {
        this.isHeader = z;
        this.header = str;
    }
}
