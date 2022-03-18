package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;
import java.util.List;

final /* synthetic */ class an implements ao {

    /* renamed from: a */
    private final List f56168a;

    an(List list) {
        this.f56168a = list;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.deferredLanguageUninstall(this.f56168a);
    }
}
