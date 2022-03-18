package com.ss.android.socialbase.downloader.downloader;

import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.List;

/* renamed from: com.ss.android.socialbase.downloader.downloader.i */
public interface AbstractC60059i {
    DownloadInfo OnDownloadTaskCompleted(int i, long j);

    DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2);

    DownloadInfo OnDownloadTaskError(int i, long j);

    DownloadInfo OnDownloadTaskIntercept(int i);

    DownloadInfo OnDownloadTaskPause(int i, long j);

    DownloadInfo OnDownloadTaskPrepare(int i);

    DownloadInfo OnDownloadTaskProgress(int i, long j);

    DownloadInfo OnDownloadTaskRetry(int i);

    void addDownloadChunk(DownloadChunk downloadChunk);

    void addSubDownloadChunk(DownloadChunk downloadChunk);

    void clearData();

    boolean ensureDownloadCacheSyncSuccess();

    List<DownloadChunk> getDownloadChunk(int i);

    DownloadInfo getDownloadInfo(int i);

    List<DownloadInfo> getDownloadInfoList(String str);

    List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str);

    List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str);

    boolean isDownloadCacheSyncSuccess();

    DownloadInfo onDownloadTaskStart(int i);

    void removeAllDownloadChunk(int i);

    boolean removeDownloadInfo(int i);

    boolean removeDownloadTaskData(int i);

    void syncDownloadChunks(int i, List<DownloadChunk> list);

    void syncDownloadInfo(DownloadInfo downloadInfo);

    void syncDownloadInfoFromOtherCache(int i, List<DownloadChunk> list);

    DownloadInfo updateChunkCount(int i, int i2);

    void updateDownloadChunk(int i, int i2, long j);

    boolean updateDownloadInfo(DownloadInfo downloadInfo);

    void updateSubDownloadChunk(int i, int i2, int i3, long j);

    void updateSubDownloadChunkIndex(int i, int i2, int i3, int i4);
}
