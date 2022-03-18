package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzk extends zzn {
    private final /* synthetic */ C21877p zzaf;

    zzk(C21877p pVar) {
        this.zzaf = pVar;
    }

    @Override // com.google.android.gms.internal.auth.zzn, com.google.android.gms.auth.account.zza
    public final void zzc(Account account) {
        this.zzaf.mo73314b(new C21879r(account != null ? Status.RESULT_SUCCESS : C21876o.f53274a, account));
    }
}
