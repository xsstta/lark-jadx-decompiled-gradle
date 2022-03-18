package com.ss.android.lark.ug.scheduler.rule.entity;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/scheduler/rule/entity/DefaultAction;", "", "event", "", "metaRule", "Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;", "(Ljava/lang/String;ILjava/lang/String;Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;)V", "getEvent", "()Ljava/lang/String;", "getMetaRule", "()Lcom/ss/android/lark/ug/scheduler/rule/entity/MetaRule;", "CLICK_COUNT", "SHOW_COUNT", "SHOW_TIME", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum DefaultAction {
    CLICK_COUNT("click_count", MetaRule.COUNT),
    SHOW_COUNT("show_count", MetaRule.COUNT),
    SHOW_TIME("show_time", MetaRule.DURATION);
    
    private final String event;
    private final MetaRule metaRule;

    public final String getEvent() {
        return this.event;
    }

    public final MetaRule getMetaRule() {
        return this.metaRule;
    }

    private DefaultAction(String str, MetaRule metaRule2) {
        this.event = str;
        this.metaRule = metaRule2;
    }
}
