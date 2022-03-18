package com.ss.android.lark.moments.impl.personal;

import com.bytedance.lark.pb.moments.v1.UserProfile;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/IMomentsProfile;", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "disableFollow", "", "getDisableFollow", "()Z", "followingAvatarImage", "", "Lcom/ss/android/lark/image/entity/AvatarImage;", "getFollowingAvatarImage", "()Ljava/util/List;", "isSelf", "profile", "Lcom/bytedance/lark/pb/moments/v1/UserProfile;", "getProfile", "()Lcom/bytedance/lark/pb/moments/v1/UserProfile;", "setProfile", "(Lcom/bytedance/lark/pb/moments/v1/UserProfile;)V", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.a */
public interface IMomentsProfile extends IMomentsItemBase {
    /* renamed from: b */
    MomentsUserVM mo167651b();

    /* renamed from: c */
    UserProfile mo167652c();

    /* renamed from: d */
    List<AvatarImage> mo167653d();

    /* renamed from: e */
    boolean mo167654e();

    /* renamed from: f */
    boolean mo167655f();
}
