package com.ss.android.lark.setting.page.v1.mvp;

import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.page.v1.p2672a.C54554a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.setting.page.v1.mvp.e */
public class C54584e {

    /* renamed from: a */
    static Map<RomUtils.RomType, String> f134899a;

    /* renamed from: b */
    static Map<RomUtils.RomType, Integer> f134900b;

    /* renamed from: a */
    public static C54554a m211756a() {
        if (C54115c.m210080a().mo178291e().mo178337a("lark.setting.notification_helpdocs")) {
            return null;
        }
        RomUtils.RomType j = RomUtils.m94955j();
        String a = C54115c.m210080a().mo178275a(f134899a.get(j));
        if (f134900b.get(j) != null) {
            return new C54554a(j, UIHelper.getString(f134900b.get(j).intValue()), a);
        }
        C53241h.m205894a("RomTipHelper", "rom name is empty");
        return null;
    }

    static {
        HashMap hashMap = new HashMap();
        f134899a = hashMap;
        hashMap.put(RomUtils.RomType.ROM_SAMSUNG, "help-android-samsung");
        f134899a.put(RomUtils.RomType.ROM_SMARTISAN, "help-android-smartisan");
        f134899a.put(RomUtils.RomType.ROM_LENOVO, "help-android-lenovo");
        f134899a.put(RomUtils.RomType.ROM_OPPO, "help-android-oppo");
        f134899a.put(RomUtils.RomType.ROM_VIVO, "help-android-vivo");
        f134899a.put(RomUtils.RomType.ROM_ZTE, "help-android-zte");
        f134899a.put(RomUtils.RomType.ROM_NUBIA, "help-android-zte");
        f134899a.put(RomUtils.RomType.ROM_MIUI, "help-android-xiaomi");
        HashMap hashMap2 = new HashMap();
        f134900b = hashMap2;
        hashMap2.put(RomUtils.RomType.ROM_SAMSUNG, Integer.valueOf((int) R.string.Lark_Legacy_VersionSamsung));
        f134900b.put(RomUtils.RomType.ROM_SMARTISAN, Integer.valueOf((int) R.string.Lark_Legacy_VersionSmartisan));
        f134900b.put(RomUtils.RomType.ROM_LENOVO, Integer.valueOf((int) R.string.Lark_Legacy_VersionLenovo));
        f134900b.put(RomUtils.RomType.ROM_OPPO, Integer.valueOf((int) R.string.Lark_Legacy_VersionOppo));
        f134900b.put(RomUtils.RomType.ROM_VIVO, Integer.valueOf((int) R.string.Lark_Legacy_VersionVivo));
        f134900b.put(RomUtils.RomType.ROM_ZTE, Integer.valueOf((int) R.string.Lark_Legacy_VersionZte));
        f134900b.put(RomUtils.RomType.ROM_NUBIA, Integer.valueOf((int) R.string.Lark_Legacy_VersionNubia));
        f134900b.put(RomUtils.RomType.ROM_MIUI, Integer.valueOf((int) R.string.Lark_Legacy_VersionXiaomi));
    }
}
