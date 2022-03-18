package com.ss.android.lark.integrator.passport.lazy;

import android.util.SparseBooleanArray;
import com.ss.android.lark.account_provider.C28503b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k;

/* renamed from: com.ss.android.lark.integrator.passport.lazy.a */
public class C39959a {

    /* renamed from: a */
    private static volatile AbstractC49397k f101662a;

    /* renamed from: b */
    private static final SparseBooleanArray f101663b;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        f101663b = sparseBooleanArray;
        sparseBooleanArray.append(4, true);
        sparseBooleanArray.append(5, true);
        sparseBooleanArray.append(6, true);
        sparseBooleanArray.append(3, true);
        sparseBooleanArray.append(2, true);
        sparseBooleanArray.append(7, true);
        sparseBooleanArray.append(8, true);
        sparseBooleanArray.append(9, true);
    }

    /* renamed from: a */
    public static AbstractC49397k m158588a() {
        if (f101662a == null) {
            synchronized (C39959a.class) {
                if (f101662a == null) {
                    f101662a = new C28503b(new AbstractC49397k.C49398a(f101663b));
                }
            }
        }
        return f101662a;
    }
}
