package com.ss.android.lark.openplatform.p2401c;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.google.firebase.messaging.Constants;
import com.google.gson.JsonObject;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.openplatform.OpenPlatformModule;
import com.ss.android.lark.openplatform.common.C48822a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.openplatform.c.a */
public class C48804a {

    /* renamed from: com.ss.android.lark.openplatform.c.a$a */
    public interface AbstractC48806a {
        /* renamed from: a */
        void mo170530a(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SendHttpResponse m192260a(byte[] bArr) throws IOException {
        return SendHttpResponse.ADAPTER.decode(bArr);
    }

    /* renamed from: a */
    public static void m192261a(String str, final AbstractC48806a aVar) {
        final boolean z;
        final String str2 = "applink_h5url_perfix_" + str;
        String string = C57744a.m224104a().getString(str2);
        if (!TextUtils.isEmpty(string)) {
            aVar.mo170530a(string);
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + OpenPlatformModule.m192198d().getSession());
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("larkVersion", OpenPlatformModule.m192198d().getAppVersionName());
        jsonObject.addProperty("locale", OpenPlatformModule.m192198d().getLocale());
        jsonObject.addProperty("appId", str);
        String b = C48822a.m192351b();
        C53241h.m205898b("H5UrlDataSource", "req Appinfo param :" + jsonObject + " url:" + b);
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55528a(b).mo55526a(SendHttpRequest.Method.POST).mo55529a(hashMap).mo55533c(jsonObject.toString()), new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.lark.openplatform.p2401c.C48804a.C488051 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C48804a.m192262a(null, aVar, z);
                C53241h.m205898b("H5UrlDataSource", "req AppInfo error :" + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                JSONObject optJSONObject;
                JSONObject optJSONObject2;
                try {
                    JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                    if (!(jSONObject.getInt("code") != 0 || (optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null || (optJSONObject2 = optJSONObject.optJSONObject("appInfo")) == null)) {
                        String optString = optJSONObject2.optString("mobileH5Url");
                        if (!TextUtils.isEmpty(optString)) {
                            C48804a.m192262a(optString, aVar, z);
                            C57744a.m224104a().putString(str2, optString);
                            return;
                        }
                    }
                    C48804a.m192262a(null, aVar, z);
                    C53241h.m205898b("H5UrlDataSource", "req AppInfo error :" + sendHttpResponse);
                } catch (JSONException e) {
                    C48804a.m192262a(null, aVar, z);
                    C53241h.m205898b("H5UrlDataSource", "req AppInfo error :" + e);
                }
            }
        }, $$Lambda$a$XqwzAE55nYuvwm_5SMnTPC6jwv8.INSTANCE);
    }

    /* renamed from: a */
    public static void m192262a(String str, AbstractC48806a aVar, boolean z) {
        if (!z) {
            aVar.mo170530a(str);
        }
    }
}
