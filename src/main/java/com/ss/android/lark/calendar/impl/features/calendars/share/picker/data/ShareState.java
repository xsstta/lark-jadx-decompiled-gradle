package com.ss.android.lark.calendar.impl.features.calendars.share.picker.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "", "state", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState$STATE;", "errorMsg", "", "showErrorDialog", "", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState$STATE;Ljava/lang/String;Z)V", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getShowErrorDialog", "()Z", "setShowErrorDialog", "(Z)V", "getState", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState$STATE;", "STATE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareState {

    /* renamed from: a */
    private final STATE f76374a;

    /* renamed from: b */
    private String f76375b;

    /* renamed from: c */
    private boolean f76376c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState$STATE;", "", "(Ljava/lang/String;I)V", "LOADING", "SUCCESS", "FAILED", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum STATE {
        LOADING,
        SUCCESS,
        FAILED
    }

    /* renamed from: a */
    public final STATE mo110170a() {
        return this.f76374a;
    }

    /* renamed from: b */
    public final String mo110171b() {
        return this.f76375b;
    }

    /* renamed from: c */
    public final boolean mo110172c() {
        return this.f76376c;
    }

    public ShareState(STATE state, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(state, "state");
        this.f76374a = state;
        this.f76375b = str;
        this.f76376c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareState(STATE state, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(state, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }
}
