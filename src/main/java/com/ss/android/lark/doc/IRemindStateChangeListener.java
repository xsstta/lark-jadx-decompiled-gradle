package com.ss.android.lark.doc;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IRemindStateChangeListener extends IInterface {

    public static class Default implements IRemindStateChangeListener {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.lark.doc.IRemindStateChangeListener
        public void onChange(String str, boolean z) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IRemindStateChangeListener {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IRemindStateChangeListener {
            public static IRemindStateChangeListener sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.lark.doc.IRemindStateChangeListener";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.lark.doc.IRemindStateChangeListener
            public void onChange(String str, boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.lark.doc.IRemindStateChangeListener");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(1, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onChange(str, z);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static IRemindStateChangeListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.lark.doc.IRemindStateChangeListener");
        }

        public static boolean setDefaultImpl(IRemindStateChangeListener iRemindStateChangeListener) {
            if (Proxy.sDefaultImpl != null || iRemindStateChangeListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemindStateChangeListener;
            return true;
        }

        public static IRemindStateChangeListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.lark.doc.IRemindStateChangeListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IRemindStateChangeListener)) {
                return new Proxy(iBinder);
            }
            return (IRemindStateChangeListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.lark.doc.IRemindStateChangeListener");
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                onChange(readString, z);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.lark.doc.IRemindStateChangeListener");
                return true;
            }
        }
    }

    void onChange(String str, boolean z) throws RemoteException;
}
