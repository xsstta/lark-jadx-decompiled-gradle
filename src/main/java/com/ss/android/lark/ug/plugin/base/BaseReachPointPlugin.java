package com.ss.android.lark.ug.plugin.base;

import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ug_reach.MaterialBase;
import com.ss.android.lark.ug.common.ApmUtils;
import com.ss.android.lark.ug.plugin.ContainerServiceProvider;
import com.ss.android.lark.ug.plugin.ReachPointPlugin;
import com.ss.android.lark.ug.plugin.base.BaseReachPoint;
import com.ss.android.lark.ug.plugin.entity.ReachPointEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u0000*\u001c\b\u0000\u0010\u0001*\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002j\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\u0003*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00010\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00040\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0012H&¢\u0006\u0002\u0010\u0019J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R4\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00010\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/lark/ug/plugin/base/BaseReachPointPlugin;", "DATA", "Lcom/squareup/wire/Message;", "Lcom/ss/android/lark/ug/plugin/ReachPointData;", "RP", "Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "Lcom/ss/android/lark/ug/plugin/ReachPointPlugin;", "()V", "<set-?>", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/ug/plugin/ContainerServiceProvider;", "containerServiceRef", "getContainerServiceRef", "()Ljava/lang/ref/WeakReference;", "setContainerServiceRef$ug_reach_sdk_release", "(Ljava/lang/ref/WeakReference;)V", "reachPointMap", "", "", "getAvailableReachPoints", "", "getMaterialBase", "Lcom/ss/android/lark/pb/ug_reach/MaterialBase;", "reachPointId", "getReachPoint", "(Ljava/lang/String;)Lcom/ss/android/lark/ug/plugin/base/BaseReachPoint;", "obtainReachPoint", "onCreateReachPoint", "onEnterBackground", "", "onEnterForeground", "onHide", "", "onShow", "bytes", "", "recycleReachPoint", "ug-reach-sdk_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.plugin.a.b */
public abstract class BaseReachPointPlugin<DATA extends Message<?, ?>, RP extends BaseReachPoint<DATA>> implements ReachPointPlugin<DATA, RP> {

    /* renamed from: b */
    private final Map<String, RP> f141744b = new ConcurrentHashMap();

    /* renamed from: c */
    private WeakReference<ContainerServiceProvider> f141745c;

    /* renamed from: e */
    public abstract RP mo195232e(String str);

    @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
    /* renamed from: b */
    public List<RP> mo195228b() {
        return new ArrayList(this.f141744b.values());
    }

    /* renamed from: a */
    public final void mo195226a(WeakReference<ContainerServiceProvider> weakReference) {
        this.f141745c = weakReference;
    }

    /* renamed from: g */
    private final RP m223332g(String str) {
        RP rp = this.f141744b.get(str);
        if (rp != null) {
            return rp;
        }
        Log.m165389i("ReachPointPlugin", "reachPoint not found in reachPointMap");
        return (RP) null;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
    /* renamed from: c */
    public MaterialBase mo195230c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        RP g = m223332g(str);
        if (g != null) {
            return g.mo194544f();
        }
        return null;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
    /* renamed from: d */
    public boolean mo195231d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        RP g = m223332g(str);
        if (g != null) {
            return g.mo194543e();
        }
        return false;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
    /* renamed from: b */
    public void mo195229b(String str) {
        ContainerServiceProvider bVar;
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        RP remove = this.f141744b.remove(str);
        if (remove != null) {
            remove.mo194543e();
            remove.mo194545g();
            WeakReference<ContainerServiceProvider> weakReference = this.f141745c;
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                bVar.mo195234a(new ReachPointEvent(str, mo195260a(), new ReachPointEvent.Event("onDestroy", false, 2, null), null, null, 24, null), (IGetDataCallback<Boolean>) null);
            }
        }
    }

    /* renamed from: f */
    public RP mo195225a(String str) {
        ContainerServiceProvider bVar;
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        RP rp = this.f141744b.get(str);
        if (rp == null) {
            rp = mo195232e(str);
            rp.mo195213a(this.f141745c);
            rp.mo194541c();
            this.f141744b.put(str, rp);
            WeakReference<ContainerServiceProvider> weakReference = this.f141745c;
            if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
                bVar.mo195234a(new ReachPointEvent(str, mo195260a(), new ReachPointEvent.Event("onCreate", false, 2, null), null, null, 24, null), (IGetDataCallback<Boolean>) null);
            }
        }
        return rp;
    }

    @Override // com.ss.android.lark.ug.plugin.ReachPointPlugin
    /* renamed from: a */
    public boolean mo195227a(String str, byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(str, "reachPointId");
        Intrinsics.checkParameterIsNotNull(bArr, "bytes");
        RP g = m223332g(str);
        if (g != null) {
            try {
                g.mo194533a(g.mo195211a(bArr));
                return g.mo194542d();
            } catch (Exception e) {
                Log.m165384e("ReachPointPlugin", "onShow error", e);
                ApmUtils.m222517a("ug_reach_container_deserialize_error", MapsKt.mapOf(TuplesKt.to("rpId", str)), null, null, 12, null);
            }
        }
        return false;
    }
}
