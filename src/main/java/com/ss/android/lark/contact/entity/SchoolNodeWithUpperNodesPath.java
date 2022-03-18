package com.ss.android.lark.contact.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/entity/SchoolNodeWithUpperNodesPath;", "", "node", "Lcom/ss/android/lark/contact/entity/SchoolParent;", "upperNodePath", "", "Lcom/ss/android/lark/contact/entity/SchoolNodeLite;", "(Lcom/ss/android/lark/contact/entity/SchoolParent;Ljava/util/List;)V", "getNode", "()Lcom/ss/android/lark/contact/entity/SchoolParent;", "setNode", "(Lcom/ss/android/lark/contact/entity/SchoolParent;)V", "getUpperNodePath", "()Ljava/util/List;", "setUpperNodePath", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_contact_contact-entity_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.contact.entity.c */
public final class SchoolNodeWithUpperNodesPath {

    /* renamed from: a */
    private SchoolParent f91454a;

    /* renamed from: b */
    private List<SchoolNodeLite> f91455b;

    public SchoolNodeWithUpperNodesPath() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolNodeWithUpperNodesPath)) {
            return false;
        }
        SchoolNodeWithUpperNodesPath cVar = (SchoolNodeWithUpperNodesPath) obj;
        return Intrinsics.areEqual(this.f91454a, cVar.f91454a) && Intrinsics.areEqual(this.f91455b, cVar.f91455b);
    }

    public int hashCode() {
        SchoolParent schoolParent = this.f91454a;
        int i = 0;
        int hashCode = (schoolParent != null ? schoolParent.hashCode() : 0) * 31;
        List<SchoolNodeLite> list = this.f91455b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SchoolNodeWithUpperNodesPath(node=" + this.f91454a + ", upperNodePath=" + this.f91455b + ")";
    }

    /* renamed from: a */
    public final SchoolParent mo130592a() {
        return this.f91454a;
    }

    /* renamed from: b */
    public final List<SchoolNodeLite> mo130595b() {
        return this.f91455b;
    }

    /* renamed from: a */
    public final void mo130593a(SchoolParent schoolParent) {
        this.f91454a = schoolParent;
    }

    /* renamed from: a */
    public final void mo130594a(List<SchoolNodeLite> list) {
        this.f91455b = list;
    }

    public SchoolNodeWithUpperNodesPath(SchoolParent schoolParent, List<SchoolNodeLite> list) {
        this.f91454a = schoolParent;
        this.f91455b = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchoolNodeWithUpperNodesPath(SchoolParent schoolParent, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : schoolParent, (i & 2) != 0 ? null : list);
    }
}
