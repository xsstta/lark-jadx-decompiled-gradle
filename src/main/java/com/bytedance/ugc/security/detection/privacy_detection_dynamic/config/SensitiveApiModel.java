package com.bytedance.ugc.security.detection.privacy_detection_dynamic.config;

import androidx.collection.ArrayMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B1\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ugc/security/detection/privacy_detection_dynamic/config/SensitiveApiModel;", "", "canAccessSensitiveApis", "Landroidx/collection/ArrayMap;", "", "", "sensitiveApiActionList", "", "(Landroid/support/v4/util/ArrayMap;Landroid/support/v4/util/ArrayMap;)V", "getCanAccessSensitiveApis", "()Landroid/support/v4/util/ArrayMap;", "getSensitiveApiActionList", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "privacy-detection-dynamic_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SensitiveApiModel {
    private final ArrayMap<Integer, Boolean> canAccessSensitiveApis;
    private final ArrayMap<Integer, String> sensitiveApiActionList;

    public SensitiveApiModel() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ugc.security.detection.privacy_detection_dynamic.config.SensitiveApiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SensitiveApiModel copy$default(SensitiveApiModel sensitiveApiModel, ArrayMap arrayMap, ArrayMap arrayMap2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayMap = sensitiveApiModel.canAccessSensitiveApis;
        }
        if ((i & 2) != 0) {
            arrayMap2 = sensitiveApiModel.sensitiveApiActionList;
        }
        return sensitiveApiModel.copy(arrayMap, arrayMap2);
    }

    public final ArrayMap<Integer, Boolean> component1() {
        return this.canAccessSensitiveApis;
    }

    public final ArrayMap<Integer, String> component2() {
        return this.sensitiveApiActionList;
    }

    public final SensitiveApiModel copy(ArrayMap<Integer, Boolean> arrayMap, ArrayMap<Integer, String> arrayMap2) {
        Intrinsics.checkParameterIsNotNull(arrayMap, "canAccessSensitiveApis");
        Intrinsics.checkParameterIsNotNull(arrayMap2, "sensitiveApiActionList");
        return new SensitiveApiModel(arrayMap, arrayMap2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveApiModel)) {
            return false;
        }
        SensitiveApiModel sensitiveApiModel = (SensitiveApiModel) obj;
        return Intrinsics.areEqual(this.canAccessSensitiveApis, sensitiveApiModel.canAccessSensitiveApis) && Intrinsics.areEqual(this.sensitiveApiActionList, sensitiveApiModel.sensitiveApiActionList);
    }

    public int hashCode() {
        ArrayMap<Integer, Boolean> arrayMap = this.canAccessSensitiveApis;
        int i = 0;
        int hashCode = (arrayMap != null ? arrayMap.hashCode() : 0) * 31;
        ArrayMap<Integer, String> arrayMap2 = this.sensitiveApiActionList;
        if (arrayMap2 != null) {
            i = arrayMap2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SensitiveApiModel(canAccessSensitiveApis=" + this.canAccessSensitiveApis + ", sensitiveApiActionList=" + this.sensitiveApiActionList + ")";
    }

    public final ArrayMap<Integer, Boolean> getCanAccessSensitiveApis() {
        return this.canAccessSensitiveApis;
    }

    public final ArrayMap<Integer, String> getSensitiveApiActionList() {
        return this.sensitiveApiActionList;
    }

    public SensitiveApiModel(ArrayMap<Integer, Boolean> arrayMap, ArrayMap<Integer, String> arrayMap2) {
        Intrinsics.checkParameterIsNotNull(arrayMap, "canAccessSensitiveApis");
        Intrinsics.checkParameterIsNotNull(arrayMap2, "sensitiveApiActionList");
        this.canAccessSensitiveApis = arrayMap;
        this.sensitiveApiActionList = arrayMap2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SensitiveApiModel(ArrayMap arrayMap, ArrayMap arrayMap2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayMap() : arrayMap, (i & 2) != 0 ? new ArrayMap() : arrayMap2);
    }
}
