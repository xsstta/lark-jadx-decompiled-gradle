package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* access modifiers changed from: package-private */
public class ListTypeFieldDeserializer extends FieldDeserializer {
    private final boolean array;
    private ObjectDeserializer deserializer;
    private final Type itemType;

    public ListTypeFieldDeserializer(ParserConfig parserConfig, Class<?> cls, FieldInfo fieldInfo) {
        super(cls, fieldInfo, 14);
        Type type = fieldInfo.fieldType;
        Class<?> cls2 = fieldInfo.fieldClass;
        if (cls2.isArray()) {
            this.itemType = cls2.getComponentType();
            this.array = true;
            return;
        }
        this.itemType = TypeUtils.getCollectionItemType(type);
        this.array = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parseArray(com.alibaba.fastjson.parser.DefaultJSONParser r18, java.lang.reflect.Type r19, java.util.Collection r20) {
        /*
        // Method dump skipped, instructions count: 595
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.ListTypeFieldDeserializer.parseArray(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.util.Collection):void");
    }

    @Override // com.alibaba.fastjson.parser.deserializer.FieldDeserializer
    public void parseField(DefaultJSONParser defaultJSONParser, Object obj, Type type, Map<String, Object> map) {
        ArrayList arrayList;
        JSONArray jSONArray;
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        int i = jSONLexer.token();
        if (i == 8 || (i == 4 && jSONLexer.stringVal().length() == 0)) {
            setValue(obj, (Object) null);
            defaultJSONParser.lexer.nextToken();
            return;
        }
        if (this.array) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.setComponentType(this.itemType);
            jSONArray = jSONArray2;
            arrayList = jSONArray2;
        } else {
            arrayList = new ArrayList();
            jSONArray = null;
        }
        ParseContext parseContext = defaultJSONParser.contex;
        defaultJSONParser.setContext(parseContext, obj, this.fieldInfo.name);
        parseArray(defaultJSONParser, type, arrayList);
        defaultJSONParser.setContext(parseContext);
        Object obj2 = arrayList;
        if (this.array) {
            Object array2 = arrayList.toArray((Object[]) Array.newInstance((Class) this.itemType, arrayList.size()));
            jSONArray.setRelatedArray(array2);
            obj2 = array2;
        }
        if (obj == null) {
            map.put(this.fieldInfo.name, obj2);
        } else {
            setValue(obj, obj2);
        }
    }
}
