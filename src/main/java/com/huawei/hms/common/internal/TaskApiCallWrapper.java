package com.huawei.hms.common.internal;

import com.huawei.hmf.tasks.C23433g;

public class TaskApiCallWrapper<TResult> extends BaseContentWrapper {
    private final TaskApiCall<? extends AnyClient, TResult> mTaskApiCall;
    private final C23433g<TResult> mTaskCompletionSource;

    public TaskApiCall<? extends AnyClient, TResult> getTaskApiCall() {
        return this.mTaskApiCall;
    }

    public C23433g<TResult> getTaskCompletionSource() {
        return this.mTaskCompletionSource;
    }

    public TaskApiCallWrapper(TaskApiCall<? extends AnyClient, TResult> taskApiCall, C23433g<TResult> gVar) {
        super(1);
        this.mTaskApiCall = taskApiCall;
        this.mTaskCompletionSource = gVar;
    }
}
