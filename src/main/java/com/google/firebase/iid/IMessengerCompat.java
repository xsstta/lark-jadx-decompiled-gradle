package com.google.firebase.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

interface IMessengerCompat extends IInterface {
    void send(Message message) throws RemoteException;

    public static class Proxy implements IMessengerCompat {
        private final IBinder remote;

        public IBinder asBinder() {
            return this.remote;
        }

        Proxy(IBinder iBinder) {
            this.remote = iBinder;
        }

        @Override // com.google.firebase.iid.IMessengerCompat
        public void send(Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.remote.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    public static class Impl extends Binder implements IMessengerCompat {
        private final Handler handler;

        public IBinder asBinder() {
            return this;
        }

        Impl(Handler handler2) {
            this.handler = handler2;
            attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
        }

        @Override // com.google.firebase.iid.IMessengerCompat
        public void send(Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            this.handler.dispatchMessage(message);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Message message;
            parcel.enforceInterface(getInterfaceDescriptor());
            if (i != 1) {
                return false;
            }
            if (parcel.readInt() != 0) {
                message = (Message) Message.CREATOR.createFromParcel(parcel);
            } else {
                message = null;
            }
            send(message);
            return true;
        }
    }
}
