package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.n */
public final /* synthetic */ class C22836n implements SuccessContinuation {

    /* renamed from: a */
    private final FirebaseInstanceId f56457a;

    /* renamed from: b */
    private final String f56458b;

    /* renamed from: c */
    private final String f56459c;

    /* renamed from: d */
    private final String f56460d;

    C22836n(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f56457a = firebaseInstanceId;
        this.f56458b = str;
        this.f56459c = str2;
        this.f56460d = str3;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        return this.f56457a.lambda$getInstanceId$1$FirebaseInstanceId(this.f56458b, this.f56459c, this.f56460d, (String) obj);
    }
}
