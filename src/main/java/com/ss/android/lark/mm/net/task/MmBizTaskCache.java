package com.ss.android.lark.mm.net.task;

import android.os.SystemClock;
import com.ss.android.lark.mm.net.C47066b;
import com.ss.android.lark.mm.net.MmHttpResponse;
import com.ss.android.lark.mm.net.p2333b.AbstractC47069b;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u001e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002RB\u0010\u0004\u001a6\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00070\u0005j\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007`\tX\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u0005j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b`\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/net/task/MmBizTaskCache;", "T", "Lcom/ss/android/lark/mm/net/cache/IMmNetCache;", "()V", "pendingCallbacks", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/net/MmHttpRequest;", "", "Lcom/ss/android/lark/mm/net/callback/IHttpCallback;", "Lkotlin/collections/HashMap;", "responseCache", "Lcom/ss/android/lark/mm/net/MmHttpResponse;", "getCache", "", "request", "callback", "isCacheValid", "", "isRequesting", "putCache", "response", "removeCache", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.net.task.a */
public final class MmBizTaskCache<T> {

    /* renamed from: c */
    public static volatile MmBizTaskCache<?> f118497c;

    /* renamed from: d */
    public static final Companion f118498d = new Companion(null);

    /* renamed from: a */
    public final HashMap<C47066b, MmHttpResponse<T>> f118499a;

    /* renamed from: b */
    public final HashMap<C47066b, List<AbstractC47069b<T>>> f118500b;

    @JvmStatic
    /* renamed from: a */
    public static final <T> MmBizTaskCache<T> m186360a() {
        return f118498d.mo165346a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0006\"\u0004\b\u0001\u0010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/net/task/MmBizTaskCache$Companion;", "", "()V", "CACHE_VALID_TIME", "", "mInstance", "Lcom/ss/android/lark/mm/net/task/MmBizTaskCache;", "getInstance", "T", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.task.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final <T> MmBizTaskCache<T> mo165346a() {
            if (MmBizTaskCache.f118497c == null) {
                synchronized (MmBizTaskCache.class) {
                    if (MmBizTaskCache.f118497c == null) {
                        MmBizTaskCache.f118497c = new MmBizTaskCache<>(null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            MmBizTaskCache<T> aVar = (MmBizTaskCache<T>) MmBizTaskCache.f118497c;
            if (aVar != null) {
                return aVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.mm.net.task.MmBizTaskCache<T>");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.task.a$b */
    public static final class RunnableC47076b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmBizTaskCache f118501a;

        /* renamed from: b */
        final /* synthetic */ C47066b f118502b;

        RunnableC47076b(MmBizTaskCache aVar, C47066b bVar) {
            this.f118501a = aVar;
            this.f118502b = bVar;
        }

        public final void run() {
            this.f118501a.f118500b.remove(this.f118502b);
            this.f118501a.f118499a.remove(this.f118502b);
        }
    }

    private MmBizTaskCache() {
        this.f118499a = new HashMap<>();
        this.f118500b = new HashMap<>();
    }

    public /* synthetic */ MmBizTaskCache(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    private final boolean m186361a(C47066b bVar) {
        if (this.f118499a.get(bVar) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m186363c(C47066b bVar) {
        C45859k.m181686a(new RunnableC47076b(this, bVar), 2000);
    }

    /* renamed from: b */
    private final boolean m186362b(C47066b bVar) {
        MmHttpResponse<T> cVar = this.f118499a.get(bVar);
        if (cVar == null || SystemClock.elapsedRealtime() - cVar.mo165314c() > 2000) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo165344a(C47066b bVar, AbstractC47069b<T> bVar2) {
        T t;
        Intrinsics.checkParameterIsNotNull(bVar, "request");
        Intrinsics.checkParameterIsNotNull(bVar2, "callback");
        if (m186361a(bVar)) {
            List<AbstractC47069b<T>> list = this.f118500b.get(bVar);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(bVar2);
                this.f118500b.put(bVar, arrayList);
            } else {
                list.add(bVar2);
            }
            C45855f.m181664c("MmBizTaskCache", "put pending callbacks, url: " + bVar.f118452c + ", size: " + this.f118500b.size() + '}');
        } else if (m186362b(bVar)) {
            C45855f.m181664c("MmBizTaskCache", "cache Valid, request: " + bVar.hashCode());
            MmHttpResponse<T> cVar = this.f118499a.get(bVar);
            if (cVar != null) {
                t = cVar.mo165312a();
            } else {
                t = null;
            }
            if (t == null) {
                bVar2.mo161288a(C47068a.f118475j);
                return;
            }
            bVar2.mo161289a((Object) t);
            this.f118500b.remove(bVar);
            this.f118499a.remove(bVar);
        } else {
            C45855f.m181664c("MmBizTaskCache", "request from network, request: url:" + bVar.f118452c + ", hashCode: " + bVar.hashCode());
            bVar2.mo161288a(C47068a.f118475j);
        }
    }

    /* renamed from: a */
    public void mo165345a(C47066b bVar, MmHttpResponse<T> cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "request");
        Intrinsics.checkParameterIsNotNull(cVar, "response");
        this.f118499a.put(bVar, cVar);
        StringBuilder sb = new StringBuilder();
        sb.append("thread: ");
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        sb.append(", put cache, request: url:");
        sb.append(bVar.f118452c);
        sb.append(", hashCode: ");
        sb.append(bVar.hashCode());
        sb.append(", pending size: ");
        sb.append(this.f118500b.size());
        sb.append(", responseCache size: ");
        sb.append(this.f118499a.size());
        C45855f.m181663b("MmBizTaskCache", sb.toString());
        List<AbstractC47069b<T>> list = this.f118500b.get(bVar);
        if (list != null) {
            if (cVar.mo165312a() != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo161289a(cVar.mo165312a());
                }
            } else if (cVar.mo165313b() != null) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().mo161288a(cVar.mo165313b());
                }
            }
            this.f118500b.remove(bVar);
            this.f118499a.remove(bVar);
        } else {
            m186363c(bVar);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("thread: ");
        Thread currentThread2 = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread2, "Thread.currentThread()");
        sb2.append(currentThread2.getName());
        sb2.append(", after cache: ");
        sb2.append(bVar.hashCode());
        sb2.append(", pending size: ");
        sb2.append(this.f118500b.size());
        sb2.append(", responseCache size: ");
        sb2.append(this.f118499a.size());
        C45855f.m181663b("MmBizTaskCache", sb2.toString());
    }
}
