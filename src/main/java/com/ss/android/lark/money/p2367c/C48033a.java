package com.ss.android.lark.money.p2367c;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/* renamed from: com.ss.android.lark.money.c.a */
public class C48033a {

    /* renamed from: a */
    private static DecimalFormat f120924a = new DecimalFormat("0.00");

    /* renamed from: b */
    private static DecimalFormat f120925b = new DecimalFormat("#,##0.00");

    /* renamed from: a */
    public static String m189577a(double d) {
        return f120924a.format(d);
    }

    /* renamed from: b */
    public static long m189578b(double d) {
        return new BigDecimal(Double.toString(d)).multiply(new BigDecimal(100)).longValue();
    }
}
