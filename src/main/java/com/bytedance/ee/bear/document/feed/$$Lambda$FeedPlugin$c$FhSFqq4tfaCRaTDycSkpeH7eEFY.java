package com.bytedance.ee.bear.document.feed;

import com.bytedance.ee.log.C13479a;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.document.feed.-$$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY implements Consumer {
    public static final /* synthetic */ $$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY INSTANCE = new $$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY();

    private /* synthetic */ $$Lambda$FeedPlugin$c$FhSFqq4tfaCRaTDycSkpeH7eEFY() {
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        C13479a.m54765b("FeedPlugin", "fetchMessage error", (Throwable) obj);
    }
}
