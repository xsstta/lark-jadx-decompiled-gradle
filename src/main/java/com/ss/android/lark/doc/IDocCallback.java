package com.ss.android.lark.doc;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDocCallback extends IInterface {

    public static class Default implements IDocCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.doc.IDocCallback
        public Bundle doCommand(Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.lark.doc.IDocCallback
        public void sendEvent(String str, String str2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDocCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDocCallback {
            public static IDocCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.doc.IDocCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.doc.IDocCallback
            public Bundle doCommand(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IDocCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().doCommand(bundle);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IDocCallback
            public void sendEvent(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IDocCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().sendEvent(str, str2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IDocCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.doc.IDocCallback");
        }

        public static boolean setDefaultImpl(IDocCallback iDocCallback) {
            if (Proxy.sDefaultImpl != null || iDocCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDocCallback;
            return true;
        }

        public static IDocCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.doc.IDocCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDocCallback)) {
                return new Proxy(iBinder);
            }
            return (IDocCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.doc.IDocCallback");
                sendEvent(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.lark.doc.IDocCallback");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                Bundle doCommand = doCommand(bundle);
                parcel2.writeNoException();
                if (doCommand != null) {
                    parcel2.writeInt(1);
                    doCommand.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.doc.IDocCallback");
                return true;
            }
        }
    }

    Bundle doCommand(Bundle bundle) throws RemoteException;

    void sendEvent(String str, String str2) throws RemoteException;
}
