package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.ai */
final /* synthetic */ class C22818ai implements Continuation {

    /* renamed from: a */
    private final C22815ag f56397a;

    /* renamed from: b */
    private final Bundle f56398b;

    C22818ai(C22815ag agVar, Bundle bundle) {
        this.f56397a = agVar;
        this.f56398b = bundle;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return this.f56397a.mo79316a(this.f56398b, task);
    }
}
