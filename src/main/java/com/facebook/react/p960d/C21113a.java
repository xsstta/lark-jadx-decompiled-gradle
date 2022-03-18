package com.facebook.react.p960d;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;
import javax.annotation.Nullable;

/* renamed from: com.facebook.react.d.a */
public class C21113a {
    /* renamed from: a */
    public static String m76744a(@Nullable ReadableMap readableMap) {
        if (!(readableMap == null || readableMap.getType("extraData") == ReadableType.Null)) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic("extraData"));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
