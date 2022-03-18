package com.bytedance.ies.bullet.kit.resourceloader;

import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceInfoWrapper;", "", "info", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "(Lcom/bytedance/ies/bullet/service/base/ResourceInfo;Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;)V", "getConfig", "()Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "setConfig", "(Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;)V", "getInfo", "()Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "setInfo", "(Lcom/bytedance/ies/bullet/service/base/ResourceInfo;)V", "isASync", "", "()Z", "setASync", "(Z)V", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.e */
public final class ResourceInfoWrapper {

    /* renamed from: a */
    private boolean f37786a;

    /* renamed from: b */
    private ResourceInfo f37787b;

    /* renamed from: c */
    private TaskConfig f37788c;

    /* renamed from: b */
    public final ResourceInfo mo52579b() {
        return this.f37787b;
    }

    /* renamed from: c */
    public final TaskConfig mo52580c() {
        return this.f37788c;
    }

    /* renamed from: a */
    public final boolean mo52578a() {
        return this.f37786a;
    }

    /* renamed from: a */
    public final void mo52577a(boolean z) {
        this.f37786a = z;
    }

    /* renamed from: a */
    public final void mo52576a(ResourceInfo mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "<set-?>");
        this.f37787b = mVar;
    }

    public ResourceInfoWrapper(ResourceInfo mVar, TaskConfig jVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "info");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        this.f37787b = mVar;
        this.f37788c = jVar;
    }
}
