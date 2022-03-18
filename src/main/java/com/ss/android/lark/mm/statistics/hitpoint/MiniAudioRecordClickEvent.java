package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/MiniAudioRecordClickEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "fromSource", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "getFromSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.d */
public final class MiniAudioRecordClickEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private final String f118567a;
    @SerializedName("from_source")

    /* renamed from: b */
    private final String f118568b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniAudioRecordClickEvent(String str, String str2) {
        super("vc_mm_mini_view", null, 2, null);
        Intrinsics.checkParameterIsNotNull(str, "actionName");
        this.f118567a = str;
        this.f118568b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiniAudioRecordClickEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
