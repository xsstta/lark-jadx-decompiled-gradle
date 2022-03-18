package com.ss.android.lark.calendar.impl.features.meetingroom.base;

import android.content.Context;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32064b;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ApprovalTipDialogData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.OriginalEventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceApprovalDataHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.ResourceStrategyDataHelper;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.helper.StrategyTipDialogData;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceApprovalDialog;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.widget.ResourceStrategyDialog;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.mediapicker.utils.C44763p;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.C69091e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001)B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJC\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ9\u0010 \u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0006\u0010\"\u001a\u00020\u0013J:\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess;", "", "activity", "Landroid/content/Context;", "eventMeetingRoom", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "(Landroid/content/Context;Ljava/util/List;)V", "getActivity", "()Landroid/content/Context;", "dragSaveActionListener", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$DragSaveActionListener;", "getDragSaveActionListener", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$DragSaveActionListener;", "setDragSaveActionListener", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$DragSaveActionListener;)V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "checkSaveEvent", "", "editStartTime", "", "editEndTime", "timeZoneId", "", "eventRRule", "eventOriginalTime", "originalEventData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;", "checkShowApprovalDialog", "", "(JJLjava/lang/String;Ljava/lang/String;JLcom/ss/android/lark/calendar/impl/features/meetingroom/base/helper/OriginalEventData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkShowUnusableMeetingRoomDialog", "(JJLjava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "showMeetingRoomApprovalDialog", "context", "confirmClickedAction", "Lkotlin/Function0;", "cancelAction", "meetingRoomApprovals", "DragSaveActionListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a */
public final class ResourceDragSaveProcess {

    /* renamed from: a */
    public final List<CalendarEventAttendee> f81913a;

    /* renamed from: b */
    private final CoroutineScope f81914b = C69364ai.m266265a(cr.m266795a(null, 1, null).plus(Dispatchers.m266324b().mo242660a()));

    /* renamed from: c */
    private DragSaveActionListener f81915c;

    /* renamed from: d */
    private final Context f81916d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$DragSaveActionListener;", "", "cancelSave", "", "nextActionProcess", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$a */
    public interface DragSaveActionListener {
        /* renamed from: a */
        void mo111626a();

        /* renamed from: b */
        void mo111627b();
    }

    /* renamed from: a */
    public final DragSaveActionListener mo116979a() {
        return this.f81915c;
    }

