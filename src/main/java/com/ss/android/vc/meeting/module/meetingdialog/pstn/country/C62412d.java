package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.d */
public class C62412d {
    /* renamed from: a */
    public static AbstractC61222a m243941a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C62409b(activity, kVar);
        }
        return new C62410c(activity, kVar);
    }
}
