package com.ss.android.lark.widget.listener;

import android.os.SystemClock;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/widget/listener/DuplicateEnterChecker;", "", "()V", "intervalMs", "", "lastEnterTime", "", "isDuplicate", "", "com.ss.android.lark.widget"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.listener.a */
public final class DuplicateEnterChecker {

    /* renamed from: a */
    private final int f144513a = ParticipantRepo.f117150c;

    /* renamed from: b */
    private long f144514b;

    /* renamed from: a */
    public final boolean mo198450a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f144514b = uptimeMillis;
        if (uptimeMillis - this.f144514b < ((long) this.f144513a)) {
            return true;
        }
        return false;
    }
}
