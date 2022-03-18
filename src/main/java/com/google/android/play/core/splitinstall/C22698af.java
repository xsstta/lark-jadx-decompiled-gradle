package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.af */
final /* synthetic */ class C22698af implements ao {

    /* renamed from: a */
    private final SplitInstallStateUpdatedListener f56160a;

    C22698af(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56160a = splitInstallStateUpdatedListener;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        splitInstallManager.unregisterListener(this.f56160a);
        return C22731c.m82678a((Object) null);
    }
}
