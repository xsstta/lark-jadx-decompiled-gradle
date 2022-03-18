package com.google.android.gms.tasks;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.tasks.z */
public final class C22115z implements AbstractC22094f {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f53778a;

    C22115z(TaskCompletionSource taskCompletionSource) {
        this.f53778a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.AbstractC22094f
    public final void onCanceled() {
        this.f53778a.zza.mo75034a();
    }
}
