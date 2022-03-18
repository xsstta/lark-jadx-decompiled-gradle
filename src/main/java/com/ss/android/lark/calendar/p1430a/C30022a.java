package com.ss.android.lark.calendar.p1430a;

import com.ss.android.lark.calendar.impl.features.common.featureswitch.CalendarFeatureGating;
import com.ss.android.lark.calendar.impl.features.common.featureswitch.CalendarFeatureSwitch;
import com.ss.android.lark.calendar.impl.features.common.featureswitch.CalendarLeanModeGating;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.calendar.a.a */
public class C30022a {

    /* renamed from: a */
    public static AbstractC30060b f74882a = ((AbstractC30060b) ApiUtils.getApi(AbstractC30060b.class));

    /* renamed from: b */
    public static CalendarFeatureGating f74883b = new CalendarFeatureGating();

    /* renamed from: c */
    public static IBmSetting f74884c = new C30086b();

    /* renamed from: d */
    public static CalendarFeatureSwitch f74885d = new CalendarFeatureSwitch();

    /* renamed from: e */
    public static CalendarLeanModeGating f74886e = new CalendarLeanModeGating();
}
