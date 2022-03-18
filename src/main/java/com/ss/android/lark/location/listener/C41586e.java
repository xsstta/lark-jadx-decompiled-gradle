package com.ss.android.lark.location.listener;

import android.content.Context;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;

/* renamed from: com.ss.android.lark.location.listener.e */
public class C41586e {
    /* renamed from: a */
    public static double[] m165039a(double d, double d2) {
        double[] c = m165042c(d, d2);
        return new double[]{d + c[0], d2 + c[1]};
    }

    /* renamed from: b */
    public static double[] m165041b(double d, double d2) {
        double[] c = m165042c(d, d2);
        return new double[]{d - c[0], d2 - c[1]};
    }

    /* renamed from: a */
    public static LarkLocation m165036a(LarkLocation larkLocation, LocationRequestOption locationRequestOption) {
        if (locationRequestOption.mo149697a() == LarkLocation.CoordinateSystem.DEFAULT) {
            return larkLocation;
        }
        if (larkLocation == null) {
            return null;
        }
        if (locationRequestOption != null && larkLocation.mo149625l() == LarkLocation.CoordinateSystem.GCJ && locationRequestOption.mo149697a() == LarkLocation.CoordinateSystem.WGS) {
            double[] b = m165041b(larkLocation.getLatitude(), larkLocation.getLongitude());
            larkLocation.setLatitude(b[0]);
            larkLocation.setLongitude(b[1]);
            larkLocation.mo149607a(LarkLocation.CoordinateSystem.WGS);
        }
        return larkLocation;
    }

    /* renamed from: a */
    public static POIInfo m165038a(POIInfo pOIInfo, boolean z) {
        if (pOIInfo == null) {
            return null;
        }
        if (!z) {
            return pOIInfo;
        }
        double[] b = m165041b(pOIInfo.getLatitude(), pOIInfo.getLongitude());
        POIInfo pOIInfo2 = (POIInfo) pOIInfo.clone();
        pOIInfo2.setLatitude(b[0]);
        pOIInfo2.setLongitude(b[1]);
        pOIInfo2.setInternal(true);
        return pOIInfo2;
    }

    /* renamed from: c */
    public static double[] m165042c(double d, double d2) {
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double d5 = m165043d(d3, d4);
        double e = m165044e(d3, d4);
        double d6 = (d / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((0.006693421622965943d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        return new double[]{(d5 * 180.0d) / ((6335552.717000426d / (d7 * sqrt)) * 3.141592653589793d), (e * 180.0d) / (((6378245.0d / sqrt) * Math.cos(d6)) * 3.141592653589793d)};
    }

    /* renamed from: d */
    private static double m165043d(double d, double d2) {
        double d3 = d * 2.0d;
        double d4 = d2 * 3.141592653589793d;
        return -100.0d + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d4) * 20.0d) + (Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    /* renamed from: e */
    private static double m165044e(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(d * 3.141592653589793d) * 20.0d) + (Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    /* renamed from: a */
    public static double[] m165040a(Context context, double d, double d2) {
        return m165039a(d, d2);
    }

    /* renamed from: a */
    public static POIInfo m165037a(POIInfo pOIInfo, POIConfig pOIConfig, boolean z) {
        if (pOIConfig == null || pOIConfig.isNeedWGSLatLng()) {
            return m165038a(pOIInfo, z);
        }
        return pOIInfo;
    }
}
