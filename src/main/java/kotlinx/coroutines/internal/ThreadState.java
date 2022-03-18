package kotlinx.coroutines.internal;

import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import com.ss.android.vesdk.C64034n;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "context", "Lkotlin/coroutines/CoroutineContext;", C64034n.f161683a, "", "(Lkotlin/coroutines/CoroutineContext;I)V", AbstractC60044a.f149675a, "", "[Ljava/lang/Object;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "i", "append", "", "value", "start", "take", "kotlinx-coroutines-core"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.internal.ai */
public final class ThreadState {

    /* renamed from: a */
    private Object[] f173815a;

    /* renamed from: b */
    private int f173816b;

    /* renamed from: c */
    private final CoroutineContext f173817c;

    /* renamed from: b */
    public final void mo242977b() {
        this.f173816b = 0;
    }

    /* renamed from: c */
    public final CoroutineContext mo242978c() {
        return this.f173817c;
    }

    /* renamed from: a */
    public final Object mo242975a() {
        Object[] objArr = this.f173815a;
        int i = this.f173816b;
        this.f173816b = i + 1;
        return objArr[i];
    }

    /* renamed from: a */
    public final void mo242976a(Object obj) {
        Object[] objArr = this.f173815a;
        int i = this.f173816b;
        this.f173816b = i + 1;
        objArr[i] = obj;
    }

    public ThreadState(CoroutineContext fVar, int i) {
        this.f173817c = fVar;
        this.f173815a = new Object[i];
    }
}
