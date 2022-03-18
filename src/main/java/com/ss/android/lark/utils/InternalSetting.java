package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/utils/InternalSetting;", "", "encodeResolutionAlign4", "", "hideVEMetaData", "(II)V", "getEncodeResolutionAlign4", "()I", "setEncodeResolutionAlign4", "(I)V", "getHideVEMetaData", "setHideVEMetaData", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InternalSetting {
    @SerializedName("ve_enable_render_encode_resolution_align4")
    private int encodeResolutionAlign4;
    @SerializedName("ve_compile_hide_ve_metadata")
    private int hideVEMetaData;

    public InternalSetting() {
        this(0, 0, 3, null);
    }

    public final int getEncodeResolutionAlign4() {
        return this.encodeResolutionAlign4;
    }

    public final int getHideVEMetaData() {
        return this.hideVEMetaData;
    }

    public final void setEncodeResolutionAlign4(int i) {
        this.encodeResolutionAlign4 = i;
    }

    public final void setHideVEMetaData(int i) {
        this.hideVEMetaData = i;
    }

    public InternalSetting(int i, int i2) {
        this.encodeResolutionAlign4 = i;
        this.hideVEMetaData = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InternalSetting(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 1 : i2);
    }
}
