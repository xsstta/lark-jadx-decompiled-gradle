package com.ss.android.lark.moments.impl.personal;

import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.UserProfile;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010 \u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u0014\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/MomentsProfileItem;", "Lcom/ss/android/lark/moments/impl/personal/IMomentsProfile;", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "profile", "Lcom/bytedance/lark/pb/moments/v1/UserProfile;", "followingAvatarImage", "", "Lcom/ss/android/lark/image/entity/AvatarImage;", "isSelf", "", "disableFollow", "(Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;Lcom/bytedance/lark/pb/moments/v1/UserProfile;Ljava/util/List;ZZ)V", "getDisableFollow", "()Z", "getFollowingAvatarImage", "()Ljava/util/List;", "id", "", "getId", "()Ljava/lang/String;", "getProfile", "()Lcom/bytedance/lark/pb/moments/v1/UserProfile;", "setProfile", "(Lcom/bytedance/lark/pb/moments/v1/UserProfile;)V", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "getItemType", "", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.i */
public final class MomentsProfileItem implements IMomentsProfile {

    /* renamed from: a */
    private final String f120567a = "MomentsProfileItem";

    /* renamed from: b */
    private final MomentsUserVM f120568b;

    /* renamed from: c */
    private UserProfile f120569c;

    /* renamed from: d */
    private final List<AvatarImage> f120570d;

    /* renamed from: e */
    private final boolean f120571e;

    /* renamed from: f */
    private final boolean f120572f;

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f120567a;
    }

    @Override // com.ss.android.lark.moments.impl.personal.IMomentsProfile
    /* renamed from: b */
    public MomentsUserVM mo167651b() {
        return this.f120568b;
    }

    @Override // com.ss.android.lark.moments.impl.personal.IMomentsProfile
    /* renamed from: c */
    public UserProfile mo167652c() {
        return this.f120569c;
    }

    @Override // com.ss.android.lark.moments.impl.personal.IMomentsProfile
    /* renamed from: d */
    public List<AvatarImage> mo167653d() {
        return this.f120570d;
    }

    @Override // com.ss.android.lark.moments.impl.personal.IMomentsProfile
    /* renamed from: e */
    public boolean mo167654e() {
        return this.f120571e;
    }

    @Override // com.ss.android.lark.moments.impl.personal.IMomentsProfile
    /* renamed from: f */
    public boolean mo167655f() {
        return this.f120572f;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_HEADER.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase == null || !(iMomentsItemBase instanceof MomentsProfileItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        ImageSet imageSet;
        ImageSet imageSet2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        if (!isItemSame(iMomentsItemBase)) {
            return false;
        }
        MomentsUserVM b = mo167651b();
        UserProfile c = mo167652c();
        if (iMomentsItemBase != null) {
            MomentsProfileItem iVar = (MomentsProfileItem) iMomentsItemBase;
            MomentsUserVM b2 = iVar.mo167651b();
            UserProfile c2 = iVar.mo167652c();
            if (!isItemSame(iMomentsItemBase) || !C26247a.m94983b(b, b2)) {
                return false;
            }
            Integer num8 = null;
            if (c != null) {
                imageSet = c.background_image;
            } else {
                imageSet = null;
            }
            if (c2 != null) {
                imageSet2 = c2.background_image;
            } else {
                imageSet2 = null;
            }
            if (!Intrinsics.areEqual(imageSet, imageSet2)) {
                return false;
            }
            if (c != null) {
                num = c.following_count;
            } else {
                num = null;
            }
            if (c2 != null) {
                num2 = c2.following_count;
            } else {
                num2 = null;
            }
            if (!Intrinsics.areEqual(num, num2)) {
                return false;
            }
            if (c != null) {
                num3 = c.follower_count;
            } else {
                num3 = null;
            }
            if (c2 != null) {
                num4 = c2.follower_count;
            } else {
                num4 = null;
            }
            if (!Intrinsics.areEqual(num3, num4)) {
                return false;
            }
            if (c != null) {
                num5 = c.reactions_count;
            } else {
                num5 = null;
            }
            if (c2 != null) {
                num6 = c2.reactions_count;
            } else {
                num6 = null;
            }
            if (!Intrinsics.areEqual(num5, num6)) {
                return false;
            }
            if (c != null) {
                num7 = c.posts_count;
            } else {
                num7 = null;
            }
            if (c2 != null) {
                num8 = c2.posts_count;
            }
            if (Intrinsics.areEqual(num7, num8)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.personal.MomentsProfileItem");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.image.entity.AvatarImage> */
    /* JADX WARN: Multi-variable type inference failed */
    public MomentsProfileItem(MomentsUserVM gVar, UserProfile userProfile, List<? extends AvatarImage> list, boolean z, boolean z2) {
        this.f120568b = gVar;
        this.f120569c = userProfile;
        this.f120570d = list;
        this.f120571e = z;
        this.f120572f = z2;
    }
}
