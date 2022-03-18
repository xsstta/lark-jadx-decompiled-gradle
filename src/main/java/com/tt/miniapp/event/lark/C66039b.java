package com.tt.miniapp.event.lark;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67548h;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.lark.b */
public class C66039b {

    /* renamed from: com.tt.miniapp.event.lark.b$a */
    public static class C66040a {

        /* renamed from: a */
        private String f166699a;

        /* renamed from: b */
        private JSONObject f166700b;

        /* renamed from: b */
        private void m258624b() {
            JSONObject jSONObject = this.f166700b;
            if (jSONObject != null && jSONObject.optString("trace_id", null) == null) {
                mo231123a("trace_id", AppbrandContext.getInst().getTraceId());
            }
        }

        /* renamed from: a */
        public void mo231124a() {
            m258624b();
            m258625c();
            if (!TextUtils.isEmpty(this.f166699a)) {
                C67556a.m262937a(this.f166699a, this.f166700b, 6);
            }
        }

        /* renamed from: c */
        private void m258625c() {
            AppBrandLogger.m52828d("NewLog", this.f166699a + ": " + this.f166700b);
            if ("mp_app_event_link".equals(this.f166699a) || "mp_app_launch_start".equals(this.f166699a)) {
                AppBrandLogger.m52828d("tma_Event", "TraceDebug:" + this.f166699a + " traceId: " + this.f166700b.optString("trace_id", null) + " linkTraceId:" + this.f166700b.optString("link_trace_id", null) + " isSSB:" + this.f166700b.optBoolean("gadget_is_ssb"));
            }
        }

        public C66040a(String str, IAppContext iAppContext) {
            this(str, null, null, iAppContext);
        }

        /* renamed from: a */
        public C66040a mo231123a(String str, Object obj) {
            if (!(str == null || obj == null)) {
                try {
                    this.f166700b.put(str, obj);
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(5, "tma_Event", e.getStackTrace());
                }
            }
            return this;
        }

        public C66040a(String str, AppInfoEntity appInfoEntity, JSONObject jSONObject, IAppContext iAppContext) {
            this.f166699a = str;
            if (appInfoEntity == null && iAppContext != null && ((ProcessUtil.isMiniappProcess() || AppType.GadgetAPP == iAppContext.getAppType() || AppType.WebGadgetAPP == iAppContext.getAppType()) && AppbrandApplicationImpl.getInst(iAppContext) != null)) {
                appInfoEntity = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
            }
            this.f166700b = C67548h.getCommonParams(jSONObject == null ? new JSONObject() : jSONObject, appInfoEntity, iAppContext);
        }
    }

    /* renamed from: a */
    public static C66040a m258622a(String str, IAppContext iAppContext) {
        return new C66040a(str, iAppContext);
    }

    /* renamed from: a */
    public static C66040a m258623a(String str, AppInfoEntity appInfoEntity, JSONObject jSONObject, IAppContext iAppContext) {
        return new C66040a(str, appInfoEntity, jSONObject, iAppContext);
    }
}
