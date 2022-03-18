package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH&J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J$\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000bH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ILoaderDepender;", "", "service", "Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "getService", "()Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "setService", "(Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;)V", "checkIsExists", "", "rootDir", "", "accessKey", "channel", "checkUpdate", "", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "channelList", "", "listener", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/OnUpdateListener;", "getGeckoOfflineDir", "offlineDir", "relativePath", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.e */
public interface ILoaderDepender {
    /* renamed from: a */
    void mo52571a(IResourceLoaderService iResourceLoaderService);

    /* renamed from: a */
    void mo52572a(TaskConfig jVar, List<String> list, OnUpdateListener fVar);

    /* renamed from: a */
    boolean mo52573a(String str, String str2, String str3);

    /* renamed from: b */
    String mo52574b(String str, String str2, String str3);
}
