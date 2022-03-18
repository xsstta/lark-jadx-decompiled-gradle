package com.ss.android.lark.calendar.impl.features.meetingroom.base;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32064b;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ApprovalTipDialogData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceStrategyDataHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.StrategyTipDialogData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceApprovalDialog;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.cr;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0002&'B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007JG\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJE\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0019H@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$J8\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess;", "", "context", "Landroid/content/Context;", "selectMeetingRooms", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "editTimeActionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$EditTimeActionListener;", "getEditTimeActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$EditTimeActionListener;", "setEditTimeActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$EditTimeActionListener;)V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "getMainScope", "()Lkotlinx/coroutines/CoroutineScope;", "checkShowApprovalTipResourceDialog", "Lkotlin/Pair;", "", "", "startTime", "", "endTime", "eventRRule", "eventOriginalTime", "originalEventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "(JJLjava/lang/String;JLcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkShowUnUsableMeetingRoomDialog", "timeZoneId", "(JJLjava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "", "startCheckTime", "Companion", "EditTimeActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c */
public final class ResourceEditTimeProcess {

    /* renamed from: b */
    public static final Companion f81960b = new Companion(null);

    /* renamed from: a */
    public final List<CalendarEventAttendee> f81961a;

    /* renamed from: c */
    private EditTimeActionListener f81962c;

    /* renamed from: d */
    private final CoroutineScope f81963d = C69364ai.m266265a(cr.m266795a(null, 1, null).plus(Dispatchers.m266324b().mo242660a()));

    /* renamed from: e */
    private final Context f81964e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$EditTimeActionListener;", "", "reverseTime", "", "saveTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$b */
    public interface EditTimeActionListener {
        /* renamed from: a */
        void mo115470a();

        /* renamed from: b */
        void mo115471b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceEditTimeProcess$Companion;", "", "()V", "REVERSE_TIME_KEY", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final EditTimeActionListener mo117004a() {
        return this.f81962c;
    }

    /* renamed from: c */
    public final Context mo117010c() {
        return this.f81964e;
    }

    /* renamed from: b */
    public final void mo117009b() {
        C69364ai.m266267a(this.f81963d, null, 1, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$c */
    public static final class C32054c extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $continuation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32054c(CancellableContinuation kVar) {
            super(0);
            this.$continuation = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$continuation, TuplesKt.to(false, ""));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$d */
    public static final class C32055d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $continuation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32055d(CancellableContinuation kVar) {
            super(0);
            this.$continuation = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$continuation, TuplesKt.to(true, ""));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$e */
    public static final class C32056e extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $continuation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32056e(CancellableContinuation kVar) {
            super(0);
            this.$continuation = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$continuation, TuplesKt.to(false, "reverse_time"));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$f */
    public static final class C32057f extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $continuation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32057f(CancellableContinuation kVar) {
            super(0);
            this.$continuation = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$continuation, TuplesKt.to(false, ""));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$g */
    public static final class C32058g extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $continuation;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32058g(CancellableContinuation kVar) {
            super(0);
            this.$continuation = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$continuation, TuplesKt.to(true, ""));
        }
    }

    /* renamed from: a */
    public final void mo117008a(EditTimeActionListener bVar) {
        this.f81962c = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditTimeProcess$startCheckTime$1", mo239173f = "ResourceEditTimeProcess.kt", mo239174i = {0, 1, 1}, mo239175l = {45, 48}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "checkResult"}, mo239178s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.c$h */
    static final class C32059h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $endTime;
        final /* synthetic */ long $eventOriginalTime;
        final /* synthetic */ String $eventRRule;
        final /* synthetic */ OriginalEventData $originalEventData;
        final /* synthetic */ long $startTime;
        final /* synthetic */ String $timeZoneId;
        Object L$0;
        Object L$1;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ResourceEditTimeProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32059h(ResourceEditTimeProcess cVar, long j, long j2, String str, String str2, long j3, OriginalEventData bVar, Continuation cVar2) {
            super(2, cVar2);
            this.this$0 = cVar;
            this.$startTime = j;
            this.$endTime = j2;
            this.$timeZoneId = str;
            this.$eventRRule = str2;
            this.$eventOriginalTime = j3;
            this.$originalEventData = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32059h hVar = new C32059h(this.this$0, this.$startTime, this.$endTime, this.$timeZoneId, this.$eventRRule, this.$eventOriginalTime, this.$originalEventData, cVar);
            hVar.p$ = (CoroutineScope) obj;
            return hVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32059h) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 165
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceEditTimeProcess.C32059h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceEditTimeProcess(Context context, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(list, "selectMeetingRooms");
        this.f81964e = context;
        this.f81961a = list;
    }

    /* renamed from: a */
    public final void mo117007a(long j, long j2, String str, String str2, long j3, OriginalEventData bVar) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(str2, "eventRRule");
        Job unused = C69553g.m266944a(this.f81963d, null, null, new C32059h(this, j, j2, str, str2, j3, bVar, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo117005a(long j, long j2, String str, long j3, OriginalEventData bVar, Continuation<? super Pair<Boolean, String>> cVar) {
        boolean z;
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        C32055d dVar = new C32055d(lVar2);
        C32054c cVar2 = new C32054c(lVar2);
        ResourceApprovalDataHelper cVar3 = ResourceApprovalDataHelper.f81975a;
        if (j3 != 0) {
            z = true;
        } else {
            z = false;
        }
        ApprovalTipDialogData a = cVar3.mo117026a(j, j2, str, z, bVar, this.f81961a);
        if (a != null) {
            ResourceApprovalDialog.f81930a.mo116990a(mo117010c(), a.mo117014b(), a.mo117015c(), dVar, cVar2);
        } else {
            C32064b.m121942a(lVar2, TuplesKt.to(C69089a.m265837a(true), ""));
        }
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo117006a(long j, long j2, String str, String str2, long j3, Continuation<? super Pair<Boolean, String>> cVar) {
        boolean z;
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        C32058g gVar = new C32058g(lVar2);
        C32056e eVar = new C32056e(lVar2);
        C32057f fVar = new C32057f(lVar2);
        StrategyTipDialogData a = ResourceStrategyDataHelper.f81976a.mo117031a(j, j2, str2, j3, this.f81961a);
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        if (!C69089a.m265837a(z).booleanValue()) {
            a = null;
        }
        if (a != null) {
            new ResourceStrategyDialog().mo116995a(mo117010c(), a.mo117033a(j, str), gVar, eVar, fVar);
        } else {
            C32064b.m121942a(lVar2, TuplesKt.to(C69089a.m265837a(true), ""));
        }
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }
}
