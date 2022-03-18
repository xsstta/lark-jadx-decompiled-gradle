package com.ss.android.lark.calendar.impl.features.events.edit.listener.view;

import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0011H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0016H&¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/view/IDetailItemListener;", "", "onAddAttendeeClicked", "", "onAttendeeFreeBusyClicked", "onChangeRepeatEnd", "onClickExpandResource", "onDeleteEventBtnClicked", "onHideFeature", "featureId", "", "onLocationClicked", "onMeetingRoomDeleteClicked", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onMeetingRoomItemClicked", "calendarId", "", "onMtRoomScheduleClicked", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onShouldShowFeatureIcon", "", "onShowFeatureFragmentClicked", "onSummaryTextChanged", "summary", "onTimeChosenItemChanged", "isChosenStartTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.b.c.b */
public interface IDetailItemListener {
    /* renamed from: a */
    void mo114359a();

    /* renamed from: a */
    void mo114360a(int i);

    /* renamed from: a */
    void mo114361a(CalendarEventAttendee calendarEventAttendee);

    /* renamed from: a */
    void mo114362a(String str);

    /* renamed from: a */
    void mo114363a(String str, SchemaExtraData.ResourceCustomization resourceCustomization);

    /* renamed from: a */
    void mo114364a(boolean z);

    /* renamed from: b */
    void mo114365b();

    /* renamed from: b */
    void mo114366b(int i);

    /* renamed from: b */
    void mo114367b(String str);

    /* renamed from: c */
    void mo114368c();

    /* renamed from: c */
    boolean mo114369c(int i);

    /* renamed from: d */
    void mo114370d();

    /* renamed from: e */
    void mo114371e();

    /* renamed from: f */
    void mo114372f();
}
