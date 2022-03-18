package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/ALogSettingsModel;", "", "alogTimeInterval", "", "alogTimeLimit", "alogTimeOutBefore", "alogTimeOutAfter", "alogConfig", "", "alogUploadTimeDelay", "(JJJJZJ)V", "getAlogConfig", "()Z", "getAlogTimeInterval", "()J", "getAlogTimeLimit", "getAlogTimeOutAfter", "getAlogTimeOutBefore", "getAlogUploadTimeDelay", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ALogSettingsModel {
    private final boolean alogConfig;
    private final long alogTimeInterval;
    private final long alogTimeLimit;
    private final long alogTimeOutAfter;
    private final long alogTimeOutBefore;
    private final long alogUploadTimeDelay;

    public ALogSettingsModel() {
        this(0, 0, 0, 0, false, 0, 63, null);
    }

    public static /* synthetic */ ALogSettingsModel copy$default(ALogSettingsModel aLogSettingsModel, long j, long j2, long j3, long j4, boolean z, long j5, int i, Object obj) {
        return aLogSettingsModel.copy((i & 1) != 0 ? aLogSettingsModel.alogTimeInterval : j, (i & 2) != 0 ? aLogSettingsModel.alogTimeLimit : j2, (i & 4) != 0 ? aLogSettingsModel.alogTimeOutBefore : j3, (i & 8) != 0 ? aLogSettingsModel.alogTimeOutAfter : j4, (i & 16) != 0 ? aLogSettingsModel.alogConfig : z, (i & 32) != 0 ? aLogSettingsModel.alogUploadTimeDelay : j5);
    }

    public final long component1() {
        return this.alogTimeInterval;
    }

    public final long component2() {
        return this.alogTimeLimit;
    }

    public final long component3() {
        return this.alogTimeOutBefore;
    }

    public final long component4() {
        return this.alogTimeOutAfter;
    }

    public final boolean component5() {
        return this.alogConfig;
    }

    public final long component6() {
        return this.alogUploadTimeDelay;
    }

    public final ALogSettingsModel copy(long j, long j2, long j3, long j4, boolean z, long j5) {
        return new ALogSettingsModel(j, j2, j3, j4, z, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ALogSettingsModel)) {
            return false;
        }
        ALogSettingsModel aLogSettingsModel = (ALogSettingsModel) obj;
        return this.alogTimeInterval == aLogSettingsModel.alogTimeInterval && this.alogTimeLimit == aLogSettingsModel.alogTimeLimit && this.alogTimeOutBefore == aLogSettingsModel.alogTimeOutBefore && this.alogTimeOutAfter == aLogSettingsModel.alogTimeOutAfter && this.alogConfig == aLogSettingsModel.alogConfig && this.alogUploadTimeDelay == aLogSettingsModel.alogUploadTimeDelay;
    }

    public int hashCode() {
        long j = this.alogTimeInterval;
        long j2 = this.alogTimeLimit;
        long j3 = this.alogTimeOutBefore;
        long j4 = this.alogTimeOutAfter;
        int i = ((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z = this.alogConfig;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        long j5 = this.alogUploadTimeDelay;
        return ((i + i2) * 31) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "ALogSettingsModel(alogTimeInterval=" + this.alogTimeInterval + ", alogTimeLimit=" + this.alogTimeLimit + ", alogTimeOutBefore=" + this.alogTimeOutBefore + ", alogTimeOutAfter=" + this.alogTimeOutAfter + ", alogConfig=" + this.alogConfig + ", alogUploadTimeDelay=" + this.alogUploadTimeDelay + ")";
    }

    public final boolean getAlogConfig() {
        return this.alogConfig;
    }

    public final long getAlogTimeInterval() {
        return this.alogTimeInterval;
    }

    public final long getAlogTimeLimit() {
        return this.alogTimeLimit;
    }

    public final long getAlogTimeOutAfter() {
        return this.alogTimeOutAfter;
    }

    public final long getAlogTimeOutBefore() {
        return this.alogTimeOutBefore;
    }

    public final long getAlogUploadTimeDelay() {
        return this.alogUploadTimeDelay;
    }

    public ALogSettingsModel(long j, long j2, long j3, long j4, boolean z, long j5) {
        this.alogTimeInterval = j;
        this.alogTimeLimit = j2;
        this.alogTimeOutBefore = j3;
        this.alogTimeOutAfter = j4;
        this.alogConfig = z;
        this.alogUploadTimeDelay = j5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ALogSettingsModel(long r12, long r14, long r16, long r18, boolean r20, long r21, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r11 = this;
            r0 = r23 & 1
            if (r0 == 0) goto L_0x0008
            r0 = 14400000(0xdbba00, double:7.1145453E-317)
            goto L_0x0009
        L_0x0008:
            r0 = r12
        L_0x0009:
            r2 = r23 & 2
            if (r2 == 0) goto L_0x0011
            r2 = 10800000(0xa4cb80, double:5.335909E-317)
            goto L_0x0012
        L_0x0011:
            r2 = r14
        L_0x0012:
            r4 = r23 & 4
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            if (r4 == 0) goto L_0x001b
            r7 = r5
            goto L_0x001d
        L_0x001b:
            r7 = r16
        L_0x001d:
            r4 = r23 & 8
            if (r4 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r18
        L_0x0024:
            r4 = r23 & 16
            if (r4 == 0) goto L_0x002a
            r4 = 0
            goto L_0x002c
        L_0x002a:
            r4 = r20
        L_0x002c:
            r9 = r23 & 32
            if (r9 == 0) goto L_0x0033
            r9 = 15000(0x3a98, double:7.411E-320)
            goto L_0x0035
        L_0x0033:
            r9 = r21
        L_0x0035:
            r12 = r11
            r13 = r0
            r15 = r2
            r17 = r7
            r19 = r5
            r21 = r4
            r22 = r9
            r12.<init>(r13, r15, r17, r19, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.ALogSettingsModel.<init>(long, long, long, long, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
