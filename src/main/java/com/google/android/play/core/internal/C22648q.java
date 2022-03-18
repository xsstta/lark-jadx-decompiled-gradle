package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.q */
public final class C22648q extends C22640i implements AbstractC22650s {
    C22648q(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: a */
    public final void mo78950a(String str, Bundle bundle, Bundle bundle2, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        ch.m82408a(a, uVar);
        mo78944a(6, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: a */
    public final void mo78951a(String str, Bundle bundle, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82408a(a, uVar);
        mo78944a(5, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: a */
    public final void mo78952a(String str, List<Bundle> list, Bundle bundle, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, uVar);
        mo78944a(2, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: b */
    public final void mo78953b(String str, Bundle bundle, Bundle bundle2, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        ch.m82408a(a, uVar);
        mo78944a(7, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: b */
    public final void mo78954b(String str, Bundle bundle, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82408a(a, uVar);
        mo78944a(10, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: b */
    public final void mo78955b(String str, List<Bundle> list, Bundle bundle, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, uVar);
        mo78944a(14, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: c */
    public final void mo78956c(String str, Bundle bundle, Bundle bundle2, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        ch.m82408a(a, uVar);
        mo78944a(9, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: c */
    public final void mo78957c(String str, List<Bundle> list, Bundle bundle, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, uVar);
        mo78944a(12, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: d */
    public final void mo78958d(String str, Bundle bundle, Bundle bundle2, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        ch.m82408a(a, uVar);
        mo78944a(11, a);
    }

    @Override // com.google.android.play.core.internal.AbstractC22650s
    /* renamed from: e */
    public final void mo78959e(String str, Bundle bundle, Bundle bundle2, AbstractC22652u uVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82409a(a, bundle);
        ch.m82409a(a, bundle2);
        ch.m82408a(a, uVar);
        mo78944a(13, a);
    }
}
