package com.google.gson.internal;

/* renamed from: com.google.gson.internal.e */
public final class C23017e {

    /* renamed from: a */
    private static final int f56881a = m83492c();

    /* renamed from: a */
    public static int m83488a() {
        return f56881a;
    }

    /* renamed from: b */
    public static boolean m83491b() {
        if (f56881a >= 9) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m83492c() {
        return m83489a(System.getProperty("java.version"));
    }

    /* renamed from: a */
    static int m83489a(String str) {
        int b = m83490b(str);
        if (b == -1) {
            b = m83493c(str);
        }
        if (b == -1) {
            return 6;
        }
        return b;
    }

    /* renamed from: b */
    private static int m83490b(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt != 1 || split.length <= 1) {
                return parseInt;
            }
            return Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    private static int m83493c(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
