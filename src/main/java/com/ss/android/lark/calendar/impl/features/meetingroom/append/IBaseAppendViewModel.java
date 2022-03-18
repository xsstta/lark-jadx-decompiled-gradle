package com.ss.android.lark.calendar.impl.features.meetingroom.append;

import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J'\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0011H&J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000eH&J\b\u0010\u001a\u001a\u00020\u0011H&J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH&R*\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/IBaseAppendViewModel;", "", "finishWithResourceLiveData", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "getFinishWithResourceLiveData", "()Landroidx/lifecycle/LiveData;", "resourceDisplayStatus", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "getResourceDisplayStatus", "toastLiveData", "", "getToastLiveData", "onFilterChanged", "", "capacity", "", "equipments", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "(Ljava/lang/Integer;Ljava/util/List;)V", "onLoadErrTryAgainClicked", "onSearchKeyWordChanged", "searchText", "onSearchLoadMoreClicked", "onSearchResourceClicked", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.d */
public interface IBaseAppendViewModel {
    void onFilterChanged(Integer num, List<EquipmentData> list);

    void onLoadErrTryAgainClicked();

    void onSearchKeyWordChanged(String str);
}
