package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/utils/RemuxSetting;", "", "originResolution", "", "originFPS", "originBitrate", "commonResolution", "commonFPS", "commonBitrate", "(IIIIII)V", "getCommonBitrate", "()I", "setCommonBitrate", "(I)V", "getCommonFPS", "setCommonFPS", "getCommonResolution", "setCommonResolution", "getOriginBitrate", "setOriginBitrate", "getOriginFPS", "setOriginFPS", "getOriginResolution", "setOriginResolution", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RemuxSetting {
    @SerializedName("common_bitrate")
    private int commonBitrate;
    @SerializedName("common_fps")
    private int commonFPS;
    @SerializedName("common_resolution")
    private int commonResolution;
    @SerializedName("origin_bitrate")
    private int originBitrate;
    @SerializedName("origin_fps")
    private int originFPS;
    @SerializedName("origin_resolution")
    private int originResolution;

    public RemuxSetting() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public final int getCommonBitrate() {
        return this.commonBitrate;
    }

    public final int getCommonFPS() {
        return this.commonFPS;
    }

    public final int getCommonResolution() {
        return this.commonResolution;
    }

    public final int getOriginBitrate() {
        return this.originBitrate;
    }

    public final int getOriginFPS() {
        return this.originFPS;
    }

    public final int getOriginResolution() {
        return this.originResolution;
    }

    public final void setCommonBitrate(int i) {
        this.commonBitrate = i;
    }

    public final void setCommonFPS(int i) {
        this.commonFPS = i;
    }

    public final void setCommonResolution(int i) {
        this.commonResolution = i;
    }

    public final void setOriginBitrate(int i) {
        this.originBitrate = i;
    }

    public final void setOriginFPS(int i) {
        this.originFPS = i;
    }

    public final void setOriginResolution(int i) {
        this.originResolution = i;
    }

    public RemuxSetting(int i, int i2, int i3, int i4, int i5, int i6) {
        this.originResolution = i;
        this.originFPS = i2;
        this.originBitrate = i3;
        this.commonResolution = i4;
        this.commonFPS = i5;
        this.commonBitrate = i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RemuxSetting(int r5, int r6, int r7, int r8, int r9, int r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0007
            r5 = 921600(0xe1000, float:1.291437E-39)
        L_0x0007:
            r12 = r11 & 2
            r0 = 60
            if (r12 == 0) goto L_0x0010
            r12 = 60
            goto L_0x0011
        L_0x0010:
            r12 = r6
        L_0x0011:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x001a
            r7 = 7168(0x1c00, float:1.0045E-41)
            r1 = 7168(0x1c00, float:1.0045E-41)
            goto L_0x001b
        L_0x001a:
            r1 = r7
        L_0x001b:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0026
            r8 = 518400(0x7e900, float:7.26433E-40)
            r2 = 518400(0x7e900, float:7.26433E-40)
            goto L_0x0027
        L_0x0026:
            r2 = r8
        L_0x0027:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = r9
        L_0x002d:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0037
            r6 = 4657420072643335291(0x40a27ae147ae147b, double:2365.44)
            int r10 = (int) r6
        L_0x0037:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r0
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.RemuxSetting.<init>(int, int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
