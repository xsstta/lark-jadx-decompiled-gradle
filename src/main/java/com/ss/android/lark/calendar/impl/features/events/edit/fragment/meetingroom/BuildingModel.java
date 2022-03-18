package com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom;

import com.bytedance.lark.pb.calendar.v1.LevelContent;
import com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomEquipment;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.IEditContract;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ChosenMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.DividerModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.IBuildingData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.ItemModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadErrorDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiLevelModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MultiMeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.NoneDataModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.TypeTitleModel;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiLevelTree;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.multiLevel.MultiRoomNode;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.MeetingRoomApprovalHelper;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSchemaCollection;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.lark.calendar.impl.rustadapter.p1573a.C32514b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001a\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010M\u001a\u00020NH\u0016J\u001a\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020SH\u0016J \u0010T\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0017j\b\u0012\u0004\u0012\u00020\n`\u00192\u0006\u0010U\u001a\u00020VH\u0016J4\u0010W\u001a\u0016\u0012\u0004\u0012\u000201\u0018\u00010\u0017j\n\u0012\u0004\u0012\u000201\u0018\u0001`\u00192\u0006\u0010U\u001a\u00020V2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010YH\u0002J\b\u0010Z\u001a\u00020\u0014H\u0016J\u0018\u0010[\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019H\u0016J\u0018\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019H\u0016J\b\u0010]\u001a\u00020\u0010H\u0016J\u0014\u0010^\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020I0\bH\u0016J\b\u0010_\u001a\u00020\u0014H\u0016J\r\u0010`\u001a\u00020aH\u0002¢\u0006\u0002\u0010bJ\u0010\u0010c\u001a\u00020\t2\u0006\u0010d\u001a\u00020eH\u0002J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u0018H\u0016J\u0018\u0010i\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019H\u0016J\b\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020\tH\u0016J\b\u0010m\u001a\u000204H\u0016J\b\u0010n\u001a\u00020\u0014H\u0016J\b\u0010o\u001a\u00020\u0010H\u0016J\b\u0010p\u001a\u00020\u0002H\u0016J\u0010\u0010q\u001a\u00020\u00142\u0006\u0010r\u001a\u00020\nH\u0002J\u0010\u0010s\u001a\u00020N2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001e\u0010t\u001a\u00020N2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\n0Y2\u0006\u0010v\u001a\u00020\u0018H\u0002J\b\u0010w\u001a\u00020NH\u0002J\b\u0010x\u001a\u00020NH\u0002J\b\u0010y\u001a\u00020NH\u0002J\b\u0010z\u001a\u00020NH\u0016J\b\u0010{\u001a\u00020NH\u0016J\b\u0010|\u001a\u00020NH\u0016J\u0010\u0010}\u001a\u00020N2\u0006\u0010~\u001a\u00020\u001cH\u0016J\u001d\u0010\u001a\u00020N2\u0013\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016J\u001e\u0010\u0001\u001a\u00020N2\u0013\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020I0\bH\u0016J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J-\u0010\u0001\u001a\u00020N2\u0006\u0010h\u001a\u00020\u00182\u001a\u0010X\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0019H\u0016J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010U\u001a\u00020VH\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020VH\u0002J\t\u0010\u0001\u001a\u00020NH\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\u001cH\u0016J\"\u0010\u0001\u001a\u00020N2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019H\u0016J\t\u0010\u0001\u001a\u00020NH\u0016J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0016J)\u0010\u0001\u001a\u00020N2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020e0Y2\u0007\u0010\u0001\u001a\u00020\u00142\u0007\u0010\u0001\u001a\u00020\u001fH\u0016J\u001b\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\u001f2\u0007\u0010\u0001\u001a\u00020\u0014H\u0016J\t\u0010\u0001\u001a\u00020NH\u0016J\u0015\u0010\u0001\u001a\u00020N2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u000204H\u0016J\u0011\u0010\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020\u001cH\u0016J\u0012\u0010\u0001\u001a\u00020N2\u0007\u0010\u0001\u001a\u00020\u0014H\u0016R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u0002\n\u0000RR\u0010\u001a\u001aF\u0012\u0004\u0012\u00020\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u00190\u001bj\"\u0012\u0004\u0012\u00020\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u0019`\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019X\u000e¢\u0006\u0002\n\u0000R*\u0010%\u001a\u0012\u0012\u0004\u0012\u00020&0\u0017j\b\u0012\u0004\u0012\u00020&`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0017j\b\u0012\u0004\u0012\u000201`\u0019X\u0004¢\u0006\u0002\n\u0000R\u001e\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u00109\u001a\u0012\u0012\u0004\u0012\u0002010\u0017j\b\u0012\u0004\u0012\u000201`\u0019X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u0012\u0012\u0004\u0012\u0002010\u0017j\b\u0012\u0004\u0012\u000201`\u0019X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u0017j\b\u0012\u0004\u0012\u00020\u001c`\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010@\u001a\u00020AX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010F\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u000e¢\u0006\u0002\n\u0000R&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020I0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\u000e\u0010L\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingModelApi;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;)V", "buildingResourceMap", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getBuildingResourceMap", "()Ljava/util/Map;", "setBuildingResourceMap", "(Ljava/util/Map;)V", "eventDuration", "", "getEventDuration", "()J", "isRepeatOrExceptionEvent", "", "mBuildingFragmentData", "mBuildingList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "Lkotlin/collections/ArrayList;", "mBuildingMeetingRooms", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "Lkotlin/collections/HashMap;", "mCapacity", "", "getMCapacity", "()I", "setMCapacity", "(I)V", "mChosenMeetingRoomList", "mEquipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getMEquipments", "()Ljava/util/ArrayList;", "setMEquipments", "(Ljava/util/ArrayList;)V", "mIsDisableApprovalMeetingRoom", "getMIsDisableApprovalMeetingRoom$calendar_impl_release", "()Z", "setMIsDisableApprovalMeetingRoom$calendar_impl_release", "(Z)V", "mItemModelList", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "mMultipleSelectMeetingRoomList", "mResourceSelectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getMResourceSelectMode$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "setMResourceSelectMode$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;)V", "mSearchFreeItemModelList", "mSearchFreeMeetingRooms", "mSearchItemModelList", "mSearchMeetingRooms", "mShowUsableBoardroom", "mShowUsableContainer", "meetingRoomLevelsFG", "multiLevelTree", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "getMultiLevelTree", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;", "setMultiLevelTree", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelTree;)V", "multiSelectedRoomSize", "originalBuildingResourceMap", "originalMultiLevelAndMeetRoomMap", "Lcom/bytedance/lark/pb/calendar/v1/LevelRelatedInfo;", "getOriginalMultiLevelAndMeetRoomMap", "setOriginalMultiLevelAndMeetRoomMap", "searchFilterFG", "changeToMultipleMode", "", "findCurrentNodeByLevelContent", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "node", "levelContent", "Lcom/bytedance/lark/pb/calendar/v1/LevelContent;", "getBuildingResource", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/MeetingRoomBuildingModel;", "getBuildingResources", "buildingResources", "", "getCanAddMultiItems", "getChosenMeetingRoomList", "getCurMultipleSelectResource", "getEndTime", "getFilterData", "getIsShowUsableContainer", "getItemBuildingData", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel$getItemBuildingData$1", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel$getItemBuildingData$1;", "getMeetingRoomDesc", "resource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "getMeetingRoomFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "calendarBuilding", "getPreRequestBuildings", "getPreRequestResultType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/IEditContract$RequestBuildingResultType;", "getRRule", "getSelectMode", "getShowUsableBoardroom", "getStartTime", "getViewData", "hasFilterResourceEquipments", "calendarResource", "initData", "multiSelectCalendarResourceList", "resourceList", "building", "refreshItemModels", "refreshSearchFreeItemModels", "refreshSearchItemModels", "resetMultiSelectRoomSize", "selectAllResource", "unSelectAllResource", "unSelectResource", "eventMeetingRoomData", "updateAllBuildingSource", "allResource", "updateAllLevelAndMeetingRoomData", "allLevelInfo", "updateBuildingFragmentData", "updateBuildingMeetingRoomData", "updateBuildingSelectData", "updateBuildingSelectState", "model", "updateCurrentBuildingSource", "updateDataAfterRoomDelete", "meetingRoom", "updateLoadBuildingData", "allCalendarBuildings", "updateLoadBuildingNoData", "updateMultiLevelTreeCurrentNode", "updateMultiSearchItem", "hasMore", "cursor", "updateMultiSelectRoomSize", "size", "isAdd", "updateNoSearchData", "updateSearchResult", "searchMeetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SearchMeetingRoom;", "updateSelectMode", "selectMode", "updateSelectResource", "updateShowUsableBoardroom", "state", "buildingViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b */
public final class BuildingModel extends BaseModelCalendar<IBuildingContract.IBuildingViewData> implements IBuildingContract.IBuildingModelApi {

    /* renamed from: a */
    public BuildingFragmentData f80715a;

    /* renamed from: b */
    public ArrayList<EventMeetingRoomData> f80716b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<CalendarBuilding> f80717c = new ArrayList<>();

    /* renamed from: d */
    public boolean f80718d;

    /* renamed from: e */
    public boolean f80719e;

    /* renamed from: f */
    public HashMap<String, ArrayList<EventMeetingRoomData>> f80720f = new HashMap<>();

    /* renamed from: g */
    public final ArrayList<ItemModel> f80721g = new ArrayList<>();

    /* renamed from: h */
    public final ArrayList<ItemModel> f80722h = new ArrayList<>();

    /* renamed from: i */
    public final ArrayList<ItemModel> f80723i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<EventMeetingRoomData> f80724j = new ArrayList<>();

    /* renamed from: k */
    public int f80725k;

    /* renamed from: l */
    private final ArrayList<EventMeetingRoomData> f80726l = new ArrayList<>();

    /* renamed from: m */
    private final ArrayList<EventMeetingRoomData> f80727m = new ArrayList<>();

    /* renamed from: n */
    private boolean f80728n;

    /* renamed from: o */
    private final boolean f80729o = C30022a.f74883b.mo112706n();

    /* renamed from: p */
    private final boolean f80730p = C30022a.f74883b.mo112707o();

    /* renamed from: q */
    private IBuildingContract.ResourceSelectMode f80731q = IBuildingContract.ResourceSelectMode.SINGLE;

    /* renamed from: r */
    private Map<String, ? extends CalendarResource> f80732r = MapsKt.emptyMap();

    /* renamed from: s */
    private Map<String, ? extends CalendarResource> f80733s = MapsKt.emptyMap();

    /* renamed from: t */
    private MultiLevelTree f80734t = new MultiLevelTree();

    /* renamed from: u */
    private Map<String, LevelRelatedInfo> f80735u = MapsKt.emptyMap();

    /* renamed from: v */
    private ArrayList<EquipmentData> f80736v = new ArrayList<>();

    /* renamed from: w */
    private int f80737w;

    /* renamed from: x */
    private boolean f80738x;

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: x */
    public void mo115598x() {
        this.f80725k = 0;
    }

    /* renamed from: b */
    public final IBuildingContract.ResourceSelectMode mo115726b() {
        return this.f80731q;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource>, java.util.Map<java.lang.String, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource> */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: c */
    public Map<String, CalendarResource> mo115579c() {
        return this.f80732r;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: d */
    public MultiLevelTree mo115582d() {
        return this.f80734t;
    }

    /* renamed from: e */
    public Map<String, LevelRelatedInfo> mo115730e() {
        return this.f80735u;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: g */
    public ArrayList<EquipmentData> mo115584g() {
        return this.f80736v;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: h */
    public int mo115585h() {
        return this.f80737w;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: m */
    public ArrayList<EventMeetingRoomData> mo115588m() {
        return this.f80716b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: u */
    public IBuildingContract.ResourceSelectMode mo115595u() {
        return this.f80731q;
    }

    /* renamed from: a */
    public final boolean mo115725a() {
        return this.f80728n;
    }

    /* renamed from: a */
    public void mo115724a(Map<String, ? extends CalendarResource> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f80732r = map;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115572a(MultiLevelTree dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        this.f80734t = dVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115577a(boolean z) {
        this.f80718d = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115568a(EventMeetingRoomData eventMeetingRoomData) {
        Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "meetingRoom");
        this.f80716b.remove(eventMeetingRoomData);
        m120297C();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115575a(ArrayList<CalendarBuilding> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "allCalendarBuildings");
        this.f80717c = arrayList;
        m120297C();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115574a(SearchMeetingRoom searchMeetingRoom) {
        this.f80726l.clear();
        this.f80727m.clear();
        if (searchMeetingRoom != null && CollectionUtils.isNotEmpty(searchMeetingRoom.getBuildings())) {
            for (CalendarBuilding calendarBuilding : searchMeetingRoom.getBuildings()) {
                if (calendarBuilding != null && CollectionUtils.isNotEmpty(calendarBuilding.getCalendarResources())) {
                    for (CalendarResource calendarResource : calendarBuilding.getCalendarResources()) {
                        if (calendarResource != null) {
                            EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
                            eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(calendarBuilding.getName());
                            eventMeetingRoomData.setCalendarResource(calendarResource);
                            eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.getCalendarId());
                            eventMeetingRoomData.buildDisPlayText();
                            this.f80726l.add(eventMeetingRoomData);
                            SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                            CalendarSchemaCollection resourceSchema = calendarResource.getResourceSchema();
                            SchemaExtraData schemaExtraData = calendarResource.getSchemaExtraData();
                            if ((!aVar.mo120310a(resourceSchema, schemaExtraData != null ? MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData) : null, Long.valueOf(mo115731i()), false).getFirst().booleanValue() || !this.f80728n) && calendarResource.getStatus() == CalendarResource.Status.FREE) {
                                this.f80727m.add(eventMeetingRoomData);
                            }
                        }
                    }
                }
            }
        }
        m120298D();
        m120299E();
        if (searchMeetingRoom != null && searchMeetingRoom.isHasMore()) {
            this.f80722h.add(new LoadMoreModel());
            this.f80723i.add(new LoadMoreModel());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115576a(List<com.bytedance.lark.pb.calendar.v1.CalendarResource> list, boolean z, int i) {
        Intrinsics.checkParameterIsNotNull(list, "resource");
        if (i == 0) {
            this.f80726l.clear();
        }
        if (CollectionUtils.isNotEmpty(list)) {
            for (com.bytedance.lark.pb.calendar.v1.CalendarResource calendarResource : list) {
                EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
                eventMeetingRoomData.setCalendarResource(C32514b.m124521a(calendarResource));
                eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.calendar_id);
                eventMeetingRoomData.buildDisPlayText();
                eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(m120301a(calendarResource));
                this.f80726l.add(eventMeetingRoomData);
            }
        }
        m120298D();
        if (z) {
            this.f80722h.add(new LoadMoreModel());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115571a(MultiLevelNode bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "node");
        mo115582d().mo115838a(bVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115570a(MeetingRoomBuildingModel hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "buildingModel");
        int i = C31763c.f80770a[hVar.mo115770c().ordinal()];
        if (i == 1) {
            for (T t : mo115727b(hVar)) {
                EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
                CalendarBuilding d = hVar.mo115771d();
                eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(d != null ? d.getName() : null);
                CalendarBuilding d2 = hVar.mo115771d();
                eventMeetingRoomData.setMBuildingId$calendar_impl_release(d2 != null ? d2.getId() : null);
                eventMeetingRoomData.setCalendarResource(t);
                eventMeetingRoomData.setMCalendarId$calendar_impl_release(t.getCalendarId());
                eventMeetingRoomData.buildDisPlayText();
                if (t.getStatus() == CalendarResource.Status.FREE) {
                    mo115578b(eventMeetingRoomData);
                }
            }
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList();
            for (T t2 : this.f80724j) {
                String mBuildingId$calendar_impl_release = t2.getMBuildingId$calendar_impl_release();
                CalendarBuilding d3 = hVar.mo115771d();
                if (!Intrinsics.areEqual(mBuildingId$calendar_impl_release, d3 != null ? d3.getId() : null)) {
                    arrayList.add(t2);
                }
            }
            this.f80724j = new ArrayList<>(arrayList);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115573a(CalendarBuilding calendarBuilding, ArrayList<CalendarResource> arrayList) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "calendarBuilding");
        if (arrayList == null) {
            String id = calendarBuilding.getId();
            if (id != null) {
                this.f80720f.put(id, null);
                return;
            }
            return;
        }
        String id2 = calendarBuilding.getId();
        ArrayList<EventMeetingRoomData> arrayList2 = new ArrayList<>();
        Iterator<CalendarResource> it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarResource next = it.next();
            EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
            eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(calendarBuilding.getName());
            eventMeetingRoomData.setCalendarResource(next);
            Intrinsics.checkExpressionValueIsNotNull(next, "resource");
            eventMeetingRoomData.setMCalendarId$calendar_impl_release(next.getCalendarId());
            eventMeetingRoomData.buildDisPlayText();
            arrayList2.add(eventMeetingRoomData);
        }
        Intrinsics.checkExpressionValueIsNotNull(id2, "buildingId");
        this.f80720f.put(id2, arrayList2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0004j\b\u0012\u0004\u0012\u00020\r`\u0006H\u0016J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016JH\u0010\u000f\u001a4\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0010j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006`\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u0018\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0016J\u0018\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0004j\b\u0012\u0004\u0012\u00020\u001a`\u0006H\u0016J\u0018\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\u0018\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0018\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\u0018\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel$buildingViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$IBuildingViewData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel;)V", "getAllItemModels", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/ItemModel;", "Lkotlin/collections/ArrayList;", "expandBuildingIds", "", "", "pageIndex", "", "getBreadcrumbItems", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "getBuildingItemModels", "getBuildingsMeetingRooms", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "buildings", "getCurrentLevelAndRoomsItem", "getCurrentMultiLevelNode", "getCurrentSelectMode", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$ResourceSelectMode;", "getCurrentSelectResourceCount", "getFilterCapacity", "getFilterEquipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getItemModels", "getMultiSearchItem", "getMultiSelectedRoomSize", "getSearchFreeItemModels", "getSearchItemModels", "getSelectAllState", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/IBuildingContract$SelectState;", "getSelectedRooms", "isAllResourceSelected", "", "isEditEvent", "isShowMultiSelect", "isShowUsableBoardroom", "isShowUsableContainer", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$a */
    public final class buildingViewData implements IBuildingContract.IBuildingViewData {
        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: a */
        public boolean mo115647a() {
            return BuildingModel.this.f80718d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: b */
        public boolean mo115648b() {
            return BuildingModel.this.f80719e;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: c */
        public ArrayList<ItemModel> mo115649c() {
            return BuildingModel.this.f80721g;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: f */
        public ArrayList<ItemModel> mo115652f() {
            return BuildingModel.this.f80723i;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: g */
        public ArrayList<ItemModel> mo115653g() {
            return BuildingModel.this.f80722h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: h */
        public IBuildingContract.ResourceSelectMode mo115654h() {
            return BuildingModel.this.mo115726b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: o */
        public int mo115661o() {
            return BuildingModel.this.f80725k;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: q */
        public ArrayList<EquipmentData> mo115663q() {
            return BuildingModel.this.mo115584g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: r */
        public int mo115664r() {
            return BuildingModel.this.mo115585h();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: s */
        public ArrayList<ItemModel> mo115665s() {
            return BuildingModel.this.f80722h;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: d */
        public boolean mo115650d() {
            return BuildingModel.m120300a(BuildingModel.this).isEditEvent();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: j */
        public int mo115656j() {
            return BuildingModel.this.f80724j.size();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: k */
        public boolean mo115657k() {
            return BuildingModel.m120300a(BuildingModel.this).isShowMultiSelect();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: p */
        public MultiLevelNode mo115662p() {
            return BuildingModel.this.mo115582d().mo115840c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: n */
        public ArrayList<MultiLevelNode> mo115660n() {
            ArrayList<MultiLevelNode> arrayList = new ArrayList<>();
            for (MultiLevelNode c = BuildingModel.this.mo115582d().mo115840c(); c != null; c = c.mo115819a()) {
                arrayList.add(0, c);
            }
            return arrayList;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: e */
        public ArrayList<ItemModel> mo115651e() {
            ArrayList<ItemModel> arrayList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(BuildingModel.this.f80717c)) {
                Iterator<CalendarBuilding> it = BuildingModel.this.f80717c.iterator();
                while (it.hasNext()) {
                    MeetingRoomBuildingModel hVar = new MeetingRoomBuildingModel(it.next(), false, 0, 0, 14, null);
                    hVar.mo115763a(BuildingModel.this.mo115726b());
                    BuildingModel.this.mo115729c(hVar);
                    arrayList.add(hVar);
                }
            } else {
                arrayList.add(new NoneDataModel());
            }
            return arrayList;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: l */
        public ArrayList<ItemModel> mo115658l() {
            if (BuildingModel.this.f80719e) {
                return null;
            }
            ArrayList<ItemModel> arrayList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(BuildingModel.this.f80716b)) {
                String b = C32634ae.m125182b(R.string.Calendar_Edit_ChosenRooms);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…alendar_Edit_ChosenRooms)");
                arrayList.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_selected, b));
                Iterator<EventMeetingRoomData> it = BuildingModel.this.f80716b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ChosenMeetingRoomModel(it.next()));
                }
                arrayList.add(new DividerModel());
            }
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_AllRooms);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_AllRooms)");
            arrayList.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_all, b2));
            return arrayList;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: i */
        public IBuildingContract.SelectState mo115655i() {
            boolean z;
            boolean z2;
            String str;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = BuildingModel.this.mo115579c().values().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.getStatus() == CalendarResource.Status.BUSY) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return IBuildingContract.SelectState.NOT_OPTIONAL;
            }
            ArrayList<EventMeetingRoomData> arrayList3 = BuildingModel.this.f80724j;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return IBuildingContract.SelectState.NONE;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CalendarResource calendarResource = (CalendarResource) it2.next();
                Iterator<T> it3 = BuildingModel.this.f80724j.iterator();
                while (true) {
                    str = null;
                    if (!it3.hasNext()) {
                        break;
                    }
                    T next2 = it3.next();
                    CalendarResource calendarResource2 = next2.getCalendarResource();
                    if (calendarResource2 != null) {
                        str = calendarResource2.getCalendarId();
                    }
                    if (Intrinsics.areEqual(str, calendarResource.getCalendarId())) {
                        str = next2;
                        break;
                    }
                }
                if (((EventMeetingRoomData) str) == null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return IBuildingContract.SelectState.ALL;
            }
            return IBuildingContract.SelectState.SELF;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: m */
        public ArrayList<ItemModel> mo115659m() {
            boolean z;
            ArrayList<ItemModel> arrayList = new ArrayList<>();
            CollectionsKt.sortWith(BuildingModel.this.mo115582d().mo115840c().mo115832h(), C31758b.f80741a);
            ArrayList<MultiRoomNode> h = BuildingModel.this.mo115582d().mo115840c().mo115832h();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(h, 10));
            Iterator<T> it = h.iterator();
            while (it.hasNext()) {
                MultiMeetingRoomModel kVar = new MultiMeetingRoomModel(it.next(), 0, 2, null);
                kVar.mo115804a(BuildingModel.this.mo115726b());
                arrayList2.add(kVar);
            }
            arrayList.addAll(arrayList2);
            CollectionsKt.sortWith(BuildingModel.this.mo115582d().mo115840c().mo115831g(), C31759c.f80742a);
            ArrayList<MultiLevelNode> g = BuildingModel.this.mo115582d().mo115840c().mo115831g();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(g, 10));
            Iterator<T> it2 = g.iterator();
            while (it2.hasNext()) {
                MultiLevelModel jVar = new MultiLevelModel(it2.next(), 0, 2, null);
                jVar.mo115799a(BuildingModel.this.mo115726b());
                arrayList3.add(jVar);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                if (((MultiLevelModel) obj).mo115797a().mo115823b() != IBuildingContract.SelectState.NOT_OPTIONAL) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList4.add(obj);
                }
            }
            arrayList.addAll(arrayList4);
            return arrayList;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public buildingViewData() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: a */
        public HashMap<ItemModel, ArrayList<ItemModel>> mo115646a(List<? extends ItemModel> list) {
            CalendarBuilding d;
            String id;
            MeetingRoomBuildingModel hVar;
            CalendarBuilding d2;
            String id2;
            boolean z;
            CalendarResource.Status status;
            IBuildingContract.SelectState selectState;
            CalendarSchemaCollection calendarSchemaCollection;
            SchemaExtraData.ApprovalTrigger approvalTrigger;
            CalendarResource.Status status2;
            com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData;
            Intrinsics.checkParameterIsNotNull(list, "buildings");
            HashMap<ItemModel, ArrayList<ItemModel>> hashMap = new HashMap<>();
            for (ItemModel dVar : list) {
                if ((dVar instanceof MeetingRoomBuildingModel) && (d2 = (hVar = (MeetingRoomBuildingModel) dVar).mo115771d()) != null && (id2 = d2.getId()) != null && BuildingModel.this.f80720f.containsKey(id2)) {
                    if (hVar.mo115774f() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList<EventMeetingRoomData> arrayList = BuildingModel.this.f80720f.get(id2);
                    if (z) {
                        if (arrayList != null) {
                            ArrayList<EventMeetingRoomData> arrayList2 = new ArrayList<>();
                            Iterator<EventMeetingRoomData> it = arrayList.iterator();
                            while (it.hasNext()) {
                                EventMeetingRoomData next = it.next();
                                CalendarResource calendarResource = next.getCalendarResource();
                                SchemaHelper.Companion aVar = SchemaHelper.f83746a;
                                if (calendarResource != null) {
                                    calendarSchemaCollection = calendarResource.getResourceSchema();
                                } else {
                                    calendarSchemaCollection = null;
                                }
                                if (calendarResource == null || (schemaExtraData = calendarResource.getSchemaExtraData()) == null) {
                                    approvalTrigger = null;
                                } else {
                                    approvalTrigger = MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData);
                                }
                                if (!aVar.mo120310a(calendarSchemaCollection, approvalTrigger, Long.valueOf(BuildingModel.this.mo115731i()), false).getFirst().booleanValue() || !BuildingModel.this.mo115725a()) {
                                    if (calendarResource != null) {
                                        status2 = calendarResource.getStatus();
                                    } else {
                                        status2 = null;
                                    }
                                    if (status2 == CalendarResource.Status.FREE) {
                                        arrayList2.add(next);
                                    }
                                }
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                    }
                    ArrayList<ItemModel> arrayList3 = new ArrayList<>();
                    if (arrayList == null) {
                        arrayList3.add(new LoadErrorDataModel());
                    } else if (CollectionUtils.isEmpty(arrayList)) {
                        arrayList3.add(new NoneDataModel());
                    } else {
                        Iterator<EventMeetingRoomData> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            EventMeetingRoomData next2 = it2.next();
                            Intrinsics.checkExpressionValueIsNotNull(next2, "roomData");
                            MeetingRoomModel iVar = new MeetingRoomModel(next2, BuildingModel.this.mo115732l(), 0, 4, null);
                            iVar.mo115778a(1);
                            iVar.mo115781a(BuildingModel.this.mo115725a());
                            iVar.mo115779a(BuildingModel.this.mo115726b());
                            if (BuildingModel.this.mo115726b() == IBuildingContract.ResourceSelectMode.MULTIPLE) {
                                CalendarResource calendarResource2 = next2.getCalendarResource();
                                if (calendarResource2 != null) {
                                    status = calendarResource2.getStatus();
                                } else {
                                    status = null;
                                }
                                if (status == CalendarResource.Status.BUSY) {
                                    selectState = IBuildingContract.SelectState.NOT_OPTIONAL;
                                } else if (BuildingModel.this.f80724j.contains(next2)) {
                                    selectState = IBuildingContract.SelectState.ALL;
                                } else {
                                    selectState = IBuildingContract.SelectState.NONE;
                                }
                                iVar.mo115780a(selectState);
                            }
                            arrayList3.add(iVar);
                        }
                    }
                    hashMap.put(dVar, arrayList3);
                }
            }
            for (ItemModel dVar2 : list) {
                if (!(!(dVar2 instanceof MeetingRoomBuildingModel) || (d = ((MeetingRoomBuildingModel) dVar2).mo115771d()) == null || (id = d.getId()) == null)) {
                    BuildingModel.this.f80720f.remove(id);
                }
            }
            return hashMap;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiRoomNode;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$a$b */
        static final class C31758b<T> implements Comparator<MultiRoomNode> {

            /* renamed from: a */
            public static final C31758b f80741a = new C31758b();

            C31758b() {
            }

            /* renamed from: a */
            public final int compare(MultiRoomNode eVar, MultiRoomNode eVar2) {
                return (eVar.mo115824c() > eVar2.mo115824c() ? 1 : (eVar.mo115824c() == eVar2.mo115824c() ? 0 : -1));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/multiLevel/MultiLevelNode;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$a$c */
        static final class C31759c<T> implements Comparator<MultiLevelNode> {

            /* renamed from: a */
            public static final C31759c f80742a = new C31759c();

            C31759c() {
            }

            /* renamed from: a */
            public final int compare(MultiLevelNode bVar, MultiLevelNode bVar2) {
                return (bVar.mo115824c() > bVar2.mo115824c() ? 1 : (bVar.mo115824c() == bVar2.mo115824c() ? 0 : -1));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$a$a */
        static final class C31757a<T> implements Comparator<CalendarResource> {

            /* renamed from: a */
            public static final C31757a f80740a = new C31757a();

            C31757a() {
            }

            /* renamed from: a */
            public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
                int weight = calendarResource2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
                return weight - calendarResource.getWeight();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingViewData
        /* renamed from: a */
        public ArrayList<ItemModel> mo115645a(List<String> list, int i) {
            Intrinsics.checkParameterIsNotNull(list, "expandBuildingIds");
            ArrayList<ItemModel> arrayList = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(BuildingModel.this.f80717c)) {
                Iterator<CalendarBuilding> it = BuildingModel.this.f80717c.iterator();
                while (it.hasNext()) {
                    CalendarBuilding next = it.next();
                    MeetingRoomBuildingModel hVar = new MeetingRoomBuildingModel(next, false, 0, 0, 14, null);
                    hVar.mo115763a(BuildingModel.this.mo115726b());
                    hVar.mo115762a(i);
                    BuildingModel.this.mo115729c(hVar);
                    arrayList.add(hVar);
                    Intrinsics.checkExpressionValueIsNotNull(next, "calendarBuilding");
                    if (list.contains(next.getId())) {
                        hVar.mo115765a(true);
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : BuildingModel.this.mo115579c().values()) {
                            if (Intrinsics.areEqual(t.getBuildingId(), next.getId())) {
                                arrayList2.add(t);
                            }
                        }
                        List<CalendarResource> sortedWith = CollectionsKt.sortedWith(arrayList2, C31757a.f80740a);
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
                        for (CalendarResource calendarResource : sortedWith) {
                            EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
                            eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(next.getName());
                            eventMeetingRoomData.setMBuildingId$calendar_impl_release(next.getId());
                            eventMeetingRoomData.setCalendarResource(calendarResource);
                            eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.getCalendarId());
                            eventMeetingRoomData.buildDisPlayText();
                            arrayList3.add(eventMeetingRoomData);
                        }
                        ArrayList<ItemModel> a = BuildingModel.this.mo115723a(hVar, arrayList3);
                        if (a != null) {
                            arrayList.addAll(a);
                        }
                    }
                }
            } else {
                arrayList.add(new NoneDataModel());
            }
            return arrayList;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: A */
    public void mo115561A() {
        this.f80724j.clear();
    }

    /* renamed from: l */
    public final C31761c mo115732l() {
        return new C31761c(this);
    }

    /* renamed from: t */
    public IBuildingContract.IBuildingViewData mo109793f() {
        return new buildingViewData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: B */
    public void mo115562B() {
        mo115569a(IBuildingContract.ResourceSelectMode.MULTIPLE);
        mo115597w();
        this.f80724j.clear();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: j */
    public void mo115586j() {
        this.f80717c.clear();
        m120297C();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: n */
    public long mo115589n() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getStartTime();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: o */
    public long mo115590o() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getEndTime();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: p */
    public String mo115591p() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getRRule();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: q */
    public IEditContract.RequestBuildingResultType mo115592q() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getRequestResultType();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: r */
    public ArrayList<CalendarBuilding> mo115593r() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getRequestBuildings();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: s */
    public boolean mo115594s() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData.getCanAddMultiItems();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/BuildingModel$getItemBuildingData$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/meetingroom/model/IBuildingData;", "getEventDuration", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$c */
    public static final class C31761c implements IBuildingData {

        /* renamed from: a */
        final /* synthetic */ BuildingModel f80744a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.IBuildingData
        /* renamed from: a */
        public long mo115742a() {
            return BuildingModel.m120300a(this.f80744a).getEndTime() - BuildingModel.m120300a(this.f80744a).getStartTime();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31761c(BuildingModel bVar) {
            this.f80744a = bVar;
        }
    }

    /* renamed from: i */
    public final long mo115731i() {
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        long endTime = buildingFragmentData.getEndTime();
        BuildingFragmentData buildingFragmentData2 = this.f80715a;
        if (buildingFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return endTime - buildingFragmentData2.getStartTime();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: k */
    public void mo115587k() {
        this.f80726l.clear();
        this.f80727m.clear();
        m120298D();
        m120299E();
    }

    /* renamed from: D */
    private final void m120298D() {
        this.f80722h.clear();
        if (CollectionUtils.isEmpty(this.f80726l)) {
            this.f80722h.add(new NoneDataModel());
            return;
        }
        Iterator<EventMeetingRoomData> it = this.f80726l.iterator();
        while (it.hasNext()) {
            EventMeetingRoomData next = it.next();
            ArrayList<ItemModel> arrayList = this.f80722h;
            Intrinsics.checkExpressionValueIsNotNull(next, "meetingRoomData");
            MeetingRoomModel iVar = new MeetingRoomModel(next, mo115732l(), 0, 4, null);
            iVar.mo115781a(this.f80728n);
            arrayList.add(iVar);
        }
    }

    /* renamed from: E */
    private final void m120299E() {
        this.f80723i.clear();
        if (CollectionUtils.isEmpty(this.f80727m)) {
            this.f80723i.add(new NoneDataModel());
            return;
        }
        Iterator<EventMeetingRoomData> it = this.f80727m.iterator();
        while (it.hasNext()) {
            EventMeetingRoomData next = it.next();
            ArrayList<ItemModel> arrayList = this.f80723i;
            Intrinsics.checkExpressionValueIsNotNull(next, "meetingRoomData");
            MeetingRoomModel iVar = new MeetingRoomModel(next, mo115732l(), 0, 4, null);
            iVar.mo115781a(this.f80728n);
            arrayList.add(iVar);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: v */
    public ArrayList<EventMeetingRoomData> mo115596v() {
        if (!this.f80730p) {
            return this.f80724j;
        }
        ArrayList<MultiRoomNode> b = mo115582d().mo115839b();
        ArrayList<EventMeetingRoomData> arrayList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(b, 10));
        for (T t : b) {
            EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
            eventMeetingRoomData.setCalendarResource(C32514b.m124521a(t.mo115847f()));
            eventMeetingRoomData.setMCalendarId$calendar_impl_release(t.mo115847f().calendar_id);
            eventMeetingRoomData.buildDisPlayText();
            arrayList.add(eventMeetingRoomData);
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: w */
    public void mo115597w() {
        boolean z;
        if (!this.f80733s.isEmpty()) {
            Map<String, ? extends CalendarResource> map = this.f80733s;
            Map<String, ? extends CalendarResource> linkedHashMap = new LinkedHashMap<>();
            for (Map.Entry<String, ? extends CalendarResource> entry : map.entrySet()) {
                CalendarResource calendarResource = (CalendarResource) entry.getValue();
                if (calendarResource.getCapacity() < mo115585h() || !m120303a(calendarResource)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            mo115724a(linkedHashMap);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: z */
    public void mo115600z() {
        this.f80724j.clear();
        for (T t : this.f80717c) {
            ArrayList arrayList = new ArrayList();
            for (T t2 : mo115579c().values()) {
                if (Intrinsics.areEqual(t2.getBuildingId(), t.getId())) {
                    arrayList.add(t2);
                }
            }
            m120302a(CollectionsKt.sortedWith(arrayList, C31762d.f80745a), t);
        }
    }

    /* renamed from: C */
    private final void m120297C() {
        this.f80721g.clear();
        if (!this.f80729o) {
            if (CollectionUtils.isNotEmpty(this.f80716b)) {
                ArrayList<ItemModel> arrayList = this.f80721g;
                String b = C32634ae.m125182b(R.string.Calendar_Edit_ChosenRooms);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.stri…alendar_Edit_ChosenRooms)");
                arrayList.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_selected, b));
                Iterator<EventMeetingRoomData> it = this.f80716b.iterator();
                while (it.hasNext()) {
                    this.f80721g.add(new ChosenMeetingRoomModel(it.next()));
                }
                this.f80721g.add(new DividerModel());
            }
            ArrayList<ItemModel> arrayList2 = this.f80721g;
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_AllRooms);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_AllRooms)");
            arrayList2.add(new TypeTitleModel(R.drawable.calendar_icon_meeting_room_title_all, b2));
        }
        if (CollectionUtils.isNotEmpty(this.f80717c)) {
            Iterator<CalendarBuilding> it2 = this.f80717c.iterator();
            while (it2.hasNext()) {
                MeetingRoomBuildingModel hVar = new MeetingRoomBuildingModel(it2.next(), false, 0, 0, 14, null);
                hVar.mo115763a(this.f80731q);
                mo115729c(hVar);
                this.f80721g.add(hVar);
            }
            return;
        }
        this.f80721g.add(new NoneDataModel());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[SYNTHETIC] */
    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo> mo115599y() {
        /*
        // Method dump skipped, instructions count: 178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingModel.mo115599y():java.util.Map");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115565a(int i) {
        this.f80737w = i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115569a(IBuildingContract.ResourceSelectMode resourceSelectMode) {
        Intrinsics.checkParameterIsNotNull(resourceSelectMode, "selectMode");
        this.f80731q = resourceSelectMode;
    }

    /* renamed from: b */
    public void mo115728b(Map<String, LevelRelatedInfo> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.f80735u = map;
    }

    /* renamed from: a */
    public static final /* synthetic */ BuildingFragmentData m120300a(BuildingModel bVar) {
        BuildingFragmentData buildingFragmentData = bVar.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return buildingFragmentData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: c */
    public void mo115580c(EventMeetingRoomData eventMeetingRoomData) {
        Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "eventMeetingRoomData");
        this.f80724j.remove(eventMeetingRoomData);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: c */
    public void mo115581c(Map<String, ? extends CalendarResource> map) {
        Intrinsics.checkParameterIsNotNull(map, "allResource");
        this.f80733s = map;
        mo115597w();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115567a(BuildingFragmentData buildingFragmentData) {
        Intrinsics.checkParameterIsNotNull(buildingFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m120304b(buildingFragmentData);
        if (this.f80730p) {
            this.f80725k = 0;
            mo115565a(0);
            mo115584g().clear();
            if (!mo115730e().isEmpty()) {
                mo115569a(IBuildingContract.ResourceSelectMode.MULTIPLE);
                mo115571a(mo115582d().mo115841d());
                mo115582d().mo115836a();
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: b */
    public void mo115578b(EventMeetingRoomData eventMeetingRoomData) {
        CalendarResource.Status status;
        Intrinsics.checkParameterIsNotNull(eventMeetingRoomData, "eventMeetingRoomData");
        CalendarResource calendarResource = eventMeetingRoomData.getCalendarResource();
        if (calendarResource != null) {
            status = calendarResource.getStatus();
        } else {
            status = null;
        }
        if (status == CalendarResource.Status.FREE && !this.f80724j.contains(eventMeetingRoomData)) {
            this.f80724j.add(eventMeetingRoomData);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: d */
    public void mo115583d(Map<String, LevelRelatedInfo> map) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(map, "allLevelInfo");
        mo115569a(IBuildingContract.ResourceSelectMode.MULTIPLE);
        Map<String, LevelRelatedInfo> e = mo115730e();
        if (e == null || e.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo115728b(map);
            mo115572a(MultiLevelTree.f80780c.mo115842a(map, false));
        }
    }

    public BuildingModel(BuildingFragmentData buildingFragmentData) {
        Intrinsics.checkParameterIsNotNull(buildingFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m120304b(buildingFragmentData);
    }

    /* renamed from: a */
    private final String m120301a(com.bytedance.lark.pb.calendar.v1.CalendarResource calendarResource) {
        boolean z;
        boolean z2;
        boolean z3;
        List<MeetingRoomEquipment> list = calendarResource.equipments;
        if (list == null) {
            return "";
        }
        List<MeetingRoomEquipment> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (T t : list) {
            String str = t.i18n_name;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (sb.length() > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    sb.append(" · ");
                }
                sb.append(t.i18n_name);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "equipmentStringBuilder.toString()");
        return sb2;
    }

    /* renamed from: b */
    private final void m120304b(BuildingFragmentData buildingFragmentData) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f80715a = buildingFragmentData;
        this.f80716b = buildingFragmentData.getChosenMeetingRooms();
        this.f80718d = buildingFragmentData.isShowUsableBoardroom();
        this.f80719e = buildingFragmentData.isShowUsableContainer();
        boolean z4 = true;
        if (buildingFragmentData.getRRule().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || buildingFragmentData.getOriginalTime() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f80728n = z2;
        if (buildingFragmentData.getRRule().length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && buildingFragmentData.getOriginalTime() == 0) {
            z4 = false;
        }
        this.f80738x = z4;
        this.f80724j = new ArrayList<>();
        this.f80731q = IBuildingContract.ResourceSelectMode.SINGLE;
        m120297C();
    }

    /* renamed from: b */
    public ArrayList<CalendarResource> mo115727b(MeetingRoomBuildingModel hVar) {
        boolean z;
        boolean z2;
        String str;
        Intrinsics.checkParameterIsNotNull(hVar, "buildingModel");
        if (hVar.mo115774f() == 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        for (T t : mo115579c().values()) {
            String buildingId = t.getBuildingId();
            CalendarBuilding d = hVar.mo115771d();
            if (d != null) {
                str = d.getId();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(buildingId, str)) {
                arrayList.add(t);
            }
        }
        ArrayList sortedWith = CollectionsKt.sortedWith(arrayList, C31760b.f80743a);
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : sortedWith) {
                if (((CalendarResource) obj).getStatus() == CalendarResource.Status.FREE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            sortedWith = arrayList2;
        }
        return new ArrayList<>(sortedWith);
    }

    /* renamed from: a */
    private final boolean m120303a(CalendarResource calendarResource) {
        ArrayList<EquipmentData> g = mo115584g();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo116059a());
        }
        ArrayList<String> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return true;
        }
        List<MeetingRoomEquipment> equipments = calendarResource.getEquipments();
        if (equipments == null) {
            return false;
        }
        List<MeetingRoomEquipment> list = equipments;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().id);
        }
        ArrayList arrayList4 = arrayList3;
        for (String str : arrayList2) {
            if (!arrayList4.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0070 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115729c(com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.model.MeetingRoomBuildingModel r11) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.BuildingModel.mo115729c(com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b.h):void");
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public MeetingRoomFragmentData mo115563a(CalendarBuilding calendarBuilding) {
        Intrinsics.checkParameterIsNotNull(calendarBuilding, "calendarBuilding");
        BuildingFragmentData buildingFragmentData = this.f80715a;
        if (buildingFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        boolean isShowUsableContainer = buildingFragmentData.isShowUsableContainer();
        boolean z = this.f80718d;
        BuildingFragmentData buildingFragmentData2 = this.f80715a;
        if (buildingFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        long startTime = buildingFragmentData2.getStartTime();
        BuildingFragmentData buildingFragmentData3 = this.f80715a;
        if (buildingFragmentData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        long endTime = buildingFragmentData3.getEndTime();
        BuildingFragmentData buildingFragmentData4 = this.f80715a;
        if (buildingFragmentData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuildingFragmentData");
        }
        return new MeetingRoomFragmentData(isShowUsableContainer, z, startTime, endTime, buildingFragmentData4.getRRule(), calendarBuilding);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$b */
    public static final class C31760b<T> implements Comparator<CalendarResource> {

        /* renamed from: a */
        public static final C31760b f80743a = new C31760b();

        C31760b() {
        }

        /* renamed from: a */
        public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
            Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
            int weight = calendarResource2.getWeight();
            Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
            return weight - calendarResource.getWeight();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.b$d */
    static final class C31762d<T> implements Comparator<CalendarResource> {

        /* renamed from: a */
        public static final C31762d f80745a = new C31762d();

        C31762d() {
        }

        /* renamed from: a */
        public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
            Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
            int weight = calendarResource2.getWeight();
            Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
            return weight - calendarResource.getWeight();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public void mo115566a(int i, boolean z) {
        if (z) {
            this.f80725k += i;
        } else {
            this.f80725k -= i;
        }
    }

    /* renamed from: a */
    private final void m120302a(List<? extends CalendarResource> list, CalendarBuilding calendarBuilding) {
        for (T t : list) {
            EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
            eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(calendarBuilding.getName());
            eventMeetingRoomData.setMBuildingId$calendar_impl_release(calendarBuilding.getId());
            eventMeetingRoomData.setCalendarResource(t);
            eventMeetingRoomData.setMCalendarId$calendar_impl_release(t.getCalendarId());
            eventMeetingRoomData.buildDisPlayText();
            if (t.getStatus() == CalendarResource.Status.FREE) {
                this.f80724j.add(eventMeetingRoomData);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract.IBuildingModelApi
    /* renamed from: a */
    public MultiLevelNode mo115564a(MultiLevelNode bVar, LevelContent levelContent) {
        String str;
        LevelContent f;
        Intrinsics.checkParameterIsNotNull(bVar, "node");
        Intrinsics.checkParameterIsNotNull(levelContent, "levelContent");
        if (Intrinsics.areEqual(bVar.mo115830f().level_id, levelContent.level_id)) {
            return bVar;
        }
        MultiLevelNode bVar2 = null;
        Iterator<MultiLevelNode> it = bVar.mo115831g().iterator();
        while (it.hasNext()) {
            MultiLevelNode next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "currentNode");
            bVar2 = mo115564a(next, levelContent);
            if (bVar2 == null || (f = bVar2.mo115830f()) == null) {
                str = null;
            } else {
                str = f.level_id;
            }
            if (Intrinsics.areEqual(str, levelContent.level_id)) {
                break;
            }
        }
        return bVar2;
    }

    /* renamed from: a */
    public final ArrayList<ItemModel> mo115723a(MeetingRoomBuildingModel hVar, List<EventMeetingRoomData> list) {
        boolean z;
        IBuildingContract.SelectState selectState;
        ArrayList arrayList;
        com.ss.android.lark.calendar.impl.rustadapter.doentity.SchemaExtraData schemaExtraData;
        if (hVar.mo115774f() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (list != null) {
                arrayList = new ArrayList();
                for (EventMeetingRoomData eventMeetingRoomData : list) {
                    CalendarResource calendarResource = eventMeetingRoomData.getCalendarResource();
                    if (!SchemaHelper.f83746a.mo120310a(calendarResource != null ? calendarResource.getResourceSchema() : null, (calendarResource == null || (schemaExtraData = calendarResource.getSchemaExtraData()) == null) ? null : MeetingRoomApprovalHelper.f79933a.mo114616a(schemaExtraData), Long.valueOf(mo115731i()), false).getFirst().booleanValue() || !this.f80728n) {
                        if ((calendarResource != null ? calendarResource.getStatus() : null) == CalendarResource.Status.FREE) {
                            arrayList.add(eventMeetingRoomData);
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            list = arrayList;
        }
        ArrayList<ItemModel> arrayList2 = new ArrayList<>();
        if (list == null) {
            arrayList2.add(new LoadErrorDataModel());
        } else if (CollectionUtils.isEmpty(list)) {
            arrayList2.add(new NoneDataModel());
        } else {
            for (EventMeetingRoomData eventMeetingRoomData2 : list) {
                Intrinsics.checkExpressionValueIsNotNull(eventMeetingRoomData2, "roomData");
                MeetingRoomModel iVar = new MeetingRoomModel(eventMeetingRoomData2, mo115732l(), 0, 4, null);
                iVar.mo115778a(1);
                iVar.mo115781a(this.f80728n);
                iVar.mo115779a(this.f80731q);
                CalendarResource calendarResource2 = eventMeetingRoomData2.getCalendarResource();
                if ((calendarResource2 != null ? calendarResource2.getStatus() : null) == CalendarResource.Status.BUSY) {
                    selectState = IBuildingContract.SelectState.NOT_OPTIONAL;
                } else if (this.f80724j.contains(eventMeetingRoomData2)) {
                    selectState = IBuildingContract.SelectState.ALL;
                } else {
                    selectState = IBuildingContract.SelectState.NONE;
                }
                iVar.mo115780a(selectState);
                arrayList2.add(iVar);
            }
        }
        return arrayList2;
    }
}
