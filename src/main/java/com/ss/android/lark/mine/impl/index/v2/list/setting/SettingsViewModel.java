package com.ss.android.lark.mine.impl.index.v2.list.setting;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "hasNewVersion", "Landroidx/lifecycle/MutableLiveData;", "", "getHasNewVersion", "()Landroidx/lifecycle/MutableLiveData;", "isShowUpdateRedDot", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.list.setting.a */
public final class SettingsViewModel extends AbstractC1142af {
    private final C1177w<Boolean> hasNewVersion = new C1177w<>();
    private final C1177w<Boolean> isShowUpdateRedDot = new C1177w<>();

    public final C1177w<Boolean> getHasNewVersion() {
        return this.hasNewVersion;
    }

    public final C1177w<Boolean> isShowUpdateRedDot() {
        return this.isShowUpdateRedDot;
    }
}
