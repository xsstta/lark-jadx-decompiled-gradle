package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.servicemodel.setting.IBmSetting;
import com.ss.android.lark.calendar.p1430a.C30022a;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.entity.a */
public class C30803a {

    /* renamed from: a */
    static IBmSetting f77471a = C30022a.f74884c;

    /* renamed from: a */
    public static float m114890a() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_TENTATIVE_LIGHT, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: b */
    public static float m114891b() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_TENTATIVE_DARK, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: c */
    public static float m114892c() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_NEED_ACTION_LIGHT, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: d */
    public static float m114893d() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_NEED_ACTION_DARK, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: e */
    public static float m114894e() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_EVENT_CREATION_BG, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: f */
    public static float m114895f() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_EVENT_CREATION, f77471a.mo108456c().getSkinType());
    }

    /* renamed from: g */
    public static float m114896g() {
        return CalendarSkinColorTool.m124918a(CalendarSkinColorTool.AlphaType.MOBILE_INSTANCE, f77471a.mo108456c().getSkinType());
    }
}
