package com.tt.refer.common.pkg;

public interface IPkgDownloadInstallListener {
    void onDownloadSuccess(int i, boolean z);

    void onDownloading(int i, float f);

    void onFailed(int i, String str, String str2);

    void onInstallPkgSuccess(int i, String str, String str2);
}
