package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.refer.common.service.net.C67852a;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.b */
public class C13259b {

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.b$a */
    public interface AbstractC13262a {
        void onOpenidGet(String[] strArr, String[] strArr2);
    }

    /* renamed from: b */
    private static String[] m54029b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            String[] strArr = new String[length];
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    strArr[i] = jSONArray.optString(i);
                }
            }
            return strArr;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("EditorJsonUtil", "picture json error", e);
            return null;
        }
    }

    /* renamed from: a */
    public static RichTextData.UserModel m54025a(JSONObject jSONObject) {
        JSONArray jSONArray;
        RichTextData.UserModel userModel = new RichTextData.UserModel();
        try {
            if (jSONObject.has("items") && (jSONArray = jSONObject.getJSONArray("items")) != null && jSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.optString(i));
                }
                userModel.setItems(arrayList);
            }
            if (jSONObject.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                userModel.setData(jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("EditorJsonUtil", "user mode json error", e);
        }
        return userModel;
    }

    /* renamed from: a */
    public static RichTextData m54026a(String str) {
        RichTextData richTextData = new RichTextData();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("picture")) {
                richTextData.setPicture(m54029b(jSONObject.optJSONArray("picture")));
            }
            if (jSONObject.has("at")) {
                richTextData.setAt(m54028a(jSONObject.optJSONArray("at")));
            }
            if (jSONObject.has("userModelSelect")) {
                richTextData.setMode(m54025a(jSONObject.optJSONObject("userModelSelect")));
            }
            if (jSONObject.has("avatar")) {
                richTextData.setAvatar(jSONObject.optString("avatar"));
            }
            if (jSONObject.has("showEmoji")) {
                richTextData.setShowEmoji(jSONObject.optBoolean("showEmoji"));
            }
            if (jSONObject.has("content")) {
                richTextData.setContent(jSONObject.optString("content"));
            }
            if (jSONObject.has("eventName")) {
                richTextData.setEventName(jSONObject.optString("eventName"));
            }
            if (jSONObject.has("placeholder")) {
                richTextData.setPlaceholder(jSONObject.optString("placeholder"));
            }
            if (jSONObject.has("enablesReturnKey")) {
                richTextData.setEnablesReturnKey(jSONObject.optBoolean("enablesReturnKey"));
            }
            if (!jSONObject.has("customize")) {
                return richTextData;
            }
            richTextData.setCustomize(jSONObject.getBoolean("customize"));
            return richTextData;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("EditorJsonUtil", "fetchShowFunction parse json error", e);
            return null;
        }
    }

    /* renamed from: a */
    public static RichTextData.AtData[] m54028a(JSONArray jSONArray) {
        RichTextData.AtData[] atDataArr = null;
        if (jSONArray == null) {
            return null;
        }
        try {
            int length = jSONArray.length();
            atDataArr = new RichTextData.AtData[length];
            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    atDataArr[i] = new RichTextData.AtData();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.has("id")) {
                        atDataArr[i].setId(jSONObject.optString("id"));
                    }
                    if (jSONObject.has("name")) {
                        atDataArr[i].setName(jSONObject.optString("name"));
                    }
                    if (jSONObject.has("offset")) {
                        atDataArr[i].setOffset(jSONObject.optInt("offset"));
                    }
                    if (jSONObject.has("length")) {
                        atDataArr[i].setLength(jSONObject.optInt("length"));
                    }
                    if (jSONObject.has("color")) {
                        atDataArr[i].setColor(jSONObject.optString("color"));
                    }
                }
            }
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("EditorJsonUtil", "at flag json error", e);
        }
        return atDataArr;
    }

    /* renamed from: a */
    public static void m54027a(final JSONObject jSONObject, final AbstractC13262a aVar, final IAppContext iAppContext) {
        final C67852a aVar2 = new C67852a();
        final String str = C13047a.C13049b.m53532a() + "/v2/getOpenIDsByUserIDs";
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            jSONObject.put("ttcode", aVar2.mo235486a(iAppContext));
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("EditorJsonUtil", "add ttcode failed", e);
        }
        AppBrandLogger.m52828d("EditorJsonUtil", "begin getOpenid=" + jSONObject);
        DebugUtils.m54326a("event_request_get_openid_by_user", DebugUtils.m54323a(true, str));
        HashMap hashMap = new HashMap();
        hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        C12843b.m53039a(str, (Map<String, String>) hashMap, jSONObject, iAppContext, true).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13259b.C132601 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                String[] strArr;
                if (TextUtils.isEmpty(str)) {
                    C13377u.m54425e("fail", System.currentTimeMillis() - currentTimeMillis, "null_response", iAppContext);
                    return;
                }
                int i = 0;
                DebugUtils.m54326a("event_request_get_openid_by_user", DebugUtils.m54325a(false, str, "json=" + jSONObject, Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY)));
                AppBrandLogger.m52828d("EditorJsonUtil", "getOpenid=" + str);
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("error") || jSONObject.getInt("error") != 0) {
                    C13377u.m54425e("fail", System.currentTimeMillis() - currentTimeMillis, "error_response", iAppContext);
                    return;
                }
                String[] strArr2 = null;
                C13377u.m54425e("success", System.currentTimeMillis() - currentTimeMillis, null, iAppContext);
                if (jSONObject.has("encryptedData")) {
                    JSONObject jSONObject2 = new JSONObject(aVar2.mo235487a(jSONObject.optString("encryptedData"))).getJSONObject("openids");
                    strArr2 = new String[jSONObject2.length()];
                    strArr = new String[jSONObject2.length()];
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        strArr[i] = next;
                        strArr2[i] = jSONObject2.optString(next);
                        i++;
                    }
                } else {
                    strArr = null;
                }
                AbstractC13262a aVar = aVar;
                if (aVar != null) {
                    aVar.onOpenidGet(strArr2, strArr);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13259b.C132612 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13377u.m54425e("fail", System.currentTimeMillis() - currentTimeMillis, th.getMessage(), iAppContext);
                AppBrandLogger.eWithThrowable("EditorJsonUtil", "get openid fail", th);
            }
        });
    }
}
