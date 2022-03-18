package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.d */
public class C61949d {
    /* renamed from: a */
    public static AbstractC61222a m242019a(Activity activity, C61303k kVar, Boolean bool) {
        if (DesktopUtil.m144307b()) {
            return new InterpretationManageDesktopDialog(activity, kVar, bool.booleanValue());
        }
        return new C61948c(activity, kVar, bool, !bool.booleanValue());
    }
}
