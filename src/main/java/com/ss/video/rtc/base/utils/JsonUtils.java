package com.ss.video.rtc.base.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {
    private static final Gson sGson = new GsonBuilder().create();

    public static String toJson(Object obj) {
        return sGson.toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) sGson.fromJson(str, (Class) cls);
    }

    public static <T> T convert(Object obj, Class<T> cls) {
        Gson gson = sGson;
        return (T) gson.fromJson(gson.toJson(obj), (Class) cls);
    }
}
