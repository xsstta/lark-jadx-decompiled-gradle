package com.ss.android.vcxp;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.p3184a.C63787b;
import com.ss.android.vcxp.p3185b.C63796a;
import com.ss.android.vcxp.p3186c.C63806d;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vcxp.a */
public class C63785a {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, Object> f160966a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, C63796a> f160967b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, C63796a> f160968c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static Object m250432a(String str) {
        return f160966a.get(str);
    }

    /* renamed from: b */
    public static C63796a m250440b(String str) {
        return f160967b.get(str);
    }

    /* renamed from: c */
    public static void m250445c(Object obj) {
        String a;
        ConcurrentHashMap<String, C63796a> concurrentHashMap;
        C63796a aVar;
        if (obj != null && (aVar = (concurrentHashMap = f160967b).get((a = m250435a(obj)))) != null) {
            f160968c.remove(aVar.f160983b);
            concurrentHashMap.remove(a);
        }
    }

    /* renamed from: h */
    private static boolean m250450h(Object obj) {
        String str = (String) obj;
        if (!str.startsWith("{") || !str.endsWith("}")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static String m250446d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Context) {
            return "{}";
        }
        String e = m250447e(obj);
        if (e != null) {
            return e;
        }
        String f = m250448f(obj);
        if (f != null) {
            return f;
        }
        String g = m250449g(obj);
        if (g != null) {
            return g;
        }
        return C63787b.m250460b(obj);
    }

    /* renamed from: g */
    private static String m250449g(Object obj) {
        XClass b = C63806d.m250515b(obj.getClass());
        if (b == null) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("@className", obj.getClass().getName());
        jsonObject.addProperty("@id", m250435a(obj));
        jsonObject.addProperty("@isSingleton", Boolean.valueOf(b.isSingleton()));
        jsonObject.addProperty("@originalProcess", C63809f.f161025c);
        return jsonObject.toString();
    }

    /* renamed from: c */
    private static Object m250443c(String str) throws Exception {
        try {
            if (m250450h(str)) {
                JsonObject b = C63787b.m250458b(str);
                JsonElement jsonElement = b.get("@className");
                JsonElement jsonElement2 = b.get("@id");
                if (jsonElement != null) {
                    if (jsonElement2 != null) {
                        String asString = jsonElement.getAsString();
                        String asString2 = jsonElement2.getAsString();
                        if (!(asString == null || asString2 == null)) {
                            return m250434a(asString2, b.get("@isSingleton").getAsBoolean(), Class.forName(asString), b.get("@originalProcess").getAsString());
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: e */
    private static String m250447e(Object obj) {
        if (!HashMap.class.isAssignableFrom(obj.getClass())) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = (HashMap) obj;
        Iterator it = hashMap2.entrySet().iterator();
        if (it.hasNext() && ((Map.Entry) it.next()).getValue().getClass().getAnnotation(XClass.class) == null) {
            return null;
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put(entry.getKey(), m250446d(entry.getValue()));
        }
        return new Gson().toJson(hashMap);
    }

    /* renamed from: f */
    private static String m250448f(Object obj) {
        JsonObject jsonObject = new JsonObject();
        if (!C63791b.m250471e().isAssignableFrom(obj.getClass())) {
            return null;
        }
        try {
            jsonObject.addProperty("@messageClassName", obj.getClass().getName());
            jsonObject.addProperty("@adapterClassName", C63791b.m250472f().get(obj).getClass().getName());
            jsonObject.addProperty("@messageJson", C63787b.m250456a(obj));
            return jsonObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m250435a(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }

    /* renamed from: b */
    public static void m250442b(Object obj) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Object obj2;
        if (obj != null && (obj2 = (concurrentHashMap = f160966a).get(m250435a(obj))) != obj) {
            if (obj2 == null || obj2.getClass().equals(obj.getClass())) {
                concurrentHashMap.put(m250435a(obj), obj);
                return;
            }
            throw new RuntimeException("Conflict! Old " + obj2.getClass().getName() + " New " + obj.getClass().getName());
        }
    }

    /* renamed from: a */
    private static boolean m250438a(Class cls) {
        if (C63791b.m250471e().isAssignableFrom(cls) || Object.class.equals(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Object[] m250439a(Class<?>[] clsArr) {
        Object[] objArr = new Object[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            objArr[i] = C63787b.m250454a((Class) clsArr[i]);
        }
        return objArr;
    }

    /* renamed from: a */
    public static void m250436a(Object obj, Object obj2) {
        C63796a b = m250440b(m250435a(obj));
        m250445c(obj);
        m250437a(obj2, b.f160983b, C63809f.f161025c);
    }

    /* renamed from: a */
    public static Object m250433a(String str, Class cls) throws Exception {
        if (Context.class.isAssignableFrom(cls)) {
            return C63809f.f161023a.get();
        }
        if (!(str instanceof String) || cls.equals(String.class)) {
            return null;
        }
        Object b = m250441b(str, cls);
        if (b != null) {
            return b;
        }
        Object c = m250444c(str, cls);
        if (c != null) {
            return c;
        }
        return m250443c(str);
    }

    /* renamed from: b */
    private static Object m250441b(String str, Class cls) {
        if (m250450h(str) && m250438a(cls)) {
            try {
                JsonObject b = C63787b.m250458b(str);
                JsonElement jsonElement = b.get("@messageClassName");
                if (jsonElement != null) {
                    String asString = jsonElement.getAsString();
                    String asString2 = b.get("@adapterClassName").getAsString();
                    Object a = C63787b.m250455a(b.get("@messageJson").getAsString(), Class.forName(asString));
                    C63791b.m250473g().set(a, C63791b.m250474h());
                    Field f = C63791b.m250472f();
                    Constructor<?> constructor = Class.forName(asString2).getDeclaredConstructors()[0];
                    constructor.setAccessible(true);
                    f.set(a, constructor.newInstance(new Object[0]));
                    return a;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static Object m250444c(String str, Class cls) {
        try {
            if (!HashMap.class.isAssignableFrom(cls)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((HashMap) C63787b.m250459b(str, cls)).entrySet()) {
                Object a = m250433a((String) entry.getValue(), Object.class);
                if (a != null) {
                    hashMap.put(entry.getKey(), a);
                }
            }
            if (hashMap.size() > 0) {
                return hashMap;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m250437a(Object obj, String str, String str2) {
        String a = m250435a(obj);
        C63796a aVar = new C63796a(obj, str, str2);
        f160967b.put(a, aVar);
        f160968c.put(str, aVar);
    }

    /* renamed from: a */
    public static Object m250434a(String str, boolean z, Class cls, String str2) throws Exception {
        C63796a aVar = f160968c.get(str);
        if (aVar != null) {
            return aVar.f160982a;
        }
        if (z) {
            Method a = C63806d.m250513a(cls);
            if (a != null) {
                return a.invoke(null, new Object[0]);
            }
            return null;
        }
        Constructor<?> constructor = cls.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        Object newInstance = constructor.newInstance(m250439a(constructor.getParameterTypes()));
        m250437a(newInstance, str, str2);
        return newInstance;
    }
}
