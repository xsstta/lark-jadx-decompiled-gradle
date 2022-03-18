package com.ss.android.lark.image.api;

public enum DiskCacheStrategy {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);
    
    private final boolean cacheResult;
    private final boolean cacheSource;

    public boolean cacheResult() {
        return this.cacheResult;
    }

    public boolean cacheSource() {
        return this.cacheSource;
    }

    private DiskCacheStrategy(boolean z, boolean z2) {
        this.cacheSource = z;
        this.cacheResult = z2;
    }
}
