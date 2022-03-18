package com.ss.android.lark.voip.service.impl.sodium.keys;

import com.ss.android.lark.voip.service.impl.sodium.NaCl;
import com.ss.android.lark.voip.service.impl.sodium.Sodium;
import com.ss.android.lark.voip.service.impl.sodium.crypto.Point;
import com.ss.android.lark.voip.service.impl.sodium.crypto.Util;
import com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder;

public class KeyPair {
    private byte[] publicKey;
    private final byte[] secretKey;
    private byte[] seed;

    public PrivateKey getPrivateKey() {
        return new PrivateKey(this.secretKey);
    }

    public PublicKey getPublicKey() {
        Point point = new Point();
        byte[] bArr = this.publicKey;
        if (bArr == null) {
            bArr = point.mult(this.secretKey).toBytes();
        }
        return new PublicKey(bArr);
    }

    public KeyPair() {
        NaCl.sodium();
        byte[] zeros = Util.zeros(32);
        this.secretKey = zeros;
        this.publicKey = Util.zeros(32);
        if (NaCl.isSoLoaded()) {
            byte[] zeros2 = Util.zeros(Sodium.crypto_kx_seedbytes());
            this.seed = zeros2;
            Sodium.randombytes(zeros2, Sodium.crypto_kx_seedbytes());
            NaCl.sodium();
            if (Sodium.crypto_kx_seed_keypair(this.publicKey, zeros, this.seed) != 0) {
                throw new RuntimeException("Failed to generate a key pair");
            }
        }
    }

    public KeyPair(byte[] bArr) {
        Util.checkLength(bArr, 32);
        this.seed = bArr;
        byte[] zeros = Util.zeros(32);
        this.secretKey = zeros;
        this.publicKey = Util.zeros(32);
        if (NaCl.isSoLoaded()) {
            NaCl.sodium();
            Util.isValid(Sodium.crypto_kx_seed_keypair(this.publicKey, zeros, bArr), "Failed to generate a key pair");
        }
    }

    public KeyPair(String str, Encoder encoder) {
        this(encoder.decode(str));
    }
}
