package com.ss.android.lark.calendar.impl.features.calendarview.room;

import androidx.lifecycle.LiveData;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.BuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.EquipmentViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.LevelFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.OneBuildingFloorViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomFilterViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomInstanceViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.room.viewdata.RoomViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020&H&J\b\u0010(\u001a\u00020#H&J\b\u0010)\u001a\u00020#H&J\b\u0010*\u001a\u00020&H&J\b\u0010+\u001a\u00020&H&J\b\u0010,\u001a\u00020&H&J\b\u0010-\u001a\u00020&H&J\u0016\u0010.\u001a\u00020&2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H&J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020\u000bH&J\b\u00104\u001a\u00020&H&J\u0010\u00105\u001a\u00020&2\u0006\u00106\u001a\u000207H&J\b\u00108\u001a\u00020&H&J\u0016\u00109\u001a\u00020&2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;00H&J\b\u0010<\u001a\u00020&H&J\b\u0010=\u001a\u00020&H&J\u0018\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000bH&J\u0012\u0010A\u001a\u00020&2\b\u0010B\u001a\u0004\u0018\u00010CH&J\u0010\u0010D\u001a\u00020&2\u0006\u0010E\u001a\u00020#H&J\b\u0010F\u001a\u00020&H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0006¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/room/IRoomViewModel;", "", "accountChanged", "Landroidx/lifecycle/LiveData;", "", "getAccountChanged", "()Landroidx/lifecycle/LiveData;", "buildingLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/BuildingFloorViewData;", "getBuildingLiveData", "capacityLiveData", "", "getCapacityLiveData", "equipmentLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/EquipmentViewData;", "getEquipmentLiveData", "filterLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomFilterViewData;", "getFilterLiveData", "firstDayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "getFirstDayOfWeek", "isShowLunar", "levelFilterLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/LevelFilterViewData;", "getLevelFilterLiveData", "levelLoadingView", "getLevelLoadingView", "meetingRoomLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomViewData;", "getMeetingRoomLiveData", "roomInstanceLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/RoomInstanceViewData;", "getRoomInstanceLiveData", "selectDateChangeLiveData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getSelectDateChangeLiveData", "create", "", "destroy", "getCurrentDate", "getSelectedDate", "onBuildingDialogShow", "onCapacityDialogShow", "onCurrentDayChanged", "onEquipmentDialogShow", "onFilterBuildingChanged", "buildingsViewData", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/room/viewdata/OneBuildingFloorViewData;", "onFilterCapacityChanged", "capacity", "onFilterChanged", "onFilterEquipmentChanged", "equipmentViewData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onFilterEquipmentCleared", "onFilterMultiLevelChanged", "selectedResource", "Lcom/bytedance/lark/pb/calendar/v1/CalendarResource;", "onMultiLevelDialogShow", "onRefreshInstanceManually", "onRoomViewScrolling", "startIndex", "endIndex", "onSearchBuildingTextChanged", "keyWord", "", "onSelectDayChanged", "date", "preLoadData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.room.b */
public interface IRoomViewModel {
    void create();

    void destroy();

    LiveData<BuildingFloorViewData> getBuildingLiveData();

    LiveData<Integer> getCapacityLiveData();

    CalendarDate getCurrentDate();

    LiveData<EquipmentViewData> getEquipmentLiveData();

    LiveData<RoomFilterViewData> getFilterLiveData();

    LiveData<CalendarSetting.DayOfWeek> getFirstDayOfWeek();

    LiveData<LevelFilterViewData> getLevelFilterLiveData();

    LiveData<Integer> getLevelLoadingView();

    LiveData<RoomViewData> getMeetingRoomLiveData();

    LiveData<RoomInstanceViewData> getRoomInstanceLiveData();

    CalendarDate getSelectedDate();

    LiveData<Boolean> isShowLunar();

    void onBuildingDialogShow();

    void onCapacityDialogShow();

    void onCurrentDayChanged();

    void onEquipmentDialogShow();

    void onFilterBuildingChanged(List<OneBuildingFloorViewData> list);

    void onFilterCapacityChanged(int i);

    void onFilterChanged();

    void onFilterEquipmentChanged(EquipmentData bVar);

    void onFilterEquipmentCleared();

    void onFilterMultiLevelChanged(List<CalendarResource> list);

    void onMultiLevelDialogShow();

    void onRefreshInstanceManually();

    void onRoomViewScrolling(int i, int i2);

    void onSearchBuildingTextChanged(String str);

    void onSelectDayChanged(CalendarDate calendarDate);

    void preLoadData();
}
