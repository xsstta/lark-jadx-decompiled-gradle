package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/utils/ResolutionConfig;", "", "width", "", "height", "(II)V", "getHeight", "()I", "setHeight", "(I)V", "getWidth", "setWidth", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResolutionConfig {
    @SerializedName("height")
    private int height;
    @SerializedName("width")
    private int width;

    public ResolutionConfig() {
        this(0, 0, 3, null);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public ResolutionConfig(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResolutionConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 40960 : i, (i3 & 2) != 0 ? 40960 : i2);
    }
}
