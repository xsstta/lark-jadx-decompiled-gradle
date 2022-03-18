package com.bytedance.ee.bear.middleground.comment.control;

import android.view.View;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR3\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR3\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0017\"\u0004\b$\u0010\u0019R\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR3\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b()\u0012\u0004\u0012\u00020*0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R3\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u0019R3\u00101\u001a\u001d\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001a\u00105\u001a\u0004\u0018\u000106X¦\u000e¢\u0006\f\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R3\u0010;\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019R3\u0010?\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bB\u0010\u0017\"\u0004\bC\u0010\u0019RH\u0010D\u001a2\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\b0EX¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR3\u0010J\u001a\u001d\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0017\"\u0004\bM\u0010\u0019R*\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020\b0EX¦\u000e¢\u0006\f\u001a\u0004\bP\u0010G\"\u0004\bQ\u0010IR5\u0010R\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010\u0017\"\u0004\bT\u0010\u0019R3\u0010U\u001a\u001d\u0012\u0013\u0012\u00110@¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(V\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bW\u0010\u0017\"\u0004\bX\u0010\u0019R\u0001\u0010Y\u001al\u0012h\u0012f\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(<\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020]\u0018\u00010\\¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(^\u0012\u0013\u0012\u00110*¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(_\u0012\u0015\u0012\u0013\u0018\u00010\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(`\u0012\u0004\u0012\u00020\b0[0ZX¦\u000e¢\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001e\u0010e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010\n\"\u0004\bg\u0010\fR\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020*0\u0007X¦\u000e¢\u0006\f\u001a\u0004\bi\u0010\n\"\u0004\bj\u0010\fR$\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010\u0017\"\u0004\bm\u0010\u0019R0\u0010n\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\b0oX¦\u000e¢\u0006\f\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR5\u0010t\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010u¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(v\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bw\u0010\u0017\"\u0004\bx\u0010\u0019R$\u0010y\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\bz\u0010\u0017\"\u0004\b{\u0010\u0019R9\u0010|\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001e0\\¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(}\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\f\u001a\u0004\b~\u0010\u0017\"\u0004\b\u0010\u0019R\u001d\u0010\u0001\u001a\u0004\u0018\u000106X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u00108\"\u0005\b\u0001\u0010:R6\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020*0\u0011X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0017\"\u0005\b\u0001\u0010\u0019RL\u0010\u0001\u001a3\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(<\u0012\u0014\u0012\u00120*¢\u0006\r\b\u0013\u0012\t\b\u0014\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020\b0EX¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010G\"\u0005\b\u0001\u0010IR6\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0017\"\u0005\b\u0001\u0010\u0019R/\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0\u0011X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u0017R6\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\b0\u0011X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0017\"\u0005\b\u0001\u0010\u0019RS\u0010\u0001\u001a:\u00126\u00124\u0012\u0014\u0012\u00120@¢\u0006\r\b\u0013\u0012\t\b\u0014\u0012\u0005\b\b(\u0001\u0012\u0014\u0012\u00120*¢\u0006\r\b\u0013\u0012\t\b\u0014\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020\b0E0ZX¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010b\"\u0005\b\u0001\u0010d¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "", "backPressDispatcher", "Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "getBackPressDispatcher", "()Lcom/bytedance/ee/bear/facade/common/BackPressDispatcher;", "clickArea", "Lkotlin/Function0;", "", "getClickArea", "()Lkotlin/jvm/functions/Function0;", "setClickArea", "(Lkotlin/jvm/functions/Function0;)V", "clickBack", "getClickBack", "setClickBack", "clickEditInNewCard", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "Lkotlin/ParameterName;", "name", "inputRequest", "getClickEditInNewCard", "()Lkotlin/jvm/functions/Function1;", "setClickEditInNewCard", "(Lkotlin/jvm/functions/Function1;)V", "clickImage", "getClickImage", "setClickImage", "clickLink", "", "linkStr", "getClickLink", "setClickLink", "clickReplyInReaction", "getClickReplyInReaction", "setClickReplyInReaction", "clickResolve", "getClickResolve", "setClickResolve", "clickUserImg", "userId", "", "getClickUserImg", "setClickUserImg", "closeFull", "commentId", "getCloseFull", "setCloseFull", "closeListener", "hasAnim", "getCloseListener", "setCloseListener", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "copyListener", "content", "getCopyListener", "setCopyListener", "countChange", "", "count", "getCountChange", "setCountChange", "editIng", "Lkotlin/Function2;", "getEditIng", "()Lkotlin/jvm/functions/Function2;", "setEditIng", "(Lkotlin/jvm/functions/Function2;)V", "editListener", "isShow", "getEditListener", "setEditListener", "filterData", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getFilterData", "setFilterData", "gotoProfile", "getGotoProfile", "setGotoProfile", "heightChange", "height", "getHeightChange", "setHeightChange", "inputViewClose", "", "Lkotlin/Function4;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "images", "bySend", "tmpId", "getInputViewClose", "()Ljava/util/List;", "setInputViewClose", "(Ljava/util/List;)V", "inputViewShow", "getInputViewShow", "setInputViewShow", "interceptMaskClick", "getInterceptMaskClick", "setInterceptMaskClick", "newCommentId", "getNewCommentId", "setNewCommentId", "onActivateImageChange", "Lkotlin/Function3;", "getOnActivateImageChange", "()Lkotlin/jvm/functions/Function3;", "setOnActivateImageChange", "(Lkotlin/jvm/functions/Function3;)V", "onMentionSelect", "Lcom/bytedance/ee/bear/bean/At;", "at", "getOnMentionSelect", "setOnMentionSelect", "reactionAddListener", "getReactionAddListener", "setReactionAddListener", "readMessage", "messageIds", "getReadMessage", "setReadMessage", "rootView", "getRootView", "setRootView", "sameLink", "getSameLink", "setSameLink", "sendListener", "isSuccess", "getSendListener", "setSendListener", "showFull", "getShowFull", "setShowFull", "switchCard", "getSwitchCard", "switchListener", "getSwitchListener", "setSwitchListener", "topLocationChange", "y", "whole", "getTopLocationChange", "setTopLocationChange", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.b.f */
public interface ICommentListeners {
    /* renamed from: A */
    Function1<String, Boolean> mo34277A();

