package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00012B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020#H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010(\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003J \u0010)\u001a\u00020\u00182\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002J\b\u0010/\u001a\u00020\u0018H\u0002J\b\u00100\u001a\u00020\u0018H\u0002J\u0006\u00101\u001a\u00020\u0018R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "choosedBuildings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "()V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeAdapter;", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "mCalendars", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/HashMap;", "mChoosedBuilding", "mDelegate", "mView", "Landroid/view/View;", "dismissLoadingPanel", "", "initView", "loadBoardroomByBuildingId", "onBackPressed", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onViewCreated", "view", "refreshData", "setData", "calendarResources", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/ArrayList;", "showEmptyDataTip", "showErrorTipPanel", "showLoadingAnimation", "updateViewData", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomSubscribeFragment extends CalendarBaseFragment {

    /* renamed from: a */
    public CalendarBuilding f76738a;

    /* renamed from: b */
    public HashMap<String, Calendar> f76739b;

    /* renamed from: c */
    private final AbstractC32595g f76740c;

    /* renamed from: d */
    private View f76741d;

    /* renamed from: e */
    private Delegate f76742e;

    /* renamed from: f */
    private MeetingRoomSubscribeAdapter f76743f;

    /* renamed from: g */
    private HashMap f76744g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$Delegate;", "Ljava/io/Serializable;", "onMeetingFragmentBackPressed", "", "onMeetingRoomInfoClicked", "resourceCalendarId", "", "setCurrentView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface Delegate extends Serializable {
        void onMeetingFragmentBackPressed();

        void onMeetingRoomInfoClicked(String str);

        void setCurrentView();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76744g == null) {
            this.f76744g = new HashMap();
        }
        View view = (View) this.f76744g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76744g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76744g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$initView$2", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment$b */
    public static final class C30646b implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSubscribeFragment f76746a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            this.f76746a.mo110585b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f76746a.mo110590g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30646b(MeetingRoomSubscribeFragment meetingRoomSubscribeFragment) {
            this.f76746a = meetingRoomSubscribeFragment;
        }
    }

    /* renamed from: c */
    public final void mo110586c() {
        MeetingRoomSubscribeAdapter aVar = this.f76743f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        aVar.notifyDataSetChanged();
    }

    /* renamed from: g */
    public final boolean mo110590g() {
        Delegate delegate = this.f76742e;
        if (delegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        delegate.onMeetingFragmentBackPressed();
        return true;
    }

    public MeetingRoomSubscribeFragment() {
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f76740c = a;
        this.f76739b = new HashMap<>();
    }

    /* renamed from: i */
    private final void m113909i() {
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) view.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mView.loadingView");
        calendarLoadingView.setVisibility(0);
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view2.findViewById(R.id.loadingView)).mo116402a();
    }

    /* renamed from: d */
    public final void mo110587d() {
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) view.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mView.loadingView");
        calendarLoadingView.setVisibility(8);
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view2.findViewById(R.id.loadingView)).mo116404b();
    }

    /* renamed from: b */
    public final void mo110585b() {
        m113909i();
        String valueOf = String.valueOf(new Date().getTime());
        C30647c cVar = new C30647c(this, valueOf, "getMeetingRoomsInBuilding");
        Log.m165389i(this.TAG, C32673y.m125376b(valueOf, "getMeetingRoomsInBuilding", "start_time", "0", "end_time", "0", "building_ids", "chosenBuilding", "rrule", ""));
        UIGetDataCallback wrapAndAddGetDataCallback = this.mCallbackManager.wrapAndAddGetDataCallback(cVar);
        AbstractC32595g gVar = this.f76740c;
        String[] strArr = new String[1];
        CalendarBuilding calendarBuilding = this.f76738a;
        if (calendarBuilding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChoosedBuilding");
        }
        strArr[0] = calendarBuilding.getId().toString();
        gVar.mo119033a(0, 0, Arrays.asList(strArr), "", false, null, wrapAndAddGetDataCallback);
    }

    /* renamed from: e */
    public final void mo110588e() {
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) view.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mView.loadingView");
        calendarLoadingView.setVisibility(0);
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view2.findViewById(R.id.loadingView)).mo116405c();
        View view3 = this.f76741d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view3.findViewById(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_Common_FailToLoad3));
    }

    /* renamed from: f */
    public final void mo110589f() {
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) view.findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mView.loadingView");
        calendarLoadingView.setVisibility(0);
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view2.findViewById(R.id.loadingView)).mo116405c();
        View view3 = this.f76741d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view3.findViewById(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_Edit_NoRoomsAvailable));
    }

    /* renamed from: h */
    private final void m113908h() {
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) view.findViewById(R.id.subscribeTitleBar);
        CalendarBuilding calendarBuilding = this.f76738a;
        if (calendarBuilding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChoosedBuilding");
        }
        commonTitleBar.setTitle(calendarBuilding.getName());
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CommonTitleBar) view2.findViewById(R.id.subscribeTitleBar)).setLeftImageResource(R.drawable.ic_svg_titlebar_close);
        View view3 = this.f76741d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CommonTitleBar) view3.findViewById(R.id.subscribeTitleBar)).setDividerVisible(false);
        View view4 = this.f76741d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CommonTitleBar) view4.findViewById(R.id.subscribeTitleBar)).setLeftClickListener(new View$OnClickListenerC30645a(this));
        View view5 = this.f76741d;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((CalendarLoadingView) view5.findViewById(R.id.loadingView)).setOnLoadingViewClickedListener(new C30646b(this));
        View view6 = this.f76741d;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        RecyclerView recyclerView = (RecyclerView) view6.findViewById(R.id.meetingRoomRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mView.meetingRoomRecycleView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        View view7 = this.f76741d;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        RecyclerView recyclerView2 = (RecyclerView) view7.findViewById(R.id.meetingRoomRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mView.meetingRoomRecycleView");
        MeetingRoomSubscribeAdapter aVar = this.f76743f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        recyclerView2.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment$a */
    public static final class View$OnClickListenerC30645a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSubscribeFragment f76745a;

        View$OnClickListenerC30645a(MeetingRoomSubscribeFragment meetingRoomSubscribeFragment) {
            this.f76745a = meetingRoomSubscribeFragment;
        }

        public final void onClick(View view) {
            this.f76745a.mo110590g();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarBuilding m113907a(MeetingRoomSubscribeFragment meetingRoomSubscribeFragment) {
        CalendarBuilding calendarBuilding = meetingRoomSubscribeFragment.f76738a;
        if (calendarBuilding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChoosedBuilding");
        }
        return calendarBuilding;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(new Bundle());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$loadBoardroomByBuildingId$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resources", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment$c */
    public static final class C30647c implements IGetDataCallback<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSubscribeFragment f76747a;

        /* renamed from: b */
        final /* synthetic */ String f76748b;

        /* renamed from: c */
        final /* synthetic */ String f76749c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarPerfMonitor.m124417b("key_view_rooms_in_building");
            Log.m165383e(this.f76747a.TAG, C32673y.m125370a(this.f76748b, this.f76749c, errorResult));
            this.f76747a.mo110588e();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarResource> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = String.valueOf(map.size()) + "";
            }
            Log.m165389i(this.f76747a.TAG, C32673y.m125373a(this.f76748b, this.f76749c, "resources_size", str));
            this.f76747a.mo110587d();
            if (map == null || map.size() <= 0) {
                this.f76747a.mo110589f();
                return;
            }
            ArrayList arrayList = new ArrayList(map.values());
            Collections.sort(arrayList, C30648a.f76750a);
            ArrayList<SubscribeMeetingRoomData> arrayList2 = new ArrayList<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CalendarResource calendarResource = (CalendarResource) it.next();
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                String floorName = calendarResource.getFloorName();
                if (!TextUtils.isEmpty(floorName)) {
                    sb.append(floorName);
                    sb.append("-");
                }
                sb.append(calendarResource.getName());
                String calendarId = calendarResource.getCalendarId();
                Intrinsics.checkExpressionValueIsNotNull(calendarId, "data.calendarId");
                SubscribeMeetingRoomData eVar = new SubscribeMeetingRoomData(calendarId, sb.toString(), MeetingRoomSubscribeFragment.m113907a(this.f76747a).getName(), false, false);
                eVar.mo110459b(String.valueOf(calendarResource.getCapacity()));
                eVar.mo110460g(calendarResource.isDisabled());
                eVar.mo110461h(SchemaHelper.f83746a.mo120314b(calendarResource.getResourceSchema()));
                Calendar calendar = this.f76747a.f76739b.get(eVar.mo110445i());
                if (calendar != null) {
                    eVar.mo110431a(true);
                    if (!calendar.isRealPrimary()) {
                        if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                            eVar.mo110435c(true);
                        }
                    }
                }
                arrayList2.add(eVar);
            }
            this.f76747a.mo110584a(arrayList2);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment$c$a */
        public static final class C30648a<T> implements Comparator<T> {

            /* renamed from: a */
            public static final C30648a f76750a = new C30648a();

            C30648a() {
            }

            /* renamed from: a */
            public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
                int weight = calendarResource2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
                return weight - calendarResource.getWeight();
            }
        }

        C30647c(MeetingRoomSubscribeFragment meetingRoomSubscribeFragment, String str, String str2) {
            this.f76747a = meetingRoomSubscribeFragment;
            this.f76748b = str;
            this.f76749c = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/room/MeetingRoomSubscribeFragment$onViewCreated$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.room.MeetingRoomSubscribeFragment$d */
    public static final class C30649d implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomSubscribeFragment f76751a;

        /* renamed from: b */
        final /* synthetic */ String f76752b;

        /* renamed from: c */
        final /* synthetic */ String f76753c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f76751a.TAG, C32673y.m125370a(this.f76752b, this.f76753c, errorResult));
            this.f76751a.mo110585b();
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null || (str = String.valueOf(list.size())) == null) {
                str = "null";
            }
            Log.m165389i(this.f76751a.TAG, C32673y.m125373a(this.f76752b, this.f76753c, "calendars_size", str));
            this.f76751a.f76739b.clear();
            if (list != null) {
                for (T t : list) {
                    String serverId = t.getServerId();
                    Intrinsics.checkExpressionValueIsNotNull(serverId, "it.serverId");
                    this.f76751a.f76739b.put(serverId, t);
                }
            }
            this.f76751a.mo110585b();
        }

        C30649d(MeetingRoomSubscribeFragment meetingRoomSubscribeFragment, String str, String str2) {
            this.f76751a = meetingRoomSubscribeFragment;
            this.f76752b = str;
            this.f76753c = str2;
        }
    }

    /* renamed from: a */
    public final void mo110583a(CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "choosedBuildings");
        this.f76738a = calendarBuilding;
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) view.findViewById(R.id.subscribeTitleBar);
        CalendarBuilding calendarBuilding2 = this.f76738a;
        if (calendarBuilding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChoosedBuilding");
        }
        commonTitleBar.setTitle(calendarBuilding2.getName());
        mo110585b();
    }

    /* renamed from: a */
    public final void mo110584a(ArrayList<SubscribeMeetingRoomData> arrayList) {
        if (CollectionUtils.isEmpty(CollectionsKt.toMutableList((Collection) arrayList))) {
            mo110589f();
            return;
        }
        MeetingRoomSubscribeAdapter aVar = this.f76743f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
        }
        aVar.mo110599a(arrayList);
        View view = this.f76741d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.meetingRoomRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mView.meetingRoomRecycleView");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        CalendarPerfMonitor.m124413a("key_view_rooms_in_building");
        View view2 = this.f76741d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        ((RecyclerView) view2.findViewById(R.id.meetingRoomRecycleView)).scrollToPosition(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m113908h();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.TAG, C32673y.m125376b(valueOf, "loadAllCalendars", new String[0]));
        C30076a.m111290a().mo108423a(getCallbackManager().wrapAndAddGetDataCallback(new C30649d(this, valueOf, "loadAllCalendars")));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_subscribe_meetingroom, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…ngroom, container, false)");
        this.f76741d = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mView");
        }
        return inflate;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MeetingRoomSubscribeFragment(CalendarBuilding calendarBuilding, Delegate delegate, CalendarSubscribeView gVar) {
        this();
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "choosedBuildings");
        Intrinsics.checkParameterIsNotNull(delegate, "delegate");
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        this.f76738a = calendarBuilding;
        this.f76742e = delegate;
        if (delegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDelegate");
        }
        this.f76743f = new MeetingRoomSubscribeAdapter(gVar, delegate);
    }
}
