package com.ss.android.lark.doc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.lark.doc.IFetchRemindCallback;
import com.ss.android.lark.doc.IPutRemindCallback;
import com.ss.android.lark.doc.IRemindStateChangeListener;

public interface IReminder extends IInterface {

    public static class Default implements IReminder {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.doc.IReminder
        public void getRemindState(String str, IFetchRemindCallback iFetchRemindCallback) throws RemoteException {
        }

        @Override // com.ss.android.lark.doc.IReminder
        public void registerRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
        }

        @Override // com.ss.android.lark.doc.IReminder
        public void setRemind(String str, boolean z, IPutRemindCallback iPutRemindCallback) throws RemoteException {
        }

        @Override // com.ss.android.lark.doc.IReminder
        public void unRegisterRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IReminder {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IReminder {
            public static IReminder sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.doc.IReminder";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.doc.IReminder
            public void registerRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IReminder");
                    if (iRemindStateChangeListener != null) {
                        iBinder = iRemindStateChangeListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(3, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().registerRemindListener(iRemindStateChangeListener);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IReminder
            public void unRegisterRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IReminder");
                    if (iRemindStateChangeListener != null) {
                        iBinder = iRemindStateChangeListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(4, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().unRegisterRemindListener(iRemindStateChangeListener);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IReminder
            public void getRemindState(String str, IFetchRemindCallback iFetchRemindCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IReminder");
                    obtain.writeString(str);
                    if (iFetchRemindCallback != null) {
                        iBinder = iFetchRemindCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(2, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().getRemindState(str, iFetchRemindCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.lark.doc.IReminder
            public void setRemind(String str, boolean z, IPutRemindCallback iPutRemindCallback) throws RemoteException {
                int i;
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IReminder");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (iPutRemindCallback != null) {
                        iBinder = iPutRemindCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().setRemind(str, z, iPutRemindCallback);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IReminder getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.doc.IReminder");
        }

        public static boolean setDefaultImpl(IReminder iReminder) {
            if (Proxy.sDefaultImpl != null || iReminder == null) {
                return false;
            }
            Proxy.sDefaultImpl = iReminder;
            return true;
        }

        public static IReminder asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.doc.IReminder");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IReminder)) {
                return new Proxy(iBinder);
            }
            return (IReminder) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.doc.IReminder");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                setRemind(readString, z, IPutRemindCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("com.ss.android.lark.doc.IReminder");
                getRemindState(parcel.readString(), IFetchRemindCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("com.ss.android.lark.doc.IReminder");
                registerRemindListener(IRemindStateChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i == 4) {
                parcel.enforceInterface("com.ss.android.lark.doc.IReminder");
                unRegisterRemindListener(IRemindStateChangeListener.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.doc.IReminder");
                return true;
            }
        }
    }

    void getRemindState(String str, IFetchRemindCallback iFetchRemindCallback) throws RemoteException;

    void registerRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException;

    void setRemind(String str, boolean z, IPutRemindCallback iPutRemindCallback) throws RemoteException;

    void unRegisterRemindListener(IRemindStateChangeListener iRemindStateChangeListener) throws RemoteException;
}
