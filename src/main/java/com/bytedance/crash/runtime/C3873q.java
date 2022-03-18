package com.bytedance.crash.runtime;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.util.C3928ab;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.q */
public class C3873q {

    /* renamed from: a */
    private static C3873q f11860a;

    /* renamed from: b */
    private final File f11861b;

    /* renamed from: c */
    private final File f11862c;

    /* renamed from: d */
    private final File f11863d;

    /* renamed from: e */
    private final Context f11864e;

    /* renamed from: f */
    private int f11865f = -1;

    /* renamed from: g */
    private C3877a f11866g;

    /* renamed from: h */
    private File[] f11867h;

    /* renamed from: a */
    public JSONObject mo15489a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str) || C3933b.m16333a(this.f11864e, str)) {
            str = "main";
        }
        File a = C3962t.m16482a(this.f11864e, str);
        C3877a a2 = m16031a(a, j, j2);
        boolean z = false;
        if (a2 == null) {
            a2 = m16039c(a, j2);
            z = true;
        }
        JSONObject jSONObject = null;
        if (a2 != null) {
            try {
                jSONObject = new JSONObject(C3949m.m16421c(a2.f11874c.getAbsolutePath()));
            } catch (Throwable unused) {
            }
            if (a2.f11875d != 0) {
                C3742b.m15431a(jSONObject, "header", "version_get_time", a2.f11875d);
            }
            if (z && jSONObject != null) {
                jSONObject.remove("filters");
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONArray mo15488a(long j) {
        C3877a b = m16038b(this.f11861b, j);
        if (b == null) {
            b = m16041d(this.f11861b, j);
        }
        if (b == null) {
            return null;
        }
        try {
            return new JSONArray(C3949m.m16421c(b.f11874c.getAbsolutePath()));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private File[] m16037a(File file) {
        if (this.f11867h == null) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                /* class com.bytedance.crash.runtime.C3873q.C38741 */

                public boolean accept(File file, String str) {
                    if (!str.contains(".ctx") || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                        return false;
                    }
                    return true;
                }
            });
            this.f11867h = listFiles;
            if (listFiles == null) {
                this.f11867h = new File[0];
            }
        }
        return this.f11867h;
    }

    /* renamed from: a */
    public int mo15487a(String str) {
        int i = this.f11865f;
        if (i != -1) {
            return i;
        }
        File[] a = m16037a(this.f11861b);
        if (a == null || a.length == 0) {
            this.f11865f = 2;
            return 2;
        }
        long j = -1;
        File file = null;
        for (File file2 : a) {
            try {
                long parseLong = Long.parseLong(file2.getName().split("-|\\.")[1]);
                if (parseLong > j) {
                    file = file2;
                    j = parseLong;
                }
            } catch (Throwable unused) {
                if (file == null) {
                    file = file2;
                }
            }
        }
        if (file == null) {
            this.f11865f = 2;
            return 2;
        }
        try {
            String a2 = new C3877a(file).mo15500a();
            if (!TextUtils.isEmpty(a2) && !TextUtils.equals(str, a2)) {
                this.f11865f = 1;
                return 1;
            }
        } catch (Throwable th) {
            C3968x.m16534a(th);
        }
        this.f11865f = 0;
        return 0;
    }

    /* renamed from: a */
    public void mo15490a(Map<String, Object> map, JSONArray jSONArray) {
        if (map != null) {
            map.putAll(C3928ab.m16294a());
            JSONObject a = Header.m15398a(this.f11864e).mo15220a(map);
            if (!Header.m15406c(a)) {
                C3742b bVar = new C3742b();
                bVar.mo15239a(a);
                bVar.mo15230a(C3774m.m15591a().mo15458c());
                bVar.mo15243b(C3774m.m15602c().getTagMap());
                bVar.mo15228a(C3774m.m15618s(), C3774m.m15619t());
                long m = C3774m.m15612m();
                long currentTimeMillis = System.currentTimeMillis();
                C3877a d = m16040d();
                if (d == null) {
                    m16035a(m, currentTimeMillis, bVar.mo15252e(), jSONArray);
                    return;
                }
                int a2 = m16030a(d.mo15502b(), bVar.mo15252e());
                if (a2 == 1) {
                    m16035a(d.f11872a, currentTimeMillis, bVar.mo15252e(), jSONArray);
                    C3949m.m16412a(d.f11874c);
                } else if (a2 == 2) {
                    m16035a(m, currentTimeMillis, bVar.mo15252e(), jSONArray);
                } else if (a2 == 3) {
                    d.mo15501a(currentTimeMillis);
                }
                m16036a(this.f11861b, currentTimeMillis);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.crash.runtime.q$a */
    public static class C3877a {

        /* renamed from: a */
        public final long f11872a;

        /* renamed from: b */
        public long f11873b;

        /* renamed from: c */
        public final File f11874c;

        /* renamed from: d */
        long f11875d;

        /* renamed from: e */
        private JSONObject f11876e;

        /* renamed from: c */
        public void mo15503c() {
            this.f11874c.delete();
        }

        /* renamed from: e */
        private JSONObject m16053e() {
            return mo15502b().optJSONObject("header");
        }

        /* renamed from: d */
        private String m16052d() {
            return this.f11872a + "-" + this.f11873b + ".ctx2";
        }

        /* renamed from: a */
        public String mo15500a() {
            Object obj;
            if (m16053e() != null) {
                obj = m16053e().opt("update_version_code");
            } else {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            return String.valueOf(obj);
        }

        /* renamed from: b */
        public JSONObject mo15502b() {
            if (this.f11876e == null) {
                try {
                    this.f11876e = new JSONObject(C3949m.m16421c(this.f11874c.getAbsolutePath()));
                } catch (Throwable unused) {
                }
                if (this.f11876e == null) {
                    this.f11876e = new JSONObject();
                }
            }
            return this.f11876e;
        }

        private C3877a(File file) {
            this.f11874c = file;
            String[] split = file.getName().split("-|\\.");
            this.f11872a = Long.parseLong(split[0]);
            this.f11873b = Long.parseLong(split[1]);
        }

        /* renamed from: a */
        public void mo15501a(long j) {
            this.f11873b = j;
            this.f11874c.renameTo(new File(this.f11874c.getParent(), m16052d()));
        }
    }

    /* renamed from: d */
    private C3877a m16040d() {
        if (this.f11866g == null) {
            m16034a(this.f11861b, ".ctx2");
        }
        return this.f11866g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo15493c() {
        try {
            return C3949m.m16421c(this.f11862c.getAbsolutePath());
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: a */
    public static C3873q m16033a() {
        if (f11860a == null) {
            f11860a = new C3873q(C3774m.m15609j());
        }
        return f11860a;
    }

    /* renamed from: b */
    public void mo15492b() {
        if (this.f11865f == -1) {
            File[] a = m16037a(this.f11861b);
            if (a == null || a.length == 0) {
                this.f11865f = 2;
            }
        }
    }

    /* renamed from: b */
    public String mo15491b(String str) {
        try {
            return C3949m.m16421c(this.f11863d.getAbsolutePath());
        } catch (Throwable unused) {
            return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo15494c(String str) {
        try {
            C3949m.m16402a(this.f11862c, str, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public void mo15495d(String str) {
        try {
            C3949m.m16402a(this.f11863d, str, false);
        } catch (Throwable unused) {
        }
    }

    private C3873q(Context context) {
        File e = C3962t.m16499e(context);
        if (!e.exists() || (!e.isDirectory() && e.delete())) {
            e.mkdirs();
            C3824a.m15816a();
        }
        this.f11861b = e;
        this.f11862c = new File(e.getParent(), "did");
        this.f11863d = new File(e.getParent(), "device_uuid");
        this.f11864e = context;
    }

    /* renamed from: c */
    private C3877a m16039c(File file, long j) {
        return m16032a(file, j, ".ctx2");
    }

    /* renamed from: d */
    private C3877a m16041d(File file, long j) {
        return m16032a(file, j, ".allData");
    }

    /* renamed from: a */
    private static int m16030a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (Header.m15406c(jSONObject)) {
            return 2;
        }
        if (Header.m15406c(jSONObject2)) {
            return 0;
        }
        if (!String.valueOf(jSONObject2.opt("update_version_code")).equals(String.valueOf(jSONObject.opt("update_version_code"))) || !Header.m15407d(jSONObject)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    private C3877a m16038b(File file, long j) {
        Iterator<C3877a> it = m16034a(file, ".allData").iterator();
        while (it.hasNext()) {
            C3877a next = it.next();
            if (j >= next.f11872a && j <= next.f11873b) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    private ArrayList<C3877a> m16034a(File file, final String str) {
        File[] listFiles = file.listFiles(new FilenameFilter() {
            /* class com.bytedance.crash.runtime.C3873q.C38752 */

            public boolean accept(File file, String str) {
                if (!str.endsWith(str) || !Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
                    return false;
                }
                return true;
            }
        });
        ArrayList<C3877a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        C3968x.m16530a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        C3877a aVar = null;
        for (File file2 : listFiles) {
            try {
                C3877a aVar2 = new C3877a(file2);
                arrayList.add(aVar2);
                if (this.f11866g == null && ".ctx2".equals(str)) {
                    if (aVar != null) {
                        if (aVar2.f11873b < aVar.f11873b) {
                        }
                    }
                    aVar = aVar2;
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        if (this.f11866g == null && aVar != null) {
            this.f11866g = aVar;
        }
        Collections.sort(arrayList, new Comparator<C3877a>() {
            /* class com.bytedance.crash.runtime.C3873q.C38763 */

            /* renamed from: a */
            public int compare(C3877a aVar, C3877a aVar2) {
                return (int) (aVar.f11873b - aVar2.f11873b);
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private void m16036a(File file, long j) {
        try {
            ArrayList<C3877a> a = m16034a(file, "");
            if (a.size() > 16) {
                for (int i = 0; i < a.size() - 8; i++) {
                    a.get(i).mo15503c();
                }
            }
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    private C3877a m16031a(File file, long j, long j2) {
        Iterator<C3877a> it = m16034a(file, ".ctx2").iterator();
        C3877a aVar = null;
        while (it.hasNext()) {
            C3877a next = it.next();
            if (j == next.f11872a) {
                if (aVar == null) {
                    aVar = next;
                }
                if (j2 >= next.f11873b) {
                    aVar = next;
                }
            } else if (aVar != null) {
                break;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private C3877a m16032a(File file, long j, String str) {
        Iterator<C3877a> it = m16034a(file, str).iterator();
        C3877a aVar = null;
        while (it.hasNext()) {
            C3877a next = it.next();
            if (j > next.f11873b) {
                next.f11875d = next.f11873b;
                aVar = next;
            } else if (aVar != null) {
                return aVar;
            } else {
                next.f11875d = next.f11873b;
                return next;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private void m16035a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f11861b;
        File file2 = new File(file, j + "-" + j2 + ".ctx2");
        File file3 = this.f11861b;
        File file4 = new File(file3, j + "-" + j2 + ".allData");
        try {
            C3949m.m16405a(file2, jSONObject, false);
            C3949m.m16404a(file4, jSONArray, false);
            this.f11866g = new C3877a(file2);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }
}
