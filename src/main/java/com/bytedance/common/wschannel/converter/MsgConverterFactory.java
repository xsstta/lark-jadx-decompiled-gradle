package com.bytedance.common.wschannel.converter;

public class MsgConverterFactory {
    private static MsgConverter DEFAULT;
    private static MsgConverter sConverter;

    public static MsgConverter getConverter() {
        return sConverter;
    }

    static {
        WireConverter wireConverter = new WireConverter();
        DEFAULT = wireConverter;
        sConverter = wireConverter;
    }
}
