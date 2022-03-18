package com.ss.android.lark.voip.service.impl.sodium.encoders;

import java.nio.charset.Charset;

public interface Encoder {
    public static final Charset CHARSET = Charset.forName("UTF-8");
    public static final Hex HEX = new Hex();
    public static final Raw RAW = new Raw();

    byte[] decode(String str);

    String encode(byte[] bArr);
}
