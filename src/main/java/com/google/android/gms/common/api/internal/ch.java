package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* access modifiers changed from: package-private */
public final class ch implements Runnable {

    /* renamed from: a */
    final /* synthetic */ cf f52799a;

    /* renamed from: b */
    private final cg f52800b;

    ch(cf cfVar, cg cgVar) {
        this.f52799a = cfVar;
        this.f52800b = cgVar;
    }

    public final void run() {
        if (this.f52799a.f52793b) {
            ConnectionResult b = this.f52800b.mo73460b();
            if (b.hasResolution()) {
                this.f52799a.f52619a.startActivityForResult(GoogleApiActivity.m78245a(this.f52799a.mo73325a(), b.getResolution(), this.f52800b.mo73459a(), false), 1);
            } else if (this.f52799a.f52795d.isUserResolvableError(b.getErrorCode())) {
                this.f52799a.f52795d.mo73181a(this.f52799a.mo73325a(), this.f52799a.f52619a, b.getErrorCode(), 2, this.f52799a);
            } else if (b.getErrorCode() == 18) {
                this.f52799a.f52795d.mo73178a(this.f52799a.mo73325a().getApplicationContext(), new ci(this, C21608a.m78225a(this.f52799a.mo73325a(), this.f52799a)));
            } else {
                this.f52799a.mo73451a(b, this.f52800b.mo73459a());
            }
        }
    }
}
