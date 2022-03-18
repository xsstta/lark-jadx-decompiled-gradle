package com.bytedance.ee.bear.contract;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IAnnounceSendCallback extends IInterface {

    public static class Default implements IAnnounceSendCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSendFailed() throws RemoteException {
        }

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSendSuccess() throws RemoteException {
        }

        @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
        public void onAnnounceSending() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IAnnounceSendCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IAnnounceSendCallback {
            public static IAnnounceSendCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.contract.IAnnounceSendCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
            public void onAnnounceSendFailed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAnnounceSendFailed();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
            public void onAnnounceSendSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAnnounceSendSuccess();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.contract.IAnnounceSendCallback
            public void onAnnounceSending() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAnnounceSending();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public static IAnnounceSendCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.contract.IAnnounceSendCallback");
        }

        public static boolean setDefaultImpl(IAnnounceSendCallback iAnnounceSendCallback) {
            if (Proxy.sDefaultImpl != null || iAnnounceSendCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAnnounceSendCallback;
            return true;
        }

        public static IAnnounceSendCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IAnnounceSendCallback)) {
                return new Proxy(iBinder);
            }
            return (IAnnounceSendCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                onAnnounceSending();
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                onAnnounceSendSuccess();
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                onAnnounceSendFailed();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.bear.contract.IAnnounceSendCallback");
                return true;
            }
        }
    }

    void onAnnounceSendFailed() throws RemoteException;

    void onAnnounceSendSuccess() throws RemoteException;

    void onAnnounceSending() throws RemoteException;
}
