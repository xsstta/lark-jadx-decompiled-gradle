package com.huawei.secure.android.common.ssl.p1027a;

import com.huawei.secure.android.common.ssl.p1028b.C23821f;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* renamed from: com.huawei.secure.android.common.ssl.a.c */
public class C23814c {

    /* renamed from: a */
    private static final Pattern f58993a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final String[] f58994b;

    static {
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        f58994b = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: c */
    private static boolean m87049c(String str) {
        return f58993a.matcher(str).matches();
    }

    /* renamed from: b */
    public static int m87047b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m87045a(String str) {
        int length = str.length();
        if (length < 7 || length > 9) {
            return true;
        }
        int i = length - 3;
        if (str.charAt(i) != '.') {
            return true;
        }
        if (Arrays.binarySearch(f58994b, str.substring(2, i)) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String[] m87048b(X509Certificate x509Certificate) {
        Collection<List<?>> collection;
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            C23821f.m87075a("", "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == 2) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    public static String[] m87046a(X509Certificate x509Certificate) {
        List<String> a = new C23813b(x509Certificate.getSubjectX500Principal()).mo85528a("cn");
        if (a.isEmpty()) {
            return null;
        }
        String[] strArr = new String[a.size()];
        a.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    public static final void m87043a(String str, X509Certificate x509Certificate, boolean z) throws SSLException {
        String[] a = m87046a(x509Certificate);
        String[] b = m87048b(x509Certificate);
        C23821f.m87074a("", "cn is : " + Arrays.toString(a));
        C23821f.m87074a("", "san is : " + Arrays.toString(b));
        m87044a(str, a, b, z);
    }

    /* renamed from: a */
    public static final void m87044a(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        boolean z2;
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append('>');
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                boolean z4 = true;
                if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(46, 2) == -1 || !m87045a(lowerCase2) || m87049c(str)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z3 = endsWith;
                        continue;
                    } else {
                        if (m87047b(lowerCase) != m87047b(lowerCase2)) {
                            z4 = false;
                        }
                        z3 = z4;
                        continue;
                    }
                } else {
                    z3 = lowerCase.equals(lowerCase2);
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            if (!z3) {
                throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) stringBuffer));
            }
            return;
        }
        throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
    }
}
