package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.AbstractC22729a;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.ac */
public final /* synthetic */ class C22695ac implements AbstractC22729a {

    /* renamed from: a */
    private final ao f56155a;

    /* renamed from: b */
    private final C22741m f56156b;

    C22695ac(ao aoVar, C22741m mVar) {
        this.f56155a = aoVar;
        this.f56156b = mVar;
    }

    @Override // com.google.android.play.core.tasks.AbstractC22729a
    public final void onComplete(Task task) {
        ao aoVar = this.f56155a;
        C22741m mVar = this.f56156b;
        if (task.isSuccessful()) {
            aoVar.mo79043a((SplitInstallManager) task.getResult()).addOnCompleteListener(new C22697ae(mVar));
        } else {
            mVar.mo79089a(task.getException());
        }
    }
}
