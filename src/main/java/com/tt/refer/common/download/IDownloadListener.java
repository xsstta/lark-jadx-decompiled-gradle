package com.tt.refer.common.download;

import com.tt.refer.common.download.engine.model.DownloadBean;

public interface IDownloadListener<B extends DownloadBean> {
    void onCancel(B b);

    void onComplete(B b);

    void onDownloading(B b);

    void onError(B b);

    void onPause(B b);

    void onReady(B b);

    void onStart(B b);
}
