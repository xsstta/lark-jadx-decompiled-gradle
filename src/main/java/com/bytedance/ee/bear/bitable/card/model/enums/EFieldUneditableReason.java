package com.bytedance.ee.bear.bitable.card.model.enums;

import com.bytedance.ee.util.C13593b;

public enum EFieldUneditableReason {
    FIELD_NOT_SUPPORT_EDIT,
    SUITE_NO_EDIT_PERM,
    LANDSCAPE_READONLY,
    ATTACHMENT_FORBIDDEN_IN_PRO,
    OTHERS;

    public String toString() {
        return C13593b.m55172a(name().toLowerCase());
    }
}
