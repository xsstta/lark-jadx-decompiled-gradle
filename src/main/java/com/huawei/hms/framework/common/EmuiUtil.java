package com.huawei.hms.framework.common;

public class EmuiUtil {
    public static final String BUILDEX_VERSION = "com.huawei.android.os.BuildEx$VERSION";
    private static final int EMUI_3_0 = 7;
    private static final int EMUI_3_1 = 8;
    private static final int EMUI_4_0 = 9;
    private static final int EMUI_4_1 = 10;
    private static final int EMUI_5_0 = 11;
    private static final int EMUI_6_0 = 14;
    private static final int EMUI_8_0_1 = 15;
    private static final int EMUI_9_0 = 17;
    public static final String EMUI_SDK_INT = "EMUI_SDK_INT";
    private static final int EMUI_TYPE_UNKOWN = -1;
    public static final String GET_PRIMARY_COLOR = "getPrimaryColor";
    public static final String GET_SUGGESTION_FOR_GROUND_COLOR_STYLE = "getSuggestionForgroundColorStyle";
    public static final String IMMERSION_STYLE = "com.huawei.android.immersion.ImmersionStyle";
    private static final String TAG = "KPMS_Util_Emui";
    private static final int TYPE_EMUI_30 = 30;
    private static final int TYPE_EMUI_31 = 31;
    private static final int TYPE_EMUI_40 = 40;
    private static final int TYPE_EMUI_41 = 41;
    private static final int TYPE_EMUI_50 = 50;
    private static final int TYPE_EMUI_60 = 60;
    private static final int TYPE_EMUI_801 = 81;
    private static final int TYPE_EMUI_90 = 90;
    private static int emuiType = -1;
    private static int emuiVersionCode;

    static {
        initEmuiType();
    }

    private static int getEMUIVersionCode() {
        int i;
        Object staticFieldObj = ReflectionUtils.getStaticFieldObj(BUILDEX_VERSION, EMUI_SDK_INT);
        if (staticFieldObj != null) {
            try {
                i = ((Integer) staticFieldObj).intValue();
            } catch (ClassCastException e) {
                Logger.m85369e(TAG, "getEMUIVersionCode ClassCastException:", e);
            }
            Logger.m85366d(TAG, "the emui version code is::" + i);
            return i;
        }
        i = 0;
        Logger.m85366d(TAG, "the emui version code is::" + i);
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void initEmuiType() {
        /*
            int r0 = getEMUIVersionCode()
            com.huawei.hms.framework.common.EmuiUtil.emuiVersionCode = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getEmuiType emuiVersionCode="
            r0.append(r1)
            int r1 = com.huawei.hms.framework.common.EmuiUtil.emuiVersionCode
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "KPMS_Util_Emui"
            com.huawei.hms.framework.common.Logger.m85366d(r1, r0)
            int r0 = com.huawei.hms.framework.common.EmuiUtil.emuiVersionCode
            r2 = 17
            if (r0 < r2) goto L_0x0029
            r0 = 90
        L_0x0026:
            com.huawei.hms.framework.common.EmuiUtil.emuiType = r0
            goto L_0x0059
        L_0x0029:
            r2 = 15
            if (r0 < r2) goto L_0x0030
            r0 = 81
            goto L_0x0026
        L_0x0030:
            r2 = 14
            if (r0 < r2) goto L_0x0037
            r0 = 60
            goto L_0x0026
        L_0x0037:
            r2 = 11
            if (r0 < r2) goto L_0x003e
            r0 = 50
            goto L_0x0026
        L_0x003e:
            r2 = 10
            if (r0 < r2) goto L_0x0045
            r0 = 41
            goto L_0x0026
        L_0x0045:
            r2 = 9
            if (r0 < r2) goto L_0x004c
            r0 = 40
            goto L_0x0026
        L_0x004c:
            r2 = 8
            if (r0 < r2) goto L_0x0053
            r0 = 31
            goto L_0x0026
        L_0x0053:
            r2 = 7
            if (r0 < r2) goto L_0x0059
            r0 = 30
            goto L_0x0026
        L_0x0059:
            int r0 = com.huawei.hms.framework.common.EmuiUtil.emuiType
            r2 = -1
            if (r0 != r2) goto L_0x0063
            java.lang.String r0 = "emuiType is unkown"
            com.huawei.hms.framework.common.Logger.m85371i(r1, r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.EmuiUtil.initEmuiType():void");
    }

    public static boolean isEMUI() {
        return -1 != emuiType;
    }
}
