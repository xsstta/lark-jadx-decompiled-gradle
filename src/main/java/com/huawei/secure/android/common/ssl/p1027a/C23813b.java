package com.huawei.secure.android.common.ssl.p1027a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.huawei.secure.android.common.ssl.a.b */
public class C23813b {

    /* renamed from: a */
    private final String f58986a;

    /* renamed from: b */
    private final int f58987b;

    /* renamed from: c */
    private int f58988c;

    /* renamed from: d */
    private int f58989d;

    /* renamed from: e */
    private int f58990e;

    /* renamed from: f */
    private int f58991f;

    /* renamed from: g */
    private char[] f58992g;

    /* renamed from: b */
    private String m87037b() {
        int i = this.f58988c + 1;
        this.f58988c = i;
        this.f58989d = i;
        this.f58990e = i;
        while (true) {
            int i2 = this.f58988c;
            if (i2 != this.f58987b) {
                char[] cArr = this.f58992g;
                if (cArr[i2] == '\"') {
                    this.f58988c = i2 + 1;
                    while (true) {
                        int i3 = this.f58988c;
                        if (i3 >= this.f58987b || this.f58992g[i3] != ' ') {
                            char[] cArr2 = this.f58992g;
                            int i4 = this.f58989d;
                        } else {
                            this.f58988c = i3 + 1;
                        }
                    }
                    char[] cArr22 = this.f58992g;
                    int i42 = this.f58989d;
                    return new String(cArr22, i42, this.f58990e - i42);
                }
                if (cArr[i2] == '\\') {
                    cArr[this.f58990e] = m87040e();
                } else {
                    cArr[this.f58990e] = cArr[i2];
                }
                this.f58988c++;
                this.f58990e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f58986a);
            }
        }
    }

    /* renamed from: e */
    private char m87040e() {
        int i = this.f58988c + 1;
        this.f58988c = i;
        if (i != this.f58987b) {
            char[] cArr = this.f58992g;
            char c = cArr[i];
            if (!(c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#')) {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return m87041f();
                        }
                }
            }
            return cArr[i];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f58986a);
    }

    /* renamed from: f */
    private char m87041f() {
        int i;
        int i2;
        int a = m87035a(this.f58988c);
        this.f58988c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        if (a <= 223) {
            i2 = a & 31;
            i = 1;
        } else if (a <= 239) {
            i = 2;
            i2 = a & 15;
        } else {
            i = 3;
            i2 = a & 7;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.f58988c + 1;
            this.f58988c = i4;
            if (i4 == this.f58987b || this.f58992g[i4] != '\\') {
                return '?';
            }
            int i5 = i4 + 1;
            this.f58988c = i5;
            int a2 = m87035a(i5);
            this.f58988c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    /* renamed from: c */
    private String m87038c() {
        int i;
        int i2 = this.f58988c;
        if (i2 + 4 < this.f58987b) {
            this.f58989d = i2;
            this.f58988c = i2 + 1;
            while (true) {
                i = this.f58988c;
                if (i == this.f58987b) {
                    break;
                }
                char[] cArr = this.f58992g;
                if (cArr[i] == '+' || cArr[i] == ',' || cArr[i] == ';') {
                    break;
                } else if (cArr[i] == ' ') {
                    this.f58990e = i;
                    this.f58988c = i + 1;
                    while (true) {
                        int i3 = this.f58988c;
                        if (i3 >= this.f58987b || this.f58992g[i3] != ' ') {
                            break;
                        }
                        this.f58988c = i3 + 1;
                    }
                } else {
                    if (cArr[i] >= 'A' && cArr[i] <= 'F') {
                        cArr[i] = (char) (cArr[i] + ' ');
                    }
                    this.f58988c = i + 1;
                }
            }
            this.f58990e = i;
            int i4 = this.f58990e;
            int i5 = this.f58989d;
            int i6 = i4 - i5;
            if (i6 < 5 || (i6 & 1) == 0) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f58986a);
            }
            int i7 = i6 / 2;
            byte[] bArr = new byte[i7];
            int i8 = i5 + 1;
            for (int i9 = 0; i9 < i7; i9++) {
                bArr[i9] = (byte) m87035a(i8);
                i8 += 2;
            }
            return new String(this.f58992g, this.f58989d, i6);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f58986a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r1 = r8.f58992g;
        r2 = r8.f58989d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        return new java.lang.String(r1, r2, r8.f58991f - r2);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m87039d() {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.ssl.p1027a.C23813b.m87039d():java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m87036a() {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.ssl.p1027a.C23813b.m87036a():java.lang.String");
    }

    public C23813b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f58986a = name;
        this.f58987b = name.length();
    }

    /* renamed from: a */
    private int m87035a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 < this.f58987b) {
            char[] cArr = this.f58992g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f58986a);
            } else {
                i2 = c - '7';
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f58986a);
            } else {
                i3 = c2 - '7';
            }
            return (i2 << 4) + i3;
        }
        throw new IllegalStateException("Malformed DN: " + this.f58986a);
    }

    /* renamed from: a */
    public List<String> mo85528a(String str) {
        String str2;
        this.f58988c = 0;
        this.f58989d = 0;
        this.f58990e = 0;
        this.f58991f = 0;
        this.f58992g = this.f58986a.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String a = m87036a();
        if (a == null) {
            return emptyList;
        }
        do {
            int i = this.f58988c;
            if (i < this.f58987b) {
                char c = this.f58992g[i];
                if (c == '\"') {
                    str2 = m87037b();
                } else if (c == '#') {
                    str2 = m87038c();
                } else if (c == '+' || c == ',' || c == ';') {
                    str2 = "";
                } else {
                    str2 = m87039d();
                }
                if (str.equalsIgnoreCase(a)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(str2);
                }
                int i2 = this.f58988c;
                if (i2 < this.f58987b) {
                    char[] cArr = this.f58992g;
                    if (cArr[i2] == ',' || cArr[i2] == ';' || cArr[i2] == '+') {
                        this.f58988c = i2 + 1;
                        a = m87036a();
                    } else {
                        throw new IllegalStateException("Malformed DN: " + this.f58986a);
                    }
                }
            }
            return emptyList;
        } while (a != null);
        throw new IllegalStateException("Malformed DN: " + this.f58986a);
    }
}
