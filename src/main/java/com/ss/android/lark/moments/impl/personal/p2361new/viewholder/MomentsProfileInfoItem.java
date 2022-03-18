package com.ss.android.lark.moments.impl.personal.p2361new.viewholder;

import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0014\u0010\n\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0012XD¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileInfoItem;", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/IMomentsProfileInfo;", "postCount", "", "followerCount", "followingCount", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "isSelf", "", "disableFollow", "(IIILcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;ZZ)V", "getDisableFollow", "()Z", "getFollowerCount", "()I", "getFollowingCount", "id", "", "getId", "()Ljava/lang/String;", "getPostCount", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "getItemType", "isContentSame", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a.e */
public final class MomentsProfileInfoItem implements IMomentsProfileInfo {

    /* renamed from: a */
    private final String f120626a = "MomentsProfileHeaderItem";

    /* renamed from: b */
    private final int f120627b;

    /* renamed from: c */
    private final int f120628c;

    /* renamed from: d */
    private final int f120629d;

    /* renamed from: e */
    private final MomentsUserVM f120630e;

    /* renamed from: f */
    private final boolean f120631f;

    /* renamed from: g */
    private final boolean f120632g;

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f120626a;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: b */
    public MomentsUserVM mo167765b() {
        return this.f120630e;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: c */
    public boolean mo167766c() {
        return this.f120631f;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: d */
    public int mo167767d() {
        return this.f120628c;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: e */
    public int mo167768e() {
        return this.f120629d;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: f */
    public int mo167769f() {
        return this.f120627b;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileInfo
    /* renamed from: g */
    public boolean mo167770g() {
        return this.f120632g;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_INFO.ordinal();
    }

    /* renamed from: a */
    public boolean isItemSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase == null || !(iMomentsItemBase instanceof MomentsProfileInfoItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isContentSame(IMomentsItemBase iMomentsItemBase) {
        if (iMomentsItemBase != null && (iMomentsItemBase instanceof MomentsProfileInfoItem)) {
            MomentsProfileInfoItem eVar = (MomentsProfileInfoItem) iMomentsItemBase;
            if (mo167765b().mo166366e() == eVar.mo167765b().mo166366e() && mo167765b().mo166367f() == eVar.mo167765b().mo166367f() && mo167767d() == eVar.mo167767d() && mo167768e() == eVar.mo167768e() && mo167769f() == eVar.mo167769f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public MomentsProfileInfoItem(int i, int i2, int i3, MomentsUserVM gVar, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(gVar, "user");
        this.f120627b = i;
        this.f120628c = i2;
        this.f120629d = i3;
        this.f120630e = gVar;
        this.f120631f = z;
        this.f120632g = z2;
    }
}
