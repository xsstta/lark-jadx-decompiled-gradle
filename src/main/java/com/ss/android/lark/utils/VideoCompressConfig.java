package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/utils/VideoCompressConfig;", "", "originBigSideMax", "", "originSmallSideMax", "originMaxFPS", "commonBigSideMax", "commonSmallSideMax", "commonMaxFPS", "(IIIIII)V", "getCommonBigSideMax", "()I", "setCommonBigSideMax", "(I)V", "getCommonMaxFPS", "setCommonMaxFPS", "getCommonSmallSideMax", "setCommonSmallSideMax", "getOriginBigSideMax", "setOriginBigSideMax", "getOriginMaxFPS", "setOriginMaxFPS", "getOriginSmallSideMax", "setOriginSmallSideMax", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VideoCompressConfig {
    @SerializedName("common_big_side_max")
    private int commonBigSideMax;
    @SerializedName("common_max_FPS")
    private int commonMaxFPS;
    @SerializedName("common_small_side_max")
    private int commonSmallSideMax;
    @SerializedName("origin_big_side_max")
    private int originBigSideMax;
    @SerializedName("origin_max_FPS")
    private int originMaxFPS;
    @SerializedName("origin_small_side_max")
    private int originSmallSideMax;

    public VideoCompressConfig() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public final int getCommonBigSideMax() {
        return this.commonBigSideMax;
    }

    public final int getCommonMaxFPS() {
        return this.commonMaxFPS;
    }

    public final int getCommonSmallSideMax() {
        return this.commonSmallSideMax;
    }

    public final int getOriginBigSideMax() {
        return this.originBigSideMax;
    }

    public final int getOriginMaxFPS() {
        return this.originMaxFPS;
    }

    public final int getOriginSmallSideMax() {
        return this.originSmallSideMax;
    }

    public final void setCommonBigSideMax(int i) {
        this.commonBigSideMax = i;
    }

    public final void setCommonMaxFPS(int i) {
        this.commonMaxFPS = i;
    }

    public final void setCommonSmallSideMax(int i) {
        this.commonSmallSideMax = i;
    }

    public final void setOriginBigSideMax(int i) {
        this.originBigSideMax = i;
    }

    public final void setOriginMaxFPS(int i) {
        this.originMaxFPS = i;
    }

    public final void setOriginSmallSideMax(int i) {
        this.originSmallSideMax = i;
    }

    public VideoCompressConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.originBigSideMax = i;
        this.originSmallSideMax = i2;
        this.originMaxFPS = i3;
        this.commonBigSideMax = i4;
        this.commonSmallSideMax = i5;
        this.commonMaxFPS = i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VideoCompressConfig(int r5, int r6, int r7, int r8, int r9, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            r5 = 1280(0x500, float:1.794E-42)
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000f
            r6 = 720(0x2d0, float:1.009E-42)
            r12 = 720(0x2d0, float:1.009E-42)
            goto L_0x0010
        L_0x000f:
            r12 = r6
        L_0x0010:
            r6 = r11 & 4
            r0 = 30
            if (r6 == 0) goto L_0x0019
            r1 = 30
            goto L_0x001a
        L_0x0019:
            r1 = r7
        L_0x001a:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0023
            r8 = 960(0x3c0, float:1.345E-42)
            r2 = 960(0x3c0, float:1.345E-42)
            goto L_0x0024
        L_0x0023:
            r2 = r8
        L_0x0024:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002d
            r9 = 540(0x21c, float:7.57E-43)
            r3 = 540(0x21c, float:7.57E-43)
            goto L_0x002e
        L_0x002d:
            r3 = r9
        L_0x002e:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r0 = r10
        L_0x0034:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.VideoCompressConfig.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
