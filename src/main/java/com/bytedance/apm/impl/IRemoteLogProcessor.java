package com.bytedance.apm.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRemoteLogProcessor extends IInterface {

    public static abstract class Stub extends Binder implements IRemoteLogProcessor {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IRemoteLogProcessor {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.apm.impl.ICrossLogProcessor";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.apm.impl.IRemoteLogProcessor
            public String getSlardarConfig() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.apm.impl.ICrossLogProcessor");
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
        }

        public Stub() {
            attachInterface(this, "com.bytedance.apm.impl.ICrossLogProcessor");
        }

        public static IRemoteLogProcessor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.apm.impl.ICrossLogProcessor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemoteLogProcessor)) {
                return new Proxy(iBinder);
            }
            return (IRemoteLogProcessor) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.apm.impl.ICrossLogProcessor");
                String slardarConfig = getSlardarConfig();
                parcel2.writeNoException();
                parcel2.writeString(slardarConfig);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.bytedance.apm.impl.ICrossLogProcessor");
                return true;
            }
        }
    }

    String getSlardarConfig() throws RemoteException;
}
