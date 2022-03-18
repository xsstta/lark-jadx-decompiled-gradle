package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.d */
public final /* synthetic */ class C22826d implements Continuation {

    /* renamed from: a */
    private final Context f56441a;

    /* renamed from: b */
    private final Intent f56442b;

    C22826d(Context context, Intent intent) {
        this.f56441a = context;
        this.f56442b = intent;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return C22824b.m82939a(this.f56441a, this.f56442b, task);
    }
}
