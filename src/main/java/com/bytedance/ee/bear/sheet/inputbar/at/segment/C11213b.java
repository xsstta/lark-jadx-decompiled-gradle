package com.bytedance.ee.bear.sheet.inputbar.at.segment;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.at.segment.b */
public class C11213b implements ObjectDeserializer {
    /* renamed from: a */
    public SegmentType deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() != 4) {
            return SegmentType.TEXT;
        }
        String stringVal = jSONLexer.stringVal();
        jSONLexer.nextToken(16);
        return SegmentType.parseSegmentType(stringVal);
    }
}
