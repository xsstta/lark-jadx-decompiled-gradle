package com.ss.android.vc.meeting.module.meetingdialog.pstn;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.c */
public class C62398c {
    /* renamed from: a */
    public static AbstractC61222a m243874a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C62396a(activity, kVar);
        }
        return new C62397b(activity, kVar);
    }
}
