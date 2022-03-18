package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.bytedance.lark.pb.calendar.v1.SearchMeetingRoomsForHierarchicalLevelsResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0003=>?B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001aH\u0002J\b\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0017H\u0002J\u001c\u0010$\u001a\u00020\u001a2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0&H\u0002J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u001aH\u0002J\u0010\u0010-\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0017H\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\u0006\u00100\u001a\u00020\u001aJ\u0006\u00101\u001a\u00020\u001aJ\u0006\u00102\u001a\u00020\u0017J \u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)H\u0002J\u001e\u00106\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\f2\u0006\u00107\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)J\u0006\u00108\u001a\u00020\u001aJ\u000e\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020\u001aH\u0002R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BasePresenterCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingModelApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewApi;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewAction;", "view", "model", "fragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewApi;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingModelApi;Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;)V", "TAG", "", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "mCursor", "", "mFragmentDependency", "mGetBuildingsRoomCounter", "mPreSearchKey", "mSearchRoomCounter", "mSearchTimes", "meetingRoomLevelsFG", "", "searchFilterFG", "changeBuildingMultipleSelectState", "", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "changeSelectAllState", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "changeToMultipleSelectMode", "create", "fetchAllMeetingRoomBuildings", "useStoreData", "getBuildingsMeetingRoom", "buildings", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "getEquipmentIds", "getViewAction", "loadAllBuildingsByRequest", "loadAllBuildingsByStore", "loadAllMultiLevelNodeListByRequest", "loadMeetingRoomBuildingDataFailure", "loadMeetingRoomBuildingDataSuccess", "loadMeetingRoomBuildingNoData", "onBackPressed", "searchMeetingRoom", "searchKey", "searchTimes", "searchMultiMeetingRoom", "cursor", "startChangeToMultipleSelectMode", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "updateMultipleResourceOnFilterChange", "BuildingViewAction", "Companion", "FragmentDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d */
public final class BuildingPresenter extends BasePresenterCalendar<IBuildingContract.IBuildingModelApi, IBuildingContract.IBuildingViewApi, IBuildingContract.IBuildingViewData, IBuildingContract.IBuildingViewAction> {

    /* renamed from: j */
    public static final Companion f80785j = new Companion(null);

    /* renamed from: a */
    public final String f80786a = "BuildingPresenter";

    /* renamed from: b */
    public final FragmentDependency f80787b;

    /* renamed from: c */
    public String f80788c;

    /* renamed from: d */
    public int f80789d;

    /* renamed from: e */
    public int f80790e;

    /* renamed from: f */
    public int f80791f;

    /* renamed from: g */
    public int f80792g;

    /* renamed from: h */
    public final boolean f80793h;

    /* renamed from: i */
    public final boolean f80794i;

    /* renamed from: k */
    private AbstractC32595g f80795k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J \u0010\u0014\u001a\u00020\u00032\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fH&J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$FragmentDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "getContext", "Landroid/content/Context;", "hideFragment", "onBackPressed", "chosenMeetingRoomList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/ArrayList;", "onDeletePressedWhenOneItem", "onMeetingRoomInfoClicked", "calendarId", "", "onSavePressed", "meetingRoom", "showFragment", "startBoardRoomFragment", "meetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$c */
    public interface FragmentDependency {
        /* renamed from: a */
        Context mo115672a();

        /* renamed from: a */
        void mo115673a(Fragment fragment);

        /* renamed from: a */
        void mo115674a(Fragment fragment, int i);

        /* renamed from: a */
        void mo115675a(MeetingRoomFragmentData meetingRoomFragmentData);

        /* renamed from: a */
        void mo115676a(String str);

        /* renamed from: a */
        void mo115677a(ArrayList<EventMeetingRoomData> arrayList);

        /* renamed from: b */
        void mo115678b();

        /* renamed from: b */
        void mo115679b(Fragment fragment);

