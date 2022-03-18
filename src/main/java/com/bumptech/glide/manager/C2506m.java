package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.request.AbstractC2533d;
import com.bumptech.glide.util.C2568k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.m */
public class C2506m {

    /* renamed from: a */
    private final Set<AbstractC2533d> f8131a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<AbstractC2533d> f8132b = new ArrayList();

    /* renamed from: c */
    private boolean f8133c;

    /* renamed from: a */
    public boolean mo11082a() {
        return this.f8133c;
    }

    /* renamed from: e */
    public void mo11087e() {
        for (AbstractC2533d dVar : C2568k.m10908a(this.f8131a)) {
            mo11084b(dVar);
        }
        this.f8132b.clear();
    }

    /* renamed from: b */
    public void mo11083b() {
        this.f8133c = true;
        for (AbstractC2533d dVar : C2568k.m10908a(this.f8131a)) {
            if (dVar.mo11199d()) {
                dVar.mo11198c();
                this.f8132b.add(dVar);
            }
        }
    }

    /* renamed from: c */
    public void mo11085c() {
        this.f8133c = true;
        for (AbstractC2533d dVar : C2568k.m10908a(this.f8131a)) {
            if (dVar.mo11199d() || dVar.mo11200e()) {
                dVar.mo11197b();
                this.f8132b.add(dVar);
            }
        }
    }

    /* renamed from: d */
    public void mo11086d() {
        this.f8133c = false;
        for (AbstractC2533d dVar : C2568k.m10908a(this.f8131a)) {
            if (!dVar.mo11200e() && !dVar.mo11199d()) {
                dVar.mo11194a();
            }
        }
        this.f8132b.clear();
    }

    /* renamed from: f */
    public void mo11088f() {
        for (AbstractC2533d dVar : C2568k.m10908a(this.f8131a)) {
            if (!dVar.mo11200e() && !dVar.mo11201f()) {
                dVar.mo11197b();
                if (!this.f8133c) {
                    dVar.mo11194a();
                } else {
                    this.f8132b.add(dVar);
                }
            }
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f8131a.size() + ", isPaused=" + this.f8133c + "}";
    }

    /* renamed from: b */
    public boolean mo11084b(AbstractC2533d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f8131a.remove(dVar);
        if (!this.f8132b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.mo11197b();
        }
        return z;
    }

    /* renamed from: a */
    public void mo11081a(AbstractC2533d dVar) {
        this.f8131a.add(dVar);
        if (!this.f8133c) {
            dVar.mo11194a();
            return;
        }
        dVar.mo11197b();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f8132b.add(dVar);
    }
}
