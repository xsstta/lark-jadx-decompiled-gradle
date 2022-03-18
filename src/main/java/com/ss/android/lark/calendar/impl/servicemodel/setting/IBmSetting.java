package com.ss.android.lark.calendar.impl.servicemodel.setting;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/servicemodel/setting/IBmSetting;", "", "asyncLoadServerSetting", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "clear", "getSetting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "Lcom/ss/android/lark/calendar/impl/servicemodel/setting/SettingServiceModel$IGetSettingCallback;", "init", "initSetting", "isForbidEventBus", "setIsOnCalendarPage", "isOnCalendarPage", "setIsOnCalendarTab", "setSetting", "setting", "setSettingIfNotInit", "unInit", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.b.b.a */
public interface IBmSetting {
    /* renamed from: a */
    void mo108448a();

    /* renamed from: a */
    void mo108449a(IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo108450a(C30086b.AbstractC30090a aVar);

    /* renamed from: a */
    void mo108451a(CalendarSetting calendarSetting);

    /* renamed from: a */
    void mo108452a(boolean z);

    /* renamed from: b */
    void mo108453b();

    /* renamed from: b */
    void mo108454b(CalendarSetting calendarSetting);

    /* renamed from: b */
    void mo108455b(boolean z);

    @Deprecated(message = "The returned result may be wrong")
    /* renamed from: c */
    CalendarSetting mo108456c();

    /* renamed from: c */
    void mo108457c(boolean z);
}
