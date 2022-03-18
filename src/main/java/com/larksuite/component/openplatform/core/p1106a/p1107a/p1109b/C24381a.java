package com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.p1104c.AbstractC24370c;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24469d;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1108a.AbstractC24380a;
import com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1111a.AbstractC24387a;
import com.larksuite.component.openplatform.core.utils.p1136a.C25526b;
import com.larksuite.framework.thread.CoreThreadPool;
import com.tt.refer.common.util.C67866g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.larksuite.component.openplatform.core.a.a.b.a */
public class C24381a extends AbstractC24380a {

    /* renamed from: b */
    public AbstractC24370c f60166b;

    /* renamed from: c */
    public AbstractC24387a f60167c;

    /* renamed from: d */
    public volatile boolean f60168d = false;

    /* renamed from: e */
    private ConcurrentLinkedDeque<AbstractC24387a> f60169e;

    /* renamed from: f */
    private CountDownLatch f60170f;

    /* renamed from: g */
    private final AtomicBoolean f60171g = new AtomicBoolean(false);

    /* renamed from: h */
    private final Handler f60172h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private Runnable f60173i;

    /* renamed from: j */
    private volatile boolean f60174j = false;

    /* renamed from: k */
    private final List<Runnable> f60175k = new ArrayList();

    /* renamed from: b */
    public void mo87168b() {
        this.f60168d = true;
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m88982f() {
        this.f60165a.mo87114e();
    }

    /* renamed from: a */
    public void mo87163a() {
        synchronized (this) {
            this.f60174j = true;
            m88981e();
        }
    }

    /* renamed from: e */
    private void m88981e() {
        for (Runnable runnable : this.f60175k) {
            runnable.run();
        }
        this.f60175k.clear();
    }

    /* renamed from: c */
    public void mo87170c() {
        synchronized (this) {
            if (this.f60174j) {
                m88982f();
            } else {
                this.f60175k.add(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.$$Lambda$a$04pZEosure7_ykn35_tSP5CTQQ */

                    public final void run() {
                        C24381a.m270167lambda$04pZEosure7_ykn35_tSP5CTQQ(C24381a.this);
                    }
                });
            }
        }
    }

    /* renamed from: d */
    private void m88980d() {
        Runnable runnable = this.f60173i;
        if (runnable != null) {
            this.f60172h.removeCallbacks(runnable);
        }
        CountDownLatch countDownLatch = this.f60170f;
        if (countDownLatch == null) {
            AppBrandLogger.m52830i("LaunchScheduler", "mLatch is null");
            return;
        }
        int count = (int) countDownLatch.getCount();
        if (count == 0) {
            AppBrandLogger.m52830i("LaunchScheduler", "mLatch already released all count");
            return;
        }
        for (int i = 0; i < count; i++) {
            this.f60170f.countDown();
        }
        AppBrandLogger.m52830i("LaunchScheduler", "mLatch release all count finished");
    }

    /* renamed from: a */
    public void mo87165a(AbstractC24370c cVar) {
        this.f60166b = cVar;
    }

    public C24381a(AbstractC24469d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public void mo87167a(ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque) {
        this.f60169e = concurrentLinkedDeque;
        this.f60170f = new CountDownLatch(this.f60169e.size());
    }

    /* renamed from: a */
    private void m88977a(IAppContext iAppContext, Bundle bundle) {
        ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque = this.f60169e;
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.isEmpty()) {
            AppBrandLogger.m52830i("LaunchScheduler", "No next step can move");
            return;
        }
        this.f60170f.countDown();
        m88979a(this.f60169e.poll(), iAppContext, bundle, false);
    }

    /* renamed from: a */
    private void m88978a(IAppContext iAppContext, final String str, final String str2) {
        if (this.f60166b != null) {
            C67866g.m264027a(new Runnable() {
                /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a.RunnableC243865 */

                public void run() {
                    C24381a.this.f60166b.mo49119a(str, str2);
                    C24381a.this.mo87163a();
                }
            });
        }
        C25526b.m91116a("mp_load_result", iAppContext, "fail", str, str2);
    }

    /* renamed from: a */
    public void mo87164a(final IAppContext iAppContext, final Bundle bundle, boolean z) {
        ConcurrentLinkedDeque<AbstractC24387a> concurrentLinkedDeque = this.f60169e;
        if (concurrentLinkedDeque == null || concurrentLinkedDeque.isEmpty()) {
            AppBrandLogger.m52830i("LaunchScheduler", "The steps of launch scheduler is null");
            return;
        }
        m88979a(this.f60169e.poll(), iAppContext, bundle, z);
        RunnableC243821 r0 = new Runnable() {
            /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a.RunnableC243821 */

            public void run() {
                C24381a aVar = C24381a.this;
                aVar.mo87166a(aVar.f60167c, iAppContext, bundle, "-10003", "LAUNCH_SCHEDULER_STEP_AWAIT_INTERRUPT ");
            }
        };
        this.f60173i = r0;
        if (!z) {
            this.f60172h.postDelayed(r0, 50000);
        }
    }

