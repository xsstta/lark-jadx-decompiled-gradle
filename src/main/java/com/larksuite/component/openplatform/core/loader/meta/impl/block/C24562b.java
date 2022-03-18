package com.larksuite.component.openplatform.core.loader.meta.impl.block;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.loader.meta.C24548a;
import com.larksuite.component.openplatform.core.loader.meta.base.C24555d;
import java.lang.reflect.Type;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.impl.block.b */
public class C24562b implements JsonDeserializer<C24560a>, JsonSerializer<C24560a> {
    /* renamed from: a */
    public JsonElement serialize(C24560a aVar, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_id", aVar.getAppId());
        jsonObject.addProperty("identifier", aVar.getIdentifier());
        jsonObject.addProperty("name", aVar.getName());
        jsonObject.addProperty("icon", aVar.getIcon());
        jsonObject.addProperty(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, aVar.getAppVersion());
        jsonObject.addProperty("extension_version", aVar.mo87517e());
        jsonObject.addProperty("basic_lib_version", aVar.mo87507a());
        jsonObject.addProperty("code_info", C24548a.m89535a().toJson(aVar.mo87516d()));
        return jsonObject;
    }

    /* renamed from: a */
    public C24560a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement == null) {
            AppBrandLogger.m52829e("app_meta_block_type_adapter", "BlockAppInfoTypeAdapter->deserialize->json is null!");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonElement.toString());
            C24560a aVar = new C24560a();
            aVar.setAppId(jSONObject.optString("app_id"));
            aVar.setIdentifier(jSONObject.optString("identifier"));
            aVar.setName(jSONObject.optString("name"));
            aVar.setIcon(jSONObject.optString("icon"));
            aVar.setAppVersion(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION));
            aVar.mo87513b(jSONObject.optString("extension_version"));
            aVar.mo87509a(jSONObject.optString("basic_lib_version"));
            aVar.mo87508a((C24555d) C24548a.m89535a().fromJson(jSONObject.optString("code_info"), new TypeToken<C24555d>() {
                /* class com.larksuite.component.openplatform.core.loader.meta.impl.block.C24562b.C245631 */
            }.getType()));
            AppBrandLogger.m52830i("app_meta_block_type_adapter", "block app info:", aVar);
            return aVar;
        } catch (JSONException e) {
            AppBrandLogger.m52829e("app_meta_block_type_adapter", "BlockAppInfoTypeAdapter->deserialize error:", e.getMessage(), e);
            return null;
        }
    }
}
