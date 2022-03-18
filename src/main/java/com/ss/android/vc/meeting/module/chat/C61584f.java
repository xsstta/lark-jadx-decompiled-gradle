package com.ss.android.vc.meeting.module.chat;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;

/* renamed from: com.ss.android.vc.meeting.module.chat.f */
public class C61584f {
    /* renamed from: a */
    public static AbstractC61222a m240416a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new C61582d(activity, kVar);
        }
        return new C61583e(activity, kVar);
    }
}
