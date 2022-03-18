package com.ss.android.vcxp.p3184a;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vcxp.a.c */
public class C63789c implements JsonDeserializer<HashMap<Object, Object>>, JsonSerializer<HashMap<Object, Object>> {

    /* renamed from: a */
    public static final C63789c f160974a = new C63789c();

    private C63789c() {
    }

    /* renamed from: a */
    public JsonElement serialize(HashMap<Object, Object> hashMap, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("@type", HashMap.class.getName());
        for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
            jsonObject.addProperty(C63787b.m250460b(entry.getKey()), C63787b.m250460b(entry.getValue()));
        }
        return jsonObject;
    }

    /* renamed from: a */
    public HashMap<Object, Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        HashMap<Object, Object> hashMap = new HashMap<>();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            if (key.indexOf("\"@type\"") == 1) {
                hashMap.put(C63787b.m250459b(key, Object.class), C63787b.m250459b(entry.getValue().getAsString(), Object.class));
            }
        }
        return hashMap;
    }
}
