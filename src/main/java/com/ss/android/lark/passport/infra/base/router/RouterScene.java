package com.ss.android.lark.passport.infra.base.router;

import java.util.ArrayList;
import java.util.List;

public enum RouterScene {
    ALL(0),
    BEFORE_LOGIN(1),
    ACCOUNT_MANAGER(2),
    SWITCH_USER(3),
    INVITE(4),
    KA(5),
    PWD_MANAGER(6);
    
    public int value;

    public static String getSence(int i) {
        switch (i) {
            case 1:
                return "BEFORE_LOGIN";
            case 2:
                return "ACCOUNT_MANAGER";
            case 3:
                return "SWITCH_USER";
            case 4:
                return "INVITE";
            case 5:
                return "KA";
            case 6:
                return "PWD_MANAGER";
            default:
                return "ALL";
        }
    }

    public int getValue() {
        return this.value;
    }

    public static List<Integer> getSenceList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(BEFORE_LOGIN.value));
        arrayList.add(Integer.valueOf(ACCOUNT_MANAGER.value));
        arrayList.add(Integer.valueOf(SWITCH_USER.value));
        arrayList.add(Integer.valueOf(INVITE.value));
        arrayList.add(Integer.valueOf(KA.value));
        arrayList.add(Integer.valueOf(PWD_MANAGER.value));
        return arrayList;
    }

    public static RouterScene fromValue(int i) {
        switch (i) {
            case 1:
                return BEFORE_LOGIN;
            case 2:
                return ACCOUNT_MANAGER;
            case 3:
                return SWITCH_USER;
            case 4:
                return INVITE;
            case 5:
                return KA;
            case 6:
                return PWD_MANAGER;
            default:
                return ALL;
        }
    }

    private RouterScene(int i) {
        this.value = i;
    }
}
