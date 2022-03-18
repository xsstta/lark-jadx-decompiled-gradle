package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.AbstractC22729a;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.ae */
final /* synthetic */ class C22697ae implements AbstractC22729a {

    /* renamed from: a */
    private final C22741m f56159a;

    C22697ae(C22741m mVar) {
        this.f56159a = mVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC22729a
    public final void onComplete(Task task) {
        C22741m mVar = this.f56159a;
        if (task.isSuccessful()) {
            mVar.mo79090a(task.getResult());
        } else {
            mVar.mo79089a(task.getException());
        }
    }
}
