package com.ss.android.lark.mm.module.player.core.layer.p2316g;

import android.util.SparseArray;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.g.a */
public class C46647a {

    /* renamed from: a */
    private static SparseArray<String> f117361a;

    /* renamed from: a */
    public static String m184513a(int i) {
        if (f117361a == null) {
            f117361a = m184512a(AbstractC64123g.class);
        }
        return f117361a.get(i);
    }

    /* renamed from: a */
    private static SparseArray<String> m184512a(Class<?> cls) {
        SparseArray<String> sparseArray = new SparseArray<>();
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null) {
            for (Field field : declaredFields) {
                try {
                    sparseArray.put(((Integer) field.get(null)).intValue(), field.getName());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return sparseArray;
    }
}
