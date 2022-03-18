package com.ss.android.ugc.aweme.framework.services;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.framework.services.a */
public class C60451a {

    /* renamed from: a */
    private static final String[] f151048a = {"services/", "services/AwemeLive/", "services/AwemeIM/", "services/AwemeReactNative/", "services/AwemePush/", "services/AwemeShare/", "services/AwemeMain/", "services/AwemePlugin/", "services/SdkDebugger/", "services/AwemeMusic/", "services/AwemeVideo/", "services/AwemeFramework/", "services/AwemeCommerce/"};

    /* renamed from: b */
    private static final Map<String, List<C60452a>> f151049b = Collections.synchronizedMap(new LinkedHashMap());

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.a$b */
    public static class C60453b<T> implements Iterator<T> {

        /* renamed from: a */
        private List<C60452a> f151053a;

        /* renamed from: b */
        private ClassLoader f151054b;

        /* renamed from: c */
        private Class f151055c;

        /* renamed from: d */
        private int f151056d;

        public boolean hasNext() {
            List<C60452a> list = this.f151053a;
            if (list == null || this.f151056d >= list.size()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            C60452a aVar = this.f151053a.get(this.f151056d);
            this.f151056d++;
            synchronized (aVar) {
                if (aVar.f151051b && aVar.f151052c != null) {
                    return (T) aVar.f151052c;
                } else if (!aVar.f151051b) {
                    return m234887a(aVar);
                } else {
                    aVar.f151052c = m234887a(aVar);
                    return (T) aVar.f151052c;
                }
            }
        }

        /* renamed from: a */
        private T m234887a(C60452a aVar) {
            try {
                Class<?> cls = Class.forName(aVar.f151050a, false, this.f151054b);
                if (this.f151055c.isAssignableFrom(cls)) {
                    try {
                        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        return (T) declaredConstructor.newInstance(new Object[0]);
                    } catch (InstantiationException e) {
                        throw new RuntimeException(e);
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (NoSuchMethodException e3) {
                        throw new RuntimeException(e3);
                    } catch (InvocationTargetException e4) {
                        throw new RuntimeException(e4);
                    }
                } else {
                    throw new RuntimeException(new ClassCastException("source: " + cls.getName() + ", dest: " + this.f151055c.getName()));
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(e5);
            }
        }

        public C60453b(List<C60452a> list, Class<T> cls, ClassLoader classLoader) {
            this.f151054b = classLoader;
            this.f151055c = cls;
            this.f151053a = list;
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m234881a(Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return new C60453b(m234882a(cls, classLoader), cls, classLoader);
    }

    /* renamed from: a */
    private static void m234884a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.ugc.aweme.framework.services.a$a */
    public static class C60452a {

        /* renamed from: a */
        public final String f151050a;

        /* renamed from: b */
        public final boolean f151051b;

        /* renamed from: c */
        public Object f151052c;

        /* renamed from: a */
        public static C60452a m234886a(String str) {
            if (str == null || "".equals(str)) {
                return null;
            }
            String[] split = str.split(":");
            boolean z = false;
            String str2 = split[0];
            if (split.length > 1) {
                z = Boolean.parseBoolean(split[1]);
            }
            return new C60452a(str2, z);
        }

        public C60452a(String str, boolean z) {
            this.f151050a = str;
            this.f151051b = z;
        }
    }

    /* renamed from: b */
    private static List<C60452a> m234885b(URL url) {
        InputStream inputStream;
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        IOException e;
        LinkedList linkedList = new LinkedList();
        BufferedReader bufferedReader2 = null;
        try {
            inputStream = url.openStream();
            try {
                inputStreamReader = new InputStreamReader(inputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                } catch (IOException e2) {
                    bufferedReader = null;
                    e = e2;
                    try {
                        e.printStackTrace();
                        m234884a(bufferedReader);
                        m234884a(inputStreamReader);
                        m234884a(inputStream);
                        return linkedList;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        m234884a(bufferedReader2);
                        m234884a(inputStreamReader);
                        m234884a(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    m234884a(bufferedReader2);
                    m234884a(inputStreamReader);
                    m234884a(inputStream);
                    throw th;
                }
                try {
                    for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                        C60452a a = C60452a.m234886a(readLine);
                        if (a != null) {
                            linkedList.add(a);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    m234884a(bufferedReader);
                    m234884a(inputStreamReader);
                    m234884a(inputStream);
                    return linkedList;
                }
            } catch (IOException e4) {
                bufferedReader = null;
                e = e4;
                inputStreamReader = null;
                e.printStackTrace();
                m234884a(bufferedReader);
                m234884a(inputStreamReader);
                m234884a(inputStream);
                return linkedList;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
                m234884a(bufferedReader2);
                m234884a(inputStreamReader);
                m234884a(inputStream);
                throw th;
            }
        } catch (IOException e5) {
            inputStreamReader = null;
            bufferedReader = null;
            e = e5;
            inputStream = null;
            e.printStackTrace();
            m234884a(bufferedReader);
            m234884a(inputStreamReader);
            m234884a(inputStream);
            return linkedList;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            inputStreamReader = null;
            m234884a(bufferedReader2);
            m234884a(inputStreamReader);
            m234884a(inputStream);
            throw th;
        }
        m234884a(bufferedReader);
        m234884a(inputStreamReader);
        m234884a(inputStream);
        return linkedList;
    }

    /* renamed from: a */
    private static List<C60452a> m234883a(URL url) {
        for (int i = 0; i < 3; i++) {
            try {
                return m234885b(url);
            } catch (ConcurrentModificationException e) {
                if (i < 2) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    throw e;
                }
            }
        }
        return new LinkedList();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r4 = m234880a(r6, r7, r1[r3]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r4 == null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r4.hasMoreElements() == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0.addAll(m234883a(r4.nextElement()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r7 = com.ss.android.ugc.aweme.framework.services.C60451a.f151049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r7.containsKey(r6.getName()) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r7.put(r6.getName(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = r7.get(r6.getName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = new java.util.LinkedList<>();
        r1 = com.ss.android.ugc.aweme.framework.services.C60451a.f151048a;
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r3 >= r2) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> java.util.List<com.ss.android.ugc.aweme.framework.services.C60451a.C60452a> m234882a(java.lang.Class<T> r6, java.lang.ClassLoader r7) {
        /*
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.a$a>> r0 = com.ss.android.ugc.aweme.framework.services.C60451a.f151049b
            monitor-enter(r0)
            java.lang.String r1 = r6.getName()     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0061 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String[] r1 = com.ss.android.ugc.aweme.framework.services.C60451a.f151048a
            int r2 = r1.length
            r3 = 0
        L_0x001b:
            if (r3 >= r2) goto L_0x003c
            r4 = r1[r3]
            java.util.Enumeration r4 = m234880a(r6, r7, r4)
        L_0x0023:
            if (r4 == 0) goto L_0x0039
            boolean r5 = r4.hasMoreElements()
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.nextElement()
            java.net.URL r5 = (java.net.URL) r5
            java.util.List r5 = m234883a(r5)
            r0.addAll(r5)
            goto L_0x0023
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x001b
        L_0x003c:
            java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.framework.services.a$a>> r7 = com.ss.android.ugc.aweme.framework.services.C60451a.f151049b
            monitor-enter(r7)
            java.lang.String r1 = r6.getName()     // Catch:{ all -> 0x005e }
            boolean r1 = r7.containsKey(r1)     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0051
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x005e }
            r7.put(r6, r0)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0051:
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x005e }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x005e }
            r0 = r6
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x005e }
            return r0
        L_0x005e:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x005e }
            throw r6
        L_0x0061:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.framework.services.C60451a.m234882a(java.lang.Class, java.lang.ClassLoader):java.util.List");
    }

    /* renamed from: a */
    private static Enumeration<URL> m234880a(Class cls, ClassLoader classLoader, String str) {
        String str2 = str + cls.getName();
        if (classLoader == null) {
            try {
                return ClassLoader.getSystemResources(str2);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                return classLoader.getResources(str2);
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        }
    }
}
