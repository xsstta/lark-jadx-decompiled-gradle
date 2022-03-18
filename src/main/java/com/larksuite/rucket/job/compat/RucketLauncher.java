package com.larksuite.rucket.job.compat;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.rucket.job.RucketJob;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0007j\b\u0012\u0004\u0012\u0002H\u0005`\bH\u0007J8\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\"\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0004\u0012\u00020\f0\nj\b\u0012\u0004\u0012\u0002H\u0005`\rH\u0007J\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/larksuite/rucket/job/compat/RucketLauncher;", "", "()V", "newJob", "Lcom/larksuite/rucket/job/RucketJob;", "T", "action", "Lkotlin/Function0;", "Lcom/larksuite/rucket/job/compat/ISyncHandler;", "newJobWithCallback", "Lkotlin/Function1;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/larksuite/rucket/job/compat/IAsyncHandler;", "Lcom/larksuite/rucket/job/compat/IAsyncHandlerCompat;", "rucket_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.job.b.b */
public final class RucketLauncher {

    /* renamed from: a */
    public static final RucketLauncher f65018a = new RucketLauncher();

    private RucketLauncher() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> RucketJob<T> m95449a(Function1<? super IGetDataCallback<T>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "action");
        return new CallbackCompatRucketJob(function1);
    }
}
