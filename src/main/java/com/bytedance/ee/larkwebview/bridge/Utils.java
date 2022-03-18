package com.bytedance.ee.larkwebview.bridge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002J#\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00040\u0004\"\u0004\b\u0000\u0010\u00052\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/Utils;", "", "()V", "combineRequestContent", "", "T", "functionName", "functionParam", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "getGenericClass", "Ljava/lang/Class;", "obj", "getGenericInterfaceClass", "toJsonString", "kotlin.jvm.PlatformType", "(Ljava/lang/Object;)Ljava/lang/String;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.j */
public final class Utils {

    /* renamed from: a */
    public static final Utils f35372a = new Utils();

    private Utils() {
    }

    /* renamed from: a */
    public final <T> String mo49801a(T t) {
        if (t == null) {
            return "";
        }
        if ((t instanceof JSONObject) || (t instanceof org.json.JSONObject)) {
            return t.toString();
        }
        boolean z = t instanceof Map;
        if (!z) {
            return JSON.toJSONString(t);
        }
        if (!z) {
            t = null;
        }
        return new JSONObject(t).toString();
    }

    /* renamed from: b */
    public final Class<?> mo49803b(Object obj) {
        boolean z;
        Class<?> cls = null;
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = null;
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "type.actualTypeArguments");
            if (actualTypeArguments.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    cls = type;
                }
                cls = cls;
            }
            cls2 = cls;
        }
        if (cls2 == null) {
            return m54541c(obj);
        }
        return cls2;
    }

    /* renamed from: c */
    private final Class<?> m54541c(Object obj) {
        boolean z;
        Type[] typeArr;
        boolean z2;
        Class<?> cls = null;
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = obj.getClass();
        while (true) {
            z = true;
            if (cls2 == null) {
                break;
            }
            Type[] genericInterfaces = cls2.getGenericInterfaces();
            Intrinsics.checkExpressionValueIsNotNull(genericInterfaces, "clazz.genericInterfaces");
            if (genericInterfaces.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            cls2 = cls2.getSuperclass();
        }
        if (cls2 == null) {
            return null;
        }
        Type[] genericInterfaces2 = cls2.getGenericInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(genericInterfaces2, "clazz.genericInterfaces");
        if (genericInterfaces2.length > 0 && (genericInterfaces2[0] instanceof ParameterizedType)) {
            Type type = genericInterfaces2[0];
            if (type != null) {
                typeArr = ((ParameterizedType) type).getActualTypeArguments();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            }
        } else {
            typeArr = null;
        }
        if (typeArr == null) {
            return null;
        }
        if (typeArr.length != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        Type type2 = typeArr[0];
        if (type2 instanceof Class) {
            cls = type2;
        }
        return cls;
    }

    /* renamed from: a */
    public final <T> String mo49802a(String str, T t) {
        return new Regex("\n").replace(str + "(" + mo49801a(t) + ")", "\\\\n");
    }
}
