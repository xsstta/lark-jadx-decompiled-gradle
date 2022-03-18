package com.bytedance.dr;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface OpenDeviceIdentifierService extends IInterface {

    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements OpenDeviceIdentifierService {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.dr.OpenDeviceIdentifierService
            public String getOaid() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.OpenDeviceIdentifierService
            public boolean isOaidTrackLimited() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    boolean z = false;
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        public static OpenDeviceIdentifierService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof OpenDeviceIdentifierService)) {
                return new Proxy(iBinder);
            }
            return (OpenDeviceIdentifierService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                parcel2.writeNoException();
                parcel2.writeString(oaid);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean isOaidTrackLimited = isOaidTrackLimited();
                parcel2.writeNoException();
                parcel2.writeInt(isOaidTrackLimited ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return true;
            }
        }
    }

    String getOaid() throws RemoteException;

    boolean isOaidTrackLimited() throws RemoteException;
}
