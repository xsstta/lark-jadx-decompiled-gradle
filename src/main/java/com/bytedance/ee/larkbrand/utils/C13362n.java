package com.bytedance.ee.larkbrand.utils;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapphost.C67432a;
import com.tt.refer.common.service.net.C67852a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.utils.n */
public class C13362n {

    /* renamed from: com.bytedance.ee.larkbrand.utils.n$a */
    public interface AbstractC13365a {
        /* renamed from: a */
        void mo49667a(String str, Throwable th);

        /* renamed from: a */
        void mo49668a(HashMap<String, Object> hashMap);
    }

    /* renamed from: a */
    public static void m54361a(String str, final AbstractC13365a aVar, final boolean z, IAppContext iAppContext) {
        final C67852a aVar2 = new C67852a();
        final HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray(str);
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    String optString = optJSONObject.optString("id");
                    int optInt = optJSONObject.optInt("chatType");
                    if (optJSONObject.optBoolean("isBot")) {
                        optInt = 2;
                    }
                    jSONObject2.put("chatid", optString);
                    jSONObject2.put(ShareHitPoint.f121869d, optInt);
                    hashMap.put(optString, optJSONObject);
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, C67432a.m262319a(iAppContext).getAppInfo().appId);
            jSONObject.put("chats", jSONArray2);
            jSONObject.put("ttcode", aVar2.mo235486a(iAppContext));
        } catch (JSONException e) {
            e.printStackTrace();
            AppBrandLogger.eWithThrowable("ForwardIdUtils", "opt result json failed", e);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap2.put("domain_alias", "open");
        }
        C12843b.m53039a(C13047a.C13049b.m53532a() + "/v4/getOpenChatIDsByChatIDs", (Map<String, String>) hashMap2, jSONObject, iAppContext, true).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
            /* class com.bytedance.ee.larkbrand.utils.C13362n.C133631 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                if (TextUtils.isEmpty(str)) {
                    AppBrandLogger.m52829e("request response empty", new Object[0]);
                    aVar.mo49667a("request failed", null);
                    return;
                }
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("error") || jSONObject.getInt("error") != 0 || !jSONObject.has("encryptedData")) {
                    AppBrandLogger.m52829e("ForwardIdUtils", "get openchatid failed.");
                    aVar.mo49667a("request failed", null);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject(aVar2.mo235487a(jSONObject.getString("encryptedData"))).getJSONObject("openchatids");
                Iterator<String> keys = jSONObject2.keys();
                JSONArray jSONArray = new JSONArray();
                while (keys.hasNext()) {
                    JSONObject jSONObject3 = new JSONObject();
                    String next = keys.next();
                    JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                    String optString = optJSONObject.optString("open_chat_id");
                    String optString2 = optJSONObject.optString("chat_name");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("chat_i18n_names");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("chat_avatar_urls");
                    JSONObject jSONObject4 = (JSONObject) hashMap.get(next);
                    if (jSONObject4 != null) {
                        int optInt = jSONObject4.optInt("chatType");
                        boolean optBoolean = jSONObject4.optBoolean("isBot");
                        if (z) {
                            jSONObject3.put("name", optString2);
                            jSONObject3.put("i18nNames", optJSONObject2);
                            jSONObject3.put("avatarUrls", optJSONArray);
                        }
                        jSONObject3.put("id", optString);
                        if (optInt == 0) {
                            jSONObject3.put("userType", optBoolean ? 1 : 0);
                        }
                        jSONObject3.put("chatType", optInt);
                        jSONArray.put(jSONObject3);
                    } else {
                        AppBrandLogger.m52829e("ForwardIdUtils", "can not find item");
                    }
                }
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
                aVar.mo49668a(hashMap);
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.larkbrand.utils.C13362n.C133642 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                AppBrandLogger.m52829e("ForwardIdUtils", "share to get openchatid failed.", th);
                aVar.mo49667a("", th);
            }
        });
    }
}
