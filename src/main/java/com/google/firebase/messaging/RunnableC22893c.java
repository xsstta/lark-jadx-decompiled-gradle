package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.firebase.messaging.c */
final /* synthetic */ class RunnableC22893c implements Runnable {

    /* renamed from: a */
    private final EnhancedIntentService f56598a;

    /* renamed from: b */
    private final Intent f56599b;

    /* renamed from: c */
    private final TaskCompletionSource f56600c;

    RunnableC22893c(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f56598a = enhancedIntentService;
        this.f56599b = intent;
        this.f56600c = taskCompletionSource;
    }

    public final void run() {
        this.f56598a.lambda$processIntent$0$EnhancedIntentService(this.f56599b, this.f56600c);
    }
}
