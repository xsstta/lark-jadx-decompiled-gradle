package com.ss.android.appcenter.engine.model;

public enum Scene {
    DEFAULT(0),
    NET(1),
    CACHE(2);
    
    private int mSource;

    private int getValue() {
        return this.mSource;
    }

    public boolean isFromCache() {
        if (this.mSource == CACHE.getValue()) {
            return true;
        }
        return false;
    }

    public boolean isFromNet() {
        if (this.mSource == NET.getValue()) {
            return true;
        }
        return false;
    }

    public static Scene fromValue(int i) {
        if (i == 1) {
            return NET;
        }
        if (i != 2) {
            return DEFAULT;
        }
        return CACHE;
    }

    private Scene(int i) {
        this.mSource = i;
    }
}
