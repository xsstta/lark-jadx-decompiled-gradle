package com.ss.android.lark.message.card.p2267g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.ar;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.message.card.C45294c;
import com.ss.android.lark.message.card.p2261a.AbstractC45287a;
import com.ss.android.lark.message.card.setting.MessageCardStyleSetting;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.message.card.g.b */
public class C45312b {

    /* renamed from: a */
    private HashMap<String, HashMap<String, String>> f114716a;

    /* renamed from: a */
    public synchronized HashMap mo160054a() {
        return this.f114716a;
    }

    /* renamed from: b */
    public void mo160057b() {
        Throwable th;
        Log.m165379d("MessageCardStyleProvider", "msg card init begin");
        AbstractC45287a a = C45294c.m179871a();
        Context a2 = a.mo143887a();
        UserSP instance = UserSP.getInstance();
        int i = 42;
        try {
            int i2 = instance.getInt("msg_card_style_narrow_version", -1);
            String string = instance.getString("msg_card_style_narrow_content");
            int max = Math.max(42, i2);
            try {
                String a3 = m179928a(a2);
                if (i2 < 42 || TextUtils.isEmpty(string)) {
                    m179932b(a2);
                    m179931a(a3);
                } else {
                    Log.m165379d("MessageCardStyleProvider", "kv content is in use");
                    mo160056a(mo160055a(new JSONObject(string).optJSONObject("style")));
                }
                m179930a(a, max, Integer.MAX_VALUE);
            } catch (Throwable th2) {
                th = th2;
                i = max;
                try {
                    Log.m165384e("MessageCardStyleProvider", "process local style failed", th);
                    m179930a(a, i, Integer.MAX_VALUE);
                    m179929a(a);
                } catch (Throwable th3) {
                    m179930a(a, i, Integer.MAX_VALUE);
                    m179929a(a);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            Log.m165384e("MessageCardStyleProvider", "process local style failed", th);
            m179930a(a, i, Integer.MAX_VALUE);
            m179929a(a);
        }
        m179929a(a);
    }

    /* renamed from: a */
    public synchronized void mo160056a(HashMap hashMap) {
        this.f114716a = hashMap;
    }

    /* renamed from: a */
    private String m179928a(Context context) {
        String filesDirPath = FileUtils.getFilesDirPath(context);
        return filesDirPath + File.separator + "default_card_style.json";
    }

    /* renamed from: a */
    private void m179929a(AbstractC45287a aVar) {
        if (!aVar.mo143899a("message_card.gray.enable_setting")) {
            Log.m165379d("MessageCardStyleProvider", "msg card gray style close");
            return;
        }
        MessageCardStyleSetting messageCardStyleSetting = (MessageCardStyleSetting) SettingManager.getInstance().get(MessageCardStyleSetting.class);
        if (messageCardStyleSetting == null || TextUtils.isEmpty(messageCardStyleSetting.f114722a)) {
            Log.m165389i("MessageCardStyleProvider", "msg card gray style res setting is null");
            return;
        }
        final UserSP instance = UserSP.getInstance();
        String string = instance.getString("msg_card_style_narrow_content_gray");
        if (!TextUtils.isEmpty(string)) {
            try {
                mo160056a(mo160055a(new JSONObject(string).optJSONObject("style")));
            } catch (JSONException e) {
                Log.m165383e("MessageCardStyleProvider", "gray card style parse error e=" + e.getMessage());
            }
        }
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.GET).mo55528a(messageCardStyleSetting.f114722a), new IGetDataCallback<SendHttpResponse>() {
            /* class com.ss.android.lark.message.card.p2267g.C45312b.C453153 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("MessageCardStyleProvider", "pull gray card style errorCode=" + errorResult.getErrorCode() + " errorMsg=" + errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccess(SendHttpResponse sendHttpResponse) {
                Log.m165379d("MessageCardStyleProvider", "gray card style respLen=" + sendHttpResponse.json_body.length());
                if (!TextUtils.isEmpty(sendHttpResponse.json_body)) {
                    try {
                        JSONObject optJSONObject = new JSONObject(sendHttpResponse.json_body).optJSONObject("narrow");
                        int optInt = optJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                        C45312b.this.mo160056a(C45312b.this.mo160055a(optJSONObject.optJSONObject("style")));
                        instance.putString("msg_card_style_narrow_content_gray", optJSONObject.toString());
                        Log.m165389i("MessageCardStyleProvider", "gray card style updated narrow version=" + optInt);
                    } catch (JSONException e) {
                        Log.m165384e("MessageCardStyleProvider", "pull gray card style to json", e);
                    }
                }
            }
        }, new SdkSender.IParser<SendHttpResponse>() {
            /* class com.ss.android.lark.message.card.p2267g.C45312b.C453164 */

            /* renamed from: a */
            public SendHttpResponse parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr);
            }
        });
    }

    /* renamed from: b */
    private boolean m179932b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = FileUtils.getFilesDirPath(context) + File.separator + "default_card_style.zip";
        Log.m165379d("MessageCardStyleProvider", "dst card style zip path=" + str);
        if (FileUtils.exists(str)) {
            Log.m165379d("MessageCardStyleProvider", "dst card style zip exists");
            C26311p.m95291k(str);
        }
        C26311p.m95270a(context, "default_card_style.zip", str);
        String a = m179928a(context);
        if (FileUtils.exists(a)) {
            Log.m165379d("MessageCardStyleProvider", "dst card style json exists");
            C26311p.m95291k(a);
        }
        try {
            ar.m95061a(new File(str));
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.m165379d("MessageCardStyleProvider", "unzip default card style cost=" + (currentTimeMillis2 - currentTimeMillis));
            return true;
        } catch (IOException e) {
            Log.m165384e("MessageCardStyleProvider", "unzip default card style", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf A[SYNTHETIC, Splitter:B:31:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6 A[SYNTHETIC, Splitter:B:41:0x00d6] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m179931a(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.message.card.p2267g.C45312b.m179931a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public HashMap mo160055a(JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m165383e("MessageCardStyleProvider", "parse null json style");
            return new HashMap();
        }
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (TextUtils.isEmpty(optString)) {
                Log.m165397w("MessageCardStyleProvider", "style " + next + " is null");
            } else if (!optString.contains(";")) {
                Log.m165397w("MessageCardStyleProvider", "style " + next + " is invalid");
                Log.m165379d("MessageCardStyleProvider", "style " + next + ContainerUtils.KEY_VALUE_DELIMITER + optString + " is invalid");
            } else {
                String[] split = optString.split(";");
                HashMap hashMap2 = new HashMap(split.length);
                for (String str : split) {
                    if (!str.contains(":")) {
                        Log.m165397w("MessageCardStyleProvider", "style " + next + " is invalid styleValue=" + optString);
                    } else {
                        String[] split2 = str.split(":");
                        if (split2 != null && split2.length == 2) {
                            hashMap2.put(split2[0], split2[1]);
                        }
                    }
                }
                hashMap.put(next, hashMap2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m179930a(AbstractC45287a aVar, int i, int i2) {
        String format = String.format("https://%s/lark/card/api/GetCardStyle", aVar.mo143891a(DomainSettings.Alias.OPEN_MSG_CARD));
        HashMap hashMap = new HashMap();
        hashMap.put("Cookie", "session=" + aVar.mo143902c());
        Log.m165379d("MessageCardStyleProvider", "pull style url=" + format + " narrowVersion=" + i + " wideVersion=" + i2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("narrow_version", i);
            jSONObject.put("wide_version", i2);
            SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55528a(format).mo55529a(hashMap).mo55533c(jSONObject.toString()), new IGetDataCallback<SendHttpResponse>() {
                /* class com.ss.android.lark.message.card.p2267g.C45312b.C453131 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("MessageCardStyleProvider", "pull card style errorCode=" + errorResult.getErrorCode() + " errorMsg=" + errorResult.getDisplayMsg());
                }

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                    Log.m165379d("MessageCardStyleProvider", "card style respLen=" + sendHttpResponse.json_body.length());
                    if (!TextUtils.isEmpty(sendHttpResponse.json_body)) {
                        try {
                            JSONObject jSONObject = new JSONObject(sendHttpResponse.json_body);
                            if (jSONObject.optInt("code", Integer.MIN_VALUE) != 0) {
                                Log.m165383e("MessageCardStyleProvider", "card style resp errorCode=" + jSONObject.optInt("code") + " errorMsg=" + jSONObject.optString("message"));
                                return;
                            }
                            JSONObject optJSONObject = jSONObject.optJSONObject("narrow");
                            int optInt = optJSONObject.optInt(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                            UserSP instance = UserSP.getInstance();
                            int i = instance.getInt("msg_card_style_narrow_version", -1);
                            if (optInt <= i) {
                                Log.m165397w("MessageCardStyleProvider", "server card style version is low serVer=" + optInt + " currVer=" + i);
                                return;
                            }
                            C45312b.this.mo160056a(C45312b.this.mo160055a(optJSONObject.optJSONObject("style")));
                            instance.putInt("msg_card_style_narrow_version", optInt);
                            instance.putString("msg_card_style_narrow_content", optJSONObject.toString());
                            Log.m165389i("MessageCardStyleProvider", "server card updated serVer=" + optInt);
                        } catch (JSONException e) {
                            Log.m165384e("MessageCardStyleProvider", "pull card style to json", e);
                        }
                    }
                }
            }, new SdkSender.IParser<SendHttpResponse>() {
                /* class com.ss.android.lark.message.card.p2267g.C45312b.C453142 */

                /* renamed from: a */
                public SendHttpResponse parse(byte[] bArr) throws IOException {
                    return SendHttpResponse.ADAPTER.decode(bArr);
                }
            });
        } catch (JSONException e) {
            Log.m165384e("MessageCardStyleProvider", "put version to body", e);
        }
    }
}
