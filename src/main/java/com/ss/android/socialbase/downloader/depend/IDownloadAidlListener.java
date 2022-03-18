package com.ss.android.socialbase.downloader.depend;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

public interface IDownloadAidlListener extends IInterface {

    public static class Default implements IDownloadAidlListener {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public int getOriginHashCode() throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onCanceled(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onFirstStart(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onFirstSuccess(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onPause(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onPrepare(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onProgress(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onRetry(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onStart(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onSuccessed(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
        public void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadAidlListener {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadAidlListener {
            public static IDownloadAidlListener sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public int getOriginHashCode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getOriginHashCode();
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onCanceled(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(8, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onCanceled(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onFirstStart(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFirstStart(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onFirstSuccess(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFirstSuccess(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onPause(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onPause(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onPrepare(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onPrepare(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onProgress(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onProgress(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onStart(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onStart(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onSuccessed(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onSuccessed(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onWaitingDownloadCompleteHandler(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onFailed(downloadInfo, baseException);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onRetry(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onRetry(downloadInfo, baseException);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
            public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (baseException != null) {
                        obtain.writeInt(1);
                        baseException.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().onRetryDelay(downloadInfo, baseException);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IDownloadAidlListener getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
        }

        public static boolean setDefaultImpl(IDownloadAidlListener iDownloadAidlListener) {
            if (Proxy.sDefaultImpl != null || iDownloadAidlListener == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadAidlListener;
            return true;
        }

        public static IDownloadAidlListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadAidlListener)) {
                return new Proxy(iBinder);
            }
            return (IDownloadAidlListener) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            DownloadInfo downloadInfo;
            DownloadInfo downloadInfo2;
            DownloadInfo downloadInfo3;
            if (i != 1598968902) {
                DownloadInfo downloadInfo4 = null;
                DownloadInfo downloadInfo5 = null;
                BaseException baseException = null;
                BaseException baseException2 = null;
                DownloadInfo downloadInfo6 = null;
                DownloadInfo downloadInfo7 = null;
                DownloadInfo downloadInfo8 = null;
                BaseException baseException3 = null;
                DownloadInfo downloadInfo9 = null;
                DownloadInfo downloadInfo10 = null;
                DownloadInfo downloadInfo11 = null;
                DownloadInfo downloadInfo12 = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        int originHashCode = getOriginHashCode();
                        parcel2.writeNoException();
                        parcel2.writeInt(originHashCode);
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo4 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onPrepare(downloadInfo4);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo12 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onStart(downloadInfo12);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo11 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onProgress(downloadInfo11);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo10 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onPause(downloadInfo10);
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo9 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onSuccessed(downloadInfo9);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException3 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        onFailed(downloadInfo, baseException3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo8 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onCanceled(downloadInfo8);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo7 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onFirstStart(downloadInfo7);
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo6 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onFirstSuccess(downloadInfo6);
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo2 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException2 = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        onRetry(downloadInfo2, baseException2);
                        parcel2.writeNoException();
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo3 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        } else {
                            downloadInfo3 = null;
                        }
                        if (parcel.readInt() != 0) {
                            baseException = BaseException.CREATOR.createFromParcel(parcel);
                        }
                        onRetryDelay(downloadInfo3, baseException);
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                        if (parcel.readInt() != 0) {
                            downloadInfo5 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        onWaitingDownloadCompleteHandler(downloadInfo5);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.depend.IDownloadAidlListener");
                return true;
            }
        }
    }

    int getOriginHashCode() throws RemoteException;

    void onCanceled(DownloadInfo downloadInfo) throws RemoteException;

    void onFailed(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void onFirstStart(DownloadInfo downloadInfo) throws RemoteException;

    void onFirstSuccess(DownloadInfo downloadInfo) throws RemoteException;

    void onPause(DownloadInfo downloadInfo) throws RemoteException;

    void onPrepare(DownloadInfo downloadInfo) throws RemoteException;

    void onProgress(DownloadInfo downloadInfo) throws RemoteException;

    void onRetry(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) throws RemoteException;

    void onStart(DownloadInfo downloadInfo) throws RemoteException;

    void onSuccessed(DownloadInfo downloadInfo) throws RemoteException;

    void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) throws RemoteException;
}
