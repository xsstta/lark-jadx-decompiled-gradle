package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.C21806c;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new C21836d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new C21837e();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new C21838f();
    public static final VersionPolicy PREFER_LOCAL = new C21835c();
    public static final VersionPolicy PREFER_REMOTE = new C21834b();
    private static Boolean zzif = null;
    private static zzi zzig = null;
    private static zzk zzih = null;
    private static String zzii = null;
    private static int zzij = -1;
    private static final ThreadLocal<C21831a> zzik = new ThreadLocal<>();
    private static final VersionPolicy.AbstractC21829a zzil = new C21833a();
    private static final VersionPolicy zzim = new C21839g();
    private final Context zzin;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public interface VersionPolicy {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$a */
        public interface AbstractC21829a {
            /* renamed from: a */
            int mo73908a(Context context, String str);

            /* renamed from: a */
            int mo73909a(Context context, String str, boolean z) throws LoadingException;
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$b */
        public static class C21830b {

            /* renamed from: a */
            public int f53247a;

            /* renamed from: b */
            public int f53248b;

            /* renamed from: c */
            public int f53249c;
        }

        C21830b zza(Context context, String str, AbstractC21829a aVar) throws LoadingException;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    public static class C21831a {

        /* renamed from: a */
        public Cursor f53250a;

        private C21831a() {
        }

        /* synthetic */ C21831a(C21833a aVar) {
            this();
        }
    }

    /* JADX INFO: finally extract failed */
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        ThreadLocal<C21831a> threadLocal = zzik;
        C21831a aVar = threadLocal.get();
        C21831a aVar2 = new C21831a(null);
        threadLocal.set(aVar2);
        try {
            VersionPolicy.C21830b zza = versionPolicy.zza(context, str, zzil);
            int i = zza.f53247a;
            int i2 = zza.f53248b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (zza.f53249c == 0 || ((zza.f53249c == -1 && zza.f53247a == 0) || (zza.f53249c == 1 && zza.f53248b == 0))) {
                int i3 = zza.f53247a;
                int i4 = zza.f53248b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (C21833a) null);
            } else if (zza.f53249c == -1) {
                DynamiteModule zze = zze(context, str);
                if (aVar2.f53250a != null) {
                    aVar2.f53250a.close();
                }
                threadLocal.set(aVar);
                return zze;
            } else if (zza.f53249c == 1) {
                try {
                    DynamiteModule zza2 = zza(context, str, zza.f53248b);
                    if (aVar2.f53250a != null) {
                        aVar2.f53250a.close();
                    }
                    threadLocal.set(aVar);
                    return zza2;
                } catch (LoadingException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
                    if (zza.f53247a == 0 || versionPolicy.zza(context, str, new C21832b(zza.f53247a, 0)).f53249c != -1) {
                        throw new LoadingException("Remote load failed. No local fallback found.", e, null);
                    }
                    DynamiteModule zze2 = zze(context, str);
                    if (aVar2.f53250a != null) {
                        aVar2.f53250a.close();
                    }
                    zzik.set(aVar);
                    return zze2;
                }
            } else {
                int i5 = zza.f53249c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (C21833a) null);
            }
        } catch (Throwable th) {
            if (aVar2.f53250a != null) {
                aVar2.f53250a.close();
            }
            zzik.set(aVar);
            throw th;
        }
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, C21833a aVar) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, C21833a aVar) {
            this(str, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b */
    public static class C21832b implements VersionPolicy.AbstractC21829a {

        /* renamed from: a */
        private final int f53251a;

        public C21832b(int i, int i2) {
            this.f53251a = i;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.AbstractC21829a
        /* renamed from: a */
        public final int mo73909a(Context context, String str, boolean z) {
            return 0;
        }

        @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.AbstractC21829a
        /* renamed from: a */
        public final int mo73908a(Context context, String str) {
            return this.f53251a;
        }
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static int zza(Context context, String str, boolean z) {
        Boolean bool;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool2 = zzif;
                if (bool2 == null) {
                    try {
                        Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName());
                        Field declaredField = loadClass.getDeclaredField("sClassLoader");
                        synchronized (loadClass) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader != null) {
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        zza(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                }
                            } else if ("com.google.android.gms".equals(context.getApplicationContext().getPackageName())) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int zzc = zzc(context, str, z);
                                    String str2 = zzii;
                                    if (str2 != null) {
                                        if (!str2.isEmpty()) {
                                            C21840h hVar = new C21840h(zzii, ClassLoader.getSystemClassLoader());
                                            zza(hVar);
                                            declaredField.set(null, hVar);
                                            zzif = Boolean.TRUE;
                                            return zzc;
                                        }
                                    }
                                    return zzc;
                                } catch (LoadingException unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                    bool2 = bool;
                                    zzif = bool2;
                                    if (!bool2.booleanValue()) {
                                        return zzb(context, str, z);
                                    }
                                    try {
                                        return zzc(context, str, z);
                                    } catch (LoadingException e) {
                                        String valueOf = String.valueOf(e.getMessage());
                                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                                        return 0;
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(valueOf2);
                        Log.w("DynamiteModule", sb.toString());
                        bool2 = Boolean.FALSE;
                    }
                }
            }
        } catch (Throwable th) {
            C21806c.m79081a(context, th);
            throw th;
        }
    }

    private static int zzb(Context context, String str, boolean z) {
        zzi zzj = zzj(context);
        if (zzj == null) {
            return 0;
        }
        try {
            if (zzj.zzak() >= 2) {
                return zzj.zzb(ObjectWrapper.wrap(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return zzj.zza(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzc(android.content.Context r8, java.lang.String r9, boolean r10) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zze(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule zza(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        try {
            synchronized (DynamiteModule.class) {
                bool = zzif;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (C21833a) null);
            } else if (bool.booleanValue()) {
                return zzb(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                zzi zzj = zzj(context);
                if (zzj != null) {
                    if (zzj.zzak() >= 2) {
                        iObjectWrapper = zzj.zzb(ObjectWrapper.wrap(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        iObjectWrapper = zzj.zza(ObjectWrapper.wrap(context), str, i);
                    }
                    if (ObjectWrapper.unwrap(iObjectWrapper) != null) {
                        return new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    }
                    throw new LoadingException("Failed to load remote module.", (C21833a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (C21833a) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            C21806c.m79081a(context, th);
            throw new LoadingException("Failed to load remote module.", th, null);
        }
    }

    private static zzi zzj(Context context) {
        zzi zzi;
        synchronized (DynamiteModule.class) {
            zzi zzi2 = zzig;
            if (zzi2 != null) {
                return zzi2;
            }
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzi = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzi) {
                        zzi = (zzi) queryLocalInterface;
                    } else {
                        zzi = new zzj(iBinder);
                    }
                }
                if (zzi != null) {
                    zzig = zzi;
                    return zzi;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public final Context getModuleContext() {
        return this.zzin;
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException, RemoteException {
        zzk zzk;
        IObjectWrapper iObjectWrapper;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            zzk = zzih;
        }
        if (zzk != null) {
            C21831a aVar = zzik.get();
            if (aVar == null || aVar.f53250a == null) {
                throw new LoadingException("No result cursor", (C21833a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = aVar.f53250a;
            ObjectWrapper.wrap(null);
            if (zzaj().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                iObjectWrapper = zzk.zzb(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                iObjectWrapper = zzk.zza(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            }
            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (C21833a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (C21833a) null);
    }

    private static Boolean zzaj() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(zzij >= 2);
        }
        return valueOf;
    }

    private static void zza(ClassLoader classLoader) throws LoadingException {
        zzk zzk;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzk = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzk) {
                    zzk = (zzk) queryLocalInterface;
                } else {
                    zzk = new zzl(iBinder);
                }
            }
            zzih = zzk;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzin.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzin = (Context) Preconditions.checkNotNull(context);
    }
}
