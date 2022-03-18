package com.ss.android.lark.ug.scheduler.coordinator.entity;

import com.ss.android.lark.ug.scheduler.common.api.Logger;
import com.ss.android.lark.ug.scheduler.common.service.LoggerService;
import com.ss.android.lark.ug.scheduler.coordinator.entity.DAGraph.DAGNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 A*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002ABB\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0006\u0010 \u001a\u00020\u000fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J&\u0010#\u001a\"\u0012\f\u0012\n %*\u0004\u0018\u00018\u00008\u00000$j\u0010\u0012\f\u0012\n %*\u0004\u0018\u00018\u00008\u0000`&J\b\u0010'\u001a\u00020(H\u0002J\u0015\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0002\u0010*J&\u0010+\u001a\"\u0012\f\u0012\n %*\u0004\u0018\u00010\u00070\u00070$j\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00070\u0007`&J\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0016\u0010.\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ\u0006\u0010/\u001a\u00020\u0019J\u000e\u00100\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u00101\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0007J\u0013\u00102\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u0006\u00103\u001a\u00020\u000fJ\b\u00104\u001a\u00020\u000fH\u0002J\u0016\u00105\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J\u001d\u00106\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0015J\u0015\u00107\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u0007¢\u0006\u0002\u0010*J \u00108\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\b\b\u0002\u00109\u001a\u00020\u0019J\u0010\u0010:\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dJ)\u0010<\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0>H\u0002¢\u0006\u0002\u0010?J\u001c\u0010@\u001a\u00020\u000f2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0>H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006C"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph;", "N", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "", "()V", "nodeMap", "", "", "rootNodeIds", "", "size", "", "getSize", "()I", "addArc", "", "parentId", "childId", "addChild", "parent", "child", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;)V", "addNode", "node", "update", "", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;Z)V", "addNodes", "nodes", "", "addRootNode", "nodeId", "clearGraph", "decreaseNodeInDegree", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;)V", "getAllNodes", "Ljava/util/ArrayList;", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "getLogger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "getNode", "(Ljava/lang/String;)Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "getRootNodeIds", "getRootNodes", "increaseNodeInDegree", "initGraph", "isCyclic", "isNodeExists", "isRootNode", "isolateNode", "printGraph", "refreshInDegree", "removeArc", "removeChild", "removeNode", "removeNodes", "removeChildren", "removeRootNode", "topologicalSort", "traverseChildren", "callback", "Lkotlin/Function1;", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;Lkotlin/jvm/functions/Function1;)V", "traverseGraph", "Companion", "DAGNode", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.a */
public class DAGraph<N extends DAGNode> {

    /* renamed from: b */
    public static final Companion f141792b = new Companion(null);

    /* renamed from: a */
    public Map<String, N> f141793a = new LinkedHashMap();

    /* renamed from: c */
    private Set<String> f141794c = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$Companion;", "", "()V", "TAG", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0019\u001a\u00020\fH\u0016J\u0006\u0010\u001a\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u0003H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "", "nodeId", "", "(Ljava/lang/String;)V", "childrenIds", "", "getChildrenIds", "()Ljava/util/Set;", "setChildrenIds", "(Ljava/util/Set;)V", "inDegree", "", "getInDegree", "()I", "setInDegree", "(I)V", "getNodeId", "()Ljava/lang/String;", "parentIds", "getParentIds", "setParentIds", "equals", "", "other", "hashCode", "toFullString", "toString", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.a$b */
    public static class DAGNode {

        /* renamed from: a */
        private Set<String> f141795a = new LinkedHashSet();

        /* renamed from: b */
        private Set<String> f141796b = new LinkedHashSet();

        /* renamed from: c */
        private int f141797c;

        /* renamed from: d */
        private final String f141798d;

        /* renamed from: a */
        public final Set<String> mo195311a() {
            return this.f141795a;
        }

        /* renamed from: b */
        public final Set<String> mo195313b() {
            return this.f141796b;
        }

        /* renamed from: c */
        public final int mo195314c() {
            return this.f141797c;
        }

        /* renamed from: e */
        public final String mo195316e() {
            return this.f141798d;
        }

        public int hashCode() {
            return this.f141798d.hashCode();
        }

        /* renamed from: d */
        public final String mo195315d() {
            return "DAGNode('" + this.f141798d + "', parentIds=" + this.f141795a + ", childrenIds=" + this.f141796b + ", inDegree=" + this.f141797c + ')';
        }

        public String toString() {
            return "DAGNode('" + this.f141798d + "', inDegree=" + this.f141797c + ')';
        }

        /* renamed from: a */
        public final void mo195312a(int i) {
            this.f141797c = i;
        }

        public DAGNode(String str) {
            Intrinsics.checkParameterIsNotNull(str, "nodeId");
            this.f141798d = str;
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.ug.scheduler.coordinator.entity.DAGraph.DAGNode");
            } else if (!Intrinsics.areEqual(this.f141798d, ((DAGNode) obj).f141798d)) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: a */
    public final void mo195300a(List<? extends N> list) {
        Intrinsics.checkParameterIsNotNull(list, "nodes");
        m223450f().mo195261a("Scheduler-DAGGraph", "initGraph.");
        mo195303b();
        for (T t : list) {
            this.f141793a.put(t.mo195316e(), t);
        }
        m223449e();
    }

