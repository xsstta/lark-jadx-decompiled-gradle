package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.af */
public final /* synthetic */ class C22814af implements Continuation {

    /* renamed from: a */
    private final C22812ae f56384a;

    /* renamed from: b */
    private final Pair f56385b;

    C22814af(C22812ae aeVar, Pair pair) {
        this.f56384a = aeVar;
        this.f56385b = pair;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f56384a.mo79312a(this.f56385b, task);
    }
}
