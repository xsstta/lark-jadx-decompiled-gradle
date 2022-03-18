package com.bytedance.ee.bear.lynx.impl.resourceloader;

import android.app.Application;
import com.bytedance.ies.bullet.kit.resourceloader.ResourceLoaderService;
import com.bytedance.ies.bullet.service.base.LoadTask;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.resourceloader.config.CustomLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.LoaderType;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/resourceloader/CCMResourceLoaderService;", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceLoaderService;", "application", "Landroid/app/Application;", "isPrivateKaUser", "", "(Landroid/app/Application;Z)V", "interceptTaskConfig", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "config", "loadAsync", "Lcom/bytedance/ies/bullet/service/base/LoadTask;", "uri", "", "resolve", "Lkotlin/Function1;", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "", "reject", "", "loadSync", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.a.a */
public final class CCMResourceLoaderService extends ResourceLoaderService {

    /* renamed from: f */
    private final boolean f23746f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CCMResourceLoaderService(Application application, boolean z) {
        super(application);
        Intrinsics.checkParameterIsNotNull(application, "application");
        this.f23746f = z;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService, com.bytedance.ies.bullet.kit.resourceloader.ResourceLoaderService
    public ResourceInfo loadSync(String str, TaskConfig jVar) {
        Intrinsics.checkParameterIsNotNull(str, "uri");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        return super.loadSync(str, m36995a(jVar, this.f23746f));
    }

    /* renamed from: a */
    private final TaskConfig m36995a(TaskConfig jVar, boolean z) {
        CustomLoaderConfig a = jVar.mo52748a();
        if (z && !a.mo52724e()) {
            a.mo52720a(CollectionsKt.mutableListOf(LoaderType.GECKO, LoaderType.BUILTIN));
        }
        return jVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.IResourceLoaderService, com.bytedance.ies.bullet.kit.resourceloader.ResourceLoaderService
    public LoadTask loadAsync(String str, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(str, "uri");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "resolve");
        Intrinsics.checkParameterIsNotNull(function12, "reject");
        return super.loadAsync(str, m36995a(jVar, this.f23746f), function1, function12);
    }
}
