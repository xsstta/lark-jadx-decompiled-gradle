package com.larksuite.framework.callback;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.larksuite.framework.callback.c */
public class C25969c extends C25967a {

    /* renamed from: a */
    HashSet<WeakReference<Runnable>> f64291a = new HashSet<>();

    /* renamed from: b */
    public void mo92349b() {
        Iterator<WeakReference<Runnable>> it = this.f64291a.iterator();
        while (it.hasNext()) {
            Runnable runnable = it.next().get();
            if (runnable != null) {
                super.mo92344a().removeCallbacks(runnable);
                it.remove();
            }
        }
    }

    public C25969c(Handler handler) {
        super(handler);
    }

    @Override // com.larksuite.framework.callback.C25967a
    /* renamed from: a */
    public void mo92345a(Runnable runnable) {
        this.f64291a.add(new WeakReference<>(runnable));
        super.mo92345a(runnable);
    }

    /* renamed from: b */
    public void mo92350b(Runnable runnable) {
        Iterator<WeakReference<Runnable>> it = this.f64291a.iterator();
        while (it.hasNext()) {
            if (runnable == it.next().get()) {
                it.remove();
            }
        }
        super.mo92344a().removeCallbacks(runnable);
    }

    @Override // com.larksuite.framework.callback.C25967a
    /* renamed from: a */
    public void mo92346a(Runnable runnable, long j) {
        this.f64291a.add(new WeakReference<>(runnable));
        super.mo92346a(runnable, j);
    }
}
