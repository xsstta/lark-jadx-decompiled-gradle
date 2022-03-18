package com.bytedance.ee.ref.card.meta.p693a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.tt.miniapphost.util.DebugUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.ref.card.meta.a.a */
public class C13551a {

    /* renamed from: a */
    public static Gson f35668a = new GsonBuilder().registerTypeAdapter(CardAppInfo.class, new C13552a()).create();

    /* renamed from: com.bytedance.ee.ref.card.meta.a.a$a */
    static class C13552a implements JsonDeserializer<CardAppInfo>, JsonSerializer<CardAppInfo> {
        C13552a() {
        }

        /* renamed from: a */
        public CardAppInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement == null) {
                AppBrandLogger.m52829e("card_app_meta", "deserialize error:json is null!");
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(jsonElement.toString());
                CardAppInfo cardAppInfo = new CardAppInfo();
                cardAppInfo.setAppId(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
                cardAppInfo.setIdentifier(jSONObject.optString("cardid"));
                cardAppInfo.setAppVersion(jSONObject.optString("card_version"));
                cardAppInfo.setIcon(jSONObject.optString("icon"));
                cardAppInfo.setName(jSONObject.optString("name"));
                cardAppInfo.mo50317a(jSONObject.optString("extra"));
                cardAppInfo.mo50320b(jSONObject.optString("min_client_version"));
                cardAppInfo.setVersionType(jSONObject.optString("version_type"));
                cardAppInfo.mo50322c(jSONObject.optString(ShareHitPoint.f121869d));
                cardAppInfo.mo50324d(jSONObject.optString("mobile_md5"));
                JSONArray optJSONArray = jSONObject.optJSONArray("mobile_path");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(optJSONArray.getString(i));
                    }
                    cardAppInfo.mo50318a(arrayList);
                }
                return cardAppInfo;
            } catch (JSONException e) {
                AppBrandLogger.m52829e("card_app_meta", "deserialize error:" + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: a */
        public JsonElement serialize(CardAppInfo cardAppInfo, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(HiAnalyticsConstant.HaKey.BI_KEY_APPID, cardAppInfo.getAppId());
            jsonObject.addProperty("cardid", cardAppInfo.getIdentifier());
            jsonObject.addProperty("card_version", cardAppInfo.getAppVersion());
            jsonObject.addProperty("extra", cardAppInfo.mo50316a());
            jsonObject.addProperty("icon", cardAppInfo.getIcon());
            jsonObject.addProperty("mobile_md5", cardAppInfo.mo50323d());
            jsonObject.addProperty("min_client_version", cardAppInfo.mo50319b());
            jsonObject.addProperty("name", cardAppInfo.getName());
            jsonObject.addProperty("version_type", cardAppInfo.getVersionType());
            jsonObject.add("mobile_path", C13551a.f35668a.toJsonTree(cardAppInfo.mo50325e(), new TypeToken<List<String>>() {
                /* class com.bytedance.ee.ref.card.meta.p693a.C13551a.C13552a.C135531 */
            }.getType()).getAsJsonArray());
            jsonObject.addProperty(ShareHitPoint.f121869d, cardAppInfo.mo50321c());
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("card_app_meta", "serialize:" + jsonObject.toString());
            }
            return jsonObject;
        }
    }

    /* renamed from: a */
    public static Gson m55007a() {
        return f35668a;
    }
}
