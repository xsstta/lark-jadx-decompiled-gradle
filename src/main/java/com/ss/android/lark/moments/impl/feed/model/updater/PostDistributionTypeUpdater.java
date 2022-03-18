package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Post;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/PostDistributionTypeUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "(Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;)V", "getDistributionType", "()Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.j */
public final class PostDistributionTypeUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final Post.PostDistributionType f119969a;

    /* renamed from: b */
    private final MomentsBaseViewModel f119970b;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return iMomentsItemBase;
        }
        MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
        Post a = fVar.mo166421F().newBuilder().mo63859a(this.f119969a).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "newPost");
        return MomentsPostVM.m187537a(fVar, a, null, null, null, null, this.f119970b, null, false, null, null, null, 2014, null);
    }

    public PostDistributionTypeUpdater(Post.PostDistributionType postDistributionType, MomentsBaseViewModel momentsBaseViewModel) {
        Intrinsics.checkParameterIsNotNull(postDistributionType, "distributionType");
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119969a = postDistributionType;
        this.f119970b = momentsBaseViewModel;
    }
}
