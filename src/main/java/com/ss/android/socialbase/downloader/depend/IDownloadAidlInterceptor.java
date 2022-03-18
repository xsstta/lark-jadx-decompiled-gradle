package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDownloadAidlInterceptor extends IInterface {

    public static class Default implements IDownloadAidlInterceptor {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor
        public boolean intercept() throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDownloadAidlInterceptor {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadAidlInterceptor {
            public static IDownloadAidlInterceptor sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor
            public boolean intercept() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                    boolean z = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().intercept();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        public static IDownloadAidlInterceptor getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
        }

        public static boolean setDefaultImpl(IDownloadAidlInterceptor iDownloadAidlInterceptor) {
            if (Proxy.sDefaultImpl != null || iDownloadAidlInterceptor == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadAidlInterceptor;
            return true;
        }

        public static IDownloadAidlInterceptor asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadAidlInterceptor)) {
                return new Proxy(iBinder);
            }
            return (IDownloadAidlInterceptor) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                boolean intercept = intercept();
                parcel2.writeNoException();
                parcel2.writeInt(intercept ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor");
                return true;
            }
        }
    }

    boolean intercept() throws RemoteException;
}
