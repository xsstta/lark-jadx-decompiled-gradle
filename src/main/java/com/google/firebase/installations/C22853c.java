package com.google.firebase.installations;

import android.text.TextUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseException;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.AbstractC22870c;
import com.google.firebase.installations.local.C22869b;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.C22882c;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.AbstractC22923g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.installations.c */
public class C22853c implements AbstractC22860h {

    /* renamed from: l */
    private static final Object f56489l = new Object();

    /* renamed from: m */
    private static final ThreadFactory f56490m = new ThreadFactory() {
        /* class com.google.firebase.installations.C22853c.ThreadFactoryC228541 */

        /* renamed from: a */
        private final AtomicInteger f56502a = new AtomicInteger(1);

        /* renamed from: a */
        public static Thread m82997a(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            return m82997a(new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f56502a.getAndIncrement()))));
        }
    };

    /* renamed from: a */
    private final FirebaseApp f56491a;

    /* renamed from: b */
    private final C22882c f56492b;

    /* renamed from: c */
    private final PersistedInstallation f56493c;

    /* renamed from: d */
    private final C22873n f56494d;

    /* renamed from: e */
    private final C22869b f56495e;

    /* renamed from: f */
    private final C22865l f56496f;

    /* renamed from: g */
    private final Object f56497g;

    /* renamed from: h */
    private final ExecutorService f56498h;

    /* renamed from: i */
    private final ExecutorService f56499i;

    /* renamed from: j */
    private String f56500j;

    /* renamed from: k */
    private final List<AbstractC22872m> f56501k;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo79381a() {
        return this.f56491a.getOptions().mo79144d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo79382b() {
        return this.f56491a.getOptions().mo79142b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo79383c() {
        return this.f56491a.getOptions().mo79141a();
    }

    @Override // com.google.firebase.installations.AbstractC22860h
    /* renamed from: e */
    public Task<Void> mo79385e() {
        return Tasks.call(this.f56498h, CallableC22857e.m82999a(this));
    }

    /* renamed from: h */
    private Task<AbstractC22863k> m82986h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C22862j jVar = new C22862j(this.f56494d, taskCompletionSource);
        synchronized (this.f56497g) {
            this.f56501k.add(jVar);
        }
        return taskCompletionSource.getTask();
    }

    /* renamed from: i */
    private String m82987i() {
        String str = this.f56500j;
        if (str != null) {
            return str;
        }
        AbstractC22870c j = m82988j();
        this.f56499i.execute(RunnableC22858f.m83000a(this));
        return j.mo79397a();
    }

    @Override // com.google.firebase.installations.AbstractC22860h
    /* renamed from: d */
    public Task<String> mo79384d() {
        m82985g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.trySetResult(m82987i());
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    private void m82985g() {
        Preconditions.checkNotEmpty(mo79382b());
        Preconditions.checkNotEmpty(mo79381a());
        Preconditions.checkNotEmpty(mo79383c());
        Preconditions.checkArgument(C22873n.m83077a(mo79382b()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(C22873n.m83078b(mo79383c()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: j */
    private AbstractC22870c m82988j() {
        AbstractC22870c a;
        synchronized (f56489l) {
            C22852b a2 = C22852b.m82972a(this.f56491a.getApplicationContext(), "generatefid.lock");
            try {
                a = this.f56493c.mo79395a();
                if (a.mo79425l()) {
                    a = this.f56493c.mo79396a(a.mo79418a(m82981c(a)));
                }
            } finally {
                if (a2 != null) {
                    a2.mo79379a();
                }
            }
        }
        return a;
    }

    /* renamed from: k */
    private AbstractC22870c m82989k() {
        AbstractC22870c a;
        synchronized (f56489l) {
            C22852b a2 = C22852b.m82972a(this.f56491a.getApplicationContext(), "generatefid.lock");
            try {
                a = this.f56493c.mo79395a();
            } finally {
                if (a2 != null) {
                    a2.mo79379a();
                }
            }
        }
        return a;
    }

    /* renamed from: f */
    public Void mo79386f() throws FirebaseInstallationsException, IOException {
        this.f56500j = null;
        AbstractC22870c k = m82989k();
        if (k.mo79422i()) {
            try {
                this.f56492b.mo79456a(mo79383c(), k.mo79397a(), mo79381a(), k.mo79400d());
            } catch (FirebaseException unused) {
                throw new FirebaseInstallationsException("Failed to delete a Firebase Installation.", FirebaseInstallationsException.Status.BAD_CONFIG);
            }
        }
        m82979b(k.mo79427n());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$2 */
    public static /* synthetic */ class C228552 {

        /* renamed from: a */
        static final /* synthetic */ int[] f56503a;

        /* renamed from: b */
        static final /* synthetic */ int[] f56504b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.remote.TokenResult$ResponseCode[] r0 = com.google.firebase.installations.remote.TokenResult.ResponseCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.firebase.installations.C22853c.C228552.f56504b = r0
                r1 = 1
                com.google.firebase.installations.remote.TokenResult$ResponseCode r2 = com.google.firebase.installations.remote.TokenResult.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.google.firebase.installations.C22853c.C228552.f56504b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = com.google.firebase.installations.C22853c.C228552.f56504b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.remote.TokenResult$ResponseCode r3 = com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode[] r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.google.firebase.installations.C22853c.C228552.f56503a = r2
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r3 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = com.google.firebase.installations.C22853c.C228552.f56503a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.remote.InstallationResponse$ResponseCode r2 = com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C22853c.C228552.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m82980b(boolean z) {
        AbstractC22870c j = m82988j();
        if (z) {
            j = j.mo79428o();
        }
        m82976a(j);
        this.f56499i.execute(RunnableC22859g.m83001a(this, z));
    }

    @Override // com.google.firebase.installations.AbstractC22860h
    /* renamed from: a */
    public Task<AbstractC22863k> mo79380a(boolean z) {
        m82985g();
        Task<AbstractC22863k> h = m82986h();
        this.f56498h.execute(RunnableC22856d.m82998a(this, z));
        return h;
    }

    /* renamed from: a */
    private void m82976a(AbstractC22870c cVar) {
        synchronized (this.f56497g) {
            Iterator<AbstractC22872m> it = this.f56501k.iterator();
            while (it.hasNext()) {
                if (it.next().mo79392a(cVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    private void m82979b(AbstractC22870c cVar) {
        synchronized (f56489l) {
            C22852b a = C22852b.m82972a(this.f56491a.getApplicationContext(), "generatefid.lock");
            try {
                this.f56493c.mo79396a(cVar);
            } finally {
                if (a != null) {
                    a.mo79379a();
                }
            }
        }
    }

    /* renamed from: c */
    private String m82981c(AbstractC22870c cVar) {
        if ((!this.f56491a.getName().equals("CHIME_ANDROID_SDK") && !this.f56491a.isDefaultApp()) || !cVar.mo79426m()) {
            return this.f56496f.mo79394a();
        }
        String b = this.f56495e.mo79417b();
        if (TextUtils.isEmpty(b)) {
            return this.f56496f.mo79394a();
        }
        return b;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m82982c(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.local.c r0 = r2.m82989k()
            boolean r1 = r0.mo79423j()     // Catch:{ IOException -> 0x005b }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo79424k()     // Catch:{ IOException -> 0x005b }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.n r3 = r2.f56494d     // Catch:{ IOException -> 0x005b }
            boolean r3 = r3.mo79430a(r0)     // Catch:{ IOException -> 0x005b }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.local.c r3 = r2.m82984e(r0)     // Catch:{ IOException -> 0x005b }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.local.c r3 = r2.m82983d(r0)     // Catch:{ IOException -> 0x005b }
        L_0x0026:
            r2.m82979b(r3)
            boolean r0 = r3.mo79422i()
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = r3.mo79397a()
            r2.f56500j = r0
        L_0x0035:
            boolean r0 = r3.mo79423j()
            if (r0 == 0) goto L_0x0046
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r1 = com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG
            r0.<init>(r1)
            r2.m82977a(r3, r0)
            goto L_0x005a
        L_0x0046:
            boolean r0 = r3.mo79425l()
            if (r0 == 0) goto L_0x0057
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            r2.m82977a(r3, r0)
            goto L_0x005a
        L_0x0057:
            r2.m82976a(r3)
        L_0x005a:
            return
        L_0x005b:
            r3 = move-exception
            r2.m82977a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C22853c.m82982c(boolean):void");
    }

    /* renamed from: d */
    private AbstractC22870c m82983d(AbstractC22870c cVar) throws IOException {
        String str;
        if (cVar.mo79397a().length() == 11) {
            str = this.f56495e.mo79416a();
        } else {
            str = null;
        }
        InstallationResponse a = this.f56492b.mo79455a(mo79383c(), cVar.mo79397a(), mo79381a(), mo79382b(), str);
        int i = C228552.f56503a[a.mo79435e().ordinal()];
        if (i == 1) {
            return cVar.mo79420a(a.mo79432b(), a.mo79433c(), this.f56494d.mo79429a(), a.mo79434d().mo79442a(), a.mo79434d().mo79443b());
        }
        if (i == 2) {
            return cVar.mo79421b("BAD CONFIG");
        }
        throw new IOException();
    }

    /* renamed from: e */
    private AbstractC22870c m82984e(AbstractC22870c cVar) throws IOException {
        TokenResult b = this.f56492b.mo79457b(mo79383c(), cVar.mo79397a(), mo79381a(), cVar.mo79400d());
        int i = C228552.f56504b[b.mo79444c().ordinal()];
        if (i == 1) {
            return cVar.mo79419a(b.mo79442a(), b.mo79443b(), this.f56494d.mo79429a());
        }
        if (i == 2) {
            return cVar.mo79421b("BAD CONFIG");
        }
        if (i == 3) {
            this.f56500j = null;
            return cVar.mo79427n();
        }
        throw new IOException();
    }

    /* renamed from: a */
    private void m82977a(AbstractC22870c cVar, Exception exc) {
        synchronized (this.f56497g) {
            Iterator<AbstractC22872m> it = this.f56501k.iterator();
            while (it.hasNext()) {
                if (it.next().mo79393a(cVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    C22853c(FirebaseApp firebaseApp, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f56490m), firebaseApp, new C22882c(firebaseApp.getApplicationContext(), gVar, heartBeatInfo), new PersistedInstallation(firebaseApp), new C22873n(), new C22869b(firebaseApp), new C22865l());
    }

    C22853c(ExecutorService executorService, FirebaseApp firebaseApp, C22882c cVar, PersistedInstallation persistedInstallation, C22873n nVar, C22869b bVar, C22865l lVar) {
        this.f56497g = new Object();
        this.f56500j = null;
        this.f56501k = new ArrayList();
        this.f56491a = firebaseApp;
        this.f56492b = cVar;
        this.f56493c = persistedInstallation;
        this.f56494d = nVar;
        this.f56495e = bVar;
        this.f56496f = lVar;
        this.f56498h = executorService;
        this.f56499i = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f56490m);
    }
}
