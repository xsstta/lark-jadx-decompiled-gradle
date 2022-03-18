package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", "service", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.j */
public final class FastServiceLoader {

    /* renamed from: a */
    public static final FastServiceLoader f173830a = new FastServiceLoader();

    private FastServiceLoader() {
    }

    /* renamed from: a */
    public final List<MainDispatcherFactory> mo243001a() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C69569k.m267035a()) {
            return m267032b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m267032b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: a */
    private final List<String> m267030a(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return CollectionsKt.toList(linkedHashSet);
            }
            String substringBefore$default = StringsKt.substringBefore$default(readLine, "#", (String) null, 2, (Object) null);
            if (substringBefore$default != null) {
                String obj = StringsKt.trim((CharSequence) substringBefore$default).toString();
                String str = obj;
                boolean z3 = false;
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        z = true;
                        break;
                    }
                    char charAt = str.charAt(i);
                    if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (z) {
                    if (str.length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        linkedHashSet.add(obj);
                    }
                } else {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        kotlin.io.C69101b.m265907a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        kotlin.C69026a.m265651a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        kotlin.io.C69101b.m265907a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m267031a(java.net.URL r6) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.FastServiceLoader.m267031a(java.net.URL):java.util.List");
    }

    /* renamed from: b */
    private final <S> List<S> m267032b(Class<S> cls, ClassLoader classLoader) {
        try {
            return mo243002a(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: a */
    public final <S> List<S> mo243002a(Class<S> cls, ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        Intrinsics.checkExpressionValueIsNotNull(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            CollectionsKt.addAll(arrayList, f173830a.m267031a(url));
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (!set.isEmpty()) {
            Set<String> set2 = set;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
            for (String str : set2) {
                arrayList2.add(f173830a.m267029a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }

    /* renamed from: a */
    private final <S> S m267029a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }
}
