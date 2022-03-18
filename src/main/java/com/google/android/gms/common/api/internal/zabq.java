package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f52909a;

    /* renamed from: b */
    private final be f52910b;

    public zabq(be beVar) {
        this.f52910b = beVar;
    }

    /* renamed from: a */
    public final void mo73511a(Context context) {
        this.f52909a = context;
    }

    /* renamed from: a */
    public final synchronized void mo73510a() {
        Context context = this.f52909a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f52909a = null;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f52910b.mo73361a();
            mo73510a();
        }
    }
}
