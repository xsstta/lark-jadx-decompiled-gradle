package com.ss.android.lark.notification.p2379c;

import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.notification.c.b */
public class C48433b {

    /* renamed from: a */
    static Map<RomUtils.RomType, String> f121889a;

    /* renamed from: b */
    static Map<RomUtils.RomType, Integer> f121890b;

    /* renamed from: a */
    public static C48432a m191074a() {
        if (C48398a.m190922a().mo169352o().mo169386a("lark.setting.notification_helpdocs")) {
            return null;
        }
        RomUtils.RomType j = RomUtils.m94955j();
        String a = C48398a.m190922a().mo169336a(f121889a.get(j));
        if (f121890b.get(j) != null) {
            return new C48432a(j, UIHelper.getString(f121890b.get(j).intValue()), a);
        }
        C53241h.m205894a("RomTipHelper", "rom name is empty");
        return null;
    }

    static {
        HashMap hashMap = new HashMap();
        f121889a = hashMap;
        hashMap.put(RomUtils.RomType.ROM_SAMSUNG, "help-android-samsung");
        f121889a.put(RomUtils.RomType.ROM_SMARTISAN, "help-android-smartisan");
        f121889a.put(RomUtils.RomType.ROM_LENOVO, "help-android-lenovo");
        f121889a.put(RomUtils.RomType.ROM_OPPO, "help-android-oppo");
        f121889a.put(RomUtils.RomType.ROM_VIVO, "help-android-vivo");
        f121889a.put(RomUtils.RomType.ROM_ZTE, "help-android-zte");
        f121889a.put(RomUtils.RomType.ROM_NUBIA, "help-android-zte");
        f121889a.put(RomUtils.RomType.ROM_MIUI, "help-android-xiaomi");
        HashMap hashMap2 = new HashMap();
        f121890b = hashMap2;
        hashMap2.put(RomUtils.RomType.ROM_SAMSUNG, Integer.valueOf((int) R.string.Lark_Legacy_VersionSamsung));
        f121890b.put(RomUtils.RomType.ROM_SMARTISAN, Integer.valueOf((int) R.string.Lark_Legacy_VersionSmartisan));
        f121890b.put(RomUtils.RomType.ROM_LENOVO, Integer.valueOf((int) R.string.Lark_Legacy_VersionLenovo));
        f121890b.put(RomUtils.RomType.ROM_OPPO, Integer.valueOf((int) R.string.Lark_Legacy_VersionOppo));
        f121890b.put(RomUtils.RomType.ROM_VIVO, Integer.valueOf((int) R.string.Lark_Legacy_VersionVivo));
        f121890b.put(RomUtils.RomType.ROM_ZTE, Integer.valueOf((int) R.string.Lark_Legacy_VersionZte));
        f121890b.put(RomUtils.RomType.ROM_NUBIA, Integer.valueOf((int) R.string.Lark_Legacy_VersionNubia));
        f121890b.put(RomUtils.RomType.ROM_MIUI, Integer.valueOf((int) R.string.Lark_Legacy_VersionXiaomi));
    }
}
