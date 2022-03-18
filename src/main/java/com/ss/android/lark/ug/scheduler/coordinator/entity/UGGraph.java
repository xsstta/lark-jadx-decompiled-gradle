package com.ss.android.lark.ug.scheduler.coordinator.entity;

import com.ss.android.lark.ug.scheduler.common.api.Logger;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import com.ss.android.lark.ug.scheduler.common.exception.CoordinatorException;
import com.ss.android.lark.ug.scheduler.common.exception.CoordinatorMetricErrorInfo;
import com.ss.android.lark.ug.scheduler.common.service.LoggerService;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006J\u0014\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fJ\b\u0010 \u001a\u00020\u0018H\u0002J\u0006\u0010!\u001a\u00020\u0018J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0005J\b\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100)J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fJ*\u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\b\b\u0002\u0010.\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\bJ\u0018\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0002J\u0006\u00101\u001a\u00020\u0018J\u0010\u00102\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0006\u00103\u001a\u00020\u0018J\u0018\u00104\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\u000e\u00105\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u00105\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0005J\u0014\u00106\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fJ\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fH\u0002J\u0014\u00108\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001fJ\u0010\u00109\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006;"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGGraph;", "", "()V", "allNodesMap", "", "", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGNode;", "emitShowingNodes", "", "getEmitShowingNodes", "()Z", "setEmitShowingNodes", "(Z)V", "graph", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph;", "lastSchedulerResult", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointState;", "showingNodes", "", "size", "", "getSize", "()I", "addDependency", "", "parent", "child", "addNode", "node", "addSubGraph", "nodes", "", "checkCyclic", "clear", "confirmOnHide", "reachPointId", "confirmOnShow", "consumeNode", "getLogger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "getResult", "", "getRootNodes", "isConflict", "nodeA", "nodeB", "isMutual", "isOptimize", "isSameScenario", "printGraph", "rebuildNodeTree", "rebuildRootIfConflict", "removeDependency", "removeNode", "removeSubGraph", "sortByPriority", "updateSubGraph", "updateTempPriority", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.c */
public final class UGGraph {

    /* renamed from: a */
    public static final Companion f141800a = new Companion(null);

    /* renamed from: b */
    private final DAGraph<UGNode> f141801b;

    /* renamed from: c */
    private final Set<UGNode> f141802c = new LinkedHashSet();

    /* renamed from: d */
    private final Map<String, UGNode> f141803d = new LinkedHashMap();

    /* renamed from: e */
    private Map<String, ReachPointState> f141804e = new LinkedHashMap();

