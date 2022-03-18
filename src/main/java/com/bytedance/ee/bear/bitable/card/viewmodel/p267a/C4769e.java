package com.bytedance.ee.bear.bitable.card.viewmodel.p267a;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.bytedance.ee.bear.bitable.card.model.enums.ESegmentType;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.ee.bear.bitable.card.viewmodel.a.e */
public class C4769e implements ObjectDeserializer {
    /* renamed from: a */
    public ESegmentType deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
        JSONLexer jSONLexer = defaultJSONParser.lexer;
        if (jSONLexer.token() == 4) {
            String stringVal = jSONLexer.stringVal();
            jSONLexer.nextToken(16);
            stringVal.hashCode();
            char c = 65535;
            switch (stringVal.hashCode()) {
                case 116079:
                    if (stringVal.equals("url")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (stringVal.equals("text")) {
                        c = 1;
                        break;
                    }
                    break;
                case 950345194:
                    if (stringVal.equals("mention")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return ESegmentType.URL;
                case 1:
                    return ESegmentType.TEXT;
                case 2:
                    return ESegmentType.MENTION;
            }
        }
        return ESegmentType.UNKNOWN;
    }
}
