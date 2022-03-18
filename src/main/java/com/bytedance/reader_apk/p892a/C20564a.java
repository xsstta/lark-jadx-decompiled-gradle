package com.bytedance.reader_apk.p892a;

import java.io.DataInput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.reader_apk.a.a */
public class C20564a {

    /* renamed from: a */
    static final byte[] f50137a = {108, 116, 108, 111, 118, 101, 122, 104};

    /* renamed from: a */
    private static short m74890a(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    /* renamed from: a */
    private static boolean m74891a(byte[] bArr) {
        if (bArr.length != f50137a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = f50137a;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[SYNTHETIC, Splitter:B:35:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009a A[SYNTHETIC, Splitter:B:57:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m74889a(java.io.File r7) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.reader_apk.p892a.C20564a.m74889a(java.io.File):java.lang.String");
    }
}
