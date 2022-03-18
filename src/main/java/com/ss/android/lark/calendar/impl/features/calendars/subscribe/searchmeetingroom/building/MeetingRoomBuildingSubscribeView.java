package com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.SubViewType;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.BuildingExpandRoomSubscribeAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001HB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020%J \u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0002J\u001e\u0010,\u001a\u00020%2\u0016\u0010-\u001a\u0012\u0012\u0004\u0012\u00020.0\u000ej\b\u0012\u0004\u0012\u00020.`\u0010J\u0006\u0010/\u001a\u00020%J\u000e\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\bJ\u001c\u00102\u001a\u00020%2\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00106\u001a\u000207J\u001c\u00102\u001a\u00020%2\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<J\u001e\u0010=\u001a\u00020%2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020.0\u000ej\b\u0012\u0004\u0012\u00020.`\u0010JF\u0010?\u001a\u00020%2>\u0010@\u001a:\u0012\u0004\u0012\u00020\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010\u000e0Aj\"\u0012\u0004\u0012\u00020\u000f\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020.\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020.\u0018\u0001`\u0010`BJ\u0006\u0010C\u001a\u00020%J\u0006\u0010D\u001a\u00020%J\u0006\u0010E\u001a\u00020%J\u0006\u0010F\u001a\u00020%J\u0006\u0010G\u001a\u00020%R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006I"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "calendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "(Landroid/content/Context;Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;)V", "capacity", "", "getCapacity", "()I", "setCapacity", "(I)V", "equipments", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getEquipments", "()Ljava/util/ArrayList;", "mBuildingExpandRoomAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter;", "mCalendarSubscribeView", "mMeetingRoomBuildingAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter;", "mSearchAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/SearchMeetingRoomSubscribedAdapter;", "pageCount", "getPageCount", "setPageCount", "searchFilterFG", "", "searchText", "getSearchText", "()Ljava/lang/String;", "setSearchText", "(Ljava/lang/String;)V", "destroy", "", "hideLoadingView", "initErrTipPanel", "tipWidth", "", "tipHeight", "textMarginTop", "loadMore", "calendarList", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "loadMoreErr", "refreshMeetingRoomSubscribe", "position", "setMeetingRoomBuildingData", "calendarBuildings", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "itemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "mOnBuildingSubscribeItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder$OnItemClickListener;", "setOnLoadingViewClickedListener", "listener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "setSearchResult", "searchMeetingRoom", "showBuildingMeetingRooms", "buildingsMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "showErr", "showLoading", "showNoMatchingMeetingRoom", "showRemindConferenceMeetingRoom", "updateView", "OnItemClickListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.a.e */
public final class MeetingRoomBuildingSubscribeView extends FrameLayout {

    /* renamed from: a */
    public final BuildingExpandRoomSubscribeAdapter f76708a;

    /* renamed from: b */
    public final CalendarSubscribeView f76709b;

    /* renamed from: c */
    private SearchMeetingRoomSubscribedAdapter f76710c;

    /* renamed from: d */
    private final MeetingRoomBuildingSubscribeAdapter f76711d;

    /* renamed from: e */
    private String f76712e = "";

    /* renamed from: f */
    private int f76713f;

    /* renamed from: g */
    private final ArrayList<String> f76714g = new ArrayList<>();

    /* renamed from: h */
    private int f76715h;

    /* renamed from: i */
    private final boolean f76716i;

    /* renamed from: j */
    private HashMap f76717j;

    /* renamed from: b */
    public View mo110558b(int i) {
        if (this.f76717j == null) {
            this.f76717j = new HashMap();
        }
        View view = (View) this.f76717j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76717j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getCapacity() {
        return this.f76715h;
    }

    public final ArrayList<String> getEquipments() {
        return this.f76714g;
    }

    public final int getPageCount() {
        return this.f76713f;
    }

    public final String getSearchText() {
        return this.f76712e;
    }

    /* renamed from: b */
    public final void mo110559b() {
        this.f76710c.notifyDataSetChanged();
    }

    /* renamed from: g */
    public final void mo110564g() {
        ((LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame)).refreshComplete();
    }

    /* renamed from: a */
    public final void mo110552a() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110558b(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).mo116402a();
    }

