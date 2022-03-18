package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Err;", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/Result;", "action", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;", "err", "", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/widget/model/WikiAction;Ljava/lang/Throwable;)V", "getErr", "()Ljava/lang/Throwable;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.model.a */
public final class Err extends Result {

    /* renamed from: b */
    private final Throwable f33426b;

    /* renamed from: a */
    public final Throwable mo47463a() {
        return this.f33426b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Err(WikiAction wikiAction, Throwable th) {
        super(wikiAction, null);
        Intrinsics.checkParameterIsNotNull(wikiAction, "action");
        Intrinsics.checkParameterIsNotNull(th, "err");
        this.f33426b = th;
    }
}
