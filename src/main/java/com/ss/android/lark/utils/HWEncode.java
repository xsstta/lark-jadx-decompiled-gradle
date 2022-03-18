package com.ss.android.lark.utils;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/utils/HWEncode;", "", "blackListPlus", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getBlackListPlus", "()Ljava/util/ArrayList;", "setBlackListPlus", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class HWEncode {
    @SerializedName("black_list_plus")
    private ArrayList<String> blackListPlus;

    public HWEncode() {
        this(null, 1, null);
    }

    public final ArrayList<String> getBlackListPlus() {
        return this.blackListPlus;
    }

    public final void setBlackListPlus(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.blackListPlus = arrayList;
    }

    public HWEncode(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "blackListPlus");
        this.blackListPlus = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HWEncode(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
