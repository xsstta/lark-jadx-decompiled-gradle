package com.ss.android.lark.eetroublebase.p1826a;

import android.graphics.Bitmap;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ss.android.lark.eetroublebase.view.IgnoreModel;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.lark.eetroublebase.a.b */
public class C36964b {

    /* renamed from: a */
    private static Gson f95038a = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
        /* class com.ss.android.lark.eetroublebase.p1826a.C36964b.C369651 */

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipField(FieldAttributes fieldAttributes) {
            if (fieldAttributes.getDeclaringClass() == IgnoreModel.class) {
                return true;
            }
            return false;
        }

        @Override // com.google.gson.ExclusionStrategy
        public boolean shouldSkipClass(Class<?> cls) {
            if (Bitmap.class.isAssignableFrom(cls) || byte[].class.isAssignableFrom(cls) || Byte.TYPE.isAssignableFrom(cls) || ByteBuffer.class.isAssignableFrom(cls)) {
                return true;
            }
            return false;
        }
    }).create();

    /* renamed from: a */
    public static String m145945a(Object obj) {
        return f95038a.toJson(obj);
    }

    /* renamed from: a */
    public static <T> T m145944a(String str, Class<T> cls) {
        return (T) f95038a.fromJson(str, (Class) cls);
    }
}
