package com.bytedance.ee.bear.service.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IFlow extends IInterface {

    public static abstract class Stub extends Binder implements IFlow {
        private final String mTag;

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IFlow {
            private IBinder mRemote;
            private String mTag;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.getDescriptor(this.mTag);
            }

            @Override // com.bytedance.ee.bear.service.remote.IFlow
            public void subscribe(RemoteConsumer remoteConsumer) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.getDescriptor(this.mTag));
                    if (remoteConsumer != null) {
                        obtain.writeInt(1);
                        remoteConsumer.writeToParcel(obtain, 0);
                    }
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder, String str) {
                this.mRemote = iBinder;
                this.mTag = str;
            }
        }

        public Stub(String str) {
            this.mTag = str;
            attachInterface(this, getDescriptor(str));
        }

        static String getDescriptor(String str) {
            return "com.bytedance.ee.bear.service.remote.IFlow." + str;
        }

        public static IFlow asInterface(IBinder iBinder, String str) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(getDescriptor(str));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IFlow)) {
                return new Proxy(iBinder, str);
            }
            return (IFlow) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(getDescriptor(this.mTag));
                RemoteConsumer remoteConsumer = null;
                if (parcel.readInt() != 0) {
                    remoteConsumer = RemoteConsumer.CREATOR.createFromParcel(parcel);
                }
                subscribe(remoteConsumer);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(getDescriptor(this.mTag));
                return true;
            }
        }
    }

    void subscribe(RemoteConsumer remoteConsumer) throws RemoteException;
}
