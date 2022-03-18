package com.huawei.hms.maps;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.DynamicModule;

public final class mco {

    /* renamed from: a */
    public static DynamicModule f58679a;

    /* renamed from: b */
    private static int f58680b;

    /* renamed from: a */
    public static void m86877a(String str, Context context) {
        if (!m86879a(context)) {
            DynamicModule.enable3rdPhone(str, true);
        }
        if (m86880b() > 0 && m86880b() <= 11) {
            DynamicModule.enableLowEMUI(str, true);
        }
    }

    /* renamed from: a */
    private static boolean m86878a() {
        boolean z = false;
        try {
            if (m86880b() < 25) {
                z = TextUtils.equals("HONOR", Build.BRAND);
            }
        } catch (Exception unused) {
            mcq.m86889e("DynamicUtil", "Failed to judge whether location is running on phone.");
        }
        mcq.m86887c("DynamicUtil", "isHonorPhone : ".concat(String.valueOf(z)));
        return z;
    }

    /* renamed from: a */
    private static boolean m86879a(Context context) {
        boolean z;
        boolean z2 = false;
        try {
            z = context.getPackageManager().hasSystemFeature("com.huawei.software.features.handset");
            if (!z) {
                try {
                    if (TextUtils.equals("HUAWEI", Build.BRAND) || m86878a()) {
                        z2 = true;
                    }
                } catch (Exception unused) {
                    z2 = z;
                    mcq.m86889e("DynamicUtil", "Failed to judge whether location is running on phone.");
                    z = z2;
                    mcq.m86887c("DynamicUtil", "isHuaWeiPhone : ".concat(String.valueOf(z)));
                    return z;
                }
                z = z2;
            }
        } catch (Exception unused2) {
            mcq.m86889e("DynamicUtil", "Failed to judge whether location is running on phone.");
            z = z2;
            mcq.m86887c("DynamicUtil", "isHuaWeiPhone : ".concat(String.valueOf(z)));
            return z;
        }
        mcq.m86887c("DynamicUtil", "isHuaWeiPhone : ".concat(String.valueOf(z)));
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        r1 = "IllegalAccessException: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r1 = "NoSuchFieldException: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r1 = "ClassNotFoundException: ";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ExcHandler: IllegalAccessException (unused java.lang.IllegalAccessException), SYNTHETIC, Splitter:B:4:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[ExcHandler: NoSuchFieldException (unused java.lang.NoSuchFieldException), SYNTHETIC, Splitter:B:4:0x0009] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:4:0x0009] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m86880b() {
        /*
            java.lang.String r0 = "DynamicUtil"
            int r1 = com.huawei.hms.maps.mco.f58680b
            if (r1 == 0) goto L_0x0007
            return r1
        L_0x0007:
            java.lang.String r1 = "com.huawei.android.os.BuildEx$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            java.lang.String r2 = "EMUI_SDK_INT"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            r3 = 1
            java.lang.reflect.Field[] r4 = new java.lang.reflect.Field[r3]     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            r5 = 0
            r4[r5] = r2     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            java.lang.reflect.AccessibleObject.setAccessible(r4, r3)     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002e }
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002f }
            if (r2 == 0) goto L_0x004d
            r2 = r1
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002f }
            int r2 = r2.intValue()     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002f }
            com.huawei.hms.maps.mco.f58680b = r2     // Catch:{ ClassNotFoundException -> 0x0048, NoSuchFieldException -> 0x0045, IllegalAccessException -> 0x0042, ClassCastException -> 0x002f }
            goto L_0x004d
        L_0x002e:
            r1 = 0
        L_0x002f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ClassCastException: getEMUIVersionCode is not a number"
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x004a
        L_0x0042:
            java.lang.String r1 = "IllegalAccessException: "
            goto L_0x004a
        L_0x0045:
            java.lang.String r1 = "NoSuchFieldException: "
            goto L_0x004a
        L_0x0048:
            java.lang.String r1 = "ClassNotFoundException: "
        L_0x004a:
            com.huawei.hms.maps.mcq.m86889e(r0, r1)
        L_0x004d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "emuiVersionCodeValue: "
            r1.<init>(r2)
            int r2 = com.huawei.hms.maps.mco.f58680b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.maps.mcq.m86887c(r0, r1)
            int r0 = com.huawei.hms.maps.mco.f58680b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.maps.mco.m86880b():int");
    }
}
