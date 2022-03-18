package com.google.android.play.core.splitinstall.p994a;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* renamed from: com.google.android.play.core.splitinstall.a.g */
final class C22688g implements AbstractC22692k {

    /* renamed from: a */
    final /* synthetic */ int f56139a;

    C22688g(int i) {
        this.f56139a = i;
    }

    @Override // com.google.android.play.core.splitinstall.p994a.AbstractC22692k
    /* renamed from: a */
    public final SplitInstallSessionState mo79035a(SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState != null && this.f56139a == splitInstallSessionState.sessionId() && splitInstallSessionState.status() == 1) {
            return SplitInstallSessionState.create(this.f56139a, 7, splitInstallSessionState.errorCode(), splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
        }
        throw new SplitInstallException(-3);
    }
}
