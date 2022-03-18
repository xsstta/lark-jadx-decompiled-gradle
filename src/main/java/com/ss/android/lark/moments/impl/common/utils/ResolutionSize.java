package com.ss.android.lark.moments.impl.common.utils;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.android.HwBuildEx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/ResolutionSize;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResolutionSize {
    @SerializedName("height")
    private final int height;
    @SerializedName("width")
    private final int width;

    public ResolutionSize() {
        this(0, 0, 3, null);
    }

    public static /* synthetic */ ResolutionSize copy$default(ResolutionSize resolutionSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = resolutionSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = resolutionSize.height;
        }
        return resolutionSize.copy(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final ResolutionSize copy(int i, int i2) {
        return new ResolutionSize(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolutionSize)) {
            return false;
        }
        ResolutionSize resolutionSize = (ResolutionSize) obj;
        return this.width == resolutionSize.width && this.height == resolutionSize.height;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public String toString() {
        return "ResolutionSize(width=" + this.width + ", height=" + this.height + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public ResolutionSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResolutionSize(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? HwBuildEx.VersionCodes.CUR_DEVELOPMENT : i, (i3 & 2) != 0 ? HwBuildEx.VersionCodes.CUR_DEVELOPMENT : i2);
    }
}
