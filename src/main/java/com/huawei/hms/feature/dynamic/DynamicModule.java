package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.IDynamicInstall;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001a.p002a.p003a.p005b.p006a.C0011a;
import p001a.p002a.p003a.p005b.p006a.C0020c;
import p001a.p002a.p003a.p005b.p006a.C0023j;
import p001a.p002a.p003a.p005b.p006a.C0024k;
import p001a.p002a.p003a.p005b.p006a.C0026n;
import p001a.p002a.p003a.p005b.p006a.C0027o;
import p001a.p002a.p003a.p005b.p006a.p007a.C0012a;
import p001a.p002a.p003a.p005b.p006a.p007a.C0013b;
import p001a.p002a.p003a.p005b.p006a.p007a.C0014c;
import p001a.p002a.p003a.p005b.p006a.p007a.C0015d;
import p001a.p002a.p003a.p005b.p006a.p007a.C0016e;

public class DynamicModule {
    public static final int MODULE_INTER_ERROR = 3;
    public static final int MODULE_NEED_UPDATE = 2;
    public static final int MODULE_NORMAL = 0;
    public static final int MODULE_NOT_EXIST = 1;
    public static final int MODULE_NOT_PRESET_HSF = 5;
    public static final int MODULE_NOT_READY = 4;
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new C0014c();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new C0016e();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new C0015d();
    public static final VersionPolicy PREFER_REMOTE = new C0016e();

    /* renamed from: a */
    public static final String f58005a = DynamicModule.class.getSimpleName();

    /* renamed from: b */
    public static final int f58006b = 256;

    /* renamed from: c */
    public static final int f58007c = -100;

    /* renamed from: d */
    public static final ThreadLocal<HashMap<String, Boolean>> f58008d = new ThreadLocal<>();

    /* renamed from: e */
    public static final ThreadLocal<HashMap<String, String>> f58009e = new ThreadLocal<>();

    /* renamed from: f */
    public static final ThreadLocal<HashMap<String, IDynamicLoader>> f58010f = new ThreadLocal<>();

    /* renamed from: g */
    public static final ThreadLocal<HashMap<String, ClassLoader>> f58011g = new ThreadLocal<>();

    /* renamed from: h */
    public static int f58012h = 0;

    /* renamed from: i */
    public static final int f58013i = 1;

    /* renamed from: j */
    public static final int f58014j = 2;

    /* renamed from: k */
    public static int f58015k;

    /* renamed from: l */
    public static HashMap<String, Boolean> f58016l = new HashMap<>();

    /* renamed from: m */
    public static HashMap<String, Boolean> f58017m = new HashMap<>();

    /* renamed from: n */
    public Context f58018n;

    public static class DynamicLoaderClassLoader {

