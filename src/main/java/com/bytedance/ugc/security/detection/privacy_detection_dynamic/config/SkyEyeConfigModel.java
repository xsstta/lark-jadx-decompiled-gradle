package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SkyEyeConfigModel;", "", "maxTimeLineEventLimit", "", "deleteOldTimeLineEventLimit", "heartbeatInterval", "", "testEnvChannels", "", "", "sensitiveApiModel", "Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SensitiveApiModel;", "(IIJLjava/util/List;Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SensitiveApiModel;)V", "getDeleteOldTimeLineEventLimit", "()I", "getHeartbeatInterval", "()J", "getMaxTimeLineEventLimit", "getSensitiveApiModel", "()Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SensitiveApiModel;", "getTestEnvChannels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SkyEyeConfigModel {
    private final int deleteOldTimeLineEventLimit;
    private final long heartbeatInterval;
    private final int maxTimeLineEventLimit;
    private final SensitiveApiModel sensitiveApiModel;
    private final List<String> testEnvChannels;

    public SkyEyeConfigModel() {
        this(0, 0, 0, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SkyEyeConfigModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkyEyeConfigModel copy$default(SkyEyeConfigModel skyEyeConfigModel, int i, int i2, long j, List list, SensitiveApiModel sensitiveApiModel2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = skyEyeConfigModel.maxTimeLineEventLimit;
        }
        if ((i3 & 2) != 0) {
            i2 = skyEyeConfigModel.deleteOldTimeLineEventLimit;
        }
        if ((i3 & 4) != 0) {
            j = skyEyeConfigModel.heartbeatInterval;
        }
        if ((i3 & 8) != 0) {
            list = skyEyeConfigModel.testEnvChannels;
        }
        if ((i3 & 16) != 0) {
            sensitiveApiModel2 = skyEyeConfigModel.sensitiveApiModel;
        }
        return skyEyeConfigModel.copy(i, i2, j, list, sensitiveApiModel2);
    }

    public final int component1() {
        return this.maxTimeLineEventLimit;
    }

    public final int component2() {
        return this.deleteOldTimeLineEventLimit;
    }

    public final long component3() {
        return this.heartbeatInterval;
    }

    public final List<String> component4() {
        return this.testEnvChannels;
    }

    public final SensitiveApiModel component5() {
        return this.sensitiveApiModel;
    }

    public final SkyEyeConfigModel copy(int i, int i2, long j, List<String> list, SensitiveApiModel sensitiveApiModel2) {
        Intrinsics.checkParameterIsNotNull(list, "testEnvChannels");
        Intrinsics.checkParameterIsNotNull(sensitiveApiModel2, "sensitiveApiModel");
        return new SkyEyeConfigModel(i, i2, j, list, sensitiveApiModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkyEyeConfigModel)) {
            return false;
        }
        SkyEyeConfigModel skyEyeConfigModel = (SkyEyeConfigModel) obj;
        return this.maxTimeLineEventLimit == skyEyeConfigModel.maxTimeLineEventLimit && this.deleteOldTimeLineEventLimit == skyEyeConfigModel.deleteOldTimeLineEventLimit && this.heartbeatInterval == skyEyeConfigModel.heartbeatInterval && Intrinsics.areEqual(this.testEnvChannels, skyEyeConfigModel.testEnvChannels) && Intrinsics.areEqual(this.sensitiveApiModel, skyEyeConfigModel.sensitiveApiModel);
    }

    public int hashCode() {
        long j = this.heartbeatInterval;
        int i = ((((this.maxTimeLineEventLimit * 31) + this.deleteOldTimeLineEventLimit) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        List<String> list = this.testEnvChannels;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        SensitiveApiModel sensitiveApiModel2 = this.sensitiveApiModel;
        if (sensitiveApiModel2 != null) {
            i2 = sensitiveApiModel2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "SkyEyeConfigModel(maxTimeLineEventLimit=" + this.maxTimeLineEventLimit + ", deleteOldTimeLineEventLimit=" + this.deleteOldTimeLineEventLimit + ", heartbeatInterval=" + this.heartbeatInterval + ", testEnvChannels=" + this.testEnvChannels + ", sensitiveApiModel=" + this.sensitiveApiModel + ")";
    }

    public final int getDeleteOldTimeLineEventLimit() {
        return this.deleteOldTimeLineEventLimit;
    }

    public final long getHeartbeatInterval() {
        return this.heartbeatInterval;
    }

    public final int getMaxTimeLineEventLimit() {
        return this.maxTimeLineEventLimit;
    }

    public final SensitiveApiModel getSensitiveApiModel() {
        return this.sensitiveApiModel;
    }

    public final List<String> getTestEnvChannels() {
        return this.testEnvChannels;
    }

    public SkyEyeConfigModel(int i, int i2, long j, List<String> list, SensitiveApiModel sensitiveApiModel2) {
        Intrinsics.checkParameterIsNotNull(list, "testEnvChannels");
        Intrinsics.checkParameterIsNotNull(sensitiveApiModel2, "sensitiveApiModel");
        this.maxTimeLineEventLimit = i;
        this.deleteOldTimeLineEventLimit = i2;
        this.heartbeatInterval = j;
        this.testEnvChannels = list;
        this.sensitiveApiModel = sensitiveApiModel2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SkyEyeConfigModel(int r5, int r6, long r7, java.util.List r9, com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SensitiveApiModel r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            r5 = 700(0x2bc, float:9.81E-43)
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000f
            r6 = 100
            r12 = 100
            goto L_0x0010
        L_0x000f:
            r12 = r6
        L_0x0010:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0016
            r7 = 2000(0x7d0, double:9.88E-321)
        L_0x0016:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0023
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r9 = r6
            java.util.List r9 = (java.util.List) r9
        L_0x0023:
            r2 = r9
            r6 = r11 & 16
            if (r6 == 0) goto L_0x002f
            com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SensitiveApiModel r10 = new com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SensitiveApiModel
            r6 = 3
            r7 = 0
            r10.<init>(r7, r7, r6, r7)
        L_0x002f:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SkyEyeConfigModel.<init>(int, int, long, java.util.List, com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SensitiveApiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
