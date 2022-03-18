package com.tt.miniapp.event;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b */
public class C66020b {

    /* renamed from: com.tt.miniapp.event.b$b */
    public interface AbstractC66022b {
        /* renamed from: a */
        void mo231093a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.tt.miniapp.event.b$a */
    public static class C66021a {

        /* renamed from: a */
        private String f166682a;

        /* renamed from: b */
        private JSONObject f166683b;

        /* renamed from: b */
        private void m258534b() {
            JSONObject jSONObject = this.f166683b;
            if (jSONObject != null && jSONObject.optString("trace_id", null) == null) {
                mo231090a("trace_id", AppbrandContext.getInst().getTraceId());
            }
        }

        /* renamed from: c */
        private void m258535c() {
            if ("mp_load_domready".equals(this.f166682a)) {
                AppBrandLogger.m52828d("tma_Event", "TraceDebug:" + this.f166682a + " traceId: " + this.f166683b.optString("trace_id", null) + " isSSB:" + this.f166683b.optBoolean("gadget_is_ssb"));
            }
        }

        /* renamed from: a */
        public void mo231092a() {
            m258534b();
            m258535c();
            if (!TextUtils.isEmpty(this.f166682a)) {
                C67556a.m262937a(this.f166682a, this.f166683b, 6);
            }
            AbstractC66022b bVar = ContextSingletonInstance.getInstance().sIFeedback;
            if (bVar != null) {
                bVar.mo231093a(this.f166682a, this.f166683b);
            }
        }

        /* renamed from: a */
        public C66021a mo231091a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f166683b.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(5, "tma_Event", e.getStackTrace());
            }
            return this;
        }

        /* renamed from: a */
        public C66021a mo231090a(String str, Object obj) {
            if (!(str == null || obj == null)) {
                try {
                    this.f166683b.put(str, obj);
                } catch (JSONException e) {
                    AppBrandLogger.stacktrace(5, "tma_Event", e.getStackTrace());
                }
            }
            return this;
        }

        public C66021a(String str, IAppContext iAppContext) {
            AppInfoEntity appInfoEntity;
            this.f166682a = str;
            if (iAppContext == null || ((!ProcessUtil.isMiniappProcess() && AppType.GadgetAPP != iAppContext.getAppType()) || AppbrandApplicationImpl.getInst(iAppContext) == null)) {
                appInfoEntity = null;
            } else {
                appInfoEntity = AppbrandApplicationImpl.getInst(iAppContext).getAppInfo();
            }
            this.f166683b = C67475d.m262451a(new JSONObject(), appInfoEntity, iAppContext);
        }

        public C66021a(String str, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
            this.f166682a = str;
            this.f166683b = C67475d.m262451a(new JSONObject(), appInfoEntity, iAppContext);
        }
    }

    /* renamed from: a */
    public static void m258532a() {
        ContextSingletonInstance.getInstance().sIFeedback = null;
    }

    /* renamed from: a */
    public static void m258533a(AbstractC66022b bVar) {
        ContextSingletonInstance.getInstance().sIFeedback = bVar;
    }

    /* renamed from: a */
    public static C66021a m258530a(String str, IAppContext iAppContext) {
        return new C66021a(str, iAppContext);
    }

    /* renamed from: a */
    public static C66021a m258531a(String str, AppInfoEntity appInfoEntity, IAppContext iAppContext) {
        return new C66021a(str, appInfoEntity, iAppContext);
    }
}
