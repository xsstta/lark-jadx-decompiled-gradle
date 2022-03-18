package com.ss.android.lark.moments.impl.common.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/utils/FormatConfig;", "", "limitSize", "", "limitResolution", "Lcom/ss/android/lark/moments/impl/common/utils/ResolutionSize;", "(JLcom/ss/android/lark/moments/impl/common/utils/ResolutionSize;)V", "getLimitResolution", "()Lcom/ss/android/lark/moments/impl/common/utils/ResolutionSize;", "getLimitSize", "()J", "component1", "component2", "copy", "equals", "", "other", "getLimitResolutionSize", "hashCode", "", "toString", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class FormatConfig {
    @SerializedName("limit_image_size")
    private final ResolutionSize limitResolution;
    @SerializedName("limit_file_size")
    private final long limitSize;

    public FormatConfig() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ FormatConfig copy$default(FormatConfig formatConfig, long j, ResolutionSize resolutionSize, int i, Object obj) {
        if ((i & 1) != 0) {
            j = formatConfig.limitSize;
        }
        if ((i & 2) != 0) {
            resolutionSize = formatConfig.limitResolution;
        }
        return formatConfig.copy(j, resolutionSize);
    }

    public final long component1() {
        return this.limitSize;
    }

    public final ResolutionSize component2() {
        return this.limitResolution;
    }

    public final FormatConfig copy(long j, ResolutionSize resolutionSize) {
        Intrinsics.checkParameterIsNotNull(resolutionSize, "limitResolution");
        return new FormatConfig(j, resolutionSize);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatConfig)) {
            return false;
        }
        FormatConfig formatConfig = (FormatConfig) obj;
        return this.limitSize == formatConfig.limitSize && Intrinsics.areEqual(this.limitResolution, formatConfig.limitResolution);
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.limitSize) * 31;
        ResolutionSize resolutionSize = this.limitResolution;
        return hashCode + (resolutionSize != null ? resolutionSize.hashCode() : 0);
    }

    public String toString() {
        return "FormatConfig(limitSize=" + this.limitSize + ", limitResolution=" + this.limitResolution + ")";
    }

    public final ResolutionSize getLimitResolution() {
        return this.limitResolution;
    }

    public final long getLimitSize() {
        return this.limitSize;
    }

    public final long getLimitResolutionSize() {
        return (long) (this.limitResolution.getWidth() * this.limitResolution.getHeight());
    }

    public FormatConfig(long j, ResolutionSize resolutionSize) {
        Intrinsics.checkParameterIsNotNull(resolutionSize, "limitResolution");
        this.limitSize = j;
        this.limitResolution = resolutionSize;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormatConfig(long j, ResolutionSize resolutionSize, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 26214400 : j, (i & 2) != 0 ? new ResolutionSize(0, 0, 3, null) : resolutionSize);
    }
}
