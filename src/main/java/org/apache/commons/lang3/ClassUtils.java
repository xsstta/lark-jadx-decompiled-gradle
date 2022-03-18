package org.apache.commons.lang3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClassUtils {

    /* renamed from: a */
    public static final String f174604a = String.valueOf('.');

    /* renamed from: b */
    public static final String f174605b = String.valueOf('$');

    /* renamed from: c */
    private static final Map<String, Class<?>> f174606c;

    /* renamed from: d */
    private static final Map<Class<?>, Class<?>> f174607d;

    /* renamed from: e */
    private static final Map<Class<?>, Class<?>> f174608e = new HashMap();

    /* renamed from: f */
    private static final Map<String, String> f174609f;

    /* renamed from: g */
    private static final Map<String, String> f174610g;

    public enum Interfaces {
        INCLUDE,
        EXCLUDE
    }

    static {
        HashMap hashMap = new HashMap();
        f174606c = hashMap;
        hashMap.put("boolean", Boolean.TYPE);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
        hashMap.put("int", Integer.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("double", Double.TYPE);
        hashMap.put("float", Float.TYPE);
        hashMap.put("void", Void.TYPE);
        HashMap hashMap2 = new HashMap();
        f174607d = hashMap2;
        hashMap2.put(Boolean.TYPE, Boolean.class);
        hashMap2.put(Byte.TYPE, Byte.class);
        hashMap2.put(Character.TYPE, Character.class);
        hashMap2.put(Short.TYPE, Short.class);
        hashMap2.put(Integer.TYPE, Integer.class);
        hashMap2.put(Long.TYPE, Long.class);
        hashMap2.put(Double.TYPE, Double.class);
        hashMap2.put(Float.TYPE, Float.class);
        hashMap2.put(Void.TYPE, Void.TYPE);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Class<?> cls = (Class) entry.getKey();
            Class<?> cls2 = (Class) entry.getValue();
            if (!cls.equals(cls2)) {
                f174608e.put(cls2, cls);
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("int", "I");
        hashMap3.put("boolean", "Z");
        hashMap3.put("float", "F");
        hashMap3.put("long", "J");
        hashMap3.put("short", "S");
        hashMap3.put("byte", "B");
        hashMap3.put("double", "D");
        hashMap3.put("char", "C");
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            hashMap4.put(entry2.getValue(), entry2.getKey());
        }
        f174609f = Collections.unmodifiableMap(hashMap3);
        f174610g = Collections.unmodifiableMap(hashMap4);
    }

    /* renamed from: b */
    public static boolean m268048b(Class<?> cls) {
        return f174608e.containsKey(cls);
    }

    /* renamed from: a */
    public static String m268044a(Class<?> cls) {
        if (cls == null) {
            return "";
        }
        return m268045a(cls.getName());
    }

    /* renamed from: d */
    public static Class<?> m268050d(Class<?> cls) {
        return f174608e.get(cls);
    }

    /* renamed from: c */
    public static Class<?> m268049c(Class<?> cls) {
        if (cls == null || !cls.isPrimitive()) {
            return cls;
        }
        return f174607d.get(cls);
    }

    /* renamed from: a */
    public static String m268045a(String str) {
        if (C69877e.m268158a(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (str.startsWith("[")) {
            while (str.charAt(0) == '[') {
                str = str.substring(1);
                sb.append("[]");
            }
            if (str.charAt(0) == 'L' && str.charAt(str.length() - 1) == ';') {
                str = str.substring(1, str.length() - 1);
            }
            Map<String, String> map = f174610g;
            if (map.containsKey(str)) {
                str = map.get(str);
            }
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            i = lastIndexOf + 1;
        }
        int indexOf = str.indexOf(36, i);
        String substring = str.substring(lastIndexOf + 1);
        if (indexOf != -1) {
            substring = substring.replace('$', '.');
        }
        return substring + ((Object) sb);
    }

    /* renamed from: a */
    public static boolean m268046a(Class<?> cls, Class<?> cls2) {
        return m268047a(cls, cls2, C69881f.m268170a(JavaVersion.JAVA_1_5));
    }

    /* renamed from: a */
    public static boolean m268047a(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = m268049c(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = m268050d(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        if (Integer.TYPE.equals(cls)) {
            if (Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                return true;
            }
            return false;
        } else if (Long.TYPE.equals(cls)) {
            if (Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                return true;
            }
            return false;
        } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
            return false;
        } else {
            if (Float.TYPE.equals(cls)) {
                return Double.TYPE.equals(cls2);
            }
            if (Character.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Short.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (!Byte.TYPE.equals(cls)) {
                return false;
            } else {
                if (Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            }
        }
    }
}
