package com.bytedance.ee.bear.drive.loader.download.platform.processor.misc;

import com.bytedance.ee.bear.drive.loader.download.platform.abs.IDownloader;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DriveFile;

public class RustCallback implements DownloadCallback {
    private IDownloader.C7022a callback;

    private RustCallback(IDownloader.C7022a aVar) {
        this.callback = aVar;
    }

    public static RustCallback wrap(IDownloader.C7022a aVar) {
        return new RustCallback(aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean onFailed(String str, int i) {
        this.callback.mo25452a(str, i);
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.drive.export.DownloadCallback
    public boolean updateProgress(String str, DriveFile.Status status, long j, long j2, String str2) {
        if (status == DriveFile.Status.INFLIGHT) {
            this.callback.mo25448a((int) (((((float) j) * 1.0f) / ((float) j2)) * 100.0f));
            return false;
        } else if (status != DriveFile.Status.SUCCESS) {
            return false;
        } else {
            this.callback.mo25453a(str, str2);
            return false;
        }
    }
}
