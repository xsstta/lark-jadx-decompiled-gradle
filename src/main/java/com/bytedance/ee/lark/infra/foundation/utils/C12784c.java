package com.bytedance.ee.lark.infra.foundation.utils;

import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.diskmanage.cipher.EncryptException;
import java.io.File;

/* renamed from: com.bytedance.ee.lark.infra.foundation.utils.c */
public class C12784c {
    /* renamed from: a */
    public static boolean m52844a() {
        if (C36808a.m145211c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m52843a(File file) throws EncryptException {
        C36808a.m145203a(file);
    }

    /* renamed from: b */
    public static File m52845b(File file) throws DecryptException {
        return C36808a.m145210b(file);
    }

    /* renamed from: a */
    public static void m52842a(long j, String str, String str2, C36808a.AbstractC36813d dVar) {
        C36808a.m145208a(str2, j, str, dVar);
    }
}
