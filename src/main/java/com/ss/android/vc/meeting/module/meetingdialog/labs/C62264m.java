package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.labs.preview.C62289a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.preview.C62290b;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.m */
public class C62264m {
    /* renamed from: a */
    public static AbstractC61222a m243164a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C62262k(activity, kVar);
        }
        return new C62263l(activity, kVar);
    }

    /* renamed from: a */
    public static AbstractC61222a m243165a(Activity activity, C61303k kVar, LabsScene labsScene, String str) {
        if (DesktopUtil.m144307b()) {
            return new C62289a(activity, labsScene, str);
        }
        return new C62290b(activity, kVar, labsScene, str);
    }
}
