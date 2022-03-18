package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements OnCompleteListener {

    /* renamed from: a */
    private final C22815ag f56400a;

    /* renamed from: b */
    private final String f56401b;

    /* renamed from: c */
    private final ScheduledFuture f56402c;

    ak(C22815ag agVar, String str, ScheduledFuture scheduledFuture) {
        this.f56400a = agVar;
        this.f56401b = str;
        this.f56402c = scheduledFuture;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f56400a.mo79320a(this.f56401b, this.f56402c, task);
    }
}