    /* renamed from: B */
    Function1<String, Unit> mo34278B();

    /* renamed from: C */
    Function1<String, Unit> mo34279C();

    /* renamed from: D */
    Function2<String, Boolean, Unit> mo34280D();

    /* renamed from: E */
    Function1<Boolean, Unit> mo34281E();

    /* renamed from: F */
    Function2<String, String, Unit> mo34282F();

    /* renamed from: G */
    Function1<Integer, Unit> mo34283G();

    /* renamed from: H */
    Function1<String, Unit> mo34284H();

    /* renamed from: I */
    Function0<Unit> mo34285I();

    /* renamed from: J */
    Function1<String, Unit> mo34286J();

    /* renamed from: K */
    Function1<String, Unit> mo34287K();

    /* renamed from: L */
    Function1<Boolean, Unit> mo34288L();

    /* renamed from: M */
    Function1<String, Unit> mo34289M();

    /* renamed from: N */
    Function1<CommentInputRequest, Unit> mo34290N();

    /* renamed from: O */
    Function1<View, Unit> mo34291O();

    /* renamed from: P */
    Function0<Unit> mo34292P();

    /* renamed from: Q */
    Function1<CommentInputRequest, Unit> mo34293Q();

    /* renamed from: R */
    Function3<String, String, Integer, Unit> mo34294R();

    /* renamed from: T */
    Function1<List<String>, Unit> mo34296T();

    /* renamed from: a */
    void mo34299a(View view);

    /* renamed from: b */
    void mo34315b(View view);

    /* renamed from: d */
    Function1<C4517a, Unit> mo34328d();

    /* renamed from: g */
    AbstractC7665c mo34334g();

    /* renamed from: l */
    void mo34345l(Function1<? super CommentInputRequest, Unit> function1);

    /* renamed from: r */
    Function0<Boolean> mo34351r();

    /* renamed from: s */
    Function0<Unit> mo34352s();

    /* renamed from: v */
    Function0<Unit> mo34355v();

    /* renamed from: w */
    List<Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit>> mo34356w();

    /* renamed from: x */
    Function1<Integer, Unit> mo34357x();

    /* renamed from: y */
    Function0<Unit> mo34358y();

    /* renamed from: z */
    List<Function2<Integer, Boolean, Unit>> mo34359z();
}
