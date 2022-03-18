package com.ss.android.lark.resource.service.impl;

import android.content.Context;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.resource.service.AbstractC53139a;
import com.ss.android.lark.resource.service.AbstractC53140b;
import com.ss.android.lark.resource.service.IResourceManisService;

@RemoteServiceImpl(service = IResourceManisService.class)
public class ResourceManisServiceImpl implements IResourceManisService {
    private Context mContext;
    private C53155c mResourceService;

    private C53155c getRealService() {
        if (this.mResourceService == null) {
            this.mResourceService = new C53155c();
        }
        return this.mResourceService;
    }

    public ResourceManisServiceImpl(Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushPushResourceListener(AbstractC53140b bVar) {
        ResourcePush.m205695a().mo181528a((AbstractC29580b) bVar);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void addPushResourceDownloadProgressListener(AbstractC53139a aVar) {
        ResourcePush.m205695a().mo181527a((AbstractC29579a) aVar);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void cancelDownloadResource(String str) {
        getRealService().mo105872a(str);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getEncryptImage(String str, String str2) {
        return getRealService().mo181545c(str, str2);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public void downloadResource(String str, String str2, String str3) {
        getRealService().mo105874a(str, str2, str3);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public String getAvatarPath(String str, String str2, int i, float f) {
        return getRealService().mo181544b(str, str2, i, f);
    }

    @Override // com.ss.android.lark.resource.service.IResourceManisService
    public Resource getEncryptImage(String str, String str2, String str3, boolean z) {
        return getRealService().mo181543b(str, str2, str3, z);
    }
}
