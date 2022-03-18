package com.ss.android.lark.optrace.impl;

import com.ss.android.lark.optrace.AbstractC48927a;
import com.ss.android.lark.optrace.api.AbstractC48932d;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.optrace.core.C48938b;
import kotlin.Deprecated;

@Deprecated(message = "this is deprecated,use OPTraceService")
/* renamed from: com.ss.android.lark.optrace.impl.a */
public class C48944a implements AbstractC48927a {

    /* renamed from: a */
    private static C48944a f122930a;

    /* renamed from: b */
    private static AbstractC48932d f122931b;

    /* renamed from: c */
    private static TracingCoreSpan f122932c;

    @Override // com.ss.android.lark.optrace.AbstractC48927a
    /* renamed from: a */
    public AbstractC48932d mo170890a() {
        return f122931b;
    }

    @Override // com.ss.android.lark.optrace.AbstractC48927a
    /* renamed from: b */
    public TracingCoreSpan mo170891b() {
        return f122932c.generateSpan();
    }

    private C48944a() {
        f122932c = new TracingSpanImpl((TracingCoreSpan) null);
        f122931b = new C48938b();
    }

    /* renamed from: c */
    public static AbstractC48927a m192801c() {
        if (f122930a == null) {
            synchronized (C48944a.class) {
                if (f122930a == null) {
                    f122930a = new C48944a();
                }
            }
        }
        return f122930a;
    }
}
