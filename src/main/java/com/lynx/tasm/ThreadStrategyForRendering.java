package com.lynx.tasm;

public enum ThreadStrategyForRendering {
    ALL_ON_UI(0),
    MOST_ON_TASM(1),
    PART_ON_LAYOUT(2),
    MULTI_THREADS(3),
    MULTI_THREADS_ULTRA(4);
    
    private int mId;

    public int id() {
        return this.mId;
    }

    private ThreadStrategyForRendering(int i) {
        this.mId = i;
    }
}
