package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.r */
public final /* synthetic */ class C22840r implements Continuation {

    /* renamed from: a */
    private final C22839q f56470a;

    C22840r(C22839q qVar) {
        this.f56470a = qVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f56470a.mo79358a(task);
    }
}
