package com.ss.android.lark.calendar.impl.features.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.p1539b.C32002a;
import com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract;
import com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarFragment;
import com.ss.android.lark.calendar.impl.features.search.time.TimeSelectDialog;
import com.ss.android.lark.calendar.impl.framework.busevents.RefreshSearchResultEvent;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Û\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0003\u001c\u001f(\u0018\u0000 c2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0003abcB%\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J \u00103\u001a\u0002002\u0006\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u00010\u000bJ\u0010\u00107\u001a\u0002002\u0006\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000200H\u0002J\b\u0010;\u001a\u000200H\u0002J@\u0010<\u001a\u0002002\u001a\u0010=\u001a\u0016\u0012\u0004\u0012\u00020?\u0018\u00010>j\n\u0012\u0004\u0012\u00020?\u0018\u0001`@2\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u00020?\u0018\u00010>j\n\u0012\u0004\u0012\u00020?\u0018\u0001`@H\u0002J$\u0010B\u001a\u0002002\u0012\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0D2\u0006\u0010G\u001a\u00020\u001aH\u0002J\u0006\u0010H\u001a\u000200J\u0010\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020KH\u0007J\u001e\u0010L\u001a\u0002002\u0006\u0010M\u001a\u00020?2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020N0DH\u0002J\b\u0010O\u001a\u000200H\u0002J\u0010\u0010P\u001a\u0002002\u0006\u0010Q\u001a\u00020&H\u0002J\u0010\u0010R\u001a\u0002002\u0006\u0010Q\u001a\u00020&H\u0002J\u0010\u0010S\u001a\u0002002\u0006\u0010Q\u001a\u00020&H\u0002J\u0010\u0010T\u001a\u0002002\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002002\u0006\u0010X\u001a\u00020YH\u0002Jt\u0010Z\u001a\u0002002\u0006\u0010[\u001a\u00020\u001a2\u0006\u0010\\\u001a\u00020\u001a2\u001a\u0010=\u001a\u0016\u0012\u0004\u0012\u00020?\u0018\u00010>j\n\u0012\u0004\u0012\u00020?\u0018\u0001`@2\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u00020?\u0018\u00010>j\n\u0012\u0004\u0012\u00020?\u0018\u0001`@2\"\u0010]\u001a\u001e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020_0^j\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020_``H\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u00020(X\u0004¢\u0006\u0004\n\u0002\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchModelApi;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewApi;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewAction;", "view", "model", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$ActivityDependency;", "intent", "Landroid/content/Intent;", "(Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewApi;Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchModelApi;Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$ActivityDependency;Landroid/content/Intent;)V", "getActivityDependency", "()Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$ActivityDependency;", "appendBuildingFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "buildingFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment;", "calendarFilterFragment", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment;", "currentFragment", "Landroidx/fragment/app/Fragment;", "getIntent", "()Landroid/content/Intent;", "isHitLaunchPoint", "", "mAppendBuildingFragmentAction", "com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mAppendBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mAppendBuildingFragmentAction$1;", "mBuildingFragmentAction", "com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mBuildingFragmentAction$1;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "mContainerId", "", "mMeetingRoomFragmentAction", "com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mMeetingRoomFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mMeetingRoomFragmentAction$1;", "meetingRoomFragment", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment;", "searchFilterFG", "timeSelectDialog", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog;", "create", "", "destroy", "getViewAction", "handleActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "hitPoint", "searchResultCount", "", "initCalendars", "initGoogleAccountSetting", "loadAttendeesData", "attendeeIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "groupIds", "loadCalendars", "uiCallback", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "isForceLoad", "onBackPressed", "onDeleteEvent", "refreshSearchResultEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/RefreshSearchResultEvent;", "requestSearch", "key", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "searchEvent", "showAppendBuildingFragment", "containerId", "showBuildingFragment", "showCalendarFragment", "showMeetingRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "showTimeSelectDialog", "context", "Landroid/content/Context;", "updateAttendeesIfFinish", "hasGotAttendeeData", "hasGotGroupData", "calendarEventAttendeeMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/HashMap;", "ActivityDependency", "CalendarSearchViewAction", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSearchPresenter extends BasePresenterCalendar<ICalendarSearchContract.ICalendarSearchModelApi, ICalendarSearchContract.ICalendarSearchViewApi, ICalendarSearchContract.ICalendarSearchViewData, ICalendarSearchContract.ICalendarSearchViewAction> {

    /* renamed from: g */
    public static final String f82570g = CalendarSearchPresenter.class.getSimpleName();

    /* renamed from: h */
    public static final Companion f82571h = new Companion(null);

    /* renamed from: a */
    public Fragment f82572a;

    /* renamed from: b */
    public SearchChooseCalendarFragment f82573b;

    /* renamed from: c */
    public BuildingFragment f82574c;

    /* renamed from: d */
    public ChooseMeetingRoomFragment f82575d;

    /* renamed from: e */
    public TimeSelectDialog f82576e;

    /* renamed from: f */
    public ResourceAppendFragment f82577f;

    /* renamed from: i */
    private boolean f82578i;

    /* renamed from: j */
    private int f82579j;

    /* renamed from: k */
    private final AbstractC32595g f82580k;

    /* renamed from: l */
    private final AbstractC32594f f82581l;

    /* renamed from: m */
    private final boolean f82582m = C30022a.f74883b.mo112706n();

    /* renamed from: n */
    private final C32282k f82583n;

    /* renamed from: o */
    private final C32281j f82584o;

    /* renamed from: p */
    private final C32283l f82585p;

    /* renamed from: q */
    private final ActivityDependency f82586q;

    /* renamed from: r */
    private final Intent f82587r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$ActivityDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "isUseAnimation", "", "finishActivity", "finishAllSearchActivity", "getActivityContext", "Landroid/app/Activity;", "hideEditTextKeyBoard", "hideFragment", "removeFragment", "routeMeetingRoomActivity", "calendarId", "", "showEditTextKeyBoard", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$a */
    public interface ActivityDependency {
        /* renamed from: a */
        Activity mo117938a();

        /* renamed from: a */
        void mo117941a(Fragment fragment, int i, boolean z);

        /* renamed from: a */
        void mo117942a(Fragment fragment, boolean z);

        /* renamed from: a */
        void mo117943a(String str);

        /* renamed from: a */
        void mo117944a(boolean z);

        /* renamed from: b */
        void mo117945b();

        /* renamed from: b */
        void mo117946b(Fragment fragment, boolean z);

        /* renamed from: c */
        void mo117947c();

        /* renamed from: c */
        void mo117948c(Fragment fragment, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$Companion;", "", "()V", "FILTER_AVATAR_SIZE", "", "TAG", "", "kotlin.jvm.PlatformType", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    public final ActivityDependency mo117966e() {
        return this.f82586q;
    }

    /* renamed from: f */
    public final Intent mo117967f() {
        return this.f82587r;
    }

    /* renamed from: a */
    public final void mo117961a(MeetingRoomFragmentData meetingRoomFragmentData) {
        if (this.f82579j != 0) {
            if (this.f82575d == null) {
                ChooseMeetingRoomFragment bVar = new ChooseMeetingRoomFragment(this.f82585p, meetingRoomFragmentData);
                this.f82575d = bVar;
                ActivityDependency aVar = this.f82586q;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("meetingRoomFragment");
                }
                aVar.mo117941a(bVar, this.f82579j, false);
            } else {
                ChooseMeetingRoomFragment bVar2 = this.f82575d;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("meetingRoomFragment");
                }
                bVar2.mo115284a(meetingRoomFragmentData);
                ActivityDependency aVar2 = this.f82586q;
                ChooseMeetingRoomFragment bVar3 = this.f82575d;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("meetingRoomFragment");
                }
                aVar2.mo117942a(bVar3, false);
            }
            ChooseMeetingRoomFragment bVar4 = this.f82575d;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("meetingRoomFragment");
            }
            this.f82572a = bVar4;
        }
    }

    /* renamed from: a */
    public final void mo117962a(boolean z, boolean z2, ArrayList<String> arrayList, ArrayList<String> arrayList2, HashMap<String, CalendarEventAttendee> hashMap) {
        if (z && z2) {
            if (CollectionUtils.isEmpty(hashMap)) {
                ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo117999a(null, null, new ArrayList<>(), new ArrayList());
            }
            ArrayList arrayList3 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (CalendarEventAttendee calendarEventAttendee : hashMap.values()) {
                Intrinsics.checkExpressionValueIsNotNull(calendarEventAttendee, "attendee");
                if (!calendarEventAttendee.isGroup()) {
                    arrayList3.add(calendarEventAttendee.getAttendeeCalendarId());
                }
                String avatarKey = calendarEventAttendee.getAvatarKey();
                String str = "";
                if (avatarKey == null) {
                    avatarKey = str;
                }
                String avatarEntityId = calendarEventAttendee.getAvatarEntityId();
                if (avatarEntityId != null) {
                    str = avatarEntityId;
                }
                linkedHashMap.put(avatarKey, str);
            }
            String valueOf = String.valueOf(new Date().getTime());
            float f = (float) 16;
            C30022a.f74882a.imageDependency().mo108247a(this.f82586q.mo117938a(), linkedHashMap, UIHelper.dp2px(f), UIHelper.dp2px(f), new C32289r(this, valueOf, "downloadImage", arrayList, arrayList2, arrayList3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$m */
    static final class RunnableC32284m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82620a;

        RunnableC32284m(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82620a = calendarSearchPresenter;
        }

        public final void run() {
            this.f82620a.mo117965d();
        }
    }

    /* renamed from: a */
    public ICalendarSearchContract.ICalendarSearchViewAction mo109713b() {
        return new CalendarSearchViewAction();
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$CalendarSearchViewAction;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter;)V", "onClickAttendeeFilter", "", "onClickBackIv", "onClickCalendarFilter", "containerId", "", "onClickCancelTv", "onClickMeetingRoomFilter", "onClickTimeFilter", "context", "Landroid/content/Context;", "onInputSearchKey", "key", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$b */
    public final class CalendarSearchViewAction implements ICalendarSearchContract.ICalendarSearchViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: a */
        public void mo117969a() {
            CalendarSearchPresenter.this.mo117966e().mo117944a(false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: b */
        public void mo117973b() {
            CalendarSearchPresenter.this.mo117966e().mo117944a(true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: c */
        public void mo117975c() {
            C30022a.f74882a.contactModuleDependency().mo108230a(CalendarSearchPresenter.this.mo117966e().mo117938a(), ((ICalendarSearchContract.ICalendarSearchModelApi) CalendarSearchPresenter.this.mo118652t()).mo118012j(), ((ICalendarSearchContract.ICalendarSearchModelApi) CalendarSearchPresenter.this.mo118652t()).mo118013k());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CalendarSearchViewAction() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: a */
        public void mo117970a(int i) {
            CalendarSearchPresenter.this.mo117957a(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: b */
        public void mo117974b(int i) {
            CalendarSearchPresenter.this.mo117963b(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: a */
        public void mo117971a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            CalendarSearchPresenter.this.mo117960a(context);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewAction
        /* renamed from: a */
        public void mo117972a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            ((ICalendarSearchContract.ICalendarSearchModelApi) CalendarSearchPresenter.this.mo118652t()).mo117997a(str);
            CalendarSearchPresenter.this.mo117965d();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m123092g();
        EventBus.getDefault().register(this);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        EventBus.getDefault().unregister(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mAppendBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment$IBuildingFragmentAction;", "cachePbMultiLevelData", "", "pbMultiLevelData", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "onBackPressed", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "resourceCalendarId", "selectMeetingRoom", "resourceList", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$j */
    public static final class C32281j implements ResourceAppendFragment.IBuildingFragmentAction {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82611a;

        /* renamed from: b */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchModelApi f82612b;

        /* renamed from: c */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchViewApi f82613c;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114354a(Map<String, LevelRelatedInfo> map) {
            Intrinsics.checkParameterIsNotNull(map, "pbMultiLevelData");
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114351a() {
            this.f82611a.f82572a = null;
            ResourceAppendFragment eVar = this.f82611a.f82577f;
            if (eVar != null) {
                this.f82611a.mo117966e().mo117948c(eVar, true);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114352a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            this.f82611a.mo117966e().mo117943a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment.IBuildingFragmentAction
        /* renamed from: a */
        public void mo114353a(List<AppendResourceData> list) {
            Intrinsics.checkParameterIsNotNull(list, "resourceList");
            if (!list.isEmpty()) {
                this.f82612b.mo117996a(C32002a.m121827a(list.get(0)));
                this.f82613c.mo118062d();
                this.f82611a.mo117965d();
                this.f82611a.f82572a = null;
                ResourceAppendFragment eVar = this.f82611a.f82577f;
                if (eVar != null) {
                    this.f82611a.mo117966e().mo117948c(eVar, true);
                }
            }
        }

        C32281j(CalendarSearchPresenter calendarSearchPresenter, ICalendarSearchContract.ICalendarSearchModelApi aVar, ICalendarSearchContract.ICalendarSearchViewApi cVar) {
            this.f82611a = calendarSearchPresenter;
            this.f82612b = aVar;
            this.f82613c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$showCalendarFragment$2", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment$Delegate;", "onBackPressed", "", "onSavePressed", "selectedCalendarIdList", "", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$p */
    public static final class C32287p implements SearchChooseCalendarFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82625a;

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarFragment.Delegate
        /* renamed from: a */
        public void mo117985a() {
            this.f82625a.f82572a = null;
            this.f82625a.mo117966e().mo117946b(CalendarSearchPresenter.m123085a(this.f82625a), true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32287p(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82625a = calendarSearchPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarFragment.Delegate
        /* renamed from: a */
        public void mo117986a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedCalendarIdList");
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82625a.mo118652t()).mo117998a(new ArrayList<>(list));
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82625a.mo118651s()).mo118062d();
            this.f82625a.mo117965d();
        }
    }

    /* renamed from: g */
    private final void m123092g() {
        m123093h();
        UIGetDataCallback<List<Calendar>> wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32276e(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        m123086a(wrapAndAddGetDataCallback, false);
    }

    /* renamed from: h */
    private final void m123093h() {
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32277f(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…\n            }\n        })");
        ThirdPartAccountSPUtil.m125202a(wrapAndAddGetDataCallback);
    }

    /* renamed from: c */
    public final void mo117964c() {
        Fragment fragment = this.f82572a;
        if (fragment != null) {
            this.f82586q.mo117946b(fragment, true);
            this.f82572a = null;
            return;
        }
        this.f82586q.mo117944a(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00032\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mBuildingFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingFragment$BuildingFragmentAction;", "onBackPressed", "", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "calendarId", "", "onSearchItemSavePressed", "meetingRoom", "startBoardRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$k */
    public static final class C32282k implements BuildingFragment.BuildingFragmentAction {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82614a;

        /* renamed from: b */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchModelApi f82615b;

        /* renamed from: c */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchViewApi f82616c;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114346a() {
            this.f82615b.mo117994a((EventMeetingRoomData) null);
            this.f82616c.mo118062d();
            this.f82614a.mo117965d();
            this.f82614a.f82572a = null;
            this.f82614a.mo117966e().mo117946b(CalendarSearchPresenter.m123089b(this.f82614a), true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114348a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            this.f82614a.mo117966e().mo117943a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114349a(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "chosenMeetingRoomList");
            this.f82614a.f82572a = null;
            this.f82614a.mo117966e().mo117946b(CalendarSearchPresenter.m123089b(this.f82614a), true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: b */
        public void mo114350b(ArrayList<EventMeetingRoomData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "meetingRoom");
            if (!arrayList.isEmpty()) {
                this.f82615b.mo117994a(arrayList.get(0));
                this.f82616c.mo118062d();
                this.f82614a.mo117965d();
                this.f82614a.f82572a = null;
                this.f82614a.mo117966e().mo117946b(CalendarSearchPresenter.m123089b(this.f82614a), true);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingFragment.BuildingFragmentAction
        /* renamed from: a */
        public void mo114347a(MeetingRoomFragmentData meetingRoomFragmentData) {
            Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, "meetingRoomFragmentData");
            this.f82614a.f82572a = null;
            this.f82614a.mo117966e().mo117946b(CalendarSearchPresenter.m123089b(this.f82614a), false);
            this.f82614a.mo117961a(meetingRoomFragmentData);
        }

        C32282k(CalendarSearchPresenter calendarSearchPresenter, ICalendarSearchContract.ICalendarSearchModelApi aVar, ICalendarSearchContract.ICalendarSearchViewApi cVar) {
            this.f82614a = calendarSearchPresenter;
            this.f82615b = aVar;
            this.f82616c = cVar;
        }
    }

    /* renamed from: d */
    public final void mo117965d() {
        String a = ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo117992a();
        UIGetDataCallback<SearchCalendarEventResult> wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32286o(this));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        m123087a(a, wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$handleActivityResult$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$d */
    public static final class C32275d implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82589a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32275d(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82589a = calendarSearchPresenter;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            if (list != null) {
                ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82589a.mo118652t()).mo118001a(list);
                ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82589a.mo118651s()).mo118062d();
                ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82589a.mo118651s()).mo118059a();
                this.f82589a.mo117965d();
                CalendarSearchPresenter.m123085a(this.f82589a).mo118094b(new ArrayList<>(list));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$initCalendars$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$e */
    public static final class C32276e implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82590a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32276e(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82590a = calendarSearchPresenter;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            Intrinsics.checkParameterIsNotNull(list, "calendars");
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82590a.mo118652t()).mo118005b(new ArrayList<>(list));
            ICalendarSearchContract.ICalendarSearchModelApi aVar = (ICalendarSearchContract.ICalendarSearchModelApi) this.f82590a.mo118652t();
            String stringExtra = this.f82590a.mo117967f().getStringExtra("search_key");
            if (stringExtra == null) {
                stringExtra = "";
            }
            aVar.mo117997a(stringExtra);
            if (TextUtils.isEmpty(((ICalendarSearchContract.ICalendarSearchModelApi) this.f82590a.mo118652t()).mo117992a())) {
                this.f82590a.mo117966e().mo117945b();
            }
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82590a.mo118651s()).mo118062d();
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82590a.mo118651s()).mo118059a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\n\u001a\u00020\u00072&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$initGoogleAccountSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$f */
    public static final class C32277f implements IGetDataCallback<HashMap<String, Boolean>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82591a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32277f(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82591a = calendarSearchPresenter;
        }

        /* renamed from: a */
        public void onSuccess(HashMap<String, Boolean> hashMap) {
            if (hashMap != null) {
                ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82591a.mo118652t()).mo118000a(hashMap);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$searchEvent$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$o */
    public static final class C32286o implements IGetDataCallback<SearchCalendarEventResult> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82624a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32286o(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82624a = calendarSearchPresenter;
        }

        /* renamed from: a */
        public void onSuccess(SearchCalendarEventResult fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "result");
            this.f82624a.mo117959a(fVar.mo118188c());
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82624a.mo118652t()).mo117995a(fVar);
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82624a.mo118651s()).mo118061c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$showTimeSelectDialog$2", "Lcom/ss/android/lark/calendar/impl/features/search/time/TimeSelectDialog$Delegate;", "onSavePressed", "", "startTime", "", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$q */
    public static final class C32288q implements TimeSelectDialog.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82626a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32288q(CalendarSearchPresenter calendarSearchPresenter) {
            this.f82626a = calendarSearchPresenter;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.time.TimeSelectDialog.Delegate
        /* renamed from: a */
        public void mo117987a(long j, long j2) {
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82626a.mo118652t()).mo117993a(j);
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82626a.mo118652t()).mo118004b(j2);
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82626a.mo118651s()).mo118062d();
            this.f82626a.mo117965d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$mMeetingRoomFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$MeetingRoomFragmentAction;", "onBackPressed", "", "isShowUsableBoardroom", "", "onMeetingRoomInfoClicked", "resourceCalendarId", "", "onSavePressed", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$l */
    public static final class C32283l implements ChooseMeetingRoomFragment.MeetingRoomFragmentAction {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82617a;

        /* renamed from: b */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchModelApi f82618b;

        /* renamed from: c */
        final /* synthetic */ ICalendarSearchContract.ICalendarSearchViewApi f82619c;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114380a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            this.f82617a.mo117966e().mo117943a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114379a(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoomData");
            this.f82618b.mo117994a(eventMeetingRoomData);
            this.f82619c.mo118062d();
            this.f82617a.mo117965d();
            this.f82617a.f82572a = null;
            this.f82617a.mo117966e().mo117946b(CalendarSearchPresenter.m123090c(this.f82617a), true);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseMeetingRoomFragment.MeetingRoomFragmentAction
        /* renamed from: a */
        public void mo114381a(boolean z) {
            this.f82617a.mo117966e().mo117946b(CalendarSearchPresenter.m123090c(this.f82617a), false);
            this.f82617a.mo117966e().mo117942a(CalendarSearchPresenter.m123089b(this.f82617a), false);
            CalendarSearchPresenter calendarSearchPresenter = this.f82617a;
            calendarSearchPresenter.f82572a = CalendarSearchPresenter.m123089b(calendarSearchPresenter);
        }

        C32283l(CalendarSearchPresenter calendarSearchPresenter, ICalendarSearchContract.ICalendarSearchModelApi aVar, ICalendarSearchContract.ICalendarSearchViewApi cVar) {
            this.f82617a = calendarSearchPresenter;
            this.f82618b = aVar;
            this.f82619c = cVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SearchChooseCalendarFragment m123085a(CalendarSearchPresenter calendarSearchPresenter) {
        SearchChooseCalendarFragment dVar = calendarSearchPresenter.f82573b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ BuildingFragment m123089b(CalendarSearchPresenter calendarSearchPresenter) {
        BuildingFragment aVar = calendarSearchPresenter.f82574c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildingFragment");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ ChooseMeetingRoomFragment m123090c(CalendarSearchPresenter calendarSearchPresenter) {
        ChooseMeetingRoomFragment bVar = calendarSearchPresenter.f82575d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("meetingRoomFragment");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$loadCalendars$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$i */
    public static final class C32280i implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ String f82608a;

        /* renamed from: b */
        final /* synthetic */ String f82609b;

        /* renamed from: c */
        final /* synthetic */ UIGetDataCallback f82610c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSearchPresenter.f82570g, C32673y.m125370a(this.f82608a, this.f82609b, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i(CalendarSearchPresenter.f82570g, C32673y.m125373a(this.f82608a, this.f82609b, "calendars_size", str));
            if (list == null) {
                onError(new ErrorResult("calendars is null"));
            } else {
                this.f82610c.onSuccess(list);
            }
        }

        C32280i(String str, String str2, UIGetDataCallback uIGetDataCallback) {
            this.f82608a = str;
            this.f82609b = str2;
            this.f82610c = uIGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$requestSearch$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$n */
    public static final class C32285n implements IGetDataCallback<SearchCalendarEventResult> {

        /* renamed from: a */
        final /* synthetic */ String f82621a;

        /* renamed from: b */
        final /* synthetic */ String f82622b;

        /* renamed from: c */
        final /* synthetic */ UIGetDataCallback f82623c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165383e(CalendarSearchPresenter.f82570g, C32673y.m125370a(this.f82621a, this.f82622b, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(SearchCalendarEventResult fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "result");
            Log.m165389i(CalendarSearchPresenter.f82570g, C32673y.m125373a(this.f82621a, this.f82622b, "instance_size", String.valueOf(fVar.mo118186a().size()), "content_size", String.valueOf(fVar.mo118187b().size())));
            this.f82623c.onSuccess(fVar);
        }

        C32285n(String str, String str2, UIGetDataCallback uIGetDataCallback) {
            this.f82621a = str;
            this.f82622b = str2;
            this.f82623c = uIGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$updateAttendeesIfFinish$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/graphics/Bitmap;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "bitmapList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$r */
    public static final class C32289r implements IGetDataCallback<List<? extends Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82627a;

        /* renamed from: b */
        final /* synthetic */ String f82628b;

        /* renamed from: c */
        final /* synthetic */ String f82629c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f82630d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f82631e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f82632f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSearchPresenter.f82570g, C32673y.m125370a(this.f82628b, this.f82629c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<Bitmap> list) {
            Intrinsics.checkParameterIsNotNull(list, "bitmapList");
            Log.m165389i(CalendarSearchPresenter.f82570g, C32673y.m125373a(this.f82628b, this.f82629c, "bitmap_size", String.valueOf(list.size())));
            ((ICalendarSearchContract.ICalendarSearchModelApi) this.f82627a.mo118652t()).mo117999a(this.f82630d, this.f82631e, this.f82632f, list);
            ((ICalendarSearchContract.ICalendarSearchViewApi) this.f82627a.mo118651s()).mo118062d();
            this.f82627a.mo117965d();
        }

        C32289r(CalendarSearchPresenter calendarSearchPresenter, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f82627a = calendarSearchPresenter;
            this.f82628b = str;
            this.f82629c = str2;
            this.f82630d = arrayList;
            this.f82631e = arrayList2;
            this.f82632f = arrayList3;
        }
    }

    @Subscribe
    public final void onDeleteEvent(RefreshSearchResultEvent kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "refreshSearchResultEvent");
        UICallbackExecutor.executeDelayed(new RunnableC32284m(this), 300);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$loadAttendeesData$attendeeCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "stringCalendarEventAttendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$g */
    public static final class C32278g implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82592a;

        /* renamed from: b */
        final /* synthetic */ String f82593b;

        /* renamed from: c */
        final /* synthetic */ String f82594c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f82595d;

        /* renamed from: e */
        final /* synthetic */ HashMap f82596e;

        /* renamed from: f */
        final /* synthetic */ Ref.BooleanRef f82597f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f82598g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f82599h;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSearchPresenter.f82570g, C32673y.m125370a(this.f82593b, this.f82594c, errorResult));
            this.f82595d.element = true;
            this.f82592a.mo117962a(this.f82595d.element, this.f82597f.element, this.f82598g, this.f82599h, this.f82596e);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i(CalendarSearchPresenter.f82570g, C32673y.m125373a(this.f82593b, this.f82594c, "chatter_id_attendees_size", str));
            this.f82595d.element = true;
            if (map != null) {
                this.f82596e.putAll(map);
            }
            this.f82592a.mo117962a(this.f82595d.element, this.f82597f.element, this.f82598g, this.f82599h, this.f82596e);
        }

        C32278g(CalendarSearchPresenter calendarSearchPresenter, String str, String str2, Ref.BooleanRef booleanRef, HashMap hashMap, Ref.BooleanRef booleanRef2, ArrayList arrayList, ArrayList arrayList2) {
            this.f82592a = calendarSearchPresenter;
            this.f82593b = str;
            this.f82594c = str2;
            this.f82595d = booleanRef;
            this.f82596e = hashMap;
            this.f82597f = booleanRef2;
            this.f82598g = arrayList;
            this.f82599h = arrayList2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/CalendarSearchPresenter$loadAttendeesData$groupCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "stringCalendarEventAttendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.CalendarSearchPresenter$h */
    public static final class C32279h implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSearchPresenter f82600a;

        /* renamed from: b */
        final /* synthetic */ String f82601b;

        /* renamed from: c */
        final /* synthetic */ String f82602c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f82603d;

        /* renamed from: e */
        final /* synthetic */ HashMap f82604e;

        /* renamed from: f */
        final /* synthetic */ Ref.BooleanRef f82605f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f82606g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f82607h;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarSearchPresenter.f82570g, C32673y.m125370a(this.f82601b, this.f82602c, errorResult));
            this.f82603d.element = true;
            this.f82600a.mo117962a(this.f82605f.element, this.f82603d.element, this.f82606g, this.f82607h, this.f82604e);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            Log.m165389i(CalendarSearchPresenter.f82570g, C32673y.m125373a(this.f82601b, this.f82602c, "groups_size", map == null ? "null" : "" + map.size()));
            this.f82603d.element = true;
            if (map != null) {
                if (CollectionUtils.isNotEmpty(map)) {
                    for (CalendarEventAttendee calendarEventAttendee : map.values()) {
                        calendarEventAttendee.setIsGroup(true);
                    }
                }
                this.f82604e.putAll(map);
            }
            this.f82600a.mo117962a(this.f82605f.element, this.f82603d.element, this.f82606g, this.f82607h, this.f82604e);
        }

        C32279h(CalendarSearchPresenter calendarSearchPresenter, String str, String str2, Ref.BooleanRef booleanRef, HashMap hashMap, Ref.BooleanRef booleanRef2, ArrayList arrayList, ArrayList arrayList2) {
            this.f82600a = calendarSearchPresenter;
            this.f82601b = str;
            this.f82602c = str2;
            this.f82603d = booleanRef;
            this.f82604e = hashMap;
            this.f82605f = booleanRef2;
            this.f82606g = arrayList;
            this.f82607h = arrayList2;
        }
    }

    /* renamed from: c */
    private final void m123091c(int i) {
        this.f82586q.mo117947c();
        if (this.f82582m) {
            ((ICalendarSearchContract.ICalendarSearchViewApi) mo118651s()).mo118060b();
        }
        ResourceAppendFragment a = ResourceAppendFragment.f81871a.mo116914a(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118017o());
        a.mo116910a(this.f82584o);
        this.f82586q.mo117941a(a, i, true);
        this.f82577f = a;
        this.f82579j = i;
        this.f82572a = a;
    }

    /* renamed from: a */
    public final void mo117959a(long j) {
        if (!this.f82578i) {
            if (TextUtils.isEmpty(this.f82587r.getStringExtra("search_key"))) {
                GeneralHitPoint.m124195a("tab", j);
            } else {
                GeneralHitPoint.m124195a("more", j);
            }
            this.f82578i = true;
        }
    }

    /* renamed from: b */
    public final void mo117963b(int i) {
        if (C30022a.f74883b.mo112692F()) {
            m123091c(i);
            return;
        }
        this.f82586q.mo117947c();
        if (this.f82582m) {
            ((ICalendarSearchContract.ICalendarSearchViewApi) mo118651s()).mo118060b();
        }
        if (this.f82574c == null) {
            BuildingFragment aVar = new BuildingFragment(this.f82583n, ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118016n());
            this.f82574c = aVar;
            ActivityDependency aVar2 = this.f82586q;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buildingFragment");
            }
            aVar2.mo117941a(aVar, i, true);
        } else {
            BuildingFragment aVar3 = this.f82574c;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buildingFragment");
            }
            aVar3.mo115668a(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118016n());
            ActivityDependency aVar4 = this.f82586q;
            BuildingFragment aVar5 = this.f82574c;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("buildingFragment");
            }
            aVar4.mo117942a(aVar5, true);
        }
        this.f82579j = i;
        BuildingFragment aVar6 = this.f82574c;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("buildingFragment");
        }
        this.f82572a = aVar6;
    }

    /* renamed from: a */
    public final void mo117957a(int i) {
        this.f82586q.mo117947c();
        if (this.f82573b == null) {
            SearchChooseCalendarFragment a = SearchChooseCalendarFragment.f82725e.mo118095a(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118010h(), ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118011i());
            this.f82573b = a;
            if (a == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
            }
            a.mo118092a(new C32287p(this));
            ActivityDependency aVar = this.f82586q;
            SearchChooseCalendarFragment dVar = this.f82573b;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
            }
            aVar.mo117941a(dVar, i, true);
        } else {
            SearchChooseCalendarFragment dVar2 = this.f82573b;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
            }
            dVar2.mo118093a(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118009g());
            ActivityDependency aVar2 = this.f82586q;
            SearchChooseCalendarFragment dVar3 = this.f82573b;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
            }
            aVar2.mo117942a(dVar3, true);
        }
        SearchChooseCalendarFragment dVar4 = this.f82573b;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("calendarFilterFragment");
        }
        this.f82572a = dVar4;
    }

    /* renamed from: a */
    public final void mo117960a(Context context) {
        if (this.f82576e == null) {
            this.f82576e = new TimeSelectDialog(context, new C32288q(this));
        }
        TimeSelectDialog eVar = this.f82576e;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSelectDialog");
        }
        eVar.mo118242a(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118006c(), ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118007d());
        TimeSelectDialog eVar2 = this.f82576e;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("timeSelectDialog");
        }
        eVar2.show();
    }

    /* renamed from: a */
    private final void m123086a(UIGetDataCallback<List<Calendar>> uIGetDataCallback, boolean z) {
        C30076a a = C30076a.m111290a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarServiceModel.getInstance()");
        List<Calendar> d = a.mo108434d();
        if (CollectionUtils.isNotEmpty(d) && !z) {
            uIGetDataCallback.onSuccess(d);
        }
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f82570g, C32673y.m125376b(valueOf, "loadCalendarData", new String[0]));
        C30076a.m111290a().mo108432c(new C32280i(valueOf, "loadCalendarData", uIGetDataCallback));
    }

    /* renamed from: a */
    private final void m123087a(String str, UIGetDataCallback<SearchCalendarEventResult> uIGetDataCallback) {
        Long l;
        Long l2 = null;
        if (((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118006c() == -1) {
            l = null;
        } else {
            l = Long.valueOf(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118006c());
        }
        if (((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118007d() != -1) {
            l2 = Long.valueOf(((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118007d());
        }
        ArrayList<String> g = ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118009g();
        ArrayList m = ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118015m();
        if (m == null) {
            m = new ArrayList();
        }
        ArrayList<String> p = ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118018p();
        ArrayList<String> k = ((ICalendarSearchContract.ICalendarSearchModelApi) mo118652t()).mo118013k();
        if (k == null) {
            k = new ArrayList<>();
        }
        String l3 = Long.toString(new Date().getTime());
        Log.m165389i(f82570g, C32673y.m125376b(l3, "requestSearch", new String[0]));
        CalendarSDKService.f83473a.mo118943a(str, g, m, p, k, l, l2, new C32285n(l3, "requestSearch", uIGetDataCallback));
    }

    /* renamed from: a */
    private final void m123088a(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        ArrayList<String> arrayList3 = arrayList;
        booleanRef.element = CollectionUtils.isEmpty(arrayList3);
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        ArrayList<String> arrayList4 = arrayList2;
        booleanRef2.element = CollectionUtils.isEmpty(arrayList4);
        HashMap<String, CalendarEventAttendee> hashMap = new HashMap<>();
        if (booleanRef.element && booleanRef2.element) {
            mo117962a(booleanRef.element, booleanRef2.element, arrayList, arrayList2, hashMap);
        }
        String l = Long.toString(new Date().getTime());
        if (arrayList == null) {
            str = "null";
        } else {
            str = "" + arrayList.size();
        }
        String str5 = f82570g;
        Log.m165389i(str5, C32673y.m125376b(l, "getAttendeesByChatterIds", "chatter_ids_size", str));
        if (CollectionUtils.isNotEmpty(arrayList3)) {
            str3 = "null";
            i = 2;
            str2 = str5;
            this.f82581l.mo118880b(arrayList, mo118653u().wrapAndAddGetDataCallback(new C32278g(this, l, "getAttendeesByChatterIds", booleanRef, hashMap, booleanRef2, arrayList, arrayList2)));
        } else {
            str2 = str5;
            str3 = "null";
            i = 2;
        }
        String l2 = Long.toString(new Date().getTime());
        if (arrayList2 == null) {
            str4 = str3;
        } else {
            str4 = "" + arrayList2.size();
        }
        String[] strArr = new String[i];
        strArr[0] = "ids_size";
        strArr[1] = str4;
        Log.m165389i(str2, C32673y.m125376b(l2, "getGroupByChatterIds", strArr));
        if (CollectionUtils.isNotEmpty(arrayList4)) {
            this.f82580k.mo119045c(arrayList2, mo118653u().wrapAndAddGetDataCallback(new C32279h(this, l2, "getGroupByChatterIds", booleanRef2, hashMap, booleanRef, arrayList, arrayList2)));
        }
    }

    /* renamed from: a */
    public final void mo117958a(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        if (i != 1) {
            if (i == 2 && i2 == -1) {
                ArrayList<String> arrayList2 = null;
                if (intent != null) {
                    arrayList = intent.getStringArrayListExtra("picker_selected_chatter_result");
                } else {
                    arrayList = null;
                }
                if (intent != null) {
                    arrayList2 = intent.getStringArrayListExtra("picker_selected_group_result");
                }
                m123088a(arrayList, arrayList2);
            }
        } else if (this.f82573b != null) {
            UIGetDataCallback<List<Calendar>> wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(new C32275d(this));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…}\n\n                    })");
            m123086a(wrapAndAddGetDataCallback, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSearchPresenter(ICalendarSearchContract.ICalendarSearchViewApi cVar, ICalendarSearchContract.ICalendarSearchModelApi aVar, ActivityDependency aVar2, Intent intent) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar2, "activityDependency");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f82586q = aVar2;
        this.f82587r = intent;
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f82580k = a;
        C32533b a2 = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarEventService.getInstance()");
        this.f82581l = a2;
        this.f82583n = new C32282k(this, aVar, cVar);
        this.f82584o = new C32281j(this, aVar, cVar);
        this.f82585p = new C32283l(this, aVar, cVar);
    }
}