    /* renamed from: b */
    public void mo87169b(AbstractC24387a aVar, IAppContext iAppContext, Bundle bundle) {
        if (aVar == null) {
            mo87166a(null, iAppContext, bundle, "-10001", "LAUNCH_SCHEDULER_NO_CUR_STEP");
        } else if (!aVar.mo87183d()) {
            AppBrandLogger.m52830i("LaunchScheduler", "Only sync step can trigger MOVE_TO_NEXT");
        } else {
            this.f60170f.countDown();
            if (this.f60169e.isEmpty()) {
                AppBrandLogger.m52830i("LaunchScheduler", "Can not find next step");
                mo87161a(aVar, iAppContext, bundle);
                return;
            }
            m88979a(this.f60169e.poll(), iAppContext, bundle, false);
        }
    }

    @Override // com.larksuite.component.openplatform.core.p1106a.p1107a.p1108a.AbstractC24380a
    /* renamed from: a */
    public void mo87161a(AbstractC24387a aVar, IAppContext iAppContext, Bundle bundle) {
        if (aVar == null || aVar.mo87183d()) {
            m88980d();
            if (this.f60166b != null) {
                C67866g.m264027a(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a.RunnableC243832 */

                    public void run() {
                        C24381a.this.f60166b.mo49118a();
                        C24381a.this.mo87163a();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m88979a(final AbstractC24387a aVar, final IAppContext iAppContext, final Bundle bundle, boolean z) {
        if (aVar == null) {
            AppBrandLogger.m52829e("LaunchScheduler", "Try to process next step, but current step is null");
        } else if (this.f60168d) {
            AppBrandLogger.m52829e("LaunchScheduler", "Try to process next step, but Container destroyed");
        } else {
            this.f60167c = aVar;
            aVar.mo87178a(this, this.f60165a);
            AppBrandLogger.m52828d("LaunchScheduler", iAppContext.getAppIdentify() + "_before processNextStep " + aVar.mo87181c());
            if (aVar.mo87183d()) {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a.RunnableC243843 */

                    public void run() {
                        if (C24381a.this.f60168d) {
                            AppBrandLogger.m52829e("LaunchScheduler", "Try to process next step, but Container destroyed");
                            return;
                        }
                        AppBrandLogger.m52830i("LaunchScheduler", iAppContext.getAppIdentify() + "_sync processNextStep start " + aVar.mo87181c());
                        aVar.mo87177a(iAppContext, bundle);
                        AppBrandLogger.m52830i("LaunchScheduler", iAppContext.getAppIdentify() + "_sync processNextStep before cost " + aVar.mo87181c());
                        aVar.mo87180b(iAppContext, bundle);
                        AppBrandLogger.m52830i("LaunchScheduler", iAppContext.getAppIdentify() + "_sync processNextStep process cost " + aVar.mo87181c());
                        aVar.mo87182c(iAppContext, bundle);
                        AppBrandLogger.m52830i("LaunchScheduler", iAppContext.getAppIdentify() + "_sync processNextStep after cost " + aVar.mo87181c());
                    }
                });
                try {
                    synchronized (this) {
                        if (z) {
                            if (!this.f60171g.getAndSet(true)) {
                                this.f60170f.await(50000, TimeUnit.MILLISECONDS);
                            }
                        }
                    }
                } catch (InterruptedException e) {
                    mo87166a(aVar, iAppContext, bundle, "-10003", "LAUNCH_SCHEDULER_STEP_AWAIT_INTERRUPT ");
                    AppBrandLogger.m52829e("LaunchScheduler", "processNextStep await error : " + e.getMessage());
                }
            } else {
                CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.p1106a.p1107a.p1109b.C24381a.RunnableC243854 */

                    public void run() {
                        if (C24381a.this.f60168d) {
                            AppBrandLogger.m52829e("LaunchScheduler", "Try to process next step, but Container destroyed");
                            return;
                        }
                        AppBrandLogger.m52828d("LaunchScheduler", "async processNextStep start " + aVar.mo87181c());
                        aVar.mo87177a(iAppContext, bundle);
                        aVar.mo87180b(iAppContext, bundle);
                        aVar.mo87182c(iAppContext, bundle);
                        AppBrandLogger.m52828d("LaunchScheduler", "async processNextStep end " + aVar.mo87181c());
                    }
                });
                m88977a(iAppContext, bundle);
            }
        }
    }

    /* renamed from: a */
    public void mo87166a(AbstractC24387a aVar, IAppContext iAppContext, Bundle bundle, String str, String str2) {
        m88980d();
        if (aVar == null) {
            m88978a(iAppContext, str, str2);
            AppBrandLogger.m52830i("LaunchScheduler", "fatal error : move to error trigger by an empty step");
        } else if (!aVar.mo87183d()) {
            AppBrandLogger.m52830i("LaunchScheduler", "Only sync step can trigger MOVE_TO_ERROR");
        } else {
            m88978a(iAppContext, str, str2);
            AppBrandLogger.m52830i("LaunchScheduler", "LaunchScheduler is move to error on Step: " + aVar.mo87181c() + " of errorCode : " + str + " of errorMsg : " + str2);
        }
    }
}
