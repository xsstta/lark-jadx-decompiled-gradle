package com.bytedance.ee.bear.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IInitCallback extends IInterface {

    public static abstract class Stub extends Binder implements IInitCallback {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IInitCallback {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.service.IInitCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.service.IInitCallback
            public boolean hasInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.IInitCallback");
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.IInitCallback
            public void onInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.IInitCallback");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.service.IInitCallback");
        }

        public static IInitCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.service.IInitCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IInitCallback)) {
                return new Proxy(iBinder);
            }
            return (IInitCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.service.IInitCallback");
                onInit();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.service.IInitCallback");
                boolean hasInit = hasInit();
                parcel2.writeNoException();
                parcel2.writeInt(hasInit ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.service.IInitCallback");
                return true;
            }
        }
    }

    boolean hasInit() throws RemoteException;

    void onInit() throws RemoteException;
}
