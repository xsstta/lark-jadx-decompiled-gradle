package com.ss.android.lark.doc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IFetchRemindCallback extends IInterface {

    public static class Default implements IFetchRemindCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.doc.IFetchRemindCallback
        public void onFaile(int i) throws RemoteException {
        }

        @Override // com.ss.android.lark.doc.IFetchRemindCallback
        public void onSuccess(String str, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IFetchRemindCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IFetchRemindCallback {
            public static IFetchRemindCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.doc.IFetchRemindCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.doc.IFetchRemindCallback
            public void onFaile(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IFetchRemindCallback");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onFaile(i);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IFetchRemindCallback
            public void onSuccess(String str, boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IFetchRemindCallback");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onSuccess(str, z);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IFetchRemindCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.doc.IFetchRemindCallback");
        }

        public static boolean setDefaultImpl(IFetchRemindCallback iFetchRemindCallback) {
            if (Proxy.sDefaultImpl != null || iFetchRemindCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iFetchRemindCallback;
            return true;
        }

        public static IFetchRemindCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.doc.IFetchRemindCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFetchRemindCallback)) {
                return new Proxy(iBinder);
            }
            return (IFetchRemindCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.doc.IFetchRemindCallback");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                onSuccess(readString, z);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.lark.doc.IFetchRemindCallback");
                onFaile(parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.doc.IFetchRemindCallback");
                return true;
            }
        }
    }

    void onFaile(int i) throws RemoteException;

    void onSuccess(String str, boolean z) throws RemoteException;
}
