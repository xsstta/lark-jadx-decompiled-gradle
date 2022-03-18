package com.ss.android.lark.ug.attribution.p2855b;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.ug.attribution.bean.Attribution;
import com.ss.android.lark.ug.attribution.bean.C57358b;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.ug.attribution.b.a */
public class C57354a implements AbstractC57356b {

    /* renamed from: a */
    private AbstractC57392a f141214a;

    /* renamed from: a */
    private String m222335a() {
        AbstractC57392a aVar = this.f141214a;
        if (aVar == null) {
            return "";
        }
        return aVar.mo194663a(DomainSettings.Alias.UG_ACTIVITY);
    }

    public C57354a(AbstractC57392a aVar) {
        this.f141214a = aVar;
    }

    /* renamed from: a */
    public Map<String, String> mo194504a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next, ""));
        }
        return hashMap;
    }

    @Override // com.ss.android.lark.ug.attribution.p2855b.AbstractC57356b
    /* renamed from: a */
    public void mo194505a(C57358b bVar, final IGetDataCallback<Attribution> iGetDataCallback) {
        if (iGetDataCallback == null) {
            Log.m165383e("AttributionHttpLoader", "load with empty callback, did you forget set it?");
        }
        String a = m222335a();
        if (!TextUtils.isEmpty(a)) {
            Log.m165389i("AttributionHttpLoader", "load with host(" + a + ")");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("raw_af", bVar.mo194517a());
                jSONObject.put("device_id", bVar.mo194518b());
                jSONObject.put("terminal_type", 3);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("content-type", "application/json");
            SendHttpRequest.C15253a c = new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55528a(String.format("https://%s/ug/source/config", a)).mo55529a(hashMap).mo55533c(jSONObject.toString());
            Command command = Command.SEND_HTTP;
            C573551 r1 = new IGetDataCallback<SendHttpResponse>() {
                /* class com.ss.android.lark.ug.attribution.p2855b.C57354a.C573551 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                    int i;
                    try {
                        if (sendHttpResponse.http_status_code == null) {
                            i = ParticipantRepo.f117150c;
                        } else {
                            i = sendHttpResponse.http_status_code.intValue();
                        }
                        if (i < 300) {
                            if (i >= 200) {
                                Attribution attribution = new Attribution();
                                JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                                attribution.setConfigs(C57354a.this.mo194504a(jSONObject.optJSONObject("launch_conf")));
                                attribution.setSource(jSONObject.optString(ShareHitPoint.f121868c, ""));
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(attribution);
                                    return;
                                }
                                return;
                            }
                        }
                        IGetDataCallback iGetDataCallback2 = iGetDataCallback;
                        if (iGetDataCallback2 != null) {
                            iGetDataCallback2.onError(new ErrorResult(i, "get_unexpected_http_code:" + i));
                        }
                    } catch (JSONException e) {
                        IGetDataCallback iGetDataCallback3 = iGetDataCallback;
                        if (iGetDataCallback3 != null) {
                            iGetDataCallback3.onError(new ErrorResult(-202, "format json result failed:" + e.getMessage()));
                        }
                    }
                }
            };
            ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, c, r1, new SdkSender.IParser() {
                /* class com.ss.android.lark.ug.attribution.p2855b.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult(-200, "get empty ug host"));
        }
    }
}
