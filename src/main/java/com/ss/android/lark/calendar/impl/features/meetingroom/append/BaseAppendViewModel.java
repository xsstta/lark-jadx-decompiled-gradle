package com.ss.android.lark.calendar.impl.features.meetingroom.append;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32065c;
import com.ss.android.lark.calendar.impl.features.meetingroom.helper.NeedApprovalType;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010K\u001a\u00020L2\b\u0010,\u001a\u0004\u0018\u00010-J\u0010\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020OH\u0004J\b\u0010P\u001a\u00020LH\u0016J\u0018\u0010Q\u001a\u00020L2\u0006\u0010R\u001a\u00020S2\u0006\u0010N\u001a\u00020OH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R,\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000b0\u001f0\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010+\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R*\u00105\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`8X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010=\u001a\u0012\u0012\u0004\u0012\u00020706j\b\u0012\u0004\u0012\u000207`8X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R*\u0010@\u001a\u0012\u0012\u0004\u0012\u00020!06j\b\u0012\u0004\u0012\u00020!`8X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u001a\u0010C\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u001a\u0010F\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010#¨\u0006T"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/IBaseAppendViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "capacity", "", "getCapacity", "()I", "setCapacity", "(I)V", "equipments", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "getEquipments", "()Ljava/util/List;", "setEquipments", "(Ljava/util/List;)V", "eventDuration", "", "getEventDuration", "()J", "eventEndTime", "getEventEndTime", "eventRRule", "", "getEventRRule", "()Ljava/lang/String;", "eventStartTime", "getEventStartTime", "finishWithResourceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "getFinishWithResourceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "inputSearchText", "getInputSearchText", "setInputSearchText", "(Ljava/lang/String;)V", "isDisableApprovalMeetingRoom", "()Z", "isRepeatOrExceptionEvent", "isShowMultiSelect", "resourceAppendData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "getResourceAppendData", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "setResourceAppendData", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;)V", "resourceDisplayStatus", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "getResourceDisplayStatus", "searchFreeItemModelList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "Lkotlin/collections/ArrayList;", "getSearchFreeItemModelList", "()Ljava/util/ArrayList;", "setSearchFreeItemModelList", "(Ljava/util/ArrayList;)V", "searchItemModelList", "getSearchItemModelList", "setSearchItemModelList", "searchMeetingRoomItems", "getSearchMeetingRoomItems", "setSearchMeetingRoomItems", "searchRoomCounter", "getSearchRoomCounter", "setSearchRoomCounter", "selectModel", "getSelectModel", "setSelectModel", "toastLiveData", "getToastLiveData", "init", "", "onSelectSingleResource", "meetingRoomModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "refresh", "showApprovalLimitToast", "needApprovalType", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/helper/NeedApprovalType;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.b */
public abstract class BaseAppendViewModel extends AbstractC1142af implements IBaseAppendViewModel {
    private int capacity;
    private List<EquipmentData> equipments = CollectionsKt.emptyList();
    private final C1177w<Pair<Boolean, List<AppendResourceData>>> finishWithResourceLiveData = new C1177w<>();
    private String inputSearchText = "";
    private ResourceAppendFragmentData resourceAppendData;
    private final C1177w<ResourceDisplayStatus> resourceDisplayStatus = new C1177w<>();
    private ArrayList<BaseModel> searchFreeItemModelList = new ArrayList<>();
    private ArrayList<BaseModel> searchItemModelList = new ArrayList<>();
    private ArrayList<AppendResourceData> searchMeetingRoomItems = new ArrayList<>();
    private int searchRoomCounter;
    private int selectModel;
    private final C1177w<String> toastLiveData = new C1177w<>();

    public void refresh() {
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final List<EquipmentData> getEquipments() {
        return this.equipments;
    }

    public C1177w<Pair<Boolean, List<AppendResourceData>>> getFinishWithResourceLiveData() {
        return this.finishWithResourceLiveData;
    }

    public final String getInputSearchText() {
        return this.inputSearchText;
    }

    public final ResourceAppendFragmentData getResourceAppendData() {
        return this.resourceAppendData;
    }

    public C1177w<ResourceDisplayStatus> getResourceDisplayStatus() {
        return this.resourceDisplayStatus;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<BaseModel> getSearchFreeItemModelList() {
        return this.searchFreeItemModelList;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<BaseModel> getSearchItemModelList() {
        return this.searchItemModelList;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<AppendResourceData> getSearchMeetingRoomItems() {
        return this.searchMeetingRoomItems;
    }

    public final int getSearchRoomCounter() {
        return this.searchRoomCounter;
    }

    /* access modifiers changed from: protected */
    public final int getSelectModel() {
        return this.selectModel;
    }

    public C1177w<String> getToastLiveData() {
        return this.toastLiveData;
    }

    public final boolean isDisableApprovalMeetingRoom() {
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData != null) {
            return resourceAppendFragmentData.isDisableApprovalMeetingRoom();
        }
        return false;
    }

    public final long getEventDuration() {
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData != null) {
            return resourceAppendFragmentData.getEventData().getEventEndTime() - resourceAppendFragmentData.getEventData().getEventStartTime();
        }
        return 0;
    }

    public final long getEventEndTime() {
        EventData eventData;
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData == null || (eventData = resourceAppendFragmentData.getEventData()) == null) {
            return 0;
        }
        return eventData.getEventEndTime();
    }

    public final String getEventRRule() {
        EventData eventData;
        String rRule;
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData == null || (eventData = resourceAppendFragmentData.getEventData()) == null || (rRule = eventData.getRRule()) == null) {
            return "";
        }
        return rRule;
    }

    public final long getEventStartTime() {
        EventData eventData;
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData == null || (eventData = resourceAppendFragmentData.getEventData()) == null) {
            return 0;
        }
        return eventData.getEventStartTime();
    }

    public final boolean isShowMultiSelect() {
        ResourceAppendFragmentData resourceAppendFragmentData = this.resourceAppendData;
        if (resourceAppendFragmentData == null || !resourceAppendFragmentData.isShowMultiSelect() || !C30022a.f74883b.mo112715w()) {
            return false;
        }
        return true;
    }

    public final boolean isRepeatOrExceptionEvent() {
        String str;
        boolean z;
        ResourceAppendFragmentData resourceAppendFragmentData;
        EventData eventData;
        EventData eventData2;
        ResourceAppendFragmentData resourceAppendFragmentData2 = this.resourceAppendData;
        if (resourceAppendFragmentData2 == null || (eventData2 = resourceAppendFragmentData2.getEventData()) == null) {
            str = null;
        } else {
            str = eventData2.getRRule();
        }
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (resourceAppendFragmentData = this.resourceAppendData) == null || (eventData = resourceAppendFragmentData.getEventData()) == null || eventData.getOriginalTime() != 0) {
            return true;
        }
        return false;
    }

    public final void init(ResourceAppendFragmentData resourceAppendFragmentData) {
        this.resourceAppendData = resourceAppendFragmentData;
    }

    public final void setCapacity(int i) {
        this.capacity = i;
    }

    public final void setResourceAppendData(ResourceAppendFragmentData resourceAppendFragmentData) {
        this.resourceAppendData = resourceAppendFragmentData;
    }

    public final void setSearchRoomCounter(int i) {
        this.searchRoomCounter = i;
    }

    /* access modifiers changed from: protected */
    public final void setSelectModel(int i) {
        this.selectModel = i;
    }

    public final void setEquipments(List<EquipmentData> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.equipments = list;
    }

    public final void setInputSearchText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.inputSearchText = str;
    }

    /* access modifiers changed from: protected */
    public final void setSearchFreeItemModelList(ArrayList<BaseModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.searchFreeItemModelList = arrayList;
    }

    /* access modifiers changed from: protected */
    public final void setSearchItemModelList(ArrayList<BaseModel> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.searchItemModelList = arrayList;
    }

    /* access modifiers changed from: protected */
    public final void setSearchMeetingRoomItems(ArrayList<AppendResourceData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.searchMeetingRoomItems = arrayList;
    }

    /* access modifiers changed from: protected */
    public final void onSelectSingleResource(MeetingRoomModel meetingRoomModel) {
        Intrinsics.checkParameterIsNotNull(meetingRoomModel, "meetingRoomModel");
        if (meetingRoomModel.mo116771h().getFirst().booleanValue()) {
            showApprovalLimitToast(meetingRoomModel.mo116771h().getSecond(), meetingRoomModel);
        } else {
            getFinishWithResourceLiveData().mo5929b(TuplesKt.to(true, CollectionsKt.listOf(meetingRoomModel.mo116770g())));
        }
    }

    private final void showApprovalLimitToast(NeedApprovalType needApprovalType, MeetingRoomModel meetingRoomModel) {
        int i = C32003c.f81852a[needApprovalType.ordinal()];
        if (i == 1) {
            getToastLiveData().mo5929b(C32634ae.m125182b(R.string.Calendar_Approval_ExplainNo));
        } else if (i == 2) {
            getToastLiveData().mo5929b(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Rooms_CantReserveOverTime, "num", C32065c.m121946a(C32065c.m121951b(meetingRoomModel.mo116770g().mo116888b()))));
        }
    }
}
