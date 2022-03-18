package com.bytedance.ee.bear.middleground.comment.control;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.p443a.C8969a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0003H&JX\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001aH&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H&J\u0016\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070&H&J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0001\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001aH&JJ\u0010.\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001aH&JT\u0010/\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00072\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010&2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0018\u0010\u0019\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001aH&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H&J(\u00103\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0016H&J\u0018\u00105\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H&J\u001e\u00106\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\f\u00107\u001a\b\u0012\u0004\u0012\u0002080&H&J\u0012\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0007H&¨\u0006;"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "", "clickReaction", "", "cardAdapter", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "reactionKey", "", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "view", "Landroid/view/View;", "clickReactionDetail", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "deleteComment", "commentId", "replyId", "dismissReaction", "editCommentByReviewFail", "quote", ShareHitPoint.f121869d, "", "parentType", "parentToken", "bizParams", "", "getShowingReactionReplyId", "hideReactionPanel", "isShowingReaction", "", "isWhole", "linkClick", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "callback", "Lcom/bytedance/ee/bear/middleground/comment/cell/LinkClickCell$ClickCallBack;", "readMessage", "messageId", "", "resolve", "retryCreateComment", "content", "list", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "localCommentId", "position", "retryEditComment", "retryRelpyComment", "setTouchPositionY", "positionY", "", "showReaction", "item", "translate", "updateReactionData", "reactions", "Lcom/ss/android/lark/reaction/widget/flowlayout/bean/ReactionFlowLayoutViewModel;", "updateReactionDetail", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.b.e */
public interface ICommentFunction {
    /* renamed from: a */
    AbstractC10460a.AbstractC10461a mo34627a(C8969a.AbstractC8970a aVar);

    /* renamed from: a */
    void mo34629a(float f);

    /* renamed from: a */
    void mo34630a(View view, CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, int i);

    /* renamed from: a */
    void mo34633a(FragmentManager fragmentManager, CommentBean.CommentDetail commentDetail, String str);

    /* renamed from: a */
    void mo34638a(ICardAdapter iCardAdapter, String str, CommentBean.CommentDetail commentDetail, View view);

    /* renamed from: a */
    void mo34625a(CommentBean.CommentDetail commentDetail, ICardAdapter iCardAdapter, String str, int i, String str2, String str3, Map<Object, ? extends Object> map);

    /* renamed from: a */
    void mo34640a(String str, String str2);

    /* renamed from: a */
    void mo34641a(String str, List<? extends C53061a> list);

    /* renamed from: a */
    void mo34642a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<Object, ? extends Object> map);

    /* renamed from: a */
    void mo34643a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, String str3, String str4, Map<Object, ? extends Object> map);

    /* renamed from: a */
    void mo34644a(String str, boolean z);

    /* renamed from: a */
    void mo34645a(List<String> list);

    /* renamed from: b */
    void mo34649b(String str);

    /* renamed from: b */
    void mo34650b(String str, String str2);

    /* renamed from: g */
    void mo34656g();

    /* renamed from: i */
    String mo34658i();

    /* renamed from: k */
    void mo34660k();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.e$a */
    public static final class C9099a {
        /* renamed from: a */
        public static /* synthetic */ void m37775a(ICommentFunction eVar, String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i, Object obj) {
            String str9;
            String str10;
            String str11;
            if (obj == null) {
                if ((i & 32) != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if ((i & 64) != 0) {
                    str10 = null;
                } else {
                    str10 = str6;
                }
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                    str11 = null;
                } else {
                    str11 = str7;
                }
                eVar.mo34642a(str, list, str2, str3, str4, str9, str10, str11, str8, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: retryCreateComment");
        }
    }
}
