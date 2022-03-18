package com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentDelegate;", "", "onBackPressed", "", "onDeleteMember", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "onEditMemberAccessRole", "newAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.a.b */
public interface IEditMemberFragmentDelegate {
    /* renamed from: a */
    void mo109964a();

    /* renamed from: a */
    void mo109965a(CalendarMember.C15546a aVar);

    /* renamed from: a */
    void mo109966a(CalendarMember.C15546a aVar, Calendar.AccessRole accessRole);
}
