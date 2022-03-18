package com.ss.android.lark.calendar.impl.features.events.detail.viewdata;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.EventAttendeeInfo;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarEventCommonHelper;
import com.ss.android.lark.calendar.impl.features.common.helper.ReminderHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.attachment.AttachmentItemData;
import com.ss.android.lark.calendar.impl.features.events.detail.EventDetailSource;
import com.ss.android.lark.calendar.impl.features.events.detail.ICalendarDetailContact;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AuthorityUtil;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.RsvpUtil;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttachment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCompatibility;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.EntitySchema;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020CH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010 \u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b&\u0010\u0017R\u0011\u0010'\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0019\u0010-\u001a\n /*\u0004\u0018\u00010.0.¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00068F¢\u0006\u0006\u001a\u0004\b8\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b>\u0010\u0013R\u0011\u0010?\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b@\u0010\u0013¨\u0006D"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData;", "", "model", "Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/ICalendarDetailContact$IDetailModel;)V", "attachmentDatas", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/attachment/AttachmentItemData;", "getAttachmentDatas", "()Ljava/util/List;", "attendeeDatas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getAttendeeDatas", "()Ljava/util/ArrayList;", "attendeeNumText", "", "getAttendeeNumText", "()Ljava/lang/String;", "compatibilityDisableEdit", "", "getCompatibilityDisableEdit", "()Z", "compatibilityShowHint", "getCompatibilityShowHint", "eventRsvpStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getEventRsvpStatus", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "eventScopeText", "getEventScopeText", "fragmentAttendeeNumText", "getFragmentAttendeeNumText", "headerBackgroundColor", "", "getHeaderBackgroundColor", "()[I", "isStartEndSameDay", "liveEventId", "getLiveEventId", "locationData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getLocationData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "loginDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "kotlin.jvm.PlatformType", "getLoginDependency", "()Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "mAttendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getMAttendeeFragmentData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "meetingRoomDatas", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getMeetingRoomDatas", "organizerData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getOrganizerData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "reminderText", "getReminderText", "startEndTimeText", "getStartEndTimeText", "getAttendeeData", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a */
public abstract class BaseEventViewData {

    /* renamed from: a */
    public final ICalendarDetailContact.IDetailModel f79183a;

    /* renamed from: b */
    private final AbstractC30054s f79184b = C30022a.f74882a.loginDependency();

