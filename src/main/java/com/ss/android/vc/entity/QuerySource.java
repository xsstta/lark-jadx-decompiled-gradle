package com.ss.android.vc.entity;

public enum QuerySource {
    UNKNOWN(0),
    ALL_PAGE(1),
    MAGIC_SHARE_PAGE(2),
    SEARCH_LIST_PAGE(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public int getValue() {
        return this.value;
    }

    public static QuerySource fromValue(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ALL_PAGE;
        }
        if (i == 2) {
            return MAGIC_SHARE_PAGE;
        }
        if (i != 3) {
            return UNKNOWN;
        }
        return SEARCH_LIST_PAGE;
    }

    private QuerySource(int i) {
        this.value = i;
    }
}
