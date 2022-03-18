package com.ss.android.ugc.effectmanager.effect.repository.newrepo;

import com.ss.android.ugc.effectmanager.common.C60495a;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60530h;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60564d;
import com.ss.android.ugc.effectmanager.effect.p3057b.AbstractC60570j;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\tJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J \u0010\u001a\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/repository/newrepo/EffectDownloadManager;", "", "()V", "downloadingEffects", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "downloadingEffectsListener", "Lcom/ss/android/ugc/effectmanager/common/ConcurrentHashSet;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListener;", "addDownloadEffect", "", "effect", "addDownloadListener", "iFetchEffectListener", "currentDownloadingEffects", "", "destroy", "failedDownloadEffect", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "finishDownloadEffect", "isDownloaded", "", "isDownloading", "effectFileMd5", "onEffectDownloadProgressChange", "progress", "", "totalSize", "", "startDownloadEffect", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.c.a.a */
public final class EffectDownloadManager {

    /* renamed from: a */
    public static final EffectDownloadManager f151455a = new EffectDownloadManager();

    /* renamed from: b */
    private static final ConcurrentHashMap<String, Effect> f151456b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<String, C60495a<AbstractC60570j>> f151457c = new ConcurrentHashMap<>();

    private EffectDownloadManager() {
    }

    /* renamed from: a */
    public final boolean mo207408a(String str) {
        if (str != null) {
            return f151456b.containsKey(str);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo207411d(Effect effect) {
        String a;
        if (effect != null && (a = C60530h.m235257a(effect)) != null) {
            f151456b.put(a, effect);
        }
    }

    /* renamed from: a */
    public final boolean mo207407a(Effect effect) {
        if (effect == null || mo207408a(C60530h.m235257a(effect))) {
            return false;
        }
        return FileUtils.f151342a.mo207251a(effect.getUnzipPath());
    }

    /* renamed from: b */
    public final void mo207409b(Effect effect) {
        String a;
        if (effect != null && (a = C60530h.m235257a(effect)) != null) {
            C60495a<AbstractC60570j> aVar = f151457c.get(a);
            if (aVar != null) {
                Iterator<T> it = aVar.iterator();
                while (it.hasNext()) {
                    it.next().mo207223a(effect);
                }
            }
            f151457c.remove(a);
            f151456b.remove(a);
        }
    }

    /* renamed from: c */
    public final void mo207410c(Effect effect) {
        String a;
        C60495a<AbstractC60570j> aVar;
        if (effect != null && (a = C60530h.m235257a(effect)) != null && (aVar = f151457c.get(a)) != null) {
            Iterator<T> it = aVar.iterator();
            while (it.hasNext()) {
                it.next().mo207390a(effect);
            }
        }
    }

    /* renamed from: a */
    public final void mo207405a(Effect effect, C60519c cVar) {
        String a;
        Intrinsics.checkParameterIsNotNull(cVar, "e");
        if (effect != null && (a = C60530h.m235257a(effect)) != null) {
            C60495a<AbstractC60570j> aVar = f151457c.get(a);
            if (aVar != null) {
                Iterator<T> it = aVar.iterator();
                while (it.hasNext()) {
                    it.next().mo207391a(effect, cVar);
                }
            }
            f151457c.remove(a);
            f151456b.remove(a);
        }
    }

    /* renamed from: a */
    public final void mo207406a(Effect effect, AbstractC60570j jVar) {
        C60495a<AbstractC60570j> putIfAbsent;
        Intrinsics.checkParameterIsNotNull(jVar, "iFetchEffectListener");
        if (effect == null) {
            return;
        }
        if (mo207408a(C60530h.m235257a(effect))) {
            String a = C60530h.m235257a(effect);
            if (a != null) {
                ConcurrentHashMap<String, C60495a<AbstractC60570j>> concurrentHashMap = f151457c;
                C60495a<AbstractC60570j> aVar = concurrentHashMap.get(a);
                if (aVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a, (aVar = new C60495a<>()))) != null) {
                    aVar = putIfAbsent;
                }
                aVar.add(jVar);
            }
        } else if (mo207407a(effect)) {
            jVar.mo207223a((Object) effect);
        } else {
            jVar.mo207391a(effect, new C60519c(10005));
        }
    }

    /* renamed from: a */
    public final void mo207404a(Effect effect, int i, long j) {
        String a;
        C60495a<AbstractC60570j> aVar;
        if (!(effect == null || (a = C60530h.m235257a(effect)) == null || (aVar = f151457c.get(a)) == null)) {
            for (T t : aVar) {
                if (t instanceof AbstractC60564d) {
                    t.mo207384a(effect, i, j);
                }
            }
        }
    }
}
