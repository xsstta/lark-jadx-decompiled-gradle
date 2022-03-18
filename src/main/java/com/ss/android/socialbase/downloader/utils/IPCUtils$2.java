package com.ss.android.socialbase.downloader.utils;

import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.AbstractC60030h;
import com.ss.android.socialbase.downloader.depend.IDownloadAidlListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* access modifiers changed from: package-private */
public class IPCUtils$2 extends IDownloadAidlListener.Stub {
    final /* synthetic */ boolean val$isInMainThread;
    final /* synthetic */ IDownloadListener val$listener;

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public int getOriginHashCode() throws RemoteException {
        return this.val$listener.hashCode();
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onCanceled(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.AnonymousClass10 */

                public void run() {
                    IPCUtils$2.this.val$listener.onCanceled(downloadInfo);
                }
            });
        } else {
            this.val$listener.onCanceled(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onFirstStart(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.AnonymousClass11 */

                public void run() {
                    IPCUtils$2.this.val$listener.onFirstStart(downloadInfo);
                }
            });
        } else {
            this.val$listener.onFirstStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onFirstSuccess(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.AnonymousClass12 */

                public void run() {
                    IPCUtils$2.this.val$listener.onFirstSuccess(downloadInfo);
                }
            });
        } else {
            this.val$listener.onFirstSuccess(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onPause(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601557 */

                public void run() {
                    IPCUtils$2.this.val$listener.onPause(downloadInfo);
                }
            });
        } else {
            this.val$listener.onPause(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onPrepare(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601491 */

                public void run() {
                    IPCUtils$2.this.val$listener.onPrepare(downloadInfo);
                }
            });
        } else {
            this.val$listener.onPrepare(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onProgress(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601546 */

                public void run() {
                    IPCUtils$2.this.val$listener.onProgress(downloadInfo);
                }
            });
        } else {
            this.val$listener.onProgress(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onStart(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601535 */

                public void run() {
                    IPCUtils$2.this.val$listener.onStart(downloadInfo);
                }
            });
        } else {
            this.val$listener.onStart(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onSuccessed(final DownloadInfo downloadInfo) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601568 */

                public void run() {
                    IPCUtils$2.this.val$listener.onSuccessed(downloadInfo);
                }
            });
        } else {
            this.val$listener.onSuccessed(downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onWaitingDownloadCompleteHandler(final DownloadInfo downloadInfo) throws RemoteException {
        IDownloadListener iDownloadListener = this.val$listener;
        if (!(iDownloadListener instanceof AbstractC60030h)) {
            return;
        }
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601524 */

                public void run() {
                    ((AbstractC60030h) IPCUtils$2.this.val$listener).mo204512a(downloadInfo);
                }
            });
        } else {
            ((AbstractC60030h) iDownloadListener).mo204512a(downloadInfo);
        }
    }

    IPCUtils$2(IDownloadListener iDownloadListener, boolean z) {
        this.val$listener = iDownloadListener;
        this.val$isInMainThread = z;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onFailed(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601579 */

                public void run() {
                    IPCUtils$2.this.val$listener.onFailed(downloadInfo, baseException);
                }
            });
        } else {
            this.val$listener.onFailed(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onRetry(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601502 */

                public void run() {
                    IPCUtils$2.this.val$listener.onRetry(downloadInfo, baseException);
                }
            });
        } else {
            this.val$listener.onRetry(downloadInfo, baseException);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadAidlListener
    public void onRetryDelay(final DownloadInfo downloadInfo, final BaseException baseException) throws RemoteException {
        if (this.val$isInMainThread) {
            C60162e.f150158a.post(new Runnable() {
                /* class com.ss.android.socialbase.downloader.utils.IPCUtils$2.RunnableC601513 */

                public void run() {
                    IPCUtils$2.this.val$listener.onRetryDelay(downloadInfo, baseException);
                }
            });
        } else {
            this.val$listener.onRetryDelay(downloadInfo, baseException);
        }
    }
}
