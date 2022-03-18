package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.contactcalendars.CalendarSubscribeContactSubView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.BuildingExpandRoomSubscribeAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.sharecalendars.ShareCalendarSubscribeView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.widget.CalendarSubscribeIndicator;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 c2\u00020\u0001:\u0001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020\"H\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0013H\u0016J\u0006\u0010/\u001a\u00020(J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0002J\u0006\u00104\u001a\u00020(J\b\u00105\u001a\u00020(H\u0002J(\u00106\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:2\u0006\u0010.\u001a\u00020\u0013H\u0016J\u0010\u0010;\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0013H\u0016J \u0010<\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020=08j\b\u0012\u0004\u0012\u00020=`:H\u0016J(\u0010>\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020?08j\b\u0012\u0004\u0012\u00020?`:2\u0006\u0010.\u001a\u00020\u0013H\u0016J\b\u0010@\u001a\u00020(H\u0016J\u001c\u0010A\u001a\u00020(2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u00020(2\u0006\u0010H\u001a\u00020?J\"\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00132\n\b\u0002\u0010E\u001a\u0004\u0018\u00010FJ\u000e\u0010K\u001a\u00020(2\u0006\u0010L\u001a\u00020\u001aJ\u001a\u0010M\u001a\u00020(2\u0006\u0010.\u001a\u00020\u00132\n\b\u0002\u0010E\u001a\u0004\u0018\u00010FJ\u0010\u0010N\u001a\u00020(2\u0006\u0010O\u001a\u00020\u001cH\u0016JH\u0010P\u001a\u00020(2>\u0010Q\u001a:\u0012\u0004\u0012\u00020\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00020=\u0018\u0001080Rj\"\u0012\u0004\u0012\u00020\u001a\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020=\u0018\u000108j\n\u0012\u0004\u0012\u00020=\u0018\u0001`:`SH\u0016J\u0010\u0010T\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0013H\u0016J\u0010\u0010U\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0013H\u0016J\u0016\u0010V\u001a\u00020(2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020X0CH\u0016J \u0010Y\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:H\u0016J \u0010Z\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020?08j\b\u0012\u0004\u0012\u00020?`:H\u0016J\b\u0010[\u001a\u00020(H\u0016J(\u0010\\\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020908j\b\u0012\u0004\u0012\u000209`:2\u0006\u0010.\u001a\u00020\u0013H\u0016J$\u0010]\u001a\u00020(2\u001a\u0010^\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u000108j\n\u0012\u0004\u0012\u00020=\u0018\u0001`:H\u0016J \u0010_\u001a\u00020(2\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020?08j\b\u0012\u0004\u0012\u00020?`:H\u0016J\u0010\u0010`\u001a\u00020(2\u0006\u0010a\u001a\u00020\u0006H\u0016J\u0010\u0010b\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0013H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView;", "realView", "Landroid/view/View;", "(Landroid/view/View;)V", "DIVIDER_HEIGHT", "", "INDICATOR_HEIGHT", "INDICATOR_TITLE_TEXT_SIZE", "calendarSubscribeContractSubView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/contactcalendars/CalendarSubscribeContactSubView;", "mBuildingExpandItemClickListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "mContentList", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/ViewInfos;", "mContext", "Landroid/content/Context;", "mCurrentView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "mLoadingViewTryAgainClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "mNoTryAgainListener", "mOnBuildingSubscribeItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder$OnItemClickListener;", "mSearchText", "", "mViewDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView$ViewDelegate;", "meetingRoomBuildingSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeView;", "getMeetingRoomBuildingSubscribeView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeView;", "meetingRoomLevelsFG", "", "searchFilterFG", "shareCalendarSubscribeView", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/sharecalendars/ShareCalendarSubscribeView;", "viewRoot", "create", "", "destroy", "frameLayoutIsVisible", "getCurrentSearchText", "getFrameLayoutId", "getSubViewSearchText", "viewType", "hideViewOnScrollRv", "initListener", "initSearchBar", "initSubViewTryAgainListener", "initTitleBar", "initView", "initViewPager", "loadMoreCalendars", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "Lkotlin/collections/ArrayList;", "loadMoreErr", "loadMoreMeetingRoom", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "loadMoreShareCalendars", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "onBackPressed", "onBuildingExpandRoomsFilterChange", "buildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "onItemClicked", "itemViewData", "onLoadMore", "pageCount", "onMeetingRoomInfoClicked", "calendarId", "onRefresh", "setViewDelegate", "viewDelegate", "showBuildingsMeetingRooms", "buildingsMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "showErr", "showLoading", "showMeetingRoomBuildings", "calendarBuildings", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "showRecommendCalendars", "showRecommendShareCalendars", "showRemindConferenceMeetingRoom", "showSearchCalendars", "showSearchMeetingRoomResult", "searchMeetingRoom", "showSearchShareCalendars", "updateMeetingRoomSubscribe", "position", "updateViewData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g */
public final class CalendarSubscribeView implements CalendarSubscribeContract.ICalendarSubscribeView {

