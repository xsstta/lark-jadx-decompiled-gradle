package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionList;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/ReactionUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "(Lcom/bytedance/lark/pb/moments/v1/ReactionSet;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.n */
public final class ReactionUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final ReactionSet f119980a;

    /* renamed from: b */
    private final Map<String, MomentUser> f119981b;

    /* renamed from: c */
    private final MomentsBaseViewModel f119982c;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        List<ReactionList> list = null;
        if (iMomentsItemBase instanceof MomentsPostVM) {
            MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
            Post a = fVar.mo166421F().newBuilder().mo63860a(this.f119980a).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "item.post.newBuilder().r…_set(reactionSet).build()");
            ReactionUtils hVar = ReactionUtils.f119254a;
            ReactionSet reactionSet = this.f119980a;
            if (reactionSet != null) {
                list = reactionSet.reactions;
            }
            return MomentsPostVM.m187537a(fVar, a, null, null, hVar.mo166215b(list, this.f119981b), null, this.f119982c, null, false, null, null, null, 2006, null);
        } else if (!(iMomentsItemBase instanceof MomentsCommentVM)) {
            return iMomentsItemBase;
        } else {
            MomentsCommentVM eVar = (MomentsCommentVM) iMomentsItemBase;
            Comment a2 = eVar.mo166412w().newBuilder().mo63458a(this.f119980a).build();
            Intrinsics.checkExpressionValueIsNotNull(a2, "item.comment.newBuilder(…_set(reactionSet).build()");
            ReactionUtils hVar2 = ReactionUtils.f119254a;
            ReactionSet reactionSet2 = this.f119980a;
            if (reactionSet2 != null) {
                list = reactionSet2.reactions;
            }
            return MomentsCommentVM.m187494a(eVar, a2, null, hVar2.mo166215b(list, this.f119981b), null, this.f119982c, false, null, null, null, null, 1002, null);
        }
    }

    public ReactionUpdater(ReactionSet reactionSet, Map<String, MomentUser> map, MomentsBaseViewModel momentsBaseViewModel) {
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119980a = reactionSet;
        this.f119981b = map;
        this.f119982c = momentsBaseViewModel;
    }
}
