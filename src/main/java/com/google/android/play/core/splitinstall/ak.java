package com.google.android.play.core.splitinstall;

import com.google.android.play.core.tasks.Task;
import java.util.List;

final /* synthetic */ class ak implements ao {

    /* renamed from: a */
    private final List f56165a;

    ak(List list) {
        this.f56165a = list;
    }

    @Override // com.google.android.play.core.splitinstall.ao
    /* renamed from: a */
    public final Task mo79043a(SplitInstallManager splitInstallManager) {
        return splitInstallManager.deferredUninstall(this.f56165a);
    }
}
