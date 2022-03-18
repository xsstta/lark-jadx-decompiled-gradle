package com.larksuite.component.blockit.entity;

public enum GrantRecordType {
    None(0),
    User(1),
    Department(2),
    Leader(3),
    Brother(4),
    TenantAdmin(5),
    AppAdmin(6),
    VGroup(7),
    Group(101),
    Entity(102);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static GrantRecordType valueOf(int i) {
        return forNumber(i);
    }

    public static GrantRecordType forNumber(int i) {
        if (i == 101) {
            return Group;
        }
        if (i == 102) {
            return Entity;
        }
        switch (i) {
            case 0:
                return None;
            case 1:
                return User;
            case 2:
                return Department;
            case 3:
                return Leader;
            case 4:
                return Brother;
            case 5:
                return TenantAdmin;
            case 6:
                return AppAdmin;
            case 7:
                return VGroup;
            default:
                return null;
        }
    }

    private GrantRecordType(int i) {
        this.value = i;
    }
}
