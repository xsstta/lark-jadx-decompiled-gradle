package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.messaging.e */
final /* synthetic */ class C22895e implements OnCompleteListener {

    /* renamed from: a */
    private final EnhancedIntentService f56602a;

    /* renamed from: b */
    private final Intent f56603b;

    C22895e(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f56602a = enhancedIntentService;
        this.f56603b = intent;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f56602a.lambda$onStartCommand$1$EnhancedIntentService(this.f56603b, task);
    }
}
