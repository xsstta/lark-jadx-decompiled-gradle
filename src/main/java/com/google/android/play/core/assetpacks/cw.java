package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnFailureListener;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cw implements OnFailureListener {

    /* renamed from: a */
    static final OnFailureListener f55889a = new cw();

    private cw() {
    }

    @Override // com.google.android.play.core.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        cx.f55890a.mo78875d(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
