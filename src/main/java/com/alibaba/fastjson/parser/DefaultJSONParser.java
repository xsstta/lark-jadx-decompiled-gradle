package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.IntegerCodec;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.util.TypeUtils;
import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class DefaultJSONParser implements Closeable {
    public ParserConfig config;
    protected ParseContext contex;
    private ParseContext[] contextArray;
    private int contextArrayIndex;
    private DateFormat dateFormat;
    private String dateFormatPattern;
    protected List<ExtraProcessor> extraProcessors;
    protected List<ExtraTypeProvider> extraTypeProviders;
    public FieldTypeResolver fieldTypeResolver;
    public final JSONLexer lexer;
    public int resolveStatus;
    private List<ResolveTask> resolveTaskList;
    public final SymbolTable symbolTable;

    public String getDateFomartPattern() {
        return this.dateFormatPattern;
    }

    public Object parse() {
        return parse(null);
    }

    public List<ExtraProcessor> getExtraProcessors() {
        if (this.extraProcessors == null) {
            this.extraProcessors = new ArrayList(2);
        }
        return this.extraProcessors;
    }

    public List<ExtraTypeProvider> getExtraTypeProviders() {
        if (this.extraTypeProviders == null) {
            this.extraTypeProviders = new ArrayList(2);
        }
        return this.extraTypeProviders;
    }

    /* access modifiers changed from: protected */
    public ResolveTask getLastResolveTask() {
        List<ResolveTask> list = this.resolveTaskList;
        return list.get(list.size() - 1);
    }

    public DateFormat getDateFormat() {
        if (this.dateFormat == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.dateFormatPattern, this.lexer.locale);
            this.dateFormat = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.lexer.timeZone);
        }
        return this.dateFormat;
    }

    /* access modifiers changed from: protected */
    public void popContext() {
        this.contex = this.contex.parent;
        ParseContext[] parseContextArr = this.contextArray;
        int i = this.contextArrayIndex;
        parseContextArr[i - 1] = null;
        this.contextArrayIndex = i - 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            if (this.lexer.token != 20) {
                throw new JSONException("not close json text, token : " + JSONToken.name(this.lexer.token));
            }
        } finally {
            this.lexer.close();
        }
    }

    public JSONObject parseObject() {
        JSONObject jSONObject;
        if ((this.lexer.features & Feature.OrderedField.mask) != 0) {
            jSONObject = new JSONObject(new LinkedHashMap());
        } else {
            jSONObject = new JSONObject();
        }
        return (JSONObject) parseObject(jSONObject, (Object) null);
    }

    public String parseString() {
        int i = this.lexer.token;
        if (i == 4) {
            String stringVal = this.lexer.stringVal();
            char c = 26;
            if (this.lexer.ch == ',') {
                JSONLexer jSONLexer = this.lexer;
                int i2 = jSONLexer.bp + 1;
                jSONLexer.bp = i2;
                JSONLexer jSONLexer2 = this.lexer;
                if (i2 < jSONLexer2.len) {
                    c = this.lexer.text.charAt(i2);
                }
                jSONLexer2.ch = c;
                this.lexer.token = 16;
            } else if (this.lexer.ch == ']') {
                JSONLexer jSONLexer3 = this.lexer;
                int i3 = jSONLexer3.bp + 1;
                jSONLexer3.bp = i3;
                JSONLexer jSONLexer4 = this.lexer;
                if (i3 < jSONLexer4.len) {
                    c = this.lexer.text.charAt(i3);
                }
                jSONLexer4.ch = c;
                this.lexer.token = 15;
            } else if (this.lexer.ch == '}') {
                JSONLexer jSONLexer5 = this.lexer;
                int i4 = jSONLexer5.bp + 1;
                jSONLexer5.bp = i4;
                JSONLexer jSONLexer6 = this.lexer;
                if (i4 < jSONLexer6.len) {
                    c = this.lexer.text.charAt(i4);
                }
                jSONLexer6.ch = c;
                this.lexer.token = 13;
            } else {
                this.lexer.nextToken();
            }
            return stringVal;
        } else if (i == 2) {
            String numberString = this.lexer.numberString();
            this.lexer.nextToken(16);
            return numberString;
        } else {
            Object parse = parse();
            if (parse == null) {
                return null;
            }
            return parse.toString();
        }
    }

    public void setDateFomrat(DateFormat dateFormat2) {
        this.dateFormat = dateFormat2;
    }

    public DefaultJSONParser(JSONLexer jSONLexer) {
        this(jSONLexer, ParserConfig.global);
    }

    public <T> T parseObject(Class<T> cls) {
        return (T) parseObject(cls, (Object) null);
    }

    public void setDateFormat(String str) {
        this.dateFormatPattern = str;
        this.dateFormat = null;
    }

    public DefaultJSONParser(String str) {
        this(str, ParserConfig.global, JSON.DEFAULT_PARSER_FEATURE);
    }

    public <T> List<T> parseArray(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        parseArray((Class<?>) cls, (Collection) arrayList);
        return arrayList;
    }

    public <T> T parseObject(Type type) {
        return (T) parseObject(type, (Object) null);
    }

    public void setContext(ParseContext parseContext) {
        if (!this.lexer.disableCircularReferenceDetect) {
            this.contex = parseContext;
        }
    }

    /* access modifiers changed from: protected */
    public void addResolveTask(ResolveTask resolveTask) {
        if (this.resolveTaskList == null) {
            this.resolveTaskList = new ArrayList(2);
        }
        this.resolveTaskList.add(resolveTask);
    }

    public final void parseArray(Collection collection) {
        parseArray(collection, (Object) null);
    }

    public Object parseObject(Map map) {
        return parseObject(map, (Object) null);
    }

    public final void accept(int i) {
        if (this.lexer.token == i) {
            this.lexer.nextToken();
            return;
        }
        throw new JSONException("syntax error, expect " + JSONToken.name(i) + ", actual " + JSONToken.name(this.lexer.token));
    }

    /* access modifiers changed from: protected */
    public void checkListResolve(Collection collection) {
        if (collection instanceof List) {
            ResolveTask lastResolveTask = getLastResolveTask();
            lastResolveTask.fieldDeserializer = new ResolveFieldDeserializer(this, (List) collection, collection.size() - 1);
            lastResolveTask.ownerContext = this.contex;
            this.resolveStatus = 0;
            return;
        }
        ResolveTask lastResolveTask2 = getLastResolveTask();
        lastResolveTask2.fieldDeserializer = new ResolveFieldDeserializer(collection);
        lastResolveTask2.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    public void handleResovleTask(Object obj) {
        List<ResolveTask> list = this.resolveTaskList;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ResolveTask resolveTask = this.resolveTaskList.get(i);
                FieldDeserializer fieldDeserializer = resolveTask.fieldDeserializer;
                if (fieldDeserializer != null) {
                    Object obj2 = null;
                    Object obj3 = resolveTask.ownerContext != null ? resolveTask.ownerContext.object : null;
                    String str = resolveTask.referenceValue;
                    if (str.startsWith("$")) {
                        for (int i2 = 0; i2 < this.contextArrayIndex; i2++) {
                            if (str.equals(this.contextArray[i2].toString())) {
                                obj2 = this.contextArray[i2].object;
                            }
                        }
                    } else {
                        obj2 = resolveTask.context.object;
                    }
                    fieldDeserializer.setValue(obj3, obj2);
                }
            }
        }
    }

    public Object parseArrayWithType(Type type) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            Type type2 = actualTypeArguments[0];
            if (type2 instanceof Class) {
                ArrayList arrayList = new ArrayList();
                parseArray((Class) type2, (Collection) arrayList);
                return arrayList;
            } else if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type2;
                Type type3 = wildcardType.getUpperBounds()[0];
                if (!Object.class.equals(type3)) {
                    ArrayList arrayList2 = new ArrayList();
                    parseArray((Class) type3, (Collection) arrayList2);
                    return arrayList2;
                } else if (wildcardType.getLowerBounds().length == 0) {
                    return parse();
                } else {
                    throw new JSONException("not support type : " + type);
                }
            } else {
                if (type2 instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) type2;
                    Type[] bounds = typeVariable.getBounds();
                    if (bounds.length == 1) {
                        Type type4 = bounds[0];
                        if (type4 instanceof Class) {
                            ArrayList arrayList3 = new ArrayList();
                            parseArray((Class) type4, (Collection) arrayList3);
                            return arrayList3;
                        }
                    } else {
                        throw new JSONException("not support : " + typeVariable);
                    }
                }
                if (type2 instanceof ParameterizedType) {
                    ArrayList arrayList4 = new ArrayList();
                    parseArray((ParameterizedType) type2, arrayList4);
                    return arrayList4;
                }
                throw new JSONException("TODO : " + type);
            }
        } else {
            throw new JSONException("not support type " + type);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public Object parse(Object obj) {
        JSONObject jSONObject;
        int i = this.lexer.token;
        if (i != 2) {
            boolean z = true;
            if (i == 3) {
                if ((this.lexer.features & Feature.UseBigDecimal.mask) == 0) {
                    z = false;
                }
                Number decimalValue = this.lexer.decimalValue(z);
                this.lexer.nextToken();
                return decimalValue;
            } else if (i == 4) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken(16);
                if ((this.lexer.features & Feature.AllowISO8601DateFormat.mask) != 0) {
                    JSONLexer jSONLexer = new JSONLexer(stringVal);
                    try {
                        if (jSONLexer.scanISO8601DateIfMatch(true)) {
                            return jSONLexer.calendar.getTime();
                        }
                        jSONLexer.close();
                    } finally {
                        jSONLexer.close();
                    }
                }
                return stringVal;
            } else if (i == 12) {
                if ((this.lexer.features & Feature.OrderedField.mask) != 0) {
                    jSONObject = new JSONObject(new LinkedHashMap());
                } else {
                    jSONObject = new JSONObject();
                }
                return parseObject(jSONObject, obj);
            } else if (i != 14) {
                switch (i) {
                    case 6:
                        this.lexer.nextToken(16);
                        return Boolean.TRUE;
                    case 7:
                        this.lexer.nextToken(16);
                        return Boolean.FALSE;
                    case 8:
                        break;
                    case 9:
                        this.lexer.nextToken(18);
                        if (this.lexer.token == 18) {
                            this.lexer.nextToken(10);
                            accept(10);
                            long longValue = this.lexer.integerValue().longValue();
                            accept(2);
                            accept(11);
                            return new Date(longValue);
                        }
                        throw new JSONException("syntax error, " + this.lexer.info());
                    default:
                        switch (i) {
                            case 20:
                                if (this.lexer.isBlankInput()) {
                                    return null;
                                }
                                throw new JSONException("syntax error, " + this.lexer.info());
                            case 21:
                                this.lexer.nextToken();
                                HashSet hashSet = new HashSet();
                                parseArray(hashSet, obj);
                                return hashSet;
                            case 22:
                                this.lexer.nextToken();
                                TreeSet treeSet = new TreeSet();
                                parseArray(treeSet, obj);
                                return treeSet;
                            case 23:
                                break;
                            default:
                                throw new JSONException("syntax error, " + this.lexer.info());
                        }
                }
                this.lexer.nextToken();
                return null;
            } else {
                JSONArray jSONArray = new JSONArray();
                parseArray(jSONArray, obj);
                return jSONArray;
            }
        } else {
            Number integerValue = this.lexer.integerValue();
            this.lexer.nextToken();
            return integerValue;
        }
    }

    public void parseObject(Object obj) {
        JavaBeanDeserializer javaBeanDeserializer;
        FieldDeserializer fieldDeserializer;
        Object obj2;
        Class<?> cls = obj.getClass();
        ObjectDeserializer deserializer = this.config.getDeserializer(cls);
        if (deserializer instanceof JavaBeanDeserializer) {
            javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
        } else {
            javaBeanDeserializer = null;
        }
        int i = this.lexer.token;
        if (i == 12 || i == 16) {
            while (true) {
                String scanSymbol = this.lexer.scanSymbol(this.symbolTable);
                if (scanSymbol == null) {
                    if (this.lexer.token == 13) {
                        this.lexer.nextToken(16);
                        return;
                    } else if (this.lexer.token == 16) {
                        continue;
                    }
                }
                if (javaBeanDeserializer != null) {
                    fieldDeserializer = javaBeanDeserializer.getFieldDeserializer(scanSymbol);
                } else {
                    fieldDeserializer = null;
                }
                if (fieldDeserializer != null) {
                    Class<?> cls2 = fieldDeserializer.fieldInfo.fieldClass;
                    Type type = fieldDeserializer.fieldInfo.fieldType;
                    if (cls2 == Integer.TYPE) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = IntegerCodec.instance.deserialze(this, type, null);
                    } else if (cls2 == String.class) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = parseString();
                    } else if (cls2 == Long.TYPE) {
                        this.lexer.nextTokenWithChar(':');
                        obj2 = IntegerCodec.instance.deserialze(this, type, null);
                    } else {
                        ObjectDeserializer deserializer2 = this.config.getDeserializer(cls2, type);
                        this.lexer.nextTokenWithChar(':');
                        obj2 = deserializer2.deserialze(this, type, null);
                    }
                    fieldDeserializer.setValue(obj, obj2);
                    if (this.lexer.token != 16 && this.lexer.token == 13) {
                        this.lexer.nextToken(16);
                        return;
                    }
                } else if ((this.lexer.features & Feature.IgnoreNotMatch.mask) != 0) {
                    this.lexer.nextTokenWithChar(':');
                    parse();
                    if (this.lexer.token == 13) {
                        this.lexer.nextToken();
                        return;
                    }
                } else {
                    throw new JSONException("setter not found, class " + cls.getName() + ", property " + scanSymbol);
                }
            }
        } else {
            throw new JSONException("syntax error, expect {, actual " + JSONToken.name(i));
        }
    }

    public Object[] parseArray(Type[] typeArr) {
        Object obj;
        boolean z;
        Class<?> cls;
        int i = 8;
        if (this.lexer.token == 8) {
            this.lexer.nextToken(16);
            return null;
        } else if (this.lexer.token == 14) {
            Object[] objArr = new Object[typeArr.length];
            if (typeArr.length == 0) {
                this.lexer.nextToken(15);
                if (this.lexer.token == 15) {
                    this.lexer.nextToken(16);
                    return new Object[0];
                }
                throw new JSONException("syntax error, " + this.lexer.info());
            }
            this.lexer.nextToken(2);
            int i2 = 0;
            while (i2 < typeArr.length) {
                if (this.lexer.token == i) {
                    this.lexer.nextToken(16);
                    obj = null;
                } else {
                    Type type = typeArr[i2];
                    if (type == Integer.TYPE || type == Integer.class) {
                        if (this.lexer.token == 2) {
                            obj = Integer.valueOf(this.lexer.intValue());
                            this.lexer.nextToken(16);
                        } else {
                            obj = TypeUtils.cast(parse(), type, this.config);
                        }
                    } else if (type != String.class) {
                        if (i2 != typeArr.length - 1 || !(type instanceof Class)) {
                            cls = null;
                            z = false;
                        } else {
                            Class cls2 = (Class) type;
                            z = cls2.isArray();
                            cls = cls2.getComponentType();
                        }
                        if (!z || this.lexer.token == 14) {
                            obj = this.config.getDeserializer(type).deserialze(this, type, null);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            ObjectDeserializer deserializer = this.config.getDeserializer(cls);
                            if (this.lexer.token != 15) {
                                while (true) {
                                    arrayList.add(deserializer.deserialze(this, type, null));
                                    if (this.lexer.token != 16) {
                                        break;
                                    }
                                    this.lexer.nextToken(12);
                                }
                                if (this.lexer.token != 15) {
                                    throw new JSONException("syntax error, " + this.lexer.info());
                                }
                            }
                            obj = TypeUtils.cast(arrayList, type, this.config);
                        }
                    } else if (this.lexer.token == 4) {
                        obj = this.lexer.stringVal();
                        this.lexer.nextToken(16);
                    } else {
                        obj = TypeUtils.cast(parse(), type, this.config);
                    }
                }
                objArr[i2] = obj;
                if (this.lexer.token == 15) {
                    break;
                } else if (this.lexer.token == 16) {
                    if (i2 == typeArr.length - 1) {
                        this.lexer.nextToken(15);
                    } else {
                        this.lexer.nextToken(2);
                    }
                    i2++;
                    i = 8;
                } else {
                    throw new JSONException("syntax error, " + this.lexer.info());
                }
            }
            if (this.lexer.token == 15) {
                this.lexer.nextToken(16);
                return objArr;
            }
            throw new JSONException("syntax error, " + this.lexer.info());
        } else {
            throw new JSONException("syntax error, " + this.lexer.info());
        }
    }

    public void parseArray(Class<?> cls, Collection collection) {
        parseArray((Type) cls, collection);
    }

    public static class ResolveTask {
        public final ParseContext context;
        public FieldDeserializer fieldDeserializer;
        public ParseContext ownerContext;
        public final String referenceValue;

        public ResolveTask(ParseContext parseContext, String str) {
            this.context = parseContext;
            this.referenceValue = str;
        }
    }

    public void config(Feature feature, boolean z) {
        this.lexer.config(feature, z);
    }

    public void parseArray(Type type, Collection collection) {
        parseArray(type, collection, null);
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig) {
        this(new JSONLexer(str, JSON.DEFAULT_PARSER_FEATURE), parserConfig);
    }

    /* access modifiers changed from: protected */
    public void checkMapResolve(Map map, Object obj) {
        ResolveFieldDeserializer resolveFieldDeserializer = new ResolveFieldDeserializer(map, obj);
        ResolveTask lastResolveTask = getLastResolveTask();
        lastResolveTask.fieldDeserializer = resolveFieldDeserializer;
        lastResolveTask.ownerContext = this.contex;
        this.resolveStatus = 0;
    }

    public DefaultJSONParser(JSONLexer jSONLexer, ParserConfig parserConfig) {
        this.dateFormatPattern = JSON.DEFFAULT_DATE_FORMAT;
        this.lexer = jSONLexer;
        this.config = parserConfig;
        this.symbolTable = parserConfig.symbolTable;
        char c = 26;
        if (jSONLexer.ch == '{') {
            int i = jSONLexer.bp + 1;
            jSONLexer.bp = i;
            jSONLexer.ch = i < jSONLexer.len ? jSONLexer.text.charAt(i) : c;
            jSONLexer.token = 12;
        } else if (jSONLexer.ch == '[') {
            int i2 = jSONLexer.bp + 1;
            jSONLexer.bp = i2;
            jSONLexer.ch = i2 < jSONLexer.len ? jSONLexer.text.charAt(i2) : c;
            jSONLexer.token = 14;
        } else {
            jSONLexer.nextToken();
        }
    }

    public <T> T parseObject(Type type, Object obj) {
        if (this.lexer.token == 8) {
            this.lexer.nextToken();
            return null;
        }
        if (this.lexer.token == 4) {
            if (type == byte[].class) {
                T t = (T) this.lexer.bytesValue();
                this.lexer.nextToken();
                return t;
            } else if (type == char[].class) {
                String stringVal = this.lexer.stringVal();
                this.lexer.nextToken();
                return (T) stringVal.toCharArray();
            }
        }
        try {
            return (T) this.config.getDeserializer(type).deserialze(this, type, obj);
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage(), e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010c A[LOOP:1: B:59:0x010a->B:60:0x010c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parseArray(java.util.Collection r17, java.lang.Object r18) {
        /*
        // Method dump skipped, instructions count: 673
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseArray(java.util.Collection, java.lang.Object):void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0136 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v38, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x04fb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0594 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object parseObject(java.util.Map r19, java.lang.Object r20) {
        /*
        // Method dump skipped, instructions count: 1717
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.DefaultJSONParser.parseObject(java.util.Map, java.lang.Object):java.lang.Object");
    }

    public DefaultJSONParser(String str, ParserConfig parserConfig, int i) {
        this(new JSONLexer(str, i), parserConfig);
    }

    /* access modifiers changed from: protected */
    public ParseContext setContext(ParseContext parseContext, Object obj, Object obj2) {
        if (this.lexer.disableCircularReferenceDetect) {
            return null;
        }
        this.contex = new ParseContext(parseContext, obj, obj2);
        int i = this.contextArrayIndex;
        this.contextArrayIndex = i + 1;
        ParseContext[] parseContextArr = this.contextArray;
        if (parseContextArr == null) {
            this.contextArray = new ParseContext[8];
        } else if (i >= parseContextArr.length) {
            ParseContext[] parseContextArr2 = new ParseContext[((parseContextArr.length * 3) / 2)];
            System.arraycopy(parseContextArr, 0, parseContextArr2, 0, parseContextArr.length);
            this.contextArray = parseContextArr2;
        }
        ParseContext[] parseContextArr3 = this.contextArray;
        ParseContext parseContext2 = this.contex;
        parseContextArr3[i] = parseContext2;
        return parseContext2;
    }

    /* JADX INFO: finally extract failed */
    public void parseArray(Type type, Collection collection, Object obj) {
        ObjectDeserializer objectDeserializer;
        String str;
        if (this.lexer.token == 21 || this.lexer.token == 22) {
            this.lexer.nextToken();
        }
        if (this.lexer.token == 14) {
            if (Integer.TYPE == type) {
                objectDeserializer = IntegerCodec.instance;
                this.lexer.nextToken(2);
            } else if (String.class == type) {
                objectDeserializer = StringCodec.instance;
                this.lexer.nextToken(4);
            } else {
                objectDeserializer = this.config.getDeserializer(type);
                this.lexer.nextToken(12);
            }
            ParseContext parseContext = this.contex;
            if (!this.lexer.disableCircularReferenceDetect) {
                setContext(this.contex, collection, obj);
            }
            int i = 0;
            while (true) {
                try {
                    if (this.lexer.token == 16) {
                        this.lexer.nextToken();
                    } else if (this.lexer.token == 15) {
                        this.contex = parseContext;
                        this.lexer.nextToken(16);
                        return;
                    } else {
                        Object obj2 = null;
                        String str2 = null;
                        if (Integer.TYPE == type) {
                            collection.add(IntegerCodec.instance.deserialze(this, null, null));
                        } else if (String.class == type) {
                            if (this.lexer.token == 4) {
                                str = this.lexer.stringVal();
                                this.lexer.nextToken(16);
                            } else {
                                Object parse = parse();
                                if (parse != null) {
                                    str2 = parse.toString();
                                }
                                str = str2;
                            }
                            collection.add(str);
                        } else {
                            if (this.lexer.token == 8) {
                                this.lexer.nextToken();
                            } else {
                                obj2 = objectDeserializer.deserialze(this, type, Integer.valueOf(i));
                            }
                            collection.add(obj2);
                            if (this.resolveStatus == 1) {
                                checkListResolve(collection);
                            }
                        }
                        if (this.lexer.token == 16) {
                            this.lexer.nextToken();
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    this.contex = parseContext;
                    throw th;
                }
            }
        } else {
            throw new JSONException("exepct '[', but " + JSONToken.name(this.lexer.token) + ", " + this.lexer.info());
        }
    }

    public DefaultJSONParser(char[] cArr, int i, ParserConfig parserConfig, int i2) {
        this(new JSONLexer(cArr, i, i2), parserConfig);
    }
}
