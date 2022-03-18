package com.ss.android.lark.search.redesign.customtab;

import com.p943f.p944a.AbstractC20975h;
import com.p943f.p944a.C20972g;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/redesign/customtab/BaseTabItem;", "VH", "Lcom/xwray/groupie/GroupieViewHolder;", "Lcom/xwray/groupie/Item;", "id", "", "unmovable", "", "primaryOnly", "added", "(JZZZ)V", "getAdded", "()Z", "getPrimaryOnly", "getUnmovable", "toAddedItem", "toRemovedItem", "toggle", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.redesign.customtab.a */
public abstract class BaseTabItem<VH extends C20972g> extends AbstractC20975h<VH> {

    /* renamed from: b */
    private final boolean f132639b;

    /* renamed from: c */
    private final boolean f132640c;

    /* renamed from: d */
    private final boolean f132641d;

    /* renamed from: d */
    public abstract BaseTabItem<VH> mo183243d();

    /* renamed from: e */
    public abstract BaseTabItem<VH> mo183244e();

    /* renamed from: f */
    public abstract BaseTabItem<VH> mo183246f();

    /* renamed from: g */
    public final boolean mo183275g() {
        return this.f132639b;
    }

    /* renamed from: h */
    public final boolean mo183276h() {
        return this.f132640c;
    }

    /* renamed from: i */
    public final boolean mo183277i() {
        return this.f132641d;
    }

    public BaseTabItem(long j, boolean z, boolean z2, boolean z3) {
        super(j);
        this.f132639b = z;
        this.f132640c = z2;
        this.f132641d = z3;
    }
}
