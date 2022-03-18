package com.bytedance.ee.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.util.a */
public class C13582a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C13582a f35709a;

    /* renamed from: b */
    private AtomicInteger f35710b = new AtomicInteger(0);

    /* renamed from: c */
    private C1177w<Boolean> f35711c;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C13582a() {
        C1177w<Boolean> wVar = new C1177w<>();
        this.f35711c = wVar;
        wVar.mo5926a((Boolean) false);
    }

    /* renamed from: a */
    public static C13582a m55112a(Application application) {
        if (f35709a == null) {
            C13582a aVar = new C13582a();
            f35709a = aVar;
            application.registerActivityLifecycleCallbacks(aVar);
        }
        return f35709a;
    }

    public void onActivityStarted(Activity activity) {
        if (this.f35710b.incrementAndGet() == 1) {
            this.f35711c.mo5929b((Boolean) true);
            C13479a.m54772d("AppVisibleHelper", "onActivityStarted(): ");
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f35710b.decrementAndGet() == 0) {
            this.f35711c.mo5929b((Boolean) false);
            C13479a.m54772d("AppVisibleHelper", "onActivityStopped");
        }
    }
}
