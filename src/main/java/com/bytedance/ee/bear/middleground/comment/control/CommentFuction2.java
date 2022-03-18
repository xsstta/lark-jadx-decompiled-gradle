package com.bytedance.ee.bear.middleground.comment.control;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.uitls.ReactionHelper;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.panel.C53085d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J@\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015JX\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H\u0016¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/CommentFuction2;", "Lcom/bytedance/ee/bear/middleground/comment/control/CommentFunction;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;)V", "addEditItem", "", "cardAdapter", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "position", "", "edit", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "replyId", "", "bizParams", "", "", "editCommentByReviewFail", "quote", "retryType", "parentType", "parentToken", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.b.a */
public final class CommentFuction2 extends CommentFunction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/control/CommentFuction2$addEditItem$editItem$1", "Lcom/ss/android/lark/reaction/widget/panel/ReactionPanelMenuItem$DialogItemClickListener;", "onMenuItemClick", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.a$a */
    public static final class C9048a implements C53085d.AbstractC53086a {

        /* renamed from: a */
        final /* synthetic */ CommentFuction2 f24384a;

        /* renamed from: b */
        final /* synthetic */ ICardAdapter f24385b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24386c;

        /* renamed from: d */
        final /* synthetic */ String f24387d;

        /* renamed from: e */
        final /* synthetic */ int f24388e;

        @Override // com.ss.android.lark.reaction.widget.panel.C53085d.AbstractC53086a
        public void onMenuItemClick() {
            this.f24384a.mo34661l().mo35325e().mo35302a("edit_click", this.f24385b.getCommentId(this.f24386c), this.f24387d, null);
            CommentFuction2 aVar = this.f24384a;
            CommentBean.CommentDetail commentDetail = this.f24386c;
            ICardAdapter iCardAdapter = this.f24385b;
            aVar.mo34626a(commentDetail, iCardAdapter, this.f24387d, this.f24388e, iCardAdapter.getBizParam());
        }

        C9048a(CommentFuction2 aVar, ICardAdapter iCardAdapter, CommentBean.CommentDetail commentDetail, String str, int i) {
            this.f24384a = aVar;
            this.f24385b = iCardAdapter;
            this.f24386c = commentDetail;
            this.f24387d = str;
            this.f24388e = i;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.CommentFunction
    /* renamed from: a */
    public void mo34624a(ICardAdapter iCardAdapter, int i) {
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        mo34628a().add(new C53085d(C13615c.f35773a.getString(R.string.Doc_Facade_Edit), ReactionHelper.f24886a.mo35350a("EDIT"), new C9048a(this, iCardAdapter, iCardAdapter.getData().get(i), iCardAdapter.findReplyIdByPosition(i), i)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentFuction2(Config fVar, ICommentListeners fVar2, DataControl cVar) {
        super(fVar, fVar2, cVar);
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
    }

    /* renamed from: a */
    public final void mo34626a(CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, String str, int i, Map<Object, ? extends Object> map) {
        CommentBean.CommentDetail.ExtraEntity extraEntity;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list;
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        commentDetail.setEditStatus(true);
        if (commentDetail.isWholeComment()) {
            ((RecyclerView.Adapter) iCardAdapter).notifyItemChanged(i);
        } else {
            ((RecyclerView.Adapter) iCardAdapter).notifyDataSetChanged();
        }
        CommentInputRequest commentInputRequest = new CommentInputRequest();
        commentInputRequest.comment_id = iCardAdapter.getCommentId(commentDetail);
        commentInputRequest.reply_id = str;
        commentInputRequest.type = 1;
        commentInputRequest.content = commentDetail.getContent();
        commentInputRequest.show_comment_image = mo34661l().mo35348y();
        commentInputRequest.show_insert_image = mo34661l().mo35347x();
        commentInputRequest.doc_url = mo34661l().mo35331i();
        commentInputRequest.bizParams = map;
        CommentBean.CommentDetail.ExtraEntity extra = commentDetail.getExtra();
        if (extra == null || (image_list = extra.getImage_list()) == null || !(!image_list.isEmpty())) {
            extraEntity = null;
        } else {
            extraEntity = new CommentBean.CommentDetail.ExtraEntity();
            extraEntity.setImage_list(new ArrayList());
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list2 = extraEntity.getImage_list();
            CommentBean.CommentDetail.ExtraEntity extra2 = commentDetail.getExtra();
            Intrinsics.checkExpressionValueIsNotNull(extra2, "commentDetail.extra");
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list3 = extra2.getImage_list();
            Intrinsics.checkExpressionValueIsNotNull(image_list3, "commentDetail.extra.image_list");
            image_list2.addAll(image_list3);
        }
        commentInputRequest.extra = extraEntity;
        commentInputRequest.is_whole = false;
        commentInputRequest.show_voice = true;
        commentInputRequest.is_whole = commentDetail.isWholeComment();
        mo34662m().mo34293Q().invoke(commentInputRequest);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.control.ICommentFunction, com.bytedance.ee.bear.middleground.comment.control.CommentFunction
    /* renamed from: a */
    public void mo34625a(CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, String str, int i, String str2, String str3, Map<Object, ? extends Object> map) {
        CommentBean.CommentDetail.ExtraEntity extraEntity;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list;
        Intrinsics.checkParameterIsNotNull(commentDetail, "commentDetail");
        Intrinsics.checkParameterIsNotNull(iCardAdapter, "cardAdapter");
        commentDetail.setEditStatus(true);
        ((RecyclerView.Adapter) iCardAdapter).notifyDataSetChanged();
        CommentInputRequest commentInputRequest = new CommentInputRequest();
        commentInputRequest.comment_id = iCardAdapter.getCommentId(commentDetail);
        commentInputRequest.type = i;
        commentInputRequest.reply_id = commentDetail.getReply_id();
        commentInputRequest.content = commentDetail.getContent();
        commentInputRequest.is_whole = false;
        commentInputRequest.show_voice = true;
        commentInputRequest.parent_token = str3;
        commentInputRequest.parent_type = str2;
        commentInputRequest.quote = str;
        commentInputRequest.show_insert_image = mo34661l().mo35347x();
        commentInputRequest.show_comment_image = mo34661l().mo35348y();
        commentInputRequest.doc_url = mo34661l().mo35331i();
        commentInputRequest.bizParams = map;
        CommentBean.CommentDetail.ExtraEntity extra = commentDetail.getExtra();
        if (extra == null || (image_list = extra.getImage_list()) == null || !(!image_list.isEmpty())) {
            extraEntity = null;
        } else {
            extraEntity = new CommentBean.CommentDetail.ExtraEntity();
            extraEntity.setImage_list(new ArrayList());
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list2 = extraEntity.getImage_list();
            CommentBean.CommentDetail.ExtraEntity extra2 = commentDetail.getExtra();
            Intrinsics.checkExpressionValueIsNotNull(extra2, "commentDetail.extra");
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list3 = extra2.getImage_list();
            Intrinsics.checkExpressionValueIsNotNull(image_list3, "commentDetail.extra.image_list");
            image_list2.addAll(image_list3);
        }
        commentInputRequest.extra = extraEntity;
        mo34662m().mo34293Q().invoke(commentInputRequest);
    }
}
