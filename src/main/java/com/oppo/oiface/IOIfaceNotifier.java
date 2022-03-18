package com.oppo.oiface;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IOIfaceNotifier extends IInterface {

    public static abstract class Stub extends Binder implements IOIfaceNotifier {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IOIfaceNotifier {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.oppo.oiface.IOIfaceNotifier";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.oppo.oiface.IOIfaceNotifier
            public void onSystemNotify(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.oppo.oiface.IOIfaceNotifier");
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
            attachInterface(this, "com.oppo.oiface.IOIfaceNotifier");
        }

        public static IOIfaceNotifier asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.oppo.oiface.IOIfaceNotifier");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOIfaceNotifier)) {
                return new Proxy(iBinder);
            }
            return (IOIfaceNotifier) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.oppo.oiface.IOIfaceNotifier");
                onSystemNotify(parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.oppo.oiface.IOIfaceNotifier");
                return true;
            }
        }
    }

    void onSystemNotify(String str) throws RemoteException;
}
