package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import android.text.TextUtils;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MultiCalendarSearchContentData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SearchMeetingRoom;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0016Jd\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192D\u0010\u001a\u001a@\u0012<\u0012:\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\tj\"\u0012\u0004\u0012\u00020\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d`\f0\u0011H\u0016Jd\u0010\u001e\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192D\u0010\u001a\u001a@\u0012<\u0012:\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\tj\"\u0012\u0004\u0012\u00020\n\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d`\f0\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0011H\u0016J \u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#JN\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020 2\u0006\u0010(\u001a\u00020 2\u001c\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0\u001bj\b\u0012\u0004\u0012\u00020)`\u001d0\u0011H\u0016J4\u0010*\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u001b0\u0011H\u0016JB\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010.\u001a\u00020\u00052\u001c\u0010/\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u0011H\u0016J\u001e\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0016J\u001e\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020 0\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeModel;", "()V", "lastMaxSearchSize", "", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "mCalendars", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/HashMap;", "create", "", "loadAllBuildings", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "loadBatchBuildingMeetingRooms", "chooseBuildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "callback", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/ArrayList;", "loadBoardroomByBuildingId", "loadSubscribeCalendars", "", "parseSearchMeetingRoom", "searchMeetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SearchMeetingRoom;", "searchContactCalendars", SearchIntents.EXTRA_QUERY, "offset", "pageSize", "searchShareCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "searchPublicCalendars", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "startSearchMeetingRoom", "keyword", "searchTime", "dataCallBack", "subscribe", "calendarId", "unsubscribe", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c */
public final class CalendarSubscribeModel extends BaseModel implements CalendarSubscribeContract.ICalendarSubscribeModel {

    /* renamed from: b */
    public static final Companion f76588b = new Companion(null);

    /* renamed from: a */
    public HashMap<String, Calendar> f76589a = new HashMap<>();

    /* renamed from: c */
    private AbstractC32595g f76590c;

