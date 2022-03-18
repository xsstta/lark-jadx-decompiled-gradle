package com.bytedance.crash.nativecrash;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.AbstractC3728e;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.p218b.C3697d;
import com.bytedance.crash.p218b.C3708j;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.C3869p;
import com.bytedance.crash.upload.C3890c;
import com.bytedance.crash.upload.C3908i;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3934c;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3955q;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.ListMap;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.nativecrash.i */
public class C3809i {

    /* renamed from: a */
    static File f11694a;

    /* renamed from: b */
    static File f11695b;

    /* renamed from: c */
    static File f11696c;

    /* renamed from: d */
    public static boolean f11697d = false;

    /* renamed from: e */
    private static boolean f11698e;

    /* renamed from: f */
    private static LinkedList<C3816a> f11699f;

    /* renamed from: g */
    private static ListMap<Integer, C3816a> f11700g;

    /* renamed from: h */
    private static boolean f11701h;

    /* renamed from: i */
    private static boolean f11702i;

    /* renamed from: j */
    private static ConcurrentLinkedQueue<AbstractC3728e> f11703j = new ConcurrentLinkedQueue<>();

    /* renamed from: k */
    private static volatile boolean f11704k = false;

    /* renamed from: l */
    private static final Object f11705l = new Object();

    /* renamed from: com.bytedance.crash.nativecrash.i$a */
    public static class C3816a {

        /* renamed from: a */
        long f11710a;

        /* renamed from: b */
        String f11711b;

        /* renamed from: c */
        ArrayList<C3817a> f11712c = new ArrayList<>();

        /* renamed from: d */
        long f11713d;

        /* renamed from: e */
        long f11714e;

        /* renamed from: f */
        long f11715f;

        /* renamed from: g */
        String f11716g;

        /* renamed from: h */
        String f11717h = null;

        /* renamed from: i */
        File f11718i;

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.crash.nativecrash.i$a$a */
        public static class C3817a {

            /* renamed from: a */
            long f11719a;

            /* renamed from: b */
            long f11720b;

            /* renamed from: c */
            long f11721c;

            /* renamed from: d */
            String f11722d;

            private C3817a() {
            }
        }

