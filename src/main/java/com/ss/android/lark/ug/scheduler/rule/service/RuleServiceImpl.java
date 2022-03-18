package com.ss.android.lark.ug.scheduler.rule.service;

import com.ss.android.lark.ug.scheduler.common.api.Logger;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.service.LoggerService;
import com.ss.android.lark.ug.scheduler.rule.api.RuleService;
import com.ss.android.lark.ug.scheduler.rule.entity.LocalRule;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/RuleServiceImpl;", "Lcom/ss/android/lark/ug/scheduler/rule/api/RuleService;", "()V", "localRuleMap", "", "", "Lcom/ss/android/lark/ug/scheduler/rule/entity/LocalRule;", "addLocalRule", "", "scenarioId", "localRule", "clear", "findLocalRule", "getLogger", "Lcom/ss/android/lark/ug/scheduler/common/api/Logger;", "handleEvent", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "registerMetaRuleParser", "event", "metaRule", "Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;", "removeLocalRule", "unregisterMetaRuleParser", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.d */
public final class RuleServiceImpl implements RuleService {

    /* renamed from: a */
    public static final Companion f141830a = new Companion(null);

    /* renamed from: b */
    private final Map<String, LocalRule> f141831b = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/RuleServiceImpl$Companion;", "", "()V", "TAG", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.rule.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final Logger m223536b() {
        return LoggerService.f141774b.mo195278a();
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.api.RuleService
    /* renamed from: a */
    public void mo195359a() {
        MetaRuleService.f141822a.mo195361a();
    }

    /* renamed from: a */
    private final LocalRule m223535a(String str) {
        return this.f141831b.get(str);
    }

    @Override // com.ss.android.lark.ug.scheduler.rule.api.RuleService
    /* renamed from: a */
    public boolean mo195360a(ReachPointAction aVar, LocalRule aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        if (aVar2 == null) {
            aVar2 = m223535a(aVar.mo195280a());
        }
        if (aVar2 != null) {
            if (aVar2.mo195404a() != null) {
                return RuleExpressionEngine.f141828a.mo195367a(aVar2.mo195404a(), aVar);
            }
            Logger b = m223536b();
            b.mo195263c("UGScheduler-RuleService", "handleEvent -> cannot find rule for " + aVar.mo195280a());
        }
        return false;
    }
}
