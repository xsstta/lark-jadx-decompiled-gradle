package com.ss.android.vcxp.binder;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface XBinder extends IInterface {

    public static class Default implements XBinder {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.vcxp.binder.XBinder
        public Bundle execute(Bundle bundle) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements XBinder {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements XBinder {
            public static XBinder sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.vcxp.binder.XBinder";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.vcxp.binder.XBinder
            public Bundle execute(Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.vcxp.binder.XBinder");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().execute(bundle);
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
        }

        public static XBinder getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.vcxp.binder.XBinder");
        }

        public static XBinder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.vcxp.binder.XBinder");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof XBinder)) {
                return new Proxy(iBinder);
            }
            return (XBinder) queryLocalInterface;
        }

        public static boolean setDefaultImpl(XBinder xBinder) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (xBinder == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = xBinder;
                return true;
            }
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.vcxp.binder.XBinder");
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                } else {
                    bundle = null;
                }
                Bundle execute = execute(bundle);
                parcel2.writeNoException();
                if (execute != null) {
                    parcel2.writeInt(1);
                    execute.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.vcxp.binder.XBinder");
                return true;
            }
        }
    }

    Bundle execute(Bundle bundle) throws RemoteException;
}
