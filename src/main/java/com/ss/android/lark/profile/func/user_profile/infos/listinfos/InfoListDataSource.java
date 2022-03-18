package com.ss.android.lark.profile.func.user_profile.infos.listinfos;

import com.ss.android.lark.profile.func.user_profile.infos.BaseInfoViewData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/infos/listinfos/InfoListDataSource;", "D", "Lcom/ss/android/lark/profile/func/user_profile/infos/BaseInfoViewData;", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getData", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.user_profile.infos.d.a */
public abstract class InfoListDataSource<D extends BaseInfoViewData> extends BaseInfoViewData {
    /* renamed from: b */
    public abstract List<D> mo179870b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoListDataSource(String str, String str2) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "id");
    }
}
