package com.ss.android.lark.platform.offlinepush;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.larksuite.framework.http.request.C26010a;
import com.larksuite.framework.http.request.HttpMethod;
import com.larksuite.framework.http.request.RequestBody;
import com.larksuite.framework.http.response.BaseResponse;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.platform.ah.C51702c;
import com.ss.android.lark.platform.network.C51864e;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57765ac;
import com.ss.lark.android.module.offlinepush.C64266c;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class OfflineMessageAck {
    /* renamed from: a */
    public void mo178068a(Context context, OfflineNotice offlineNotice) {
        try {
            mo178069b(context, offlineNotice);
        } catch (Exception e) {
            Log.m165383e("OfflinePushListener", e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public class AckHttpParams {
        public final String aid;
        public final String client_time = String.valueOf(System.currentTimeMillis() / 1000);
        public final String did;
        public final String group_id;
        public final String rid;
        public final String rid64;
        public final String sender;

        public AckHttpParams(OfflineNotice offlineNotice) {
            this.rid64 = String.valueOf(offlineNotice.getRid64());
            this.did = C36083a.m141486a().getPassportDependency().mo133090i();
            this.aid = String.valueOf(C29410a.m108287a().mo104277a());
            this.group_id = "0";
            this.rid = String.valueOf(offlineNotice.getRuleId());
            this.sender = String.valueOf(offlineNotice.getSender());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m201271d(Context context, OfflineNotice offlineNotice) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rule_id", offlineNotice.getRuleId());
            jSONObject.put("sender", offlineNotice.getSender());
            jSONObject.put("push_sdk_version", 1);
            jSONObject.put("push_sdk_version_name", "1.0");
            if (offlineNotice.isExistBusinessInfo()) {
                jSONObject.put("msg_sid", offlineNotice.getMsgSid());
                jSONObject.put("send_time_stamp", offlineNotice.getSendTimeStamp());
            }
            jSONObject.put("receive_time_stamp", System.currentTimeMillis() / 1000);
        } catch (JSONException e) {
            Log.m165389i("OfflinePushListener", e.toString());
        }
        if (C57765ac.m224193g(context)) {
            C51702c.m200484a().mo201588a("push_show_ug", jSONObject);
        } else {
            Statistics.sendEvent("push_show_ug", jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo178069b(Context context, OfflineNotice offlineNotice) {
        String a = C64266c.m252722a();
        $$Lambda$OfflineMessageAck$SACIIATX27L1apCk0qKXlboBklQ r2 = new Runnable(context, offlineNotice) {
            /* class com.ss.android.lark.platform.offlinepush.$$Lambda$OfflineMessageAck$SACIIATX27L1apCk0qKXlboBklQ */
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ OfflineNotice f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                OfflineMessageAck.lambda$SACIIATX27L1apCk0qKXlboBklQ(OfflineMessageAck.this, this.f$1, this.f$2);
            }
        };
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AckHttpParams(offlineNotice));
            BaseResponse baseResponse = (BaseResponse) C51864e.m201147a().mo92412a(new C26010a(HttpMethod.POST, a).mo92476b(RequestBody.create("application/json; charset=utf-8", JSON.toJSONString(arrayList)))).mo92407a(BaseResponse.class);
            if (baseResponse == null || !baseResponse.isSuccessful()) {
                Log.m165389i("OfflinePushListener", "send ack by http failed.");
                r2.run();
            }
        } catch (Exception e) {
            r2.run();
            Log.m165389i("OfflinePushListener", e.getMessage());
        }
    }
}
