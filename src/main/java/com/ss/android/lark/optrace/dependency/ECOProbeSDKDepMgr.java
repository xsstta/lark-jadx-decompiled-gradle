package com.ss.android.lark.optrace.dependency;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/optrace/dependency/ECOProbeSDKDepMgr;", "", "()V", "dependency", "Lcom/ss/android/lark/optrace/dependency/IHostDependency;", "getDependency", "()Lcom/ss/android/lark/optrace/dependency/IHostDependency;", "setDependency", "(Lcom/ss/android/lark/optrace/dependency/IHostDependency;)V", "initHostDependency", "", "OPTrace_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.optrace.a.a */
public final class ECOProbeSDKDepMgr {

    /* renamed from: a */
    public static final ECOProbeSDKDepMgr f122918a = new ECOProbeSDKDepMgr();

    /* renamed from: b */
    private static IHostDependency f122919b = new C48928a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/optrace/dependency/ECOProbeSDKDepMgr$dependency$1", "Lcom/ss/android/lark/optrace/dependency/IHostDependency;", "getFgValue", "", "fgKey", "", "getMinaConfigValue", "configKey", "OPTrace_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.optrace.a.a$a */
    public static final class C48928a implements IHostDependency {
        @Override // com.ss.android.lark.optrace.dependency.IHostDependency
        /* renamed from: a */
        public String mo144737a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "configKey");
            return "";
        }

        @Override // com.ss.android.lark.optrace.dependency.IHostDependency
        /* renamed from: b */
        public boolean mo144738b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "fgKey");
            return false;
        }

        C48928a() {
        }
    }

    private ECOProbeSDKDepMgr() {
    }

    /* renamed from: a */
    public final IHostDependency mo170892a() {
        return f122919b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192760a(IHostDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        f122919b = bVar;
    }
}
