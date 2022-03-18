package com.tt.miniapp.uniquechannel;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IProxy extends IInterface {

    public static abstract class Stub extends Binder implements IProxy {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IProxy {
            private final IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapp.uniquechannel.IUChannel";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapp.uniquechannel.IProxy
            public void dispatch(Message message) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapp.uniquechannel.IUChannel");
                    if (message != null) {
                        obtain.writeInt(1);
                        message.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapp.uniquechannel.IUChannel");
        }

        public static IProxy asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapp.uniquechannel.IUChannel");
            if (queryLocalInterface instanceof IProxy) {
                return (IProxy) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Message message;
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapp.uniquechannel.IUChannel");
                if (parcel.readInt() != 0) {
                    message = Message.CREATOR.createFromParcel(parcel);
                } else {
                    message = null;
                }
                dispatch(message);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapp.uniquechannel.IUChannel");
                return true;
            }
        }
    }

    void dispatch(Message message) throws RemoteException;
}
