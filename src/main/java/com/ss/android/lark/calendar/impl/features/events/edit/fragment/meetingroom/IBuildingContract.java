package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract;", "", "()V", "IBuildingModelApi", "IBuildingViewAction", "IBuildingViewApi", "IBuildingViewData", "ResourceSelectMode", "SelectState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IBuildingContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "", "(Ljava/lang/String;I)V", "SINGLE", "MULTIPLE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ResourceSelectMode {
        SINGLE,
        MULTIPLE
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010#\u001a\u00020$H&J\u001a\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H&J \u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0012j\b\u0012\u0004\u0012\u00020\u0006`\u00142\u0006\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020.H&J\u0018\u0010/\u001a\u0012\u0012\u0004\u0012\u0002000\u0012j\b\u0012\u0004\u0012\u000200`\u0014H&J\u0018\u00101\u001a\u0012\u0012\u0004\u0012\u0002000\u0012j\b\u0012\u0004\u0012\u000200`\u0014H&J\b\u00102\u001a\u000203H&J\u0014\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u0004H&J\b\u00105\u001a\u00020.H&J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H&J\u0018\u0010:\u001a\u0012\u0012\u0004\u0012\u0002090\u0012j\b\u0012\u0004\u0012\u000209`\u0014H&J\b\u0010;\u001a\u00020<H&J\b\u0010=\u001a\u00020\u0005H&J\b\u0010>\u001a\u00020?H&J\b\u0010@\u001a\u00020.H&J\b\u0010A\u001a\u000203H&J\b\u0010B\u001a\u00020$H&J\b\u0010C\u001a\u00020$H&J\b\u0010D\u001a\u00020$H&J\u0010\u0010E\u001a\u00020$2\u0006\u0010F\u001a\u000200H&J\u001c\u0010G\u001a\u00020$2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001c\u0010I\u001a\u00020$2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u0004H&J\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020MH&J,\u0010N\u001a\u00020$2\u0006\u00108\u001a\u0002092\u001a\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0014H&J\u0010\u0010P\u001a\u00020$2\u0006\u0010+\u001a\u00020,H&J\b\u0010Q\u001a\u00020$H&J\u0010\u0010R\u001a\u00020$2\u0006\u0010S\u001a\u000200H&J \u0010T\u001a\u00020$2\u0016\u0010U\u001a\u0012\u0012\u0004\u0012\u0002090\u0012j\b\u0012\u0004\u0012\u000209`\u0014H&J\b\u0010V\u001a\u00020$H&J\u0010\u0010W\u001a\u00020$2\u0006\u0010'\u001a\u00020&H&J&\u0010X\u001a\u00020$2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z2\u0006\u0010\\\u001a\u00020.2\u0006\u0010]\u001a\u00020\fH&J\u0018\u0010^\u001a\u00020$2\u0006\u0010_\u001a\u00020\f2\u0006\u0010`\u001a\u00020.H&J\b\u0010a\u001a\u00020$H&J\u0012\u0010b\u001a\u00020$2\b\u0010c\u001a\u0004\u0018\u00010dH&J\u0010\u0010e\u001a\u00020$2\u0006\u0010f\u001a\u00020?H&J\u0010\u0010g\u001a\u00020$2\u0006\u0010F\u001a\u000200H&J\u0010\u0010h\u001a\u00020$2\u0006\u0010i\u001a\u00020.H&R$\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u001aX¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020 0\u0004X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n¨\u0006j"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "buildingResourceMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getBuildingResourceMap", "()Ljava/util/Map;", "setBuildingResourceMap", "(Ljava/util/Map;)V", "mCapacity", "", "getMCapacity", "()I", "setMCapacity", "(I)V", "mEquipments", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "Lkotlin/collections/ArrayList;", "getMEquipments", "()Ljava/util/ArrayList;", "setMEquipments", "(Ljava/util/ArrayList;)V", "multiLevelTree", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "getMultiLevelTree", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "setMultiLevelTree", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;)V", "originalMultiLevelAndMeetRoomMap", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "getOriginalMultiLevelAndMeetRoomMap", "setOriginalMultiLevelAndMeetRoomMap", "changeToMultipleMode", "", "findCurrentNodeByLevelContent", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "node", "levelContent", "Lcom/bytedance/lark/pb/calendar/v1/LevelContent;", "getBuildingResource", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "getCanAddMultiItems", "", "getChosenMeetingRoomList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "getCurMultipleSelectResource", "getEndTime", "", "getFilterData", "getIsShowUsableContainer", "getMeetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getPreRequestBuildings", "getPreRequestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "getRRule", "getSelectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getShowUsableBoardroom", "getStartTime", "resetMultiSelectRoomSize", "selectAllResource", "unSelectAllResource", "unSelectResource", "eventMeetingRoomData", "updateAllBuildingSource", "allResource", "updateAllLevelAndMeetingRoomData", "allLevelInfo", "updateBuildingFragmentData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "updateBuildingMeetingRoomData", "buildingResources", "updateBuildingSelectData", "updateCurrentBuildingSource", "updateDataAfterRoomDelete", "meetingRoom", "updateLoadBuildingData", "allCalendarBuildings", "updateLoadBuildingNoData", "updateMultiLevelTreeCurrentNode", "updateMultiSearchItem", "resource", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "hasMore", "cursor", "updateMultiSelectRoomSize", "size", "isAdd", "updateNoSearchData", "updateSearchResult", "searchMeetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SearchMeetingRoom;", "updateSelectMode", "selectMode", "updateSelectResource", "updateShowUsableBoardroom", "state", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$a */
    public interface IBuildingModelApi extends IModelCalendar<IBuildingViewData> {
        /* renamed from: A */
        void mo115561A();

        /* renamed from: B */
        void mo115562B();

        /* renamed from: a */
        MeetingRoomFragmentData mo115563a(CalendarBuilding calendarBuilding);

        /* renamed from: a */
        MultiLevelNode mo115564a(MultiLevelNode bVar, LevelContent levelContent);

        /* renamed from: a */
        void mo115565a(int i);

        /* renamed from: a */
        void mo115566a(int i, boolean z);

        /* renamed from: a */
        void mo115567a(BuildingFragmentData buildingFragmentData);

        /* renamed from: a */
        void mo115568a(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: a */
        void mo115569a(ResourceSelectMode resourceSelectMode);

        /* renamed from: a */
        void mo115570a(MeetingRoomBuildingModel hVar);

        /* renamed from: a */
        void mo115571a(MultiLevelNode bVar);

        /* renamed from: a */
        void mo115572a(MultiLevelTree dVar);

        /* renamed from: a */
        void mo115573a(CalendarBuilding calendarBuilding, ArrayList<CalendarResource> arrayList);

        /* renamed from: a */
        void mo115574a(SearchMeetingRoom searchMeetingRoom);

        /* renamed from: a */
        void mo115575a(ArrayList<CalendarBuilding> arrayList);

        /* renamed from: a */
        void mo115576a(List<com.bytedance.lark.pb.calendar.v1.CalendarResource> list, boolean z, int i);

        /* renamed from: a */
        void mo115577a(boolean z);

        /* renamed from: b */
        void mo115578b(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: c */
        Map<String, CalendarResource> mo115579c();

        /* renamed from: c */
        void mo115580c(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: c */
        void mo115581c(Map<String, ? extends CalendarResource> map);

        /* renamed from: d */
        MultiLevelTree mo115582d();

        /* renamed from: d */
        void mo115583d(Map<String, LevelRelatedInfo> map);

        /* renamed from: g */
        ArrayList<EquipmentData> mo115584g();

        /* renamed from: h */
        int mo115585h();

        /* renamed from: j */
        void mo115586j();

        /* renamed from: k */
        void mo115587k();

        /* renamed from: m */
        ArrayList<EventMeetingRoomData> mo115588m();

        /* renamed from: n */
        long mo115589n();

        /* renamed from: o */
        long mo115590o();

        /* renamed from: p */
        String mo115591p();

        /* renamed from: q */
        IEditContract.RequestBuildingResultType mo115592q();

        /* renamed from: r */
        ArrayList<CalendarBuilding> mo115593r();

        /* renamed from: s */
        boolean mo115594s();

        /* renamed from: u */
        ResourceSelectMode mo115595u();

        /* renamed from: v */
        ArrayList<EventMeetingRoomData> mo115596v();

        /* renamed from: w */
        void mo115597w();

        /* renamed from: x */
        void mo115598x();

        /* renamed from: y */
        Map<String, LevelRelatedInfo> mo115599y();

        /* renamed from: z */
        void mo115600z();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J&\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0010H&J\b\u0010\u001e\u001a\u00020\u0003H&J\u0018\u0010\u001f\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH&J\u0012\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\u001e\u0010(\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f2\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020+H&J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0006H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u000200H&J\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\tH&J\u0010\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020'H&J\u0010\u00105\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H&J\u0010\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u000208H&¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onBackPressed", "", "onBreadcrumbItemClicked", "node", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "onBuildingMultipleSelectClicked", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "onCancelMultipleSelectClicked", "onCapacityFilterData", "capacity", "", "expandBuilding", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onChangeMultipleSelectClicked", "onChangeSelectAllStateClicked", "selectState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "onClickMultipleResource", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomModel;", "onClickedLoadingViewToTryAgain", "onConfirmMultipleSelectClicked", "onEquipmentsFilterData", "equipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onExpandOneBuildingMeetingRooms", "onLoadMoreSearchData", "onMeetingFilterDataClear", "onMeetingRoomBuildingItemClicked", "calendarBuilding", "onMeetingRoomDeleted", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "onMeetingRoomInfoClicked", "calendarId", "", "onMultiFilterDataChanged", "onMultiLevelArrowClicked", "multiLevelModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MultiLevelModel;", "onMultiLevelMultipleSelectClicked", "multiLevelNode", "onMultiMeetingRoomClicked", "multiRoomNode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "onMultipleSelectExpandIconClicked", "clickBuildingModel", "onSearchKeyWordChanged", "searchText", "onSearchMeetingRoomItemClicked", "onToggleSwitchChanged", C63954b.f161494a, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$b */
    public interface IBuildingViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo115601a();

        /* renamed from: a */
        void mo115602a(int i, List<? extends CalendarBuilding> list);

        /* renamed from: a */
        void mo115603a(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: a */
        void mo115604a(SelectState selectState);

        /* renamed from: a */
        void mo115605a(MeetingRoomBuildingModel hVar);

        /* renamed from: a */
        void mo115606a(MeetingRoomModel iVar);

        /* renamed from: a */
        void mo115607a(MultiLevelModel jVar);

        /* renamed from: a */
        void mo115608a(MultiLevelNode bVar);

        /* renamed from: a */
        void mo115609a(MultiRoomNode eVar);

        /* renamed from: a */
        void mo115610a(CalendarBuilding calendarBuilding);

        /* renamed from: a */
        void mo115611a(String str);

        /* renamed from: a */
        void mo115612a(List<? extends CalendarBuilding> list);

        /* renamed from: a */
        void mo115613a(List<EquipmentData> list, int i);

        /* renamed from: a */
        void mo115614a(List<EquipmentData> list, List<? extends CalendarBuilding> list2);

        /* renamed from: a */
        void mo115615a(boolean z);

        /* renamed from: b */
        void mo115616b();

        /* renamed from: b */
        void mo115617b(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: b */
        void mo115618b(MeetingRoomBuildingModel hVar);

        /* renamed from: b */
        void mo115619b(MultiLevelNode bVar);

        /* renamed from: b */
        void mo115620b(CalendarBuilding calendarBuilding);

        /* renamed from: b */
        void mo115621b(String str);

        /* renamed from: c */
        void mo115622c();

        /* renamed from: d */
        void mo115623d();

        /* renamed from: e */
        void mo115624e();

        /* renamed from: f */
        void mo115625f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0003j\b\u0012\u0004\u0012\u00020\f`\u0005H&J\u0018\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&JH\u0010\u000e\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000fj\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005`\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H&J\u0018\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0013\u001a\u00020\fH&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\nH&J\b\u0010\u0017\u001a\u00020\nH&J\u0018\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0003j\b\u0012\u0004\u0012\u00020\u0019`\u0005H&J\u0018\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0018\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u001c\u001a\u00020\nH&J\u0018\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u0018\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u001f\u001a\u00020 H&J\u001c\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020#H&J\b\u0010%\u001a\u00020#H&J\b\u0010&\u001a\u00020#H&J\b\u0010'\u001a\u00020#H&¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAllItemModels", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/ArrayList;", "expandBuildingIds", "", "", "pageIndex", "", "getBreadcrumbItems", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "getBuildingItemModels", "getBuildingsMeetingRooms", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "buildings", "getCurrentLevelAndRoomsItem", "getCurrentMultiLevelNode", "getCurrentSelectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getCurrentSelectResourceCount", "getFilterCapacity", "getFilterEquipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getItemModels", "getMultiSearchItem", "getMultiSelectedRoomSize", "getSearchFreeItemModels", "getSearchItemModels", "getSelectAllState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getSelectedRooms", "isAllResourceSelected", "", "isEditEvent", "isShowMultiSelect", "isShowUsableBoardroom", "isShowUsableContainer", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$d */
    public interface IBuildingViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        ArrayList<ItemModel> mo115645a(List<String> list, int i);

        /* renamed from: a */
        HashMap<ItemModel, ArrayList<ItemModel>> mo115646a(List<? extends ItemModel> list);

        /* renamed from: a */
        boolean mo115647a();

        /* renamed from: b */
        boolean mo115648b();

        /* renamed from: c */
        ArrayList<ItemModel> mo115649c();

        /* renamed from: d */
        boolean mo115650d();

        /* renamed from: e */
        ArrayList<ItemModel> mo115651e();

        /* renamed from: f */
        ArrayList<ItemModel> mo115652f();

        /* renamed from: g */
        ArrayList<ItemModel> mo115653g();

        /* renamed from: h */
        ResourceSelectMode mo115654h();

        /* renamed from: i */
        SelectState mo115655i();

        /* renamed from: j */
        int mo115656j();

        /* renamed from: k */
        boolean mo115657k();

        /* renamed from: l */
        ArrayList<ItemModel> mo115658l();

        /* renamed from: m */
        ArrayList<ItemModel> mo115659m();

        /* renamed from: n */
        ArrayList<MultiLevelNode> mo115660n();

        /* renamed from: o */
        int mo115661o();

        /* renamed from: p */
        MultiLevelNode mo115662p();

        /* renamed from: q */
        ArrayList<EquipmentData> mo115663q();

        /* renamed from: r */
        int mo115664r();

        /* renamed from: s */
        ArrayList<ItemModel> mo115665s();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "", "(Ljava/lang/String;I)V", "isSelected", "", "NOT_OPTIONAL", "NONE", "SELF", "ALL", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SelectState {
        NOT_OPTIONAL,
        NONE,
        SELF,
        ALL;

        public final boolean isSelected() {
            SelectState selectState = this;
            if (selectState == SELF || selectState == ALL) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u0012\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0005H&J\b\u0010\u0017\u001a\u00020\u0005H&J\b\u0010\u0018\u001a\u00020\u0005H&J\b\u0010\u0019\u001a\u00020\u0005H&J\b\u0010\u001a\u001a\u00020\u0005H&J\b\u0010\u001b\u001a\u00020\u0005H&¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewAction;", "dismissLoadingAnimation", "", "dismissLoadingPanel", "dismissLoadingView", "hideChangeToMultipleLoading", "hideSearchBar", "hideSearchLoading", "refreshBuildingView", "forcePackUpBuilding", "", "refreshCurrentLevelState", "refreshExpandMeetingRooms", "refreshSearchView", "refreshSearchViewAfterDataChanged", "refreshViewByBackPressed", "showChangeToMultipleLoading", "showChangeToMultipleLoadingErr", "showErrorTipPanel", "showLoadFailureView", "showLoadingAnimation", "showMultiLevelLoading", "showSearchBar", "showSearchLoading", "updateTitleBar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$c */
    public interface IBuildingViewApi extends IViewCalender<IBuildingViewData, IBuildingViewAction> {
        /* renamed from: b */
        void mo115626b(boolean z);

        /* renamed from: d */
        void mo115627d();

        /* renamed from: e */
        void mo115628e();

        /* renamed from: f */
        void mo115629f();

        /* renamed from: g */
        void mo115630g();

        /* renamed from: h */
        void mo115631h();

        /* renamed from: i */
        void mo115632i();

        /* renamed from: j */
        void mo115633j();

        /* renamed from: k */
        boolean mo115634k();

        /* renamed from: l */
        void mo115635l();

        /* renamed from: m */
        void mo115636m();

        /* renamed from: n */
        void mo115637n();

        /* renamed from: o */
        void mo115638o();

        /* renamed from: p */
        void mo115639p();

        /* renamed from: q */
        void mo115640q();

        /* renamed from: r */
        void mo115641r();

        /* renamed from: s */
        void mo115642s();

        /* renamed from: u */
        void mo115643u();

        /* renamed from: v */
        void mo115644v();

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract$c$a */
        public static final class C31739a {
            /* renamed from: a */
            public static /* synthetic */ void m120200a(IBuildingViewApi cVar, boolean z, int i, Object obj) {
                if (obj == null) {
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    cVar.mo115626b(z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshBuildingView");
            }
        }
    }
}
