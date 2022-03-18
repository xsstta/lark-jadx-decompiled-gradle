package com.ss.android.lark.profile.func.user_profile.infos.department;

import com.ss.android.lark.profile.func.user_profile.infos.listinfos.InfoListDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentItemListDataSource;", "Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListDataSource;", "Lcom/ss/android/lark/profile/func/user_profile/infos/department/DepartmentItemViewData;", "id", "", "name", "lst", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getData", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.department.a */
public final class DepartmentItemListDataSource extends InfoListDataSource<DepartmentItemViewData> {

    /* renamed from: a */
    private final List<DepartmentItemViewData> f130295a;

    @Override // com.ss.android.lark.profile.func.user_profile.infos.listinfos.InfoListDataSource
    /* renamed from: b */
    public List<DepartmentItemViewData> mo179870b() {
        return CollectionsKt.toList(this.f130295a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepartmentItemListDataSource(String str, String str2, List<DepartmentItemViewData> list) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(list, "lst");
        this.f130295a = list;
    }
}
