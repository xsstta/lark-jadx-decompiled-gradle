package com.ss.android.lark.multitask.task;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface MainTaskChangeCallback extends IInterface {

    public static class Default implements MainTaskChangeCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.multitask.task.MainTaskChangeCallback
        public void onTaskListChanged(List<String> list) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements MainTaskChangeCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements MainTaskChangeCallback {
            public static MainTaskChangeCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask.task.MainTaskChangeCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.multitask.task.MainTaskChangeCallback
            public void onTaskListChanged(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MainTaskChangeCallback");
                    obtain.writeStringList(list);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onTaskListChanged(list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static MainTaskChangeCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask.task.MainTaskChangeCallback");
        }

        public static boolean setDefaultImpl(MainTaskChangeCallback mainTaskChangeCallback) {
            if (Proxy.sDefaultImpl != null || mainTaskChangeCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = mainTaskChangeCallback;
            return true;
        }

        public static MainTaskChangeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask.task.MainTaskChangeCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MainTaskChangeCallback)) {
                return new Proxy(iBinder);
            }
            return (MainTaskChangeCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.multitask.task.MainTaskChangeCallback");
                onTaskListChanged(parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.multitask.task.MainTaskChangeCallback");
                return true;
            }
        }
    }

    void onTaskListChanged(List<String> list) throws RemoteException;
}
