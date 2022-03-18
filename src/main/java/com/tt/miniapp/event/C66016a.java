package com.tt.miniapp.event;

import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.ProcessUtil;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.a */
public class C66016a {

    /* renamed from: com.tt.miniapp.event.a$a */
    public static class C66018a {

        /* renamed from: a */
        private String f166674a;

        /* renamed from: b */
        private String f166675b;

        /* renamed from: c */
        private String f166676c;

        /* renamed from: d */
        private String f166677d;

        /* renamed from: e */
        private String f166678e;

        /* renamed from: f */
        private String f166679f;

        /* renamed from: g */
        private StringBuffer f166680g;

        /* renamed from: a */
        public StringBuffer mo231076a() {
            return this.f166680g;
        }

        /* renamed from: b */
        public String mo231080b() {
            return this.f166675b;
        }

        /* renamed from: c */
        public String mo231082c() {
            return this.f166676c;
        }

        /* renamed from: d */
        public String mo231084d() {
            return this.f166677d;
        }

        /* renamed from: e */
        public String mo231086e() {
            return this.f166678e;
        }

        /* renamed from: f */
        public String mo231088f() {
            return this.f166679f;
        }

        /* renamed from: g */
        public String mo231089g() {
            return this.f166674a;
        }

        private C66018a() {
            this.f166680g = new StringBuffer();
        }

        /* renamed from: a */
        public void mo231077a(String str) {
            this.f166675b = str;
        }

        /* renamed from: b */
        public void mo231081b(String str) {
            this.f166676c = str;
        }

        /* renamed from: c */
        public void mo231083c(String str) {
            this.f166677d = str;
        }

        /* renamed from: d */
        public void mo231085d(String str) {
            this.f166674a = str;
        }

        /* renamed from: a */
        public void mo231079a(StringBuffer stringBuffer) {
            this.f166680g = stringBuffer;
        }

        /* renamed from: e */
        public void mo231087e(String str) {
            StringBuffer a = mo231076a();
            if (a == null) {
                a = new StringBuffer();
                mo231079a(a);
            }
            a.append(" | trace:");
            a.append(str);
        }

        /* renamed from: a */
        public void mo231078a(String str, Throwable th) {
            StringBuffer a = mo231076a();
            if (a == null) {
                a = new StringBuffer();
                mo231079a(a);
            }
            a.append(" | trace:");
            a.append(str);
            a.append("exception:");
            a.append(Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    public static synchronized void m258510a(C66018a aVar, IAppContext iAppContext) {
        synchronized (C66016a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tma_trigger", aVar.mo231080b());
                jSONObject.put("tma_process", aVar.mo231082c());
                jSONObject.put("tma_updateVersion", aVar.mo231086e());
                jSONObject.put("tma_currentVersion", aVar.mo231084d());
                jSONObject.put("tma_log", aVar.mo231076a());
                jSONObject.put("tma_result", aVar.mo231088f());
                jSONObject.put("tma_launchFromMethod", aVar.mo231089g());
                AppBrandLogger.m52830i("BaseBundleEventHelper", jSONObject.toString());
                C67509b.m262587a("mp_jssdk_update", 0, jSONObject, iAppContext);
                LarkInnerEventHelper.statusRate("mp_jssdk_update", 0, jSONObject, iAppContext);
            } catch (Exception e) {
                AppBrandLogger.m52829e("BaseBundleEventHelper", e);
            }
        }
        return;
    }

    /* renamed from: a */
    public static synchronized C66018a m258509a(String str, String str2, String str3) {
        C66018a aVar;
        synchronized (C66016a.class) {
            aVar = new C66018a();
            aVar.mo231081b(ProcessUtil.getProcessIdentify());
            aVar.mo231085d(str);
            aVar.mo231077a(str2);
            aVar.mo231083c(str3);
        }
        return aVar;
    }
}
