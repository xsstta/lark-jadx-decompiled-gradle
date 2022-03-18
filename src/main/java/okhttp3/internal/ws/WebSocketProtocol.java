package okhttp3.internal.ws;

import okio.ByteString;
import okio.C69694c;

public final class WebSocketProtocol {
    private WebSocketProtocol() {
        throw new AssertionError("No instances.");
    }

    static void validateCloseCode(int i) {
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage != null) {
            throw new IllegalArgumentException(closeCodeExceptionMessage);
        }
    }

    public static String acceptHeader(String str) {
        return ByteString.encodeUtf8(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
    }

    static String closeCodeExceptionMessage(int i) {
        if (i < 1000 || i >= 5000) {
            return "Code must be in range [1000,5000): " + i;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            return "Code " + i + " is reserved and may not be used.";
        }
    }

    static void toggleMask(C69694c.C69697a aVar, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f174122d;
            int i2 = aVar.f174123e;
            int i3 = aVar.f174124f;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
        } while (aVar.mo244576a() != -1);
    }
}
