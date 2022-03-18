package com.ss.android.lark.mm.net;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/net/MmHttpResponse;", "T", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "error", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "time", "", "(Ljava/lang/Object;Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;J)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "getTime", "()J", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;J)Lcom/ss/android/lark/mm/net/MmHttpResponse;", "equals", "", "other", "hashCode", "", "toString", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.net.c */
public final class MmHttpResponse<T> {

    /* renamed from: a */
    private final T f118483a;

    /* renamed from: b */
    private final C47068a f118484b;

    /* renamed from: c */
    private final long f118485c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmHttpResponse)) {
            return false;
        }
        MmHttpResponse cVar = (MmHttpResponse) obj;
        return Intrinsics.areEqual(this.f118483a, cVar.f118483a) && Intrinsics.areEqual(this.f118484b, cVar.f118484b) && this.f118485c == cVar.f118485c;
    }

    public int hashCode() {
        T t = this.f118483a;
        int i = 0;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        C47068a aVar = this.f118484b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        long j = this.f118485c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MmHttpResponse(data=" + ((Object) this.f118483a) + ", error=" + this.f118484b + ", time=" + this.f118485c + ")";
    }

    /* renamed from: a */
    public final T mo165312a() {
        return this.f118483a;
    }

    /* renamed from: b */
    public final C47068a mo165313b() {
        return this.f118484b;
    }

    /* renamed from: c */
    public final long mo165314c() {
        return this.f118485c;
    }

    public MmHttpResponse(T t, C47068a aVar, long j) {
        this.f118483a = t;
        this.f118484b = aVar;
        this.f118485c = j;
    }
}
