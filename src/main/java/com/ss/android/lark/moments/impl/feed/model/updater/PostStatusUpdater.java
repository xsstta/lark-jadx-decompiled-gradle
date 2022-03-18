package com.ss.android.lark.moments.impl.feed.model.updater;

import com.bytedance.lark.pb.moments.v1.Entities;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.bytedance.lark.pb.moments.v1.Post;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.lark.moments.impl.commonvo.MomentsPostVM;
import com.ss.android.lark.moments.impl.commonvo.MomentsUserVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import com.ss.android.lark.moments.impl.feed.model.MomentsBaseViewModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/updater/PostStatusUpdater;", "Lcom/ss/android/lark/moments/impl/feed/model/updater/IMomentsUpdater;", "serverPost", "Lcom/bytedance/lark/pb/moments/v1/Post;", "entities", "Lcom/bytedance/lark/pb/moments/v1/Entities;", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "model", "Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "errorMessage", "", "(Lcom/bytedance/lark/pb/moments/v1/Post;Lcom/bytedance/lark/pb/moments/v1/Entities;Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;Ljava/lang/String;)V", "getModel", "()Lcom/ss/android/lark/moments/impl/feed/model/MomentsBaseViewModel;", "getStatus", "()Lcom/bytedance/lark/pb/moments/v1/Post$CreateStatus;", "update", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "item", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.b.k */
public final class PostStatusUpdater implements IMomentsUpdater {

    /* renamed from: a */
    private final Post f119971a;

    /* renamed from: b */
    private final Entities f119972b;

    /* renamed from: c */
    private final Post.CreateStatus f119973c;

    /* renamed from: d */
    private final MomentsBaseViewModel f119974d;

    /* renamed from: e */
    private final String f119975e;

    @Override // com.ss.android.lark.moments.impl.feed.model.updater.IMomentsUpdater
    /* renamed from: a */
    public IMomentsItemBase mo167027a(IMomentsItemBase iMomentsItemBase) {
        MomentsPostVM fVar;
        Map<String, MomentUser> map;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, "item");
        if (!(iMomentsItemBase instanceof MomentsPostVM)) {
            return iMomentsItemBase;
        }
        if (this.f119973c != Post.CreateStatus.SUCCESS) {
            MomentsPostVM fVar2 = (MomentsPostVM) iMomentsItemBase;
            Post a = fVar2.mo166421F().newBuilder().mo63858a(this.f119973c).build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            fVar = MomentsPostVM.m187537a(fVar2, a, null, null, null, null, this.f119974d, null, false, this.f119975e, null, null, 1758, null);
        } else {
            Post post = this.f119971a;
            if (post == null) {
                post = ((MomentsPostVM) iMomentsItemBase).mo166421F().newBuilder().mo63858a(this.f119973c).build();
            }
            MomentsPostVM fVar3 = (MomentsPostVM) iMomentsItemBase;
            MomentsUserVM G = fVar3.mo166423H();
            Entities entities = this.f119972b;
            if (entities != null) {
                map = entities.users;
            } else {
                map = null;
            }
            if (map != null && this.f119972b.users.containsKey(post.user_id)) {
                MomentsBaseViewModel momentsBaseViewModel = this.f119974d;
                String str = post.user_id;
                Intrinsics.checkExpressionValueIsNotNull(str, "newPost.user_id");
                G = momentsBaseViewModel.getUser(str);
            }
            Intrinsics.checkExpressionValueIsNotNull(post, "newPost");
            fVar = MomentsPostVM.m187537a(fVar3, post, G, null, null, null, this.f119974d, null, false, this.f119975e, null, null, 1756, null);
        }
        return fVar;
    }

    public PostStatusUpdater(Post post, Entities entities, Post.CreateStatus createStatus, MomentsBaseViewModel momentsBaseViewModel, String str) {
        Intrinsics.checkParameterIsNotNull(createStatus, UpdateKey.STATUS);
        Intrinsics.checkParameterIsNotNull(momentsBaseViewModel, "model");
        this.f119971a = post;
        this.f119972b = entities;
        this.f119973c = createStatus;
        this.f119974d = momentsBaseViewModel;
        this.f119975e = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostStatusUpdater(Post post, Entities entities, Post.CreateStatus createStatus, MomentsBaseViewModel momentsBaseViewModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(post, entities, createStatus, momentsBaseViewModel, (i & 16) != 0 ? null : str);
    }
}
