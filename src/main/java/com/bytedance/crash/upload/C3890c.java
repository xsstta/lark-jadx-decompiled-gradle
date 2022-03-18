package com.bytedance.crash.upload;

import android.content.Context;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.entity.C3748g;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.C3794e;
import com.bytedance.crash.nativecrash.C3798g;
import com.bytedance.crash.nativecrash.C3809i;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.p221e.C3729a;
import com.bytedance.crash.p223g.C3754a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3852f;
import com.bytedance.crash.runtime.C3853g;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3867o;
import com.bytedance.crash.util.C3927aa;
import com.bytedance.crash.util.C3931ae;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3953o;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3966w;
import com.bytedance.crash.util.NativeTools;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.c */
public final class C3890c {

    /* renamed from: c */
    private static volatile C3890c f11902c;

    /* renamed from: j */
    private static File f11903j;

    /* renamed from: a */
    public final Context f11904a;

    /* renamed from: b */
    public HashMap<String, C3897b> f11905b;

    /* renamed from: d */
    private final List<File> f11906d = new ArrayList();

    /* renamed from: e */
    private int f11907e = -1;

    /* renamed from: f */
    private volatile boolean f11908f;

    /* renamed from: g */
    private final Runnable f11909g = new Runnable() {
        /* class com.bytedance.crash.upload.C3890c.RunnableC38911 */

        public void run() {
            C3890c.this.mo15532f();
        }
    };

    /* renamed from: h */
    private final Runnable f11910h = new Runnable() {
        /* class com.bytedance.crash.upload.C3890c.RunnableC38922 */

        public void run() {
            C3890c.this.mo15531e();
        }
    };

    /* renamed from: i */
    private final Runnable f11911i = new Runnable() {
        /* class com.bytedance.crash.upload.C3890c.RunnableC38933 */

        /* renamed from: b */
        private int f11915b = 100;

        public void run() {
            if (!C3687a.m15191a().mo15099b() || !C3966w.m16528b(C3890c.this.f11904a)) {
                int i = this.f11915b - 1;
                this.f11915b = i;
                if (i > 0) {
                    C3866n.m16016b().mo15509a(this, 1000);
                    return;
                }
                return;
            }
            for (C3897b bVar : C3890c.this.f11905b.values()) {
                bVar.mo15538b();
                C3890c.this.mo15526a(bVar);
            }
            C3890c.this.f11905b = null;
        }
    };

    /* renamed from: d */
    public boolean mo15530d() {
        return this.f11908f;
    }

    /* renamed from: a */
    public void mo15527a(boolean z) {
        if (!C3775n.m15663n()) {
            if (z) {
                m16141g();
                m16145k();
                m16137b(true);
                return;
            }
            m16137b(false);
        }
    }

