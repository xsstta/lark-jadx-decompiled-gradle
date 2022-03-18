package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.j */
public final /* synthetic */ class C22832j implements Continuation {

    /* renamed from: a */
    private final FirebaseInstanceId f56448a;

    /* renamed from: b */
    private final String f56449b;

    /* renamed from: c */
    private final String f56450c;

    C22832j(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f56448a = firebaseInstanceId;
        this.f56449b = str;
        this.f56450c = str2;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f56448a.lambda$getInstanceId$3$FirebaseInstanceId(this.f56449b, this.f56450c, task);
    }
}
