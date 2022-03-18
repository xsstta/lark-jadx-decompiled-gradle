package com.ss.android.lark.multitask.task;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface RemoteFloatingWindowInterface extends IInterface {

    public static class Default implements RemoteFloatingWindowInterface {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface
        public void call() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements RemoteFloatingWindowInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements RemoteFloatingWindowInterface {
            public static RemoteFloatingWindowInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface
            public void call() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface");
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().call();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public static RemoteFloatingWindowInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface");
        }

        public static boolean setDefaultImpl(RemoteFloatingWindowInterface remoteFloatingWindowInterface) {
            if (Proxy.sDefaultImpl != null || remoteFloatingWindowInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = remoteFloatingWindowInterface;
            return true;
        }

        public static RemoteFloatingWindowInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof RemoteFloatingWindowInterface)) {
                return new Proxy(iBinder);
            }
            return (RemoteFloatingWindowInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface");
                call();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface");
                return true;
            }
        }
    }

    void call() throws RemoteException;
}
