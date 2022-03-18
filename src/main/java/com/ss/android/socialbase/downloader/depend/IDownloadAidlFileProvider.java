package com.ss.android.socialbase.downloader.depend;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IDownloadAidlFileProvider extends IInterface {

    public static class Default implements IDownloadAidlFileProvider {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider
        public Uri getUriForFile(String str, String str2) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IDownloadAidlFileProvider {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadAidlFileProvider {
            public static IDownloadAidlFileProvider sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider
            public Uri getUriForFile(String str, String str2) throws RemoteException {
                Uri uri;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUriForFile(str, str2);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        uri = (Uri) Uri.CREATOR.createFromParcel(obtain2);
                    } else {
                        uri = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return uri;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IDownloadAidlFileProvider getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
        }

        public static boolean setDefaultImpl(IDownloadAidlFileProvider iDownloadAidlFileProvider) {
            if (Proxy.sDefaultImpl != null || iDownloadAidlFileProvider == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadAidlFileProvider;
            return true;
        }

        public static IDownloadAidlFileProvider asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadAidlFileProvider)) {
                return new Proxy(iBinder);
            }
            return (IDownloadAidlFileProvider) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                Uri uriForFile = getUriForFile(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                if (uriForFile != null) {
                    parcel2.writeInt(1);
                    uriForFile.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider");
                return true;
            }
        }
    }

    Uri getUriForFile(String str, String str2) throws RemoteException;
}
