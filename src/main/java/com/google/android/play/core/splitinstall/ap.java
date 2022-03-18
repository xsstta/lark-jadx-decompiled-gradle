package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import com.google.android.play.core.common.AbstractC22617a;
import com.google.android.play.core.splitcompat.C22679r;
import com.google.android.play.core.splitinstall.p994a.C22682a;
import com.google.android.play.core.splitinstall.p994a.C22683b;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class ap implements SplitInstallManager {

    /* renamed from: a */
    private final Executor f56169a;

    /* renamed from: b */
    private final Context f56170b;

    /* renamed from: c */
    private volatile SplitInstallManager f56171c;

    /* renamed from: d */
    private final C22710i f56172d;

    private ap(Context context, Executor executor, C22710i iVar, byte[] bArr) {
        this.f56170b = az.m82612a(context);
        this.f56169a = executor;
        this.f56172d = iVar;
    }

    /* renamed from: a */
    static ap m82589a(Context context, Executor executor) {
        return new ap(context, executor, new C22710i(null), null);
    }

    /* renamed from: a */
    private final <T> Task<T> m82590a(ao<T> aoVar) {
        SplitInstallManager splitInstallManager = this.f56171c;
        if (splitInstallManager != null) {
            return aoVar.mo79043a(splitInstallManager);
        }
        C22741m mVar = new C22741m();
        C22741m mVar2 = new C22741m();
        mVar2.mo79088a().addOnCompleteListener(new C22695ac(aoVar, mVar));
        this.f56169a.execute(new RunnableC22696ad(this, mVar2));
        return mVar.mo79088a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized SplitInstallManager mo79046a() {
        SplitInstallManager splitInstallManager = this.f56171c;
        if (splitInstallManager != null) {
            return splitInstallManager;
        }
        Context context = this.f56170b;
        File a = C22683b.m82568a(context);
        SplitInstallManager aVar = a != null ? new C22682a(context, a, C22679r.m82538a()) : new C22709h(new C22721s(context), context);
        this.f56171c = aVar;
        return aVar;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(int i) {
        return m82590a(new C22700ah(i));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return m82590a(new al(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return m82590a(new am(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return m82590a(new an(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return m82590a(new ak(list));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        return mo79046a().getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return mo79046a().getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i) {
        return m82590a(new C22701ai(i));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        return m82590a(aj.f56164a);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m82590a(new C22694ab(splitInstallStateUpdatedListener));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return mo79046a().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, AbstractC22617a aVar, int i) throws IntentSender.SendIntentException {
        return mo79046a().startConfirmationDialogForResult(splitInstallSessionState, aVar, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Integer> startInstall(SplitInstallRequest splitInstallRequest) {
        return m82590a(new C22699ag(splitInstallRequest));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        m82590a(new C22698af(splitInstallStateUpdatedListener));
    }
}
