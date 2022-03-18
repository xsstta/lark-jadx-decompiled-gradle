package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.ah */
final /* synthetic */ class C22700ah implements ao {

    /* renamed from: a */
    private final int f56162a;

    C22700ah(int i) {
        this.f56162a = i;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.cancelInstall(this.f56162a);
    }
}
