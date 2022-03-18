package com.larksuite.rucket.job.extension;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.larksuite.rucket.job.RucketJob;
import com.larksuite.rucket.job.base.RucketResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002:\u0001\fB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\b\u001a\u00020\tHBø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/larksuite/rucket/job/extension/JobItrImpl;", "T", "Lcom/larksuite/rucket/job/extension/RucketJobIterator;", "Lcom/larksuite/rucket/job/base/RucketResult;", "target", "Lcom/larksuite/rucket/job/RucketJob;", "(Lcom/larksuite/rucket/job/RucketJob;)V", "result", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "next", "Companion", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.extension.a */
public final class JobItrImpl<T> implements RucketJobIterator<RucketResult<? extends T>> {

    /* renamed from: a */
    public static final Companion f65019a = new Companion(null);

    /* renamed from: b */
    private RucketResult<? extends T> f65020b;

    /* renamed from: c */
    private final RucketJob<T> f65021c;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HB"}, d2 = {"hasNext", "", "T", "continuation", "Lkotlin/coroutines/Continuation;", ""}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.larksuite.rucket.job.extension.JobItrImpl", mo239173f = "RucketJobIterator.kt", mo239174i = {0}, mo239175l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, mo239176m = "hasNext", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.larksuite.rucket.job.extension.a$b */
    public static final class C26369b extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ JobItrImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26369b(JobItrImpl aVar, Continuation cVar) {
            super(cVar);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo93513a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/rucket/job/extension/JobItrImpl$Companion;", "", "()V", "TAG", "", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.rucket.job.extension.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.larksuite.rucket.job.a.b<? extends T>, com.larksuite.rucket.job.a.b<T> */
    /* renamed from: a */
    public RucketResult<T> mo93514b() {
        RucketResult bVar = (RucketResult<? extends T>) this.f65020b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public JobItrImpl(RucketJob<T> aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "target");
        this.f65021c = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.larksuite.rucket.job.extension.RucketJobIterator
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo93513a(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.rucket.job.extension.JobItrImpl.mo93513a(kotlin.coroutines.c):java.lang.Object");
    }
}
