package com.larksuite.framework.callback;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class LifecycleCallbackManager implements LifecycleObserver {

    /* renamed from: a */
    private C25970d f64281a;

    private LifecycleCallbackManager() {
    }

    /* renamed from: a */
    public <Data> IGetDataCallback<Data> mo92338a(IGetDataCallback<Data> iGetDataCallback) {
        C25970d dVar = new C25970d(iGetDataCallback);
        this.f64281a = dVar;
        return dVar;
    }

    /* renamed from: a */
    public static LifecycleCallbackManager m94004a(LifecycleOwner lifecycleOwner) {
        LifecycleCallbackManager lifecycleCallbackManager = new LifecycleCallbackManager();
        lifecycleOwner.getLifecycle().addObserver(lifecycleCallbackManager);
        return lifecycleCallbackManager;
    }

    /* renamed from: a */
    public static LifecycleCallbackManager m94003a(Context context) {
        if (context instanceof LifecycleOwner) {
            return m94004a((LifecycleOwner) context);
        }
        return new LifecycleCallbackManager();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        C25970d dVar = this.f64281a;
        if (dVar != null) {
            dVar.cancel();
            this.f64281a = null;
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }
}
