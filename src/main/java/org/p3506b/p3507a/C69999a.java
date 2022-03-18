package org.p3506b.p3507a;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.Reader;
import java.util.Hashtable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: org.b.a.a */
public class C69999a implements XmlPullParser {

    /* renamed from: A */
    private String[] f174920A;

    /* renamed from: B */
    private int f174921B;

    /* renamed from: C */
    private String f174922C;

    /* renamed from: D */
    private int[] f174923D;

    /* renamed from: E */
    private int f174924E;

    /* renamed from: F */
    private boolean f174925F;

    /* renamed from: G */
    private boolean f174926G;

    /* renamed from: H */
    private boolean f174927H;

    /* renamed from: a */
    private Object f174928a;

    /* renamed from: b */
    private String f174929b;

    /* renamed from: c */
    private Boolean f174930c;

    /* renamed from: d */
    private boolean f174931d;

    /* renamed from: e */
    private boolean f174932e;

    /* renamed from: f */
    private Hashtable f174933f;

    /* renamed from: g */
    private int f174934g;

    /* renamed from: h */
    private String[] f174935h = new String[16];

    /* renamed from: i */
    private String[] f174936i = new String[8];

    /* renamed from: j */
    private int[] f174937j = new int[4];

    /* renamed from: k */
    private Reader f174938k;

    /* renamed from: l */
    private String f174939l;

    /* renamed from: m */
    private char[] f174940m;

    /* renamed from: n */
    private int f174941n;

    /* renamed from: o */
    private int f174942o;

    /* renamed from: p */
    private int f174943p;

    /* renamed from: q */
    private int f174944q;

    /* renamed from: r */
    private char[] f174945r;

    /* renamed from: s */
    private int f174946s;

    /* renamed from: t */
    private int f174947t;

    /* renamed from: u */
    private boolean f174948u;

    /* renamed from: v */
    private String f174949v;

    /* renamed from: w */
    private String f174950w;

    /* renamed from: x */
    private String f174951x;

    /* renamed from: y */
    private boolean f174952y;

    /* renamed from: z */
    private int f174953z;

    public C69999a() {
        int i = SmActions.ACTION_ONTHECALL_EXIT;
        this.f174945r = new char[SmActions.ACTION_ONTHECALL_EXIT];
        this.f174920A = new String[16];
        this.f174923D = new int[2];
        this.f174940m = new char[(Runtime.getRuntime().freeMemory() >= 1048576 ? 8192 : i)];
    }