    /* renamed from: c */
    private final IAttendeeFragmentData f79185c = new C31265c(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$getAttendeeData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "getAvatarEntityId", "", "getAvatarKey", "getCalendarEventAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getCalendarId", "getEmail", "getGroupId", "getGroupMemberSum", "", "getLocalizedDisplayName", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "getShowMemberLimit", "hasRemoveGroupMember", "", "isCrossTenant", "isGroup", "isJoinedGroup", "isOpenSecurity", "isOptional", "isThirdPartyAttendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$a */
    public static final class C31263a implements IBodyData.IAttendeeDetailData {

        /* renamed from: a */
        final /* synthetic */ BaseEventViewData f79186a;

        /* renamed from: b */
        final /* synthetic */ CalendarEventAttendee f79187b;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: q */
        public CalendarEventAttendee mo113391q() {
            return this.f79187b;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: b */
        public String mo113376b() {
            return this.f79187b.getAvatarEntityId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: g */
        public boolean mo113381g() {
            return this.f79187b.isGroup();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: h */
        public String mo113382h() {
            return this.f79187b.getGroupId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: i */
        public boolean mo113383i() {
            return this.f79187b.isSelfInGroup();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: j */
        public boolean mo113384j() {
            return this.f79187b.isAnyRemoved();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: l */
        public int mo113386l() {
            return this.f79187b.getValidMemberCount();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: m */
        public int mo113387m() {
            return this.f79187b.getShowMemberLimit();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: n */
        public boolean mo113388n() {
            return this.f79187b.getOpenSecurity();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: o */
        public boolean mo113389o() {
            return this.f79187b.isOptional();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: a */
        public String mo113375a() {
            String avatarKey = this.f79187b.getAvatarKey();
            if (avatarKey != null) {
                return avatarKey;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: d */
        public String mo113378d() {
            String attendeeCalendarId = this.f79187b.getAttendeeCalendarId();
            if (attendeeCalendarId != null) {
                return attendeeCalendarId;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: e */
        public String mo113379e() {
            String localizedDisplayName = this.f79187b.getLocalizedDisplayName();
            if (localizedDisplayName != null) {
                return localizedDisplayName;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: f */
        public String mo113380f() {
            String email = this.f79187b.getEmail();
            if (email != null) {
                return email;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: p */
        public RSVPStatus mo113390p() {
            return RsvpUtil.f79159a.mo113579a(this.f79187b.getStatus());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: c */
        public boolean mo113377c() {
            if (this.f79187b.isThirdParty() || this.f79186a.f79183a.mo113438u() || this.f79186a.f79183a.mo113439v()) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeDetailData
        /* renamed from: k */
        public boolean mo113385k() {
            AbstractC30054s g = this.f79186a.mo113589g();
            if ((g != null && g.mo108270b()) || this.f79186a.f79183a.mo113438u() || this.f79186a.f79183a.mo113439v() || this.f79186a.f79183a.mo113440w()) {
                return false;
            }
            if (this.f79187b.isThirdParty()) {
                return true;
            }
            if (this.f79187b.isGroup()) {
                return this.f79187b.getIsCrossTenantGroup();
            }
            CalendarEventAttendee calendarEventAttendee = this.f79187b;
            AbstractC30054s g2 = this.f79186a.mo113589g();
            Intrinsics.checkExpressionValueIsNotNull(g2, "loginDependency");
            return calendarEventAttendee.isOuterUser(g2.mo108271c());
        }

        C31263a(BaseEventViewData aVar, CalendarEventAttendee calendarEventAttendee) {
            this.f79186a = aVar;
            this.f79187b = calendarEventAttendee;
        }
    }

    /* renamed from: g */
    public final AbstractC30054s mo113589g() {
        return this.f79184b;
    }

    /* renamed from: x */
    public final IAttendeeFragmentData mo113606x() {
        return this.f79185c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0002\u0000\u0007\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u0016J\r\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$mAttendeeFragmentData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "getAttendeeDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "Lkotlin/collections/ArrayList;", "getEventPartData", "com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$mAttendeeFragmentData$1$getEventPartData$1", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$mAttendeeFragmentData$1$getEventPartData$1;", "getIsExchangeEvent", "", "getIsGoogleEvent", "getIsLocalEvent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$c */
    public static final class C31265c implements IAttendeeFragmentData {

        /* renamed from: a */
        final /* synthetic */ BaseEventViewData f79189a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData
        /* renamed from: e */
        public ArrayList<IBodyData.IAttendeeDetailData> mo113618e() {
            return this.f79189a.mo113598p();
        }

        /* renamed from: f */
        public C31266a mo113617d() {
            return new C31266a(this);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData
        /* renamed from: a */
        public boolean mo113614a() {
            return this.f79189a.f79183a.mo113438u();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData
        /* renamed from: b */
        public boolean mo113615b() {
            return this.f79189a.f79183a.mo113439v();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData
        /* renamed from: c */
        public boolean mo113616c() {
            return this.f79189a.f79183a.mo113440w();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$mAttendeeFragmentData$1$getEventPartData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IEventPartData;", "getCalendarId", "", "getEventIndividualPageToken", "getEventVersion", "getKey", "getOriginalTime", "", "()Ljava/lang/Long;", "hasAllIndividualAttendee", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$c$a */
        public static final class C31266a implements IBodyData.IEventPartData {

            /* renamed from: a */
            final /* synthetic */ C31265c f79190a;

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: a */
            public String mo113620a() {
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c != null) {
                    return c.getCalendarId();
                }
                return null;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: b */
            public String mo113621b() {
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c != null) {
                    return c.getKey();
                }
                return null;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: c */
            public Long mo113622c() {
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c != null) {
                    return Long.valueOf(c.getOriginalTime());
                }
                return null;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: d */
            public String mo113623d() {
                String valueOf;
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c == null || (valueOf = String.valueOf(c.getVersion())) == null) {
                    return "";
                }
                return valueOf;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: e */
            public String mo113624e() {
                EventAttendeeInfo eventAttendeeInfo;
                String str;
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c == null || (eventAttendeeInfo = c.getEventAttendeeInfo()) == null || (str = eventAttendeeInfo.snapshot_page_token) == null) {
                    return "";
                }
                return str;
            }

            @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IEventPartData
            /* renamed from: f */
            public boolean mo113625f() {
                EventAttendeeInfo eventAttendeeInfo;
                Boolean bool;
                CalendarEvent c = this.f79190a.f79189a.f79183a.mo113417c();
                if (c == null || (eventAttendeeInfo = c.getEventAttendeeInfo()) == null || (bool = eventAttendeeInfo.all_individual_attendee) == null) {
                    return false;
                }
                return bool.booleanValue();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C31266a(C31265c cVar) {
                this.f79190a = cVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31265c(BaseEventViewData aVar) {
            this.f79189a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$meetingRoomDatas$1$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IMeetingRoomData;", "getCalendarId", "", "getMeetingRoomName", "getReservationStatus", "", "getRoomAppLink", "hasResourceApprovalRequest", "", "isDisabled", "isMeetingRoomApproval", "isMeetingRoomForceReleased", "isMeetingRoomRequisitioned", "isMyMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$d */
    public static final class C31267d implements IBodyData.IMeetingRoomData {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee f79191a;

        /* renamed from: b */
        final /* synthetic */ BaseEventViewData f79192b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f79193c;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: c */
        public boolean mo113628c() {
            return this.f79191a.isDisabled();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: b */
        public String mo113627b() {
            String localizedDisplayName = this.f79191a.getLocalizedDisplayName();
            if (localizedDisplayName != null) {
                return localizedDisplayName;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: f */
        public String mo113631f() {
            String attendeeCalendarId = this.f79191a.getAttendeeCalendarId();
            if (attendeeCalendarId != null) {
                return attendeeCalendarId;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: a */
        public int mo113626a() {
            Long l;
            CalendarEventAttendee calendarEventAttendee = this.f79191a;
            CalendarEventInstance i = this.f79192b.f79183a.mo113426i();
            Long l2 = null;
            if (i != null) {
                l = Long.valueOf(i.getStartTime());
            } else {
                l = null;
            }
            CalendarEventInstance i2 = this.f79192b.f79183a.mo113426i();
            if (i2 != null) {
                l2 = Long.valueOf(i2.getEndTime());
            }
            return C32060a.m121937a(calendarEventAttendee, l, l2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: d */
        public boolean mo113629d() {
            String str;
            SchemaExtraData.BizData a;
            AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
            Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
            String a2 = loginDependency.mo108269a();
            SchemaExtraData schemaExtraData = this.f79191a.getSchemaExtraData();
            if (schemaExtraData == null || (a = C32065c.m121945a(schemaExtraData)) == null) {
                str = null;
            } else {
                str = a.getCreateUserId();
            }
            return Intrinsics.areEqual(str, a2);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData
        /* renamed from: e */
        public String mo113630e() {
            List<EntitySchema> list;
            boolean z;
            CalendarSchemaCollection schemaCollection = this.f79191a.getSchemaCollection();
            if (schemaCollection != null) {
                list = schemaCollection.getUiItems();
            } else {
                list = null;
            }
            List<EntitySchema> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return list.get(0).getAppLink();
            }
            return "";
        }

        C31267d(CalendarEventAttendee calendarEventAttendee, BaseEventViewData aVar, ArrayList arrayList) {
            this.f79191a = calendarEventAttendee;
            this.f79192b = aVar;
            this.f79193c = arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$organizerData$1$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IOrganizerData;", "getAvatarEntityId", "", "getAvatarKey", "getCalendarId", "getEmail", "getLocalizedDisplayName", "getOrganizerLabel", "", "getRSVPStatus", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "isThirdPartyAttendee", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$e */
    public static final class C31268e implements IBodyData.IOrganizerData {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee f79194a;

        /* renamed from: b */
        final /* synthetic */ BaseEventViewData f79195b;

        /* renamed from: c */
        final /* synthetic */ Ref.IntRef f79196c;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: b */
        public String mo113376b() {
            return this.f79194a.getAvatarEntityId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IOrganizerData
        /* renamed from: g */
        public int mo113632g() {
            return this.f79196c.element;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: a */
        public String mo113375a() {
            String avatarKey = this.f79194a.getAvatarKey();
            if (avatarKey != null) {
                return avatarKey;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: d */
        public String mo113378d() {
            String attendeeCalendarId = this.f79194a.getAttendeeCalendarId();
            if (attendeeCalendarId != null) {
                return attendeeCalendarId;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: e */
        public String mo113379e() {
            String localizedDisplayName = this.f79194a.getLocalizedDisplayName();
            if (localizedDisplayName != null) {
                return localizedDisplayName;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: f */
        public String mo113380f() {
            String email = this.f79194a.getEmail();
            if (email != null) {
                return email;
            }
            return "";
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: p */
        public RSVPStatus mo113390p() {
            return RsvpUtil.f79159a.mo113579a(this.f79194a.getStatus());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IAttendeeBaseData
        /* renamed from: c */
        public boolean mo113377c() {
            if (this.f79194a.isThirdParty() || this.f79195b.f79183a.mo113438u() || this.f79195b.f79183a.mo113439v()) {
                return true;
            }
            return false;
        }

        C31268e(CalendarEventAttendee calendarEventAttendee, BaseEventViewData aVar, Ref.IntRef intRef) {
            this.f79194a = calendarEventAttendee;
            this.f79195b = aVar;
            this.f79196c = intRef;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/viewdata/BaseEventViewData$locationData$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$ILocationData;", "getAddress", "", "getLatitude", "", "getLocation", "getLongitude", "isShowAddress", "", "isShowLocation", "isShowMapView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.a$b */
    public static final class C31264b implements IBodyData.ILocationData {

        /* renamed from: a */
        final /* synthetic */ CalendarLocation f79188a;

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: b */
        public String mo113608b() {
            String location;
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation == null || (location = calendarLocation.getLocation()) == null) {
                return "";
            }
            return location;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: d */
        public String mo113610d() {
            String address;
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation == null || (address = calendarLocation.getAddress()) == null) {
                return "";
            }
            return address;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: f */
        public double mo113612f() {
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation != null) {
                return calendarLocation.getLatitude();
            }
            return 360.0d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: g */
        public double mo113613g() {
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation != null) {
                return calendarLocation.getLongitude();
            }
            return 360.0d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: a */
        public boolean mo113607a() {
            String str;
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation != null) {
                str = calendarLocation.getLocation();
            } else {
                str = null;
            }
            return !TextUtils.isEmpty(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: c */
        public boolean mo113609c() {
            String str;
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation != null) {
                str = calendarLocation.getAddress();
            } else {
                str = null;
            }
            return !TextUtils.isEmpty(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.ILocationData
        /* renamed from: e */
        public boolean mo113611e() {
            CalendarLocation calendarLocation = this.f79188a;
            if (calendarLocation == null) {
                return false;
            }
            if (calendarLocation.getLatitude() == 360.0d || calendarLocation.getLongitude() == 360.0d) {
                return false;
            }
            return true;
        }

        C31264b(CalendarLocation calendarLocation) {
            this.f79188a = calendarLocation;
        }
    }

    /* renamed from: i */
    public final String mo113591i() {
        String a;
        CalendarEventInstance i = this.f79183a.mo113426i();
        if (i == null || (a = C32646c.m125261a(i)) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: m */
    public final IBodyData.ILocationData mo113595m() {
        CalendarLocation calendarLocation;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            calendarLocation = c.getLocation();
        } else {
            calendarLocation = null;
        }
        return new C31264b(calendarLocation);
    }

    /* renamed from: n */
    public final String mo113596n() {
        int i;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            i = c.getAttendeeNum();
        } else {
            i = 0;
        }
        String a = C32634ae.m125180a(R.plurals.Calendar_Plural_FullDetailStringOfGuests, i);
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getPluralString(…             attendeeNum)");
        return a;
    }

    /* renamed from: o */
    public final String mo113597o() {
        int i;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            i = c.getAttendeeNum();
        } else {
            i = 0;
        }
        String a = C32634ae.m125180a(R.plurals.Calendar_Plural_AttendeeNumAfter, i);
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getPluralString(…deeNumAfter, attendeeNum)");
        return a;
    }

    /* renamed from: u */
    public final RSVPStatus mo113603u() {
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            return RsvpUtil.f79159a.mo113579a(c.getSelfAttendeeStatus());
        }
        return RSVPStatus.NEEDS_ACTION;
    }

    /* renamed from: v */
    public final boolean mo113604v() {
        CalendarSchemaCollection calendarSchemaCollection;
        CalendarSchemaCompatibility compatibility;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c == null || (calendarSchemaCollection = c.getCalendarSchemaCollection()) == null || (compatibility = calendarSchemaCollection.getCompatibility()) == null) {
            return false;
        }
        return compatibility.showHint();
    }

    /* renamed from: w */
    public final boolean mo113605w() {
        CalendarSchemaCollection calendarSchemaCollection;
        CalendarSchemaCompatibility compatibility;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c == null || (calendarSchemaCollection = c.getCalendarSchemaCollection()) == null || (compatibility = calendarSchemaCollection.getCompatibility()) == null) {
            return false;
        }
        return compatibility.disableEdit();
    }

    /* renamed from: j */
    public final boolean mo113592j() {
        TimeZone timeZone;
        CalendarEventInstance i = this.f79183a.mo113426i();
        if (i == null) {
            return true;
        }
        if (i.isAllDay()) {
            timeZone = TimeZone.getTimeZone("UTC");
        } else {
            timeZone = TimeZone.getDefault();
        }
        long j = (long) 1000;
        return C26279i.m95157a(i.getStartTime() * j, i.getEndTime() * j, timeZone);
    }

    /* renamed from: k */
    public final String mo113593k() {
        CalendarEvent c = this.f79183a.mo113417c();
        if (c == null) {
            return "";
        }
        String str = c.getKey() + "_" + c.getOriginalTime();
        Intrinsics.checkExpressionValueIsNotNull(str, "StringBuilder().append(i….originalTime).toString()");
        return str;
    }

    /* renamed from: p */
    public final ArrayList<IBodyData.IAttendeeDetailData> mo113598p() {
        ArrayList<IBodyData.IAttendeeDetailData> arrayList = new ArrayList<>();
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            Iterator<T> it = AttendeeUtil.f79151a.mo113569b(c).iterator();
            while (it.hasNext()) {
                arrayList.add(m117156a(it.next()));
            }
        }
        return arrayList;
    }

    /* renamed from: r */
    public final String mo113600r() {
        CalendarEvent.Visibility visibility;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            visibility = c.getVisibility();
        } else {
            visibility = null;
        }
        if (visibility == null) {
            return "";
        }
        int i = C31269b.f79197a[visibility.ordinal()];
        if (i == 1) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_Public);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_Public)");
            return b;
        } else if (i != 2) {
            return "";
        } else {
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_Private);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_Private)");
            return b2;
        }
    }

    /* renamed from: h */
    public final int[] mo113590h() {
        CalendarEvent.Category category;
        int i;
        String str;
        CalendarEventInstance i2;
        MappingColor calMappingColor;
        CalendarEventInstance i3;
        MappingColor mappingColor;
        CalendarEventInstance i4 = this.f79183a.mo113426i();
        CalendarEvent.DisplayType displayType = null;
        if (i4 != null) {
            category = i4.getCategory();
        } else {
            category = null;
        }
        if (CalendarEventCommonHelper.m116172a(category)) {
            int[] iArr = CalendarSkinColorTool.f83559a;
            Intrinsics.checkExpressionValueIsNotNull(iArr, "CalendarSkinColorTool.mMeetingRoomDisableColorArr");
            return iArr;
        }
        Calendar j = this.f79183a.mo113427j();
        if (j == null || !j.isExternalPasswordInvalid()) {
            CalendarEvent c = this.f79183a.mo113417c();
            if (c != null) {
                displayType = c.getDisplayType();
            }
            String str2 = "6";
            if (displayType == CalendarEvent.DisplayType.LIMITED ? !((i2 = this.f79183a.mo113426i()) == null || (calMappingColor = i2.getCalMappingColor()) == null || (str = calMappingColor.getEventColorIndex()) == null) : !((i3 = this.f79183a.mo113426i()) == null || (mappingColor = i3.getmEventColor()) == null || (str = mappingColor.getEventColorIndex()) == null)) {
                str2 = str;
            }
            try {
                i = Integer.parseInt(str2);
            } catch (Exception unused) {
                i = 6;
            }
            int[] b = CalendarSkinColorTool.m124927b(i);
            Intrinsics.checkExpressionValueIsNotNull(b, "CalendarSkinColorTool.ge…GradientColor(colorIndex)");
            return b;
        }
        int[] iArr2 = CalendarSkinColorTool.f83559a;
        Intrinsics.checkExpressionValueIsNotNull(iArr2, "CalendarSkinColorTool.mMeetingRoomDisableColorArr");
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData.IMeetingRoomData> mo113594l() {
        /*
            r4 = this;
            com.ss.android.lark.calendar.impl.features.events.detail.d$a r0 = r4.f79183a
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent r0 = r0.mo113417c()
            if (r0 == 0) goto L_0x0025
            java.util.List r0 = r0.getAttendees()
            if (r0 == 0) goto L_0x0025
            com.ss.android.lark.calendar.a.a.s r1 = r4.f79184b
            java.lang.String r2 = "loginDependency"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.mo108269a()
            java.lang.String r2 = "loginDependency.userId"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.util.List r0 = com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32060a.m121940a(r0, r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0029
        L_0x0025:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0029:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0034:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee r2 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee) r2
            com.ss.android.lark.calendar.impl.features.events.detail.e.a$d r3 = new com.ss.android.lark.calendar.impl.features.events.detail.e.a$d
            r3.<init>(r2, r4, r1)
            r1.add(r3)
            goto L_0x0034
        L_0x0049:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.detail.viewdata.BaseEventViewData.mo113594l():java.util.List");
    }

    /* renamed from: s */
    public final List<AttachmentItemData> mo113601s() {
        List<CalendarEventAttachment> attachment;
        ArrayList arrayList = new ArrayList();
        CalendarEvent c = this.f79183a.mo113417c();
        if (!(c == null || (attachment = c.getAttachment()) == null)) {
            for (CalendarEventAttachment calendarEventAttachment : attachment) {
                if (!calendarEventAttachment.isDeleted()) {
                    arrayList.add(new AttachmentItemData(calendarEventAttachment.getFileToken(), calendarEventAttachment.getFileSize(), calendarEventAttachment.getName(), calendarEventAttachment.getType(), calendarEventAttachment.getLocalPath(), calendarEventAttachment.getUploaderUserId()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final String mo113599q() {
        boolean z;
        List<CalendarEventReminder> reminders;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            z = c.isAllDay();
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        CalendarEvent c2 = this.f79183a.mo113417c();
        if (!(c2 == null || (reminders = c2.getReminders()) == null)) {
            for (T t : reminders) {
                Intrinsics.checkExpressionValueIsNotNull(t, "reminder");
                arrayList.add(Integer.valueOf(t.getMinutes()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ReminderHelper gVar = ReminderHelper.f78619a;
            Intrinsics.checkExpressionValueIsNotNull(num, "minutes");
            String a = gVar.mo112733a(num.intValue(), z);
            if (!TextUtils.isEmpty(a)) {
                arrayList2.add(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (!z2) {
                sb.append(C32634ae.m125182b(R.string.Calendar_Common_Comma));
            }
            sb.append(str);
            z2 = false;
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: t */
    public final IBodyData.IOrganizerData mo113602t() {
        CalendarEventAttendee calendarEventAttendee;
        CalendarEvent c = this.f79183a.mo113417c();
        if (c != null) {
            Calendar j = this.f79183a.mo113427j();
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 2;
            boolean z = true;
            int i = 4;
            if (c.getSuccessor() != null) {
                if (c.successorIsAttend() || !AuthorityUtil.f79153a.mo113576b(c, j)) {
                    z = false;
                }
                intRef.element |= 4;
                calendarEventAttendee = c.getSuccessor();
            } else if (c.getOrganizer() != null) {
                intRef.element |= 4;
                if (c.organizerIsAttend() || !AuthorityUtil.f79153a.mo113576b(c, j)) {
                    z = false;
                }
                calendarEventAttendee = c.getOrganizer();
            } else if (c.getCreator() != null) {
                intRef.element |= 4;
                if (c.creatorIsAttend() || !AuthorityUtil.f79153a.mo113576b(c, j)) {
                    z = false;
                }
                calendarEventAttendee = c.getCreator();
            } else {
                calendarEventAttendee = null;
                z = false;
            }
            if (z) {
                intRef.element |= 32;
            }
            if (calendarEventAttendee != null) {
                AbstractC30054s sVar = this.f79184b;
                Intrinsics.checkExpressionValueIsNotNull(sVar, "loginDependency");
                if (calendarEventAttendee.isOuterUser(sVar.mo108271c())) {
                    AbstractC30054s sVar2 = this.f79184b;
                    Intrinsics.checkExpressionValueIsNotNull(sVar2, "loginDependency");
                    if (!sVar2.mo108270b()) {
                        intRef.element |= 16;
                    }
                }
            }
            if (this.f79183a.mo113392A()) {
                if ((intRef.element & 4) == 0) {
                    i = 0;
                }
                intRef.element = i;
            }
            if (this.f79183a.mo113400a() == EventDetailSource.FROM_ROOM_VIEW_NOT_ACCESSIBLE) {
                intRef.element |= 64;
            }
            if (calendarEventAttendee != null) {
                return new C31268e(calendarEventAttendee, this, intRef);
            }
        }
        return null;
    }

    /* renamed from: a */
    private final IBodyData.IAttendeeDetailData m117156a(CalendarEventAttendee calendarEventAttendee) {
        return new C31263a(this, calendarEventAttendee);
    }

    public BaseEventViewData(ICalendarDetailContact.IDetailModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f79183a = aVar;
    }
}
