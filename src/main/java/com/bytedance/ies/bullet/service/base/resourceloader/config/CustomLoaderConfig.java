package com.bytedance.ies.bullet.service.base.resourceloader.config;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR*\u0010\u0014\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR*\u0010\u0017\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/resourceloader/config/CustomLoaderConfig;", "", "disableDefaultLoader", "", "(Z)V", "getDisableDefaultLoader", "()Z", "loaderSequence", "", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/LoaderType;", "getLoaderSequence", "()Ljava/util/List;", "setLoaderSequence", "(Ljava/util/List;)V", "priorityHigh", "", "Ljava/lang/Class;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "getPriorityHigh", "setPriorityHigh", "priorityLow", "getPriorityLow", "setPriorityLow", "removedLoader", "getRemovedLoader", "setRemovedLoader", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.resourceloader.config.a */
public final class CustomLoaderConfig {

    /* renamed from: a */
    private List<LoaderType> f37913a = new ArrayList();

    /* renamed from: b */
    private List<? extends Class<? extends IXResourceLoader>> f37914b;

    /* renamed from: c */
    private List<? extends Class<? extends IXResourceLoader>> f37915c;

    /* renamed from: d */
    private List<? extends Class<? extends IXResourceLoader>> f37916d;

    /* renamed from: e */
    private final boolean f37917e;

    /* renamed from: a */
    public final List<LoaderType> mo52719a() {
        return this.f37913a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>>, java.util.List<java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* renamed from: b */
    public final List<Class<? extends IXResourceLoader>> mo52721b() {
        return this.f37914b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>>, java.util.List<java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* renamed from: c */
    public final List<Class<? extends IXResourceLoader>> mo52722c() {
        return this.f37915c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>>, java.util.List<java.lang.Class<? extends com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader>> */
    /* renamed from: d */
    public final List<Class<? extends IXResourceLoader>> mo52723d() {
        return this.f37916d;
    }

    /* renamed from: e */
    public final boolean mo52724e() {
        return this.f37917e;
    }

    /* renamed from: a */
    public final void mo52720a(List<LoaderType> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f37913a = list;
    }

    public CustomLoaderConfig(boolean z) {
        this.f37917e = z;
    }
}
