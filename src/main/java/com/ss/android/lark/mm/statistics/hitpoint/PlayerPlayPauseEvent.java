package com.ss.android.lark.mm.statistics.hitpoint;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/statistics/hitpoint/PlayerPlayPauseEvent;", "Lcom/ss/android/lark/mm/statistics/hitpoint/UIEvent;", "actionName", "", "fromSource", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "getFromSource", "setFromSource", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.l */
public final class PlayerPlayPauseEvent extends UIEvent {
    @SerializedName("action_name")

    /* renamed from: a */
    private String f118575a;
    @SerializedName("from_source")

    /* renamed from: b */
    private String f118576b;

    public PlayerPlayPauseEvent() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final void mo165432a(String str) {
        this.f118575a = str;
    }

    /* renamed from: b */
    public final void mo165433b(String str) {
        this.f118576b = str;
    }

    public PlayerPlayPauseEvent(String str, String str2) {
        super("vc_mm_click_button", null, 2, null);
        this.f118575a = str;
        this.f118576b = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerPlayPauseEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
