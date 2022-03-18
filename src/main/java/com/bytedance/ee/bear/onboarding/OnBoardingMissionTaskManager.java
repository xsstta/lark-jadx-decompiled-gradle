package com.bytedance.ee.bear.onboarding;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d;
import com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c;
import com.bytedance.ee.bear.onboarding.export.ui.C10403a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.Deque;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J+\u0010\u001c\u001a\u00020\u0015\"\b\b\u0000\u0010\u001e*\u00020\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u00052\u0006\u0010 \u001a\u0002H\u001e¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0007H\u0002J\u0016\u0010$\u001a\u00020\u00152\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005J\u0006\u0010%\u001a\u00020\u0015J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010 \u001a\u00020'H\u0002J \u0010(\u001a\u00020\u0015\"\b\b\u0000\u0010\u001e*\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001e0)H\u0002J\b\u0010*\u001a\u00020\u0015H\u0002R0\u0010\u0003\u001a\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/OnBoardingMissionTaskManager;", "", "()V", "checkDependencyIsFinishDelegate", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/onboarding/export/mission/OnBoardingMission;", "Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;", "", "getCheckDependencyIsFinishDelegate", "()Lkotlin/jvm/functions/Function1;", "setCheckDependencyIsFinishDelegate", "(Lkotlin/jvm/functions/Function1;)V", "checkHasFinishDelegate", "", "getCheckHasFinishDelegate", "setCheckHasFinishDelegate", "delayedRunnable", "Ljava/lang/Runnable;", "missionFinishListener", "Lcom/bytedance/ee/bear/onboarding/export/IOnBoardingPlayer$MissionFinishListener;", "onBoardingFinishCallback", "", "getOnBoardingFinishCallback", "setOnBoardingFinishCallback", "playingTask", "Lcom/bytedance/ee/bear/onboarding/Task;", "taskQueue", "Ljava/util/Deque;", "addTask", "task", "UI", "mission", "onBoardingUI", "(Lcom/bytedance/ee/bear/onboarding/export/mission/OnBoardingMission;Lcom/bytedance/ee/bear/onboarding/export/ui/OnBoardingUI;)V", "afterPlay", "succeed", "dismiss", "dispose", "isMissionContextReady", "Lcom/bytedance/ee/bear/onboarding/export/ui/BaseOnBoardingUI;", "play", "Lcom/bytedance/ee/bear/onboarding/RealTask;", "tryPlayNext", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.b */
public final class OnBoardingMissionTaskManager {

    /* renamed from: c */
    public static final String f27911c;

    /* renamed from: d */
    public static final Companion f27912d = new Companion(null);

    /* renamed from: a */
    public final Deque<Task> f27913a = new LinkedList();

    /* renamed from: b */
    public Task f27914b;

    /* renamed from: e */
    private Runnable f27915e;

    /* renamed from: f */
    private Function1<? super String, Unit> f27916f;

    /* renamed from: g */
    private Function1<? super AbstractC10397d<? extends AbstractC10405c>, Boolean> f27917g;

    /* renamed from: h */
    private Function1<? super String, Boolean> f27918h;

    /* renamed from: i */
    private final AbstractC10400d.AbstractC10401a f27919i = new AbstractC10400d.AbstractC10401a(this) {
        /* class com.bytedance.ee.bear.onboarding.OnBoardingMissionTaskManager.C103771 */

        /* renamed from: a */
        final /* synthetic */ OnBoardingMissionTaskManager f27920a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f27920a = r1;
        }

        @Override // com.bytedance.ee.bear.onboarding.export.AbstractC10400d.AbstractC10401a
        /* renamed from: a */
        public void mo39530a(AbstractC10397d<? extends AbstractC10405c> dVar, boolean z) {
            Function1<String, Unit> a;
            Intrinsics.checkParameterIsNotNull(dVar, "mission");
            String b = dVar.mo21352b();
            C13479a.m54772d("OnBoardingManager", OnBoardingMissionTaskManager.f27912d.mo39531a() + ", onFinishPlay [" + b + "] ... hasPerformAction: " + z);
            Task gVar = this.f27920a.f27914b;
            if (gVar != null && Intrinsics.areEqual(((RealTask) gVar).mo39615b(), dVar)) {
                if (z && (a = this.f27920a.mo39521a()) != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "id");
                    a.invoke(b);
                }
                this.f27920a.mo39524a(gVar, true);
            }
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/OnBoardingMissionTaskManager$Companion;", "", "()V", "DELAY", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39531a() {
            return OnBoardingMissionTaskManager.f27911c;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<String, Unit> mo39521a() {
        return this.f27916f;
    }

    /* renamed from: c */
    public final void mo39528c() {
        Runnable runnable = this.f27915e;
        if (runnable != null) {
            C13742g.m55710c(runnable);
        }
    }

