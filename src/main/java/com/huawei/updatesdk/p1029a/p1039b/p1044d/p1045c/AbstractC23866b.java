package com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c;

import android.util.Log;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23840f;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.updatesdk.a.b.d.c.b */
public abstract class AbstractC23866b {
    private static final char COMMA = ',';
    private static final String END_FLAG = "_";
    private static final String TAG = "b";

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.a.b.d.c.b$a */
    public static class C23867a implements PrivilegedAction {

        /* renamed from: a */
        private Field f59098a;

        C23867a(Field field) {
            this.f59098a = field;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            this.f59098a.setAccessible(true);
            return null;
        }
    }

    private String arrayToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        int length = Array.getLength(obj);
        if (length <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            String valueToJson = valueToJson(Array.get(obj, i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append("]");
        return sb.toString();
    }

    private void formatJsonStr(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            int i = length - 1;
            if (sb.charAt(i) == ',') {
                sb.delete(i, length);
            }
        }
    }

    private boolean isPrimitiveObj(Object obj) {
        return (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean) || (obj instanceof Float) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Short);
    }

    private Object jsonBeanFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        AbstractC23866b bVar = (AbstractC23866b) cls.newInstance();
        bVar.fromJson((JSONObject) obj);
        return bVar;
    }

    private String mapToJson(Map map) throws IllegalAccessException, IllegalArgumentException {
        if (map.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator it = map.entrySet().iterator();
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String valueToJson = valueToJson(entry.getValue());
            if (valueToJson != null) {
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                sb.append(valueToJson);
            }
            if (!it.hasNext()) {
                sb.append("}");
                return sb.toString();
            } else if (valueToJson != null) {
                sb.append(COMMA);
            }
        }
    }

    private void processValueError(Field field, Object obj) {
        Object valueOf;
        if (obj != null && (obj instanceof String)) {
            try {
                Class<?> type = field.getType();
                if (type.isPrimitive()) {
                    String name = type.getName();
                    if ("int".equals(name)) {
                        valueOf = Integer.valueOf(Integer.parseInt((String) obj));
                    } else if ("float".equals(name)) {
                        valueOf = Float.valueOf(Float.parseFloat((String) obj));
                    } else if ("long".equals(name)) {
                        valueOf = Long.valueOf(Long.parseLong((String) obj));
                    } else if ("boolean".equals(name)) {
                        valueOf = Boolean.valueOf(Boolean.parseBoolean((String) obj));
                    } else if ("double".equals(name)) {
                        valueOf = Double.valueOf(Double.parseDouble((String) obj));
                    } else if ("short".equals(name)) {
                        valueOf = Short.valueOf(Short.parseShort((String) obj));
                    } else if ("byte".equals(name)) {
                        valueOf = Byte.valueOf(Byte.parseByte((String) obj));
                    } else if ("char".equals(name)) {
                        valueOf = Character.valueOf(((String) obj).charAt(0));
                    } else {
                        return;
                    }
                    field.set(this, valueOf);
                }
            } catch (IllegalAccessException e) {
                String str = TAG;
                C23834a.m87118b(str, "processValueError Throwable:" + e.getMessage());
            }
        }
    }

    private Object valueFromJson(Class cls, Class cls2, Object obj) throws IllegalAccessException, IllegalArgumentException, InstantiationException, ClassNotFoundException, JSONException {
        if (cls.isPrimitive() || cls.equals(String.class)) {
            return (!"float".equals(cls.getName()) || !(obj instanceof Double)) ? obj : Float.valueOf(((Double) obj).floatValue());
        }
        if (List.class.isAssignableFrom(cls)) {
            return listFromJson(cls2, obj);
        }
        if (AbstractC23866b.class.isAssignableFrom(cls)) {
            if (!cls.equals(AbstractC23866b.class)) {
                return jsonBeanFromJson(cls, obj);
            }
            throw new IllegalArgumentException("error type, type:" + cls);
        } else if (Map.class.isAssignableFrom(cls)) {
            return mapFromJson(cls2, obj);
        } else {
            throw new IllegalArgumentException("unsupport type, Type:" + cls);
        }
    }

    private String valueToJson(Object obj) throws IllegalAccessException, IllegalArgumentException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return JSONObject.quote(obj.toString());
        }
        if (isPrimitiveObj(obj)) {
            return String.valueOf(obj);
        }
        if (obj instanceof AbstractC23866b) {
            return ((AbstractC23866b) obj).toJson();
        }
        if (obj instanceof List) {
            return listToJson((List) obj);
        }
        if (obj instanceof Map) {
            return mapToJson((Map) obj);
        }
        if (obj.getClass().isArray()) {
            return arrayToJson(obj);
        }
        return null;
    }

    public void fromJson(JSONObject jSONObject) throws IllegalArgumentException, IllegalAccessException, InstantiationException, ClassNotFoundException, JSONException {
        Field[] a = AbstractC23840f.m87137a(getClass());
        Object obj = null;
        for (int i = 0; i < a.length; i++) {
            AccessController.doPrivileged(new C23867a(a[i]));
            String name = a[i].getName();
            if (name.endsWith(END_FLAG)) {
                String substring = name.substring(0, name.length() - 1);
                if (jSONObject.has(substring)) {
                    Object obj2 = jSONObject.get(substring);
                    if (!JSONObject.NULL.equals(obj2)) {
                        try {
                            obj = valueFromJson(a[i].getType(), AbstractC23840f.m87135a(a[i]), obj2);
                            a[i].set(this, obj);
                        } catch (Exception e) {
                            String str = TAG;
                            Log.e(str, getClass().getName() + ".fromJson error, fieldName:" + substring + e.toString());
                            processValueError(a[i], obj);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Object listFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        } else if (obj instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) obj;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object valueFromJson = valueFromJson(cls, null, jSONArray.get(i));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        arrayList.add(valueFromJson);
                    } else {
                        String str = TAG;
                        C23834a.m87118b(str, "listFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException("jsonobject is not JSONArray, jsonValue:" + obj);
        }
    }

    /* access modifiers changed from: protected */
    public String listToJson(List list) throws IllegalAccessException, IllegalArgumentException {
        if (list.size() <= 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            String valueToJson = valueToJson(list.get(i));
            if (valueToJson != null) {
                sb.append(valueToJson);
                sb.append(COMMA);
            }
        }
        formatJsonStr(sb);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public Object mapFromJson(Class cls, Object obj) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, JSONException {
        if (cls == null) {
            throw new IllegalArgumentException("generic type is null");
        } else if (obj instanceof JSONObject) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object valueFromJson = valueFromJson(cls, null, jSONObject.get(next));
                if (valueFromJson != null) {
                    if (cls.equals(valueFromJson.getClass())) {
                        linkedHashMap.put(next, valueFromJson);
                    } else {
                        String str = TAG;
                        C23834a.m87118b(str, "mapFromJson error, memberClass:" + cls + ", valueClass:" + valueFromJson.getClass());
                    }
                }
            }
            return linkedHashMap;
        } else {
            throw new IllegalArgumentException("jsonobject is not JSONObject, jsonValue:" + obj);
        }
    }

    public String toJson() throws IllegalAccessException, IllegalArgumentException {
        Field[] a = AbstractC23840f.m87137a(getClass());
        if (a.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < a.length; i++) {
            AccessController.doPrivileged(new C23867a(a[i]));
            String name = a[i].getName();
            if (name != null && name.endsWith(END_FLAG)) {
                String substring = name.substring(0, name.length() - 1);
                String valueToJson = valueToJson(a[i].get(this));
                if (valueToJson != null) {
                    sb.append("\"");
                    sb.append(substring);
                    sb.append("\":");
                    sb.append(valueToJson);
                    sb.append(COMMA);
                }
            }
        }
        formatJsonStr(sb);
        sb.append("}");
        return sb.toString();
    }
}
