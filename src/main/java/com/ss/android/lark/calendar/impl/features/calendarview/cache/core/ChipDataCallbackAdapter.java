package com.ss.android.lark.calendar.impl.features.calendarview.cache.core;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.local.AbstractC31924a;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0004:\u0001(B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0002J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00102\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002H\u0016J\u0016\u0010$\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010%\u001a\u00020\u00102\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0002H\u0002J\b\u0010'\u001a\u00020\u0010H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/ChipDataCallbackAdapter;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "Lcom/ss/android/lark/calendar/impl/features/local/IGetLocalDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "mChipDataCallback", "Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IGetChipDataCallBack;", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/IGetChipDataCallBack;)V", "localList", "Ljava/util/ArrayList;", "localReady", "", "sdkList", "sdkReady", "checkData", "", "dealWithCalendarEventInstances", "eventInstances", "filterEventInstances", "", "calendarEventInstances", "allEventChipViewData", "", "filterExchangeRepeatedEventInstance", "calendars", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "launchPerfMonitor", "instanceSize", "", "localDataReady", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLocalDataSuccess", "list", "onSuccess", "preloadServerEvent", "serverEventId", "sdkDataReady", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.b */
public final class ChipDataCallbackAdapter implements IGetDataCallback<List<? extends CalendarEventInstance>>, AbstractC31924a<List<? extends EventChipViewData>> {

    /* renamed from: a */
    public static final Companion f76915a = new Companion(null);

    /* renamed from: b */
    private final ArrayList<EventChipViewData> f76916b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<EventChipViewData> f76917c = new ArrayList<>();

    /* renamed from: d */
    private volatile boolean f76918d;

    /* renamed from: e */
    private volatile boolean f76919e;

    /* renamed from: f */
    private final IGetChipDataCallBack f76920f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/cache/core/ChipDataCallbackAdapter$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m114160a() {
        this.f76918d = true;
        m114164c();
    }

    /* renamed from: b */
    private final void m114163b() {
        this.f76919e = true;
        m114164c();
    }

    /* renamed from: c */
    private final void m114164c() {
        if (this.f76918d && this.f76919e) {
            Log.m165389i("ChipDataCallbackAdapter", C32673y.m125378d("sdk_and_local_ready"));
            ArrayList<EventChipViewData> arrayList = new ArrayList<>();
            arrayList.addAll(this.f76916b);
            arrayList.addAll(this.f76917c);
            this.f76920f.mo110834a(arrayList);
            m114161a(arrayList.size());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/core/ChipDataCallbackAdapter$onSuccess$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.b$b */
    public static final class C30689b implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ ChipDataCallbackAdapter f76921a;

        /* renamed from: b */
        final /* synthetic */ List f76922b;

        /* renamed from: c */
        final /* synthetic */ String f76923c;

        /* renamed from: d */
        final /* synthetic */ String f76924d;

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            ChipDataCallbackAdapter bVar = this.f76921a;
            bVar.mo110843b(bVar.mo110840a(list, this.f76922b));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChipDataCallbackAdapter", C32673y.m125370a(this.f76923c, this.f76924d, errorResult));
            this.f76921a.mo110843b(this.f76922b);
        }

        C30689b(ChipDataCallbackAdapter bVar, List list, String str, String str2) {
            this.f76921a = bVar;
            this.f76922b = list;
            this.f76923c = str;
            this.f76924d = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendarview/cache/core/ChipDataCallbackAdapter$preloadServerEvent$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.cache.core.b$c */
    public static final class C30690c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f76925a;

        /* renamed from: b */
        final /* synthetic */ String f76926b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("ChipDataCallbackAdapter", C32673y.m125373a(this.f76925a, this.f76926b, new String[0]));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChipDataCallbackAdapter", C32673y.m125370a(this.f76925a, this.f76926b, errorResult));
        }

        C30690c(String str, String str2) {
            this.f76925a = str;
            this.f76926b = str2;
        }
    }

    public ChipDataCallbackAdapter(IGetChipDataCallBack eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "mChipDataCallback");
        this.f76920f = eVar;
    }

    /* renamed from: c */
    public void mo110841a(List<? extends EventChipViewData> list) {
        this.f76917c.clear();
        if (list != null) {
            this.f76917c.addAll(list);
        }
        m114163b();
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        IGetChipDataCallBack eVar = this.f76920f;
        String message = errorResult.getMessage();
        if (message == null) {
            message = "query sdk error";
        }
        eVar.mo110833a(message);
    }

    /* renamed from: a */
    private final void m114161a(int i) {
        LaunchPerfMonitor.m124424a("handle_instance", "data_length", String.valueOf(i));
        LaunchPerfMonitor.m124430d("handle_instance");
        LaunchPerfMonitor.m124424a("show_chip", "data_length", String.valueOf(i));
        if (i == 0) {
            LaunchPerfMonitor.m124430d("show_chip");
        }
        LaunchPerfMonitor.m124426b(String.valueOf(i));
    }

    /* renamed from: d */
    private final void m114165d(List<String> list) {
        String str;
        String valueOf = String.valueOf(new Date().getTime());
        if (list == null) {
            str = "null";
        } else {
            str = String.valueOf(list.size()) + "";
        }
        Log.m165389i("ChipDataCallbackAdapter", C32673y.m125376b(valueOf, "preloadServerEvent", "ser_ids", str));
        C32533b.m124620a().mo118872a(list, new C30690c(valueOf, "preloadServerEvent"));
    }

    /* renamed from: a */
    public void onSuccess(List<? extends CalendarEventInstance> list) {
        Intrinsics.checkParameterIsNotNull(list, "calendarEventInstances");
        C30076a.m111290a().mo108423a(new C30689b(this, list, String.valueOf(new Date().getTime()), "getAllCalendars"));
    }

    /* renamed from: b */
    public final void mo110843b(List<? extends CalendarEventInstance> list) {
        Intrinsics.checkParameterIsNotNull(list, "eventInstances");
        LaunchPerfMonitor.m124424a("get_instance", "data_length", String.valueOf(list.size()));
        LaunchPerfMonitor.m124430d("get_instance");
        LaunchPerfMonitor.m124428c("handle_instance");
        this.f76916b.clear();
        m114165d(m114162b(list, this.f76916b));
        m114160a();
    }

    /* renamed from: b */
    private final List<String> m114162b(List<? extends CalendarEventInstance> list, List<EventChipViewData> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CalendarEventInstance calendarEventInstance : list) {
            list2.add(new EventChipViewData(calendarEventInstance));
            arrayList2.add(calendarEventInstance);
            String eventServerId = calendarEventInstance.getEventServerId();
            Intrinsics.checkExpressionValueIsNotNull(eventServerId, "calendarEventInstance.eventServerId");
            arrayList.add(eventServerId);
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final List<CalendarEventInstance> mo110840a(List<? extends Calendar> list, List<? extends CalendarEventInstance> list2) {
        Intrinsics.checkParameterIsNotNull(list2, "eventInstances");
        if (list == null) {
            return list2;
        }
        HashSet hashSet = new HashSet();
        List<? extends Calendar> list3 = list;
        for (T t : list3) {
            if (t.isVisible() && t.getType() == Calendar.Type.PRIMARY) {
                hashSet.add(t.getUserId());
            }
        }
        if (hashSet.size() <= 0) {
            return list2;
        }
        HashSet hashSet2 = new HashSet();
        for (T t2 : list3) {
            if (t2.isVisible() && t2.getType() == Calendar.Type.EXCHANGE && hashSet.contains(t2.getUserId())) {
                hashSet2.add(t2.getServerId());
            }
        }
        if (hashSet2.size() <= 0) {
            return list2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            CalendarEventInstance calendarEventInstance = (CalendarEventInstance) obj;
            boolean z = false;
            if (hashSet2.contains(calendarEventInstance.getCalendarId())) {
                String key = calendarEventInstance.getKey();
                Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                if (StringsKt.startsWith$default(key, "sync_from_lark_", false, 2, (Object) null)) {
                    z = true;
                }
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }
}
