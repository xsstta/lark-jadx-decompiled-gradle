package com.bytedance.apm6.foundation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p191d.AbstractC3340c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.bytedance.apm6.foundation.a */
public class C3317a implements Application.ActivityLifecycleCallbacks, AbstractC3338a {

    /* renamed from: a */
    private final ArrayList<AbstractC3340c> f10581a = new ArrayList<>();

    /* renamed from: b */
    private WeakReference<Activity> f10582b;

    /* renamed from: c */
    private String f10583c = null;

    /* renamed from: d */
    private boolean f10584d;

    /* renamed from: e */
    private int f10585e;

    /* renamed from: f */
    private volatile boolean f10586f;

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3338a
    /* renamed from: a */
    public boolean mo13548a() {
        return this.f10586f;
    }

    public C3317a() {
        Application w = C3318a.m13917w();
        w.unregisterActivityLifecycleCallbacks(this);
        w.registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: c */
    private Object[] m13812c() {
        Object[] objArr;
        synchronized (this.f10581a) {
            if (this.f10581a.size() > 0) {
                objArr = this.f10581a.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3338a
    /* renamed from: b */
    public String mo13549b() {
        WeakReference<Activity> weakReference = this.f10582b;
        String str = "";
        if (weakReference == null) {
            return str;
        }
        Activity activity = weakReference.get();
        if (activity == null || (str = this.f10583c) != null) {
            return str;
        }
        return activity.getClass().getCanonicalName();
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3338a
    /* renamed from: a */
    public void mo13547a(AbstractC3340c cVar) {
        if (cVar != null) {
            synchronized (this.f10581a) {
                this.f10581a.add(cVar);
            }
        }
    }

    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3338a
    /* renamed from: b */
    public void mo13550b(AbstractC3340c cVar) {
        if (cVar != null) {
            synchronized (this.f10581a) {
                this.f10581a.remove(cVar);
            }
        }
    }

    /* renamed from: a */
    private void m13810a(Activity activity) {
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onFront(activity);
        }
    }

    /* renamed from: b */
    private void m13811b(Activity activity) {
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onBackground(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onActivityPause(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.f10582b = new WeakReference<>(activity);
        this.f10583c = null;
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onActivityResume(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f10584d = true;
            return;
        }
        int i = this.f10585e - 1;
        this.f10585e = i;
        if (i == 0) {
            this.f10586f = false;
            m13811b(activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onActivityStarted(activity);
        }
        if (this.f10584d) {
            this.f10584d = false;
            return;
        }
        int i = this.f10585e + 1;
        this.f10585e = i;
        if (i == 1) {
            this.f10586f = true;
            m13810a(activity);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : m13812c()) {
            ((AbstractC3340c) obj).onActivityCreated(activity);
        }
    }
}
