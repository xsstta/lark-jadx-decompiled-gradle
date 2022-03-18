package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/ClickSubtitleContentEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "clickSubtitle", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "getClickSubtitle", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.b */
public final class ClickSubtitleContentEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private final String f118563a;
    @SerializedName("from_source")

    /* renamed from: b */
    private final String f118564b;

    public ClickSubtitleContentEvent() {
        this(null, null, 3, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickSubtitleContentEvent(String str, String str2) {
        super("vc_mm_click_button", null, 2, null);
        Intrinsics.checkParameterIsNotNull(str, "actionName");
        Intrinsics.checkParameterIsNotNull(str2, "clickSubtitle");
        this.f118563a = str;
        this.f118564b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickSubtitleContentEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "progress_bar_change" : str, (i & 2) != 0 ? "click_subtitle" : str2);
    }
}
