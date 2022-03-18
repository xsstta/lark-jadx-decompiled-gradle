package com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1143ag;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.C32510h;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarDetailService;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\"H\u0002J\u0011\u0010'\u001a\u00020\"H@ø\u0001\u0000¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020%H\u0002J\u001a\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010-\u001a\u00020.2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\rJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\rH\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u001f\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "()V", "_deleteStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "_detailInfoStatus", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "_ownerInfo", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "_subscribeStatus", "", "<set-?>", "calServerId", "getCalServerId", "()Ljava/lang/String;", "deleteStatus", "Landroidx/lifecycle/LiveData;", "getDeleteStatus", "()Landroidx/lifecycle/LiveData;", "detailInfo", "getDetailInfo", "()Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "detailInfoStatus", "getDetailInfoStatus", "ownerInfo", "getOwnerInfo", "shareToken", "getShareToken", "subscribeStatus", "getSubscribeStatus", "canLoadFuture", "", "canLoadPast", "changeSubscribe", "Lkotlinx/coroutines/Job;", "subscribe", "checkFetchCalendarId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCalendar", "doAction", ShareHitPoint.f121869d, "payload", "init", "", "refresh", "action", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d */
public final class CalendarDetailViewModel extends AbstractC1142af implements ActionDispatcher {
    public static final Companion Companion = new Companion(null);
    public final C1177w<StatusData<Object>> _deleteStatus;
    public final C1177w<StatusData<CalendarDetailInfo>> _detailInfoStatus;
    public final C1177w<CalendarMemberInfo> _ownerInfo;
    public final C1177w<StatusData<String>> _subscribeStatus;
    public String calServerId = "";
    private final LiveData<StatusData<Object>> deleteStatus;
    private final LiveData<StatusData<CalendarDetailInfo>> detailInfoStatus;
    private final LiveData<CalendarMemberInfo> ownerInfo;
    public String shareToken = "";
    private final LiveData<StatusData<String>> subscribeStatus;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"checkFetchCalendarId", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel", mo239173f = "CalendarDetailViewModel.kt", mo239174i = {0}, mo239175l = {108}, mo239176m = "checkFetchCalendarId", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d$c */
    public static final class C30241c extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CalendarDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30241c(CalendarDetailViewModel dVar, Continuation cVar) {
            super(cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.checkFetchCalendarId(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailViewModel$Companion;", "", "()V", "ACTION_DELETE", "", "ACTION_REFRESH", "ACTION_SUBSCRIBE", "ACTION_UNSUBSCRIBE", "CalendarIsDeletedErr", "", "CalendarIsPrivateErr", "CalendarTypeNotSupportErr", "REFRESH_EXTRA_DELETED", "REFRESH_EXTRA_NOT_SUPPORT", "REFRESH_EXTRA_PRIVACY", "TAG", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getCalServerId() {
        return this.calServerId;
    }

    public final LiveData<StatusData<Object>> getDeleteStatus() {
        return this.deleteStatus;
    }

    public final LiveData<StatusData<CalendarDetailInfo>> getDetailInfoStatus() {
        return this.detailInfoStatus;
    }

    public final LiveData<CalendarMemberInfo> getOwnerInfo() {
        return this.ownerInfo;
    }

    public final String getShareToken() {
        return this.shareToken;
    }

    public final LiveData<StatusData<String>> getSubscribeStatus() {
        return this.subscribeStatus;
    }

    public final boolean canLoadFuture() {
        CalendarDetailInfo detailInfo = getDetailInfo();
        if (detailInfo == null || !detailInfo.mo109185i()) {
            return false;
        }
        return true;
    }

    public final boolean canLoadPast() {
        CalendarDetailInfo detailInfo = getDetailInfo();
        if (detailInfo == null || !detailInfo.mo109185i()) {
            return false;
        }
        return true;
    }

    private final Job deleteCalendar() {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30242d(this, null), 3, null);
    }

    public final CalendarDetailInfo getDetailInfo() {
        StatusData<CalendarDetailInfo> b = this.detailInfoStatus.mo5927b();
        if (b != null) {
            return b.mo118792e();
        }
        return null;
    }

    public CalendarDetailViewModel() {
        C1177w<StatusData<CalendarDetailInfo>> wVar = new C1177w<>();
        this._detailInfoStatus = wVar;
        this.detailInfoStatus = wVar;
        C1177w<CalendarMemberInfo> wVar2 = new C1177w<>();
        this._ownerInfo = wVar2;
        this.ownerInfo = wVar2;
        C1177w<StatusData<String>> wVar3 = new C1177w<>();
        this._subscribeStatus = wVar3;
        this.subscribeStatus = wVar3;
        C1177w<StatusData<Object>> wVar4 = new C1177w<>();
        this._deleteStatus = wVar4;
        this.deleteStatus = wVar4;
    }

