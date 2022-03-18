package com.bytedance.crash.upload;

import android.text.TextUtils;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3743c;
import com.bytedance.crash.entity.C3744d;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3853g;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.p227a.C3835e;
import com.bytedance.crash.runtime.p228b.C3842a;
import com.bytedance.crash.util.C3930ad;
import com.bytedance.crash.util.C3968x;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.upload.h */
public final class C3906h {

    /* renamed from: a */
    private static int f11968a;

    /* renamed from: a */
    public static void m16188a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        m16187a(stackTraceElementArr, i, str, str2, "core_exception_monitor", map);
    }

    /* renamed from: a */
    public static String m16179a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C3930ad.m16302a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m16186a(Map<String, String> map, C3744d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                dVar.mo15241a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16183a(Throwable th, String str, boolean z) {
        m16184a(th, str, z, "core_exception_monitor");
    }

    /* renamed from: a */
    public static void m16184a(Throwable th, String str, boolean z, String str2) {
        m16185a(th, str, z, (Map<String, String>) null, str2);
    }

    /* renamed from: a */
    public static void m16185a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            m16182a(null, th, null, 0, str, z, map, Thread.currentThread(), "EnsureNotReachHere", str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m16187a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map<String, String> map) {
        m16182a(null, null, stackTraceElementArr, i, str, true, map, Thread.currentThread(), str2, str3);
    }

    /* renamed from: a */
    public static void m16180a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        try {
            m16182a(obj, th, null, 0, str, z, map, Thread.currentThread(), str2, str3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m16182a(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr, int i, String str, boolean z, Map<String, String> map, Thread thread, String str2, String str3) {
        m16181a(obj, th, stackTraceElementArr, i, str, z, map, thread.getName(), null, null, str2, str3);
    }

    /* renamed from: a */
    private static void m16181a(final Object obj, final Throwable th, final StackTraceElement[] stackTraceElementArr, final int i, final String str, final boolean z, final Map<String, String> map, final String str2, final String str3, final String str4, final String str5, String str6) {
        final String str7;
        if (TextUtils.isEmpty(str6)) {
            str7 = "core_exception_monitor";
        } else {
            str7 = str6;
        }
        if (C3775n.m15654e() || f11968a < 100) {
            f11968a++;
            if (C3842a.m15915d(C3743c.m15479d(obj))) {
                if (!C3840b.m15877a(obj, str7)) {
                    C3968x.m16530a((Object) ("exception has been discard due to not sampled: " + str7));
                    return;
                } else if (!C3840b.m15880b(obj, str)) {
                    C3968x.m16530a((Object) ("exception has been discard due to not sampled message: " + str));
                    return;
                }
            }
            if (!C3775n.m15654e() || C3853g.m15968a().mo15469d()) {
                C3866n.m16016b().mo15508a(new Runnable() {
                    /* class com.bytedance.crash.upload.C3906h.RunnableC39071 */

                    public void run() {
                        C3744d dVar;
                        String str;
                        StackTraceElement[] stackTraceElementArr;
                        if (!C3775n.m15654e()) {
                            C3866n.m16016b().mo15509a(this, 500);
                            return;
                        }
                        try {
                            String str2 = str3;
                            if (str2 != null) {
                                dVar = C3744d.m15482a(str4, str2, str, str2, str7);
                            } else {
                                Throwable th = th;
                                if (th != null || ((stackTraceElementArr = stackTraceElementArr) != null && stackTraceElementArr.length > i + 1)) {
                                    StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
                                    if (stackTraceElementArr2 == null) {
                                        stackTraceElementArr2 = th.getStackTrace();
                                    }
                                    int i = i;
                                    StackTraceElement stackTraceElement = stackTraceElementArr2[i];
                                    if (stackTraceElement != null) {
                                        Throwable th2 = th;
                                        if (th2 != null) {
                                            str = C3930ad.m16298a(th2);
                                        } else {
                                            str = C3906h.m16179a(stackTraceElementArr2, i);
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            dVar = C3744d.m15480a(stackTraceElement, str, str, str2, z, str5, str7);
                                            Object obj = obj;
                                            if (obj != null) {
                                                dVar.mo15241a("exception_line_num", (Object) C3743c.m15471a(obj, th, stackTraceElementArr2));
                                            }
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            C3906h.m16186a(map, dVar);
                            C3835e.m15853a().mo15428a(CrashType.ENSURE, dVar);
                            C3908i.m16191a(obj, dVar);
                            C3968x.m16535b("[reportException] " + str);
                        } catch (Throwable th3) {
                            C3968x.m16537b(th3);
                        }
                    }
                });
                return;
            }
            C3968x.m16531a("exception has been discard due to exceed limit: " + str7 + " msg: " + str);
            return;
        }
        C3968x.m16530a((Object) ("exception has been discard due to exceed limit before Npth.init: " + str7));
    }
}
