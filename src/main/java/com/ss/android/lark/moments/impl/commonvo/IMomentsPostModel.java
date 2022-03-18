package com.ss.android.lark.moments.impl.commonvo;

import android.content.Context;
import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.Post;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsPost;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J0\u0010\u0018\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006 "}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/IMomentsPostModel;", "", "deletePost", "", "postId", "", "highLightPost", "openReactionDetail", "id", "selectedReactionKey", "reactions", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "resendPost", "setDistribution", "distributionType", "Lcom/bytedance/lark/pb/moments/v1/Post$PostDistributionType;", "startBroadcastEditActivity", "context", "Landroid/content/Context;", "post", "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsPost;", "isReEdit", "", "triggerReaction", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "reactionKey", "originReactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "isAnonymous", "unsetBroadcastPost", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.b */
public interface IMomentsPostModel {
    void deletePost(String str);

    void openReactionDetail(String str, String str2, List<? extends ReactionDetailViewModel> list);

    void resendPost(String str);

    void setDistribution(String str, Post.PostDistributionType postDistributionType);

    void startBroadcastEditActivity(Context context, IMomentsPost bVar, boolean z);

    void triggerReaction(String str, EntityType entityType, String str2, ReactionSet reactionSet, boolean z);

    void unsetBroadcastPost(String str);
}
