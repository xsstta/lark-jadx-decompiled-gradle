package com.ss.android.lark.calendar.impl.features.events.detail.helper;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.RsvpUtil;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/helper/DetailAttendeeHelper;", "", "()V", "getIAttendeeDetailData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isGoogleEvent", "", "isExchangeEvent", "isLocalEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.a.a */
public final class DetailAttendeeHelper {

    /* renamed from: a */
    public static final DetailAttendeeHelper f79071a = new DetailAttendeeHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/helper/DetailAttendeeHelper$getIAttendeeDetailData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "getAvatarEntityId", "", "getAvatarKey", "getCalendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getCalendarId", "getEmail", "getGroupId", "getGroupMemberSum", "", "getLocalizedDisplayName", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getShowMemberLimit", "hasRemoveGroupMember", "", "isCrossTenant", "isGroup", "isJoinedGroup", "isOpenSecurity", "isOptional", "isThirdPartyAttendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.a.a$a */
    public static final class C31237a implements IBodyData.IAttendeeDetailData {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee f79072a;

        /* renamed from: b */
        final /* synthetic */ boolean f79073b;

        /* renamed from: c */
        final /* synthetic */ boolean f79074c;

        /* renamed from: d */
        final /* synthetic */ boolean f79075d;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: q */
        public CalendarEventAttendee mo113391q() {
            return this.f79072a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: b */
        public String mo113376b() {
            return this.f79072a.getAvatarEntityId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: g */
        public boolean mo113381g() {
            return this.f79072a.isGroup();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: h */
        public String mo113382h() {
            return this.f79072a.getGroupId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: i */
        public boolean mo113383i() {
            return this.f79072a.isSelfInGroup();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: j */
        public boolean mo113384j() {
            return this.f79072a.isAnyRemoved();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: l */
        public int mo113386l() {
            return this.f79072a.getValidMemberCount();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: m */
        public int mo113387m() {
            return this.f79072a.getShowMemberLimit();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: n */
        public boolean mo113388n() {
            return this.f79072a.getOpenSecurity();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: o */
        public boolean mo113389o() {
            return this.f79072a.isOptional();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: a */
        public String mo113375a() {
            String avatarKey = this.f79072a.getAvatarKey();
            if (avatarKey != null) {
                return avatarKey;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: d */
        public String mo113378d() {
            String attendeeCalendarId = this.f79072a.getAttendeeCalendarId();
            if (attendeeCalendarId != null) {
                return attendeeCalendarId;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: e */
        public String mo113379e() {
            String localizedDisplayName = this.f79072a.getLocalizedDisplayName();
            if (localizedDisplayName != null) {
                return localizedDisplayName;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: f */
        public String mo113380f() {
            String email = this.f79072a.getEmail();
            if (email != null) {
                return email;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: p */
        public RSVPStatus mo113390p() {
            return RsvpUtil.f79159a.mo113579a(this.f79072a.getStatus());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: c */
        public boolean mo113377c() {
            if (this.f79072a.isThirdParty() || this.f79073b || this.f79074c) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: k */
        public boolean mo113385k() {
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            if ((loginDependency != null && loginDependency.mo108270b()) || this.f79073b || this.f79074c || this.f79075d) {
                return false;
            }
            if (this.f79072a.isThirdParty()) {
                return true;
            }
            if (this.f79072a.isGroup()) {
                return this.f79072a.getIsCrossTenantGroup();
            }
            CalendarEventAttendee calendarEventAttendee = this.f79072a;
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "loginDependency");
            return calendarEventAttendee.isOuterUser(loginDependency.mo108271c());
        }

        C31237a(CalendarEventAttendee calendarEventAttendee, boolean z, boolean z2, boolean z3) {
            this.f79072a = calendarEventAttendee;
            this.f79073b = z;
            this.f79074c = z2;
            this.f79075d = z3;
        }
    }

    private DetailAttendeeHelper() {
    }

    /* renamed from: a */
    public final IBodyData.IAttendeeDetailData mo113374a(CalendarEventAttendee calendarEventAttendee, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        return new C31237a(calendarEventAttendee, z, z2, z3);
    }
}
