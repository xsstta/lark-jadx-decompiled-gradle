package com.ss.android.lark.magic.apm;

import com.bytedance.apm.ApmAgent;
import com.larksuite.framework.utils.C26320t;
import com.ss.android.lark.biz.core.api.magic.ErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004J:\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J.\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004J\u001e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J0\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/magic/apm/MagicApm;", "", "()V", "UG_MAGIC_DID_OPEN", "", "UG_MAGIC_FETCH_CONFIG", "UG_MAGIC_INTERCEPT", "UG_MAGIC_OPEN_TOTAL_COST", "UG_MAGIC_TRIGGER_EVENT", "UG_MAGIC_WILL_OPEN", "sendFetchConfigEvent", "", "succeed", "", "src", "sendMagicDidOpenCost", "scenario", "eventName", "taskId", "cost", "", "errorInfo", "Lcom/ss/android/lark/biz/core/api/magic/ErrorInfo;", "sendMagicInterceptEvent", "interceptReason", "interceptDetail", "sendMagicTotalCost", "sendMagicTriggerEventCost", "sendMagicWillOpen", "ConfKeys", "InterceptReason", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.a.a */
public final class MagicApm {

    /* renamed from: a */
    public static final MagicApm f105928a = new MagicApm();

    private MagicApm() {
    }

    /* renamed from: a */
    public final void mo149990a(boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(str, "src");
        ApmAgent.monitorEvent("ug_magic_fetch_config", new JSONObject().put("succeed", z), null, new JSONObject().put("error_msg", C26320t.m95318a(str)));
    }

    /* renamed from: a */
    public final void mo149987a(String str, String str2, long j) {
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        ApmAgent.monitorEvent("ug_magic_open_total_cost", new JSONObject().put("scenario", str).put("event_name", str2), new JSONObject().put("cost", j), null);
    }

    /* renamed from: a */
    public final void mo149988a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        ApmAgent.monitorEvent("ug_magic_will_open", new JSONObject().put("scenario", str).put("task_id", str3).put("event_name", str2), null, null);
    }

    /* renamed from: a */
    public final void mo149989a(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        Intrinsics.checkParameterIsNotNull(str4, "interceptReason");
        Intrinsics.checkParameterIsNotNull(str5, "interceptDetail");
        ApmAgent.monitorEvent("ug_magic_intercept", new JSONObject().put("scenario", str).put("task_id", str3).put("reason", str4).put("event_name", str2), null, new JSONObject().put("intercept_detail", str5));
    }

    /* renamed from: a */
    public final void mo149991a(boolean z, String str, String str2, long j, ErrorInfo aVar) {
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        JSONObject put = new JSONObject().put("succeed", z).put("scenario", str).put("event_name", str2);
        JSONObject put2 = new JSONObject().put("cost", j);
        JSONObject jSONObject = new JSONObject();
        String str4 = null;
        if (aVar != null) {
            str3 = aVar.mo105683b();
        } else {
            str3 = null;
        }
        JSONObject put3 = jSONObject.put("error_msg", str3);
        if (aVar != null) {
            str4 = aVar.mo105682a();
        }
        ApmAgent.monitorEvent("ug_magic_trigger_event", put, put2, put3.put("error_code", str4));
    }

    /* renamed from: a */
    public final void mo149992a(boolean z, String str, String str2, String str3, long j, ErrorInfo aVar) {
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "scenario");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(str3, "taskId");
        JSONObject put = new JSONObject().put("succeed", z).put("scenario", str).put("task_id", str3).put("event_name", str2);
        JSONObject put2 = new JSONObject().put("cost", j);
        JSONObject jSONObject = new JSONObject();
        String str5 = null;
        if (aVar != null) {
            str4 = aVar.mo105683b();
        } else {
            str4 = null;
        }
        JSONObject put3 = jSONObject.put("error_msg", str4);
        if (aVar != null) {
            str5 = aVar.mo105682a();
        }
        ApmAgent.monitorEvent("ug_magic_did_open", put, put2, put3.put("error_code", str5));
    }
}
