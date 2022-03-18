package com.ss.android.appcenter.business.activity.appsetting;

public enum Scene {
    H5(0),
    MINI_APP(1);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    public static Scene getScene(int i) {
        if (i == 0) {
            return H5;
        }
        if (i != 1) {
            return null;
        }
        return MINI_APP;
    }

    private Scene(int i) {
        this.value = i;
    }
}
