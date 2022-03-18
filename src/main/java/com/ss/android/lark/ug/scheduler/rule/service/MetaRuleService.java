package com.ss.android.lark.ug.scheduler.rule.service;

import com.ss.android.lark.ug.scheduler.common.api.Storage;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.exception.RuleException;
import com.ss.android.lark.ug.scheduler.common.exception.RuleMetricErrorInfo;
import com.ss.android.lark.ug.scheduler.common.storage.MemoryStorage;
import com.ss.android.lark.ug.scheduler.rule.entity.DefaultAction;
import com.ss.android.lark.ug.scheduler.rule.entity.MetaRule;
import com.ss.android.lark.ug.scheduler.rule.service.meta_rule.ContentStrategy;
import com.ss.android.lark.ug.scheduler.rule.service.meta_rule.CountStrategy;
import com.ss.android.lark.ug.scheduler.rule.service.meta_rule.DurationStrategy;
import com.ss.android.lark.ug.scheduler.rule.service.meta_rule.Strategy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0006J\u0016\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/MetaRuleService;", "", "()V", "customMetaRuleMap", "", "", "Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;", "defaultMetaRuleMap", "metaRuleStrategyMap", "", "Lcom/ss/android/lark/ug/scheduler/rule/service/meta_rule/Strategy;", "storage", "Lcom/ss/android/lark/ug/scheduler/common/api/Storage;", "clear", "", "getCurrentValue", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "registerMetaRuleParser", "scenarioId", "event", "metaRule", "unregisterMetaRuleParser", "updateActionValue", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.a */
public final class MetaRuleService {

    /* renamed from: a */
    public static final MetaRuleService f141822a = new MetaRuleService();

    /* renamed from: b */
    private static final Map<String, MetaRule> f141823b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final Map<String, Map<String, MetaRule>> f141824c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final Map<MetaRule, Strategy> f141825d;

    /* renamed from: e */
    private static final Storage f141826e = new MemoryStorage();

    private MetaRuleService() {
    }

    /* renamed from: a */
    public final void mo195361a() {
        f141826e.mo195271a();
        f141824c.clear();
    }

    static {
        DefaultAction[] values = DefaultAction.values();
        for (DefaultAction defaultAction : values) {
            f141823b.put(defaultAction.getEvent(), defaultAction.getMetaRule());
        }
        MetaRule metaRule = MetaRule.COUNT;
        Storage dVar = f141826e;
        f141825d = MapsKt.mapOf(TuplesKt.to(metaRule, new CountStrategy(dVar)), TuplesKt.to(MetaRule.DURATION, new DurationStrategy(dVar)), TuplesKt.to(MetaRule.CONTENT, new ContentStrategy(dVar)));
    }

    /* renamed from: b */
    public final String mo195363b(ReachPointAction aVar) {
        Strategy eVar;
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        MetaRule metaRule = f141823b.get(aVar.mo195281b());
        if (metaRule == null) {
            Map<String, MetaRule> map = f141824c.get(aVar.mo195280a());
            if (map != null) {
                metaRule = map.get(aVar.mo195281b());
            } else {
                metaRule = null;
            }
        }
        if (metaRule == null || (eVar = f141825d.get(metaRule)) == null) {
            return null;
        }
        return eVar.mo195365a(aVar);
    }

    /* renamed from: a */
    public final void mo195362a(ReachPointAction aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        MetaRule metaRule = f141823b.get(aVar.mo195281b());
        if (metaRule == null) {
            Map<String, MetaRule> map = f141824c.get(aVar.mo195280a());
            if (map != null) {
                metaRule = map.get(aVar.mo195281b());
            } else {
                metaRule = null;
            }
        }
        if (metaRule != null) {
            Strategy eVar = f141825d.get(metaRule);
            if (eVar != null) {
                eVar.mo195366b(aVar);
                return;
            }
            return;
        }
        throw new RuleException(RuleMetricErrorInfo.MISS_META_RULE, null, 2, null);
    }
}
