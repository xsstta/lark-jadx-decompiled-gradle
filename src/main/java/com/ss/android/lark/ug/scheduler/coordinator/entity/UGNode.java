package com.ss.android.lark.ug.scheduler.coordinator.entity;

import com.bytedance.lark.pb.ugreach.v1.ReachPointConfig;
import com.bytedance.lark.pb.ugreach.v1.ReachPointEntity;
import com.bytedance.lark.pb.ugreach.v1.ReachPointRelation;
import com.ss.android.lark.ug.scheduler.coordinator.entity.DAGraph;
import com.ss.android.lark.ug.scheduler.coordinator.entity.DefenseStrategy;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010:\u001a\u00020\u0000J\u0006\u0010;\u001a\u00020\u001fJ\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020=J\u0006\u0010?\u001a\u00020=R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u001a\u0010(\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u0004R\u001a\u0010+\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001a\u00107\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010!\"\u0004\b9\u0010#¨\u0006A"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGNode;", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DAGraph$DAGNode;", "reachPointId", "", "(Ljava/lang/String;)V", "_reachPoint", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "defenseStrategy", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy;", "getDefenseStrategy", "()Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy;", "setDefenseStrategy", "(Lcom/ss/android/lark/ug/scheduler/coordinator/entity/DefenseStrategy;)V", "isConflict", "", "()Z", "setConflict", "(Z)V", "isConsumed", "setConsumed", "needGrab", "getNeedGrab", "setNeedGrab", "needRebuild", "getNeedRebuild", "setNeedRebuild", "<set-?>", "parentReachPointId", "getParentReachPointId", "()Ljava/lang/String;", "priority", "", "getPriority", "()I", "setPriority", "(I)V", "reachPointEntity", "getReachPointEntity", "()Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "getReachPointId", "scenarioId", "getScenarioId", "setScenarioId", "scenarioPriority", "getScenarioPriority", "setScenarioPriority", "shareScenarioIds", "", "getShareScenarioIds", "()Ljava/util/Set;", "setShareScenarioIds", "(Ljava/util/Set;)V", "tempPriority", "getTempPriority", "setTempPriority", "ttl", "getTtl", "setTtl", "copy", "getTotalPriority", "raiseTempPriority", "", "rebuildRelation", "resetTempPriority", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.e */
public final class UGNode extends DAGraph.DAGNode {

    /* renamed from: c */
    public static final Companion f141807c = new Companion(null);

    /* renamed from: a */
    public ReachPointEntity f141808a;

    /* renamed from: b */
    public String f141809b;

    /* renamed from: d */
    private String f141810d = "";

    /* renamed from: e */
    private int f141811e;

    /* renamed from: f */
    private boolean f141812f;

    /* renamed from: g */
    private int f141813g;

    /* renamed from: h */
    private int f141814h;

    /* renamed from: i */
    private boolean f141815i;

    /* renamed from: j */
    private DefenseStrategy f141816j = DefenseStrategy.GIVE_UP;

    /* renamed from: k */
    private Set<String> f141817k = new LinkedHashSet();

    /* renamed from: l */
    private boolean f141818l;

    /* renamed from: m */
    private int f141819m;

    /* renamed from: n */
    private boolean f141820n;

    /* renamed from: o */
    private final String f141821o;

    /* renamed from: o */
    public final void mo195352o() {
        this.f141819m = 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGNode$Companion;", "", "()V", "MAX_PRIORITY", "", "MIN_PRIORITY", "NORMAL_PRIORITY", "parse", "Lcom/ss/android/lark/ug/scheduler/coordinator/entity/UGNode;", "reachPointEntity", "Lcom/bytedance/lark/pb/ugreach/v1/ReachPointEntity;", "shareScenarioIds", "", "", "scenarioPriority", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.coordinator.entity.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final UGNode mo195358a(ReachPointEntity reachPointEntity, List<String> list, int i) {
            int i2;
            boolean z;
            int i3;
            boolean z2;
            ReachPointRelation.DefenseStrategy defenseStrategy;
            ReachPointRelation reachPointRelation;
            List<String> list2;
            ReachPointRelation reachPointRelation2;
            ReachPointRelation reachPointRelation3;
            ReachPointRelation reachPointRelation4;
            Boolean bool;
            ReachPointRelation reachPointRelation5;
            Integer num;
            ReachPointRelation reachPointRelation6;
            Boolean bool2;
            ReachPointRelation reachPointRelation7;
            Integer num2;
            Intrinsics.checkParameterIsNotNull(reachPointEntity, "reachPointEntity");
            Intrinsics.checkParameterIsNotNull(list, "shareScenarioIds");
            String str = reachPointEntity.reach_point_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "reachPointEntity.reach_point_id");
            UGNode eVar = new UGNode(str);
            eVar.f141808a = reachPointEntity;
            String str2 = reachPointEntity.scenario_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "reachPointEntity.scenario_id");
            eVar.mo195335a(str2);
            eVar.mo195339c(i);
            eVar.mo195349l().addAll(list);
            ReachPointConfig reachPointConfig = reachPointEntity.config;
            boolean z3 = false;
            if (reachPointConfig == null || (reachPointRelation7 = reachPointConfig.relation) == null || (num2 = reachPointRelation7.ttl) == null) {
                i2 = 0;
            } else {
                i2 = num2.intValue();
            }
            eVar.mo195337b(i2);
            ReachPointConfig reachPointConfig2 = reachPointEntity.config;
            if (reachPointConfig2 == null || (reachPointRelation6 = reachPointConfig2.relation) == null || (bool2 = reachPointRelation6.is_conflict) == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            eVar.mo195336a(z);
            ReachPointConfig reachPointConfig3 = reachPointEntity.config;
            if (reachPointConfig3 == null || (reachPointRelation5 = reachPointConfig3.relation) == null || (num = reachPointRelation5.priority) == null) {
                i3 = 0;
            } else {
                i3 = num.intValue();
            }
            eVar.mo195341d(i3);
            ReachPointConfig reachPointConfig4 = reachPointEntity.config;
            if (reachPointConfig4 == null || (reachPointRelation4 = reachPointConfig4.relation) == null || (bool = reachPointRelation4.need_grab) == null) {
                z2 = false;
            } else {
                z2 = bool.booleanValue();
            }
            eVar.mo195338b(z2);
            DefenseStrategy.Companion aVar = DefenseStrategy.Companion;
            ReachPointConfig reachPointConfig5 = reachPointEntity.config;
            String str3 = null;
            if (reachPointConfig5 == null || (reachPointRelation3 = reachPointConfig5.relation) == null) {
                defenseStrategy = null;
            } else {
                defenseStrategy = reachPointRelation3.defense_strategy;
            }
            eVar.mo195334a(aVar.mo195295a(defenseStrategy));
            ReachPointConfig reachPointConfig6 = reachPointEntity.config;
            if (!(reachPointConfig6 == null || (reachPointRelation2 = reachPointConfig6.relation) == null)) {
                str3 = reachPointRelation2.parent_id;
            }
            eVar.f141809b = str3;
            String n = eVar.mo195351n();
            if (n == null || n.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                Set<String> a = eVar.mo195311a();
                String n2 = eVar.mo195351n();
                if (n2 == null) {
                    Intrinsics.throwNpe();
                }
                a.add(n2);
            }
            ReachPointConfig reachPointConfig7 = reachPointEntity.config;
            if (!(reachPointConfig7 == null || (reachPointRelation = reachPointConfig7.relation) == null || (list2 = reachPointRelation.child_ids) == null)) {
                eVar.mo195313b().addAll(list2);
            }
            return eVar;
        }
    }

    /* renamed from: f */
    public final ReachPointEntity mo195343f() {
        return this.f141808a;
    }

    /* renamed from: g */
    public final String mo195344g() {
        return this.f141810d;
    }

    /* renamed from: h */
    public final int mo195345h() {
        return this.f141811e;
    }

    /* renamed from: i */
    public final boolean mo195346i() {
        return this.f141812f;
    }

    /* renamed from: j */
    public final boolean mo195347j() {
        return this.f141815i;
    }

    /* renamed from: k */
    public final DefenseStrategy mo195348k() {
        return this.f141816j;
    }

    /* renamed from: l */
    public final Set<String> mo195349l() {
        return this.f141817k;
    }

    /* renamed from: m */
    public final boolean mo195350m() {
        return this.f141820n;
    }

    /* renamed from: n */
    public final String mo195351n() {
        return this.f141809b;
    }

    /* renamed from: t */
    public final String mo195357t() {
        return this.f141821o;
    }

    /* renamed from: p */
    public final void mo195353p() {
        this.f141819m = 1000000;
    }

    /* renamed from: q */
    public final int mo195354q() {
        return this.f141819m + (this.f141813g << 16) + this.f141814h;
    }

    /* renamed from: r */
    public final void mo195355r() {
        ReachPointConfig reachPointConfig;
        ReachPointRelation reachPointRelation;
        boolean z;
        ReachPointEntity reachPointEntity = this.f141808a;
        if (reachPointEntity != null && (reachPointConfig = reachPointEntity.config) != null && (reachPointRelation = reachPointConfig.relation) != null) {
            this.f141809b = reachPointRelation.parent_id;
            mo195311a().clear();
            String str = this.f141809b;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Set<String> a = mo195311a();
                String str2 = this.f141809b;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                a.add(str2);
            }
            mo195313b().clear();
            List<String> list = reachPointRelation.child_ids;
            if (list != null) {
                mo195313b().addAll(list);
            }
        }
    }

    /* renamed from: s */
    public final UGNode mo195356s() {
        UGNode eVar = new UGNode(this.f141821o);
        eVar.f141808a = this.f141808a;
        eVar.f141810d = this.f141810d;
        eVar.f141813g = this.f141813g;
        eVar.f141819m = this.f141819m;
        eVar.f141811e = this.f141811e;
        eVar.f141812f = this.f141812f;
        eVar.f141814h = this.f141814h;
        eVar.f141815i = this.f141815i;
        eVar.f141816j = this.f141816j;
        eVar.f141809b = this.f141809b;
        eVar.mo195311a().addAll(mo195311a());
        eVar.mo195313b().addAll(mo195313b());
        eVar.f141817k.addAll(this.f141817k);
        return eVar;
    }

    /* renamed from: a */
    public final void mo195336a(boolean z) {
        this.f141812f = z;
    }

    /* renamed from: b */
    public final void mo195337b(int i) {
        this.f141811e = i;
    }

    /* renamed from: c */
    public final void mo195339c(int i) {
        this.f141813g = i;
    }

    /* renamed from: d */
    public final void mo195341d(int i) {
        this.f141814h = i;
    }

    /* renamed from: a */
    public final void mo195334a(DefenseStrategy defenseStrategy) {
        Intrinsics.checkParameterIsNotNull(defenseStrategy, "<set-?>");
        this.f141816j = defenseStrategy;
    }

    /* renamed from: b */
    public final void mo195338b(boolean z) {
        this.f141815i = z;
    }

    /* renamed from: c */
    public final void mo195340c(boolean z) {
        this.f141818l = z;
    }

    /* renamed from: d */
    public final void mo195342d(boolean z) {
        this.f141820n = z;
    }

    /* renamed from: a */
    public final void mo195335a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f141810d = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UGNode(String str) {
        super(str);
        boolean z;
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        this.f141821o = str;
        Set<String> a = mo195311a();
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = null;
        } else {
            str2 = (String) CollectionsKt.first(mo195311a());
        }
        this.f141809b = str2;
    }
}
