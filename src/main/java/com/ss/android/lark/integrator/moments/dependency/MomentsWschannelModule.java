package com.ss.android.lark.integrator.moments.dependency;

import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.moments.dependency.idependency.IConnStateListener;
import com.ss.android.lark.moments.dependency.idependency.IWschannelModuleDependency;
import com.ss.android.lark.utils.ApiUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/integrator/moments/dependency/MomentsWschannelModule;", "Lcom/ss/android/lark/moments/dependency/idependency/IWschannelModuleDependency;", "()V", "connStateListenerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/moments/dependency/idependency/IConnStateListener;", "Lcom/ss/android/lark/biz/core/api/WSConnState$ConnStateListener;", "coreApi", "Lcom/ss/android/lark/biz/core/api/ICoreApi;", "kotlin.jvm.PlatformType", "addConnStateListener", "", "listener", "removeConnStateListener", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.moments.a.r */
public final class MomentsWschannelModule implements IWschannelModuleDependency {

    /* renamed from: a */
    private final ICoreApi f101591a = ((ICoreApi) ApiUtils.getApi(ICoreApi.class));

    /* renamed from: b */
    private final ConcurrentHashMap<IConnStateListener, WSConnState.AbstractC29537a> f101592b = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/biz/core/api/WSConnState$ConnState;", "onConnStateChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.moments.a.r$a */
    static final class C39904a implements WSConnState.AbstractC29537a {

        /* renamed from: a */
        final /* synthetic */ IConnStateListener f101593a;

        C39904a(IConnStateListener fVar) {
            this.f101593a = fVar;
        }

        @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
        /* renamed from: a */
        public final void mo102563a(WSConnState.ConnState connState) {
            boolean z;
            IConnStateListener fVar = this.f101593a;
            if (connState == WSConnState.ConnState.Connected) {
                z = true;
            } else {
                z = false;
            }
            fVar.mo165895a(z);
        }
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IWschannelModuleDependency
    /* renamed from: a */
    public void mo144730a(IConnStateListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        C39904a aVar = new C39904a(fVar);
        this.f101592b.put(fVar, aVar);
        this.f101591a.addConnStateListener(aVar);
    }

    @Override // com.ss.android.lark.moments.dependency.idependency.IWschannelModuleDependency
    /* renamed from: b */
    public void mo144731b(IConnStateListener fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "listener");
        WSConnState.AbstractC29537a aVar = this.f101592b.get(fVar);
        if (aVar != null) {
            this.f101592b.remove(fVar);
            this.f101591a.removeConnStateListener(aVar);
        }
    }
}
