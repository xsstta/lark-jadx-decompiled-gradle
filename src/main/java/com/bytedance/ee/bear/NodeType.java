package com.bytedance.ee.bear;

public enum NodeType {
    SHORT_CUT(1),
    ENTITY(0);
    
    int value;

    public int getValue() {
        return this.value;
    }

    public static boolean isShortcut(int i) {
        if (i == SHORT_CUT.value) {
            return true;
        }
        return false;
    }

    private NodeType(int i) {
        this.value = i;
    }
}
