package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;
import java.util.List;

final /* synthetic */ class al implements ao {

    /* renamed from: a */
    private final List f56166a;

    al(List list) {
        this.f56166a = list;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.deferredInstall(this.f56166a);
    }
}
