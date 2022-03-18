package com.bytedance.ee.bear.block.jira;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"config", "Lcom/bytedance/ee/bear/block/jira/JiraConfig;", "build", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.block.jira.c */
public final class C4916c {
    /* renamed from: a */
    public static final JiraConfig m20228a(Function1<? super JiraConfig, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "build");
        JiraConfig bVar = new JiraConfig();
        function1.invoke(bVar);
        return bVar;
    }
}
