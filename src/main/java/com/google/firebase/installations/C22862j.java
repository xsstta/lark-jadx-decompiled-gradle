package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.AbstractC22870c;

/* renamed from: com.google.firebase.installations.j */
class C22862j implements AbstractC22872m {

    /* renamed from: a */
    private final C22873n f56512a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC22863k> f56513b;

    @Override // com.google.firebase.installations.AbstractC22872m
    /* renamed from: a */
    public boolean mo79392a(AbstractC22870c cVar) {
        if (!cVar.mo79422i() || this.f56512a.mo79430a(cVar)) {
            return false;
        }
        this.f56513b.setResult(AbstractC22863k.m83008d().mo79376a(cVar.mo79399c()).mo79375a(cVar.mo79401e()).mo79378b(cVar.mo79403f()).mo79377a());
        return true;
    }

    public C22862j(C22873n nVar, TaskCompletionSource<AbstractC22863k> taskCompletionSource) {
        this.f56512a = nVar;
        this.f56513b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.AbstractC22872m
    /* renamed from: a */
    public boolean mo79393a(AbstractC22870c cVar, Exception exc) {
        if (!cVar.mo79423j() && !cVar.mo79425l() && !cVar.mo79424k()) {
            return false;
        }
        this.f56513b.trySetException(exc);
        return true;
    }
}
