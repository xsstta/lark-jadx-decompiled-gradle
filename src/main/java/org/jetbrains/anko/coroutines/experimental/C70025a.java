package org.jetbrains.anko.coroutines.experimental;

import kotlin.Metadata;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlinx.coroutines.experimental.Job;
import kotlinx.coroutines.experimental.ThreadPoolDispatcherKt;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\b\"$\u0010\u0000\u001a\u00020\u00018\u0000@\u0000X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"POOL", "Lkotlin/coroutines/experimental/CoroutineContext;", "POOL$annotations", "()V", "getPOOL", "()Lkotlin/coroutines/experimental/CoroutineContext;", "setPOOL", "(Lkotlin/coroutines/experimental/CoroutineContext;)V", "bg", "Lkotlinx/coroutines/experimental/Deferred;", "T", "block", "Lkotlin/Function0;", "anko-coroutines_release"}, mo238835k = 2, mv = {1, 1, 5})
/* renamed from: org.jetbrains.anko.coroutines.experimental.a */
public final class C70025a {

    /* renamed from: a */
    private static CoroutineContext f175000a = ThreadPoolDispatcherKt.newFixedThreadPoolContext$default(Runtime.getRuntime().availableProcessors() * 2, "bg", (Job) null, 4, (Object) null);
}
