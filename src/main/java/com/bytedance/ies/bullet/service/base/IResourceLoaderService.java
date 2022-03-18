package com.bytedance.ies.bullet.service.base;

import com.bytedance.ies.bullet.service.base.api.IBulletService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&JD\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0011H&J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000fH&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0017H&J \u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000eH&J \u0010\u001f\u001a\u00020\u00032\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH&¨\u0006 "}, d2 = {"Lcom/bytedance/ies/bullet/service/base/IResourceLoaderService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "cancel", "", "task", "Lcom/bytedance/ies/bullet/service/base/LoadTask;", "deleteResource", "info", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "init", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/ResourceLoaderConfig;", "loadAsync", "uri", "", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "resolve", "Lkotlin/Function1;", "reject", "", "loadSync", "registerConfig", "ak", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/GeckoConfig;", "registerCustomLoader", "clazz", "Ljava/lang/Class;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", ShareHitPoint.f121869d, "Lcom/bytedance/ies/bullet/service/base/CustomLoaderType;", "unRegisterConfig", "unregisterCustomLoader", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IResourceLoaderService extends IBulletService {
    void cancel(LoadTask jVar);

    void deleteResource(ResourceInfo mVar);

    void init(ResourceLoaderConfig iVar);

    LoadTask loadAsync(String str, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12);

    ResourceInfo loadSync(String str, TaskConfig jVar);

    void registerConfig(String str, GeckoConfig cVar);

    void registerCustomLoader(Class<? extends IXResourceLoader> cls, CustomLoaderType customLoaderType);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, CustomLoaderType customLoaderType);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.IResourceLoaderService$a */
    public static final class C14409a {
        /* renamed from: a */
        public static /* synthetic */ LoadTask m57974a(IResourceLoaderService iResourceLoaderService, String str, TaskConfig jVar, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                if ((i & 2) != 0) {
                    jVar = new TaskConfig(null, 1, null);
                }
                return iResourceLoaderService.loadAsync(str, jVar, function1, function12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAsync");
        }
    }
}
