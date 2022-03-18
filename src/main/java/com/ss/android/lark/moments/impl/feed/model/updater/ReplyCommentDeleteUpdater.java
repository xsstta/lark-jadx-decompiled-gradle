package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.ss.android.lark.moments.impl.commonvo.IMomentsCommentModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/ReplyCommentDeleteUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "(Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.p */
public final class ReplyCommentDeleteUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final IMomentsCommentModel f119985a;

    public ReplyCommentDeleteUpdater(IMomentsCommentModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f119985a = aVar;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        MomentsCommentVM a;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsCommentVM)) {
            return iMomentsItemBase;
        }
        MomentsCommentVM eVar = (MomentsCommentVM) iMomentsItemBase;
        Comment D = eVar.mo166375D();
        if (D == null || (a = MomentsCommentVM.m187494a(eVar, null, null, null, null, this.f119985a, false, null, D.newBuilder().mo63459a((Boolean) true).build(), null, null, 879, null)) == null) {
            return iMomentsItemBase;
        }
        return a;
    }
}
