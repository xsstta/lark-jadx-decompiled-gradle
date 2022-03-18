package org.apache.commons.lang3.concurrent;

import org.apache.commons.lang3.C69882g;

/* renamed from: org.apache.commons.lang3.concurrent.a */
public class C69875a {
    /* renamed from: a */
    static Throwable m268153a(Throwable th) {
        boolean z;
        if (th == null || (th instanceof RuntimeException) || (th instanceof Error)) {
            z = false;
        } else {
            z = true;
        }
        C69882g.m268179a(z, "Not a checked exception: " + th, new Object[0]);
        return th;
    }
}
