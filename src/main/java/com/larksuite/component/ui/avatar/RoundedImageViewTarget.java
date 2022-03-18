package com.larksuite.component.ui.avatar;

import android.graphics.drawable.Drawable;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/avatar/RoundedImageViewTarget;", "Lcom/larksuite/component/ui/avatar/ImageViewTarget;", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "imageView", "(Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;)V", "setAvatarIcon", "", "iconViewData", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.w */
public final class RoundedImageViewTarget extends ImageViewTarget<LKUIRoundedImageView> {

    /* renamed from: a */
    private final LKUIRoundedImageView f62499a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedImageViewTarget(LKUIRoundedImageView lKUIRoundedImageView) {
        super(lKUIRoundedImageView);
        Intrinsics.checkParameterIsNotNull(lKUIRoundedImageView, "imageView");
        this.f62499a = lKUIRoundedImageView;
    }

    @Override // com.larksuite.component.ui.avatar.ImageViewTarget, com.larksuite.component.ui.avatar.IAvatarTarget, com.larksuite.component.ui.avatar.SimpleTarget
    /* renamed from: a */
    public void mo89024a(AvatarIconViewData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "iconViewData");
        super.mo89024a(aVar);
        Drawable h = aVar.mo88997h();
        if (h != null) {
            this.f62499a.setBorderDrawable(h);
        } else {
            this.f62499a.setBorderDrawable(null);
        }
    }
}
