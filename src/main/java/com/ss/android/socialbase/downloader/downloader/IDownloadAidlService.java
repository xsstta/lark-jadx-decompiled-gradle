package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlFileProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventAidlListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickAidlCallback;
import com.ss.android.socialbase.downloader.depend.ProcessAidlCallback;
import com.ss.android.socialbase.downloader.model.DownloadAidlTask;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.List;

public interface IDownloadAidlService extends IInterface {

    public static class Default implements IDownloadAidlService {
        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void addDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void addDownloadListener1(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z, boolean z2) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void addProcessCallback(ProcessAidlCallback processAidlCallback) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean canResume(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void cancel(int i, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void clearData() throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void clearDownloadData(int i, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void dispatchProcessCallback(int i, int i2) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void forceDownloadIngoreRecommendSize(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public long getCurBytes(int i) throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadChunk> getDownloadChunk(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public IDownloadAidlFileProvider getDownloadFileUriProvider(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public int getDownloadId(String str, String str2) throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public DownloadInfo getDownloadInfo(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public DownloadInfo getDownloadInfoByUrlAndPath(String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public int getDownloadWithIndependentProcessStatus(int i) throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public INotificationClickAidlCallback getNotificationClickCallback(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public int getStatus(int i) throws RemoteException {
            return 0;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean isDownloadCacheSyncSuccess() throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean isDownloading(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean isHttpServiceInit() throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean isServiceForeground() throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void pause(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void pauseAll() throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void removeAllDownloadChunk(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean removeDownloadInfo(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void removeDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean removeDownloadTaskData(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void resetDownloadData(int i, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void restart(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void restartAllFailedDownloadTasks(List<String> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void resume(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean retryDelayStart(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void setDownloadNotificationEventListener(int i, IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void setDownloadWithIndependentProcessStatus(int i, boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void setLogLevel(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void setThrottleNetSpeed(int i, long j) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void startForeground(int i, Notification notification) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void stopForeground(boolean z) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void tryDownload(DownloadAidlTask downloadAidlTask) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void updateDownloadChunk(int i, int i2, long j) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
        public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IDownloadAidlService {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements IDownloadAidlService {
            public static IDownloadAidlService sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void clearData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.mRemote.transact(45, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().clearData();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void pauseAll() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (this.mRemote.transact(7, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().pauseAll();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean isDownloadCacheSyncSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDownloadCacheSyncSuccess();
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean isHttpServiceInit() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isHttpServiceInit();
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean isServiceForeground() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = false;
                    if (!this.mRemote.transact(54, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isServiceForeground();
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void pause(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().pause(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void restart(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().restart(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void resume(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(5, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().resume(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void stopForeground(boolean z) throws RemoteException {
                int i;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (z) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    if (this.mRemote.transact(29, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().stopForeground(z);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(37, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addDownloadChunk(downloadChunk);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void addProcessCallback(ProcessAidlCallback processAidlCallback) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (processAidlCallback != null) {
                        iBinder = processAidlCallback.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(48, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addProcessCallback(processAidlCallback);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean canResume(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().canResume(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void forceDownloadIngoreRecommendSize(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(23, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().forceDownloadIngoreRecommendSize(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public long getCurBytes(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurBytes(i);
                    }
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    obtain2.recycle();
                    obtain.recycle();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadChunk> getDownloadChunk(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(13, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadChunk(i);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadChunk.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public IDownloadAidlFileProvider getDownloadFileUriProvider(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(53, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadFileUriProvider(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public DownloadInfo getDownloadInfo(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(11, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadInfo(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadInfoList(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public IDownloadNotificationEventAidlListener getDownloadNotificationEventListener(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(50, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadNotificationEventListener(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public int getDownloadWithIndependentProcessStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(36, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadWithIndependentProcessStatus(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadingDownloadInfosWithMimeType(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getFailedDownloadInfosWithMimeType(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public INotificationClickAidlCallback getNotificationClickCallback(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(51, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNotificationClickCallback(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public int getStatus(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(9, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getStatus(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSuccessedDownloadInfosWithMimeType(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getUnCompletedDownloadInfosWithMimeType(str);
                    }
                    obtain2.readException();
                    ArrayList createTypedArrayList = obtain2.createTypedArrayList(DownloadInfo.CREATOR);
                    obtain2.recycle();
                    obtain.recycle();
                    return createTypedArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDownloadSuccessAndFileNotExist(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean isDownloading(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(10, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDownloading(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void removeAllDownloadChunk(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(40, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().removeAllDownloadChunk(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean removeDownloadInfo(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(39, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeDownloadInfo(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean removeDownloadTaskData(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(44, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().removeDownloadTaskData(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void restartAllFailedDownloadTasks(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.mRemote.transact(19, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().restartAllFailedDownloadTasks(list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeStringList(list);
                    if (this.mRemote.transact(20, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().restartAllPauseReserveOnWifiDownloadTasks(list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean retryDelayStart(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().retryDelayStart(i);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void setLogLevel(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(33, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setLogLevel(i);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void tryDownload(DownloadAidlTask downloadAidlTask) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    if (downloadAidlTask != null) {
                        iBinder = downloadAidlTask.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().tryDownload(downloadAidlTask);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(38, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateDownloadInfo(downloadInfo);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void startForeground(int i, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(28, obtain, null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().startForeground(i, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void cancel(int i, boolean z) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().cancel(i, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void clearDownloadData(int i, boolean z) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(21, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().clearDownloadData(i, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void dispatchProcessCallback(int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(49, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().dispatchProcessCallback(i, i2);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public int getDownloadId(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(14, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadId(str, str2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public DownloadInfo getDownloadInfoByUrlAndPath(String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getDownloadInfoByUrlAndPath(str, str2);
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

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void resetDownloadData(int i, boolean z) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(22, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().resetDownloadData(i, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void setDownloadNotificationEventListener(int i, IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (iDownloadNotificationEventAidlListener != null) {
                        iBinder = iDownloadNotificationEventAidlListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(52, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setDownloadNotificationEventListener(i, iDownloadNotificationEventAidlListener);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void setDownloadWithIndependentProcessStatus(int i, boolean z) throws RemoteException {
                int i2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    if (z) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    obtain.writeInt(i2);
                    if (this.mRemote.transact(35, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setDownloadWithIndependentProcessStatus(i, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void setThrottleNetSpeed(int i, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(55, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setThrottleNetSpeed(i, j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(47, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().syncDownloadChunks(i, list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(46, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().syncDownloadInfoFromOtherCache(i, list);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void updateDownloadChunk(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(41, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().updateDownloadChunk(i, i2, j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(42, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().updateSubDownloadChunk(i, i2, i3, j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(43, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().updateSubDownloadChunkIndex(i, i2, i3, i4);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void addDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
                IBinder iBinder;
                int i4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (iDownloadAidlListener != null) {
                        iBinder = iDownloadAidlListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(25, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addDownloadListener(i, i2, iDownloadAidlListener, i3, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void removeDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException {
                IBinder iBinder;
                int i4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (iDownloadAidlListener != null) {
                        iBinder = iDownloadAidlListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(24, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().removeDownloadListener(i, i2, iDownloadAidlListener, i3, z);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.downloader.IDownloadAidlService
            public void addDownloadListener1(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z, boolean z2) throws RemoteException {
                Throwable th;
                IBinder iBinder;
                int i4;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (iDownloadAidlListener != null) {
                        iBinder = iDownloadAidlListener.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i3);
                    int i5 = 1;
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    obtain.writeInt(i4);
                    if (!z2) {
                        i5 = 0;
                    }
                    obtain.writeInt(i5);
                    try {
                        if (this.mRemote.transact(26, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                            return;
                        }
                        Stub.getDefaultImpl().addDownloadListener1(i, i2, iDownloadAidlListener, i3, z, z2);
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th2) {
                        th = th2;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public static IDownloadAidlService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
        }

        public static boolean setDefaultImpl(IDownloadAidlService iDownloadAidlService) {
            if (Proxy.sDefaultImpl != null || iDownloadAidlService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iDownloadAidlService;
            return true;
        }

        public static IDownloadAidlService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IDownloadAidlService)) {
                return new Proxy(iBinder);
            }
            return (IDownloadAidlService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            if (i != 1598968902) {
                DownloadInfo downloadInfo = null;
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                DownloadInfo downloadInfo2 = null;
                DownloadChunk downloadChunk = null;
                Notification notification = null;
                boolean z5 = false;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        tryDownload(DownloadAidlTask.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        pause(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        cancel(readInt, z5);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean canResume = canResume(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(canResume ? 1 : 0);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        resume(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        restart(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        pauseAll();
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        long curBytes = getCurBytes(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeLong(curBytes);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int status = getStatus(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(status);
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean isDownloading = isDownloading(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(isDownloading ? 1 : 0);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo downloadInfo3 = getDownloadInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (downloadInfo3 != null) {
                            parcel2.writeInt(1);
                            downloadInfo3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> downloadInfoList = getDownloadInfoList(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(downloadInfoList);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadChunk> downloadChunk2 = getDownloadChunk(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(downloadChunk2);
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int downloadId = getDownloadId(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(downloadId);
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        DownloadInfo downloadInfoByUrlAndPath = getDownloadInfoByUrlAndPath(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (downloadInfoByUrlAndPath != null) {
                            parcel2.writeInt(1);
                            downloadInfoByUrlAndPath.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> failedDownloadInfosWithMimeType = getFailedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(failedDownloadInfosWithMimeType);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> successedDownloadInfosWithMimeType = getSuccessedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> downloadingDownloadInfosWithMimeType = getDownloadingDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(downloadingDownloadInfosWithMimeType);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        restartAllFailedDownloadTasks(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        restartAllPauseReserveOnWifiDownloadTasks(parcel.createStringArrayList());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt2 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        clearDownloadData(readInt2, z5);
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt3 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        resetDownloadData(readInt3, z5);
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        forceDownloadIngoreRecommendSize(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt4 = parcel.readInt();
                        int readInt5 = parcel.readInt();
                        IDownloadAidlListener asInterface = IDownloadAidlListener.Stub.asInterface(parcel.readStrongBinder());
                        int readInt6 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        removeDownloadListener(readInt4, readInt5, asInterface, readInt6, z);
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt7 = parcel.readInt();
                        int readInt8 = parcel.readInt();
                        IDownloadAidlListener asInterface2 = IDownloadAidlListener.Stub.asInterface(parcel.readStrongBinder());
                        int readInt9 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        addDownloadListener(readInt7, readInt8, asInterface2, readInt9, z2);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt10 = parcel.readInt();
                        int readInt11 = parcel.readInt();
                        IDownloadAidlListener asInterface3 = IDownloadAidlListener.Stub.asInterface(parcel.readStrongBinder());
                        int readInt12 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (parcel.readInt() != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        addDownloadListener1(readInt10, readInt11, asInterface3, readInt12, z3, z4);
                        parcel2.writeNoException();
                        return true;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean isDownloadSuccessAndFileNotExist = isDownloadSuccessAndFileNotExist(downloadInfo);
                        parcel2.writeNoException();
                        parcel2.writeInt(isDownloadSuccessAndFileNotExist ? 1 : 0);
                        return true;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt13 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            notification = (Notification) Notification.CREATOR.createFromParcel(parcel);
                        }
                        startForeground(readInt13, notification);
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        stopForeground(z5);
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean isHttpServiceInit = isHttpServiceInit();
                        parcel2.writeNoException();
                        parcel2.writeInt(isHttpServiceInit ? 1 : 0);
                        return true;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        List<DownloadInfo> unCompletedDownloadInfosWithMimeType = getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean retryDelayStart = retryDelayStart(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(retryDelayStart ? 1 : 0);
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        setLogLevel(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean isDownloadCacheSyncSuccess = isDownloadCacheSyncSuccess();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDownloadCacheSyncSuccess ? 1 : 0);
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int readInt14 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            z5 = true;
                        }
                        setDownloadWithIndependentProcessStatus(readInt14, z5);
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        int downloadWithIndependentProcessStatus = getDownloadWithIndependentProcessStatus(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(downloadWithIndependentProcessStatus);
                        return true;
                    case 37:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        addDownloadChunk(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case 38:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean updateDownloadInfo = updateDownloadInfo(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(updateDownloadInfo ? 1 : 0);
                        return true;
                    case 39:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean removeDownloadInfo = removeDownloadInfo(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeDownloadInfo ? 1 : 0);
                        return true;
                    case 40:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        removeAllDownloadChunk(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 41:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        updateDownloadChunk(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 42:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        updateSubDownloadChunk(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 43:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        updateSubDownloadChunkIndex(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 44:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean removeDownloadTaskData = removeDownloadTaskData(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeDownloadTaskData ? 1 : 0);
                        return true;
                    case 45:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        clearData();
                        parcel2.writeNoException();
                        return true;
                    case 46:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        syncDownloadInfoFromOtherCache(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 47:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        syncDownloadChunks(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 48:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        addProcessCallback(ProcessAidlCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 49:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        dispatchProcessCallback(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case MmListControl.f116813f:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IDownloadNotificationEventAidlListener downloadNotificationEventListener = getDownloadNotificationEventListener(parcel.readInt());
                        parcel2.writeNoException();
                        if (downloadNotificationEventListener != null) {
                            iBinder3 = downloadNotificationEventListener.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder3);
                        return true;
                    case 51:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        INotificationClickAidlCallback notificationClickCallback = getNotificationClickCallback(parcel.readInt());
                        parcel2.writeNoException();
                        if (notificationClickCallback != null) {
                            iBinder2 = notificationClickCallback.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder2);
                        return true;
                    case 52:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        setDownloadNotificationEventListener(parcel.readInt(), IDownloadNotificationEventAidlListener.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 53:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        IDownloadAidlFileProvider downloadFileUriProvider = getDownloadFileUriProvider(parcel.readInt());
                        parcel2.writeNoException();
                        if (downloadFileUriProvider != null) {
                            iBinder = downloadFileUriProvider.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 54:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        boolean isServiceForeground = isServiceForeground();
                        parcel2.writeNoException();
                        parcel2.writeInt(isServiceForeground ? 1 : 0);
                        return true;
                    case 55:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                        setThrottleNetSpeed(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                return true;
            }
        }
    }

    void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException;

    void addDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException;

    void addDownloadListener1(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z, boolean z2) throws RemoteException;

    void addProcessCallback(ProcessAidlCallback processAidlCallback) throws RemoteException;

    boolean canResume(int i) throws RemoteException;

    void cancel(int i, boolean z) throws RemoteException;

    void clearData() throws RemoteException;

    void clearDownloadData(int i, boolean z) throws RemoteException;

    void dispatchProcessCallback(int i, int i2) throws RemoteException;

    void forceDownloadIngoreRecommendSize(int i) throws RemoteException;

    long getCurBytes(int i) throws RemoteException;

    List<DownloadChunk> getDownloadChunk(int i) throws RemoteException;

    IDownloadAidlFileProvider getDownloadFileUriProvider(int i) throws RemoteException;

    int getDownloadId(String str, String str2) throws RemoteException;

    DownloadInfo getDownloadInfo(int i) throws RemoteException;

    DownloadInfo getDownloadInfoByUrlAndPath(String str, String str2) throws RemoteException;

    List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException;

    IDownloadNotificationEventAidlListener getDownloadNotificationEventListener(int i) throws RemoteException;

    int getDownloadWithIndependentProcessStatus(int i) throws RemoteException;

    List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) throws RemoteException;

    List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException;

    INotificationClickAidlCallback getNotificationClickCallback(int i) throws RemoteException;

    int getStatus(int i) throws RemoteException;

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException;

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException;

    boolean isDownloadCacheSyncSuccess() throws RemoteException;

    boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) throws RemoteException;

    boolean isDownloading(int i) throws RemoteException;

    boolean isHttpServiceInit() throws RemoteException;

    boolean isServiceForeground() throws RemoteException;

    void pause(int i) throws RemoteException;

    void pauseAll() throws RemoteException;

    void removeAllDownloadChunk(int i) throws RemoteException;

    boolean removeDownloadInfo(int i) throws RemoteException;

    void removeDownloadListener(int i, int i2, IDownloadAidlListener iDownloadAidlListener, int i3, boolean z) throws RemoteException;

    boolean removeDownloadTaskData(int i) throws RemoteException;

    void resetDownloadData(int i, boolean z) throws RemoteException;

    void restart(int i) throws RemoteException;

    void restartAllFailedDownloadTasks(List<String> list) throws RemoteException;

    void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) throws RemoteException;

    void resume(int i) throws RemoteException;

    boolean retryDelayStart(int i) throws RemoteException;

    void setDownloadNotificationEventListener(int i, IDownloadNotificationEventAidlListener iDownloadNotificationEventAidlListener) throws RemoteException;

    void setDownloadWithIndependentProcessStatus(int i, boolean z) throws RemoteException;

    void setLogLevel(int i) throws RemoteException;

    void setThrottleNetSpeed(int i, long j) throws RemoteException;

    void startForeground(int i, Notification notification) throws RemoteException;

    void stopForeground(boolean z) throws RemoteException;

    void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException;

    void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException;

    void tryDownload(DownloadAidlTask downloadAidlTask) throws RemoteException;

    void updateDownloadChunk(int i, int i2, long j) throws RemoteException;

    boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException;

    void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException;

    void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException;
}
