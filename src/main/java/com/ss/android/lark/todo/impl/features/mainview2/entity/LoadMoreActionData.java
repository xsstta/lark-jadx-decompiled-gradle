package com.ss.android.lark.todo.impl.features.mainview2.entity;

import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview2/entity/LoadMoreActionData;", "Lcom/larksuite/framework/section/IActionData;", "isForceFetch", "", "totalItemCount", "", "(ZI)V", "()Z", "setForceFetch", "(Z)V", "getTotalItemCount", "()I", "setTotalItemCount", "(I)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.a.e */
public final class LoadMoreActionData implements IActionData {

    /* renamed from: a */
    private boolean f140560a;

    /* renamed from: b */
    private int f140561b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadMoreActionData)) {
            return false;
        }
        LoadMoreActionData eVar = (LoadMoreActionData) obj;
        return this.f140560a == eVar.f140560a && this.f140561b == eVar.f140561b;
    }

    public int hashCode() {
        boolean z = this.f140560a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return (i * 31) + this.f140561b;
    }

    public String toString() {
        return "LoadMoreActionData(isForceFetch=" + this.f140560a + ", totalItemCount=" + this.f140561b + ")";
    }

    /* renamed from: a */
    public final boolean mo193507a() {
        return this.f140560a;
    }

    /* renamed from: b */
    public final int mo193508b() {
        return this.f140561b;
    }

    public LoadMoreActionData(boolean z, int i) {
        this.f140560a = z;
        this.f140561b = i;
    }
}
