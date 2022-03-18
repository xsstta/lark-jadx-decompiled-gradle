package com.bytedance.ee.bear.bitable.card.model.enums;

import com.bytedance.ee.util.C13593b;

public enum ECardsAction {
    SHOW_CARD,
    UPDATE_RECORD,
    UPDATE_FIELD,
    CLOSE_CARD,
    RECORD_FILTERED,
    LINK_TABLE_CHANGED,
    TABLE_RECORDS_DATA_LOADED,
    FORM_FIELDS_VALIDATE,
    SHOW_MANUAL_SUBMIT_CARD,
    SWITCH_CARD,
    SCROLL_CARD,
    UNKNOWN;

    public String toString() {
        return C13593b.m55172a(name().toLowerCase());
    }
}
