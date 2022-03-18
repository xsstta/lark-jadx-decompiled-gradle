package com.bytedance.ee.bear.bitable.card.model.enums;

import com.bytedance.ee.util.C13593b;

public enum ESegmentType {
    TEXT,
    MENTION,
    URL,
    UNKNOWN;

    public String toString() {
        return C13593b.m55172a(name().toLowerCase());
    }
}
