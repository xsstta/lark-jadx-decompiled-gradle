package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.C22812ae;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.m */
public final /* synthetic */ class C22835m implements C22812ae.AbstractC22813a {

    /* renamed from: a */
    private final FirebaseInstanceId f56453a;

    /* renamed from: b */
    private final String f56454b;

    /* renamed from: c */
    private final String f56455c;

    /* renamed from: d */
    private final String f56456d;

    C22835m(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f56453a = firebaseInstanceId;
        this.f56454b = str;
        this.f56455c = str2;
        this.f56456d = str3;
    }

    @Override // com.google.firebase.iid.C22812ae.AbstractC22813a
    /* renamed from: a */
    public final Task mo79314a() {
        return this.f56453a.lambda$getInstanceId$2$FirebaseInstanceId(this.f56454b, this.f56455c, this.f56456d);
    }
}
