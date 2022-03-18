package com.bytedance.apm.block.p136a;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.block.AbstractC2833a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.p153n.C3056d;
import com.bytedance.monitor.collector.AbstractC20122a;
import com.bytedance.monitor.collector.C20146h;
import com.bytedance.monitor.collector.C20152k;
import com.bytedance.services.apm.api.AbstractC20698c;
import com.bytedance.services.apm.api.EnsureManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.apm.block.a.f */
public class C2848f implements AbstractC20698c {

    /* renamed from: q */
    private static final C2848f f9080q = new C2848f();

    /* renamed from: a */
    public volatile boolean f9081a;

    /* renamed from: b */
    public final C2847e f9082b = new C2847e();

    /* renamed from: c */
    public final List<AbstractC2833a> f9083c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public boolean f9084d = false;

    /* renamed from: e */
    public Object f9085e;

    /* renamed from: f */
    public Object[] f9086f;

    /* renamed from: g */
    public long[] f9087g;

    /* renamed from: h */
    public Method f9088h;

    /* renamed from: i */
    public Choreographer f9089i;

    /* renamed from: j */
    final C3056d f9090j;

    /* renamed from: k */
    Runnable f9091k;

    /* renamed from: l */
    private long[] f9092l = new long[4];

    /* renamed from: m */
    private boolean f9093m = false;

    /* renamed from: n */
    private boolean f9094n = false;

    /* renamed from: o */
    private boolean f9095o = false;

    /* renamed from: p */
    private long f9096p;

    /* renamed from: r */
    private boolean f9097r;

    /* renamed from: h */
    private void m12010h() {
        this.f9094n = true;
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onBackground(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onChange(Activity activity, Fragment fragment) {
    }

    /* renamed from: a */
    public static C2848f m12008a() {
        return f9080q;
    }

    /* renamed from: c */
    public C3056d mo12250c() {
        return this.f9090j;
    }

    /* renamed from: i */
    private void m12011i() {
        if (Build.VERSION.SDK_INT >= 16) {
            mo12244a(this.f9091k);
        }
        this.f9094n = false;
    }

    private C2848f() {
        C3056d dVar = new C3056d("looper_monitor");
        this.f9090j = dVar;
        this.f9096p = -1;
        dVar.mo12899a();
    }

    /* renamed from: e */
    public synchronized void mo12252e() {
        if (C2785b.m11764f()) {
            if (this.f9097r) {
                if (!this.f9081a) {
                    this.f9081a = true;
                }
                if (this.f9093m && Build.VERSION.SDK_INT >= 16) {
                    mo12244a(this.f9091k);
                }
                return;
            }
            throw new RuntimeException("never init!");
        }
    }

    /* renamed from: f */
    public synchronized void mo12253f() {
        if (C2785b.m11761e()) {
            if (this.f9097r) {
                if (this.f9081a) {
                    this.f9081a = false;
                }
                return;
            }
            throw new RuntimeException("MainThreadMonitor is never init!");
        }
    }

    /* renamed from: g */
    public void mo12254g() {
        try {
            if (Build.VERSION.SDK_INT > 22) {
                long[] jArr = this.f9087g;
                if (jArr == null) {
                    this.f9096p = AbstractC20122a.f49109b;
                } else {
                    this.f9096p = jArr[1] / 1000000;
                }
            } else {
                this.f9096p = AbstractC20122a.f49109b;
            }
            m12010h();
        } finally {
            this.f9095o = false;
        }
    }

    /* renamed from: b */
    public void mo12248b() {
        if (!this.f9097r) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ActivityLifeObserver.getInstance().register(this);
                C20146h.m73512a();
                C20146h.m73513a(new AbstractC20122a() {
                    /* class com.bytedance.apm.block.p136a.C2848f.C28491 */

                    @Override // com.bytedance.monitor.collector.AbstractC20122a
                    /* renamed from: a */
                    public boolean mo12256a() {
                        return C2848f.this.f9081a;
                    }

                    @Override // com.bytedance.monitor.collector.AbstractC20122a
                    /* renamed from: a */
                    public void mo12255a(String str) {
                        super.mo12255a(str);
                        C2848f.this.mo12245a(str);
                    }

                    @Override // com.bytedance.monitor.collector.AbstractC20122a
                    /* renamed from: b */
                    public void mo12257b(String str) {
                        super.mo12257b(str);
                        C2848f.this.mo12251d();
                    }
                });
                this.f9097r = true;
                return;
            }
            throw new AssertionError("must be init in main thread!");
        }
    }

    /* renamed from: d */
    public void mo12251d() {
        boolean z;
        boolean z2 = this.f9094n;
        if (this.f9093m && z2) {
            m12011i();
            final long j = AbstractC20122a.f49109b;
            final long j2 = this.f9096p;
            if (this.f9087g != null) {
                if (C20152k.m73538a().mo68304l() != null) {
                    C20152k.m73538a().mo68304l().mo68251a(this.f9087g);
                }
                C2842d.m11997a().mo12232a(this.f9087g, j);
            }
            this.f9090j.mo12901a(new Runnable() {
                /* class com.bytedance.apm.block.p136a.C2848f.RunnableC28502 */

                public void run() {
                    for (AbstractC2833a aVar : C2848f.this.f9083c) {
                        aVar.mo12215a(ActivityLifeObserver.getInstance().getTopActivityClassName(), j2, j);
                    }
                }
            });
        }
        this.f9092l[1] = AbstractC20122a.f49109b;
        this.f9092l[3] = AbstractC20122a.f49110c;
        List<AbstractC2833a> list = this.f9083c;
        int size = list.size();
        int i = 0;
        while (i < size) {
            AbstractC2833a aVar = list.get(i);
            if (aVar.mo12216a()) {
                long[] jArr = this.f9092l;
                z = z2;
                aVar.mo12213a(jArr[0], jArr[2], jArr[1], jArr[3], z);
            } else {
                z = z2;
            }
            i++;
            z2 = z;
        }
        this.f9082b.mo12238a();
        this.f9084d = false;
    }

