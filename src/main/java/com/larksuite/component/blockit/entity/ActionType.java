package com.larksuite.component.blockit.entity;

public enum ActionType {
    HashTag(1),
    Todo(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ActionType valueOf(int i) {
        return forNumber(i);
    }

    public static ActionType forNumber(int i) {
        if (i == 1) {
            return HashTag;
        }
        if (i != 2) {
            return null;
        }
        return Todo;
    }

    private ActionType(int i) {
        this.value = i;
    }
}
