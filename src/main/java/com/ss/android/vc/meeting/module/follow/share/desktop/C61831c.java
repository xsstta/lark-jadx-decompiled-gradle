package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.follow.share.desktop.c */
public class C61831c {
    /* renamed from: a */
    public static AbstractC61222a m241560a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C61829a(activity, kVar);
        }
        return new C61830b(activity, kVar);
    }
}
