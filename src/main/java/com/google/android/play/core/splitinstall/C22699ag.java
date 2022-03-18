package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.ag */
final /* synthetic */ class C22699ag implements ao {

    /* renamed from: a */
    private final SplitInstallRequest f56161a;

    C22699ag(SplitInstallRequest splitInstallRequest) {
        this.f56161a = splitInstallRequest;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.startInstall(this.f56161a);
    }
}
