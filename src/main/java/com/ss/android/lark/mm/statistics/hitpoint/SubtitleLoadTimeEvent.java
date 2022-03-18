package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/SubtitleLoadTimeEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "duration", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.n */
public final class SubtitleLoadTimeEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private String f118581a;
    @SerializedName("duration")

    /* renamed from: b */
    private Long f118582b;

    public SubtitleLoadTimeEvent() {
        this(null, null, 3, null);
    }

    public SubtitleLoadTimeEvent(String str, Long l) {
        super("vc_android_mm_page_duration", null, 2, null);
        this.f118581a = str;
        this.f118582b = l;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubtitleLoadTimeEvent(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
    }
}
