package com.ss.lark.android.avatar.ui;

import java.io.Serializable;

public enum AvatarSource implements Serializable {
    MOMENTS(0),
    PROFILE(1),
    CHATSETTING(2),
    EDIT_ALIAS(3),
    NONE(4);
    
    private static final long serialVersionUID = 8163352475894755756L;
    int mValue;

    private AvatarSource(int i) {
        this.mValue = i;
    }
}
