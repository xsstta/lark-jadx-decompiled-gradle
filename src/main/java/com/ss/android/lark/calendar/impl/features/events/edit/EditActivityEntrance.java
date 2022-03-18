package com.ss.android.lark.calendar.impl.features.events.edit;

import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditDateHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditActivityEntrance;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c */
public final class EditActivityEntrance {

    /* renamed from: a */
    public static final Companion f79940a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final Intent m118928a(Context context, long[] jArr) {
        return f79940a.mo114660a(context, jArr);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118929a(Context context, long j, long j2, String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str2) {
        f79940a.mo114664a(context, j, j2, str, arrayList, arrayList2, str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118930a(Context context, CalendarDate calendarDate, boolean z) {
        f79940a.mo114667a(context, calendarDate, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118931a(Context context, String str, long j, long j2, boolean z) {
        f79940a.mo114669a(context, str, j, j2, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118932a(Context context, String str, String str2, String str3) {
        f79940a.mo114670a(context, str, str2, str3);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m118933a(Context context, String str, String str2, String str3, String str4) {
        f79940a.mo114671a(context, str, str2, str3, str4);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007J\u001e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fJ0\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000fH\u0007J\"\u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u000fH\u0007Jh\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)2\u0006\u0010*\u001a\u00020\u00042\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00040'j\b\u0012\u0004\u0012\u00020\u0004`)2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0004H\u0007J\u0001\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u001a\u0010&\u001a\u0016\u0012\u0004\u0012\u00020(\u0018\u00010'j\n\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`)2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u00042\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`)H\u0007Jj\u00100\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010\u00042\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`)2\u001a\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010'j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`)2\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J(\u00102\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0007J(\u00105\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010\f\u001a\u00020\rH\u0007J0\u0010:\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0007J\u0010\u0010=\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J:\u0010>\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\u001e2\u0006\u0010A\u001a\u00020\u00042\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EJ\"\u0010F\u001a\u00020\t2\b\u0010G\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditActivityEntrance$Companion;", "", "()V", "EDIT_ACTIVITY_KEY_REQUEST_GOTO_DETAIL", "", "EDIT_ACTIVITY_KEY_RESULT_BLOCK_ENTITY", "EDIT_ACTIVITY_KEY_RESULT_NEED_BLOCK_ENTITY", "TAG", "createEvent", "", "context", "Landroid/content/Context;", "requestCode", "", "resultNeedEventBlockEntity", "", "gotoDetailActivity", "createEventAtCalendar", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IAppRouterBuilder;", "kotlin.jvm.PlatformType", "calendarId", "getEditActivityIntentForChipsDrag", "Landroid/content/Intent;", "eventStamp", "", "getEditAppBuilderRouter", "isEdit", "startEditActivity", "summary", "startTime", "", "endTime", "isOpenVideo", "startEditActivityFromAppend", "calendarDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "fromPlusBtn", "startEditActivityFromArrange", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "chatId", "chatterIds", "chatType", "attendeeChatterIds", "eventSummary", "needLoadChatIds", "startEditActivityFromChatArrangeMeeting", "chatIds", "startEditActivityFromCreateEventAppLink", "startTimeStr", "endTimeStr", "startEditActivityFromDetailPage", "eventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "calendarEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "startEditActivityFromEditEventAppLink", "key", "originalTimeStr", "startEditActivityFromEventCreate", "startEditActivityFromSignIn", "eventStartTime", "eventEndTime", "selfChatterId", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "updateEditActivityIntentForTime", "intent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114668a(Context context, CalendarEventInstance calendarEventInstance, CalendarEvent calendarEvent, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(calendarEventInstance, "eventInstance");
            Intrinsics.checkParameterIsNotNull(calendarEvent, "calendarEvent");
            AbstractC30023a a = mo114662a(context, true);
            a.mo108154a("append_from_detail_page", true).mo108152a("calendarInstance", calendarEventInstance);
            LargeCalendarTransmitHelper.m116184a(a, calendarEvent);
            a.mo108155a(context, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114672a(Intent intent, long j, long j2) {
            if (intent != null) {
                intent.putExtra("event_start_time", j);
            }
            if (intent != null) {
                intent.putExtra("event_end_time", j2);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0035 A[SYNTHETIC, Splitter:B:9:0x0035] */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo114670a(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.EditActivityEntrance.Companion.mo114670a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114669a(Context context, String str, long j, long j2, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "summary");
            AbstractC30023a a = mo114662a(context, false).mo108153a("event_summary", str).mo108154a("append_event_is_open_video", z);
            if (j < j2) {
                a.mo108152a("event_start_time", Long.valueOf(j));
                a.mo108152a("event_end_time", Long.valueOf(j2));
            }
            a.mo108156b(context);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114671a(Context context, String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "key");
            Intrinsics.checkParameterIsNotNull(str3, "originalTimeStr");
            Intrinsics.checkParameterIsNotNull(str4, "startTime");
            new EditApplinkEntrance().mo114845a(context, str, str2, str3, str4);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC30023a mo114661a(Context context, String str) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            return mo114662a(context, false).mo108153a("key_param_default_calendar_id", str);
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent mo114660a(Context context, long[] jArr) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(jArr, "eventStamp");
            Intent a = mo114662a(context, false).mo108152a("event_start_time", Long.valueOf(jArr[0])).mo108152a("event_end_time", Long.valueOf(jArr[1])).mo108150a(context);
            Intrinsics.checkExpressionValueIsNotNull(a, "appRouterBuilder.param(\n…Stamp[1]).intent(context)");
            return a;
        }

        /* renamed from: a */
        public final AbstractC30023a mo114662a(Context context, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            if (z) {
                AppreciableHitPoint.f83321a.mo118689g();
            } else {
                AppreciableHitPoint.f83321a.mo118693i();
            }
            AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(EditActivity.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…EditActivity::class.java)");
            return a;
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114667a(Context context, CalendarDate calendarDate, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(calendarDate, "calendarDate");
            mo114662a(context, false).mo108152a("event_start_date", calendarDate).mo108154a("append_from_calendar_append_view", z).mo108156b(context);
        }

        /* renamed from: a */
        public static /* synthetic */ void m118934a(Companion aVar, Context context, CalendarDate calendarDate, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.mo114667a(context, calendarDate, z);
        }

        /* renamed from: a */
        public final void mo114663a(Context context, long j, long j2, String str, CalendarResource calendarResource, CalendarBuilding calendarBuilding) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "selfChatterId");
            AbstractC30023a a = mo114662a(context, false);
            a.mo108152a("event_start_time", Long.valueOf(j));
            a.mo108152a("event_end_time", Long.valueOf(j2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a.mo108152a("calendar_attendee_chatter_ids", arrayList);
            a.mo108153a("edit_hitpoint_action_source", "code_calendar");
            EventMeetingRoomData a2 = EditDateHelper.f79932a.mo114614a(calendarResource, calendarBuilding);
            if (a2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(a2);
                a.mo108152a("key_params_resource_list", arrayList2);
            }
            a.mo108156b(context);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114664a(Context context, long j, long j2, String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str2) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str2, "summary");
            boolean z2 = false;
            AbstractC30023a a = mo114662a(context, false);
            if (str == null) {
                str = "";
            }
            a.mo108153a("chat_id", str).mo108153a("event_summary", str2);
            if (j <= 0 || j2 <= 0) {
                a.mo108152a("event_start_date", new CalendarDate());
            } else {
                a.mo108152a("event_start_time", Long.valueOf(j));
                a.mo108152a("event_end_time", Long.valueOf(j2));
            }
            ArrayList<String> arrayList3 = arrayList;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.mo108152a("calendar_attendee_chat_ids", arrayList);
            }
            ArrayList<String> arrayList4 = arrayList2;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                a.mo108152a("calendar_attendee_chatter_ids", arrayList2);
            }
            a.mo108156b(context);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114665a(Context context, long j, long j2, ArrayList<CalendarEventAttendee> arrayList, String str, ArrayList<String> arrayList2, int i, String str2) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(arrayList, "attendeeList");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(arrayList2, "chatterIds");
            Intrinsics.checkParameterIsNotNull(str2, "chatType");
            mo114662a(context, false).mo108152a("event_start_time", Long.valueOf(j)).mo108152a("event_end_time", Long.valueOf(j2)).mo108152a("calendar_attendees", arrayList).mo108153a("chat_id", str).mo108152a("calendar_attendee_related_chatter_ids", arrayList2).mo108153a("append_chat_type", str2).mo108155a(context, i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo114666a(Context context, long j, long j2, ArrayList<CalendarEventAttendee> arrayList, ArrayList<String> arrayList2, String str, int i, String str2, ArrayList<String> arrayList3) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            Intrinsics.checkParameterIsNotNull(str2, "eventSummary");
            boolean z3 = false;
            AbstractC30023a a = mo114662a(context, false);
            a.mo108152a("event_start_time", Long.valueOf(j)).mo108152a("event_end_time", Long.valueOf(j2)).mo108153a("chat_id", str).mo108153a("event_summary", str2);
            ArrayList<CalendarEventAttendee> arrayList4 = arrayList;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a.mo108152a("calendar_attendees", arrayList);
            }
            ArrayList<String> arrayList5 = arrayList2;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                a.mo108152a("calendar_attendee_related_chatter_ids", arrayList2);
            }
            ArrayList<String> arrayList6 = arrayList3;
            if (arrayList6 == null || arrayList6.isEmpty()) {
                z3 = true;
            }
            if (!z3) {
                a.mo108152a("calendar_attendee_chat_ids", arrayList3);
            }
            a.mo108155a(context, i);
        }
    }
}
