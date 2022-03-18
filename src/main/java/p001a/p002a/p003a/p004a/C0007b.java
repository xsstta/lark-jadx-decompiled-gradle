package p001a.p002a.p003a.p004a;

/* renamed from: a.a.a.a.b */
public class C0007b {

    /* renamed from: a */
    public static int f27a = 255;

    /* renamed from: b */
    public static int f28b = 0;

    /* renamed from: c */
    public static String f29c = "";

    /* renamed from: a */
    public static synchronized int m13a() {
        int i;
        synchronized (C0007b.class) {
            i = f28b;
        }
        return i;
    }

    /* renamed from: a */
    public static synchronized void m14a(int i) {
        synchronized (C0007b.class) {
            f27a = i;
        }
    }

    /* renamed from: a */
    public static synchronized void m15a(int i, String str) {
        synchronized (C0007b.class) {
            if (i == 1025) {
                f29c = str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m16b(int i) {
        synchronized (C0007b.class) {
            f28b = i;
        }
    }

    /* renamed from: c */
    public static String m17c(int i) {
        String str = f29c;
        if (str != null && str.length() > 0) {
            return f29c;
        }
        int i2 = f27a;
        String str2 = "";
        if (i2 == 0) {
            if (i == 0) {
                str2 = "https://xlog.snssdk.com";
            }
            return i == 1 ? "https://bds.snssdk.com" : str2;
        } else if (i2 == 2) {
            if (i == 0) {
                str2 = f28b != 1180 ? "https://xlog.byteoversea.com" : "https://xlog.tiktokv.com";
            }
            return i == 1 ? "https://bds-sg.byteoversea.com" : str2;
        } else if (i2 != 3) {
            return i2 != 4 ? str2 : "http://10.8.121.119:8888";
        } else {
            if (i == 0) {
                str2 = f28b != 1233 ? "https://xlog-va.byteoversea.com" : "https://xlog-va.musical.ly";
            }
            return i == 1 ? "https://bds-va.byteoversea.com" : str2;
        }
    }
}
