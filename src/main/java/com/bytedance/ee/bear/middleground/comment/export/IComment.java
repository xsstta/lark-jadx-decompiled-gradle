package com.bytedance.ee.bear.middleground.comment.export;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0001\u001a\u00020 2\b\u0010\u0001\u001a\u00030\u0001H&J\u0014\u0010\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0001\u001a\u00020 H&J\u001f\u0010\u0001\u001a\u00020\u00042\t\b\u0002\u0010\u0001\u001a\u00020 2\t\b\u0002\u0010\u0001\u001a\u00020 H&J\u0015\u0010\u0001\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&J\t\u0010\u0001\u001a\u00020\u0004H&J\t\u0010\u0001\u001a\u00020\u0004H&J\u0010\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u0001H&J\n\u0010\u0001\u001a\u00030\u0001H&J\t\u0010\u0001\u001a\u00020:H&J\t\u0010\u0001\u001a\u00020 H&J\u0014\u0010\u0001\u001a\u00020 2\t\b\u0002\u0010\u0001\u001a\u00020 H&J\t\u0010\u0001\u001a\u00020\u0004H&J\u001e\u0010 \u0001\u001a\u00020\u00042\u0013\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00040\rH&J\u0012\u0010¢\u0001\u001a\u00020\u00042\u0007\u0010£\u0001\u001a\u00020 H&J\u001b\u0010¤\u0001\u001a\u00020\u00042\u0007\u0010¥\u0001\u001a\u00020 2\u0007\u0010¦\u0001\u001a\u00020 H&J&\u0010§\u0001\u001a\u00020\u00042\t\b\u0002\u0010¨\u0001\u001a\u00020\u00172\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010:H&¢\u0006\u0003\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\u00042\u000e\u0010«\u0001\u001a\t\u0012\u0005\u0012\u00030¬\u00010]H&J\t\u0010­\u0001\u001a\u00020\u0004H&J\u0011\u0010®\u0001\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0017H&J\u0012\u0010¯\u0001\u001a\u00020\u00042\u0007\u0010°\u0001\u001a\u00020\u0017H&J\u0013\u0010±\u0001\u001a\u00020\u00042\b\u0010²\u0001\u001a\u00030³\u0001H&R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR3\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R3\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR3\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\rX¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R3\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015R3\u0010'\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b((\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R\u0012\u0010+\u001a\u00020,X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u0004\u0018\u000100X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R3\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0015R3\u00109\u001a\u001d\u0012\u0013\u0012\u00110:¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015RH\u0010>\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\u00040?X¦\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR3\u0010D\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u0010\u0015R\u001a\u0010H\u001a\u0004\u0018\u00010IX¦\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u0004\u0018\u00010IX¦\u000e¢\u0006\f\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR*\u0010Q\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00040?X¦\u000e¢\u0006\f\u001a\u0004\bS\u0010A\"\u0004\bT\u0010CR5\u0010U\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\bV\u0010\u0013\"\u0004\bW\u0010\u0015R3\u0010X\u001a\u001d\u0012\u0013\u0012\u00110:¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010\u0013\"\u0004\b[\u0010\u0015R\u0001\u0010\\\u001al\u0012h\u0012f\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(6\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020`\u0018\u00010_¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(a\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(b\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(c\u0012\u0004\u0012\u00020\u00040^0]X¦\u000e¢\u0006\f\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\bi\u0010\u0006\"\u0004\bj\u0010\bR\u001e\u0010k\u001a\b\u0012\u0004\u0012\u00020 0\u0003X¦\u000e¢\u0006\f\u001a\u0004\bl\u0010\u0006\"\u0004\bm\u0010\bR$\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\f\u001a\u0004\bo\u0010\u0013\"\u0004\bp\u0010\u0015R0\u0010q\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00040rX¦\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010w\u001a\u0004\u0018\u000100X¦\u000e¢\u0006\f\u001a\u0004\bx\u00102\"\u0004\by\u00104R3\u0010z\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020 0\rX¦\u000e¢\u0006\f\u001a\u0004\b{\u0010\u0013\"\u0004\b|\u0010\u0015RI\u0010}\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(6\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u00040?X¦\u000e¢\u0006\r\u001a\u0004\b\u0010A\"\u0005\b\u0001\u0010CR6\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0013\"\u0005\b\u0001\u0010\u0015R/\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\rX¦\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010\u0013R6\u0010\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00040\rX¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010\u0013\"\u0005\b\u0001\u0010\u0015RS\u0010\u0001\u001a:\u00126\u00124\u0012\u0014\u0012\u00120:¢\u0006\r\b\u000f\u0012\t\b\u0010\u0012\u0005\b\b(\u0001\u0012\u0014\u0012\u00120 ¢\u0006\r\b\u000f\u0012\t\b\u0010\u0012\u0005\b\b(\u0001\u0012\u0004\u0012\u00020\u00040?0]X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0001\u0010e\"\u0005\b\u0001\u0010g¨\u0006´\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/IComment;", "", "clickArea", "Lkotlin/Function0;", "", "getClickArea", "()Lkotlin/jvm/functions/Function0;", "setClickArea", "(Lkotlin/jvm/functions/Function0;)V", "clickBack", "getClickBack", "setClickBack", "clickEditInNewCard", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "Lkotlin/ParameterName;", "name", "inputRequest", "getClickEditInNewCard", "()Lkotlin/jvm/functions/Function1;", "setClickEditInNewCard", "(Lkotlin/jvm/functions/Function1;)V", "clickLink", "", "linkStr", "getClickLink", "setClickLink", "clickResolve", "getClickResolve", "setClickResolve", "clickUserImg", "userId", "", "getClickUserImg", "setClickUserImg", "closeFull", "commentId", "getCloseFull", "setCloseFull", "closeListener", "hasAnin", "getCloseListener", "setCloseListener", "configComment", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentConfig;", "getConfigComment", "()Lcom/bytedance/ee/bear/middleground/comment/export/ICommentConfig;", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "copyListener", "content", "getCopyListener", "setCopyListener", "countChange", "", "count", "getCountChange", "setCountChange", "editIng", "Lkotlin/Function2;", "getEditIng", "()Lkotlin/jvm/functions/Function2;", "setEditIng", "(Lkotlin/jvm/functions/Function2;)V", "editListener", "isShow", "getEditListener", "setEditListener", "enterAnimator", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "getEnterAnimator", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "setEnterAnimator", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;)V", "exitAnimator", "getExitAnimator", "setExitAnimator", "filterData", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getFilterData", "setFilterData", "gotoProfile", "getGotoProfile", "setGotoProfile", "heightChange", "height", "getHeightChange", "setHeightChange", "inputViewClose", "", "Lkotlin/Function4;", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "images", "bySend", "tmpId", "getInputViewClose", "()Ljava/util/List;", "setInputViewClose", "(Ljava/util/List;)V", "inputViewShow", "getInputViewShow", "setInputViewShow", "interceptMaskClick", "getInterceptMaskClick", "setInterceptMaskClick", "newCommentId", "getNewCommentId", "setNewCommentId", "onActivateImageChange", "Lkotlin/Function3;", "getOnActivateImageChange", "()Lkotlin/jvm/functions/Function3;", "setOnActivateImageChange", "(Lkotlin/jvm/functions/Function3;)V", "rootView", "getRootView", "setRootView", "sameLink", "getSameLink", "setSameLink", "sendListener", "isSuccess", "getSendListener", "setSendListener", "showFull", "getShowFull", "setShowFull", "switchCard", "getSwitchCard", "switchListener", "getSwitchListener", "setSwitchListener", "topLocationChange", "y", "whole", "getTopLocationChange", "setTopLocationChange", "addToDispose", "disposable", "Lio/reactivex/disposables/Disposable;", "closeCard", "showAnimation", "closeComment", "cardIgnore", "createNewComment", "destroy", "dismissReaction", "fetchCommentFlowable", "Lio/reactivex/Flowable;", "getDataControl", "Lcom/bytedance/ee/bear/middleground/comment/export/IDataControl;", "getOperatePosition", "isCardShowing", "isShowing", "registerReactionObserver", "setAtListener", "listener", "setInputCommentFullClick", "fullClick", "showArea", "visibility", "isHighLight", "showComment", "createId", "(Ljava/lang/String;Ljava/lang/Integer;)V", "updateData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "updatePanelView", "updateTargetId", "updateToken", "token", "updateType", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.e */
public interface IComment {
    /* renamed from: S */
    int mo34295S();

