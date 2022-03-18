package com.bytedance.ee.bear.drive.config.fg;

import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.appsetting.annotation.AppConfig;

@AppConfig(key = "drive_cache_config")
public class DriveCacheConfig implements NonProguard {
    private long maxTotalCacheSize;
    private float totalCacheSizePercent;

    public long getMaxTotalCacheSize() {
        return this.maxTotalCacheSize;
    }

    public float getTotalCacheSizePercent() {
        return this.totalCacheSizePercent;
    }

    public String toString() {
        return "DriveCacheConfig{maxTotalCacheSize=" + this.maxTotalCacheSize + ", totalCacheSizePercent=" + this.totalCacheSizePercent + '}';
    }

    public void setMaxTotalCacheSize(long j) {
        this.maxTotalCacheSize = j;
    }

    public void setTotalCacheSizePercent(float f) {
        this.totalCacheSizePercent = f;
    }
}
