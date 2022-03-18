package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse;
import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import com.bytedance.lark.pb.calendar.v1.ResourceCheckInStrategy;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MtRoomSignInBaseData;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.TimeRange;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper.SignInStateHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.helper.SignInTimeHelper;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceInfo;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010A\u001a\u00020?H\u0002J\u0012\u0010B\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010C\u001a\u00020?H\u0002J\n\u0010D\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010E\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010F\u001a\u00020.H\u0002J\u0014\u0010G\u001a\u0004\u0018\u00010\u00102\b\u0010@\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010H\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010K\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010L\u001a\u00020\u000fH\u0016J\b\u0010M\u001a\u00020\u000fH\u0016J\b\u0010N\u001a\u00020\u000fH\u0016J \u0010O\u001a\u0004\u0018\u00010\u001d2\u0006\u0010P\u001a\u00020Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\b\u0010S\u001a\u00020.H\u0016J\b\u0010T\u001a\u00020.H\u0002J\b\u0010U\u001a\u00020.H\u0016J\b\u0010V\u001a\u00020\u000fH\u0016J\b\u0010W\u001a\u00020.H\u0002J\n\u0010X\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010Y\u001a\u00020.H\u0002J\b\u0010Z\u001a\u00020.H\u0002J\u0010\u0010[\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010\\\u001a\u00020\u0002H\u0016J\b\u0010]\u001a\u00020?H\u0016J\b\u0010^\u001a\u00020?H\u0016J\u0006\u0010_\u001a\u00020?J\b\u0010`\u001a\u00020?H\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u0005H\u0016J\u0010\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020b2\u0006\u0010/\u001a\u00020\u001dH\u0002J\u0006\u0010h\u001a\u00020bJ\u0018\u0010i\u001a\u00020b2\u000e\u0010R\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002J\b\u0010j\u001a\u00020bH\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010*\"\u0004\b1\u0010,R\u001c\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020.X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010;\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,¨\u0006k"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInModeApi;", "extra", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "authCreateEvent", "Lcom/bytedance/lark/pb/calendar/v1/GetResourceCheckInInfoResponse$CreateEventAuth;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "calendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "chatters", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getChatters", "()Ljava/util/Map;", "setChatters", "(Ljava/util/Map;)V", "currentSignInState", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getCurrentSignInState", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "setCurrentSignInState", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;)V", "eventInstanceInfoList", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "getEventInstanceInfoList", "()Ljava/util/List;", "setEventInstanceInfoList", "(Ljava/util/List;)V", "inactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getInactiveReason", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "setInactiveReason", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;)V", "nextInstanceInfo", "getNextInstanceInfo", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "setNextInstanceInfo", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;)V", "originalTimestampSecond", "", "processingInstance", "getProcessingInstance", "setProcessingInstance", "resourceCheckInStrategy", "Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;", "getResourceCheckInStrategy", "()Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;", "setResourceCheckInStrategy", "(Lcom/bytedance/lark/pb/calendar/v1/ResourceCheckInStrategy;)V", "serverElapsedRealtime", "signInBaseData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MtRoomSignInBaseData;", "signInInstanceInfo", "getSignInInstanceInfo", "setSignInInstanceInfo", "checkSetInactiveInstanceState", "", "instanceInfo", "checkSetInactiveState", "checkSetNeedSignInState", "checkSetUserStrategyState", "getCalendarBuilding", "getCalendarResource", "getCurrentServerTimestamp", "getEventShowCreator", "getIdleBlockTimeRange", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/TimeRange;", "getInstanceInactiveReason", "getInstanceTimeString", "getMtRoomCalendarId", "getMtRoomResourceId", "getMtRoomToken", "getNextInstance", "curIndex", "", "instance", "getNextRefreshResourceSecond", "getNextStatusChangStartSecond", "getOriginalServerTimestamp", "getQrCodeUrl", "getRemainingSignInSecond", "getResource", "getResourceCheckInAfterSecond", "getResourceCheckInBeforeSecond", "getResourceInactiveReasonString", "getViewData", "isFirstActive", "isQRCodeInactive", "isResourcePermanentlyDisabled", "isSignInInstanceStarted", "onSaveInstanceState", "", "outState", "setResourceCheckInInfo", "response", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "setStateWhenProcessingInstanceExist", "sortInstance", "updateShowInstance", "updateSignInState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.c */
public final class MeetingRoomSignInModel extends BaseModelCalendar<IMtRoomSignInContract.IViewData> implements IMtRoomSignInContract.IMtRoomSignInModeApi {

    /* renamed from: a */
    public CalendarResource f82203a;

    /* renamed from: b */
    public CalendarBuilding f82204b;

    /* renamed from: c */
    public GetResourceCheckInInfoResponse.CreateEventAuth f82205c;

    /* renamed from: d */
    private MtRoomSignInBaseData f82206d = new MtRoomSignInBaseData(null, null, 3, null);

    /* renamed from: e */
    private long f82207e;

    /* renamed from: f */
    private List<InstanceInfo> f82208f;

    /* renamed from: g */
    private ResourceCheckInStrategy f82209g;

    /* renamed from: h */
    private Map<String, CalendarEventCreator> f82210h;

    /* renamed from: i */
    private MeetingRoomSignInState f82211i;

    /* renamed from: j */
    private InstanceInfo f82212j;

    /* renamed from: k */
    private InstanceInfo f82213k;

    /* renamed from: l */
    private InstanceInfo f82214l;

    /* renamed from: m */
    private InactiveReason f82215m;

    /* renamed from: n */
    private long f82216n;

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: a */
    public MeetingRoomSignInState mo117343a() {
        return this.f82211i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: b */
    public InstanceInfo mo117346b() {
        return this.f82214l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: c */
    public InstanceInfo mo117347c() {
        return this.f82212j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: d */
    public InstanceInfo mo117348d() {
        return this.f82213k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: e */
    public InactiveReason mo117349e() {
        return this.f82215m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: k */
    public long mo117354k() {
        return this.f82207e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: o */
    public CalendarResource mo117358o() {
        return this.f82203a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: p */
    public CalendarBuilding mo117359p() {
        return this.f82204b;
    }

    /* renamed from: t */
    public final ResourceCheckInStrategy mo117433t() {
        return this.f82209g;
    }

    /* renamed from: u */
    public final Map<String, CalendarEventCreator> mo117434u() {
        return this.f82210h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016¨\u0006#"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/signin/MeetingRoomSignInModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "getBuildingName", "", "getCanUserBlockResource", "", "getCurInstanceOrganizer", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getCurInstanceTime", "getCurrentSignInState", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getIdleTimeString", "getInactiveContact", "", "getInactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getMeetingRoomName", "getNextInstanceCheckInType", "Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo$CheckInType;", "getNextInstanceInactiveReason", "getNextInstanceOrganizer", "getNextInstanceTimeString", "getRemainingSignInSecond", "", "getResourceCheckInAfterSecond", "getResourceCheckInBeforeSecond", "getResourceInactiveReasonString", "inactiveReason", "getSignInInstanceOrganizer", "getSignInInstanceTime", "hasNextInstance", "isNextInstanceInactive", "isQrCheckInEnable", "isResourcePermanentlyDisabled", "isSignInInstanceStarted", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.c$a */
    public static final class C32155a implements IMtRoomSignInContract.IViewData {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSignInModel f82217a;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: a */
        public MeetingRoomSignInState mo117379a() {
            return this.f82217a.mo117343a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: n */
        public InactiveReason mo117393n() {
            return this.f82217a.mo117349e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: o */
        public boolean mo117394o() {
            return this.f82217a.mo117361r();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: q */
        public long mo117396q() {
            return this.f82217a.mo117437x();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: r */
        public long mo117397r() {
            return this.f82217a.mo117438y();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: t */
        public boolean mo117399t() {
            return this.f82217a.mo117436w();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: u */
        public long mo117400u() {
            return this.f82217a.mo117439z();
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: c */
        public String mo117382c() {
            String name;
            CalendarBuilding calendarBuilding = this.f82217a.f82204b;
            if (calendarBuilding == null || (name = calendarBuilding.getName()) == null) {
                return "";
            }
            return name;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: d */
        public String mo117383d() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117431e(cVar.mo117347c());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: e */
        public CalendarEventCreator mo117384e() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117430d(cVar.mo117347c());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: f */
        public String mo117385f() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117431e(cVar.mo117348d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: g */
        public CalendarEventCreator mo117386g() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117430d(cVar.mo117348d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: h */
        public String mo117387h() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117431e(cVar.mo117346b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: i */
        public CalendarEventCreator mo117388i() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117430d(cVar.mo117346b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: k */
        public boolean mo117390k() {
            if (this.f82217a.mo117348d() != null) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: m */
        public String mo117392m() {
            MeetingRoomSignInModel cVar = this.f82217a;
            return cVar.mo117432f(cVar.mo117348d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: p */
        public boolean mo117395p() {
            if (this.f82217a.f82205c != GetResourceCheckInInfoResponse.CreateEventAuth.LIMITED_BY_USER_STRATEGY) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: j */
        public InstanceCheckInInfo.CheckInType mo117389j() {
            InstanceCheckInInfo b;
            InstanceInfo d = this.f82217a.mo117348d();
            if (d == null || (b = d.mo120127b()) == null) {
                return null;
            }
            return b.check_in_status;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: l */
        public boolean mo117391l() {
            CalendarEventInstance a;
            InstanceInfo d = this.f82217a.mo117348d();
            if (d == null || (a = d.mo120126a()) == null) {
                return false;
            }
            return SignInStateHelper.f82200a.mo117412a(a);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: s */
        public boolean mo117398s() {
            Boolean bool;
            ResourceCheckInStrategy t = this.f82217a.mo117433t();
            if (t != null) {
                bool = t.is_qr_check_in_enable;
            } else {
                bool = null;
            }
            return Intrinsics.areEqual((Object) bool, (Object) true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: v */
        public List<CalendarEventCreator> mo117401v() {
            return SignInStateHelper.f82200a.mo117410a(this.f82217a.f82203a, this.f82217a.mo117434u());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: w */
        public String mo117402w() {
            if (this.f82217a.mo117343a() != MeetingRoomSignInState.IDLE) {
                return "";
            }
            return C32634ae.m125182b(R.string.Calendar_Common_Now) + "-" + SignInTimeHelper.f82202a.mo117418a(this.f82217a.mo117422A() * ((long) 1000));
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: b */
        public String mo117381b() {
            boolean z;
            CalendarResource calendarResource = this.f82217a.f82203a;
            if (calendarResource == null) {
                return "";
            }
            String floorName = calendarResource.getFloorName();
            Intrinsics.checkExpressionValueIsNotNull(floorName, "calendarResource.floorName");
            boolean z2 = true;
            if (floorName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String name = calendarResource.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "calendarResource.name");
                if (name.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    return calendarResource.getFloorName() + '-' + calendarResource.getName();
                }
            }
            return calendarResource.getFloorName() + calendarResource.getName();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32155a(MeetingRoomSignInModel cVar) {
            this.f82217a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IViewData
        /* renamed from: a */
        public String mo117380a(InactiveReason inactiveReason) {
            Intrinsics.checkParameterIsNotNull(inactiveReason, "inactiveReason");
            return this.f82217a.mo117427b(inactiveReason);
        }
    }

    /* renamed from: B */
    public IMtRoomSignInContract.IViewData mo109793f() {
        return new C32155a(this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: i */
    public String mo117352i() {
        return this.f82206d.mo117441a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: n */
    public String mo117357n() {
        return this.f82206d.mo117444b();
    }

    /* renamed from: E */
    private final long m122448E() {
        return ((SystemClock.elapsedRealtime() - this.f82216n) / ((long) 1000)) + this.f82207e;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: g */
    public String mo117350g() {
        String calendarId;
        CalendarResource calendarResource = this.f82203a;
        if (calendarResource == null || (calendarId = calendarResource.getCalendarId()) == null) {
            return "";
        }
        return calendarId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: h */
    public String mo117351h() {
        String id;
        CalendarResource calendarResource = this.f82203a;
        if (calendarResource == null || (id = calendarResource.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: l */
    public boolean mo117355l() {
        ResourceCheckInStrategy.QRCodeStatus qRCodeStatus;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (resourceCheckInStrategy != null) {
            qRCodeStatus = resourceCheckInStrategy.qr_status;
        } else {
            qRCodeStatus = null;
        }
        if (qRCodeStatus == ResourceCheckInStrategy.QRCodeStatus.INACTIVATED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: m */
    public boolean mo117356m() {
        ResourceCheckInStrategy.QRCodeStatus qRCodeStatus;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (resourceCheckInStrategy != null) {
            qRCodeStatus = resourceCheckInStrategy.qr_status;
        } else {
            qRCodeStatus = null;
        }
        if (qRCodeStatus == ResourceCheckInStrategy.QRCodeStatus.FIRST_ACTIVATED) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo117436w() {
        CalendarResource calendarResource = this.f82203a;
        if (calendarResource == null || !calendarResource.isDisabled()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: r */
    public boolean mo117361r() {
        CalendarEventInstance a;
        long E = m122448E();
        InstanceInfo b = mo117346b();
        if (b == null || (a = b.mo120126a()) == null || E < a.getStartTime()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: s */
    public long mo117362s() {
        long A;
        long E = m122448E();
        InstanceInfo c = mo117347c();
        if (c != null) {
            A = c.mo120126a().getEndTime();
        } else {
            A = mo117422A();
        }
        return A - E;
    }

    /* renamed from: v */
    public final void mo117435v() {
        List<InstanceInfo> list = this.f82208f;
        if (list != null && list.size() > 1) {
            CollectionsKt.sortWith(list, new C32156b());
        }
    }

    /* renamed from: x */
    public final long mo117437x() {
        Long l;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (resourceCheckInStrategy != null) {
            l = resourceCheckInStrategy.duration_before_start_check_in;
        } else {
            l = null;
        }
        if (l == null || l.longValue() == 0) {
            l = 300L;
        }
        return l.longValue();
    }

    /* renamed from: y */
    public final long mo117438y() {
        Long l;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (resourceCheckInStrategy != null) {
            l = resourceCheckInStrategy.duration_after_start_check_in;
        } else {
            l = null;
        }
        if (l == null || l.longValue() == 0) {
            l = 600L;
        }
        return l.longValue();
    }

    /* renamed from: C */
    private final boolean m122446C() {
        Boolean bool;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (resourceCheckInStrategy != null) {
            bool = resourceCheckInStrategy.is_qr_check_in_enable;
        } else {
            bool = null;
        }
        if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
            mo117425a(MeetingRoomSignInState.INACTIVE);
            mo117424a(InactiveReason.QR_CHECK_IN_NOT_ENABLE);
            return true;
        }
        CalendarResource calendarResource = this.f82203a;
        if (calendarResource != null && calendarResource.isDisabled()) {
            mo117425a(MeetingRoomSignInState.INACTIVE);
            mo117424a(InactiveReason.DURING_OLD_PERMANENTLY_DISABLED);
            return true;
        } else if (m122447D()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: A */
    public final long mo117422A() {
        InstanceInfo d = mo117348d();
        if (d != null) {
            return d.mo120126a().getStartTime();
        }
        CalendarDate moveThisDateToDayEnd = new CalendarDate(new Date(this.f82207e * ((long) 1000))).addDay(1).moveThisDateToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayEnd, "calendarDate.addDay(1).moveThisDateToDayEnd()");
        return moveThisDateToDayEnd.getTimeInSeconds();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: j */
    public void mo117353j() {
        m122450a(this.f82208f);
        if (!m122446C()) {
            InstanceInfo c = mo117347c();
            if (c != null) {
                m122451g(c);
            } else if (!m122453i(mo117348d())) {
                mo117425a(MeetingRoomSignInState.IDLE);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: q */
    public TimeRange mo117360q() {
        long A = mo117422A();
        long currentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        long j = this.f82207e;
        if (currentTimeMillis < j || currentTimeMillis > A) {
            currentTimeMillis = j;
        }
        return new TimeRange(currentTimeMillis, Math.min(A, ((long) (C30022a.f74884c.mo108456c().getDefaultEventDuration() * 60)) + currentTimeMillis));
    }

    /* renamed from: z */
    public final long mo117439z() {
        InstanceCheckInInfo b;
        Long l;
        long x = mo117437x();
        long y = mo117438y();
        InstanceInfo b2 = mo117346b();
        if (b2 == null || (b = b2.mo120127b()) == null || (l = b.check_in_timestamp_second) == null) {
            return 0;
        }
        return RangesKt.coerceAtMost((l.longValue() + y) - (((SystemClock.elapsedRealtime() - this.f82216n) / ((long) 1000)) + this.f82207e), x + y);
    }

    /* renamed from: D */
    private final boolean m122447D() {
        InstanceCheckInInfo.CheckInType checkInType;
        InstanceCheckInInfo b;
        InstanceCheckInInfo b2;
        if (this.f82205c != GetResourceCheckInInfoResponse.CreateEventAuth.LIMITED_BY_USER_STRATEGY) {
            return false;
        }
        InstanceInfo c = mo117347c();
        InstanceCheckInInfo.CheckInType checkInType2 = null;
        if (c == null || (b2 = c.mo120127b()) == null) {
            checkInType = null;
        } else {
            checkInType = b2.check_in_status;
        }
        if (!(checkInType == InstanceCheckInInfo.CheckInType.ALREADY_CHECK_IN || checkInType == InstanceCheckInInfo.CheckInType.NOT_CHECK_IN)) {
            InstanceInfo d = mo117348d();
            if (!(d == null || (b = d.mo120127b()) == null)) {
                checkInType2 = b.check_in_status;
            }
            if (!(checkInType2 == InstanceCheckInInfo.CheckInType.ALREADY_CHECK_IN || checkInType2 == InstanceCheckInInfo.CheckInType.NOT_CHECK_IN)) {
                mo117425a(MeetingRoomSignInState.INACTIVE);
                mo117424a(InactiveReason.LIMITED_BY_USER_STRATEGY);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo117424a(InactiveReason inactiveReason) {
        this.f82215m = inactiveReason;
    }

    /* renamed from: b */
    public void mo117428b(InstanceInfo mVar) {
        this.f82213k = mVar;
    }

    /* renamed from: c */
    public void mo117429c(InstanceInfo mVar) {
        this.f82214l = mVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: a */
    public void mo117344a(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        this.f82206d.mo117442a(bundle);
    }

    public MeetingRoomSignInModel(Bundle bundle) {
        if (bundle != null) {
            this.f82206d = MtRoomSignInBaseData.f82219a.mo117446a(bundle);
        }
    }

    /* renamed from: g */
    private final void m122451g(InstanceInfo mVar) {
        if (!m122452h(mVar) && !m122453i(mVar) && !m122453i(mo117348d())) {
            mo117425a(MeetingRoomSignInState.IN_USE);
        }
    }

    /* renamed from: d */
    public final CalendarEventCreator mo117430d(InstanceInfo mVar) {
        CalendarEventInstance a;
        if (mVar == null || (a = mVar.mo120126a()) == null) {
            return null;
        }
        CalendarEventCreator originalEventCreator = a.getOriginalEventCreator();
        if (originalEventCreator != null) {
            return originalEventCreator;
        }
        return a.getEventCreator();
    }

    /* renamed from: h */
    private final boolean m122452h(InstanceInfo mVar) {
        CalendarEventInstance a;
        if (!(mVar == null || (a = mVar.mo120126a()) == null)) {
            if (a.getCategory() == CalendarEvent.Category.RESOURCE_STRATEGY) {
                mo117425a(MeetingRoomSignInState.INACTIVE);
                mo117424a(InactiveReason.DURING_STRATEGY);
                return true;
            } else if (a.getCategory() == CalendarEvent.Category.RESOURCE_REQUISITION) {
                mo117425a(MeetingRoomSignInState.INACTIVE);
                mo117424a(InactiveReason.DURING_REQUISITION);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo117425a(MeetingRoomSignInState meetingRoomSignInState) {
        this.f82211i = meetingRoomSignInState;
    }

    /* renamed from: e */
    public final String mo117431e(InstanceInfo mVar) {
        CalendarEventInstance a;
        if (mVar == null || (a = mVar.mo120126a()) == null) {
            return "";
        }
        long j = (long) 1000;
        long startTime = a.getStartTime() * j;
        long endTime = a.getEndTime() * j;
        if (SignInTimeHelper.f82202a.mo117421b(startTime, endTime)) {
            return SignInTimeHelper.f82202a.mo117419a(startTime, endTime);
        }
        String a2 = C32646c.m125251a(startTime, endTime, a.isAllDay(), false);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDateTimeShowUtil…llDay,\n            false)");
        return a2;
    }

    /* renamed from: f */
    public final String mo117432f(InstanceInfo mVar) {
        CalendarEventInstance a;
        if (!(mVar == null || (a = mVar.mo120126a()) == null)) {
            if (a.getCategory() == CalendarEvent.Category.RESOURCE_STRATEGY) {
                return SignInStateHelper.f82200a.mo117408a(this.f82203a);
            }
            if (a.getCategory() == CalendarEvent.Category.RESOURCE_REQUISITION) {
                return SignInStateHelper.f82200a.mo117416c(this.f82203a);
            }
        }
        return "";
    }

    /* renamed from: a */
    private final void m122450a(List<InstanceInfo> list) {
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                CalendarEventInstance a = t2.mo120126a();
                if (a.getStartTime() <= this.f82207e && a.getEndTime() >= this.f82207e) {
                    mo117426a((InstanceInfo) t2);
                    mo117428b(m122449a(i, list));
                    return;
                } else if (a.getStartTime() > this.f82207e) {
                    mo117426a((InstanceInfo) null);
                    mo117428b((InstanceInfo) t2);
                    return;
                } else {
                    i = i2;
                }
            }
        }
        InstanceInfo mVar = null;
        mo117426a(mVar);
        mo117428b(mVar);
    }

    /* renamed from: i */
    private final boolean m122453i(InstanceInfo mVar) {
        InstanceCheckInInfo b;
        boolean z;
        ResourceCheckInStrategy resourceCheckInStrategy = this.f82209g;
        if (!(resourceCheckInStrategy == null || mVar == null || (b = mVar.mo120127b()) == null)) {
            if (b.check_in_status == InstanceCheckInInfo.CheckInType.NOT_CHECK_IN) {
                z = true;
            } else {
                z = false;
            }
            if (!SignInStateHelper.f82200a.mo117412a(mVar.mo120126a()) && z) {
                long longValue = b.check_in_timestamp_second.longValue();
                Long l = resourceCheckInStrategy.duration_before_start_check_in;
                Intrinsics.checkExpressionValueIsNotNull(l, "resourceCheckInStrategy.…ion_before_start_check_in");
                long longValue2 = longValue - l.longValue();
                long longValue3 = b.check_in_timestamp_second.longValue();
                Long l2 = resourceCheckInStrategy.duration_after_start_check_in;
                Intrinsics.checkExpressionValueIsNotNull(l2, "resourceCheckInStrategy.…tion_after_start_check_in");
                long longValue4 = longValue3 + l2.longValue();
                long j = this.f82207e;
                if (longValue2 <= j && longValue4 >= j) {
                    mo117425a(MeetingRoomSignInState.NEED_CHECK_IN);
                    mo117429c(mVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String mo117427b(InactiveReason inactiveReason) {
        int i = C32157d.f82218a[inactiveReason.ordinal()];
        boolean z = true;
        if (i == 1) {
            return SignInStateHelper.f82200a.mo117408a(this.f82203a);
        }
        if (i != 2) {
            return "";
        }
        String b = SignInStateHelper.f82200a.mo117414b(this.f82203a);
        String d = SignInStateHelper.f82200a.mo117417d(this.f82203a);
        if (d.length() != 0) {
            z = false;
        }
        if (z) {
            return b;
        }
        return b + '\n' + d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.meetingroom.signin.IMtRoomSignInContract.IMtRoomSignInModeApi
    /* renamed from: a */
    public void mo117345a(com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "response");
        this.f82203a = jVar.mo120095a();
        this.f82204b = jVar.mo120103b();
        this.f82207e = jVar.mo120104c();
        this.f82216n = SystemClock.elapsedRealtime();
        this.f82205c = jVar.mo120105d();
        this.f82208f = jVar.mo120106e();
        this.f82209g = jVar.mo120108f();
        this.f82210h = jVar.mo120109g();
        mo117425a((MeetingRoomSignInState) null);
        InstanceInfo mVar = null;
        mo117426a(mVar);
        mo117428b(mVar);
        mo117429c(mVar);
        mo117424a((InactiveReason) null);
        mo117435v();
    }

    /* renamed from: a */
    public void mo117426a(InstanceInfo mVar) {
        this.f82212j = mVar;
    }

    /* renamed from: a */
    private final InstanceInfo m122449a(int i, List<InstanceInfo> list) {
        int i2;
        if (!list.isEmpty() && (i2 = i + 1) < list.size() && i2 >= 0) {
            return list.get(i2);
        }
        return null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.c$b */
    public static final class C32156b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(t.mo120126a().getStartTime()), Long.valueOf(t2.mo120126a().getStartTime()));
        }
    }
}
