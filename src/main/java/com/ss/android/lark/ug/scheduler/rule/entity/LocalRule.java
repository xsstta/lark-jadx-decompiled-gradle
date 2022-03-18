package com.ss.android.lark.ug.scheduler.rule.entity;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/LocalRule;", "", "ruleId", "", "ruleExpression", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "(JLcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;)V", "getRuleExpression", "()Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "getRuleId", "()J", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.a */
public final class LocalRule {

    /* renamed from: a */
    public static final Companion f141839a = new Companion(null);

    /* renamed from: b */
    private final long f141840b;

    /* renamed from: c */
    private final RuleExpression f141841c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/LocalRule$Companion;", "", "()V", "parse", "Lcom/ss/android/lark/ug/scheduler/rule/entity/LocalRule;", "pbLocalRule", "Lcom/bytedance/lark/pb/ugreach/v1/LocalRule;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LocalRule mo195405a(com.bytedance.lark.pb.ugreach.v1.LocalRule localRule) {
            Intrinsics.checkParameterIsNotNull(localRule, "pbLocalRule");
            Long l = localRule.rule_id;
            Intrinsics.checkExpressionValueIsNotNull(l, "pbLocalRule.rule_id");
            return new LocalRule(l.longValue(), RuleExpression.f141832a.mo195401a(localRule.root_exp_node));
        }
    }

    /* renamed from: a */
    public final RuleExpression mo195404a() {
        return this.f141841c;
    }

    public LocalRule(long j, RuleExpression ruleExpression) {
        this.f141840b = j;
        this.f141841c = ruleExpression;
    }
}
