package com.bytedance.memory.model;

import com.huawei.hms.location.LocationRequest;
import java.io.File;
import java.io.Serializable;

public class MemoryWidgetConfig implements Serializable {
    private static final long serialVersionUID = 2435829043493095963L;
    public boolean mClientAnalyse;
    public AbstractC20095a mDumpShrinkConfig;
    public String mFilePath;
    public boolean mIsDebug;
    public int mMemoryRate = 90;
    public int mNumAnalyse = LocationRequest.PRIORITY_HD_ACCURACY;
    public int mRunStrategy = 1;
    public AbstractC20096b mShrinkConfig;

    /* renamed from: com.bytedance.memory.model.MemoryWidgetConfig$a */
    public interface AbstractC20095a {
        /* renamed from: a */
        boolean mo68135a(File file);
    }

    /* renamed from: com.bytedance.memory.model.MemoryWidgetConfig$b */
    public interface AbstractC20096b {
        /* renamed from: a */
        boolean mo68136a(File file, File file2);
    }

    public boolean clientAnalyse() {
        return this.mClientAnalyse;
    }

    public AbstractC20095a getDumpAndShrinkConfig() {
        return this.mDumpShrinkConfig;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public int getMemoryRate() {
        return this.mMemoryRate;
    }

    public int getNumAnalyse() {
        return this.mNumAnalyse;
    }

    public int getRunStrategy() {
        return this.mRunStrategy;
    }

    public AbstractC20096b getShrinkConfig() {
        return this.mShrinkConfig;
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder implements Serializable {
        private static final long serialVersionUID = 2629625684428405094L;
        private boolean mClientAnalyse;
        private AbstractC20095a mDumpShrinkConfig;
        private String mFilePath;
        private boolean mIsDebug;
        private int mMemoryRate = 90;
        private int mNumAnalyse = LocationRequest.PRIORITY_HD_ACCURACY;
        private int mRunStrategy = 1;
        private AbstractC20096b mShrinkConfig;

        public MemoryWidgetConfig build() {
            MemoryWidgetConfig memoryWidgetConfig = new MemoryWidgetConfig();
            memoryWidgetConfig.mIsDebug = this.mIsDebug;
            memoryWidgetConfig.mClientAnalyse = this.mClientAnalyse;
            memoryWidgetConfig.mNumAnalyse = this.mNumAnalyse;
            memoryWidgetConfig.mMemoryRate = this.mMemoryRate;
            memoryWidgetConfig.mRunStrategy = this.mRunStrategy;
            memoryWidgetConfig.mShrinkConfig = this.mShrinkConfig;
            memoryWidgetConfig.mDumpShrinkConfig = this.mDumpShrinkConfig;
            memoryWidgetConfig.mFilePath = this.mFilePath;
            return memoryWidgetConfig;
        }

        public Builder buildClientAnalyse(boolean z) {
            this.mClientAnalyse = z;
            return this;
        }

        public Builder buildDebug(boolean z) {
            this.mIsDebug = z;
            return this;
        }

        public Builder buildFilePath(String str) {
            this.mFilePath = str;
            return this;
        }

        public Builder buildMemoryRate(int i) {
            this.mMemoryRate = i;
            return this;
        }

        public Builder buildNumAnalyse(int i) {
            this.mNumAnalyse = i;
            return this;
        }

        public Builder buildRunStrategy(int i) {
            this.mRunStrategy = i;
            return this;
        }

        public Builder dumpAndShrinkConfig(AbstractC20095a aVar) {
            this.mDumpShrinkConfig = aVar;
            return this;
        }

        public Builder shrinkConfig(AbstractC20096b bVar) {
            this.mShrinkConfig = bVar;
            return this;
        }
    }

    public String toString() {
        return "MemoryWidgetConfig{ mIsDebug:" + this.mIsDebug + ", mClientAnalyse:" + this.mClientAnalyse + ", mMemoryRate:" + this.mMemoryRate + ", mRunStrategy:" + this.mRunStrategy + ", mFilePath:" + this.mFilePath + ", mShrinkConfig:" + this.mShrinkConfig + ", mDumpShrinkConfig:" + this.mDumpShrinkConfig + " }";
    }

    public void setClientAnalyse(boolean z) {
        this.mClientAnalyse = z;
    }

    public void setMemoryRate(int i) {
        this.mMemoryRate = i;
    }

    public void setNumAnalyse(int i) {
        this.mNumAnalyse = i;
    }

    public void setRunStrategy(int i) {
        this.mRunStrategy = i;
    }
}
