package com.bytedance.ies.bullet.service.base.api;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H&¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0010\t\u001a\u0004\u0018\u0001H\u0003H&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/api/IDependencyProvider;", "", "get", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "put", "", "instance", "(Ljava/lang/Class;Ljava/lang/Object;)V", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.api.d */
public interface IDependencyProvider {
    /* renamed from: a */
    <T> T mo52632a(Class<T> cls);

    /* renamed from: a */
    <T> void mo52633a(Class<T> cls, T t);
}