        C3816a(File file, File file2, long j) throws IOException {
            this.f11710a = j;
            this.f11718i = file;
            JSONArray b = C3949m.m16417b(file2);
            for (int i = 0; i < b.length(); i++) {
                String optString = b.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split("\\s+");
                    if (split.length == 4) {
                        C3817a aVar = new C3817a();
                        this.f11712c.add(aVar);
                        aVar.f11719a = C3809i.m15776a(split[0], -1);
                        aVar.f11720b = C3809i.m15776a(split[1], -1);
                        aVar.f11721c = C3809i.m15776a(split[2], -1);
                        String str = split[3];
                        aVar.f11722d = str;
                        if (i == 0 || C3933b.m16333a(C3774m.m15609j(), str)) {
                            if (C3933b.m16333a(C3774m.m15609j(), str)) {
                                this.f11711b = str;
                            }
                            this.f11713d = aVar.f11719a;
                            this.f11714e = aVar.f11720b;
                            this.f11715f = aVar.f11721c;
                            this.f11716g = aVar.f11722d;
                        }
                    }
                }
            }
            if (file != null) {
                if (new File(file, "hasJavaCrash").exists()) {
                    this.f11717h = "java";
                }
                if (new File(file, "hasNativeCrash").exists()) {
                    String str2 = "native";
                    this.f11717h = this.f11717h != null ? this.f11717h + str2 : str2;
                }
            }
        }
    }

    /* renamed from: a */
    public static Thread m15780a(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    /* renamed from: e */
    public static boolean m15791e() {
        return f11702i;
    }

    /* renamed from: f */
    public static boolean m15792f() {
        return f11697d;
    }

    /* renamed from: a */
    public static void m15784a(Context context) {
        if (!f11698e) {
            f11698e = true;
            if (!C3840b.m15863C()) {
                m15781a();
                m15794h();
            }
            if (C3697d.m15235a() && !C3840b.m15863C()) {
                C3708j.m15304a(f11695b);
            }
        }
    }

    /* renamed from: a */
    public static void m15785a(C3816a aVar, File file, long j, File file2) {
        C3744d a = C3744d.m15480a(new StackTraceElement("A", AbstractC60044a.f149675a, AbstractC60044a.f149675a, 1), "DiedProcess.unknownReason: please see logcat or oncall.\n", "PROCESS_DIED", "unknown", true, "PROCESS_DIED", "PROCESS_DIED");
        a.mo15241a("crash_time", Long.valueOf(j));
        a.mo15241a("timestamp", Long.valueOf(j));
        a.mo15241a("process_name", (Object) aVar.f11716g);
        a.mo15241a("app_start_time", Long.valueOf(aVar.f11714e));
        a.mo15241a("last_alive_time", Long.valueOf(aVar.f11715f));
        a.mo15241a("pid", Long.valueOf(aVar.f11713d));
        StringBuilder sb = new StringBuilder();
        Iterator<C3816a.C3817a> it = aVar.f11712c.iterator();
        while (it.hasNext()) {
            C3816a.C3817a next = it.next();
            sb.append("pid:");
            sb.append(next.f11719a);
            sb.append(" alive_time:");
            sb.append(j - next.f11720b);
            sb.append(" process:");
            sb.append(next.f11722d);
            sb.append(" last_alive_time:");
            sb.append(j - next.f11721c);
            sb.append('\n');
            String a2 = C3789c.m15708a((int) next.f11719a, j);
            if (a2 != null) {
                C3934c.m16343a(a2, a.mo15252e());
                sb.append("exitInfo:\n");
                sb.append(a2);
                sb.append("\n");
            }
        }
        try {
            JSONArray b = C3949m.m16417b(new File(file, "logcat.txt"));
            a.mo15241a("logcat", (Object) b);
            if (!C3955q.m16451a(b) && b.length() > 10) {
                a.mo15235a("has_logcat", "true");
            }
        } catch (Throwable unused) {
        }
        String str = null;
        if (file2 != null) {
            try {
                str = C3949m.m16426e(new File(file2, "procHistory.txt"));
            } catch (IOException unused2) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            try {
                File a3 = C3869p.m16023a(aVar.f11716g, aVar.f11710a);
                long length = a3.length();
                str = C3949m.m16416b(a3, length > 30720 ? length - 30720 : -1);
            } catch (IOException unused3) {
            }
        }
        a.mo15246c("activity_track", str);
        if (!C3840b.m15869I()) {
            C3687a.m15193a(C3687a.m15191a().mo15096a(j, aVar.f11711b), aVar.f11711b);
            a.mo15235a("may_has_alog", "true");
        }
        C3968x.m16532a("terminateMonitor", "upload " + ((Object) sb));
        a.mo15246c("died_processes", sb.toString());
        try {
            C3908i.m16190a(a, C3743c.f11533a, j, file);
        } catch (Throwable unused4) {
        }
        C3949m.m16412a(file);
    }

    /* renamed from: a */
    public static void m15786a(final boolean z) {
        if (!C3775n.m15663n() && !C3775n.m15666q()) {
            if (!f11701h || z) {
                f11701h = true;
                final LinkedList<C3816a> i = m15795i();
                C3789c.m15710b();
                C3866n.m16016b().mo15508a(new Runnable() {
                    /* class com.bytedance.crash.nativecrash.C3809i.RunnableC38112 */

                    public void run() {
                        C3809i.m15781a();
                        System.currentTimeMillis();
                        if (C3840b.m15867G() || z) {
                            Iterator it = i.iterator();
                            while (it.hasNext()) {
                                C3816a aVar = (C3816a) it.next();
                                C3809i.m15785a(aVar, aVar.f11718i, aVar.f11710a, (File) null);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private static void m15782a(int i, File file, C3816a aVar, File file2) {
        HashMap hashMap = new HashMap();
        final String str = "-" + i;
        C3890c.m16136b(hashMap, new FilenameFilter() {
            /* class com.bytedance.crash.nativecrash.C3809i.C38123 */

            public boolean accept(File file, String str) {
                return str.contains(str);
            }
        });
        C3890c.m16128a(hashMap, new FilenameFilter() {
            /* class com.bytedance.crash.nativecrash.C3809i.C38134 */

            public boolean accept(File file, String str) {
                return str.contains(str);
            }
        });
        for (C3890c.C3897b bVar : hashMap.values()) {
            if (bVar.f11945j == i) {
                if (!bVar.f11937b.isEmpty()) {
                    C3949m.m16430i(new File(file, "hasJavaCrash"));
                    if (aVar != null) {
                        C3949m.m16430i(new File(file2.getParent(), "hasJavaCrash"));
                        for (C3890c.C3896a aVar2 : bVar.f11937b) {
                            try {
                                C3949m.m16402a(new File(aVar2.f11930a, "has_kill_info"), file2.getParentFile().getAbsolutePath(), false);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
                if (!bVar.f11938c.isEmpty()) {
                    C3949m.m16430i(new File(file, "hasNativeCrash"));
                    if (aVar != null) {
                        C3949m.m16430i(new File(file2.getParent(), "hasNativeCrash"));
                        for (C3890c.C3896a aVar3 : bVar.f11938c) {
                            try {
                                C3949m.m16402a(new File(aVar3.f11930a, "has_kill_info"), file2.getParentFile().getAbsolutePath(), false);
                            } catch (Throwable unused2) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15783a(int r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.nativecrash.C3809i.m15783a(int, java.lang.String):void");
    }

    /* renamed from: b */
    public static File m15787b() {
        if (f11694a == null) {
            m15781a();
        }
        return f11694a;
    }

    /* renamed from: j */
    private static File[] m15796j() {
        return new File(f11695b, "proc/").listFiles();
    }

    /* renamed from: c */
    public static void m15789c() {
        if (!f11702i) {
            f11702i = true;
            if (C3697d.m15235a()) {
                C3708j.m15314b(f11695b);
            }
        }
    }

    /* renamed from: h */
    private static synchronized void m15794h() {
        synchronized (C3809i.class) {
            C3968x.m16530a((Object) "start child monitor");
            m15780a(new Thread(new Runnable() {
                /* class com.bytedance.crash.nativecrash.C3809i.RunnableC38101 */

                public void run() {
                    File file = C3809i.f11695b;
                    file.mkdirs();
                    if (C3840b.m15864D()) {
                        C3809i.m15789c();
                        C3809i.f11697d = true;
                    }
                    if ((TextUtils.isEmpty(Build.BRAND) || !Build.BRAND.contains("aries")) && (TextUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.contains("yteDance"))) {
                        NativeTools.m16236b().mo15592a(System.currentTimeMillis(), file.getAbsolutePath(), new File(C3809i.f11695b, "pid_tid").getAbsolutePath());
                    } else if (!C3809i.f11697d) {
                        C3809i.m15789c();
                        C3809i.f11697d = true;
                    }
                }
            }, "monitor-terminal")).start();
        }
    }

    /* renamed from: d */
    public static void m15790d() {
        if (!f11704k) {
            synchronized (f11705l) {
                if (!f11704k) {
                    f11704k = true;
                    C3968x.m16536b("TermianteMonitor", "processStart try clear all");
                    File[] j = m15796j();
                    if (j != null) {
                        for (File file : j) {
                            long a = m15776a(file.getName(), -1);
                            if (!(a == -1 || a == ((long) Process.myPid()))) {
                                int i = (int) a;
                                if (!NativeTools.m16236b().mo15610d(i)) {
                                    m15783a(i, (String) null);
                                }
                            }
                        }
                        C3866n.m16016b().mo15508a(new Runnable() {
                            /* class com.bytedance.crash.nativecrash.C3809i.RunnableC38156 */

                            public void run() {
                                C3708j.m15316c();
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static JSONArray m15793g() {
        File[] j = m15796j();
        if (j == null || j.length == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (File file : j) {
            long a = m15776a(file.getName(), -1);
            if (a >= 0 && NativeTools.m16236b().mo15610d((int) a)) {
                JSONObject jSONObject = new JSONObject();
                C3955q.m16447a(jSONObject, "pid", Long.valueOf(a));
                C3955q.m16447a(jSONObject, "start_time", Long.valueOf(m15775a(file)));
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    /* renamed from: i */
    private static LinkedList<C3816a> m15795i() {
        LinkedList<C3816a> linkedList = f11699f;
        if (linkedList != null) {
            return linkedList;
        }
        f11699f = new LinkedList<>();
        f11700g = new ListMap<>();
        long currentTimeMillis = System.currentTimeMillis();
        File file = f11696c;
        if (!file.exists()) {
            return f11699f;
        }
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return f11699f;
        }
        Arrays.sort(list);
        int a = m15774a(list);
        int i = a;
        while (i < list.length && i < a + 5) {
            String str = list[i];
            File file2 = new File(file, str);
            C3816a a2 = m15777a(currentTimeMillis, file2, str);
            if (a2 == null) {
                C3949m.m16412a(file2);
            } else {
                f11699f.add(a2);
                Iterator<C3816a.C3817a> it = a2.f11712c.iterator();
                while (it.hasNext()) {
                    f11700g.add(Integer.valueOf((int) it.next().f11719a), a2);
                }
            }
            i++;
        }
        return f11699f;
    }

    /* renamed from: a */
    public static void m15781a() {
        File file = new File(C3962t.m16522p(C3774m.m15609j()), "npth/killHistory");
        f11695b = file;
        file.mkdirs();
        f11696c = new File(f11695b, "kill_info");
        File file2 = f11695b;
        File file3 = new File(file2, "proc/" + Process.myPid());
        f11694a = file3;
        file3.mkdirs();
        try {
            C3949m.m16402a(new File(file3, "cmd"), C3933b.m16337c(C3774m.m15609j()), false);
            C3949m.m16402a(new File(file3, "app_start_time"), String.valueOf(C3774m.m15612m()), false);
        } catch (IOException e) {
            C3968x.m16534a((Throwable) e);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static long m15775a(File file) {
        try {
            return m15776a(C3949m.m16426e(new File(file, "app_start_time")), System.currentTimeMillis());
        } catch (IOException unused) {
            return System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    private static int m15774a(String[] strArr) {
        int b;
        if (strArr == null || strArr.length == 0 || strArr.length <= (b = C3840b.m15878b(25))) {
            return 0;
        }
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length - b; i++) {
            C3949m.m16412a(new File(f11696c, strArr[i]));
        }
        return strArr.length - b;
    }

    /* renamed from: b */
    static void m15788b(ApplicationExitInfo applicationExitInfo) {
        try {
            Iterator<AbstractC3728e> it = f11703j.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo15184a(applicationExitInfo);
                } catch (Throwable th) {
                    C3691b.m15203a().mo15177a("NPTH_CATCH", th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static C3949m.C3951b m15778a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        m15790d();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("pid");
                long optLong = optJSONObject.optLong("start_time");
                if (optInt > 0 && optLong > 0) {
                    File a = C3869p.m16021a(optInt, optLong);
                    if (a == null) {
                        a = new File(f11695b, "proc/" + optInt);
                        if (!a.exists()) {
                            a = null;
                        }
                    }
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        File[] fileArr = new File[arrayList.size()];
        arrayList.toArray(fileArr);
        return new C3949m.C3951b(fileArr, false);
    }

    /* renamed from: a */
    static File m15779a(ApplicationExitInfo applicationExitInfo) {
        List list = (List) f11700g.get(Integer.valueOf(applicationExitInfo.getPid()));
        if (list != null && !list.isEmpty()) {
            return ((C3816a) list.get(0)).f11718i;
        }
        File file = new File(f11696c, String.valueOf(applicationExitInfo.getTimestamp()));
        file.mkdirs();
        File file2 = new File(file, "info.txt");
        try {
            C3949m.m16402a(file2, applicationExitInfo.getPid() + " 0 0 " + applicationExitInfo.getProcessName(), false);
        } catch (IOException e) {
            C3968x.m16537b((Throwable) e);
        }
        C3816a a = m15777a(System.currentTimeMillis(), file, file.getName());
        f11700g.add(Integer.valueOf(applicationExitInfo.getPid()), a);
        f11699f.add(a);
        return file;
    }

    /* renamed from: a */
    public static long m15776a(String str, long j) {
        try {
            return Long.decode(str).longValue();
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: a */
    private static C3816a m15777a(long j, File file, String str) {
        try {
            long longValue = Long.decode(str).longValue();
            if (j - longValue < 1000) {
                return null;
            }
            try {
                return new C3816a(file, new File(file, "info.txt"), longValue);
            } catch (Throwable unused) {
                C3949m.m16412a(file);
                return null;
            }
        } catch (Throwable unused2) {
            C3949m.m16412a(file);
            return null;
        }
    }
}
