package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

final /* synthetic */ class au implements OnCompleteListener {

    /* renamed from: a */
    private final ScheduledFuture f56434a;

    au(ScheduledFuture scheduledFuture) {
        this.f56434a = scheduledFuture;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f56434a.cancel(false);
    }
}
