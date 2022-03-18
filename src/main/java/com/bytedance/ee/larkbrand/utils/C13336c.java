package com.bytedance.ee.larkbrand.utils;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.bytedance.ee.ref.impl.host.HostInterface;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.ee.larkbrand.utils.c */
public class C13336c {

    /* renamed from: com.bytedance.ee.larkbrand.utils.c$d */
    public static class C13340d {

        /* renamed from: a */
        public boolean f35242a;

        /* renamed from: b */
        public Exception f35243b;

        public C13340d() {
        }

        public C13340d(boolean z, Exception exc) {
            this.f35242a = z;
            this.f35243b = exc;
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.utils.c$a */
    private static final class C13337a {
        /* renamed from: a */
        public static C13340d m54309a(ClassLoader classLoader, String str) {
            C13340d dVar = new C13340d();
            try {
                Class.forName("dalvik.system.DexPathList");
                C13343d.m54320a(C13343d.m54316a((Class) Class.forName("dalvik.system.BaseDexClassLoader"), "pathList").get(classLoader), "nativeLibraryDirectories", new File[]{new File(str)});
                dVar.f35242a = true;
            } catch (Exception e) {
                dVar.f35242a = false;
                dVar.f35243b = e;
            }
            return dVar;
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.utils.c$b */
    private static final class C13338b {
        /* renamed from: a */
        public static C13340d m54310a(ClassLoader classLoader, String str) {
            C13340d dVar = new C13340d();
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList");
                Object obj = C13343d.m54316a((Class) Class.forName("dalvik.system.BaseDexClassLoader"), "pathList").get(classLoader);
                C13343d.m54318a(ArrayList.class, "add", (Class<?>[]) new Class[]{Object.class}).invoke(C13343d.m54316a((Class) cls, "nativeLibraryDirectories").get(obj), new File(str));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new File(str));
                if (Build.VERSION.SDK_INT < 26) {
                    C13343d.m54320a(obj, "nativeLibraryPathElements", C13342f.m54315a(obj, arrayList, null, new ArrayList()));
                } else {
                    C13343d.m54320a(obj, "nativeLibraryPathElements", C13336c.m54307a(cls, obj, arrayList));
                }
                dVar.f35242a = true;
            } catch (Exception e) {
                dVar.f35242a = false;
                dVar.f35243b = e;
            }
            return dVar;
        }
    }

    /* renamed from: com.bytedance.ee.larkbrand.utils.c$c */
    private static final class C13339c {
        /* renamed from: a */
        public static C13340d m54311a(ClassLoader classLoader, String str) {
            C13340d dVar = new C13340d();
            try {
                Class<?> cls = Class.forName("dalvik.system.DexPathList");
                Object obj = C13343d.m54316a((Class) Class.forName("dalvik.system.BaseDexClassLoader"), "pathList").get(classLoader);
                Method a = C13343d.m54318a((Class) cls, "addNativePath", (Class<?>[]) new Class[]{Collection.class});
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                a.invoke(obj, arrayList);
                dVar.f35242a = true;
            } catch (Exception e) {
                dVar.f35242a = false;
                dVar.f35243b = e;
            }
            return dVar;
        }
    }

    /* renamed from: a */
    public static C13340d m54306a(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return new C13340d(false, new Exception("addLibraryPath classloader empty!!"));
        }
        if (TextUtils.isEmpty(str)) {
            return new C13340d(false, new Exception("addLibraryPath pluginPkg empty!!"));
        }
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (hostInterface == null) {
            return new C13340d(false, new Exception("addLibraryPath hostInterface empty!!"));
        }
        String miraPluginNativeDir = hostInterface.getMiraPluginNativeDir(str);
        if (TextUtils.isEmpty(miraPluginNativeDir)) {
            return new C13340d(false, new Exception("addLibraryPath pluginLibPath empty!!"));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return C13339c.m54311a(classLoader, miraPluginNativeDir);
        }
        if (Build.VERSION.SDK_INT > 22) {
            return C13338b.m54310a(classLoader, miraPluginNativeDir);
        }
        return C13337a.m54309a(classLoader, miraPluginNativeDir);
    }

