package com.ss.android.lark.biz.im.api;

public enum ChatSettingApplyWay {
    SELF_APPLY(1),
    INVITATION(2);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ChatSettingApplyWay valueOf(int i) {
        return forNumber(i);
    }

    public static ChatSettingApplyWay forNumber(int i) {
        if (i == 1) {
            return SELF_APPLY;
        }
        if (i != 2) {
            return null;
        }
        return INVITATION;
    }

    private ChatSettingApplyWay(int i) {
        this.value = i;
    }
}
