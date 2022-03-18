package com.ss.android.lark.p2069j.p2070a;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;

/* renamed from: com.ss.android.lark.j.a.o */
public class C40648o extends OPMonitorCode {

    /* renamed from: a */
    public static final C40648o f103131a = new C40648o(10008, OPMonitorLevel.NORMAL, "web_heartbeat");

    public C40648o(int i, OPMonitorLevel oPMonitorLevel, String str) {
        this("client.open_platform.web.lifecycle", i, oPMonitorLevel, str);
    }

    public C40648o(String str, int i, OPMonitorLevel oPMonitorLevel, String str2) {
        super(str, i, oPMonitorLevel, str2);
    }
}
