package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.ab */
final /* synthetic */ class C22694ab implements ao {

    /* renamed from: a */
    private final SplitInstallStateUpdatedListener f56154a;

    C22694ab(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56154a = splitInstallStateUpdatedListener;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        splitInstallManager.registerListener(this.f56154a);
        return C22731c.m82678a((Object) null);
    }
}
