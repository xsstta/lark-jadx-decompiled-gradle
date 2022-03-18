package com.ss.android.lark.passport.infra.entity;

import java.io.Serializable;

public class NextValidInfo implements Serializable {
    private int currentIndex;
    private boolean isToNextValid;

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public boolean isToNextValid() {
        return this.isToNextValid;
    }

    public NextValidInfo(int i, boolean z) {
        this.currentIndex = i;
        this.isToNextValid = z;
    }
}
