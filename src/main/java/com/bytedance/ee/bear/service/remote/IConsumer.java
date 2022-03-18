package com.bytedance.ee.bear.service.remote;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IConsumer<T> extends IInterface {

    public static abstract class Stub<T> extends Binder implements IConsumer<T> {
        private String mTag;

        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy<T> implements IConsumer<T> {
            private IBinder mRemote;
            private String mTag;

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.getDescriptor(this.mTag);
            }

            @Override // com.bytedance.ee.bear.service.remote.IConsumer
            public void onError(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.getDescriptor(this.mTag));
                    obtain.writeString(str);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.remote.IConsumer
            public void onResult(T t) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.getDescriptor(this.mTag));
                    if (t != null) {
                        obtain.writeInt(1);
                        new C10962g(obtain).mo41601a((Object) t);
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

            Proxy(IBinder iBinder, String str) {
                this.mTag = str;
                this.mRemote = iBinder;
            }
        }

        public Stub(String str) {
            this.mTag = str;
            attachInterface(this, getDescriptor(str));
        }

        static String getDescriptor(String str) {
            return "com.bytedance.ee.bear.service.remote.IConsumer." + str;
        }

        public static <T> IConsumer<T> asInterface(IBinder iBinder, String str) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(getDescriptor(str));
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IConsumer)) {
                return new Proxy(iBinder, str);
            }
            return (IConsumer) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ee.bear.service.remote.IConsumer$Stub<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(getDescriptor(this.mTag));
                Object obj = null;
                if (parcel.readInt() != 0) {
                    obj = new C10962g(parcel).mo41599a();
                }
                onResult(obj);
                parcel2.writeNoException();
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(getDescriptor(this.mTag));
                onError(parcel.readString());
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

    void onError(String str) throws RemoteException;

    void onResult(T t) throws RemoteException;
}
