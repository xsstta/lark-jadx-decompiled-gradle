package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r */
public final class C21683r implements OnCompleteListener<TResult> {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f52876a;

    /* renamed from: b */
    private final /* synthetic */ C21681p f52877b;

    C21683r(C21681p pVar, TaskCompletionSource taskCompletionSource) {
        this.f52877b = pVar;
        this.f52876a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<TResult> task) {
        this.f52877b.f52873b.remove(this.f52876a);
    }
}
