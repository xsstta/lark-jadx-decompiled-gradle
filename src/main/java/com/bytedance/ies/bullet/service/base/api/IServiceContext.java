package com.bytedance.ies.bullet.service.base.api;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\r\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016¢\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\b\u0010\u0014\u001a\u0004\u0018\u0001H\u000eH\u0016¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/IServiceContext;", "", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "extra", "Lcom/bytedance/ies/bullet/service/base/api/IDependencyProvider;", "getExtra", "()Lcom/bytedance/ies/bullet/service/base/api/IDependencyProvider;", "isDebug", "", "()Z", "getDependency", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "putDependency", "", "instance", "(Ljava/lang/Class;Ljava/lang/Object;)V", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.i */
public interface IServiceContext {
    /* renamed from: a */
    <T> T mo52653a(Class<T> cls);

    /* renamed from: b */
    IDependencyProvider mo52654b();

    /* renamed from: c */
    Context mo52655c();

    /* renamed from: d */
    boolean mo52656d();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.api.i$a */
    public static final class C14414a {
        /* renamed from: a */
        public static <T> T m58037a(IServiceContext iVar, Class<T> cls) {
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            return (T) iVar.mo52654b().mo52632a(cls);
        }
    }
}
