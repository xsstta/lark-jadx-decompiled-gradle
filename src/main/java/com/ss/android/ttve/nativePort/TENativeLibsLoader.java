package com.ss.android.ttve.nativePort;

import android.content.Context;
import android.util.Log;
import com.bef.effectsdk.C2079b;
import com.ss.android.ttve.log.C60193a;
import com.ss.android.vesdk.runtime.C64065g;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TENativeLibsLoader {

    /* renamed from: a */
    public static final String f150367a = TENativeLibsLoader.class.getSimpleName();

    /* renamed from: b */
    public static Context f150368b;

    /* renamed from: c */
    private static volatile LoadStatus f150369c = LoadStatus.NOT_LOAD;

    /* renamed from: d */
    private static boolean f150370d;

    /* renamed from: e */
    private static AbstractC60250d f150371e = null;

    /* renamed from: f */
    private static AbstractC60249c f150372f = null;

    /* renamed from: g */
    private static AbstractC60250d f150373g = new C60248b();

    /* renamed from: h */
    private static AbstractC60249c f150374h = new C60247a();

    /* renamed from: i */
    private static ArrayList<C60251e> f150375i = new ArrayList<>();

    /* renamed from: j */
    private static List<String> f150376j = C2079b.m9045a();

    /* renamed from: k */
    private static boolean f150377k = false;

    /* renamed from: l */
    private static boolean f150378l = false;

    public enum LoadStatus {
        NOT_LOAD,
        LOADING,
        LOADED
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$a */
    public static class C60247a implements AbstractC60249c {
        @Override // com.ss.android.ttve.nativePort.TENativeLibsLoader.AbstractC60249c
        /* renamed from: a */
        public void mo206228a(String[] strArr) {
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$c */
    public interface AbstractC60249c {
        /* renamed from: a */
        void mo206228a(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$d */
    public interface AbstractC60250d {
        /* renamed from: a */
        boolean mo206229a(List<String> list);
    }

    /* renamed from: b */
    public static synchronized void m234146b() {
        synchronized (TENativeLibsLoader.class) {
            m234143a();
        }
    }

    /* renamed from: c */
    public static synchronized void m234147c() {
        synchronized (TENativeLibsLoader.class) {
            m234143a();
        }
    }

    /* renamed from: d */
    public static synchronized void m234148d() {
        synchronized (TENativeLibsLoader.class) {
            m234143a();
        }
    }

    /* renamed from: a */
    public static synchronized void m234143a() {
        synchronized (TENativeLibsLoader.class) {
            if (!f150370d) {
                m234149e();
            } else {
                m234145a("ttvesdk");
            }
        }
    }

    /* renamed from: g */
    protected static void m234151g() {
        List<String> f = m234150f();
        Collections.reverse(f);
        for (String str : f) {
            f150375i.add(new C60251e(str));
        }
    }

    /* renamed from: f */
    public static List<String> m234150f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("x264");
        arrayList.add("fdk-aac");
        arrayList.addAll(FFmpegLibLoaderWrapper.m256493a());
        arrayList.add("yuv");
        arrayList.add("bytenn");
        for (String str : f150376j) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        arrayList.add("ttvesdk");
        return arrayList;
    }

    /* renamed from: e */
    protected static void m234149e() {
        if (f150369c != LoadStatus.LOADED) {
            List<String> f = m234150f();
            String[] strArr = new String[f.size()];
            for (int i = 0; i < f.size(); i++) {
                if (!f.get(i).contentEquals("c++_shared") && !f.get(i).contentEquals("ttboringssl") && !f.get(i).contentEquals("ttcrypto")) {
                    strArr[i] = "lib" + f.get(i) + ".so";
                }
            }
            f150369c = LoadStatus.LOADING;
            AbstractC60250d dVar = f150371e;
            if (dVar != null) {
                if (!dVar.mo206229a(f)) {
                    f150369c = LoadStatus.NOT_LOAD;
                    return;
                }
            } else if (!f150373g.mo206229a(f)) {
                f150369c = LoadStatus.NOT_LOAD;
                return;
            }
            f150369c = LoadStatus.LOADED;
            AbstractC60249c cVar = f150372f;
            if (cVar != null) {
                cVar.mo206228a(strArr);
            }
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$e */
    public static class C60251e {

        /* renamed from: a */
        public String f150379a;

        /* renamed from: b */
        public volatile boolean f150380b;

        public C60251e(String str) {
            this.f150379a = str;
        }
    }

    /* renamed from: a */
    public static synchronized void m234144a(Context context) {
        synchronized (TENativeLibsLoader.class) {
            f150368b = context;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.TENativeLibsLoader$b */
    public static class C60248b implements AbstractC60250d {
        @Override // com.ss.android.ttve.nativePort.TENativeLibsLoader.AbstractC60250d
        /* renamed from: a */
        public boolean mo206229a(List<String> list) {
            Log.e(TENativeLibsLoader.f150367a, "Load library start...");
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : list) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C60193a.m233973a(3, "Start loadLibrary " + str);
                if (!C64065g.m251433a(str, TENativeLibsLoader.f150368b)) {
                    String str2 = TENativeLibsLoader.f150367a;
                    Log.e(str2, "loadLibrary " + str + " failed");
                    return false;
                }
                long currentTimeMillis3 = System.currentTimeMillis();
                String str3 = TENativeLibsLoader.f150367a;
                Log.e(str3, "Load " + str + " cost " + (currentTimeMillis3 - currentTimeMillis) + "ms");
                String str4 = TENativeLibsLoader.f150367a;
                Log.w(str4, "Finish loadLibrary " + str + " cost time:" + (System.currentTimeMillis() - currentTimeMillis2));
                currentTimeMillis = currentTimeMillis3;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m234145a(String str) {
        if (f150375i.size() <= 0) {
            m234151g();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C60251e> it = f150375i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C60251e next = it.next();
            if (str == next.f150379a) {
                if (next.f150380b) {
                    String str2 = f150367a;
                    Log.i(str2, next.f150379a + " is loaded.");
                    return;
                }
                next.f150380b = true;
                linkedList.add(next.f150379a);
            }
        }
        while (it.hasNext()) {
            C60251e next2 = it.next();
            if (next2.f150380b) {
                break;
            }
            next2.f150380b = true;
            linkedList.add(next2.f150379a);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            strArr[i] = "lib" + ((String) linkedList.get(i)) + ".so";
        }
        f150369c = LoadStatus.LOADING;
        AbstractC60250d dVar = f150371e;
        if (dVar != null) {
            if (!dVar.mo206229a(linkedList)) {
                f150369c = LoadStatus.NOT_LOAD;
                return;
            }
        } else if (!f150373g.mo206229a(linkedList)) {
            f150369c = LoadStatus.NOT_LOAD;
            return;
        }
        f150369c = LoadStatus.LOADED;
        AbstractC60249c cVar = f150372f;
        if (cVar != null) {
            cVar.mo206228a(strArr);
        }
    }
}
