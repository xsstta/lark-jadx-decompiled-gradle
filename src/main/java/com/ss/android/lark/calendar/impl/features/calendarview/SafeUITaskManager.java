package com.ss.android.lark.calendar.impl.features.calendarview;

import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.callback.AbstractC25971e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0018\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0019\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/SafeUITaskManager;", "", "()V", "isDestroyed", "", "mCancelableTask", "Ljava/util/ArrayList;", "Lcom/larksuite/framework/callback/ICancelable;", "mLock", "mRunnableTask", "Ljava/lang/Runnable;", "mUIHandler", "Landroid/os/Handler;", "add", "", "cancelable", "runnable", "addCancelable", "cancelAllTask", "executeUI", "postDelayedUI", "time", "", "postUI", "remove", "removeCancelable", "CancelRunnableWrapper", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.l */
public final class SafeUITaskManager {

    /* renamed from: a */
    public boolean f77514a;

    /* renamed from: b */
    private final ArrayList<AbstractC25971e> f77515b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<Runnable> f77516c = new ArrayList<>();

    /* renamed from: d */
    private final Object f77517d = new Object();

    /* renamed from: e */
    private final Handler f77518e = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/SafeUITaskManager$CancelRunnableWrapper;", "Ljava/lang/Runnable;", "Lcom/larksuite/framework/callback/ICancelable;", "mRunnable", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/SafeUITaskManager;Ljava/lang/Runnable;)V", "mIsCancel", "", "cancel", "", "isCanceled", "run", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.l$a */
    public final class CancelRunnableWrapper implements AbstractC25971e, Runnable {

        /* renamed from: b */
        private volatile boolean f77520b;

        /* renamed from: c */
        private final Runnable f77521c;

        @Override // com.larksuite.framework.callback.AbstractC25971e
        public synchronized boolean isCanceled() {
            return this.f77520b;
        }

        @Override // com.larksuite.framework.callback.AbstractC25971e
        public synchronized void cancel() {
            this.f77520b = true;
        }

        public void run() {
            if (!isCanceled() && !SafeUITaskManager.this.f77514a) {
                SafeUITaskManager.this.mo111650b(this, this);
                Runnable runnable = this.f77521c;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }

        public CancelRunnableWrapper(Runnable runnable) {
            this.f77521c = runnable;
        }
    }

    /* renamed from: a */
    public final void mo111646a() {
        synchronized (this.f77517d) {
            Iterator<AbstractC25971e> it = this.f77515b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            Iterator<Runnable> it2 = this.f77516c.iterator();
            while (it2.hasNext()) {
                this.f77518e.removeCallbacks(it2.next());
            }
            this.f77515b.clear();
            this.f77516c.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo111648a(Runnable runnable) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mo111651b(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo111651b(Runnable runnable) {
        CancelRunnableWrapper aVar = new CancelRunnableWrapper(runnable);
        CancelRunnableWrapper aVar2 = aVar;
        this.f77518e.post(aVar2);
        mo111647a(aVar, aVar2);
    }

    /* renamed from: a */
    public final void mo111647a(AbstractC25971e eVar, Runnable runnable) {
        if (eVar != null && runnable != null) {
            synchronized (this.f77517d) {
                this.f77515b.add(eVar);
                this.f77516c.add(runnable);
            }
        }
    }

    /* renamed from: b */
    public final void mo111650b(AbstractC25971e eVar, Runnable runnable) {
        if (eVar != null && runnable != null) {
            synchronized (this.f77517d) {
                this.f77515b.remove(eVar);
                this.f77516c.remove(runnable);
            }
        }
    }

    /* renamed from: a */
    public final void mo111649a(Runnable runnable, long j) {
        CancelRunnableWrapper aVar = new CancelRunnableWrapper(runnable);
        CancelRunnableWrapper aVar2 = aVar;
        this.f77518e.postDelayed(aVar2, j);
        mo111647a(aVar, aVar2);
    }
}
