package com.tt.miniapphost.process.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;

public interface IHost2MiniAppBinderInterface extends IInterface {

    public static abstract class Stub extends Binder implements IHost2MiniAppBinderInterface {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IHost2MiniAppBinderInterface {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface
            public void asyncCallMiniProcess(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface");
                    crossProcessCallEntity.writeToParcel(obtain, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface");
        }

        public static IHost2MiniAppBinderInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface");
            if (queryLocalInterface instanceof IHost2MiniAppBinderInterface) {
                return (IHost2MiniAppBinderInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface");
                asyncCallMiniProcess(CrossProcessCallEntity.CREATOR.createFromParcel(parcel), parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapphost.process.base.IHost2MiniAppBinderInterface");
                return true;
            }
        }
    }

    void asyncCallMiniProcess(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException;
}
