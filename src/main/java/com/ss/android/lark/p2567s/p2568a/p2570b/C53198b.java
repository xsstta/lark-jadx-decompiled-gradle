package com.ss.android.lark.p2567s.p2568a.p2570b;

import com.ss.android.lark.integrator.ccm.C39234b;
import com.ss.android.lark.integrator.ccm.DriveModuleProvider;
import com.ss.android.lark.integrator.ccm.WikiModuleProvider;

/* renamed from: com.ss.android.lark.s.a.b.b */
public final class C53198b {
    /* renamed from: a */
    public static void m205839a(String str) {
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1131972944:
                    if (str.equals("com.ss.android.lark.integrator.ccm.spacekit.LarkSpacekitModule")) {
                        c = 0;
                        break;
                    }
                    break;
                case -722239547:
                    if (str.equals("com.ss.android.lark.integrator.ccm.WikiModuleProvider.WikiModule")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1873137938:
                    if (str.equals("com.ss.android.lark.drive.DriveModule")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C39234b.m154731a();
                    return;
                case 1:
                    WikiModuleProvider.m154718a();
                    return;
                case 2:
                    DriveModuleProvider.f100541a.mo143050a();
                    return;
                default:
                    return;
            }
        }
    }
}
