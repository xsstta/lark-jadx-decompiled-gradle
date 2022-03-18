package com.ss.android.socialbase.downloader.exception;

public class DownloadPauseReserveWifiException extends DownloadRetryNeedlessException {
    public DownloadPauseReserveWifiException() {
        super(1013, "download reserve wifi");
    }
}
