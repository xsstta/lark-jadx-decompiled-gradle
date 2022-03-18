package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.setting.settingdialog.SelectInterpretationDesktopDialog;
import com.ss.android.vc.meeting.module.setting.settingdialog.SelectInterpretationDialog;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.m */
public class C61956m {
    /* renamed from: a */
    public static AbstractC61222a m242064a(Activity activity, C61303k kVar) {
        if (DesktopUtil.m144307b()) {
            return new SelectInterpretationDesktopDialog(activity, kVar);
        }
        return new SelectInterpretationDialog(activity, kVar);
    }
}
