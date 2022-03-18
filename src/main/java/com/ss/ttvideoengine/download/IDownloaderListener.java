package com.ss.ttvideoengine.download;

import com.ss.ttvideoengine.utils.Error;
import java.util.List;

public interface IDownloaderListener {
    void downloaderDidComplete(Downloader downloader, DownloadTask downloadTask, Error error);

    void downloaderDidLoadAllTask(Downloader downloader, List<DownloadTask> list, Error error);

    void downloaderDidResume(Downloader downloader, DownloadTask downloadTask, long j, long j2);

    void downloaderStateChanged(Downloader downloader, DownloadTask downloadTask, int i);

    void downloaderWriteData(Downloader downloader, DownloadTask downloadTask, long j, long j2);
}
