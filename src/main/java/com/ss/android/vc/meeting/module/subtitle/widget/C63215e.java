package com.ss.android.vc.meeting.module.subtitle.widget;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.widget.e */
public class C63215e {
    /* renamed from: a */
    public static AbstractC61222a m247567a(Activity activity, C61303k kVar, String str) {
        if (DesktopUtil.m144307b()) {
            return new C63213c(activity, kVar, str);
        }
        return new C63214d(activity, kVar, true, str);
    }
}
