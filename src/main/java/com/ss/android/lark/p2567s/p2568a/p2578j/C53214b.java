package com.ss.android.lark.p2567s.p2568a.p2578j;

import com.ss.android.lark.integrator.minutes.C39876a;
import com.ss.android.lark.integrator.p2017d.C39399a;
import com.ss.android.lark.integrator.voip.VoIpModuleProvider;
import com.ss.android.lark.vcintegrator.VideoChatModuleProvider;

/* renamed from: com.ss.android.lark.s.a.j.b */
public final class C53214b {
    /* renamed from: a */
    public static void m205847a(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1055400998:
                    if (str.equals("com.ss.android.lark.live.LiveModule")) {
                        c = 0;
                        break;
                    }
                    break;
                case -828362630:
                    if (str.equals("com.ss.android.lark.voip.VoIpModule")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1449414598:
                    if (str.equals("com.ss.android.lark.vcintegrator.VideoChatModuleProvider")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1652899802:
                    if (str.equals("com.ss.android.lark.mm.MmModule")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C39399a.m155624a();
                    return;
                case 1:
                    VoIpModuleProvider.m158862a();
                    return;
                case 2:
                    VideoChatModuleProvider.doInit();
                    return;
                case 3:
                    C39876a.m158359b();
                    return;
                default:
                    return;
            }
        }
    }
}
