package com.alibaba.fastjson.parser;

public class ThrowableDeserializer extends JavaBeanDeserializer {
    public ThrowableDeserializer(ParserConfig parserConfig, Class<?> cls) {
        super(parserConfig, cls, cls);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:115:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x012b */
    /* JADX DEBUG: Multi-variable search result rejected for r11v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r11v15, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r8v26, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r8v27, resolved type: java.lang.reflect.Constructor */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r2) != false) goto L_0x0036;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0181  */
    @Override // com.alibaba.fastjson.parser.deserializer.ObjectDeserializer, com.alibaba.fastjson.parser.JavaBeanDeserializer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r18, java.lang.reflect.Type r19, java.lang.Object r20) {
        /*
        // Method dump skipped, instructions count: 444
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.ThrowableDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
