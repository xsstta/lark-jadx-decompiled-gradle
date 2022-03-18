package com.bytedance.ee.lark.infra.foundation.dependency;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/lark/infra/foundation/dependency/DependencyMgr;", "", "()V", "dependency", "Lcom/bytedance/ee/lark/infra/foundation/dependency/ICommonDependency;", "dependency$annotations", "getDependency", "()Lcom/bytedance/ee/lark/infra/foundation/dependency/ICommonDependency;", "setDependency", "(Lcom/bytedance/ee/lark/infra/foundation/dependency/ICommonDependency;)V", "networkDependency", "Lcom/bytedance/ee/lark/infra/foundation/dependency/INetworkDependency;", "networkDependency$annotations", "getNetworkDependency", "()Lcom/bytedance/ee/lark/infra/foundation/dependency/INetworkDependency;", "setNetworkDependency", "(Lcom/bytedance/ee/lark/infra/foundation/dependency/INetworkDependency;)V", "initCommonDependency", "", "ECOInfra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.lark.infra.foundation.a.a */
public final class DependencyMgr {

    /* renamed from: a */
    public static ICommonDependency f34159a;

    /* renamed from: b */
    public static INetworkDependency f34160b;

    /* renamed from: c */
    public static final DependencyMgr f34161c = new DependencyMgr();

    private DependencyMgr() {
    }

    /* renamed from: a */
    public static final ICommonDependency m52809a() {
        ICommonDependency bVar = f34159a;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dependency");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final INetworkDependency m52811b() {
        INetworkDependency cVar = f34160b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("networkDependency");
        }
        return cVar;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m52810a(ICommonDependency bVar, INetworkDependency cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(cVar, "networkDependency");
        f34159a = bVar;
        f34160b = cVar;
    }
}
