package com.ss.android.lark.inv.export.mvp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.inv.export.mvp.InvBaseView;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

public class InvBaseView<V extends InvBaseView<V>> implements LifecycleObserver {

    /* renamed from: a */
    private FragmentActivity f101879a;

    /* renamed from: b */
    private Fragment f101880b;

    /* renamed from: c */
    private Lifecycle f101881c;

    /* renamed from: d */
    private Map<Class<?>, AbstractC40090b<V>> f101882d = new HashMap();

    /* renamed from: a */
    public <T extends FragmentActivity> T mo145593a() {
        T t = (T) this.f101879a;
        if (t == null) {
            return null;
        }
        return t;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.m165389i("UtilsMVP", "destroy view: " + getClass().getSimpleName());
        m158929b(this);
        for (AbstractC40090b<V> bVar : this.f101882d.values()) {
            if (bVar != null) {
                bVar.mo145601c();
            }
        }
    }

    /* renamed from: a */
    private void m158928a(LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle = this.f101881c;
        if (lifecycle == null) {
            Log.m165397w("UtilsMVP", "addLifecycle: mLifecycle is null");
        } else {
            lifecycle.addObserver(lifecycleObserver);
        }
    }

    /* renamed from: b */
    private void m158929b(LifecycleObserver lifecycleObserver) {
        Lifecycle lifecycle = this.f101881c;
        if (lifecycle == null) {
            Log.m165397w("UtilsMVP", "removeLifecycle: mLifecycle is null");
        } else {
            lifecycle.removeObserver(lifecycleObserver);
        }
    }

    public InvBaseView(Fragment fragment) {
        this.f101880b = fragment;
        this.f101879a = fragment.getActivity();
        this.f101881c = this.f101880b.getLifecycle();
        m158928a(this);
    }

    /* renamed from: a */
    public V mo145594a(AbstractC40090b<V> bVar) {
        if (bVar == null) {
            return this;
        }
        this.f101882d.put(bVar.getClass(), bVar);
        bVar.mo145599a(this);
        return this;
    }

    /* renamed from: a */
    public <P extends AbstractC40090b<V>> P mo145595a(Class<P> cls) {
        if (cls != null) {
            AbstractC40090b<V> bVar = this.f101882d.get(cls);
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException("presenter of <" + cls.getSimpleName() + "> is not added!");
        }
        throw new IllegalArgumentException("presenterClass is null!");
    }
}
