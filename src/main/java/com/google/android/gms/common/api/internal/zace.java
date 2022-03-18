package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;
import com.google.android.gms.signin.C22068b;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.util.Set;

public final class zace extends zac implements AbstractC21631d.AbstractC21633b, AbstractC21631d.AbstractC21634c {
    private static C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> zaki = C22068b.f53678a;
    private final Context mContext;
    private final Handler mHandler;
    private Set<Scope> mScopes;
    private final C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> zaau;
    private C21740c zaet;
    private AbstractC22071e zagb;
    private bo zakj;

    public zace(Context context, Handler handler, C21740c cVar) {
        this(context, handler, cVar, zaki);
    }

    public zace(Context context, Handler handler, C21740c cVar, C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar) {
        this.mContext = context;
        this.mHandler = handler;
        this.zaet = (C21740c) Preconditions.checkNotNull(cVar, "ClientSettings must not be null");
        this.mScopes = cVar.mo73690d();
        this.zaau = aVar;
    }

    public final void zaa(bo boVar) {
        AbstractC22071e eVar = this.zagb;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.zaet.mo73687a(Integer.valueOf(System.identityHashCode(this)));
        C21611a.AbstractC21612a<? extends AbstractC22071e, C22066a> aVar = this.zaau;
        Context context = this.mContext;
        Looper looper = this.mHandler.getLooper();
        C21740c cVar = this.zaet;
        this.zagb = (AbstractC22071e) aVar.mo72954a(context, looper, cVar, cVar.mo73695i(), this, this);
        this.zakj = boVar;
        Set<Scope> set = this.mScopes;
        if (set == null || set.isEmpty()) {
            this.mHandler.post(new RunnableC21659bm(this));
        } else {
            this.zagb.mo74971c();
        }
    }

    public final AbstractC22071e zabq() {
        return this.zagb;
    }

    public final void zabs() {
        AbstractC22071e eVar = this.zagb;
        if (eVar != null) {
            eVar.disconnect();
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnected(Bundle bundle) {
        this.zagb.mo74970a(this);
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21633b
    public final void onConnectionSuspended(int i) {
        this.zagb.disconnect();
    }

    @Override // com.google.android.gms.common.api.AbstractC21631d.AbstractC21634c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zakj.mo73399b(connectionResult);
    }

    @Override // com.google.android.gms.signin.internal.zad, com.google.android.gms.signin.internal.zac
    public final void zab(zaj zaj) {
        this.mHandler.post(new bn(this, zaj));
    }

    /* access modifiers changed from: private */
    public final void zac(zaj zaj) {
        ConnectionResult a = zaj.mo74987a();
        if (a.isSuccess()) {
            ResolveAccountResponse b = zaj.mo74988b();
            ConnectionResult b2 = b.mo73648b();
            if (!b2.isSuccess()) {
                String valueOf = String.valueOf(b2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.zakj.mo73399b(b2);
                this.zagb.disconnect();
                return;
            }
            this.zakj.mo73398a(b.mo73647a(), this.mScopes);
        } else {
            this.zakj.mo73399b(a);
        }
        this.zagb.disconnect();
    }
}
