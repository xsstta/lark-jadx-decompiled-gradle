package com.ss.ugc.effectplatform.listener;

import bytekn.foundation.collections.SharedMutableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0006\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u0005J\"\u0010\f\u001a\u00020\b\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0006J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/ugc/effectplatform/listener/CallbackManager;", "", "()V", "effectPlatformBaseListeners", "Lbytekn/foundation/collections/SharedMutableMap;", "", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "destroy", "", "getEffectPlatformBaseListener", "T", "taskId", "putEffectPlatformBaseListener", "listener", "removeEffectPlatformBaseListener", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.d.a */
public final class CallbackManager {

    /* renamed from: a */
    private final SharedMutableMap<String, IEffectPlatformBaseListener<?>> f164881a = new SharedMutableMap<>(true);

    /* renamed from: b */
    public final void mo227755b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        this.f164881a.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* renamed from: a */
    public final <T> IEffectPlatformBaseListener<T> mo227753a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        IEffectPlatformBaseListener<?> bVar = this.f164881a.get(str);
        if (!(bVar instanceof IEffectPlatformBaseListener)) {
            bVar = null;
        }
        IEffectPlatformBaseListener<T> bVar2 = (IEffectPlatformBaseListener) bVar;
        if (bVar2 != null) {
            return bVar2;
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo227754a(String str, IEffectPlatformBaseListener<T> bVar) {
        Intrinsics.checkParameterIsNotNull(str, "taskId");
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f164881a.put(str, bVar);
    }
}
