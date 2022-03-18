package com.ss.android.lark.guidemgr.lock;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0007J\u000e\u0010\u0003\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/guidemgr/lock/GuideLock;", "", "()V", "isLocked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lockKey", "", "", "guideKey", "reset", "", "tryLock", "unlock", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guidemgr.d.a */
public final class GuideLock {

    /* renamed from: a */
    private volatile String f99612a;

    /* renamed from: b */
    private final AtomicBoolean f99613b = new AtomicBoolean(false);

    /* renamed from: a */
    public final boolean mo141895a() {
        return this.f99613b.get();
    }

    /* renamed from: b */
    public final void mo141897b() {
        this.f99613b.set(false);
        this.f99612a = null;
    }

    /* renamed from: c */
    public final boolean mo141899c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        if (!mo141895a() || TextUtils.equals(this.f99612a, str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo141896a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        if (this.f99613b.compareAndSet(false, true)) {
            this.f99612a = str;
            return true;
        } else if (!mo141895a() || !TextUtils.equals(this.f99612a, str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public final void mo141898b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "guideKey");
        if (mo141895a() && TextUtils.equals(this.f99612a, str) && this.f99613b.compareAndSet(true, false)) {
            this.f99612a = null;
        }
    }
}
