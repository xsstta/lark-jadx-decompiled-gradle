package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.p3025b.C59990a;

public abstract class AbsDownloadListener implements IDownloadListener {
    private static final String TAG = "AbsDownloadListener";

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onCanceled -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onFirstStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onFirstSuccess -- " + downloadInfo.getName());
        }
    }

    public void onIntercept(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onIntercept -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onPause -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onPrepare -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null && downloadInfo.getTotalBytes() != 0) {
            String str = TAG;
            C59990a.m232838b(str, downloadInfo.getName() + " onProgress -- %" + ((int) ((((float) downloadInfo.getCurBytes()) / ((float) downloadInfo.getTotalBytes())) * 100.0f)));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onStart -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        if (C59990a.m232836a() && downloadInfo != null) {
            String str = TAG;
            C59990a.m232838b(str, " onSuccessed -- " + downloadInfo.getName());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C59990a.m232836a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C59990a.m232838b(str2, String.format("onFailed on %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C59990a.m232836a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C59990a.m232838b(str2, String.format("onRetry on %s because of : %s", objArr));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        if (C59990a.m232836a() && downloadInfo != null) {
            String str2 = TAG;
            Object[] objArr = new Object[2];
            objArr[0] = downloadInfo.getName();
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = "unkown";
            }
            objArr[1] = str;
            C59990a.m232838b(str2, String.format("onRetryDelay on %s because of : %s", objArr));
        }
    }
}
