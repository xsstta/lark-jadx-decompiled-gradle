package com.bytedance.ee.bear.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.bytedance.ee.bear.service.IInitCallback;
import com.bytedance.ee.bear.service.IRegisterCallback;

public interface ITokenCenter extends IInterface {

    public static abstract class Stub extends Binder implements ITokenCenter {
        public IBinder asBinder() {
            return this;
        }

        private static class Proxy implements ITokenCenter {
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.bytedance.ee.bear.service.ITokenCenter";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public boolean isRegisted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    boolean z = false;
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void notifyInitOver() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void addRegisterCallback(IRegisterCallback iRegisterCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    if (iRegisterCallback != null) {
                        iBinder = iRegisterCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public IBinder getToken(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeString(str);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void notifyInitOneService(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeString(str);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public String queryClassName(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void registerInitCallback(IInitCallback iInitCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    if (iInitCallback != null) {
                        iBinder = iInitCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void remove(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeString(str);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void removeRegisterCall(IRegisterCallback iRegisterCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    if (iRegisterCallback != null) {
                        iBinder = iRegisterCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void removeToken(IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.ee.bear.service.ITokenCenter
            public void register(String str, IBinder iBinder) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.ee.bear.service.ITokenCenter");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.ee.bear.service.ITokenCenter");
        }

        public static ITokenCenter asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.ee.bear.service.ITokenCenter");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ITokenCenter)) {
                return new Proxy(iBinder);
            }
            return (ITokenCenter) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        IBinder token = getToken(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeStrongBinder(token);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        String queryClassName = queryClassName(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        parcel2.writeString(queryClassName);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        registerInitCallback(IInitCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        register(parcel.readString(), parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        removeToken(parcel.readStrongBinder());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        remove(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        boolean isRegisted = isRegisted();
                        parcel2.writeNoException();
                        parcel2.writeInt(isRegisted ? 1 : 0);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        addRegisterCallback(IRegisterCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        removeRegisterCall(IRegisterCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        notifyInitOneService(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.bytedance.ee.bear.service.ITokenCenter");
                        notifyInitOver();
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.bytedance.ee.bear.service.ITokenCenter");
                return true;
            }
        }
    }

    void addRegisterCallback(IRegisterCallback iRegisterCallback) throws RemoteException;

    IBinder getToken(String str) throws RemoteException;

    boolean isRegisted() throws RemoteException;

    void notifyInitOneService(String str) throws RemoteException;

    void notifyInitOver() throws RemoteException;

    String queryClassName(IBinder iBinder) throws RemoteException;

    void register(String str, IBinder iBinder) throws RemoteException;

    void registerInitCallback(IInitCallback iInitCallback) throws RemoteException;

    void remove(String str) throws RemoteException;

    void removeRegisterCall(IRegisterCallback iRegisterCallback) throws RemoteException;

    void removeToken(IBinder iBinder) throws RemoteException;
}
