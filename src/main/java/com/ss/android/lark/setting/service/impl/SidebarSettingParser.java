package com.ss.android.lark.setting.service.impl;

import com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse;
import com.ss.android.lark.setting.dto.SidebarInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/setting/service/impl/SidebarSettingParser;", "", "()V", "parseFormPB", "", "Lcom/ss/android/lark/setting/dto/SidebarInfo;", "response", "Lcom/bytedance/lark/pb/passport/v1/GetUserSidebarResponse;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.service.impl.g */
public final class SidebarSettingParser {

    /* renamed from: a */
    public static final SidebarSettingParser f134971a = new SidebarSettingParser();

    private SidebarSettingParser() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<SidebarInfo> m211990a(GetUserSidebarResponse getUserSidebarResponse) {
        int i;
        Intrinsics.checkParameterIsNotNull(getUserSidebarResponse, "response");
        List<GetUserSidebarResponse.SidebarInfo> list = getUserSidebarResponse.sidebar_infos;
        Intrinsics.checkExpressionValueIsNotNull(list, "response.sidebar_infos");
        List<GetUserSidebarResponse.SidebarInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            if (t.sidebar_type == GetUserSidebarResponse.SidebarType.ADMIN) {
                i = SidebarInfo.f134003c.mo185295a();
            } else {
                i = SidebarInfo.f134003c.mo185296b();
            }
            String str = t.sidebar_icon;
            String str2 = t.sidebar_link;
            Boolean bool = t.sidebar_isshow;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.sidebar_isshow");
            arrayList.add(new SidebarInfo(i, str, str2, bool.booleanValue()));
        }
        return arrayList;
    }
}
