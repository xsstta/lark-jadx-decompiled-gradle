package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/MultiCallAPICountsLogModel;", "", "uploadMaxCount", "", "uploadMaxTimeInterval", "", "dbAggregationMaxErrorCount", "dbAggregationMaxTimeInterval", "(IJIJ)V", "getDbAggregationMaxErrorCount", "()I", "getDbAggregationMaxTimeInterval", "()J", "getUploadMaxCount", "getUploadMaxTimeInterval", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MultiCallAPICountsLogModel {
    private final int dbAggregationMaxErrorCount;
    private final long dbAggregationMaxTimeInterval;
    private final int uploadMaxCount;
    private final long uploadMaxTimeInterval;

    public MultiCallAPICountsLogModel() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ MultiCallAPICountsLogModel copy$default(MultiCallAPICountsLogModel multiCallAPICountsLogModel, int i, long j, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = multiCallAPICountsLogModel.uploadMaxCount;
        }
        if ((i3 & 2) != 0) {
            j = multiCallAPICountsLogModel.uploadMaxTimeInterval;
        }
        if ((i3 & 4) != 0) {
            i2 = multiCallAPICountsLogModel.dbAggregationMaxErrorCount;
        }
        if ((i3 & 8) != 0) {
            j2 = multiCallAPICountsLogModel.dbAggregationMaxTimeInterval;
        }
        return multiCallAPICountsLogModel.copy(i, j, i2, j2);
    }

    public final int component1() {
        return this.uploadMaxCount;
    }

    public final long component2() {
        return this.uploadMaxTimeInterval;
    }

    public final int component3() {
        return this.dbAggregationMaxErrorCount;
    }

    public final long component4() {
        return this.dbAggregationMaxTimeInterval;
    }

    public final MultiCallAPICountsLogModel copy(int i, long j, int i2, long j2) {
        return new MultiCallAPICountsLogModel(i, j, i2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiCallAPICountsLogModel)) {
            return false;
        }
        MultiCallAPICountsLogModel multiCallAPICountsLogModel = (MultiCallAPICountsLogModel) obj;
        return this.uploadMaxCount == multiCallAPICountsLogModel.uploadMaxCount && this.uploadMaxTimeInterval == multiCallAPICountsLogModel.uploadMaxTimeInterval && this.dbAggregationMaxErrorCount == multiCallAPICountsLogModel.dbAggregationMaxErrorCount && this.dbAggregationMaxTimeInterval == multiCallAPICountsLogModel.dbAggregationMaxTimeInterval;
    }

    public int hashCode() {
        long j = this.uploadMaxTimeInterval;
        long j2 = this.dbAggregationMaxTimeInterval;
        return (((((this.uploadMaxCount * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.dbAggregationMaxErrorCount) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "MultiCallAPICountsLogModel(uploadMaxCount=" + this.uploadMaxCount + ", uploadMaxTimeInterval=" + this.uploadMaxTimeInterval + ", dbAggregationMaxErrorCount=" + this.dbAggregationMaxErrorCount + ", dbAggregationMaxTimeInterval=" + this.dbAggregationMaxTimeInterval + ")";
    }

    public final int getDbAggregationMaxErrorCount() {
        return this.dbAggregationMaxErrorCount;
    }

    public final long getDbAggregationMaxTimeInterval() {
        return this.dbAggregationMaxTimeInterval;
    }

    public final int getUploadMaxCount() {
        return this.uploadMaxCount;
    }

    public final long getUploadMaxTimeInterval() {
        return this.uploadMaxTimeInterval;
    }

    public MultiCallAPICountsLogModel(int i, long j, int i2, long j2) {
        this.uploadMaxCount = i;
        this.uploadMaxTimeInterval = j;
        this.dbAggregationMaxErrorCount = i2;
        this.dbAggregationMaxTimeInterval = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MultiCallAPICountsLogModel(int r5, long r6, int r8, long r9, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            r5 = 200(0xc8, float:2.8E-43)
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000d
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
        L_0x000d:
            r0 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            r8 = 10
            r12 = 10
            goto L_0x0018
        L_0x0017:
            r12 = r8
        L_0x0018:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001f
            r9 = 60000(0xea60, double:2.9644E-319)
        L_0x001f:
            r2 = r9
            r6 = r4
            r7 = r5
            r8 = r0
            r10 = r12
            r11 = r2
            r6.<init>(r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.MultiCallAPICountsLogModel.<init>(int, long, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
