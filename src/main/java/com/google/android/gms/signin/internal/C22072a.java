package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C21590b;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.C21740c;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.AbstractC22071e;
import com.google.android.gms.signin.C22066a;

/* renamed from: com.google.android.gms.signin.internal.a */
public class C22072a extends AbstractC21745f<zaf> implements AbstractC22071e {

    /* renamed from: a */
    private final boolean f53686a;

    /* renamed from: b */
    private final C21740c f53687b;

    /* renamed from: c */
    private final Bundle f53688c;

    /* renamed from: d */
    private Integer f53689d;

    private C22072a(Context context, Looper looper, boolean z, C21740c cVar, Bundle bundle, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, 44, cVar, bVar, cVar2);
        this.f53686a = true;
        this.f53687b = cVar;
        this.f53688c = bundle;
        this.f53689d = cVar.mo73696j();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public C22072a(Context context, Looper looper, boolean z, C21740c cVar, C22066a aVar, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        this(context, looper, true, cVar, m79627a(cVar), bVar, cVar2);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public boolean requiresSignIn() {
        return this.f53686a;
    }

    @Override // com.google.android.gms.signin.AbstractC22071e
    /* renamed from: a */
    public final void mo74969a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) getService()).zaa(iAccountAccessor, this.f53689d.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // com.google.android.gms.signin.AbstractC22071e
    /* renamed from: a */
    public final void mo74968a() {
        try {
            ((zaf) getService()).zam(this.f53689d.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // com.google.android.gms.signin.AbstractC22071e
    /* renamed from: a */
    public final void mo74970a(zad zad) {
        Preconditions.checkNotNull(zad, "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f53687b.mo73689c();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(c.name)) {
                googleSignInAccount = C21590b.m78184a(getContext()).mo73086a();
            }
            ((zaf) getService()).zaa(new zah(new ResolveAccountRequest(c, this.f53689d.intValue(), googleSignInAccount)), zad);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zad.zab(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f53687b.mo73693g())) {
            this.f53688c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f53687b.mo73693g());
        }
        return this.f53688c;
    }

    @Override // com.google.android.gms.signin.AbstractC22071e
    /* renamed from: c */
    public final void mo74971c() {
        connect(new BaseGmsClient.C21721b());
    }

    /* renamed from: a */
    public static Bundle m79627a(C21740c cVar) {
        C22066a i = cVar.mo73695i();
        Integer j = cVar.mo73696j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.mo73688b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.mo74960a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.mo74961b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.mo74962c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.mo74963d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.mo74964e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.mo74965f());
            if (i.mo74966g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.mo74966g().longValue());
            }
            if (i.mo74967h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.mo74967h().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zag(iBinder);
    }
}
