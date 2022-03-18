package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nR\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/utils/HWDecode;", "", "whiteListPlus", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "minSide", "", "fpsLowerLimit", "highFPSMinSide", "(Ljava/util/ArrayList;III)V", "getFpsLowerLimit", "()I", "setFpsLowerLimit", "(I)V", "getHighFPSMinSide", "setHighFPSMinSide", "getMinSide", "setMinSide", "getWhiteListPlus", "()Ljava/util/ArrayList;", "setWhiteListPlus", "(Ljava/util/ArrayList;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class HWDecode {
    @SerializedName("fpsLowerLimit")
    private int fpsLowerLimit;
    @SerializedName("highfps_min_side")
    private int highFPSMinSide;
    @SerializedName("min_side")
    private int minSide;
    @SerializedName("white_list_plus")
    private ArrayList<String> whiteListPlus;

    public HWDecode() {
        this(null, 0, 0, 0, 15, null);
    }

    public final int getFpsLowerLimit() {
        return this.fpsLowerLimit;
    }

    public final int getHighFPSMinSide() {
        return this.highFPSMinSide;
    }

    public final int getMinSide() {
        return this.minSide;
    }

    public final ArrayList<String> getWhiteListPlus() {
        return this.whiteListPlus;
    }

    public final void setFpsLowerLimit(int i) {
        this.fpsLowerLimit = i;
    }

    public final void setHighFPSMinSide(int i) {
        this.highFPSMinSide = i;
    }

    public final void setMinSide(int i) {
        this.minSide = i;
    }

    public final void setWhiteListPlus(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.whiteListPlus = arrayList;
    }

    public HWDecode(ArrayList<String> arrayList, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "whiteListPlus");
        this.whiteListPlus = arrayList;
        this.minSide = i;
        this.fpsLowerLimit = i2;
        this.highFPSMinSide = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HWDecode(ArrayList arrayList, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ArrayList() : arrayList, (i4 & 2) != 0 ? 1090 : i, (i4 & 4) != 0 ? 40 : i2, (i4 & 8) != 0 ? 730 : i3);
    }
}