    /* renamed from: d */
    private int f76591d = 24;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f76590c = a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$searchContactCalendars$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MultiCalendarSearchContentData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "dataList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$e */
    public static final class C30610e implements IGetDataCallback<ArrayList<MultiCalendarSearchContentData>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76608a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f76609b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76609b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<MultiCalendarSearchContentData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "dataList");
            ArrayList arrayList2 = new ArrayList();
            Iterator<MultiCalendarSearchContentData> it = arrayList.iterator();
            while (it.hasNext()) {
                MultiCalendarSearchContentData next = it.next();
                SubscribeContactData dVar = new SubscribeContactData(next.mo120195c(), next.mo120197d(), next.mo120198e(), next.mo120201g(), next.mo120202h());
                dVar.mo110441f(next.mo120205j());
                dVar.mo110430a(next.mo120206k());
                dVar.mo110439e(next.mo120204i());
                Calendar calendar = this.f76608a.f76589a.get(next.mo120195c());
                if (calendar != null) {
                    dVar.mo110431a(true);
                    if (!calendar.isRealPrimary()) {
                        if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                            dVar.mo110435c(true);
                        }
                    }
                }
                dVar.mo110455c(next.mo120200f());
                dVar.mo110454b(next.mo120193b());
                dVar.mo110456d(next.mo120191a());
                arrayList2.add(dVar);
            }
            this.f76609b.onSuccess(arrayList2);
        }

        C30610e(CalendarSubscribeModel cVar, IGetDataCallback iGetDataCallback) {
            this.f76608a = cVar;
            this.f76609b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00062\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$searchPublicCalendars$uiCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MultiCalendarSearchContentData;", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$f */
    public static final class C30611f implements IGetDataCallback<ArrayList<MultiCalendarSearchContentData>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76610a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f76611b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76611b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<MultiCalendarSearchContentData> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
            ArrayList arrayList2 = new ArrayList();
            Iterator<MultiCalendarSearchContentData> it = arrayList.iterator();
            while (it.hasNext()) {
                MultiCalendarSearchContentData next = it.next();
                SubscribeBaseData bVar = new SubscribeBaseData(next.mo120195c(), next.mo120197d(), next.mo120198e(), next.mo120201g(), next.mo120202h());
                bVar.mo110441f(next.mo120205j());
                bVar.mo110430a(next.mo120206k());
                bVar.mo110439e(next.mo120204i());
                Calendar calendar = this.f76610a.f76589a.get(next.mo120195c());
                if (calendar != null) {
                    bVar.mo110431a(true);
                    if (!calendar.isRealPrimary()) {
                        if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                            bVar.mo110435c(true);
                        }
                    }
                }
                arrayList2.add(bVar);
            }
            this.f76611b.onSuccess(arrayList2);
        }

        C30611f(CalendarSubscribeModel cVar, IGetDataCallback iGetDataCallback) {
            this.f76610a = cVar;
            this.f76611b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$startSearchMeetingRoom$uiCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SearchMeetingRoom;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$g */
    public static final class C30612g implements IGetDataCallback<SearchMeetingRoom> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76612a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f76613b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76613b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(SearchMeetingRoom searchMeetingRoom) {
            ArrayList<SubscribeMeetingRoomData> a = this.f76612a.mo110465a(searchMeetingRoom);
            if (searchMeetingRoom != null && CollectionUtils.isNotEmpty(searchMeetingRoom.getBuildings())) {
                Iterator<SubscribeMeetingRoomData> it = a.iterator();
                while (it.hasNext()) {
                    SubscribeMeetingRoomData next = it.next();
                    Calendar calendar = this.f76612a.f76589a.get(next.mo110445i());
                    if (calendar != null) {
                        next.mo110431a(true);
                        if (calendar.isRealPrimary()) {
                            a.remove(next);
                        } else if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                            next.mo110435c(true);
                        }
                    }
                }
            }
            this.f76613b.onSuccess(a);
        }

        C30612g(CalendarSubscribeModel cVar, IGetDataCallback iGetDataCallback) {
            this.f76612a = cVar;
            this.f76613b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$loadBatchBuildingMeetingRooms$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$b */
    public static final class C30606b implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76592a;

        /* renamed from: b */
        final /* synthetic */ String f76593b;

        /* renamed from: c */
        final /* synthetic */ String f76594c;

        /* renamed from: d */
        final /* synthetic */ List f76595d;

        /* renamed from: e */
        final /* synthetic */ MeetingRoomFilter f76596e;

        /* renamed from: f */
        final /* synthetic */ IGetDataCallback f76597f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarSubscribeModel", C32673y.m125370a(this.f76593b, this.f76594c, errorResult));
            this.f76592a.mo110466b(this.f76595d, this.f76596e, this.f76597f);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null || (str = String.valueOf(list.size())) == null) {
                str = "null";
            }
            Log.m165389i("CalendarSubscribeModel", C32673y.m125373a(this.f76593b, this.f76594c, "calendars_size", str));
            this.f76592a.f76589a.clear();
            if (list != null) {
                for (T t : list) {
                    String serverId = t.getServerId();
                    Intrinsics.checkExpressionValueIsNotNull(serverId, "it.serverId");
                    this.f76592a.f76589a.put(serverId, t);
                }
            }
            this.f76592a.mo110466b(this.f76595d, this.f76596e, this.f76597f);
        }

        C30606b(CalendarSubscribeModel cVar, String str, String str2, List list, MeetingRoomFilter meetingRoomFilter, IGetDataCallback iGetDataCallback) {
            this.f76592a = cVar;
            this.f76593b = str;
            this.f76594c = str2;
            this.f76595d = list;
            this.f76596e = meetingRoomFilter;
            this.f76597f = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$loadSubscribeCalendars$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$d */
    public static final class C30609d implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76604a;

        /* renamed from: b */
        final /* synthetic */ String f76605b;

        /* renamed from: c */
        final /* synthetic */ String f76606c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f76607d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarSubscribeModel", C32673y.m125370a(this.f76605b, this.f76606c, errorResult));
            IGetDataCallback iGetDataCallback = this.f76607d;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null || (str = String.valueOf(list.size())) == null) {
                str = "null";
            }
            Log.m165389i("CalendarSubscribeModel", C32673y.m125373a(this.f76605b, this.f76606c, "calendars_size", str));
            this.f76604a.f76589a.clear();
            if (list != null) {
                for (T t : list) {
                    String serverId = t.getServerId();
                    Intrinsics.checkExpressionValueIsNotNull(serverId, "it.serverId");
                    this.f76604a.f76589a.put(serverId, t);
                }
            }
            IGetDataCallback iGetDataCallback = this.f76607d;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
        }

        C30609d(CalendarSubscribeModel cVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f76604a = cVar;
            this.f76605b = str;
            this.f76606c = str2;
            this.f76607d = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110361a(IGetDataCallback<Map<String, CalendarBuilding>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "dataCallback");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        AbstractC32595g gVar = this.f76590c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarService");
        }
        gVar.mo119041b(wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: b */
    public void mo110367b(IGetDataCallback<Boolean> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarSubscribeModel", C32673y.m125376b(valueOf, "loadAllCalendars", new String[0]));
        C30076a.m111290a().mo108423a(getCallbackManager().wrapAndAddGetDataCallback(new C30609d(this, valueOf, "loadAllCalendars", iGetDataCallback)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeModel$loadBoardroomByBuildingId$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resources", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$c */
    public static final class C30607c implements IGetDataCallback<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        final /* synthetic */ CalendarSubscribeModel f76598a;

        /* renamed from: b */
        final /* synthetic */ String f76599b;

        /* renamed from: c */
        final /* synthetic */ String f76600c;

        /* renamed from: d */
        final /* synthetic */ List f76601d;

        /* renamed from: e */
        final /* synthetic */ UIGetDataCallback f76602e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarPerfMonitor.m124417b("key_view_rooms_in_building");
            Log.m165383e("CalendarSubscribeModel", C32673y.m125370a(this.f76599b, this.f76600c, errorResult));
            HashMap hashMap = new HashMap();
            for (SubscribeCalendarBuildingData cVar : this.f76601d) {
                String id = cVar.mo110448a().getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "building.building.id");
                hashMap.put(id, null);
            }
            this.f76602e.onSuccess(hashMap);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarResource> map) {
            Log.m165389i("CalendarSubscribeModel", C32673y.m125373a(this.f76599b, this.f76600c, "resources_size", map == null ? "null" : String.valueOf(map.size()) + ""));
            HashMap hashMap = new HashMap();
            for (SubscribeCalendarBuildingData cVar : this.f76601d) {
                String id = cVar.mo110448a().getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "building.building.id");
                hashMap.put(id, new ArrayList());
            }
            if (map == null || map.isEmpty()) {
                this.f76602e.onSuccess(hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            Iterator it = new ArrayList(map.values()).iterator();
            while (it.hasNext()) {
                CalendarResource calendarResource = (CalendarResource) it.next();
                if (calendarResource != null) {
                    if (((ArrayList) hashMap2.get(calendarResource.getBuildingId())) == null) {
                        String buildingId = calendarResource.getBuildingId();
                        Intrinsics.checkExpressionValueIsNotNull(buildingId, "room.buildingId");
                        hashMap2.put(buildingId, new ArrayList());
                    }
                    ArrayList arrayList = (ArrayList) hashMap2.get(calendarResource.getBuildingId());
                    if (arrayList != null) {
                        arrayList.add(calendarResource);
                    }
                }
            }
            for (SubscribeCalendarBuildingData cVar2 : this.f76601d) {
                ArrayList arrayList2 = (ArrayList) hashMap2.get(cVar2.mo110448a().getId());
                if (arrayList2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(arrayList2, "buildingRoomsMap[chooseB….building.id] ?: continue");
                    CollectionsKt.sortWith(arrayList2, C30608a.f76603a);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        CalendarResource calendarResource2 = (CalendarResource) it2.next();
                        StringBuilder sb = new StringBuilder();
                        Intrinsics.checkExpressionValueIsNotNull(calendarResource2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        String floorName = calendarResource2.getFloorName();
                        if (!TextUtils.isEmpty(floorName)) {
                            sb.append(floorName);
                            sb.append("-");
                        }
                        sb.append(calendarResource2.getName());
                        String calendarId = calendarResource2.getCalendarId();
                        Intrinsics.checkExpressionValueIsNotNull(calendarId, "data.calendarId");
                        SubscribeMeetingRoomData eVar = new SubscribeMeetingRoomData(calendarId, sb.toString(), cVar2.mo110448a().getName(), false, false);
                        eVar.mo110459b(String.valueOf(calendarResource2.getCapacity()));
                        eVar.mo110460g(calendarResource2.isDisabled());
                        eVar.mo110461h(SchemaHelper.f83746a.mo120314b(calendarResource2.getResourceSchema()));
                        Calendar calendar = this.f76598a.f76589a.get(eVar.mo110445i());
                        if (calendar != null) {
                            eVar.mo110431a(true);
                            if (!calendar.isRealPrimary()) {
                                if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                                    eVar.mo110435c(true);
                                }
                            }
                        }
                        arrayList3.add(eVar);
                    }
                    String id2 = cVar2.mo110448a().getId();
                    Intrinsics.checkExpressionValueIsNotNull(id2, "chooseBuilding.building.id");
                    hashMap.put(id2, arrayList3);
                }
            }
            this.f76602e.onSuccess(hashMap);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.c$c$a */
        public static final class C30608a<T> implements Comparator<CalendarResource> {

            /* renamed from: a */
            public static final C30608a f76603a = new C30608a();

            C30608a() {
            }

            /* renamed from: a */
            public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
                int weight = calendarResource2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
                return weight - calendarResource.getWeight();
            }
        }

        C30607c(CalendarSubscribeModel cVar, String str, String str2, List list, UIGetDataCallback uIGetDataCallback) {
            this.f76598a = cVar;
            this.f76599b = str;
            this.f76600c = str2;
            this.f76601d = list;
            this.f76602e = uIGetDataCallback;
        }
    }

    /* renamed from: a */
    public final ArrayList<SubscribeMeetingRoomData> mo110465a(SearchMeetingRoom searchMeetingRoom) {
        ArrayList<SubscribeMeetingRoomData> arrayList = new ArrayList<>();
        if (searchMeetingRoom != null && CollectionUtils.isNotEmpty(searchMeetingRoom.getBuildings())) {
            for (CalendarBuilding calendarBuilding : searchMeetingRoom.getBuildings()) {
                if (calendarBuilding != null && CollectionUtils.isNotEmpty(calendarBuilding.getCalendarResources())) {
                    for (CalendarResource calendarResource : calendarBuilding.getCalendarResources()) {
                        if (calendarResource != null) {
                            StringBuilder sb = new StringBuilder();
                            String floorName = calendarResource.getFloorName();
                            if (!TextUtils.isEmpty(floorName)) {
                                sb.append(floorName);
                                sb.append("-");
                            }
                            sb.append(calendarResource.getName());
                            String calendarId = calendarResource.getCalendarId();
                            Intrinsics.checkExpressionValueIsNotNull(calendarId, "calendarResource.calendarId");
                            SubscribeMeetingRoomData eVar = new SubscribeMeetingRoomData(calendarId, sb.toString(), calendarBuilding.getName(), false, false);
                            eVar.mo110459b(String.valueOf(calendarResource.getCapacity()));
                            eVar.mo110460g(calendarResource.isDisabled());
                            eVar.mo110461h(SchemaHelper.f83746a.mo120314b(calendarResource.getResourceSchema()));
                            arrayList.add(eVar);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: b */
    public void mo110368b(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118952b(str, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110365a(String str, IGetDataCallback<Calendar> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118934a(str, wrapAndAddGetDataCallback);
    }

    /* renamed from: b */
    public final void mo110466b(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<HashMap<String, ArrayList<SubscribeMeetingRoomData>>> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarSubscribeModel", C32673y.m125376b(valueOf, "loadBoardroomByBuildingId", "start_time", "0", "end_time", "0", "building_ids", "chosenBuilding", "rrule", ""));
        C30607c cVar = new C30607c(this, valueOf, "loadBoardroomByBuildingId", list, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo110448a().getId().toString());
        }
        AbstractC32595g gVar = this.f76590c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarService");
        }
        gVar.mo119033a(0, 0, arrayList, "", false, meetingRoomFilter, cVar);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110366a(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<HashMap<String, ArrayList<SubscribeMeetingRoomData>>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "chooseBuildings");
        Intrinsics.checkParameterIsNotNull(meetingRoomFilter, "meetingRoomFilter");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("CalendarSubscribeModel", C32673y.m125376b(valueOf, "loadAllCalendars_loadOneBuildingMeetingRooms", new String[0]));
        C30076a.m111290a().mo108423a(getCallbackManager().wrapAndAddGetDataCallback(new C30606b(this, valueOf, "loadAllCalendars_loadOneBuildingMeetingRooms", list, meetingRoomFilter, iGetDataCallback)));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110362a(String str, int i, int i2, IGetDataCallback<ArrayList<SubscribeBaseData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "dataCallback");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30611f(this, iGetDataCallback));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "uiCallback");
        aVar.mo118930a(str, i, i2, false, true, false, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110364a(String str, MeetingRoomFilter meetingRoomFilter, int i, IGetDataCallback<ArrayList<SubscribeMeetingRoomData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "dataCallBack");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30612g(this, iGetDataCallback));
        AbstractC32595g gVar = this.f76590c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarService");
        }
        gVar.mo119031a(0, 0, str, i * 100, "", false, meetingRoomFilter, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeContract.ICalendarSubscribeModel
    /* renamed from: a */
    public void mo110363a(String str, int i, int i2, boolean z, boolean z2, IGetDataCallback<ArrayList<SubscribeContactData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        boolean A = C30022a.f74883b.mo112687A();
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30610e(this, iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…     }\n                })");
        aVar.mo118930a(str, i, i2, z, z2, A, wrapAndAddGetDataCallback);
    }
}
