package com.ss.android.lark.ug.scheduler.rule.entity;

import com.bytedance.lark.pb.ugreach.v1.RuleExpression;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.b */
public final /* synthetic */ class C57557b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141842a;

    static {
        int[] iArr = new int[RuleExpression.ConditionOperator.values().length];
        f141842a = iArr;
        iArr[RuleExpression.ConditionOperator.AND.ordinal()] = 1;
        iArr[RuleExpression.ConditionOperator.OR.ordinal()] = 2;
        iArr[RuleExpression.ConditionOperator.NOT.ordinal()] = 3;
    }
}