    /* renamed from: a */
    public final void mo195298a(String str) {
        N n = this.f141793a.get(str);
        if (n != null) {
            m223446b(n);
            return;
        }
        Logger f = m223450f();
        f.mo195263c("Scheduler-DAGGraph", "increaseNodeInDegree: node:" + str + " not exists.");
    }

    /* renamed from: a */
    public final boolean mo195301a() {
        if (this.f141794c.isEmpty() && !this.f141793a.isEmpty()) {
            return true;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        m223445a(new C57540c(intRef));
        if (intRef.element != this.f141793a.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo195299a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "parentId");
        Intrinsics.checkParameterIsNotNull(str2, "childId");
        Logger f = m223450f();
        f.mo195262b("Scheduler-DAGGraph", "addArc: parent=" + str + ", child=" + str2);
        N n = this.f141793a.get(str);
        N n2 = this.f141793a.get(str2);
        if (n == null || n2 == null) {
            Logger f2 = m223450f();
            f2.mo195263c("Scheduler-DAGGraph", "addArc: failed parent=" + n + ", child=" + n2);
            return;
        }
        m223441a(n, n2);
    }

    /* renamed from: f */
    private final Logger m223450f() {
        return LoggerService.f141774b.mo195278a();
    }

    /* renamed from: b */
    public final void mo195303b() {
        this.f141793a.clear();
        this.f141794c.clear();
    }

    /* renamed from: c */
    public final List<N> mo195307c() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f141794c.iterator();
        while (it.hasNext()) {
            N n = this.f141793a.get(it.next());
            if (n != null) {
                arrayList.add(n);
            }
        }
        return new ArrayList(arrayList);
    }

    /* renamed from: d */
    public final void mo195308d() {
        Iterator<T> it = this.f141793a.values().iterator();
        while (it.hasNext()) {
            Logger f = m223450f();
            f.mo195261a("Scheduler-DAGGraph", "printGraph -> " + it.next().mo195315d());
        }
    }

