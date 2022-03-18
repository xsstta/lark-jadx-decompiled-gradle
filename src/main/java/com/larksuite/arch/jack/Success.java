package com.larksuite.arch.jack;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00028\u0000HÂ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u000e\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0010\u0010\u0003\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/larksuite/arch/jack/Success;", "T", "Lcom/larksuite/arch/jack/Async;", "value", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/larksuite/arch/jack/Success;", "equals", "", "other", "", "hashCode", "", "invoke", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.w */
public final class Success<T> extends Async<T> {

    /* renamed from: a */
    private final T f59441a;

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Success) && Intrinsics.areEqual(this.f59441a, ((Success) obj).f59441a);
        }
        return true;
    }

    public int hashCode() {
        T t = this.f59441a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Success(value=" + ((Object) this.f59441a) + ")";
    }

    @Override // com.larksuite.arch.jack.Async
    /* renamed from: a */
    public T mo86206a() {
        return this.f59441a;
    }

    public Success(T t) {
        super(null);
        this.f59441a = t;
    }
}
