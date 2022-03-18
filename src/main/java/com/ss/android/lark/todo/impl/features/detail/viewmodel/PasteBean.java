package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/PasteBean;", "Lcom/larksuite/framework/section/IActionData;", "content", "", "selection", "", "(Ljava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getSelection", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.s */
public final class PasteBean implements IActionData {

    /* renamed from: a */
    private final String f140189a;

    /* renamed from: b */
    private final int f140190b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasteBean)) {
            return false;
        }
        PasteBean sVar = (PasteBean) obj;
        return Intrinsics.areEqual(this.f140189a, sVar.f140189a) && this.f140190b == sVar.f140190b;
    }

    public int hashCode() {
        String str = this.f140189a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f140190b;
    }

    public String toString() {
        return "PasteBean(content=" + this.f140189a + ", selection=" + this.f140190b + ")";
    }

    /* renamed from: a */
    public final String mo193037a() {
        return this.f140189a;
    }

    /* renamed from: b */
    public final int mo193038b() {
        return this.f140190b;
    }

    public PasteBean(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        this.f140189a = str;
        this.f140190b = i;
    }
}
