package com.huawei.easygo.callback;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IEasyGoCallback extends IInterface {

    public static abstract class Stub extends Binder implements IEasyGoCallback {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IEasyGoCallback {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.huawei.easygo.callback.IEasyGoCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.huawei.easygo.callback.IEasyGoCallback
            public void callback(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.easygo.callback.IEasyGoCallback");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.huawei.easygo.callback.IEasyGoCallback");
        }

        public static IEasyGoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.huawei.easygo.callback.IEasyGoCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IEasyGoCallback)) {
                return new Proxy(iBinder);
            }
            return (IEasyGoCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.huawei.easygo.callback.IEasyGoCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                callback(readInt, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.huawei.easygo.callback.IEasyGoCallback");
                return true;
            }
        }
    }

    void callback(int i, Bundle bundle) throws RemoteException;
}
