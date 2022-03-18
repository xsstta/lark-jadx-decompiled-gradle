package com.bytedance.ee.falcon.inspector.json;

import android.util.Log;
import com.bytedance.ee.falcon.inspector.utils.C12700a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.falcon.inspector.json.a */
public class C12653a {

    /* renamed from: a */
    private final Map<Class<?>, Method> f33894a = new IdentityHashMap();

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public <T> T mo48027a(Object obj, Class<T> cls) throws IllegalArgumentException {
        if (obj == 0) {
            return null;
        }
        if (cls != Object.class && cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        try {
            if (obj instanceof JSONObject) {
                return (T) m52458a((JSONObject) obj, (Class) cls);
            }
            if (cls == JSONObject.class) {
                return (T) m52461a(obj);
            }
            throw new IllegalArgumentException("Expecting either fromValue or toValueType to be a JSONObject");
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalArgumentException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalArgumentException(e3);
        } catch (JSONException e4) {
            throw new IllegalArgumentException(e4);
        } catch (InvocationTargetException e5) {
            throw C12700a.m52565a(e5.getCause());
        }
    }

    /* renamed from: a */
    private JSONObject m52461a(Object obj) throws JSONException, InvocationTargetException, IllegalAccessException {
        JsonProperty jsonProperty;
        JSONObject jSONObject = new JSONObject();
        Field[] fields = obj.getClass().getFields();
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers()) && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                Object obj2 = field.get(obj);
                Class<?> type = field.getType();
                if (obj2 != null) {
                    type = obj2.getClass();
                }
                String name = field.getName();
                if (jsonProperty.required() && obj2 == null) {
                    obj2 = JSONObject.NULL;
                } else if (JSONObject.NULL == obj2) {
                    Log.i("ObjectMapper", "value is null");
                } else {
                    obj2 = m52456a(obj2, type, field);
                }
                jSONObject.put(name, obj2);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static Method m52459a(Class<?> cls) {
        Method[] methods = cls.getMethods();
        for (int i = 0; i < methods.length; i++) {
            if (methods[i].getAnnotation(JsonValue.class) != null) {
                return methods[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m52463b(Class cls) {
        if (m52464c(cls) || cls.equals(String.class)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private JSONArray m52462b(Object obj) throws InvocationTargetException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Object obj2 : (List) obj) {
            Object obj3 = null;
            if (obj2 != null) {
                obj3 = m52456a(obj2, obj2.getClass(), (Field) null);
            }
            jSONArray.put(obj3);
        }
        return jSONArray;
    }

    /* renamed from: d */
    private Method m52465d(Class<?> cls) {
        Method method;
        synchronized (this.f33894a) {
            method = this.f33894a.get(cls);
            if (method == null && !this.f33894a.containsKey(cls)) {
                method = m52459a(cls);
                this.f33894a.put(cls, method);
            }
        }
        return method;
    }

    /* renamed from: c */
    private static boolean m52464c(Class<?> cls) {
        if (cls.isPrimitive() || cls.equals(Boolean.class) || cls.equals(Integer.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Short.class) || cls.equals(Double.class) || cls.equals(Long.class) || cls.equals(Float.class)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private Enum m52454a(String str, Class<? extends Enum> cls) {
        Method d = m52465d(cls);
        if (d != null) {
            return m52455a(str, cls, d);
        }
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    private Object m52457a(Field field, Object obj) throws JSONException {
        if (obj != null) {
            try {
                if (obj == JSONObject.NULL) {
                    return null;
                }
                if (obj.getClass() == field.getType()) {
                    return obj;
                }
                if (obj instanceof JSONObject) {
                    return mo48027a(obj, field.getType());
                }
                if (field.getType().isEnum()) {
                    return m52454a((String) obj, (Class<? extends Enum>) field.getType().asSubclass(Enum.class));
                }
                if (obj instanceof JSONArray) {
                    return m52460a(field, (JSONArray) obj);
                }
                if (obj instanceof Number) {
                    Number number = (Number) obj;
                    Class<?> type = field.getType();
                    if (type != Integer.class) {
                        if (type != Integer.TYPE) {
                            if (type != Long.class) {
                                if (type != Long.TYPE) {
                                    if (type != Double.class) {
                                        if (type != Double.TYPE) {
                                            if (type != Float.class) {
                                                if (type != Float.TYPE) {
                                                    if (type != Byte.class) {
                                                        if (type != Byte.TYPE) {
                                                            if (type != Short.class) {
                                                                if (type != Short.TYPE) {
                                                                    throw new IllegalArgumentException("Not setup to handle class " + type.getName());
                                                                }
                                                            }
                                                            return Short.valueOf(number.shortValue());
                                                        }
                                                    }
                                                    return Byte.valueOf(number.byteValue());
                                                }
                                            }
                                            return Float.valueOf(number.floatValue());
                                        }
                                    }
                                    return Double.valueOf(number.doubleValue());
                                }
                            }
                            return Long.valueOf(number.longValue());
                        }
                    }
                    return Integer.valueOf(number.intValue());
                }
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("Unable to set value for field " + field.getName(), e);
            }
        }
        return obj;
    }

    /* renamed from: a */
    private <T> T m52458a(JSONObject jSONObject, Class<T> cls) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException {
        String str;
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        T newInstance = declaredConstructor.newInstance(new Object[0]);
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                Object a = m52457a(field, jSONObject.opt(field.getName()));
                try {
                    field.set(newInstance, a);
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Class: ");
                    sb.append(cls.getSimpleName());
                    sb.append(" Field: ");
                    sb.append(field.getName());
                    sb.append(" type ");
                    if (a != null) {
                        str = a.getClass().getName();
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            }
        }
        return newInstance;
    }

    /* renamed from: a */
    private List<Object> m52460a(Field field, JSONArray jSONArray) throws IllegalAccessException, JSONException {
        if (List.class.isAssignableFrom(field.getType())) {
            Type[] actualTypeArguments = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                Class<? extends Enum> cls = (Class) actualTypeArguments[0];
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (cls.isEnum()) {
                        arrayList.add(m52454a(jSONArray.getString(i), cls));
                    } else if (m52463b((Class) cls)) {
                        arrayList.add(jSONArray.get(i));
                    } else {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject == null) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(mo48027a((Object) jSONObject, (Class) cls));
                        }
                    }
                }
                return arrayList;
            }
            throw new IllegalArgumentException("Only able to handle a single type in a list " + field.getName());
        }
        throw new IllegalArgumentException("only know how to deserialize List<?> on field " + field.getName());
    }

    /* renamed from: a */
    private Enum m52455a(String str, Class<? extends Enum> cls, Method method) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        for (Enum r3 : enumArr) {
            try {
                Object invoke = method.invoke(r3, new Object[0]);
                if (invoke != null && invoke.toString().equals(str)) {
                    return r3;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        throw new IllegalArgumentException("No enum constant " + cls.getName() + "." + str);
    }

    /* renamed from: a */
    private Object m52456a(Object obj, Class<?> cls, Field field) throws InvocationTargetException, IllegalAccessException {
        if (obj == null) {
            return null;
        }
        if (List.class.isAssignableFrom(cls)) {
            return m52462b(obj);
        }
        Method d = m52465d(cls);
        if (d != null) {
            return d.invoke(obj, new Object[0]);
        }
        if (!m52463b((Class) cls)) {
            return mo48027a(obj, JSONObject.class);
        }
        if (!cls.equals(Double.class) && !cls.equals(Float.class)) {
            return obj;
        }
        double doubleValue = ((Number) obj).doubleValue();
        if (Double.isNaN(doubleValue)) {
            return "NaN";
        }
        if (doubleValue == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        if (doubleValue == Double.NEGATIVE_INFINITY) {
            return "-Infinity";
        }
        return obj;
    }
}
