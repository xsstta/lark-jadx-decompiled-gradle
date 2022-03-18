package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

public class CalendarSkinColorTool {

    /* renamed from: a */
    public static int[] f83559a = {C32634ae.m125178a(R.color.lkui_N500), C32634ae.m125178a(R.color.lkui_N600)};

    /* renamed from: b */
    private static int[] f83560b;

    /* renamed from: c */
    private static int[] f83561c;

    /* renamed from: d */
    private static int[] f83562d;

    /* renamed from: e */
    private static int[] f83563e;

    /* renamed from: f */
    private static int[] f83564f;

    /* renamed from: g */
    private static int[] f83565g;

    /* renamed from: h */
    private static Map<String, SkinColor> f83566h;

    /* renamed from: i */
    private static Map<String, String> f83567i;

    /* renamed from: j */
    private static Map<String, SkinColor> f83568j;

    /* renamed from: k */
    private static Map<String, String> f83569k;

    /* renamed from: l */
    private static int[][] f83570l;

    public enum AlphaType {
        PC_LIGHT(1),
        PC_DARK(2),
        PC_GOOGLE_MARK(3),
        MOBILE_NEED_ACTION_DARK(10),
        MOBILE_NEED_ACTION_LIGHT(11),
        MOBILE_TENTATIVE_LIGHT(12),
        MOBILE_TENTATIVE_DARK(13),
        MOBILE_INSTANCE(14),
        MOBILE_EVENT_CREATION(15),
        MOBILE_EVENT_CREATION_BG(16),
        MOBILE_EVENT_FINISHED_MASK(17);
        
        public final int value;

        public int getNumber() {
            return this.value;
        }

        public static AlphaType valueOf(int i) {
            return forNumber(i);
        }

        public static AlphaType forNumber(int i) {
            if (i == 1) {
                return PC_LIGHT;
            }
            if (i == 2) {
                return PC_DARK;
            }
            if (i == 3) {
                return PC_GOOGLE_MARK;
            }
            switch (i) {
                case 10:
                    return MOBILE_NEED_ACTION_DARK;
                case 11:
                    return MOBILE_NEED_ACTION_LIGHT;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return MOBILE_TENTATIVE_LIGHT;
                case 13:
                    return MOBILE_TENTATIVE_DARK;
                case 14:
                    return MOBILE_INSTANCE;
                case 15:
                    return MOBILE_EVENT_CREATION;
                case 16:
                    return MOBILE_EVENT_CREATION_BG;
                case 17:
                    return MOBILE_EVENT_FINISHED_MASK;
                default:
                    return null;
            }
        }

        private AlphaType(int i) {
            this.value = i;
        }
    }

    public enum SkinType {
        LIGHT(1),
        DARK(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static SkinType valueOf(int i) {
            return forNumber(i);
        }

        public static SkinType forNumber(int i) {
            if (i == 1) {
                return LIGHT;
            }
            if (i != 2) {
                return null;
            }
            return DARK;
        }

        private SkinType(int i) {
            this.value = i;
        }
    }

    /* renamed from: b */
    public static int m124926b() {
        return C32634ae.m125178a(R.color.ud_N600);
    }

    /* renamed from: c */
    public static int m124928c() {
        return C32634ae.m125178a(R.color.ud_N300);
    }

    /* renamed from: d */
    public static int m124930d() {
        return C32634ae.m125178a(R.color.ud_N200);
    }

    /* renamed from: e */
    public static int m124931e() {
        return C32634ae.m125178a(R.color.ud_N600);
    }

    /* renamed from: f */
    private static int m124932f() {
        return C32634ae.m125178a(R.color.white);
    }

    /* renamed from: g */
    private static int m124933g() {
        return C32634ae.m125178a(R.color.cal_chip_font);
    }

    /* renamed from: h */
    private static int m124934h() {
        return C32634ae.m125178a(R.color.ud_N500);
    }

    /* renamed from: p */
    private static Map<String, SkinColor> m124942p() {
        Map<String, SkinColor> map = f83566h;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            SkinColor skinColor = new SkinColor();
            skinColor.backgroundColor = m124935i()[i];
            skinColor.foregroundColor = m124939m()[i];
            skinColor.eventStripColor = m124935i()[i];
            skinColor.selectColor = m124940n()[i];
            skinColor.acceptTitleColor = m124939m()[i];
            skinColor.declineTitleColor = m124934h();
            skinColor.tentativeTitleColor = m124939m()[i];
            skinColor.needActionTitleColor = m124939m()[i];
            skinColor.acceptBgColor = m124935i()[i];
            skinColor.declineBgColor = m124932f();
            skinColor.tentativeBgColor = m124935i()[i];
            skinColor.needActionBgColor = m124932f();
            hashMap.put(String.valueOf(i), skinColor);
        }
        f83566h = hashMap;
        return hashMap;
    }

