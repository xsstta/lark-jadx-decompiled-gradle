package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarResource;
import com.bytedance.lark.pb.calendar.v1.EventInfoInstances;
import com.bytedance.lark.pb.calendar.v1.InstanceSpan;
import com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.recyclerview.AdapterList;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1576d.C32602a;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService;
import com.ss.android.lark.calendar.impl.utils.C32645b;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001<B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010$\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bJ\u0010\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u00132\u0006\u0010+\u001a\u00020\fH\u0002J\u0006\u0010,\u001a\u00020'J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u00132\u0006\u0010+\u001a\u00020\fH\u0002J\u0006\u0010.\u001a\u00020'J\u0010\u0010/\u001a\u00020%2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J@\u00100\u001a\u0012\u0012\u0004\u0012\u00020201j\b\u0012\u0004\u0012\u000202`32\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u001eH\u0002J\u0011\u0010:\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010;R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001eXD¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "calServerId", "", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "current", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "futurePaging", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel$Paging;", "list", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/AdapterList;", "", "getList", "()Lcom/ss/android/lark/calendar/impl/features/recyclerview/AdapterList;", "loadFutureDeferred", "Lkotlinx/coroutines/Deferred;", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "value", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/LoadStatus;", "loadFutureStatus", "setLoadFutureStatus", "(Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/LoadStatus;)V", "loadPastDeferred", "loadPastStatus", "setLoadPastStatus", "maxLoadCountAtRefresh", "", "maxLoadDate", "minLoadDate", "pastPaging", "reloadDataThreshold", "tag", "init", "", "loadFuture", "Lkotlinx/coroutines/Job;", "clearAll", "", "loadFutureInstancesAsync", "paging", "loadPast", "loadPastInstancesAsync", "refresh", "setCalendar", "transformResponse", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDateHolder;", "Lkotlin/collections/ArrayList;", "response", "Lcom/bytedance/lark/pb/calendar/v1/PullCalendarInstancesResponse;", "startDay", "startDayForWeek", "endDay", "endDayForWeek", "updateDayOfWeek", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Paging", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g */
public final class EventInstancePagingViewModel extends AbstractC1142af {
    public String calServerId = "";
    private Calendar calendar;
    public final CalendarDate current;
    private CalendarSetting.DayOfWeek dayOfWeek;
    public Paging futurePaging;
    private final AdapterList<Object> list = new AdapterList<>();
    public Deferred<? extends SdkSender.C53233d<Paging>> loadFutureDeferred;
    public LoadStatus loadFutureStatus;
    public Deferred<? extends SdkSender.C53233d<Paging>> loadPastDeferred;
    public LoadStatus loadPastStatus;
    public final int maxLoadCountAtRefresh = 4;
    public CalendarDate maxLoadDate = new CalendarDate();
    public CalendarDate minLoadDate = new CalendarDate();
    public Paging pastPaging;
    public final int reloadDataThreshold = 20;
    private final String tag = "EventInstancePagingViewModel";

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"updateDayOfWeek", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0}, mo239175l = {375}, mo239176m = "updateDayOfWeek", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$g */
    public static final class C30250g extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30250g(EventInstancePagingViewModel gVar, Continuation cVar) {
            super(cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.updateDayOfWeek(this);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel$Paging;", "", "startDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "startDayForWeek", "", "nextMinTimeSpan", "nextEventId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;ILjava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getNextEventId", "()Ljava/lang/String;", "getNextMinTimeSpan", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartDate", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getStartDayForWeek", "()I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$a */
    public static final class Paging {

        /* renamed from: a */
        private final CalendarDate f75636a;

        /* renamed from: b */
        private final int f75637b;

        /* renamed from: c */
        private final Integer f75638c;

        /* renamed from: d */
        private final String f75639d;

        /* renamed from: e */
        private List<? extends Object> f75640e;

        /* renamed from: a */
        public final CalendarDate mo109222a() {
            return this.f75636a;
        }

        /* renamed from: b */
        public final int mo109223b() {
            return this.f75637b;
        }

        /* renamed from: c */
        public final Integer mo109224c() {
            return this.f75638c;
        }

        /* renamed from: d */
        public final String mo109225d() {
            return this.f75639d;
        }

        /* renamed from: e */
        public final List<Object> mo109226e() {
            return this.f75640e;
        }

        public Paging(CalendarDate calendarDate, int i, Integer num, String str, List<? extends Object> list) {
            Intrinsics.checkParameterIsNotNull(calendarDate, "startDate");
            this.f75636a = calendarDate;
            this.f75637b = i;
            this.f75638c = num;
            this.f75639d = str;
            this.f75640e = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Paging(CalendarDate calendarDate, int i, Integer num, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(calendarDate, i, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : list);
        }
    }

    public final AdapterList<Object> getList() {
        return this.list;
    }

    public final Job loadPast() {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30247d(this, null), 3, null);
    }

    public final Job refresh() {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30249f(this, null), 3, null);
    }

    public EventInstancePagingViewModel() {
        CalendarDate calendarDate = new CalendarDate();
        this.current = calendarDate;
        this.dayOfWeek = CalendarSetting.DayOfWeek.SUNDAY;
        CalendarDate moveThisDateToDayStart = new CalendarDate(calendarDate).moveThisDateToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "CalendarDate(current).moveThisDateToDayStart()");
        this.futurePaging = new Paging(moveThisDateToDayStart, calendarDate.getJulianDay(), null, null, null, 28, null);
        this.loadFutureStatus = new LoadStatus(0, false, false, 6, null);
        CalendarDate moveThisDateToDayEnd = new CalendarDate(calendarDate).addDay(-1).moveThisDateToDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayEnd, "CalendarDate(current).ad…1).moveThisDateToDayEnd()");
        this.pastPaging = new Paging(moveThisDateToDayEnd, calendarDate.getJulianDay() - 1, null, null, null, 28, null);
        this.loadPastStatus = new LoadStatus(0, false, false, 6, null);
    }

    public final Job loadFuture(boolean z) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30245b(this, z, null), 3, null);
    }

    public final Deferred<SdkSender.C53233d<Paging>> loadFutureInstancesAsync(Paging aVar) {
        return C69553g.m266946b(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C30246c(this, aVar, null), 2, null);
    }

    public final Deferred<SdkSender.C53233d<Paging>> loadPastInstancesAsync(Paging aVar) {
        return C69553g.m266946b(C1143ag.m5356a(this), Dispatchers.m266326d(), null, new C30248e(this, aVar, null), 2, null);
    }

    public final void setLoadFutureStatus(LoadStatus jVar) {
        this.list.remove(this.loadFutureStatus);
        this.loadFutureStatus = jVar;
        if (jVar.mo109241a() != 0) {
            this.list.add(jVar);
        }
    }

    public final void setLoadPastStatus(LoadStatus jVar) {
        this.list.remove(this.loadPastStatus);
        this.loadPastStatus = jVar;
        if (jVar.mo109241a() != 0) {
            this.list.mo109131a(0, jVar);
        }
    }

    public final void setCalendar(Calendar calendar2) {
        this.calendar = calendar2;
        boolean z = false;
        for (Object obj : this.list) {
            if (obj instanceof InstanceCardInfo) {
                ((InstanceCardInfo) obj).mo109228a(calendar2);
                z = true;
            }
        }
        if (z) {
            AdapterList.m112245a(this.list, null, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object updateDayOfWeek(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel.C30250g
            if (r0 == 0) goto L_0x0014
            r0 = r5
            com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$g r0 = (com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel.C30250g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$g r0 = new com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$g
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C69086a.m265828a()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r1 = r0.L$1
            com.ss.android.lark.calendar.impl.features.calendars.detail.b.g r1 = (com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel) r1
            java.lang.Object r0 = r0.L$0
            com.ss.android.lark.calendar.impl.features.calendars.detail.b.g r0 = (com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel) r0
            kotlin.C69097g.m265891a(r5)
            goto L_0x004d
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003a:
            kotlin.C69097g.m265891a(r5)
            com.ss.android.lark.calendar.impl.rustadapter.c.a r5 = com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService.f83432a
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = r5.mo118836a(r0)
            if (r5 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r1 = r4
        L_0x004d:
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting r5 = (com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting) r5
            com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r5 = r5.getWeekStartDay()
            java.lang.String r0 = "CalendarDetailService.getSettings().weekStartDay"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            r1.dayOfWeek = r5
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel.updateDayOfWeek(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel$Paging;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel$loadFutureInstancesAsync$1", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {257}, mo239176m = "invokeSuspend", mo239177n = {"$this$async", "startDate", "startDay", "startDayForWeek"}, mo239178s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$c */
    public static final class C30246c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkSender.C53233d<Paging>>, Object> {
        final /* synthetic */ Paging $paging;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30246c(EventInstancePagingViewModel gVar, Paging aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$paging = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30246c cVar2 = new C30246c(this.this$0, this.$paging, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkSender.C53233d<Paging>> cVar) {
            return ((C30246c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            Object a = C69086a.m265828a();
            int i3 = this.label;
            if (i3 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarDate a2 = this.$paging.mo109222a();
                int julianDay = a2.getJulianDay();
                int b = this.$paging.mo109223b();
                CalendarDetailService aVar = CalendarDetailService.f83432a;
                String str = this.this$0.calServerId;
                long timeInSeconds = a2.getTimeInSeconds();
                Integer c = this.$paging.mo109224c();
                String d = this.$paging.mo109225d();
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.I$0 = julianDay;
                this.I$1 = b;
                this.label = 1;
                obj = aVar.mo118834a(str, timeInSeconds, true, c, d, this);
                if (obj == a) {
                    return a;
                }
                i2 = julianDay;
                i = b;
            } else if (i3 == 1) {
                int i4 = this.I$1;
                int i5 = this.I$0;
                CalendarDate calendarDate = (CalendarDate) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                i = i4;
                i2 = i5;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkSender.C53233d dVar = (SdkSender.C53233d) obj;
            T t = dVar.f131572a;
            if (t != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = t.next_begin_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "response.next_begin_time");
                CalendarDate calendarDate2 = CalendarDate.getCalendarDate(timeUnit.toMillis(l.longValue()));
                Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "nextDate");
                int julianDay2 = calendarDate2.getJulianDay();
                ArrayList arrayList = new ArrayList();
                for (T t2 : this.this$0.transformResponse(t, i2, i, julianDay2, julianDay2)) {
                    if (C69089a.m265837a(!this.this$0.getList().contains(t2)).booleanValue()) {
                        arrayList.add(t2);
                    }
                }
                return C32602a.m124911a(new Paging(calendarDate2, julianDay2 + 1, t.next_min_timespan, t.next_event_id, arrayList));
            }
            ErrorResult errorResult = dVar.f131573b;
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "result.error");
            return C32602a.m124910a(errorResult, (Object) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel$loadPast$1", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0, 0}, mo239175l = {220}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "deferred"}, mo239178s = {"L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$d */
    public static final class C30247d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30247d(EventInstancePagingViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30247d dVar = new C30247d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30247d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00d9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 252
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel.C30247d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/sdk/SdkSender$SdkResult;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel$Paging;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel$loadPastInstancesAsync$1", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0, 0, 0, 0}, mo239175l = {280}, mo239176m = "invokeSuspend", mo239177n = {"$this$async", "startDate", "startDay", "startDayForWeek"}, mo239178s = {"L$0", "L$1", "I$0", "I$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$e */
    public static final class C30248e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SdkSender.C53233d<Paging>>, Object> {
        final /* synthetic */ Paging $paging;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30248e(EventInstancePagingViewModel gVar, Paging aVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$paging = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30248e eVar = new C30248e(this.this$0, this.$paging, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super SdkSender.C53233d<Paging>> cVar) {
            return ((C30248e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2;
            Object obj2;
            Object a = C69086a.m265828a();
            int i3 = this.label;
            if (i3 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                CalendarDate a2 = this.$paging.mo109222a();
                int julianDay = a2.getJulianDay();
                int b = this.$paging.mo109223b();
                CalendarDetailService aVar = CalendarDetailService.f83432a;
                String str = this.this$0.calServerId;
                long timeInSeconds = a2.getTimeInSeconds();
                Integer c = this.$paging.mo109224c();
                String d = this.$paging.mo109225d();
                this.L$0 = ahVar;
                this.L$1 = a2;
                this.I$0 = julianDay;
                this.I$1 = b;
                this.label = 1;
                obj2 = aVar.mo118834a(str, timeInSeconds, false, c, d, this);
                if (obj2 == a) {
                    return a;
                }
                i2 = julianDay;
                i = b;
            } else if (i3 == 1) {
                int i4 = this.I$1;
                int i5 = this.I$0;
                CalendarDate calendarDate = (CalendarDate) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                i = i4;
                i2 = i5;
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkSender.C53233d dVar = (SdkSender.C53233d) obj2;
            T t = dVar.f131572a;
            if (t != null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = t.next_begin_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "response.next_begin_time");
                CalendarDate calendarDate2 = CalendarDate.getCalendarDate(timeUnit.toMillis(l.longValue()));
                Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "nextDate");
                int julianDay2 = calendarDate2.getJulianDay();
                ArrayList arrayList = new ArrayList();
                for (T t2 : this.this$0.transformResponse(t, julianDay2, julianDay2, i2, i)) {
                    if (C69089a.m265837a(!this.this$0.getList().contains(t2)).booleanValue()) {
                        arrayList.add(t2);
                    }
                }
                return C32602a.m124911a(new Paging(calendarDate2, julianDay2 - 1, t.next_min_timespan, t.next_event_id, arrayList));
            }
            ErrorResult errorResult = dVar.f131573b;
            Intrinsics.checkExpressionValueIsNotNull(errorResult, "result.error");
            return C32602a.m124910a(errorResult, (Object) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel$loadFuture$1", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0, 1, 1}, mo239175l = {171, 177}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "deferred"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$b */
    public static final class C30245b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $clearAll;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30245b(EventInstancePagingViewModel gVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
            this.$clearAll = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30245b bVar = new C30245b(this.this$0, this.$clearAll, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30245b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0112 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
            // Method dump skipped, instructions count: 309
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel.C30245b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel$refresh$1", mo239173f = "EventInstancePagingViewModel.kt", mo239174i = {0, 0}, mo239175l = {150}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "loadCount"}, mo239178s = {"L$0", "I$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.g$f */
    public static final class C30249f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ EventInstancePagingViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30249f(EventInstancePagingViewModel gVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30249f fVar = new C30249f(this.this$0, cVar);
            fVar.p$ = (CoroutineScope) obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30249f) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C30249f fVar;
            CoroutineScope ahVar;
            int i;
            boolean z;
            boolean z2;
            Object a = C69086a.m265828a();
            int i2 = this.label;
            if (i2 == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar2 = this.p$;
                if (this.this$0.calServerId.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return Unit.INSTANCE;
                }
                Deferred<? extends SdkSender.C53233d<Paging>> aoVar = this.this$0.loadFutureDeferred;
                if (aoVar != null) {
                    Job.C69372a.m266400a(aoVar, null, 1, null);
                }
                Deferred<? extends SdkSender.C53233d<Paging>> aoVar2 = null;
                this.this$0.loadFutureDeferred = aoVar2;
                Deferred<? extends SdkSender.C53233d<Paging>> aoVar3 = this.this$0.loadPastDeferred;
                if (aoVar3 != null) {
                    Job.C69372a.m266400a(aoVar3, null, 1, null);
                }
                this.this$0.loadPastDeferred = aoVar2;
                this.this$0.setLoadFutureStatus(new LoadStatus(0, false, false, 6, null));
                this.this$0.setLoadPastStatus(new LoadStatus(0, false, false, 6, null));
                EventInstancePagingViewModel gVar = this.this$0;
                CalendarDate moveThisDateToDayStart = new CalendarDate(gVar.current).moveThisDateToDayStart();
                Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "CalendarDate(current).moveThisDateToDayStart()");
                gVar.futurePaging = new Paging(moveThisDateToDayStart, this.this$0.current.getJulianDay(), null, null, null, 28, null);
                EventInstancePagingViewModel gVar2 = this.this$0;
                CalendarDate moveThisDateToDayEnd = new CalendarDate(gVar2.current).addDay(-1).moveThisDateToDayEnd();
                Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayEnd, "CalendarDate(current).ad…1).moveThisDateToDayEnd()");
                gVar2.pastPaging = new Paging(moveThisDateToDayEnd, this.this$0.current.getJulianDay() - 1, null, null, null, 28, null);
                i = 0;
                z = true;
                ahVar = ahVar2;
                fVar = this;
            } else if (i2 == 1) {
                i = this.I$0;
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                fVar = this;
                i++;
                if (fVar.this$0.loadFutureStatus.mo109241a() == 2 || fVar.this$0.getList().size() >= fVar.this$0.reloadDataThreshold || i >= fVar.this$0.maxLoadCountAtRefresh) {
                    return Unit.INSTANCE;
                }
                z = false;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Job loadFuture = fVar.this$0.loadFuture(z);
            fVar.L$0 = ahVar;
            fVar.I$0 = i;
            fVar.label = 1;
            if (loadFuture.mo242735b(fVar) == a) {
                return a;
            }
            i++;
            if (fVar.this$0.loadFutureStatus.mo109241a() == 2) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void init(String str, CalendarDate calendarDate, CalendarDate calendarDate2) {
        Intrinsics.checkParameterIsNotNull(str, "calServerId");
        Intrinsics.checkParameterIsNotNull(calendarDate, "minLoadDate");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "maxLoadDate");
        this.calServerId = str;
        this.minLoadDate = calendarDate;
        this.maxLoadDate = calendarDate2;
    }

    public static /* synthetic */ Job loadFuture$default(EventInstancePagingViewModel gVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return gVar.loadFuture(z);
    }

    public final ArrayList<CalendarDateHolder> transformResponse(PullCalendarInstancesResponse pullCalendarInstancesResponse, int i, int i2, int i3, int i4) {
        long timeInSeconds;
        boolean z;
        int intValue;
        int intValue2;
        String str;
        Map<String, CalendarResource> map;
        ArrayList<CalendarDateHolder> arrayList = new ArrayList<>();
        if (i > i3) {
            return arrayList;
        }
        IntRange kVar = new IntRange(i, i3);
        List<EventInfoInstances> list2 = pullCalendarInstancesResponse.calendar_instances;
        if (list2 != null) {
            for (T t : list2) {
                Intrinsics.checkExpressionValueIsNotNull(t, "instances");
                if (C30237a.m112296a((EventInfoInstances) t)) {
                    List<String> list3 = t.resource_calendar_ids;
                    CalendarResource calendarResource = null;
                    if (!(list3 == null || (str = (String) CollectionsKt.firstOrNull((List) list3)) == null || (map = pullCalendarInstancesResponse.calendar_id_to_resource) == null)) {
                        calendarResource = map.get(str);
                    }
                    List<InstanceSpan> list4 = t.instance_spans;
                    if (list4 != null) {
                        for (T t2 : list4) {
                            Integer num = t2.start_day;
                            Integer num2 = t2.end_day;
                            int intValue3 = num.intValue();
                            Intrinsics.checkExpressionValueIsNotNull(num2, "instanceEndDay");
                            if (Intrinsics.compare(intValue3, num2.intValue()) <= 0 && (intValue = num.intValue()) <= (intValue2 = num2.intValue())) {
                                while (true) {
                                    if (kVar.mo239410a(intValue)) {
                                        String str2 = this.calServerId;
                                        Intrinsics.checkExpressionValueIsNotNull(t2, "span");
                                        InstanceCardInfo a = C30251i.m112378a(str2, intValue, t, t2, calendarResource);
                                        a.mo109228a(this.calendar);
                                        arrayList.add(a);
                                    }
                                    if (intValue == intValue2) {
                                        break;
                                    }
                                    intValue++;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i4 < i2) {
            try {
                CollectionsKt.sortWith(arrayList, CalendarDateHolderComparator.f75613a);
            } catch (IllegalArgumentException e) {
                String str3 = this.tag;
                C53241h.m205898b(str3, "sortWith instances: " + e);
            }
            return arrayList;
        }
        CalendarDate julianDay = new CalendarDate().setJulianDay(i4);
        CalendarDate julianDay2 = new CalendarDate().setJulianDay(i2);
        do {
            Intrinsics.checkExpressionValueIsNotNull(julianDay2, "date");
            if (C32645b.m125235a(julianDay2)) {
                CalendarDate calendarDate = new CalendarDate(julianDay2, julianDay2.getTimeZone());
                if (julianDay2.getYear() != this.current.getYear()) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new MonthInfo(calendarDate, z));
            }
            julianDay2 = C32645b.m125237b(julianDay2);
            Intrinsics.checkExpressionValueIsNotNull(julianDay2, "date");
            timeInSeconds = julianDay2.getTimeInSeconds();
            Intrinsics.checkExpressionValueIsNotNull(julianDay, "endDateForWeek");
        } while (timeInSeconds <= julianDay.getTimeInSeconds());
        CalendarDate julianDay3 = new CalendarDate().setJulianDay(i2);
        do {
            Intrinsics.checkExpressionValueIsNotNull(julianDay3, "date");
            if (C32645b.m125238b(julianDay3, this.dayOfWeek)) {
                arrayList.add(new WeekInfo(new CalendarDate(julianDay3, julianDay3.getTimeZone()), this.dayOfWeek));
            }
            julianDay3 = C32645b.m125241c(julianDay3, this.dayOfWeek);
            Intrinsics.checkExpressionValueIsNotNull(julianDay3, "date");
        } while (julianDay3.getTimeInSeconds() <= julianDay.getTimeInSeconds());
        try {
            CollectionsKt.sortWith(arrayList, CalendarDateHolderComparator.f75613a);
        } catch (IllegalArgumentException e2) {
            String str4 = this.tag;
            C53241h.m205898b(str4, "sortWith weeks and months: " + e2);
        }
        return arrayList;
    }
}
