package com.ss.android.vc.meeting.framework.meeting.utils;

import android.util.SparseArray;
import com.ss.android.vc.meeting.framework.meeting.Description;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vc.meeting.framework.meeting.utils.a */
public class C61327a {

    /* renamed from: a */
    private static volatile Map<Class, SparseArray<Desc>> f153662a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.vc.meeting.framework.meeting.utils.a$a */
    public static class C61328a {
        /* renamed from: a */
        public static String m238901a(int i) {
            return C61327a.m238899b(IByteRtcError.class, i);
        }

        /* renamed from: b */
        public static String m238902b(int i) {
            return C61327a.m238900c(IByteRtcError.class, i);
        }
    }

    /* renamed from: a */
    private static void m238897a(Class cls) {
        if (f153662a.get(cls) == null) {
            f153662a.put(cls, m238898b(cls));
        }
    }

    /* renamed from: b */
    private static SparseArray<Desc> m238898b(Class cls) {
        String str;
        SparseArray<Desc> sparseArray = new SparseArray<>();
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null) {
            for (Field field : declaredFields) {
                try {
                    int i = field.getInt(null);
                    String name = field.getName();
                    Description description = (Description) field.getAnnotation(Description.class);
                    if (description != null) {
                        str = description.desc();
                    } else {
                        str = "";
                    }
                    sparseArray.put(i, new Desc(i, name, str));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static String m238899b(Class cls, int i) {
        Desc a = m238896a(cls, i);
        if (a != null) {
            return a.name;
        }
        return "";
    }

    /* renamed from: c */
    public static String m238900c(Class cls, int i) {
        Desc a = m238896a(cls, i);
        if (a != null) {
            return a.toString();
        }
        return "null";
    }

    /* renamed from: a */
    public static Desc m238896a(Class cls, int i) {
        m238897a(cls);
        return f153662a.get(cls).get(i);
    }
}
