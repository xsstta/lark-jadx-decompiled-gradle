package com.bytedance.ee.bear.edit.component.toolbar2;

public enum ToolBarV2Type {
    Down(0),
    Doc(2),
    Sheet(3),
    EQUATION(4),
    OKR(6);
    
    int value;

    public static String getName(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 6 ? "unknown" : "okr" : "equation" : "sheet" : "doc";
    }

    public int getValue() {
        return this.value;
    }

    private ToolBarV2Type(int i) {
        this.value = i;
    }
}
