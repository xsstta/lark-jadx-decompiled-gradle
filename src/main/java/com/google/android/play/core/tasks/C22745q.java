package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.tasks.q */
public final class C22745q implements OnFailureListener, OnSuccessListener {

    /* renamed from: a */
    private final CountDownLatch f56273a = new CountDownLatch(1);

    private C22745q() {
    }

    /* synthetic */ C22745q(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo79099a() throws InterruptedException {
        this.f56273a.await();
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f56273a.countDown();
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        this.f56273a.countDown();
    }
}
