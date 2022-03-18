package com.bytedance.ee.webapp.v2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IWebTabCallbackInterface extends IInterface {

    public static class Default implements IWebTabCallbackInterface {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
        public void onAppAddResult(boolean z) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
        public void onAppCommonResult(boolean z) throws RemoteException {
        }

        @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
        public void onAppRemoveResult(boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IWebTabCallbackInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IWebTabCallbackInterface {
            public static IWebTabCallbackInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.webapp.v2.IWebTabCallbackInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
            public void onAppAddResult(boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAppAddResult(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
            public void onAppCommonResult(boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAppCommonResult(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.webapp.v2.IWebTabCallbackInterface
            public void onAppRemoveResult(boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onAppRemoveResult(z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IWebTabCallbackInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
        }

        public static IWebTabCallbackInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IWebTabCallbackInterface)) {
                return new Proxy(iBinder);
            }
            return (IWebTabCallbackInterface) queryLocalInterface;
        }

        public static boolean setDefaultImpl(IWebTabCallbackInterface iWebTabCallbackInterface) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iWebTabCallbackInterface == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iWebTabCallbackInterface;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z = false;
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onAppAddResult(z);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onAppRemoveResult(z);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                if (parcel.readInt() != 0) {
                    z = true;
                }
                onAppCommonResult(z);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.ee.webapp.v2.IWebTabCallbackInterface");
                return true;
            }
        }
    }

    void onAppAddResult(boolean z) throws RemoteException;

    void onAppCommonResult(boolean z) throws RemoteException;

    void onAppRemoveResult(boolean z) throws RemoteException;
}