    /* renamed from: a */
    void mo34301a(C8275a aVar);

    /* renamed from: a */
    void mo34302a(CommentInputRequest commentInputRequest);

    /* renamed from: a */
    void mo34303a(CommentAnimationParam aVar);

    /* renamed from: a */
    void mo34304a(String str);

    /* renamed from: a */
    void mo34305a(String str, Integer num);

    /* renamed from: a */
    void mo34306a(List<CommentBean> list);

    /* renamed from: a */
    void mo34307a(Function0<Boolean> function0);

    /* renamed from: a */
    void mo34309a(Function2<? super String, ? super Action, Unit> kVar);

    /* renamed from: a */
    void mo34310a(Function3<? super String, ? super String, ? super Integer, Unit> oVar);

    /* renamed from: a */
    void mo34311a(boolean z, boolean z2);

    /* renamed from: a */
    boolean mo34312a(Disposable disposable);

    /* renamed from: a */
    boolean mo34313a(boolean z);

    /* renamed from: b */
    ICommentConfig mo34314b();

    /* renamed from: b */
    void mo34316b(CommentAnimationParam aVar);

    /* renamed from: b */
    void mo34318b(Function0<Unit> function0);

    /* renamed from: b */
    void mo34319b(Function1<? super Boolean, Unit> function1);

