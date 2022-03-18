package com.ss.android.lark.mm.base;

import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eJ\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/mm/base/MmActiveStateObservable;", "", "()V", "activePageCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "activePageCountChangeListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/base/MmActiveStateObservable$IActivePageCountChangeListener;", "isLogicExecutedWhenActiveMmPage", "", "timerSyncStatus", "Lio/reactivex/disposables/Disposable;", "whiteTokenList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "addActivePageCountChangeListeners", "", "listener", "addWhiteToken", "objectToken", "decreaseActivePageCount", "increaseActivePageCount", "pollStatus", "removeActivePageCountChangeListeners", "removeWhiteToken", "stopPollStatus", "syncStatus", "IActivePageCountChangeListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.base.c */
public final class MmActiveStateObservable {

    /* renamed from: a */
    public static final MmActiveStateObservable f115698a = new MmActiveStateObservable();

    /* renamed from: b */
    private static final AtomicInteger f115699b = new AtomicInteger();

    /* renamed from: c */
    private static final ArrayList<String> f115700c = new ArrayList<>();

    /* renamed from: d */
    private static final CopyOnWriteArrayList<IActivePageCountChangeListener> f115701d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private static boolean f115702e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/base/MmActiveStateObservable$IActivePageCountChangeListener;", "", "onChangeActivePageCounts", "", "activePageCount", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.base.c$a */
    public interface IActivePageCountChangeListener {
        /* renamed from: a */
        void mo161190a(int i);
    }

    private MmActiveStateObservable() {
    }

    /* renamed from: a */
    public final void mo161186a() {
        int incrementAndGet = f115699b.incrementAndGet();
        C45855f.m181663b("MmActiveStateObservable", "[increaseActivePageCount] count: " + incrementAndGet);
        if (!f115702e) {
            f115702e = true;
        }
        Iterator<IActivePageCountChangeListener> it = f115701d.iterator();
        while (it.hasNext()) {
            it.next().mo161190a(incrementAndGet);
        }
    }

    /* renamed from: b */
    public final void mo161188b() {
        int decrementAndGet = f115699b.decrementAndGet();
        C45855f.m181663b("MmActiveStateObservable", "[decreaseActivePageCount] count: " + decrementAndGet);
        Iterator<IActivePageCountChangeListener> it = f115701d.iterator();
        while (it.hasNext()) {
            it.next().mo161190a(decrementAndGet);
        }
    }

    /* renamed from: a */
    public final void mo161187a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        C45855f.m181664c("MmActiveStateObservable", "[addWhiteToken], " + str);
        f115700c.add(str);
    }

    /* renamed from: b */
    public final void mo161189b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        C45855f.m181664c("MmActiveStateObservable", "[removeWhiteToken], " + str);
        f115700c.remove(str);
    }
}
