package com.ss.android.lark.meego.wrapper.p2246a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.meego.wrapper.MeegoModule;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.meego.wrapper.a.a */
public class C44859a {
    /* renamed from: a */
    public static void m177835a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            Log.m165383e("MeegoModule", "openMeegoToCreateProject, params is null");
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            Log.m165383e("MeegoModule", "openMeegoToCreateProject, paramsStr is empty");
            return;
        }
        Context context = MeegoModule.m177824d().getContext();
        if (context == null) {
            Log.m165383e("MeegoModule", "openMeegoToCreateProject, context is null");
            return;
        }
        Log.m165379d("MeegoModule", "openMeegoToCreateProject params=" + jSONObject2);
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("work_item_context", Base64.encodeToString(jSONObject2.getBytes(StandardCharsets.UTF_8), 2));
        } catch (Exception e) {
            Log.m165384e("MeegoModule", "openMeegoToCreateProject, Base64.encodeToString error", e);
        }
        MeegoOpener.m177845a(context, "/create_work_item", hashMap);
        MeegoHitPoint.f113632a.mo158742a(str);
    }

    /* renamed from: a */
    public static JSONObject m177834a(String str, Chat chat, JSONArray jSONArray) {
        if (chat == null) {
            return null;
        }
        String id = chat.getId();
        String name = chat.getName();
        String avatarKey = chat.getAvatarKey();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("chat_id", id);
            jSONObject.put("name", name);
            jSONObject.put("avatar_key", avatarKey);
            jSONObject.put("is_group", chat.isGroup());
            jSONObject.put("from", str);
            if (jSONArray != null) {
                jSONObject.put("messages", jSONArray);
            }
        } catch (JSONException e) {
            Log.m165384e("MeegoModule", "getCreateJobParams json error", e);
        }
        return jSONObject;
    }
}
