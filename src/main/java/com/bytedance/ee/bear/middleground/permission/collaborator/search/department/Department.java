package com.bytedance.ee.bear.middleground.permission.collaborator.search.department;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.existmember.Member;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B]\u0012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006¢\u0006\u0002\u0010\rJ\u0019\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J\u0019\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006HÆ\u0003Ja\u0010\u001e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020\nJ\t\u0010%\u001a\u00020&HÖ\u0001R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0004j\b\u0012\u0004\u0012\u00020\b`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/Department;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "visibleDepartments", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleDepartment;", "Lkotlin/collections/ArrayList;", "visibleTopUserInDep", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/department/VisibleTopUserInDep;", "hasMore", "", "existsMembers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/existmember/Member;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/util/ArrayList;)V", "getExistsMembers", "()Ljava/util/ArrayList;", "setExistsMembers", "(Ljava/util/ArrayList;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getVisibleDepartments", "setVisibleDepartments", "getVisibleTopUserInDep", "setVisibleTopUserInDep", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Department extends NetService.Result<Serializable> {
    private ArrayList<Member> existsMembers;
    private boolean hasMore;
    private ArrayList<VisibleDepartment> visibleDepartments;
    private ArrayList<VisibleTopUserInDep> visibleTopUserInDep;

    public Department() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.middleground.permission.collaborator.search.department.Department */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Department copy$default(Department department, ArrayList arrayList, ArrayList arrayList2, boolean z, ArrayList arrayList3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = department.visibleDepartments;
        }
        if ((i & 2) != 0) {
            arrayList2 = department.visibleTopUserInDep;
        }
        if ((i & 4) != 0) {
            z = department.hasMore;
        }
        if ((i & 8) != 0) {
            arrayList3 = department.existsMembers;
        }
        return department.copy(arrayList, arrayList2, z, arrayList3);
    }

    public final ArrayList<VisibleDepartment> component1() {
        return this.visibleDepartments;
    }

    public final ArrayList<VisibleTopUserInDep> component2() {
        return this.visibleTopUserInDep;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final ArrayList<Member> component4() {
        return this.existsMembers;
    }

    public final Department copy(ArrayList<VisibleDepartment> arrayList, ArrayList<VisibleTopUserInDep> arrayList2, boolean z, ArrayList<Member> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "visibleDepartments");
        Intrinsics.checkParameterIsNotNull(arrayList2, "visibleTopUserInDep");
        Intrinsics.checkParameterIsNotNull(arrayList3, "existsMembers");
        return new Department(arrayList, arrayList2, z, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Department) {
                Department department = (Department) obj;
                if (Intrinsics.areEqual(this.visibleDepartments, department.visibleDepartments) && Intrinsics.areEqual(this.visibleTopUserInDep, department.visibleTopUserInDep)) {
                    if (!(this.hasMore == department.hasMore) || !Intrinsics.areEqual(this.existsMembers, department.existsMembers)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ArrayList<VisibleDepartment> arrayList = this.visibleDepartments;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList<VisibleTopUserInDep> arrayList2 = this.visibleTopUserInDep;
        int hashCode2 = (hashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        ArrayList<Member> arrayList3 = this.existsMembers;
        if (arrayList3 != null) {
            i = arrayList3.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "Department(visibleDepartments=" + this.visibleDepartments + ", visibleTopUserInDep=" + this.visibleTopUserInDep + ", hasMore=" + this.hasMore + ", existsMembers=" + this.existsMembers + ")";
    }

    public final ArrayList<Member> getExistsMembers() {
        return this.existsMembers;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final ArrayList<VisibleDepartment> getVisibleDepartments() {
        return this.visibleDepartments;
    }

    public final ArrayList<VisibleTopUserInDep> getVisibleTopUserInDep() {
        return this.visibleTopUserInDep;
    }

    public final boolean isEmpty() {
        if (!this.visibleDepartments.isEmpty() || !this.visibleTopUserInDep.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setExistsMembers(ArrayList<Member> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.existsMembers = arrayList;
    }

    public final void setVisibleDepartments(ArrayList<VisibleDepartment> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.visibleDepartments = arrayList;
    }

    public final void setVisibleTopUserInDep(ArrayList<VisibleTopUserInDep> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "<set-?>");
        this.visibleTopUserInDep = arrayList;
    }

    public Department(ArrayList<VisibleDepartment> arrayList, ArrayList<VisibleTopUserInDep> arrayList2, boolean z, ArrayList<Member> arrayList3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "visibleDepartments");
        Intrinsics.checkParameterIsNotNull(arrayList2, "visibleTopUserInDep");
        Intrinsics.checkParameterIsNotNull(arrayList3, "existsMembers");
        this.visibleDepartments = arrayList;
        this.visibleTopUserInDep = arrayList2;
        this.hasMore = z;
        this.existsMembers = arrayList3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Department(ArrayList arrayList, ArrayList arrayList2, boolean z, ArrayList arrayList3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new ArrayList() : arrayList3);
    }
}
