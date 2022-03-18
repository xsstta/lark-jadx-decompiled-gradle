package com.heytap.openid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IOpenID extends IInterface {

    public static abstract class Stub extends Binder implements IOpenID {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IOpenID {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.heytap.openid.IOpenID";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.heytap.openid.IOpenID
            public String getSerID(String str, String str2, String str3) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.heytap.openid.IOpenID");
        }

        public static IOpenID asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IOpenID)) {
                return new Proxy(iBinder);
            }
            return (IOpenID) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.heytap.openid.IOpenID");
                String serID = getSerID(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(serID);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.heytap.openid.IOpenID");
                return true;
            }
        }
    }

    String getSerID(String str, String str2, String str3) throws RemoteException;
}
