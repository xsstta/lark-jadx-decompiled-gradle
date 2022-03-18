package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageManager;
import com.huawei.hms.adapter.AvailableAdapter;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.InvocationTargetException;

public final class mac {

    /* renamed from: a */
    private static mah f58637a;

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double m86187a(com.huawei.hms.maps.model.LatLng r7, com.huawei.hms.maps.model.LatLng r8) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.maps.mac.m86187a(com.huawei.hms.maps.model.LatLng, com.huawei.hms.maps.model.LatLng):double");
    }

    /* renamed from: a */
    public static int m86188a(Context context) {
        String str;
        try {
            str = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getString("com.huawei.hms.map.version");
        } catch (PackageManager.NameNotFoundException unused) {
            mcq.m86889e("MapUtil", "NameNotFoundException ");
            str = null;
        }
        int i = 40001300;
        if (str != null && !"".equals(str)) {
            String[] split = str.split("\\.");
            if (split.length == 4) {
                mcq.m86886b("MapUtil", "hmsVersionStr ".concat(String.valueOf(str)));
                i = Integer.parseInt(split[0] + "0" + split[1] + "0" + split[2] + split[3]);
            }
        }
        return new AvailableAdapter(i).isHuaweiMobileServicesAvailable(context);
    }

    /* renamed from: a */
    public static String m86189a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            mcq.m86889e("MapUtil", "An exception occurred while reading SystemProperties: ".concat(String.valueOf(str)));
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m86190a() {
        StringBuilder sb;
        int i;
        if (!m86189a("ro.build.version.magic", "").equals("") || !m86189a("ro.build.version.emui", "").contains("EmotionUI_10")) {
            return true;
        }
        String a = m86189a("ro.huawei.build.display.id", "");
        mcq.m86886b("MapUtil", "huaweiSubVersion is ".concat(String.valueOf(a)));
        if ("".equals(a)) {
            a = m86189a("ro.build.display.id", "");
            mcq.m86886b("MapUtil", "emuiSubVersion is ".concat(String.valueOf(a)));
        }
        String[] split = a.split(" ");
        if (1 < split.length) {
            String[] split2 = split[1].split("\\.");
            if (3 < split2.length) {
                String str = split2[3];
                int indexOf = str.indexOf("(");
                if (-1 != indexOf) {
                    str = str.substring(0, indexOf);
                }
                try {
                    int parseInt = Integer.parseInt(split2[0]);
                    return parseInt >= 10 && (parseInt != 10 || Integer.parseInt(split2[1]) != 0 || Integer.parseInt(split2[2]) > 0 || Integer.parseInt(str) >= 122);
                } catch (NumberFormatException e) {
                    mcq.m86889e("MapUtil", "NumberFormatException" + e.toString());
                    return true;
                }
            } else {
                sb = new StringBuilder("versionStrs.length <= 3: ");
                i = split2.length;
            }
        } else {
            sb = new StringBuilder("versions.length <= 1: ");
            i = split.length;
        }
        sb.append(i);
        mcq.m86889e("MapUtil", sb.toString());
    }
}
