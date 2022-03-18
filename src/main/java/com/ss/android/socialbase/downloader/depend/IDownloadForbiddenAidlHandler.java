package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlCallback;

public interface IDownloadForbiddenAidlHandler extends IInterface {

    public static class Default implements IDownloadForbiddenAidlHandler {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler
        public boolean onForbidden(IDownloadForbiddenAidlCallback iDownloadForbiddenAidlCallback) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDownloadForbiddenAidlHandler {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadForbiddenAidlHandler {
            public static IDownloadForbiddenAidlHandler sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler
            public boolean onForbidden(IDownloadForbiddenAidlCallback iDownloadForbiddenAidlCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                    if (iDownloadForbiddenAidlCallback != null) {
                        iBinder = iDownloadForbiddenAidlCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onForbidden(iDownloadForbiddenAidlCallback);
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
        }

        public static IDownloadForbiddenAidlHandler getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
        }

        public static boolean setDefaultImpl(IDownloadForbiddenAidlHandler iDownloadForbiddenAidlHandler) {
            if (Proxy.sDefaultImpl != null || iDownloadForbiddenAidlHandler == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadForbiddenAidlHandler;
            return true;
        }

        public static IDownloadForbiddenAidlHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadForbiddenAidlHandler)) {
                return new Proxy(iBinder);
            }
            return (IDownloadForbiddenAidlHandler) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                boolean onForbidden = onForbidden(IDownloadForbiddenAidlCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(onForbidden ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler");
                return true;
            }
        }
    }

    boolean onForbidden(IDownloadForbiddenAidlCallback iDownloadForbiddenAidlCallback) throws RemoteException;
}
