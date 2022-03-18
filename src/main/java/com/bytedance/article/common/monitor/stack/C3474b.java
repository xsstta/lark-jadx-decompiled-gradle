package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import com.bytedance.apm.util.C3138u;
import com.bytedance.services.apm.api.EnsureManager;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.article.common.monitor.stack.b */
public class C3474b {
    /* renamed from: a */
    public static boolean m14696a(boolean z, String str) {
        if (EnsureManager.getEnsureImpl() != null) {
            return EnsureManager.ensureTrue(z, str);
        }
        return m14702b(z, str);
    }

    /* renamed from: a */
    public static void m14688a() {
        if (EnsureManager.getEnsureImpl() != null) {
            EnsureManager.ensureNotReachHere();
        } else {
            m14697b();
        }
    }

    /* renamed from: b */
    private static void m14697b() {
        m14689a(3, Thread.currentThread().getStackTrace(), null, true, null);
    }

    /* renamed from: c */
    private static void m14703c(String str) {
        m14689a(3, Thread.currentThread().getStackTrace(), str, true, null);
    }

    /* renamed from: a */
    public static void m14691a(String str) {
        if (EnsureManager.getEnsureImpl() != null) {
            EnsureManager.ensureNotReachHere(str);
        } else {
            m14703c(str);
        }
    }

    /* renamed from: b */
    public static void m14698b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C3475c.m14706a(str);
        }
    }

    /* renamed from: c */
    private static boolean m14704c(Throwable th) {
        if (C3475c.m14705a().mo13924b()) {
            return !C3478d.m14714a(th);
        }
        return true;
    }

    /* renamed from: a */
    public static void m14692a(Throwable th) {
        if (EnsureManager.getEnsureImpl() != null) {
            EnsureManager.ensureNotReachHere(th);
        } else {
            m14699b(th);
        }
    }

    /* renamed from: b */
    private static void m14699b(Throwable th) {
        if (m14704c(th)) {
            m14690a(3, Thread.currentThread().getStackTrace(), th, null, true, true, null);
        }
    }

    /* renamed from: b */
    private static boolean m14701b(boolean z) {
        if (!z) {
            m14689a(3, Thread.currentThread().getStackTrace(), null, true, null);
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m14695a(boolean z) {
        if (EnsureManager.getEnsureImpl() != null) {
            return EnsureManager.ensureTrue(z);
        }
        return m14701b(z);
    }

    /* renamed from: a */
    public static void m14693a(Throwable th, String str) {
        if (EnsureManager.getEnsureImpl() != null) {
            EnsureManager.ensureNotReachHere(th, str);
        } else {
            m14700b(th, str);
        }
    }

    /* renamed from: b */
    private static void m14700b(Throwable th, String str) {
        if (m14704c(th)) {
            m14690a(3, Thread.currentThread().getStackTrace(), th, str, true, true, null);
        }
    }

    /* renamed from: b */
    private static boolean m14702b(boolean z, String str) {
        if (!z) {
            m14689a(3, Thread.currentThread().getStackTrace(), str, true, null);
        }
        return z;
    }

    /* renamed from: a */
    private static void m14694a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put("custom", jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m14689a(int i, StackTraceElement[] stackTraceElementArr, String str, boolean z, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String className = stackTraceElement.getClassName();
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        String a = C3138u.m13078a(stackTraceElementArr);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
                        jSONObject.put("timestamp", System.currentTimeMillis());
                        jSONObject.put("class_ref", className);
                        jSONObject.put("method", methodName);
                        jSONObject.put("line_num", lineNumber);
                        jSONObject.put("stack", a);
                        jSONObject.put("exception_type", 1);
                        jSONObject.put("is_core", 1);
                        if (!TextUtils.isEmpty(str)) {
                            if (str.length() > 1024) {
                                jSONObject.put("message", str.substring(0, 1024));
                            } else {
                                jSONObject.put("message", str);
                            }
                        }
                        m14694a(map, jSONObject);
                        C3475c.m14705a().mo13922a("core_exception_monitor", jSONObject.toString(), str, z);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m14690a(int i, StackTraceElement[] stackTraceElementArr, Throwable th, String str, boolean z, boolean z2, Map<String, String> map) {
        if (th != null) {
            try {
                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                String className = stackTraceElement.getClassName();
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                String a = C3138u.m13076a(th);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
                jSONObject.put("timestamp", System.currentTimeMillis());
                jSONObject.put("class_ref", className);
                jSONObject.put("method", methodName);
                jSONObject.put("line_num", lineNumber);
                jSONObject.put("stack", a);
                jSONObject.put("exception_type", 0);
                if (z2) {
                    jSONObject.put("is_core", 1);
                } else {
                    jSONObject.put("is_core", 0);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (str.length() > 1024) {
                        jSONObject.put("message", str.substring(0, 1024));
                    } else {
                        jSONObject.put("message", str);
                    }
                }
                m14694a(map, jSONObject);
                C3475c.m14705a().mo13922a("core_exception_monitor", jSONObject.toString(), str, z);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
