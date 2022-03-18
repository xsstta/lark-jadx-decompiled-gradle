package com.tt.miniapp.p3327s;

import com.tt.miniapphost.entity.AppInfoEntity;

/* renamed from: com.tt.miniapp.s.e */
public interface AbstractC66745e extends AbstractC66737b {
    void metaExpired();

    void miniAppDownloadInstallFail(String str);

    void miniAppDownloadInstallProgress(int i);

    void miniAppInstallSuccess(int i);

    void noPermission();

    void onCheckForUpdate(AppInfoEntity appInfoEntity);

    void onLoadMainJsSuccess();

    void onPkgDownloadDone(boolean z);

    void onPreloadEnd();

    void onRemoteDebugOpen();

    void onUpdateFailed();

    void onUpdateReady();
}
