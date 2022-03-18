package com.ss.android.lark.mail.impl.compose.image;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.utils.C43860w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.compose.image.c */
public class C42003c {

    /* renamed from: a */
    String f106607a = "internal-api-space.feishu.cn";

    /* renamed from: b */
    private long f106608b;

    public C42003c() {
        List<String> a = C41816b.m166115a().mo150121a(DomainSettings.Alias.DOCS_API);
        if (a != null && !a.isEmpty()) {
            this.f106607a = a.get(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m167143b(C42002b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(bVar.mo150996b(), bVar);
        this.f106608b = 0;
        m167142a(hashMap, bVar.f106600h);
    }

    /* renamed from: a */
    public void mo150998a(C42002b bVar) {
        this.f106608b = System.currentTimeMillis();
        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable(bVar) {
            /* class com.ss.android.lark.mail.impl.compose.image.$$Lambda$c$U20o696SCRhVVEswtCjm2MHARtY */
            public final /* synthetic */ C42002b f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C42003c.lambda$U20o696SCRhVVEswtCjm2MHARtY(C42003c.this, this.f$1);
            }
        }, 0);
    }

    /* renamed from: a */
    public void mo150999a(JSONObject jSONObject, Map<String, C42002b> map) {
        for (String str : map.keySet()) {
            C42002b bVar = map.get(str);
            if (jSONObject != null) {
                String optString = jSONObject.optString(str);
                if (!TextUtils.isEmpty(optString)) {
                    bVar.mo150995a(str, optString);
                } else {
                    bVar.mo150774a();
                }
            } else {
                bVar.mo150774a();
            }
        }
    }

    /* renamed from: a */
    private void m167142a(final Map<String, C42002b> map, String str) {
        Log.m165389i("DocImageMultiCopy", "startMultiCopy: size:" + map.size());
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("mount_point", "email");
            jSONObject2.put("mount_key", str);
            JSONArray jSONArray = new JSONArray();
            for (String str2 : map.keySet()) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("file_token", str2);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("dest_mount_info", jSONObject2);
            jSONObject.put("files", jSONArray);
        } catch (JSONException unused) {
        }
        C42176e.m168344a().mo152221a("https://" + this.f106607a + "/space/api/box/file/multi_copy/", C43860w.m173858a(), jSONObject.toString(), true, (IGetDataCallback<SendHttpResponse>) new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.image.C42003c.C420041 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C42003c.this.mo150999a((JSONObject) null, map);
                Log.m165397w("DocImageMultiCopy", "startMultiCopy fail err :" + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                if (sendHttpResponse == null || TextUtils.isEmpty(sendHttpResponse.json_body)) {
                    Log.m165397w("DocImageMultiCopy", "startMultiCopy empty body:" + sendHttpResponse);
                    C42003c.this.mo150999a((JSONObject) null, map);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                    int optInt = jSONObject.optInt("code");
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optInt != 0 || optJSONObject == null || optJSONObject.optJSONObject("succ_files") == null) {
                        Log.m165389i("DocImageMultiCopy", "startMultiCopy fail response :" + sendHttpResponse);
                        C42003c.this.mo150999a((JSONObject) null, map);
                        return;
                    }
                    Log.m165389i("DocImageMultiCopy", "startMultiCopy success.");
                    C42003c.this.mo150999a(optJSONObject.optJSONObject("succ_files"), map);
                } catch (JSONException e) {
                    Log.m165398w("DocImageMultiCopy", "startMultiCopy parse error :", e);
                }
            }
        });
    }
}
