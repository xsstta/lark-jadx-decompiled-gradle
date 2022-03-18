package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.an;
import com.google.firebase.installations.AbstractC22860h;
import com.google.firebase.platforminfo.AbstractC22923g;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

public class FirebaseInstanceId {
    private static final Pattern API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static an store;
    static ScheduledExecutorService syncExecutor;
    public final FirebaseApp app;
    private final C22798a autoInit;
    final Executor fileIoExecutor;
    private final AbstractC22860h firebaseInstallations;
    private final C22809ab metadata;
    private final C22812ae requestDeduplicator;
    private final C22839q rpc;
    private boolean syncScheduledOrRunning;

    /* access modifiers changed from: package-private */
    public FirebaseApp getApp() {
        return this.app;
    }

    public boolean isFcmAutoInitEnabled() {
        return this.autoInit.mo79268b();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.mo79307a();
    }

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* access modifiers changed from: package-private */
    public String blockingGetMasterToken() throws IOException {
        return getToken(C22809ab.m82861a(this.app), "*");
    }

    /* access modifiers changed from: package-private */
    public void forceTokenRefresh() {
        store.mo79334c(getSubtype());
        startSync();
    }

    public long getCreationTime() {
        return store.mo79327a(this.app.getPersistenceKey());
    }

    public String getId() {
        checkRequiredFirebaseOptions(this.app);
        startSyncIfNecessary();
        return getIdWithoutTriggeringSync();
    }

