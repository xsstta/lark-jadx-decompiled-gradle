package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.AbstractC21667e;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.q */
public final class C21760q extends AbstractDialogInterface$OnClickListenerC21744e {

    /* renamed from: a */
    private final /* synthetic */ Intent f53101a;

    /* renamed from: b */
    private final /* synthetic */ AbstractC21667e f53102b;

    /* renamed from: c */
    private final /* synthetic */ int f53103c;

    C21760q(Intent intent, AbstractC21667e eVar, int i) {
        this.f53101a = intent;
        this.f53102b = eVar;
        this.f53103c = i;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC21744e
    /* renamed from: a */
    public final void mo73703a() {
        Intent intent = this.f53101a;
        if (intent != null) {
            this.f53102b.startActivityForResult(intent, this.f53103c);
        }
    }
}
