package com.huawei.updatesdk.p1029a.p1030a.p1035c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.a.a.c.f */
public abstract class AbstractC23840f {

    /* renamed from: a */
    private static final String f59046a = "f";

    /* renamed from: a */
    public static Class m87135a(Field field) {
        int i;
        if (Map.class.isAssignableFrom(field.getType())) {
            i = 1;
        } else if (!List.class.isAssignableFrom(field.getType())) {
            return null;
        } else {
            i = 0;
        }
        return m87136a(field, i);
    }

    /* renamed from: a */
    private static Class m87136a(Field field, int i) {
        Type[] actualTypeArguments;
        Type genericType = field.getGenericType();
        if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length > i) {
            try {
                if (actualTypeArguments[i] instanceof Class) {
                    return (Class) actualTypeArguments[i];
                }
                String obj = actualTypeArguments[i].toString();
                int indexOf = obj.indexOf("class ");
                if (indexOf < 0) {
                    indexOf = 0;
                }
                int indexOf2 = obj.indexOf("<");
                if (indexOf2 < 0) {
                    indexOf2 = obj.length();
                }
                return Class.forName(obj.substring(indexOf, indexOf2));
            } catch (ClassNotFoundException e) {
                String str = f59046a;
                C23834a.m87118b(str, "getType exception!" + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Field[] m87137a(Class cls) {
        Field[] a = cls.getSuperclass() != null ? m87137a(cls.getSuperclass()) : null;
        Field[] declaredFields = cls.getDeclaredFields();
        if (a != null && a.length > 0) {
            Field[] fieldArr = new Field[(declaredFields.length + a.length)];
            System.arraycopy(a, 0, fieldArr, 0, a.length);
            System.arraycopy(declaredFields, 0, fieldArr, a.length, declaredFields.length);
            declaredFields = fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.getName().indexOf("$") < 0) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() == declaredFields.length) {
            return declaredFields;
        }
        Field[] fieldArr2 = new Field[arrayList.size()];
        arrayList.toArray(fieldArr2);
        return fieldArr2;
    }
}
