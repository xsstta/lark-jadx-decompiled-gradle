package com.ss.android.lark.voip.service.impl.sodium.keys;

import com.ss.android.lark.voip.service.impl.sodium.crypto.Util;
import com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder;

public class PublicKey {
    private final byte[] publicKey;

    public byte[] toBytes() {
        return this.publicKey;
    }

    public String toString() {
        return Encoder.HEX.encode(this.publicKey);
    }

    public PublicKey(String str) {
        this.publicKey = Encoder.HEX.decode(str);
    }

    public PublicKey(byte[] bArr) {
        this.publicKey = bArr;
        Util.checkLength(bArr, 32);
    }
}
