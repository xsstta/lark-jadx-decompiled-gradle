package com.bytedance.ee.bear.basesdk.apisupport;

import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.AbstractC4482e;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.integrator.DynamicModuleLoader;
import com.bytedance.ee.bear.task.DocsBaseTask;
import com.bytedance.ee.bear.task.DocsCentralTask;
import com.bytedance.ee.bear.task.DocsOnBoardingTask;
import com.bytedance.ee.bear.task.DocsProcessPriorityTask;
import com.bytedance.ee.bear.task.DocsReactionTask;
import com.bytedance.ee.bear.task.DocsRustInitTask;
import com.bytedance.ee.bear.task.DocsUserInfoTask;
import com.bytedance.ee.bear.task.DomainCharacteristicFetchTask;
import com.bytedance.ee.bear.task.EditorTask;
import com.bytedance.ee.bear.task.InitAuditTask;
import com.bytedance.ee.bear.task.ReportLaunchTask;
import com.bytedance.ee.bear.task.SensitiveLogCheckTask;
import com.bytedance.ee.bear.task.SnapBoostTask;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.common.C13608f;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p701d.C13629i;
import com.larksuite.framework.launch.scheduler.AbstractC26021b;
import com.larksuite.framework.launch.scheduler.AbstractC26023d;
import com.larksuite.framework.launch.scheduler.C26024e;
import com.larksuite.framework.launch.scheduler.C26026f;
import com.larksuite.framework.launch.scheduler.p1192a.C26018a;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apisupport.x */
public class C4438x implements AbstractC4431q {

    /* renamed from: a */
    private static AbstractC4429o f13087a;

    /* renamed from: b */
    private static AbstractC4430p f13088b;

    /* renamed from: f */
    private static final AtomicBoolean f13089f = new AtomicBoolean(false);

    /* renamed from: h */
    private static List<AbstractC4482e> f13090h = new CopyOnWriteArrayList();

    /* renamed from: c */
    private C26024e f13091c;

    /* renamed from: d */
    private ReportLaunchTask f13092d;

    /* renamed from: e */
    private Map<String, String> f13093e = new ConcurrentHashMap();

    /* renamed from: g */
    private final ReentrantLock f13094g = new ReentrantLock();

    /* renamed from: c */
    public static AbstractC4430p m18351c() {
        return f13088b;
    }

    /* renamed from: d */
    public static boolean m18352d() {
        return m18354f();
    }

    /* renamed from: f */
    private static boolean m18354f() {
        return f13089f.get();
    }

