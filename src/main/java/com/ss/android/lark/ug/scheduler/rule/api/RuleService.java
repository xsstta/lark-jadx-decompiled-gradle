package com.ss.android.lark.ug.scheduler.rule.api;

import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.rule.entity.LocalRule;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/api/RuleService;", "", "addLocalRule", "", "scenarioId", "", "localRule", "Lcom/ss/android/lark/ug/scheduler/rule/entity/LocalRule;", "clear", "handleEvent", "", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "registerMetaRuleParser", "event", "metaRule", "Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;", "removeLocalRule", "unregisterMetaRuleParser", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.a.a */
public interface RuleService {
    /* renamed from: a */
    void mo195359a();

    /* renamed from: a */
    boolean mo195360a(ReachPointAction aVar, LocalRule aVar2);
}
