package com.google.android.play.core.splitinstall;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.d */
public final class RunnableC22705d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SplitInstallSessionState f56192a;

    /* renamed from: b */
    final /* synthetic */ int f56193b;

    /* renamed from: c */
    final /* synthetic */ int f56194c;

    /* renamed from: d */
    final /* synthetic */ C22706e f56195d;

    RunnableC22705d(C22706e eVar, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.f56195d = eVar;
        this.f56192a = splitInstallSessionState;
        this.f56193b = i;
        this.f56194c = i2;
    }

    public final void run() {
        C22706e eVar = this.f56195d;
        SplitInstallSessionState splitInstallSessionState = this.f56192a;
        eVar.mo78657a(new C22703b(splitInstallSessionState.sessionId(), this.f56193b, this.f56194c, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.mo79023a(), splitInstallSessionState.mo79024b(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.mo79026c()));
    }
}
