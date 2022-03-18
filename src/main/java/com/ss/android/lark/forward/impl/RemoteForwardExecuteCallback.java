package com.ss.android.lark.forward.impl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface RemoteForwardExecuteCallback extends IInterface {

    public static class Default implements RemoteForwardExecuteCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
        public void onFailedDialog(String str, String str2, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
        public void onFailedToast(String str, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
        public void onSuccess(int i, Intent intent) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements RemoteForwardExecuteCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements RemoteForwardExecuteCallback {
            public static RemoteForwardExecuteCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
            public void onFailedToast(String str, boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    obtain.writeString(str);
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
                    Stub.getDefaultImpl().onFailedToast(str, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
            public void onSuccess(int i, Intent intent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    obtain.writeInt(i);
                    if (intent != null) {
                        obtain.writeInt(1);
                        intent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSuccess(i, intent);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback
            public void onFailedDialog(String str, String str2, boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
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
                    Stub.getDefaultImpl().onFailedDialog(str, str2, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static RemoteForwardExecuteCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
        }

        public static boolean setDefaultImpl(RemoteForwardExecuteCallback remoteForwardExecuteCallback) {
            if (Proxy.sDefaultImpl != null || remoteForwardExecuteCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = remoteForwardExecuteCallback;
            return true;
        }

        public static RemoteForwardExecuteCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof RemoteForwardExecuteCallback)) {
                return new Proxy(iBinder);
            }
            return (RemoteForwardExecuteCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Intent intent;
            if (i != 1) {
                boolean z = false;
                if (i == 2) {
                    parcel.enforceInterface("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    String readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onFailedToast(readString, z);
                    parcel2.writeNoException();
                    return true;
                } else if (i == 3) {
                    parcel.enforceInterface("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    onFailedDialog(readString2, readString3, z);
                    parcel2.writeNoException();
                    return true;
                } else if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel2.writeString("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                    return true;
                }
            } else {
                parcel.enforceInterface("com.ss.android.lark.forward.impl.RemoteForwardExecuteCallback");
                int readInt = parcel.readInt();
                if (parcel.readInt() != 0) {
                    intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
                } else {
                    intent = null;
                }
                onSuccess(readInt, intent);
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void onFailedDialog(String str, String str2, boolean z) throws RemoteException;

    void onFailedToast(String str, boolean z) throws RemoteException;

    void onSuccess(int i, Intent intent) throws RemoteException;
}
