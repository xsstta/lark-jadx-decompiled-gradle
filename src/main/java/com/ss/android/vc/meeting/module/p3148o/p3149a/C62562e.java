package com.ss.android.vc.meeting.module.p3148o.p3149a;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.o.a.e */
public class C62562e {
    /* renamed from: a */
    public static AbstractC61222a m244734a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new HostAdvancedOptionsDesktopDialog(activity, kVar);
        }
        return new HostAdvancedOptionsDialog(activity, kVar);
    }
}
