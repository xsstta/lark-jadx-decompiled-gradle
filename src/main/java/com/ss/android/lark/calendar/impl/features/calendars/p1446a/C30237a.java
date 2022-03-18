package com.ss.android.lark.calendar.impl.features.calendars.p1446a;

import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarCoverImageSet;
import com.bytedance.lark.pb.calendar.v1.CalendarLocation;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.CalendarWithMembers;
import com.bytedance.lark.pb.calendar.v1.EventInfoInstances;
import com.bytedance.lark.pb.calendar.v1.InstanceSpan;
import com.bytedance.lark.pb.calendar.v1.UserEventVisibility;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a&\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\n\u001a\f\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\u000e\u001a\f\u0010\u0017\u001a\u0004\u0018\u00010\u0005*\u00020\u000e\u001a\f\u0010\u0018\u001a\u0004\u0018\u00010\u0005*\u00020\n\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u0005*\u00020\u000e\u001a\u0012\u0010\u001a\u001a\u00020\u001b*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\f\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u0014\u001a\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\u001e\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u0011\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u0010\"\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u0010#\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u0010$\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\n\u0010%\u001a\u00020\u0001*\u00020\u000e\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010(\u001a\n\u0010)\u001a\u00020\u0001*\u00020\u000e\u001a\u0011\u0010*\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u0010+\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\n\u0010,\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010-\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010.\u001a\u00020\u0001*\u00020\u000e\u001a\u0014\u0010/\u001a\u00020\u0001*\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0005\u001a\u0014\u00100\u001a\u00020\u0001*\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u0005\u001a\n\u00101\u001a\u00020\u0001*\u00020\u000e\u001a\u0011\u00102\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u00103\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\u0011\u00104\u001a\u0004\u0018\u00010\u0001*\u00020\u000e¢\u0006\u0002\u0010!\u001a\n\u00105\u001a\u00020\u0001*\u00020\u0011\u001a\f\u00106\u001a\u0004\u0018\u00010\u0005*\u000207¨\u00068"}, d2 = {"equalTo", "", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "other", "getAllDayInfo", "", "Lcom/bytedance/lark/pb/calendar/v1/InstanceSpan;", "instanceDay", "", "getCalendarOwner", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarWithMembers;", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "getCalendarOwnerOrManager", "getDesc", "Lcom/bytedance/lark/pb/calendar/v1/EventInfoInstances;", "span", "resource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "getEntityId", "getNoteOrSummary", "getOriginCoverKey", "getShowingName", "getShowingSummary", "getStartDateAt", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getSummary", "", "getWholeTimeForList", "isAllDay", "isColorEditable", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;)Ljava/lang/Boolean;", "isCoverEditable", "isDeletable", "isDescriptionEditable", "isEditable", "isExternal", "currentTenantId", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;Ljava/lang/String;)Ljava/lang/Boolean;", "isMeetingRoom", "isMemberEditable", "isNoteEditable", "isOfficial", "isPrimary", "isReadable", "isShowExternalLabel", "isShowExternalSubscriber", "isShowSubscriberCount", "isSummaryEditable", "isUnsubscribable", "isVisibilityEditable", "isVisible", "string", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.a.a */
public final class C30237a {
    /* renamed from: a */
    public static final boolean m112294a(Calendar.CalendarShareOptions calendarShareOptions, Calendar.CalendarShareOptions calendarShareOptions2) {
        if (!Intrinsics.areEqual(calendarShareOptions, calendarShareOptions2)) {
            if (calendarShareOptions == null || calendarShareOptions2 == null) {
                if (!(calendarShareOptions == null && calendarShareOptions2 == null)) {
                    return false;
                }
            } else if (!(calendarShareOptions.default_share_option == calendarShareOptions2.default_share_option && calendarShareOptions.cross_default_share_option == calendarShareOptions2.cross_default_share_option && calendarShareOptions.cross_top_share_option == calendarShareOptions2.cross_top_share_option)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m112296a(EventInfoInstances eventInfoInstances) {
        Intrinsics.checkParameterIsNotNull(eventInfoInstances, "$this$isVisible");
        return eventInfoInstances.event_visibility == UserEventVisibility.READER || eventInfoInstances.event_visibility == UserEventVisibility.BUSY_READER;
    }

    /* renamed from: a */
    public static final String m112293a(InstanceSpan instanceSpan, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(instanceSpan, "$this$getWholeTimeForList");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long l = instanceSpan.start_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "start_time");
        long millis = timeUnit.toMillis(l.longValue());
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        Long l2 = instanceSpan.end_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "end_time");
        long millis2 = timeUnit2.toMillis(l2.longValue());
        int intValue = instanceSpan.end_day.intValue();
        Integer num = instanceSpan.start_day;
        Intrinsics.checkExpressionValueIsNotNull(num, "start_day");
        Integer num2 = instanceSpan.start_day;
        Intrinsics.checkExpressionValueIsNotNull(num2, "start_day");
        String a = C32646c.m125250a(millis, millis2, z, (intValue - num.intValue()) + 1, (i - num2.intValue()) + 1, true);
        return a != null ? a : "";
    }

    /* renamed from: a */
    public static final boolean m112295a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isPrimary");
        if (calendar.type == Calendar.Type.PRIMARY) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m112307g(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isShowSubscriberCount");
        if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m112290a(CalendarMember calendarMember) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarMember, "$this$getShowingName");
        String str = calendarMember.localized_name;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return calendarMember.name;
        }
        return calendarMember.localized_name;
    }

    /* renamed from: b */
    public static final String m112298b(CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "$this$getEntityId");
        CalendarMember.CalendarMemberType calendarMemberType = calendarMember.member_type;
        if (calendarMemberType != null) {
            int i = C30238b.f75591b[calendarMemberType.ordinal()];
            if (i == 1) {
                return calendarMember.user_id;
            }
            if (i == 2) {
                return calendarMember.chat_id;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m112302c(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isOfficial");
        if (calendar.official_type == null || calendar.official_type == Calendar.OfficialType.NOT_OFFICIAL) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m112306f(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isEditable");
        if (calendar.self_access_role == Calendar.AccessRole.WRITER || calendar.self_access_role == Calendar.AccessRole.OWNER) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final String m112308h(Calendar calendar) {
        Image image;
        String str;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$getOriginCoverKey");
        CalendarCoverImageSet calendarCoverImageSet = calendar.cover_image_set;
        if (calendarCoverImageSet != null && (image = calendarCoverImageSet.origin) != null && (str = image.key) != null) {
            return str;
        }
        CalendarCoverImageSet calendarCoverImageSet2 = calendar.cover_image_set;
        if (calendarCoverImageSet2 != null) {
            return calendarCoverImageSet2.key;
        }
        return null;
    }

    /* renamed from: i */
    public static final Boolean m112309i(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isCoverEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_cover_image_editable;
    }

    /* renamed from: j */
    public static final Boolean m112310j(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isSummaryEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_summary_editable;
    }

    /* renamed from: k */
    public static final Boolean m112311k(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isNoteEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_note_editable;
    }

    /* renamed from: l */
    public static final Boolean m112312l(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isVisibilityEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_visibility_editable;
    }

    /* renamed from: m */
    public static final Boolean m112313m(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isColorEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_color_editable;
    }

    /* renamed from: n */
    public static final Boolean m112314n(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isDescriptionEditable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_discription_editable;
    }

    /* renamed from: o */
    public static final Boolean m112315o(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isUnsubscribable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_unsubscribable;
    }

    /* renamed from: p */
    public static final Boolean m112316p(Calendar calendar) {
        Calendar.CalendarEditAuthInfo calendarEditAuthInfo;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isDeletable");
        Calendar.CalendarAuthInfo calendarAuthInfo = calendar.auth_info;
        if (calendarAuthInfo == null || (calendarEditAuthInfo = calendarAuthInfo.edit_auth_info) == null) {
            return null;
        }
        return calendarEditAuthInfo.is_deletable;
    }

    /* renamed from: b */
    public static final boolean m112300b(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isMeetingRoom");
        if (calendar.type == Calendar.Type.RESOURCES || calendar.type == Calendar.Type.GOOGLE_RESOURCE) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final String m112304d(Calendar calendar) {
        String str;
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$getShowingSummary");
        if ((m112295a(calendar) || m112300b(calendar)) && (str = calendar.localized_summary) != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return calendar.localized_summary;
            }
        }
        return calendar.summary;
    }

    /* renamed from: e */
    public static final String m112305e(Calendar calendar) {
        String str;
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$getNoteOrSummary");
        if (!C30022a.f74883b.mo112688B() && (str = calendar.note) != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return calendar.note;
            }
        }
        return m112304d(calendar);
    }

    /* renamed from: a */
    public static final CharSequence m112288a(CalendarResource calendarResource) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarResource, "$this$getSummary");
        String str = calendarResource.floor_name;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return calendarResource.name;
        }
        String str2 = calendarResource.name;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            return calendarResource.floor_name;
        }
        return calendarResource.floor_name + '-' + calendarResource.name;
    }

    /* renamed from: a */
    public static final String m112289a(Calendar.AccessRole accessRole) {
        Integer num;
        Intrinsics.checkParameterIsNotNull(accessRole, "$this$string");
        if (accessRole == Calendar.AccessRole.FREE_BUSY_READER) {
            num = Integer.valueOf((int) R.string.Calendar_Share_Guest_Option);
        } else if (accessRole == Calendar.AccessRole.READER) {
            num = Integer.valueOf((int) R.string.Calendar_Share_Follower_Option);
        } else if (accessRole == Calendar.AccessRole.WRITER) {
            num = Integer.valueOf((int) R.string.Calendar_Share_Editor_Option);
        } else if (accessRole == Calendar.AccessRole.OWNER) {
            num = Integer.valueOf((int) R.string.Calendar_Share_Administrator_Option);
        } else {
            num = null;
        }
        if (num != null) {
            return C32634ae.m125182b(num.intValue());
        }
        return null;
    }

    /* renamed from: a */
    public static final Boolean m112287a(Calendar calendar, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isExternal");
        String str2 = str;
        boolean z2 = false;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str3 = calendar.calendar_tenant_id;
        if (str3 == null || str3.length() == 0) {
            z2 = true;
        }
        if (z2 || Intrinsics.areEqual(calendar.calendar_tenant_id, "0")) {
            return null;
        }
        return Boolean.valueOf(!Intrinsics.areEqual(str, calendar.calendar_tenant_id));
    }

    /* renamed from: c */
    public static final boolean m112303c(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isShowExternalSubscriber");
        if (calendar.self_access_role == Calendar.AccessRole.OWNER && calendar.type == Calendar.Type.PRIMARY && (Intrinsics.areEqual((Object) m112287a(calendar, str), (Object) true) || Intrinsics.areEqual((Object) calendar.is_cross_tenant, (Object) true))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final CalendarMember m112285a(List<CalendarWithMembers> list, Calendar calendar) {
        Object obj;
        T t;
        List<CalendarMember> list2;
        Intrinsics.checkParameterIsNotNull(list, "$this$getCalendarOwner");
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.calendar_id, calendar.server_id)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            list2 = t2.calendar_members;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            return null;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            CalendarMember calendarMember = (CalendarMember) next;
            Intrinsics.checkExpressionValueIsNotNull(calendarMember, "it");
            if (Intrinsics.areEqual(m112298b(calendarMember), calendar.calendar_owner_id)) {
                obj = next;
                break;
            }
        }
        return (CalendarMember) obj;
    }

    /* renamed from: b */
    public static final String m112299b(InstanceSpan instanceSpan, int i) {
        Intrinsics.checkParameterIsNotNull(instanceSpan, "$this$getAllDayInfo");
        int intValue = instanceSpan.end_day.intValue();
        Integer num = instanceSpan.start_day;
        Intrinsics.checkExpressionValueIsNotNull(num, "start_day");
        int intValue2 = (intValue - num.intValue()) + 1;
        if (intValue2 <= 1) {
            return "";
        }
        int intValue3 = instanceSpan.start_day.intValue();
        Integer num2 = instanceSpan.end_day;
        Intrinsics.checkExpressionValueIsNotNull(num2, "end_day");
        int intValue4 = num2.intValue();
        if (intValue3 > i || intValue4 < i) {
            return "";
        }
        Integer num3 = instanceSpan.start_day;
        Intrinsics.checkExpressionValueIsNotNull(num3, "start_day");
        String a = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_View_AlldayInfo, MapsKt.mapOf(TuplesKt.to("day", String.valueOf((i - num3.intValue()) + 1)), TuplesKt.to("total", String.valueOf(intValue2))));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…ew_AlldayInfo, allDayMap)");
        return a;
    }

    /* renamed from: a */
    public static final CalendarDate m112286a(InstanceSpan instanceSpan, int i) {
        long j;
        Intrinsics.checkParameterIsNotNull(instanceSpan, "$this$getStartDateAt");
        CalendarDate calendarDate = new CalendarDate();
        Long l = instanceSpan.start_time;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        CalendarDate timeInSeconds = calendarDate.setTimeInSeconds(j);
        if (Intrinsics.areEqual(instanceSpan.start_day, instanceSpan.end_day)) {
            Intrinsics.checkExpressionValueIsNotNull(timeInSeconds, "startDate");
            return timeInSeconds;
        }
        Integer num = instanceSpan.start_day;
        if (num != null && i == num.intValue()) {
            Intrinsics.checkExpressionValueIsNotNull(timeInSeconds, "startDate");
            return timeInSeconds;
        }
        int intValue = instanceSpan.start_day.intValue() + 1;
        Integer num2 = instanceSpan.end_day;
        Intrinsics.checkExpressionValueIsNotNull(num2, "end_day");
        int intValue2 = num2.intValue();
        if (intValue <= i && intValue2 >= i) {
            CalendarDate moveThisDateToDayStart = new CalendarDate().setJulianDay(i).moveThisDateToDayStart();
            Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "CalendarDate().setJulian….moveThisDateToDayStart()");
            return moveThisDateToDayStart;
        }
        Intrinsics.checkExpressionValueIsNotNull(timeInSeconds, "startDate");
        return timeInSeconds;
    }

    /* renamed from: b */
    public static final CalendarMember m112297b(List<CalendarWithMembers> list, Calendar calendar) {
        Object obj;
        T t;
        List<CalendarMember> list2;
        CalendarMember calendarMember;
        boolean z;
        Object obj2;
        Intrinsics.checkParameterIsNotNull(list, "$this$getCalendarOwnerOrManager");
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.calendar_id, calendar.server_id)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            list2 = t2.calendar_members;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                CalendarMember calendarMember2 = (CalendarMember) obj2;
                Intrinsics.checkExpressionValueIsNotNull(calendarMember2, "it");
                if (Intrinsics.areEqual(m112298b(calendarMember2), calendar.calendar_owner_id)) {
                    break;
                }
            }
            calendarMember = (CalendarMember) obj2;
        } else {
            calendarMember = null;
        }
        if (calendarMember != null) {
            return calendarMember;
        }
        if (list2 == null) {
            return null;
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((CalendarMember) next).access_role == Calendar.AccessRole.OWNER) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (CalendarMember) obj;
    }

    /* renamed from: b */
    public static final boolean m112301b(Calendar calendar, String str) {
        Intrinsics.checkParameterIsNotNull(calendar, "$this$isShowExternalLabel");
        Calendar.Type type = calendar.type;
        if (type == null) {
            return false;
        }
        int i = C30238b.f75590a[type.ordinal()];
        if (i == 1 || i == 2) {
            if (Intrinsics.areEqual((Object) m112287a(calendar, str), (Object) true) || Intrinsics.areEqual((Object) calendar.is_cross_tenant, (Object) true)) {
                return true;
            }
            return false;
        } else if (i != 3) {
            return false;
        } else {
            return Intrinsics.areEqual((Object) m112287a(calendar, str), (Object) true);
        }
    }

    /* renamed from: a */
    public static final String m112291a(EventInfoInstances eventInfoInstances, InstanceSpan instanceSpan, int i) {
        String str;
        Intrinsics.checkParameterIsNotNull(eventInfoInstances, "$this$getSummary");
        Intrinsics.checkParameterIsNotNull(instanceSpan, "span");
        UserEventVisibility userEventVisibility = eventInfoInstances.event_visibility;
        if (userEventVisibility != null) {
            int i2 = C30238b.f75592c[userEventVisibility.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                StringBuilder sb = new StringBuilder();
                String str2 = eventInfoInstances.summary;
                if (!(str2 == null || str2.length() == 0)) {
                    z = false;
                }
                if (z) {
                    str = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
                } else {
                    str = eventInfoInstances.summary;
                }
                sb.append(str);
                sb.append(m112299b(instanceSpan, i));
                return sb.toString();
            } else if (i2 == 2) {
                return C32634ae.m125182b(R.string.Calendar_Detail_Busy);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final String m112292a(EventInfoInstances eventInfoInstances, InstanceSpan instanceSpan, int i, CalendarResource calendarResource) {
        String str;
        CalendarLocation calendarLocation;
        Intrinsics.checkParameterIsNotNull(eventInfoInstances, "$this$getDesc");
        Intrinsics.checkParameterIsNotNull(instanceSpan, "span");
        boolean z = true;
        String a = m112293a(instanceSpan, i, Intrinsics.areEqual((Object) eventInfoInstances.is_all_day, (Object) true));
        UserEventVisibility userEventVisibility = eventInfoInstances.event_visibility;
        String str2 = null;
        if (userEventVisibility != null) {
            int i2 = C30238b.f75593d[userEventVisibility.ordinal()];
            if (i2 == 1) {
                if (calendarResource == null || (str = m112288a(calendarResource)) == null) {
                    List<CalendarLocation> list = eventInfoInstances.locations;
                    if (!(list == null || (calendarLocation = (CalendarLocation) CollectionsKt.firstOrNull((List) list)) == null)) {
                        str2 = calendarLocation.location;
                    }
                    str = str2;
                }
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z) {
                    return a;
                }
                return a + " · " + str;
            } else if (i2 == 2) {
                return a;
            }
        }
        return null;
    }
}
