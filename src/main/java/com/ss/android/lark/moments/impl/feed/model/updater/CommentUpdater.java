package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/CommentUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", Comment.f24093e, "Lcom/bytedance/lark/pb/moments/v1/Comment;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "(Lcom/bytedance/lark/pb/moments/v1/Comment;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;)V", "getComment", "()Lcom/bytedance/lark/pb/moments/v1/Comment;", "getModel", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.d */
public final class CommentUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final com.bytedance.lark.pb.moments.v1.Comment f119958a;

    /* renamed from: b */
    private final IMomentsCommentModel f119959b;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (iMomentsItemBase instanceof MomentsCommentVM) {
            return MomentsCommentVM.m187494a((MomentsCommentVM) iMomentsItemBase, this.f119958a, null, null, null, this.f119959b, false, null, null, null, null, 1006, null);
        }
        return iMomentsItemBase;
    }

    public CommentUpdater(com.bytedance.lark.pb.moments.v1.Comment comment, IMomentsCommentModel aVar) {
        Intrinsics.checkParameterIsNotNull(comment, Comment.f24093e);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f119958a = comment;
        this.f119959b = aVar;
    }
}
