package com.ss.android.lark.calendar.impl.features.meetingroom.form;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationRequest;
import com.bytedance.lark.pb.calendar.v1.ParseCustomizedConfigurationResponse;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.data.ResourceFormUIData;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.MeetingRoomFormHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.helper.ResourceDataHelper;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u00100\u001a\u00020\u000eH\u0002J\u0006\u00101\u001a\u000202J\b\u00103\u001a\u000202H\u0002J\u0006\u00104\u001a\u00020\u0006J(\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010\u0012H\u0002J\u0018\u0010:\u001a\u0002022\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u0012H\u0002J\u0010\u0010=\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0016H\u0002J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0016H\u0002J\u0006\u0010?\u001a\u000202J\b\u0010@\u001a\u000202H\u0016J\b\u0010A\u001a\u000202H\u0016J\u0010\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u0004H\u0016J\b\u0010D\u001a\u000202H\u0016J\u0018\u0010E\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016J\u0018\u0010G\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004H\u0016J\u0018\u0010H\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0016J\u0018\u0010J\u001a\u0002022\u0006\u00107\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0004H\u0016J\u0016\u0010K\u001a\u0002022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010L\u001a\u0002022\u0006\u0010;\u001a\u00020\u0016H\u0002J\u0010\u0010M\u001a\u0002022\u0006\u0010;\u001a\u00020\u0016H\u0002J\b\u0010N\u001a\u000202H\u0002J\b\u0010O\u001a\u000202H\u0002J\b\u0010P\u001a\u000202H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00130\u00120\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012X\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0010R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0010R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020/0!X\u000e¢\u0006\u0002\n\u0000¨\u0006Q"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormViewModel;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/IMeetingRoomFormViewModel;", "Landroidx/lifecycle/ViewModel;", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "canClickComplete", "Landroidx/lifecycle/MutableLiveData;", "", "getCanClickComplete", "()Landroidx/lifecycle/MutableLiveData;", "contactIdLiveData", "", "Lkotlin/Pair;", "getContactIdLiveData", "currentShowFormList", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationData$Builder;", "formListData", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/data/ResourceFormUIData;", "getFormListData", "hasEdit", "getHasEdit", "()Z", "setHasEdit", "(Z)V", "inputContentMap", "", "quitActivityWithResult", "getQuitActivityWithResult", "getResourceCustomization", "()Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "setResourceCustomization", "(Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;)V", "routeProfileLiveData", "getRouteProfileLiveData", "showSaveNotifyDialog", "", "getShowSaveNotifyDialog", "subOptionOtherContentMap", "userInputsMap", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationRequest$SelectedKeys$Builder;", "checkRequireCustomizationComplete", "create", "", "fetchContactChatter", "getResultCustomizationData", "initOptionUserInput", "isSingle", "customizationKey", "options", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationOption;", "initUserInputMap", "customizationData", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$CustomizationData;", "isMultipleOptionComplete", "isSingleOptionComplete", "onBackPressed", "onCancelBtClicked", "onClickConfirmExitWithoutSave", "onClickContactName", BottomDialog.f17198f, "onCompleteBtClicked", "onEditInputCustomization", "inputContent", "onEditOtherOptionInput", "onMultipleOptionSelected", "optionKey", "onSingleOptionSelected", "refreshBaseData", "setInputCustomization", "setSelectInput", "setUserInput", "triggerRefreshForm", "updateCustomizationList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.c */
public final class MeetingRoomFormViewModel extends AbstractC1142af {
    private String calendarId;
    private final C1177w<Boolean> canClickComplete = new C1177w<>();
    private final C1177w<List<Pair<String, String>>> contactIdLiveData = new C1177w<>();
    private List<SchemaExtraData.CustomizationData.C16002a> currentShowFormList = new ArrayList();
    private final C1177w<List<ResourceFormUIData>> formListData = new C1177w<>();
    private boolean hasEdit;
    private Map<String, String> inputContentMap = new HashMap();
    private final C1177w<Boolean> quitActivityWithResult = new C1177w<>();
    private SchemaExtraData.ResourceCustomization resourceCustomization;
    private final C1177w<String> routeProfileLiveData = new C1177w<>();
    private final C1177w<Object> showSaveNotifyDialog = new C1177w<>();
    private Map<String, String> subOptionOtherContentMap = new HashMap();
    private Map<String, ParseCustomizedConfigurationRequest.SelectedKeys.C15898a> userInputsMap = new HashMap();

    public final String getCalendarId() {
        return this.calendarId;
    }

    public C1177w<Boolean> getCanClickComplete() {
        return this.canClickComplete;
    }

    public C1177w<List<Pair<String, String>>> getContactIdLiveData() {
        return this.contactIdLiveData;
    }

    public C1177w<List<ResourceFormUIData>> getFormListData() {
        return this.formListData;
    }

    public final boolean getHasEdit() {
        return this.hasEdit;
    }

    public C1177w<Boolean> getQuitActivityWithResult() {
        return this.quitActivityWithResult;
    }

    public final SchemaExtraData.ResourceCustomization getResourceCustomization() {
        return this.resourceCustomization;
    }

    public C1177w<String> getRouteProfileLiveData() {
        return this.routeProfileLiveData;
    }

    public C1177w<Object> getShowSaveNotifyDialog() {
        return this.showSaveNotifyDialog;
    }

    public void onCancelBtClicked() {
        onBackPressed();
    }

    private final void triggerRefreshForm() {
        getFormListData().mo5926a(ResourceDataHelper.f82035a.mo117091a(this.currentShowFormList));
    }

    public void onClickConfirmExitWithoutSave() {
        getQuitActivityWithResult().mo5926a((Boolean) false);
    }

    public void onCompleteBtClicked() {
        getQuitActivityWithResult().mo5926a((Boolean) true);
    }

    private final void fetchContactChatter() {
        List<String> list;
        List<String> mutableList;
        SchemaExtraData.ResourceCustomization resourceCustomization2 = this.resourceCustomization;
        if (resourceCustomization2 != null && (list = resourceCustomization2.contact_ids) != null && (mutableList = CollectionsKt.toMutableList((Collection) list)) != null) {
            CalendarSDKService.f83473a.mo118961c(mutableList, new C32095a(this, mutableList));
        }
    }

    private final void setUserInput() {
        for (T t : this.currentShowFormList) {
            setSelectInput(t);
            setInputCustomization(t);
        }
    }

    public final void create() {
        fetchContactChatter();
        updateCustomizationList();
        getCanClickComplete().mo5926a(Boolean.valueOf(checkRequireCustomizationComplete()));
    }

    public final void onBackPressed() {
        if (!this.hasEdit) {
            getQuitActivityWithResult().mo5926a((Boolean) false);
        } else {
            getShowSaveNotifyDialog().mo5926a((Object) null);
        }
    }

    private final boolean checkRequireCustomizationComplete() {
        SchemaExtraData.CustomizationType customizationType;
        Iterator<T> it = this.currentShowFormList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return true;
            }
            T next = it.next();
            Boolean bool = next.f42028b;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_required");
            if (bool.booleanValue() && (customizationType = next.f42027a) != null) {
                int i = C32096d.f82040b[customizationType.ordinal()];
                if (i == 1) {
                    String str = next.f42033g;
                    if (!(str == null || str.length() == 0)) {
                        z = false;
                    }
                    if (z) {
                        return false;
                    }
                } else if (i != 2) {
                    if (i == 3 && !isMultipleOptionComplete(next)) {
                        return false;
                    }
                } else if (!isSingleOptionComplete(next)) {
                    return false;
                }
            }
        }
    }

    private final void updateCustomizationList() {
        List<SchemaExtraData.CustomizationData> list;
        SchemaExtraData.ResourceCustomization resourceCustomization2 = this.resourceCustomization;
        if (!(resourceCustomization2 == null || (list = resourceCustomization2.customization_data) == null)) {
            Map<String, ParseCustomizedConfigurationRequest.SelectedKeys.C15898a> map = this.userInputsMap;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            for (T t : map.entrySet()) {
                linkedHashMap.put(t.getKey(), ((ParseCustomizedConfigurationRequest.SelectedKeys.C15898a) t.getValue()).build());
            }
            List<SchemaExtraData.CustomizationData> list2 = CalendarSDKService.f83473a.mo118916a(list, linkedHashMap).ui_layer_customization;
            MeetingRoomFormHelper aVar = MeetingRoomFormHelper.f82028a;
            Intrinsics.checkExpressionValueIsNotNull(list2, "showList");
            List<SchemaExtraData.CustomizationData> a = aVar.mo117085a(list2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a, 10));
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().newBuilder());
            }
            this.currentShowFormList = arrayList;
            setUserInput();
            triggerRefreshForm();
        }
    }

    public final SchemaExtraData.ResourceCustomization getResultCustomizationData() {
        SchemaExtraData.ResourceCustomization.C16010a newBuilder = this.resourceCustomization.newBuilder();
        setUserInput();
        List<SchemaExtraData.CustomizationData.C16002a> list = this.currentShowFormList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (T t : list) {
            arrayList.add(TuplesKt.to(t.f42030d, t.build()));
        }
        Map map = MapsKt.toMap(arrayList);
        List<SchemaExtraData.CustomizationData> list2 = newBuilder.f42045a;
        Intrinsics.checkExpressionValueIsNotNull(list2, "builder.customization_data");
        List<SchemaExtraData.CustomizationData> list3 = list2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (T t2 : list3) {
            if (map.get(t2.index_key) != null) {
                t2 = (T) ((SchemaExtraData.CustomizationData) map.get(t2.index_key));
            }
            arrayList2.add(t2);
        }
        newBuilder.f42045a = arrayList2;
        SchemaExtraData.ResourceCustomization a = newBuilder.build();
        Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
        return a;
    }

    public final void setHasEdit(boolean z) {
        this.hasEdit = z;
    }

    public final void setCalendarId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.calendarId = str;
    }

    public final void setResourceCustomization(SchemaExtraData.ResourceCustomization resourceCustomization2) {
        Intrinsics.checkParameterIsNotNull(resourceCustomization2, "<set-?>");
        this.resourceCustomization = resourceCustomization2;
    }

    public void onClickContactName(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        getRouteProfileLiveData().mo5926a(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormViewModel$fetchContactChatter$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/calendar/v1/ParseCustomizedConfigurationResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.form.c$a */
    public static final class C32095a implements IGetDataCallback<ParseCustomizedConfigurationResponse> {

        /* renamed from: a */
        final /* synthetic */ MeetingRoomFormViewModel f82037a;

        /* renamed from: b */
        final /* synthetic */ List f82038b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82037a.getContactIdLiveData().mo5926a(new ArrayList());
        }

        /* renamed from: a */
        public void onSuccess(ParseCustomizedConfigurationResponse parseCustomizedConfigurationResponse) {
            boolean z;
            boolean z2;
            ArrayList arrayList = new ArrayList();
            Map<String, String> map = parseCustomizedConfigurationResponse != null ? parseCustomizedConfigurationResponse.chatters : null;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f82037a.getContactIdLiveData().mo5926a(arrayList);
                return;
            }
            for (String str : this.f82038b) {
                String str2 = map.get(str);
                if (str2 != null) {
                    if (str2.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList.add(new Pair(str, str2));
                    }
                }
            }
            MapsKt.toList(map);
            this.f82037a.getContactIdLiveData().mo5926a(arrayList);
        }

        C32095a(MeetingRoomFormViewModel cVar, List list) {
            this.f82037a = cVar;
            this.f82038b = list;
        }
    }

    private final void setInputCustomization(SchemaExtraData.CustomizationData.C16002a aVar) {
        if (aVar.f42027a == SchemaExtraData.CustomizationType.Input) {
            String str = this.inputContentMap.get(aVar.f42030d);
            if (str == null) {
                str = "";
            }
            aVar.f42033g = str;
        }
    }

    private final void initUserInputMap(List<SchemaExtraData.CustomizationData> list) {
        if (list != null) {
            for (T t : list) {
                SchemaExtraData.CustomizationType customizationType = t.customization_type;
                if (customizationType != null) {
                    int i = C32096d.f82039a[customizationType.ordinal()];
                    if (i == 1) {
                        Map<String, String> map = this.inputContentMap;
                        String str = t.index_key;
                        Intrinsics.checkExpressionValueIsNotNull(str, "it.index_key");
                        String str2 = t.input_content;
                        Intrinsics.checkExpressionValueIsNotNull(str2, "it.input_content");
                        map.put(str, str2);
                    } else if (i == 2) {
                        String str3 = t.index_key;
                        Intrinsics.checkExpressionValueIsNotNull(str3, "it.index_key");
                        initOptionUserInput(true, str3, t.options);
                    } else if (i == 3) {
                        String str4 = t.index_key;
                        Intrinsics.checkExpressionValueIsNotNull(str4, "it.index_key");
                        initOptionUserInput(false, str4, t.options);
                    }
                }
            }
        }
    }

    private final boolean isMultipleOptionComplete(SchemaExtraData.CustomizationData.C16002a aVar) {
        boolean z;
        List<SchemaExtraData.CustomizationOption> list = aVar.f42031e;
        Intrinsics.checkExpressionValueIsNotNull(list, "customizationData.options");
        boolean z2 = false;
        for (T t : list) {
            Boolean bool = t.is_selected;
            Intrinsics.checkExpressionValueIsNotNull(bool, "option.is_selected");
            if (bool.booleanValue()) {
                if (Intrinsics.areEqual((Object) t.is_others, (Object) true)) {
                    String str = t.others_content;
                    if (str == null || str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return false;
                    }
                }
                z2 = true;
            }
        }
        return z2;
    }

    private final boolean isSingleOptionComplete(SchemaExtraData.CustomizationData.C16002a aVar) {
        boolean z;
        List<SchemaExtraData.CustomizationOption> list = aVar.f42031e;
        Intrinsics.checkExpressionValueIsNotNull(list, "customizationData.options");
        for (T t : list) {
            Boolean bool = t.is_selected;
            Intrinsics.checkExpressionValueIsNotNull(bool, "singleOption.is_selected");
            if (bool.booleanValue()) {
                if (Intrinsics.areEqual((Object) t.is_others, (Object) true)) {
                    String str = t.others_content;
                    if (str == null || str.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setSelectInput(com.bytedance.lark.pb.calendar.v1.SchemaExtraData.CustomizationData.C16002a r8) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormViewModel.setSelectInput(com.bytedance.lark.pb.calendar.v1.SchemaExtraData$CustomizationData$a):void");
    }

    public MeetingRoomFormViewModel(String str, SchemaExtraData.ResourceCustomization resourceCustomization2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization2, "resourceCustomization");
        this.calendarId = str;
        this.resourceCustomization = resourceCustomization2;
    }

    public void onEditInputCustomization(String str, String str2) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "customizationKey");
        Intrinsics.checkParameterIsNotNull(str2, "inputContent");
        if (!Intrinsics.areEqual(this.inputContentMap.get(str), str2)) {
            this.hasEdit = true;
        }
        this.inputContentMap.put(str, str2);
        Iterator<T> it = this.currentShowFormList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.f42030d, str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.f42033g = str2;
        }
        getCanClickComplete().mo5926a(Boolean.valueOf(checkRequireCustomizationComplete()));
    }

    public void onEditOtherOptionInput(String str, String str2) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "customizationKey");
        Intrinsics.checkParameterIsNotNull(str2, "inputContent");
        if (!Intrinsics.areEqual(this.subOptionOtherContentMap.get(str), str2)) {
            this.hasEdit = true;
        }
        this.subOptionOtherContentMap.put(str, str2);
        Iterator<T> it = this.currentShowFormList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.f42030d, str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            setSelectInput(t2);
        }
        getCanClickComplete().mo5926a(Boolean.valueOf(checkRequireCustomizationComplete()));
    }

    public void onMultipleOptionSelected(String str, String str2) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        Intrinsics.checkParameterIsNotNull(str, "customizationKey");
        Intrinsics.checkParameterIsNotNull(str2, "optionKey");
        this.hasEdit = true;
        if (this.userInputsMap.get(str) == null) {
            Map<String, ParseCustomizedConfigurationRequest.SelectedKeys.C15898a> map = this.userInputsMap;
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a a = new ParseCustomizedConfigurationRequest.SelectedKeys.C15898a().mo57329a(new ArrayList());
            Intrinsics.checkExpressionValueIsNotNull(a, "SelectedKeys.Builder()\n …ption_keys(arrayListOf())");
            map.put(str, a);
        }
        ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar = this.userInputsMap.get(str);
        if (aVar == null || (list2 = aVar.f41857a) == null || !list2.contains(str2)) {
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar2 = this.userInputsMap.get(str);
            if (!(aVar2 == null || (list = aVar2.f41857a) == null)) {
                list.add(str2);
            }
        } else {
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar3 = this.userInputsMap.get(str);
            if (!(aVar3 == null || (list3 = aVar3.f41857a) == null)) {
                list3.remove(str2);
            }
        }
        updateCustomizationList();
        getCanClickComplete().mo5926a(Boolean.valueOf(checkRequireCustomizationComplete()));
    }

    public final void refreshBaseData(String str, SchemaExtraData.ResourceCustomization resourceCustomization2) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(resourceCustomization2, "resourceCustomization");
        this.resourceCustomization = resourceCustomization2;
        this.calendarId = str;
        this.hasEdit = false;
        this.userInputsMap = new HashMap();
        this.inputContentMap = new HashMap();
        this.subOptionOtherContentMap = new HashMap();
        this.currentShowFormList = new ArrayList();
        getFormListData().mo5926a(new ArrayList());
        initUserInputMap(resourceCustomization2.customization_data);
    }

    public void onSingleOptionSelected(String str, String str2) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        Intrinsics.checkParameterIsNotNull(str, "customizationKey");
        Intrinsics.checkParameterIsNotNull(str2, "optionKey");
        this.hasEdit = true;
        if (this.userInputsMap.get(str) == null) {
            Map<String, ParseCustomizedConfigurationRequest.SelectedKeys.C15898a> map = this.userInputsMap;
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a a = new ParseCustomizedConfigurationRequest.SelectedKeys.C15898a().mo57329a(new ArrayList());
            Intrinsics.checkExpressionValueIsNotNull(a, "SelectedKeys.Builder()\n …ption_keys(arrayListOf())");
            map.put(str, a);
        }
        ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar = this.userInputsMap.get(str);
        if (aVar == null || (list3 = aVar.f41857a) == null || !list3.contains(str2)) {
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar2 = this.userInputsMap.get(str);
            if (!(aVar2 == null || (list2 = aVar2.f41857a) == null)) {
                list2.clear();
            }
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar3 = this.userInputsMap.get(str);
            if (!(aVar3 == null || (list = aVar3.f41857a) == null)) {
                list.add(str2);
            }
        } else {
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar4 = this.userInputsMap.get(str);
            if (!(aVar4 == null || (list4 = aVar4.f41857a) == null)) {
                list4.clear();
            }
        }
        updateCustomizationList();
        getCanClickComplete().mo5926a(Boolean.valueOf(checkRequireCustomizationComplete()));
    }

    private final void initOptionUserInput(boolean z, String str, List<SchemaExtraData.CustomizationOption> list) {
        List<String> list2;
        ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar;
        List<String> list3;
        if (this.userInputsMap.get(str) == null) {
            Map<String, ParseCustomizedConfigurationRequest.SelectedKeys.C15898a> map = this.userInputsMap;
            ParseCustomizedConfigurationRequest.SelectedKeys.C15898a a = new ParseCustomizedConfigurationRequest.SelectedKeys.C15898a().mo57329a(new ArrayList());
            Intrinsics.checkExpressionValueIsNotNull(a, "SelectedKeys.Builder()\n …ption_keys(arrayListOf())");
            map.put(str, a);
        }
        if (list != null) {
            for (T t : list) {
                Boolean bool = t.is_selected;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_selected");
                if (bool.booleanValue()) {
                    if (!(!z || (aVar = this.userInputsMap.get(str)) == null || (list3 = aVar.f41857a) == null)) {
                        list3.clear();
                    }
                    ParseCustomizedConfigurationRequest.SelectedKeys.C15898a aVar2 = this.userInputsMap.get(str);
                    if (!(aVar2 == null || (list2 = aVar2.f41857a) == null)) {
                        list2.add(t.option_key);
                    }
                }
                Boolean bool2 = t.is_others;
                Intrinsics.checkExpressionValueIsNotNull(bool2, "it.is_others");
                if (bool2.booleanValue()) {
                    Map<String, String> map2 = this.subOptionOtherContentMap;
                    String str2 = t.others_content;
                    Intrinsics.checkExpressionValueIsNotNull(str2, "it.others_content");
                    map2.put(str, str2);
                }
            }
        }
    }
}