    /* renamed from: c */
    public final void mo110560c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110558b(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(8);
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).mo116404b();
    }

    /* renamed from: d */
    public final void mo110561d() {
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "searchRecycleView");
        recyclerView2.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110558b(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_NoMatchingRooms));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_empty_neutral_search_failed));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).mo116405c();
    }

    /* renamed from: e */
    public final void mo110562e() {
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "searchRecycleView");
        recyclerView2.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110558b(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_SubscribeCalendar_ContactAdminToSetUpRooms));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_placeholder_common_no_content));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).mo116405c();
    }

    /* renamed from: f */
    public final void mo110563f() {
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "searchRecycleView");
        recyclerView2.setVisibility(8);
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo110558b(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "loadingView");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorText(getResources().getString(R.string.Calendar_Common_FailedtoLoad1));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setErrorTipPanel(getResources().getDrawable(R.drawable.illustration_empty_negative_load_failed));
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).mo116405c();
    }

    public final void setCapacity(int i) {
        this.f76715h = i;
    }

    public final void setPageCount(int i) {
        this.f76713f = i;
    }

    /* renamed from: a */
    public final void mo110553a(int i) {
        this.f76708a.mo110526a(i);
    }

    public final void setSearchText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f76712e = str;
    }

    /* renamed from: a */
    public final void mo110555a(HashMap<String, ArrayList<SubscribeMeetingRoomData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "buildingsMap");
        this.f76708a.mo110528a(hashMap);
    }

    public final void setOnLoadingViewClickedListener(CalendarLoadingView.AbstractC31882a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        ((CalendarLoadingView) mo110558b(R.id.loadingView)).setOnLoadingViewClickedListener(aVar);
    }

    /* renamed from: a */
    public final void mo110554a(ArrayList<SubscribeMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (arrayList.size() < (this.f76713f + 1) * 24) {
            SubscribeMeetingRoomData eVar = new SubscribeMeetingRoomData("", "", "", false, false);
            eVar.mo110437d(false);
            arrayList.add(eVar);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "ptrFrame");
            lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        } else {
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "ptrFrame");
            lKUIPtrClassicFrameLayout2.setMode(LKUIPtrFrameLayout.Mode.LOAD_MORE);
        }
        this.f76710c.mo110578a(arrayList);
        this.f76710c.notifyDataSetChanged();
        ((LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame)).refreshComplete();
        this.f76713f++;
    }

    public final void setSearchResult(ArrayList<SubscribeMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "searchMeetingRoom");
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "searchRecycleView");
        recyclerView.setVisibility(0);
        SubscribeMeetingRoomData eVar = new SubscribeMeetingRoomData("", "", "", false, false);
        eVar.mo110437d(false);
        arrayList.add(eVar);
        this.f76713f = 1;
        this.f76710c.mo110578a(arrayList);
        this.f76710c.notifyDataSetChanged();
        ((RecyclerView) mo110558b(R.id.searchRecycleView)).scrollToPosition(0);
    }

    /* renamed from: a */
    public final void mo110556a(List<? extends CalendarBuilding> list, BuildingExpandRoomSubscribeAdapter.OnItemClickListener fVar) {
        Intrinsics.checkParameterIsNotNull(list, "calendarBuildings");
        Intrinsics.checkParameterIsNotNull(fVar, "itemClickedListener");
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(0);
        this.f76708a.mo110527a(fVar);
        this.f76708a.mo110529a(list);
        CalendarPerfMonitor.m124413a("key_subscribe_meetingroom_calendar");
    }

    /* renamed from: a */
    public final void mo110557a(List<? extends CalendarBuilding> list, MeetingRoomBuildingSubscribeAdapter.BuildingViewHolder.OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(list, "calendarBuildings");
        Intrinsics.checkParameterIsNotNull(aVar, "mOnBuildingSubscribeItemClickedListener");
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setVisibility(0);
        this.f76711d.mo110545a(aVar);
        this.f76711d.mo110547a(list);
        RecyclerView recyclerView2 = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "subscribeRecycleView");
        RecyclerView.Adapter adapter = recyclerView2.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        CalendarPerfMonitor.m124413a("key_subscribe_meetingroom_calendar");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomBuildingSubscribeView(Context context, final CalendarSubscribeView gVar) {
        super(context);
        MeetingRoomBuildingSubscribeAdapter dVar;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "calendarSubscribeView");
        boolean n = C30022a.f74883b.mo112706n();
        this.f76716i = n;
        this.f76709b = gVar;
        LayoutInflater.from(context).inflate(R.layout.calendar_search_meeting_buildings, (ViewGroup) this, true);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MeetingRoomBuildingSubscribeAdapter dVar2 = new MeetingRoomBuildingSubscribeAdapter();
        this.f76711d = dVar2;
        BuildingExpandRoomSubscribeAdapter aVar = new BuildingExpandRoomSubscribeAdapter();
        this.f76708a = aVar;
        RecyclerView recyclerView = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
        recyclerView.setLayoutManager(new StableLinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = (RecyclerView) mo110558b(R.id.subscribeRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "subscribeRecycleView");
        if (n) {
            dVar = aVar;
        } else {
            dVar = dVar2;
        }
        recyclerView2.setAdapter(dVar);
        ((RecyclerView) mo110558b(R.id.subscribeRecycleView)).addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView.C306371 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                if (i == 1) {
                    gVar.mo110512h();
                }
            }
        });
        RecyclerView recyclerView3 = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "searchRecycleView");
        recyclerView3.setLayoutManager(new LinearLayoutManager(context));
        this.f76710c = new SearchMeetingRoomSubscribedAdapter(new IMeetingRoomItemListener(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView.C306382 */

            /* renamed from: a */
            final /* synthetic */ MeetingRoomBuildingSubscribeView f76719a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76719a = r1;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.IMeetingRoomItemListener
            /* renamed from: a */
            public void mo110541a(SubscribeBaseData bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "content");
                this.f76719a.f76709b.mo110507a(bVar);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.IMeetingRoomItemListener
            /* renamed from: a */
            public void mo110542a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "resourceCalendarId");
                this.f76719a.f76709b.mo110508a(str);
            }
        });
        RecyclerView recyclerView4 = (RecyclerView) mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "searchRecycleView");
        recyclerView4.setAdapter(this.f76710c);
        ((RecyclerView) mo110558b(R.id.searchRecycleView)).addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView.C306393 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                if (i == 1) {
                    gVar.mo110512h();
                }
            }
        });
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "ptrFrame");
        lKUIPtrClassicFrameLayout.setMode(LKUIPtrFrameLayout.Mode.NONE);
        ((LKUIPtrClassicFrameLayout) mo110558b(R.id.ptrFrame)).setPtrHandler(new LKUIPtrDefaultHandler2(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView.C306404 */

            /* renamed from: a */
            final /* synthetic */ MeetingRoomBuildingSubscribeView f76721a;

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
                gVar.mo110504a(this.f76721a.getPageCount(), SubViewType.MeetingRoom, new MeetingRoomFilter(Integer.valueOf(this.f76721a.getCapacity()), CollectionsKt.toList(this.f76721a.getEquipments())));
            }

            {
                this.f76721a = r1;
            }
        });
        View findViewById = ((CalendarLoadingView) mo110558b(R.id.loadingView)).findViewById(R.id.loading_panel);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "loadingView.findViewById…yout>(R.id.loading_panel)");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) findViewById).getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            View findViewById2 = ((CalendarLoadingView) mo110558b(R.id.loadingView)).findViewById(R.id.error_tip_panel);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "loadingView.findViewById…ut>(R.id.error_tip_panel)");
            ViewGroup.LayoutParams layoutParams3 = ((LinearLayout) findViewById2).getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams2.bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(context) + UIUtils.dp2px(context, 129.0f);
                ((LinearLayout.LayoutParams) layoutParams3).bottomMargin = C30022a.f74882a.utilsDependency().mo108192a(context) + UIUtils.dp2px(context, 129.0f);
                if (n) {
                    ((MeetingRoomSearchFilters) mo110558b(R.id.meetingRoomFilter)).setFilterListener(new MeetingRoomSearchFilters.OnSearchFilterListener(this) {
                        /* class com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView.C306415 */

                        /* renamed from: a */
                        final /* synthetic */ MeetingRoomBuildingSubscribeView f76723a;

                        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
                        /* renamed from: a */
                        public void mo110574a() {
                            this.f76723a.getEquipments().clear();
                            this.f76723a.setCapacity(0);
                            String searchText = this.f76723a.getSearchText();
                            if (searchText == null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            } else if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) searchText).toString())) {
                                gVar.mo110505a(SubViewType.MeetingRoom, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                            } else {
                                RecyclerView recyclerView = (RecyclerView) this.f76723a.mo110558b(R.id.subscribeRecycleView);
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
                                if (recyclerView.getVisibility() == 0) {
                                    this.f76723a.f76708a.mo110525a();
                                    List<SubscribeCalendarBuildingData> b = this.f76723a.f76708a.mo110530b();
                                    if (!b.isEmpty()) {
                                        gVar.mo110509a(b, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                                    }
                                }
                            }
                        }

                        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
                        /* renamed from: a */
                        public void mo110575a(int i) {
                            this.f76723a.setCapacity(i);
                            String searchText = this.f76723a.getSearchText();
                            if (searchText == null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            } else if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) searchText).toString())) {
                                gVar.mo110505a(SubViewType.MeetingRoom, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                            } else {
                                RecyclerView recyclerView = (RecyclerView) this.f76723a.mo110558b(R.id.subscribeRecycleView);
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
                                if (recyclerView.getVisibility() == 0) {
                                    this.f76723a.f76708a.mo110525a();
                                    List<SubscribeCalendarBuildingData> b = this.f76723a.f76708a.mo110530b();
                                    if (!b.isEmpty()) {
                                        gVar.mo110509a(b, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                                    }
                                }
                            }
                        }

                        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
                        /* renamed from: a */
                        public void mo110576a(List<EquipmentData> list) {
                            Intrinsics.checkParameterIsNotNull(list, "selectedEquipmentData");
                            List<EquipmentData> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().mo116059a());
                            }
                            this.f76723a.getEquipments().clear();
                            this.f76723a.getEquipments().addAll(arrayList);
                            String searchText = this.f76723a.getSearchText();
                            if (searchText == null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                            } else if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) searchText).toString())) {
                                gVar.mo110505a(SubViewType.MeetingRoom, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                            } else {
                                RecyclerView recyclerView = (RecyclerView) this.f76723a.mo110558b(R.id.subscribeRecycleView);
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "subscribeRecycleView");
                                if (recyclerView.getVisibility() == 0) {
                                    this.f76723a.f76708a.mo110525a();
                                    List<SubscribeCalendarBuildingData> b = this.f76723a.f76708a.mo110530b();
                                    if (!b.isEmpty()) {
                                        gVar.mo110509a(b, new MeetingRoomFilter(Integer.valueOf(this.f76723a.getCapacity()), CollectionsKt.toList(this.f76723a.getEquipments())));
                                    }
                                }
                            }
                        }

                        {
                            this.f76723a = r1;
                        }
                    });
                    ((MeetingRoomSearchFilters) mo110558b(R.id.meetingRoomFilter)).setFilterSource("cal_subscribe");
                    return;
                }
                MeetingRoomSearchFilters meetingRoomSearchFilters = (MeetingRoomSearchFilters) mo110558b(R.id.meetingRoomFilter);
                Intrinsics.checkExpressionValueIsNotNull(meetingRoomSearchFilters, "meetingRoomFilter");
                meetingRoomSearchFilters.setVisibility(8);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }
}
