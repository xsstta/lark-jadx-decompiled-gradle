package com.ss.android.lark.calendar.impl.features.calendars.share.picker;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u001fH&J$\u0010'\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0)H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\"\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/ICalendarMemberPickerViewModel;", "", "calendarPickerParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "getCalendarPickerParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "disabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisabledMemberIds", "()Ljava/util/ArrayList;", "pickerCalendarData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "getPickerCalendarData", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "selectedChatters", "getSelectedChatters", "selectedGroups", "getSelectedGroups", "shareStateLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "getShareStateLiveData", "()Landroidx/lifecycle/LiveData;", "showMemberConfirmFragment", "getShowMemberConfirmFragment", "subscriberShareCalendarLiveData", "", "getSubscriberShareCalendarLiveData", "addSelectChatter", "", "id", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "deleteSelectChatter", "getSelectSize", "", "onNextActionClicked", "updateSelectIds", "userIds", "", "groupIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.d */
public interface ICalendarMemberPickerViewModel {
    void addSelectChatter(String str, SearchBaseInfo searchBaseInfo);

    void deleteSelectChatter(String str, SearchBaseInfo searchBaseInfo);

    CalendarMemberPickerData getCalendarPickerParam();

    ArrayList<String> getDisabledMemberIds();

    CalendarShareExtraParam getPickerCalendarData();

    ArrayList<String> getSelectedChatters();

    ArrayList<String> getSelectedGroups();

    LiveData<ShareState> getShareStateLiveData();

    LiveData<Object> getShowMemberConfirmFragment();

    LiveData<Boolean> getSubscriberShareCalendarLiveData();

    void onNextActionClicked();

    void updateSelectIds(List<String> list, List<String> list2);
}
