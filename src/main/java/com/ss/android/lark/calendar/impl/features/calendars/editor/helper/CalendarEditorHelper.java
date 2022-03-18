package com.ss.android.lark.calendar.impl.features.calendars.editor.helper;

import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/helper/CalendarEditorHelper;", "", "()V", "getAvatarEntityId", "", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "getPbAvatarEntityId", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "getPbBuilderAvatarEntityId", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b.a */
public final class CalendarEditorHelper {

    /* renamed from: a */
    public static final CalendarEditorHelper f75910a = new CalendarEditorHelper();

    private CalendarEditorHelper() {
    }

    /* renamed from: a */
    public final String mo109490a(CalendarMember.C15546a aVar) {
        CalendarMember.CalendarMemberType calendarMemberType;
        if (aVar == null || (calendarMemberType = aVar.f41222j) == null) {
            return "";
        }
        int i = C30308b.f75913c[calendarMemberType.ordinal()];
        if (i == 1) {
            return aVar.f41215c;
        }
        if (i != 2) {
            return "";
        }
        return aVar.f41223k;
    }

    /* renamed from: a */
    public final String mo109491a(CalendarMember calendarMember) {
        CalendarMember.CalendarMemberType calendarMemberType;
        if (calendarMember == null || (calendarMemberType = calendarMember.member_type) == null) {
            return "";
        }
        int i = C30308b.f75912b[calendarMemberType.ordinal()];
        if (i == 1) {
            return calendarMember.user_id;
        }
        if (i != 2) {
            return "";
        }
        return calendarMember.chat_id;
    }

    /* renamed from: a */
    public final String mo109492a(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember calendarMember) {
        CalendarMember.CalendarMemberType memberType;
        if (calendarMember == null || (memberType = calendarMember.getMemberType()) == null) {
            return "";
        }
        int i = C30308b.f75911a[memberType.ordinal()];
        if (i == 1) {
            return calendarMember.getUserId();
        }
        if (i != 2) {
            return "";
        }
        return calendarMember.getChatId();
    }
}
