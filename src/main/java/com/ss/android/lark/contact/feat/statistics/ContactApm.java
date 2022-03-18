package com.ss.android.lark.contact.feat.statistics;

import com.bytedance.apm.ApmAgent;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/contact/feat/statistics/ContactApm;", "", "()V", "sendContactOptFetchRecUserCount", "", "count", "", "sendContactOptFetchRecUserError", "errCode", ApiHandler.API_CALLBACK_ERRMSG, "", "sendContactOptFetchRecUserTiming", "time", "", "sendContactOptUploadSysUserCount", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.c.a */
public final class ContactApm {

    /* renamed from: a */
    public static final ContactApm f91564a = new ContactApm();

    private ContactApm() {
    }

    /* renamed from: a */
    public final void mo130723a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", i);
        ApmAgent.monitorEvent("contact_opt_onboarding_upload_sys_user_count", null, jSONObject, null);
    }

    /* renamed from: b */
    public final void mo130726b(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("count", i);
        ApmAgent.monitorEvent("contact_opt_onboarding_fetch_rec_user_count", null, jSONObject, null);
    }

    /* renamed from: a */
    public final void mo130725a(long j) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latency", j);
        ApmAgent.monitorEvent("contact_opt_onboarding_fetch_rec_user_timing_ms", null, jSONObject, null);
    }

    /* renamed from: a */
    public final void mo130724a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("err_code", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("err_msg", str);
        ApmAgent.monitorEvent("contact_opt_onboarding_fetch_rec_user_error", jSONObject, null, jSONObject2);
    }
}
