package com.google.android.play.core.internal;

import com.google.android.play.core.p993a.AbstractC22564a;
import java.util.HashSet;
import java.util.Set;

public final class ci<StateT> {

    /* renamed from: a */
    protected final Set<AbstractC22564a<StateT>> f56057a = new HashSet();

    /* renamed from: a */
    public final synchronized void mo78938a(AbstractC22564a<StateT> aVar) {
        this.f56057a.add(aVar);
    }

    /* renamed from: a */
    public final synchronized void mo78939a(StateT statet) {
        for (AbstractC22564a<StateT> aVar : this.f56057a) {
            aVar.mo68366a(statet);
        }
    }

    /* renamed from: b */
    public final synchronized void mo78940b(AbstractC22564a<StateT> aVar) {
        this.f56057a.remove(aVar);
    }
}
