package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ProcessAidlCallback extends IInterface {

    public static class Default implements ProcessAidlCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.ProcessAidlCallback
        public void callback(int i, int i2) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ProcessAidlCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements ProcessAidlCallback {
            public static ProcessAidlCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.ProcessAidlCallback
            public void callback(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().callback(i, i2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static ProcessAidlCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
        }

        public static boolean setDefaultImpl(ProcessAidlCallback processAidlCallback) {
            if (Proxy.sDefaultImpl != null || processAidlCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = processAidlCallback;
            return true;
        }

        public static ProcessAidlCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ProcessAidlCallback)) {
                return new Proxy(iBinder);
            }
            return (ProcessAidlCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                callback(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.ProcessAidlCallback");
                return true;
            }
        }
    }

    void callback(int i, int i2) throws RemoteException;
}
