package com.ss.android.lark.calendar.impl.features.meetingroom.base.extension;

import com.ss.android.lark.calendar.impl.features.common.helper.MeetingRoomHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a#\u0010\u0006\u001a\u00020\u0001*\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\n\u001a\n\u0010\u000b\u001a\u00020\u0005*\u00020\u0003\u001a\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r*\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"getResourcePriority", "", "resourceAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "operatorUserId", "", "getResourceReservationStatus", "instanceStartTime", "", "instanceEndTime", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;Ljava/lang/Long;Ljava/lang/Long;)I", "resourceDisplayName", "sortAndFilterMeetingRoom", "", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.a */
public final class C32060a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.a$a */
    static final class C32061a extends Lambda implements Function0<Integer> {
        final /* synthetic */ CalendarEventAttendee $this_getResourceReservationStatus;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32061a(CalendarEventAttendee calendarEventAttendee) {
            super(0);
            this.$this_getResourceReservationStatus = calendarEventAttendee;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            Boolean forceReleased = this.$this_getResourceReservationStatus.getForceReleased();
            Intrinsics.checkExpressionValueIsNotNull(forceReleased, "forceReleased");
            if (forceReleased.booleanValue()) {
                return 3;
            }
            return 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.a$b */
    static final class C32062b extends Lambda implements Function0<Integer> {
        final /* synthetic */ CalendarEventAttendee $this_getResourceReservationStatus;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32062b(CalendarEventAttendee calendarEventAttendee) {
            super(0);
            this.$this_getResourceReservationStatus = calendarEventAttendee;
        }

        /* Return type fixed from 'int' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            SchemaExtraData.BizData bizData;
            SchemaExtraData schemaExtraData = this.$this_getResourceReservationStatus.getSchemaExtraData();
            if (schemaExtraData != null) {
                bizData = C32065c.m121945a(schemaExtraData);
            } else {
                bizData = null;
            }
            if (bizData != null) {
                return 4;
            }
            return 5;
        }
    }

    /* renamed from: a */
    public static final String m121939a(CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$resourceDisplayName");
        String localizedDisplayName = calendarEventAttendee.getLocalizedDisplayName();
        if (localizedDisplayName != null) {
            return localizedDisplayName;
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.a$c */
    public static final class C32063c<T> implements Comparator<CalendarEventAttendee> {

        /* renamed from: a */
        final /* synthetic */ String f81966a;

        C32063c(String str) {
            this.f81966a = str;
        }

        /* renamed from: a */
        public final int compare(CalendarEventAttendee calendarEventAttendee, CalendarEventAttendee calendarEventAttendee2) {
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "o1");
            int a = C32060a.m121938a(calendarEventAttendee, this.f81966a);
            Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee2, "o2");
            return a - C32060a.m121938a(calendarEventAttendee2, this.f81966a);
        }
    }

    /* renamed from: a */
    public static final int m121938a(CalendarEventAttendee calendarEventAttendee, String str) {
        boolean z;
        String str2;
        SchemaExtraData.BizData a;
        if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.NEEDS_ACTION || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.TENTATIVE) {
            z = true;
        } else {
            z = false;
        }
        if (C32065c.m121949a(calendarEventAttendee) && z) {
            SchemaExtraData schemaExtraData = calendarEventAttendee.getSchemaExtraData();
            if (schemaExtraData == null || (a = C32065c.m121945a(schemaExtraData)) == null) {
                str2 = null;
            } else {
                str2 = a.getCreateUserId();
            }
            if (Intrinsics.areEqual(str2, str)) {
                return 0;
            }
            return 1;
        } else if (calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.ACCEPT) {
            return 2;
        } else {
            if (z) {
                return 3;
            }
            return 4;
        }
    }

    /* renamed from: a */
    public static final List<CalendarEventAttendee> m121940a(List<? extends CalendarEventAttendee> list, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "$this$sortAndFilterMeetingRoom");
        Intrinsics.checkParameterIsNotNull(str, "operatorUserId");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (!t2.isResource() || t2.getStatus() == CalendarEventAttendee.Status.REMOVED) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        return CollectionsKt.sortedWith(arrayList, new C32063c(str));
    }

    /* renamed from: a */
    public static final int m121937a(CalendarEventAttendee calendarEventAttendee, Long l, Long l2) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "$this$getResourceReservationStatus");
        boolean a = MeetingRoomHelper.m116191a(l, l2, calendarEventAttendee);
        C32061a aVar = new C32061a(calendarEventAttendee);
        C32062b bVar = new C32062b(calendarEventAttendee);
        CalendarEventAttendee.Status status = calendarEventAttendee.getStatus();
        if (status == CalendarEventAttendee.Status.DECLINE || status == CalendarEventAttendee.Status.REMOVED || a) {
            return ((Number) aVar.invoke()).intValue();
        }
        if (status == CalendarEventAttendee.Status.NEEDS_ACTION || status == CalendarEventAttendee.Status.TENTATIVE) {
            return ((Number) bVar.invoke()).intValue();
        }
        return 0;
    }
}