    static {
        String simpleName = OnBoardingMissionTaskManager.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "OnBoardingMissionTaskMan…er::class.java.simpleName");
        f27911c = simpleName;
    }

    /* renamed from: b */
    public final void mo39526b() {
        if (this.f27914b == null && !this.f27913a.isEmpty()) {
            Task peekFirst = this.f27913a.peekFirst();
            if (peekFirst instanceof RealTask) {
                this.f27913a.removeFirst();
                m43156a((RealTask) peekFirst);
                return;
            }
            if (peekFirst instanceof PendingTask) {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/onboarding/OnBoardingMissionTaskManager$afterPlay$1", "Ljava/lang/Runnable;", "run", "", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.b$b */
    public static final class RunnableC10378b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OnBoardingMissionTaskManager f27921a;

        /* renamed from: b */
        final /* synthetic */ PendingTask f27922b;

        public void run() {
            if (Intrinsics.areEqual(this.f27921a.f27913a.peekFirst(), this.f27922b)) {
                C13479a.m54772d("OnBoardingManager", '[' + OnBoardingMissionTaskManager.f27912d.mo39531a() + "]Pending Task out of date : " + this.f27922b.mo39544a());
                this.f27921a.f27913a.removeFirst();
                this.f27921a.mo39526b();
            }
        }

        RunnableC10378b(OnBoardingMissionTaskManager bVar, PendingTask eVar) {
            this.f27921a = bVar;
            this.f27922b = eVar;
        }
    }

    /* renamed from: b */
    public final void mo39527b(Function1<? super AbstractC10397d<? extends AbstractC10405c>, Boolean> function1) {
        this.f27917g = function1;
    }

    /* renamed from: c */
    public final void mo39529c(Function1<? super String, Boolean> function1) {
        this.f27918h = function1;
    }

    /* renamed from: a */
    public final void mo39525a(Function1<? super String, Unit> function1) {
        this.f27916f = function1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/onboarding/Task;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.b$c */
    public static final class C10379c extends Lambda implements Function1<Task, Boolean> {
        final /* synthetic */ AbstractC10397d $mission;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10379c(AbstractC10397d dVar) {
            super(1);
            this.$mission = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Boolean invoke(Task gVar) {
            return Boolean.valueOf(invoke(gVar));
        }

        public final boolean invoke(Task gVar) {
            if (!(gVar instanceof RealTask) || !Intrinsics.areEqual(((RealTask) gVar).mo39615b(), this.$mission)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private final boolean m43158a(C10403a aVar) {
        Lifecycle.State state;
        boolean z;
        Lifecycle lifecycle;
        FragmentActivity d = aVar.mo39612d();
        if (d == null || (lifecycle = d.getLifecycle()) == null) {
            state = null;
        } else {
            state = lifecycle.getCurrentState();
        }
        if (state == Lifecycle.State.RESUMED) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !aVar.mo22171a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m43157a(Task gVar) {
        Task peekFirst = this.f27913a.peekFirst();
        if (!(peekFirst instanceof PendingTask) || !(gVar instanceof RealTask) || !Intrinsics.areEqual(((PendingTask) peekFirst).mo39544a(), ((RealTask) gVar).mo39614a())) {
            this.f27913a.add(gVar);
        } else {
            this.f27913a.removeFirst();
            this.f27913a.addFirst(gVar);
        }
        C13479a.m54772d("OnBoardingManager", "New task added, queue size: " + this.f27913a.size());
        mo39526b();
    }

    /* renamed from: a */
    public final void mo39522a(AbstractC10397d<? extends AbstractC10405c> dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "mission");
        Task gVar = this.f27914b;
        if (!(gVar instanceof RealTask) || !Intrinsics.areEqual(((RealTask) gVar).mo39615b(), dVar)) {
            CollectionsKt.removeAll(this.f27913a, new C10379c(dVar));
        } else {
            mo39524a(gVar, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <UI extends com.bytedance.ee.bear.onboarding.export.ui.AbstractC10405c> void m43156a(com.bytedance.ee.bear.onboarding.RealTask<UI> r9) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.OnBoardingMissionTaskManager.m43156a(com.bytedance.ee.bear.onboarding.f):void");
    }

    /* renamed from: a */
    public final <UI extends AbstractC10405c> void mo39523a(AbstractC10397d<UI> dVar, UI ui) {
        Intrinsics.checkParameterIsNotNull(dVar, "mission");
        Intrinsics.checkParameterIsNotNull(ui, "onBoardingUI");
        m43157a((Task) new RealTask(dVar, ui));
    }

    /* renamed from: a */
    public final void mo39524a(Task gVar, boolean z) {
        String a;
        this.f27914b = null;
        if (z && (gVar instanceof RealTask) && (a = ((RealTask) gVar).mo39614a()) != null) {
            PendingTask eVar = new PendingTask(a);
            this.f27913a.addFirst(eVar);
            RunnableC10378b bVar = new RunnableC10378b(this, eVar);
            this.f27915e = bVar;
            C13742g.m55706a(bVar, 1000);
        }
        String str = f27911c;
        C13479a.m54772d(str, "Total time in queue: " + (((double) (System.currentTimeMillis() - gVar.mo39617d())) / 1000.0d) + 's');
        mo39526b();
    }
}
