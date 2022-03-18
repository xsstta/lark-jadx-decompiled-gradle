package com.ss.android.lark.p2069j.p2070a;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.g */
public class C40640g extends OPMonitorCode {

    /* renamed from: a */
    public static final C40640g f103075a = new C40640g(10029, OPMonitorLevel.NORMAL, "v8share_init");

    /* renamed from: b */
    public static final C40640g f103076b = new C40640g(10030, OPMonitorLevel.NORMAL, "meta_parse_time");

    /* renamed from: c */
    public static final C40640g f103077c = new C40640g(10031, OPMonitorLevel.NORMAL, "meta_sp_time");

    /* renamed from: d */
    public static final C40640g f103078d = new C40640g(10032, OPMonitorLevel.ERROR, "falcon_catch_error");

    public C40640g(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.gadget.app_load", i, oPMonitorLevel, str);
    }

    public C40640g(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