    /* renamed from: a */
    public static void m16128a(HashMap<String, C3897b> hashMap, FilenameFilter filenameFilter) {
        File[] fileArr;
        if (filenameFilter == null) {
            fileArr = C3962t.m16511i(C3774m.m15609j()).listFiles();
        } else {
            fileArr = C3962t.m16511i(C3774m.m15609j()).listFiles(filenameFilter);
        }
        if (fileArr != null && fileArr.length != 0) {
            int i = 0;
            while (i < fileArr.length && i < 5) {
                File file = fileArr[i];
                try {
                    if (file.isDirectory()) {
                        if (!C3853g.m15969a(file)) {
                            if (file.getName().endsWith("G")) {
                                String name = file.getName();
                                C3897b bVar = hashMap.get(name);
                                if (bVar == null) {
                                    bVar = new C3897b(name);
                                    hashMap.put(name, bVar);
                                }
                                bVar.f11938c.add(new C3896a(file, CrashType.NATIVE));
                            } else {
                                C3949m.m16412a(file);
                            }
                            i++;
                        }
                    }
                    C3949m.m16412a(file);
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    C3949m.m16412a(file);
                }
                i++;
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r0.equals("launch") == false) goto L_0x0036;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m16132a(java.util.HashMap<java.lang.String, com.bytedance.crash.upload.C3890c.C3897b> r12, java.io.File r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C3890c.m16132a(java.util.HashMap, java.io.File, java.lang.String):boolean");
    }

    /* renamed from: a */
    public void mo15526a(C3897b bVar) {
        if (!bVar.f11948m) {
            C3949m.m16412a(C3962t.m16488b(this.f11904a, bVar.f11936a));
            C3949m.m16412a(C3962t.m16485a(bVar.f11936a));
        }
    }

    /* renamed from: a */
    private static boolean m16130a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() >= 0) {
                    f11903j = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m16131a(String str) {
        try {
            File g = C3962t.m16505g(C3774m.m15609j());
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (!g.exists() || !g.isDirectory() || !m16130a(g, str)) {
                return false;
            }
            long lastModified = f11903j.lastModified() / 1000;
            if (currentTimeMillis < lastModified || currentTimeMillis - lastModified < 604800) {
                return false;
            }
            if (!"cfgclose".equals(str)) {
                return true;
            }
            C3949m.m16412a(f11903j);
            return true;
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m16129a(C3794e eVar, File file, File file2, boolean z) {
        if (!file.exists()) {
            return false;
        }
        if (!file2.exists()) {
            return true;
        }
        File file3 = new File(file2, C3774m.m15605f());
        if (!file3.exists()) {
            file3.mkdir();
        }
        eVar.mo15317a(file.getPath());
        eVar.mo15316a(file3);
        File[] listFiles = C3962t.m16511i(this.f11904a).listFiles();
        if (listFiles == null && listFiles.length == 0) {
            return true;
        }
        C3949m.m16399a(file, new File(file3, file.getName()));
        JSONObject f = eVar.mo15322f();
        if (f == null || f.length() == 0) {
            eVar.mo15324h();
            return true;
        } else if (!z || f.length() == 0) {
            return true;
        } else {
            if (!C3903f.m16169a().mo15552a(f, C3962t.m16483a(file3), file3)) {
                return true;
            }
            C3949m.m16412a(file);
            if (eVar.mo15324h()) {
                return true;
            }
            C3853g.m15971b(file3);
            return true;
        }
    }

    /* renamed from: h */
    private void m16142h() {
        this.f11908f = true;
        NativeImpl.m15695f();
        AbstractC3899e.m16163b();
    }

    /* renamed from: k */
    private void m16145k() {
        C3949m.m16412a(C3962t.m16521o(this.f11904a));
    }

    /* renamed from: com.bytedance.crash.upload.c$b */
    public static class C3897b {

        /* renamed from: a */
        String f11936a;

        /* renamed from: b */
        public List<C3896a> f11937b = new ArrayList();

        /* renamed from: c */
        public List<C3896a> f11938c = new ArrayList();

        /* renamed from: d */
        C3896a f11939d;

        /* renamed from: e */
        C3896a f11940e;

        /* renamed from: f */
        boolean f11941f;

        /* renamed from: g */
        int f11942g;

        /* renamed from: h */
        int f11943h = 0;

        /* renamed from: i */
        public long f11944i = -1;

        /* renamed from: j */
        public int f11945j = -1;

        /* renamed from: k */
        ArrayList<String> f11946k;

        /* renamed from: l */
        String f11947l;

        /* renamed from: m */
        boolean f11948m;

        /* renamed from: n */
        boolean f11949n = false;

        /* renamed from: o */
        boolean f11950o = false;

        /* renamed from: p */
        C3798g.C3801c f11951p;

        /* renamed from: q */
        String f11952q;

        /* renamed from: r */
        String f11953r;

        /* renamed from: s */
        Long f11954s = 0L;

        /* renamed from: t */
        int f11955t = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15536a() {
            if (!C3962t.m16488b(C3774m.m15609j(), this.f11936a).exists()) {
                this.f11950o = true;
            }
        }

        /* renamed from: d */
        public void mo15540d() {
            if (!this.f11936a.startsWith("anr")) {
                C3852f.m15966a(C3962t.m16488b(C3774m.m15609j(), this.f11936a));
            }
        }

        /* renamed from: c */
        public void mo15539c() {
            String str;
            if (!this.f11936a.startsWith("anr")) {
                String str2 = this.f11936a;
                if (this.f11938c.isEmpty()) {
                    str = null;
                } else {
                    str = this.f11938c.get(0).f11930a.getAbsolutePath();
                }
                C3798g.C3801c b = C3798g.m15760b(str2, str);
                this.f11951p = b;
                this.f11942g = b.f11682e;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15538b() {
            String str;
            boolean z = true;
            this.f11949n = true;
            if (this.f11946k == null && this.f11944i != -1) {
                if ((!this.f11937b.isEmpty() || !this.f11938c.isEmpty()) && !this.f11950o) {
                    this.f11946k = new ArrayList<>();
                    String str2 = "null";
                    for (C3896a aVar : this.f11937b) {
                        if (!aVar.f11933d) {
                            List<String> a = C3687a.m15191a().mo15096a(aVar.f11931b, this.f11947l);
                            if (a != null) {
                                this.f11946k.addAll(a);
                            }
                            if (!CrashType.LAUNCH.getName().equals(str2)) {
                                str2 = aVar.f11934e.getName();
                            }
                        }
                    }
                    for (C3896a aVar2 : this.f11938c) {
                        if (!aVar2.f11933d) {
                            List<String> a2 = C3687a.m15191a().mo15096a(aVar2.f11931b, this.f11947l);
                            if (a2 != null) {
                                this.f11946k.addAll(a2);
                            }
                            if (!CrashType.LAUNCH.getName().equals(str2)) {
                                str2 = aVar2.f11934e.getName();
                            }
                        }
                    }
                    if (!(this.f11950o || this.f11946k.isEmpty() || !this.f11949n)) {
                        String a3 = C3687a.m15193a(this.f11946k, this.f11947l);
                        String[] strArr = new String[6];
                        strArr[0] = "check_result";
                        strArr[1] = a3;
                        strArr[2] = "crash_type";
                        strArr[3] = str2;
                        strArr[4] = "alog_inited";
                        int i = this.f11943h;
                        if (i == 0) {
                            str = "uncertain";
                        } else {
                            if (i != 1) {
                                z = false;
                            }
                            str = String.valueOf(z);
                        }
                        strArr[5] = str;
                        C3864m.m16008a("alog_check", strArr);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo15537a(JSONObject jSONObject) {
            C3798g.C3801c cVar = this.f11951p;
            if (cVar != null) {
                cVar.mo15328a(jSONObject);
            }
        }

        C3897b(String str) {
            this.f11936a = str;
            String[] split = str.substring(0, str.length() - 1).split("-");
            if (split.length >= 2) {
                try {
                    this.f11944i = Long.decode(split[1]).longValue();
                } catch (Throwable unused) {
                }
            }
            if (split.length >= 3) {
                try {
                    this.f11945j = Integer.decode(split[2]).intValue();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static C3890c m16121a() {
        if (f11902c == null) {
            synchronized (C3890c.class) {
                if (f11902c == null) {
                    f11902c = new C3890c(C3774m.m15609j());
                }
            }
        }
        return f11902c;
    }

    /* renamed from: b */
    public void mo15528b() {
        m16126a(C3962t.m16516k(this.f11904a), 10);
        m16126a(C3962t.m16481a(this.f11904a), 10);
        m16126a(C3962t.m16511i(this.f11904a), 10);
    }

    /* renamed from: c */
    public void mo15529c() {
        try {
            if (this.f11908f) {
                return;
            }
            if (C3933b.m16336b(C3774m.m15609j())) {
                C3866n.m16016b().mo15508a(this.f11910h);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: i */
    private static boolean m16143i() {
        try {
            File c = C3962t.m16491c(C3774m.m15609j());
            if (!c.exists()) {
                return false;
            }
            if (!c.isDirectory()) {
                return false;
            }
            return m16130a(c, "gwpfile");
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            return false;
        }
    }

    /* renamed from: j */
    private boolean m16144j() {
        if (this.f11907e == -1) {
            if (!C3840b.m15879b()) {
                this.f11907e = 0;
            } else if (C3840b.m15893k()) {
                this.f11907e = 1;
            } else {
                this.f11907e = 0;
            }
        }
        if (this.f11907e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo15532f() {
        if (this.f11908f || C3775n.m15663n()) {
            return;
        }
        if (C3966w.m16528b(this.f11904a)) {
            mo15531e();
        } else {
            C3866n.m16016b().mo15509a(this.f11909g, 5000);
        }
    }

    /* renamed from: g */
    private void m16141g() {
        if (this.f11905b == null) {
            HashMap<String, C3897b> hashMap = new HashMap<>();
            this.f11905b = hashMap;
            try {
                m16139d(hashMap);
                m16138c(this.f11905b);
                try {
                    C3775n.m15652d(C3840b.m15899q());
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                }
                m16135b(this.f11905b);
                m16140e(this.f11905b);
                m16127a(this.f11905b);
                C3775n.m15667r();
                C3809i.m15786a(false);
            } catch (Throwable th2) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th2);
            }
            if (this.f11905b.isEmpty()) {
                m16142h();
            } else {
                mo15532f();
            }
        }
    }

    /* renamed from: e */
    public void mo15531e() {
        if (!(this.f11908f || this.f11905b == null || C3775n.m15663n())) {
            if (!C3966w.m16528b(this.f11904a)) {
                m16142h();
            }
            boolean j = m16144j();
            for (C3897b bVar : this.f11905b.values()) {
                bVar.mo15539c();
                bVar.mo15540d();
            }
            C3853g a = C3853g.m15968a();
            for (C3897b bVar2 : this.f11905b.values()) {
                m16134b(bVar2, j, a);
            }
            for (C3897b bVar3 : this.f11905b.values()) {
                m16125a(bVar3, j, a);
            }
            a.mo15468c();
            m16142h();
            this.f11911i.run();
        }
    }

    /* renamed from: a */
    public static void m16127a(HashMap<String, C3897b> hashMap) {
        m16128a(hashMap, (FilenameFilter) null);
    }

    /* renamed from: b */
    public static void m16135b(HashMap<String, C3897b> hashMap) {
        m16136b(hashMap, null);
    }

    /* renamed from: e */
    private void m16140e(HashMap<String, C3897b> hashMap) {
        C3949m.m16412a(C3962t.m16495d(this.f11904a));
    }

    private C3890c(Context context) {
        this.f11904a = context;
    }

    /* renamed from: a */
    private JSONObject m16122a(C3794e eVar) {
        if (!eVar.mo15320c()) {
            eVar.mo15324h();
            return null;
        } else if (eVar.mo15321d()) {
            return eVar.mo15323g();
        } else {
            eVar.mo15324h();
            return null;
        }
    }

    /* renamed from: c */
    private void m16138c(HashMap<String, C3897b> hashMap) {
        File[] listFiles = new File(C3962t.m16516k(this.f11904a), "asdawd").listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.isDirectory()) {
                        C3949m.m16412a(file);
                    } else if (file.getName().endsWith("G")) {
                        String name = file.getName();
                        if (hashMap.get(name) == null) {
                            hashMap.put(name, new C3897b(name));
                        }
                    } else {
                        C3949m.m16412a(file);
                    }
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    C3949m.m16412a(file);
                }
                i++;
            }
        }
    }

    /* renamed from: d */
    private void m16139d(HashMap<String, C3897b> hashMap) {
        File[] listFiles = C3962t.m16516k(this.f11904a).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i = 0;
            while (i < listFiles.length && i < 5) {
                File file = listFiles[i];
                try {
                    if (!file.getName().equals("asdawd")) {
                        if (!file.isDirectory()) {
                            C3949m.m16412a(file);
                        } else if (file.getName().endsWith("G")) {
                            String name = file.getName();
                            if (hashMap.get(name) == null) {
                                hashMap.put(name, new C3897b(name));
                            }
                        } else {
                            C3949m.m16412a(file);
                        }
                    }
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                    C3949m.m16412a(file);
                }
                i++;
            }
        }
    }

    /* renamed from: b */
    private void m16137b(boolean z) {
        File[] listFiles = C3962t.m16508h(this.f11904a).listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            C3794e eVar = new C3794e(this.f11904a);
            ArrayList arrayList = new ArrayList();
            m16124a(eVar, C3962t.m16508h(this.f11904a), arrayList);
            File[] listFiles2 = C3962t.m16511i(this.f11904a).listFiles();
            if (listFiles2.length != 0) {
                int i = 0;
                while (i < listFiles2.length && i < 5) {
                    this.f11906d.addAll(arrayList);
                    if (!this.f11906d.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        m16133b(eVar, C3962t.m16511i(this.f11904a), arrayList2);
                        if (arrayList2.size() == 0) {
                            for (int i2 = 0; i2 < this.f11906d.size(); i2++) {
                                m16129a(eVar, this.f11906d.get(i2), C3962t.m16511i(this.f11904a), z);
                            }
                        } else if (arrayList2.size() > 0) {
                            for (int i3 = 0; i3 < this.f11906d.size(); i3++) {
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    if (arrayList2.get(i4).equals(this.f11906d.get(i3).getName())) {
                                        this.f11906d.remove(i3);
                                    }
                                }
                            }
                            if (this.f11906d.size() > 0) {
                                for (int i5 = 0; i5 < this.f11906d.size(); i5++) {
                                    m16129a(eVar, this.f11906d.get(i5), C3962t.m16511i(this.f11904a), z);
                                }
                            }
                        }
                    }
                    i++;
                }
                return;
            }
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                m16129a(eVar, arrayList.get(i6), C3962t.m16511i(this.f11904a), z);
            }
        }
    }

    /* renamed from: com.bytedance.crash.upload.c$a */
    public static class C3896a {

        /* renamed from: a */
        public File f11930a;

        /* renamed from: b */
        long f11931b = -1;

        /* renamed from: c */
        long f11932c = -1;

        /* renamed from: d */
        boolean f11933d;

        /* renamed from: e */
        public CrashType f11934e;

        /* renamed from: f */
        String f11935f;

        C3896a(File file, CrashType crashType) {
            this.f11930a = file;
            this.f11934e = crashType;
            this.f11935f = file.getName();
        }

        C3896a(File file, long j, CrashType crashType) {
            this.f11930a = file;
            this.f11931b = j;
            this.f11934e = crashType;
            this.f11935f = file.getName();
        }
    }

    /* renamed from: b */
    public static void m16136b(HashMap<String, C3897b> hashMap, FilenameFilter filenameFilter) {
        File[] fileArr;
        if (filenameFilter == null) {
            fileArr = C3962t.m16481a(C3774m.m15609j()).listFiles();
        } else {
            fileArr = C3962t.m16481a(C3774m.m15609j()).listFiles(filenameFilter);
        }
        if (fileArr != null) {
            Arrays.sort(fileArr, Collections.reverseOrder());
            int i = 0;
            for (int i2 = 0; i2 < fileArr.length && i < 5; i2++) {
                File file = fileArr[i2];
                try {
                    if (C3853g.m15969a(file)) {
                        C3949m.m16412a(file);
                    } else if (!C3949m.m16429h(file)) {
                        if (!C3729a.m15361a().mo15189b(file.getName())) {
                            if (file.isFile()) {
                                C3949m.m16412a(file);
                            } else if (m16132a(hashMap, file, file.getName())) {
                                i++;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m16126a(File file, int i) {
        String[] list = file.list();
        if (list != null && list.length > i) {
            try {
                Arrays.sort(list);
                int i2 = 0;
                for (String str : list) {
                    i2++;
                    if (i2 > i) {
                        C3949m.m16412a(new File(file, str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private void m16133b(C3794e eVar, File file, List<String> list) {
        File[] listFiles = file.listFiles();
        int i = 0;
        while (i < listFiles.length && i < 5) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    m16133b(eVar, file2, list);
                } else if (file2.getName().contains("asan_report.")) {
                    list.add(file2.getName());
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                C3949m.m16412a(file2);
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m16124a(C3794e eVar, File file, List<File> list) {
        File[] listFiles = file.listFiles();
        int i = 0;
        while (i < listFiles.length && i < 5) {
            File file2 = listFiles[i];
            try {
                if (file2.isDirectory()) {
                    m16124a(eVar, file2, list);
                } else {
                    list.add(file2);
                }
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                C3949m.m16412a(file2);
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ce, code lost:
        if (r10.f11940e.f11931b >= r5.f11931b) goto L_0x01d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0257 A[Catch:{ all -> 0x0260 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16125a(final com.bytedance.crash.upload.C3890c.C3897b r28, boolean r29, com.bytedance.crash.runtime.C3853g r30) {
        /*
        // Method dump skipped, instructions count: 689
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C3890c.m16125a(com.bytedance.crash.upload.c$b, boolean, com.bytedance.crash.runtime.g):void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x00b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:123:0x0044 */
    /* JADX DEBUG: Multi-variable search result rejected for r18v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r18v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r18v28, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r18v29, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v4, types: [com.bytedance.crash.nativecrash.e] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r19v9, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r18v15, types: [com.bytedance.crash.nativecrash.e] */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17, types: [int] */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r18 < 0) goto L_0x0093;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16134b(final com.bytedance.crash.upload.C3890c.C3897b r25, boolean r26, com.bytedance.crash.runtime.C3853g r27) {
        /*
        // Method dump skipped, instructions count: 677
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.upload.C3890c.m16134b(com.bytedance.crash.upload.c$b, boolean, com.bytedance.crash.runtime.g):void");
    }

    /* renamed from: a */
    public static JSONObject m16123a(JSONObject jSONObject, boolean z, String str, String str2) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null && z) {
            jSONObject.remove("header");
        }
        String optString = optJSONObject.optString("sdk_version_name", null);
        if (optString == null) {
            optString = "3.1.6-rc.53-lark.oversea";
        }
        C3742b.m15432a(jSONObject, "filters", "sdk_version", optString);
        if (C3949m.m16414a(jSONObject.optJSONArray("logcat"))) {
            jSONObject.put("logcat", C3859j.m15989a(str));
        }
        C3742b.m15432a(jSONObject, "filters", "has_dump", "true");
        C3742b.m15432a(jSONObject, "filters", "is_64_devices", String.valueOf(Header.m15401a()));
        C3742b.m15432a(jSONObject, "filters", "is_64_runtime", String.valueOf(NativeTools.m16236b().mo15613e()));
        C3742b.m15432a(jSONObject, "filters", "is_x86_devices", String.valueOf(Header.m15404b()));
        C3742b.m15432a(jSONObject, "filters", "is_root", String.valueOf(C3794e.m15733i()));
        C3742b.m15432a(jSONObject, "filters", "is_hm_os", String.valueOf(C3927aa.m16281c()));
        C3742b.m15432a(jSONObject, "filters", "kernel_version", C3953o.m16435b());
        jSONObject.put("launch_did", C3754a.m15520a(C3774m.m15609j()));
        jSONObject.put("crash_uuid", str2);
        jSONObject.put("jiffy", C3867o.C3868a.m16017a());
        jSONObject.put("has_dump", "true");
        if (jSONObject.opt("storage") == null) {
            C3742b.m15435a(jSONObject, C3931ae.m16319a(C3774m.m15609j()));
        }
        if (Header.m15405b(optJSONObject)) {
            C3742b.m15432a(jSONObject, "filters", "params_err", optJSONObject.optString("params_err"));
        }
        C3746e.m15487b(jSONObject);
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put("event_type", "start_crash");
            Object remove = jSONObject.remove(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (remove != null) {
                jSONObject.put("stack", remove);
            }
            jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new JSONArray().put(jSONObject));
            jSONObject2.put("header", optJSONObject);
            return jSONObject2;
        }
        jSONObject.put("isJava", 1);
        return jSONObject;
    }

    /* renamed from: a */
    private C3748g m16120a(File file, CrashType crashType, String str, long j, long j2) {
        boolean z;
        C3748g gVar = null;
        try {
            if (file.isFile()) {
                C3949m.m16412a(file);
            } else {
                if (crashType == CrashType.LAUNCH) {
                    z = true;
                } else {
                    z = false;
                }
                if (crashType != null && !new File(file, file.getName()).exists()) {
                    if (crashType != CrashType.ANR) {
                        gVar = C3949m.m16391a(file, crashType);
                        JSONObject b = gVar.mo15263b();
                        if (b != null) {
                            b.put("crash_time", j);
                            b.put("app_start_time", j2);
                            try {
                                gVar.mo15261a(m16123a(b, z, str, file.getName()));
                            } catch (Throwable unused) {
                            }
                        } else {
                            C3949m.m16412a(file);
                        }
                    }
                }
                return C3949m.m16424d(new File(file, file.getName()).getAbsolutePath());
            }
        } catch (Throwable th) {
            C3949m.m16412a(file);
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
        return gVar;
    }
}
