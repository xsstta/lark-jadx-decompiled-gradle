package com.miui.easygo.callback;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IEasyGoCallback extends IInterface {

    public static class Default implements IEasyGoCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.miui.easygo.callback.IEasyGoCallback
        public void callback(int i, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IEasyGoCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IEasyGoCallback {
            public static IEasyGoCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.miui.easygo.callback.IEasyGoCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.miui.easygo.callback.IEasyGoCallback
            public void callback(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.miui.easygo.callback.IEasyGoCallback");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            bundle.readFromParcel(obtain2);
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().callback(i, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IEasyGoCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.miui.easygo.callback.IEasyGoCallback");
        }

        public static IEasyGoCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.miui.easygo.callback.IEasyGoCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IEasyGoCallback)) {
                return new Proxy(iBinder);
            }
            return (IEasyGoCallback) queryLocalInterface;
        }

        public static boolean setDefaultImpl(IEasyGoCallback iEasyGoCallback) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iEasyGoCallback == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iEasyGoCallback;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.miui.easygo.callback.IEasyGoCallback");
                int readInt = parcel.readInt();
                Bundle bundle = new Bundle();
                callback(readInt, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.miui.easygo.callback.IEasyGoCallback");
                return true;
            }
        }
    }

    void callback(int i, Bundle bundle) throws RemoteException;
}
