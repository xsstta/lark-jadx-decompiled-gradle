package com.ss.android.lark.contact.dto;

import com.ss.android.lark.contact.entity.SchoolNodeWithUpperNodesPath;
import com.ss.android.lark.contact.entity.SchoolParent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/contact/dto/SchoolContactStructureResponse;", "", "schoolContactStructure", "", "Lcom/ss/android/lark/contact/entity/SchoolNodeWithUpperNodesPath;", "superAdminNode", "Lcom/ss/android/lark/contact/entity/SchoolParent;", "(Ljava/util/List;Lcom/ss/android/lark/contact/entity/SchoolParent;)V", "getSchoolContactStructure", "()Ljava/util/List;", "setSchoolContactStructure", "(Ljava/util/List;)V", "getSuperAdminNode", "()Lcom/ss/android/lark/contact/entity/SchoolParent;", "setSuperAdminNode", "(Lcom/ss/android/lark/contact/entity/SchoolParent;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.dto.f */
public final class SchoolContactStructureResponse {

    /* renamed from: a */
    private List<SchoolNodeWithUpperNodesPath> f91428a;

    /* renamed from: b */
    private SchoolParent f91429b;

    public SchoolContactStructureResponse() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchoolContactStructureResponse)) {
            return false;
        }
        SchoolContactStructureResponse fVar = (SchoolContactStructureResponse) obj;
        return Intrinsics.areEqual(this.f91428a, fVar.f91428a) && Intrinsics.areEqual(this.f91429b, fVar.f91429b);
    }

    public int hashCode() {
        List<SchoolNodeWithUpperNodesPath> list = this.f91428a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        SchoolParent schoolParent = this.f91429b;
        if (schoolParent != null) {
            i = schoolParent.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SchoolContactStructureResponse(schoolContactStructure=" + this.f91428a + ", superAdminNode=" + this.f91429b + ")";
    }

    /* renamed from: a */
    public final List<SchoolNodeWithUpperNodesPath> mo130392a() {
        return this.f91428a;
    }

    /* renamed from: b */
    public final SchoolParent mo130395b() {
        return this.f91429b;
    }

    /* renamed from: a */
    public final void mo130393a(SchoolParent schoolParent) {
        this.f91429b = schoolParent;
    }

    /* renamed from: a */
    public final void mo130394a(List<SchoolNodeWithUpperNodesPath> list) {
        this.f91428a = list;
    }

    public SchoolContactStructureResponse(List<SchoolNodeWithUpperNodesPath> list, SchoolParent schoolParent) {
        this.f91428a = list;
        this.f91429b = schoolParent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchoolContactStructureResponse(List list, SchoolParent schoolParent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : schoolParent);
    }
}
