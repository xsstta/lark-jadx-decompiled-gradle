package com.ss.android.appcenter.business.tab.fragmentv2.adapter.model;

public enum Group {
    WIDGET_LIST(1),
    ICON_LIST(2),
    RECTANGLE_BUTTON(3),
    CATEGORY(4),
    DEFAULT(0);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static Group fromValue(int i) {
        if (i == 1) {
            return WIDGET_LIST;
        }
        if (i == 2) {
            return ICON_LIST;
        }
        if (i == 3) {
            return RECTANGLE_BUTTON;
        }
        if (i != 4) {
            return DEFAULT;
        }
        return CATEGORY;
    }

    private Group(int i) {
        this.value = i;
    }
}
