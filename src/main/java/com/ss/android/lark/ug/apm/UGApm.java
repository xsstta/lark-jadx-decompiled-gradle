package com.ss.android.lark.ug.apm;

import com.bytedance.apm.ApmAgent;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J%\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGApm;", "", "()V", "GET_AF_FAILED_EVENT", "", "GET_UG_SOURCE_EVENT", "sendGetAFFailed", "", "errorMsg", "sendGetSourceEvent", "success", "", "errorCode", "", "cost", "", "(ZLjava/lang/Integer;J)V", "AddFriends", "ConfKeys", "DyFlow", "OnBoarding", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.a.b */
public final class UGApm {

    /* renamed from: a */
    public static final UGApm f141196a = new UGApm();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGApm$AddFriends;", "", "()V", "sendContactPermissionAllow", "", "sendContactPermissionDeny", "sendContactPermissionShow", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.a.b$a */
    public static final class AddFriends {

        /* renamed from: a */
        public static final AddFriends f141197a = new AddFriends();

        private AddFriends() {
        }

        /* renamed from: a */
        public final void mo194470a() {
            ApmAgent.monitorEvent("contact_opt_onboarding_permission_show", null, null, null);
        }

        /* renamed from: b */
        public final void mo194471b() {
            ApmAgent.monitorEvent("contact_opt_onboarding_permission_allow", null, null, null);
        }

        /* renamed from: c */
        public final void mo194472c() {
            ApmAgent.monitorEvent("contact_opt_onboarding_permission_deny", null, null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ/\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fXT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGApm$DyFlow;", "", "()V", "ERROR_CODE_LOSE_ORDER_LIST", "", "ERROR_CODE_ORDER_LIST_ISSUE", "ERROR_CODE_OTHER", "ERROR_CODE_SLOT_COUNT", "ERROR_CODE_SLOT_ELEMENT_NOT_FOUND", "ERROR_CODE_STEP_DATA_NOT_FOUND", "ERROR_CODE_UNKNOWN_STEP", "UG_DYNAMIC_FLOW_ABNORMAL_EXIT", "", "UG_DYNAMIC_FLOW_EVENT", "UG_DYNAMIC_FLOW_SPOTLIGHT", "sendFlowAbnormalExit", "", "errCode", ApiHandler.API_CALLBACK_ERRMSG, "suiteId", "stepId", "stepName", "sendFlowEvent", "success", "", "cost", "", "(ZJLjava/lang/Integer;Ljava/lang/String;)V", "sendFlowSpotlight", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.a.b$b */
    public static final class DyFlow {

        /* renamed from: a */
        public static final DyFlow f141198a = new DyFlow();

        private DyFlow() {
        }

        /* renamed from: a */
        public final void mo194473a(int i, String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            jSONObject.put("refactor", "v2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", str);
            ApmAgent.monitorEvent("ug_dynamic_flow_spotlight", jSONObject, null, jSONObject2);
        }

        /* renamed from: a */
        public final void mo194475a(boolean z, long j, Integer num, String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", z);
            jSONObject.put("error_code", num);
            jSONObject.put("refactor", "v2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cost", j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("error_msg", str);
            ApmAgent.monitorEvent("ug_dynamic_flow_event", jSONObject, jSONObject2, jSONObject3);
        }

        /* renamed from: a */
        public final void mo194474a(int i, String str, String str2, String str3, String str4) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            jSONObject.put("suite_id", str2);
            jSONObject.put("step_id", str3);
            jSONObject.put("step_name", str4);
            jSONObject.put("refactor", "v2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", str);
            ApmAgent.monitorEvent("ug_dynamic_flow_abnormal_exit", jSONObject, null, jSONObject2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/apm/UGApm$OnBoarding;", "", "()V", "FETCH_PRODUCT_GUIDE", "", "UG_ONBOARDING_LISTEN_VOLUME", "UG_ONBOARDING_VIDEO_ERROR", "sendFetchProductGuide", "", "success", "", "cost", "", "sendOnBoardingListenVolume", "succeed", ApiHandler.API_CALLBACK_ERRMSG, "sendOnBoardingVideoError", "errCode", "", "errReason", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.a.b$c */
    public static final class OnBoarding {

        /* renamed from: a */
        public static final OnBoarding f141199a = new OnBoarding();

        private OnBoarding() {
        }

        /* renamed from: a */
        public final void mo194477a(boolean z, long j) {
            ApmAgent.monitorEvent("ug_fetch_product_guide", new JSONObject().put("succeed", z), new JSONObject().put("cost", j), null);
        }

        /* renamed from: a */
        public final void mo194478a(boolean z, String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", str);
            ApmAgent.monitorEvent("ug_onboarding_listen_volume", jSONObject, null, jSONObject2);
        }

        /* renamed from: a */
        public final void mo194476a(int i, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "errReason");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i);
            jSONObject.put("error_reason", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", str2);
            ApmAgent.monitorEvent("ug_onboarding_video_error", jSONObject, null, jSONObject2);
        }
    }

    private UGApm() {
    }

    /* renamed from: a */
    public final void mo194468a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "errorMsg");
        ApmAgent.monitorEvent("ug_get_af_failed_event", new JSONObject().put("error_msg", str), null, null);
    }

    /* renamed from: a */
    public final void mo194469a(boolean z, Integer num, long j) {
        int i;
        JSONObject put = new JSONObject().put("succeed", z);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        ApmAgent.monitorEvent("ug_get_source_event", put.put("error_code", i), new JSONObject().put("cost", j), null);
    }
}
