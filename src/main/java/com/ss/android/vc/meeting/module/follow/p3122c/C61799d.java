package com.ss.android.vc.meeting.module.follow.p3122c;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.follow.c.d */
public class C61799d {
    /* renamed from: a */
    public static AbstractC61222a m241431a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C61797b(activity, kVar);
        }
        return new C61798c(activity, kVar);
    }
}
