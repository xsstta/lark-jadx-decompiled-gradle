package com.ss.android.lark.moments.impl.feed.model.matcher;

import com.bytedance.lark.pb.moments.v1.Comment;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.moments.impl.commonvo.MomentsCommentVM;
import com.ss.android.lark.moments.impl.commonvo.item.IMomentsItemBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/model/matcher/ReplyCommentMatcher;", "Lcom/ss/android/lark/moments/impl/feed/model/matcher/IMomentsMatcher;", "commentId", "", "(Ljava/lang/String;)V", "match", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/moments/impl/commonvo/item/IMomentsItemBase;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.model.a.e */
public final class ReplyCommentMatcher implements IMomentsMatcher {

    /* renamed from: a */
    private final String f119938a;

    public ReplyCommentMatcher(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        this.f119938a = str;
    }

    @Override // com.ss.android.lark.moments.impl.feed.model.matcher.IMomentsMatcher
    /* renamed from: a */
    public boolean mo167028a(IMomentsItemBase iMomentsItemBase) {
        String str;
        Intrinsics.checkParameterIsNotNull(iMomentsItemBase, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (iMomentsItemBase instanceof MomentsCommentVM) {
            Comment D = ((MomentsCommentVM) iMomentsItemBase).mo166375D();
            if (D != null) {
                str = D.id;
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, this.f119938a)) {
                return true;
            }
        }
        return false;
    }
}
