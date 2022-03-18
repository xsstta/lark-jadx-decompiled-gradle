package com.ss.android.lark.doc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IPutRemindCallback extends IInterface {

    public static class Default implements IPutRemindCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.doc.IPutRemindCallback
        public void onFaile(int i) throws RemoteException {
        }

        @Override // com.ss.android.lark.doc.IPutRemindCallback
        public void onSuccess(String str) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IPutRemindCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IPutRemindCallback {
            public static IPutRemindCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.doc.IPutRemindCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.doc.IPutRemindCallback
            public void onFaile(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IPutRemindCallback");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFaile(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IPutRemindCallback
            public void onSuccess(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IPutRemindCallback");
                    obtain.writeString(str);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IPutRemindCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.doc.IPutRemindCallback");
        }

        public static boolean setDefaultImpl(IPutRemindCallback iPutRemindCallback) {
            if (Proxy.sDefaultImpl != null || iPutRemindCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iPutRemindCallback;
            return true;
        }

        public static IPutRemindCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.doc.IPutRemindCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IPutRemindCallback)) {
                return new Proxy(iBinder);
            }
            return (IPutRemindCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.doc.IPutRemindCallback");
                onSuccess(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.lark.doc.IPutRemindCallback");
                onFaile(parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.doc.IPutRemindCallback");
                return true;
            }
        }
    }

    void onFaile(int i) throws RemoteException;

    void onSuccess(String str) throws RemoteException;
}
