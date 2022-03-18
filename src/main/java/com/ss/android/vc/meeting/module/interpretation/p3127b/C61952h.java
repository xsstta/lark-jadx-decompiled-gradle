package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.h */
public class C61952h {
    /* renamed from: a */
    public static AbstractC61222a m242038a(Activity activity, C61303k kVar, Boolean bool) {
        if (DesktopUtil.m144307b()) {
            return new InterpreterSelectDesktopDialog(activity, kVar, bool.booleanValue());
        }
        return new C61951g(activity, kVar, bool);
    }
}
