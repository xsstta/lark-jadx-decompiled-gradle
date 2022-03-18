package com.huawei.hms.android;

public class HwBuildEx {

    public static class VERSION {
        public static final int EMUI_SDK_INT = HwBuildEx.getSystemPropertiesInt("ro.build.hw_emui_api_level", 0);
    }

    public static class VersionCodes {
        public static final int CUR_DEVELOPMENT = 10000;
        public static final int EMUI_10_0 = 21;
        public static final int EMUI_1_0 = 1;
        public static final int EMUI_1_5 = 2;
        public static final int EMUI_1_6 = 3;
        public static final int EMUI_2_0_JB = 4;
        public static final int EMUI_2_0_KK = 5;
        public static final int EMUI_2_3 = 6;
        public static final int EMUI_3_0 = 7;
        public static final int EMUI_3_0_5 = 8;
        public static final int EMUI_3_1 = 8;
        public static final int EMUI_4_0 = 9;
        public static final int EMUI_4_1 = 10;
        public static final int EMUI_5_0 = 11;
        public static final int EMUI_5_1 = 12;
        public static final int EMUI_5_1_b10x = 13;
        public static final int EMUI_5_1_b200 = 13;
        public static final int EMUI_6_0 = 14;
        public static final int EMUI_9_0 = 17;
        public static final int UNKNOWN_EMUI = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002e, code lost:
        android.util.Log.e("HwBuildEx", "An exception occurred while reading: EMUI_SDK_INT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        return r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:? A[ExcHandler: ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getSystemPropertiesInt(java.lang.String r7, int r8) {
        /*
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "getInt"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r6 = 1
            r3[r6] = r4     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r2[r5] = r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            r2[r6] = r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            int r7 = r7.intValue()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e, ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException -> 0x002e }
            return r7
        L_0x002e:
            java.lang.String r7 = "HwBuildEx"
            java.lang.String r0 = "An exception occurred while reading: EMUI_SDK_INT"
            android.util.Log.e(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.android.HwBuildEx.getSystemPropertiesInt(java.lang.String, int):int");
    }
}
