package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\"\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/bean/ICommentTranslate;", "", "translateStatus", "", "", "", "getTranslateStatus", "()Ljava/util/Map;", "diffViewShowOrigin", "config", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "item", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionWindowShowOrigin", "reactionWindowShowPackUpOrigin", "reactionWindowShowTranslate", "showDiffView", "showTranslateContent", "showTranslateIcon", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.c */
public interface ICommentTranslate {
    /* renamed from: a */
    Map<String, Boolean> mo35258a();

    /* renamed from: a */
    boolean mo35259a(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: b */
    boolean mo35260b(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: c */
    boolean mo35261c(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: d */
    boolean mo35262d(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: e */
    boolean mo35263e(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: f */
    boolean mo35264f(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);

    /* renamed from: g */
    boolean mo35265g(TranslateConfig translateConfig, CommentBean.CommentDetail commentDetail);
}
