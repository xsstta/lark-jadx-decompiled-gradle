package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.AbstractC22617a;
import com.google.android.play.core.p993a.AbstractC22564a;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.h */
public final class C22709h implements SplitInstallManager {

    /* renamed from: a */
    private final C22721s f56202a;

    /* renamed from: b */
    private final C22706e f56203b;

    /* renamed from: c */
    private final bc f56204c;

    /* renamed from: d */
    private final C22723u f56205d;

    /* renamed from: e */
    private final Handler f56206e = new Handler(Looper.getMainLooper());

    C22709h(C22721s sVar, Context context) {
        String packageName = context.getPackageName();
        this.f56204c = new bc(context, packageName);
        this.f56202a = sVar;
        this.f56203b = C22706e.m82631a(context);
        this.f56205d = new C22723u(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static List<String> m82637b(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (Build.VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(int i) {
        return this.f56202a.mo79059b(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return this.f56202a.mo79060b(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return Build.VERSION.SDK_INT < 21 ? C22731c.m82677a((Exception) new SplitInstallException(-5)) : this.f56202a.mo79061c(m82637b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return Build.VERSION.SDK_INT < 21 ? C22731c.m82677a((Exception) new SplitInstallException(-5)) : this.f56202a.mo79062d(m82637b(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        this.f56205d.mo79064a(list);
        return this.f56202a.mo79058a(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        Set<String> b = this.f56204c.mo79051b();
        return b == null ? Collections.emptySet() : b;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return this.f56204c.mo79050a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i) {
        return this.f56202a.mo79056a(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return this.f56202a.mo79055a();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56203b.mo78656a((AbstractC22564a) splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return startConfirmationDialogForResult(splitInstallSessionState, new C22708g(activity), i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, AbstractC22617a aVar, int i) throws IntentSender.SendIntentException {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        aVar.mo78853a(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r2.containsAll(r3) != false) goto L_0x004b;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r6) {
        /*
        // Method dump skipped, instructions count: 150
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.C22709h.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.play.core.tasks.Task");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final synchronized void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56203b.mo78660b(splitInstallStateUpdatedListener);
    }
}
