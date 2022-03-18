package com.ss.android.lark.moments.impl.personal.p2361new.viewholder;

import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/moments/impl/personal/new/viewholder/MomentsProfileDisableFollowInfoItem;", "Lcom/ss/android/lark/moments/impl/personal/new/viewholder/IMomentsProfileDisableFollowInfo;", "user", "Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "postCount", "", "reactionCount", "(Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;II)V", "id", "", "getId", "()Ljava/lang/String;", "getPostCount", "()I", "getReactionCount", "getUser", "()Lcom/ss/android/lark/moments/impl/commonvo/MomentsUserVM;", "getItemType", "isContentSame", "", "diffable", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "isItemSame", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.personal.new.a.c */
public final class MomentsProfileDisableFollowInfoItem implements IMomentsProfileDisableFollowInfo {

    /* renamed from: a */
    private final String f120620a = "MomentsProfileDisableFollowInfoItem";

    /* renamed from: b */
    private final MomentsUserVM f120621b;

    /* renamed from: c */
    private final int f120622c;

    /* renamed from: d */
    private final int f120623d;

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: a */
    public String mo166379a() {
        return this.f120620a;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileDisableFollowInfo
    /* renamed from: b */
    public MomentsUserVM mo167762b() {
        return this.f120621b;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileDisableFollowInfo
    /* renamed from: c */
    public int mo167763c() {
        return this.f120622c;
    }

    @Override // com.ss.android.lark.moments.impl.personal.p2361new.viewholder.IMomentsProfileDisableFollowInfo
    /* renamed from: d */
    public int mo167764d() {
        return this.f120623d;
    }

    @Override // com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase
    /* renamed from: t */
    public int mo166408t() {
        return IMomentsItemBase.ItemType.ITEM_TYPE_PROFILE_DISABLE_FOLLOW_INFO.ordinal();
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
        if (iMomentsItemBase != null && (iMomentsItemBase instanceof IMomentsProfileDisableFollowInfo)) {
            IMomentsProfileDisableFollowInfo aVar = (IMomentsProfileDisableFollowInfo) iMomentsItemBase;
            if (mo167763c() == aVar.mo167763c() && mo167764d() == aVar.mo167764d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public MomentsProfileDisableFollowInfoItem(MomentsUserVM gVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(gVar, "user");
        this.f120621b = gVar;
        this.f120622c = i;
        this.f120623d = i2;
    }
}
