package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.i */
public class C22640i implements IInterface {

    /* renamed from: a */
    private final IBinder f56062a;

    /* renamed from: b */
    private final String f56063b;

    protected C22640i(IBinder iBinder, String str) {
        this.f56062a = iBinder;
        this.f56063b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo78943a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f56063b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo78944a(int i, Parcel parcel) throws RemoteException {
        try {
            this.f56062a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f56062a;
    }
}
