package com.tt.miniapphost.process.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.tt.miniapphost.process.data.CrossProcessCallEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public interface IMiniApp2HostBinderInterface extends IInterface {

    public static abstract class Stub extends Binder implements IMiniApp2HostBinderInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IMiniApp2HostBinderInterface {
            private IBinder mRemote;

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface
            public CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) throws RemoteException {
                CrossProcessDataEntity crossProcessDataEntity;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
                    crossProcessCallEntity.writeToParcel(obtain, 0);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 1) {
                        crossProcessDataEntity = CrossProcessDataEntity.CREATOR.createFromParcel(obtain2);
                    } else {
                        crossProcessDataEntity = null;
                    }
                    return crossProcessDataEntity;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface
            public void asyncCall(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
                    crossProcessCallEntity.writeToParcel(obtain, 0);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 1);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
        }

        public static IMiniApp2HostBinderInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
            if (queryLocalInterface instanceof IMiniApp2HostBinderInterface) {
                return (IMiniApp2HostBinderInterface) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
                CrossProcessDataEntity syncCall = syncCall(CrossProcessCallEntity.CREATOR.createFromParcel(parcel));
                parcel2.writeNoException();
                if (syncCall != null) {
                    parcel2.writeInt(1);
                    syncCall.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
                asyncCall(CrossProcessCallEntity.CREATOR.createFromParcel(parcel), parcel.readInt());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapphost.process.base.IMiniApp2HostBinderInterface");
                return true;
            }
        }
    }

    void asyncCall(CrossProcessCallEntity crossProcessCallEntity, int i) throws RemoteException;

    CrossProcessDataEntity syncCall(CrossProcessCallEntity crossProcessCallEntity) throws RemoteException;
}
