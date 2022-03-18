package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* access modifiers changed from: package-private */
public final class aw implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a */
    private final /* synthetic */ C21661c f52690a;

    aw(C21661c cVar) {
        this.f52690a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        this.f52690a.f52753q.sendMessage(this.f52690a.f52753q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
