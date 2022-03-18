package com.ss.android.vc.meeting.module.p3123g;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.g.d */
public class C61878d {
    /* renamed from: a */
    public static AbstractC61222a m241707a(Activity activity, C61303k kVar, boolean z, boolean z2) {
        if (DesktopUtil.m144307b()) {
            return new SecuritySettingDesktopDialog(activity, kVar, z2);
        }
        return new SecuritySettingDialog(activity, kVar, z, z2);
    }
}
