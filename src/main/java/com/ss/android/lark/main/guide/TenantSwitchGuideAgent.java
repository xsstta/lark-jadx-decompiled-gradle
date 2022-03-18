package com.ss.android.lark.main.guide;

import android.view.View;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/main/guide/TenantSwitchGuideAgent;", "", "()V", "SWITCH_DELAY", "", "TAG", "", "mFuture", "Ljava/util/concurrent/Future;", "isTenantSwitchGuidanceV3FgEnable", "", "showTenantSwitchGuidanceV3", "", "avatar", "Landroid/view/View;", "immediately", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.b.c */
public final class TenantSwitchGuideAgent {

    /* renamed from: a */
    public static final TenantSwitchGuideAgent f112846a = new TenantSwitchGuideAgent();

    /* renamed from: b */
    private static Future<?> f112847b;

    private TenantSwitchGuideAgent() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.b.c$b */
    public static final class RunnableC44495b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f112850a;

        /* renamed from: b */
        final /* synthetic */ AbstractC44136a.AbstractC44171x f112851b;

        RunnableC44495b(View view, AbstractC44136a.AbstractC44171x xVar) {
            this.f112850a = view;
            this.f112851b = xVar;
        }

        public final void run() {
            AbstractC44136a a = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
            a.mo133200T().mo133280a(this.f112850a, new View.OnClickListener(this) {
                /* class com.ss.android.lark.main.guide.TenantSwitchGuideAgent.RunnableC44495b.View$OnClickListenerC444961 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44495b f112852a;

                {
                    this.f112852a = r1;
                }

                public final void onClick(View view) {
                    this.f112852a.f112851b.mo133405a(true);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.b.c$c */
    public static final class C44497c extends Lambda implements Function0<Unit> {
        public static final C44497c INSTANCE = new C44497c();

        C44497c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            View a = C44498d.m176512a("main_title_avatar");
            if (a != null) {
                TenantSwitchGuideAgent.f112846a.mo157925a(a);
            } else {
                Log.m165397w("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> Avatar is null.");
            }
            TenantSwitchGuideAgent cVar = TenantSwitchGuideAgent.f112846a;
            TenantSwitchGuideAgent.f112847b = null;
        }
    }

    /* renamed from: a */
    public final boolean mo157927a() {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        return a.mo133270z().mo133361a("ug.guide.teamswitch");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.b.c$a */
    public static final class RunnableC44493a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Function0 f112848a;

        RunnableC44493a(Function0 function0) {
            this.f112848a = function0;
        }

        public final void run() {
            boolean a = TenantSwitchGuideAgent.f112846a.mo157927a();
            AbstractC44136a a2 = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MainModule.getDependency()");
            boolean f = a2.mo133188H().mo133416f();
            if (!a || !f) {
                Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> fg=" + a + ", tip=" + f + ", and try delay again");
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getScheduleThreadPool().schedule(new Runnable(this) {
                    /* class com.ss.android.lark.main.guide.TenantSwitchGuideAgent.RunnableC44493a.RunnableC444941 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44493a f112849a;

                    {
                        this.f112849a = r1;
                    }

                    public final void run() {
                        this.f112849a.f112848a.invoke();
                    }
                }, 1320, TimeUnit.MILLISECONDS);
                return;
            }
            this.f112848a.invoke();
        }
    }

    /* renamed from: a */
    public final void mo157925a(View view) {
        if (!mo157927a()) {
            Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> FG is not enable.");
            return;
        }
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        AbstractC44136a.AbstractC44171x H = a.mo133188H();
        if (!H.mo133416f()) {
            Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> Guide is not enable.");
            return;
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getUIExecutor().execute(new RunnableC44495b(view, H));
        Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> Guide show");
    }

    /* renamed from: a */
    public final void mo157926a(boolean z) {
        long j;
        Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> start, immediately=" + z);
        if (f112847b != null) {
            Log.m165389i("TenantSwitchGuideAgent", "showTenantSwitchGuidanceV3 -> mFuture is scheduling.");
            return;
        }
        if (z) {
            j = 0;
        } else {
            j = 1320;
        }
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        f112847b = coreThreadPool.getScheduleThreadPool().schedule(new RunnableC44493a(C44497c.INSTANCE), j, TimeUnit.MILLISECONDS);
    }
}
