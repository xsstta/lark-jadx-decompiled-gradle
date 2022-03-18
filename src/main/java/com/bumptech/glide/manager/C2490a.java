package com.bumptech.glide.manager;

import com.bumptech.glide.util.C2568k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.manager.a */
public class C2490a implements AbstractC2499h {

    /* renamed from: a */
    private final Set<AbstractC2500i> f8113a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f8114b;

    /* renamed from: c */
    private boolean f8115c;

    C2490a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11064a() {
        this.f8114b = true;
        for (AbstractC2500i iVar : C2568k.m10908a(this.f8113a)) {
            iVar.mo10427f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11066b() {
        this.f8114b = false;
        for (AbstractC2500i iVar : C2568k.m10908a(this.f8113a)) {
            iVar.mo10428g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11068c() {
        this.f8115c = true;
        for (AbstractC2500i iVar : C2568k.m10908a(this.f8113a)) {
            iVar.mo10429h();
        }
    }

    @Override // com.bumptech.glide.manager.AbstractC2499h
    /* renamed from: b */
    public void mo11067b(AbstractC2500i iVar) {
        this.f8113a.remove(iVar);
    }

    @Override // com.bumptech.glide.manager.AbstractC2499h
    /* renamed from: a */
    public void mo11065a(AbstractC2500i iVar) {
        this.f8113a.add(iVar);
        if (this.f8115c) {
            iVar.mo10429h();
        } else if (this.f8114b) {
            iVar.mo10427f();
        } else {
            iVar.mo10428g();
        }
    }
}
