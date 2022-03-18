package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.f */
final class RunnableC22707f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallRequest f56199a;

    /* renamed from: b */
    final /* synthetic */ C22709h f56200b;

    RunnableC22707f(C22709h hVar, SplitInstallRequest splitInstallRequest) {
        this.f56200b = hVar;
        this.f56199a = splitInstallRequest;
    }

    public final void run() {
        C22706e eVar = this.f56200b.f56203b;
        List<String> moduleNames = this.f56199a.getModuleNames();
        List list = C22709h.m82637b(this.f56199a.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt(UpdateKey.STATUS, 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(moduleNames));
        }
        if (!list.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(list));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        eVar.mo78657a(SplitInstallSessionState.m82545a(bundle));
    }
}
