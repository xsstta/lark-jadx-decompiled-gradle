package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SearchBar;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.BuildingAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingPresenter;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadErrorViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.BuildingExpandRoomsView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.MultiLevelView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.SearchRoomsResultView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\b2\u0006\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u000205H\u0016J\b\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u000205H\u0016J\b\u0010<\u001a\u000205H\u0016J\b\u0010=\u001a\u000205H\u0016J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020*H\u0002J\b\u0010@\u001a\u000205H\u0016J\u0012\u0010A\u001a\u0002052\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\b\u0010D\u001a\u000205H\u0016J\b\u0010E\u001a\u000205H\u0016J\b\u0010F\u001a\u000205H\u0002J\b\u0010G\u001a\u000205H\u0002J\b\u0010H\u001a\u000205H\u0002J\b\u0010I\u001a\u000205H\u0002J\b\u0010J\u001a\u00020\bH\u0002J\u0010\u0010K\u001a\u0002052\u0006\u0010L\u001a\u00020\bH\u0016J\b\u0010M\u001a\u000205H\u0016J\b\u0010N\u001a\u000205H\u0016J\b\u0010O\u001a\u000205H\u0016J\b\u0010P\u001a\u000205H\u0016J\b\u0010Q\u001a\u00020\bH\u0016J\u0018\u0010R\u001a\u0002052\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020/H\u0016J\b\u0010U\u001a\u000205H\u0016J\b\u0010V\u001a\u000205H\u0016J\u001a\u0010W\u001a\u0002052\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010X\u001a\u00020\bH\u0002J\b\u0010Y\u001a\u000205H\u0016J\b\u0010Z\u001a\u000205H\u0002J\b\u0010[\u001a\u000205H\u0016J\b\u0010\\\u001a\u000205H\u0016J\b\u0010]\u001a\u000205H\u0016J\b\u0010^\u001a\u000205H\u0002J\b\u0010_\u001a\u000205H\u0016J\b\u0010`\u001a\u000205H\u0016J\b\u0010a\u001a\u000205H\u0002J \u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020*2\u0006\u0010d\u001a\u00020e2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010f\u001a\u0002052\u0006\u0010g\u001a\u00020\bH\u0002J\b\u0010h\u001a\u000205H\u0002J\b\u0010i\u001a\u000205H\u0002J\b\u0010j\u001a\u000205H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewApi;", "rootView", "Landroid/view/View;", "fragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;)V", "isChildFragmentShow", "", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/BuildingAdapter;", "mContext", "Landroid/content/Context;", "mDeleteBtnClickListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "mFragmentDependency", "mMeetingRoomBuildingLoadingListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "mMeetingRoomFormFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "mMeetingRoomLoadingListener", "mMultiSearchFilterListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "mMultiselectLoading", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "mOnBuildingItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "mOnLoadErrorClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder$OnItemClickListener;", "mOnLoadMoreClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "mOnMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "mOnMultiBreadCrumbsListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "mOnMultiLevelItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "mOnMultiMeetingRoomItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "mRootView", "mSearchAdapter", "mSearchBarText", "", "mSearchFilterListener", "mSearchInputTextWatcher", "Landroid/text/TextWatcher;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "meetingRoomLevelsFG", "searchFilterFG", "changeSearchMeetingRoomData", "", "checkShowResourceFormFragment", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "create", "destroy", "dismissLoadingAnimation", "dismissLoadingPanel", "dismissLoadingView", "fetchAllMeetingRoomResource", "searchBarText", "hideChangeToMultipleLoading", "hideChildFragment", "fragment", "Landroidx/fragment/app/Fragment;", "hideSearchBar", "hideSearchLoading", "initContent", "initListener", "initTitleBar", "initView", "isSearchListShowing", "refreshBuildingView", "forcePackUpBuilding", "refreshCurrentLevelState", "refreshExpandMeetingRooms", "refreshSearchView", "refreshSearchViewAfterDataChanged", "refreshViewByBackPressed", "setDependency", "viewData", "viewAction", "showChangeToMultipleLoading", "showChangeToMultipleLoadingErr", "showChildFragment", "isFirstAdd", "showErrorTipPanel", "showFailedCalendarLoadingView", "showLoadFailureView", "showLoadingAnimation", "showMultiLevelLoading", "showMultipleSelectTitleBar", "showSearchBar", "showSearchLoading", "showSwitchUsableContainer", "startShowResourceFormFragment", "calendarId", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "switchToggle", "isChosen", "updateMultiLevelConfirmTitleBar", "updateSelectAllContainer", "updateTitleBar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g */
public final class BuildingView implements IBuildingContract.IBuildingViewApi {

    /* renamed from: a */
    public View f80845a;

    /* renamed from: b */
    public Context f80846b;

    /* renamed from: c */
    public IBuildingContract.IBuildingViewData f80847c;

    /* renamed from: d */
    public IBuildingContract.IBuildingViewAction f80848d;

    /* renamed from: e */
    public String f80849e;

    /* renamed from: f */
    public final boolean f80850f = C30022a.f74883b.mo112706n();

    /* renamed from: g */
    public final boolean f80851g = C30022a.f74883b.mo112707o();

    /* renamed from: h */
    public MeetingRoomFormFragment f80852h;

    /* renamed from: i */
    private BuildingPresenter.FragmentDependency f80853i;

    /* renamed from: j */
    private TextWatcher f80854j;

    /* renamed from: k */
    private BuildingAdapter f80855k;

    /* renamed from: l */
    private BuildingAdapter f80856l;

    /* renamed from: m */
    private MeetingRoomBuildingViewHolder.OnItemClickListener f80857m;

    /* renamed from: n */
    private MeetingRoomViewHolder.OnItemClickListener f80858n;

    /* renamed from: o */
    private LoadMoreViewHolder.OnItemClickListener f80859o;

    /* renamed from: p */
    private CalendarLoadingView.AbstractC31882a f80860p;

    /* renamed from: q */
    private CalendarLoadingView.AbstractC31882a f80861q;

    /* renamed from: r */
    private ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener f80862r;

    /* renamed from: s */
    private MeetingRoomSearchFilters.OnSearchFilterListener f80863s;

    /* renamed from: t */
    private LoadErrorViewHolder.OnItemClickListener f80864t;

    /* renamed from: u */
    private MultiLevelViewHolder.OnItemClickListener f80865u;

    /* renamed from: v */
    private MultiMeetingRoomViewHolder.OnItemClickListener f80866v;

    /* renamed from: w */
    private LevelBreadcrumbsView.IBreadcrumbsListener f80867w;

    /* renamed from: x */
    private MeetingRoomSearchFilters.OnSearchFilterListener f80868x;

    /* renamed from: y */
    private boolean f80869y;

    /* renamed from: z */
    private RequestLoadingDialog f80870z;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$14", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadErrorViewHolder$OnItemClickListener;", "onItemClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$f */
    public static final class C31780f implements LoadErrorViewHolder.OnItemClickListener {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadErrorViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115690a() {
        }

        C31780f() {
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: g */
    public void mo115630g() {
        mo115644v();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$10", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$b */
    public static final class C31776b implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80872a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f80872a.mo115634k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            BuildingView gVar = this.f80872a;
            gVar.mo115898a(String.valueOf(gVar.f80849e));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31776b(BuildingView gVar) {
            this.f80872a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$9", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$n */
    public static final class C31788n implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80883a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f80883a.mo115634k();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            BuildingView.m120600a(this.f80883a).mo115601a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31788n(BuildingView gVar) {
            this.f80883a = gVar;
        }
    }

    /* renamed from: z */
    private final void m120607z() {
        m120596B();
        m120595A();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m120604w();
        m120607z();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: q */
    public void mo115640q() {
        RequestLoadingDialog requestLoadingDialog = this.f80870z;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$12", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "getCalendarBuilding", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onCapacityChanged", "", "selectedCapacity", "", "onEquipmentsChanged", "selectedEquipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onResetStatusChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$d */
    public static final class C31778d implements MeetingRoomSearchFilters.OnSearchFilterListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80874a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110574a() {
            BuildingView.m120600a(this.f80874a).mo115612a(m120640b());
        }

        /* renamed from: b */
        private final List<CalendarBuilding> m120640b() {
            boolean z;
            List<MeetingRoomBuildingModel> expandBuildings = ((BuildingExpandRoomsView) this.f80874a.f80845a.findViewById(R.id.buildingExpandRoomsView)).getExpandBuildings();
            ArrayList arrayList = new ArrayList(expandBuildings.size());
            Iterator<MeetingRoomBuildingModel> it = expandBuildings.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                CalendarBuilding d = it.next().mo115771d();
                if (d != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CalendarBuilding calendarBuilding = (CalendarBuilding) it2.next();
                        Intrinsics.checkExpressionValueIsNotNull(calendarBuilding, "building");
                        if (Intrinsics.areEqual(calendarBuilding.getId(), d.getId())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        arrayList.add(d);
                    }
                }
            }
            List<MeetingRoomBuildingModel> list = expandBuildings;
            if (list == null || list.isEmpty()) {
                z = true;
            }
            if (!z) {
                ((BuildingExpandRoomsView) this.f80874a.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115921c();
            }
            return arrayList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31778d(BuildingView gVar) {
            this.f80874a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110575a(int i) {
            BuildingView.m120600a(this.f80874a).mo115602a(i, m120640b());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110576a(List<EquipmentData> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedEquipments");
            BuildingView.m120600a(this.f80874a).mo115614a(list, m120640b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$7", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/LoadMoreViewHolder$OnItemClickListener;", "onItemClick", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$l */
    public static final class C31786l implements LoadMoreViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80881a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.LoadMoreViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115694a() {
            BuildingView.m120600a(this.f80881a).mo115616b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31786l(BuildingView gVar) {
            this.f80881a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$startShowResourceFormFragment$meetingRoomFormFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "onCompletePressed", "", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "onFragmentBackPressed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$q */
    public static final class C31791q implements MeetingRoomFormFragment.MeetingRoomFormFragmentAction {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80888a;

        /* renamed from: b */
        final /* synthetic */ EventMeetingRoomData f80889b;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114392a() {
            BuildingView gVar = this.f80888a;
            gVar.mo115896a(gVar.f80852h);
        }

        C31791q(BuildingView gVar, EventMeetingRoomData eventMeetingRoomData) {
            this.f80888a = gVar;
            this.f80889b = eventMeetingRoomData;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114393a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData;
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            BuildingView gVar = this.f80888a;
            gVar.mo115896a(gVar.f80852h);
            CalendarResource calendarResource = this.f80889b.getCalendarResource();
            if (!(calendarResource == null || (schemaExtraData = calendarResource.getSchemaExtraData()) == null)) {
                C32066d.m121956a(schemaExtraData, resourceCustomization);
            }
            BuildingView.m120600a(this.f80888a).mo115603a(this.f80889b);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: r */
    public void mo115641r() {
        RequestLoadingDialog requestLoadingDialog = this.f80870z;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112592c(R.string.Calendar_Common_FailedToLoad);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$13", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "onCapacityChanged", "", "selectedCapacity", "", "onEquipmentsChanged", "selectedEquipments", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onResetStatusChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$e */
    public static final class C31779e implements MeetingRoomSearchFilters.OnSearchFilterListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80875a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110574a() {
            BuildingView.m120600a(this.f80875a).mo115613a(new ArrayList(), 0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31779e(BuildingView gVar) {
            this.f80875a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110575a(int i) {
            BuildingView.m120600a(this.f80875a).mo115613a(BuildingView.m120603b(this.f80875a).mo115663q(), i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110576a(List<EquipmentData> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedEquipments");
            BuildingView.m120600a(this.f80875a).mo115613a(list, BuildingView.m120603b(this.f80875a).mo115664r());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: f */
    public void mo115629f() {
        ((CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view)).setOnLoadingViewClickedListener(this.f80860p);
        m120605x();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: i */
    public void mo115632i() {
        FrameLayout frameLayout = (FrameLayout) this.f80845a.findViewById(R.id.load_status_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.load_status_bar");
        frameLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: l */
    public void mo115635l() {
        mo115903c();
        mo115902b();
        ((MultiLevelView) this.f80845a.findViewById(R.id.multiLevelView)).mo115965a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: u */
    public void mo115643u() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.calendar_loading_view");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view)).mo116402a();
    }

    /* renamed from: B */
    private final void m120596B() {
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftClickListener(new C31789o(this));
    }

    /* renamed from: x */
    private final void m120605x() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.calendar_loading_view");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view)).mo116405c();
        ((CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view)).setErrorText(C32634ae.m125182b(R.string.Calendar_Common_FailToLoad3));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: h */
    public void mo115631h() {
        FrameLayout frameLayout = (FrameLayout) this.f80845a.findViewById(R.id.load_status_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.load_status_bar");
        frameLayout.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.building_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.building_loading_container");
        relativeLayout.setVisibility(0);
        TextView textView = (TextView) this.f80845a.findViewById(R.id.fetch_failed);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.fetch_failed");
        textView.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: j */
    public void mo115633j() {
        FrameLayout frameLayout = (FrameLayout) this.f80845a.findViewById(R.id.load_status_bar);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.load_status_bar");
        frameLayout.setVisibility(0);
        TextView textView = (TextView) this.f80845a.findViewById(R.id.fetch_failed);
        Intrinsics.checkExpressionValueIsNotNull(textView, "mRootView.fetch_failed");
        textView.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.building_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.building_loading_container");
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: o */
    public void mo115638o() {
        List<MeetingRoomBuildingModel> expandBuildings = ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).getExpandBuildings();
        IBuildingContract.IBuildingViewData dVar = this.f80847c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115918a(dVar.mo115646a(expandBuildings));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: p */
    public void mo115639p() {
        RequestLoadingDialog requestLoadingDialog = this.f80870z;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Edit_MoreMeetingRooms);
            return;
        }
        Context context = this.f80846b;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(activity);
            requestLoadingDialog2.mo112585a(R.string.Calendar_Edit_MoreMeetingRooms);
            this.f80870z = requestLoadingDialog2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: s */
    public void mo115642s() {
        LinearLayout linearLayout = (LinearLayout) this.f80845a.findViewById(R.id.ll_search_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.ll_search_container");
        linearLayout.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.ll_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.ll_loading_container");
        relativeLayout.setVisibility(0);
    }

    /* renamed from: t */
    public void mo115904t() {
        LinearLayout linearLayout = (LinearLayout) this.f80845a.findViewById(R.id.ll_search_container);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.ll_search_container");
        linearLayout.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.ll_loading_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.ll_loading_container");
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: v */
    public void mo115644v() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "mRootView.calendar_loading_view");
        calendarLoadingView.setVisibility(8);
        ((CalendarLoadingView) this.f80845a.findViewById(R.id.calendar_loading_view)).mo116404b();
    }

    /* renamed from: E */
    private final void m120599E() {
        IBuildingContract.IBuildingViewData dVar = this.f80847c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        if (dVar.mo115648b()) {
            View findViewById = this.f80845a.findViewById(R.id.usable_shadow);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.usable_shadow");
            findViewById.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.usable_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.usable_container");
            relativeLayout.setVisibility(0);
            return;
        }
        View findViewById2 = this.f80845a.findViewById(R.id.usable_shadow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.usable_shadow");
        findViewById2.setVisibility(8);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f80845a.findViewById(R.id.usable_container);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.usable_container");
        relativeLayout2.setVisibility(8);
    }

    /* renamed from: y */
    private final void m120606y() {
        RecyclerView recyclerView = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView_keyword_search_result");
        if (recyclerView.getVisibility() == 0 && this.f80856l != null) {
            IBuildingContract.IBuildingViewData dVar = this.f80847c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            if (dVar.mo115647a()) {
                BuildingAdapter cVar = this.f80856l;
                if (cVar != null) {
                    IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
                    if (dVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    cVar.mo115214a(dVar2.mo115652f());
                }
            } else {
                BuildingAdapter cVar2 = this.f80856l;
                if (cVar2 != null) {
                    IBuildingContract.IBuildingViewData dVar3 = this.f80847c;
                    if (dVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    cVar2.mo115214a(dVar3.mo115653g());
                }
            }
            BuildingAdapter cVar3 = this.f80856l;
            if (cVar3 != null) {
                cVar3.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115902b() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingView.mo115902b():void");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: d */
    public void mo115627d() {
        LinearLayout linearLayout = (LinearLayout) this.f80845a.findViewById(R.id.title_divider);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.title_divider");
        linearLayout.setVisibility(0);
        SearchBar searchBar = (SearchBar) this.f80845a.findViewById(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(searchBar, "mRootView.search_bar");
        searchBar.setVisibility(0);
        if (this.f80850f) {
            MeetingRoomSearchFilters meetingRoomSearchFilters = (MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomSearchFilters, "mRootView.meetingRoomFilter");
            meetingRoomSearchFilters.setVisibility(0);
        }
        View findViewById = this.f80845a.findViewById(R.id.meetingRoomFilterDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.meetingRoomFilterDivider");
        findViewById.setVisibility(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: e */
    public void mo115628e() {
        LinearLayout linearLayout = (LinearLayout) this.f80845a.findViewById(R.id.title_divider);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.title_divider");
        linearLayout.setVisibility(8);
        SearchBar searchBar = (SearchBar) this.f80845a.findViewById(R.id.search_bar);
        Intrinsics.checkExpressionValueIsNotNull(searchBar, "mRootView.search_bar");
        searchBar.setVisibility(8);
        MeetingRoomSearchFilters meetingRoomSearchFilters = (MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter);
        Intrinsics.checkExpressionValueIsNotNull(meetingRoomSearchFilters, "mRootView.meetingRoomFilter");
        meetingRoomSearchFilters.setVisibility(8);
        View findViewById = this.f80845a.findViewById(R.id.meetingRoomFilterDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.meetingRoomFilterDivider");
        findViewById.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: n */
    public void mo115637n() {
        if (!this.f80850f) {
            m120606y();
            return;
        }
        SearchRoomsResultView searchRoomsResultView = (SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView);
        Intrinsics.checkExpressionValueIsNotNull(searchRoomsResultView, "mRootView.searchRoomsResultView");
        if (searchRoomsResultView.getVisibility() == 0) {
            mo115903c();
            IBuildingContract.IBuildingViewData dVar = this.f80847c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ArrayList<ItemModel> f = dVar.mo115652f();
            IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ((SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView)).mo115974a(f, dVar2.mo115653g());
        }
    }

    /* renamed from: C */
    private final void m120597C() {
        float f;
        IBuildingContract.IBuildingViewData dVar = this.f80847c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        int j = dVar.mo115656j();
        String b = C32634ae.m125182b(R.string.Calendar_Common_Confirm);
        if (j > 0) {
            b = b + '(' + j + ')';
        }
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).removeAllActions();
        View addAction = ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).addAction(new C31790p(this, j, b, b, R.color.lkui_B500));
        if (!(addAction instanceof TextView)) {
            addAction = null;
        }
        TextView textView = (TextView) addAction;
        if (textView != null) {
            if (j > 0) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            textView.setAlpha(f);
        }
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftImageDrawable(null);
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftText(C32634ae.m125182b(R.string.Calendar_Common_Cancel));
    }

    /* renamed from: D */
    private final void m120598D() {
        float f;
        IBuildingContract.IBuildingViewData dVar = this.f80847c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        int o = dVar.mo115661o();
        String b = C32634ae.m125182b(R.string.Calendar_Common_Confirm);
        if (o > 0) {
            b = b + '(' + o + ')';
        }
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftText("");
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).removeAllActions();
        View addAction = ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).addAction(new C31792r(this, o, b, b, R.color.lkui_B500));
        if (!(addAction instanceof TextView)) {
            addAction = null;
        }
        TextView textView = (TextView) addAction;
        if (textView != null) {
            if (o > 0) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            textView.setAlpha(f);
        }
    }

    /* renamed from: w */
    private final void m120604w() {
        this.f80854j = new C31775a(this);
        this.f80857m = new C31781g(this);
        this.f80858n = new C31782h(this);
        this.f80865u = new C31783i(this);
        this.f80866v = new C31784j(this);
        this.f80867w = new C31785k(this);
        this.f80859o = new C31786l(this);
        ((UDSwitch) this.f80845a.findViewById(R.id.switch_view_usable_boardroom)).setOnCheckedChangeListener(new C31787m(this));
        this.f80860p = new C31788n(this);
        this.f80861q = new C31776b(this);
        this.f80862r = new C31777c(this);
        this.f80863s = new C31778d(this);
        this.f80868x = new C31779e(this);
        this.f80864t = new C31780f();
    }

    /* renamed from: c */
    public void mo115903c() {
        boolean z;
        if (!mo115900a()) {
            String str = this.f80849e;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f80851g) {
                    m120598D();
                    return;
                }
                IBuildingContract.IBuildingViewData dVar = this.f80847c;
                if (dVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                }
                if (dVar.mo115654h() == IBuildingContract.ResourceSelectMode.SINGLE) {
                    ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftText("");
                    ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
                    ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).removeAllActions();
                    IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
                    if (dVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    if (dVar2.mo115657k() && C30022a.f74883b.mo112715w()) {
                        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).addAction(new C31794t(this, C32634ae.m125182b(R.string.Calendar_Common_Multi)));
                        return;
                    }
                    return;
                }
                m120597C();
                return;
            }
        }
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftText("");
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) this.f80845a.findViewById(R.id.boardroom_building_title_bar)).removeAllActions();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: k */
    public boolean mo115634k() {
        KeyboardUtils.hideKeyboard(this.f80846b);
        FrameLayout frameLayout = (FrameLayout) this.f80845a.findViewById(R.id.child_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.child_fragment_container");
        if (frameLayout.getVisibility() != 0 || !this.f80869y) {
            LinearLayout linearLayout = (LinearLayout) this.f80845a.findViewById(R.id.ll_search_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.ll_search_container");
            if (linearLayout.getVisibility() == 0 || this.f80851g) {
                ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).clearFocus();
                ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).mo112605b(this.f80854j);
                ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).mo112601a();
                ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).mo112603a(this.f80854j);
                RecyclerView recyclerView = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView_keyword_search_result");
                recyclerView.setVisibility(8);
                mo115904t();
                if (this.f80850f) {
                    this.f80849e = "";
                    IBuildingContract.IBuildingViewAction bVar = this.f80848d;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
                    }
                    bVar.mo115611a("");
                }
                if (!this.f80851g) {
                    return true;
                }
                IBuildingContract.IBuildingViewAction bVar2 = this.f80848d;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
                }
                bVar2.mo115622c();
                return true;
            }
            IBuildingContract.IBuildingViewAction bVar3 = this.f80848d;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
            }
            bVar3.mo115622c();
            return true;
        }
        MeetingRoomFormFragment aVar = this.f80852h;
        if (aVar == null) {
            return false;
        }
        aVar.mo113714e();
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: m */
    public void mo115636m() {
        ArrayList<ItemModel> arrayList;
        if (this.f80851g) {
            mo115904t();
            MultiLevelView multiLevelView = (MultiLevelView) this.f80845a.findViewById(R.id.multiLevelView);
            IBuildingContract.IBuildingViewData dVar = this.f80847c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            multiLevelView.mo115967a(dVar.mo115665s());
            mo115903c();
        } else if (this.f80850f) {
            SearchRoomsResultView searchRoomsResultView = (SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView);
            Intrinsics.checkExpressionValueIsNotNull(searchRoomsResultView, "mRootView.searchRoomsResultView");
            searchRoomsResultView.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.ll_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.ll_loading_container");
            relativeLayout.setVisibility(8);
            IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ArrayList<ItemModel> f = dVar2.mo115652f();
            IBuildingContract.IBuildingViewData dVar3 = this.f80847c;
            if (dVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ((SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView)).mo115974a(f, dVar3.mo115653g());
            mo115903c();
        } else {
            RecyclerView recyclerView = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView_keyword_search_result");
            recyclerView.setVisibility(0);
            IBuildingContract.IBuildingViewData dVar4 = this.f80847c;
            if (dVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            if (dVar4.mo115647a()) {
                IBuildingContract.IBuildingViewData dVar5 = this.f80847c;
                if (dVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                }
                arrayList = dVar5.mo115652f();
            } else {
                IBuildingContract.IBuildingViewData dVar6 = this.f80847c;
                if (dVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                }
                arrayList = dVar6.mo115653g();
            }
            BuildingAdapter cVar = new BuildingAdapter(arrayList);
            this.f80856l = cVar;
            if (cVar != null) {
                cVar.mo115211a(this.f80858n);
            }
            BuildingAdapter cVar2 = this.f80856l;
            if (cVar2 != null) {
                cVar2.mo115209a(this.f80859o);
            }
            RecyclerView recyclerView2 = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.recyclerView_keyword_search_result");
            recyclerView2.setAdapter(this.f80856l);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f80845a.findViewById(R.id.ll_loading_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.ll_loading_container");
            relativeLayout2.setVisibility(8);
        }
    }

    /* renamed from: A */
    private final void m120595A() {
        RecyclerView recyclerView = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f80846b));
        RecyclerView recyclerView2 = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "mRootView.recyclerView_keyword_search_result");
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f80846b));
        ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).setHint(R.string.Calendar_EventSearch_SearchRoom);
        ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).mo112603a(this.f80854j);
        ((SearchBar) this.f80845a.findViewById(R.id.search_bar)).setEditTextImeOptions(6);
        if (this.f80851g) {
            RelativeLayout relativeLayout = (RelativeLayout) this.f80845a.findViewById(R.id.usable_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "mRootView.usable_container");
            relativeLayout.setVisibility(8);
            View findViewById = this.f80845a.findViewById(R.id.usable_shadow);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.usable_shadow");
            findViewById.setVisibility(8);
            RecyclerView recyclerView3 = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "mRootView.recyclerView");
            recyclerView3.setVisibility(8);
            MultiLevelView multiLevelView = (MultiLevelView) this.f80845a.findViewById(R.id.multiLevelView);
            Intrinsics.checkExpressionValueIsNotNull(multiLevelView, "mRootView.multiLevelView");
            multiLevelView.setVisibility(0);
            ((MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter)).setFilterListener(this.f80868x);
            MultiLevelView multiLevelView2 = (MultiLevelView) this.f80845a.findViewById(R.id.multiLevelView);
            MultiLevelViewHolder.OnItemClickListener aVar = this.f80865u;
            MultiMeetingRoomViewHolder.OnItemClickListener aVar2 = this.f80866v;
            LoadMoreViewHolder.OnItemClickListener aVar3 = this.f80859o;
            MeetingRoomViewHolder.OnItemClickListener aVar4 = this.f80858n;
            LevelBreadcrumbsView.IBreadcrumbsListener aVar5 = this.f80867w;
            if (aVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOnMultiBreadCrumbsListener");
            }
            multiLevelView2.mo115966a(aVar, aVar2, aVar3, aVar4, aVar5);
        } else if (this.f80850f) {
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f80845a.findViewById(R.id.usable_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "mRootView.usable_container");
            relativeLayout2.setVisibility(8);
            View findViewById2 = this.f80845a.findViewById(R.id.usable_shadow);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.usable_shadow");
            findViewById2.setVisibility(8);
            RecyclerView recyclerView4 = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "mRootView.recyclerView");
            recyclerView4.setVisibility(8);
            BuildingExpandRoomsView buildingExpandRoomsView = (BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView);
            Intrinsics.checkExpressionValueIsNotNull(buildingExpandRoomsView, "mRootView.buildingExpandRoomsView");
            buildingExpandRoomsView.setVisibility(0);
            ((MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter)).setFilterListener(this.f80863s);
            IBuildingContract.IBuildingViewData dVar = this.f80847c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            if (dVar.mo115648b()) {
                ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115915a();
            } else {
                ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115919b();
                ((MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter)).setFilterSource("search_meeting");
            }
            ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115916a(this.f80857m, this.f80858n, this.f80862r);
            ((SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView)).mo115973a(this.f80858n, this.f80859o);
            MeetingRoomSearchFilters meetingRoomSearchFilters = (MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter);
            IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            meetingRoomSearchFilters.setIsEditEvent(dVar2.mo115650d());
        } else {
            MeetingRoomSearchFilters meetingRoomSearchFilters2 = (MeetingRoomSearchFilters) this.f80845a.findViewById(R.id.meetingRoomFilter);
            Intrinsics.checkExpressionValueIsNotNull(meetingRoomSearchFilters2, "mRootView.meetingRoomFilter");
            meetingRoomSearchFilters2.setVisibility(8);
            BuildingExpandRoomsView buildingExpandRoomsView2 = (BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView);
            Intrinsics.checkExpressionValueIsNotNull(buildingExpandRoomsView2, "mRootView.buildingExpandRoomsView");
            buildingExpandRoomsView2.setVisibility(8);
            SearchRoomsResultView searchRoomsResultView = (SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView);
            Intrinsics.checkExpressionValueIsNotNull(searchRoomsResultView, "mRootView.searchRoomsResultView");
            searchRoomsResultView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final boolean mo115900a() {
        SearchRoomsResultView searchRoomsResultView = (SearchRoomsResultView) this.f80845a.findViewById(R.id.searchRoomsResultView);
        Intrinsics.checkExpressionValueIsNotNull(searchRoomsResultView, "mRootView.searchRoomsResultView");
        if (searchRoomsResultView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$a */
    public static final class C31775a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80871a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkParameterIsNotNull(charSequence, "s");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31775a(BuildingView gVar) {
            this.f80871a = gVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            this.f80871a.f80849e = editable.toString();
            if (!TextUtils.isEmpty(this.f80871a.f80849e)) {
                BuildingView gVar = this.f80871a;
                gVar.mo115898a(String.valueOf(gVar.f80849e));
            } else {
                RecyclerView recyclerView = (RecyclerView) this.f80871a.f80845a.findViewById(R.id.recyclerView_keyword_search_result);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView_keyword_search_result");
                recyclerView.setVisibility(8);
                SearchRoomsResultView searchRoomsResultView = (SearchRoomsResultView) this.f80871a.f80845a.findViewById(R.id.searchRoomsResultView);
                Intrinsics.checkExpressionValueIsNotNull(searchRoomsResultView, "mRootView.searchRoomsResultView");
                searchRoomsResultView.setVisibility(8);
                this.f80871a.mo115904t();
                this.f80871a.mo115644v();
                if (this.f80871a.f80850f) {
                    BuildingView.m120600a(this.f80871a).mo115611a("");
                }
            }
            this.f80871a.mo115903c();
            this.f80871a.mo115902b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$11", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/ChosenMeetingRoomViewHolder$OnDeleteBtnClickListener;", "onDeleted", "", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$c */
    public static final class C31777c implements ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80873a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31777c(BuildingView gVar) {
            this.f80873a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.ChosenMeetingRoomViewHolder.OnDeleteBtnClickListener
        /* renamed from: a */
        public void mo115685a(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoom");
            BuildingView.m120600a(this.f80873a).mo115617b(eventMeetingRoomData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$2", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomBuildingViewHolder$OnItemClickListener;", "onItemClick", "", "clickBuildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "onMultipleSelectClicked", "onMultipleSelectExpandIconClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$g */
    public static final class C31781g implements MeetingRoomBuildingViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80876a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31781g(BuildingView gVar) {
            this.f80876a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder.OnItemClickListener
        /* renamed from: b */
        public void mo115700b(MeetingRoomBuildingModel hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
            BuildingView.m120600a(this.f80876a).mo115605a(hVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder.OnItemClickListener
        /* renamed from: c */
        public void mo115701c(MeetingRoomBuildingModel hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
            BuildingView.m120600a(this.f80876a).mo115618b(hVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomBuildingViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115699a(MeetingRoomBuildingModel hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
            KeyboardUtils.hideKeyboard(this.f80876a.f80846b);
            ((SearchBar) this.f80876a.f80845a.findViewById(R.id.search_bar)).clearFocus();
            if (this.f80876a.f80850f) {
                hVar.mo115765a(!hVar.mo115772e());
                if (hVar.mo115772e()) {
                    CalendarBuilding d = hVar.mo115771d();
                    if (d != null) {
                        ((BuildingExpandRoomsView) this.f80876a.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115920b(hVar);
                        BuildingView.m120600a(this.f80876a).mo115620b(d);
                        return;
                    }
                    return;
                }
                ((BuildingExpandRoomsView) this.f80876a.f80845a.findViewById(R.id.buildingExpandRoomsView)).mo115917a(hVar);
                return;
            }
            BuildingView.m120600a(this.f80876a).mo115610a(hVar.mo115771d());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$3", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MeetingRoomViewHolder$OnItemClickListener;", "onClickMultipleResource", "", "model", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "onItemClick", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$h */
    public static final class C31782h implements MeetingRoomViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80877a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31782h(BuildingView gVar) {
            this.f80877a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115707a(MeetingRoomModel iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "model");
            BuildingView.m120600a(this.f80877a).mo115606a(iVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115708a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            BuildingView.m120600a(this.f80877a).mo115621b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MeetingRoomViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115706a(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoomData");
            if (!this.f80877a.mo115901a(eventMeetingRoomData)) {
                KeyboardUtils.hideKeyboard(this.f80877a.f80846b);
                ((SearchBar) this.f80877a.f80845a.findViewById(R.id.search_bar)).mo112601a();
                ((SearchBar) this.f80877a.f80845a.findViewById(R.id.search_bar)).clearFocus();
                LinearLayout linearLayout = (LinearLayout) this.f80877a.f80845a.findViewById(R.id.ll_search_container);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "mRootView.ll_search_container");
                linearLayout.setVisibility(8);
                BuildingView.m120600a(this.f80877a).mo115603a(eventMeetingRoomData);
                if (this.f80877a.f80850f) {
                    this.f80877a.f80849e = "";
                    BuildingView.m120600a(this.f80877a).mo115611a("");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$4", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiLevelViewHolder$OnItemClickListener;", "onArrowClick", "", "levelModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "onMultipleSelectClicked", "clickBuildingModel", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$i */
    public static final class C31783i implements MultiLevelViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80878a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31783i(BuildingView gVar) {
            this.f80878a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder.OnItemClickListener
        /* renamed from: b */
        public void mo112232b(MultiLevelModel jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "clickBuildingModel");
            BuildingView.m120600a(this.f80878a).mo115608a(jVar.mo115797a());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiLevelViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo112231a(MultiLevelModel jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "levelModel");
            KeyboardUtils.hideKeyboard(this.f80878a.f80846b);
            ((SearchBar) this.f80878a.f80845a.findViewById(R.id.search_bar)).clearFocus();
            BuildingView.m120600a(this.f80878a).mo115607a(jVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$5", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/holder/MultiMeetingRoomViewHolder$OnItemClickListener;", "onItemClick", "", "roomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiMeetingRoomModel;", "onMeetingRoomInfoClicked", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$j */
    public static final class C31784j implements MultiMeetingRoomViewHolder.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80879a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31784j(BuildingView gVar) {
            this.f80879a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115718a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            BuildingView.m120600a(this.f80879a).mo115621b(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.holder.MultiMeetingRoomViewHolder.OnItemClickListener
        /* renamed from: a */
        public void mo115717a(MultiMeetingRoomModel kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "roomModel");
            KeyboardUtils.hideKeyboard(this.f80879a.f80846b);
            ((SearchBar) this.f80879a.f80845a.findViewById(R.id.search_bar)).clearFocus();
            BuildingView.m120600a(this.f80879a).mo115609a(kVar.mo115812g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initListener$6", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/crumbs/LevelBreadcrumbsView$IBreadcrumbsListener;", "onItemClick", "", "item", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "position", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$k */
    public static final class C31785k implements LevelBreadcrumbsView.IBreadcrumbsListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80880a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31785k(BuildingView gVar) {
            this.f80880a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.crumbs.LevelBreadcrumbsView.IBreadcrumbsListener
        /* renamed from: a */
        public void mo112234a(MultiLevelNode bVar, int i) {
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            BuildingView.m120600a(this.f80880a).mo115619b(bVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$o */
    public static final class C31789o extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80884a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31789o(BuildingView gVar) {
            this.f80884a = gVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (BuildingView.m120603b(this.f80884a).mo115654h() == IBuildingContract.ResourceSelectMode.SINGLE || this.f80884a.mo115900a() || this.f80884a.f80851g) {
                this.f80884a.mo115634k();
            } else {
                BuildingView.m120600a(this.f80884a).mo115623d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$showMultipleSelectTitleBar$confirmView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$p */
    public static final class C31790p extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80885a;

        /* renamed from: b */
        final /* synthetic */ int f80886b;

        /* renamed from: c */
        final /* synthetic */ String f80887c;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            if (this.f80886b > 0) {
                BuildingView.m120600a(this.f80885a).mo115625f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31790p(BuildingView gVar, int i, String str, String str2, int i2) {
            super(str2, i2);
            this.f80885a = gVar;
            this.f80886b = i;
            this.f80887c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$updateMultiLevelConfirmTitleBar$confirmView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$r */
    public static final class C31792r extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80890a;

        /* renamed from: b */
        final /* synthetic */ int f80891b;

        /* renamed from: c */
        final /* synthetic */ String f80892c;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            if (this.f80891b > 0) {
                BuildingView.m120600a(this.f80890a).mo115625f();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31792r(BuildingView gVar, int i, String str, String str2, int i2) {
            super(str2, i2);
            this.f80890a = gVar;
            this.f80891b = i;
            this.f80892c = str;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$s */
    public static final class View$OnClickListenerC31793s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80893a;

        /* renamed from: b */
        final /* synthetic */ IBuildingContract.SelectState f80894b;

        View$OnClickListenerC31793s(BuildingView gVar, IBuildingContract.SelectState selectState) {
            this.f80893a = gVar;
            this.f80894b = selectState;
        }

        public final void onClick(View view) {
            BuildingView.m120600a(this.f80893a).mo115604a(this.f80894b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingView$updateTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$t */
    public static final class C31794t extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80895a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            BuildingView.m120600a(this.f80895a).mo115624e();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31794t(BuildingView gVar, String str) {
            super(str);
            this.f80895a = gVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IBuildingContract.IBuildingViewAction m120600a(BuildingView gVar) {
        IBuildingContract.IBuildingViewAction bVar = gVar.f80848d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IBuildingContract.IBuildingViewData m120603b(BuildingView gVar) {
        IBuildingContract.IBuildingViewData dVar = gVar.f80847c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo115896a(Fragment fragment) {
        this.f80869y = false;
        this.f80853i.mo115679b(fragment);
    }

    /* renamed from: a */
    public final void mo115898a(String str) {
        if (NetworkUtils.m153070c(this.f80846b)) {
            mo115644v();
            mo115642s();
            IBuildingContract.IBuildingViewAction bVar = this.f80848d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
            }
            bVar.mo115611a(str);
            return;
        }
        LKUIToast.show(this.f80846b, C32634ae.m125182b(R.string.Calendar_Toast_Disconnected));
        m120605x();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewApi
    /* renamed from: b */
    public void mo115626b(boolean z) {
        String str;
        if (this.f80851g) {
            MultiLevelView multiLevelView = (MultiLevelView) this.f80845a.findViewById(R.id.multiLevelView);
            IBuildingContract.IBuildingViewData dVar = this.f80847c;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            ArrayList<ItemModel> m = dVar.mo115659m();
            IBuildingContract.IBuildingViewData dVar2 = this.f80847c;
            if (dVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            multiLevelView.mo115968a(m, dVar2.mo115660n());
            mo115903c();
            mo115902b();
        } else if (this.f80850f) {
            for (T t : ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).getBuildingPageView()) {
                if (z) {
                    IBuildingContract.IBuildingViewData dVar3 = this.f80847c;
                    if (dVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    ArrayList<ItemModel> l = dVar3.mo115658l();
                    IBuildingContract.IBuildingViewData dVar4 = this.f80847c;
                    if (dVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    t.mo116017a(l, dVar4.mo115651e());
                } else {
                    ArrayList<MeetingRoomBuildingModel> currentPageExpandBuildings = ((BuildingExpandRoomsView) this.f80845a.findViewById(R.id.buildingExpandRoomsView)).getCurrentPageExpandBuildings();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentPageExpandBuildings, 10));
                    Iterator<T> it = currentPageExpandBuildings.iterator();
                    while (it.hasNext()) {
                        CalendarBuilding d = it.next().mo115771d();
                        if (d == null || (str = d.getId()) == null) {
                            str = "";
                        }
                        arrayList.add(str);
                    }
                    ArrayList arrayList2 = arrayList;
                    IBuildingContract.IBuildingViewData dVar5 = this.f80847c;
                    if (dVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    ArrayList<ItemModel> l2 = dVar5.mo115658l();
                    IBuildingContract.IBuildingViewData dVar6 = this.f80847c;
                    if (dVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewData");
                    }
                    t.mo116017a(l2, dVar6.mo115645a(arrayList2, t.getPageIndex()));
                }
            }
            mo115903c();
            mo115902b();
        } else {
            UDSwitch uDSwitch = (UDSwitch) this.f80845a.findViewById(R.id.switch_view_usable_boardroom);
            IBuildingContract.IBuildingViewData dVar7 = this.f80847c;
            if (dVar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            uDSwitch.setCheckedIgnoreEvent(dVar7.mo115647a());
            IBuildingContract.IBuildingViewData dVar8 = this.f80847c;
            if (dVar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewData");
            }
            BuildingAdapter cVar = new BuildingAdapter(dVar8.mo115649c());
            this.f80855k = cVar;
            if (cVar != null) {
                cVar.mo115208a(this.f80862r);
            }
            BuildingAdapter cVar2 = this.f80855k;
            if (cVar2 != null) {
                cVar2.mo115210a(this.f80857m);
            }
            RecyclerView recyclerView = (RecyclerView) this.f80845a.findViewById(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "mRootView.recyclerView");
            recyclerView.setAdapter(this.f80855k);
            m120599E();
        }
    }

    /* renamed from: a */
    public final void mo115899a(boolean z) {
        UDSwitch uDSwitch = (UDSwitch) this.f80845a.findViewById(R.id.switch_view_usable_boardroom);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "mRootView.switch_view_usable_boardroom");
        uDSwitch.setChecked(z);
        IBuildingContract.IBuildingViewAction bVar = this.f80848d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        bVar.mo115615a(z);
        m120606y();
    }

    /* renamed from: a */
    public final boolean mo115901a(EventMeetingRoomData eventMeetingRoomData) {
        SchemaExtraData.ResourceCustomization a = MeetingRoomFormHelper.f82028a.mo117081a(eventMeetingRoomData.getCalendarResource());
        if (a == null) {
            return false;
        }
        String mCalendarId$calendar_impl_release = eventMeetingRoomData.getMCalendarId$calendar_impl_release();
        if (mCalendarId$calendar_impl_release == null) {
            mCalendarId$calendar_impl_release = "";
        }
        m120602a(mCalendarId$calendar_impl_release, a, eventMeetingRoomData);
        GeneralHitPoint.f83331a.mo118716C("choose_meeting_room");
        return true;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.g$m */
    public static final class C31787m implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ BuildingView f80882a;

        C31787m(BuildingView gVar) {
            this.f80882a = gVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f80882a.mo115899a(true);
            } else {
                this.f80882a.mo115899a(false);
            }
        }
    }

    public BuildingView(View view, BuildingPresenter.FragmentDependency cVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(cVar, "fragmentDependency");
        this.f80845a = view;
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
        this.f80846b = context;
        this.f80853i = cVar;
    }

    /* renamed from: a */
    private final void m120601a(Fragment fragment, boolean z) {
        this.f80869y = true;
        FrameLayout frameLayout = (FrameLayout) this.f80845a.findViewById(R.id.child_fragment_container);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "mRootView.child_fragment_container");
        frameLayout.setVisibility(0);
        if (z) {
            BuildingPresenter.FragmentDependency cVar = this.f80853i;
            FrameLayout frameLayout2 = (FrameLayout) this.f80845a.findViewById(R.id.child_fragment_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "mRootView.child_fragment_container");
            cVar.mo115674a(fragment, frameLayout2.getId());
            return;
        }
        this.f80853i.mo115673a(fragment);
    }

    /* renamed from: a */
    public void mo109795a(IBuildingContract.IBuildingViewData dVar, IBuildingContract.IBuildingViewAction bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(bVar, "viewAction");
        this.f80847c = dVar;
        this.f80848d = bVar;
    }

    /* renamed from: a */
    private final void m120602a(String str, SchemaExtraData.ResourceCustomization resourceCustomization, EventMeetingRoomData eventMeetingRoomData) {
        boolean z;
        C31791q qVar = new C31791q(this, eventMeetingRoomData);
        MeetingRoomFormFragment aVar = this.f80852h;
        if (aVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar != null) {
            aVar.mo117034a(str, resourceCustomization, qVar);
        } else {
            this.f80852h = new MeetingRoomFormFragment(str, resourceCustomization, qVar);
        }
        m120601a(this.f80852h, z);
    }
}
