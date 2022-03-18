package com.bytedance.ee.bear.middleground.permission.collaborator;

import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/AvatarLoadHelper;", "", "()V", "loadAvatar", "", "avatar", "Lcom/larksuite/component/universe_design/image/UDAvatar;", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a */
public final class AvatarLoadHelper {

    /* renamed from: a */
    public static final AvatarLoadHelper f25748a = new AvatarLoadHelper();

    private AvatarLoadHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39732a(UDAvatar uDAvatar, UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(uDAvatar, "avatar");
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        if (userInfo.getOwnerType() == 11 || userInfo.getOwnerType() == 5) {
            uDAvatar.setBorderStyle(1);
            uDAvatar.setImageResource(R.drawable.share_ic_sharefolder);
        } else if (userInfo.getOwnerType() == 8) {
            uDAvatar.setBorderStyle(0);
            uDAvatar.setImageResource(R.drawable.share_ic_link);
        } else if (userInfo.getOwnerType() == 14) {
            uDAvatar.setBorderStyle(0);
            uDAvatar.setImageResource(R.drawable.share_ic_vc_follow);
        } else if (userInfo.getOwnerType() == 16 || userInfo.getOwnerType() == 23 || userInfo.getOwnerType() == 24) {
            uDAvatar.setBorderStyle(0);
            uDAvatar.setImageResource(R.drawable.share_ic_space);
        } else if (userInfo.getOwnerType() == 18) {
            uDAvatar.setBorderStyle(0);
            uDAvatar.setImageResource(R.drawable.icon_collaborator_organization);
        } else {
            uDAvatar.setBorderStyle(0);
            ImageLoader.with(uDAvatar.getContext()).load(new C13664a(userInfo.getAvatarUrl())).placeholder(R.drawable.facade_common_avatar_place_holder).into(uDAvatar);
        }
    }
}
