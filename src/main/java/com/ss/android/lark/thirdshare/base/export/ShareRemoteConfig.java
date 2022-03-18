package com.ss.android.lark.thirdshare.base.export;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShareRemoteConfig implements Serializable {
    private Map<String, String> answer_types = new HashMap();
    private List<String> items = new ArrayList();

    public Map<String, String> getAnswerTypes() {
        return this.answer_types;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String toString() {
        return "ShareConfig{items=" + this.items + ", answer_types=" + this.answer_types + '}';
    }

    public static Map<String, ShareRemoteConfig> parse(String str) {
        HashMap hashMap = new HashMap();
        if (str != null && !str.isEmpty()) {
            Gson create = new GsonBuilder().serializeNulls().create();
            for (Map.Entry<String, JsonElement> entry : new JsonParser().parse(str).getAsJsonObject().entrySet()) {
                String key = entry.getKey();
                JsonElement value = entry.getValue();
                JsonElement jsonElement = value.getAsJsonObject().get("multiChannel");
                if (jsonElement == null || !Boolean.parseBoolean(jsonElement.toString())) {
                    hashMap.put(key, create.fromJson(entry.getValue(), ShareRemoteConfig.class));
                } else {
                    for (Map.Entry<String, JsonElement> entry2 : value.deepCopy().getAsJsonObject().entrySet()) {
                        String key2 = entry2.getKey();
                        if (!key2.equals("multiChannel")) {
                            hashMap.put(key + "." + key2, create.fromJson(entry2.getValue(), ShareRemoteConfig.class));
                        }
                    }
                }
            }
        }
        return hashMap;
    }
}
