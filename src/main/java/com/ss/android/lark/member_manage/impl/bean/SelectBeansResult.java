package com.ss.android.lark.member_manage.impl.bean;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "", "showSearch", "", "selectBeans", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "preSelectedBeans", "", "", "hasQuickBar", "(ZLjava/util/List;Ljava/util/Map;Z)V", "getHasQuickBar", "()Z", "getPreSelectedBeans", "()Ljava/util/Map;", "getSelectBeans", "()Ljava/util/List;", "getShowSearch", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.bean.d */
public final class SelectBeansResult {

    /* renamed from: a */
    private final boolean f114147a;

    /* renamed from: b */
    private final List<C45084c> f114148b;

    /* renamed from: c */
    private final Map<String, C45084c> f114149c;

    /* renamed from: d */
    private final boolean f114150d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectBeansResult)) {
            return false;
        }
        SelectBeansResult dVar = (SelectBeansResult) obj;
        return this.f114147a == dVar.f114147a && Intrinsics.areEqual(this.f114148b, dVar.f114148b) && Intrinsics.areEqual(this.f114149c, dVar.f114149c) && this.f114150d == dVar.f114150d;
    }

    public int hashCode() {
        boolean z = this.f114147a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<C45084c> list = this.f114148b;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, C45084c> map = this.f114149c;
        if (map != null) {
            i6 = map.hashCode();
        }
        int i7 = (hashCode + i6) * 31;
        boolean z2 = this.f114150d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i7 + i;
    }

    public String toString() {
        return "SelectBeansResult(showSearch=" + this.f114147a + ", selectBeans=" + this.f114148b + ", preSelectedBeans=" + this.f114149c + ", hasQuickBar=" + this.f114150d + ")";
    }

    /* renamed from: a */
    public final boolean mo159515a() {
        return this.f114147a;
    }

    /* renamed from: b */
    public final List<C45084c> mo159516b() {
        return this.f114148b;
    }

    /* renamed from: c */
    public final Map<String, C45084c> mo159517c() {
        return this.f114149c;
    }

    /* renamed from: d */
    public final boolean mo159518d() {
        return this.f114150d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends com.ss.android.lark.member_manage.impl.bean.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public SelectBeansResult(boolean z, List<C45084c> list, Map<String, ? extends C45084c> map, boolean z2) {
        Intrinsics.checkParameterIsNotNull(list, "selectBeans");
        Intrinsics.checkParameterIsNotNull(map, "preSelectedBeans");
        this.f114147a = z;
        this.f114148b = list;
        this.f114149c = map;
        this.f114150d = z2;
    }
}
