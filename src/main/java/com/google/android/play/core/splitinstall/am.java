package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;
import java.util.List;

final /* synthetic */ class am implements ao {

    /* renamed from: a */
    private final List f56167a;

    am(List list) {
        this.f56167a = list;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.deferredLanguageInstall(this.f56167a);
    }
}
