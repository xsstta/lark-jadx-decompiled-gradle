package com.bytedance.ee.bear.drive.common;

import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.util.p701d.C13615c;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.common.b */
public class C6890b {
    /* renamed from: a */
    public static File m27226a(int i) {
        if (i == 0 || i == 2) {
            return C6880a.m27088b(C13615c.f35773a);
        }
        return C6880a.m27111g(C13615c.f35773a);
    }

    /* renamed from: a */
    public static String m27227a(int i, String str) {
        return new File(m27226a(i).getAbsolutePath(), str).getAbsolutePath();
    }
}
