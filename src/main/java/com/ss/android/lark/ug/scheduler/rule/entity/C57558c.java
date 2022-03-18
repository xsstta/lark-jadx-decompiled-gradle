package com.ss.android.lark.ug.scheduler.rule.entity;

import com.bytedance.lark.pb.ugreach.v1.RuleExpression;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.entity.c */
public final /* synthetic */ class C57558c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141843a;

    static {
        int[] iArr = new int[RuleExpression.ExpressionOperator.values().length];
        f141843a = iArr;
        iArr[RuleExpression.ExpressionOperator.IN.ordinal()] = 1;
        iArr[RuleExpression.ExpressionOperator.EQUAL.ordinal()] = 2;
        iArr[RuleExpression.ExpressionOperator.NOT_EQUAL.ordinal()] = 3;
        iArr[RuleExpression.ExpressionOperator.LESS_OR_EQUAL.ordinal()] = 4;
        iArr[RuleExpression.ExpressionOperator.LESS_THAN.ordinal()] = 5;
        iArr[RuleExpression.ExpressionOperator.GREATER_OR_EQUAL.ordinal()] = 6;
        iArr[RuleExpression.ExpressionOperator.GREATER_THAN.ordinal()] = 7;
    }
}
