package okhttp3.internal.http2;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.IOException;
import okhttp3.internal.Util;
import okio.ByteString;

public final class Http2 {
    static final String[] BINARY = new String[DynamicModule.f58006b];
    static final ByteString CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] FLAGS = new String[64];
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private Http2() {
    }

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = BINARY;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = Util.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = FLAGS;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = FLAGS;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = FLAGS;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = BINARY[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    static IllegalArgumentException illegalArgument(String str, Object... objArr) {
        throw new IllegalArgumentException(Util.format(str, objArr));
    }

    static IOException ioException(String str, Object... objArr) throws IOException {
        throw new IOException(Util.format(str, objArr));
    }

    static String formatFlags(byte b, byte b2) {
        String str;
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    return "ACK";
                }
                return BINARY[b2];
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = FLAGS;
                if (b2 < strArr.length) {
                    str = strArr[b2];
                } else {
                    str = BINARY[b2];
                }
                if (b == 5 && (b2 & 4) != 0) {
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
                if (b != 0 || (b2 & 32) == 0) {
                    return str;
                }
                return str.replace("PRIORITY", "COMPRESSED");
            }
        }
        return BINARY[b2];
    }

    static String frameLog(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String[] strArr = FRAME_NAMES;
        if (b < strArr.length) {
            str = strArr[b];
        } else {
            str = Util.format("0x%02x", Byte.valueOf(b));
        }
        String formatFlags = formatFlags(b, b2);
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = formatFlags;
        return Util.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}
