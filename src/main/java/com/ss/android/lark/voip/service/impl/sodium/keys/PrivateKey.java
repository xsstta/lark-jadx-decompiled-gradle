package com.ss.android.lark.voip.service.impl.sodium.keys;

import com.ss.android.lark.voip.service.impl.sodium.crypto.Util;
import com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder;

public class PrivateKey {
    private final byte[] secretKey;

    public byte[] toBytes() {
        return this.secretKey;
    }

    public String toString() {
        return Encoder.HEX.encode(this.secretKey);
    }

    public PrivateKey(byte[] bArr) {
        this.secretKey = bArr;
        Util.checkLength(bArr, 32);
    }

    public PrivateKey(String str) {
        byte[] decode = Encoder.HEX.decode(str);
        this.secretKey = decode;
        Util.checkLength(decode, 32);
    }
}
