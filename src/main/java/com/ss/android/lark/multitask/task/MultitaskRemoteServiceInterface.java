package com.ss.android.lark.multitask.task;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.multitask.task.MainTaskChangeCallback;
import com.ss.android.lark.multitask.task.RemoteFloatingWindowInterface;
import com.ss.android.lark.multitask.task.RemoteTaskCallback;

public interface MultitaskRemoteServiceInterface extends IInterface {

    public static class Default implements MultitaskRemoteServiceInterface {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void getTaskSnapshotForTaskId(String str, RemoteTaskCallback remoteTaskCallback) throws RemoteException {
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void notifyTaskWillEnterBackground(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException {
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void notifyTaskWillEnterForeground(String str) throws RemoteException {
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void showTaskListAndDoActionIfTaskDeletedByUser(RemoteFloatingWindowInterface remoteFloatingWindowInterface) throws RemoteException {
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void terminateTask(String str) throws RemoteException {
        }

        @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
        public void watchTaskListChange(MainTaskChangeCallback mainTaskChangeCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements MultitaskRemoteServiceInterface {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements MultitaskRemoteServiceInterface {
            public static MultitaskRemoteServiceInterface sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void notifyTaskWillEnterForeground(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                    obtain.writeString(str);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().notifyTaskWillEnterForeground(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void terminateTask(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                    obtain.writeString(str);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().terminateTask(str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void notifyTaskWillEnterBackground(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
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
                    Stub.getDefaultImpl().notifyTaskWillEnterBackground(remoteTaskSnapshot);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void showTaskListAndDoActionIfTaskDeletedByUser(RemoteFloatingWindowInterface remoteFloatingWindowInterface) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                    if (remoteFloatingWindowInterface != null) {
                        iBinder = remoteFloatingWindowInterface.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().showTaskListAndDoActionIfTaskDeletedByUser(remoteFloatingWindowInterface);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void watchTaskListChange(MainTaskChangeCallback mainTaskChangeCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                    if (mainTaskChangeCallback != null) {
                        iBinder = mainTaskChangeCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().watchTaskListChange(mainTaskChangeCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface
            public void getTaskSnapshotForTaskId(String str, RemoteTaskCallback remoteTaskCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                    obtain.writeString(str);
                    if (remoteTaskCallback != null) {
                        iBinder = remoteTaskCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().getTaskSnapshotForTaskId(str, remoteTaskCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static MultitaskRemoteServiceInterface getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
        }

        public static boolean setDefaultImpl(MultitaskRemoteServiceInterface multitaskRemoteServiceInterface) {
            if (Proxy.sDefaultImpl != null || multitaskRemoteServiceInterface == null) {
                return false;
            }
            Proxy.sDefaultImpl = multitaskRemoteServiceInterface;
            return true;
        }

        public static MultitaskRemoteServiceInterface asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MultitaskRemoteServiceInterface)) {
                return new Proxy(iBinder);
            }
            return (MultitaskRemoteServiceInterface) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RemoteTaskSnapshot remoteTaskSnapshot;
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        if (parcel.readInt() != 0) {
                            remoteTaskSnapshot = RemoteTaskSnapshot.CREATOR.createFromParcel(parcel);
                        } else {
                            remoteTaskSnapshot = null;
                        }
                        notifyTaskWillEnterBackground(remoteTaskSnapshot);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        notifyTaskWillEnterForeground(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        terminateTask(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        getTaskSnapshotForTaskId(parcel.readString(), RemoteTaskCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        watchTaskListChange(MainTaskChangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                        showTaskListAndDoActionIfTaskDeletedByUser(RemoteFloatingWindowInterface.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.lark.multitask.task.MultitaskRemoteServiceInterface");
                return true;
            }
        }
    }

    void getTaskSnapshotForTaskId(String str, RemoteTaskCallback remoteTaskCallback) throws RemoteException;

    void notifyTaskWillEnterBackground(RemoteTaskSnapshot remoteTaskSnapshot) throws RemoteException;

    void notifyTaskWillEnterForeground(String str) throws RemoteException;

    void showTaskListAndDoActionIfTaskDeletedByUser(RemoteFloatingWindowInterface remoteFloatingWindowInterface) throws RemoteException;

    void terminateTask(String str) throws RemoteException;

    void watchTaskListChange(MainTaskChangeCallback mainTaskChangeCallback) throws RemoteException;
}
