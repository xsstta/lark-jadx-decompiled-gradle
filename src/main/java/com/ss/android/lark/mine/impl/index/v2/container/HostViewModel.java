package com.ss.android.lark.mine.impl.index.v2.container;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.mine.dto.SidebarInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "sidebarInfoList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/lark/mine/dto/SidebarInfo;", "getSidebarInfoList", "()Landroidx/lifecycle/MutableLiveData;", "tenentInfos", "Lcom/ss/android/lark/passport/signinsdk_api/account/TenantInfo;", "getTenentInfos", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.container.a */
public final class HostViewModel extends AbstractC1142af {
    private final C1177w<List<SidebarInfo>> sidebarInfoList = new C1177w<>();
    private final C1177w<List<TenantInfo>> tenentInfos = new C1177w<>();

    public final C1177w<List<SidebarInfo>> getSidebarInfoList() {
        return this.sidebarInfoList;
    }

    public final C1177w<List<TenantInfo>> getTenentInfos() {
        return this.tenentInfos;
    }
}
