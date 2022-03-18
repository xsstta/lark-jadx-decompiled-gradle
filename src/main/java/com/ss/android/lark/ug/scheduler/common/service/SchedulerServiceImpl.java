package com.ss.android.lark.ug.scheduler.common.service;

import com.bytedance.lark.pb.ugreach.v1.LocalRule;
import com.bytedance.lark.pb.ugreach.v1.ReachPointEntity;
import com.bytedance.lark.pb.ugreach.v1.ScenarioContext;
import com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback;
import com.ss.android.lark.ug.scheduler.common.api.SchedulerService;
import com.ss.android.lark.ug.scheduler.common.apm.SchedulerApm;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import com.ss.android.lark.ug.scheduler.common.exception.SchedulerException;
import com.ss.android.lark.ug.scheduler.coordinator.service.CoordinatorServiceFactory;
import com.ss.android.lark.ug.scheduler.coordinator.service.CoordinatorServiceImpl;
import com.ss.android.lark.ug.scheduler.rule.api.RuleService;
import com.ss.android.lark.ug.scheduler.rule.service.RuleServiceFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017H\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010$\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010+\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/service/SchedulerServiceImpl;", "Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService;", "Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "()V", "coordinatorService", "Lcom/ss/android/lark/ug/scheduler/coordinator/service/CoordinatorServiceImpl;", "onSchedulerCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "ruleService", "Lcom/ss/android/lark/ug/scheduler/rule/api/RuleService;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "clear", "", "handleEventAction", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "pbLocalRule", "Lcom/bytedance/lark/pb/ugreach/v1/LocalRule;", "Lcom/ss/android/lark/ug/scheduler/common/PBLocalRule;", "onHide", "reachPointEntities", "", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "onReachPointUpdate", "reachPointState", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointState;", "reachPointIds", "", "onScenarioEnter", "scenarioContext", "Lcom/bytedance/lark/pb/ugreach/v1/ScenarioContext;", "onScenarioLeave", "scenarioId", "onScenarioUpdate", "onShow", "registerOnSchedulerCallback", "onSchedulerCallback", "setLogger", "logger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "setStorage", "unregisterOnSchedulerCallback", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.common.c.c */
public final class SchedulerServiceImpl implements OnSchedulerCallback, SchedulerService {

    /* renamed from: b */
    public static final Lazy f141776b = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57538b.INSTANCE);

    /* renamed from: c */
    public static final Companion f141777c = new Companion(null);

    /* renamed from: d */
    private final CopyOnWriteArrayList<OnSchedulerCallback> f141778d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private final RuleService f141779e = RuleServiceFactory.m223534a();

    /* renamed from: f */
    private final CoordinatorServiceImpl f141780f = CoordinatorServiceFactory.m223434a(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/common/service/SchedulerServiceImpl$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService;", "getInstance", "()Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService;", "instance$delegate", "Lkotlin/Lazy;", "inst", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.common.c.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f141781a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/ss/android/lark/ug/scheduler/common/api/SchedulerService;"))};

        /* renamed from: b */
        private final SchedulerService m223425b() {
            Lazy lazy = SchedulerServiceImpl.f141776b;
            Companion aVar = SchedulerServiceImpl.f141777c;
            KProperty kProperty = f141781a[0];
            return (SchedulerService) lazy.getValue();
        }

        private Companion() {
        }

        /* renamed from: a */
        public final SchedulerService mo195279a() {
            return m223425b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/scheduler/common/service/SchedulerServiceImpl;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.common.c.c$b */
    static final class C57538b extends Lambda implements Function0<SchedulerServiceImpl> {
        public static final C57538b INSTANCE = new C57538b();

        C57538b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SchedulerServiceImpl invoke() {
            return new SchedulerServiceImpl();
        }
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: a */
    public void mo195264a() {
        this.f141779e.mo195359a();
        this.f141780f.mo195292a();
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: b */
    public void mo195269b(OnSchedulerCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onSchedulerCallback");
        this.f141778d.remove(bVar);
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: a */
    public void mo195266a(OnSchedulerCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onSchedulerCallback");
        this.f141778d.addIfAbsent(bVar);
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback
    /* renamed from: b */
    public void mo195146b(Collection<ReachPointEntity> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "reachPointEntities");
        Iterator<T> it = this.f141778d.iterator();
        while (it.hasNext()) {
            it.next().mo195146b(collection);
        }
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: a */
    public void mo195265a(ScenarioContext scenarioContext) {
        Intrinsics.checkParameterIsNotNull(scenarioContext, "scenarioContext");
        try {
            this.f141780f.mo195293a(scenarioContext);
        } catch (SchedulerException e) {
            SchedulerApm aVar = SchedulerApm.f141772a;
            String str = scenarioContext.scenario_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "scenarioContext.scenario_id");
            aVar.mo195274a(str, e);
        } catch (Exception e2) {
            SchedulerApm aVar2 = SchedulerApm.f141772a;
            String str2 = scenarioContext.scenario_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "scenarioContext.scenario_id");
            aVar2.mo195275a(str2, "onScenarioEnter: " + e2.getMessage());
        }
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback
    /* renamed from: a */
    public void mo195145a(Collection<ReachPointEntity> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "reachPointEntities");
        Iterator<T> it = this.f141778d.iterator();
        while (it.hasNext()) {
            it.next().mo195145a(collection);
        }
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: a */
    public void mo195267a(ReachPointState reachPointState, Collection<String> collection) {
        Intrinsics.checkParameterIsNotNull(reachPointState, "reachPointState");
        Intrinsics.checkParameterIsNotNull(collection, "reachPointIds");
        try {
            this.f141780f.mo195294a(reachPointState, collection);
        } catch (Exception e) {
            SchedulerApm aVar = SchedulerApm.f141772a;
            aVar.mo195275a("", "onReachPointUpdate: " + e.getMessage() + ", state: " + reachPointState);
        }
    }

    @Override // com.ss.android.lark.ug.scheduler.common.api.SchedulerService
    /* renamed from: a */
    public boolean mo195268a(ReachPointAction aVar, LocalRule localRule) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        Intrinsics.checkParameterIsNotNull(localRule, "pbLocalRule");
        try {
            return this.f141779e.mo195360a(aVar, com.ss.android.lark.ug.scheduler.rule.entity.LocalRule.f141839a.mo195405a(localRule));
        } catch (SchedulerException e) {
            SchedulerApm.f141772a.mo195276a(aVar.mo195280a(), String.valueOf(localRule.rule_id.longValue()), e);
            return false;
        } catch (Exception e2) {
            SchedulerApm aVar2 = SchedulerApm.f141772a;
            String a = aVar.mo195280a();
            String valueOf = String.valueOf(localRule.rule_id.longValue());
            aVar2.mo195277a(a, valueOf, "handleEventAction: " + e2.getMessage());
            return false;
        }
    }
}
