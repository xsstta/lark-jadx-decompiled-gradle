package com.ss.android.lark.p1382b.p1384b;

import android.app.Activity;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.p1382b.p1384b.AbstractC29417b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.lark.b.b.a */
public class C29415a implements AbstractC29417b {

    /* renamed from: a */
    private boolean f73530a;

    /* renamed from: b */
    private boolean f73531b;

    /* renamed from: c */
    private Activity f73532c;

    /* renamed from: d */
    private WeakReference<Activity> f73533d;

    /* renamed from: e */
    private List<AbstractC29417b.AbstractC29418a> f73534e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private List<IGetDataCallback<Activity>> f73535f = new CopyOnWriteArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.b.b.a$a */
    public static final class C29416a {

        /* renamed from: a */
        public static final C29415a f73536a = new C29415a();
    }

    /* renamed from: a */
    public static C29415a m108299a() {
        return C29416a.f73536a;
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: b */
    public boolean mo104288b() {
        return this.f73531b;
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: c */
    public Activity mo104289c() {
        return this.f73532c;
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: d */
    public Activity mo104290d() {
        WeakReference<Activity> weakReference = this.f73533d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: e */
    public void mo104291e() {
        for (AbstractC29417b.AbstractC29418a aVar : this.f73534e) {
            if (aVar instanceof AbstractC29417b.AbstractC29419b) {
                ((AbstractC29417b.AbstractC29419b) aVar).mo104292a();
            }
        }
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: a */
    public void mo104285a(boolean z) {
        this.f73530a = z;
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: a */
    public void mo104282a(Activity activity) {
        this.f73532c = activity;
        if (activity != null) {
            this.f73533d = new WeakReference<>(activity);
            m108300b(activity);
        }
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: b */
    public void mo104286b(AbstractC29417b.AbstractC29418a aVar) {
        if (this.f73534e.contains(aVar)) {
            this.f73534e.remove(aVar);
        }
    }

    /* renamed from: b */
    private void m108300b(Activity activity) {
        for (IGetDataCallback<Activity> iGetDataCallback : this.f73535f) {
            iGetDataCallback.onSuccess(activity);
            this.f73535f.remove(iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: a */
    public void mo104283a(IGetDataCallback<Activity> iGetDataCallback) {
        if (iGetDataCallback != null) {
            WeakReference<Activity> weakReference = this.f73533d;
            if (weakReference == null || weakReference.get() == null) {
                this.f73535f.add(iGetDataCallback);
            } else {
                iGetDataCallback.onSuccess(this.f73533d.get());
            }
        }
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: a */
    public void mo104284a(AbstractC29417b.AbstractC29418a aVar) {
        if (!this.f73534e.contains(aVar)) {
            this.f73534e.add(aVar);
        }
    }

    @Override // com.ss.android.lark.p1382b.p1384b.AbstractC29417b
    /* renamed from: b */
    public void mo104287b(boolean z) {
        if (this.f73531b != z) {
            for (AbstractC29417b.AbstractC29418a aVar : this.f73534e) {
                aVar.OnAppStateChanged(z);
            }
        }
        this.f73531b = z;
    }
}
