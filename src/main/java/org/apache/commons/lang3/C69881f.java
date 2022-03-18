package org.apache.commons.lang3;

import java.io.PrintStream;

/* renamed from: org.apache.commons.lang3.f */
public class C69881f {

    /* renamed from: A */
    public static final String f174654A = m268173c("java.vm.specification.name");

    /* renamed from: B */
    public static final String f174655B = m268173c("java.vm.specification.vendor");

    /* renamed from: C */
    public static final String f174656C = m268173c("java.vm.specification.version");

    /* renamed from: D */
    public static final String f174657D = m268173c("java.vm.vendor");

    /* renamed from: E */
    public static final String f174658E = m268173c("java.vm.version");

    /* renamed from: F */
    public static final String f174659F = m268173c("line.separator");

    /* renamed from: G */
    public static final String f174660G = m268173c("os.arch");

    /* renamed from: H */
    public static final String f174661H = m268173c("os.name");

    /* renamed from: I */
    public static final String f174662I = m268173c("os.version");

    /* renamed from: J */
    public static final String f174663J = m268173c("path.separator");

    /* renamed from: K */
    public static final String f174664K;

    /* renamed from: L */
    public static final String f174665L = m268173c("user.dir");

    /* renamed from: M */
    public static final String f174666M = m268173c("user.home");

    /* renamed from: N */
    public static final String f174667N = m268173c("user.language");

    /* renamed from: O */
    public static final String f174668O = m268173c("user.name");

    /* renamed from: P */
    public static final String f174669P = m268173c("user.timezone");

    /* renamed from: Q */
    public static final boolean f174670Q = m268167a("1.1");

    /* renamed from: R */
    public static final boolean f174671R = m268167a("1.2");

    /* renamed from: S */
    public static final boolean f174672S = m268167a("1.3");

    /* renamed from: T */
    public static final boolean f174673T = m268167a("1.4");

    /* renamed from: U */
    public static final boolean f174674U = m268167a("1.5");

    /* renamed from: V */
    public static final boolean f174675V = m268167a("1.6");

    /* renamed from: W */
    public static final boolean f174676W = m268167a("1.7");

    /* renamed from: X */
    public static final boolean f174677X = m268167a("1.8");

    /* renamed from: Y */
    public static final boolean f174678Y = m268167a("9");

    /* renamed from: Z */
    public static final boolean f174679Z = m268167a("9");

    /* renamed from: a */
    public static final String f174680a = m268173c("awt.toolkit");
    public static final boolean aA;
    public static final boolean aB = m268171b("Windows");
    public static final boolean aC = m268171b("Windows 2000");
    public static final boolean aD = m268171b("Windows 2003");
    public static final boolean aE = m268171b("Windows Server 2008");
    public static final boolean aF = m268171b("Windows Server 2012");
    public static final boolean aG = m268171b("Windows 95");
    public static final boolean aH = m268171b("Windows 98");
    public static final boolean aI = m268171b("Windows Me");
    public static final boolean aJ = m268171b("Windows NT");
    public static final boolean aK = m268171b("Windows XP");
    public static final boolean aL = m268171b("Windows Vista");
    public static final boolean aM = m268171b("Windows 7");
    public static final boolean aN = m268171b("Windows 8");
    public static final boolean aO = m268171b("Windows 10");
    public static final boolean aP = m268171b("z/OS");
    private static final JavaVersion aQ;
    public static final boolean aa = m268167a("10");
    public static final boolean ab;
    public static final boolean ac;
    public static final boolean ad = m268171b("OS/400");
    public static final boolean ae;
    public static final boolean af;
    public static final boolean ag = m268171b("Mac");
    public static final boolean ah;

    /* renamed from: ai  reason: collision with root package name */
    public static final boolean f175471ai = m268175d("Mac OS X", "10.0");
    public static final boolean aj = m268175d("Mac OS X", "10.1");
    public static final boolean ak = m268175d("Mac OS X", "10.2");
    public static final boolean al = m268175d("Mac OS X", "10.3");
    public static final boolean am = m268175d("Mac OS X", "10.4");
    public static final boolean an = m268175d("Mac OS X", "10.5");
    public static final boolean ao = m268175d("Mac OS X", "10.6");
    public static final boolean ap = m268175d("Mac OS X", "10.7");
    public static final boolean aq = m268175d("Mac OS X", "10.8");
    public static final boolean ar = m268175d("Mac OS X", "10.9");
    public static final boolean as = m268175d("Mac OS X", "10.10");
    public static final boolean at = m268175d("Mac OS X", "10.11");
    public static final boolean au;
    public static final boolean av;
    public static final boolean aw;
    public static final boolean ax = m268171b("OS/2");
    public static final boolean ay;
    public static final boolean az;

