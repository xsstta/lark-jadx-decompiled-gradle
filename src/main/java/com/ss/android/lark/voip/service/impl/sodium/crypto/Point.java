package com.ss.android.lark.voip.service.impl.sodium.crypto;

import com.ss.android.lark.voip.service.impl.sodium.NaCl;
import com.ss.android.lark.voip.service.impl.sodium.Sodium;
import com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder;

public class Point {
    private final byte[] point;

    public byte[] toBytes() {
        return this.point;
    }

    public Point() {
        this.point = Encoder.HEX.decode("0900000000000000000000000000000000000000000000000000000000000000");
    }

    public String toString() {
        return Encoder.HEX.encode(this.point);
    }

    public Point(byte[] bArr) {
        this.point = bArr;
    }

    public Point mult(byte[] bArr) {
        byte[] zeros = Util.zeros(32);
        NaCl.sodium();
        Sodium.crypto_scalarmult_curve25519(zeros, bArr, this.point);
        return new Point(zeros);
    }

    public Point(String str, Encoder encoder) {
        this(encoder.decode(str));
    }

    public Point mult(String str, Encoder encoder) {
        return mult(encoder.decode(str));
    }
}
