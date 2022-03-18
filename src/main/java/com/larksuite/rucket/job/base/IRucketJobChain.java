package com.larksuite.rucket.job.base;

import com.larksuite.rucket.job.RucketJob;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\n¨\u0006\r"}, d2 = {"Lcom/larksuite/rucket/job/base/IRucketJobChain;", "P", "Lcom/larksuite/rucket/job/RucketJob;", "", "nextJob", "()Lcom/larksuite/rucket/job/RucketJob;", "prevJob", "setNextJob", "", "next", "(Lcom/larksuite/rucket/job/RucketJob;)V", "setPrevJob", "prev", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.a.a */
public interface IRucketJobChain<P extends RucketJob<?>> {
    /* renamed from: b */
    void mo93488b(P p);

    /* renamed from: c */
    void mo93489c(P p);
}
