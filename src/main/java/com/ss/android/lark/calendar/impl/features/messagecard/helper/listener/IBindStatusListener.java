package com.ss.android.lark.calendar.impl.features.messagecard.helper.listener;

import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/helper/listener/IBindStatusListener;", "", "refreshActionStatus", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.a */
public interface IBindStatusListener {
    void refreshActionStatus(CalendarEventAttendee.Status status);
}
