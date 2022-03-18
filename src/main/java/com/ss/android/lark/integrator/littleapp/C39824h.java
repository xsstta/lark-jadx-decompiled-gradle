package com.ss.android.lark.integrator.littleapp;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.ee.larkbrand.utils.C13360l;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.integrator.littleapp.manis.GadgetProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.ApiUtils;
import ee.android.framework.manis.C68183b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.integrator.littleapp.h */
public class C39824h {

    /* renamed from: a */
    public String f101449a;

    /* renamed from: b */
    public String f101450b;

    /* renamed from: c */
    private IPassportApi f101451c;

    /* renamed from: com.ss.android.lark.integrator.littleapp.h$a */
    public static class C39826a {

        /* renamed from: a */
        public static final C39824h f101453a = new C39824h();
    }

    /* renamed from: a */
    public static C39824h m158095a() {
        return C39826a.f101453a;
    }

    private C39824h() {
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        this.f101451c = iPassportApi;
        iPassportApi.registerLoginEnvChangeListener(new AbstractC49370a.AbstractC49371a() {
            /* class com.ss.android.lark.integrator.littleapp.C39824h.C398251 */

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public boolean mo102729a() {
                return false;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a.AbstractC49371a
            /* renamed from: a */
            public void mo102728a(boolean z, AbstractC49352d<String> dVar) {
                Log.m165389i("GadgetMonitorProvider", "onLoginEnvChanged : " + z);
                C39824h.this.f101449a = null;
                C39824h.this.f101450b = null;
            }
        });
    }

    /* renamed from: a */
    private void m158096a(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m165389i("GadgetMonitorProvider", "data is null");
            return;
        }
        try {
            if (this.f101449a == null) {
                String tenantId = this.f101451c.getTenantId();
                if (!TextUtils.isEmpty(tenantId)) {
                    this.f101449a = C13360l.m54356a(tenantId);
                }
            }
            if (this.f101450b == null) {
                String userId = this.f101451c.getUserId();
                if (!TextUtils.isEmpty(userId)) {
                    this.f101450b = C13360l.m54356a(userId);
                }
            }
            String str = this.f101449a;
            if (str != null) {
                jSONObject.put("tenant_id", str);
            }
            String str2 = this.f101450b;
            if (str2 != null) {
                jSONObject.put("user_id", str2);
            }
        } catch (JSONException e) {
            Log.m165386e("GadgetMonitorProvider", e);
        }
    }

    /* renamed from: a */
    public void mo144323a(String str, JSONObject jSONObject) {
        ApmAgent.monitorCommonLog(str, jSONObject);
    }

    /* renamed from: b */
    public void mo144326b(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            m158096a(jSONObject);
            Statistics.sendEvent(str, jSONObject);
        }
    }

    /* renamed from: a */
    public void mo144322a(String str, int i, JSONObject jSONObject) {
        ApmAgent.monitorStatusRate(str, i, jSONObject);
    }

    /* renamed from: a */
    public void mo144324a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m158096a(jSONObject);
        ApmAgent.monitorDuration(str, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public void mo144325a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m158096a(jSONObject);
        ApmAgent.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m158097b(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        String str3;
        GadgetProxy gadgetProxy = (GadgetProxy) C68183b.m264839a().mo237086a(context, GadgetProxy.class);
        if (gadgetProxy == null) {
            Log.m165383e("GadgetMonitorProvider", "proxy is null");
            return;
        }
        Log.m165389i("GadgetMonitorProvider", "proxy monitorEvent ");
        String str4 = null;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        } else {
            str2 = null;
        }
        if (jSONObject2 != null) {
            str3 = jSONObject2.toString();
        } else {
            str3 = null;
        }
        if (jSONObject3 != null) {
            str4 = jSONObject3.toString();
        }
        gadgetProxy.monitorEvent(str, str2, str3, str4);
    }

    /* renamed from: a */
    public void mo144321a(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (C26252ad.m94993b(context)) {
            Log.m165389i("GadgetMonitorProvider", "monitorEvent in main process");
            mo144325a(str, jSONObject, jSONObject2, jSONObject3);
            return;
        }
        Log.m165389i("GadgetMonitorProvider", "monitorEvent in sub process");
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable(context, str, jSONObject, jSONObject2, jSONObject3) {
            /* class com.ss.android.lark.integrator.littleapp.$$Lambda$h$gu04aVygieZOYgpST2__1ukPbJE */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ JSONObject f$2;
            public final /* synthetic */ JSONObject f$3;
            public final /* synthetic */ JSONObject f$4;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C39824h.m158097b(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }
}
