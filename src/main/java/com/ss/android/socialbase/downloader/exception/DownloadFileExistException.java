package com.ss.android.socialbase.downloader.exception;

public class DownloadFileExistException extends BaseException {
    private String existTargetFileName;

    public String getExistTargetFileName() {
        return this.existTargetFileName;
    }

    public DownloadFileExistException(String str) {
        this.existTargetFileName = str;
    }
}
