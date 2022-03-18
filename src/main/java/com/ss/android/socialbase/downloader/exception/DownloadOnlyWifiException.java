package com.ss.android.socialbase.downloader.exception;

public class DownloadOnlyWifiException extends DownloadRetryNeedlessException {
    public DownloadOnlyWifiException() {
        super(1013, "download only wifi");
    }
}
