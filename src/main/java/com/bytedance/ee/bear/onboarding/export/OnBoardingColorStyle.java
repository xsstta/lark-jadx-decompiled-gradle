package com.bytedance.ee.bear.onboarding.export;

import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "", "bgColorRes", "", "shadowColorRes", "maskColorRes", "(Ljava/lang/String;IIII)V", "getBgColorRes", "()I", "getMaskColorRes", "getShadowColorRes", "Blue", "onboarding-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum OnBoardingColorStyle {
    Blue(R.color.space_kit_b400, R.color.space_kit_b900, R.color.bg_mask);
    
    private final int bgColorRes;
    private final int maskColorRes;
    private final int shadowColorRes;

    public final int getBgColorRes() {
        return this.bgColorRes;
    }

    public final int getMaskColorRes() {
        return this.maskColorRes;
    }

    public final int getShadowColorRes() {
        return this.shadowColorRes;
    }

    private OnBoardingColorStyle(int i, int i2, int i3) {
        this.bgColorRes = i;
        this.shadowColorRes = i2;
        this.maskColorRes = i3;
    }
}
