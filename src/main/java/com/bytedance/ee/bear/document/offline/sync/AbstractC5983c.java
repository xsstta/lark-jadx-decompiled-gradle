package com.bytedance.ee.bear.document.offline.sync;

import android.os.Build;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.eenet.util.ComplexConnect;
import com.google.firebase.messaging.Constants;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.document.offline.sync.c */
public abstract class AbstractC5983c extends AbstractC5982a {
    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public boolean mo24225a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null || optJSONObject.optInt("code", 0) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a, com.bytedance.ee.bear.document.offline.sync.AbstractC5997i
    /* renamed from: a */
    public void mo24217a(AccountService.Account account) {
        super.mo24217a(account);
        if (this.f16765b != null) {
            this.f16772i = System.currentTimeMillis() + "00";
            this.f16771h = "https://" + C6313i.f17510b + "/space/api/rce/messages?member_id=" + this.f16772i;
        }
    }

    @Override // com.bytedance.ee.bear.document.offline.sync.AbstractC5982a
    /* renamed from: a */
    public Response mo24220a(OfflineDoc offlineDoc) {
        com.alibaba.fastjson.JSONObject a = mo24216a(offlineDoc.getObj_token());
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        jSONObject.put("os", (Object) "Android");
        jSONObject.put("os_version", (Object) Build.VERSION.RELEASE);
        jSONObject.put("platform", (Object) this.f16767d.mo17350K());
        jSONObject.put("app_version", (Object) this.f16767d.mo17364n());
        a.put("context", (Object) jSONObject);
        return this.f16766c.mo20120a(new Request.Builder().url(this.f16771h).addHeader("EENet-Request-Enable-Complex-Connect", ComplexConnect.TRUE.toString()).post(RequestBody.create(MediaType.parse("application/json"), a.toJSONString())).build());
    }
}
