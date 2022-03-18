package com.ss.android.lark.voip.service.impl.sodium.encoders;

public class Raw implements Encoder {
    @Override // com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder
    public byte[] decode(String str) {
        if (str != null) {
            return str.getBytes(CHARSET);
        }
        return null;
    }

    @Override // com.ss.android.lark.voip.service.impl.sodium.encoders.Encoder
    public String encode(byte[] bArr) {
        if (bArr != null) {
            return new String(bArr, CHARSET);
        }
        return null;
    }
}
