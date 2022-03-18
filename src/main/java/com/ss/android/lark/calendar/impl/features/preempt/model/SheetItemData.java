package com.ss.android.lark.calendar.impl.features.preempt.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "", "()V", "displayStr", "", "getDisplayStr", "()Ljava/lang/String;", "setDisplayStr", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "endTime", "getEndTime", "setEndTime", "isCheck", "", "()Z", "setCheck", "(Z)V", "startTime", "getStartTime", "setStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b.b */
public final class SheetItemData {

    /* renamed from: a */
    public String f82450a;

    /* renamed from: b */
    private long f82451b;

    /* renamed from: c */
    private long f82452c;

    /* renamed from: d */
    private boolean f82453d;

    /* renamed from: a */
    public final long mo117870a() {
        return this.f82451b;
    }

    /* renamed from: b */
    public final long mo117874b() {
        return this.f82452c;
    }

    /* renamed from: d */
    public final boolean mo117877d() {
        return this.f82453d;
    }

    /* renamed from: c */
    public final String mo117876c() {
        String str = this.f82450a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("displayStr");
        }
        return str;
    }

    /* renamed from: a */
    public final void mo117871a(long j) {
        this.f82451b = j;
    }

    /* renamed from: b */
    public final void mo117875b(long j) {
        this.f82452c = j;
    }

    /* renamed from: a */
    public final void mo117872a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82450a = str;
    }

    /* renamed from: a */
    public final void mo117873a(boolean z) {
        this.f82453d = z;
    }
}
