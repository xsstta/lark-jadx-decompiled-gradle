package com.ss.android.eventbus;

public enum ThreadMode {
    POSTING(1),
    MAIN(2),
    BACKGROUDN(3);
    
    int value;

    private ThreadMode(int i) {
        this.value = i;
    }
}
