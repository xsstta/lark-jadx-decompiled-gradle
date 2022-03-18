package com.larksuite.arch.jack;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/larksuite/arch/jack/Fail;", "T", "Lcom/larksuite/arch/jack/Async;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "jack_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.arch.jack.g */
public final class Fail<T> extends Async<T> {

    /* renamed from: a */
    private final Throwable f59415a;

    public String toString() {
        return "Fail(error=" + this.f59415a + ")";
    }

    /* renamed from: b */
    public final Throwable mo86216b() {
        return this.f59415a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Reflection.getOrCreateKotlinClass(this.f59415a.getClass()), this.f59415a.getMessage(), this.f59415a.getStackTrace()[0]});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Fail(Throwable th) {
        super(null);
        Intrinsics.checkParameterIsNotNull(th, "error");
        this.f59415a = th;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Fail)) {
            return false;
        }
        Throwable th = ((Fail) obj).f59415a;
        if (!Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.f59415a.getClass()), Reflection.getOrCreateKotlinClass(th.getClass())) || !Intrinsics.areEqual(this.f59415a.getMessage(), th.getMessage()) || !Intrinsics.areEqual(this.f59415a.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
