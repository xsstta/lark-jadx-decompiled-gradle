package com.ss.android.lark.calendar.impl.features.calendars.share.helper;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J)\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u001eH\u0007J\u000e\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u001fH\u0007¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/helper/CalendarShareDataHelper;", "", "()V", "getMemberPriority", "", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "selfId", "", "ownerId", "isExternalCalendar", "", "calendarTenantId", "isCrossTenant", ShareHitPoint.f121869d, "Lcom/bytedance/lark/pb/calendar/v1/Calendar$Type;", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/bytedance/lark/pb/calendar/v1/Calendar$Type;)Z", "isMemberSameTenant", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "isSameCalendarMember", "firstMember", "secondMember", "sortCalendarMemberList", "", "originalMembers", "", "transformShareOption2AccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "shareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$ShareOption;", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.c.a */
public final class CalendarShareDataHelper {

    /* renamed from: a */
    public static final CalendarShareDataHelper f76316a = new CalendarShareDataHelper();

    private CalendarShareDataHelper() {
    }

    /* renamed from: a */
    public final Calendar.AccessRole mo110021a(Calendar.ShareOption shareOption) {
        if (shareOption != null) {
            int i = C30503b.f76319a[shareOption.ordinal()];
            if (i == 1) {
                return Calendar.AccessRole.OWNER;
            }
            if (i == 2) {
                return Calendar.AccessRole.WRITER;
            }
            if (i == 3) {
                return Calendar.AccessRole.READER;
            }
        }
        return Calendar.AccessRole.FREE_BUSY_READER;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m113341a(com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        CalendarShareDataHelper aVar = f76316a;
        String tenantId = calendar.getTenantId();
        Boolean valueOf = Boolean.valueOf(calendar.getIsCrossTenant());
        Calendar.Type type = calendar.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, ShareHitPoint.f121869d);
        return aVar.mo110025a(tenantId, valueOf, Calendar.Type.fromValue(type.getNumber()));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.c.a$a */
    static final class C30502a<T> implements Comparator<CalendarMember> {

        /* renamed from: a */
        final /* synthetic */ String f76317a;

        /* renamed from: b */
        final /* synthetic */ String f76318b;

        C30502a(String str, String str2) {
            this.f76317a = str;
            this.f76318b = str2;
        }

        /* renamed from: a */
        public final int compare(CalendarMember calendarMember, CalendarMember calendarMember2) {
            CalendarShareDataHelper aVar = CalendarShareDataHelper.f76316a;
            Intrinsics.checkExpressionValueIsNotNull(calendarMember, "o1");
            String str = this.f76317a;
            Intrinsics.checkExpressionValueIsNotNull(str, "selfId");
            int a = aVar.mo110020a(calendarMember, str, this.f76318b);
            CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
            Intrinsics.checkExpressionValueIsNotNull(calendarMember2, "o2");
            String str2 = this.f76317a;
            Intrinsics.checkExpressionValueIsNotNull(str2, "selfId");
            return a - aVar2.mo110020a(calendarMember2, str2, this.f76318b);
        }
    }

    /* renamed from: a */
    public final List<CalendarMember> mo110022a(List<CalendarMember> list, String str) {
        Intrinsics.checkParameterIsNotNull(list, "originalMembers");
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        return CollectionsKt.toMutableList((Collection) CollectionsKt.sortedWith(list, new C30502a(loginDependency.mo108269a(), str)));
    }

    /* renamed from: a */
    public final boolean mo110023a(CalendarMember calendarMember, CalendarMember calendarMember2) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "firstMember");
        Intrinsics.checkParameterIsNotNull(calendarMember2, "secondMember");
        if (calendarMember.member_type != calendarMember2.member_type) {
            return false;
        }
        if (calendarMember.member_type == CalendarMember.CalendarMemberType.GROUP) {
            return Intrinsics.areEqual(calendarMember.chat_id, calendarMember2.chat_id);
        }
        return Intrinsics.areEqual(calendarMember.user_id, calendarMember2.user_id);
    }

    /* renamed from: a */
    public final boolean mo110024a(String str, CalendarMember.C15546a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !Intrinsics.areEqual(str, aVar.f41226n) || aVar.f41227o.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo110020a(CalendarMember calendarMember, String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (calendarMember.member_type == CalendarMember.CalendarMemberType.INDIVIDUAL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            }
            if (!z2 && Intrinsics.areEqual(calendarMember.user_id, str2)) {
                return 1;
            }
        }
        if (z && Intrinsics.areEqual(calendarMember.user_id, str)) {
            return 2;
        }
        if (calendarMember.access_role == Calendar.AccessRole.OWNER) {
            return 3;
        }
        if (calendarMember.access_role == Calendar.AccessRole.WRITER) {
            return 4;
        }
        if (calendarMember.access_role == Calendar.AccessRole.READER) {
            return 5;
        }
        if (calendarMember.access_role == Calendar.AccessRole.FREE_BUSY_READER) {
            return 6;
        }
        return 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo110025a(java.lang.String r5, java.lang.Boolean r6, com.bytedance.lark.pb.calendar.v1.Calendar.Type r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper.mo110025a(java.lang.String, java.lang.Boolean, com.bytedance.lark.pb.calendar.v1.Calendar$Type):boolean");
    }
}
