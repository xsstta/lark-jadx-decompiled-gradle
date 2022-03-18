package com.ss.android.lark.guidemgr.statistics;

import com.bytedance.apm.ApmAgent;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guidemgr/statistics/GuideMgrApm;", "", "()V", "GuideEngine", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guidemgr.f.a */
public final class GuideMgrApm {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J9\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/guidemgr/statistics/GuideMgrApm$GuideEngine;", "", "()V", "UG_GET_USER_GUIDE", "", "UG_POST_USER_CONSUMING_GUIDE", "sendGetUserGuide", "", "succeed", "", "cost", "", ApiHandler.API_CALLBACK_ERRMSG, "sendPostUserConsumingGuide", "guideKeys", "errCode", "", "(ZJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.guidemgr.f.a$a */
    public static final class GuideEngine {

        /* renamed from: a */
        public static final GuideEngine f99617a = new GuideEngine();

        private GuideEngine() {
        }

        /* renamed from: a */
        public final void mo141904a(boolean z, long j, String str) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", z);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cost", j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("error_msg", str);
            ApmAgent.monitorEvent("ug_get_user_guide", jSONObject, jSONObject2, jSONObject3);
        }

        /* renamed from: a */
        public final void mo141905a(boolean z, long j, String str, Integer num, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("succeed", z);
            jSONObject.put("error_code", num);
            jSONObject.put("guide_keys", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("cost", j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("error_msg", str2);
            ApmAgent.monitorEvent("ug_post_user_consuming_guide", jSONObject, jSONObject2, jSONObject3);
        }
    }
}
