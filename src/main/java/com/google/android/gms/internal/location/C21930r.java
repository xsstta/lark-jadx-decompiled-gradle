package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.internal.AbstractC21745f;
import com.google.android.gms.common.internal.C21740c;

/* renamed from: com.google.android.gms.internal.location.r */
public class C21930r extends AbstractC21745f<zzao> {

    /* renamed from: a */
    protected final AbstractC21924l<zzao> f53333a = new C21931s(this);

    /* renamed from: b */
    private final String f53334b;

    public C21930r(Context context, Looper looper, AbstractC21631d.AbstractC21633b bVar, AbstractC21631d.AbstractC21634c cVar, String str, C21740c cVar2) {
        super(context, looper, 23, cVar2, bVar, cVar);
        this.f53334b = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new zzap(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f53334b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.C21611a.AbstractC21622f, com.google.android.gms.common.internal.AbstractC21745f
    public int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
