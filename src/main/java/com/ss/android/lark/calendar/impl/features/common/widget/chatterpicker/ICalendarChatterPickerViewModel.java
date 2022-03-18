package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerViewModel;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001aH&J\u0018\u00107\u001a\u0002042\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001aH&J\b\u00108\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0012\u0010\u0014\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0012\u0010\u0015\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u000bj\b\u0012\u0004\u0012\u00020\u0017`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u000bj\b\u0012\u0004\u0012\u00020\u001a`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u000fR\u0012\u0010\u001c\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\"\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000fR\"\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u000bj\b\u0012\u0004\u0012\u00020!`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\"\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000fR\"\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u000fR\"\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u000fR.\u0010)\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010,0+0*X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0012\u00101\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0012¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/ICalendarChatterPickerViewModel;", "", "activityOpenDirection", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "getActivityOpenDirection", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "chatterPickerTitleResId", "", "getChatterPickerTitleResId", "()I", "disabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisabledMemberIds", "()Ljava/util/ArrayList;", "isAddMail", "", "()Z", "isAddOuterUser", "isCheckPermission", "isSearchOuterUser", "notContacts", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalContact;", "getNotContacts", "preSelectBeanInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getPreSelectBeanInfos", "searchHintTextResId", "getSearchHintTextResId", "selectedChatters", "getSelectedChatters", "selectedDepartments", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalDepartment;", "getSelectedDepartments", "selectedEmails", "getSelectedEmails", "selectedGroups", "getSelectedGroups", "selectedMeetingChats", "getSelectedMeetingChats", "showToast", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "getShowToast", "()Landroidx/lifecycle/MutableLiveData;", "setShowToast", "(Landroidx/lifecycle/MutableLiveData;)V", "supportAddDepartment", "getSupportAddDepartment", "addSelectChatter", "", "id", "info", "deleteSelectChatter", "getSelectSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.a */
public interface ICalendarChatterPickerViewModel {
    void addSelectChatter(String str, SearchBaseInfo searchBaseInfo);

    void deleteSelectChatter(String str, SearchBaseInfo searchBaseInfo);

    CalendarChatterPickerViewModel.ActivityOpenDirection getActivityOpenDirection();

    int getChatterPickerTitleResId();

    ArrayList<String> getDisabledMemberIds();

    ArrayList<CalContact> getNotContacts();

    ArrayList<SearchBaseInfo> getPreSelectBeanInfos();

    int getSearchHintTextResId();

    int getSelectSize();

    ArrayList<String> getSelectedChatters();

    ArrayList<CalDepartment> getSelectedDepartments();

    ArrayList<String> getSelectedEmails();

    ArrayList<String> getSelectedGroups();

    ArrayList<String> getSelectedMeetingChats();

    C1177w<Pair<Integer, Long>> getShowToast();

    boolean getSupportAddDepartment();

    boolean isAddMail();

    boolean isAddOuterUser();

    boolean isCheckPermission();

    boolean isSearchOuterUser();
}
