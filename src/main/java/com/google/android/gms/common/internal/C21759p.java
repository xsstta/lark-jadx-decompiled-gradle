package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.p */
public final class C21759p extends AbstractDialogInterface$OnClickListenerC21744e {

    /* renamed from: a */
    private final /* synthetic */ Intent f53098a;

    /* renamed from: b */
    private final /* synthetic */ Activity f53099b;

    /* renamed from: c */
    private final /* synthetic */ int f53100c;

    C21759p(Intent intent, Activity activity, int i) {
        this.f53098a = intent;
        this.f53099b = activity;
        this.f53100c = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC21744e
    /* renamed from: a */
    public final void mo73703a() {
        Intent intent = this.f53098a;
        if (intent != null) {
            this.f53099b.startActivityForResult(intent, this.f53100c);
        }
    }
}
