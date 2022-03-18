package com.ss.android.lark.passport.infra.util;

import com.ss.android.lark.passport.infra.log.PassportLog;
import java.io.Closeable;

/* renamed from: com.ss.android.lark.passport.infra.util.o */
public class C49201o {
    /* renamed from: a */
    public static final void m193966a(Closeable... closeableArr) {
        if (closeableArr != null && closeableArr.length > 0) {
            for (Closeable closeable : closeableArr) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th) {
                        PassportLog.f123351c.mo171474a().mo171462a("IoStreamUtils", "closeSilently... error", th);
                    }
                }
            }
        }
    }
}
