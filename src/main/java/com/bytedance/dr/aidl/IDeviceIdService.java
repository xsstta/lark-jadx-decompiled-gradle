package com.bytedance.dr.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDeviceIdService extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceIdService {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IDeviceIdService {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.samsung.android.deviceidservice.IDeviceIdService";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.dr.aidl.IDeviceIdService
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.dr.aidl.IDeviceIdService
            public String getAAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDeviceIdService
            public String getVAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.samsung.android.deviceidservice.IDeviceIdService");
        }

        public static IDeviceIdService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.deviceidservice.IDeviceIdService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceIdService)) {
                return new Proxy(iBinder);
            }
            return (IDeviceIdService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String oaid = getOAID();
                parcel2.writeNoException();
                parcel2.writeString(oaid);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String vaid = getVAID(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(vaid);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.samsung.android.deviceidservice.IDeviceIdService");
                String aaid = getAAID(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(aaid);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.samsung.android.deviceidservice.IDeviceIdService");
                return true;
            }
        }
    }

    String getAAID(String str) throws RemoteException;

    String getOAID() throws RemoteException;

    String getVAID(String str) throws RemoteException;
}
