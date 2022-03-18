package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/utils/Feature;", "", "hwDecode264", "Lcom/ss/android/lark/utils/HWDecode;", "hwDecode265", "hwEncode264", "Lcom/ss/android/lark/utils/HWEncode;", "(Lcom/ss/android/lark/utils/HWDecode;Lcom/ss/android/lark/utils/HWDecode;Lcom/ss/android/lark/utils/HWEncode;)V", "getHwDecode264", "()Lcom/ss/android/lark/utils/HWDecode;", "setHwDecode264", "(Lcom/ss/android/lark/utils/HWDecode;)V", "getHwDecode265", "setHwDecode265", "getHwEncode264", "()Lcom/ss/android/lark/utils/HWEncode;", "setHwEncode264", "(Lcom/ss/android/lark/utils/HWEncode;)V", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Feature {
    @SerializedName("hw_decode_264")
    private HWDecode hwDecode264;
    @SerializedName("hw_decode_265")
    private HWDecode hwDecode265;
    @SerializedName("hw_encode_264")
    private HWEncode hwEncode264;

    public Feature() {
        this(null, null, null, 7, null);
    }

    public final HWDecode getHwDecode264() {
        return this.hwDecode264;
    }

    public final HWDecode getHwDecode265() {
        return this.hwDecode265;
    }

    public final HWEncode getHwEncode264() {
        return this.hwEncode264;
    }

    public final void setHwDecode264(HWDecode hWDecode) {
        Intrinsics.checkParameterIsNotNull(hWDecode, "<set-?>");
        this.hwDecode264 = hWDecode;
    }

    public final void setHwDecode265(HWDecode hWDecode) {
        Intrinsics.checkParameterIsNotNull(hWDecode, "<set-?>");
        this.hwDecode265 = hWDecode;
    }

    public final void setHwEncode264(HWEncode hWEncode) {
        Intrinsics.checkParameterIsNotNull(hWEncode, "<set-?>");
        this.hwEncode264 = hWEncode;
    }

    public Feature(HWDecode hWDecode, HWDecode hWDecode2, HWEncode hWEncode) {
        Intrinsics.checkParameterIsNotNull(hWDecode, "hwDecode264");
        Intrinsics.checkParameterIsNotNull(hWDecode2, "hwDecode265");
        Intrinsics.checkParameterIsNotNull(hWEncode, "hwEncode264");
        this.hwDecode264 = hWDecode;
        this.hwDecode265 = hWDecode2;
        this.hwEncode264 = hWEncode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Feature(HWDecode hWDecode, HWDecode hWDecode2, HWEncode hWEncode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HWDecode(null, 0, 0, 0, 15, null) : hWDecode, (i & 2) != 0 ? new HWDecode(null, 0, 0, 0, 15, null) : hWDecode2, (i & 4) != 0 ? new HWEncode(null, 1, null) : hWEncode);
    }
}
