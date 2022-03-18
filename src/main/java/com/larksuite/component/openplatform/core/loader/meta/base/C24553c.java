package com.larksuite.component.openplatform.core.loader.meta.base;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.c */
public class C24553c implements JsonDeserializer<ApplicationMeta> {
    /* renamed from: a */
    public ApplicationMeta deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JSONArray optJSONArray;
        if (jsonElement == null) {
            AppBrandLogger.m52829e("app_meta_type_adapter", "deserialize error:json is null!");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonElement.toString());
            JSONObject optJSONObject = jSONObject.optJSONObject("app_base_info");
            if (optJSONObject == null) {
                AppBrandLogger.m52829e("app_meta_type_adapter", "ApplicationMeta deserialize baseAppInfo Json is null!");
                return null;
            }
            ApplicationMeta applicationMeta = new ApplicationMeta();
            applicationMeta.mo87469a(optJSONObject.optString("app_id"));
            applicationMeta.mo87478d(optJSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION));
            applicationMeta.mo87474b(optJSONObject.optString("icon"));
            applicationMeta.mo87476c(optJSONObject.optString("name"));
            boolean optBoolean = optJSONObject.optBoolean("useOpenSchemaWhiteList");
            applicationMeta.mo87472a(optBoolean);
            ArrayList arrayList = new ArrayList();
            if (optBoolean && (optJSONArray = optJSONObject.optJSONArray("openSchemaWhiteList")) != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    String optString = jSONObject2.optString("schema");
                    String optString2 = jSONObject2.optString("host");
                    ApplicationMeta.C24550b bVar = new ApplicationMeta.C24550b();
                    bVar.mo87488a(optString2);
                    bVar.mo87490b(optString);
                    arrayList.add(bVar);
                }
            }
            applicationMeta.mo87470a(arrayList);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("extension_metas");
            if (optJSONArray2 == null) {
                AppBrandLogger.m52829e("app_meta_type_adapter", "ApplicationMeta deserialize extension_metas Json is null!");
                return applicationMeta;
            }
            List<ApplicationMeta.C24549a> list = (List) C24548a.m89535a().fromJson(optJSONArray2.toString(), new TypeToken<List<ApplicationMeta.C24549a>>() {
                /* class com.larksuite.component.openplatform.core.loader.meta.base.C24553c.C245541 */
            }.getType());
            HashMap hashMap = new HashMap();
            if (list != null && !list.isEmpty()) {
                for (ApplicationMeta.C24549a aVar : list) {
                    if (aVar != null) {
                        hashMap.put(aVar.mo87484c(), aVar);
                    }
                }
            }
            applicationMeta.mo87471a(hashMap);
            return applicationMeta;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("app_meta_type_adapter", "ApplicationMetaTypeAdapter deserialize error:", e.getMessage(), e);
            return null;
        }
    }
}
