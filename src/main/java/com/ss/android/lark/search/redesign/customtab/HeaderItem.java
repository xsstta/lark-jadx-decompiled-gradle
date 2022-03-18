package com.ss.android.lark.search.redesign.customtab;

import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.p943f.p944a.AbstractC20975h;
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder;
import com.xwray.groupie.kotlinandroidextensions.Item;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0014\u0010\u0010\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/HeaderItem;", "Lcom/xwray/groupie/kotlinandroidextensions/Item;", "title", "", "(Ljava/lang/String;)V", "bind", "", "viewHolder", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "position", "", "equals", "", "other", "", "getLayout", "hasSameContentAs", "Lcom/xwray/groupie/Item;", "hashCode", "isClickable", "isSameAs", "toString", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.c */
public final class HeaderItem extends Item {

    /* renamed from: b */
    private final String f132653b;

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public int mo71038a() {
        return R.layout.custom_tab_header_layout;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: c */
    public boolean mo71049c() {
        return false;
    }

    public String toString() {
        return this.f132653b;
    }

    public int hashCode() {
        return this.f132653b.hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderItem(String str) {
        super((long) str.hashCode());
        Intrinsics.checkParameterIsNotNull(str, "title");
        this.f132653b = str;
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: a */
    public boolean mo71044a(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        return equals(hVar);
    }

    @Override // com.p943f.p944a.AbstractC20975h
    /* renamed from: b */
    public boolean mo71047b(AbstractC20975h<?> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "other");
        return equals(hVar);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.search.redesign.customtab.HeaderItem");
        } else if (!Intrinsics.areEqual(this.f132653b, ((HeaderItem) obj).f132653b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public void mo71041a(GroupieViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        View view = aVar.itemView;
        if (view != null) {
            ((TextView) view).setText(this.f132653b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }
}
