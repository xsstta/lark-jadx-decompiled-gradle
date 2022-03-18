package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0004-./0B'\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0014J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\u0006\u0010!\u001a\u00020\u001dJ\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020$H\u0002J\u0016\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020$2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView$ViewDelegate;", "model", "view", "context", "Landroid/content/Context;", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeModel;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView;Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$FragmentDependency;)V", "currentViewType", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "getCurrentViewType", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "setCurrentViewType", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;)V", "mContext", "mFragmentDependency", "mMeetingRoomSubscribeFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment;", "meetingDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$MeetingRoomDelegete;", "uiHandler", "Landroid/os/Handler;", "getUiHandler", "()Landroid/os/Handler;", "create", "", "createViewDelegate", "fetchAllMeetingRoomBuildings", "loadDate", "onBackPressed", "searchContactCalendars", SearchIntents.EXTRA_QUERY, "", "searchMeetingRoom", "searchText", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "searchShareCalendars", "sendHitPoint", "actionType", "sendSubscribeHitPoint", "Companion", "FragmentDependency", "MeetingRoomDelegete", "PresenterViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSubscribePresenter extends BasePresenter<CalendarSubscribeContract.ICalendarSubscribeModel, CalendarSubscribeContract.ICalendarSubscribeView, CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate> {

    /* renamed from: e */
    public static final Companion f76498e = new Companion(null);

    /* renamed from: a */
    public final Context f76499a;

    /* renamed from: b */
    public final FragmentDependency f76500b;

    /* renamed from: c */
    public MeetingRoomSubscribeFragment f76501c;

    /* renamed from: d */
    public final MeetingRoomDelegete f76502d = new MeetingRoomDelegete();

    /* renamed from: f */
    private SubViewType f76503f = SubViewType.Contact;

    /* renamed from: g */
    private final Handler f76504g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$FragmentDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "hideFragment", "routeMeetingRoomActivity", "resourceCalendarId", "", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$b */
    public interface FragmentDependency {
        /* renamed from: a */
        void mo110333a(Fragment fragment);

        /* renamed from: a */
        void mo110334a(Fragment fragment, int i);

        /* renamed from: a */
        void mo110335a(String str);

        /* renamed from: b */
        void mo110336b(Fragment fragment);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final SubViewType mo110318a() {
        return this.f76503f;
    }

    /* renamed from: b */
    public final Handler mo110323b() {
        return this.f76504g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$MeetingRoomDelegete;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;)V", "onMeetingFragmentBackPressed", "", "onMeetingRoomInfoClicked", "resourceCalendarId", "", "setCurrentView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public final class MeetingRoomDelegete implements MeetingRoomSubscribeFragment.Delegate {
        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment.Delegate
        public void onMeetingFragmentBackPressed() {
            CalendarSubscribePresenter.this.mo110329f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment.Delegate
        public void setCurrentView() {
            CalendarSubscribePresenter.this.mo110319a(SubViewType.MeetingRoomFragment);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MeetingRoomDelegete() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment.Delegate
        public void onMeetingRoomInfoClicked(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            CalendarSubscribePresenter.this.f76500b.mo110335a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate createViewDelegate() {
        return new PresenterViewDelegate();
    }

    /* renamed from: c */
    public final void mo110326c() {
        mo110320a("");
        mo110328e();
        mo110325b("");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J,\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u001c\u0010\u001b\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter;)V", "onBackPressed", "", "onBuildingExpandRoomsItemClicked", "buildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "onCalendarSubClicked", "viewData", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "position", "", "onLoadMore", "searchText", "", "pageCount", "viewType", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "onMeetingRoomBuildingItemClicked", "chooseCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onMeetingRoomInfoClicked", "resourceCalendarId", "onSearchTextChanged", "setCurrentView", "currentView", "updateMeetingRoomFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c */
    public final class PresenterViewDelegate implements CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110337a() {
            if (((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110383c()) {
                MeetingRoomSubscribeFragment meetingRoomSubscribeFragment = CalendarSubscribePresenter.this.f76501c;
                if (meetingRoomSubscribeFragment == null) {
                    Intrinsics.throwNpe();
                }
                meetingRoomSubscribeFragment.mo110586c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$c */
        static final class RunnableC30582c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76510a;

            /* renamed from: b */
            final /* synthetic */ int f76511b;

            RunnableC30582c(PresenterViewDelegate cVar, int i) {
                this.f76510a = cVar;
                this.f76511b = i;
            }

            public final void run() {
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76511b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$e */
        static final class RunnableC30584e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76515a;

            /* renamed from: b */
            final /* synthetic */ int f76516b;

            RunnableC30584e(PresenterViewDelegate cVar, int i) {
                this.f76515a = cVar;
                this.f76516b = i;
            }

            public final void run() {
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76516b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002@\u0012<\u0012:\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0002j\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0007`\u00060\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016JH\u0010\f\u001a\u00020\t2>\u0010\r\u001a:\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0002j\"\u0012\u0004\u0012\u00020\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0007`\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onBuildingExpandRoomsItemClicked$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "buildingsMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$a */
        public static final class C30580a implements IGetDataCallback<HashMap<String, ArrayList<SubscribeMeetingRoomData>>> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76506a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30580a(PresenterViewDelegate cVar) {
                this.f76506a = cVar;
            }

            /* renamed from: a */
            public void onSuccess(HashMap<String, ArrayList<SubscribeMeetingRoomData>> hashMap) {
                Intrinsics.checkParameterIsNotNull(hashMap, "buildingsMap");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110374a(hashMap);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PresenterViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onCalendarSubClicked$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "p0", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$b */
        public static final class C30581b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76507a;

            /* renamed from: b */
            final /* synthetic */ SubscribeBaseData f76508b;

            /* renamed from: c */
            final /* synthetic */ int f76509c;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo110346a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo110346a(boolean z) {
                this.f76508b.mo110431a(false);
                this.f76508b.mo110433b(false);
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76509c);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationSucceeded);
                CalendarSubscribePresenter.this.mo110322a("unsub", CalendarSubscribePresenter.this.mo110318a());
                GeneralHitPoint.m124182a(CalendarSubscribePresenter.this.mo110318a());
                EventBus.getDefault().trigger(new C32493l());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "p0");
                this.f76508b.mo110431a(true);
                this.f76508b.mo110433b(false);
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76509c);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationFailed);
            }

            C30581b(PresenterViewDelegate cVar, SubscribeBaseData bVar, int i) {
                this.f76507a = cVar;
                this.f76508b = bVar;
                this.f76509c = i;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110338a(SubViewType subViewType) {
            Intrinsics.checkParameterIsNotNull(subViewType, "currentView");
            CalendarSubscribePresenter.this.mo110319a(subViewType);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onLoadMore$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "Lkotlin/collections/ArrayList;", "onError", "", "p0", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$f */
        public static final class C30585f implements IGetDataCallback<ArrayList<SubscribeContactData>> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76517a;

            /* renamed from: b */
            final /* synthetic */ SubViewType f76518b;

            /* renamed from: a */
            public void onSuccess(ArrayList<SubscribeContactData> arrayList) {
                Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110379b(arrayList, this.f76518b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "p0");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110388e(this.f76518b);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationFailed);
            }

            C30585f(PresenterViewDelegate cVar, SubViewType subViewType) {
                this.f76517a = cVar;
                this.f76518b = subViewType;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onLoadMore$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$g */
        public static final class C30586g implements IGetDataCallback<ArrayList<SubscribeMeetingRoomData>> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76519a;

            /* renamed from: b */
            final /* synthetic */ SubViewType f76520b;

            /* renamed from: a */
            public void onSuccess(ArrayList<SubscribeMeetingRoomData> arrayList) {
                Intrinsics.checkParameterIsNotNull(arrayList, "searchMeetingRoom");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110389e(arrayList);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110388e(this.f76520b);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationFailed);
            }

            C30586g(PresenterViewDelegate cVar, SubViewType subViewType) {
                this.f76519a = cVar;
                this.f76520b = subViewType;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onLoadMore$3", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$h */
        public static final class C30587h implements IGetDataCallback<ArrayList<SubscribeBaseData>> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76521a;

            /* renamed from: b */
            final /* synthetic */ SubViewType f76522b;

            /* renamed from: a */
            public void onSuccess(ArrayList<SubscribeBaseData> arrayList) {
                Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110382c(arrayList, this.f76522b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110388e(this.f76522b);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationFailed);
            }

            C30587h(PresenterViewDelegate cVar, SubViewType subViewType) {
                this.f76521a = cVar;
                this.f76522b = subViewType;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110341a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
            CalendarSubscribePresenter.this.f76500b.mo110335a(str);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$PresenterViewDelegate$onCalendarSubClicked$3", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "p0", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$c$d */
        public static final class C30583d implements IGetDataCallback<Calendar> {

            /* renamed from: a */
            final /* synthetic */ PresenterViewDelegate f76512a;

            /* renamed from: b */
            final /* synthetic */ SubscribeBaseData f76513b;

            /* renamed from: c */
            final /* synthetic */ int f76514c;

            /* renamed from: a */
            public void onSuccess(Calendar calendar) {
                Calendar.AccessRole accessRole;
                this.f76513b.mo110431a(true);
                this.f76513b.mo110433b(false);
                if (calendar != null) {
                    accessRole = calendar.getSelfAccessRole();
                } else {
                    accessRole = null;
                }
                if (accessRole == Calendar.AccessRole.OWNER) {
                    this.f76513b.mo110435c(true);
                }
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76514c);
                LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationSucceeded);
                CalendarSubscribePresenter.this.mo110322a("sub", CalendarSubscribePresenter.this.mo110318a());
                CalendarSubscribePresenter.this.mo110324b(CalendarSubscribePresenter.this.mo110318a());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "p0");
                this.f76513b.mo110431a(false);
                this.f76513b.mo110433b(false);
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110377b(CalendarSubscribePresenter.this.mo110318a());
                ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110371a(this.f76514c);
                if (errorResult.getErrorCode() == 8030) {
                    LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_NumLimit);
                } else {
                    LKUIToast.show(CalendarSubscribePresenter.this.f76499a, (int) R.string.Calendar_SubscribeCalendar_OperationFailed);
                }
            }

            C30583d(PresenterViewDelegate cVar, SubscribeBaseData bVar, int i) {
                this.f76512a = cVar;
                this.f76513b = bVar;
                this.f76514c = i;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110340a(CalendarBuilding calendarBuilding) {
            Intrinsics.checkParameterIsNotNull(calendarBuilding, "chooseCalendarBuilding");
            if (CalendarSubscribePresenter.this.f76501c == null) {
                CalendarSubscribePresenter calendarSubscribePresenter = CalendarSubscribePresenter.this;
                MeetingRoomDelegete meetingRoomDelegete = calendarSubscribePresenter.f76502d;
                CalendarSubscribeContract.ICalendarSubscribeView bVar = (CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView();
                if (bVar != null) {
                    calendarSubscribePresenter.f76501c = new MeetingRoomSubscribeFragment(calendarBuilding, meetingRoomDelegete, (CalendarSubscribeView) bVar);
                    CalendarSubscribePresenter.this.f76500b.mo110334a(CalendarSubscribePresenter.this.f76501c, ((CalendarSubscribeContract.ICalendarSubscribeView) CalendarSubscribePresenter.this.getView()).mo110369a());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView");
            }
            MeetingRoomSubscribeFragment meetingRoomSubscribeFragment = CalendarSubscribePresenter.this.f76501c;
            if (meetingRoomSubscribeFragment != null) {
                meetingRoomSubscribeFragment.mo110583a(calendarBuilding);
            }
            CalendarSubscribePresenter.this.f76500b.mo110333a(CalendarSubscribePresenter.this.f76501c);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110339a(SubscribeBaseData bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "viewData");
            if (!bVar.mo110444h()) {
                if (bVar.mo110432a()) {
                    ((CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel()).mo110368b(bVar.mo110445i(), new C30581b(this, bVar, i));
                    bVar.mo110433b(true);
                    CalendarSubscribePresenter.this.mo110323b().postDelayed(new RunnableC30582c(this, i), 300);
                    return;
                }
                ((CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel()).mo110365a(bVar.mo110445i(), new C30583d(this, bVar, i));
                bVar.mo110433b(true);
                CalendarSubscribePresenter.this.mo110323b().postDelayed(new RunnableC30584e(this, i), 300);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110343a(String str, MeetingRoomFilter meetingRoomFilter) {
            if (str == null) {
                str = "";
            }
            if (str != null) {
                String obj = StringsKt.trim((CharSequence) str).toString();
                int i = C30619e.f76634b[CalendarSubscribePresenter.this.mo110318a().ordinal()];
                if (i == 1) {
                    CalendarSubscribePresenter.this.mo110320a(obj);
                } else if (i != 2) {
                    if (i == 3) {
                        CalendarSubscribePresenter.this.mo110325b(obj);
                    }
                } else if (!TextUtils.isEmpty(obj)) {
                    CalendarSubscribePresenter.this.mo110321a(obj, meetingRoomFilter);
                } else {
                    CalendarSubscribePresenter.this.mo110328e();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110344a(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter) {
            Intrinsics.checkParameterIsNotNull(list, "buildings");
            Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
            ((CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel()).mo110366a(list, meetingRoomFilter, new C30580a(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate
        /* renamed from: a */
        public void mo110342a(String str, int i, SubViewType subViewType, MeetingRoomFilter meetingRoomFilter) {
            String str2;
            Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
            int i2 = C30619e.f76633a[subViewType.ordinal()];
            if (i2 == 1) {
                CalendarSubscribeContract.ICalendarSubscribeModel aVar = (CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel();
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = "";
                }
                aVar.mo110363a(str2, i * 24, 24, false, false, new C30585f(this, subViewType));
            } else if (i2 == 2) {
                CalendarSubscribeContract.ICalendarSubscribeModel aVar2 = (CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel();
                if (str == null) {
                    str = "";
                }
                aVar2.mo110364a(str, meetingRoomFilter, i + 1, new C30586g(this, subViewType));
            } else if (i2 == 3) {
                CalendarSubscribeContract.ICalendarSubscribeModel aVar3 = (CalendarSubscribeContract.ICalendarSubscribeModel) CalendarSubscribePresenter.this.getModel();
                if (str == null) {
                    str = "";
                }
                aVar3.mo110362a(str, i * 24, 24, new C30587h(this, subViewType));
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((CalendarSubscribeContract.ICalendarSubscribeModel) getModel()).mo110367b(new C30588d(this));
    }

    /* renamed from: e */
    public final void mo110328e() {
        ((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110380c(SubViewType.MeetingRoom);
        ((CalendarSubscribeContract.ICalendarSubscribeModel) getModel()).mo110361a(new C30589e(this));
    }

    /* renamed from: f */
    public final void mo110329f() {
        ((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110376b();
        MeetingRoomSubscribeFragment meetingRoomSubscribeFragment = this.f76501c;
        if (meetingRoomSubscribeFragment != null) {
            this.f76500b.mo110336b(meetingRoomSubscribeFragment);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$d */
    public static final class C30588d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribePresenter f76523a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30588d(CalendarSubscribePresenter calendarSubscribePresenter) {
            this.f76523a = calendarSubscribePresenter;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("CalendarSubscribePresenter", C32673y.m125378d("load_subscribe_calendar_result_" + bool));
            this.f76523a.mo110326c();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarSubscribePresenter", C32673y.m125378d("load_subscribe_calendar_err"));
            this.f76523a.mo110326c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$fetchAllMeetingRoomBuildings$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "buildings", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$e */
    public static final class C30589e implements IGetDataCallback<Map<String, ? extends CalendarBuilding>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribePresenter f76524a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30589e(CalendarSubscribePresenter calendarSubscribePresenter) {
            this.f76524a = calendarSubscribePresenter;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            CalendarPerfMonitor.m124417b("key_subscribe_meetingroom_calendar");
            ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76524a.getView()).mo110385d(SubViewType.MeetingRoom);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarBuilding> map) {
            String a = ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76524a.getView()).mo110370a(SubViewType.MeetingRoom);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } else if (!(!Intrinsics.areEqual("", StringsKt.trim((CharSequence) a).toString()))) {
                if (CollectionUtils.isNotEmpty(map)) {
                    if (map == null) {
                        Intrinsics.throwNpe();
                    }
                    ArrayList arrayList = new ArrayList(map.values());
                    CollectionsKt.sortWith(arrayList, C30590a.f76525a);
                    ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76524a.getView()).mo110375a((List<? extends CalendarBuilding>) arrayList);
                    return;
                }
                ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76524a.getView()).mo110387e();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$e$a */
        public static final class C30590a<T> implements Comparator<CalendarBuilding> {

            /* renamed from: a */
            public static final C30590a f76525a = new C30590a();

            C30590a() {
            }

            /* renamed from: a */
            public final int compare(CalendarBuilding calendarBuilding, CalendarBuilding calendarBuilding2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarBuilding2, "o2");
                int weight = calendarBuilding2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarBuilding, "o1");
                return weight - calendarBuilding.getWeight();
            }
        }
    }

    /* renamed from: a */
    public final void mo110319a(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "<set-?>");
        this.f76503f = subViewType;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$searchContactCalendars$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$f */
    public static final class C30591f implements IGetDataCallback<ArrayList<SubscribeContactData>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribePresenter f76526a;

        /* renamed from: b */
        final /* synthetic */ String f76527b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarPerfMonitor.m124417b("key_subscribe_contact_calendar");
            ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76526a.getView()).mo110385d(SubViewType.Contact);
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<SubscribeContactData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
            String str = this.f76527b;
            String a = ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76526a.getView()).mo110370a(SubViewType.Contact);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } else if (!(!Intrinsics.areEqual(str, StringsKt.trim((CharSequence) a).toString()))) {
                String str2 = this.f76527b;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                } else if (TextUtils.isEmpty(StringsKt.trim((CharSequence) str2).toString())) {
                    ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76526a.getView()).mo110381c(arrayList);
                } else {
                    ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76526a.getView()).mo110373a(arrayList, SubViewType.Contact);
                }
            }
        }

        C30591f(CalendarSubscribePresenter calendarSubscribePresenter, String str) {
            this.f76526a = calendarSubscribePresenter;
            this.f76527b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$searchMeetingRoom$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$g */
    public static final class C30592g implements IGetDataCallback<ArrayList<SubscribeMeetingRoomData>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribePresenter f76528a;

        /* renamed from: b */
        final /* synthetic */ String f76529b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76528a.getView()).mo110385d(SubViewType.MeetingRoom);
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<SubscribeMeetingRoomData> arrayList) {
            String str = this.f76529b;
            String a = ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76528a.getView()).mo110370a(SubViewType.MeetingRoom);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } else if (!(!Intrinsics.areEqual(str, StringsKt.trim((CharSequence) a).toString()))) {
                ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76528a.getView()).mo110372a(arrayList);
            }
        }

        C30592g(CalendarSubscribePresenter calendarSubscribePresenter, String str) {
            this.f76528a = calendarSubscribePresenter;
            this.f76529b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribePresenter$searchShareCalendars$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "Lkotlin/collections/ArrayList;", "onError", "", "p0", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribePresenter$h */
    public static final class C30593h implements IGetDataCallback<ArrayList<SubscribeBaseData>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribePresenter f76530a;

        /* renamed from: b */
        final /* synthetic */ String f76531b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "p0");
            CalendarPerfMonitor.m124417b("key_subscribe_public_calendar");
            ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76530a.getView()).mo110385d(SubViewType.ShareCalendar);
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<SubscribeBaseData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
            String str = this.f76531b;
            String a = ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76530a.getView()).mo110370a(SubViewType.ShareCalendar);
            if (a == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } else if (!(!Intrinsics.areEqual(str, StringsKt.trim((CharSequence) a).toString()))) {
                String str2 = this.f76531b;
                if (str2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                } else if (TextUtils.isEmpty(StringsKt.trim((CharSequence) str2).toString())) {
                    ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76530a.getView()).mo110386d(arrayList);
                } else {
                    ((CalendarSubscribeContract.ICalendarSubscribeView) this.f76530a.getView()).mo110378b(arrayList);
                }
            }
        }

        C30593h(CalendarSubscribePresenter calendarSubscribePresenter, String str) {
            this.f76530a = calendarSubscribePresenter;
            this.f76531b = str;
        }
    }

    /* renamed from: b */
    public final void mo110325b(String str) {
        ((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110380c(SubViewType.ShareCalendar);
        ((CalendarSubscribeContract.ICalendarSubscribeModel) getModel()).mo110362a(str, 0, 100, new C30593h(this, str));
    }

    /* renamed from: a */
    public final void mo110320a(String str) {
        ((CalendarSubscribeContract.ICalendarSubscribeModel) getModel()).mo110363a(str, 0, 24, false, false, new C30591f(this, str));
        ((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110380c(SubViewType.Contact);
    }

    /* renamed from: b */
    public final void mo110324b(SubViewType subViewType) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(subViewType, "currentViewType");
        if (TextUtils.isEmpty(((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110384d())) {
            str = "yes";
        } else {
            str = "no";
        }
        int i = C30620f.f76636b[subViewType.ordinal()];
        if (i == 1) {
            str2 = "contacts";
        } else if (i != 2) {
            str2 = "mtgrooms";
        } else {
            str2 = "public_cal";
        }
        GeneralHitPoint.m124232b("calendar_subscription_modal", str, str2);
    }

    /* renamed from: a */
    public final void mo110321a(String str, MeetingRoomFilter meetingRoomFilter) {
        ((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110380c(SubViewType.MeetingRoom);
        ((CalendarSubscribeContract.ICalendarSubscribeModel) getModel()).mo110364a(str, meetingRoomFilter, 1, new C30592g(this, str));
    }

    /* renamed from: a */
    public final void mo110322a(String str, SubViewType subViewType) {
        String str2;
        String str3;
        Intrinsics.checkParameterIsNotNull(str, "actionType");
        Intrinsics.checkParameterIsNotNull(subViewType, "currentViewType");
        if (TextUtils.isEmpty(((CalendarSubscribeContract.ICalendarSubscribeView) getView()).mo110384d())) {
            str2 = "recom";
        } else {
            str2 = "search";
        }
        int i = C30620f.f76635a[subViewType.ordinal()];
        if (i == 1) {
            str3 = "contacts";
        } else if (i != 2) {
            str3 = "mtgrooms";
        } else {
            str3 = "public_cal";
        }
        CalendarHitPoint.m124122a(str, str2, str3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarSubscribePresenter(CalendarSubscribeContract.ICalendarSubscribeModel aVar, CalendarSubscribeContract.ICalendarSubscribeView bVar, Context context, FragmentDependency bVar2) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar2, "activityDependency");
        this.f76499a = context;
        this.f76500b = bVar2;
        this.f76504g = new Handler();
    }
}
