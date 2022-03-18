package com.ss.android.lark.voip.service.impl.sodium.encoders;

import java.nio.charset.Charset;

public interface EncoderTmp {
    public static final Charset CHARSET = Charset.forName("UTF-8");
    public static final HexTmp HEX = new HexTmp();

    byte[] decode(String str);

    String encode(byte[] bArr);
}
