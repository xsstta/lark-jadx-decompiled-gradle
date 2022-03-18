package com.ss.android.lark.biz.im.api;

public enum ChatterNameDisplayRule {
    NAME(1),
    ALIAS_NAME(2),
    NICKNAME_ALIAS_NAME(3),
    ALIAS_NICKNAME_NAME(4),
    NICKNAME_NAME(5),
    NICKNAME_WITH_ALIAS(6);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ChatterNameDisplayRule valueOf(int i) {
        return forNumber(i);
    }

    public static ChatterNameDisplayRule forNumber(int i) {
        if (i == 1) {
            return NAME;
        }
        if (i == 2) {
            return ALIAS_NAME;
        }
        if (i == 3) {
            return NICKNAME_ALIAS_NAME;
        }
        if (i == 4) {
            return ALIAS_NICKNAME_NAME;
        }
        if (i != 5) {
            return null;
        }
        return NICKNAME_NAME;
    }

    private ChatterNameDisplayRule(int i) {
        this.value = i;
    }
}
