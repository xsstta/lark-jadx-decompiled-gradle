package com.bytedance.ies.bullet.service.base.api;

import android.content.Context;
import com.bytedance.ies.bullet.service.base.api.IServiceContext;
import com.bytedance.ies.bullet.service.base.impl.DefaultDependencyProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/BaseServiceContext;", "Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "context", "Landroid/content/Context;", "isDebug", "", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "extra", "Lcom/bytedance/ies/bullet/service/base/impl/DefaultDependencyProvider;", "getExtra", "()Lcom/bytedance/ies/bullet/service/base/impl/DefaultDependencyProvider;", "()Z", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.a */
public final class BaseServiceContext implements IServiceContext {

    /* renamed from: a */
    private final DefaultDependencyProvider f37861a = new DefaultDependencyProvider();

    /* renamed from: b */
    private final Context f37862b;

    /* renamed from: c */
    private final boolean f37863c;

    /* renamed from: a */
    public DefaultDependencyProvider mo52654b() {
        return this.f37861a;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceContext
    /* renamed from: c */
    public Context mo52655c() {
        return this.f37862b;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceContext
    /* renamed from: d */
    public boolean mo52656d() {
        return this.f37863c;
    }

    @Override // com.bytedance.ies.bullet.service.base.api.IServiceContext
    /* renamed from: a */
    public <T> T mo52653a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        return (T) IServiceContext.C14414a.m58037a(this, cls);
    }

    public BaseServiceContext(Context context, boolean z) {
        this.f37862b = context;
        this.f37863c = z;
    }
}
