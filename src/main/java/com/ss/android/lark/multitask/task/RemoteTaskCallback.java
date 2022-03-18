package com.ss.android.lark.multitask.task;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface RemoteTaskCallback extends IInterface {

    public static class Default implements RemoteTaskCallback {
        @Override // com.ss.android.lark.multitask.task.RemoteTaskCallback
        public void actionPerformed(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements RemoteTaskCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements RemoteTaskCallback {
            public static RemoteTaskCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask.task.RemoteTaskCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.multitask.task.RemoteTaskCallback
            public void actionPerformed(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.RemoteTaskCallback");
                    if (remoteTaskSnapshot != null) {
                        obtain.writeInt(1);
                        remoteTaskSnapshot.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().actionPerformed(remoteTaskSnapshot);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static RemoteTaskCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask.task.RemoteTaskCallback");
        }

        public static boolean setDefaultImpl(RemoteTaskCallback remoteTaskCallback) {
            if (Proxy.sDefaultImpl != null || remoteTaskCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = remoteTaskCallback;
            return true;
        }

        public static RemoteTaskCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask.task.RemoteTaskCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof RemoteTaskCallback)) {
                return new Proxy(iBinder);
            }
            return (RemoteTaskCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RemoteTaskSnapshot remoteTaskSnapshot;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.multitask.task.RemoteTaskCallback");
                if (parcel.readInt() != 0) {
                    remoteTaskSnapshot = RemoteTaskSnapshot.CREATOR.createFromParcel(parcel);
                } else {
                    remoteTaskSnapshot = null;
                }
                actionPerformed(remoteTaskSnapshot);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.multitask.task.RemoteTaskCallback");
                return true;
            }
        }
    }

    void actionPerformed(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException;
}