    /* renamed from: a */
    private final int m268467a(boolean z) throws IOException, XmlPullParserException {
        String str;
        int i;
        int i2;
        String str2;
        Boolean bool;
        m268484f();
        int f = m268484f();
        if (f == 63) {
            if ((m268482d(0) == 120 || m268482d(0) == 88) && (m268482d(1) == 109 || m268482d(1) == 77)) {
                if (z) {
                    m268478c(m268482d(0));
                    m268478c(m268482d(1));
                }
                m268484f();
                m268484f();
                if ((m268482d(0) == 108 || m268482d(0) == 76) && m268482d(1) <= 32) {
                    if (this.f174943p != 1 || this.f174944q > 4) {
                        m268475b("PI must not start with xml");
                    }
                    m268480c(true);
                    int i3 = 2;
                    if (this.f174953z < 1 || !HiAnalyticsConstant.HaKey.BI_KEY_VERSION.equals(this.f174920A[2])) {
                        m268475b("version expected");
                    }
                    String[] strArr = this.f174920A;
                    this.f174929b = strArr[3];
                    if (1 >= this.f174953z || !"encoding".equals(strArr[6])) {
                        i3 = 1;
                    } else {
                        this.f174939l = this.f174920A[7];
                    }
                    if (i3 < this.f174953z) {
                        int i4 = i3 * 4;
                        if ("standalone".equals(this.f174920A[i4 + 2])) {
                            String str3 = this.f174920A[i4 + 3];
                            if ("yes".equals(str3)) {
                                bool = new Boolean(true);
                            } else if ("no".equals(str3)) {
                                bool = new Boolean(false);
                            } else {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("illegal standalone value: ");
                                stringBuffer.append(str3);
                                m268475b(stringBuffer.toString());
                                i3++;
                            }
                            this.f174930c = bool;
                            i3++;
                        }
                    }
                    if (i3 != this.f174953z) {
                        m268475b("illegal xmldecl");
                    }
                    this.f174948u = true;
                    this.f174946s = 0;
                    return 998;
                }
            }
            str2 = "";
            i2 = 63;
            i = 8;
        } else if (f != 33) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("illegal: <");
            stringBuffer2.append(f);
            str = stringBuffer2.toString();
            m268475b(str);
            return 9;
        } else if (m268482d(0) == 45) {
            str2 = "--";
            i2 = 45;
            i = 9;
        } else if (m268482d(0) == 91) {
            str2 = "[CDATA[";
            z = true;
            i2 = 93;
            i = 5;
        } else {
            str2 = "DOCTYPE";
            i2 = -1;
            i = 10;
        }
        for (int i5 = 0; i5 < str2.length(); i5++) {
            m268468a(str2.charAt(i5));
        }
        if (i == 10) {
            m268476b(z);
        } else {
            int i6 = 0;
            while (true) {
                int f2 = m268484f();
                if (f2 == -1) {
                    str = "Unexpected EOF";
                    break;
                }
                if (z) {
                    m268478c(f2);
                }
                if ((i2 == 63 || f2 == i2) && m268482d(0) == i2 && m268482d(1) == 62) {
                    if (i2 == 45 && i6 == 45) {
                        m268475b("illegal comment delimiter: --->");
                    }
                    m268484f();
                    m268484f();
                    if (z && i2 != 63) {
                        this.f174946s--;
                    }
                } else {
                    i6 = f2;
                }
            }
            m268475b(str);
            return 9;
        }
        return i;
    }

    /* renamed from: a */
    private final void m268468a(char c) throws IOException, XmlPullParserException {
        int f = m268484f();
        if (f != c) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: '");
            stringBuffer.append(c);
            stringBuffer.append("' actual: '");
            stringBuffer.append((char) f);
            stringBuffer.append("'");
            m268475b(stringBuffer.toString());
        }
    }

    /* renamed from: a */
    private final void m268469a(int i, boolean z) throws IOException, XmlPullParserException {
        int d = m268482d(0);
        int i2 = 0;
        while (d != -1 && d != i) {
            int i3 = 32;
            if (i != 32 || (d > 32 && d != 62)) {
                if (d != 38) {
                    if (d == 10 && this.f174947t == 2) {
                        m268484f();
                    } else {
                        i3 = m268484f();
                    }
                    m268478c(i3);
                } else if (z) {
                    m268483e();
                } else {
                    return;
                }
                if (d == 62 && i2 >= 2 && i != 93) {
                    m268475b("Illegal: ]]>");
                }
                i2 = d == 93 ? i2 + 1 : 0;
                d = m268482d(0);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final boolean m268470a() throws XmlPullParserException {
        int i;
        String str;
        int i2 = 0;
        boolean z = false;
        while (true) {
            i = this.f174953z;
            if (i2 >= (i << 2)) {
                break;
            }
            String str2 = this.f174920A[i2 + 2];
            int indexOf = str2.indexOf(58);
            if (indexOf != -1) {
                String substring = str2.substring(0, indexOf);
                str = str2.substring(indexOf + 1);
                str2 = substring;
            } else if (str2.equals("xmlns")) {
                str = null;
            } else {
                i2 += 4;
            }
            if (!str2.equals("xmlns")) {
                z = true;
            } else {
                int[] iArr = this.f174937j;
                int i3 = this.f174934g;
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                int i5 = i4 << 1;
                String[] a = m268472a(this.f174936i, i5 + 2);
                this.f174936i = a;
                a[i5] = str;
                String[] strArr = this.f174920A;
                int i6 = i2 + 3;
                a[i5 + 1] = strArr[i6];
                if (str != null && strArr[i6].equals("")) {
                    m268475b("illegal empty namespace");
                }
                String[] strArr2 = this.f174920A;
                int i7 = this.f174953z - 1;
                this.f174953z = i7;
                System.arraycopy(strArr2, i2 + 4, strArr2, i2, (i7 << 2) - i2);
                i2 -= 4;
            }
            i2 += 4;
        }
        if (z) {
            for (int i8 = (i << 2) - 4; i8 >= 0; i8 -= 4) {
                int i9 = i8 + 2;
                String str3 = this.f174920A[i9];
                int indexOf2 = str3.indexOf(58);
                if (indexOf2 != 0 || this.f174932e) {
                    if (indexOf2 != -1) {
                        String substring2 = str3.substring(0, indexOf2);
                        String substring3 = str3.substring(indexOf2 + 1);
                        String a2 = mo246327a(substring2);
                        if (a2 != null || this.f174932e) {
                            String[] strArr3 = this.f174920A;
                            strArr3[i8] = a2;
                            strArr3[i8 + 1] = substring2;
                            strArr3[i9] = substring3;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Undefined Prefix: ");
                            stringBuffer.append(substring2);
                            stringBuffer.append(" in ");
                            stringBuffer.append(this);
                            throw new RuntimeException(stringBuffer.toString());
                        }
                    }
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("illegal attribute name: ");
                    stringBuffer2.append(str3);
                    stringBuffer2.append(" at ");
                    stringBuffer2.append(this);
                    throw new RuntimeException(stringBuffer2.toString());
                }
            }
        }
        int indexOf3 = this.f174951x.indexOf(58);
        if (indexOf3 == 0) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("illegal tag name: ");
            stringBuffer3.append(this.f174951x);
            m268475b(stringBuffer3.toString());
        }
        if (indexOf3 != -1) {
            this.f174950w = this.f174951x.substring(0, indexOf3);
            this.f174951x = this.f174951x.substring(indexOf3 + 1);
        }
        String a3 = mo246327a(this.f174950w);
        this.f174949v = a3;
        if (a3 == null) {
            if (this.f174950w != null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("undefined prefix: ");
                stringBuffer4.append(this.f174950w);
                m268475b(stringBuffer4.toString());
            }
            this.f174949v = "";
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m268471a(String str, boolean z, String str2) {
        if (!str.startsWith("http://xmlpull.org/v1/doc/")) {
            return false;
        }
        return str.substring(z ? 42 : 40).equals(str2);
    }

    /* renamed from: a */
    private final String[] m268472a(String[] strArr, int i) {
        if (strArr.length >= i) {
            return strArr;
        }
        String[] strArr2 = new String[(i + 16)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    /* renamed from: b */
    private final String m268473b(int i) {
        return new String(this.f174945r, i, this.f174946s - i);
    }

    /* renamed from: b */
    private final void m268474b() throws IOException, XmlPullParserException {
        int a;
        if (this.f174938k == null) {
            m268479c("No Input specified");
        }
        if (this.f174947t == 3) {
            this.f174934g--;
        }
        do {
            this.f174953z = -1;
            if (this.f174952y) {
                this.f174952y = false;
                this.f174947t = 3;
                return;
            } else if (this.f174922C != null) {
                for (int i = 0; i < this.f174922C.length(); i++) {
                    m268478c(this.f174922C.charAt(i));
                }
                this.f174922C = null;
                this.f174947t = 9;
                return;
            } else if (!this.f174932e || (this.f174921B <= 0 && (m268482d(0) != -1 || this.f174934g <= 0))) {
                this.f174950w = null;
                this.f174951x = null;
                this.f174949v = null;
                int d = m268481d();
                this.f174947t = d;
                if (d == 1) {
                    return;
                }
                if (d == 2) {
                    m268480c(false);
                    return;
                } else if (d == 3) {
                    m268477c();
                    return;
                } else if (d == 4) {
                    m268469a(60, !this.f174927H);
                    if (this.f174934g == 0 && this.f174948u) {
                        this.f174947t = 7;
                        return;
                    }
                    return;
                } else if (d != 6) {
                    a = m268467a(this.f174927H);
                    this.f174947t = a;
                } else {
                    m268483e();
                    return;
                }
            } else {
                int i2 = (this.f174934g - 1) << 2;
                this.f174947t = 3;
                String[] strArr = this.f174935h;
                this.f174949v = strArr[i2];
                this.f174950w = strArr[i2 + 1];
                this.f174951x = strArr[i2 + 2];
                if (this.f174921B != 1) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("missing end tag /");
                    stringBuffer.append(this.f174951x);
                    stringBuffer.append(" inserted");
                    this.f174922C = stringBuffer.toString();
                }
                int i3 = this.f174921B;
                if (i3 > 0) {
                    this.f174921B = i3 - 1;
                    return;
                }
                return;
            }
        } while (a == 998);
    }

    /* renamed from: b */
    private final void m268475b(String str) throws XmlPullParserException {
        if (!this.f174932e) {
            m268479c(str);
        } else if (this.f174922C == null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ERR: ");
            stringBuffer.append(str);
            this.f174922C = stringBuffer.toString();
        }
    }

    /* renamed from: b */
    private final void m268476b(boolean z) throws IOException, XmlPullParserException {
        int i = 1;
        boolean z2 = false;
        while (true) {
            int f = m268484f();
            if (f != -1) {
                if (f == 39) {
                    z2 = !z2;
                } else if (f != 60) {
                    if (f == 62 && !z2 && i - 1 == 0) {
                        return;
                    }
                } else if (!z2) {
                    i++;
                }
                if (z) {
                    m268478c(f);
                }
            } else {
                m268475b("Unexpected EOF");
                return;
            }
        }
    }

    /* renamed from: c */
    private final void m268477c() throws IOException, XmlPullParserException {
        m268484f();
        m268484f();
        this.f174951x = m268485g();
        m268486h();
        m268468a('>');
        int i = this.f174934g;
        int i2 = (i - 1) << 2;
        if (i == 0) {
            m268475b("element stack empty");
            this.f174947t = 9;
            return;
        }
        int i3 = i2 + 3;
        if (!this.f174951x.equals(this.f174935h[i3])) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: /");
            stringBuffer.append(this.f174935h[i3]);
            stringBuffer.append(" read: ");
            stringBuffer.append(this.f174951x);
            m268475b(stringBuffer.toString());
            int i4 = i2;
            while (i4 >= 0 && !this.f174951x.toLowerCase().equals(this.f174935h[i4 + 3].toLowerCase())) {
                this.f174921B++;
                i4 -= 4;
            }
            if (i4 < 0) {
                this.f174921B = 0;
                this.f174947t = 9;
                return;
            }
        }
        String[] strArr = this.f174935h;
        this.f174949v = strArr[i2];
        this.f174950w = strArr[i2 + 1];
        this.f174951x = strArr[i2 + 2];
    }

    /* renamed from: c */
    private final void m268478c(int i) {
        this.f174948u &= i <= 32;
        int i2 = this.f174946s;
        char[] cArr = this.f174945r;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[(((i2 * 4) / 3) + 4)];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.f174945r = cArr2;
        }
        char[] cArr3 = this.f174945r;
        int i3 = this.f174946s;
        this.f174946s = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* renamed from: c */
    private final void m268479c(String str) throws XmlPullParserException {
        if (str.length() >= 100) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 100));
            stringBuffer.append("\n");
            str = stringBuffer.toString();
        }
        throw new XmlPullParserException(str, this, null);
    }

    /* renamed from: c */
    private final void m268480c(boolean z) throws IOException, XmlPullParserException {
        if (!z) {
            m268484f();
        }
        this.f174951x = m268485g();
        this.f174953z = 0;
        while (true) {
            m268486h();
            int d = m268482d(0);
            if (!z) {
                if (d != 47) {
                    if (d == 62 && !z) {
                        m268484f();
                        break;
                    }
                } else {
                    this.f174952y = true;
                    m268484f();
                    m268486h();
                    m268468a('>');
                    break;
                }
            } else if (d == 63) {
                m268484f();
                m268468a('>');
                return;
            }
            if (d == -1) {
                m268475b("Unexpected EOF");
                return;
            }
            String g = m268485g();
            if (g.length() == 0) {
                m268475b("attr name expected");
                break;
            }
            int i = this.f174953z;
            this.f174953z = i + 1;
            int i2 = i << 2;
            String[] a = m268472a(this.f174920A, i2 + 4);
            this.f174920A = a;
            int i3 = i2 + 1;
            a[i2] = "";
            int i4 = i3 + 1;
            a[i3] = null;
            int i5 = i4 + 1;
            a[i4] = g;
            m268486h();
            if (m268482d(0) != 61) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Attr.value missing f. ");
                stringBuffer.append(g);
                m268475b(stringBuffer.toString());
                this.f174920A[i5] = "1";
            } else {
                m268468a('=');
                m268486h();
                int d2 = m268482d(0);
                if (d2 == 39 || d2 == 34) {
                    m268484f();
                } else {
                    m268475b("attr value delimiter missing!");
                    d2 = 32;
                }
                int i6 = this.f174946s;
                m268469a(d2, true);
                this.f174920A[i5] = m268473b(i6);
                this.f174946s = i6;
                if (d2 != 32) {
                    m268484f();
                }
            }
        }
        int i7 = this.f174934g;
        this.f174934g = i7 + 1;
        int i8 = i7 << 2;
        String[] a2 = m268472a(this.f174935h, i8 + 4);
        this.f174935h = a2;
        a2[i8 + 3] = this.f174951x;
        int i9 = this.f174934g;
        int[] iArr = this.f174937j;
        if (i9 >= iArr.length) {
            int[] iArr2 = new int[(i9 + 4)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f174937j = iArr2;
        }
        int[] iArr3 = this.f174937j;
        int i10 = this.f174934g;
        iArr3[i10] = iArr3[i10 - 1];
        if (this.f174931d) {
            m268470a();
        } else {
            this.f174949v = "";
        }
        String[] strArr = this.f174935h;
        strArr[i8] = this.f174949v;
        strArr[i8 + 1] = this.f174950w;
        strArr[i8 + 2] = this.f174951x;
    }

    /* renamed from: d */
    private final int m268481d() throws IOException {
        int d = m268482d(0);
        if (d == -1) {
            return 1;
        }
        if (d == 38) {
            return 6;
        }
        if (d != 60) {
            return 4;
        }
        int d2 = m268482d(1);
        if (d2 == 33) {
            return 999;
        }
        if (d2 != 47) {
            return d2 != 63 ? 2 : 999;
        }
        return 3;
    }

    /* renamed from: d */
    private final int m268482d(int i) throws IOException {
        char c;
        while (i >= this.f174924E) {
            char[] cArr = this.f174940m;
            if (cArr.length <= 1) {
                c = this.f174938k.read();
            } else {
                int i2 = this.f174941n;
                if (i2 < this.f174942o) {
                    this.f174941n = i2 + 1;
                    c = cArr[i2];
                } else {
                    int read = this.f174938k.read(cArr, 0, cArr.length);
                    this.f174942o = read;
                    char c2 = read <= 0 ? 65535 : this.f174940m[0];
                    this.f174941n = 1;
                    c = c2;
                }
            }
            if (c == '\r') {
                this.f174925F = true;
                int[] iArr = this.f174923D;
                int i3 = this.f174924E;
                this.f174924E = i3 + 1;
                iArr[i3] = 10;
            } else {
                if (c != '\n') {
                    int[] iArr2 = this.f174923D;
                    int i4 = this.f174924E;
                    this.f174924E = i4 + 1;
                    iArr2[i4] = c == 1 ? 1 : 0;
                } else if (!this.f174925F) {
                    int[] iArr3 = this.f174923D;
                    int i5 = this.f174924E;
                    this.f174924E = i5 + 1;
                    iArr3[i5] = 10;
                }
                this.f174925F = false;
            }
        }
        return this.f174923D[i];
    }

    /* renamed from: e */
    private final void m268483e() throws IOException, XmlPullParserException {
        m268478c(m268484f());
        int i = this.f174946s;
        while (true) {
            int f = m268484f();
            if (f == 59) {
                String b = m268473b(i);
                boolean z = true;
                this.f174946s = i - 1;
                if (this.f174927H && this.f174947t == 6) {
                    this.f174951x = b;
                }
                if (b.charAt(0) == '#') {
                    m268478c(b.charAt(1) == 'x' ? Integer.parseInt(b.substring(2), 16) : Integer.parseInt(b.substring(1)));
                    return;
                }
                String str = (String) this.f174933f.get(b);
                if (str != null) {
                    z = false;
                }
                this.f174926G = z;
                if (!z) {
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        m268478c(str.charAt(i2));
                    }
                    return;
                } else if (!this.f174927H) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("unresolved: &");
                    stringBuffer.append(b);
                    stringBuffer.append(";");
                    m268475b(stringBuffer.toString());
                    return;
                } else {
                    return;
                }
            } else if (f >= 128 || ((f >= 48 && f <= 57) || ((f >= 97 && f <= 122) || ((f >= 65 && f <= 90) || f == 95 || f == 45 || f == 35)))) {
                m268478c(f);
            } else {
                if (!this.f174932e) {
                    m268475b("unterminated entity ref");
                }
                if (f != -1) {
                    m268478c(f);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: f */
    private final int m268484f() throws IOException {
        int i;
        if (this.f174924E == 0) {
            i = m268482d(0);
        } else {
            int[] iArr = this.f174923D;
            int i2 = iArr[0];
            iArr[0] = iArr[1];
            i = i2;
        }
        this.f174924E--;
        this.f174944q++;
        if (i == 10) {
            this.f174943p++;
            this.f174944q = 1;
        }
        return i;
    }

    /* renamed from: g */
    private final String m268485g() throws IOException, XmlPullParserException {
        int i = this.f174946s;
        int d = m268482d(0);
        if ((d < 97 || d > 122) && ((d < 65 || d > 90) && d != 95 && d != 58 && d < 192 && !this.f174932e)) {
            m268475b("name expected");
        }
        while (true) {
            m268478c(m268484f());
            int d2 = m268482d(0);
            if ((d2 < 97 || d2 > 122) && ((d2 < 65 || d2 > 90) && !((d2 >= 48 && d2 <= 57) || d2 == 95 || d2 == 45 || d2 == 58 || d2 == 46 || d2 >= 183))) {
                String b = m268473b(i);
                this.f174946s = i;
                return b;
            }
        }
    }

    /* renamed from: h */
    private final void m268486h() throws IOException {
        while (true) {
            int d = m268482d(0);
            if (d <= 32 && d != -1) {
                m268484f();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public int mo246326a(int i) {
        if (i <= this.f174934g) {
            return this.f174937j[i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public String mo246327a(String str) {
        if ("xml".equals(str)) {
            return "http://www.w3.org/XML/1998/namespace";
        }
        if ("xmlns".equals(str)) {
            return "http://www.w3.org/2000/xmlns/";
        }
        for (int a = (mo246326a(this.f174934g) << 1) - 2; a >= 0; a -= 2) {
            Object[] objArr = this.f174936i;
            if (str == null) {
                if (objArr[a] == null) {
                    return objArr[a + 1];
                }
            } else if (str.equals(objArr[a])) {
                return this.f174936i[a + 1];
            }
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getAttributeCount() {
        return this.f174953z;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeName(int i) {
        if (i < this.f174953z) {
            return this.f174920A[(i << 2) + 2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeNamespace(int i) {
        if (i < this.f174953z) {
            return this.f174920A[i << 2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributePrefix(int i) {
        if (i < this.f174953z) {
            return this.f174920A[(i << 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(int i) {
        if (i < this.f174953z) {
            return this.f174920A[(i << 2) + 3];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getAttributeValue(String str, String str2) {
        for (int i = (this.f174953z << 2) - 4; i >= 0; i -= 4) {
            if (this.f174920A[i + 2].equals(str2) && (str == null || this.f174920A[i].equals(str))) {
                return this.f174920A[i + 3];
            }
        }
        return null;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getColumnNumber() {
        return this.f174944q;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getDepth() {
        return this.f174934g;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getEventType() throws XmlPullParserException {
        return this.f174947t;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int getLineNumber() {
        return this.f174943p;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getName() {
        return this.f174951x;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getNamespace() {
        return this.f174949v;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPositionDescription() {
        String text;
        StringBuffer stringBuffer = new StringBuffer(this.f174947t < XmlPullParser.TYPES.length ? XmlPullParser.TYPES[this.f174947t] : "unknown");
        stringBuffer.append(' ');
        int i = this.f174947t;
        if (i == 2 || i == 3) {
            if (this.f174952y) {
                stringBuffer.append("(empty) ");
            }
            stringBuffer.append('<');
            if (this.f174947t == 3) {
                stringBuffer.append('/');
            }
            if (this.f174950w != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("{");
                stringBuffer2.append(this.f174949v);
                stringBuffer2.append("}");
                stringBuffer2.append(this.f174950w);
                stringBuffer2.append(":");
                stringBuffer.append(stringBuffer2.toString());
            }
            stringBuffer.append(this.f174951x);
            int i2 = this.f174953z << 2;
            for (int i3 = 0; i3 < i2; i3 += 4) {
                stringBuffer.append(' ');
                int i4 = i3 + 1;
                if (this.f174920A[i4] != null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("{");
                    stringBuffer3.append(this.f174920A[i3]);
                    stringBuffer3.append("}");
                    stringBuffer3.append(this.f174920A[i4]);
                    stringBuffer3.append(":");
                    stringBuffer.append(stringBuffer3.toString());
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(this.f174920A[i3 + 2]);
                stringBuffer4.append("='");
                stringBuffer4.append(this.f174920A[i3 + 3]);
                stringBuffer4.append("'");
                stringBuffer.append(stringBuffer4.toString());
            }
            stringBuffer.append('>');
        } else if (i != 7) {
            if (i != 4) {
                text = getText();
            } else if (this.f174948u) {
                text = "(whitespace)";
            } else {
                text = getText();
                if (text.length() > 16) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append(text.substring(0, 16));
                    stringBuffer5.append("...");
                    text = stringBuffer5.toString();
                }
            }
            stringBuffer.append(text);
        }
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("@");
        stringBuffer6.append(this.f174943p);
        stringBuffer6.append(":");
        stringBuffer6.append(this.f174944q);
        stringBuffer.append(stringBuffer6.toString());
        if (this.f174928a != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f174928a);
        } else if (this.f174938k != null) {
            stringBuffer.append(" in ");
            stringBuffer.append(this.f174938k.toString());
        }
        return stringBuffer.toString();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getPrefix() {
        return this.f174950w;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public String getText() {
        int i = this.f174947t;
        if (i < 4 || (i == 6 && this.f174926G)) {
            return null;
        }
        return m268473b(0);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.f174947t != 2) {
            m268479c("Wrong event type");
        }
        return this.f174952y;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        this.f174946s = 0;
        this.f174948u = true;
        this.f174927H = false;
        int i = 9999;
        while (true) {
            m268474b();
            int i2 = this.f174947t;
            if (i2 < i) {
                i = i2;
            }
            if (i > 6 || (i >= 4 && m268481d() >= 4)) {
            }
        }
        this.f174947t = i;
        if (i > 4) {
            this.f174947t = 4;
        }
        return this.f174947t;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public int nextToken() throws XmlPullParserException, IOException {
        this.f174948u = true;
        this.f174946s = 0;
        this.f174927H = true;
        m268474b();
        return this.f174947t;
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        if (i != this.f174947t || ((str != null && !str.equals(getNamespace())) || (str2 != null && !str2.equals(getName())))) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected: ");
            stringBuffer.append(XmlPullParser.TYPES[i]);
            stringBuffer.append(" {");
            stringBuffer.append(str);
            stringBuffer.append("}");
            stringBuffer.append(str2);
            m268479c(stringBuffer.toString());
        }
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        if ("http://xmlpull.org/v1/doc/features.html#process-namespaces".equals(str)) {
            this.f174931d = z;
        } else if (m268471a(str, false, "relaxed")) {
            this.f174932e = z;
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unsupported feature: ");
            stringBuffer.append(str);
            m268479c(stringBuffer.toString());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb A[Catch:{ Exception -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca A[Catch:{ Exception -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f3 A[Catch:{ Exception -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4 A[Catch:{ Exception -> 0x0104 }] */
    @Override // org.xmlpull.v1.XmlPullParser
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setInput(java.io.InputStream r13, java.lang.String r14) throws org.xmlpull.v1.XmlPullParserException {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3506b.p3507a.C69999a.setInput(java.io.InputStream, java.lang.String):void");
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        this.f174938k = reader;
        this.f174943p = 1;
        this.f174944q = 0;
        this.f174947t = 0;
        this.f174951x = null;
        this.f174949v = null;
        this.f174952y = false;
        this.f174953z = -1;
        this.f174939l = null;
        this.f174929b = null;
        this.f174930c = null;
        if (reader != null) {
            this.f174941n = 0;
            this.f174942o = 0;
            this.f174924E = 0;
            this.f174934g = 0;
            Hashtable hashtable = new Hashtable();
            this.f174933f = hashtable;
            hashtable.put("amp", ContainerUtils.FIELD_DELIMITER);
            this.f174933f.put("apos", "'");
            this.f174933f.put("gt", ">");
            this.f174933f.put("lt", "<");
            this.f174933f.put("quot", "\"");
        }
    }
}
