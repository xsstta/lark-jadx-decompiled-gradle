package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C21543a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C21700b;
import com.google.android.gms.common.api.AbstractC21631d;

public final class zzw extends zzr {
    private final Context mContext;

    public zzw(Context context) {
        this.mContext = context;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void zzj() {
        zzl();
        C21590b a = C21590b.m78184a(this.mContext);
        GoogleSignInAccount a2 = a.mo73086a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f52472f;
        if (a2 != null) {
            googleSignInOptions = a.mo73088b();
        }
        AbstractC21631d b = new AbstractC21631d.C21632a(this.mContext).mo73281a(C21543a.f52346e, googleSignInOptions).mo73285b();
        try {
            if (b.mo73274f().isSuccess()) {
                if (a2 != null) {
                    C21543a.f52349h.mo73063a(b);
                } else {
                    b.mo73277i();
                }
            }
        } finally {
            b.mo73275g();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzq
    public final void zzk() {
        zzl();
        C21601m.m78217a(this.mContext).mo73105a();
    }

    private final void zzl() {
        if (!C21700b.isGooglePlayServicesUid(this.mContext, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
