package com.bytedance.crash.nativecrash;

import android.app.ApplicationExitInfo;
import android.util.Pair;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p222f.C3750a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.upload.C3890c;
import com.bytedance.crash.util.C3934c;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.ListMap;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* renamed from: com.bytedance.crash.nativecrash.c */
public class C3789c {

    /* renamed from: a */
    private static ListMap<Integer, Pair<Long, String>> f11665a;

    /* renamed from: b */
    private static boolean f11666b;

    /* renamed from: e */
    private static long m15713e() {
        File file = new File(C3809i.f11695b, "lastReasonTime");
        if (file.exists()) {
            try {
                return C3809i.m15776a(C3949m.m16426e(file), -1);
            } catch (IOException unused) {
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static void m15714f() {
        try {
            C3949m.m16402a(new File(C3809i.f11695b, "lastReasonTime"), String.valueOf(System.currentTimeMillis()), false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    static void m15710b() {
        if (!f11666b) {
            f11666b = true;
            if (C3934c.m16344a()) {
                try {
                    m15711c();
                } catch (Throwable th) {
                    m15712d();
                    throw th;
                }
                m15712d();
            }
        }
    }

    /* renamed from: d */
    static void m15712d() {
        String[] list;
        int c;
        File file = new File(C3809i.f11695b, "exit_info");
        if (file.exists() && (list = file.list()) != null && list.length > (c = C3840b.m15881c(50))) {
            Arrays.sort(list);
            for (c = C3840b.m15881c(50); c < list.length; c++) {
                C3949m.m16412a(new File(file, list[c]));
            }
        }
    }

    /* renamed from: a */
    public static ListMap<Integer, Pair<Long, String>> m15707a() {
        ListMap<Integer, Pair<Long, String>> listMap = f11665a;
        if (listMap != null) {
            return listMap;
        }
        File file = new File(C3809i.f11695b, "exit_info");
        f11665a = new ListMap<>();
        if (!file.exists()) {
            return f11665a;
        }
        String[] list = file.list();
        if (list == null) {
            return f11665a;
        }
        for (String str : list) {
            String[] split = str.split("_");
            if (split.length == 2) {
                f11665a.add(Integer.valueOf((int) C3809i.m15776a(split[1], -1)), new Pair<>(Long.valueOf(C3809i.m15776a(split[0], -1)), str));
            }
        }
        return f11665a;
    }

    /* renamed from: c */
    static void m15711c() {
        List<ApplicationExitInfo> b = C3934c.m16345b();
        if (b != null) {
            long e = m15713e();
            b.sort(new Comparator<ApplicationExitInfo>() {
                /* class com.bytedance.crash.nativecrash.C3789c.C37901 */

                /* renamed from: a */
                public int compare(ApplicationExitInfo applicationExitInfo, ApplicationExitInfo applicationExitInfo2) {
                    return (int) (applicationExitInfo2.getTimestamp() - applicationExitInfo.getTimestamp());
                }
            });
            File file = new File(C3809i.f11695b, "exit_info");
            file.mkdirs();
            for (ApplicationExitInfo applicationExitInfo : b) {
                if (applicationExitInfo.getTimestamp() < e) {
                    break;
                }
                File file2 = new File(file, applicationExitInfo.getTimestamp() + "_" + applicationExitInfo.getPid());
                if (!file2.exists()) {
                    Properties properties = new Properties();
                    C3934c.m16342a(applicationExitInfo, properties);
                    try {
                        properties.store(new FileOutputStream(file2), "exitInfo");
                    } catch (IOException e2) {
                        C3968x.m16537b((Throwable) e2);
                    }
                    m15709a(applicationExitInfo.getPid(), C3809i.m15779a(applicationExitInfo), applicationExitInfo);
                    C3809i.m15788b(applicationExitInfo);
                }
            }
            m15714f();
        }
    }

    /* renamed from: a */
    public static String m15708a(int i, long j) {
        File file;
        List list = (List) m15707a().get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            Pair pair = (Pair) it.next();
            if (Math.abs(((Long) pair.first).longValue() - j) < 3000) {
                file = new File(C3809i.f11695b, "exit_info/" + ((String) pair.second));
                break;
            }
        }
        if (file == null) {
            file = new File(C3809i.f11695b, "exit_info/" + ((String) ((Pair) list.get(0)).second));
        }
        try {
            return C3949m.m16426e(file);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m15709a(int i, File file, ApplicationExitInfo applicationExitInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap = new HashMap();
        final String str = "-" + i;
        C3890c.m16136b(hashMap, new FilenameFilter() {
            /* class com.bytedance.crash.nativecrash.C3789c.C37912 */

            public boolean accept(File file, String str) {
                return str.contains(str);
            }
        });
        C3890c.m16128a(hashMap, new FilenameFilter() {
            /* class com.bytedance.crash.nativecrash.C3789c.C37923 */

            public boolean accept(File file, String str) {
                return str.contains(str);
            }
        });
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                z2 = false;
                z3 = false;
                break;
            }
            C3890c.C3897b bVar = (C3890c.C3897b) it.next();
            if (bVar.f11945j == i) {
                if (!bVar.f11937b.isEmpty()) {
                    C3949m.m16430i(new File(file, "hasJavaCrash"));
                    z2 = false;
                    z3 = false;
                    for (C3890c.C3896a aVar : bVar.f11937b) {
                        try {
                            C3949m.m16402a(new File(aVar.f11930a, "has_kill_info"), file.getAbsolutePath(), false);
                        } catch (Throwable unused) {
                        }
                        C3949m.m16430i(new File(aVar.f11930a, "has_exit_info"));
                        if (aVar.f11934e == CrashType.ANR) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                    z3 = false;
                }
                if (!bVar.f11938c.isEmpty()) {
                    C3949m.m16430i(new File(file, "hasNativeCrash"));
                    for (C3890c.C3896a aVar2 : bVar.f11938c) {
                        try {
                            C3949m.m16402a(new File(aVar2.f11930a, "has_kill_info"), file.getAbsolutePath(), false);
                        } catch (Throwable unused2) {
                        }
                        C3949m.m16430i(new File(aVar2.f11930a, "has_exit_info"));
                    }
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        C3864m.C3865a a = C3864m.m16006a("exit_reason_monitor");
        a.mo15481a("main_process", String.valueOf(C3774m.m15609j().getPackageName().equals(applicationExitInfo.getProcessName())));
        a.mo15481a("reason", String.valueOf(applicationExitInfo.getReason()));
        a.mo15481a("sub_reason", String.valueOf(C3750a.m15511a(applicationExitInfo, "getSubReason", new Object[0])));
        a.mo15481a("description", String.valueOf(applicationExitInfo.getDescription()));
        a.mo15481a(UpdateKey.STATUS, String.valueOf(applicationExitInfo.getStatus()));
        a.mo15481a("importance", String.valueOf(applicationExitInfo.getImportance()));
        a.mo15483b("pss", String.valueOf(applicationExitInfo.getPss()));
        a.mo15483b("rss", String.valueOf(applicationExitInfo.getRss()));
        a.mo15481a("find_java", String.valueOf(z2));
        a.mo15481a("find_anr", String.valueOf(z3));
        a.mo15481a("find_native", String.valueOf(z));
        a.mo15482a();
    }
}
