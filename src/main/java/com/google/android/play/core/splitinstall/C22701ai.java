package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;

/* renamed from: com.google.android.play.core.splitinstall.ai */
final /* synthetic */ class C22701ai implements ao {

    /* renamed from: a */
    private final int f56163a;

    C22701ai(int i) {
        this.f56163a = i;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.getSessionState(this.f56163a);
    }
}