    private final Job changeSubscribe(boolean z) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30240b(this, z, null), 3, null);
    }

    public final Job refresh(String str) {
        return C69553g.m266944a(C1143ag.m5356a(this), null, null, new C30243e(this, str, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel$changeSubscribe$1", mo239173f = "CalendarDetailViewModel.kt", mo239174i = {0, 0, 0, 1, 1, 1}, mo239175l = {182, 184}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "detail", "action", "$this$launch", "detail", "action"}, mo239178s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d$b */
    public static final class C30240b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $subscribe;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30240b(CalendarDetailViewModel dVar, boolean z, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$subscribe = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30240b bVar = new C30240b(this.this$0, this.$subscribe, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30240b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel.C30240b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel$deleteCalendar$1", mo239173f = "CalendarDetailViewModel.kt", mo239174i = {0, 1, 1}, mo239175l = {198, 201}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "result"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d$d */
    public static final class C30242d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30242d(CalendarDetailViewModel dVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30242d dVar = new C30242d(this.this$0, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30242d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope ahVar;
            StatusData<Object> b;
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                ahVar = this.p$;
                CalendarDetailInfo detailInfo = this.this$0.getDetailInfo();
                if (detailInfo == null || !detailInfo.mo109188l() || ((b = this.this$0._deleteStatus.mo5927b()) != null && b.mo118789b())) {
                    return Unit.INSTANCE;
                }
                C32510h.m124467a(this.this$0._deleteStatus, null, null, 3, null);
                CalendarDetailService aVar = CalendarDetailService.f83432a;
                String calServerId = this.this$0.getCalServerId();
                this.L$0 = ahVar;
                this.label = 1;
                obj = aVar.mo118843e(calServerId, this);
                if (obj == a) {
                    return a;
                }
            } else if (i == 1) {
                ahVar = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                SdkSender.C53233d dVar = (SdkSender.C53233d) this.L$1;
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
                C32510h.m124471b(this.this$0._deleteStatus, null, null, 3, null);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkSender.C53233d dVar2 = (SdkSender.C53233d) obj;
            if (Intrinsics.areEqual(dVar2.f131572a, C69089a.m265837a(true))) {
                CalendarDetailService aVar2 = CalendarDetailService.f83432a;
                String calServerId2 = this.this$0.getCalServerId();
                this.L$0 = ahVar;
                this.L$1 = dVar2;
                this.label = 2;
                if (aVar2.mo118842d(calServerId2, this) == a) {
                    return a;
                }
                C32510h.m124471b(this.this$0._deleteStatus, null, null, 3, null);
                return Unit.INSTANCE;
            }
            C32510h.m124469a(this.this$0._deleteStatus, dVar2.f131573b, null, null, 6, null);
            return Unit.INSTANCE;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object checkFetchCalendarId(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel.checkFetchCalendarId(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel$refresh$1", mo239173f = "CalendarDetailViewModel.kt", mo239174i = {0, 1}, mo239175l = {SmActions.ACTION_INIT_EXIT, SmActions.ACTION_RINGING_EXIT}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch"}, mo239178s = {"L$0", "L$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.b.d$e */
    public static final class C30243e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $action;
        Object L$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ CalendarDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30243e(CalendarDetailViewModel dVar, String str, Continuation cVar) {
            super(2, cVar);
            this.this$0 = dVar;
            this.$action = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C30243e eVar = new C30243e(this.this$0, this.$action, cVar);
            eVar.p$ = (CoroutineScope) obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C30243e) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x014b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
            // Method dump skipped, instructions count: 498
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel.C30243e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void init(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.calServerId = str;
        if (str2 == null) {
            str2 = "";
        }
        this.shareToken = str2;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    public boolean doAction(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        switch (str.hashCode()) {
            case -2041647576:
                if (str.equals("ACTION_UNSUBSCRIBE")) {
                    changeSubscribe(false);
                    return true;
                }
                return false;
            case -1746781228:
                if (str.equals("ACTION_DELETE")) {
                    deleteCalendar();
                    return true;
                }
                return false;
            case 337808993:
                if (str.equals("ACTION_SUBSCRIBE")) {
                    changeSubscribe(true);
                    return true;
                }
                return false;
            case 1219338674:
                if (str.equals("ACTION_REFRESH")) {
                    refresh("ACTION_REFRESH");
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
