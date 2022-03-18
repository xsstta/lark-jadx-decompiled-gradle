package com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "", "getCalendarId", "", "getCalendarShareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "isEditLocal", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a.d */
public interface IShareOptionFragmentData {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a.d$a */
    public static final class C30473a {
        /* renamed from: a */
        public static boolean m113256a(IShareOptionFragmentData dVar) {
            return false;
        }
    }

    /* renamed from: a */
    String mo109360a();

    /* renamed from: b */
    Calendar.CalendarShareOptions mo109361b();

    /* renamed from: c */
    CalendarTenantInfo mo109362c();

    /* renamed from: d */
    boolean mo109363d();
}
