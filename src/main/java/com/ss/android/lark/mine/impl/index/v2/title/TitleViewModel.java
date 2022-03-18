package com.ss.android.lark.mine.impl.index.v2.title;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.mine.dto.C45427e;
import com.ss.android.lark.mine.dto.TenantCertificationInfo;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/title/TitleViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatter", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getChatter", "()Landroidx/lifecycle/MutableLiveData;", "isInZenSetting", "", "isLeanMode", "profileInfo", "Lcom/ss/android/lark/mine/dto/MineProfile;", "getProfileInfo", "tenantCertificationInfo", "Lkotlin/Result;", "Lcom/ss/android/lark/mine/dto/TenantCertificationInfo;", "getTenantCertificationInfo", "userStatus", "Lcom/bytedance/lark/pb/basic/v1/Chatter$ChatterCustomStatus;", "getUserStatus", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.title.a */
public final class TitleViewModel extends AbstractC1142af {
    private final C1177w<Chatter> chatter = new C1177w<>();
    private final C1177w<Boolean> isInZenSetting = new C1177w<>();
    private final C1177w<Boolean> isLeanMode = new C1177w<>();
    private final C1177w<C45427e> profileInfo = new C1177w<>();
    private final C1177w<Result<TenantCertificationInfo>> tenantCertificationInfo = new C1177w<>();
    private final C1177w<Chatter.ChatterCustomStatus> userStatus = new C1177w<>();

    public final C1177w<com.ss.android.lark.chat.entity.chatter.Chatter> getChatter() {
        return this.chatter;
    }

    public final C1177w<C45427e> getProfileInfo() {
        return this.profileInfo;
    }

    public final C1177w<Result<TenantCertificationInfo>> getTenantCertificationInfo() {
        return this.tenantCertificationInfo;
    }

    public final C1177w<Chatter.ChatterCustomStatus> getUserStatus() {
        return this.userStatus;
    }

    public final C1177w<Boolean> isInZenSetting() {
        return this.isInZenSetting;
    }

    public final C1177w<Boolean> isLeanMode() {
        return this.isLeanMode;
    }
}
