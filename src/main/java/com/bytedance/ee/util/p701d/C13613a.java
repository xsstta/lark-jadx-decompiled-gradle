package com.bytedance.ee.util.p701d;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.log.C13479a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.util.d.a */
public class C13613a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C13613a f35770a;

    /* renamed from: b */
    private AtomicInteger f35771b = new AtomicInteger(0);

    /* renamed from: c */
    private C1177w<Boolean> f35772c;

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

    /* renamed from: a */
    public LiveData<Boolean> mo50549a() {
        return this.f35772c;
    }

    /* renamed from: b */
    public static C13613a m55256b() {
        C13613a aVar = f35770a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("AppVisibleHepler is not initialised - invoke at least once with parameterised init/get");
    }

    /* renamed from: c */
    public boolean mo50550c() {
        if (this.f35771b.get() == 1) {
            return true;
        }
        return false;
    }

    public C13613a() {
        C1177w<Boolean> wVar = new C1177w<>();
        this.f35772c = wVar;
        wVar.mo5926a((Boolean) false);
    }

    /* renamed from: a */
    public static C13613a m55255a(Application application) {
        if (f35770a == null) {
            C13613a aVar = new C13613a();
            f35770a = aVar;
            application.registerActivityLifecycleCallbacks(aVar);
        }
        return f35770a;
    }

    public void onActivityStarted(Activity activity) {
        if (this.f35771b.incrementAndGet() == 1) {
            this.f35772c.mo5929b((Boolean) true);
            C13479a.m54772d("AppVisibleHelper", "onActivityStarted(): ");
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f35771b.decrementAndGet() == 0) {
            this.f35772c.mo5929b((Boolean) false);
            C13479a.m54772d("AppVisibleHelper", "onActivityStopped");
        }
    }
}
