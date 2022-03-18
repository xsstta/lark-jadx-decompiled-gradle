package com.ss.android.vcxp.p3184a;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.p999a.C22985n;
import com.ss.android.vcxp.C63791b;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

/* renamed from: com.ss.android.vcxp.a.b */
public class C63787b {

    /* renamed from: a */
    public static Gson f160970a;

    /* renamed from: b */
    private static final Set<Class> f160971b;

    /* renamed from: c */
    private static final HashMap<String, Class> f160972c;

    /* renamed from: d */
    private static final HashMap<Class, Object> f160973d;

    static {
        HashSet hashSet = new HashSet();
        f160971b = hashSet;
        HashMap<String, Class> hashMap = new HashMap<>();
        f160972c = hashMap;
        HashMap<Class, Object> hashMap2 = new HashMap<>();
        f160973d = hashMap2;
        hashSet.add(Boolean.class);
        hashSet.add(String.class);
        hashSet.add(Integer.class);
        hashSet.add(Long.class);
        hashSet.add(Float.class);
        hashSet.add(Double.class);
        hashSet.add(Locale.class);
        hashMap.put("char", Character.TYPE);
        hashMap.put("int", Integer.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("float", Float.TYPE);
        hashMap.put("double", Double.TYPE);
        hashMap.put("boolean", Boolean.TYPE);
        hashMap2.put(Character.TYPE, 0);
        hashMap2.put(Integer.TYPE, 0);
        hashMap2.put(Long.TYPE, 0);
        hashMap2.put(Float.TYPE, 0);
        hashMap2.put(Double.TYPE, 0);
        hashMap2.put(Boolean.TYPE, false);
        m250457a(C63791b.m250475i());
    }

    /* renamed from: a */
    public static Object m250454a(Class cls) {
        return f160973d.get(cls);
    }

    /* renamed from: a */
    public static Class m250453a(String str) {
        Class cls = f160972c.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            return cls;
        }
    }

    /* renamed from: b */
    public static JsonObject m250458b(String str) {
        return new JsonParser().parse(str).getAsJsonObject();
    }

    /* renamed from: a */
    public static String m250456a(Object obj) {
        return f160970a.toJson(obj);
    }

    /* renamed from: a */
    public static void m250457a(HashMap<Class, TypeAdapter> hashMap) {
        GsonBuilder registerTypeAdapterFactory = new GsonBuilder().registerTypeAdapterFactory(C22985n.m83361a(ByteString.class, C63786a.f160969a));
        if (hashMap != null) {
            for (Map.Entry<Class, TypeAdapter> entry : hashMap.entrySet()) {
                registerTypeAdapterFactory.registerTypeAdapterFactory(C22985n.m83361a(entry.getKey(), entry.getValue()));
            }
        }
        registerTypeAdapterFactory.setExclusionStrategies(new ExclusionStrategy() {
            /* class com.ss.android.vcxp.p3184a.C63787b.C637881 */

            @Override // com.google.gson.ExclusionStrategy
            public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                return false;
            }

            @Override // com.google.gson.ExclusionStrategy
            public boolean shouldSkipClass(Class<?> cls) {
                return cls.equals(byte[].class);
            }
        });
        f160970a = registerTypeAdapterFactory.create();
    }

    /* renamed from: b */
    public static String m250460b(Object obj) {
        String str;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Map) {
            str = C63789c.f160974a.serialize((HashMap) obj, (Type) null, (JsonSerializationContext) null).toString();
        } else if (obj instanceof List) {
            str = C63790d.f160975a.serialize((List) obj, (Type) null, (JsonSerializationContext) null).toString();
        } else {
            str = f160970a.toJson(obj);
        }
        return str.substring(0, 1) + "\"@type\"" + ":\"" + obj.getClass().getName() + "\"," + str.substring(1);
    }

    /* renamed from: a */
    public static <T> T m250455a(String str, Class<T> cls) {
        return (T) f160970a.fromJson(str, (Class) cls);
    }

    /* renamed from: b */
    public static <T> T m250459b(String str, Class<T> cls) throws RuntimeException {
        if (str.indexOf("\"@type\"") != 1) {
            return (T) m250455a(str, cls);
        }
        String substring = str.substring(1, str.indexOf("\",", 7) + 2);
        String substring2 = substring.substring(substring.indexOf(":") + 2, substring.length() - 2);
        try {
            String replace = str.replace(substring, "");
            Class<?> cls2 = Class.forName(substring2);
            return Map.class.isAssignableFrom(cls2) ? (T) C63789c.f160974a.deserialize(new JsonParser().parse(replace).getAsJsonObject(), (Type) null, (JsonDeserializationContext) null) : List.class.isAssignableFrom(cls2) ? (T) C63790d.f160975a.deserialize(new JsonParser().parse(replace).getAsJsonArray(), (Type) null, (JsonDeserializationContext) null) : (T) m250459b(replace, cls2);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
