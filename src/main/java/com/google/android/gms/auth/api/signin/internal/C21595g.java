package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C21595g extends AbstractC21745f<zzu> {

    /* renamed from: a */
    private final GoogleSignInOptions f52530a;

    public C21595g(Context context, Looper looper, C21740c cVar, GoogleSignInOptions googleSignInOptions, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar2) {
        super(context, looper, 91, cVar, bVar, cVar2);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.C21576a().mo73059d() : googleSignInOptions;
        if (!cVar.mo73691e().isEmpty()) {
            GoogleSignInOptions.C21576a aVar = new GoogleSignInOptions.C21576a(googleSignInOptions);
            for (Scope scope : cVar.mo73691e()) {
                aVar.mo73055a(scope, new Scope[0]);
            }
            googleSignInOptions = aVar.mo73059d();
        }
        this.f52530a = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public final boolean providesSignIn() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f
    public final Intent getSignInIntent() {
        return C21596h.m78204a(getContext(), this.f52530a);
    }

    /* renamed from: a */
    public final GoogleSignInOptions mo73096a() {
        return this.f52530a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zzu) {
            return (zzu) queryLocalInterface;
        }
        return new zzv(iBinder);
    }
}
