package com.bytedance.ee.bear.bitable.card.viewmodel.p267a;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.bytedance.ee.bear.bitable.card.model.enums.ECardType;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.a.a */
public class C4754a implements ObjectDeserializer {
    /* renamed from: a */
    public ECardType deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 4) {
            String stringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            stringVal.hashCode();
            if (stringVal.equals("bitable")) {
                return ECardType.BITABLE;
            }
            if (stringVal.equals("jira")) {
                return ECardType.JIRA;
            }
        }
        return ECardType.UNKNOWN;
    }
}
