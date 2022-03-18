package com.ss.android.vc.meeting.module.interpretation.p3127b;

import android.app.Activity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.b.l */
public class C61955l {
    /* renamed from: a */
    public static AbstractC61222a m242063a(Activity activity, C61303k kVar, Boolean bool, Boolean bool2, List<LanguageType> list) {
        if (DesktopUtil.m144307b()) {
            return new SearchLanguageDesktopDialog(activity, kVar, bool.booleanValue(), bool2.booleanValue(), list);
        }
        return new C61954k(activity, kVar, bool, bool2, list);
    }
}
