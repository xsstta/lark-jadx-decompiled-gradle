package com.ss.ugc.effectplatform.repository;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.collections.SharedMutableSet;
import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.io.file.FileManager;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.UseComplexDiff;
import com.ss.ugc.effectplatform.listener.IFetchEffectListener;
import com.ss.ugc.effectplatform.model.C65519b;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.util.EffectUtilKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J \u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/ugc/effectplatform/repository/EffectDownloadManager;", "", "()V", "downloadingEffects", "Lbytekn/foundation/collections/SharedMutableMap;", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "downloadingEffectsListener", "Lbytekn/foundation/collections/SharedMutableSet;", "Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "addDownloadListener", "", "effect", "iFetchEffectListener", "addDownloadingEffects", "currentDownloadingEffects", "", "destroy", "failedDownloadEffect", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "finishDownloadEffect", "isDownloaded", "", "isDownloading", "effectMd5", "onEffectDownloadProgressChange", "progress", "", "totalSize", "", "startDownloadEffect", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.b */
public final class EffectDownloadManager {

    /* renamed from: a */
    public static final EffectDownloadManager f164921a = new EffectDownloadManager();

    /* renamed from: b */
    private static final SharedMutableMap<String, Effect> f164922b = new SharedMutableMap<>(true);

    /* renamed from: c */
    private static final SharedMutableMap<String, SharedMutableSet<IFetchEffectListener>> f164923c = new SharedMutableMap<>(true);

    private EffectDownloadManager() {
    }

    /* renamed from: a */
    public final boolean mo227806a(String str) {
        if (str != null) {
            return f164922b.containsKey(str);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo227809d(Effect effect) {
        String a;
        if (effect != null && (a = C65519b.m256862a(effect)) != null) {
            f164922b.put(a, effect);
        }
    }

    /* renamed from: b */
    public final void mo227807b(Effect effect) {
        String a;
        if (effect != null && (a = C65519b.m256862a(effect)) != null) {
            SharedMutableSet<IFetchEffectListener> cVar = f164923c.get(a);
            if (cVar != null) {
                Iterator<T> it = cVar.iterator();
                while (it.hasNext()) {
                    it.next().mo207370a(effect);
                }
            }
            f164923c.remove(a);
            f164922b.remove(a);
        }
    }

    /* renamed from: c */
    public final void mo227808c(Effect effect) {
        String a;
        SharedMutableSet<IFetchEffectListener> cVar;
        if (effect != null && (a = C65519b.m256862a(effect)) != null && (cVar = f164923c.get(a)) != null) {
            Iterator<T> it = cVar.iterator();
            while (it.hasNext()) {
                it.next().mo207367a(effect);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo227805a(Effect effect) {
        boolean z = false;
        if (effect != null && !StringsKt.isBlank(effect.getId())) {
            if (mo227806a(C65519b.m256862a(effect))) {
                return false;
            }
            z = FileManager.f5817a.mo8730f(effect.getUnzipPath());
            if (UseComplexDiff.f164911a.mo227796a() && z) {
                long a = DefaultClock.f5722a.mo8623a();
                boolean a2 = EffectUtilKt.m257038a(effect.getUnzipPath());
                Logger bVar = Logger.f5760a;
                bVar.mo8662a("checkEffect", "checkEffectChildrenFile effect: " + effect.getEffect_id() + ", name: " + effect.getName() + ", result: " + a2 + ", time cost: " + (DefaultClock.f5722a.mo8623a() - a));
                return a2;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo227803a(Effect effect, IFetchEffectListener dVar) {
        String str;
        String a;
        Intrinsics.checkParameterIsNotNull(dVar, "iFetchEffectListener");
        if (effect != null) {
            str = C65519b.m256862a(effect);
        } else {
            str = null;
        }
        if (!mo227806a(str)) {
            if (mo227805a(effect)) {
                dVar.mo207370a((Object) effect);
            }
        } else if (effect != null && (a = C65519b.m256862a(effect)) != null) {
            SharedMutableMap<String, SharedMutableSet<IFetchEffectListener>> bVar = f164923c;
            SharedMutableSet<IFetchEffectListener> cVar = bVar.get(a);
            if (cVar == null) {
                cVar = new SharedMutableSet<>(true);
                bVar.put(a, cVar);
            }
            cVar.add(dVar);
        }
    }

    /* renamed from: a */
    public final void mo227804a(Effect effect, ExceptionResult cVar) {
        String a;
        Intrinsics.checkParameterIsNotNull(cVar, "e");
        if (effect != null && (a = C65519b.m256862a(effect)) != null) {
            SharedMutableSet<IFetchEffectListener> cVar2 = f164923c.get(a);
            if (cVar2 != null) {
                Iterator<T> it = cVar2.iterator();
                while (it.hasNext()) {
                    it.next().mo207371a(effect, cVar);
                }
            }
            f164923c.remove(a);
            f164922b.remove(a);
        }
    }

    /* renamed from: a */
    public final void mo227802a(Effect effect, int i, long j) {
        String a;
        SharedMutableSet<IFetchEffectListener> cVar;
        if (effect != null && (a = C65519b.m256862a(effect)) != null && (cVar = f164923c.get(a)) != null) {
            Iterator<T> it = cVar.iterator();
            while (it.hasNext()) {
                it.next().mo207368a(effect, i, j);
            }
        }
    }
}
