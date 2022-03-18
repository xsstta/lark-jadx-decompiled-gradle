package com.ss.android.medialib.p2999b;

import android.util.Log;

/* renamed from: com.ss.android.medialib.b.c */
public class C59381c {

    /* renamed from: a */
    private static String f147414a = "VESDK-";

    /* renamed from: b */
    private static byte f147415b = 1;

    /* renamed from: c */
    private static byte f147416c = 2;

    /* renamed from: d */
    private static byte f147417d = 4;

    /* renamed from: e */
    private static byte f147418e = 8;

    /* renamed from: f */
    private static byte f147419f = 16;

    /* renamed from: g */
    private static byte f147420g = 3;

    /* renamed from: a */
    public static void m230519a(String str, String str2) {
        if ((f147417d & f147420g) != 0) {
            Log.i(f147414a + str, str2);
        }
    }

    /* renamed from: b */
    public static void m230520b(String str, String str2) {
        if ((f147415b & f147420g) != 0) {
            Log.e(f147414a + str, str2);
        }
    }
}
