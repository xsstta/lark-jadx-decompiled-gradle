package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.l */
public final /* synthetic */ class C22834l implements OnCompleteListener {

    /* renamed from: a */
    private final CountDownLatch f56452a;

    C22834l(CountDownLatch countDownLatch) {
        this.f56452a = countDownLatch;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f56452a.countDown();
    }
}
