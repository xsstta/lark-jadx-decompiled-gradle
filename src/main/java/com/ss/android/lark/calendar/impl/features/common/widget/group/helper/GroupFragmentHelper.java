package com.ss.android.lark.calendar.impl.features.common.widget.group.helper;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.RsvpUtil;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/helper/GroupFragmentHelper;", "", "()V", "getAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "getAttendeeMemberData", "isGoogleEvent", "", "isExchangeEvent", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.a.a */
public final class GroupFragmentHelper {

    /* renamed from: a */
    public static final GroupFragmentHelper f78884a = new GroupFragmentHelper();

    private GroupFragmentHelper() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016¨\u0006\u0016"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/helper/GroupFragmentHelper$getAttendeeData$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "getAvatarEntityId", "", "getAvatarKey", "getCalendarId", "getEmail", "getGroupId", "getGroupMemberSum", "", "getLocalizedDisplayName", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getShowMemberLimit", "hasRemoveGroupMember", "", "isCrossTenant", "isGroup", "isJoinedGroup", "isOpenSecurity", "isOptional", "isThirdPartyAttendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.a.a$a */
    public static final class C31203a implements IAttendeeMemberData {

        /* renamed from: a */
        final /* synthetic */ IBodyData.IAttendeeDetailData f78885a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: a */
        public boolean mo113143a() {
            return this.f78885a.mo113385k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: b */
        public String mo113144b() {
            return this.f78885a.mo113375a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: c */
        public String mo113145c() {
            return this.f78885a.mo113376b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: d */
        public String mo113146d() {
            return this.f78885a.mo113378d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: e */
        public String mo113147e() {
            return this.f78885a.mo113379e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: f */
        public RSVPStatus mo113148f() {
            return this.f78885a.mo113390p();
        }

        C31203a(IBodyData.IAttendeeDetailData bVar) {
            this.f78885a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/helper/GroupFragmentHelper$getAttendeeMemberData$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "getAvatarEntityId", "", "getAvatarKey", "getCalendarId", "getEmail", "getGroupId", "kotlin.jvm.PlatformType", "getGroupMemberSum", "", "getLocalizedDisplayName", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getShowMemberLimit", "hasRemoveGroupMember", "", "isCrossTenant", "isGroup", "isJoinedGroup", "isOpenSecurity", "isOptional", "isThirdPartyAttendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.a.a$b */
    public static final class C31204b implements IAttendeeMemberData {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee f78886a;

        /* renamed from: b */
        final /* synthetic */ boolean f78887b;

        /* renamed from: c */
        final /* synthetic */ boolean f78888c;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: a */
        public boolean mo113143a() {
            return AttendeeHelper.f78609a.mo112729a(this.f78887b, this.f78888c, this.f78886a);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: b */
        public String mo113144b() {
            String avatarKey = this.f78886a.getAvatarKey();
            if (avatarKey != null) {
                return avatarKey;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: d */
        public String mo113146d() {
            String attendeeCalendarId = this.f78886a.getAttendeeCalendarId();
            if (attendeeCalendarId != null) {
                return attendeeCalendarId;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: e */
        public String mo113147e() {
            String localizedDisplayName = this.f78886a.getLocalizedDisplayName();
            if (localizedDisplayName != null) {
                return localizedDisplayName;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: f */
        public RSVPStatus mo113148f() {
            return RsvpUtil.f79159a.mo113579a(this.f78886a.getStatus());
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData
        /* renamed from: c */
        public String mo113145c() {
            String avatarEntityId = this.f78886a.getAvatarEntityId();
            if (avatarEntityId == null) {
                avatarEntityId = "";
            }
            Intrinsics.checkExpressionValueIsNotNull(avatarEntityId, "attendee.avatarEntityId ?: \"\"");
            return avatarEntityId;
        }

        C31204b(CalendarEventAttendee calendarEventAttendee, boolean z, boolean z2) {
            this.f78886a = calendarEventAttendee;
            this.f78887b = z;
            this.f78888c = z2;
        }
    }

    /* renamed from: a */
    public final IAttendeeMemberData mo113141a(IBodyData.IAttendeeDetailData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return new C31203a(bVar);
    }

    /* renamed from: a */
    public final IAttendeeMemberData mo113142a(boolean z, boolean z2, CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        return new C31204b(calendarEventAttendee, z, z2);
    }
}
