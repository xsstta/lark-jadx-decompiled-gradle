package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/ss/android/lark/utils/VeConfig;", "", "remuxFileSize", "", "remuxSetting", "Lcom/ss/android/lark/utils/RemuxSetting;", "externalSetting", "", "internalSetting", "Lcom/ss/android/lark/utils/InternalSetting;", "feature", "Lcom/ss/android/lark/utils/Feature;", "(ILcom/ss/android/lark/utils/RemuxSetting;Ljava/lang/String;Lcom/ss/android/lark/utils/InternalSetting;Lcom/ss/android/lark/utils/Feature;)V", "getExternalSetting", "()Ljava/lang/String;", "setExternalSetting", "(Ljava/lang/String;)V", "getFeature", "()Lcom/ss/android/lark/utils/Feature;", "setFeature", "(Lcom/ss/android/lark/utils/Feature;)V", "getInternalSetting", "()Lcom/ss/android/lark/utils/InternalSetting;", "setInternalSetting", "(Lcom/ss/android/lark/utils/InternalSetting;)V", "getRemuxFileSize", "()I", "setRemuxFileSize", "(I)V", "getRemuxSetting", "()Lcom/ss/android/lark/utils/RemuxSetting;", "setRemuxSetting", "(Lcom/ss/android/lark/utils/RemuxSetting;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VeConfig {
    @SerializedName("external_setting")
    private String externalSetting;
    @SerializedName("feature")
    private Feature feature;
    @SerializedName("internal_setting")
    private InternalSetting internalSetting;
    @SerializedName("remux_max_file_size")
    private int remuxFileSize;
    @SerializedName("remux_setting")
    private RemuxSetting remuxSetting;

    public VeConfig() {
        this(0, null, null, null, null, 31, null);
    }

    public final String getExternalSetting() {
        return this.externalSetting;
    }

    public final Feature getFeature() {
        return this.feature;
    }

    public final InternalSetting getInternalSetting() {
        return this.internalSetting;
    }

    public final int getRemuxFileSize() {
        return this.remuxFileSize;
    }

    public final RemuxSetting getRemuxSetting() {
        return this.remuxSetting;
    }

    public final void setRemuxFileSize(int i) {
        this.remuxFileSize = i;
    }

    public final void setExternalSetting(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.externalSetting = str;
    }

    public final void setFeature(Feature feature2) {
        Intrinsics.checkParameterIsNotNull(feature2, "<set-?>");
        this.feature = feature2;
    }

    public final void setInternalSetting(InternalSetting internalSetting2) {
        Intrinsics.checkParameterIsNotNull(internalSetting2, "<set-?>");
        this.internalSetting = internalSetting2;
    }

    public final void setRemuxSetting(RemuxSetting remuxSetting2) {
        Intrinsics.checkParameterIsNotNull(remuxSetting2, "<set-?>");
        this.remuxSetting = remuxSetting2;
    }

    public VeConfig(int i, RemuxSetting remuxSetting2, String str, InternalSetting internalSetting2, Feature feature2) {
        Intrinsics.checkParameterIsNotNull(remuxSetting2, "remuxSetting");
        Intrinsics.checkParameterIsNotNull(str, "externalSetting");
        Intrinsics.checkParameterIsNotNull(internalSetting2, "internalSetting");
        Intrinsics.checkParameterIsNotNull(feature2, "feature");
        this.remuxFileSize = i;
        this.remuxSetting = remuxSetting2;
        this.externalSetting = str;
        this.internalSetting = internalSetting2;
        this.feature = feature2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VeConfig(int r12, com.ss.android.lark.utils.RemuxSetting r13, java.lang.String r14, com.ss.android.lark.utils.InternalSetting r15, com.ss.android.lark.utils.Feature r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r11 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0007
            r0 = 157286400(0x9600000, float:2.696302E-33)
            goto L_0x0008
        L_0x0007:
            r0 = r12
        L_0x0008:
            r1 = r17 & 2
            if (r1 == 0) goto L_0x001c
            com.ss.android.lark.utils.RemuxSetting r1 = new com.ss.android.lark.utils.RemuxSetting
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 63
            r10 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x001d
        L_0x001c:
            r1 = r13
        L_0x001d:
            r2 = r17 & 4
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "{\"compile\":{\"encode_mode\":\"hw\",\"hw\":{\"bitrate\":7340032,\"profile\":\"high\",\"hp_bitrate_ratio\":\"0.8\",\"sd_bitrate_ratio\":\"0.33\",\"h_fps_bitrate_ratio\":\"1.4\",\"gop\":30,\"transition_bitrate_ratio\":1.2},\"sw\":{\"crf\":17,\"preset\":0,\"profile\":\"high\",\"maxrate\":12233386,\"gop\":30,\"qpoffset\":0}},\"watermark_compile\":{\"encode_mode\":\"hw\",\"hw\":{\"bitrate\":9000000,\"profile\":\"unknown\",\"hp_bitrate_ratio\":\"0.8\",\"sd_bitrate_ratio\":\"0.9\",\"h_fps_bitrate_ratio\":\"1.4\",\"full_hd_bitrate_ratio\":1.33,\"gop\":120,\"transition_bitrate_ratio\":1.2},\"sw\":{\"crf\":17,\"preset\":0,\"profile\":\"unknown\",\"maxrate\":15000000,\"gop\":30,\"qpoffset\":0}},\"bytevc_remux_enable\":false,\"transition_keyframe_enable\":true}"
            goto L_0x0025
        L_0x0024:
            r2 = r14
        L_0x0025:
            r3 = r17 & 8
            if (r3 == 0) goto L_0x0032
            com.ss.android.lark.utils.InternalSetting r3 = new com.ss.android.lark.utils.InternalSetting
            r4 = 3
            r5 = 0
            r6 = 0
            r3.<init>(r6, r6, r4, r5)
            goto L_0x0033
        L_0x0032:
            r3 = r15
        L_0x0033:
            r4 = r17 & 16
            if (r4 == 0) goto L_0x004a
            com.ss.android.lark.utils.Feature r4 = new com.ss.android.lark.utils.Feature
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            r12 = r4
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r8
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x004c
        L_0x004a:
            r4 = r16
        L_0x004c:
            r12 = r11
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.utils.VeConfig.<init>(int, com.ss.android.lark.utils.RemuxSetting, java.lang.String, com.ss.android.lark.utils.InternalSetting, com.ss.android.lark.utils.Feature, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
