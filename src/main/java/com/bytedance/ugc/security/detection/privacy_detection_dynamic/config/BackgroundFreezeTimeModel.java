package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/BackgroundFreezeTimeModel;", "", "backgroundFreezeTime", "", "backgroundEndFreezeTime", "(JJ)V", "getBackgroundEndFreezeTime", "()J", "getBackgroundFreezeTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BackgroundFreezeTimeModel {
    private final long backgroundEndFreezeTime;
    private final long backgroundFreezeTime;

    public BackgroundFreezeTimeModel() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ BackgroundFreezeTimeModel copy$default(BackgroundFreezeTimeModel backgroundFreezeTimeModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = backgroundFreezeTimeModel.backgroundFreezeTime;
        }
        if ((i & 2) != 0) {
            j2 = backgroundFreezeTimeModel.backgroundEndFreezeTime;
        }
        return backgroundFreezeTimeModel.copy(j, j2);
    }

    public final long component1() {
        return this.backgroundFreezeTime;
    }

    public final long component2() {
        return this.backgroundEndFreezeTime;
    }

    public final BackgroundFreezeTimeModel copy(long j, long j2) {
        return new BackgroundFreezeTimeModel(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundFreezeTimeModel)) {
            return false;
        }
        BackgroundFreezeTimeModel backgroundFreezeTimeModel = (BackgroundFreezeTimeModel) obj;
        return this.backgroundFreezeTime == backgroundFreezeTimeModel.backgroundFreezeTime && this.backgroundEndFreezeTime == backgroundFreezeTimeModel.backgroundEndFreezeTime;
    }

    public int hashCode() {
        long j = this.backgroundFreezeTime;
        long j2 = this.backgroundEndFreezeTime;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BackgroundFreezeTimeModel(backgroundFreezeTime=" + this.backgroundFreezeTime + ", backgroundEndFreezeTime=" + this.backgroundEndFreezeTime + ")";
    }

    public final long getBackgroundEndFreezeTime() {
        return this.backgroundEndFreezeTime;
    }

    public final long getBackgroundFreezeTime() {
        return this.backgroundFreezeTime;
    }

    public BackgroundFreezeTimeModel(long j, long j2) {
        this.backgroundFreezeTime = j;
        this.backgroundEndFreezeTime = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BackgroundFreezeTimeModel(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000 : j, (i & 2) != 0 ? 3000 : j2);
    }
}
