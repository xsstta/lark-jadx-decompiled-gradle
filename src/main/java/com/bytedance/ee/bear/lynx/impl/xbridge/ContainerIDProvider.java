package com.bytedance.ee.bear.lynx.impl.xbridge;

import com.bytedance.ies.xbridge.api.IContainerIDProvider;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/xbridge/ContainerIDProvider;", "Lcom/bytedance/ies/xbridge/api/IContainerIDProvider;", "()V", "id", "", "provideContainerID", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.xbridge.b */
public final class ContainerIDProvider implements IContainerIDProvider {

    /* renamed from: a */
    private final String f23804a;

    /* renamed from: a */
    public String mo33964a() {
        return this.f23804a;
    }

    public ContainerIDProvider() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        this.f23804a = uuid;
    }
}
