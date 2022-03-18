package com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30046i;
import com.ss.android.lark.search.widget.calendar.EmailInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002KLB\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020*H\u0016J\u0018\u0010I\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00142\u0006\u0010H\u001a\u00020*H\u0016J\b\u0010J\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010 \u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u001a\u0010\"\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u000e\u0010$\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00020'0\u0013j\b\u0012\u0004\u0012\u00020'`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00020*0\u0013j\b\u0012\u0004\u0012\u00020*`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017R\u001a\u0010,\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R$\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0017R$\u00101\u001a\u0012\u0012\u0004\u0012\u0002020\u0013j\b\u0012\u0004\u0012\u000202`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0017R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0017R$\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0017R0\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010=0<0;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001b\"\u0004\bD\u0010\u001d¨\u0006M"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/ICalendarChatterPickerViewModel;", "entranceParams", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarPickerEntranceParams;)V", "activityOpenDirection", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "getActivityOpenDirection", "()Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "setActivityOpenDirection", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;)V", "chatterPickerTitleResId", "", "getChatterPickerTitleResId", "()I", "setChatterPickerTitleResId", "(I)V", "disabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisabledMemberIds", "()Ljava/util/ArrayList;", "enableOneWayContactCheck", "", "isAddMail", "()Z", "setAddMail", "(Z)V", "isAddOuterUser", "setAddOuterUser", "isCheckPermission", "setCheckPermission", "isSearchOuterUser", "setSearchOuterUser", "isShowExpandMeetingChatTip", "isShowSelectDepartmentTip", "notContacts", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalContact;", "getNotContacts", "preSelectBeanInfos", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getPreSelectBeanInfos", "searchHintTextResId", "getSearchHintTextResId", "setSearchHintTextResId", "selectedChatters", "getSelectedChatters", "selectedDepartments", "Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalDepartment;", "getSelectedDepartments", "selectedEmails", "getSelectedEmails", "selectedGroups", "getSelectedGroups", "selectedMeetingChats", "getSelectedMeetingChats", "showToast", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "getShowToast", "()Landroidx/lifecycle/MutableLiveData;", "setShowToast", "(Landroidx/lifecycle/MutableLiveData;)V", "supportAddDepartment", "getSupportAddDepartment", "setSupportAddDepartment", "addSelectChatter", "", "id", "info", "deleteSelectChatter", "getSelectSize", "ActivityOpenDirection", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarChatterPickerViewModel extends AbstractC1142af implements ICalendarChatterPickerViewModel {
    public static final Companion Companion = new Companion(null);
    private ActivityOpenDirection activityOpenDirection;
    private int chatterPickerTitleResId;
    private final ArrayList<String> disabledMemberIds;
    private boolean enableOneWayContactCheck;
    private boolean isAddMail;
    private boolean isAddOuterUser;
    private boolean isCheckPermission;
    private boolean isSearchOuterUser;
    private boolean isShowExpandMeetingChatTip;
    private boolean isShowSelectDepartmentTip;
    private final ArrayList<CalContact> notContacts;
    private final ArrayList<SearchBaseInfo> preSelectBeanInfos;
    private int searchHintTextResId;
    private final ArrayList<String> selectedChatters;
    private final ArrayList<CalDepartment> selectedDepartments;
    private final ArrayList<String> selectedEmails;
    private final ArrayList<String> selectedGroups;
    private final ArrayList<String> selectedMeetingChats;
    private C1177w<Pair<Integer, Long>> showToast = new C1177w<>(null);
    private boolean supportAddDepartment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$ActivityOpenDirection;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", "HORIZONTAL", "VERTICAL", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ActivityOpenDirection {
        HORIZONTAL(0),
        VERTICAL(1);
        
        private final int number;

        public final int getNumber() {
            return this.number;
        }

        private ActivityOpenDirection(int i) {
            this.number = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/chatterpicker/CalendarChatterPickerViewModel$Companion;", "", "()V", "CALENDAR_MEETING_ADD_TOAST_DURATION", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ActivityOpenDirection getActivityOpenDirection() {
        return this.activityOpenDirection;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public int getChatterPickerTitleResId() {
        return this.chatterPickerTitleResId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<String> getDisabledMemberIds() {
        return this.disabledMemberIds;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<CalContact> getNotContacts() {
        return this.notContacts;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<SearchBaseInfo> getPreSelectBeanInfos() {
        return this.preSelectBeanInfos;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public int getSearchHintTextResId() {
        return this.searchHintTextResId;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<String> getSelectedChatters() {
        return this.selectedChatters;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<CalDepartment> getSelectedDepartments() {
        return this.selectedDepartments;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<String> getSelectedEmails() {
        return this.selectedEmails;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<String> getSelectedGroups() {
        return this.selectedGroups;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public ArrayList<String> getSelectedMeetingChats() {
        return this.selectedMeetingChats;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public C1177w<Pair<Integer, Long>> getShowToast() {
        return this.showToast;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public boolean getSupportAddDepartment() {
        return this.supportAddDepartment;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public boolean isAddMail() {
        return this.isAddMail;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public boolean isAddOuterUser() {
        return this.isAddOuterUser;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public boolean isCheckPermission() {
        return this.isCheckPermission;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public boolean isSearchOuterUser() {
        return this.isSearchOuterUser;
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public int getSelectSize() {
        return getSelectedChatters().size() + getSelectedGroups().size() + getSelectedEmails().size() + getNotContacts().size() + getSelectedDepartments().size();
    }

    public void setAddMail(boolean z) {
        this.isAddMail = z;
    }

    public void setAddOuterUser(boolean z) {
        this.isAddOuterUser = z;
    }

    public void setChatterPickerTitleResId(int i) {
        this.chatterPickerTitleResId = i;
    }

    public void setCheckPermission(boolean z) {
        this.isCheckPermission = z;
    }

    public void setSearchHintTextResId(int i) {
        this.searchHintTextResId = i;
    }

    public void setSearchOuterUser(boolean z) {
        this.isSearchOuterUser = z;
    }

    public void setSupportAddDepartment(boolean z) {
        this.supportAddDepartment = z;
    }

    public void setActivityOpenDirection(ActivityOpenDirection activityOpenDirection2) {
        Intrinsics.checkParameterIsNotNull(activityOpenDirection2, "<set-?>");
        this.activityOpenDirection = activityOpenDirection2;
    }

    public void setShowToast(C1177w<Pair<Integer, Long>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showToast = wVar;
    }

    public CalendarChatterPickerViewModel(CalendarPickerEntranceParams calendarPickerEntranceParams) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ActivityOpenDirection activityOpenDirection2;
        ArrayList<SearchBaseInfo> preSelectBeanInfos2;
        ArrayList<String> disabledMemberIds2;
        ArrayList<String> selectGroupIds;
        ArrayList<String> selectChatterIds;
        int i = R.string.Calendar_Edit_AddGuest;
        this.chatterPickerTitleResId = R.string.Calendar_Edit_AddGuest;
        int i2 = R.string.Calendar_Common_Search;
        this.searchHintTextResId = R.string.Calendar_Common_Search;
        this.activityOpenDirection = ActivityOpenDirection.HORIZONTAL;
        this.selectedChatters = new ArrayList<>();
        this.selectedGroups = new ArrayList<>();
        this.selectedEmails = new ArrayList<>();
        this.selectedMeetingChats = new ArrayList<>();
        this.selectedDepartments = new ArrayList<>();
        this.disabledMemberIds = new ArrayList<>();
        this.notContacts = new ArrayList<>();
        this.preSelectBeanInfos = new ArrayList<>();
        setSearchHintTextResId(calendarPickerEntranceParams != null ? calendarPickerEntranceParams.getSearchHintTextResId() : i2);
        setChatterPickerTitleResId(calendarPickerEntranceParams != null ? calendarPickerEntranceParams.getChatterPickerTitleResId() : i);
        boolean z8 = false;
        if (calendarPickerEntranceParams != null) {
            z = calendarPickerEntranceParams.getNeedSearchOuterUser();
        } else {
            z = false;
        }
        setSearchOuterUser(z);
        if (calendarPickerEntranceParams != null) {
            z2 = calendarPickerEntranceParams.getNeedAddOuterUser();
        } else {
            z2 = false;
        }
        setAddOuterUser(z2);
        if (calendarPickerEntranceParams != null) {
            z3 = calendarPickerEntranceParams.isShowExpandMeetingChatTip();
        } else {
            z3 = false;
        }
        this.isShowExpandMeetingChatTip = z3;
        if (calendarPickerEntranceParams != null) {
            z4 = calendarPickerEntranceParams.isAddMail();
        } else {
            z4 = false;
        }
        setAddMail(z4);
        if (calendarPickerEntranceParams != null) {
            z5 = calendarPickerEntranceParams.getEnableOneWayContactCheck();
        } else {
            z5 = false;
        }
        this.enableOneWayContactCheck = z5;
        if (calendarPickerEntranceParams != null) {
            z6 = calendarPickerEntranceParams.isCheckPermission();
        } else {
            z6 = false;
        }
        setCheckPermission(z6);
        if (calendarPickerEntranceParams != null) {
            z7 = calendarPickerEntranceParams.getSupportAddDepartment();
        } else {
            z7 = false;
        }
        setSupportAddDepartment(z7);
        this.isShowSelectDepartmentTip = calendarPickerEntranceParams != null ? calendarPickerEntranceParams.isShowSelectDepartmentTip() : z8;
        if (!(calendarPickerEntranceParams == null || (selectChatterIds = calendarPickerEntranceParams.getSelectChatterIds()) == null)) {
            getSelectedChatters().addAll(selectChatterIds);
        }
        if (!(calendarPickerEntranceParams == null || (selectGroupIds = calendarPickerEntranceParams.getSelectGroupIds()) == null)) {
            getSelectedGroups().addAll(selectGroupIds);
        }
        if (!(calendarPickerEntranceParams == null || (disabledMemberIds2 = calendarPickerEntranceParams.getDisabledMemberIds()) == null)) {
            getDisabledMemberIds().addAll(disabledMemberIds2);
        }
        if (!(calendarPickerEntranceParams == null || (preSelectBeanInfos2 = calendarPickerEntranceParams.getPreSelectBeanInfos()) == null)) {
            getPreSelectBeanInfos().addAll(preSelectBeanInfos2);
        }
        setActivityOpenDirection((calendarPickerEntranceParams == null || (activityOpenDirection2 = calendarPickerEntranceParams.getActivityOpenDirection()) == null) ? ActivityOpenDirection.HORIZONTAL : activityOpenDirection2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public void deleteSelectChatter(String str, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        if (searchBaseInfo instanceof SearchChatterInfo) {
            getSelectedChatters().remove(str);
            Iterator<CalContact> it = getNotContacts().iterator();
            while (it.hasNext()) {
                CalContact next = it.next();
                if (Intrinsics.areEqual(str, next.getChatterId())) {
                    getNotContacts().remove(next);
                    return;
                }
            }
        } else if (searchBaseInfo instanceof SearchChatInfo) {
            getSelectedGroups().remove(str);
        } else if (searchBaseInfo instanceof EmailInfo) {
            getSelectedEmails().remove(str);
        } else if (searchBaseInfo instanceof SearchDepartmentInfo) {
            ArrayList<CalDepartment> selectedDepartments2 = getSelectedDepartments();
            String title = ((SearchDepartmentInfo) searchBaseInfo).getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, "info.title");
            selectedDepartments2.remove(new CalDepartment(str, title));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.ICalendarChatterPickerViewModel
    public void addSelectChatter(String str, SearchBaseInfo searchBaseInfo) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        if (getSelectedChatters().size() + getSelectedGroups().size() + getSelectedEmails().size() + getDisabledMemberIds().size() + getNotContacts().size() >= 100) {
            getShowToast().mo5929b(new Pair<>(Integer.valueOf((int) R.string.Lark_Legacy_AddGuestLimit), -1L));
        } else if (!getDisabledMemberIds().contains(searchBaseInfo.getId())) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                SearchChatterInfo searchChatterInfo = (SearchChatterInfo) searchBaseInfo;
                if (searchChatterInfo.isNotContact()) {
                    int size = getNotContacts().size();
                    AbstractC30046i contactModuleDependency = C30022a.f74882a.contactModuleDependency();
                    Intrinsics.checkExpressionValueIsNotNull(contactModuleDependency, "CalendarDependencyHolder…contactModuleDependency()");
                    if (size > contactModuleDependency.mo108228a()) {
                        getShowToast().mo5929b(new Pair<>(Integer.valueOf((int) R.string.Lark_NewContacts_PermissionRequestSelectUserMax), -1L));
                        return;
                    }
                }
                if (!this.enableOneWayContactCheck || !searchChatterInfo.isNotContact()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!getSelectedChatters().contains(str) && !z) {
                    getSelectedChatters().add(str);
                }
                String avatarKey = searchChatterInfo.getAvatarKey();
                Intrinsics.checkExpressionValueIsNotNull(avatarKey, "info.avatarKey");
                String title = searchChatterInfo.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "info.title");
                CalContact calContact = new CalContact(str, avatarKey, title);
                if (!getNotContacts().contains(calContact) && z) {
                    getNotContacts().add(calContact);
                }
            } else if (searchBaseInfo instanceof SearchChatInfo) {
                if (((SearchChatInfo) searchBaseInfo).isMeeting()) {
                    if (!getSelectedMeetingChats().contains(str)) {
                        getSelectedMeetingChats().add(str);
                    }
                    if (this.isShowExpandMeetingChatTip) {
                        getShowToast().mo5929b(new Pair<>(Integer.valueOf((int) R.string.Calendar_Meeting_AddToastMobile), 3000L));
                    }
                }
                if (!getSelectedGroups().contains(str)) {
                    getSelectedGroups().add(str);
                }
            } else if (searchBaseInfo instanceof EmailInfo) {
                if (!getSelectedEmails().contains(str)) {
                    getSelectedEmails().add(str);
                }
            } else if (searchBaseInfo instanceof SearchDepartmentInfo) {
                String title2 = ((SearchDepartmentInfo) searchBaseInfo).getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title2, "info.title");
                CalDepartment calDepartment = new CalDepartment(str, title2);
                if (!getSelectedDepartments().contains(calDepartment)) {
                    getSelectedDepartments().add(calDepartment);
                }
                if (this.isShowSelectDepartmentTip) {
                    getShowToast().mo5929b(new Pair<>(Integer.valueOf((int) R.string.Calendar_Edit_DepartmentMemberWillJoinEvent), 3000L));
                }
            }
        }
    }
}
