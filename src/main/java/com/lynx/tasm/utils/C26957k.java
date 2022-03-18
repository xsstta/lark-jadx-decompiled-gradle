package com.lynx.tasm.utils;

/* renamed from: com.lynx.tasm.utils.k */
public final class C26957k {
    /* renamed from: a */
    public static String m97957a(int i) {
        return i == 1 ? "nowrap" : "normal";
    }

    /* renamed from: b */
    public static String m97959b(int i) {
        if (i == 0) {
            return "clip";
        }
        if (i == 1) {
            return "ellipsis";
        }
        return null;
    }

    /* renamed from: c */
    public static String m97960c(int i) {
        switch (i) {
            case 0:
            default:
                return "normal";
            case 1:
                return "bold";
            case 2:
                return "100";
            case 3:
                return "200";
            case 4:
                return "300";
            case 5:
                return "400";
            case 6:
                return "500";
            case 7:
                return "600";
            case 8:
                return "700";
            case 9:
                return "800";
            case 10:
                return "900";
        }
    }

    /* renamed from: d */
    public static String m97961d(int i) {
        if (i == 0) {
            return "normal";
        }
        if (i == 1) {
            return "bold";
        }
        if (i == 2) {
            return "italic";
        }
        if (i == 3) {
            return "oblique";
        }
        return null;
    }

    /* renamed from: e */
    public static String m97962e(int i) {
        return i == 0 ? "left" : i == 1 ? "center" : i == 2 ? "right" : i == 3 ? "auto" : "left";
    }

    /* renamed from: f */
    public static String m97963f(int i) {
        return i == 1 ? "break-all" : i == 0 ? "normal" : "";
    }

    /* renamed from: g */
    public static String m97964g(int i) {
        String str = "";
        if ((i & 2) != 0) {
            str = str + "line-through";
        }
        if ((i & 1) == 0) {
            return str;
        }
        return str + "underline";
    }

    /* renamed from: a */
    public static boolean m97958a(Class cls, Class cls2, String str, Class<?>... clsArr) {
        if (cls == cls2) {
            return false;
        }
        try {
            if (cls.getDeclaredMethod(str, clsArr) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}
