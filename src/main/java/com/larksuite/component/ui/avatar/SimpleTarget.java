package com.larksuite.component.ui.avatar;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/ui/avatar/SimpleTarget;", "Lcom/larksuite/component/ui/avatar/IAvatarTarget;", "()V", "setAvatarIcon", "", "iconViewData", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "setBadge", "badgeViewData", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "setMiniIcon", "miniIconViewData", "Lcom/larksuite/component/ui/avatar/MiniIconViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.x */
public abstract class SimpleTarget implements IAvatarTarget {
    @Override // com.larksuite.component.ui.avatar.IAvatarTarget
    /* renamed from: a */
    public void mo89024a(AvatarIconViewData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "iconViewData");
    }

    @Override // com.larksuite.component.ui.avatar.IAvatarTarget
    /* renamed from: a */
    public void mo89025a(BadgeViewData cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "badgeViewData");
    }

    @Override // com.larksuite.component.ui.avatar.IAvatarTarget
    /* renamed from: a */
    public void mo89026a(MiniIconViewData vVar) {
        Intrinsics.checkParameterIsNotNull(vVar, "miniIconViewData");
    }
}
