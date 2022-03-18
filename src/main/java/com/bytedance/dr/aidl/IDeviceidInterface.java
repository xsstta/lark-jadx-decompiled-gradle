package com.bytedance.dr.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDeviceidInterface extends IInterface {

    public static abstract class Stub extends Binder implements IDeviceidInterface {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IDeviceidInterface {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.zui.deviceidservice.IDeviceidInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.dr.aidl.IDeviceidInterface
            public String getOAID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDeviceidInterface
            public String getUDID() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDeviceidInterface
            public boolean isSupport() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    boolean z = false;
                    this.mRemote.transact(3, obtain, obtain2, 0);
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

            @Override // com.bytedance.dr.aidl.IDeviceidInterface
            public String getAAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.dr.aidl.IDeviceidInterface
            public String getVAID(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.zui.deviceidservice.IDeviceidInterface");
                    obtain.writeString(str);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.zui.deviceidservice.IDeviceidInterface");
        }

        public static IDeviceidInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.zui.deviceidservice.IDeviceidInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDeviceidInterface)) {
                return new Proxy(iBinder);
            }
            return (IDeviceidInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                String oaid = getOAID();
                parcel2.writeNoException();
                parcel2.writeString(oaid);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                String udid = getUDID();
                parcel2.writeNoException();
                parcel2.writeString(udid);
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                boolean isSupport = isSupport();
                parcel2.writeNoException();
                parcel2.writeInt(isSupport ? 1 : 0);
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                String vaid = getVAID(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(vaid);
                return true;
            } else if (i == 5) {
                parcel.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                String aaid = getAAID(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(aaid);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                return true;
            }
        }
    }

    String getAAID(String str) throws RemoteException;

    String getOAID() throws RemoteException;

    String getUDID() throws RemoteException;

    String getVAID(String str) throws RemoteException;

    boolean isSupport() throws RemoteException;
}
