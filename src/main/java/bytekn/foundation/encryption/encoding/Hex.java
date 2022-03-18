package bytekn.foundation.encryption.encoding;

import com.google.firebase.messaging.Constants;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fJ\u0011\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0011\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u001d"}, d2 = {"Lbytekn/foundation/encryption/encoding/Hex;", "", "()V", "DIGITS", "", "getDIGITS", "()Ljava/lang/String;", "DIGITS_LOWER", "getDIGITS_LOWER", "DIGITS_UPPER", "getDIGITS_UPPER", "decode", "", "str", "decodeHexDigit", "", C60375c.f150914a, "", "encode", "src", "encodeBase", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "digits", "encodeLower", "encodeUpper", "invoke", "v", "isHexDigit", "", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.a.b */
public final class Hex {

    /* renamed from: a */
    public static final Hex f5792a = new Hex();

    /* renamed from: b */
    private static final String f5793b = f5793b;

    /* renamed from: c */
    private static final String f5794c;

    /* renamed from: d */
    private static final String f5795d;

    private Hex() {
    }

    static {
        if (f5793b != 0) {
            String upperCase = f5793b.toUpperCase();
            Intrinsics.checkExpressionValueIsNotNull(upperCase, "(this as java.lang.String).toUpperCase()");
            f5794c = upperCase;
            if (f5793b != 0) {
                String lowerCase = f5793b.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                f5795d = lowerCase;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final String mo8685a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "src");
        return m7542a(bArr, f5795d);
    }

    /* renamed from: a */
    private final String m7542a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append(str.charAt((i >>> 4) & 15));
            sb.append(str.charAt((i >>> 0) & 15));
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
