package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class bn extends C22640i implements bp {
    bn(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: a */
    public final void mo78888a(String str, int i, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeInt(i);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(4, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: a */
    public final void mo78889a(String str, int i, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeInt(i);
        ch.m82408a(a, brVar);
        mo78944a(5, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: a */
    public final void mo78890a(String str, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        ch.m82408a(a, brVar);
        mo78944a(6, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: a */
    public final void mo78891a(String str, List<Bundle> list, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(2, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: b */
    public final void mo78892b(String str, List<Bundle> list, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(7, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: c */
    public final void mo78893c(String str, List<Bundle> list, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(8, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: d */
    public final void mo78894d(String str, List<Bundle> list, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(13, a);
    }

    @Override // com.google.android.play.core.internal.bp
    /* renamed from: e */
    public final void mo78895e(String str, List<Bundle> list, Bundle bundle, br brVar) throws RemoteException {
        Parcel a = mo78943a();
        a.writeString(str);
        a.writeTypedList(list);
        ch.m82409a(a, bundle);
        ch.m82408a(a, brVar);
        mo78944a(14, a);
    }
}
