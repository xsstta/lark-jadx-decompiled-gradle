package com.facebook.react.modules.storage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* renamed from: com.facebook.react.modules.storage.b */
public class C21251b {
    /* renamed from: a */
    static WritableMap m77039a(String str) {
        return m77040a(str, "Invalid key");
    }

    /* renamed from: b */
    static WritableMap m77041b(String str) {
        return m77040a(str, "Invalid Value");
    }

    /* renamed from: c */
    static WritableMap m77042c(String str) {
        return m77040a(str, "Database Error");
    }

    /* renamed from: a */
    static WritableMap m77040a(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (str != null) {
            createMap.putString("key", str);
        }
        return createMap;
    }
}