    /* renamed from: b */
    public final Context mo116985b() {
        return this.f81916d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$d */
    public static final class C32031d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32031d(CancellableContinuation kVar) {
            super(0);
            this.$it = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$it, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$e */
    public static final class C32032e extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32032e(CancellableContinuation kVar) {
            super(0);
            this.$it = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$it, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$f */
    public static final class C32033f extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32033f(CancellableContinuation kVar) {
            super(0);
            this.$it = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$it, false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$g */
    public static final class C32034g extends Lambda implements Function0<Unit> {
        final /* synthetic */ CancellableContinuation $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32034g(CancellableContinuation kVar) {
            super(0);
            this.$it = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C32064b.m121942a(this.$it, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$h */
    public static final class RunnableC32035h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f81926a;

        /* renamed from: b */
        final /* synthetic */ Function1 f81927b;

        /* renamed from: c */
        final /* synthetic */ Function1 f81928c;

        /* renamed from: d */
        final /* synthetic */ List f81929d;

        RunnableC32035h(Context context, Function1 function1, Function1 function12, List list) {
            this.f81926a = context;
            this.f81927b = function1;
            this.f81928c = function12;
            this.f81929d = list;
        }

        public final void run() {
            ResourceApprovalDialog.m121913a(ResourceApprovalDialog.f81930a, this.f81926a, true, this.f81927b, this.f81928c, this.f81929d, null, 32, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/calendar/impl/features/meetingroom/base/ResourceDragSaveProcess$checkShowApprovalDialog$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$c */
    public static final class RunnableC32030c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ApprovalTipDialogData f81917a;

        /* renamed from: b */
        final /* synthetic */ Function0 f81918b;

        /* renamed from: c */
        final /* synthetic */ Function0 f81919c;

        /* renamed from: d */
        final /* synthetic */ ResourceDragSaveProcess f81920d;

        /* renamed from: e */
        final /* synthetic */ long f81921e;

        /* renamed from: f */
        final /* synthetic */ long f81922f;

        /* renamed from: g */
        final /* synthetic */ String f81923g;

        /* renamed from: h */
        final /* synthetic */ long f81924h;

        /* renamed from: i */
        final /* synthetic */ OriginalEventData f81925i;

        RunnableC32030c(ApprovalTipDialogData aVar, Function0 function0, Function0 function02, ResourceDragSaveProcess aVar2, long j, long j2, String str, long j3, OriginalEventData bVar) {
            this.f81917a = aVar;
            this.f81918b = function0;
            this.f81919c = function02;
            this.f81920d = aVar2;
            this.f81921e = j;
            this.f81922f = j2;
            this.f81923g = str;
            this.f81924h = j3;
            this.f81925i = bVar;
        }

        public final void run() {
            ResourceApprovalDialog aVar = ResourceApprovalDialog.f81930a;
            Context b = this.f81920d.mo116985b();
            String b2 = C32634ae.m125182b(R.string.Calendar_Rooms_ChangeTimeDesc);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…dar_Rooms_ChangeTimeDesc)");
            aVar.mo116990a(b, b2, this.f81917a.mo117015c(), this.f81918b, this.f81919c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "str", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$i */
    public static final class C32036i extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Function0 $cancelAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32036i(Function0 function0) {
            super(1);
            this.$cancelAction = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "str");
            this.$cancelAction.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "str", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$j */
    public static final class C32037j extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ Function0 $confirmClickedAction;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32037j(Function0 function0) {
            super(1);
            this.$confirmClickedAction = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "str");
            this.$confirmClickedAction.invoke();
        }
    }

    /* renamed from: a */
    public final void mo116984a(DragSaveActionListener aVar) {
        this.f81915c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceDragSaveProcess$checkSaveEvent$1", mo239173f = "ResourceDragSaveProcess.kt", mo239174i = {0, 1, 1}, mo239175l = {57, 60}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "checkResult"}, mo239178s = {"L$0", "L$0", "Z$0"})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.base.a$b */
    public static final class C32029b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $editEndTime;
        final /* synthetic */ long $editStartTime;
        final /* synthetic */ long $eventOriginalTime;
        final /* synthetic */ String $eventRRule;
        final /* synthetic */ OriginalEventData $originalEventData;
        final /* synthetic */ String $timeZoneId;
        Object L$0;
        boolean Z$0;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ ResourceDragSaveProcess this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32029b(ResourceDragSaveProcess aVar, long j, long j2, String str, String str2, long j3, OriginalEventData bVar, Continuation cVar) {
            super(2, cVar);
            this.this$0 = aVar;
            this.$editStartTime = j;
            this.$editEndTime = j2;
            this.$timeZoneId = str;
            this.$eventRRule = str2;
            this.$eventOriginalTime = j3;
            this.$originalEventData = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C32029b bVar = new C32029b(this.this$0, this.$editStartTime, this.$editEndTime, this.$timeZoneId, this.$eventRRule, this.$eventOriginalTime, this.$originalEventData, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C32029b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008b A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 155
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meetingroom.base.ResourceDragSaveProcess.C32029b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResourceDragSaveProcess(Context context, List<? extends CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(context, "activity");
        Intrinsics.checkParameterIsNotNull(list, "eventMeetingRoom");
        this.f81916d = context;
        this.f81913a = list;
    }

    /* renamed from: a */
    public final void mo116983a(Context context, Function0<Unit> function0, Function0<Unit> function02, List<? extends CalendarEventAttendee> list) {
        C44763p.m177517a(new RunnableC32035h(context, new C32037j(function0), new C32036i(function02), list));
    }

    /* renamed from: a */
    public final void mo116982a(long j, long j2, String str, String str2, long j3, OriginalEventData bVar) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        Intrinsics.checkParameterIsNotNull(str2, "eventRRule");
        Job unused = C69553g.m266944a(this.f81914b, null, null, new C32029b(this, j, j2, str, str2, j3, bVar, null), 3, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo116981a(long j, long j2, String str, String str2, long j3, Continuation<? super Boolean> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        C32034g gVar = new C32034g(lVar2);
        C32033f fVar = new C32033f(lVar2);
        StrategyTipDialogData b = ResourceStrategyDataHelper.f81976a.mo117032b(j, j2, str2, j3, this.f81913a);
        if (b == null) {
            C32064b.m121942a(lVar2, C69089a.m265837a(true));
        } else {
            new ResourceStrategyDialog().mo116995a(mo116985b(), b.mo117033a(j, str), gVar, fVar, fVar);
        }
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo116980a(long j, long j2, String str, String str2, long j3, OriginalEventData bVar, Continuation<? super Boolean> cVar) {
        CancellableContinuationImpl lVar = new CancellableContinuationImpl(C69086a.m265825a(cVar), 1);
        CancellableContinuationImpl lVar2 = lVar;
        C32032e eVar = new C32032e(lVar2);
        C32031d dVar = new C32031d(lVar2);
        ApprovalTipDialogData b = ResourceApprovalDataHelper.f81975a.mo117030b(this.f81913a, j, j2, str2, j3, bVar);
        if (b == null) {
            eVar.invoke();
        } else if (b.mo117013a() == 2) {
            mo116983a(mo116985b(), eVar, dVar, b.mo117015c());
        } else if (b.mo117013a() == 1) {
            C44763p.m177517a(new RunnableC32030c(b, eVar, dVar, this, j, j2, str2, j3, bVar));
        }
        Object g = lVar.mo243073g();
        if (g == C69086a.m265828a()) {
            C69091e.m265847c(cVar);
        }
        return g;
    }
}
