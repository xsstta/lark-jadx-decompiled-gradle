package com.tt.miniapphost.util;

/* renamed from: com.tt.miniapphost.util.a */
public class C67583a {

    /* renamed from: a */
    static double f170409a = 52.35987755982988d;

    /* renamed from: b */
    static double f170410b = 3.141592653589793d;

    /* renamed from: c */
    static double f170411c = 6378245.0d;

    /* renamed from: d */
    static double f170412d = 0.006693421622965943d;

    /* renamed from: a */
    public static boolean m263037a(double d, double d2) {
        return d >= -90.0d && d <= 90.0d && d2 >= -180.0d && d2 <= 180.0d;
    }

    /* renamed from: e */
    public static boolean m263041e(double d, double d2) {
        return d < 72.004d || d > 137.8347d || d2 < 0.8293d || d2 > 55.8271d;
    }

    /* renamed from: b */
    public static double[] m263038b(double d, double d2) {
        if (m263041e(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double c = m263039c(d3, d4);
        double d5 = m263040d(d3, d4);
        double d6 = (d2 / 180.0d) * f170410b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((f170412d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        double d8 = f170411c;
        return new double[]{(d * 2.0d) - (d + ((d5 * 180.0d) / (((d8 / sqrt) * Math.cos(d6)) * f170410b))), (d2 * 2.0d) - (d2 + ((c * 180.0d) / ((((1.0d - f170412d) * d8) / (d7 * sqrt)) * f170410b)))};
    }

    /* renamed from: c */
    public static double m263039c(double d, double d2) {
        double d3 = d * 2.0d;
        return -100.0d + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((d * 6.0d) * f170410b) * 20.0d) + (Math.sin(d3 * f170410b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f170410b * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f170410b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f170410b) * 160.0d) + (Math.sin((d2 * f170410b) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    /* renamed from: d */
    public static double m263040d(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * f170410b) * 20.0d) + (Math.sin((d * 2.0d) * f170410b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f170410b * d) * 20.0d) + (Math.sin((d / 3.0d) * f170410b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * f170410b) * 150.0d) + (Math.sin((d / 30.0d) * f170410b) * 300.0d)) * 2.0d) / 3.0d);
    }
}