        /* renamed from: a */
        public static HashMap<String, ClassLoader> f58019a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return f58019a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f58019a.put(str, classLoader);
        }
    }

    public static class LoadingException extends Exception {

        /* renamed from: a */
        public Bundle f58020a;

        public LoadingException(String str) {
            super(str);
        }

        public LoadingException(String str, Bundle bundle) {
            super(str);
            this.f58020a = bundle;
        }

        public Bundle getBundle() {
            return this.f58020a;
        }
    }

    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str) throws LoadingException;
    }

    public DynamicModule(Context context) {
        this.f58018n = context;
    }

    /* renamed from: a */
    public static int m85340a(VersionPolicy versionPolicy) {
        if (versionPolicy instanceof C0016e) {
            return 1;
        }
        if (versionPolicy instanceof C0015d) {
            return 2;
        }
        return versionPolicy instanceof C0014c ? 3 : 0;
    }

    /* renamed from: a */
    public static IDynamicInstall m85346a(String str) throws LoadingException {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return IDynamicInstall.Stub.asInterface((IBinder) new C0012a(str, ClassLoader.getSystemClassLoader()).loadClass("com.huawei.hms.dynamicloader.DynamicInstaller").getConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e.getMessage());
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.");
    }

    /* renamed from: a */
    public static Class<?> m85348a(Context context) throws LoadingException {
        Class<?> cls;
        try {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            cls = context.getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
        } catch (ClassNotFoundException unused) {
            Logger.println(5, f58005a, "ClassLoader class not found when use client context.");
            cls = null;
        }
        if (cls == null) {
            try {
                ClassLoader classLoader = DynamicModule.class.getClassLoader();
                Objects.requireNonNull(classLoader);
                cls = classLoader.loadClass(DynamicLoaderClassLoader.class.getName());
                if (cls == null) {
                    throw new LoadingException("ClassLoader class is null.");
                }
            } catch (ClassNotFoundException unused2) {
                throw new LoadingException("ClassLoader class not found when use DynamicModule's classLoader.");
            }
        }
        return cls;
    }

    /* renamed from: a */
    public static void m85350a(String str, ClassLoader classLoader) throws LoadingException {
        try {
            f58010f.set(new C0027o(str, (IBinder) classLoader.loadClass("com.huawei.hms.dynamicloader.DynamicLoader").getConstructor(new Class[0]).newInstance(new Object[0])));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to get loader interface:" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static boolean m85351a(String str, int i) {
        Boolean bool;
        if (i == 1) {
            Boolean bool2 = f58017m.get(str);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return false;
        } else if (i != 2 || (bool = f58016l.get(str)) == null) {
            return false;
        } else {
            return bool.booleanValue();
        }
    }

    /* renamed from: b */
    public static DynamicModule m85353b(Context context, String str, Bundle bundle) throws LoadingException {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                HashMap<String, Boolean> hashMap = f58008d.get();
                Objects.requireNonNull(hashMap);
                bool = hashMap.get(str);
                HashMap<String, IDynamicLoader> hashMap2 = f58010f.get();
                Objects.requireNonNull(hashMap2);
                iDynamicLoader = hashMap2.get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.");
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context a = m85341a(context, str, bundle, iDynamicLoader);
            if (a != null) {
                return new DynamicModule(a);
            }
            throw new LoadingException("Failed to get remote module context: null");
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.");
        }
    }

    /* renamed from: c */
    public static IDynamicInstall m85356c(Context context) throws LoadingException {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass("com.huawei.hms.dynamicloader.DynamicInstaller").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e.getMessage());
        }
    }

    public static void enable3rdPhone(String str, boolean z) {
        f58016l.put(str, Boolean.valueOf(z));
    }

    public static void enableLowEMUI(String str, boolean z) {
        f58017m.put(str, Boolean.valueOf(z));
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString("module_name", str);
        bundle.putInt("local_module_version", localVersion);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r1.get().get(r5).booleanValue() == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return m85352b(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        com.huawei.hms.common.util.Logger.m85282w(com.huawei.hms.feature.dynamic.DynamicModule.f58005a, "Query remote module info in HMS failed.", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        return new android.os.Bundle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle getRemoteModuleInfo(android.content.Context r4, java.lang.String r5) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.feature.dynamic.DynamicModule.getRemoteModuleInfo(android.content.Context, java.lang.String):android.os.Bundle");
    }

    public final Context getModuleContext() {
        return this.f58018n;
    }

    /* renamed from: a */
    public static IDynamicLoader m85347a(Context context, String str, String str2, ClassLoader classLoader) {
        ThreadLocal<HashMap<String, ClassLoader>> threadLocal;
        HashMap<String, ClassLoader> kVar;
        if (classLoader == null) {
            try {
                if (Build.VERSION.SDK_INT < 21) {
                    Logger.println(4, f58005a, "The android version is below android 5.");
                    classLoader = new C0013b(str2, context.getFilesDir().getAbsolutePath(), null, ClassLoader.getSystemClassLoader());
                    threadLocal = f58011g;
                    kVar = new C0023j(str, classLoader);
                } else {
                    classLoader = new C0012a(str2, ClassLoader.getSystemClassLoader());
                    threadLocal = f58011g;
                    kVar = new C0024k(str, classLoader);
                }
                threadLocal.set(kVar);
            } catch (Exception e) {
                Logger.m85282w(f58005a, "Get asset iDynamicLoader failed.", e);
                return null;
            }
        }
        return IDynamicLoader.Stub.asInterface((IBinder) classLoader.loadClass("com.huawei.hms.dynamicloader.DynamicLoader").getConstructor(new Class[0]).newInstance(new Object[0]));
    }

    /* renamed from: a */
    public static DynamicModule m85345a(Context context, String str, VersionPolicy versionPolicy, Bundle bundle) throws LoadingException {
        int a = m85340a(versionPolicy);
        String string = bundle.getString("loader_path");
        String str2 = f58005a;
        Logger.println(4, str2, "The loader path for module:" + str + " is:" + string + ", and versionType is:" + a);
        if (!TextUtils.isEmpty(string)) {
            Boolean bool = f58017m.get(str);
            Boolean bool2 = f58016l.get(str);
            bundle.putString("module_name", str);
            bundle.putInt("version_strategy_type", a);
            boolean z = false;
            bundle.putBoolean("enable_low_emui_switch", bool != null ? bool.booleanValue() : false);
            if (bool2 != null) {
                z = bool2.booleanValue();
            }
            bundle.putBoolean("enable_3rd_phone_switch", z);
            try {
                return m85355c(context, str, bundle);
            } catch (LoadingException e) {
                throw e;
            } catch (Exception e2) {
                Logger.m85275e(f58005a, "Other exception,", e2);
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                return new DynamicModule(context);
            }
        } else {
            throw new LoadingException("Cannot find a valid dynamic loader in HMS or local.");
        }
    }

    public static Set<String> getInstalledModuleInfo() {
        return C0020c.f33a.f34b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.hms.feature.dynamic.DynamicModule$b */
    public static class CallableC23542b implements Callable<Bundle> {

        /* renamed from: a */
        public final /* synthetic */ Context f58021a;

        public CallableC23542b(Context context) {
            this.f58021a = context;
        }

        /* renamed from: a */
        public Bundle call() {
            try {
                return DynamicModule.queryHMSModuleBundle(this.f58021a, "huawei_module_dynamicloader");
            } catch (Exception e) {
                Logger.m85282w(DynamicModule.f58005a, "Query provider error.", e);
                return new Bundle();
            }
        }
    }

    /* renamed from: d */
    public static Bundle m85357d(Context context) throws C23541a {
        try {
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            FutureTask futureTask = new FutureTask(new CallableC23542b(context));
            newSingleThreadExecutor.execute(futureTask);
            Bundle bundle = (Bundle) futureTask.get((long) f58015k, TimeUnit.MILLISECONDS);
            String string = bundle.getString("loader_path");
            if (TextUtils.isEmpty(string) || !new File(string).exists()) {
                String str = f58005a;
                Logger.println(5, str, "The loader_path:" + string + " is not available.");
                throw new C23541a("The loader_path in queryBundle is empty or not exist.", null);
            }
            Logger.println(4, f58005a, "Query HMS module:huawei_module_dynamicloader info success.");
            return bundle;
        } catch (TimeoutException unused) {
            String str2 = f58005a;
            Logger.println(5, str2, "Query hms provider timeout: over " + f58015k + " ms, choose the local loader fallback.");
            return new Bundle();
        } catch (Exception e) {
            Logger.m85282w(f58005a, "FutureTask: query provider exception.", e);
            throw new C23541a("failed to get :huawei_module_dynamicloader info.", null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0089  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.huawei.hms.feature.dynamic.IDynamicInstall m85354b(android.content.Context r7) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.feature.dynamic.DynamicModule.m85354b(android.content.Context):com.huawei.hms.feature.dynamic.IDynamicInstall");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.hms.feature.dynamic.DynamicModule$a */
    public static class C23541a extends Exception {
        public C23541a(String str) {
            super(str);
        }

        public /* synthetic */ C23541a(String str, C0023j jVar) {
            super(str);
        }
    }

    /* renamed from: b */
    public static Bundle m85352b(Context context, String str) throws LoadingException, C23541a {
        try {
            Bundle queryHMSModuleBundle = queryHMSModuleBundle(context, str);
            String string = queryHMSModuleBundle.getString("loader_path");
            if (TextUtils.isEmpty(string) || !new File(string).exists()) {
                String str2 = f58005a;
                Logger.println(5, str2, "The loader_path:" + string + " in query bundle is not available,change the module version to:" + -100);
                queryHMSModuleBundle.putInt("module_version", -100);
                return queryHMSModuleBundle;
            }
            f58009e.set(new C0026n(str, string));
            String str3 = f58005a;
            Logger.println(4, str3, "Query remote version by module name:" + str + " success.");
            return queryHMSModuleBundle;
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new C23541a("failed to Query remote version.", null);
        }
    }

    public static int getLocalVersion(Context context, String str) {
        if (context == null || str.length() == 0 || str.length() > 256) {
            Logger.println(6, f58005a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("com.huawei.hms.feature.dynamic.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            String sb2 = sb.toString();
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            return context.getClassLoader().loadClass(sb2).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            String str2 = f58005a;
            Logger.println(5, str2, "Cannot find the class of module descriptor for " + str);
            return 0;
        } catch (Exception e) {
            Logger.m85282w(f58005a, "Get local module info failed.", e);
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) throws LoadingException {
        try {
            Bundle b = m85352b(context, str);
            if (b != null && !b.isEmpty()) {
                return b.getInt("module_version");
            }
            String str2 = f58005a;
            Logger.println(5, str2, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.");
        } catch (C23541a e) {
            String str3 = f58005a;
            Logger.println(5, str3, "Query remote module:" + str + " exception:" + e);
            return 0;
        }
    }

    public static void install(Context context, int i) {
        if (context == null) {
            Logger.println(6, f58005a, "The input context is null.");
            return;
        }
        try {
            f58015k = i;
            String str = f58005a;
            StringBuilder sb = new StringBuilder();
            sb.append("Query HMS provider timeOut is set to:");
            sb.append(f58015k);
            sb.append(" ms.");
            Logger.println(4, str, sb.toString());
            IDynamicInstall b = m85354b(context);
            if (b != null) {
                Bundle install = b.install(new ObjectWrapper(context), new Bundle());
                if (install != null) {
                    C0020c.f33a.mo23a(install);
                    Logger.println(4, str, "Install module success.");
                    return;
                }
                throw new LoadingException("Get install info failed: moduleBundle is null.");
            }
            throw new LoadingException("Get dynamicInstaller failed.");
        } catch (RemoteException | LoadingException | NullPointerException e) {
            if (f58012h == 2 || getLocalVersion(context, "huawei_module_dynamicloader") <= 0) {
                Logger.m85282w(f58005a, "Install module failed.", e);
                return;
            }
            String str2 = f58005a;
            Logger.println(4, str2, "Ready to use local loader-fallback to retry:");
            try {
                Bundle install2 = m85356c(context).install(new ObjectWrapper(context), new Bundle());
                if (install2 != null) {
                    C0020c.f33a.mo23a(install2);
                    Logger.println(4, str2, "Retry install module with local loader-fallback success.");
                    return;
                }
                throw new LoadingException("Retry: get install info failed: moduleBundle is null.");
            } catch (RemoteException | LoadingException | NullPointerException e2) {
                Logger.m85282w(f58005a, "Retry failed with local loader-fallback.", e2);
            }
        }
    }

    public static Bundle queryHMSModuleBundle(Context context, String str) throws LoadingException, C23541a {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                Bundle call = contentResolver.call(Uri.parse("content://com.huawei.hms"), str, (String) null, (Bundle) null);
                if (call != null) {
                    int i = call.getInt("errcode");
                    String string = call.getString("loader_path");
                    String str2 = f58005a;
                    Logger.println(4, str2, "bundle info: errorCode:" + i + ", moduleVersion:" + call.getInt("module_version") + ", modulePath:" + call.getString("module_path") + ", loader_version:" + call.getInt("loader_version") + ", loaderPath:" + string + ", armeabiType:" + call.getInt("armeabiType"));
                    if (i == 0) {
                        return call;
                    }
                    Logger.println(5, str2, "Failed to get " + str + " bundle info, errcode:" + i);
                    throw new LoadingException("Query " + str + " unavailable, errorCode:" + i, call);
                }
                Logger.println(5, f58005a, "Failed to get bundle info:null.");
                throw new C23541a("Query remote version failed: null bundle info.", null);
            }
            throw new C23541a("Query remote version failed: null contentResolver.", null);
        } catch (LoadingException e) {
            throw e;
        } catch (Exception unused) {
            throw new C23541a("failed to get :" + str + " info.", null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        com.huawei.hms.common.util.Logger.m85282w(com.huawei.hms.feature.dynamic.DynamicModule.f58005a, "Get loader interface failed.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 21) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        com.huawei.hms.common.util.Logger.println(4, r3, "The android version is below android 5.");
        r3 = new p001a.p002a.p003a.p005b.p006a.p007a.C0013b(r9, r11.getFilesDir().getAbsolutePath(), null, java.lang.ClassLoader.getSystemClassLoader());
        m85350a(r12, r3);
        r11 = new java.lang.Object[]{r12, r3};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        r11 = new p001a.p002a.p003a.p005b.p006a.p007a.C0012a(r9, java.lang.ClassLoader.getSystemClassLoader());
        m85350a(r12, r11);
        r11 = new java.lang.Object[]{r12, r11};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        r2.invoke(null, r11);
        com.huawei.hms.feature.dynamic.DynamicModule.f58008d.set(new p001a.p002a.p003a.p005b.p006a.C0025m(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bd, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c1, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        com.huawei.hms.common.util.Logger.m85282w(com.huawei.hms.feature.dynamic.DynamicModule.f58005a, "failed to load.", r11);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[ExcHandler: Exception (r11v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0002] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m85343a(android.content.Context r11, java.lang.String r12) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.feature.dynamic.DynamicModule.m85343a(android.content.Context, java.lang.String):android.os.Bundle");
    }

    /* renamed from: c */
    public static DynamicModule m85355c(Context context, String str, Bundle bundle) throws LoadingException {
        ClassLoader classLoader;
        synchronized (DynamicModule.class) {
            ThreadLocal<HashMap<String, ClassLoader>> threadLocal = f58011g;
            if (threadLocal.get() != null) {
                if (threadLocal.get().get(str) != null) {
                    Logger.println(4, f58005a, "Cached loader for asset module is available, ready to use it.");
                    classLoader = threadLocal.get().get(str);
                }
            }
            Logger.println(4, f58005a, "No available cached loader for asset module.");
            classLoader = null;
        }
        IDynamicLoader a = m85347a(context, str, bundle.getString("loader_path"), classLoader);
        if (a != null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context a2 = m85341a(context, str, bundle, a);
            if (a2 != null) {
                return new DynamicModule(a2);
            }
            throw new LoadingException("V2: Failed to get module context: null.");
        }
        throw new LoadingException("Failed to get iDynamicLoader: null.");
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        if (context == null || versionPolicy == null || str == null || str.length() == 0 || str.length() > 256) {
            throw new LoadingException("Null param, please check it.");
        }
        try {
            Bundle bundle = new Bundle();
            int a = m85339a(context, str, bundle);
            if (a >= 10015300) {
                Logger.println(4, f58005a, "Load V2 start.");
                return m85345a(context, str, versionPolicy, bundle);
            } else if (a > 0) {
                Logger.println(4, f58005a, "Load V1 start.");
                return m85344a(context, str, versionPolicy);
            } else {
                throw new LoadingException("Cannot find a valid dynamicLoader in HMS and local.");
            }
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            String str2 = f58005a;
            Logger.println(6, str2, "Other exception:" + e2);
            throw new LoadingException("Load failed.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m85339a(android.content.Context r9, java.lang.String r10, android.os.Bundle r11) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.feature.dynamic.DynamicModule.m85339a(android.content.Context, java.lang.String, android.os.Bundle):int");
    }

    /* renamed from: a */
    public static DynamicModule m85344a(Context context, String str, VersionPolicy versionPolicy) throws LoadingException {
        Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
        if (moduleInfo.getInt("module_version") > 0) {
            try {
                return m85353b(context, str, moduleInfo);
            } catch (LoadingException e) {
                Logger.m85282w(f58005a, "Failed to load remote module.", e);
                if (getLocalVersion(context, str) <= 0) {
                    return null;
                }
                Logger.println(3, f58005a, "Local module version is valid, use local fallback.");
                return new DynamicModule(context.getApplicationContext());
            }
        } else if (moduleInfo.getInt("local_module_version") > 0) {
            Logger.println(4, f58005a, "Remote version is invalid, use local context.");
            return new DynamicModule(context.getApplicationContext());
        } else {
            throw new LoadingException("Query remote version and local version failed.");
        }
    }

    /* renamed from: a */
    public static Context m85341a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) throws LoadingException {
        try {
            IObjectWrapper load = iDynamicLoader.load(new ObjectWrapper(context), str, bundle.getInt("module_version"), new ObjectWrapper(bundle));
            Object unwrap = ObjectWrapper.unwrap(load);
            if (unwrap == null) {
                String str2 = f58005a;
                Logger.println(5, str2, "Get remote context is null, module:" + str);
                return null;
            } else if (unwrap instanceof Context) {
                String str3 = f58005a;
                Logger.println(4, str3, "Get context for module:" + str + " success.");
                return (Context) unwrap;
            } else if (unwrap instanceof Bundle) {
                String str4 = f58005a;
                Logger.println(4, str4, "Get module info bundle for " + str);
                return m85342a(context, str, bundle, iDynamicLoader, (Bundle) unwrap);
            } else if (!unwrap.getClass().getName().equals(LoadingException.class.getName())) {
                return null;
            } else {
                Logger.println(5, f58005a, "Successfully get the bundle in exception.");
                throw new LoadingException("Failed to load, please check the bundle in exception.", (Bundle) ObjectWrapper.unwrap(load).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(load), new Object[0]));
            }
        } catch (LoadingException e) {
            throw e;
        } catch (Exception e2) {
            String str5 = f58005a;
            Logger.m85282w(str5, "Failed to get module context for:" + str, e2);
            return null;
        }
    }

    /* renamed from: a */
    public static Context m85342a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader, Bundle bundle2) throws LoadingException {
        bundle.putInt("version_strategy_type", 4);
        if (C0011a.m23a(context, str).getInt("local_asset_module_version", 0) > 0) {
            Object obj = null;
            try {
                obj = ObjectWrapper.unwrap(iDynamicLoader.load(new ObjectWrapper(context), str, bundle.getInt("module_version"), new ObjectWrapper(bundle)));
            } catch (RemoteException e) {
                Logger.m85282w(f58005a, "tryWithAssetsModule RemoteException.", e);
            }
            if (obj instanceof Context) {
                String str2 = f58005a;
                Logger.println(4, str2, "get dynamic module context for:" + str + " from assets fallback success.");
                return (Context) obj;
            }
            Logger.println(5, f58005a, "tryWithAssetsModule get dynamicContext failed: null or wrong type.");
            throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
        }
        Logger.println(4, f58005a, "No fallback module in assets.");
        throw new LoadingException("Load exception, please check the bundle in exception.", bundle2);
    }
}
