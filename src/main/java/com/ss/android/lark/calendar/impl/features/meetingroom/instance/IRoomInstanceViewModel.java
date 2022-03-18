package com.ss.android.lark.calendar.impl.features.meetingroom.instance;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.calendar.impl.features.meetingroom.instance.viewdata.InstanceViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\bH&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\rH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u0013\u001a\u00020\u000bH&J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH&J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\rH&J\b\u0010\u001c\u001a\u00020\u0018H&J\u0018\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/IRoomInstanceViewModel;", "", "roomInstanceLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/instance/viewdata/InstanceViewData;", "getRoomInstanceLiveData", "()Landroidx/lifecycle/LiveData;", "saveEventFinish", "", "getSaveEventFinish", "getBuildingName", "", "getCurrentDay", "", "getIsUpdateSelectTime", "getRoomResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getSelectDay", "getSelectTimeTip", "getTitleViewData", "getUpdateSelectDuration", "Lkotlin/Pair;", "", "onLoadLayerData", "", "layerDay", "onSelectDayChange", "selectDay", "onSelectTimeCancel", "onSelectTimeChanged", "startTime", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.a */
public interface IRoomInstanceViewModel {
    String getBuildingName();

    int getCurrentDay();

    boolean getIsUpdateSelectTime();

    LiveData<InstanceViewData> getRoomInstanceLiveData();

    CalendarResource getRoomResource();

    LiveData<Boolean> getSaveEventFinish();

    int getSelectDay();

    String getSelectTimeTip();

    String getTitleViewData();

    Pair<Long, Long> getUpdateSelectDuration();

    void onLoadLayerData(int i);

    void onSelectDayChange(int i);

    void onSelectTimeCancel();

    void onSelectTimeChanged(long j, long j2);
}
