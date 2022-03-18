package com.ss.android.lark.calendar.impl.features.calendars.share.picker;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarMemberPickerData;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.CalendarShareExtraParam;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.data.ShareState;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020)H\u0002J\u0010\u00104\u001a\u00020,2\b\u00105\u001a\u0004\u0018\u000106J\b\u00107\u001a\u00020,H\u0016J$\u00108\u001a\u00020,2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00100:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00100:H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020)0!X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/ICalendarMemberPickerViewModel;", "()V", "calendarPickerParam", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "getCalendarPickerParam", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;", "setCalendarPickerParam", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarMemberPickerData;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "disabledMemberIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getDisabledMemberIds", "()Ljava/util/ArrayList;", "setDisabledMemberIds", "(Ljava/util/ArrayList;)V", "pickerCalendarData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "getPickerCalendarData", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;", "setPickerCalendarData", "(Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/CalendarShareExtraParam;)V", "selectedChatters", "getSelectedChatters", "selectedGroups", "getSelectedGroups", "shareStateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/picker/data/ShareState;", "getShareStateLiveData", "()Landroidx/lifecycle/MutableLiveData;", "showMemberConfirmFragment", "", "getShowMemberConfirmFragment", "subscriberShareCalendarLiveData", "", "getSubscriberShareCalendarLiveData", "addSelectChatter", "", "id", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "deleteSelectChatter", "getSelectSize", "", "hasOwnerAccess", "init", "bundle", "Landroid/os/Bundle;", "onNextActionClicked", "updateSelectIds", "userIds", "", "groupIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.c */
public final class CalendarMemberPickerViewModel extends AbstractC1142af implements ICalendarMemberPickerViewModel {
    private CalendarMemberPickerData calendarPickerParam;
    private final CallbackManager callbackManager = new CallbackManager();
    private ArrayList<String> disabledMemberIds = new ArrayList<>();
    private CalendarShareExtraParam pickerCalendarData;
    private final ArrayList<String> selectedChatters = new ArrayList<>();
    private final ArrayList<String> selectedGroups = new ArrayList<>();
    private final C1177w<ShareState> shareStateLiveData = new C1177w<>();
    private final C1177w<Object> showMemberConfirmFragment = new C1177w<>();
    private final C1177w<Boolean> subscriberShareCalendarLiveData = new C1177w<>();

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public CalendarMemberPickerData getCalendarPickerParam() {
        return this.calendarPickerParam;
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public ArrayList<String> getDisabledMemberIds() {
        return this.disabledMemberIds;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public CalendarShareExtraParam getPickerCalendarData() {
        return this.pickerCalendarData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public ArrayList<String> getSelectedChatters() {
        return this.selectedChatters;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public ArrayList<String> getSelectedGroups() {
        return this.selectedGroups;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public C1177w<ShareState> getShareStateLiveData() {
        return this.shareStateLiveData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public C1177w<Object> getShowMemberConfirmFragment() {
        return this.showMemberConfirmFragment;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public C1177w<Boolean> getSubscriberShareCalendarLiveData() {
        return this.subscriberShareCalendarLiveData;
    }

    private final boolean hasOwnerAccess() {
        Calendar.AccessRole accessRole;
        CalendarShareExtraParam pickerCalendarData2 = getPickerCalendarData();
        if (pickerCalendarData2 != null) {
            accessRole = pickerCalendarData2.getCalendarSelfAccessRole();
        } else {
            accessRole = null;
        }
        if (accessRole == Calendar.AccessRole.OWNER) {
            return true;
        }
        return false;
    }

    public int getSelectSize() {
        return getSelectedChatters().size() + getSelectedGroups().size();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public void onNextActionClicked() {
        if (getSelectSize() > 0) {
            if (hasOwnerAccess()) {
                CalendarMemberPickerData calendarPickerParam2 = getCalendarPickerParam();
                String str = null;
                if (calendarPickerParam2 == null || !calendarPickerParam2.isFromCalendarCreate()) {
                    CalendarShareExtraParam pickerCalendarData2 = getPickerCalendarData();
                    if (pickerCalendarData2 != null) {
                        str = pickerCalendarData2.getCalendarId();
                    }
                    C32502i.m124382b(str, hasOwnerAccess(), "next");
                } else {
                    CalendarDetailHitPoint bVar = CalendarDetailHitPoint.f83361a;
                    CalendarShareExtraParam pickerCalendarData3 = getPickerCalendarData();
                    if (pickerCalendarData3 != null) {
                        str = pickerCalendarData3.getCalendarId();
                    }
                    bVar.mo118751d(str, "next");
                }
                getShowMemberConfirmFragment().mo5929b((Object) true);
                return;
            }
            getShareStateLiveData().mo5929b(new ShareState(ShareState.STATE.LOADING, null, false, 6, null));
            CalendarShareExtraParam pickerCalendarData4 = getPickerCalendarData();
            if (pickerCalendarData4 != null) {
                UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C30535a(this));
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
                CalendarSDKService.f83473a.mo118960c(pickerCalendarData4.getCalendarId(), getSelectedChatters(), getSelectedGroups(), wrapAndAddGetDataCallback);
                C32502i.m124382b(pickerCalendarData4.getCalendarId(), hasOwnerAccess(), "share");
            }
        }
    }

    public void setCalendarPickerParam(CalendarMemberPickerData calendarMemberPickerData) {
        this.calendarPickerParam = calendarMemberPickerData;
    }

    public void setPickerCalendarData(CalendarShareExtraParam calendarShareExtraParam) {
        this.pickerCalendarData = calendarShareExtraParam;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/picker/CalendarMemberPickerViewModel$onNextActionClicked$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.picker.c$a */
    public static final class C30535a implements IGetDataCallback<Object> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberPickerViewModel f76373a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30535a(CalendarMemberPickerViewModel cVar) {
            this.f76373a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public void onSuccess(Object obj) {
            this.f76373a.getShareStateLiveData().mo5929b(new ShareState(ShareState.STATE.SUCCESS, null, false, 6, null));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            String str;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (errorResult.getErrorCode() != 8099) {
                str = C32634ae.m125182b(R.string.Calendar_Share_FaildTip);
            } else {
                str = errorResult.getDisplayMsg();
            }
            this.f76373a.getShareStateLiveData().mo5929b(new ShareState(ShareState.STATE.FAILED, str, false, 4, null));
        }
    }

    public void setDisabledMemberIds(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.disabledMemberIds = arrayList;
    }

    public final void init(Bundle bundle) {
        Serializable serializable;
        CalendarShareExtraParam calendarShareExtraParam;
        ArrayList<String> disableSelectIds;
        String str = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("param_calendar_share_info");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof CalendarMemberPickerData)) {
            serializable = null;
        }
        setCalendarPickerParam((CalendarMemberPickerData) serializable);
        CalendarMemberPickerData calendarPickerParam2 = getCalendarPickerParam();
        if (!(calendarPickerParam2 == null || (disableSelectIds = calendarPickerParam2.getDisableSelectIds()) == null)) {
            setDisabledMemberIds(disableSelectIds);
        }
        CalendarMemberPickerData calendarPickerParam3 = getCalendarPickerParam();
        if (!(calendarPickerParam3 == null || (calendarShareExtraParam = calendarPickerParam3.getCalendarShareExtraParam()) == null)) {
            setPickerCalendarData(calendarShareExtraParam);
        }
        CalendarMemberPickerData calendarPickerParam4 = getCalendarPickerParam();
        if (calendarPickerParam4 == null || !calendarPickerParam4.isFromCalendarCreate()) {
            CalendarShareExtraParam pickerCalendarData2 = getPickerCalendarData();
            if (pickerCalendarData2 != null) {
                str = pickerCalendarData2.getCalendarId();
            }
            C32502i.m124381b(str, hasOwnerAccess());
            return;
        }
        CalendarDetailHitPoint bVar = CalendarDetailHitPoint.f83361a;
        CalendarShareExtraParam pickerCalendarData3 = getPickerCalendarData();
        if (pickerCalendarData3 != null) {
            str = pickerCalendarData3.getCalendarId();
        }
        bVar.mo118748b(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public void deleteSelectChatter(String str, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        if (searchBaseInfo instanceof SearchChatterInfo) {
            getSelectedChatters().remove(str);
        } else if (searchBaseInfo instanceof SearchChatInfo) {
            getSelectedGroups().remove(str);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public void updateSelectIds(List<String> list, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "userIds");
        Intrinsics.checkParameterIsNotNull(list2, "groupIds");
        getSelectedChatters().clear();
        getSelectedChatters().addAll(list);
        getSelectedGroups().clear();
        getSelectedGroups().addAll(list2);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.share.picker.ICalendarMemberPickerViewModel
    public void addSelectChatter(String str, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        if (!getDisabledMemberIds().contains(searchBaseInfo.getId())) {
            if (searchBaseInfo instanceof SearchChatterInfo) {
                if (!getSelectedChatters().contains(str)) {
                    getSelectedChatters().add(str);
                }
            } else if ((searchBaseInfo instanceof SearchChatInfo) && !getSelectedGroups().contains(str)) {
                getSelectedGroups().add(str);
            }
        }
    }
}
