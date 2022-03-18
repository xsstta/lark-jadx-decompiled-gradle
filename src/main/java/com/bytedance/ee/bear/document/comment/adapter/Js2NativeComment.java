package com.bytedance.ee.bear.document.comment.adapter;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.comment.bean.Card;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.middleground.comment.export.AbstractC9224g;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/document/comment/adapter/Js2NativeComment;", "", "()V", "card2CommentBean", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "card", "Lcom/bytedance/ee/bear/document/comment/bean/Card;", "cards2Comments", "", "cards", "", "showCards2Comments", "showCardsJsData", "Lcom/bytedance/ee/bear/document/comment/bean/ShowCardsJsData;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.comment.a.a */
public final class Js2NativeComment {

    /* renamed from: a */
    public static final Js2NativeComment f16092a = new Js2NativeComment();

    private Js2NativeComment() {
    }

    /* renamed from: a */
    private final List<CommentBean> m23093a(List<? extends Card> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f16092a.m23092a((Card) it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List<CommentBean> mo22805a(ShowCardsJsData showCardsJsData) {
        Intrinsics.checkParameterIsNotNull(showCardsJsData, "showCardsJsData");
        ArrayList cards = showCardsJsData.getCards();
        if (cards == null) {
            cards = new ArrayList();
        }
        List<CommentBean> a = m23093a(cards);
        String cur_reply_id = showCardsJsData.getCur_reply_id();
        String cur_comment_id = showCardsJsData.getCur_comment_id();
        if (!TextUtils.isEmpty(cur_reply_id) && !TextUtils.isEmpty(cur_comment_id)) {
            for (T t : a) {
                if (Intrinsics.areEqual(cur_comment_id, t.getComment_id())) {
                    t.setCurrentReplyId(cur_reply_id);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    private final CommentBean m23092a(Card card) {
        CommentBean commentBean = new CommentBean();
        commentBean.setIs_whole(0);
        commentBean.setQuote(card.getQuote());
        commentBean.setPosition(card.getPosition());
        commentBean.setBizParams(card.getBizParams());
        commentBean.setComment_list(card.getCommentList());
        commentBean.setUnSubmitComment(card.isUnSubmitComment());
        List<CommentBean.CommentDetail> commentList = card.getCommentList();
        if (commentList != null) {
            for (T t : commentList) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                String comment_id = t.getComment_id();
                if (comment_id == null || !StringsKt.contains$default((CharSequence) comment_id, (CharSequence) "fake", false, 2, (Object) null)) {
                    t.setComment_id(card.getCommentId());
                    ((AbstractC9224g) KoinJavaComponent.m268613a(AbstractC9224g.class, null, null, 6, null)).mo34611a().mo35289a(t, t.getReaction(), t.getReaction_type(), t.getReply_id());
                }
            }
        }
        commentBean.setFinish(card.getFinish());
        commentBean.setComment_id(card.getCommentId());
        return commentBean;
    }
}
