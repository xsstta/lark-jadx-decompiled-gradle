package com.bytedance.ee.bear.middleground.feed.p456d;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.BaseFeedMessageDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedCommentDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;

/* renamed from: com.bytedance.ee.bear.middleground.feed.d.a */
public class C9437a {
    /* renamed from: a */
    public static CommentBean.CommentDetail m39065a(BaseFeedMessageDetailBean baseFeedMessageDetailBean) {
        CommentBean.CommentDetail commentDetail = new CommentBean.CommentDetail();
        if (baseFeedMessageDetailBean == null) {
            return commentDetail;
        }
        commentDetail.setAnonymous(baseFeedMessageDetailBean.isAnonymous());
        commentDetail.setAvatar_url(baseFeedMessageDetailBean.getAvatar_url());
        commentDetail.setComment_id(baseFeedMessageDetailBean.getComment_id());
        commentDetail.setContent(baseFeedMessageDetailBean.getContent());
        commentDetail.setCreate_timestamp(baseFeedMessageDetailBean.getCreate_timestamp());
        commentDetail.setEditStatus(baseFeedMessageDetailBean.isEditStatus());
        commentDetail.setError(baseFeedMessageDetailBean.getError());
        commentDetail.setExtra(null);
        commentDetail.setFull(baseFeedMessageDetailBean.isFull());
        commentDetail.setIs_whole(baseFeedMessageDetailBean.getIs_whole());
        commentDetail.setModify(baseFeedMessageDetailBean.getModify());
        commentDetail.setName(baseFeedMessageDetailBean.getName());
        commentDetail.setReaction(baseFeedMessageDetailBean.getReaction());
        commentDetail.setReaction_type(baseFeedMessageDetailBean.getReaction_type());
        commentDetail.setReactionDetailData(baseFeedMessageDetailBean.getReactionDetailData());
        commentDetail.setReactionFlowData(baseFeedMessageDetailBean.getReactionFlowData());
        commentDetail.setReferKey(baseFeedMessageDetailBean.getReferKey());
        commentDetail.setUser_id(baseFeedMessageDetailBean.getUser_id());
        commentDetail.setUpdate_timestamp(baseFeedMessageDetailBean.getUpdate_timestamp());
        commentDetail.setTranslate_status(baseFeedMessageDetailBean.getTranslate_status());
        commentDetail.setTranslate_content(baseFeedMessageDetailBean.getTranslate_content());
        commentDetail.setSending(baseFeedMessageDetailBean.isSending());
        commentDetail.setRetryType(baseFeedMessageDetailBean.getRetryType());
        commentDetail.setReply_id(baseFeedMessageDetailBean.getReply_id());
        if (baseFeedMessageDetailBean instanceof MessageBean) {
            MessageBean messageBean = (MessageBean) baseFeedMessageDetailBean;
            commentDetail.setMessageId(messageBean.getMessageId());
            commentDetail.setReadStatus(messageBean.getReadStatus());
        }
        if (baseFeedMessageDetailBean instanceof FeedCommentDetailBean) {
            FeedCommentDetailBean feedCommentDetailBean = (FeedCommentDetailBean) baseFeedMessageDetailBean;
            commentDetail.setMessageId(feedCommentDetailBean.getMessageId());
            commentDetail.setReadStatus(feedCommentDetailBean.getReadStatus());
        }
        return commentDetail;
    }
}
