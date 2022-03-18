package com.ss.android.lark.platform.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.manager.C2507n;
import com.bytedance.apm.ApmAgent;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.appstate.C29223a;
import com.ss.android.lark.base.activity.AppActivity;
import com.ss.android.lark.base.watermark.IWatermarkable;
import com.ss.android.lark.biz.core.api.AbstractC29561h;
import com.ss.android.lark.biz.core.api.AbstractC29585t;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1764b.C36093a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.ding.helper.C36644b;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.platform.ag.C51689a;
import com.ss.android.lark.platform.p2482c.C51791b;
import com.ss.android.lark.platform.p2482c.C51792c;
import com.ss.android.lark.platform.p2509y.C52063a;
import com.ss.android.lark.platform.statistics.C51956a;
import com.ss.android.lark.platform.statistics.FocusHitPoint;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.stepcount.service.AbstractC54994a;
import com.ss.android.lark.watermark.C58219a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.platform.lifecycle.b */
public class ComponentCallbacks2C51833b extends FragmentManager.AbstractC1010b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final List<AbstractC29561h> f128821a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private static final List<AbstractC29585t> f128822b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private static int f128823c;

    /* renamed from: d */
    private static Application f128824d;

    /* renamed from: g */
    private static final ConcurrentLinkedDeque<ComponentCallbacks2> f128825g = new ConcurrentLinkedDeque<>();

    /* renamed from: h */
    private static final C58219a f128826h = C51689a.m200461a().mo197375d();

    /* renamed from: e */
    private final C29223a f128827e = C51791b.m200791a();

    /* renamed from: f */
    private final AbstractC54994a f128828f = C52063a.m201976a().mo187772a();

    /* renamed from: a */
    public static void m200965a() {
        m200966a(15);
    }

    private ComponentCallbacks2C51833b() {
        f128823c = 0;
    }

    public void onLowMemory() {
        Log.m165389i("LifecycleHandler", "onLowMemory");
        Iterator<ComponentCallbacks2> it = f128825g.iterator();
        while (it.hasNext()) {
            it.next().onLowMemory();
        }
    }

    /* renamed from: b */
    public static void m200972b(ComponentCallbacks2 componentCallbacks2) {
        f128825g.remove(componentCallbacks2);
    }

    /* renamed from: a */
    public static void m200967a(Application application) {
        ComponentCallbacks2C51833b bVar = new ComponentCallbacks2C51833b();
        application.registerActivityLifecycleCallbacks(bVar);
        application.registerComponentCallbacks(bVar);
        f128824d = application;
    }

    /* renamed from: b */
    public static void m200973b(AbstractC29561h hVar) {
        if (hVar != null) {
            f128821a.remove(hVar);
        }
    }

    /* renamed from: d */
    private void m200976d(Activity activity) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    /* renamed from: e */
    private void m200977e(Activity activity) {
        if (activity instanceof FragmentActivity) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m200978f(Activity activity) {
        ApmAgent.stopCollectCurrent(activity.getClass().getSimpleName());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m200979g(Activity activity) {
        ApmAgent.startCollectCurrent(activity.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static void m200968a(ComponentCallbacks2 componentCallbacks2) {
        ConcurrentLinkedDeque<ComponentCallbacks2> concurrentLinkedDeque = f128825g;
        if (!concurrentLinkedDeque.contains(componentCallbacks2)) {
            concurrentLinkedDeque.add(componentCallbacks2);
        }
    }

    /* renamed from: b */
    public static void m200974b(AbstractC29585t tVar) {
        if (tVar != null) {
            f128822b.remove(tVar);
        }
    }

    /* renamed from: a */
    private static void m200966a(int i) {
        Log.m165389i("LifecycleHandler", "notifyLowMemory " + i);
        Iterator<ComponentCallbacks2> it = f128825g.iterator();
        while (it.hasNext()) {
            it.next().onTrimMemory(i);
        }
    }

    /* renamed from: b */
    private static void m200971b(Activity activity) {
        AbstractC49389b m;
        if (C26252ad.m94993b(f128824d) && (m = C36083a.m141486a().getPassportDependency().mo133094m()) != null && m.mo172428i()) {
            C36093a.m141506a().mo104297a(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivityDestroyed");
        m200977e(activity);
        C51792c.m200792a().mo177906a(activity.hashCode());
        C36644b.m144618a().mo135213a(activity);
        C36512a.m144041a().mo134772b(activity);
    }

    public void onTrimMemory(int i) {
        Log.m165389i("LifecycleHandler", "onTrimMemory level=" + i);
        if (i >= 40 && C26252ad.m94993b(f128824d)) {
            this.f128827e.mo103630a().mo103632a();
        }
        m200966a(i);
    }

    /* renamed from: a */
    public static void m200969a(AbstractC29561h hVar) {
        if (hVar != null) {
            f128821a.add(hVar);
        }
    }

    /* renamed from: c */
    private void m200975c(Activity activity) {
        if (C36083a.m141486a().getPassportDependency().mo133094m().mo172428i()) {
            if (!(activity instanceof IWatermarkable) || ((IWatermarkable) activity).enableGlobalWatermark()) {
                C51792c.m200792a().mo177907a(activity.hashCode(), activity.getResources().getConfiguration().orientation);
                Log.m165389i("LifecycleHandler", "watermark v2 impl");
                C51689a.m200461a().mo197361a(activity);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivityPaused");
        C29410a.m108289c().mo104282a((Activity) null);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(activity) {
            /* class com.ss.android.lark.platform.lifecycle.$$Lambda$b$tQ0yxcUf6IbdskmX8zGg7j6t5Ko */
            public final /* synthetic */ Activity f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                ComponentCallbacks2C51833b.m200978f(this.f$0);
            }
        });
        if (C36149a.m142162a().mo157098b().mo105701a(activity)) {
            this.f128828f.mo187799a();
        }
    }

    public void onActivityResumed(Activity activity) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " resumed");
        C29410a.m108289c().mo104282a(activity);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(activity) {
            /* class com.ss.android.lark.platform.lifecycle.$$Lambda$b$UpTfaFBy2yS9M0GFM0fMjZUpN5s */
            public final /* synthetic */ Activity f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                ComponentCallbacks2C51833b.m200979g(this.f$0);
            }
        });
        if (C36149a.m142162a().mo157098b().mo105701a(activity)) {
            this.f128828f.mo187800a(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivityStopped");
        boolean z = true;
        f128823c = f128823c - 1;
        AbstractC29417b c = C29410a.m108289c();
        if (f128823c <= 0) {
            z = false;
        }
        c.mo104287b(z);
        if (f128823c == 0) {
            Log.m165389i("LifecycleHandler", "app change to background");
            LKUIToast.disableToast();
            FocusHitPoint.f129008f.mo178132a(2);
            C51973e.m201587e();
            C36644b.m144618a().mo135217a(false);
            C36644b.m144618a().mo135224g();
            for (AbstractC29585t tVar : f128822b) {
                if (tVar != null) {
                    tVar.mo102524a(activity.getClass());
                }
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Log.m165379d("LifecycleHandler", "configuration Changed Orientation = " + configuration.orientation);
        final Activity c = C29410a.m108289c().mo104289c();
        if (c != null) {
            c.onConfigurationChanged(configuration);
            C51792c.m200792a().mo177908a(c.hashCode(), configuration.orientation, new C51792c.AbstractC51794b() {
                /* class com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b.C518352 */

                @Override // com.ss.android.lark.platform.p2482c.C51792c.AbstractC51794b
                /* renamed from: a */
                public void mo177909a(int i, int i2) {
                    ComponentCallbacks2C51833b.this.mo178005a(c);
                }
            });
        }
        Iterator<ComponentCallbacks2> it = f128825g.iterator();
        while (it.hasNext()) {
            it.next().onConfigurationChanged(configuration);
        }
    }

    /* renamed from: a */
    public static void m200970a(AbstractC29585t tVar) {
        if (tVar != null) {
            f128822b.add(tVar);
        }
    }

    public void onActivityStarted(Activity activity) {
        boolean z;
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivityStarted");
        int i = f128823c;
        f128823c = i + 1;
        AbstractC29417b c = C29410a.m108289c();
        if (f128823c > 0) {
            z = true;
        } else {
            z = false;
        }
        c.mo104287b(z);
        if (i == 0) {
            Log.m165389i("LifecycleHandler", "app change to forground");
            LKUIToast.enableToast();
            C38770b.m153078a().mo142126a(NetworkUtils.m153071d(activity));
            FocusHitPoint.f129008f.mo178132a(1);
            C36083a.m141486a().getIMDependency().mo132953n();
            C36644b.m144618a().mo135217a(true);
            C36644b.m144618a().mo135223f();
            m200971b(activity);
            for (AbstractC29561h hVar : f128821a) {
                if (hVar != null) {
                    hVar.mo102523a(activity.getClass());
                }
            }
        }
        C29410a.m108289c().mo104285a(true);
    }

    /* renamed from: a */
    public void mo178005a(Activity activity) {
        if (!(activity instanceof IWatermarkable) || ((IWatermarkable) activity).enableGlobalWatermark()) {
            C51689a.m200461a().mo197374c(activity);
            C51689a.m200461a().mo197361a(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivitySaveInstanceState");
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: b */
    public void mo5404b(FragmentManager fragmentManager, Fragment fragment) {
        if (!(fragment instanceof C2507n)) {
            Log.m165389i("LifecycleHandler", fragment.getClass().getSimpleName() + " resumed");
        }
    }

    public void onActivityCreated(final Activity activity, Bundle bundle) {
        Log.m165389i("LifecycleHandler", activity.getClass().getSimpleName() + " onActivityCreated");
        if (bundle == null) {
            C51956a.m201509a(activity.getComponentName().getClassName());
        }
        if (C58219a.m225864a()) {
            f128826h.mo197246a(activity);
        }
        m200975c(activity);
        if (activity instanceof AppActivity) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b.RunnableC518341 */

                public void run() {
                    C51995b.m201716a("preload_ui");
                    ((AppActivity) activity).mo104623a();
                    if (C36149a.m142162a().mo157098b().mo105701a(activity)) {
                        C36149a.m142162a().mo157099b(activity);
                    }
                    C51995b.m201714a();
                }
            });
        }
        C36512a.m144041a().mo134754a(activity);
        if (!C36149a.m142162a().mo157098b().mo105701a(activity)) {
            m200976d(activity);
        }
    }
}
