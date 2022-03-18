package com.ss.android.lark.profile.func.v3.userprofile.fields.department;

import com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos.InfoListDataSourceV3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentItemListDataSourceV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/listinfos/InfoListDataSourceV3;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/department/DepartmentNameViewDataV3;", "id", "", "name", "list", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getData", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.d.a */
public final class DepartmentItemListDataSourceV3 extends InfoListDataSourceV3<DepartmentNameViewDataV3> {

    /* renamed from: a */
    private final List<DepartmentNameViewDataV3> f130495a;

    @Override // com.ss.android.lark.profile.func.v3.userprofile.fields.listinfos.InfoListDataSourceV3
    /* renamed from: a */
    public List<DepartmentNameViewDataV3> mo180257a() {
        return CollectionsKt.toList(this.f130495a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentItemListDataSourceV3(String str, String str2, List<DepartmentNameViewDataV3> list) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f130495a = list;
    }
}
