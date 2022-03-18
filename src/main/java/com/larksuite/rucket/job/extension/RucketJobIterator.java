package com.larksuite.rucket.job.extension;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0011\u0010\u0003\u001a\u00020\u0004H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/larksuite/rucket/job/extension/RucketJobIterator;", "E", "", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.extension.b */
public interface RucketJobIterator<E> {
    /* renamed from: a */
    Object mo93513a(Continuation<? super Boolean> cVar);

    /* renamed from: b */
    E mo93514b();
}
