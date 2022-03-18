package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.parser.b */
public class C14077b {

    /* renamed from: a */
    private Hashtable f36999a = new Hashtable();

    public C14077b() {
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f36999a.size() * 16);
        Enumeration keys = this.f36999a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(m56995d((String) this.f36999a.get(str)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public void mo51788c(String str) {
        this.f36999a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public C14077b(String str) throws MimeTypeParseException {
        mo51785a(str);
    }

    /* renamed from: b */
    public String mo51787b(String str) {
        return (String) this.f36999a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    /* renamed from: a */
    private static boolean m56994a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m56996e(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!z && charAt != '\\') {
                stringBuffer.append(charAt);
            } else if (z) {
                stringBuffer.append(charAt);
                z = false;
            } else {
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    private static String m56995d(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            z = !m56994a(str.charAt(i));
        }
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity((int) (((double) length) * 1.5d));
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo51785a(String str) throws MimeTypeParseException {
        int length;
        int i;
        String str2;
        if (str != null && (length = str.length()) > 0) {
            int a = m56993a(str, 0);
            while (a < length && str.charAt(a) == ';') {
                int a2 = m56993a(str, a + 1);
                if (a2 < length) {
                    int i2 = a2;
                    while (i2 < length && m56994a(str.charAt(i2))) {
                        i2++;
                    }
                    String lowerCase = str.substring(a2, i2).toLowerCase(Locale.ENGLISH);
                    int a3 = m56993a(str, i2);
                    if (a3 >= length || str.charAt(a3) != '=') {
                        throw new MimeTypeParseException("Couldn't find the '=' that separates a parameter name from its value.");
                    }
                    int a4 = m56993a(str, a3 + 1);
                    if (a4 < length) {
                        char charAt = str.charAt(a4);
                        if (charAt == '\"') {
                            int i3 = a4 + 1;
                            if (i3 < length) {
                                int i4 = i3;
                                while (i4 < length) {
                                    charAt = str.charAt(i4);
                                    if (charAt == '\"') {
                                        break;
                                    }
                                    if (charAt == '\\') {
                                        i4++;
                                    }
                                    i4++;
                                }
                                if (charAt == '\"') {
                                    str2 = m56996e(str.substring(i3, i4));
                                    i = i4 + 1;
                                } else {
                                    throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                                }
                            } else {
                                throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                            }
                        } else if (m56994a(charAt)) {
                            i = a4;
                            while (i < length && m56994a(str.charAt(i))) {
                                i++;
                            }
                            str2 = str.substring(a4, i);
                        } else {
                            throw new MimeTypeParseException("Unexpected character encountered at index " + a4);
                        }
                        this.f36999a.put(lowerCase, str2);
                        a = m56993a(str, i);
                    } else {
                        throw new MimeTypeParseException("Couldn't find a value for parameter named " + lowerCase);
                    }
                } else {
                    return;
                }
            }
            if (a < length) {
                throw new MimeTypeParseException("More characters encountered in input than expected.");
            }
        }
    }

    /* renamed from: a */
    public void mo51786a(String str, String str2) {
        this.f36999a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    /* renamed from: a */
    private static int m56993a(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
