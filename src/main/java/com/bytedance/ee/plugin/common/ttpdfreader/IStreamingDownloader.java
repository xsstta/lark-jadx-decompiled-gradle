package com.bytedance.ee.plugin.common.ttpdfreader;

import java.util.List;

public interface IStreamingDownloader {

    public interface DownloadCallback {
        void onResult(String str, int i, List<Range> list);
    }

    public interface Status {
    }

    void cancelTask(String... strArr);

    void deleteRecord();

    String download(DownloadCallback downloadCallback, List<Range> list);

    String filePath();

    long fileSize();

    void getDownloadedRanges(DownloadCallback downloadCallback);

    void onPageReady(int i);

    long requiredHeadTailSize();
}
