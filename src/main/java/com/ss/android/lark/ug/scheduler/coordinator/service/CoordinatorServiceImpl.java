package com.ss.android.lark.ug.scheduler.coordinator.service;

import com.bytedance.lark.pb.ugreach.v1.ReachPointEntity;
import com.bytedance.lark.pb.ugreach.v1.ScenarioContext;
import com.ss.android.lark.ug.scheduler.common.api.Logger;
import com.ss.android.lark.ug.scheduler.common.api.OnSchedulerCallback;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import com.ss.android.lark.ug.scheduler.common.exception.CoordinatorException;
import com.ss.android.lark.ug.scheduler.common.exception.CoordinatorMetricErrorInfo;
import com.ss.android.lark.ug.scheduler.common.service.LoggerService;
import com.ss.android.lark.ug.scheduler.coordinator.entity.UGGraph;
import com.ss.android.lark.ug.scheduler.coordinator.entity.UGNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u001e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\rH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/service/CoordinatorServiceImpl;", "Lcom/ss/android/lark/ug/scheduler/coordinator/api/CoordinatorService;", "onSchedulerCallback", "Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;", "(Lcom/ss/android/lark/ug/scheduler/common/api/OnSchedulerCallback;)V", "graph", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGGraph;", "logger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "getLogger", "()Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "scenarioNodesMap", "", "", "", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGNode;", "clear", "", "emitResult", "onReachPointUpdate", "reachPointState", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointState;", "reachPointIds", "", "onScenarioEnter", "scenarioContext", "Lcom/bytedance/lark/pb/ugreach/v1/ScenarioContext;", "onScenarioLeave", "scenarioId", "onScenarioUpdate", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.a.b */
public final class CoordinatorServiceImpl {

    /* renamed from: a */
    public static final Companion f141787a = new Companion(null);

    /* renamed from: b */
    private final UGGraph f141788b = new UGGraph();

    /* renamed from: c */
    private final Map<String, List<UGNode>> f141789c = new ConcurrentHashMap();

    /* renamed from: d */
    private final OnSchedulerCallback f141790d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/service/CoordinatorServiceImpl$Companion;", "", "()V", "TAG", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final Logger m223435b() {
        return LoggerService.f141774b.mo195278a();
    }

    /* renamed from: a */
    public void mo195292a() {
        this.f141788b.mo195330c();
    }

    /* renamed from: c */
    private final void m223436c() {
        boolean z;
        Map<UGNode, ReachPointState> a = this.f141788b.mo195322a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<UGNode, ReachPointState>> it = a.entrySet().iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<UGNode, ReachPointState> next = it.next();
            if (next.getValue() != ReachPointState.SHOW) {
                z2 = false;
            }
            if (z2) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (UGNode eVar : linkedHashMap.keySet()) {
            ReachPointEntity f = eVar.mo195343f();
            if (f != null) {
                arrayList.add(f);
            }
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<UGNode, ReachPointState> entry : a.entrySet()) {
            if (entry.getValue() == ReachPointState.HIDE) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (UGNode eVar2 : linkedHashMap2.keySet()) {
            ReachPointEntity f2 = eVar2.mo195343f();
            if (f2 != null) {
                arrayList3.add(f2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = arrayList2;
        if (!arrayList5.isEmpty()) {
            this.f141790d.mo195145a(arrayList5);
        }
        ArrayList arrayList6 = arrayList4;
        if (!arrayList6.isEmpty()) {
            this.f141790d.mo195146b(arrayList6);
        }
    }

    public CoordinatorServiceImpl(OnSchedulerCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onSchedulerCallback");
        this.f141790d = bVar;
    }

    /* renamed from: a */
    public synchronized void mo195293a(ScenarioContext scenarioContext) {
        Intrinsics.checkParameterIsNotNull(scenarioContext, "scenarioContext");
        Logger b = m223435b();
        b.mo195261a("UGScheduler-Coordinator", "onScenarioEnter: scenarioContext=" + scenarioContext);
        List<ReachPointEntity> list = scenarioContext.entities;
        Intrinsics.checkExpressionValueIsNotNull(list, "scenarioContext.entities");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            UGNode.Companion aVar = UGNode.f141807c;
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            List<String> list2 = scenarioContext.share_scenario_ids;
            Intrinsics.checkExpressionValueIsNotNull(list2, "scenarioContext.share_scenario_ids");
            Integer num = scenarioContext.priority;
            Intrinsics.checkExpressionValueIsNotNull(num, "scenarioContext.priority");
            UGNode a = aVar.mo195358a(t, list2, num.intValue());
            if (a != null) {
                arrayList.add(a);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.f141788b.mo195325a(arrayList2);
        Map<String, List<UGNode>> map = this.f141789c;
        String str = scenarioContext.scenario_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "scenarioContext.scenario_id");
        map.put(str, arrayList2);
        m223436c();
    }

    /* renamed from: a */
    public synchronized void mo195294a(ReachPointState reachPointState, Collection<String> collection) {
        Intrinsics.checkParameterIsNotNull(reachPointState, "reachPointState");
        Intrinsics.checkParameterIsNotNull(collection, "reachPointIds");
        Logger b = m223435b();
        b.mo195261a("UGScheduler-Coordinator", "onReachPointUpdate: reachPointState=" + reachPointState + ", reachPointIds=" + collection);
        if (!collection.isEmpty()) {
            int i = C57539c.f141791a[reachPointState.ordinal()];
            if (i == 1) {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    this.f141788b.mo195329b((String) it.next());
                }
            } else if (i == 2) {
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    this.f141788b.mo195331c((String) it2.next());
                }
            } else if (i == 3) {
                Iterator<T> it3 = collection.iterator();
                while (it3.hasNext()) {
                    this.f141788b.mo195332d((String) it3.next());
                }
                m223436c();
            } else if (i == 4 || i == 5) {
                Iterator<T> it4 = collection.iterator();
                while (it4.hasNext()) {
                    this.f141788b.mo195324a((String) it4.next());
                }
                m223436c();
            } else {
                Logger b2 = m223435b();
                b2.mo195263c("UGScheduler-Coordinator", "onReachPointUpdate -> unsupported action: " + reachPointState);
                throw new CoordinatorException(CoordinatorMetricErrorInfo.UNKNOWN, null, 2, null);
            }
        }
    }
}
