package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.m */
public class C21678m {
    /* renamed from: a */
    public static void m78753a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m78754a(status, null, taskCompletionSource);
    }

    /* renamed from: a */
    public static <TResult> void m78754a(Status status, TResult tresult, TaskCompletionSource<TResult> taskCompletionSource) {
        if (status.isSuccess()) {
            taskCompletionSource.setResult(tresult);
        } else {
            taskCompletionSource.setException(new ApiException(status));
        }
    }

    /* renamed from: a */
    public static Task<Void> m78752a(Task<Boolean> task) {
        return task.continueWith(new bp());
    }
}