    /* renamed from: l */
    public static final Companion f76637l = new Companion(null);

    /* renamed from: a */
    public final int f76638a = 2;

    /* renamed from: b */
    public final int f76639b = 14;

    /* renamed from: c */
    public final int f76640c = 1;

    /* renamed from: d */
    public final View f76641d;

    /* renamed from: e */
    public final Context f76642e;

    /* renamed from: f */
    public List<ViewInfos> f76643f = new ArrayList();

    /* renamed from: g */
    public CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate f76644g;

    /* renamed from: h */
    public final CalendarSubscribeContactSubView f76645h;

    /* renamed from: i */
    public final ShareCalendarSubscribeView f76646i;

    /* renamed from: j */
    public String f76647j = "";

    /* renamed from: k */
    public SubViewType f76648k = SubViewType.Contact;

    /* renamed from: m */
    private MeetingRoomBuildingSubscribeAdapter.BuildingViewHolder.OnItemClickListener f76649m;

    /* renamed from: n */
    private CalendarLoadingView.AbstractC31882a f76650n;

    /* renamed from: o */
    private CalendarLoadingView.AbstractC31882a f76651o;

    /* renamed from: p */
    private BuildingExpandRoomSubscribeAdapter.OnItemClickListener f76652p;

    /* renamed from: q */
    private final MeetingRoomBuildingSubscribeView f76653q;

    /* renamed from: r */
    private final boolean f76654r = C30022a.f74883b.mo112706n();

