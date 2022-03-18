package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/SummaryInlineInfo;", "Lcom/larksuite/framework/section/IActionData;", "showFullScreenAt", "", "chatId", "", "(ZLjava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getShowFullScreenAt", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.w */
public final class SummaryInlineInfo implements IActionData {

    /* renamed from: a */
    private final boolean f140199a;

    /* renamed from: b */
    private final String f140200b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryInlineInfo)) {
            return false;
        }
        SummaryInlineInfo wVar = (SummaryInlineInfo) obj;
        return this.f140199a == wVar.f140199a && Intrinsics.areEqual(this.f140200b, wVar.f140200b);
    }

    public int hashCode() {
        boolean z = this.f140199a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f140200b;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SummaryInlineInfo(showFullScreenAt=" + this.f140199a + ", chatId=" + this.f140200b + ")";
    }

    /* renamed from: a */
    public final boolean mo193059a() {
        return this.f140199a;
    }

    /* renamed from: b */
    public final String mo193060b() {
        return this.f140200b;
    }

    public SummaryInlineInfo(boolean z, String str) {
        this.f140199a = z;
        this.f140200b = str;
    }
}