    /* renamed from: e */
    private final void m223449e() {
        boolean z;
        this.f141794c.clear();
        for (N n : this.f141793a.values()) {
            n.mo195312a(0);
        }
        for (N n2 : this.f141793a.values()) {
            m223442a(n2, new C57541d(this));
        }
        ArrayList<DAGNode> arrayList = new ArrayList();
        for (T t : this.f141793a.values()) {
            if (t.mo195314c() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        for (DAGNode bVar : arrayList) {
            m223452g(bVar.mo195316e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "N", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "it", "invoke", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.a$c */
    public static final class C57540c extends Lambda implements Function1<N, Unit> {
        final /* synthetic */ Ref.IntRef $visited;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57540c(Ref.IntRef intRef) {
            super(1);
            this.$visited = intRef;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.ug.scheduler.coordinator.entity.a$c */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((DAGNode) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(N n) {
            Intrinsics.checkParameterIsNotNull(n, "it");
            this.$visited.element++;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "N", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "childId", "", "invoke", "com/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$refreshInDegree$2$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.a$d */
    public static final class C57541d extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ DAGraph this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57541d(DAGraph aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "childId");
            this.this$0.mo195298a(str);
        }
    }

    /* renamed from: g */
    private final void m223452g(String str) {
        this.f141794c.add(str);
    }

    /* renamed from: h */
    private final void m223453h(String str) {
        this.f141794c.remove(str);
    }

    /* renamed from: c */
    public final N mo195306c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nodeId");
        return this.f141793a.get(str);
    }

    /* renamed from: d */
    public final boolean mo195309d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nodeId");
        return this.f141794c.contains(str);
    }

    /* renamed from: e */
    public final boolean mo195310e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nodeId");
        return this.f141793a.containsKey(str);
    }

    /* renamed from: b */
    private final void m223446b(N n) {
        if (n.mo195314c() == 0) {
            m223453h(n.mo195316e());
        }
        n.mo195312a(n.mo195314c() + 1);
    }

    /* renamed from: c */
    private final void m223448c(N n) {
        n.mo195312a(n.mo195314c() - 1);
        if (n.mo195314c() == 0) {
            m223452g(n.mo195316e());
        }
    }

    /* renamed from: f */
    private final void m223451f(String str) {
        N n = this.f141793a.get(str);
        if (n != null) {
            m223448c(n);
            return;
        }
        Logger f = m223450f();
        f.mo195263c("Scheduler-DAGGraph", "decreaseNodeInDegree: node:" + str + " not exists.");
    }

    /* renamed from: b */
    public final N mo195302b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "nodeId");
        Logger f = m223450f();
        f.mo195262b("Scheduler-DAGGraph", "removeNode: nodeId=" + str);
        N remove = this.f141793a.remove(str);
        if (remove == null) {
            Logger f2 = m223450f();
            f2.mo195263c("Scheduler-DAGGraph", "removeNode: node:" + str + " not exists.");
            return null;
        }
        this.f141794c.remove(str);
        ArrayList<DAGNode> arrayList = new ArrayList();
        Iterator<T> it = remove.mo195311a().iterator();
        while (it.hasNext()) {
            N n = this.f141793a.get(it.next());
            if (n != null) {
                arrayList.add(n);
            }
        }
        for (DAGNode bVar : arrayList) {
            bVar.mo195313b().remove(str);
        }
        remove.mo195311a().clear();
        Iterator<T> it2 = remove.mo195313b().iterator();
        while (it2.hasNext()) {
            m223451f(it2.next());
        }
        return remove;
    }

    /* renamed from: a */
    private final void m223445a(Function1<? super N, Unit> function1) {
        LinkedList linkedList = new LinkedList(this.f141794c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : this.f141793a.entrySet()) {
            linkedHashMap.put(t.getKey(), Integer.valueOf(((DAGNode) t.getValue()).mo195314c()));
        }
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.poll();
            if (str != null) {
                N n = this.f141793a.get(str);
                if (n != null) {
                    function1.invoke(n);
                    for (T t2 : n.mo195313b()) {
                        Integer num = (Integer) linkedHashMap.get(t2);
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            if (intValue == 0) {
                                linkedList.offer(t2);
                            }
                            linkedHashMap.put(t2, Integer.valueOf(intValue));
                        } else {
                            m223450f().mo195263c("Scheduler-DAGGraph", "traverseGraph: error: node:" + ((String) t2) + " not exists.");
                            return;
                        }
                    }
                    continue;
                } else {
                    m223450f().mo195263c("Scheduler-DAGGraph", "traverseGraph: error: node:" + str + " not exists.");
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo195296a(N n) {
        Intrinsics.checkParameterIsNotNull(n, "node");
        for (String str : new ArrayList(n.mo195313b())) {
            String e = n.mo195316e();
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            mo195304b(e, str);
        }
    }

    /* renamed from: b */
    public final void mo195305b(List<? extends N> list) {
        Intrinsics.checkParameterIsNotNull(list, "nodes");
        m223450f().mo195261a("Scheduler-DAGGraph", "addNodes.");
        for (T t : list) {
            if (mo195310e(t.mo195316e())) {
                Logger f = m223450f();
                f.mo195262b("Scheduler-DAGGraph", "addNodes -> node:" + t.mo195316e() + " already exists.");
            } else {
                this.f141793a.put(t.mo195316e(), t);
            }
        }
        m223449e();
    }

    /* renamed from: a */
    private final void m223442a(N n, Function1<? super String, Unit> function1) {
        Iterator<T> it = n.mo195313b().iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    /* renamed from: a */
    private final void m223441a(N n, N n2) {
        if (n.mo195313b().contains(n2.mo195316e())) {
            Logger f = m223450f();
            f.mo195262b("Scheduler-DAGGraph", "addChild: " + n.mo195316e() + " already has child " + n2.mo195316e());
            return;
        }
        n.mo195313b().add(n2.mo195316e());
        n2.mo195311a().add(n.mo195316e());
        mo195298a(n2.mo195316e());
    }

    /* renamed from: b */
    private final void m223447b(N n, N n2) {
        if (!n.mo195313b().contains(n2.mo195316e())) {
            Logger f = m223450f();
            f.mo195262b("Scheduler-DAGGraph", "removeChild: " + n.mo195316e() + " doesn't have child " + n2.mo195316e());
            return;
        }
        n2.mo195311a().remove(n.mo195316e());
        n.mo195313b().remove(n2.mo195316e());
        m223448c(n2);
    }

    /* renamed from: b */
    public final void mo195304b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "parentId");
        Intrinsics.checkParameterIsNotNull(str2, "childId");
        Logger f = m223450f();
        f.mo195262b("Scheduler-DAGGraph", "removeArc: parentId=" + str + ", childId=" + str2);
        N n = this.f141793a.get(str);
        N n2 = this.f141793a.get(str2);
        if (n == null || n2 == null) {
            Logger f2 = m223450f();
            f2.mo195263c("Scheduler-DAGGraph", "removeArc: failed parent=" + n + ", child=" + n2);
            return;
        }
        m223447b(n, n2);
    }

    /* renamed from: a */
    public final void mo195297a(N n, boolean z) {
        Intrinsics.checkParameterIsNotNull(n, "node");
        Logger f = m223450f();
        f.mo195262b("Scheduler-DAGGraph", "addNode: node=" + n);
        if (mo195310e(n.mo195316e())) {
            Logger f2 = m223450f();
            f2.mo195262b("Scheduler-DAGGraph", "addNode: node:" + n.mo195316e() + " already exists.");
            return;
        }
        this.f141793a.put(n.mo195316e(), n);
        if (z) {
            m223449e();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.ug.scheduler.coordinator.entity.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m223444a(DAGraph aVar, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                list = new ArrayList();
            }
            aVar.mo195300a(list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initGraph");
    }

    /* renamed from: a */
    public static /* synthetic */ void m223443a(DAGraph aVar, DAGNode bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.mo195297a(bVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNode");
    }
}