    /* renamed from: b */
    public static C13340d m54308b(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return new C13340d(false, new Exception("addAdditionalDexFiles classloader empty!!"));
        }
        if (TextUtils.isEmpty(str)) {
            return new C13340d(false, new Exception("addAdditionalDexFiles pluginPkg empty!!"));
        }
        HostInterface hostInterface = HostExtensionManager.getInstance().getHostInterface();
        if (hostInterface == null) {
            return new C13340d(false, new Exception("addAdditionalDexFiles hostInterface empty!!"));
        }
        String miraPluginSoureFile = hostInterface.getMiraPluginSoureFile(str);
        if (TextUtils.isEmpty(miraPluginSoureFile)) {
            return new C13340d(false, new Exception("addAdditionalDexFiles pluginApkPath empty!!"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new File(miraPluginSoureFile));
        if (Build.VERSION.SDK_INT >= 23) {
            return C13342f.m54314a(classLoader, arrayList, null);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return C13341e.m54312a(classLoader, arrayList, null);
        }
        return new C13340d();
    }

    /* renamed from: a */
    public static Object[] m54307a(Class cls, Object obj, List<File> list) {
        try {
            return (Object[]) C13343d.m54318a(cls, "makePathElements", (Class<?>[]) new Class[]{List.class}).invoke(obj, list);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.utils.c$e */
    public static final class C13341e {
        /* renamed from: a */
        public static C13340d m54312a(ClassLoader classLoader, List<File> list, File file) {
            C13340d dVar = new C13340d();
            try {
                Object obj = C13343d.m54317a(classLoader, "pathList").get(classLoader);
                ArrayList arrayList = new ArrayList();
                C13343d.m54320a(obj, "dexElements", m54313a(obj, new ArrayList(list), file, arrayList));
                if (arrayList.size() > 0) {
                    dVar.f35242a = false;
                    dVar.f35243b = (Exception) arrayList.get(0);
                    return dVar;
                }
                dVar.f35242a = true;
                return dVar;
            } catch (Exception e) {
                dVar.f35242a = false;
                dVar.f35243b = e;
            }
        }

        /* renamed from: a */
        public static Object[] m54313a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            Method a = C13343d.m54319a(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class});
            if (a == null) {
                a = C13343d.m54319a(obj, "makeDexElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
            }
            if (a == null) {
                return null;
            }
            try {
                return (Object[]) a.invoke(obj, arrayList, file, arrayList2);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.larkbrand.utils.c$f */
    public static final class C13342f {
        /* renamed from: a */
        public static C13340d m54314a(ClassLoader classLoader, List<File> list, File file) {
            C13340d dVar = new C13340d();
            try {
                Object obj = C13343d.m54317a(classLoader, "pathList").get(classLoader);
                ArrayList arrayList = new ArrayList();
                C13343d.m54320a(obj, "dexElements", m54315a(obj, new ArrayList(list), file, arrayList));
                if (arrayList.size() > 0) {
                    dVar.f35242a = false;
                    dVar.f35243b = (Exception) arrayList.get(0);
                    return dVar;
                }
                dVar.f35242a = true;
                return dVar;
            } catch (Exception e) {
                dVar.f35242a = false;
                dVar.f35243b = e;
            }
        }

        /* renamed from: a */
        public static Object[] m54315a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            Method a = C13343d.m54319a(obj, "makePathElements", (Class<?>[]) new Class[]{List.class, File.class, List.class});
            if (a == null) {
                a = C13343d.m54319a(obj, "makePathElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class});
            }
            if (a == null) {
                try {
                    return C13341e.m54313a(obj, arrayList, file, arrayList2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                return (Object[]) a.invoke(obj, arrayList, file, arrayList2);
            }
        }
    }
}
