package com.bytedance.ee.bear.drive.biz.preview.edit;

import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.edit.a */
public class C6568a {
    /* renamed from: a */
    public static void m26288a(C7555f fVar) {
        if (fVar == null) {
            C13479a.m54758a("DriveEditModeSwitch", "onSwitchShow preview viewModel is null");
        } else {
            fVar.liveInnerEditModeSwitchActive().mo5926a((Boolean) true);
        }
    }

    /* renamed from: b */
    public static void m26289b(C7555f fVar) {
        if (fVar == null) {
            C13479a.m54758a("DriveEditModeSwitch", "onSwitchHide preview viewModel is null");
        } else {
            fVar.liveInnerEditModeSwitchActive().mo5926a((Boolean) false);
        }
    }
}