        /* renamed from: b */
        void mo115680b(ArrayList<EventMeetingRoomData> arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$Companion;", "", "()V", "DEFAULT_CURSOR", "", "DEFAULT_TIMES", "SEARCH_BASE_COUNT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J&\u0010\u001b\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0018\u0010!\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J\u0012\u0010\"\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H\u0016J\u001e\u0010)\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\nH\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020(H\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u000209H\u0016J\u0018\u0010:\u001a\u00020\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$BuildingViewAction;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter;)V", "onBackPressed", "", "onBreadcrumbItemClicked", "node", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "onBuildingMultipleSelectClicked", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "onCancelMultipleSelectClicked", "onCapacityFilterData", "capacity", "", "expandBuilding", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onChangeMultipleSelectClicked", "onChangeSelectAllStateClicked", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "onClickMultipleResource", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "onClickedLoadingViewToTryAgain", "onConfirmMultipleSelectClicked", "onEquipmentsFilterData", "equipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onExpandOneBuildingMeetingRooms", "calendarBuilding", "onLoadMoreSearchData", "onMeetingFilterDataClear", "onMeetingRoomBuildingItemClicked", "onMeetingRoomDeleted", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "onMeetingRoomInfoClicked", "calendarId", "", "onMultiFilterDataChanged", "onMultiLevelArrowClicked", "multiLevelModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "onMultiLevelMultipleSelectClicked", "multiLevelNode", "onMultiMeetingRoomClicked", "multiRoomNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "onMultipleSelectExpandIconClicked", "clickBuildingModel", "onSearchKeyWordChanged", "searchText", "onSearchMeetingRoomItemClicked", "onToggleSwitchChanged", "state", "", "triggerLoadMeetingRooms", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$a */
    public final class BuildingViewAction implements IBuildingContract.IBuildingViewAction {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115611a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "searchText");
            if (!BuildingPresenter.this.f80793h || !TextUtils.isEmpty(StringsKt.trim((CharSequence) str).toString())) {
                BuildingPresenter.this.f80788c = str;
                BuildingPresenter.this.f80789d = 1;
                BuildingPresenter.this.f80790e = 0;
                MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k()));
                if (BuildingPresenter.this.f80794i) {
                    BuildingPresenter dVar = BuildingPresenter.this;
                    dVar.mo115857b(dVar.f80788c, BuildingPresenter.this.f80790e, meetingRoomFilter);
                    return;
                }
                BuildingPresenter dVar2 = BuildingPresenter.this;
                dVar2.mo115855a(dVar2.f80788c, BuildingPresenter.this.f80789d, meetingRoomFilter);
                return;
            }
            BuildingPresenter.this.f80788c = "";
            BuildingPresenter.this.f80792g++;
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115610a(CalendarBuilding calendarBuilding) {
            CalendarPerfMonitor.m124415a("key_view_rooms_in_building", "cal_perf_common", "scene_type", "view_rooms_in_building", "extra_name", "create_event_page");
            if (calendarBuilding != null) {
                BuildingPresenter.this.f80787b.mo115675a(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115563a(calendarBuilding));
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115615a(boolean z) {
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115577a(z);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115614a(List<EquipmentData> list, List<? extends CalendarBuilding> list2) {
            Intrinsics.checkParameterIsNotNull(list, "equipments");
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115584g().clear();
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115584g().addAll(list);
            if (((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115595u() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                BuildingPresenter.this.mo115865j();
            } else {
                m120516b(list2);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115612a(List<? extends CalendarBuilding> list) {
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115584g().clear();
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115565a(0);
            if (((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115595u() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                BuildingPresenter.this.mo115865j();
            } else {
                m120516b(list);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115613a(List<EquipmentData> list, int i) {
            Intrinsics.checkParameterIsNotNull(list, "equipments");
            LevelContent f = ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115582d().mo115840c().mo115830f();
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115584g().clear();
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115584g().addAll(list);
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115565a(i);
            if (!Intrinsics.areEqual(BuildingPresenter.this.f80788c, "")) {
                ((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s()).mo115642s();
                MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k()));
                BuildingPresenter dVar = BuildingPresenter.this;
                dVar.mo115857b(dVar.f80788c, BuildingPresenter.this.f80790e, meetingRoomFilter);
                return;
            }
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115572a(MultiLevelTree.f80780c.mo115842a(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115599y(), false));
            MultiLevelNode a = ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115564a(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115582d().mo115841d(), f);
            if (a != null) {
                ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115582d().mo115838a(a);
            }
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115598x();
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: e */
        public void mo115624e() {
            BuildingPresenter.this.mo115862g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: c */
        public void mo115622c() {
            BuildingPresenter.this.f80787b.mo115677a(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115588m());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: d */
        public void mo115623d() {
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115569a(IBuildingContract.ResourceSelectMode.SINGLE);
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: f */
        public void mo115625f() {
            BuildingPresenter.this.f80787b.mo115680b(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115596v());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115601a() {
            String str;
            Resources resources;
            Context a = BuildingPresenter.this.f80787b.mo115672a();
            if (!NetworkUtils.m153070c(a)) {
                if (a == null || (resources = a.getResources()) == null) {
                    str = null;
                } else {
                    str = resources.getString(R.string.Calendar_Toast_Disconnected);
                }
                LKUIToast.show(a, str);
            } else if (BuildingPresenter.this.f80794i) {
                BuildingPresenter.this.mo115863h();
            } else {
                BuildingPresenter.this.mo115861f();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115616b() {
            BuildingPresenter.this.f80789d++;
            MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k()));
            if (BuildingPresenter.this.f80794i) {
                BuildingPresenter dVar = BuildingPresenter.this;
                dVar.mo115857b(dVar.f80788c, BuildingPresenter.this.f80790e, meetingRoomFilter);
                return;
            }
            BuildingPresenter dVar2 = BuildingPresenter.this;
            dVar2.mo115855a(dVar2.f80788c, BuildingPresenter.this.f80789d, meetingRoomFilter);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public BuildingViewAction() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115604a(IBuildingContract.SelectState selectState) {
            Intrinsics.checkParameterIsNotNull(selectState, "selectState");
            BuildingPresenter.this.mo115853a(selectState);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115621b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            BuildingPresenter.this.f80787b.mo115676a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115603a(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoom");
            FragmentDependency cVar = BuildingPresenter.this.f80787b;
            ArrayList<EventMeetingRoomData> arrayList = new ArrayList<>();
            arrayList.add(eventMeetingRoomData);
            cVar.mo115680b(arrayList);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115618b(MeetingRoomBuildingModel hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "clickBuildingModel");
            hVar.mo115765a(!hVar.mo115772e());
            ((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s()).mo115626b(false);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115617b(EventMeetingRoomData eventMeetingRoomData) {
            Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoom");
            if (((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115594s()) {
                ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115568a(eventMeetingRoomData);
                IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
                return;
            }
            BuildingPresenter.this.f80787b.mo115678b();
        }

        /* renamed from: b */
        private final void m120516b(List<? extends CalendarBuilding> list) {
            boolean z;
            String str = BuildingPresenter.this.f80788c;
            if (str != null) {
                if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) str).toString())) {
                    MeetingRoomFilter meetingRoomFilter = new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k()));
                    BuildingPresenter dVar = BuildingPresenter.this;
                    dVar.mo115855a(dVar.f80788c, BuildingPresenter.this.f80789d, meetingRoomFilter);
                }
                List<? extends CalendarBuilding> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    BuildingPresenter.this.mo115856a(list, new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k())));
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115605a(MeetingRoomBuildingModel hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "buildingModel");
            BuildingPresenter.this.mo115854a(hVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115606a(MeetingRoomModel iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "meetingRoomModel");
            int i = C31773e.f80838a[iVar.mo115794j().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    iVar.mo115780a(IBuildingContract.SelectState.NONE);
                } else {
                    iVar.mo115780a(IBuildingContract.SelectState.ALL);
                }
                if (iVar.mo115794j().isSelected()) {
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115578b(iVar.mo115795k());
                } else {
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115580c(iVar.mo115795k());
                }
                ((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s()).mo115626b(false);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115619b(MultiLevelNode bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "node");
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115571a(bVar);
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115607a(MultiLevelModel jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "multiLevelModel");
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115571a(jVar.mo115797a());
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s(), false, 1, null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: b */
        public void mo115620b(CalendarBuilding calendarBuilding) {
            Intrinsics.checkParameterIsNotNull(calendarBuilding, "calendarBuilding");
            CalendarPerfMonitor.m124415a("key_view_rooms_in_building", "cal_perf_common", "scene_type", "view_rooms_in_building", "extra_name", "create_event_page");
            BuildingPresenter.this.mo115856a(CollectionsKt.listOf(calendarBuilding), new MeetingRoomFilter(Integer.valueOf(((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115585h()), CollectionsKt.toList(BuildingPresenter.this.mo115866k())));
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115608a(MultiLevelNode bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "multiLevelNode");
            int i = C31773e.f80839b[bVar.mo115823b().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    bVar.mo115821a(IBuildingContract.SelectState.ALL);
                } else {
                    bVar.mo115821a(IBuildingContract.SelectState.NONE);
                }
                if (bVar.mo115823b().isSelected()) {
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115566a(bVar.mo115828e(), true);
                } else {
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115566a(bVar.mo115827d(), false);
                }
                ((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s()).mo115635l();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115609a(MultiRoomNode eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "multiRoomNode");
            int i = C31773e.f80840c[eVar.mo115823b().ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    eVar.mo115821a(IBuildingContract.SelectState.ALL);
                } else {
                    eVar.mo115821a(IBuildingContract.SelectState.NONE);
                }
                if (eVar.mo115823b().isSelected()) {
                    eVar.mo115844d();
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115566a(1, true);
                } else {
                    eVar.mo115845e();
                    ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115566a(1, false);
                }
                ((IBuildingContract.IBuildingViewApi) BuildingPresenter.this.mo118651s()).mo115635l();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewAction
        /* renamed from: a */
        public void mo115602a(int i, List<? extends CalendarBuilding> list) {
            ((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115565a(i);
            if (((IBuildingContract.IBuildingModelApi) BuildingPresenter.this.mo118652t()).mo115595u() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                BuildingPresenter.this.mo115865j();
            } else {
                m120516b(list);
            }
        }
    }

    /* renamed from: a */
    public IBuildingContract.IBuildingViewAction mo109713b() {
        return new BuildingViewAction();
    }

    /* renamed from: l */
    public final boolean mo115867l() {
        return ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115634k();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.calendarmvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) mo118651s(), false, 1, null);
        m120496a(true);
    }

    /* renamed from: e */
    public final void mo115860e() {
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115633j();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115628e();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115629f();
    }

    /* renamed from: i */
    public final void mo115864i() {
        ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115562B();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115626b(false);
    }

    /* renamed from: j */
    public final void mo115865j() {
        ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115597w();
        ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115561A();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115626b(false);
    }

    /* renamed from: c */
    public final void mo115858c() {
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115632i();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115627d();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115630g();
        IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) mo118651s(), false, 1, null);
    }

    /* renamed from: d */
    public final void mo115859d() {
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115632i();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115627d();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115630g();
        IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) mo118651s(), false, 1, null);
    }

    /* renamed from: f */
    public final void mo115861f() {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f80786a, C32673y.m125376b(valueOf, "getBuilding", new String[0]));
        this.f80795k.mo119041b(mo118653u().wrapAndAddGetDataCallback(new C31767e(this, valueOf, "getBuilding")));
    }

    /* renamed from: h */
    public final void mo115863h() {
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115643u();
        C31769f fVar = new C31769f(this);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        long n = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n();
        long o = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o();
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(fVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118932a("0", n, o, false, (IGetDataCallback<Map<String, LevelRelatedInfo>>) wrapAndAddGetDataCallback);
    }

    /* renamed from: k */
    public final List<String> mo115866k() {
        ArrayList<EquipmentData> g = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115584g();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo116059a());
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo115862g() {
        boolean z;
        Map<String, CalendarResource> c = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115579c();
        if (c == null || c.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo115864i();
            return;
        }
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115639p();
        C31772i iVar = new C31772i(this);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        long n = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n();
        long o = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o();
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(iVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118923a(n, o, wrapAndAddGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$loadAllMultiLevelNodeListByRequest$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$f */
    public static final class C31769f implements IGetDataCallback<Map<String, ? extends LevelRelatedInfo>> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80807a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31769f(BuildingPresenter dVar) {
            this.f80807a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IBuildingContract.IBuildingViewApi) this.f80807a.mo118651s()).mo115629f();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, LevelRelatedInfo> map) {
            boolean z;
            if (map != null) {
                if (map == null || map.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    map = null;
                }
                if (map != null) {
                    ((IBuildingContract.IBuildingModelApi) this.f80807a.mo118652t()).mo115583d(map);
                }
            }
            ((IBuildingContract.IBuildingViewApi) this.f80807a.mo118651s()).mo115644v();
            IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) this.f80807a.mo118651s(), false, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$startChangeToMultipleSelectMode$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$i */
    public static final class C31772i implements IGetDataCallback<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80818a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31772i(BuildingPresenter dVar) {
            this.f80818a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IBuildingContract.IBuildingViewApi) this.f80818a.mo118651s()).mo115641r();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarResource> map) {
            boolean z;
            if (map != null) {
                if (map == null || map.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(true ^ z)) {
                    map = null;
                }
                if (map != null) {
                    ((IBuildingContract.IBuildingModelApi) this.f80818a.mo118652t()).mo115581c(map);
                }
            }
            ((IBuildingContract.IBuildingViewApi) this.f80818a.mo118651s()).mo115640q();
            this.f80818a.mo115864i();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$loadAllBuildingsByRequest$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "buildings", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$e */
    public static final class C31767e implements IGetDataCallback<Map<String, ? extends CalendarBuilding>> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80803a;

        /* renamed from: b */
        final /* synthetic */ String f80804b;

        /* renamed from: c */
        final /* synthetic */ String f80805c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f80803a.f80786a, C32673y.m125370a(this.f80804b, this.f80805c, errorResult));
            this.f80803a.mo115860e();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarBuilding> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = String.valueOf(map.size()) + "";
            }
            Log.m165389i(this.f80803a.f80786a, C32673y.m125373a(this.f80804b, this.f80805c, "buildings_size", str));
            if (map == null || !(!map.isEmpty())) {
                ((IBuildingContract.IBuildingModelApi) this.f80803a.mo118652t()).mo115586j();
                this.f80803a.mo115858c();
                return;
            }
            ArrayList<CalendarBuilding> arrayList = new ArrayList<>(map.values());
            CollectionsKt.sortWith(arrayList, C31768a.f80806a);
            ((IBuildingContract.IBuildingModelApi) this.f80803a.mo118652t()).mo115575a(arrayList);
            this.f80803a.mo115859d();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$e$a */
        public static final class C31768a<T> implements Comparator<CalendarBuilding> {

            /* renamed from: a */
            public static final C31768a f80806a = new C31768a();

            C31768a() {
            }

            /* renamed from: a */
            public final int compare(CalendarBuilding calendarBuilding, CalendarBuilding calendarBuilding2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarBuilding2, "o2");
                int weight = calendarBuilding2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarBuilding, "o1");
                return weight - calendarBuilding.getWeight();
            }
        }

        C31767e(BuildingPresenter dVar, String str, String str2) {
            this.f80803a = dVar;
            this.f80804b = str;
            this.f80805c = str2;
        }
    }

    /* renamed from: a */
    public final void mo115852a(BuildingFragmentData buildingFragmentData) {
        Intrinsics.checkParameterIsNotNull(buildingFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115567a(buildingFragmentData);
        IBuildingContract.IBuildingViewApi.C31739a.m120200a((IBuildingContract.IBuildingViewApi) mo118651s(), false, 1, null);
    }

    /* renamed from: a */
    public final void mo115854a(MeetingRoomBuildingModel hVar) {
        int i = C31774f.f80842b[hVar.mo115770c().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                hVar.mo115764a(IBuildingContract.SelectState.ALL);
                hVar.mo115765a(true);
            } else {
                hVar.mo115764a(IBuildingContract.SelectState.NONE);
            }
        }
        ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115570a(hVar);
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115626b(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$getBuildingsMeetingRoom$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resources", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$d */
    public static final class C31765d implements IGetDataCallback<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80797a;

        /* renamed from: b */
        final /* synthetic */ String f80798b;

        /* renamed from: c */
        final /* synthetic */ String f80799c;

        /* renamed from: d */
        final /* synthetic */ int f80800d;

        /* renamed from: e */
        final /* synthetic */ List f80801e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f80797a.f80786a, C32673y.m125370a(this.f80798b, this.f80799c, errorResult));
            if (this.f80800d < this.f80797a.f80791f) {
                Log.m165389i(this.f80797a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            for (CalendarBuilding calendarBuilding : this.f80801e) {
                ((IBuildingContract.IBuildingModelApi) this.f80797a.mo118652t()).mo115573a(calendarBuilding, (ArrayList<CalendarResource>) null);
            }
            ((IBuildingContract.IBuildingViewApi) this.f80797a.mo118651s()).mo115638o();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarResource> map) {
            Integer num;
            String str = this.f80797a.f80786a;
            String str2 = this.f80798b;
            String str3 = this.f80799c;
            String[] strArr = new String[2];
            strArr[0] = "resources_size";
            if (map != null) {
                num = Integer.valueOf(map.size());
            } else {
                num = null;
            }
            strArr[1] = String.valueOf(num);
            Log.m165389i(str, C32673y.m125373a(str2, str3, strArr));
            if (this.f80800d < this.f80797a.f80791f) {
                Log.m165389i(this.f80797a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            HashMap hashMap = new HashMap(this.f80801e.size());
            for (CalendarBuilding calendarBuilding : this.f80801e) {
                String id = calendarBuilding.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "it.id");
                hashMap.put(id, new ArrayList());
            }
            if (map != null) {
                for (Map.Entry<String, ? extends CalendarResource> entry : map.entrySet()) {
                    String buildingId = ((CalendarResource) entry.getValue()).getBuildingId();
                    ArrayList arrayList = (ArrayList) hashMap.get(buildingId);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        Intrinsics.checkExpressionValueIsNotNull(buildingId, "buildingId");
                        hashMap.put(buildingId, arrayList);
                    }
                    Intrinsics.checkExpressionValueIsNotNull(arrayList, "buildingResourcesMap[bui…oms\n                    }");
                    arrayList.add(entry.getValue());
                }
            }
            for (CalendarBuilding calendarBuilding2 : this.f80801e) {
                ArrayList<CalendarResource> arrayList2 = (ArrayList) hashMap.get(calendarBuilding2.getId());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                Intrinsics.checkExpressionValueIsNotNull(arrayList2, "buildingResourcesMap[building.id] ?: ArrayList()");
                CollectionsKt.sortWith(arrayList2, C31766a.f80802a);
                ((IBuildingContract.IBuildingModelApi) this.f80797a.mo118652t()).mo115573a(calendarBuilding2, arrayList2);
            }
            ((IBuildingContract.IBuildingViewApi) this.f80797a.mo118651s()).mo115638o();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$d$a */
        public static final class C31766a<T> implements Comparator<CalendarResource> {

            /* renamed from: a */
            public static final C31766a f80802a = new C31766a();

            C31766a() {
            }

            /* renamed from: a */
            public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
                int weight = calendarResource2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
                return weight - calendarResource.getWeight();
            }
        }

        C31765d(BuildingPresenter dVar, String str, String str2, int i, List list) {
            this.f80797a = dVar;
            this.f80798b = str;
            this.f80799c = str2;
            this.f80800d = i;
            this.f80801e = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$searchMeetingRoom$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SearchMeetingRoom;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$g */
    public static final class C31770g implements IGetDataCallback<SearchMeetingRoom> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80808a;

        /* renamed from: b */
        final /* synthetic */ String f80809b;

        /* renamed from: c */
        final /* synthetic */ String f80810c;

        /* renamed from: d */
        final /* synthetic */ int f80811d;

        /* renamed from: e */
        final /* synthetic */ int f80812e;

        /* renamed from: a */
        public void onSuccess(SearchMeetingRoom searchMeetingRoom) {
            String str;
            if (searchMeetingRoom == null || searchMeetingRoom.getBuildings() == null) {
                str = "null";
            } else {
                str = "" + searchMeetingRoom.getBuildings().size();
            }
            Log.m165389i(this.f80808a.f80786a, C32673y.m125373a(this.f80809b, this.f80810c, "rooms_size", str));
            if (this.f80811d < this.f80808a.f80792g) {
                Log.m165389i(this.f80808a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            ((IBuildingContract.IBuildingModelApi) this.f80808a.mo118652t()).mo115574a(searchMeetingRoom);
            if (this.f80812e == 1) {
                ((IBuildingContract.IBuildingViewApi) this.f80808a.mo118651s()).mo115636m();
            } else {
                ((IBuildingContract.IBuildingViewApi) this.f80808a.mo118651s()).mo115637n();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f80808a.f80786a, C32673y.m125370a(this.f80809b, this.f80810c, errorResult));
            if (this.f80811d < this.f80808a.f80792g) {
                Log.m165389i(this.f80808a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            ((IBuildingContract.IBuildingModelApi) this.f80808a.mo118652t()).mo115587k();
            ((IBuildingContract.IBuildingViewApi) this.f80808a.mo118651s()).mo115636m();
        }

        C31770g(BuildingPresenter dVar, String str, String str2, int i, int i2) {
            this.f80808a = dVar;
            this.f80809b = str;
            this.f80810c = str2;
            this.f80811d = i;
            this.f80812e = i2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingPresenter$searchMultiMeetingRoom$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/calendar/v1/SearchMeetingRoomsForHierarchicalLevelsResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.d$h */
    public static final class C31771h implements IGetDataCallback<SearchMeetingRoomsForHierarchicalLevelsResponse> {

        /* renamed from: a */
        final /* synthetic */ BuildingPresenter f80813a;

        /* renamed from: b */
        final /* synthetic */ int f80814b;

        /* renamed from: c */
        final /* synthetic */ int f80815c;

        /* renamed from: d */
        final /* synthetic */ String f80816d;

        /* renamed from: e */
        final /* synthetic */ String f80817e;

        /* renamed from: a */
        public void onSuccess(SearchMeetingRoomsForHierarchicalLevelsResponse searchMeetingRoomsForHierarchicalLevelsResponse) {
            if (this.f80814b < this.f80813a.f80792g) {
                Log.m165389i(this.f80813a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            if (searchMeetingRoomsForHierarchicalLevelsResponse != null) {
                List<com.bytedance.lark.pb.calendar.v1.CalendarResource> list = searchMeetingRoomsForHierarchicalLevelsResponse.resources;
                Intrinsics.checkExpressionValueIsNotNull(list, "it.resources");
                Boolean bool = searchMeetingRoomsForHierarchicalLevelsResponse.has_more;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.has_more");
                ((IBuildingContract.IBuildingModelApi) this.f80813a.mo118652t()).mo115576a(list, bool.booleanValue(), this.f80815c);
                BuildingPresenter dVar = this.f80813a;
                Integer num = searchMeetingRoomsForHierarchicalLevelsResponse.cursor;
                Intrinsics.checkExpressionValueIsNotNull(num, "it.cursor");
                dVar.f80790e = num.intValue();
            }
            ((IBuildingContract.IBuildingViewApi) this.f80813a.mo118651s()).mo115636m();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f80813a.f80786a, C32673y.m125370a(this.f80816d, this.f80817e, errorResult));
            if (this.f80814b < this.f80813a.f80792g) {
                Log.m165389i(this.f80813a.f80786a, C32673y.m125378d("old request back"));
                return;
            }
            ((IBuildingContract.IBuildingModelApi) this.f80813a.mo118652t()).mo115587k();
            ((IBuildingContract.IBuildingViewApi) this.f80813a.mo118651s()).mo115636m();
        }

        C31771h(BuildingPresenter dVar, int i, int i2, String str, String str2) {
            this.f80813a = dVar;
            this.f80814b = i;
            this.f80815c = i2;
            this.f80816d = str;
            this.f80817e = str2;
        }
    }

    /* renamed from: a */
    private final void m120496a(boolean z) {
        String str;
        Resources resources;
        Context a = this.f80787b.mo115672a();
        if (NetworkUtils.m153070c(a)) {
            ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115627d();
            ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115630g();
            if (this.f80794i) {
                mo115863h();
                return;
            }
            ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115631h();
            m120497b(z);
            return;
        }
        if (a == null || (resources = a.getResources()) == null) {
            str = null;
        } else {
            str = resources.getString(R.string.Calendar_Toast_Disconnected);
        }
        LKUIToast.show(a, str);
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115628e();
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115629f();
    }

    /* renamed from: b */
    private final void m120497b(boolean z) {
        if (z) {
            int i = C31774f.f80841a[((IBuildingContract.IBuildingModelApi) mo118652t()).mo115592q().ordinal()];
            if (i == 1 || i == 2) {
                mo115861f();
            } else if (i == 3) {
                ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115575a(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115593r());
                mo115859d();
            } else if (i == 4) {
                ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115586j();
                mo115858c();
            }
        } else {
            mo115861f();
        }
    }

    /* renamed from: a */
    public final void mo115853a(IBuildingContract.SelectState selectState) {
        if (this.f80794i) {
            int i = C31774f.f80843c[selectState.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115566a(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115582d().mo115840c().mo115828e(), true);
                } else {
                    ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115566a(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115582d().mo115840c().mo115827d(), false);
                }
            }
        } else {
            int i2 = C31774f.f80844d[selectState.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115600z();
                } else {
                    ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115561A();
                }
            }
        }
        ((IBuildingContract.IBuildingViewApi) mo118651s()).mo115626b(false);
    }

    /* renamed from: a */
    public final void mo115856a(List<? extends CalendarBuilding> list, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(list, "buildings");
        Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
        int i = this.f80791f + 1;
        this.f80791f = i;
        ArrayList arrayList = new ArrayList();
        for (CalendarBuilding calendarBuilding : list) {
            String id = calendarBuilding.getId();
            if (id != null) {
                arrayList.add(id);
            }
        }
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f80786a, C32673y.m125376b(valueOf, "getOneBuildingMeetingRooms", "buildingId.size", String.valueOf(arrayList.size())));
        this.f80795k.mo119033a(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n(), ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o(), CollectionsKt.toList(arrayList), ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115591p(), false, meetingRoomFilter, mo118653u().wrapAndAddGetDataCallback(new C31765d(this, valueOf, "getOneBuildingMeetingRooms", i, list)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuildingPresenter(IBuildingContract.IBuildingViewApi cVar, IBuildingContract.IBuildingModelApi aVar, FragmentDependency cVar2) {
        super(cVar, aVar);
        Intrinsics.checkParameterIsNotNull(cVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar2, "fragmentDependency");
        this.f80787b = cVar2;
        this.f80788c = "";
        this.f80789d = 1;
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f80795k = a;
        this.f80793h = C30022a.f74883b.mo112706n();
        this.f80794i = C30022a.f74883b.mo112707o();
    }

    /* renamed from: b */
    public final void mo115857b(String str, int i, MeetingRoomFilter meetingRoomFilter) {
        Intrinsics.checkParameterIsNotNull(str, "searchKey");
        Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
        int i2 = this.f80792g + 1;
        this.f80792g = i2;
        String valueOf = String.valueOf(new Date().getTime());
        C31771h hVar = new C31771h(this, i2, i, valueOf, "searchMeetingRooms");
        Log.m165389i(this.f80786a, C32673y.m125376b(valueOf, "searchMeetingRooms", "start_time", String.valueOf(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n()), "end_time", String.valueOf(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o()), "keywords", str, "count", String.valueOf(i * 50), "rrule", ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115591p()));
        UIGetDataCallback wrapAndAddGetDataCallback = mo118653u().wrapAndAddGetDataCallback(hVar);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        long n = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n();
        long o = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o();
        String p = ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115591p();
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118924a(n, o, str, 50, p, false, i, meetingRoomFilter, wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    public final void mo115855a(String str, int i, MeetingRoomFilter meetingRoomFilter) {
        int i2 = this.f80792g + 1;
        this.f80792g = i2;
        String valueOf = String.valueOf(new Date().getTime());
        C31770g gVar = new C31770g(this, valueOf, "searchMeetingRooms", i2, i);
        int i3 = i * 50;
        Log.m165389i(this.f80786a, C32673y.m125376b(valueOf, "searchMeetingRooms", "start_time", String.valueOf(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n()), "end_time", String.valueOf(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o()), "keywords", str, "count", String.valueOf(i3), "rrule", ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115591p()));
        this.f80795k.mo119031a(((IBuildingContract.IBuildingModelApi) mo118652t()).mo115589n(), ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115590o(), str, i3, ((IBuildingContract.IBuildingModelApi) mo118652t()).mo115591p(), false, meetingRoomFilter, mo118653u().wrapAndAddGetDataCallback(gVar));
    }
}
