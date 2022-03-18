package com.google.android.play.core.splitinstall.p994a;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.splitinstall.a.f */
final class C22687f implements AbstractC22692k {

    /* renamed from: a */
    final /* synthetic */ SplitInstallRequest f56138a;

    C22687f(SplitInstallRequest splitInstallRequest) {
        this.f56138a = splitInstallRequest;
    }

    @Override // com.google.android.play.core.splitinstall.p994a.AbstractC22692k
    /* renamed from: a */
    public final SplitInstallSessionState mo79035a(SplitInstallSessionState splitInstallSessionState) {
        if (splitInstallSessionState == null || splitInstallSessionState.hasTerminalStatus()) {
            return SplitInstallSessionState.create(splitInstallSessionState != null ? 1 + splitInstallSessionState.sessionId() : 1, 1, 0, 0, 0, this.f56138a.getModuleNames(), new ArrayList());
        }
        throw new SplitInstallException(-1);
    }
}
