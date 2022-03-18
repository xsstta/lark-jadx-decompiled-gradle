package com.ss.android.lark.ug.scheduler.rule.entity;

import com.bytedance.lark.pb.ugreach.v1.RuleExpression;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.ug.scheduler.common.exception.RuleException;
import com.ss.android.lark.ug.scheduler.common.exception.RuleMetricErrorInfo;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000  2\u00020\u0001:\u0003 !\"B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "", "()V", "conditionOperator", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;", "getConditionOperator", "()Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;", "setConditionOperator", "(Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;)V", "expressionOperator", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;", "getExpressionOperator", "()Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;", "setExpressionOperator", "(Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;)V", "left", "getLeft", "()Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "setLeft", "(Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;)V", "right", "getRight", "setRight", "ruleAction", "", "getRuleAction", "()Ljava/lang/String;", "setRuleAction", "(Ljava/lang/String;)V", "thresholdValue", "getThresholdValue", "setThresholdValue", "Companion", "ConditionOperator", "ExpressionOperator", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class RuleExpression {

    /* renamed from: a */
    public static final Companion f141832a = new Companion(null);

    /* renamed from: b */
    private String f141833b;

    /* renamed from: c */
    private String f141834c;

    /* renamed from: d */
    private RuleExpression f141835d;

    /* renamed from: e */
    private RuleExpression f141836e;

    /* renamed from: f */
    private ConditionOperator f141837f;

    /* renamed from: g */
    private ExpressionOperator f141838g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;", "", "value", "", "comparator", "Lkotlin/Function2;", "", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;)V", "getValue", "()I", "compare", "left", "right", GrsBaseInfo.CountryCodeSource.UNKNOWN, "AND", "OR", "NOT", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum ConditionOperator {
        UNKNOWN(0, C575451.INSTANCE),
        AND(1, C575462.INSTANCE),
        OR(2, C575473.INSTANCE),
        NOT(3, C575484.INSTANCE);
        
        public static final Companion Companion = new Companion(null);
        private final Function2<Boolean, Boolean, Boolean> comparator;
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\tj\u0002`\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator$Companion;", "", "()V", "of", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;", "value", "", "parse", "operator", "Lcom/bytedance/lark/pb/ugreach/v1/RuleExpression$ConditionOperator;", "Lcom/ss/android/lark/ug/scheduler/common/PBConditionOperator;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.RuleExpression$ConditionOperator$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ConditionOperator mo195388a(RuleExpression.ConditionOperator conditionOperator) {
                Intrinsics.checkParameterIsNotNull(conditionOperator, "operator");
                int i = C57557b.f141842a[conditionOperator.ordinal()];
                if (i == 1) {
                    return ConditionOperator.AND;
                }
                if (i == 2) {
                    return ConditionOperator.OR;
                }
                if (i != 3) {
                    return ConditionOperator.UNKNOWN;
                }
                return ConditionOperator.NOT;
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final boolean compare(boolean z, boolean z2) {
            return this.comparator.invoke(Boolean.valueOf(z), Boolean.valueOf(z2)).booleanValue();
        }

        private ConditionOperator(int i, Function2 kVar) {
            this.value = i;
            this.comparator = kVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;", "", "value", "", "comparator", "Lkotlin/Function2;", "", "", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;)V", "getValue", "()I", "compare", "currentValue", "thresholdValue", GrsBaseInfo.CountryCodeSource.UNKNOWN, "IN", "EQUAL", "NOT_EQUAL", "LESS_OR_EQUAL", "LESS_THAN", "GREATER_OR_EQUAL", "GREATER_THAN", "Companion", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum ExpressionOperator {
        UNKNOWN(0, C575491.INSTANCE),
        IN(1, C575502.INSTANCE),
        EQUAL(2, C575513.INSTANCE),
        NOT_EQUAL(3, C575524.INSTANCE),
        LESS_OR_EQUAL(4, C575535.INSTANCE),
        LESS_THAN(5, C575546.INSTANCE),
        GREATER_OR_EQUAL(6, C575557.INSTANCE),
        GREATER_THAN(7, C575568.INSTANCE);
        
        public static final Companion Companion = new Companion(null);
        private final Function2<String, String, Boolean> comparator;
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0012\u0010\f\u001a\u00020\n2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator$Companion;", "", "()V", "compareTo", "", "left", "", "right", "compareTo$ug_reach_sdk_release", "of", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;", "value", "parse", "operator", "Lcom/bytedance/lark/pb/ugreach/v1/RuleExpression$ExpressionOperator;", "Lcom/ss/android/lark/ug/scheduler/common/PBExpressionOperator;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.RuleExpression$ExpressionOperator$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final ExpressionOperator mo195400a(RuleExpression.ExpressionOperator expressionOperator) {
                Intrinsics.checkParameterIsNotNull(expressionOperator, "operator");
                switch (C57558c.f141843a[expressionOperator.ordinal()]) {
                    case 1:
                        return ExpressionOperator.IN;
                    case 2:
                        return ExpressionOperator.EQUAL;
                    case 3:
                        return ExpressionOperator.NOT_EQUAL;
                    case 4:
                        return ExpressionOperator.LESS_OR_EQUAL;
                    case 5:
                        return ExpressionOperator.LESS_THAN;
                    case 6:
                        return ExpressionOperator.GREATER_OR_EQUAL;
                    case 7:
                        return ExpressionOperator.GREATER_THAN;
                    default:
                        return ExpressionOperator.UNKNOWN;
                }
            }

            /* renamed from: a */
            public final int mo195399a(String str, String str2) {
                Intrinsics.checkParameterIsNotNull(str, "left");
                Intrinsics.checkParameterIsNotNull(str2, "right");
                try {
                    return Intrinsics.compare(Integer.parseInt(str), Integer.parseInt(str2));
                } catch (NumberFormatException e) {
                    RuleException ruleException = new RuleException(RuleMetricErrorInfo.ILLEGAL_THRESHOLD, e);
                    ruleException.setExtraInfo(MapsKt.mutableMapOf(TuplesKt.to("value", "left:" + str + ", right:" + str2)));
                    throw ruleException;
                }
            }
        }

        public final int getValue() {
            return this.value;
        }

        public final boolean compare(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "currentValue");
            Intrinsics.checkParameterIsNotNull(str2, "thresholdValue");
            return this.comparator.invoke(str, str2).booleanValue();
        }

        private ExpressionOperator(int i, Function2 kVar) {
            this.value = i;
            this.comparator = kVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$Companion;", "", "()V", "createBranchNode", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression;", "left", "right", "conditionOperator", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ConditionOperator;", "createLeaf", "ruleAction", "", "thresholdValue", "expressionOperator", "Lcom/ss/android/lark/ug/scheduler/rule/entity/RuleExpression$ExpressionOperator;", "parse", "pbRuleExpression", "Lcom/bytedance/lark/pb/ugreach/v1/RuleExpression;", "Lcom/ss/android/lark/ug/scheduler/common/PBRuleExpression;", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.RuleExpression$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final RuleExpression mo195401a(com.bytedance.lark.pb.ugreach.v1.RuleExpression ruleExpression) {
            if (ruleExpression == null) {
                return null;
            }
            Companion aVar = this;
            RuleExpression a = aVar.mo195401a(ruleExpression.left);
            RuleExpression a2 = aVar.mo195401a(ruleExpression.right);
            if (a == null && a2 == null) {
                String str = ruleExpression.rule_action;
                Intrinsics.checkExpressionValueIsNotNull(str, "pbRuleExpression.rule_action");
                String str2 = ruleExpression.value;
                Intrinsics.checkExpressionValueIsNotNull(str2, "pbRuleExpression.value");
                ExpressionOperator.Companion aVar2 = ExpressionOperator.Companion;
                RuleExpression.ExpressionOperator expressionOperator = ruleExpression.exp_operator;
                Intrinsics.checkExpressionValueIsNotNull(expressionOperator, "pbRuleExpression.exp_operator");
                return aVar.mo195403a(str, str2, aVar2.mo195400a(expressionOperator));
            }
            ConditionOperator.Companion aVar3 = ConditionOperator.Companion;
            RuleExpression.ConditionOperator conditionOperator = ruleExpression.cond_operator;
            Intrinsics.checkExpressionValueIsNotNull(conditionOperator, "pbRuleExpression.cond_operator");
            return aVar.mo195402a(a, a2, aVar3.mo195388a(conditionOperator));
        }

        @JvmStatic
        /* renamed from: a */
        public final RuleExpression mo195402a(RuleExpression ruleExpression, RuleExpression ruleExpression2, ConditionOperator conditionOperator) {
            Intrinsics.checkParameterIsNotNull(conditionOperator, "conditionOperator");
            RuleExpression ruleExpression3 = new RuleExpression();
            ruleExpression3.mo195373a(ruleExpression);
            ruleExpression3.mo195376b(ruleExpression2);
            ruleExpression3.mo195371a(conditionOperator);
            return ruleExpression3;
        }

        @JvmStatic
        /* renamed from: a */
        public final RuleExpression mo195403a(String str, String str2, ExpressionOperator expressionOperator) {
            Intrinsics.checkParameterIsNotNull(str, "ruleAction");
            Intrinsics.checkParameterIsNotNull(str2, "thresholdValue");
            Intrinsics.checkParameterIsNotNull(expressionOperator, "expressionOperator");
            RuleExpression ruleExpression = new RuleExpression();
            ruleExpression.mo195372a(expressionOperator);
            ruleExpression.mo195374a(str);
            ruleExpression.mo195377b(str2);
            return ruleExpression;
        }
    }

    /* renamed from: a */
    public final String mo195370a() {
        return this.f141833b;
    }

    /* renamed from: b */
    public final String mo195375b() {
        return this.f141834c;
    }

    /* renamed from: c */
    public final RuleExpression mo195378c() {
        return this.f141835d;
    }

    /* renamed from: d */
    public final RuleExpression mo195379d() {
        return this.f141836e;
    }

    /* renamed from: e */
    public final ConditionOperator mo195380e() {
        return this.f141837f;
    }

    /* renamed from: f */
    public final ExpressionOperator mo195381f() {
        return this.f141838g;
    }

    /* renamed from: a */
    public final void mo195371a(ConditionOperator conditionOperator) {
        this.f141837f = conditionOperator;
    }

    /* renamed from: b */
    public final void mo195376b(RuleExpression ruleExpression) {
        this.f141836e = ruleExpression;
    }

    /* renamed from: a */
    public final void mo195372a(ExpressionOperator expressionOperator) {
        this.f141838g = expressionOperator;
    }

    /* renamed from: b */
    public final void mo195377b(String str) {
        this.f141834c = str;
    }

    /* renamed from: a */
    public final void mo195373a(RuleExpression ruleExpression) {
        this.f141835d = ruleExpression;
    }

    /* renamed from: a */
    public final void mo195374a(String str) {
        this.f141833b = str;
    }
}
