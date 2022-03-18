package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/ChosenMeetingRoomModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "calendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;)V", "getCalendarEventAttendee", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "displayText", "", "getDisplayText", "()Ljava/lang/String;", "isDeletable", "", "()Z", "isDisabled", "viewType", "", "getViewType", "()I", "isContentSame", "diffable", "isItemSame", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.b */
public final class ChosenMeetingRoomModel implements BaseModel {

    /* renamed from: a */
    private final int f81838a = 2;

    /* renamed from: b */
    private final CalendarEventAttendee f81839b;

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel
    /* renamed from: a */
    public int mo116760a() {
        return this.f81838a;
    }

    /* renamed from: e */
    public final CalendarEventAttendee mo116794e() {
        return this.f81839b;
    }

    /* renamed from: d */
    public final boolean mo116793d() {
        return this.f81839b.isDisabled();
    }

    /* renamed from: b */
    public final String mo116790b() {
        String localizedDisplayName = this.f81839b.getLocalizedDisplayName();
        if (localizedDisplayName != null) {
            return localizedDisplayName;
        }
        return "";
    }

    /* renamed from: c */
    public final boolean mo116792c() {
        if (this.f81839b.isDeletable() || this.f81839b.isEditable()) {
            return true;
        }
        return false;
    }

    public ChosenMeetingRoomModel(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "calendarEventAttendee");
        this.f81839b = calendarEventAttendee;
    }

    /* renamed from: a */
    public boolean isItemSame(BaseModel baseModel) {
        if (!(baseModel instanceof ChosenMeetingRoomModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.f81839b.getAttendeeCalendarId(), ((ChosenMeetingRoomModel) baseModel).f81839b.getAttendeeCalendarId());
    }

    /* renamed from: b */
    public boolean isContentSame(BaseModel baseModel) {
        if (!(baseModel instanceof ChosenMeetingRoomModel)) {
            return false;
        }
        return Intrinsics.areEqual(this.f81839b, ((ChosenMeetingRoomModel) baseModel).f81839b);
    }
}
