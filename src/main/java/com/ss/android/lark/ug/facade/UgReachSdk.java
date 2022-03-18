package com.ss.android.lark.ug.facade;

import com.squareup.wire.Message;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import com.ss.android.lark.ug.facade.bean.UGRequestUserAgent;
import com.ss.android.lark.ug.integrator.UgReachSdkIntegrator;
import com.ss.android.lark.ug.plugin.ReachPoint;
import com.ss.android.lark.ug.plugin.base.BaseReachPoint;
import com.ss.android.lark.ug.scheduler.common.entity.ReachPointAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002*+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J?\u0010\u0012\u001a\u0004\u0018\u0001H\u0013\"\f\b\u0000\u0010\u0013*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001aJA\u0010\u001b\u001a\u00020\n\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u001c0\u0014\"\u001c\b\u0001\u0010\u001c*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001dj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u001e2\u0006\u0010\u001f\u001a\u0002H\u0013¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004J\u001c\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u001c\u0010%\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b)¨\u0006,"}, d2 = {"Lcom/ss/android/lark/ug/facade/UgReachSdk;", "", "(Ljava/lang/String;I)V", "dependency", "Lcom/ss/android/lark/ug/facade/UgReachSdk$UgSdkDependency;", "getDependency$ug_reach_sdk_release", "()Lcom/ss/android/lark/ug/facade/UgReachSdk$UgSdkDependency;", "setDependency$ug_reach_sdk_release", "(Lcom/ss/android/lark/ug/facade/UgReachSdk$UgSdkDependency;)V", "destroy", "", "getVisibleReachPoints", "", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "isAnyExclusiveReachPoint", "", "onlySid", "", "obtainReachPointById", "RP", "Lcom/ss/android/lark/ug/plugin/ReachPoint;", "reachPointId", "reachPointClazz", "Ljava/lang/Class;", "provider", "Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;", "(Ljava/lang/String;Ljava/lang/Class;Lcom/ss/android/lark/ug/facade/bean/BizContextProvider;)Lcom/ss/android/lark/ug/plugin/ReachPoint;", "recycleReachPoint", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "reachPoint", "(Lcom/ss/android/lark/ug/plugin/ReachPoint;)V", "setUserAgent", "info", "Lcom/ss/android/lark/ug/facade/bean/UGRequestUserAgent;", "setup", "tryExpose", "reachPointAction", "Lcom/ss/android/lark/ug/scheduler/common/entity/ReachPointAction;", "scenarioId", "INSTANCE", "Companion", "UgSdkDependency", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum UgReachSdk {
    INSTANCE;
    
    public static final Companion Companion = new Companion(null);
    private UgSdkDependency dependency;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/ug/facade/UgReachSdk$UgSdkDependency;", "", "openUrl", "", "url", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.facade.UgReachSdk$b */
    public interface UgSdkDependency {
        /* renamed from: a */
        void mo103094a(String str);
    }

    public final boolean isAnyExclusiveReachPoint(String str) {
        return false;
    }

    public final <RP extends ReachPoint<?>> RP obtainReachPointById(String str, Class<RP> cls) {
        return (RP) obtainReachPointById$default(this, str, cls, null, 4, null);
    }

    public final void setUserAgent(UGRequestUserAgent bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "info");
    }

    public final void tryExpose(ReachPointAction aVar) {
        tryExpose$default(this, aVar, (BizContextProvider) null, 2, (Object) null);
    }

    public final void tryExpose(String str) {
        tryExpose$default(this, str, (BizContextProvider) null, 2, (Object) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ug/facade/UgReachSdk$Companion;", "", "()V", "TAG", "", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.facade.UgReachSdk$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final UgSdkDependency getDependency$ug_reach_sdk_release() {
        return this.dependency;
    }

    public final void destroy() {
        UgReachSdkIntegrator.f141653a.mo195134c();
    }

    public final List<BaseReachPoint<?>> getVisibleReachPoints() {
        return CollectionsKt.emptyList();
    }

    public final void setDependency$ug_reach_sdk_release(UgSdkDependency bVar) {
        this.dependency = bVar;
    }

    public final <RP extends ReachPoint<DATA>, DATA extends Message<?, ?>> void recycleReachPoint(RP rp) {
        Intrinsics.checkParameterIsNotNull(rp, "reachPoint");
        UgReachSdkIntegrator.f141653a.mo195127a(rp);
    }

    public final void setup(UgSdkDependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.dependency = bVar;
        UgReachSdkIntegrator.f141653a.mo195123a();
    }

    public final void tryExpose(ReachPointAction aVar, BizContextProvider aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "reachPointAction");
        UgReachSdkIntegrator.f141653a.mo195128a(aVar, aVar2);
    }

    public final void tryExpose(String str, BizContextProvider aVar) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
        UgReachSdkIntegrator.f141653a.mo195131a(str, aVar);
    }

    public final <RP extends ReachPoint<?>> RP obtainReachPointById(String str, Class<RP> cls, BizContextProvider aVar) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(cls, "reachPointClazz");
        return (RP) UgReachSdkIntegrator.f141653a.mo195122a(str, cls, aVar);
    }

    public static /* synthetic */ void tryExpose$default(UgReachSdk ugReachSdk, ReachPointAction aVar, BizContextProvider aVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        ugReachSdk.tryExpose(aVar, aVar2);
    }

    public static /* synthetic */ void tryExpose$default(UgReachSdk ugReachSdk, String str, BizContextProvider aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        ugReachSdk.tryExpose(str, aVar);
    }

    public static /* synthetic */ ReachPoint obtainReachPointById$default(UgReachSdk ugReachSdk, String str, Class cls, BizContextProvider aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        return ugReachSdk.obtainReachPointById(str, cls, aVar);
    }
}