    /* renamed from: b */
    void mo34320b(Function2<? super String, ? super Boolean, Unit> kVar);

    /* renamed from: b */
    void mo34321b(boolean z);

    /* renamed from: b */
    void mo34322b(boolean z, boolean z2);

    /* renamed from: c */
    void mo34324c(String str);

    /* renamed from: c */
    void mo34325c(Function0<Unit> function0);

    /* renamed from: c */
    void mo34326c(Function1<? super String, Boolean> function1);

    /* renamed from: c */
    void mo34327c(boolean z);

    /* renamed from: d */
    void mo34329d(Function1<? super String, Unit> function1);

    /* renamed from: e */
    void mo34331e(Function1<? super Boolean, Unit> function1);

    /* renamed from: f */
    IDataControl mo34332f();

    /* renamed from: f */
    void mo34333f(Function1<? super Integer, Unit> function1);

    /* renamed from: g */
    void mo34335g(Function1<? super String, Unit> function1);

    /* renamed from: h */
    void mo34337h(Function1<? super String, Unit> function1);

    /* renamed from: i */
    void mo34338i(Function1<? super String, Unit> function1);

    /* renamed from: i */
    boolean mo34339i();

    /* renamed from: j */
    void mo34340j();

    /* renamed from: j */
    void mo34341j(Function1<? super Boolean, Unit> function1);

    /* renamed from: k */
    void mo34342k();

    /* renamed from: k */
    void mo34343k(Function1<? super String, Unit> function1);

    /* renamed from: m */
    void mo34346m();

    /* renamed from: n */
    AbstractC68307f<String> mo34347n();

    /* renamed from: q */
    Function1<String, Unit> mo34350q();

    /* renamed from: t */
    Function2<String, Action, Unit> mo34353t();

    /* renamed from: w */
    List<Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit>> mo34356w();

    /* renamed from: z */
    List<Function2<Integer, Boolean, Unit>> mo34359z();
}
