package com.ss.android.lark.ug.scheduler.rule.service;

import com.ss.android.lark.ug.scheduler.rule.api.RuleService;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/service/RuleServiceFactory;", "", "()V", "createRuleService", "Lcom/ss/android/lark/ug/scheduler/rule/api/RuleService;", "createRuleService$ug_reach_sdk_release", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.rule.b.c */
public final class RuleServiceFactory {

    /* renamed from: a */
    public static final RuleServiceFactory f141829a = new RuleServiceFactory();

    private RuleServiceFactory() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final RuleService m223534a() {
        return new RuleServiceImpl();
    }
}
