package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/RecordingPageClickEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "fromSource", "fromLanguage", "actionLanguage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActionLanguage", "()Ljava/lang/String;", "getActionName", "getFromLanguage", "getFromSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.m */
public final class RecordingPageClickEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private final String f118577a;
    @SerializedName("from_source")

    /* renamed from: b */
    private final String f118578b;
    @SerializedName("from_language")

    /* renamed from: c */
    private final String f118579c;
    @SerializedName("action_language")

    /* renamed from: d */
    private final String f118580d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordingPageClickEvent(String str, String str2, String str3, String str4) {
        super("vc_mm_recording_page", null, 2, null);
        Intrinsics.checkParameterIsNotNull(str, "actionName");
        this.f118577a = str;
        this.f118578b = str2;
        this.f118579c = str3;
        this.f118580d = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecordingPageClickEvent(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
