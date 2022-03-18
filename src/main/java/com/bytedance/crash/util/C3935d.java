package com.bytedance.crash.util;

import com.bytedance.crash.C3774m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.util.d */
public final class C3935d {

    /* renamed from: a */
    private static final HashMap<String, C3936a> f12034a = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.util.d$a */
    public static class C3936a {

        /* renamed from: a */
        File f12035a;

        /* renamed from: b */
        int f12036b;

        /* renamed from: c */
        int f12037c;

        /* renamed from: d */
        int f12038d;

        /* renamed from: e */
        int f12039e = 1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15630a() {
            try {
                File file = this.f12035a;
                C3949m.m16402a(file, this.f12036b + "\n" + this.f12037c + "\n" + this.f12038d + "\n" + this.f12039e, false);
            } catch (IOException unused) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15631a(int i) {
            this.f12037c = 0;
            this.f12038d = 0;
            this.f12039e = 1;
            this.f12036b = i;
        }

        C3936a(File file) {
            this.f12035a = file;
            try {
                if (file.exists()) {
                    JSONArray b = C3949m.m16417b(file);
                    this.f12036b = Integer.parseInt(b.optString(0));
                    this.f12037c = Integer.parseInt(b.optString(1));
                    this.f12038d = Integer.parseInt(b.optString(2));
                    this.f12039e = Integer.parseInt(b.optString(3));
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static C3936a m16346a(String str) {
        HashMap<String, C3936a> hashMap = f12034a;
        C3936a aVar = hashMap.get(str);
        if (aVar != null) {
            return aVar;
        }
        C3936a aVar2 = new C3936a(new File(C3962t.m16502f(C3774m.m15609j()), str));
        hashMap.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public static boolean m16349a(String str, int i) {
        C3936a a = m16346a(str);
        if (a.f12039e == 1 || a.f12036b != i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m16347a(String str, int i, int i2) {
        m16348a(true, str, i, i2);
    }

    /* renamed from: b */
    public static void m16350b(String str, int i, int i2) {
        C3968x.m16530a((Object) (str + " failed ver " + i));
        m16348a(false, str, i, i2);
    }

    /* renamed from: a */
    private static void m16348a(boolean z, String str, int i, int i2) {
        C3936a a = m16346a(str);
        if (i != a.f12036b) {
            a.mo15631a(i);
        }
        if (a.f12039e == 1) {
            if (z) {
                a.f12037c++;
                if (i2 <= a.f12037c) {
                    a.f12038d = 0;
                }
            } else {
                a.f12038d++;
                if (i2 <= a.f12038d) {
                    a.f12037c = 0;
                    a.f12039e = 0;
                }
            }
            a.mo15630a();
        }
    }
}
