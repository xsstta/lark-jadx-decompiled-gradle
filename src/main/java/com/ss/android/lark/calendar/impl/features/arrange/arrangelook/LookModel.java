package com.ss.android.lark.calendar.impl.features.arrange.arrangelook;

import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.data.ResourceEventChipViewData;
import com.ss.android.lark.calendar.impl.features.arrange.base.ArrangeBaseModel;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadInsCancelableWrapper;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J`\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019`\u001b2.\u0010\u001c\u001a*\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u0018j\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0019`\u001bH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019H\u0016J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010)\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020.0!H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020#H\u0016J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u0015H\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/ArrangeBaseModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel;", "extras", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "isFromProfile", "", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarEventService;", "mChatterId", "", "mExternalCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "mExternalCalendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "mIsHitProfilePoint", "mLoginDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILoginDependency;", "kotlin.jvm.PlatformType", "mModelDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel$ModelDelegate;", "mtRoomCalendarId", "convertToResourceEventChipViewData", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "eventInstances", "getAttendeeChatterIds", "getAttendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeeTimeZoneMap", "", "getEventInstanceData", "", "loadDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "callback", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "getExternalCalendarBuilding", "getExternalCalendarResource", "getMtRoomCalendarId", "getViewTimeZone", "Ljava/util/TimeZone;", "getWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "isLoadDataError", "loadAttendeeByChatterId", "setModelDelegate", "modelDelegate", "setViewTimeZone", "timeZoneId", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.b */
public final class LookModel extends ArrangeBaseModel implements ILookContract.ILookModel {

    /* renamed from: e */
    public static final Companion f75064e = new Companion(null);

    /* renamed from: a */
    public final String f75065a;

    /* renamed from: b */
    public ILookContract.ILookModel.ModelDelegate f75066b;

    /* renamed from: c */
    public final AbstractC30054s f75067c = C30022a.f74882a.loginDependency();

    /* renamed from: d */
    public boolean f75068d;

    /* renamed from: g */
    private AbstractC32594f f75069g;

    /* renamed from: h */
    private String f75070h;

    /* renamed from: i */
    private boolean f75071i;

    /* renamed from: j */
    private CalendarResource f75072j;

    /* renamed from: k */
    private CalendarBuilding f75073k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: f */
    public boolean mo108529f() {
        return this.f75071i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: g */
    public String mo108530g() {
        return this.f75070h;
    }

    /* renamed from: i */
    public CalendarResource mo108555i() {
        return this.f75072j;
    }

    /* renamed from: j */
    public CalendarBuilding mo108556j() {
        return this.f75073k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: b */
    public ArrayList<AbstractC30095b> mo108525b() {
        return mo108487u();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: c */
    public Map<String, String> mo108526c() {
        return mo108469D();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: d */
    public Map<String, CalendarWorkHourSetting> mo108527d() {
        return mo108470E();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: e */
    public TimeZone mo108528e() {
        return mo108490x();
    }

    /* renamed from: h */
    public ArrayList<String> mo108554h() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(this.f75065a);
        AbstractC30054s sVar = this.f75067c;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "mLoginDependency");
        arrayList.add(sVar.mo108269a());
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: a */
    public void mo108521a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f75065a);
        AbstractC30054s sVar = this.f75067c;
        Intrinsics.checkExpressionValueIsNotNull(sVar, "mLoginDependency");
        String a = sVar.mo108269a();
        if (a == null) {
            a = "";
        }
        arrayList.add(a);
        String l = Long.toString(new Date().getTime());
        Log.m165389i("LookModel", C32673y.m125376b(l, "getAttendeesByChatterIds", "chatter_ids", this.f75065a));
        this.f75069g.mo118880b(arrayList, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C30104b(this, l, "getAttendeesByChatterIds")));
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: a */
    public void mo108522a(ILookContract.ILookModel.ModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "modelDelegate");
        this.f75066b = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangelook/LookModel$loadAttendeeByChatterId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatIdAttendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.b$b */
    public static final class C30104b implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ LookModel f75074a;

        /* renamed from: b */
        final /* synthetic */ String f75075b;

        /* renamed from: c */
        final /* synthetic */ String f75076c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("LookModel", C32673y.m125370a(this.f75075b, this.f75076c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            String str;
            CalendarEventAttendee calendarEventAttendee;
            String str2;
            if (map == null) {
                str = "null";
            } else {
                str = "" + map.size();
            }
            Log.m165389i("LookModel", C32673y.m125373a(this.f75075b, this.f75076c, "chatter_id_attendees_size", str));
            ArrayList<AbstractC30095b> u = this.f75074a.mo108487u();
            u.clear();
            if (!(map == null || (calendarEventAttendee = (CalendarEventAttendee) map.get(this.f75074a.f75065a)) == null)) {
                u.add(calendarEventAttendee);
                AbstractC30054s sVar = this.f75074a.f75067c;
                Intrinsics.checkExpressionValueIsNotNull(sVar, "mLoginDependency");
                CalendarEventAttendee calendarEventAttendee2 = (CalendarEventAttendee) map.get(sVar.mo108269a());
                if (calendarEventAttendee2 != null) {
                    u.add(calendarEventAttendee2);
                    this.f75074a.mo108471F();
                    ILookContract.ILookModel.ModelDelegate aVar = this.f75074a.f75066b;
                    if (aVar != null) {
                        aVar.mo108531a(this.f75074a.mo108487u());
                    }
                    if (!this.f75074a.f75068d) {
                        CalendarEventAttendee calendarEventAttendee3 = (CalendarEventAttendee) map.get(this.f75074a.f75065a);
                        if (calendarEventAttendee3 != null) {
                            str2 = calendarEventAttendee3.getAttendeeCalendarId();
                        } else {
                            str2 = null;
                        }
                        GeneralHitPoint.m124200a(str2, this.f75074a.f75065a);
                        this.f75074a.f75068d = true;
                        return;
                    }
                    return;
                }
            }
            onError(new ErrorResult("get attendees fail"));
        }

        C30104b(LookModel bVar, String str, String str2) {
            this.f75074a = bVar;
            this.f75075b = str;
            this.f75076c = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: a */
    public void mo108524a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (C30022a.f74883b.mo112695c()) {
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            mo108475a(timeZone);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: a */
    public HashMap<String, ArrayList<DayEventChipViewData>> mo108520a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "eventInstances");
        HashMap<String, ArrayList<DayEventChipViewData>> hashMap2 = new HashMap<>();
        for (Map.Entry<String, ArrayList<DayEventChipViewData>> entry : hashMap.entrySet()) {
            ArrayList<DayEventChipViewData> arrayList = new ArrayList<>();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                ResourceEventChipViewData resourceEventChipViewData = new ResourceEventChipViewData(it.next());
                if (!(resourceEventChipViewData instanceof DayEventChipViewData)) {
                    resourceEventChipViewData = null;
                }
                ResourceEventChipViewData resourceEventChipViewData2 = resourceEventChipViewData;
                if (resourceEventChipViewData2 != null) {
                    arrayList.add(resourceEventChipViewData2);
                }
            }
            hashMap2.put(entry.getKey(), arrayList);
        }
        return hashMap2;
    }

    public LookModel(Bundle bundle) {
        String str;
        boolean z;
        Object obj;
        Object obj2;
        String string;
        C32533b a = C32533b.m124620a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarEventService.getInstance()");
        this.f75069g = a;
        boolean z2 = true;
        this.f75071i = true;
        this.f75065a = (bundle == null || (str = bundle.getString("chatter_id")) == null) ? "" : str;
        if (bundle != null) {
            z = bundle.getBoolean("is_show_chatter", true);
        } else {
            z = true;
        }
        this.f75071i = z;
        CalendarBuilding calendarBuilding = null;
        if (!(bundle == null || (string = bundle.getString("mtroom_calendar_id")) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(string, "it");
            string = !(string.length() <= 0 ? false : z2) ? null : string;
            if (string != null) {
                this.f75070h = string;
                mo108466A().add(string);
            }
        }
        if (bundle != null) {
            obj = bundle.get("key_params_calendar_resource");
        } else {
            obj = null;
        }
        CalendarResource calendarResource = (CalendarResource) (!(obj instanceof CalendarResource) ? null : obj);
        if (calendarResource != null) {
            this.f75072j = calendarResource;
        }
        if (bundle != null) {
            obj2 = bundle.get("key_params_calendar_building");
        } else {
            obj2 = null;
        }
        CalendarBuilding calendarBuilding2 = obj2 instanceof CalendarBuilding ? obj2 : calendarBuilding;
        if (calendarBuilding2 != null) {
            this.f75073k = calendarBuilding2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangelook.ILookContract.ILookModel
    /* renamed from: a */
    public void mo108523a(CalendarDate calendarDate, OnLoadEventInstances cVar) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "loadDate");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        if (getCallbackManager() != null) {
            mo108473a(calendarDate.getTimeInSeconds());
            OnLoadInsCancelableWrapper dVar = new OnLoadInsCancelableWrapper(cVar);
            getCallbackManager().addCancelableCallback(dVar);
            mo108479b(dVar);
        }
    }
}
