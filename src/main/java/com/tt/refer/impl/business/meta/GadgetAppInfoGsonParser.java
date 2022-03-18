package com.tt.refer.impl.business.meta;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
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
import com.ss.android.lark.log.Log;
import com.tt.miniapphost.util.DebugUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GadgetAppInfoGsonParser {
    private static final String VERSION_CODE = "version_code";
    public static Gson sGSon = new GsonBuilder().registerTypeAdapter(GadgetAppInfo.class, new C67937a()).create();

    /* renamed from: com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser$a */
    static class C67937a implements JsonDeserializer<GadgetAppInfo>, JsonSerializer<GadgetAppInfo> {
        C67937a() {
        }

        /* renamed from: a */
        public GadgetAppInfo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement != null) {
                return GadgetAppInfoGsonParser.decodeGadgetAppInfo(jsonElement.toString());
            }
            AppBrandLogger.m52829e("card_app_meta", "deserialize error:json is null!");
            return null;
        }

        /* renamed from: a */
        public JsonElement serialize(GadgetAppInfo gadgetAppInfo, Type type, JsonSerializationContext jsonSerializationContext) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(HiAnalyticsConstant.HaKey.BI_KEY_APPID, gadgetAppInfo.getAppId());
            jsonObject.addProperty(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, gadgetAppInfo.getAppVersion());
            jsonObject.addProperty("icon", gadgetAppInfo.getIcon());
            jsonObject.addProperty("name", gadgetAppInfo.getName());
            jsonObject.addProperty("md5", gadgetAppInfo.getMd5());
            jsonObject.addProperty("decode_md5", gadgetAppInfo.getDecodeMd5());
            jsonObject.add("path", GadgetAppInfoGsonParser.sGSon.toJsonTree(gadgetAppInfo.getPaths(), new TypeToken<List<String>>() {
                /* class com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser.C67937a.C679381 */
            }.getType()).getAsJsonArray());
            jsonObject.addProperty("min_jssdk", gadgetAppInfo.getMinJsSdk());
            jsonObject.addProperty(ShareHitPoint.f121869d, Integer.valueOf(gadgetAppInfo.getType()));
            jsonObject.addProperty("state", Integer.valueOf(gadgetAppInfo.getState()));
            jsonObject.addProperty("version_state", Integer.valueOf(gadgetAppInfo.getVersionState()));
            jsonObject.addProperty("share_level", Integer.valueOf(gadgetAppInfo.getShareLevel()));
            jsonObject.addProperty("extra", gadgetAppInfo.getExtra());
            jsonObject.addProperty("decode_extra", gadgetAppInfo.getDecodeExtra());
            jsonObject.addProperty(GadgetAppInfoGsonParser.VERSION_CODE, Long.valueOf(gadgetAppInfo.getVersionCode()));
            jsonObject.add("components", GadgetAppInfoGsonParser.sGSon.toJsonTree(gadgetAppInfo.getJsComponents().values(), new TypeToken<Set<DependComponent>>() {
                /* class com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser.C67937a.C679392 */
            }.getType()).getAsJsonArray());
            jsonObject.addProperty("message_action", Boolean.valueOf(gadgetAppInfo.isSupportMessageAction()));
            jsonObject.addProperty("chat_action", Boolean.valueOf(gadgetAppInfo.isSupportChatAction()));
            jsonObject.addProperty("domains", gadgetAppInfo.getDomains());
            jsonObject.addProperty("decode_domains", gadgetAppInfo.getDecodeDomains());
            Map<String, PackageComponent> packageComponents = gadgetAppInfo.getPackageComponents();
            if (packageComponents != null) {
                JsonObject jsonObject2 = new JsonObject();
                for (String str : packageComponents.keySet()) {
                    jsonObject2.add(str, GadgetAppInfoGsonParser.sGSon.toJsonTree(packageComponents.get(str), new TypeToken<PackageComponent>() {
                        /* class com.tt.refer.impl.business.meta.GadgetAppInfoGsonParser.C67937a.C679403 */
                    }.getType()).getAsJsonObject());
                }
                jsonObject.add("mobileSubPackage", jsonObject2);
            }
            if (DebugUtil.debug()) {
                AppBrandLogger.m52828d("card_app_meta", "serialize:" + jsonObject.toString());
            }
            return jsonObject;
        }
    }

    public static Gson getGson() {
        return sGSon;
    }

    public static GadgetAppInfo decodeGadgetAppInfo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            GadgetAppInfo gadgetAppInfo = new GadgetAppInfo();
            gadgetAppInfo.setAppId(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
            gadgetAppInfo.setIdentifier(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
            gadgetAppInfo.setAppVersion(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION));
            gadgetAppInfo.setIcon(jSONObject.optString("icon"));
            gadgetAppInfo.setName(jSONObject.optString("name"));
            gadgetAppInfo.setCompileVersion(jSONObject.optString("compile_version"));
            gadgetAppInfo.setExtra(jSONObject.optString("extra"));
            gadgetAppInfo.setDecodeExtra(jSONObject.optString("decode_extra"));
            gadgetAppInfo.setMinJsSdk(jSONObject.optString("min_jssdk"));
            gadgetAppInfo.setType(jSONObject.optInt(ShareHitPoint.f121869d));
            gadgetAppInfo.setState(jSONObject.optInt("state"));
            gadgetAppInfo.setVersionState(jSONObject.optInt("version_state"));
            gadgetAppInfo.setShareLevel(jSONObject.optInt("share_level"));
            gadgetAppInfo.setVersionCode(jSONObject.optLong(VERSION_CODE));
            gadgetAppInfo.setSupportMessageAction(jSONObject.optBoolean("message_action"));
            gadgetAppInfo.setSupportChatAction(jSONObject.optBoolean("chat_action"));
            JSONArray optJSONArray = jSONObject.optJSONArray("components");
            HashMap hashMap = new HashMap();
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        DependComponent dependComponent = new DependComponent();
                        dependComponent.mo235709a(optJSONObject.optString("name", ""));
                        hashMap.put(dependComponent.mo235708a(), dependComponent);
                    }
                }
                gadgetAppInfo.setJsComponents(hashMap);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("gadgetSafeUrls");
            if (optJSONArray2 != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    try {
                        arrayList.add(optJSONArray2.getString(i2));
                    } catch (JSONException e) {
                        Log.m165384e("card_app_meta", "JSONException", e);
                    }
                }
                gadgetAppInfo.setGadgetSafeDomains(arrayList);
            }
            gadgetAppInfo.setDomains(jSONObject.optString("domains"));
            gadgetAppInfo.setDecodeDomains(jSONObject.optString("decode_domains"));
            gadgetAppInfo.setTtCode(jSONObject.optString("ttcode", ""));
            gadgetAppInfo.setMd5(jSONObject.optString("md5"));
            gadgetAppInfo.setDecodeMd5(jSONObject.optString("decode_md5"));
            gadgetAppInfo.setCompileVersion(jSONObject.optString("compile_version"));
            JSONArray optJSONArray3 = jSONObject.optJSONArray("path");
            if (optJSONArray3 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList2.add(optJSONArray3.getString(i3));
                }
                gadgetAppInfo.setPaths(arrayList2);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mobileSubPackage");
            if (optJSONObject2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = optJSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = optJSONObject2.get(next);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        PackageComponent packageComponent = new PackageComponent();
                        packageComponent.mo235793a(jSONObject2.optString("md5"));
                        packageComponent.mo235795a(jSONObject2.optBoolean("independent"));
                        JSONArray optJSONArray4 = jSONObject2.optJSONArray("path");
                        if (optJSONArray4 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                                arrayList3.add(optJSONArray4.getString(i4));
                            }
                            packageComponent.mo235797b(arrayList3);
                        }
                        JSONArray optJSONArray5 = jSONObject2.optJSONArray("pages");
                        if (optJSONArray5 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                                arrayList4.add(optJSONArray5.getString(i5));
                            }
                            packageComponent.mo235794a(arrayList4);
                        }
                        linkedHashMap.put(next, packageComponent);
                    }
                }
                gadgetAppInfo.setPackageComponents(linkedHashMap);
            }
            return gadgetAppInfo;
        } catch (JSONException e2) {
            AppBrandLogger.m52829e("card_app_meta", "deserialize error:" + e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }
}
