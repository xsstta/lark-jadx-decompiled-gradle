package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

/* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g */
public interface AbstractC5150g {

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g$a */
    public interface AbstractC5151a {
        void cancel();
    }

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g$b */
    public interface AbstractC5152b {
        void hideDownloadingView(String str, String str2);

        void onDownloadingProgressChange(String str, String str2, int i);

        void onFailed(String str, String str2, String str3);

        void showDownloadingView(String str, String str2);
    }

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g$c */
    public interface AbstractC5153c {
        BinderProxyDownloadUpdater getProxyDownloadUpdater();

        void setProxyDownloadUpdater(BinderProxyDownloadUpdater binderProxyDownloadUpdater);
    }

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g$d */
    public interface AbstractC5154d {
        void onSaved(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.contract.drive.sdk.entity.menu.g$e */
    public interface AbstractC5155e {
        void onClick(boolean z);
    }
}
