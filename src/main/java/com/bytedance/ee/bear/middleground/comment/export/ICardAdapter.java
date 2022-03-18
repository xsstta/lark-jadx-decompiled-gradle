package com.bytedance.ee.bear.middleground.comment.export;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.util.io.NonProguard;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u000f\u001a\u00020\u0003H&J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "Lcom/bytedance/ee/util/io/NonProguard;", "findReplyIdByPosition", "", "position", "", "getBizParam", "", "", "getCommentId", "item", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getData", "", "getLast3Item", "replyId", "getPostion", "onItemVisible", "", "first", "last", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface ICardAdapter extends NonProguard {
    String findReplyIdByPosition(int i);

    Map<Object, Object> getBizParam();

    String getCommentId(CommentBean.CommentDetail commentDetail);

    List<CommentBean.CommentDetail> getData();

    List<CommentBean.CommentDetail> getLast3Item(String str);

    String getPostion();

    void onItemVisible(int i, int i2);

    void setData(List<? extends CommentBean.CommentDetail> list);
}
