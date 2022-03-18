package com.ss.android.lark.multitask;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.multitask.IMultitaskDependency;
import com.ss.android.lark.multitask.task.C48376q;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.utils.LarkContext;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.multitask.c */
public final class C48282c {

    /* renamed from: a */
    public static final Map<IMultitaskDependency.AppStateObserver, AbstractC29586u> f121578a = new ConcurrentHashMap();

    /* renamed from: b */
    private static C48335j f121579b;

    private C48282c() {
    }

    /* renamed from: b */
    private static IMultitaskDependency m190477b() {
        return new IMultitaskDependency() {
            /* class com.ss.android.lark.multitask.C48282c.C482831 */

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: a */
            public Context mo168869a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: f */
            public Function1<C48376q, Unit> mo168875f() {
                return new Function1<C48376q, Unit>() {
                    /* class com.ss.android.lark.multitask.C48282c.C482831.C482852 */

                    /* renamed from: a */
                    public Unit invoke(C48376q qVar) {
                        C36083a.m141486a().getCCMDependency().mo132727j();
                        return Unit.INSTANCE;
                    }
                };
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: b */
            public Activity mo168871b() {
                return AppLifecycle.m200904a().mo177978h();
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: d */
            public String mo168873d() {
                return C36083a.m141486a().getPassportDependency().mo133088g();
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: e */
            public String mo168874e() {
                return C36083a.m141486a().getPassportDependency().mo133085d();
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: c */
            public IMultitaskDependency.ActivityInfo mo168872c() {
                Application application = LarkContext.getApplication();
                AppLifecycle.ProcessRecord c = AppLifecycle.m200904a().mo177973c(application);
                Activity activity = null;
                if (c == null) {
                    return null;
                }
                if (C48282c.m190476a(application, c)) {
                    activity = C48337k.m190659a(c.f128809b);
                }
                return new IMultitaskDependency.ActivityInfo(c.f128809b, c.f128808a, activity);
            }

            @Override // com.ss.android.lark.multitask.IMultitaskDependency
            /* renamed from: a */
            public void mo168870a(final IMultitaskDependency.AppStateObserver bVar) {
                if (bVar != null) {
                    C482841 r0 = new AbstractC29586u() {
                        /* class com.ss.android.lark.multitask.C48282c.C482831.C482841 */

                        @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
                        public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                            if (aVar2 != null) {
                                bVar.mo168882a(aVar2.mo105885a(), aVar2.mo105887c());
                            }
                        }
                    };
                    AppLifecycle.m200904a().mo177967a(r0);
                    C48282c.f121578a.put(bVar, r0);
                }
            }
        };
    }

    /* renamed from: a */
    public static C48335j m190475a() {
        if (f121579b == null) {
            synchronized (C48282c.class) {
                if (f121579b == null) {
                    f121579b = new C48335j(m190477b());
                }
            }
        }
        return f121579b;
    }

    /* renamed from: a */
    public static boolean m190476a(Context context, AppLifecycle.ProcessRecord processRecord) {
        if (Objects.equals(processRecord.f128808a, "main") == C26252ad.m94993b(context)) {
            return true;
        }
        return false;
    }
}
