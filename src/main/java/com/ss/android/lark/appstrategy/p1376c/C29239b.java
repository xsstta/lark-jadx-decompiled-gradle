package com.ss.android.lark.appstrategy.p1376c;

import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: com.ss.android.lark.appstrategy.c.b */
public class C29239b {

    /* renamed from: a */
    private static DecimalFormat f73194a = new DecimalFormat("0.000000", new DecimalFormatSymbols(Locale.US));

    /* renamed from: a */
    private static double m107521a(double d) {
        return Double.parseDouble(f73194a.format(d));
    }

    /* renamed from: a */
    public static double m107522a(SimpleLocation simpleLocation, SimpleLocation simpleLocation2) {
        double a = m107521a(simpleLocation.getLongitude());
        double latitude = simpleLocation.getLatitude();
        double d = a * 0.01745329251994329d;
        double d2 = latitude * 0.01745329251994329d;
        double a2 = m107521a(simpleLocation2.getLongitude()) * 0.01745329251994329d;
        double latitude2 = simpleLocation2.getLatitude() * 0.01745329251994329d;
        double sin = Math.sin(d);
        double sin2 = Math.sin(d2);
        double cos = Math.cos(d);
        double cos2 = Math.cos(d2);
        double sin3 = Math.sin(a2);
        double sin4 = Math.sin(latitude2);
        double cos3 = Math.cos(a2);
        double cos4 = Math.cos(latitude2);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
        return Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d;
    }
}
