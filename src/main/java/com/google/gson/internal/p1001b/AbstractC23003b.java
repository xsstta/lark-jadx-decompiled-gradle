package com.google.gson.internal.p1001b;

import com.google.gson.internal.C23017e;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.google.gson.internal.b.b */
public abstract class AbstractC23003b {

    /* renamed from: a */
    private static final AbstractC23003b f56839a;

    /* renamed from: a */
    public abstract void mo79949a(AccessibleObject accessibleObject);

    /* renamed from: a */
    public static AbstractC23003b m83447a() {
        return f56839a;
    }

    static {
        AbstractC23003b bVar;
        if (C23017e.m83488a() < 9) {
            bVar = new C23002a();
        } else {
            bVar = new C23004c();
        }
        f56839a = bVar;
    }
}
