package com.ss.android.lark.todo.impl.features.detail.viewmodel;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.section.IActionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/AtChatterBean;", "Lcom/larksuite/framework/section/IActionData;", BottomDialog.f17198f, "", "displayName", "isOuter", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getChatterId", "()Ljava/lang/String;", "getDisplayName", "()Z", "setOuter", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.viewmodel.c */
public final class AtChatterBean implements IActionData {

    /* renamed from: a */
    private final String f140162a;

    /* renamed from: b */
    private final String f140163b;

    /* renamed from: c */
    private boolean f140164c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtChatterBean)) {
            return false;
        }
        AtChatterBean cVar = (AtChatterBean) obj;
        return Intrinsics.areEqual(this.f140162a, cVar.f140162a) && Intrinsics.areEqual(this.f140163b, cVar.f140163b) && this.f140164c == cVar.f140164c;
    }

    public int hashCode() {
        String str = this.f140162a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f140163b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f140164c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "AtChatterBean(chatterId=" + this.f140162a + ", displayName=" + this.f140163b + ", isOuter=" + this.f140164c + ")";
    }

    /* renamed from: a */
    public final String mo192982a() {
        return this.f140162a;
    }

    /* renamed from: b */
    public final String mo192984b() {
        return this.f140163b;
    }

    /* renamed from: c */
    public final boolean mo192985c() {
        return this.f140164c;
    }

    /* renamed from: a */
    public final void mo192983a(boolean z) {
        this.f140164c = z;
    }

    public AtChatterBean(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "displayName");
        this.f140162a = str;
        this.f140163b = str2;
        this.f140164c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AtChatterBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z);
    }
}