    /* renamed from: b */
    public static final String f174681b = m268173c("file.encoding");

    /* renamed from: c */
    public static final String f174682c = m268173c("file.separator");

    /* renamed from: d */
    public static final String f174683d = m268173c("java.awt.fonts");

    /* renamed from: e */
    public static final String f174684e = m268173c("java.awt.graphicsenv");

    /* renamed from: f */
    public static final String f174685f = m268173c("java.awt.headless");

    /* renamed from: g */
    public static final String f174686g = m268173c("java.awt.printerjob");

    /* renamed from: h */
    public static final String f174687h = m268173c("java.class.path");

    /* renamed from: i */
    public static final String f174688i = m268173c("java.class.version");

    /* renamed from: j */
    public static final String f174689j = m268173c("java.compiler");

    /* renamed from: k */
    public static final String f174690k = m268173c("java.endorsed.dirs");

    /* renamed from: l */
    public static final String f174691l = m268173c("java.ext.dirs");

    /* renamed from: m */
    public static final String f174692m = m268173c("java.home");

    /* renamed from: n */
    public static final String f174693n = m268173c("java.io.tmpdir");

    /* renamed from: o */
    public static final String f174694o = m268173c("java.library.path");

    /* renamed from: p */
    public static final String f174695p = m268173c("java.runtime.name");

    /* renamed from: q */
    public static final String f174696q = m268173c("java.runtime.version");

    /* renamed from: r */
    public static final String f174697r = m268173c("java.specification.name");

    /* renamed from: s */
    public static final String f174698s = m268173c("java.specification.vendor");

    /* renamed from: t */
    public static final String f174699t;

    /* renamed from: u */
    public static final String f174700u = m268173c("java.util.prefs.PreferencesFactory");

    /* renamed from: v */
    public static final String f174701v = m268173c("java.vendor");

    /* renamed from: w */
    public static final String f174702w = m268173c("java.vendor.url");

    /* renamed from: x */
    public static final String f174703x = m268173c("java.version");

    /* renamed from: y */
    public static final String f174704y = m268173c("java.vm.info");

    /* renamed from: z */
    public static final String f174705z = m268173c("java.vm.name");

    static {
        boolean z;
        String c = m268173c("java.specification.version");
        f174699t = c;
        aQ = JavaVersion.get(c);
        String str = "user.country";
        if (m268173c(str) == null) {
            str = "user.region";
        }
        f174664K = m268173c(str);
        boolean b = m268171b("AIX");
        ab = b;
        boolean b2 = m268171b("HP-UX");
        ac = b2;
        boolean b3 = m268171b("Irix");
        ae = b3;
        boolean z2 = false;
        if (m268171b("Linux") || m268171b("LINUX")) {
            z = true;
        } else {
            z = false;
        }
        af = z;
        boolean b4 = m268171b("Mac OS X");
        ah = b4;
        boolean b5 = m268171b("FreeBSD");
        au = b5;
        boolean b6 = m268171b("OpenBSD");
        av = b6;
        boolean b7 = m268171b("NetBSD");
        aw = b7;
        boolean b8 = m268171b("Solaris");
        ay = b8;
        boolean b9 = m268171b("SunOS");
        az = b9;
        if (b || b2 || b3 || z || b4 || b8 || b9 || b5 || b6 || b7) {
            z2 = true;
        }
        aA = z2;
    }

    /* renamed from: a */
    private static boolean m268167a(String str) {
        return m268168a(f174699t, str);
    }

    /* renamed from: b */
    private static boolean m268171b(String str) {
        return m268172b(f174661H, str);
    }

    /* renamed from: a */
    public static boolean m268170a(JavaVersion javaVersion) {
        return aQ.atLeast(javaVersion);
    }

    /* renamed from: c */
    private static String m268173c(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            printStream.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    /* renamed from: a */
    static boolean m268168a(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    /* renamed from: b */
    static boolean m268172b(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    /* renamed from: d */
    private static boolean m268175d(String str, String str2) {
        return m268169a(f174661H, f174662I, str, str2);
    }

    /* renamed from: c */
    static boolean m268174c(String str, String str2) {
        if (C69877e.m268158a(str)) {
            return false;
        }
        String[] split = str2.split("\\.");
        String[] split2 = str.split("\\.");
        for (int i = 0; i < Math.min(split.length, split2.length); i++) {
            if (!split[i].equals(split2[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m268169a(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || !m268172b(str, str3) || !m268174c(str2, str4)) {
            return false;
        }
        return true;
    }
}
