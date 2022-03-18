package com.ss.android.lark.browser.impl.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class IBrowserP0ProxyStub extends Binder implements IInterface, IBrowserP0Proxy {
    public final BrowserP0ProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void clearWebViewCache() {
        this.base.clearWebViewCache();
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void syncCookieOnLocaleChange() {
        this.base.syncCookieOnLocaleChange();
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void warmUp() {
        this.base.warmUp();
    }

    public IBrowserP0ProxyStub(Context context) {
        this.base = new BrowserP0ProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
    }

    @Override // com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy
    public void syncCookieOnAccountChange(boolean z, boolean z2) {
        this.base.syncCookieOnAccountChange(z, z2);
    }

    public static IBrowserP0ProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IBrowserP0ProxyProxy)) {
            return new IBrowserP0ProxyProxy(context, iBinder);
        }
        return (IBrowserP0ProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
            warmUp();
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            syncCookieOnAccountChange(z, z2);
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
            syncCookieOnLocaleChange();
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
            clearWebViewCache();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.browser.impl.manis.IBrowserP0Proxy");
            return true;
        }
    }
}
