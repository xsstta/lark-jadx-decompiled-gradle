package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JavaBeanSerializer implements ObjectSerializer {
    private static final char[] false_chars = {'f', 'a', 'l', 's', 'e'};
    private static final char[] true_chars = {'t', 'r', 'u', 'e'};
    protected int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    protected final String typeKey;
    protected final String typeName;

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (PropertyNamingStrategy) null);
    }

    private static Map<String, String> map(String... strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, str);
        }
        return hashMap;
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        FieldSerializer[] fieldSerializerArr = this.sortedGetters;
        for (FieldSerializer fieldSerializer : fieldSerializerArr) {
            linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
        }
        return linkedHashMap;
    }

    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
        this(cls, cls.getModifiers(), null, false, true, true, true, propertyNamingStrategy);
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, cls.getModifiers(), map(strArr), false, true, true, true, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0326, code lost:
        if ((r3 & r6.features) == 0) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03ca, code lost:
        if (r6.isEnabled(com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue) == false) goto L_0x0412;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0227 A[Catch:{ Exception -> 0x05be, all -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0269 A[Catch:{ Exception -> 0x05be, all -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x026e A[Catch:{ Exception -> 0x05be, all -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0270 A[Catch:{ Exception -> 0x05be, all -> 0x05b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0445  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0639 A[SYNTHETIC, Splitter:B:439:0x0639] */
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r36, java.lang.Object r37, java.lang.Object r38, java.lang.reflect.Type r39) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }

    public JavaBeanSerializer(Class<?> cls, int i, Map<String, String> map, boolean z, boolean z2, boolean z3, boolean z4, PropertyNamingStrategy propertyNamingStrategy) {
        PropertyNamingStrategy propertyNamingStrategy2;
        String str;
        String str2;
        PropertyNamingStrategy naming;
        String[] strArr = null;
        JSONType jSONType = z2 ? (JSONType) cls.getAnnotation(JSONType.class) : null;
        if (jSONType != null) {
            this.features = SerializerFeature.of(jSONType.serialzeFeatures());
            str2 = jSONType.typeName();
            if (str2.length() == 0) {
                str2 = null;
                str = null;
            } else {
                Class<? super Object> superclass = cls.getSuperclass();
                str = null;
                while (superclass != null && superclass != Object.class) {
                    JSONType jSONType2 = (JSONType) superclass.getAnnotation(JSONType.class);
                    if (jSONType2 == null) {
                        break;
                    }
                    str = jSONType2.typeKey();
                    if (str.length() != 0) {
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
                for (Class<?> cls2 : cls.getInterfaces()) {
                    JSONType jSONType3 = (JSONType) cls2.getAnnotation(JSONType.class);
                    if (jSONType3 != null) {
                        str = jSONType3.typeKey();
                        if (str.length() != 0) {
                            break;
                        }
                    }
                }
                if (str != null && str.length() == 0) {
                    str = null;
                }
            }
            if (propertyNamingStrategy != null || (naming = jSONType.naming()) == PropertyNamingStrategy.CamelCase) {
                propertyNamingStrategy2 = propertyNamingStrategy;
            } else {
                propertyNamingStrategy2 = naming;
            }
        } else {
            propertyNamingStrategy2 = propertyNamingStrategy;
            str2 = null;
            str = null;
        }
        this.typeName = str2;
        this.typeKey = str;
        List<FieldInfo> computeGetters = TypeUtils.computeGetters(cls, i, z, jSONType, map, false, z3, z4, propertyNamingStrategy2);
        ArrayList arrayList = new ArrayList();
        for (FieldInfo fieldInfo : computeGetters) {
            arrayList.add(new FieldSerializer(fieldInfo));
        }
        FieldSerializer[] fieldSerializerArr = (FieldSerializer[]) arrayList.toArray(new FieldSerializer[arrayList.size()]);
        this.getters = fieldSerializerArr;
        strArr = jSONType != null ? jSONType.orders() : strArr;
        if (strArr == null || strArr.length == 0) {
            FieldSerializer[] fieldSerializerArr2 = new FieldSerializer[fieldSerializerArr.length];
            System.arraycopy(fieldSerializerArr, 0, fieldSerializerArr2, 0, fieldSerializerArr.length);
            Arrays.sort(fieldSerializerArr2);
            if (Arrays.equals(fieldSerializerArr2, fieldSerializerArr)) {
                this.sortedGetters = fieldSerializerArr;
            } else {
                this.sortedGetters = fieldSerializerArr2;
            }
        } else {
            List<FieldInfo> computeGetters2 = TypeUtils.computeGetters(cls, i, z, jSONType, map, true, z3, z4, propertyNamingStrategy2);
            ArrayList arrayList2 = new ArrayList();
            for (FieldInfo fieldInfo2 : computeGetters2) {
                arrayList2.add(new FieldSerializer(fieldInfo2));
            }
            this.sortedGetters = (FieldSerializer[]) arrayList2.toArray(new FieldSerializer[arrayList2.size()]);
        }
    }
}
