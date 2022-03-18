package com.bytedance.ee.bear.bitable.card.model.enums;

import com.bytedance.ee.util.C13593b;

public enum ECardOperation {
    EDIT_RECORD,
    DELETE_RECORD,
    EXIT,
    SWITCH,
    CONFIRM,
    CANCEL,
    FORWARD_LINK_TABLE,
    BACKWARD_LINK_TABLE,
    ADD_LINKED_RECORD,
    CONFIRM_FORM,
    OPEN;

    public String toString() {
        return C13593b.m55172a(name().toLowerCase());
    }
}
