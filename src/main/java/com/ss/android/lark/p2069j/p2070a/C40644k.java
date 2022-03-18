package com.ss.android.lark.p2069j.p2070a;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.k */
public class C40644k extends OPMonitorCode {

    /* renamed from: a */
    public static final C40644k f103102a = new C40644k(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, OPMonitorLevel.NORMAL, "vivo_rom_version");

    public C40644k(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.infra.android_api_upgrade", i, oPMonitorLevel, str);
    }

    public C40644k(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
