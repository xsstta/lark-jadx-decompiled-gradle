package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.C0805j;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.C22761e;
import com.google.firebase.components.C22765f;
import com.google.firebase.components.C22775m;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.events.AbstractC22792a;
import com.google.firebase.heartbeatinfo.C22793a;
import com.google.firebase.p996b.C22754a;
import com.google.firebase.platforminfo.C22918b;
import com.google.firebase.platforminfo.C22921e;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class FirebaseApp {
    public static final String DEFAULT_APP_NAME;
    private static final String FIREBASE_ANDROID;
    private static final String FIREBASE_COMMON;
    static final Map<String, FirebaseApp> INSTANCES = new ArrayMap();
    private static final String KOTLIN;
    public static final Object LOCK = new Object();
    private static final String LOG_TAG;
    private static final Executor UI_EXECUTOR = new ExecutorC22749c();
    private final Context applicationContext;
    public final AtomicBoolean automaticResourceManagementEnabled = new AtomicBoolean(false);
    private final List<AbstractC22747a> backgroundStateChangeListeners = new CopyOnWriteArrayList();
    private final C22765f componentRuntime;
    private final C22775m<C22754a> dataCollectionConfigStorage;
    private final AtomicBoolean deleted = new AtomicBoolean();
    private final List<AbstractC22753b> lifecycleListeners = new CopyOnWriteArrayList();
    private final String name;
    private final C22755c options;

    /* renamed from: com.google.firebase.FirebaseApp$a */
    public interface AbstractC22747a {
        /* renamed from: a */
        void mo79121a(boolean z);
    }

    /* renamed from: com.google.firebase.FirebaseApp$b */
    public static class C22748b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        private static AtomicReference<C22748b> f56274a = new AtomicReference<>();

        private C22748b() {
        }

        /* renamed from: a */
        public static void m82708a(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f56274a.get() == null) {
                    C22748b bVar = new C22748b();
                    if (f56274a.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.LOCK) {
                Iterator it = new ArrayList(FirebaseApp.INSTANCES.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.automaticResourceManagementEnabled.get()) {
                        firebaseApp.notifyBackgroundStateChangeListeners(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$c */
    private static class ExecutorC22749c implements Executor {

        /* renamed from: a */
        private static final Handler f56275a = new Handler(Looper.getMainLooper());

        private ExecutorC22749c() {
        }

        public void execute(Runnable runnable) {
            f56275a.post(runnable);
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$d */
    public static class C22750d extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C22750d> f56276a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f56277b;

        /* renamed from: a */
        public void mo79123a() {
            this.f56277b.unregisterReceiver(this);
        }

        public C22750d(Context context) {
            this.f56277b = context;
        }

        /* renamed from: a */
        public static void m82710a(Context context) {
            if (f56276a.get() == null) {
                C22750d dVar = new C22750d(context);
                if (f56276a.compareAndSet(null, dVar)) {
                    m82709a(context, dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.LOCK) {
                for (FirebaseApp firebaseApp : FirebaseApp.INSTANCES.values()) {
                    firebaseApp.initializeAllApis();
                }
            }
            mo79123a();
        }

        /* renamed from: a */
        public static Intent m82709a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    public Context getApplicationContext() {
        checkNotDeleted();
        return this.applicationContext;
    }

    public String getName() {
        checkNotDeleted();
        return this.name;
    }

    public C22755c getOptions() {
        checkNotDeleted();
        return this.options;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    private void checkNotDeleted() {
        Preconditions.checkState(!this.deleted.get(), "FirebaseApp was deleted");
    }

    public static void clearInstancesForTest() {
        synchronized (LOCK) {
            INSTANCES.clear();
        }
    }

    public boolean isDataCollectionDefaultEnabled() {
        checkNotDeleted();
        return this.dataCollectionConfigStorage.mo79125a().mo79140a();
    }

    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    private void notifyOnAppDeleted() {
        for (AbstractC22753b bVar : this.lifecycleListeners) {
            bVar.mo79138a(this.name, this.options);
        }
    }

    public void delete() {
        if (this.deleted.compareAndSet(false, true)) {
            synchronized (LOCK) {
                INSTANCES.remove(this.name);
            }
            notifyOnAppDeleted();
        }
    }

    public void initializeAllApis() {
        if (!C0805j.m3897a(this.applicationContext)) {
            C22750d.m82710a(this.applicationContext);
        } else {
            this.componentRuntime.mo79182a(isDefaultApp());
        }
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("options", this.options).toString();
    }

    private static List<String> getAllAppNames() {
        ArrayList arrayList = new ArrayList();
        synchronized (LOCK) {
            for (FirebaseApp firebaseApp : INSTANCES.values()) {
                arrayList.add(firebaseApp.getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().mo79142b().getBytes(Charset.defaultCharset()));
    }

    private static String normalize(String str) {
        return str.trim();
    }

    public void addLifecycleEventListener(AbstractC22753b bVar) {
        checkNotDeleted();
        Preconditions.checkNotNull(bVar);
        this.lifecycleListeners.add(bVar);
    }

    public <T> T get(Class<T> cls) {
        checkNotDeleted();
        return (T) this.componentRuntime.get(cls);
    }

    public void removeBackgroundStateChangeListener(AbstractC22747a aVar) {
        checkNotDeleted();
        this.backgroundStateChangeListeners.remove(aVar);
    }

    public void removeLifecycleEventListener(AbstractC22753b bVar) {
        checkNotDeleted();
        Preconditions.checkNotNull(bVar);
        this.lifecycleListeners.remove(bVar);
    }

    public void setDataCollectionDefaultEnabled(boolean z) {
        checkNotDeleted();
        this.dataCollectionConfigStorage.mo79125a().mo79139a(z);
    }

    public static List<FirebaseApp> getApps(Context context) {
        ArrayList arrayList;
        synchronized (LOCK) {
            arrayList = new ArrayList(INSTANCES.values());
        }
        return arrayList;
    }

    public void addBackgroundStateChangeListener(AbstractC22747a aVar) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.mo79121a(true);
        }
        this.backgroundStateChangeListeners.add(aVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.name.equals(((FirebaseApp) obj).getName());
    }

    public void notifyBackgroundStateChangeListeners(boolean z) {
        Log.d(LOG_TAG, "Notifying background state change listeners.");
        for (AbstractC22747a aVar : this.backgroundStateChangeListeners) {
            aVar.mo79121a(z);
        }
    }

    public static FirebaseApp initializeApp(Context context) {
        synchronized (LOCK) {
            if (INSTANCES.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            C22755c a = C22755c.m82720a(context);
            if (a == null) {
                Log.w(LOG_TAG, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return initializeApp(context, a);
        }
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        checkNotDeleted();
        if (this.automaticResourceManagementEnabled.compareAndSet(!z, z)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && isInBackground) {
                notifyBackgroundStateChangeListeners(true);
            } else if (!z && isInBackground) {
                notifyBackgroundStateChangeListeners(false);
            }
        }
    }

    public static FirebaseApp getInstance(String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (LOCK) {
            firebaseApp = INSTANCES.get(normalize(str));
            if (firebaseApp == null) {
                List<String> allAppNames = getAllAppNames();
                if (allAppNames.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", allAppNames);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp initializeApp(Context context, C22755c cVar) {
        return initializeApp(context, cVar, DEFAULT_APP_NAME);
    }

    static /* synthetic */ C22754a lambda$new$0(FirebaseApp firebaseApp, Context context) {
        return new C22754a(context, firebaseApp.getPersistenceKey(), (AbstractC22792a) firebaseApp.componentRuntime.get(AbstractC22792a.class));
    }

    public static String getPersistenceKey(String str, C22755c cVar) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(cVar.mo79142b().getBytes(Charset.defaultCharset()));
    }

    public static FirebaseApp initializeApp(Context context, C22755c cVar, String str) {
        boolean z;
        FirebaseApp firebaseApp;
        C22748b.m82708a(context);
        String normalize = normalize(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (LOCK) {
            Map<String, FirebaseApp> map = INSTANCES;
            if (!map.containsKey(normalize)) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "FirebaseApp name " + normalize + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, normalize, cVar);
            map.put(normalize, firebaseApp);
        }
        firebaseApp.initializeAllApis();
        return firebaseApp;
    }

    protected FirebaseApp(Context context, String str, C22755c cVar) {
        Component<?> component;
        this.applicationContext = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.options = (C22755c) Preconditions.checkNotNull(cVar);
        List<ComponentRegistrar> a = C22761e.m82728a(context, ComponentDiscoveryService.class).mo79179a();
        String a2 = C22921e.m83295a();
        Executor executor = UI_EXECUTOR;
        Component[] componentArr = new Component[8];
        componentArr[0] = Component.of(context, Context.class, new Class[0]);
        componentArr[1] = Component.of(this, FirebaseApp.class, new Class[0]);
        componentArr[2] = Component.of(cVar, C22755c.class, new Class[0]);
        componentArr[3] = LibraryVersionComponent.create(FIREBASE_ANDROID, "");
        componentArr[4] = LibraryVersionComponent.create(FIREBASE_COMMON, "19.3.0");
        if (a2 != null) {
            component = LibraryVersionComponent.create(KOTLIN, a2);
        } else {
            component = null;
        }
        componentArr[5] = component;
        componentArr[6] = C22918b.m83290b();
        componentArr[7] = C22793a.m82808a();
        this.componentRuntime = new C22765f(executor, a, componentArr);
        this.dataCollectionConfigStorage = new C22775m<>(C22751a.m82712a(this, context));
    }
}
