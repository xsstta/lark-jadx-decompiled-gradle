package com.ss.android.lark.calendar.impl.utils.debounce;

import android.os.SystemClock;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\u0007H&J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/debounce/DebounceAction;", "", "()V", "mDebounceInternal", "", "mLastClickTime", "action", "", "doAction", "setDebounceInterval", "internal", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.a.a */
public abstract class DebounceAction {

    /* renamed from: a */
    private long f83719a;

    /* renamed from: b */
    private long f83720b = 1000;

    /* renamed from: a */
    public abstract void mo115941a();

    /* renamed from: b */
    public final void mo120295b() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f83719a > this.f83720b) {
            mo115941a();
            this.f83719a = uptimeMillis;
        }
    }

    /* renamed from: a */
    public final void mo120294a(long j) {
        this.f83720b = j;
    }
}
