package com.bytedance.crash.nativecrash;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.AbstractC3753g;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.p217a.C3687a;
import com.bytedance.crash.p218b.C3716l;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3852f;
import com.bytedance.crash.runtime.p227a.AbstractC3829b;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.upload.C3890c;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3945i;
import com.bytedance.crash.util.C3949m;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public class NativeCrashCollector {

    /* renamed from: a */
    public static AbstractC3753g f11644a;

    /* renamed from: b */
    private static boolean f11645b;

    /* renamed from: a */
    public static int m15674a() {
        return 6;
    }

    /* renamed from: a */
    public static void m15676a(AbstractC3753g gVar) {
        f11644a = gVar;
    }

    /* renamed from: a */
    public static String m15675a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("main".equalsIgnoreCase(str)) {
            return C3930ad.m16301a(Looper.getMainLooper().getThread().getStackTrace());
        }
        ThreadGroup threadGroup = Looper.getMainLooper().getThread().getThreadGroup();
        int activeCount = threadGroup.activeCount();
        Thread[] threadArr = new Thread[(activeCount + (activeCount / 2))];
        int enumerate = threadGroup.enumerate(threadArr);
        for (int i = 0; i < enumerate; i++) {
            String name = threadArr[i].getName();
            if (!TextUtils.isEmpty(name) && (name.equals(str) || name.startsWith(str) || name.endsWith(str))) {
                return C3930ad.m16301a(threadArr[i].getStackTrace());
            }
        }
        return "";
    }

    public static void onNativeCrash(final String str) {
        C3818j jVar;
        C3968x.m16530a((Object) "[onNativeCrash] enter");
        File file = new File(C3962t.m16480a(), C3774m.m15606g());
        C3945i.m16378c(C3962t.m16514j(C3774m.m15609j()));
        C3945i.m16377b(C3962t.m16514j(C3774m.m15609j()));
        try {
            C3890c.m16121a().mo15529c();
            final File f = C3962t.m16503f(file);
            C3835e.m15853a().mo15429a(CrashType.NATIVE, null, new AbstractC3829b.AbstractC3830a() {
                /* class com.bytedance.crash.nativecrash.NativeCrashCollector.C37851 */

                @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
                /* renamed from: a */
                public void mo15201a(Throwable th) {
                }

                @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
                /* renamed from: a */
                public C3742b mo15199a(int i, C3742b bVar) {
                    String str;
                    String str2 = "true";
                    if (i == 1) {
                        String str3 = str;
                        if (str3 != null && !str3.isEmpty()) {
                            bVar.mo15241a("java_data", (Object) NativeCrashCollector.m15675a(str));
                        }
                        if (!C3775n.m15662m()) {
                            str2 = "false";
                        }
                        bVar.mo15235a("crash_after_crash", str2);
                        if (NativeCrashCollector.f11644a != null) {
                            try {
                                str = NativeCrashCollector.f11644a.mo15273a();
                            } catch (Throwable unused) {
                                str = th.getClass().getName() + ":" + th.getMessage();
                            }
                            bVar.mo15241a("game_script_stack", (Object) str);
                        }
                        C3852f.m15967a(C3962t.m16514j(C3774m.m15609j()), CrashType.NATIVE);
                    } else if (i == 2) {
                        JSONArray e = C3716l.m15336e();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        JSONObject k = C3716l.m15342k();
                        JSONArray a = C3716l.m15328a(100, uptimeMillis);
                        bVar.mo15241a("history_message", (Object) e);
                        bVar.mo15241a("current_message", k);
                        bVar.mo15241a("pending_messages", (Object) a);
                        bVar.mo15235a("disable_looper_monitor", String.valueOf(C3840b.m15890h()));
                        bVar.mo15241a("alive_pids", (Object) C3809i.m15793g());
                    } else if (i != 3) {
                        if (i == 4) {
                            C3933b.m16328a(C3774m.m15609j(), bVar.mo15252e());
                        }
                    } else if (C3840b.m15891i()) {
                        bVar.mo15241a("all_thread_stacks", C3930ad.m16310b(str));
                        bVar.mo15235a("has_all_thread_stack", str2);
                    }
                    return bVar;
                }

                @Override // com.bytedance.crash.runtime.p227a.AbstractC3829b.AbstractC3830a
                /* renamed from: a */
                public C3742b mo15200a(int i, C3742b bVar, boolean z) {
                    JSONObject e = bVar.mo15252e();
                    C3949m.m16405a(new File(f.getAbsolutePath() + '.' + i), e, false);
                    if (i == 0) {
                        C3687a.m15191a().mo15100c();
                    }
                    return bVar;
                }
            }, true);
            if (f11645b) {
                jVar = new C3818j(file);
                jVar.mo15342b(file);
                m15677a(jVar.mo15348g(), null);
                return;
            }
        } catch (Throwable th) {
            if (f11645b) {
                C3818j jVar2 = new C3818j(file);
                jVar2.mo15342b(file);
                m15677a(jVar2.mo15348g(), null);
            } else {
                m15677a("", null);
            }
            throw th;
        }
        m15677a("", null);
    }

    /* renamed from: a */
    private static void m15677a(String str, Thread thread) {
        for (ICrashCallback iCrashCallback : C3775n.m15621a().mo15450e()) {
            try {
                iCrashCallback.onCrash(CrashType.NATIVE, str, thread);
            } catch (Throwable th) {
                C3691b.m15203a().mo15177a("NPTH_CATCH", th);
            }
        }
    }
}