    /* renamed from: s */
    private final boolean f76655s = C30022a.f74883b.mo112707o();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$Companion;", "", "()V", "ORIGINAL_SEARCH_TEXT", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        mo110511g();
    }

    /* renamed from: f */
    public final MeetingRoomBuildingSubscribeView mo110510f() {
        return this.f76653q;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public void mo110373a(ArrayList<SubscribeContactData> arrayList, SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        if (arrayList.size() == 0) {
            this.f76645h.mo110408c();
            CalendarSubscribeContactSubView cVar = this.f76645h;
            CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
            }
            cVar.setOnLoadingViewClickedListener(aVar);
        } else if (TextUtils.isEmpty(this.f76647j)) {
            this.f76645h.mo110405a(arrayList);
        } else {
            this.f76645h.mo110407b(arrayList);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public void mo110375a(List<? extends CalendarBuilding> list) {
        Intrinsics.checkParameterIsNotNull(list, "calendarBuildings");
        this.f76653q.mo110560c();
        if (this.f76654r) {
            MeetingRoomBuildingSubscribeView eVar = this.f76653q;
            BuildingExpandRoomSubscribeAdapter.OnItemClickListener fVar = this.f76652p;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBuildingExpandItemClickListener");
            }
            eVar.mo110556a(list, fVar);
            return;
        }
        MeetingRoomBuildingSubscribeView eVar2 = this.f76653q;
        MeetingRoomBuildingSubscribeAdapter.BuildingViewHolder.OnItemClickListener aVar = this.f76649m;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnBuildingSubscribeItemClickedListener");
        }
        eVar2.mo110557a(list, aVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public void mo110372a(ArrayList<SubscribeMeetingRoomData> arrayList) {
        this.f76653q.mo110560c();
        if (CollectionUtils.isNotEmpty(arrayList)) {
            RecyclerView recyclerView = (RecyclerView) this.f76653q.mo110558b(R.id.searchRecycleView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "meetingRoomBuildingSubscribeView.searchRecycleView");
            recyclerView.setVisibility(0);
            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f76653q.mo110558b(R.id.ptrFrame);
            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "meetingRoomBuildingSubscribeView.ptrFrame");
            lKUIPtrClassicFrameLayout.setVisibility(0);
            MeetingRoomBuildingSubscribeView eVar = this.f76653q;
            if (arrayList == null) {
                Intrinsics.throwNpe();
            }
            eVar.setSearchResult(arrayList);
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) this.f76653q.mo110558b(R.id.searchRecycleView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "meetingRoomBuildingSubscribeView.searchRecycleView");
        recyclerView2.setVisibility(8);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) this.f76653q.mo110558b(R.id.ptrFrame);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "meetingRoomBuildingSubscribeView.ptrFrame");
        lKUIPtrClassicFrameLayout2.setVisibility(8);
        MeetingRoomBuildingSubscribeView eVar2 = this.f76653q;
        CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
        }
        eVar2.setOnLoadingViewClickedListener(aVar);
        this.f76653q.mo110561d();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public void mo110374a(HashMap<String, ArrayList<SubscribeMeetingRoomData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "buildingsMap");
        this.f76653q.mo110555a(hashMap);
    }

    /* renamed from: a */
    public final void mo110509a(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(list, "buildings");
        Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo110344a(list, meetingRoomFilter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initListener$4", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$e */
    public static final class C30624e implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76659a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f76659a.mo110376b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30624e(CalendarSubscribeView gVar) {
            this.f76659a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initListener$5", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$f */
    public static final class C30625f implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76660a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f76660a.mo110376b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate.C30594a.m113702a(CalendarSubscribeView.m113810a(this.f76660a), this.f76660a.f76647j, null, 2, null);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30625f(CalendarSubscribeView gVar) {
            this.f76660a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initViewPager$mNavigatorAdapter$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "getCount", "", "getIndicator", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "context", "Landroid/content/Context;", "getTitleView", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "index", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$i */
    public static final class C30628i extends AbstractC69621a {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76664a;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return this.f76664a.f76643f.size();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30628i(CalendarSubscribeView gVar) {
            this.f76664a = gVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$i$a */
        static final class View$OnClickListenerC30629a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C30628i f76665a;

            /* renamed from: b */
            final /* synthetic */ int f76666b;

            View$OnClickListenerC30629a(C30628i iVar, int i) {
                this.f76665a = iVar;
                this.f76666b = i;
            }

            public final void onClick(View view) {
                ((ViewPager) this.f76665a.f76664a.f76641d.findViewById(R.id.subscribeCalendarViewpager)).setCurrentItem(this.f76666b);
            }
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            CalendarSubscribeIndicator aVar = new CalendarSubscribeIndicator(this.f76664a.f76642e);
            aVar.setColors(Integer.valueOf(this.f76664a.f76642e.getResources().getColor(R.color.primary_pri_500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIUtils.dp2px(this.f76664a.f76642e, (float) this.f76664a.f76638a));
            aVar.setDividerHeight((float) UIUtils.dp2px(this.f76664a.f76642e, (float) this.f76664a.f76640c));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, int i) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            C69627a aVar = new C69627a(this.f76664a.f76642e);
            aVar.setTextSize((float) this.f76664a.f76639b);
            aVar.setNormalColor(this.f76664a.f76642e.getResources().getColor(R.color.text_caption));
            aVar.setSelectedColor(this.f76664a.f76642e.getResources().getColor(R.color.primary_pri_500));
            aVar.setOnClickListener(new View$OnClickListenerC30629a(this, i));
            aVar.setText(this.f76664a.f76643f.get(i).mo110524b());
            if (i == 2) {
                aVar.setPadding(0, 0, 0, 0);
            }
            return aVar;
        }
    }

    /* renamed from: g */
    public final void mo110511g() {
        m113812i();
        m113814k();
        m113815l();
        m113816m();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: d */
    public String mo110384d() {
        String str = this.f76647j;
        if (str != null) {
            return StringsKt.trim((CharSequence) str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: e */
    public void mo110387e() {
        this.f76653q.mo110560c();
        MeetingRoomBuildingSubscribeView eVar = this.f76653q;
        CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
        }
        eVar.setOnLoadingViewClickedListener(aVar);
        this.f76653q.mo110562e();
    }

    /* renamed from: h */
    public final void mo110512h() {
        ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).clearFocus();
        KeyboardUtils.hideKeyboard(this.f76642e);
    }

    /* renamed from: i */
    private final void m113812i() {
        ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).addTextChangedListener(new C30621b(this));
        this.f76649m = new C30622c(this);
        this.f76652p = new C30623d(this);
        this.f76651o = new C30624e(this);
        this.f76650n = new C30625f(this);
    }

    /* renamed from: j */
    private final void m113813j() {
        CalendarSubscribeContactSubView cVar = this.f76645h;
        CalendarLoadingView.AbstractC31882a aVar = this.f76650n;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingViewTryAgainClickListener");
        }
        cVar.setOnLoadingViewClickedListener(aVar);
        MeetingRoomBuildingSubscribeView eVar = this.f76653q;
        CalendarLoadingView.AbstractC31882a aVar2 = this.f76650n;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingViewTryAgainClickListener");
        }
        eVar.setOnLoadingViewClickedListener(aVar2);
        ShareCalendarSubscribeView cVar2 = this.f76646i;
        CalendarLoadingView.AbstractC31882a aVar3 = this.f76650n;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingViewTryAgainClickListener");
        }
        cVar2.setOnLoadingViewClickedListener(aVar3);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public int mo110369a() {
        FrameLayout frameLayout = (FrameLayout) this.f76641d.findViewById(R.id.meetingRoomSubscribeFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.meetingRoomSubscribeFrameLayout");
        return frameLayout.getId();
    }

    /* renamed from: k */
    private final void m113814k() {
        ((CommonTitleBar) this.f76641d.findViewById(R.id.titleBar)).setTitle(R.string.Calendar_SubscribeCalendar_SubscribeCalendar);
        ((CommonTitleBar) this.f76641d.findViewById(R.id.titleBar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) this.f76641d.findViewById(R.id.titleBar)).setDividerVisible(false);
        ((CommonTitleBar) this.f76641d.findViewById(R.id.titleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) this.f76641d.findViewById(R.id.titleBar)).setMainTitleSize(17.0f);
    }

    /* renamed from: l */
    private final void m113815l() {
        KeyboardUtils.hideKeyboard(this.f76642e);
        ((ImageView) this.f76641d.findViewById(R.id.clearBtn)).setOnClickListener(new View$OnClickListenerC30626g(this));
        ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).setHint(R.string.Calendar_Common_Search);
        EditText editText = (EditText) this.f76641d.findViewById(R.id.etSearchBar);
        Intrinsics.checkExpressionValueIsNotNull(editText, "viewRoot.etSearchBar");
        editText.setImeOptions(6);
        ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).clearFocus();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: b */
    public void mo110376b() {
        KeyboardUtils.hideKeyboard(this.f76642e);
        FrameLayout frameLayout = (FrameLayout) this.f76641d.findViewById(R.id.meetingRoomSubscribeFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.meetingRoomSubscribeFrameLayout");
        if (frameLayout.getVisibility() == 0) {
            FrameLayout frameLayout2 = (FrameLayout) this.f76641d.findViewById(R.id.meetingRoomSubscribeFrameLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "viewRoot.meetingRoomSubscribeFrameLayout");
            frameLayout2.setVisibility(8);
            this.f76648k = SubViewType.MeetingRoom;
            CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo110338a(SubViewType.MeetingRoom);
        }
        ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).clearFocus();
    }

    /* renamed from: m */
    private final void m113816m() {
        C30628i iVar = new C30628i(this);
        List mutableListOf = CollectionsKt.mutableListOf(SubViewType.Contact, SubViewType.ShareCalendar);
        List<ViewInfos> list = this.f76643f;
        String string = this.f76641d.getResources().getString(R.string.Calendar_Detail_Contacts);
        Intrinsics.checkExpressionValueIsNotNull(string, "viewRoot.resources.getSt…Calendar_Detail_Contacts)");
        list.add(new ViewInfos(this.f76645h, string));
        if (!this.f76655s) {
            List<ViewInfos> list2 = this.f76643f;
            String string2 = this.f76641d.getResources().getString(R.string.Calendar_Common_Room);
            Intrinsics.checkExpressionValueIsNotNull(string2, "viewRoot.resources.getSt…ing.Calendar_Common_Room)");
            list2.add(new ViewInfos(this.f76653q, string2));
            mutableListOf.add(1, SubViewType.MeetingRoom);
        }
        List<ViewInfos> list3 = this.f76643f;
        String string3 = this.f76641d.getResources().getString(R.string.Calendar_SubscribeCalendar_Public);
        Intrinsics.checkExpressionValueIsNotNull(string3, "viewRoot.resources.getSt…SubscribeCalendar_Public)");
        list3.add(new ViewInfos(this.f76646i, string3));
        ViewPager viewPager = (ViewPager) this.f76641d.findViewById(R.id.subscribeCalendarViewpager);
        Intrinsics.checkExpressionValueIsNotNull(viewPager, "viewRoot.subscribeCalendarViewpager");
        viewPager.setAdapter(new C30618d(this.f76643f));
        C69619a aVar = new C69619a(this.f76642e);
        aVar.setAdjustMode(true);
        aVar.setAdapter(iVar);
        MagicIndicator magicIndicator = (MagicIndicator) this.f76641d.findViewById(R.id.indicator);
        Intrinsics.checkExpressionValueIsNotNull(magicIndicator, "viewRoot.indicator");
        magicIndicator.setNavigator(aVar);
        ((MagicIndicator) this.f76641d.findViewById(R.id.indicator)).setBackgroundColor(this.f76642e.getResources().getColor(R.color.bg_body));
        C69634c.m267483a((MagicIndicator) this.f76641d.findViewById(R.id.indicator), (ViewPager) this.f76641d.findViewById(R.id.subscribeCalendarViewpager));
        ((ViewPager) this.f76641d.findViewById(R.id.subscribeCalendarViewpager)).addOnPageChangeListener(new C30627h(this, mutableListOf));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: c */
    public boolean mo110383c() {
        FrameLayout frameLayout = (FrameLayout) this.f76641d.findViewById(R.id.meetingRoomSubscribeFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.meetingRoomSubscribeFrameLayout");
        if (frameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$b */
    public static final class C30621b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76656a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30621b(CalendarSubscribeView gVar) {
            this.f76656a = gVar;
        }

        public void afterTextChanged(Editable editable) {
            CalendarSubscribeView gVar = this.f76656a;
            String valueOf = String.valueOf(editable);
            if (valueOf == null) {
                valueOf = "";
            }
            gVar.f76647j = valueOf;
            int i = C30630h.f76667a[this.f76656a.f76648k.ordinal()];
            if (i == 1) {
                this.f76656a.f76645h.setSearchText(this.f76656a.f76647j);
            } else if (i == 2) {
                this.f76656a.mo110510f().setSearchText(this.f76656a.f76647j);
            } else if (i == 3) {
                this.f76656a.f76646i.setSearchText(this.f76656a.f76647j);
            }
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                ImageView imageView = (ImageView) this.f76656a.f76641d.findViewById(R.id.clearBtn);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "viewRoot.clearBtn");
                imageView.setVisibility(4);
            } else {
                ImageView imageView2 = (ImageView) this.f76656a.f76641d.findViewById(R.id.clearBtn);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "viewRoot.clearBtn");
                imageView2.setVisibility(0);
            }
            if (this.f76656a.f76648k == SubViewType.MeetingRoom) {
                String valueOf2 = String.valueOf(editable);
                if (valueOf2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                } else if (TextUtils.isEmpty(StringsKt.trim((CharSequence) valueOf2).toString())) {
                    RecyclerView recyclerView = (RecyclerView) this.f76656a.mo110510f().mo110558b(R.id.searchRecycleView);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "meetingRoomBuildingSubscribeView.searchRecycleView");
                    recyclerView.setVisibility(8);
                    LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f76656a.mo110510f().mo110558b(R.id.ptrFrame);
                    Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "meetingRoomBuildingSubscribeView.ptrFrame");
                    lKUIPtrClassicFrameLayout.setVisibility(8);
                }
            }
            CalendarSubscribeView.m113810a(this.f76656a).mo110343a(this.f76656a.f76647j, new MeetingRoomFilter(Integer.valueOf(this.f76656a.mo110510f().getCapacity()), CollectionsKt.toList(this.f76656a.mo110510f().getEquipments())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initListener$2", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/MeetingRoomBuildingSubscribeAdapter$BuildingViewHolder$OnItemClickListener;", "onItemClick", "", "chooseCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$c */
    public static final class C30622c implements MeetingRoomBuildingSubscribeAdapter.BuildingViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76657a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30622c(CalendarSubscribeView gVar) {
            this.f76657a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.MeetingRoomBuildingSubscribeAdapter.BuildingViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo110516a(CalendarBuilding calendarBuilding) {
            Intrinsics.checkParameterIsNotNull(calendarBuilding, "chooseCalendarBuilding");
            CalendarPerfMonitor.m124415a("key_view_rooms_in_building", "cal_perf_common", "scene_type", "view_rooms_in_building", "extra_name", "subscribe_calendar");
            FrameLayout frameLayout = (FrameLayout) this.f76657a.f76641d.findViewById(R.id.meetingRoomSubscribeFrameLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "viewRoot.meetingRoomSubscribeFrameLayout");
            frameLayout.setVisibility(0);
            ((EditText) this.f76657a.f76641d.findViewById(R.id.etSearchBar)).clearFocus();
            KeyboardUtils.hideKeyboard(this.f76657a.f76642e);
            CalendarSubscribeView.m113810a(this.f76657a).mo110340a(calendarBuilding);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initListener$3", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/searchmeetingroom/building/BuildingExpandRoomSubscribeAdapter$OnItemClickListener;", "onBuildingItemClick", "", "chooseBuilding", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "onSubscribeMeetingRoomClick", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$d */
    public static final class C30623d implements BuildingExpandRoomSubscribeAdapter.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76658a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30623d(CalendarSubscribeView gVar) {
            this.f76658a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.BuildingExpandRoomSubscribeAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo110517a(SubscribeCalendarBuildingData cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "chooseBuilding");
            CalendarPerfMonitor.m124415a("key_view_rooms_in_building", "cal_perf_common", "scene_type", "view_rooms_in_building", "extra_name", "subscribe_calendar");
            ((EditText) this.f76658a.f76641d.findViewById(R.id.etSearchBar)).clearFocus();
            KeyboardUtils.hideKeyboard(this.f76658a.f76642e);
            CalendarSubscribeView.m113810a(this.f76658a).mo110344a(CollectionsKt.listOf(cVar), new MeetingRoomFilter(Integer.valueOf(this.f76658a.mo110510f().getCapacity()), CollectionsKt.toList(this.f76658a.mo110510f().getEquipments())));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.searchmeetingroom.building.BuildingExpandRoomSubscribeAdapter.OnItemClickListener
        /* renamed from: a */
        public void mo110518a(SubscribeMeetingRoomData eVar, int i) {
            Intrinsics.checkParameterIsNotNull(eVar, "meetingRoomData");
            CalendarSubscribeView.m113810a(this.f76658a).mo110339a(eVar, i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public void mo110371a(int i) {
        this.f76653q.mo110553a(i);
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate m113810a(CalendarSubscribeView gVar) {
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = gVar.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$g */
    public static final class View$OnClickListenerC30626g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76661a;

        View$OnClickListenerC30626g(CalendarSubscribeView gVar) {
            this.f76661a = gVar;
        }

        public final void onClick(View view) {
            EditText editText = (EditText) this.f76661a.f76641d.findViewById(R.id.etSearchBar);
            Intrinsics.checkExpressionValueIsNotNull(editText, "viewRoot.etSearchBar");
            editText.getText().clear();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: b */
    public void mo110378b(ArrayList<SubscribeBaseData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.f76646i.mo110488c();
        if (arrayList.size() == 0) {
            ShareCalendarSubscribeView cVar = this.f76646i;
            CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
            }
            cVar.setOnLoadingViewClickedListener(aVar);
            this.f76646i.mo110490d();
            return;
        }
        this.f76646i.mo110487b(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: c */
    public void mo110380c(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        int i = C30630h.f76670d[subViewType.ordinal()];
        if (i == 1) {
            this.f76645h.mo110406b();
        } else if (i == 2) {
            this.f76653q.mo110552a();
        } else if (i == 3) {
            this.f76646i.mo110486b();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: d */
    public void mo110385d(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        m113813j();
        int i = C30630h.f76671e[subViewType.ordinal()];
        if (i == 1) {
            this.f76645h.mo110411e();
        } else if (i == 2) {
            this.f76653q.mo110560c();
            this.f76653q.mo110563f();
        } else if (i == 3) {
            this.f76646i.mo110492f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: e */
    public void mo110388e(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        int i = C30630h.f76673g[subViewType.ordinal()];
        if (i == 1) {
            this.f76645h.mo110412f();
        } else if (i == 2) {
            this.f76653q.mo110564g();
        } else if (i == 3) {
            this.f76646i.mo110493g();
        }
    }

    public CalendarSubscribeView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "realView");
        this.f76641d = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "realView.context");
        this.f76642e = context;
        this.f76653q = new MeetingRoomBuildingSubscribeView(context, this);
        this.f76645h = new CalendarSubscribeContactSubView(context, this);
        this.f76646i = new ShareCalendarSubscribeView(context, this);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: a */
    public String mo110370a(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        int i = C30630h.f76674h[subViewType.ordinal()];
        if (i == 1) {
            return this.f76645h.getSearchText();
        }
        if (i == 2) {
            return this.f76653q.getSearchText();
        }
        if (i != 3) {
            return "";
        }
        return this.f76646i.getSearchText();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: c */
    public void mo110381c(ArrayList<SubscribeContactData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (arrayList.size() == 0) {
            this.f76645h.mo110410d();
            CalendarSubscribeContactSubView cVar = this.f76645h;
            CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
            }
            cVar.setOnLoadingViewClickedListener(aVar);
            return;
        }
        this.f76645h.mo110405a(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: d */
    public void mo110386d(ArrayList<SubscribeBaseData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.f76646i.mo110488c();
        if (arrayList.size() == 0) {
            ShareCalendarSubscribeView cVar = this.f76646i;
            CalendarLoadingView.AbstractC31882a aVar = this.f76651o;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNoTryAgainListener");
            }
            cVar.setOnLoadingViewClickedListener(aVar);
            this.f76646i.mo110491e();
            return;
        }
        this.f76646i.mo110485a(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: e */
    public void mo110389e(ArrayList<SubscribeMeetingRoomData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        if (CollectionUtils.isNotEmpty(arrayList)) {
            this.f76653q.mo110554a(arrayList);
        } else {
            this.f76653q.mo110564g();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: b */
    public void mo110377b(SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        if (!TextUtils.isEmpty(this.f76647j) && subViewType != SubViewType.MeetingRoomFragment) {
            ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).setSelectAllOnFocus(true);
            ((EditText) this.f76641d.findViewById(R.id.etSearchBar)).selectAll();
        }
        int i = C30630h.f76669c[subViewType.ordinal()];
        if (i == 1) {
            this.f76645h.mo110404a();
        } else if (i == 2) {
            this.f76653q.mo110559b();
        } else if (i == 3) {
            this.f76646i.mo110484a();
        } else if (i == 4) {
            CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo110337a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeView$initViewPager$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.g$h */
    public static final class C30627h implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeView f76662a;

        /* renamed from: b */
        final /* synthetic */ List f76663b;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            int i2 = C30630h.f76668b[((SubViewType) this.f76663b.get(i)).ordinal()];
            if (i2 == 1) {
                this.f76662a.f76648k = SubViewType.Contact;
                CalendarSubscribeView.m113810a(this.f76662a).mo110338a(SubViewType.Contact);
                if (!Intrinsics.areEqual(this.f76662a.f76647j, this.f76662a.f76645h.getSearchText())) {
                    this.f76662a.f76645h.setSearchText(this.f76662a.f76647j);
                    CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate.C30594a.m113702a(CalendarSubscribeView.m113810a(this.f76662a), this.f76662a.f76647j, null, 2, null);
                }
            } else if (i2 != 2) {
                this.f76662a.f76648k = SubViewType.ShareCalendar;
                CalendarSubscribeView.m113810a(this.f76662a).mo110338a(SubViewType.ShareCalendar);
                if (!Intrinsics.areEqual(this.f76662a.f76647j, this.f76662a.f76646i.getSearchText())) {
                    this.f76662a.f76646i.setSearchText(this.f76662a.f76647j);
                    CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate.C30594a.m113702a(CalendarSubscribeView.m113810a(this.f76662a), this.f76662a.f76647j, null, 2, null);
                }
            } else {
                this.f76662a.f76648k = SubViewType.MeetingRoom;
                CalendarSubscribeView.m113810a(this.f76662a).mo110338a(SubViewType.MeetingRoom);
                if (!Intrinsics.areEqual(this.f76662a.f76647j, this.f76662a.mo110510f().getSearchText())) {
                    this.f76662a.mo110510f().setSearchText(this.f76662a.f76647j);
                    String str = this.f76662a.f76647j;
                    if (str != null) {
                        if (TextUtils.isEmpty(StringsKt.trim((CharSequence) str).toString())) {
                            RecyclerView recyclerView = (RecyclerView) this.f76662a.mo110510f().mo110558b(R.id.searchRecycleView);
                            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "meetingRoomBuildingSubscribeView.searchRecycleView");
                            recyclerView.setVisibility(8);
                            LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f76662a.mo110510f().mo110558b(R.id.ptrFrame);
                            Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "meetingRoomBuildingSubscribeView.ptrFrame");
                            lKUIPtrClassicFrameLayout.setVisibility(8);
                        }
                        CalendarSubscribeView.m113810a(this.f76662a).mo110343a(this.f76662a.f76647j, new MeetingRoomFilter(Integer.valueOf(this.f76662a.mo110510f().getCapacity()), CollectionsKt.toList(this.f76662a.mo110510f().getEquipments())));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }

        C30627h(CalendarSubscribeView gVar, List list) {
            this.f76662a = gVar;
            this.f76663b = list;
        }
    }

    /* renamed from: a */
    public void setViewDelegate(CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewDelegate");
        this.f76644g = aVar;
    }

    /* renamed from: a */
    public final void mo110507a(SubscribeBaseData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "itemViewData");
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo110339a(bVar, -1);
    }

    /* renamed from: a */
    public final void mo110508a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo110341a(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: b */
    public void mo110379b(ArrayList<SubscribeContactData> arrayList, SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        if (C30630h.f76672f[subViewType.ordinal()] == 1) {
            this.f76645h.mo110409c(arrayList);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeView
    /* renamed from: c */
    public void mo110382c(ArrayList<SubscribeBaseData> arrayList, SubViewType subViewType) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        if (CollectionUtils.isNotEmpty(arrayList)) {
            this.f76646i.mo110489c(arrayList);
        } else {
            this.f76646i.mo110493g();
        }
    }

    /* renamed from: a */
    public final void mo110505a(SubViewType subViewType, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo110343a(this.f76647j, meetingRoomFilter);
    }

    /* renamed from: a */
    public final void mo110504a(int i, SubViewType subViewType, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(subViewType, "viewType");
        CalendarSubscribeContract.ICalendarSubscribeView.ViewDelegate aVar = this.f76644g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        aVar.mo110342a(this.f76647j, i, subViewType, meetingRoomFilter);
    }

    /* renamed from: a */
    public static /* synthetic */ void m113811a(CalendarSubscribeView gVar, int i, SubViewType subViewType, MeetingRoomFilter meetingRoomFilter, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            meetingRoomFilter = null;
        }
        gVar.mo110504a(i, subViewType, meetingRoomFilter);
    }
}
