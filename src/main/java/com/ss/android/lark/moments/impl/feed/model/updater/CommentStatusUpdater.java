package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/CommentStatusUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "serverComment", "Lcom/bytedance/lark/pb/moments/v1/Comment;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "errorMessage", "", "(Lcom/bytedance/lark/pb/moments/v1/Comment;Lcom/bytedance/lark/pb/moments/v1/Entities;Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Comment$CreateStatus;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.c */
public final class CommentStatusUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final Comment f119953a;

    /* renamed from: b */
    private final Entities f119954b;

    /* renamed from: c */
    private final Comment.CreateStatus f119955c;

    /* renamed from: d */
    private final MomentsBaseViewModel f119956d;

    /* renamed from: e */
    private final String f119957e;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        MomentsCommentVM eVar;
        Map<String, MomentUser> map;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsCommentVM)) {
            return iMomentsItemBase;
        }
        if (this.f119955c != Comment.CreateStatus.SUCCESS) {
            MomentsCommentVM eVar2 = (MomentsCommentVM) iMomentsItemBase;
            Comment a = eVar2.mo166412w().newBuilder().mo63457a(this.f119955c).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            eVar = MomentsCommentVM.m187494a(eVar2, a, null, null, null, this.f119956d, false, null, null, null, this.f119957e, 494, null);
        } else {
            Comment comment = this.f119953a;
            if (comment == null) {
                comment = ((MomentsCommentVM) iMomentsItemBase).mo166412w().newBuilder().mo63457a(this.f119955c).build();
            }
            MomentsCommentVM eVar3 = (MomentsCommentVM) iMomentsItemBase;
            MomentsUserVM x = eVar3.mo166414y();
            Entities entities = this.f119954b;
            if (entities != null) {
                map = entities.users;
            } else {
                map = null;
            }
            if (map != null && this.f119954b.users.containsKey(comment.user_id)) {
                MomentsBaseViewModel momentsBaseViewModel = this.f119956d;
                String str = comment.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "newComment.user_id");
                x = momentsBaseViewModel.getUser(str);
            }
            Intrinsics.checkExpressionValueIsNotNull(comment, "newComment");
            eVar = MomentsCommentVM.m187494a(eVar3, comment, x, null, null, this.f119956d, false, null, null, null, this.f119957e, 492, null);
        }
        return eVar;
    }

    public CommentStatusUpdater(Comment comment, Entities entities, Comment.CreateStatus createStatus, MomentsBaseViewModel momentsBaseViewModel, String str) {
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119953a = comment;
        this.f119954b = entities;
        this.f119955c = createStatus;
        this.f119956d = momentsBaseViewModel;
        this.f119957e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentStatusUpdater(Comment comment, Entities entities, Comment.CreateStatus createStatus, MomentsBaseViewModel momentsBaseViewModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(comment, entities, createStatus, momentsBaseViewModel, (i & 16) != 0 ? null : str);
    }
}