    /* renamed from: q */
    private static Map<String, SkinColor> m124943q() {
        Map<String, SkinColor> map = f83568j;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 12; i++) {
            SkinColor skinColor = new SkinColor();
            skinColor.backgroundColor = m124937k()[i];
            skinColor.foregroundColor = m124935i()[i];
            skinColor.eventStripColor = m124935i()[i];
            skinColor.selectColor = m124937k()[i];
            skinColor.acceptTitleColor = m124933g();
            skinColor.declineTitleColor = m124934h();
            skinColor.tentativeTitleColor = m124933g();
            skinColor.needActionTitleColor = m124939m()[i];
            skinColor.acceptBgColor = m124937k()[i];
            skinColor.declineBgColor = m124932f();
            skinColor.tentativeBgColor = m124937k()[i];
            skinColor.needActionBgColor = m124932f();
            hashMap.put(String.valueOf(i), skinColor);
        }
        f83568j = hashMap;
        return hashMap;
    }

    /* renamed from: i */
    private static int[] m124935i() {
        int[] iArr = f83562d;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.cal_light_bg_carmine), C32634ae.m125178a(R.color.cal_light_bg_red), C32634ae.m125178a(R.color.cal_light_bg_oran), C32634ae.m125178a(R.color.cal_light_bg_yellow), C32634ae.m125178a(R.color.cal_light_bg_green), C32634ae.m125178a(R.color.cal_light_bg_tur), C32634ae.m125178a(R.color.cal_light_bg_blue), C32634ae.m125178a(R.color.cal_light_bg_wathet), C32634ae.m125178a(R.color.cal_light_bg_indigo), C32634ae.m125178a(R.color.cal_light_bg_purple), C32634ae.m125178a(R.color.cal_light_bg_violet), C32634ae.m125178a(R.color.cal_light_bg_neutral)};
        f83562d = iArr2;
        return iArr2;
    }

    /* renamed from: j */
    private static int[] m124936j() {
        int[] iArr = f83563e;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.lkui_C200), C32634ae.m125178a(R.color.lkui_R200), C32634ae.m125178a(R.color.lkui_O200), C32634ae.m125178a(R.color.lkui_Y200), C32634ae.m125178a(R.color.lkui_G200), C32634ae.m125178a(R.color.lkui_T200), C32634ae.m125178a(R.color.lkui_B200), C32634ae.m125178a(R.color.lkui_W200), C32634ae.m125178a(R.color.lkui_I200), C32634ae.m125178a(R.color.lkui_P200), C32634ae.m125178a(R.color.lkui_V200), C32634ae.m125178a(R.color.lkui_N400)};
        f83563e = iArr2;
        return iArr2;
    }

    /* renamed from: k */
    private static int[] m124937k() {
        int[] iArr = f83564f;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.cal_dark_bg_carmine), C32634ae.m125178a(R.color.cal_dark_bg_red), C32634ae.m125178a(R.color.cal_dark_bg_orange), C32634ae.m125178a(R.color.cal_dark_bg_yellow), C32634ae.m125178a(R.color.cal_dark_bg_green), C32634ae.m125178a(R.color.cal_dark_bg_tur), C32634ae.m125178a(R.color.cal_dark_bg_blue), C32634ae.m125178a(R.color.cal_dark_bg_wathet), C32634ae.m125178a(R.color.cal_dark_bg_indigo), C32634ae.m125178a(R.color.cal_dark_bg_purple), C32634ae.m125178a(R.color.cal_dark_bg_violet), C32634ae.m125178a(R.color.cal_dark_bg_neutral)};
        f83564f = iArr2;
        return iArr2;
    }

    /* renamed from: l */
    private static int[] m124938l() {
        int[] iArr = f83565g;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.lkui_C300), C32634ae.m125178a(R.color.lkui_R300), C32634ae.m125178a(R.color.lkui_O300), C32634ae.m125178a(R.color.lkui_Y300), C32634ae.m125178a(R.color.lkui_G300), C32634ae.m125178a(R.color.lkui_T300), C32634ae.m125178a(R.color.lkui_B300), C32634ae.m125178a(R.color.lkui_W300), C32634ae.m125178a(R.color.lkui_I300), C32634ae.m125178a(R.color.lkui_P300), C32634ae.m125178a(R.color.lkui_V300), C32634ae.m125178a(R.color.lkui_N300)};
        f83565g = iArr2;
        return iArr2;
    }

    /* renamed from: m */
    private static int[] m124939m() {
        int[] iArr = f83560b;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.cal_light_font_carmine), C32634ae.m125178a(R.color.cal_light_font_red), C32634ae.m125178a(R.color.cal_light_font_oran), C32634ae.m125178a(R.color.cal_light_font_yellow), C32634ae.m125178a(R.color.cal_light_font_green), C32634ae.m125178a(R.color.cal_light_font_tur), C32634ae.m125178a(R.color.cal_light_font_blue), C32634ae.m125178a(R.color.cal_light_font_wathet), C32634ae.m125178a(R.color.cal_light_font_indigo), C32634ae.m125178a(R.color.cal_light_font_purple), C32634ae.m125178a(R.color.cal_light_font_violet), C32634ae.m125178a(R.color.cal_light_font_neutral)};
        f83560b = iArr2;
        return iArr2;
    }

    /* renamed from: n */
    private static int[] m124940n() {
        int[] iArr = f83561c;
        if (iArr != null) {
            return iArr;
        }
        int[] iArr2 = {C32634ae.m125178a(R.color.lkui_C400), C32634ae.m125178a(R.color.lkui_R400), C32634ae.m125178a(R.color.lkui_O500), C32634ae.m125178a(R.color.lkui_Y500), C32634ae.m125178a(R.color.lkui_G500), C32634ae.m125178a(R.color.lkui_T500), C32634ae.m125178a(R.color.lkui_B400), C32634ae.m125178a(R.color.lkui_W500), C32634ae.m125178a(R.color.lkui_I400), C32634ae.m125178a(R.color.lkui_P400), C32634ae.m125178a(R.color.lkui_V500), C32634ae.m125178a(R.color.lkui_N500)};
        f83561c = iArr2;
        return iArr2;
    }

    /* renamed from: r */
    private static Map<String, String> m124944r() {
        Map<String, String> map = f83567i;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(AlphaType.PC_DARK.getNumber()), "20");
        hashMap.put(String.valueOf(AlphaType.PC_LIGHT.getNumber()), "6");
        hashMap.put(String.valueOf(AlphaType.PC_GOOGLE_MARK.getNumber()), "20");
        hashMap.put(String.valueOf(AlphaType.MOBILE_NEED_ACTION_DARK.getNumber()), "60");
        hashMap.put(String.valueOf(AlphaType.MOBILE_NEED_ACTION_LIGHT.getNumber()), "60");
        hashMap.put(String.valueOf(AlphaType.MOBILE_TENTATIVE_DARK.getNumber()), "40");
        hashMap.put(String.valueOf(AlphaType.MOBILE_TENTATIVE_LIGHT.getNumber()), "0");
        hashMap.put(String.valueOf(AlphaType.MOBILE_INSTANCE.getNumber()), "100");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_CREATION.getNumber()), "15");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_CREATION_BG.getNumber()), "90");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_FINISHED_MASK.getNumber()), "60");
        f83567i = hashMap;
        return hashMap;
    }

    /* renamed from: s */
    private static Map<String, String> m124945s() {
        Map<String, String> map = f83569k;
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(AlphaType.PC_DARK.getNumber()), "100");
        hashMap.put(String.valueOf(AlphaType.PC_LIGHT.getNumber()), "6");
        hashMap.put(String.valueOf(AlphaType.PC_GOOGLE_MARK.getNumber()), "20");
        hashMap.put(String.valueOf(AlphaType.MOBILE_NEED_ACTION_DARK.getNumber()), "60");
        hashMap.put(String.valueOf(AlphaType.MOBILE_NEED_ACTION_LIGHT.getNumber()), "60");
        hashMap.put(String.valueOf(AlphaType.MOBILE_TENTATIVE_DARK.getNumber()), "10");
        hashMap.put(String.valueOf(AlphaType.MOBILE_TENTATIVE_LIGHT.getNumber()), "0");
        hashMap.put(String.valueOf(AlphaType.MOBILE_INSTANCE.getNumber()), "100");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_CREATION.getNumber()), "15");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_CREATION_BG.getNumber()), "90");
        hashMap.put(String.valueOf(AlphaType.MOBILE_EVENT_FINISHED_MASK.getNumber()), "50");
        f83569k = hashMap;
        return hashMap;
    }

    /* renamed from: o */
    private static int[][] m124941o() {
        int[][] iArr = f83570l;
        if (iArr != null) {
            return iArr;
        }
        int[][] iArr2 = {new int[]{C32634ae.m125178a(R.color.lkui_C400), C32634ae.m125178a(R.color.lkui_C500)}, new int[]{C32634ae.m125178a(R.color.lkui_R400), C32634ae.m125178a(R.color.lkui_R500)}, new int[]{C32634ae.m125178a(R.color.lkui_O400), C32634ae.m125178a(R.color.lkui_O500)}, new int[]{C32634ae.m125178a(R.color.lkui_Y500), C32634ae.m125178a(R.color.lkui_Y600)}, new int[]{C32634ae.m125178a(R.color.lkui_G500), C32634ae.m125178a(R.color.lkui_G600)}, new int[]{C32634ae.m125178a(R.color.lkui_T500), C32634ae.m125178a(R.color.lkui_T600)}, new int[]{C32634ae.m125178a(R.color.lkui_B400), C32634ae.m125178a(R.color.lkui_B500)}, new int[]{C32634ae.m125178a(R.color.lkui_W500), C32634ae.m125178a(R.color.lkui_W600)}, new int[]{C32634ae.m125178a(R.color.lkui_I400), C32634ae.m125178a(R.color.lkui_I500)}, new int[]{C32634ae.m125178a(R.color.lkui_P400), C32634ae.m125178a(R.color.lkui_P500)}, new int[]{C32634ae.m125178a(R.color.lkui_V400), C32634ae.m125178a(R.color.lkui_V500)}, new int[]{C32634ae.m125178a(R.color.lkui_N500), C32634ae.m125178a(R.color.lkui_N600)}};
        f83570l = iArr2;
        return iArr2;
    }

    /* renamed from: a */
    public static void m124924a() {
        f83562d = null;
        f83563e = null;
        f83564f = null;
        f83565g = null;
        f83561c = null;
        f83560b = null;
        f83566h = null;
        f83567i = null;
        f83568j = null;
        f83569k = null;
    }

    /* renamed from: b */
    public static float m124925b(SkinType skinType) {
        if (SkinType.LIGHT.equals(skinType)) {
            return 0.5f;
        }
        return 0.55f;
    }

    /* renamed from: b */
    public static int[] m124927b(int i) {
        if (i < 0 || i >= m124941o().length) {
            return m124941o()[6];
        }
        return m124941o()[i];
    }

    /* renamed from: c */
    public static int m124929c(int i) {
        for (int i2 = 0; i2 < m124935i().length; i2++) {
            if (m124935i()[i2] == i) {
                return m124940n()[i2];
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m124919a(int i) {
        for (int i2 = 0; i2 < m124935i().length; i2++) {
            if (m124935i()[i2] == i) {
                return m124936j()[i2];
            }
        }
        for (int i3 = 0; i3 < m124937k().length; i3++) {
            if (m124937k()[i3] == i) {
                return m124938l()[i3];
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Map<String, SkinColor> m124923a(SkinType skinType) {
        if (SkinType.LIGHT.equals(skinType)) {
            return m124942p();
        }
        return m124943q();
    }

    /* renamed from: a */
    public static int m124920a(int i, SkinType skinType) {
        int[] n = m124940n();
        if (SkinType.DARK.equals(skinType)) {
            n = m124937k();
        }
        if (i < 0 || i >= n.length) {
            return n[6];
        }
        return n[i];
    }

    /* renamed from: a */
    public static float m124918a(AlphaType alphaType, SkinType skinType) {
        Map<String, String> map;
        if (SkinType.LIGHT.equals(skinType)) {
            map = m124944r();
        } else {
            map = m124945s();
        }
        try {
            float parseInt = ((float) Integer.parseInt(map.get(String.valueOf(alphaType.value)))) / 100.0f;
            if (parseInt > 1.0f) {
                return 1.0f;
            }
            return parseInt;
        } catch (Exception unused) {
            return 1.0f;
        }
    }

    /* renamed from: a */
    public static SkinColor m124921a(MappingColor mappingColor, SkinType skinType) {
        String str;
        if (mappingColor != null) {
            str = mappingColor.getEventColorIndex();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "6";
        }
        return m124922a(str, skinType);
    }

    /* renamed from: a */
    public static SkinColor m124922a(String str, SkinType skinType) {
        try {
            SkinColor skinColor = m124923a(skinType).get(str);
            if (skinColor == null) {
                return m124923a(skinType).get("6");
            }
            return skinColor;
        } catch (IndexOutOfBoundsException unused) {
            return m124923a(skinType).get("6");
        } catch (Exception e) {
            C3474b.m14692a(e);
            Log.m165383e("CalendarSkinColorTool", C32673y.m125377c("CalendarSkinColorTool null !!!"));
            return new SkinColor();
        }
    }
}
