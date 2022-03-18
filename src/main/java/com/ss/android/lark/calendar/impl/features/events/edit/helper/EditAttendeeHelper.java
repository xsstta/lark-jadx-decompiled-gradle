package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberPageData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EditAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.p1539b.C32002a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00050\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J2\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\n\u0010\u0013\u001a\u00020\u0005*\u00020\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007*\b\u0012\u0004\u0012\u00020\u00170\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/EditAttendeeHelper;", "", "()V", "getAttendeeComparator", "Ljava/util/Comparator;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getEditSortAttendee", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "showAttendees", "getInitAttendeeViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "cacheGroupMember", "", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "getPriority", "", "attendee", "transfer2CalendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "transfer2CalendarEventAttendeeList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.c */
public final class EditAttendeeHelper {

    /* renamed from: a */
    public static final EditAttendeeHelper f79930a = new EditAttendeeHelper();

    private EditAttendeeHelper() {
    }

    /* renamed from: a */
    private final Comparator<CalendarEventAttendee> m118844a() {
        return C31536a.f79931a;
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo114608a(ArrayList<CalendarEventAttendee> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "showAttendees");
        return new ArrayList<>(CollectionsKt.sortedWith(arrayList, m118844a()));
    }

    /* renamed from: a */
    public final int mo114606a(CalendarEventAttendee calendarEventAttendee) {
        if (calendarEventAttendee.isGroup()) {
            return 0;
        }
        if (calendarEventAttendee.isOrganizer()) {
            return 1;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.ACCEPT) {
            return 2;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.TENTATIVE) {
            return 3;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.DECLINE) {
            return 4;
        }
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION) {
            return 5;
        }
        return HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
    }

    /* renamed from: a */
    public final CalendarEventAttendee mo114607a(EventMeetingRoomData eventMeetingRoomData) {
        CalendarSchemaCollection calendarSchemaCollection;
        Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "$this$transfer2CalendarEventAttendee");
        CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
        String mCalendarId$calendar_impl_release = eventMeetingRoomData.getMCalendarId$calendar_impl_release();
        if (mCalendarId$calendar_impl_release == null) {
            mCalendarId$calendar_impl_release = "";
        }
        calendarEventAttendee.setAttendeeCalendarId(mCalendarId$calendar_impl_release);
        calendarEventAttendee.setKey(eventMeetingRoomData.getMKey$calendar_impl_release());
        calendarEventAttendee.setOriginalTime(eventMeetingRoomData.getMOriginalTime$calendar_impl_release());
        calendarEventAttendee.setDisplayName(eventMeetingRoomData.getMDisplayText$calendar_impl_release());
        calendarEventAttendee.setLocalizedDisplayName(eventMeetingRoomData.getMDisplayText$calendar_impl_release());
        calendarEventAttendee.setId("");
        calendarEventAttendee.setIsOptional(false);
        calendarEventAttendee.setIsOrganizer(false);
        calendarEventAttendee.setIsResource(true);
        calendarEventAttendee.setTenantId(eventMeetingRoomData.getMTenantId$calendar_impl_release());
        calendarEventAttendee.setStatus(eventMeetingRoomData.getMStatus$calendar_impl_release());
        calendarEventAttendee.setDeletable(eventMeetingRoomData.getMDeletable$calendar_impl_release());
        CalendarResource calendarResource = eventMeetingRoomData.getCalendarResource();
        SchemaExtraData schemaExtraData = null;
        if (calendarResource != null) {
            calendarSchemaCollection = calendarResource.getResourceSchema();
        } else {
            calendarSchemaCollection = null;
        }
        calendarEventAttendee.setSchemaCollection(calendarSchemaCollection);
        CalendarResource calendarResource2 = eventMeetingRoomData.getCalendarResource();
        if (calendarResource2 != null) {
            schemaExtraData = calendarResource2.getSchemaExtraData();
        }
        calendarEventAttendee.setSchemaExtraData(schemaExtraData);
        return calendarEventAttendee;
    }

    /* renamed from: a */
    public final ArrayList<CalendarEventAttendee> mo114610a(List<AppendResourceData> list) {
        Intrinsics.checkParameterIsNotNull(list, "$this$transfer2CalendarEventAttendeeList");
        List<AppendResourceData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(C32002a.m121827a(it.next()));
        }
        return new ArrayList<>(arrayList);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "firstAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "kotlin.jvm.PlatformType", "secondAttendee", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.c$a */
    public static final class C31536a<T> implements Comparator<CalendarEventAttendee> {

        /* renamed from: a */
        public static final C31536a f79931a = new C31536a();

        C31536a() {
        }

        /* renamed from: a */
        public final int compare(CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2) {
            EditAttendeeHelper cVar = EditAttendeeHelper.f79930a;
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "firstAttendee");
            int a = cVar.mo114606a(calendarEventAttendee);
            EditAttendeeHelper cVar2 = EditAttendeeHelper.f79930a;
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "secondAttendee");
            int a2 = a - cVar2.mo114606a(calendarEventAttendee2);
            if (a2 != 0) {
                return a2;
            }
            return Collator.getInstance(Locale.CHINA).compare(calendarEventAttendee.getLocalizedDisplayName(), calendarEventAttendee2.getLocalizedDisplayName());
        }
    }

    /* renamed from: a */
    public final ArrayList<EditAttendeeViewData> mo114609a(ArrayList<CalendarEventAttendee> arrayList, Map<String, GroupMemberPageData> map) {
        GroupMemberPageData bVar;
        Intrinsics.checkParameterIsNotNull(arrayList, "showAttendees");
        ArrayList<EditAttendeeViewData> arrayList2 = new ArrayList<>();
        for (T t : arrayList) {
            List<CalendarEventAttendee> list = null;
            List<CalendarEventAttendee> list2 = null;
            if (t.isGroup()) {
                if (!(map == null || (bVar = map.get(t.getGroupId())) == null)) {
                    list = bVar.mo113182c();
                }
                list2 = list;
            }
            arrayList2.add(new EditAttendeeViewData(t, false, list2));
        }
        return arrayList2;
    }
}
