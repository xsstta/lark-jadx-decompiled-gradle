package com.tt.miniapp.uniquechannel;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDispatcher extends IInterface {

    public static class Default implements IDispatcher {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.tt.miniapp.uniquechannel.IDispatcher
        public void publish(Message message) throws RemoteException {
        }

        @Override // com.tt.miniapp.uniquechannel.IDispatcher
        public void registerListener(IBinder iBinder) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDispatcher {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements IDispatcher {
            private final IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.tt.miniapp.uniquechannel.IDispatcher";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.tt.miniapp.uniquechannel.IDispatcher
            public void publish(Message message) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapp.uniquechannel.IDispatcher");
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

            @Override // com.tt.miniapp.uniquechannel.IDispatcher
            public void registerListener(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tt.miniapp.uniquechannel.IDispatcher");
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.tt.miniapp.uniquechannel.IDispatcher");
        }

        public static IDispatcher asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tt.miniapp.uniquechannel.IDispatcher");
            if (queryLocalInterface instanceof IDispatcher) {
                return (IDispatcher) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Message message;
            if (i == 1) {
                parcel.enforceInterface("com.tt.miniapp.uniquechannel.IDispatcher");
                if (parcel.readInt() != 0) {
                    message = Message.CREATOR.createFromParcel(parcel);
                } else {
                    message = null;
                }
                publish(message);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.tt.miniapp.uniquechannel.IDispatcher");
                registerListener(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.tt.miniapp.uniquechannel.IDispatcher");
                return true;
            }
        }
    }

    void publish(Message message) throws RemoteException;

    void registerListener(IBinder iBinder) throws RemoteException;
}
