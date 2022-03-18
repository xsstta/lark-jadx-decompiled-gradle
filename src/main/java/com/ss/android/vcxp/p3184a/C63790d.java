package com.ss.android.vcxp.p3184a;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vcxp.a.d */
public class C63790d implements JsonDeserializer<List<Object>>, JsonSerializer<List<Object>> {

    /* renamed from: a */
    public static final C63790d f160975a = new C63790d();

    private C63790d() {
    }

    /* renamed from: a */
    public JsonElement serialize(List<Object> list, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        for (int i = 0; i < list.size(); i++) {
            jsonArray.add(C63787b.m250460b(list.get(i)));
        }
        return jsonArray;
    }

    /* renamed from: a */
    public List<Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ArrayList arrayList = new ArrayList();
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        for (int i = 0; i < asJsonArray.size(); i++) {
            arrayList.add(C63787b.m250459b(asJsonArray.get(i).getAsString(), String.class));
        }
        return arrayList;
    }
}
