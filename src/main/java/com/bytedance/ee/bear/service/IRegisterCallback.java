package com.bytedance.ee.bear.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRegisterCallback extends IInterface {

    public static abstract class Stub extends Binder implements IRegisterCallback {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IRegisterCallback {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.service.IRegisterCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.service.IRegisterCallback
            public void onRegistered() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.IRegisterCallback");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.service.IRegisterCallback
            public void onRegisterOneBinder(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.IRegisterCallback");
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.service.IRegisterCallback");
        }

        public static IRegisterCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.service.IRegisterCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRegisterCallback)) {
                return new Proxy(iBinder);
            }
            return (IRegisterCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.service.IRegisterCallback");
                onRegisterOneBinder(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.service.IRegisterCallback");
                onRegistered();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.service.IRegisterCallback");
                return true;
            }
        }
    }

    void onRegisterOneBinder(String str) throws RemoteException;

    void onRegistered() throws RemoteException;
}
