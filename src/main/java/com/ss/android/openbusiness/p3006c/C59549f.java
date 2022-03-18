package com.ss.android.openbusiness.p3006c;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.openbusiness.OpbScene;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.openbusiness.c.f */
public class C59549f {
    /* renamed from: a */
    public static void m231038a(OpbScene opbScene) {
        if (opbScene == OpbScene.MESSAGE_ACTION) {
            Statistics.sendEvent("im_chat_msg_menu_more_app_view");
        } else {
            Statistics.sendEvent("im_chat_input_plus_more_app_view");
        }
    }

    /* renamed from: a */
    public static void m231039a(OpbScene opbScene, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("click", "openplatform_app");
            jSONObject.put("target", "none");
            jSONObject.put("click_application_id", str);
            if (opbScene == OpbScene.MESSAGE_ACTION) {
                Statistics.sendEvent("im_chat_msg_menu_more_app_click", jSONObject);
            } else {
                Statistics.sendEvent("im_chat_msg_plus_more_app_click", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m231040a(AppShortCutChatData appShortCutChatData, boolean z, String str) {
        Map<String, Object> b = ChatParamUtils.m133149b(appShortCutChatData.mo202946e());
        if (b != null) {
            JSONObject jSONObject = new JSONObject(b);
            if (!z) {
                try {
                    jSONObject.put("click", "openplatform_app");
                    jSONObject.put("target", "none");
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                jSONObject.put("click", "more");
                jSONObject.put("target", "im_chat_input_plus_more_app_view");
            }
            jSONObject.put("click_application_id", str);
            Statistics.sendEvent("im_chat_input_plus_click", jSONObject);
        }
    }
}
