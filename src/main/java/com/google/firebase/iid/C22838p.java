package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.p */
final /* synthetic */ class C22838p implements OnCompleteListener {

    /* renamed from: a */
    private final boolean f56462a;

    /* renamed from: b */
    private final BroadcastReceiver.PendingResult f56463b;

    C22838p(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.f56462a = z;
        this.f56463b = pendingResult;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        FirebaseInstanceIdReceiver.m82826a(this.f56462a, this.f56463b, task);
    }
}
