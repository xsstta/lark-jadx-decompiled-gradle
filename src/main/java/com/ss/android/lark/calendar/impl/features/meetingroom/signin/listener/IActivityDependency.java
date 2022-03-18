package com.ss.android.lark.calendar.impl.features.meetingroom.signin.listener;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J4\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/listener/IActivityDependency;", "", "finishActivity", "", "getActivity", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "openActivateWebPage", "url", "", "openProfileByChatterId", BottomDialog.f17198f, "routeEditActivity", "eventStartTime", "", "eventEndTime", "selfChatterId", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "routeLookActivity", "calendarId", "routeMtRoomProfileActivity", "resourceCalendarId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.c.a */
public interface IActivityDependency {
    /* renamed from: a */
    void mo117337a();

    /* renamed from: a */
    void mo117338a(long j, long j2, String str, CalendarResource calendarResource, CalendarBuilding calendarBuilding);

    /* renamed from: a */
    void mo117339a(String str);

    /* renamed from: a */
    void mo117340a(String str, CalendarResource calendarResource, CalendarBuilding calendarBuilding);

    /* renamed from: b */
    void mo117341b(String str);

    /* renamed from: c */
    void mo117342c(String str);
}
