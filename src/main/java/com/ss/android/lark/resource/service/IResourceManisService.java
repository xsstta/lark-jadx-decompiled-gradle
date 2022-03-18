package com.ss.android.lark.resource.service;

import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.manis.annotation.RemoteService;
import ee.android.framework.manis.interfaces.IHookInterface;

@RemoteService
public interface IResourceManisService extends IHookInterface {
    void addPushPushResourceListener(AbstractC53140b bVar);

    void addPushResourceDownloadProgressListener(AbstractC53139a aVar);

    void cancelDownloadResource(String str);

    void downloadResource(String str, String str2, String str3);

    String getAvatarPath(String str, String str2, int i, float f);

    Resource getEncryptImage(String str, String str2, String str3, boolean z);

    String getEncryptImage(String str, String str2);
}
