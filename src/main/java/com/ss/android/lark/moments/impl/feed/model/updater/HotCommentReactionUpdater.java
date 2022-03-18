package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.moments.impl.common.utils.ReactionUtils;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsComment;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/HotCommentReactionUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "commentId", "", "reactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "userMap", "", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/moments/v1/ReactionSet;Ljava/util/Map;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.g */
public final class HotCommentReactionUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final String f119965a;

    /* renamed from: b */
    private final ReactionSet f119966b;

    /* renamed from: c */
    private final Map<String, MomentUser> f119967c;

    /* renamed from: d */
    private final MomentsBaseViewModel f119968d;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return iMomentsItemBase;
        }
        MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
        List<IMomentsComment> I = fVar.mo166424I();
        if (I != null) {
            List<IMomentsComment> list = I;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (T t : list) {
                if (Intrinsics.areEqual(t.mo166379a(), this.f119965a)) {
                    if (t != null) {
                        T t2 = t;
                        Comment a = t2.mo166412w().newBuilder().mo63458a(this.f119966b).build();
                        Intrinsics.checkExpressionValueIsNotNull(a, "newComment");
                        ReactionUtils hVar = ReactionUtils.f119254a;
                        ReactionSet reactionSet = this.f119966b;
                        t = (T) MomentsCommentVM.m187494a(t2, a, null, hVar.mo166215b(reactionSet != null ? reactionSet.reactions : null, this.f119967c), null, this.f119968d, false, null, null, null, null, 1002, null);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM");
                    }
                }
                arrayList2.add(t);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return MomentsPostVM.m187537a(fVar, null, null, arrayList, null, null, this.f119968d, null, false, null, null, null, 2011, null);
    }

    public HotCommentReactionUpdater(String str, ReactionSet reactionSet, Map<String, MomentUser> map, MomentsBaseViewModel momentsBaseViewModel) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(map, "userMap");
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119965a = str;
        this.f119966b = reactionSet;
        this.f119967c = map;
        this.f119968d = momentsBaseViewModel;
    }
}
