package com.tt.refer.common.download;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.common.download.engine.model.DownloadBean;

public abstract class AbsDownloadListener<B extends DownloadBean> implements IDownloadListener<B> {
    @Override // com.tt.refer.common.download.IDownloadListener
    public void onCancel(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onCancel>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onComplete(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onComplete>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onDownloading(B b) {
        AppBrandLogger.m52828d("download_listener", ">>>onDownloading>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onError(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onError>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onPause(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onPause>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onReady(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onReady>>>:", b);
    }

    @Override // com.tt.refer.common.download.IDownloadListener
    public void onStart(B b) {
        AppBrandLogger.m52830i("download_listener", ">>>onStart>>>:", b);
    }
}
