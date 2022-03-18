package com.bytedance.ee.bear.drive.services;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;

@NewRemoteService
/* renamed from: com.bytedance.ee.bear.drive.services.n */
public interface AbstractC7197n {

    /* renamed from: com.bytedance.ee.bear.drive.services.n$a */
    public interface AbstractC7198a {
        void onFailed(int i, String str);

        void onProgressUpdate(int i);

        void onStart();

        void onSuccess();
    }

    void onPluginUpdate(String str, BinderIPluginUpdateCallback binderIPluginUpdateCallback);
}