    /* renamed from: h */
    private void m18356h() {
        C13479a.m54764b("SdkInitChecker", "dispatchDocInit");
        C13608f.m55249a($$Lambda$x$MXW1hirLeQzfKL8IAw5adOEwR3o.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4431q
    /* renamed from: b */
    public boolean mo17159b() {
        return m18352d();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m18357i() {
        for (AbstractC4482e eVar : f13090h) {
            try {
                eVar.onInit();
            } catch (Exception e) {
                C13479a.m54759a("SdkInitChecker", "dispatchDocInit", e);
            }
        }
    }

    /* renamed from: e */
    public static AbstractC4429o m18353e() {
        if (f13087a == null) {
            try {
                Constructor<?> declaredConstructor = Class.forName("com.bytedance.ee.bear.basesdk.apisupport.AppSpacekitModuleImpl").getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                f13087a = (AbstractC4429o) declaredConstructor.newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("failed to find AppSpacekitModuleImpl, please check if an annotationProcessor compile dependency is included in your application  and a @SpacekitModule annotated AppSpacekitModule implementation", e);
            } catch (Exception e2) {
                throw new IllegalStateException("incorrect AppSpacekitModuleImpl, please check if the instance implements AppSpacekitModule and keep the default constructor.", e2);
            }
        }
        return f13087a;
    }

    /* renamed from: g */
    private void m18355g() {
        this.f13091c.mo92529a(new DocsCentralTask());
        this.f13091c.mo92530a();
        if (C13629i.m55302a()) {
            if (!C13595b.m55176a()) {
                this.f13091c.mo92529a(new DocsProcessPriorityTask());
            }
            this.f13091c.mo92529a(new DocsUserInfoTask()).mo92529a(new DomainCharacteristicFetchTask());
            List<ILaunchTask> d = f13088b.mo17157d();
            if (d != null) {
                for (ILaunchTask iLaunchTask : d) {
                    this.f13091c.mo92529a(iLaunchTask);
                }
            }
        } else if (C13629i.m55304b()) {
            this.f13091c.mo92529a(new DocsReactionTask());
        }
        if (C13629i.m55308c()) {
            this.f13091c.mo92529a(new EditorTask());
            if (C4211a.m17514a().mo16536a("spacekit.mobile.enable_snapboost", false)) {
                this.f13091c.mo92529a(new SnapBoostTask());
            }
        }
        this.f13091c.mo92529a(new SensitiveLogCheckTask());
        this.f13091c.mo92529a(new DocsRustInitTask()).mo92529a(new DocsOnBoardingTask()).mo92529a(new InitAuditTask());
        this.f13091c.mo92530a();
        this.f13091c.mo92529a(this.f13092d);
        try {
            for (ILaunchTask<?> iLaunchTask2 : ((DynamicModuleLoader) KoinJavaComponent.m268610a(DynamicModuleLoader.class)).mo30700b()) {
                this.f13091c.mo92529a(iLaunchTask2);
            }
            this.f13091c.mo92530a();
        } catch (Throwable th) {
            C13606d.m55245a("SdkInitChecker", th);
        }
    }

    @Override // com.bytedance.ee.bear.basesdk.apisupport.AbstractC4431q
    /* renamed from: a */
    public void mo17158a() {
        boolean z;
        if (!m18354f()) {
            try {
                this.f13094g.lock();
                if (m18354f()) {
                    this.f13094g.unlock();
                    return;
                }
                Trace.beginSection("init_space_sdk");
                C13479a.m54764b("SdkInitChecker", "Spacekit init start. ");
                long uptimeMillis = SystemClock.uptimeMillis();
                C4511g.m18588a(uptimeMillis);
                m18355g();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                C13479a.m54764b("SdkInitChecker", "Spacekit init complete. costTime: " + uptimeMillis2);
                this.f13093e.put("SdkInitChecker", String.valueOf(uptimeMillis2));
                Map<String, String> map = this.f13093e;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z = true;
                } else {
                    z = false;
                }
                map.put("is_main_thread", String.valueOf(z));
                m18356h();
                Trace.endSection();
                f13089f.compareAndSet(false, true);
                this.f13094g.unlock();
            } catch (Throwable th) {
                this.f13094g.unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public static void m18350b(AbstractC4482e eVar) {
        f13090h.remove(eVar);
    }

    /* renamed from: a */
    public static void m18348a(AbstractC4482e eVar) {
        if (!f13090h.contains(eVar)) {
            f13090h.add(eVar);
        }
    }

    public C4438x(AbstractC4430p pVar) {
        f13088b = pVar;
        C26026f a = new C26026f().mo92533a(m18353e().application()).mo92536a(true).mo92535a(new AbstractC26023d() {
            /* class com.bytedance.ee.bear.basesdk.apisupport.$$Lambda$x$heWjNB8W2wFIOnCE0ibSQt0eT2E */

            @Override // com.larksuite.framework.launch.scheduler.AbstractC26023d
            public final void onTaskFinish(Class cls, long j) {
                C4438x.this.m18349a(cls, j);
            }
        }).mo92534a(new C26018a.C26019a().mo92524a(CoreThreadPool.getDefault().getFixedThreadPool()).mo92525a());
        a.mo92537a(new AbstractC26021b() {
            /* class com.bytedance.ee.bear.basesdk.apisupport.C4438x.C44391 */

            @Override // com.larksuite.framework.launch.scheduler.AbstractC26021b
            /* renamed from: a */
            public void mo17163a(String str, String str2, Throwable th) {
                C13479a.m54759a(str, str2, th);
            }
        });
        C26024e a2 = a.mo92532a();
        this.f13091c = a2;
        a2.mo92529a(new DocsBaseTask());
        this.f13092d = new ReportLaunchTask(this.f13093e);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m18349a(Class cls, long j) {
        this.f13093e.put(cls.getSimpleName(), String.valueOf(j));
    }
}
