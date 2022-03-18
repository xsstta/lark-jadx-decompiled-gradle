package com.ss.android.socialbase.downloader.db;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.socialbase.downloader.db.ISqlCacheLoadCompleteCallbackAidl;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.util.ArrayList;
import java.util.List;

public interface ISqlDownloadCacheAidl extends IInterface {

    public static class Default implements ISqlDownloadCacheAidl {
        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskCancel(int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskCompleted(int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskError(int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskIntercept(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskPause(int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskPrepare(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskProgress(int i, long j) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo OnDownloadTaskRetry(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void addSubDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean cacheExist(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void clearData() throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean ensureDownloadCacheSyncSuccess() throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public List<DownloadChunk> getDownloadChunk(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo getDownloadInfo(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void init() throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean isDownloadCacheSyncSuccess() throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo onDownloadTaskStart(int i) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void removeAllDownloadChunk(int i) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean removeDownloadInfo(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean removeDownloadTaskData(int i) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void setInitCallback(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void syncDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public DownloadInfo updateChunkCount(int i, int i2) throws RemoteException {
            return null;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void updateDownloadChunk(int i, int i2, long j) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
            return false;
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException {
        }

        @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
        public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements ISqlDownloadCacheAidl {
        public IBinder asBinder() {
            return this;
        }

        /* access modifiers changed from: private */
        public static class Proxy implements ISqlDownloadCacheAidl {
            public static ISqlDownloadCacheAidl sDefaultImpl;
            private IBinder mRemote;

            public String getInterfaceDescriptor() {
                return "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl";
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void clearData() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.mRemote.transact(19, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void init() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (this.mRemote.transact(1, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().init();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean ensureDownloadCacheSyncSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().ensureDownloadCacheSyncSuccess();
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean isDownloadCacheSyncSuccess() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = false;
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskIntercept(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskIntercept(i);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskPrepare(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskPrepare(i);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskRetry(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskRetry(i);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void addSubDownloadChunk(DownloadChunk downloadChunk) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadChunk != null) {
                        obtain.writeInt(1);
                        downloadChunk.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().addSubDownloadChunk(downloadChunk);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean cacheExist(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().cacheExist(i);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public List<DownloadChunk> getDownloadChunk(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo getDownloadInfo(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(6, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeString(str);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo onDownloadTaskStart(int i) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().onDownloadTaskStart(i);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void removeAllDownloadChunk(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean removeDownloadInfo(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(17, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean removeDownloadTaskData(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    boolean z = false;
                    if (!this.mRemote.transact(18, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void setInitCallback(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (iSqlCacheLoadCompleteCallbackAidl != null) {
                        iBinder = iSqlCacheLoadCompleteCallbackAidl.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (this.mRemote.transact(35, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().setInitCallback(iSqlCacheLoadCompleteCallbackAidl);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void syncDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(32, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    Stub.getDefaultImpl().syncDownloadInfo(downloadInfo);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    boolean z = true;
                    if (downloadInfo != null) {
                        obtain.writeInt(1);
                        downloadInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.mRemote.transact(16, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskCancel(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskCancel(i, j);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskCompleted(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskCompleted(i, j);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskError(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(23, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskError(i, j);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskPause(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskPause(i, j);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskProgress(int i, long j) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    if (!this.mRemote.transact(22, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskProgress(i, j);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(33, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(34, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo updateChunkCount(int i, int i2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    if (!this.mRemote.transact(15, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().updateChunkCount(i, i2);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void updateDownloadChunk(int i, int i2, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(12, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) throws RemoteException {
                DownloadInfo downloadInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().OnDownloadTaskConnected(i, j, str, str2);
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeLong(j);
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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

            @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
            public void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
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
        }

        public static ISqlDownloadCacheAidl getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public Stub() {
            attachInterface(this, "com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
        }

        public static boolean setDefaultImpl(ISqlDownloadCacheAidl iSqlDownloadCacheAidl) {
            if (Proxy.sDefaultImpl != null || iSqlDownloadCacheAidl == null) {
                return false;
            }
            Proxy.sDefaultImpl = iSqlDownloadCacheAidl;
            return true;
        }

        public static ISqlDownloadCacheAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof ISqlDownloadCacheAidl)) {
                return new Proxy(iBinder);
            }
            return (ISqlDownloadCacheAidl) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                DownloadChunk downloadChunk = null;
                DownloadInfo downloadInfo = null;
                DownloadInfo downloadInfo2 = null;
                DownloadChunk downloadChunk2 = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        init();
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean cacheExist = cacheExist(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(cacheExist ? 1 : 0);
                        return true;
                    case 3:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo downloadInfo3 = getDownloadInfo(parcel.readInt());
                        parcel2.writeNoException();
                        if (downloadInfo3 != null) {
                            parcel2.writeInt(1);
                            downloadInfo3.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 4:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> downloadInfoList = getDownloadInfoList(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(downloadInfoList);
                        return true;
                    case 5:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> failedDownloadInfosWithMimeType = getFailedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(failedDownloadInfosWithMimeType);
                        return true;
                    case 6:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> successedDownloadInfosWithMimeType = getSuccessedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(successedDownloadInfosWithMimeType);
                        return true;
                    case 7:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadInfo> unCompletedDownloadInfosWithMimeType = getUnCompletedDownloadInfosWithMimeType(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(unCompletedDownloadInfosWithMimeType);
                        return true;
                    case 8:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        List<DownloadChunk> downloadChunk3 = getDownloadChunk(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeTypedList(downloadChunk3);
                        return true;
                    case 9:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        removeAllDownloadChunk(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        addDownloadChunk(downloadChunk);
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadChunk2 = DownloadChunk.CREATOR.createFromParcel(parcel);
                        }
                        addSubDownloadChunk(downloadChunk2);
                        parcel2.writeNoException();
                        return true;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        updateDownloadChunk(parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        updateSubDownloadChunk(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        updateSubDownloadChunkIndex(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo updateChunkCount = updateChunkCount(parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        if (updateChunkCount != null) {
                            parcel2.writeInt(1);
                            updateChunkCount.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 16:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo2 = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        boolean updateDownloadInfo = updateDownloadInfo(downloadInfo2);
                        parcel2.writeNoException();
                        parcel2.writeInt(updateDownloadInfo ? 1 : 0);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean removeDownloadInfo = removeDownloadInfo(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeDownloadInfo ? 1 : 0);
                        return true;
                    case 18:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean removeDownloadTaskData = removeDownloadTaskData(parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeInt(removeDownloadTaskData ? 1 : 0);
                        return true;
                    case 19:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        clearData();
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo onDownloadTaskStart = onDownloadTaskStart(parcel.readInt());
                        parcel2.writeNoException();
                        if (onDownloadTaskStart != null) {
                            parcel2.writeInt(1);
                            onDownloadTaskStart.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 21:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskConnected = OnDownloadTaskConnected(parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        if (OnDownloadTaskConnected != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskConnected.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 22:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskProgress = OnDownloadTaskProgress(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (OnDownloadTaskProgress != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskProgress.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 23:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskError = OnDownloadTaskError(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (OnDownloadTaskError != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskError.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 24:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskRetry = OnDownloadTaskRetry(parcel.readInt());
                        parcel2.writeNoException();
                        if (OnDownloadTaskRetry != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskRetry.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskCompleted = OnDownloadTaskCompleted(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (OnDownloadTaskCompleted != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskCompleted.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 26:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskPause = OnDownloadTaskPause(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (OnDownloadTaskPause != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskPause.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskCancel = OnDownloadTaskCancel(parcel.readInt(), parcel.readLong());
                        parcel2.writeNoException();
                        if (OnDownloadTaskCancel != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskCancel.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskPrepare = OnDownloadTaskPrepare(parcel.readInt());
                        parcel2.writeNoException();
                        if (OnDownloadTaskPrepare != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskPrepare.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 29:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        DownloadInfo OnDownloadTaskIntercept = OnDownloadTaskIntercept(parcel.readInt());
                        parcel2.writeNoException();
                        if (OnDownloadTaskIntercept != null) {
                            parcel2.writeInt(1);
                            OnDownloadTaskIntercept.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 30:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean isDownloadCacheSyncSuccess = isDownloadCacheSyncSuccess();
                        parcel2.writeNoException();
                        parcel2.writeInt(isDownloadCacheSyncSuccess ? 1 : 0);
                        return true;
                    case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        boolean ensureDownloadCacheSyncSuccess = ensureDownloadCacheSyncSuccess();
                        parcel2.writeNoException();
                        parcel2.writeInt(ensureDownloadCacheSyncSuccess ? 1 : 0);
                        return true;
                    case 32:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        if (parcel.readInt() != 0) {
                            downloadInfo = DownloadInfo.CREATOR.createFromParcel(parcel);
                        }
                        syncDownloadInfo(downloadInfo);
                        parcel2.writeNoException();
                        return true;
                    case 33:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        syncDownloadChunks(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        syncDownloadInfoFromOtherCache(parcel.readInt(), parcel.createTypedArrayList(DownloadChunk.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                        setInitCallback(ISqlCacheLoadCompleteCallbackAidl.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl");
                return true;
            }
        }
    }

    DownloadInfo OnDownloadTaskCancel(int i, long j) throws RemoteException;

    DownloadInfo OnDownloadTaskCompleted(int i, long j) throws RemoteException;

    DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) throws RemoteException;

    DownloadInfo OnDownloadTaskError(int i, long j) throws RemoteException;

    DownloadInfo OnDownloadTaskIntercept(int i) throws RemoteException;

    DownloadInfo OnDownloadTaskPause(int i, long j) throws RemoteException;

    DownloadInfo OnDownloadTaskPrepare(int i) throws RemoteException;

    DownloadInfo OnDownloadTaskProgress(int i, long j) throws RemoteException;

    DownloadInfo OnDownloadTaskRetry(int i) throws RemoteException;

    void addDownloadChunk(DownloadChunk downloadChunk) throws RemoteException;

    void addSubDownloadChunk(DownloadChunk downloadChunk) throws RemoteException;

    boolean cacheExist(int i) throws RemoteException;

    void clearData() throws RemoteException;

    boolean ensureDownloadCacheSyncSuccess() throws RemoteException;

    List<DownloadChunk> getDownloadChunk(int i) throws RemoteException;

    DownloadInfo getDownloadInfo(int i) throws RemoteException;

    List<DownloadInfo> getDownloadInfoList(String str) throws RemoteException;

    List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) throws RemoteException;

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) throws RemoteException;

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) throws RemoteException;

    void init() throws RemoteException;

    boolean isDownloadCacheSyncSuccess() throws RemoteException;

    DownloadInfo onDownloadTaskStart(int i) throws RemoteException;

    void removeAllDownloadChunk(int i) throws RemoteException;

    boolean removeDownloadInfo(int i) throws RemoteException;

    boolean removeDownloadTaskData(int i) throws RemoteException;

    void setInitCallback(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) throws RemoteException;

    void syncDownloadChunks(int i, List<DownloadChunk> list) throws RemoteException;

    void syncDownloadInfo(DownloadInfo downloadInfo) throws RemoteException;

    void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list) throws RemoteException;

    DownloadInfo updateChunkCount(int i, int i2) throws RemoteException;

    void updateDownloadChunk(int i, int i2, long j) throws RemoteException;

    boolean updateDownloadInfo(DownloadInfo downloadInfo) throws RemoteException;

    void updateSubDownloadChunk(int i, int i2, int i3, long j) throws RemoteException;

    void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4) throws RemoteException;
}
