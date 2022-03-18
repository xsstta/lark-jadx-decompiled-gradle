package com.bytedance.frameworks.baselib.network.http.impl;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.URI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.impl.e */
public class C14010e implements Cloneable {

    /* renamed from: k */
    private static final Set<String> f36703k;

    /* renamed from: n */
    private static Pattern f36704n;

    /* renamed from: o */
    private static Pattern f36705o;

    /* renamed from: p */
    private static final ThreadLocal<DateFormat> f36706p = new ThreadLocal<DateFormat>() {
        /* class com.bytedance.frameworks.baselib.network.http.impl.C14010e.C140111 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    /* renamed from: q */
    private static final String[] f36707q = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: a */
    public String f36708a;

    /* renamed from: b */
    public String f36709b;

    /* renamed from: c */
    public boolean f36710c;

    /* renamed from: d */
    public String f36711d;

    /* renamed from: e */
    public long f36712e = -1;

    /* renamed from: f */
    public String f36713f;

    /* renamed from: g */
    public String f36714g;

    /* renamed from: h */
    public boolean f36715h;

    /* renamed from: i */
    public boolean f36716i;

    /* renamed from: j */
    public int f36717j = 1;

    /* renamed from: l */
    private final String f36718l;

    /* renamed from: m */
    private String f36719m;

    /* renamed from: a */
    public String mo51585a() {
        return this.f36708a;
    }

    /* renamed from: b */
    public String mo51590b() {
        return this.f36709b;
    }

    /* renamed from: d */
    public String mo51597d() {
        return this.f36711d;
    }

    /* renamed from: e */
    public long mo51599e() {
        return this.f36712e;
    }

    /* renamed from: f */
    public String mo51602f() {
        return this.f36718l;
    }

    /* renamed from: g */
    public String mo51604g() {
        return this.f36713f;
    }

    /* renamed from: h */
    public String mo51605h() {
        return this.f36714g;
    }

    /* renamed from: i */
    public boolean mo51607i() {
        return this.f36715h;
    }

    /* renamed from: j */
    public boolean mo51608j() {
        return this.f36716i;
    }

    /* renamed from: k */
    public String mo51609k() {
        return this.f36719m;
    }

    /* renamed from: l */
    public int mo51610l() {
        return this.f36717j;
    }

    /* renamed from: a */
    public void mo51589a(boolean z) {
        this.f36710c = z;
    }

    /* renamed from: c */
    public boolean mo51595c() {
        return this.f36710c;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: m */
    public boolean mo51611m() {
        long j = this.f36712e;
        if (j != -1 && j <= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.frameworks.baselib.network.http.impl.e$a */
    public static class C14012a {

        /* renamed from: a */
        boolean f36720a;

        /* renamed from: b */
        boolean f36721b;

        /* renamed from: c */
        boolean f36722c;

        /* renamed from: d */
        private final String f36723d;

        /* renamed from: e */
        private final String f36724e;

        /* renamed from: f */
        private int f36725f;

        /* renamed from: c */
        private void m56736c() {
            while (this.f36725f < this.f36723d.length() && " \t".indexOf(this.f36723d.charAt(this.f36725f)) != -1) {
                this.f36725f++;
            }
        }

        /* renamed from: b */
        private boolean m56735b() {
            m56736c();
            if (this.f36725f >= this.f36723d.length() || this.f36723d.charAt(this.f36725f) != '=') {
                return false;
            }
            this.f36725f++;
            return true;
        }

        /* renamed from: a */
        public List<C14010e> mo51615a() {
            int i;
            String str;
            String str2;
            ArrayList arrayList = new ArrayList(2);
            if (this.f36724e.startsWith("set-cookie2:")) {
                this.f36725f += 12;
                this.f36722c = true;
                i = 0;
            } else {
                if (this.f36724e.startsWith("set-cookie:")) {
                    this.f36725f += 11;
                }
                i = 1;
            }
            while (true) {
                String a = m56732a(false);
                if (a == null) {
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                    throw new IllegalArgumentException("No cookies in " + this.f36723d);
                } else if (m56735b()) {
                    if (i != 0) {
                        str = ";";
                    } else {
                        str = ",;";
                    }
                    C14010e eVar = new C14010e(a, m56731a(str));
                    eVar.f36717j = i ^ 1;
                    arrayList.add(eVar);
                    while (true) {
                        m56736c();
                        if (this.f36725f == this.f36723d.length()) {
                            break;
                        } else if (this.f36723d.charAt(this.f36725f) == ',') {
                            this.f36725f++;
                            break;
                        } else {
                            if (this.f36723d.charAt(this.f36725f) == ';') {
                                this.f36725f++;
                            }
                            String a2 = m56732a(true);
                            if (a2 != null) {
                                if (i != 0 || "expires".equals(a2) || "port".equals(a2)) {
                                    str2 = ";";
                                } else {
                                    str2 = ";,";
                                }
                                String str3 = null;
                                if (m56735b()) {
                                    str3 = m56731a(str2);
                                }
                                m56733a(eVar, a2, str3);
                            }
                        }
                    }
                    if (this.f36720a) {
                        eVar.f36717j = 0;
                    } else if (this.f36721b) {
                        eVar.f36717j = 1;
                    }
                } else {
                    throw new IllegalArgumentException("Expected '=' after " + a + " in " + this.f36723d);
                }
            }
        }

        C14012a(String str) {
            this.f36723d = str;
            this.f36724e = str.toLowerCase(Locale.US);
        }

        /* renamed from: a */
        private String m56731a(String str) {
            m56736c();
            int b = m56734b(str);
            String substring = this.f36723d.substring(this.f36725f, b);
            this.f36725f = b;
            return substring;
        }

        /* renamed from: a */
        private String m56732a(boolean z) {
            String str;
            String str2;
            m56736c();
            int b = m56734b(",;= \t");
            if (z) {
                str = this.f36724e;
            } else {
                str = this.f36723d;
            }
            int i = this.f36725f;
            if (i < b) {
                str2 = str.substring(i, b);
            } else {
                str2 = null;
            }
            this.f36725f = b;
            return str2;
        }

        /* renamed from: b */
        private int m56734b(String str) {
            for (int i = this.f36725f; i < this.f36723d.length(); i++) {
                if (str.indexOf(this.f36723d.charAt(i)) != -1) {
                    return i;
                }
            }
            return this.f36723d.length();
        }

        /* renamed from: a */
        private void m56733a(C14010e eVar, String str, String str2) {
            if (str.equals(Comment.f24093e) && eVar.f36708a == null) {
                eVar.f36708a = str2;
            } else if (str.equals("commenturl") && eVar.f36709b == null) {
                eVar.f36709b = str2;
            } else if (str.equals("discard")) {
                eVar.f36710c = true;
            } else if (str.equals("domain") && eVar.f36711d == null) {
                eVar.f36711d = str2;
            } else if (str.equals("expires")) {
                this.f36720a = true;
                if (eVar.f36712e == -1) {
                    Date h = C14010e.m56703h(str2);
                    if (h != null) {
                        eVar.mo51588a(h);
                    } else {
                        eVar.f36712e = 0;
                    }
                }
            } else if (str.equals("max-age") && eVar.f36712e == -1) {
                try {
                    long parseLong = Long.parseLong(str2);
                    this.f36721b = true;
                    eVar.f36712e = parseLong;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Invalid max-age: " + str2);
                }
            } else if (str.equals("path") && eVar.f36713f == null) {
                eVar.f36713f = str2;
            } else if (str.equals("port") && eVar.f36714g == null) {
                if (str2 == null) {
                    str2 = "";
                }
                eVar.f36714g = str2;
            } else if (str.equals("secure")) {
                eVar.f36715h = true;
            } else if (str.equals("httponly")) {
                eVar.f36716i = true;
            } else if (str.equals(HiAnalyticsConstant.HaKey.BI_KEY_VERSION) && !this.f36722c) {
                eVar.f36717j = Integer.parseInt(str2);
            }
        }
    }

    public int hashCode() {
        int i;
        int hashCode = this.f36718l.toLowerCase(Locale.US).hashCode();
        String str = this.f36711d;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.toLowerCase(Locale.US).hashCode();
        }
        int i3 = hashCode + i;
        String str2 = this.f36713f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    static {
        HashSet hashSet = new HashSet();
        f36703k = hashSet;
        hashSet.add(Comment.f24093e);
        hashSet.add("commenturl");
        hashSet.add("discard");
        hashSet.add("domain");
        hashSet.add("expires");
        hashSet.add("httponly");
        hashSet.add("max-age");
        hashSet.add("path");
        hashSet.add("port");
        hashSet.add("secure");
        hashSet.add(HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        f36704n = null;
        f36705o = null;
        try {
            f36704n = Pattern.compile("(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])", 2);
            f36705o = Pattern.compile("([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}", 2);
        } catch (PatternSyntaxException unused) {
        }
    }

    public String toString() {
        if (this.f36717j == 0) {
            return this.f36718l + ContainerUtils.KEY_VALUE_DELIMITER + this.f36719m;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36718l);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append("\"");
        sb.append(this.f36719m);
        sb.append("\"");
        m56695a(sb, "Path", this.f36713f);
        m56695a(sb, "Domain", this.f36711d);
        m56695a(sb, "Port", this.f36714g);
        return sb.toString();
    }

    /* renamed from: c */
    public void mo51593c(String str) {
        this.f36709b = str;
    }

    /* renamed from: a */
    public void mo51587a(long j) {
        this.f36712e = j;
    }

    /* renamed from: b */
    public void mo51591b(String str) {
        this.f36708a = str;
    }

    /* renamed from: c */
    public void mo51594c(boolean z) {
        this.f36716i = z;
    }

    /* renamed from: e */
    public void mo51600e(String str) {
        this.f36713f = str;
    }

    /* renamed from: f */
    public void mo51603f(String str) {
        this.f36714g = str;
    }

    /* renamed from: a */
    public static List<C14010e> m56694a(String str) {
        return new C14012a(str).mo51615a();
    }

    /* renamed from: b */
    public void mo51592b(boolean z) {
        this.f36715h = z;
    }

    /* renamed from: d */
    public void mo51598d(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = str.toLowerCase(Locale.US);
        }
        this.f36711d = str2;
    }

    /* renamed from: i */
    private static String m56704i(String str) {
        if (str == null) {
            return "/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    /* renamed from: g */
    public static boolean m56702g(String str) {
        try {
            if (!f36704n.matcher(str).matches() && !f36705o.matcher(str).matches()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: h */
    public static Date m56703h(String str) {
        try {
            return f36706p.get().parse(str);
        } catch (ParseException unused) {
            for (String str2 : f36707q) {
                try {
                    return new SimpleDateFormat(str2, Locale.US).parse(str);
                } catch (ParseException unused2) {
                }
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14010e)) {
            return false;
        }
        C14010e eVar = (C14010e) obj;
        if (!this.f36718l.equalsIgnoreCase(eVar.mo51602f()) || ((str = this.f36711d) == null ? eVar.f36711d != null : !str.equalsIgnoreCase(eVar.f36711d)) || !m56697a((Object) this.f36713f, (Object) eVar.f36713f)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m56705j(String str) {
        boolean z;
        if (str.length() == 0 || str.startsWith("$") || f36703k.contains(str.toLowerCase(Locale.US))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt < 0 || charAt >= 127 || charAt == ';' || charAt == ',') {
                    return false;
                }
                if (Character.isWhitespace(charAt) && charAt != ' ') {
                    return false;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo51586a(int i) {
        if (i == 0 || i == 1) {
            this.f36717j = i;
            return;
        }
        throw new IllegalArgumentException("Bad version: " + i);
    }

    /* renamed from: a */
    public void mo51588a(Date date) {
        this.f36712e = (date.getTime() - System.currentTimeMillis()) / 1000;
    }

    /* renamed from: b */
    public static boolean m56700b(C14010e eVar, URI uri) {
        if (!eVar.mo51607i() || "https".equalsIgnoreCase(uri.getScheme())) {
            return true;
        }
        return false;
    }

    public C14010e(String str, String str2) {
        String trim = str.trim();
        if (m56705j(trim)) {
            this.f36718l = trim;
            this.f36719m = str2;
            return;
        }
        throw new IllegalArgumentException("Invalid name: " + str);
    }

    /* renamed from: a */
    public static boolean m56696a(C14010e eVar, URI uri) {
        return m56704i(uri.getPath()).startsWith(m56704i(eVar.mo51604g()));
    }

    /* renamed from: c */
    public static boolean m56701c(C14010e eVar, URI uri) {
        if (eVar.mo51605h() == null) {
            return true;
        }
        return Arrays.asList(eVar.mo51605h().split(",")).contains(Integer.toString(SerializableHttpCookie.getEffectivePort(uri.getScheme(), uri.getPort())));
    }

    /* renamed from: a */
    public static boolean m56697a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m56698a(String str, int i) {
        int indexOf = str.indexOf(46, i + 1);
        if (indexOf == -1 || indexOf >= str.length() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m56699a(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        String lowerCase2 = str.toLowerCase(Locale.US);
        if (lowerCase.equals(lowerCase2) && (m56698a(lowerCase, 0) || m56702g(lowerCase))) {
            return true;
        }
        if (!m56698a(lowerCase, 0)) {
            return lowerCase2.equals(".local");
        }
        if (lowerCase2.length() == lowerCase.length() + 1 && lowerCase2.startsWith(".") && lowerCase2.endsWith(lowerCase) && m56698a(lowerCase2, 1)) {
            return true;
        }
        if (lowerCase.length() <= lowerCase2.length() || !lowerCase.endsWith(lowerCase2)) {
            return false;
        }
        if ((!lowerCase2.startsWith(".") || !m56698a(lowerCase2, 1)) && !lowerCase2.equals(".local")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m56695a(StringBuilder sb, String str, String str2) {
        if (str2 != null && sb != null) {
            sb.append(";$");
            sb.append(str);
            sb.append("=\"");
            sb.append(str2);
            sb.append("\"");
        }
    }
}