    /* renamed from: a */
    public void mo12246a(boolean z) {
        this.f9093m = z;
    }

    /* renamed from: b */
    public void mo12249b(AbstractC2833a aVar) {
        this.f9083c.remove(aVar);
        if (this.f9083c.isEmpty()) {
            mo12253f();
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onFront(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16 && this.f9089i == null && this.f9093m) {
            try {
                this.f9089i = Choreographer.getInstance();
            } catch (Exception unused) {
            }
            C3047b.m12756a().mo12886a(new Runnable() {
                /* class com.bytedance.apm.block.p136a.C2848f.RunnableC28513 */

                public void run() {
                    try {
                        C2848f.this.f9091k = new Runnable() {
                            /* class com.bytedance.apm.block.p136a.C2848f.RunnableC28513.RunnableC28521 */

                            public void run() {
                                try {
                                    C2848f.this.mo12254g();
                                } catch (Throwable unused) {
                                }
                            }
                        };
                        C2848f fVar = C2848f.this;
                        fVar.f9085e = fVar.mo12241a(fVar.f9089i, "mLock");
                        if (C2848f.this.f9085e == null) {
                            C2848f fVar2 = C2848f.this;
                            fVar2.f9085e = fVar2.mo12247b(fVar2.f9089i, "mLock");
                        }
                        C2848f fVar3 = C2848f.this;
                        fVar3.f9086f = (Object[]) fVar3.mo12241a(fVar3.f9089i, "mCallbackQueues");
                        if (C2848f.this.f9086f == null) {
                            C2848f fVar4 = C2848f.this;
                            fVar4.f9086f = (Object[]) fVar4.mo12247b(fVar4.f9089i, "mCallbackQueues");
                        }
                        if (Build.VERSION.SDK_INT == 28) {
                            C2848f fVar5 = C2848f.this;
                            fVar5.f9087g = (long[]) fVar5.mo12247b(fVar5.mo12247b(fVar5.f9089i, "mFrameInfo"), "mFrameInfo");
                        } else if (Build.VERSION.SDK_INT > 28) {
                            C2848f fVar6 = C2848f.this;
                            fVar6.f9087g = (long[]) fVar6.mo12247b(fVar6.mo12247b(fVar6.f9089i, "mFrameInfo"), "frameInfo");
                        } else if (Build.VERSION.SDK_INT > 22) {
                            C2848f fVar7 = C2848f.this;
                            fVar7.f9087g = (long[]) fVar7.mo12241a(fVar7.mo12241a(fVar7.f9089i, "mFrameInfo"), "mFrameInfo");
                        }
                        if (C2848f.this.f9087g == null && Build.VERSION.SDK_INT > 22) {
                            EnsureManager.ensureNotReachHere("FrameInfoIsNull");
                        }
                        if (C2848f.this.f9085e == null) {
                            EnsureManager.ensureNotReachHere("CallbackQueueLockIsNull");
                        }
                        if (C2848f.this.f9086f == null) {
                            EnsureManager.ensureNotReachHere("callbackQueuesIsNull");
                        }
                        C2848f fVar8 = C2848f.this;
                        fVar8.f9088h = fVar8.mo12242a(fVar8.f9086f[0], "addCallbackLocked", Long.TYPE, Object.class, Object.class);
                        if (Build.VERSION.SDK_INT >= 16) {
                            C2848f fVar9 = C2848f.this;
                            fVar9.mo12244a(fVar9.f9091k);
                        }
                    } catch (Exception e) {
                        EnsureManager.ensureNotReachHere(e, "MainThreadMonitor_fullFps");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo12243a(AbstractC2833a aVar) {
        if (!this.f9081a) {
            mo12252e();
        }
        if (!this.f9083c.contains(aVar)) {
            this.f9083c.add(aVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo12244a(Runnable runnable) {
        if (this.f9081a) {
            if (!this.f9095o) {
                try {
                    synchronized (this.f9085e) {
                        Method method = this.f9088h;
                        if (method != null) {
                            method.invoke(this.f9086f[0], -1L, runnable, null);
                            this.f9095o = true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12245a(String str) {
        this.f9084d = true;
        this.f9092l[0] = AbstractC20122a.f49109b;
        this.f9092l[2] = AbstractC20122a.f49110c;
        List<AbstractC2833a> list = this.f9083c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC2833a aVar = list.get(i);
            if (!aVar.mo12216a()) {
                aVar.mo12214a(str);
            }
        }
    }

    /* renamed from: a */
    public <T> T mo12241a(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return (T) declaredField.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.services.apm.api.AbstractC20698c
    public void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                window.setCallback(new AbstractWindow$CallbackC2862i(window.getCallback()) {
                    /* class com.bytedance.apm.block.p136a.C2848f.C28534 */

                    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
                        if (!C2848f.this.f9084d) {
                            C2848f.this.f9082b.mo12239a(keyEvent.getEventTime());
                        }
                        return this.f9138b.dispatchKeyEvent(keyEvent);
                    }

                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        if (!C2848f.this.f9084d) {
                            C2848f.this.f9082b.mo12239a(motionEvent.getEventTime());
                        }
                        return this.f9138b.dispatchTouchEvent(motionEvent);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public <T> T mo12247b(Object obj, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(obj.getClass(), str);
            field.setAccessible(true);
            return (T) field.get(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public Method mo12242a(Object obj, String str, Class<?>... clsArr) {
        try {
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m12009a(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }
}
