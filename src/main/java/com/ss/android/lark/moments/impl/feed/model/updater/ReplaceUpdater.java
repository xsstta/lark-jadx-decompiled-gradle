package com.ss.android.lark.moments.impl.feed.model.updater;

import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.ttm.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/ReplaceUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "newItem", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "exceptPostPosition", "", "(Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;Z)V", "update", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.o */
public final class ReplaceUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final IMomentsItemBase f119983a;

    /* renamed from: b */
    private final boolean f119984b;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (this.f119984b && (iMomentsItemBase instanceof MomentsPostVM)) {
            IMomentsItemBase iMomentsItemBase2 = this.f119983a;
            if (iMomentsItemBase2 instanceof MomentsPostVM) {
                MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
                return MomentsPostVM.m187537a((MomentsPostVM) iMomentsItemBase2, null, null, null, null, null, null, null, false, null, fVar.mo166430O(), fVar.mo166431P(), MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
            }
        }
        return this.f119983a;
    }

    public ReplaceUpdater(IMomentsItemBase iMomentsItemBase, boolean z) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "newItem");
        this.f119983a = iMomentsItemBase;
        this.f119984b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReplaceUpdater(IMomentsItemBase iMomentsItemBase, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iMomentsItemBase, (i & 2) != 0 ? false : z);
    }
}
