package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.CommentSet;
import com.bytedance.lark.pb.moments.v1.Post;
import com.ss.android.lark.moments.impl.commonvo.IMomentsPostModel;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/CommentSetUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "commentSet", "Lcom/bytedance/lark/pb/moments/v1/CommentSet;", "model", "Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "(Lcom/bytedance/lark/pb/moments/v1/CommentSet;Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.b */
public final class CommentSetUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final CommentSet f119951a;

    /* renamed from: b */
    private final IMomentsPostModel f119952b;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return iMomentsItemBase;
        }
        MomentsPostVM fVar = (MomentsPostVM) iMomentsItemBase;
        Post a = fVar.mo166421F().newBuilder().mo63857a(this.f119951a).build();
        Intrinsics.checkExpressionValueIsNotNull(a, "newPost");
        return MomentsPostVM.m187537a(fVar, a, null, null, null, null, this.f119952b, null, false, null, null, null, 2014, null);
    }

    public CommentSetUpdater(CommentSet commentSet, IMomentsPostModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        this.f119951a = commentSet;
        this.f119952b = bVar;
    }
}
