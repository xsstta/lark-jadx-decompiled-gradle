package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class JavaBeanDeserializer implements ObjectDeserializer {
    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    public final JavaBeanInfo beanInfo;
    protected final Class<?> clazz;
    private ConcurrentMap<String, Object> extraFieldDeserializers;
    private final FieldDeserializer[] fieldDeserializers;
    private transient long[] smartMatchHashArray;
    private transient int[] smartMatchHashArrayMapping;
    private final FieldDeserializer[] sortedFieldDeserializers;

    /* access modifiers changed from: protected */
    public FieldDeserializer getFieldDeserializerByHash(long j) {
        int i = 0;
        while (true) {
            FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
            if (i >= fieldDeserializerArr.length) {
                return null;
            }
            FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
            if (fieldDeserializer.fieldInfo.nameHashCode == j) {
                return fieldDeserializer;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public FieldDeserializer getFieldDeserializer(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (this.beanInfo.ordered) {
            while (true) {
                FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                if (i >= fieldDeserializerArr.length) {
                    return null;
                }
                FieldDeserializer fieldDeserializer = fieldDeserializerArr[i];
                if (fieldDeserializer.fieldInfo.name.equalsIgnoreCase(str)) {
                    return fieldDeserializer;
                }
                i++;
            }
        } else {
            int length = this.sortedFieldDeserializers.length - 1;
            while (i <= length) {
                int i2 = (i + length) >>> 1;
                int compareTo = this.sortedFieldDeserializers[i2].fieldInfo.name.compareTo(str);
                if (compareTo < 0) {
                    i = i2 + 1;
                } else if (compareTo <= 0) {
                    return this.sortedFieldDeserializers[i2];
                } else {
                    length = i2 - 1;
                }
            }
            Map<String, FieldDeserializer> map = this.alterNameFieldDeserializers;
            if (map != null) {
                return map.get(str);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public Object createInstance(DefaultJSONParser defaultJSONParser, Type type) {
        Object obj;
        boolean z;
        if ((type instanceof Class) && this.clazz.isInterface()) {
            Class cls = (Class) type;
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if ((defaultJSONParser.lexer.features & Feature.OrderedField.mask) != 0) {
                z = true;
            } else {
                z = false;
            }
            return Proxy.newProxyInstance(contextClassLoader, new Class[]{cls}, new JSONObject(z));
        } else if (this.beanInfo.defaultConstructor == null && this.beanInfo.factoryMethod == null) {
            return null;
        } else {
            if (this.beanInfo.factoryMethod != null && this.beanInfo.defaultConstructorParameterSize > 0) {
                return null;
            }
            try {
                Constructor<?> constructor = this.beanInfo.defaultConstructor;
                if (this.beanInfo.defaultConstructorParameterSize != 0) {
                    obj = constructor.newInstance(defaultJSONParser.contex.object);
                } else if (constructor != null) {
                    obj = constructor.newInstance(new Object[0]);
                } else {
                    obj = this.beanInfo.factoryMethod.invoke(null, new Object[0]);
                }
                if (!(defaultJSONParser == null || (defaultJSONParser.lexer.features & Feature.InitStringFieldAsEmpty.mask) == 0)) {
                    FieldInfo[] fieldInfoArr = this.beanInfo.fields;
                    for (FieldInfo fieldInfo : fieldInfoArr) {
                        if (fieldInfo.fieldClass == String.class) {
                            fieldInfo.set(obj, "");
                        }
                    }
                }
                return obj;
            } catch (Exception e) {
                throw new JSONException("create instance error, class " + this.clazz.getName(), e);
            }
        }
    }

    public Object createInstance(Map<String, Object> map, ParserConfig parserConfig) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj;
        if (this.beanInfo.creatorConstructor == null) {
            Object createInstance = createInstance((DefaultJSONParser) null, this.clazz);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                FieldDeserializer fieldDeserializer = getFieldDeserializer(entry.getKey());
                if (fieldDeserializer != null) {
                    Object value = entry.getValue();
                    Method method = fieldDeserializer.fieldInfo.method;
                    if (method != null) {
                        method.invoke(createInstance, TypeUtils.cast(value, method.getGenericParameterTypes()[0], parserConfig));
                    } else {
                        Field field = fieldDeserializer.fieldInfo.field;
                        Type type = fieldDeserializer.fieldInfo.fieldType;
                        String str = fieldDeserializer.fieldInfo.format;
                        if (str == null || type != Date.class || !(value instanceof String)) {
                            obj = TypeUtils.cast(value, type, parserConfig);
                        } else {
                            try {
                                obj = new SimpleDateFormat(str).parse((String) value);
                            } catch (ParseException unused) {
                                obj = null;
                            }
                        }
                        field.set(createInstance, obj);
                    }
                }
            }
            return createInstance;
        }
        FieldInfo[] fieldInfoArr = this.beanInfo.fields;
        int length = fieldInfoArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            FieldInfo fieldInfo = fieldInfoArr[i];
            Object obj2 = map.get(fieldInfo.name);
            if (obj2 == null) {
                obj2 = TypeUtils.defaultValue(fieldInfo.fieldClass);
            }
            objArr[i] = obj2;
        }
        if (this.beanInfo.creatorConstructor == null) {
            return null;
        }
        try {
            return this.beanInfo.creatorConstructor.newInstance(objArr);
        } catch (Exception e) {
            throw new JSONException("create instance error, " + this.beanInfo.creatorConstructor.toGenericString(), e);
        }
    }

    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer
    public <T> T deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        return (T) deserialze(defaultJSONParser, type, obj, null);
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type) {
        this(parserConfig, cls, type, JavaBeanInfo.build(cls, cls.getModifiers(), type, false, true, true, true, parserConfig.propertyNamingStrategy));
    }

    /* access modifiers changed from: protected */
    public JavaBeanDeserializer getSeeAlso(ParserConfig parserConfig, JavaBeanInfo javaBeanInfo, String str) {
        if (javaBeanInfo.jsonType == null) {
            return null;
        }
        for (Class<?> cls : javaBeanInfo.jsonType.seeAlso()) {
            ObjectDeserializer deserializer = parserConfig.getDeserializer(cls);
            if (deserializer instanceof JavaBeanDeserializer) {
                JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                JavaBeanInfo javaBeanInfo2 = javaBeanDeserializer.beanInfo;
                if (javaBeanInfo2.typeName.equals(str)) {
                    return javaBeanDeserializer;
                }
                JavaBeanDeserializer seeAlso = getSeeAlso(parserConfig, javaBeanInfo2, str);
                if (seeAlso != null) {
                    return seeAlso;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void parseExtra(DefaultJSONParser defaultJSONParser, Object obj, String str) {
        Object obj2;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if ((defaultJSONParser.lexer.features & Feature.IgnoreNotMatch.mask) != 0) {
            jSONLexer.nextTokenWithChar(':');
            Type type = null;
            List<ExtraTypeProvider> list = defaultJSONParser.extraTypeProviders;
            if (list != null) {
                for (ExtraTypeProvider extraTypeProvider : list) {
                    type = extraTypeProvider.getExtraType(obj, str);
                }
            }
            if (type == null) {
                obj2 = defaultJSONParser.parse();
            } else {
                obj2 = defaultJSONParser.parseObject(type);
            }
            if (obj instanceof ExtraProcessable) {
                ((ExtraProcessable) obj).processExtra(str, obj2);
                return;
            }
            List<ExtraProcessor> list2 = defaultJSONParser.extraProcessors;
            if (list2 != null) {
                for (ExtraProcessor extraProcessor : list2) {
                    extraProcessor.processExtra(obj, str, obj2);
                }
                return;
            }
            return;
        }
        throw new JSONException("setter not found, class " + this.clazz.getName() + ", property " + str);
    }

    public JavaBeanDeserializer(ParserConfig parserConfig, Class<?> cls, Type type, JavaBeanInfo javaBeanInfo) {
        this.clazz = cls;
        this.beanInfo = javaBeanInfo;
        this.sortedFieldDeserializers = new FieldDeserializer[javaBeanInfo.sortedFields.length];
        int length = javaBeanInfo.sortedFields.length;
        HashMap hashMap = null;
        for (int i = 0; i < length; i++) {
            FieldInfo fieldInfo = javaBeanInfo.sortedFields[i];
            FieldDeserializer createFieldDeserializer = parserConfig.createFieldDeserializer(parserConfig, cls, fieldInfo);
            this.sortedFieldDeserializers[i] = createFieldDeserializer;
            String[] strArr = fieldInfo.alternateNames;
            for (String str : strArr) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str, createFieldDeserializer);
            }
        }
        this.alterNameFieldDeserializers = hashMap;
        this.fieldDeserializers = new FieldDeserializer[javaBeanInfo.fields.length];
        int length2 = javaBeanInfo.fields.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.fieldDeserializers[i2] = getFieldDeserializer(javaBeanInfo.fields[i2].name);
        }
    }

    private <T> T deserialzeArrayMapping(DefaultJSONParser defaultJSONParser, Type type, Object obj, Object obj2) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        Enum r8;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        String str;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        T t = (T) createInstance(defaultJSONParser, type);
        int length = this.sortedFieldDeserializers.length;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                c2 = ']';
            } else {
                c2 = ',';
            }
            FieldDeserializer fieldDeserializer = this.sortedFieldDeserializers[i];
            FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
            Class<?> cls = fieldInfo.fieldClass;
            try {
                if (cls == Integer.TYPE) {
                    int scanLongValue = (int) jSONLexer.scanLongValue();
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.setInt(t, scanLongValue);
                    } else {
                        fieldDeserializer.setValue(t, new Integer(scanLongValue));
                    }
                    if (jSONLexer.ch == ',') {
                        int i2 = jSONLexer.bp + 1;
                        jSONLexer.bp = i2;
                        if (i2 >= jSONLexer.len) {
                            c17 = 26;
                        } else {
                            c17 = jSONLexer.text.charAt(i2);
                        }
                        jSONLexer.ch = c17;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i3 = jSONLexer.bp + 1;
                        jSONLexer.bp = i3;
                        if (i3 >= jSONLexer.len) {
                            c16 = 26;
                        } else {
                            c16 = jSONLexer.text.charAt(i3);
                        }
                        jSONLexer.ch = c16;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else if (cls == String.class) {
                    if (jSONLexer.ch == '\"') {
                        str = jSONLexer.scanStringValue('\"');
                    } else if (jSONLexer.ch != 'n' || !jSONLexer.text.startsWith("null", jSONLexer.bp)) {
                        throw new JSONException("not match string. feild : " + obj);
                    } else {
                        jSONLexer.bp += 4;
                        int i4 = jSONLexer.bp;
                        if (jSONLexer.bp >= jSONLexer.len) {
                            c15 = 26;
                        } else {
                            c15 = jSONLexer.text.charAt(i4);
                        }
                        jSONLexer.ch = c15;
                        str = null;
                    }
                    if (fieldInfo.fieldAccess) {
                        fieldInfo.field.set(t, str);
                    } else {
                        fieldDeserializer.setValue(t, str);
                    }
                    if (jSONLexer.ch == ',') {
                        int i5 = jSONLexer.bp + 1;
                        jSONLexer.bp = i5;
                        if (i5 >= jSONLexer.len) {
                            c14 = 26;
                        } else {
                            c14 = jSONLexer.text.charAt(i5);
                        }
                        jSONLexer.ch = c14;
                        jSONLexer.token = 16;
                    } else if (jSONLexer.ch == ']') {
                        int i6 = jSONLexer.bp + 1;
                        jSONLexer.bp = i6;
                        if (i6 >= jSONLexer.len) {
                            c13 = 26;
                        } else {
                            c13 = jSONLexer.text.charAt(i6);
                        }
                        jSONLexer.ch = c13;
                        jSONLexer.token = 15;
                    } else {
                        jSONLexer.nextToken();
                    }
                } else {
                    if (cls == Long.TYPE) {
                        long scanLongValue2 = jSONLexer.scanLongValue();
                        if (fieldInfo.fieldAccess) {
                            fieldInfo.field.setLong(t, scanLongValue2);
                        } else {
                            fieldDeserializer.setValue(t, new Long(scanLongValue2));
                        }
                        if (jSONLexer.ch == ',') {
                            int i7 = jSONLexer.bp + 1;
                            jSONLexer.bp = i7;
                            if (i7 >= jSONLexer.len) {
                                c12 = 26;
                            } else {
                                c12 = jSONLexer.text.charAt(i7);
                            }
                            jSONLexer.ch = c12;
                            jSONLexer.token = 16;
                        } else if (jSONLexer.ch == ']') {
                            int i8 = jSONLexer.bp + 1;
                            jSONLexer.bp = i8;
                            if (i8 >= jSONLexer.len) {
                                c11 = 26;
                            } else {
                                c11 = jSONLexer.text.charAt(i8);
                            }
                            jSONLexer.ch = c11;
                            jSONLexer.token = 15;
                        } else {
                            jSONLexer.nextToken();
                        }
                    } else if (cls == Boolean.TYPE) {
                        boolean scanBoolean = jSONLexer.scanBoolean();
                        if (fieldInfo.fieldAccess) {
                            fieldInfo.field.setBoolean(t, scanBoolean);
                        } else {
                            fieldDeserializer.setValue(t, Boolean.valueOf(scanBoolean));
                        }
                        if (jSONLexer.ch == ',') {
                            int i9 = jSONLexer.bp + 1;
                            jSONLexer.bp = i9;
                            if (i9 >= jSONLexer.len) {
                                c10 = 26;
                            } else {
                                c10 = jSONLexer.text.charAt(i9);
                            }
                            jSONLexer.ch = c10;
                            jSONLexer.token = 16;
                        } else if (jSONLexer.ch == ']') {
                            int i10 = jSONLexer.bp + 1;
                            jSONLexer.bp = i10;
                            if (i10 >= jSONLexer.len) {
                                c9 = 26;
                            } else {
                                c9 = jSONLexer.text.charAt(i10);
                            }
                            jSONLexer.ch = c9;
                            jSONLexer.token = 15;
                        } else {
                            jSONLexer.nextToken();
                        }
                    } else if (cls.isEnum()) {
                        char c18 = jSONLexer.ch;
                        if (c18 == '\"') {
                            String scanSymbol = jSONLexer.scanSymbol(defaultJSONParser.symbolTable);
                            if (scanSymbol == null) {
                                r8 = null;
                            } else {
                                r8 = Enum.valueOf(cls, scanSymbol);
                            }
                        } else if (c18 < '0' || c18 > '9') {
                            throw new JSONException("illegal enum." + jSONLexer.info());
                        } else {
                            r8 = ((EnumDeserializer) ((DefaultFieldDeserializer) fieldDeserializer).getFieldValueDeserilizer(defaultJSONParser.config)).ordinalEnums[(int) jSONLexer.scanLongValue()];
                        }
                        fieldDeserializer.setValue(t, r8);
                        if (jSONLexer.ch == ',') {
                            int i11 = jSONLexer.bp + 1;
                            jSONLexer.bp = i11;
                            if (i11 >= jSONLexer.len) {
                                c8 = 26;
                            } else {
                                c8 = jSONLexer.text.charAt(i11);
                            }
                            jSONLexer.ch = c8;
                            jSONLexer.token = 16;
                        } else if (jSONLexer.ch == ']') {
                            int i12 = jSONLexer.bp + 1;
                            jSONLexer.bp = i12;
                            if (i12 >= jSONLexer.len) {
                                c7 = 26;
                            } else {
                                c7 = jSONLexer.text.charAt(i12);
                            }
                            jSONLexer.ch = c7;
                            jSONLexer.token = 15;
                        } else {
                            jSONLexer.nextToken();
                        }
                    } else if (cls == Date.class && jSONLexer.ch == '1') {
                        fieldDeserializer.setValue(t, new Date(jSONLexer.scanLongValue()));
                        if (jSONLexer.ch == ',') {
                            int i13 = jSONLexer.bp + 1;
                            jSONLexer.bp = i13;
                            if (i13 >= jSONLexer.len) {
                                c6 = 26;
                            } else {
                                c6 = jSONLexer.text.charAt(i13);
                            }
                            jSONLexer.ch = c6;
                            jSONLexer.token = 16;
                        } else if (jSONLexer.ch == ']') {
                            int i14 = jSONLexer.bp + 1;
                            jSONLexer.bp = i14;
                            if (i14 >= jSONLexer.len) {
                                c5 = 26;
                            } else {
                                c5 = jSONLexer.text.charAt(i14);
                            }
                            jSONLexer.ch = c5;
                            jSONLexer.token = 15;
                        } else {
                            jSONLexer.nextToken();
                        }
                    } else {
                        if (jSONLexer.ch == '[') {
                            int i15 = jSONLexer.bp + 1;
                            jSONLexer.bp = i15;
                            if (i15 >= jSONLexer.len) {
                                c4 = 26;
                            } else {
                                c4 = jSONLexer.text.charAt(i15);
                            }
                            jSONLexer.ch = c4;
                            jSONLexer.token = 14;
                        } else if (jSONLexer.ch == '{') {
                            int i16 = jSONLexer.bp + 1;
                            jSONLexer.bp = i16;
                            if (i16 >= jSONLexer.len) {
                                c3 = 26;
                            } else {
                                c3 = jSONLexer.text.charAt(i16);
                            }
                            jSONLexer.ch = c3;
                            jSONLexer.token = 12;
                        } else {
                            jSONLexer.nextToken();
                        }
                        fieldDeserializer.parseField(defaultJSONParser, t, fieldInfo.fieldType, null);
                        if (c2 == ']') {
                            if (jSONLexer.token != 15) {
                                throw new JSONException("syntax error");
                            }
                        } else if (c2 == ',' && jSONLexer.token != 16) {
                            throw new JSONException("syntax error");
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                throw new JSONException("set " + fieldInfo.name + "error", e);
            }
        }
        if (jSONLexer.ch == ',') {
            int i17 = jSONLexer.bp + 1;
            jSONLexer.bp = i17;
            if (i17 >= jSONLexer.len) {
                c = 26;
            } else {
                c = jSONLexer.text.charAt(i17);
            }
            jSONLexer.ch = c;
            jSONLexer.token = 16;
        } else {
            jSONLexer.nextToken();
        }
        return t;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:311:0x0485 */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x030e, code lost:
        if (r2 == 16) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0320, code lost:
        r10.nextTokenWithChar(':');
        r0 = r10.token;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0326, code lost:
        if (r0 != 4) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0328, code lost:
        r0 = r10.stringVal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0332, code lost:
        if ("@".equals(r0) == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0334, code lost:
        r1 = (T) r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x033e, code lost:
        if ("..".equals(r0) == false) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0340, code lost:
        r2 = r2.parent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0344, code lost:
        if (r2.object == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0346, code lost:
        r1 = (T) r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0349, code lost:
        r38.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r38.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x035b, code lost:
        if ("$".equals(r0) == false) goto L_0x0378;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x035d, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0360, code lost:
        if (r2.parent == null) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0362, code lost:
        r2 = r2.parent;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0367, code lost:
        if (r2.object == null) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0369, code lost:
        r1 = (T) r2.object;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x036c, code lost:
        r38.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r38.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0378, code lost:
        r38.addResolveTask(new com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask(r2, r0));
        r38.resolveStatus = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0383, code lost:
        r10.nextToken(13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x038a, code lost:
        if (r10.token != 13) goto L_0x039e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x038c, code lost:
        r10.nextToken(16);
        r38.setContext(r2, r1, r40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0396, code lost:
        if (r20 == null) goto L_0x039a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0398, code lost:
        r20.object = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x039a, code lost:
        r38.setContext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x039d, code lost:
        return (T) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x039e, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x03a7, code lost:
        throw new com.alibaba.fastjson.JSONException("illegal ref");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x03c4, code lost:
        throw new com.alibaba.fastjson.JSONException("illegal ref, " + com.alibaba.fastjson.parser.JSONToken.name(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x041d, code lost:
        if (r5 != null) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x041f, code lost:
        r5 = r38.config.checkAutoType(r4, r37.clazz, r10.features);
        r0 = com.alibaba.fastjson.util.TypeUtils.getClass(r39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x042d, code lost:
        if (r0 == null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x042f, code lost:
        if (r5 == null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0435, code lost:
        if (r0.isAssignableFrom(r5) == false) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x043f, code lost:
        throw new com.alibaba.fastjson.JSONException("type not match");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0440, code lost:
        r5 = r38.config.getDeserializer(r5);
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x044c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x044f, code lost:
        if ((r5 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer) == false) goto L_0x0462;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0451, code lost:
        r5 = r5;
        r0 = (T) r5.deserialze(r38, r0, r40, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0458, code lost:
        if (r3 == null) goto L_0x0466;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x045a, code lost:
        r5.getFieldDeserializer(r3).setValue(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0462, code lost:
        r0 = (T) r5.deserialze(r38, r0, r40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0466, code lost:
        if (r2 == null) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0468, code lost:
        r2.object = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x046a, code lost:
        r38.setContext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x046d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x04a1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x05f8, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0711, code lost:
        throw new com.alibaba.fastjson.JSONException("syntax error, unexpect token " + com.alibaba.fastjson.parser.JSONToken.name(r10.token));
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x047c  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110 A[Catch:{ all -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r38, java.lang.reflect.Type r39, java.lang.Object r40, java.lang.Object r41) {
        /*
        // Method dump skipped, instructions count: 1839
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private boolean parseField(DefaultJSONParser defaultJSONParser, String str, Object obj, Type type, Map<String, Object> map) {
        boolean z;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        FieldDeserializer fieldDeserializer = getFieldDeserializer(str);
        if (fieldDeserializer == null) {
            long fnv_64_lower = TypeUtils.fnv_64_lower(str);
            if (this.smartMatchHashArray == null) {
                long[] jArr = new long[this.sortedFieldDeserializers.length];
                int i = 0;
                while (true) {
                    FieldDeserializer[] fieldDeserializerArr = this.sortedFieldDeserializers;
                    if (i >= fieldDeserializerArr.length) {
                        break;
                    }
                    jArr[i] = TypeUtils.fnv_64_lower(fieldDeserializerArr[i].fieldInfo.name);
                    i++;
                }
                Arrays.sort(jArr);
                this.smartMatchHashArray = jArr;
            }
            int binarySearch = Arrays.binarySearch(this.smartMatchHashArray, fnv_64_lower);
            if (binarySearch < 0) {
                z = str.startsWith("is");
                if (z) {
                    binarySearch = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(str.substring(2)));
                }
            } else {
                z = false;
            }
            if (binarySearch >= 0) {
                if (this.smartMatchHashArrayMapping == null) {
                    int[] iArr = new int[this.smartMatchHashArray.length];
                    Arrays.fill(iArr, -1);
                    int i2 = 0;
                    while (true) {
                        FieldDeserializer[] fieldDeserializerArr2 = this.sortedFieldDeserializers;
                        if (i2 >= fieldDeserializerArr2.length) {
                            break;
                        }
                        int binarySearch2 = Arrays.binarySearch(this.smartMatchHashArray, TypeUtils.fnv_64_lower(fieldDeserializerArr2[i2].fieldInfo.name));
                        if (binarySearch2 >= 0) {
                            iArr[binarySearch2] = i2;
                        }
                        i2++;
                    }
                    this.smartMatchHashArrayMapping = iArr;
                }
                int i3 = this.smartMatchHashArrayMapping[binarySearch];
                if (i3 != -1) {
                    fieldDeserializer = this.sortedFieldDeserializers[i3];
                    Class<?> cls = fieldDeserializer.fieldInfo.fieldClass;
                    if (!(!z || cls == Boolean.TYPE || cls == Boolean.class)) {
                        fieldDeserializer = null;
                    }
                }
            }
        }
        int i4 = Feature.SupportNonPublicField.mask;
        if (fieldDeserializer == null && !((defaultJSONParser.lexer.features & i4) == 0 && (i4 & this.beanInfo.parserFeatures) == 0)) {
            if (this.extraFieldDeserializers == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                Class<?> cls2 = this.clazz;
                while (cls2 != null && cls2 != Object.class) {
                    Field[] declaredFields = cls2.getDeclaredFields();
                    for (Field field : declaredFields) {
                        String name = field.getName();
                        if (getFieldDeserializer(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentHashMap.put(name, field);
                            }
                        }
                    }
                    cls2 = cls2.getSuperclass();
                }
                this.extraFieldDeserializers = concurrentHashMap;
            }
            Object obj2 = this.extraFieldDeserializers.get(str);
            if (obj2 != null) {
                if (obj2 instanceof FieldDeserializer) {
                    fieldDeserializer = (FieldDeserializer) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    fieldDeserializer = new DefaultFieldDeserializer(defaultJSONParser.config, this.clazz, new FieldInfo(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.extraFieldDeserializers.put(str, fieldDeserializer);
                }
            }
        }
        if (fieldDeserializer == null) {
            parseExtra(defaultJSONParser, obj, str);
            return false;
        }
        jSONLexer.nextTokenWithChar(':');
        fieldDeserializer.parseField(defaultJSONParser, obj, type, map);
        return true;
    }
}
