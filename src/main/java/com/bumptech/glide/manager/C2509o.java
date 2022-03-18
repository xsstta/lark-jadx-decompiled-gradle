package com.bumptech.glide.manager;

import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.util.C2568k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.o */
public final class C2509o implements AbstractC2500i {

    /* renamed from: a */
    private final Set<AbstractC2522j<?>> f8141a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public List<AbstractC2522j<?>> mo11097a() {
        return C2568k.m10908a(this.f8141a);
    }

    /* renamed from: b */
    public void mo11099b() {
        this.f8141a.clear();
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: f */
    public void mo10427f() {
        for (AbstractC2522j jVar : C2568k.m10908a(this.f8141a)) {
            jVar.mo10427f();
        }
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: g */
    public void mo10428g() {
        for (AbstractC2522j jVar : C2568k.m10908a(this.f8141a)) {
            jVar.mo10428g();
        }
    }

    @Override // com.bumptech.glide.manager.AbstractC2500i
    /* renamed from: h */
    public void mo10429h() {
        for (AbstractC2522j jVar : C2568k.m10908a(this.f8141a)) {
            jVar.mo10429h();
        }
    }

    /* renamed from: a */
    public void mo11098a(AbstractC2522j<?> jVar) {
        this.f8141a.add(jVar);
    }

    /* renamed from: b */
    public void mo11100b(AbstractC2522j<?> jVar) {
        this.f8141a.remove(jVar);
    }
}
