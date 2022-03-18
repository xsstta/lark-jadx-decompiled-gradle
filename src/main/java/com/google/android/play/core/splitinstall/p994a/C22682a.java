package com.google.android.play.core.splitinstall.p994a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.AbstractC22617a;
import com.google.android.play.core.internal.C22627ah;
import com.google.android.play.core.internal.be;
import com.google.android.play.core.internal.ci;
import com.google.android.play.core.splitinstall.AbstractC22726x;
import com.google.android.play.core.splitinstall.C22693aa;
import com.google.android.play.core.splitinstall.EnumC22725w;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.bc;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.Task;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.a.a */
public class C22682a implements SplitInstallManager {

    /* renamed from: b */
    private static final long f56114b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private final Handler f56115a = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Context f56116c;

    /* renamed from: d */
    private final bc f56117d;

    /* renamed from: e */
    private final be f56118e;

    /* renamed from: f */
    private final ci<SplitInstallSessionState> f56119f;

    /* renamed from: g */
    private final Executor f56120g;

    /* renamed from: h */
    private final AbstractC22726x f56121h;

    /* renamed from: i */
    private final File f56122i;

    /* renamed from: j */
    private final AtomicReference<SplitInstallSessionState> f56123j = new AtomicReference<>();

    /* renamed from: k */
    private final Set<String> f56124k = Collections.synchronizedSet(new HashSet());

    /* renamed from: l */
    private final Set<String> f56125l = Collections.synchronizedSet(new HashSet());

    /* renamed from: m */
    private final AtomicBoolean f56126m = new AtomicBoolean(false);

    /* renamed from: n */
    private final C22684c f56127n;

    public C22682a(Context context, File file, Executor executor) {
        bc bcVar = new bc(context, context.getPackageName());
        be beVar = new be(context);
        C22684c cVar = new C22684c();
        this.f56127n = cVar;
        this.f56119f = new ci<>();
        this.f56116c = context;
        this.f56122i = file;
        this.f56117d = bcVar;
        this.f56118e = beVar;
        this.f56120g = executor;
        this.f56121h = EnumC22725w.f56241a;
    }

    /* renamed from: a */
    private final SplitInstallSessionState m82553a(AbstractC22692k kVar) {
        SplitInstallSessionState b = m82562b();
        SplitInstallSessionState a = kVar.mo79035a(b);
        if (!this.f56123j.compareAndSet(b, a)) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    private static String m82554a(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: a */
    private final void m82555a(SplitInstallSessionState splitInstallSessionState) {
        this.f56115a.post(new RunnableC22689h(this, splitInstallSessionState));
    }

    /* renamed from: a */
    static /* synthetic */ void m82556a(C22682a aVar, int i) {
        aVar.m82561a(6, i, null, null, null, null, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m82557a(C22682a aVar, int i, Long l) {
        aVar.m82561a(i, 0, l, null, null, null, null);
    }

    /* renamed from: a */
    static /* synthetic */ void m82558a(C22682a aVar, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            File file = (File) list.get(i);
            String a = C22627ah.m82257a(file);
            Uri fromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, aVar.f56116c.getContentResolver().getType(fromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", m82554a(a));
            intent.putExtra("split_id", a);
            arrayList.add(intent);
            arrayList2.add(m82554a(C22627ah.m82257a(file)));
        }
        SplitInstallSessionState b = aVar.m82562b();
        if (b != null) {
            aVar.f56120g.execute(new RunnableC22690i(aVar, b.totalBytesToDownload(), arrayList, arrayList2, list2));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m82560a(List<Intent> list, List<String> list2, List<String> list3, long j, boolean z) {
        this.f56121h.mo79066a().mo78863a(list, new C22691j(this, list2, list3, j, z, list));
    }

    /* renamed from: a */
    private final boolean m82561a(int i, int i2, Long l, Long l2, List<String> list, Integer num, List<String> list2) {
        SplitInstallSessionState a = m82553a(new C22685d(num, i, i2, l, l2, list, list2));
        if (a == null) {
            return false;
        }
        m82555a(a);
        return true;
    }

    /* renamed from: b */
    private final SplitInstallSessionState m82562b() {
        return this.f56123j.get();
    }

    /* renamed from: b */
    static /* synthetic */ void m82564b(C22682a aVar, List list, List list2, List list3, long j) {
        aVar.m82560a((List<Intent>) list, (List<String>) list2, (List<String>) list3, j, true);
    }

    /* renamed from: c */
    private final C22693aa m82565c() {
        C22693aa c = this.f56117d.mo79052c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> cancelInstall(int i) {
        try {
            SplitInstallSessionState a = m82553a(new C22688g(i));
            if (a != null) {
                m82555a(a);
            }
            return C22731c.m82678a((Object) null);
        } catch (SplitInstallException e) {
            return C22731c.m82677a((Exception) e);
        }
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredInstall(List<String> list) {
        return C22731c.m82677a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageInstall(List<Locale> list) {
        return C22731c.m82677a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredLanguageUninstall(List<Locale> list) {
        return C22731c.m82677a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<Void> deferredUninstall(List<String> list) {
        return C22731c.m82677a((Exception) new SplitInstallException(-5));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        return new HashSet(this.f56125l);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return new HashSet(this.f56124k);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<SplitInstallSessionState> getSessionState(int i) {
        SplitInstallSessionState b = m82562b();
        return (b == null || b.sessionId() != i) ? C22731c.m82677a((Exception) new SplitInstallException(-4)) : C22731c.m82678a(b);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task<List<SplitInstallSessionState>> getSessionStates() {
        SplitInstallSessionState b = m82562b();
        return C22731c.m82678a(b == null ? Collections.emptyList() : Collections.singletonList(b));
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56119f.mo78938a(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) throws IntentSender.SendIntentException {
        return false;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, AbstractC22617a aVar, int i) throws IntentSender.SendIntentException {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c9, code lost:
        if (r4.contains(r6) == false) goto L_0x01cb;
     */
    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.tasks.Task<java.lang.Integer> startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest r22) {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.p994a.C22682a.startInstall(com.google.android.play.core.splitinstall.SplitInstallRequest):com.google.android.play.core.tasks.Task");
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.f56119f.mo78940b(splitInstallStateUpdatedListener);
    }
}