    /* renamed from: f */
    private boolean f141805f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGGraph$Companion;", "", "()V", "TAG", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final Logger m223481e() {
        return LoggerService.f141774b.mo195278a();
    }

    /* renamed from: c */
    public final synchronized void mo195330c() {
        this.f141801b.mo195303b();
        this.f141802c.clear();
        this.f141804e.clear();
        this.f141803d.clear();
    }

    public UGGraph() {
        DAGraph<UGNode> aVar = new DAGraph<>();
        this.f141801b = aVar;
        DAGraph.m223444a(aVar, null, 1, null);
    }

    /* renamed from: d */
    private final void m223479d() {
        if (this.f141801b.mo195301a()) {
            m223481e().mo195263c("Scheduler-UGGraph", "checkCyclic -> error: the graph has a circle.");
            this.f141801b.mo195303b();
            throw new CoordinatorException(CoordinatorMetricErrorInfo.CYCLIC_GRAPH, null, 2, null);
        }
    }

    /* renamed from: b */
    public final synchronized void mo195327b() {
        ArrayList arrayList = new ArrayList();
        for (T t : m223477b(this.f141801b.mo195307c())) {
            if (t.mo195346i()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        for (int i = 1; i < size; i++) {
            UGNode eVar = (UGNode) arrayList2.get(i - 1);
            int size2 = arrayList2.size();
            for (int i2 = i; i2 < size2; i2++) {
                UGNode eVar2 = (UGNode) arrayList2.get(i2);
                if (m223476a(this, eVar, eVar2, false, false, 8, null)) {
                    m223475a(eVar, eVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized Map<UGNode, ReachPointState> mo195322a() {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        mo195327b();
        List<UGNode> c = this.f141801b.mo195307c();
        ArrayList arrayList = new ArrayList();
        for (UGNode eVar : c) {
            if (!this.f141802c.contains(eVar)) {
                linkedHashMap.put(eVar, ReachPointState.SHOW);
                for (UGNode eVar2 : this.f141802c) {
                    if (mo195326a(eVar, eVar2, false, true)) {
                        linkedHashMap.remove(eVar);
                        if (eVar.mo195354q() <= eVar2.mo195354q()) {
                            m223475a(eVar2, eVar);
                        } else if (eVar.mo195347j()) {
                            linkedHashMap.put(eVar, ReachPointState.SHOW);
                            linkedHashMap.put(eVar2, ReachPointState.HIDE);
                            this.f141801b.mo195302b(eVar2.mo195316e());
                            arrayList.add(eVar2);
                            if (C57544d.f141806a[eVar2.mo195348k().ordinal()] == 2) {
                                DAGraph.m223443a(this.f141801b, eVar2, false, 2, null);
                                m223475a(eVar, eVar2);
                            }
                        }
                    } else {
                        linkedHashMap.put(eVar, ReachPointState.SHOW);
                    }
                }
            } else if (this.f141805f) {
                linkedHashMap.put(eVar, ReachPointState.SHOW);
            }
        }
        this.f141802c.removeAll(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Object obj : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((UGNode) ((Map.Entry) obj).getKey()).mo195357t(), ((Map.Entry) obj).getValue());
        }
        this.f141804e = MapsKt.toMutableMap(linkedHashMap2);
        this.f141801b.mo195308d();
        return linkedHashMap;
    }

    /* renamed from: b */
    private final List<UGNode> m223477b(List<UGNode> list) {
        return CollectionsKt.sortedWith(list, new C57543b());
    }

    /* renamed from: b */
    public final synchronized void mo195328b(UGNode eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "node");
        mo195324a(eVar.mo195357t());
    }

    /* renamed from: c */
    private final void m223478c(UGNode eVar) {
        eVar.mo195352o();
        ArrayList<UGNode> arrayList = new ArrayList();
        Iterator<T> it = eVar.mo195313b().iterator();
        while (it.hasNext()) {
            UGNode c = this.f141801b.mo195306c((String) it.next());
            if (c != null) {
                arrayList.add(c);
            }
        }
        for (UGNode eVar2 : arrayList) {
            eVar2.mo195353p();
        }
    }

    /* renamed from: d */
    private final void m223480d(UGNode eVar) {
        UGNode eVar2;
        eVar.mo195355r();
        ArrayList<String> arrayList = new ArrayList();
        for (T t : eVar.mo195313b()) {
            if (!this.f141801b.mo195310e(t)) {
                arrayList.add(t);
            }
        }
        ArrayList<UGNode> arrayList2 = new ArrayList();
        for (String str : arrayList) {
            UGNode eVar3 = this.f141803d.get(str);
            if (eVar3 != null) {
                eVar2 = eVar3.mo195356s();
            } else {
                eVar2 = null;
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        for (UGNode eVar4 : arrayList2) {
            mo195323a(eVar4);
            m223480d(eVar4);
        }
    }

    /* renamed from: a */
    public final synchronized void mo195323a(UGNode eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "node");
        if (this.f141801b.mo195310e(eVar.mo195357t())) {
            Logger e = m223481e();
            e.mo195262b("Scheduler-UGGraph", "addNode -> node:" + eVar.mo195357t() + " exists.");
            return;
        }
        DAGraph.m223443a(this.f141801b, eVar, false, 2, null);
        m223479d();
    }

    /* renamed from: b */
    public final synchronized void mo195329b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        if (this.f141804e.get(str) == ReachPointState.SHOW) {
            UGNode c = this.f141801b.mo195306c(str);
            if (c != null) {
                this.f141802c.add(c.mo195356s());
            } else {
                Logger e = m223481e();
                e.mo195263c("Scheduler-UGGraph", "confirmOnShow -> node:" + str + " is not exists.");
                throw new CoordinatorException(CoordinatorMetricErrorInfo.MISS_NODE, null, 2, null);
            }
        } else {
            Logger e2 = m223481e();
            e2.mo195263c("Scheduler-UGGraph", "confirmOnShow -> last scheduler:" + str + " != SHOW.");
            throw new CoordinatorException(CoordinatorMetricErrorInfo.MISS_NODE, null, 2, null);
        }
    }

    /* renamed from: c */
    public final synchronized void mo195331c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        if (this.f141804e.containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f141802c) {
                if (Intrinsics.areEqual(t.mo195357t(), str)) {
                    arrayList.add(t);
                }
            }
            this.f141802c.removeAll(arrayList);
            this.f141804e.remove(str);
        } else {
            Logger e = m223481e();
            e.mo195263c("Scheduler-UGGraph", "confirmOnShow -> last scheduler:" + str + " is not exists.");
            throw new CoordinatorException(CoordinatorMetricErrorInfo.MISS_NODE, null, 2, null);
        }
    }

    /* renamed from: d */
    public final synchronized void mo195332d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        UGNode c = this.f141801b.mo195306c(str);
        if (c != null) {
            if (!this.f141801b.mo195309d(str)) {
                Logger e = m223481e();
                e.mo195263c("Scheduler-UGGraph", "consumeNode -> node:" + str + " is not root.");
            }
            if (c.mo195350m()) {
                m223480d(c);
                c.mo195342d(false);
            }
            m223478c(c);
            if (c.mo195345h() == 0) {
                c.mo195340c(true);
                mo195328b(c);
            } else if (c.mo195345h() > 0) {
                c.mo195337b(c.mo195345h() - 1);
                this.f141801b.mo195296a(c);
                c.mo195342d(true);
            } else {
                this.f141801b.mo195296a(c);
                c.mo195342d(true);
            }
        } else {
            Logger e2 = m223481e();
            e2.mo195263c("Scheduler-UGGraph", "consumeNode -> node:" + str + " is not exists.");
            throw new CoordinatorException(CoordinatorMetricErrorInfo.MISS_NODE, null, 2, null);
        }
    }

    /* renamed from: a */
    public final synchronized void mo195324a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        this.f141801b.mo195302b(str);
        ArrayList arrayList = new ArrayList();
        for (T t : this.f141802c) {
            if (Intrinsics.areEqual(t.mo195357t(), str)) {
                arrayList.add(t);
            }
        }
        this.f141802c.removeAll(arrayList);
        this.f141804e.remove(str);
    }

    /* renamed from: a */
    public final synchronized void mo195325a(List<UGNode> list) {
        Intrinsics.checkParameterIsNotNull(list, "nodes");
        ArrayList<UGNode> arrayList = new ArrayList();
        for (T t : list) {
            if (!this.f141803d.containsKey(t.mo195357t())) {
                arrayList.add(t);
            }
        }
        for (UGNode eVar : arrayList) {
            this.f141803d.put(eVar.mo195357t(), eVar.mo195356s());
        }
        this.f141801b.mo195305b(list);
        m223479d();
    }

    /* renamed from: a */
    private final void m223475a(UGNode eVar, UGNode eVar2) {
        this.f141801b.mo195299a(eVar.mo195316e(), eVar2.mo195316e());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", AbstractC60044a.f149675a, "kotlin.jvm.PlatformType", C63954b.f161494a, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.c$b */
    public static final class C57543b<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(t2.mo195354q()), Integer.valueOf(t.mo195354q()));
        }
    }

    /* renamed from: a */
    public final boolean mo195326a(UGNode eVar, UGNode eVar2, boolean z, boolean z2) {
        boolean z3;
        Intrinsics.checkParameterIsNotNull(eVar, "nodeA");
        Intrinsics.checkParameterIsNotNull(eVar2, "nodeB");
        if (z2) {
            if (!eVar.mo195346i() || !eVar2.mo195346i()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return false;
            }
        }
        if (!z) {
            if (!eVar.mo195346i() || eVar.mo195349l().contains(eVar2.mo195344g())) {
                return false;
            }
            return true;
        } else if (!eVar.mo195346i() || !eVar2.mo195346i()) {
            if (eVar.mo195346i()) {
                return !eVar.mo195349l().contains(eVar2.mo195344g());
            }
            if (eVar2.mo195346i()) {
                return !eVar2.mo195349l().contains(eVar.mo195344g());
            }
            return false;
        } else if (!eVar.mo195349l().contains(eVar2.mo195344g()) || !eVar2.mo195349l().contains(eVar.mo195344g())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m223476a(UGGraph cVar, UGNode eVar, UGNode eVar2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return cVar.mo195326a(eVar, eVar2, z, z2);
    }
}