    /* access modifiers changed from: package-private */
    public an.C22819a getTokenWithoutTriggeringSync() {
        return getTokenWithoutTriggeringSync(C22809ab.m82861a(this.app), "*");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$new$0$FirebaseInstanceId() {
        if (isFcmAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
    }

    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public static synchronized void clearInstancesForTest() {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = syncExecutor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
            syncExecutor = null;
            store = null;
        }
    }

    private String getSubtype() {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.app.getName())) {
            return "";
        }
        return this.app.getPersistenceKey();
    }

    static boolean isDebugLogEnabled() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public String getIdWithoutTriggeringSync() {
        try {
            store.mo79331b(this.app.getPersistenceKey());
            return (String) awaitTaskAllowOnMainThread(this.firebaseInstallations.mo79384d());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public String getToken() {
        checkRequiredFirebaseOptions(this.app);
        an.C22819a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            startSync();
        }
        return an.C22819a.m82913a(tokenWithoutTriggeringSync);
    }

    /* access modifiers changed from: package-private */
    public synchronized void resetStorageAndScheduleSync() {
        store.mo79332b();
        if (isFcmAutoInitEnabled()) {
            startSync();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    public class C22798a {

        /* renamed from: b */
        private boolean f56349b;

        /* renamed from: c */
        private final Subscriber f56350c;

        /* renamed from: d */
        private boolean f56351d;

        /* renamed from: e */
        private EventHandler<DataCollectionDefaultChange> f56352e;

        /* renamed from: f */
        private Boolean f56353f;

        /* renamed from: d */
        private boolean m82820d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context applicationContext = FirebaseInstanceId.this.app.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo79265a() {
            if (!this.f56351d) {
                this.f56349b = m82820d();
                Boolean c = m82819c();
                this.f56353f = c;
                if (c == null && this.f56349b) {
                    C22837o oVar = new C22837o(this);
                    this.f56352e = oVar;
                    this.f56350c.subscribe(DataCollectionDefaultChange.class, oVar);
                }
                this.f56351d = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo79268b() {
            mo79265a();
            Boolean bool = this.f56353f;
            if (bool != null) {
                return bool.booleanValue();
            } else if (!this.f56349b || !FirebaseInstanceId.this.app.isDataCollectionDefaultEnabled()) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: c */
        private Boolean m82819c() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseInstanceId.this.app.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final /* synthetic */ void mo79266a(Event event) {
            synchronized (this) {
                if (mo79268b()) {
                    FirebaseInstanceId.this.startSyncIfNecessary();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo79267a(boolean z) {
            mo79265a();
            EventHandler<DataCollectionDefaultChange> eventHandler = this.f56352e;
            if (eventHandler != null) {
                this.f56350c.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                this.f56352e = null;
            }
            SharedPreferences.Editor edit = FirebaseInstanceId.this.app.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.startSyncIfNecessary();
            }
            this.f56353f = Boolean.valueOf(z);
        }

        C22798a(Subscriber subscriber) {
            this.f56350c = subscriber;
        }
    }

    public void deleteInstanceId() throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            awaitTask(this.firebaseInstallations.mo79385e());
            resetStorageAndScheduleSync();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public Task<InstanceIdResult> getInstanceId() {
        checkRequiredFirebaseOptions(this.app);
        return getInstanceId(C22809ab.m82861a(this.app), "*");
    }

    static boolean isValidAppIdFormat(@Nonnull String str) {
        return str.contains(":");
    }

    public void setFcmAutoInitEnabled(boolean z) {
        this.autoInit.mo79267a(z);
    }

    /* access modifiers changed from: package-private */
    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    static boolean isValidApiKeyFormat(@Nonnull String str) {
        return API_KEY_FORMAT.matcher(str).matches();
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        checkRequiredFirebaseOptions(firebaseApp);
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    private static String rationaliseScope(String str) {
        if (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) {
            return "*";
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new ao(this, Math.min(Math.max(30L, j << 1), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    /* access modifiers changed from: package-private */
    public boolean tokenNeedsRefresh(an.C22819a aVar) {
        if (aVar == null || aVar.mo79335b(this.metadata.mo79309c())) {
            return true;
        }
        return false;
    }

    private <T> T awaitTask(Task<T> task) throws IOException {
        try {
            return (T) Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    resetStorageAndScheduleSync();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static <T> T awaitTaskAllowOnMainThread(Task<T> task) throws InterruptedException {
        Preconditions.checkNotNull(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(ExecutorC22833k.f56451a, new C22834l(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        return (T) getResultOrThrowException(task);
    }

    private static <T> T getResultOrThrowException(Task<T> task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    private static void checkRequiredFirebaseOptions(FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().mo79144d(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().mo79142b(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().mo79141a(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(isValidAppIdFormat(firebaseApp.getOptions().mo79142b()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(isValidApiKeyFormat(firebaseApp.getOptions().mo79141a()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private Task<InstanceIdResult> getInstanceId(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.fileIoExecutor, new C22832j(this, str, rationaliseScope(str2)));
    }

    /* access modifiers changed from: package-private */
    public an.C22819a getTokenWithoutTriggeringSync(String str, String str2) {
        return store.mo79328a(getSubtype(), str, str2);
    }

    public void deleteToken(String str, String str2) throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String rationaliseScope = rationaliseScope(str2);
            awaitTask(this.rpc.mo79359b(getIdWithoutTriggeringSync(), str, rationaliseScope));
            store.mo79333b(getSubtype(), str, rationaliseScope);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public String getToken(String str, String str2) throws IOException {
        checkRequiredFirebaseOptions(this.app);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) awaitTask(getInstanceId(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task lambda$getInstanceId$2$FirebaseInstanceId(String str, String str2, String str3) {
        return this.rpc.mo79357a(str, str2, str3).onSuccessTask(this.fileIoExecutor, new C22836n(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task lambda$getInstanceId$3$FirebaseInstanceId(String str, String str2, Task task) throws Exception {
        String idWithoutTriggeringSync = getIdWithoutTriggeringSync();
        an.C22819a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync(str, str2);
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return Tasks.forResult(new C22843u(idWithoutTriggeringSync, tokenWithoutTriggeringSync.f56413a));
        }
        return this.requestDeduplicator.mo79313a(str, str2, new C22835m(this, idWithoutTriggeringSync, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task lambda$getInstanceId$1$FirebaseInstanceId(String str, String str2, String str3, String str4) throws Exception {
        store.mo79329a(getSubtype(), str, str2, str4, this.metadata.mo79309c());
        return Tasks.forResult(new C22843u(str3, str4));
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar) {
        this(firebaseApp, new C22809ab(firebaseApp.getApplicationContext()), C22829g.m82948b(), C22829g.m82948b(), subscriber, gVar, heartBeatInfo, hVar);
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, C22809ab abVar, Executor executor, Executor executor2, Subscriber subscriber, AbstractC22923g gVar, HeartBeatInfo heartBeatInfo, AbstractC22860h hVar) {
        if (C22809ab.m82861a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (store == null) {
                    store = new an(firebaseApp.getApplicationContext());
                }
            }
            this.app = firebaseApp;
            this.metadata = abVar;
            this.rpc = new C22839q(firebaseApp, abVar, gVar, heartBeatInfo, hVar);
            this.fileIoExecutor = executor2;
            this.autoInit = new C22798a(subscriber);
            this.requestDeduplicator = new C22812ae(executor);
            this.firebaseInstallations = hVar;
            executor2.execute(new RunnableC22831i(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
