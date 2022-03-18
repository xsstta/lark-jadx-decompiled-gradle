package com.ss.android.lark.moments.impl.commonvo;

import com.bytedance.lark.pb.moments.v1.EntityType;
import com.bytedance.lark.pb.moments.v1.ReactionSet;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J0\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/commonvo/IMomentsCommentModel;", "", "deleteComment", "", "commentId", "", "openReactionDetail", "id", "selectedReactionKey", "reactions", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "resendComment", "triggerReaction", "entityType", "Lcom/bytedance/lark/pb/moments/v1/EntityType;", "reactionKey", "originReactionSet", "Lcom/bytedance/lark/pb/moments/v1/ReactionSet;", "isAnonymous", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.commonvo.a */
public interface IMomentsCommentModel {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.commonvo.a$a */
    public static final class C47331a {
        /* renamed from: a */
        public static void m187482a(IMomentsCommentModel aVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
        }

        /* renamed from: b */
        public static void m187483b(IMomentsCommentModel aVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
        }
    }

    void deleteComment(String str);

    void openReactionDetail(String str, String str2, List<? extends ReactionDetailViewModel> list);

    void resendComment(String str);

    void triggerReaction(String str, EntityType entityType, String str2, ReactionSet reactionSet, boolean z);
}
