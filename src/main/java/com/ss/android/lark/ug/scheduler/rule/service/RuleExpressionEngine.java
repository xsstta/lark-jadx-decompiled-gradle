package com.ss.android.lark.ug.scheduler.rule.service;

import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import com.ss.android.lark.ug.scheduler.common.exception.RuleException;
import com.ss.android.lark.ug.scheduler.common.exception.RuleMetricErrorInfo;
import com.ss.android.lark.ug.scheduler.rule.entity.RuleExpression;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/RuleExpressionEngine;", "", "()V", "calculateBranch", "", "ruleExpression", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "calculateLeaf", "calculateRuleExpression", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.b */
public final class RuleExpressionEngine {

    /* renamed from: a */
    public static final RuleExpressionEngine f141828a = new RuleExpressionEngine();

    private RuleExpressionEngine() {
    }

    /* renamed from: a */
    public final boolean mo195367a(RuleExpression ruleExpression, ReachPointAction aVar) {
        Intrinsics.checkParameterIsNotNull(ruleExpression, "ruleExpression");
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        MetaRuleService.f141822a.mo195362a(aVar);
        return m223531b(ruleExpression, aVar);
    }

    /* renamed from: b */
    private final boolean m223531b(RuleExpression ruleExpression, ReachPointAction aVar) {
        RuleExpression ruleExpression2;
        RuleExpressionEngine bVar;
        if (ruleExpression.mo195378c() == null && ruleExpression.mo195379d() == null) {
            return f141828a.m223532c(ruleExpression, aVar);
        }
        if (ruleExpression.mo195378c() == null || ruleExpression.mo195379d() == null) {
            if (ruleExpression.mo195378c() != null) {
                bVar = f141828a;
                ruleExpression2 = ruleExpression.mo195378c();
                if (ruleExpression2 == null) {
                    Intrinsics.throwNpe();
                }
            } else {
                bVar = f141828a;
                ruleExpression2 = ruleExpression.mo195379d();
                if (ruleExpression2 == null) {
                    Intrinsics.throwNpe();
                }
            }
            return bVar.m223532c(ruleExpression2, aVar);
        }
        RuleExpressionEngine bVar2 = f141828a;
        RuleExpression c = ruleExpression.mo195378c();
        if (c == null) {
            Intrinsics.throwNpe();
        }
        boolean b = bVar2.m223531b(c, aVar);
        RuleExpression d = ruleExpression.mo195379d();
        if (d == null) {
            Intrinsics.throwNpe();
        }
        boolean b2 = bVar2.m223531b(d, aVar);
        RuleExpression.ConditionOperator e = ruleExpression.mo195380e();
        if (e != null) {
            return e.compare(b, b2);
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m223532c(RuleExpression ruleExpression, ReachPointAction aVar) {
        boolean z;
        String a = ruleExpression.mo195370a();
        if (a == null || a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String a2 = aVar.mo195280a();
            String a3 = ruleExpression.mo195370a();
            if (a3 == null) {
                Intrinsics.throwNpe();
            }
            String b = MetaRuleService.f141822a.mo195363b(new ReachPointAction(a2, a3, null, 4, null));
            if (b != null) {
                String b2 = ruleExpression.mo195375b();
                if (b2 != null) {
                    RuleExpression.ExpressionOperator f = ruleExpression.mo195381f();
                    if (f != null) {
                        return f.compare(b, b2);
                    }
                    throw new RuleException(RuleMetricErrorInfo.MISS_EXP_OPERATOR, null, 2, null);
                }
                throw new RuleException(RuleMetricErrorInfo.ILLEGAL_THRESHOLD, null, 2, null);
            } else if (!Intrinsics.areEqual(ruleExpression.mo195370a(), aVar.mo195281b())) {
                return false;
            } else {
                throw new RuleException(RuleMetricErrorInfo.MISS_CURRENT_VALUE, null, 2, null);
            }
        } else {
            throw new RuleException(RuleMetricErrorInfo.MISS_LEFT_RULE_ACTION, null, 2, null);
        }
    }
}
