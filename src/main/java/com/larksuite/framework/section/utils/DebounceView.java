package com.larksuite.framework.section.utils;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/larksuite/framework/section/utils/DebounceView;", "", "view", "Landroid/view/View;", "lastClickTime", "", "(Landroid/view/View;J)V", "getLastClickTime", "()J", "setLastClickTime", "(J)V", "getView", "()Landroid/view/View;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.framework.a.a.c */
public final class DebounceView {

    /* renamed from: a */
    private final View f64018a;

    /* renamed from: b */
    private long f64019b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebounceView)) {
            return false;
        }
        DebounceView cVar = (DebounceView) obj;
        return Intrinsics.areEqual(this.f64018a, cVar.f64018a) && this.f64019b == cVar.f64019b;
    }

    public int hashCode() {
        View view = this.f64018a;
        return ((view != null ? view.hashCode() : 0) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.f64019b);
    }

    public String toString() {
        return "DebounceView(view=" + this.f64018a + ", lastClickTime=" + this.f64019b + ")";
    }

    /* renamed from: a */
    public final View mo92054a() {
        return this.f64018a;
    }

    /* renamed from: b */
    public final long mo92056b() {
        return this.f64019b;
    }

    /* renamed from: a */
    public final void mo92055a(long j) {
        this.f64019b = j;
    }

    public DebounceView(View view, long j) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.f64018a = view;
        this.f64019b = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DebounceView(View view, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? 0 : j);
    }
}
