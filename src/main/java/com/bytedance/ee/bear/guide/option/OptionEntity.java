package com.bytedance.ee.bear.guide.option;

import com.bytedance.ee.util.io.NonProguard;

public class OptionEntity implements NonProguard {
    private boolean isChecked;
    private String key;
    private String lottieFileName;
    private int titleRes;

    public String getKey() {
        return this.key;
    }

    public String getLottieFileName() {
        return this.lottieFileName;
    }

    public int getTitleRes() {
        return this.titleRes;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z) {
        this.isChecked = z;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLottieFileName(String str) {
        this.lottieFileName = str;
    }

    public void setTitleRes(int i) {
        this.titleRes = i;
    }

    public OptionEntity(String str, int i) {
        this.key = str;
        this.titleRes = i;
    }

    public OptionEntity(String str, int i, String str2) {
        this.key = str;
        this.titleRes = i;
        this.lottieFileName = str2;
    }
}
