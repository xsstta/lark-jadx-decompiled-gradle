package com.bytedance.crash.entity;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3943h;
import com.bytedance.crash.util.NativeTools;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.tt.frontendapiinterface.ApiHandler;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.entity.d */
public class C3744d extends C3742b {
    /* renamed from: h */
    public boolean mo15255h() {
        return false;
    }

    private C3744d(String str) {
    }

    /* renamed from: a */
    public static C3744d m15482a(String str, String str2, String str3, String str4, String str5) {
        C3744d a = m15480a(new StackTraceElement("Native", "Native", "Native.java", -1), str2, str3, str4, true, "EnsureNotReachHere", str5);
        a.mo15241a("event_type", (Object) "native_exception");
        a.mo15241a("java_data", (Object) str);
        a.mo15241a("crash_lib_uuid", (Object) NativeTools.m16236b().mo15624k(str2));
        return a;
    }

    /* renamed from: a */
    public static C3744d m15481a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        C37451 r7 = new C3744d(null) {
            /* class com.bytedance.crash.entity.C3744d.C37451 */

            @Override // com.bytedance.crash.entity.C3744d
            /* renamed from: h */
            public boolean mo15255h() {
                return true;
            }
        };
        r7.mo15241a("event_type", (Object) ApiHandler.API_CALLBACK_EXCEPTION);
        r7.mo15241a("log_type", (Object) "service_monitor");
        r7.mo15241a("timestamp", Long.valueOf(System.currentTimeMillis()));
        r7.mo15241a("crash_time", Long.valueOf(System.currentTimeMillis()));
        r7.mo15241a("process_name", (Object) C3933b.m16337c(C3774m.m15609j()));
        r7.mo15241a("crash_thread_name", (Object) Thread.currentThread().getName());
        r7.mo15241a("service", (Object) str);
        r7.mo15241a(UpdateKey.STATUS, Integer.valueOf(i));
        if (jSONObject != null) {
            r7.mo15241a("value", jSONObject);
        }
        if (jSONObject2 != null) {
            r7.mo15241a("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            r7.mo15241a("metric", jSONObject3);
        }
        r7.mo15241a("sid", Long.valueOf(C3774m.m15612m()));
        return r7;
    }

    /* renamed from: a */
    public static C3744d m15480a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C3744d dVar = new C3744d(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        dVar.mo15241a("event_type", (Object) ApiHandler.API_CALLBACK_EXCEPTION);
        dVar.mo15241a("log_type", (Object) str5);
        dVar.mo15241a("timestamp", Long.valueOf(System.currentTimeMillis()));
        dVar.mo15241a("crash_time", Long.valueOf(System.currentTimeMillis()));
        dVar.mo15241a("class_ref", (Object) className);
        dVar.mo15241a("method", (Object) methodName);
        dVar.mo15241a("line_num", Integer.valueOf(lineNumber));
        dVar.mo15241a("stack", (Object) str);
        dVar.mo15241a("crash_md5", (Object) C3943h.m16371a(str));
        dVar.mo15241a("exception_type", (Object) 1);
        dVar.mo15241a("ensure_type", (Object) str4);
        dVar.mo15241a("is_core", Integer.valueOf(z ? 1 : 0));
        dVar.mo15241a("message", (Object) str2);
        dVar.mo15241a("process_name", (Object) C3933b.m16337c(C3774m.m15609j()));
        dVar.mo15241a("crash_thread_name", (Object) str3);
        C3746e.m15487b(dVar.mo15252e());
        return dVar;
    }
}
