package com.ss.android.socialbase.downloader.p3024a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.a.a */
public class C59986a {

    /* renamed from: a */
    public int f149566a;

    /* renamed from: b */
    private Application f149567b;

    /* renamed from: c */
    private final List<AbstractC59988a> f149568c;

    /* renamed from: d */
    private volatile int f149569d;

    /* renamed from: e */
    private final Application.ActivityLifecycleCallbacks f149570e;

    /* renamed from: com.ss.android.socialbase.downloader.a.a$a */
    public interface AbstractC59988a {
        /* renamed from: a */
        void mo204277a();

        /* renamed from: b */
        void mo204278b();
    }

    /* renamed from: com.ss.android.socialbase.downloader.a.a$b */
    private static class C59989b {

        /* renamed from: a */
        public static final C59986a f149572a = new C59986a();
    }

    /* renamed from: a */
    public static C59986a m232821a() {
        return C59989b.f149572a;
    }

    /* renamed from: b */
    public boolean mo204267b() {
        int i = this.f149569d;
        if (i == -1) {
            m232823f();
            i = this.f149569d;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    private C59986a() {
        this.f149568c = new ArrayList();
        this.f149569d = -1;
        this.f149570e = new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.socialbase.downloader.p3024a.C59986a.C599871 */

            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public void onActivityDestroyed(Activity activity) {
            }

            public void onActivityPaused(Activity activity) {
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityResumed(Activity activity) {
                int i;
                int i2 = C59986a.this.f149566a;
                C59986a aVar = C59986a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f149566a = i;
                if (i2 == 0) {
                    C59986a.this.mo204268c();
                }
            }

            public void onActivityStarted(Activity activity) {
                int i;
                int i2 = C59986a.this.f149566a;
                C59986a aVar = C59986a.this;
                if (activity != null) {
                    i = activity.hashCode();
                } else {
                    i = i2;
                }
                aVar.f149566a = i;
                if (i2 == 0) {
                    C59986a.this.mo204268c();
                }
            }

            public void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == C59986a.this.f149566a) {
                    C59986a.this.f149566a = 0;
                    C59986a.this.mo204269d();
                }
            }
        };
    }

    /* renamed from: e */
    private Object[] m232822e() {
        Object[] objArr;
        synchronized (this.f149568c) {
            if (this.f149568c.size() > 0) {
                objArr = this.f149568c.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    /* renamed from: f */
    private void m232823f() {
        Activity g = m232824g();
        if (this.f149569d != -1) {
            return;
        }
        if (g != null) {
            this.f149566a = g.hashCode();
            this.f149569d = 1;
            return;
        }
        this.f149569d = 0;
    }

    /* renamed from: c */
    public void mo204268c() {
        C59990a.m232839c("AppStatusManager", "dispatchAppForeground");
        this.f149569d = 1;
        Object[] e = m232822e();
        if (e != null) {
            for (Object obj : e) {
                ((AbstractC59988a) obj).mo204277a();
            }
        }
    }

    /* renamed from: d */
    public void mo204269d() {
        C59990a.m232839c("AppStatusManager", "dispatchAppBackground");
        this.f149569d = 0;
        Object[] e = m232822e();
        if (e != null) {
            for (Object obj : e) {
                ((AbstractC59988a) obj).mo204278b();
            }
        }
    }

    /* renamed from: g */
    private Activity m232824g() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            Map map = (Map) declaredField.get(invoke);
            if (map != null) {
                if (map.size() != 0) {
                    Class<?> cls2 = null;
                    Field field = null;
                    for (Object obj : map.values()) {
                        if (cls2 == null) {
                            cls2 = obj.getClass();
                        }
                        if (field == null) {
                            field = cls2.getDeclaredField("paused");
                        }
                        field.setAccessible(true);
                        if (!field.getBoolean(obj)) {
                            Field declaredField2 = cls2.getDeclaredField("activity");
                            declaredField2.setAccessible(true);
                            return (Activity) declaredField2.get(obj);
                        }
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo204265a(Context context) {
        if (this.f149567b == null && (context instanceof Application)) {
            synchronized (this) {
                if (this.f149567b == null) {
                    Application application = (Application) context;
                    this.f149567b = application;
                    application.registerActivityLifecycleCallbacks(this.f149570e);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo204266a(AbstractC59988a aVar) {
        if (aVar != null) {
            synchronized (this.f149568c) {
                if (!this.f149568c.contains(aVar)) {
                    this.f149568c.add(aVar);
                }
            }
        }
    }
}
