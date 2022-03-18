package com.bytedance.ee.bear.document.feed;

import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.document.feed.-$$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA implements Function {
    public static final /* synthetic */ $$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA INSTANCE = new $$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA();

    private /* synthetic */ $$Lambda$FeedPlugin$c$ahdEEfvFf7iccYoxcUiZmpQC3iA() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return FeedPlugin.getBodyWithJson((String) obj);
    }
}
