package com.chad.library.adapter.base.entity;

import java.io.Serializable;

public abstract class SectionMultiEntity<T> implements AbstractC20930c, Serializable {
    public String header;
    public boolean isHeader;

    /* renamed from: t */
    public T f51256t;

    public SectionMultiEntity(T t) {
        this.f51256t = t;
    }

    public SectionMultiEntity(boolean z, String str) {
        this.isHeader = z;
        this.header = str;
    }
}
