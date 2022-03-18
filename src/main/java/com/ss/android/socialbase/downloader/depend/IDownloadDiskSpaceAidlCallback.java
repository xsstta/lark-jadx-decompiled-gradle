package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDownloadDiskSpaceAidlCallback extends IInterface {

    public static class Default implements IDownloadDiskSpaceAidlCallback {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback
        public void onDiskCleaned() throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadDiskSpaceAidlCallback {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadDiskSpaceAidlCallback {
            public static IDownloadDiskSpaceAidlCallback sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback
            public void onDiskCleaned() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onDiskCleaned();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public static IDownloadDiskSpaceAidlCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
        }

        public static boolean setDefaultImpl(IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) {
            if (Proxy.sDefaultImpl != null || iDownloadDiskSpaceAidlCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadDiskSpaceAidlCallback;
            return true;
        }

        public static IDownloadDiskSpaceAidlCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadDiskSpaceAidlCallback)) {
                return new Proxy(iBinder);
            }
            return (IDownloadDiskSpaceAidlCallback) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                onDiskCleaned();
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback");
                return true;
            }
        }
    }

    void onDiskCleaned() throws RemoteException;
}
