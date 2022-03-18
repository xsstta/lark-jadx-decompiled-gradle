package com.larksuite.component.openplatform.core.plugin.messenger.location;

import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.location.g */
public class C25224g {
    /* renamed from: b */
    public static int m90646b(Context context) {
        if (!m90648d(context)) {
            return m90649e(context);
        }
        AppBrandLogger.m52829e("LocationEnvCheckUtils", "base station check fail : airplane mode on");
        return 0;
    }

    /* renamed from: d */
    private static boolean m90648d(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return m90645a(context, "android.provider.Settings$Global");
        } catch (Throwable th) {
            AppBrandLogger.m52829e("LocationEnvCheckUtils", th);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m90647c(Context context) {
        boolean z;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager != null) {
            z = locationManager.isProviderEnabled("gps");
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("LocationEnvCheckUtils", "gps state check:", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public static int m90644a(Context context) {
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        if (wifiManager != null) {
            int wifiState = wifiManager.getWifiState();
            if (wifiState == 0 || wifiState == 1 || wifiState == 4) {
                AppBrandLogger.m52829e("LocationEnvCheckUtils", "wifi check fail:wifi is off");
            } else {
                AppBrandLogger.m52830i("LocationEnvCheckUtils", "wifi is on");
                try {
                    List<ScanResult> scanResults = wifiManager.getScanResults();
                    if (scanResults == null || scanResults.isEmpty()) {
                        AppBrandLogger.m52829e("LocationEnvCheckUtils", "wifi check fail: no connected wifi ");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (ScanResult scanResult : scanResults) {
                            sb.append("\t");
                            sb.append(scanResult.SSID);
                        }
                        AppBrandLogger.m52830i("LocationEnvCheckUtils", "wifi check success: wifi list size: ", Integer.valueOf(scanResults.size()));
                        AppBrandLogger.m52830i("LocationEnvCheckUtils", "wifi list: ", sb.toString());
                        return scanResults.size();
                    }
                } catch (Throwable th) {
                    AppBrandLogger.m52829e("LocationEnvCheckUtils", "wifi check fail: system error: ", th);
                    return 0;
                }
            }
        }
        return 0;
    }

    /* renamed from: e */
    private static int m90649e(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    return 0;
                }
                List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
                if (allCellInfo == null || allCellInfo.size() <= 0) {
                    AppBrandLogger.m52829e("LocationEnvCheckUtils", "cell info check fail : size 0");
                } else {
                    StringBuilder sb = new StringBuilder("\n");
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo instanceof CellInfoGsm) {
                            CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                            int cid = ((CellInfoGsm) cellInfo).getCellIdentity().getCid();
                            sb.append("gsm rssi:level:");
                            sb.append(cellSignalStrength.getLevel());
                            sb.append("cid:");
                            sb.append(cid);
                            sb.append("\n");
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            CellSignalStrengthWcdma cellSignalStrength2 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                            int cid2 = ((CellInfoWcdma) cellInfo).getCellIdentity().getCid();
                            sb.append("wcdma rssi:level:");
                            sb.append(cellSignalStrength2.getLevel());
                            sb.append("cid:");
                            sb.append(cid2);
                            sb.append("\n");
                        } else if (cellInfo instanceof CellInfoLte) {
                            CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                            int ci = ((CellInfoLte) cellInfo).getCellIdentity().getCi();
                            sb.append("lte rssi:level: ");
                            sb.append(cellSignalStrength3.getLevel());
                            sb.append("cid:");
                            sb.append(ci);
                            sb.append("\n");
                        }
                    }
                    AppBrandLogger.m52830i("LocationEnvCheckUtils", "cell info list: ", sb.toString());
                    AppBrandLogger.m52830i("LocationEnvCheckUtils", "cell info check success :cell size: ", Integer.valueOf(allCellInfo.size()));
                    return allCellInfo.size();
                }
            } catch (Throwable th) {
                AppBrandLogger.m52829e("LocationEnvCheckUtils", "cell info check fail :system error:", th);
            }
        } else {
            AppBrandLogger.m52829e("LocationEnvCheckUtils", "cell info check fail :check cell information system error");
        }
        return 0;
    }

    /* renamed from: a */
    private static boolean m90645a(Context context, String str) throws Throwable {
        ContentResolver contentResolver = context.getContentResolver();
        Class<?> cls = Class.forName(str);
        Field field = cls.getField("AIRPLANE_MODE_ON");
        field.setAccessible(true);
        Object[] objArr = {contentResolver, field.get(cls).toString()};
        Method declaredMethod = cls.getDeclaredMethod("getInt", ContentResolver.class, String.class);
        declaredMethod.setAccessible(true);
        if (((Integer) declaredMethod.invoke(null, objArr)).intValue() == 1) {
            return true;
        }
        return false;
    }
}
