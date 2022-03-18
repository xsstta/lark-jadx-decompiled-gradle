package com.airbnb.lottie.parser.moshi;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huawei.hms.android.HwBuildEx;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import okio.AbstractC69699e;
import okio.ByteString;
import okio.C69694c;

/* access modifiers changed from: package-private */
/* renamed from: com.airbnb.lottie.parser.moshi.d */
public final class C1895d extends JsonReader {

    /* renamed from: g */
    private static final ByteString f6516g = ByteString.encodeUtf8("'\\");

    /* renamed from: h */
    private static final ByteString f6517h = ByteString.encodeUtf8("\"\\");

    /* renamed from: i */
    private static final ByteString f6518i = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: j */
    private static final ByteString f6519j = ByteString.encodeUtf8("\n\r");

    /* renamed from: k */
    private static final ByteString f6520k = ByteString.encodeUtf8("*/");

    /* renamed from: l */
    private final AbstractC69699e f6521l;

    /* renamed from: m */
    private final C69694c f6522m;

    /* renamed from: n */
    private int f6523n;

    /* renamed from: o */
    private long f6524o;

    /* renamed from: p */
    private int f6525p;

    /* renamed from: q */
    private String f6526q;

    /* renamed from: t */
    private void m8486t() throws IOException {
        if (!this.f6512e) {
            throw mo9322a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: r */
    private String m8484r() throws IOException {
        long indexOfElement = this.f6521l.indexOfElement(f6518i);
        if (indexOfElement != -1) {
            return this.f6522m.readUtf8(indexOfElement);
        }
        return this.f6522m.mo244546f();
    }

    /* renamed from: s */
    private void m8485s() throws IOException {
        long indexOfElement = this.f6521l.indexOfElement(f6518i);
        C69694c cVar = this.f6522m;
        if (indexOfElement == -1) {
            indexOfElement = cVar.mo244510a();
        }
        cVar.skip(indexOfElement);
    }

    /* renamed from: u */
    private void m8487u() throws IOException {
        long j;
        long indexOfElement = this.f6521l.indexOfElement(f6519j);
        C69694c cVar = this.f6522m;
        if (indexOfElement != -1) {
            j = indexOfElement + 1;
        } else {
            j = cVar.mo244510a();
        }
        cVar.skip(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6523n = 0;
        this.f6509b[0] = 8;
        this.f6508a = 1;
        this.f6522m.mo244551g();
        this.f6521l.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: e */
    public boolean mo9328e() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 2 || i == 4 || i == 18) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "JsonReader(" + this.f6521l + ")";
    }

    /* renamed from: v */
    private boolean m8488v() throws IOException {
        boolean z;
        long j;
        AbstractC69699e eVar = this.f6521l;
        ByteString byteString = f6520k;
        long indexOf = eVar.indexOf(byteString);
        if (indexOf != -1) {
            z = true;
        } else {
            z = false;
        }
        C69694c cVar = this.f6522m;
        if (z) {
            j = indexOf + ((long) byteString.size());
        } else {
            j = cVar.mo244510a();
        }
        cVar.skip(j);
        return z;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: c */
    public void mo9326c() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 1) {
            mo9324a(3);
            this.f6523n = 0;
            return;
        }
        throw new C1892a("Expected BEGIN_OBJECT but was " + mo9329f() + " at path " + mo9337n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: d */
    public void mo9327d() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 2) {
            this.f6508a--;
            this.f6510c[this.f6508a] = null;
            int[] iArr = this.f6511d;
            int i2 = this.f6508a - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6523n = 0;
            return;
        }
        throw new C1892a("Expected END_OBJECT but was " + mo9329f() + " at path " + mo9337n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: f */
    public JsonReader.Token mo9329f() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: g */
    public String mo9330g() throws IOException {
        String str;
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 14) {
            str = m8484r();
        } else if (i == 13) {
            str = m8478a(f6517h);
        } else if (i == 12) {
            str = m8478a(f6516g);
        } else if (i == 15) {
            str = this.f6526q;
        } else {
            throw new C1892a("Expected a name but was " + mo9329f() + " at path " + mo9337n());
        }
        this.f6523n = 0;
        this.f6510c[this.f6508a - 1] = str;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: i */
    public String mo9332i() throws IOException {
        String str;
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 10) {
            str = m8484r();
        } else if (i == 9) {
            str = m8478a(f6517h);
        } else if (i == 8) {
            str = m8478a(f6516g);
        } else if (i == 11) {
            str = this.f6526q;
            this.f6526q = null;
        } else if (i == 16) {
            str = Long.toString(this.f6524o);
        } else if (i == 17) {
            str = this.f6522m.readUtf8((long) this.f6525p);
        } else {
            throw new C1892a("Expected a string but was " + mo9329f() + " at path " + mo9337n());
        }
        this.f6523n = 0;
        int[] iArr = this.f6511d;
        int i2 = this.f6508a - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: j */
    public boolean mo9333j() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 5) {
            this.f6523n = 0;
            int[] iArr = this.f6511d;
            int i2 = this.f6508a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f6523n = 0;
            int[] iArr2 = this.f6511d;
            int i3 = this.f6508a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C1892a("Expected a boolean but was " + mo9329f() + " at path " + mo9337n());
        }
    }

    /* renamed from: p */
    private int m8482p() throws IOException {
        String str;
        String str2;
        int i;
        byte a = this.f6522m.mo244508a(0L);
        if (a == 116 || a == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (a == 102 || a == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (a != 110 && a != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f6521l.request((long) i3)) {
                return 0;
            }
            byte a2 = this.f6522m.mo244508a((long) i2);
            if (a2 != str2.charAt(i2) && a2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f6521l.request((long) (length + 1)) && m8480b(this.f6522m.mo244508a((long) length))) {
            return 0;
        }
        this.f6522m.skip((long) length);
        this.f6523n = i;
        return i;
    }

    /* renamed from: q */
    private int m8483q() throws IOException {
        byte a;
        boolean z;
        char c = 1;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c2 = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f6521l.request((long) i3)) {
                break;
            }
            a = this.f6522m.mo244508a((long) i2);
            if (a != 43) {
                if (a != 69 && a != 101) {
                    if (a != 45) {
                        if (a != 46) {
                            if (a >= 48 && a <= 57) {
                                if (c2 == c || c2 == 0) {
                                    j = (long) (-(a - 48));
                                    i = 0;
                                    c2 = 2;
                                } else {
                                    if (c2 == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (a - 48));
                                        int i4 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        if (i4 > 0 || (i4 == 0 && j2 < j)) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        z2 &= z;
                                        j = j2;
                                    } else if (c2 == 3) {
                                        i = 0;
                                        c2 = 4;
                                    } else if (c2 == 5 || c2 == 6) {
                                        i = 0;
                                        c2 = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c2 != 2) {
                            return i;
                        } else {
                            c2 = 3;
                        }
                    } else if (c2 == 0) {
                        c2 = 1;
                        z3 = true;
                    } else if (c2 != 5) {
                        return i;
                    }
                    i2 = i3;
                    c = 1;
                } else if (c2 != 2 && c2 != 4) {
                    return i;
                } else {
                    c2 = 5;
                    i2 = i3;
                    c = 1;
                }
            } else if (c2 != 5) {
                return i;
            }
            c2 = 6;
            i2 = i3;
            c = 1;
        }
        if (m8480b(a)) {
            return 0;
        }
        if (c2 == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f6524o = j;
            this.f6522m.skip((long) i2);
            this.f6523n = 16;
            return 16;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f6525p = i2;
            this.f6523n = 17;
            return 17;
        }
    }

    /* renamed from: w */
    private char m8489w() throws IOException {
        int i;
        int i2;
        if (this.f6521l.request(1)) {
            byte readByte = this.f6522m.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return '\b';
            }
            if (readByte == 102) {
                return '\f';
            }
            if (readByte == 110) {
                return '\n';
            }
            if (readByte == 114) {
                return '\r';
            }
            if (readByte == 116) {
                return '\t';
            }
            if (readByte != 117) {
                if (this.f6512e) {
                    return (char) readByte;
                }
                throw mo9322a("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f6521l.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte a = this.f6522m.mo244508a((long) i3);
                    char c2 = (char) (c << 4);
                    if (a < 48 || a > 57) {
                        if (a >= 97 && a <= 102) {
                            i = a - 97;
                        } else if (a < 65 || a > 70) {
                            throw mo9322a("\\u" + this.f6522m.readUtf8(4));
                        } else {
                            i = a - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = a - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f6522m.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo9337n());
            }
        } else {
            throw mo9322a("Unterminated escape sequence");
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: b */
    public void mo9325b() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 4) {
            this.f6508a--;
            int[] iArr = this.f6511d;
            int i2 = this.f6508a - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f6523n = 0;
            return;
        }
        throw new C1892a("Expected END_ARRAY but was " + mo9329f() + " at path " + mo9337n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: h */
    public void mo9331h() throws IOException {
        if (!this.f6513f) {
            int i = this.f6523n;
            if (i == 0) {
                i = m8481o();
            }
            if (i == 14) {
                m8485s();
            } else if (i == 13) {
                m8479b(f6517h);
            } else if (i == 12) {
                m8479b(f6516g);
            } else if (i != 15) {
                throw new C1892a("Expected a name but was " + mo9329f() + " at path " + mo9337n());
            }
            this.f6523n = 0;
            this.f6510c[this.f6508a - 1] = "null";
            return;
        }
        throw new C1892a("Cannot skip unexpected " + mo9329f() + " at " + mo9337n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: k */
    public double mo9334k() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 16) {
            this.f6523n = 0;
            int[] iArr = this.f6511d;
            int i2 = this.f6508a - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f6524o;
        }
        if (i == 17) {
            this.f6526q = this.f6522m.readUtf8((long) this.f6525p);
        } else if (i == 9) {
            this.f6526q = m8478a(f6517h);
        } else if (i == 8) {
            this.f6526q = m8478a(f6516g);
        } else if (i == 10) {
            this.f6526q = m8484r();
        } else if (i != 11) {
            throw new C1892a("Expected a double but was " + mo9329f() + " at path " + mo9337n());
        }
        this.f6523n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6526q);
            if (this.f6512e || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f6526q = null;
                this.f6523n = 0;
                int[] iArr2 = this.f6511d;
                int i3 = this.f6508a - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new C1893b("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo9337n());
        } catch (NumberFormatException unused) {
            throw new C1892a("Expected a double but was " + this.f6526q + " at path " + mo9337n());
        }
    }

    /* renamed from: o */
    private int m8481o() throws IOException {
        int i = this.f6509b[this.f6508a - 1];
        if (i == 1) {
            this.f6509b[this.f6508a - 1] = 2;
        } else if (i == 2) {
            int a = m8477a(true);
            this.f6522m.readByte();
            if (a != 44) {
                if (a == 59) {
                    m8486t();
                } else if (a == 93) {
                    this.f6523n = 4;
                    return 4;
                } else {
                    throw mo9322a("Unterminated array");
                }
            }
        } else if (i == 3 || i == 5) {
            this.f6509b[this.f6508a - 1] = 4;
            if (i == 5) {
                int a2 = m8477a(true);
                this.f6522m.readByte();
                if (a2 != 44) {
                    if (a2 == 59) {
                        m8486t();
                    } else if (a2 == 125) {
                        this.f6523n = 2;
                        return 2;
                    } else {
                        throw mo9322a("Unterminated object");
                    }
                }
            }
            int a3 = m8477a(true);
            if (a3 == 34) {
                this.f6522m.readByte();
                this.f6523n = 13;
                return 13;
            } else if (a3 == 39) {
                this.f6522m.readByte();
                m8486t();
                this.f6523n = 12;
                return 12;
            } else if (a3 != 125) {
                m8486t();
                if (m8480b((char) a3)) {
                    this.f6523n = 14;
                    return 14;
                }
                throw mo9322a("Expected name");
            } else if (i != 5) {
                this.f6522m.readByte();
                this.f6523n = 2;
                return 2;
            } else {
                throw mo9322a("Expected name");
            }
        } else if (i == 4) {
            this.f6509b[this.f6508a - 1] = 5;
            int a4 = m8477a(true);
            this.f6522m.readByte();
            if (a4 != 58) {
                if (a4 == 61) {
                    m8486t();
                    if (this.f6521l.request(1) && this.f6522m.mo244508a(0L) == 62) {
                        this.f6522m.readByte();
                    }
                } else {
                    throw mo9322a("Expected ':'");
                }
            }
        } else if (i == 6) {
            this.f6509b[this.f6508a - 1] = 7;
        } else if (i == 7) {
            if (m8477a(false) == -1) {
                this.f6523n = 18;
                return 18;
            }
            m8486t();
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m8477a(true);
        if (a5 == 34) {
            this.f6522m.readByte();
            this.f6523n = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f6522m.readByte();
                    this.f6523n = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        int p = m8482p();
                        if (p != 0) {
                            return p;
                        }
                        int q = m8483q();
                        if (q != 0) {
                            return q;
                        }
                        if (m8480b(this.f6522m.mo244508a(0L))) {
                            m8486t();
                            this.f6523n = 10;
                            return 10;
                        }
                        throw mo9322a("Expected value");
                    }
                    this.f6522m.readByte();
                    this.f6523n = 1;
                    return 1;
                } else if (i == 1) {
                    this.f6522m.readByte();
                    this.f6523n = 4;
                    return 4;
                }
            }
            if (i == 1 || i == 2) {
                m8486t();
                this.f6523n = 7;
                return 7;
            }
            throw mo9322a("Unexpected value");
        } else {
            m8486t();
            this.f6522m.readByte();
            this.f6523n = 8;
            return 8;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: l */
    public int mo9335l() throws IOException {
        String str;
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 16) {
            long j = this.f6524o;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f6523n = 0;
                int[] iArr = this.f6511d;
                int i3 = this.f6508a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C1892a("Expected an int but was " + this.f6524o + " at path " + mo9337n());
        }
        if (i == 17) {
            this.f6526q = this.f6522m.readUtf8((long) this.f6525p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m8478a(f6517h);
            } else {
                str = m8478a(f6516g);
            }
            this.f6526q = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f6523n = 0;
                int[] iArr2 = this.f6511d;
                int i4 = this.f6508a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C1892a("Expected an int but was " + mo9329f() + " at path " + mo9337n());
        }
        this.f6523n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f6526q);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f6526q = null;
                this.f6523n = 0;
                int[] iArr3 = this.f6511d;
                int i6 = this.f6508a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C1892a("Expected an int but was " + this.f6526q + " at path " + mo9337n());
        } catch (NumberFormatException unused2) {
            throw new C1892a("Expected an int but was " + this.f6526q + " at path " + mo9337n());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: m */
    public void mo9336m() throws IOException {
        if (!this.f6513f) {
            int i = 0;
            do {
                int i2 = this.f6523n;
                if (i2 == 0) {
                    i2 = m8481o();
                }
                if (i2 == 3) {
                    mo9324a(1);
                } else if (i2 == 1) {
                    mo9324a(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f6508a--;
                        } else {
                            throw new C1892a("Expected a value but was " + mo9329f() + " at path " + mo9337n());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f6508a--;
                        } else {
                            throw new C1892a("Expected a value but was " + mo9329f() + " at path " + mo9337n());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m8485s();
                    } else if (i2 == 9 || i2 == 13) {
                        m8479b(f6517h);
                    } else if (i2 == 8 || i2 == 12) {
                        m8479b(f6516g);
                    } else if (i2 == 17) {
                        this.f6522m.skip((long) this.f6525p);
                    } else if (i2 == 18) {
                        throw new C1892a("Expected a value but was " + mo9329f() + " at path " + mo9337n());
                    }
                    this.f6523n = 0;
                }
                i++;
                this.f6523n = 0;
            } while (i != 0);
            int[] iArr = this.f6511d;
            int i3 = this.f6508a - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f6510c[this.f6508a - 1] = "null";
            return;
        }
        throw new C1892a("Cannot skip unexpected " + mo9329f() + " at " + mo9337n());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: a */
    public void mo9323a() throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i == 3) {
            mo9324a(1);
            this.f6511d[this.f6508a - 1] = 0;
            this.f6523n = 0;
            return;
        }
        throw new C1892a("Expected BEGIN_ARRAY but was " + mo9329f() + " at path " + mo9337n());
    }

    C1895d(AbstractC69699e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        this.f6521l = eVar;
        this.f6522m = eVar.getBuffer();
        mo9324a(6);
    }

    /* renamed from: b */
    private void m8479b(ByteString byteString) throws IOException {
        while (true) {
            long indexOfElement = this.f6521l.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw mo9322a("Unterminated string");
            } else if (this.f6522m.mo244508a(indexOfElement) == 92) {
                this.f6522m.skip(indexOfElement + 1);
                m8489w();
            } else {
                this.f6522m.skip(indexOfElement + 1);
                return;
            }
        }
    }

    /* renamed from: a */
    private String m8478a(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long indexOfElement = this.f6521l.indexOfElement(byteString);
            if (indexOfElement == -1) {
                throw mo9322a("Unterminated string");
            } else if (this.f6522m.mo244508a(indexOfElement) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f6522m.readUtf8(indexOfElement));
                this.f6522m.readByte();
                sb.append(m8489w());
            } else if (sb == null) {
                String readUtf8 = this.f6522m.readUtf8(indexOfElement);
                this.f6522m.readByte();
                return readUtf8;
            } else {
                sb.append(this.f6522m.readUtf8(indexOfElement));
                this.f6522m.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    private boolean m8480b(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m8486t();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f6522m.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f6521l.request(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m8486t();
        r3 = r6.f6522m.mo244508a(1L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f6522m.readByte();
        r6.f6522m.readByte();
        m8487u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f6522m.readByte();
        r6.f6522m.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m8488v() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw mo9322a("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m8486t();
        m8487u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m8477a(boolean r7) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.C1895d.m8477a(boolean):int");
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    /* renamed from: a */
    public int mo9321a(JsonReader.C1891a aVar) throws IOException {
        int i = this.f6523n;
        if (i == 0) {
            i = m8481o();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m8476a(this.f6526q, aVar);
        }
        int select = this.f6521l.select(aVar.f6515b);
        if (select != -1) {
            this.f6523n = 0;
            this.f6510c[this.f6508a - 1] = aVar.f6514a[select];
            return select;
        }
        String str = this.f6510c[this.f6508a - 1];
        String g = mo9330g();
        int a = m8476a(g, aVar);
        if (a == -1) {
            this.f6523n = 15;
            this.f6526q = g;
            this.f6510c[this.f6508a - 1] = str;
        }
        return a;
    }

    /* renamed from: a */
    private int m8476a(String str, JsonReader.C1891a aVar) {
        int length = aVar.f6514a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f6514a[i])) {
                this.f6523n = 0;
                this.f6510c[this.f6508a - 1] = str;
                return i;
            }
        }
        return -1;
    }
}
