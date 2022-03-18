package com.ss.android.lark.calendar.impl.features.calendars.importcalendar;

import android.view.View;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract;", "", "()V", "IGoogleCalendarSettingModel", "IGoogleCalendarSettingView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a */
public final class ImportCalendarContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingModel;", "Lcom/larksuite/framework/mvp/IModel;", "importGoogleCalendar", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "loadLocalCalendar", "", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a$a */
    public interface IGoogleCalendarSettingModel extends IModel {
        /* renamed from: a */
        Map<String, Boolean> mo109597a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0004H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView$ViewDelegate;", "finishActivity", "", "isNeedSetResult", "", "getFragmentContainerLayout", "Landroid/view/View;", "showBindFailToast", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a$b */
    public interface IGoogleCalendarSettingView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\u0006H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/ImportCalendarContract$IGoogleCalendarSettingView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "importedLocalCalendar", "", "isFromSetting", "onBackPressed", "", "onClickExchangeImport", "onClickGoogleImport", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onClickLocalImport", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.a$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo109601a();

            /* renamed from: b */
            void mo109602b();

            /* renamed from: c */
            boolean mo109603c();

            /* renamed from: d */
            boolean mo109604d();
        }

        /* renamed from: a */
        View mo109598a();

        /* renamed from: a */
        void mo109599a(boolean z);

        /* renamed from: b */
        void mo109600b();
    }
}
