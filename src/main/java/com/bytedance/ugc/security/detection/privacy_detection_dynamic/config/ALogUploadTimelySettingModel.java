package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/ALogUploadTimelySettingModel;", "", "alogTimeOutBefore", "", "alogUploadSwitch", "", "(JZ)V", "getAlogTimeOutBefore", "()J", "getAlogUploadSwitch", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ALogUploadTimelySettingModel {
    private final long alogTimeOutBefore;
    private final boolean alogUploadSwitch;

    public ALogUploadTimelySettingModel() {
        this(0, false, 3, null);
    }

    public static /* synthetic */ ALogUploadTimelySettingModel copy$default(ALogUploadTimelySettingModel aLogUploadTimelySettingModel, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aLogUploadTimelySettingModel.alogTimeOutBefore;
        }
        if ((i & 2) != 0) {
            z = aLogUploadTimelySettingModel.alogUploadSwitch;
        }
        return aLogUploadTimelySettingModel.copy(j, z);
    }

    public final long component1() {
        return this.alogTimeOutBefore;
    }

    public final boolean component2() {
        return this.alogUploadSwitch;
    }

    public final ALogUploadTimelySettingModel copy(long j, boolean z) {
        return new ALogUploadTimelySettingModel(j, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ALogUploadTimelySettingModel)) {
            return false;
        }
        ALogUploadTimelySettingModel aLogUploadTimelySettingModel = (ALogUploadTimelySettingModel) obj;
        return this.alogTimeOutBefore == aLogUploadTimelySettingModel.alogTimeOutBefore && this.alogUploadSwitch == aLogUploadTimelySettingModel.alogUploadSwitch;
    }

    public int hashCode() {
        long j = this.alogTimeOutBefore;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.alogUploadSwitch;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return i + i2;
    }

    public String toString() {
        return "ALogUploadTimelySettingModel(alogTimeOutBefore=" + this.alogTimeOutBefore + ", alogUploadSwitch=" + this.alogUploadSwitch + ")";
    }

    public final long getAlogTimeOutBefore() {
        return this.alogTimeOutBefore;
    }

    public final boolean getAlogUploadSwitch() {
        return this.alogUploadSwitch;
    }

    public ALogUploadTimelySettingModel(long j, boolean z) {
        this.alogTimeOutBefore = j;
        this.alogUploadSwitch = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ALogUploadTimelySettingModel(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 7200000 : j, (i & 2) != 0 ? false : z);
    }
}
