package com.ss.android.socialbase.downloader.model;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.socialbase.downloader.depend.IChunkCntAidlCalculator;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlInterceptor;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadDiskSpaceAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadForbiddenAidlHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.depend.IRetryDelayTimeAidlCalculator;

public interface DownloadAidlTask extends IInterface {

    public static class Default implements DownloadAidlTask {
        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IChunkCntAidlCalculator getChunkStrategy() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlDepend getDepend() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadDiskSpaceAidlHandler getDiskSpaceHandler() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadCompleteAidlHandler getDownloadCompleteAidlHandler() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public DownloadInfo getDownloadInfo() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlListener getDownloadListenerByIndex(int i, int i2) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public int getDownloadListenerSize(int i) throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlFileProvider getFileProvider() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadForbiddenAidlHandler getForbiddenHandler() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlInterceptor getInterceptor() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlMonitorDepend getMonitorDepend() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public INotificationClickAidlCallback getNotificationClickCallback() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IRetryDelayTimeAidlCalculator getRetryDelayTimeCalculator() throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
        public IDownloadAidlListener getSingleDownloadListener(int i) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements DownloadAidlTask {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements DownloadAidlTask {
            public static DownloadAidlTask sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.model.DownloadAidlTask";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IChunkCntAidlCalculator getChunkStrategy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getChunkStrategy();
                    }
                    obtain2.readException();
                    IChunkCntAidlCalculator asInterface = IChunkCntAidlCalculator.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlDepend getDepend() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDepend();
                    }
                    obtain2.readException();
                    IDownloadAidlDepend asInterface = IDownloadAidlDepend.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadDiskSpaceAidlHandler getDiskSpaceHandler() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDiskSpaceHandler();
                    }
                    obtain2.readException();
                    IDownloadDiskSpaceAidlHandler asInterface = IDownloadDiskSpaceAidlHandler.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadCompleteAidlHandler getDownloadCompleteAidlHandler() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadCompleteAidlHandler();
                    }
                    obtain2.readException();
                    IDownloadCompleteAidlHandler asInterface = IDownloadCompleteAidlHandler.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public DownloadInfo getDownloadInfo() throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadInfo();
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        downloadInfo = DownloadInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        downloadInfo = null;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return downloadInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadNotificationEventListener();
                    }
                    obtain2.readException();
                    IDownloadNotificationEventAidlListener asInterface = IDownloadNotificationEventAidlListener.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlFileProvider getFileProvider() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getFileProvider();
                    }
                    obtain2.readException();
                    IDownloadAidlFileProvider asInterface = IDownloadAidlFileProvider.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadForbiddenAidlHandler getForbiddenHandler() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getForbiddenHandler();
                    }
                    obtain2.readException();
                    IDownloadForbiddenAidlHandler asInterface = IDownloadForbiddenAidlHandler.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlInterceptor getInterceptor() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getInterceptor();
                    }
                    obtain2.readException();
                    IDownloadAidlInterceptor asInterface = IDownloadAidlInterceptor.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlMonitorDepend getMonitorDepend() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getMonitorDepend();
                    }
                    obtain2.readException();
                    IDownloadAidlMonitorDepend asInterface = IDownloadAidlMonitorDepend.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public INotificationClickAidlCallback getNotificationClickCallback() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotificationClickCallback();
                    }
                    obtain2.readException();
                    INotificationClickAidlCallback asInterface = INotificationClickAidlCallback.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IRetryDelayTimeAidlCalculator getRetryDelayTimeCalculator() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getRetryDelayTimeCalculator();
                    }
                    obtain2.readException();
                    IRetryDelayTimeAidlCalculator asInterface = IRetryDelayTimeAidlCalculator.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public int getDownloadListenerSize(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadListenerSize(i);
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

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlListener getSingleDownloadListener(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSingleDownloadListener(i);
                    }
                    obtain2.readException();
                    IDownloadAidlListener asInterface = IDownloadAidlListener.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.model.DownloadAidlTask
            public IDownloadAidlListener getDownloadListenerByIndex(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadListenerByIndex(i, i2);
                    }
                    obtain2.readException();
                    IDownloadAidlListener asInterface = IDownloadAidlListener.Stub.asInterface(obtain2.readStrongBinder());
                    obtain2.recycle();
                    obtain.recycle();
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static DownloadAidlTask getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.model.DownloadAidlTask");
        }

        public static boolean setDefaultImpl(DownloadAidlTask downloadAidlTask) {
            if (Proxy.sDefaultImpl != null || downloadAidlTask == null) {
                return false;
            }
            Proxy.sDefaultImpl = downloadAidlTask;
            return true;
        }

        public static DownloadAidlTask asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof DownloadAidlTask)) {
                return new Proxy(iBinder);
            }
            return (DownloadAidlTask) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                IBinder iBinder = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        DownloadInfo downloadInfo = getDownloadInfo();
                        parcel2.writeNoException();
                        if (downloadInfo != null) {
                            parcel2.writeInt(1);
                            downloadInfo.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IChunkCntAidlCalculator chunkStrategy = getChunkStrategy();
                        parcel2.writeNoException();
                        if (chunkStrategy != null) {
                            iBinder = chunkStrategy.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        int downloadListenerSize = getDownloadListenerSize(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(downloadListenerSize);
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlListener downloadListenerByIndex = getDownloadListenerByIndex(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (downloadListenerByIndex != null) {
                            iBinder = downloadListenerByIndex.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlListener singleDownloadListener = getSingleDownloadListener(parcel.readInt());
                        parcel2.writeNoException();
                        if (singleDownloadListener != null) {
                            iBinder = singleDownloadListener.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadNotificationEventAidlListener downloadNotificationEventListener = getDownloadNotificationEventListener();
                        parcel2.writeNoException();
                        if (downloadNotificationEventListener != null) {
                            iBinder = downloadNotificationEventListener.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        INotificationClickAidlCallback notificationClickCallback = getNotificationClickCallback();
                        parcel2.writeNoException();
                        if (notificationClickCallback != null) {
                            iBinder = notificationClickCallback.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlInterceptor interceptor = getInterceptor();
                        parcel2.writeNoException();
                        if (interceptor != null) {
                            iBinder = interceptor.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlDepend depend = getDepend();
                        parcel2.writeNoException();
                        if (depend != null) {
                            iBinder = depend.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadForbiddenAidlHandler forbiddenHandler = getForbiddenHandler();
                        parcel2.writeNoException();
                        if (forbiddenHandler != null) {
                            iBinder = forbiddenHandler.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IRetryDelayTimeAidlCalculator retryDelayTimeCalculator = getRetryDelayTimeCalculator();
                        parcel2.writeNoException();
                        if (retryDelayTimeCalculator != null) {
                            iBinder = retryDelayTimeCalculator.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadDiskSpaceAidlHandler diskSpaceHandler = getDiskSpaceHandler();
                        parcel2.writeNoException();
                        if (diskSpaceHandler != null) {
                            iBinder = diskSpaceHandler.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlMonitorDepend monitorDepend = getMonitorDepend();
                        parcel2.writeNoException();
                        if (monitorDepend != null) {
                            iBinder = monitorDepend.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadAidlFileProvider fileProvider = getFileProvider();
                        parcel2.writeNoException();
                        if (fileProvider != null) {
                            iBinder = fileProvider.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                        IDownloadCompleteAidlHandler downloadCompleteAidlHandler = getDownloadCompleteAidlHandler();
                        parcel2.writeNoException();
                        if (downloadCompleteAidlHandler != null) {
                            iBinder = downloadCompleteAidlHandler.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.model.DownloadAidlTask");
                return true;
            }
        }
    }

    IChunkCntAidlCalculator getChunkStrategy() throws RemoteException;

    IDownloadAidlDepend getDepend() throws RemoteException;

    IDownloadDiskSpaceAidlHandler getDiskSpaceHandler() throws RemoteException;

    IDownloadCompleteAidlHandler getDownloadCompleteAidlHandler() throws RemoteException;

    DownloadInfo getDownloadInfo() throws RemoteException;

    IDownloadAidlListener getDownloadListenerByIndex(int i, int i2) throws RemoteException;

    int getDownloadListenerSize(int i) throws RemoteException;

    IDownloadNotificationEventAidlListener getDownloadNotificationEventListener() throws RemoteException;

    IDownloadAidlFileProvider getFileProvider() throws RemoteException;

    IDownloadForbiddenAidlHandler getForbiddenHandler() throws RemoteException;

    IDownloadAidlInterceptor getInterceptor() throws RemoteException;

    IDownloadAidlMonitorDepend getMonitorDepend() throws RemoteException;

    INotificationClickAidlCallback getNotificationClickCallback() throws RemoteException;

    IRetryDelayTimeAidlCalculator getRetryDelayTimeCalculator() throws RemoteException;

    IDownloadAidlListener getSingleDownloadListener(int i) throws RemoteException;
}
