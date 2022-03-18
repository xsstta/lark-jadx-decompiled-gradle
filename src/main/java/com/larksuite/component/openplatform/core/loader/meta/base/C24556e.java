package com.larksuite.component.openplatform.core.loader.meta.base;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.tt.refer.impl.business.meta.DependComponent;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.base.e */
public class C24556e implements JsonDeserializer<C24555d>, JsonSerializer<C24555d> {
    /* renamed from: a */
    public JsonElement serialize(C24555d dVar, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("url", dVar.mo87501d());
        jsonObject.addProperty("md5", dVar.mo87498b());
        jsonObject.add("backup_urls", C24548a.m89535a().toJsonTree(dVar.mo87494a(), new TypeToken<List<String>>() {
            /* class com.larksuite.component.openplatform.core.loader.meta.base.C24556e.C245582 */
        }.getType()).getAsJsonArray());
        jsonObject.add("components", C24548a.m89535a().toJsonTree(dVar.mo87500c().values(), new TypeToken<Set<DependComponent>>() {
            /* class com.larksuite.component.openplatform.core.loader.meta.base.C24556e.C245593 */
        }.getType()).getAsJsonArray());
        return jsonObject;
    }

    /* renamed from: a */
    public C24555d deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            AppBrandLogger.m52829e("app_meta_code_info_type_adapter", "deserialize error:json is null!");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonElement.toString());
            C24555d dVar = new C24555d();
            dVar.mo87499b(jSONObject.optString("url"));
            dVar.mo87495a(jSONObject.optString("md5"));
            JSONArray optJSONArray = jSONObject.optJSONArray("backup_urls");
            if (optJSONArray != null) {
                dVar.mo87496a((List) C24548a.m89535a().fromJson(optJSONArray.toString(), new TypeToken<List<String>>() {
                    /* class com.larksuite.component.openplatform.core.loader.meta.base.C24556e.C245571 */
                }.getType()));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("components");
            HashMap hashMap = new HashMap();
            if (optJSONArray2 != null) {
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                    if (optJSONObject != null) {
                        DependComponent dependComponent = new DependComponent();
                        dependComponent.mo235709a(optJSONObject.optString("name", ""));
                        hashMap.put(dependComponent.mo235708a(), dependComponent);
                    }
                }
                dVar.mo87497a(hashMap);
            }
            AppBrandLogger.m52830i("app_meta_code_info_type_adapter", "code info:", dVar);
            return dVar;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("app_meta_code_info_type_adapter", "Code Info deserialize error:" + e.getMessage());
            return null;
        }
    }
}
