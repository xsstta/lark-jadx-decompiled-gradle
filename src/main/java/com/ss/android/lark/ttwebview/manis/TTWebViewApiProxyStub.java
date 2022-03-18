package com.ss.android.lark.ttwebview.manis;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class TTWebViewApiProxyStub extends Binder implements IInterface, TTWebViewApiProxy {
    public final TTWebViewApiProxyImpl base;

    public IBinder asBinder() {
        return this;
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLoadSoVersion() {
        return this.base.getLoadSoVersion();
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public String getLocalSoVersion() {
        return this.base.getLocalSoVersion();
    }

    @Override // com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy
    public void fetchWebViewCore(boolean z) {
        this.base.fetchWebViewCore(z);
    }

    public TTWebViewApiProxyStub(Context context) {
        this.base = new TTWebViewApiProxyImpl(context);
        attachInterface(this, "com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
    }

    public static TTWebViewApiProxyProxy asInterface(Context context, IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof TTWebViewApiProxyProxy)) {
            return new TTWebViewApiProxyProxy(context, iBinder);
        }
        return (TTWebViewApiProxyProxy) queryLocalInterface;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i == 1) {
            parcel.enforceInterface("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            if (parcel.readInt() == 0) {
                z = false;
            } else {
                z = true;
            }
            fetchWebViewCore(z);
            parcel2.writeNoException();
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            String localSoVersion = getLocalSoVersion();
            parcel2.writeNoException();
            parcel2.writeString(localSoVersion);
            return true;
        } else if (i == 3) {
            parcel.enforceInterface("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            String loadSoVersion = getLoadSoVersion();
            parcel2.writeNoException();
            parcel2.writeString(loadSoVersion);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.ss.android.lark.ttwebview.manis.TTWebViewApiProxy");
            return true;
        }
    }
}
