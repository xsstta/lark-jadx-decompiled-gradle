package com.bytedance.ee.bear.middleground.comment.export;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H&J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H&J4\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/IReactionHelper;", "", "getMenuIconById", "", "menuId", "", "reactions2DetailViewModels", "", "Lcom/ss/android/lark/reaction/widget/detailwindow/bean/ReactionDetailViewModel;", "reactions", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/Reaction;", "reportShowReactionPage", "", "token", "documentType", "isWiki", "", "subFileType", "referKey", "isOwner", "resolveReactionData", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "reactionList", "", "referType", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.k */
public interface IReactionHelper {
    /* renamed from: a */
    int mo35287a(String str);

    /* renamed from: a */
    List<ReactionDetailViewModel> mo35288a(List<? extends Reaction> list);

    /* renamed from: a */
    void mo35289a(CommentBean.CommentDetail commentDetail, List<Reaction> list, String str, String str2);

    /* renamed from: a */
    void mo35290a(String str, String str2, boolean z, String str3, String str4, boolean z2);
}
