package com.larksuite.component.blockit.entity;

public enum Role {
    None(0),
    Owner(1),
    Member(2),
    Viewer(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static Role valueOf(int i) {
        return forNumber(i);
    }

    public static Role forNumber(int i) {
        if (i == 0) {
            return None;
        }
        if (i == 1) {
            return Owner;
        }
        if (i == 2) {
            return Member;
        }
        if (i != 3) {
            return null;
        }
        return Viewer;
    }

    private Role(int i) {
        this.value = i;
    }
}
