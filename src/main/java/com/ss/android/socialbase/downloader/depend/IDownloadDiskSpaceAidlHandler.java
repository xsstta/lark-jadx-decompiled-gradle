package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlCallback;

public interface IDownloadDiskSpaceAidlHandler extends IInterface {

    public static class Default implements IDownloadDiskSpaceAidlHandler {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler
        public boolean cleanUpDisk(long j, long j2, IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IDownloadDiskSpaceAidlHandler {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadDiskSpaceAidlHandler {
            public static IDownloadDiskSpaceAidlHandler sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler
            public boolean cleanUpDisk(long j, long j2, IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    if (iDownloadDiskSpaceAidlCallback != null) {
                        iBinder = iDownloadDiskSpaceAidlCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cleanUpDisk(j, j2, iDownloadDiskSpaceAidlCallback);
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

        public static IDownloadDiskSpaceAidlHandler getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
        }

        public static boolean setDefaultImpl(IDownloadDiskSpaceAidlHandler iDownloadDiskSpaceAidlHandler) {
            if (Proxy.sDefaultImpl != null || iDownloadDiskSpaceAidlHandler == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadDiskSpaceAidlHandler;
            return true;
        }

        public static IDownloadDiskSpaceAidlHandler asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadDiskSpaceAidlHandler)) {
                return new Proxy(iBinder);
            }
            return (IDownloadDiskSpaceAidlHandler) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                boolean cleanUpDisk = cleanUpDisk(parcel.readLong(), parcel.readLong(), IDownloadDiskSpaceAidlCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(cleanUpDisk ? 1 : 0);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler");
                return true;
            }
        }
    }

    boolean cleanUpDisk(long j, long j2, IDownloadDiskSpaceAidlCallback iDownloadDiskSpaceAidlCallback) throws RemoteException;
}
