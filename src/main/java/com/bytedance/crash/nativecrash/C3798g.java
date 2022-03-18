package com.bytedance.crash.nativecrash;

import android.text.TextUtils;
import com.bytedance.apm.p140f.C2934a;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.util.C3947k;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3965v;
import com.bytedance.crash.util.ListMap;
import com.bytedance.crash.util.NativeTools;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.g */
public class C3798g {

    /* renamed from: com.bytedance.crash.nativecrash.g$e */
    static class C3803e {

        /* renamed from: a */
        File f11687a;

        /* renamed from: b */
        String f11688b;

        /* renamed from: c */
        String f11689c;

        /* renamed from: d */
        int f11690d;

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo15329a() {
            /*
                r5 = this;
                java.io.File r0 = r5.f11687a
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x004f
                java.io.File r0 = r5.f11687a
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x004f
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r5.f11687a     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = -1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r5.mo15330a(r2)     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x002d
                goto L_0x0020
            L_0x002d:
                com.bytedance.crash.util.C3954p.m16437a(r3)
                goto L_0x0047
            L_0x0031:
                r1 = move-exception
                r2 = r0
                r0 = r3
                goto L_0x0038
            L_0x0035:
                r2 = move-exception
                r1 = r2
                r2 = -1
            L_0x0038:
                com.bytedance.crash.c r3 = com.bytedance.crash.C3691b.m15203a()     // Catch:{ all -> 0x0048 }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo15177a(r4, r1)     // Catch:{ all -> 0x0048 }
                if (r0 == 0) goto L_0x0046
                com.bytedance.crash.util.C3954p.m16437a(r0)
            L_0x0046:
                r0 = r2
            L_0x0047:
                return r0
            L_0x0048:
                r1 = move-exception
                if (r0 == 0) goto L_0x004e
                com.bytedance.crash.util.C3954p.m16437a(r0)
            L_0x004e:
                throw r1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C3798g.C3803e.mo15329a():int");
        }

        C3803e(File file) {
            this.f11687a = file;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15330a(String str) {
            int i = this.f11690d;
            if (!str.startsWith(this.f11688b)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f11689c)[1].trim());
            } catch (NumberFormatException e) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$f */
    public static class C3804f extends C3803e {
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public HashMap<String, List<String>> mo15331b() {
            String str;
            ListMap listMap = new ListMap();
            try {
                JSONArray b = C3949m.m16418b(this.f11687a.getAbsolutePath());
                if (b == null) {
                    return listMap;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        if (optString.startsWith("[tid:0") && optString.endsWith("sigstack:0x0]")) {
                            int indexOf = optString.indexOf("[routine:0x");
                            int i2 = indexOf + 11;
                            int indexOf2 = optString.indexOf(93, i2);
                            if (indexOf > 0) {
                                str = optString.substring(i2, indexOf2);
                            } else {
                                str = "unknown addr";
                            }
                            listMap.getList(str).add(optString);
                        }
                    }
                }
                return listMap;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }

        C3804f(File file) {
            super(file);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$g */
    public static class C3805g extends C3803e {
        C3805g(File file) {
            super(file);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public JSONArray mo15332a(HashMap<String, List<String>> hashMap) {
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (hashMap.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray b = C3949m.m16418b(this.f11687a.getAbsolutePath());
                if (b == null) {
                    return jSONArray;
                }
                for (int i = 0; i < b.length(); i++) {
                    String optString = b.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        String substring = optString.substring(2, optString.indexOf(":"));
                        if (hashMap.containsKey(substring) && (list = hashMap.get(substring)) != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + " " + optString);
                            }
                            hashMap.remove(substring);
                        }
                    }
                }
                for (List<String> list2 : hashMap.values()) {
                    Iterator<String> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next() + "  0x000000:unknown");
                    }
                }
                return jSONArray;
            } catch (IOException unused) {
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$a */
    public static class C3799a extends C3803e {
        C3799a(File file) {
            super(file);
            this.f11688b = "Total FD Count:";
            this.f11689c = ":";
            this.f11690d = -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$b */
    public static class C3800b extends C3803e {
        C3800b(File file) {
            super(file);
            this.f11688b = "VmSize:";
            this.f11689c = "\\s+";
            this.f11690d = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$d */
    public static class C3802d extends C3803e {
        C3802d(File file) {
            super(file);
            this.f11688b = "VmRSS:";
            this.f11689c = "\\s+";
            this.f11690d = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.nativecrash.g$h */
    public static class C3806h extends C3803e {
        C3806h(File file) {
            super(file);
            this.f11688b = "Total Threads Count:";
            this.f11689c = ":";
            this.f11690d = -2;
        }
    }

    /* renamed from: a */
    public static int m15756a(String str) {
        return new C3799a(C3962t.m16497d(str)).mo15329a();
    }

    /* renamed from: b */
    public static int m15759b(String str) {
        return new C3806h(C3962t.m16501e(str)).mo15329a();
    }

    /* renamed from: c */
    public static int m15761c(String str) {
        return new C3800b(C3962t.m16504f(str)).mo15329a();
    }

    /* renamed from: d */
    public static int m15762d(String str) {
        return new C3802d(C3962t.m16504f(str)).mo15329a();
    }

    /* renamed from: com.bytedance.crash.nativecrash.g$c */
    public static class C3801c {

        /* renamed from: a */
        public int f11678a;

        /* renamed from: b */
        public int f11679b;

        /* renamed from: c */
        public int f11680c;

        /* renamed from: d */
        public int f11681d;

        /* renamed from: e */
        public int f11682e;

        /* renamed from: f */
        public String f11683f;

        /* renamed from: g */
        public String f11684g;

        /* renamed from: h */
        public JSONArray f11685h = new JSONArray();

        /* renamed from: i */
        public final Map<String, String> f11686i = new HashMap();

        /* renamed from: a */
        public void mo15328a(JSONObject jSONObject) {
            boolean z;
            boolean z2;
            C3742b.m15432a(jSONObject, "filters", "has_dump", "true");
            boolean z3 = true;
            if (((long) this.f11678a) > C3794e.m15727e()) {
                z = true;
            } else {
                z = false;
            }
            C3742b.m15432a(jSONObject, "filters", "memory_leak", String.valueOf(z));
            if (this.f11680c > 960) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3742b.m15432a(jSONObject, "filters", "fd_leak", String.valueOf(z2));
            if (this.f11681d <= 350) {
                z3 = false;
            }
            C3742b.m15432a(jSONObject, "filters", "threads_leak", String.valueOf(z3));
            C3742b.m15432a(jSONObject, "filters", "leak_threads_count", String.valueOf(this.f11682e));
            try {
                jSONObject.putOpt("memory_size", Integer.valueOf(this.f11678a));
                jSONObject.putOpt("rss", Integer.valueOf(this.f11679b));
            } catch (Throwable unused) {
            }
            C3742b.m15432a(jSONObject, "filters", "native_oom_reason", this.f11683f);
            C3742b.m15432a(jSONObject, "custom_long", "maps_size", this.f11685h);
            int i = this.f11678a;
            if (i > 1073741824 && i <= Integer.MIN_VALUE) {
                C3742b.m15432a(jSONObject, "filters", "vmsize_range", "1G < VmSize <= 2G");
            } else if (i > Integer.MIN_VALUE && i <= -1073741824) {
                C3742b.m15432a(jSONObject, "filters", "vmsize_range", "2G < VmSize <= 3G");
            } else if (i > -1073741824 && i <= 0) {
                C3742b.m15432a(jSONObject, "filters", "vmsize_range", "3G < VmSize <= 4G");
            } else if (i <= 0 || i > 0) {
                C3742b.m15432a(jSONObject, "filters", "vmsize_range", "VmSize > 8G");
            } else {
                C3742b.m15432a(jSONObject, "filters", "vmsize_range", "4G < VmSize <= 8G");
            }
            for (Map.Entry<String, String> entry : this.f11686i.entrySet()) {
                C3742b.m15432a(jSONObject, "filters", entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    public static JSONArray m15757a(File file, File file2) {
        return new C3805g(file2).mo15332a(new C3804f(file).mo15331b());
    }

    /* renamed from: a */
    public static void m15758a(String str, String str2) {
        File e = C3962t.m16501e(str);
        String absolutePath = C3962t.m16488b(C3774m.m15609j(), str).getAbsolutePath();
        if (!e.exists()) {
            NativeTools.m16236b().mo15609d(str2, absolutePath);
        } else {
            NativeTools.m16236b().mo15612e(str2, absolutePath);
        }
    }

    /* renamed from: b */
    public static C3801c m15760b(String str, String str2) {
        C3801c cVar = new C3801c();
        m15758a(str, str2);
        cVar.f11684g = str;
        cVar.f11678a = m15761c(str);
        cVar.f11680c = m15756a(str);
        cVar.f11681d = m15759b(str);
        cVar.f11679b = m15762d(str);
        C3947k.m16384a(C3962t.m16488b(C3774m.m15609j(), str), C3962t.m16497d(str));
        C3793d.m15717a(C3962t.m16497d(str), cVar.f11686i);
        JSONArray a = m15757a(C3962t.m16507g(str), C3962t.m16510h(str));
        cVar.f11682e = a.length();
        if (cVar.f11682e > 0) {
            try {
                C3949m.m16404a(C3962t.m16513i(str), a, false);
            } catch (Throwable unused) {
            }
        }
        String absolutePath = C3962t.m16488b(C3774m.m15609j(), str).getAbsolutePath();
        if (((long) cVar.f11678a) < C3794e.m15727e()) {
            String c = NativeTools.m16236b().mo15605c(str2, absolutePath);
            cVar.f11685h = C3955q.m16445a(C3965v.m16524a(absolutePath));
            if ("GPU".equals(c) || "THREAD_STACK".equals(c)) {
                cVar.f11683f = c;
            } else {
                cVar.f11683f = "EMPTY";
            }
            return cVar;
        }
        cVar.f11683f = NativeTools.m16236b().mo15605c(str2, absolutePath);
        Properties a2 = C3965v.m16524a(absolutePath);
        cVar.f11685h = C3955q.m16445a(a2);
        C2934a.m12392a(a2);
        return cVar;
    }
}
