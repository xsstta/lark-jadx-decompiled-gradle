package com.bytedance.ee.bear.middleground.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.facade.common.widget.C7727a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.adapter.CardAdapterHelper;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.CommentDiffUtils;
import com.bytedance.ee.bear.middleground.comment.export.ICardAdapter;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.ErrorBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReactionDetailUserInfo;
import com.bytedance.ee.bear.middleground.comment.p443a.C8969a;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.p447e.C9201a;
import com.bytedance.ee.bear.middleground.comment.p449g.C9229c;
import com.bytedance.ee.bear.middleground.comment.p449g.C9237i;
import com.bytedance.ee.bear.middleground.comment.translate.CommentTranslate;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.ReactionFlowLayout;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u0000 \u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b\u0001\u0001\u0001\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u0018\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0002J\u0010\u0010Q\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020PH\u0002J\u001c\u0010S\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010F\u001a\u00020(H\u0002J\u0010\u0010V\u001a\u00020\u00072\u0006\u0010F\u001a\u00020(H\u0016J\u001a\u0010W\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011H\u0016J\u0010\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u0019H\u0016J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016J\b\u0010[\u001a\u00020(H\u0016J\u0010\u0010\\\u001a\u00020(2\u0006\u0010F\u001a\u00020(H\u0016J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010^\u001a\u00020\u0007H\u0016J\n\u0010_\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010`\u001a\u00020aH\u0002J\u0018\u0010b\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u00022\u0006\u0010F\u001a\u00020(H\u0017J&\u0010b\u001a\u00020\u000e2\u0006\u0010T\u001a\u00020\u00022\u0006\u0010F\u001a\u00020(2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018H\u0016J\u0018\u0010d\u001a\u00020\u00022\u0006\u0010e\u001a\u00020f2\u0006\u0010g\u001a\u00020(H\u0016J\u0018\u0010h\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020(2\u0006\u0010j\u001a\u00020(H\u0016J\u0018\u0010k\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010l\u001a\u00020PH\u0002J\u001c\u0010m\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010n\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010o\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010p\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010q\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u0016\u0010r\u001a\u00020\u000e2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u001908H\u0016J\u001c\u0010t\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010u\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010v\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010w\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010x\u001a\u00020\u0019H\u0002J\u0010\u0010y\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020PH\u0002J\u001c\u0010z\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010{\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010|\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u00192\n\u0010T\u001a\u00060UR\u00020\u0000H\u0002J\u001c\u0010}\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u001c\u0010~\u001a\u00020\u000e2\n\u0010T\u001a\u00060UR\u00020\u00002\u0006\u0010Y\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u00020a2\u0006\u0010Y\u001a\u00020\u0019H\u0002J\t\u0010\u0001\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R,\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00100\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R>\u00105\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u00020708\u0012\u0004\u0012\u00020\u000e06X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00102\"\u0004\b?\u00104R\u001c\u0010@\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u001c\u0010C\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010$\"\u0004\bE\u0010&R\u001c\u0010F\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010&R\u001c\u0010I\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010$\"\u0004\bK\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/bytedance/ee/bear/middleground/comment/export/ICardAdapter;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "userId", "", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "clickLink", "Lkotlin/Function0;", "", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Ljava/lang/String;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;Lkotlin/jvm/functions/Function0;)V", "bizParams", "", "", "getBizParams", "()Ljava/util/Map;", "setBizParams", "(Ljava/util/Map;)V", "commentDetails", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getConfig", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "contentLinkClickListener", "Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "getContentLinkClickListener", "()Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;", "setContentLinkClickListener", "(Lcom/bytedance/ee/bear/span/AbsSpan$ISpanClickListener;)V", "currentReplyId", "getCurrentReplyId", "()Ljava/lang/String;", "setCurrentReplyId", "(Ljava/lang/String;)V", "imageItemMargin", "", "getImageItemMargin", "()I", "setImageItemMargin", "(I)V", "imageSize", "getImageSize", "setImageSize", "onClickEmpty", "getOnClickEmpty", "()Lkotlin/jvm/functions/Function0;", "setOnClickEmpty", "(Lkotlin/jvm/functions/Function0;)V", "onClickImageItem", "Lkotlin/Function4;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "", "getOnClickImageItem", "()Lkotlin/jvm/functions/Function4;", "setOnClickImageItem", "(Lkotlin/jvm/functions/Function4;)V", "onResolve", "getOnResolve", "setOnResolve", "parentToken", "getParentToken", "setParentToken", "parentType", "getParentType", "setParentType", "position", "getPosition", "setPosition", "quote", "getQuote", "setQuote", "adjustPosition", "textView", "Landroid/widget/TextView;", "tran", "Landroid/view/View;", "adjustTouchArea", "view", "bindContentViewHolder", "holder", "Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$ContentViewHolder;", "findReplyIdByPosition", "getBizParam", "getCommentId", "item", "getData", "getItemCount", "getItemViewType", "getLast3Item", "replyId", "getPostion", "isInEdit", "", "onBindViewHolder", "payloads", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemVisible", "first", "last", "retry", "retryView", "setAnim", "setAvatar", "setBackGround", "setCommentImageList", "setContent", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setLoaddingStatus", "setMore", "setProfile", "setReaction", "commentDetail", "setReactionTouchT", "setReslove", "setRetryView", "setTime", "setTranslateContent", "setTranslateIcon", "shouldHideDeleteButton", "updateImageSize", "Companion", "ContentViewHolder", "PlaceHolderViewHolder", "QuoteViewHolder", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements ICardAdapter {
    public static final Companion Companion = new Companion(null);
    public final ICommentFunction actionControl;
    private Map<Object, ? extends Object> bizParams;
    public final Function0<Unit> clickLink;
    public List<CommentBean.CommentDetail> commentDetails = new ArrayList();
    public final ICommentListeners commentListeners;
    private final Config config;
    private AbstractC10460a.AbstractC10461a contentLinkClickListener;
    private String currentReplyId;
    private int imageItemMargin;
    private int imageSize;
    private Function0<Unit> onClickEmpty;
    private Function4<? super String, ? super String, ? super CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, ? super List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> onClickImageItem;
    private Function0<Unit> onResolve;
    private String parentToken;
    private String parentType;
    private String position;
    private String quote;
    private final String userId;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$g */
    public static final class View$OnLongClickListenerC9006g implements View.OnLongClickListener {

        /* renamed from: a */
        public static final View$OnLongClickListenerC9006g f24283a = new View$OnLongClickListenerC9006g();

        View$OnLongClickListenerC9006g() {
        }

        public final boolean onLongClick(View view) {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$i */
    public static final class View$OnClickListenerC9008i implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9008i f24285a = new View$OnClickListenerC9008i();

        View$OnClickListenerC9008i() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$Companion;", "", "()V", "COMMENT_IMAGE_COL_THREE", "", "COMMENT_IMAGE_COL_TWO", "COMMENT_IMAGE_COUNT_FOUR", "COMMENT_IMAGE_ITEM_MARGIN", "", "COMMENT_IMAGE_OUTER_SPACE_WIDTH", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000205R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\rR\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\u0011\u0010*\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\rR\u0011\u00102\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u001a\u00104\u001a\u000205X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010:\u001a\u00020;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\u001dR\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$ContentViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2;Landroid/view/View;)V", "commentDetail", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "getCommentDetail", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "setCommentDetail", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;)V", "commentFailImg", "getCommentFailImg", "()Landroid/view/View;", "commentImageListRv", "Landroidx/recyclerview/widget/RecyclerView;", "getCommentImageListRv", "()Landroidx/recyclerview/widget/RecyclerView;", "commentListAdapter", "Lcom/bytedance/ee/bear/middleground/comment/image/CommentImageAdapter;", "getCommentListAdapter", "()Lcom/bytedance/ee/bear/middleground/comment/image/CommentImageAdapter;", "commentLoading", "Lcom/airbnb/lottie/LottieAnimationView;", "getCommentLoading", "()Lcom/airbnb/lottie/LottieAnimationView;", "content", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "getContent", "()Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "crateTime", "Landroid/widget/TextView;", "getCrateTime", "()Landroid/widget/TextView;", "deleteComment", "getDeleteComment", "holderView", "getHolderView", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "more", "getMore", "name", "getName", "reactionFlowLayout", "Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "getReactionFlowLayout", "()Lcom/ss/android/lark/reaction/widget/flowlayout/ReactionFlowLayout;", "retry", "getRetry", "sendFailTv", "getSendFailTv", "spanCount", "", "getSpanCount", "()I", "setSpanCount", "(I)V", "translate", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "getTranslate", "()Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "translateContent", "getTranslateContent", "userImg", "Landroid/widget/ImageView;", "getUserImg", "()Landroid/widget/ImageView;", "updateImageRecyclerViewSize", "", "imageCount", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$b */
    public final class ContentViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24254a;

        /* renamed from: b */
        private final View f24255b;

        /* renamed from: c */
        private final CommentTextView f24256c;

        /* renamed from: d */
        private final BearLottieView f24257d;

        /* renamed from: e */
        private final ImageView f24258e;

        /* renamed from: f */
        private final TextView f24259f;

        /* renamed from: g */
        private final TextView f24260g;

        /* renamed from: h */
        private final CommentTextView f24261h;

        /* renamed from: i */
        private final View f24262i;

        /* renamed from: j */
        private final ReactionFlowLayout f24263j;

        /* renamed from: k */
        private final LottieAnimationView f24264k;

        /* renamed from: l */
        private final View f24265l;

        /* renamed from: m */
        private final View f24266m;

        /* renamed from: n */
        private final TextView f24267n;

        /* renamed from: o */
        private final View f24268o;

        /* renamed from: p */
        private final RecyclerView f24269p;

        /* renamed from: q */
        private int f24270q = 3;

        /* renamed from: r */
        private final RecyclerView.AbstractC1335d f24271r;

        /* renamed from: s */
        private final C9201a f24272s;

        /* renamed from: t */
        private CommentBean.CommentDetail f24273t;

        /* renamed from: a */
        public final View mo34504a() {
            return this.f24255b;
        }

        /* renamed from: b */
        public final CommentTextView mo34507b() {
            return this.f24256c;
        }

        /* renamed from: c */
        public final BearLottieView mo34509c() {
            return this.f24257d;
        }

        /* renamed from: d */
        public final ImageView mo34510d() {
            return this.f24258e;
        }

        /* renamed from: e */
        public final TextView mo34511e() {
            return this.f24259f;
        }

        /* renamed from: f */
        public final TextView mo34512f() {
            return this.f24260g;
        }

        /* renamed from: g */
        public final CommentTextView mo34513g() {
            return this.f24261h;
        }

        /* renamed from: h */
        public final View mo34514h() {
            return this.f24262i;
        }

        /* renamed from: i */
        public final ReactionFlowLayout mo34515i() {
            return this.f24263j;
        }

        /* renamed from: j */
        public final LottieAnimationView mo34516j() {
            return this.f24264k;
        }

        /* renamed from: k */
        public final View mo34517k() {
            return this.f24265l;
        }

        /* renamed from: l */
        public final View mo34518l() {
            return this.f24266m;
        }

        /* renamed from: m */
        public final TextView mo34519m() {
            return this.f24267n;
        }

        /* renamed from: n */
        public final View mo34520n() {
            return this.f24268o;
        }

        /* renamed from: o */
        public final RecyclerView mo34521o() {
            return this.f24269p;
        }

        /* renamed from: p */
        public final int mo34522p() {
            return this.f24270q;
        }

        /* renamed from: q */
        public final C9201a mo34523q() {
            return this.f24272s;
        }

        /* renamed from: r */
        public final CommentBean.CommentDetail mo34524r() {
            return this.f24273t;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$ContentViewHolder$itemDecoration$1", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$b$a */
        public static final class C9003a extends RecyclerView.AbstractC1335d {

            /* renamed from: a */
            final /* synthetic */ ContentViewHolder f24275a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C9003a(ContentViewHolder bVar) {
                this.f24275a = bVar;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Intrinsics.checkParameterIsNotNull(rect, "outRect");
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(recyclerView, "parent");
                Intrinsics.checkParameterIsNotNull(state, "state");
                rect.top = 0;
                rect.bottom = this.f24275a.f24254a.getImageItemMargin();
                rect.left = ((recyclerView.getChildLayoutPosition(view) % this.f24275a.mo34522p()) * this.f24275a.f24254a.getImageItemMargin()) / this.f24275a.mo34522p();
                rect.right = ((this.f24275a.f24254a.getImageItemMargin() * (this.f24275a.mo34522p() - 1)) / this.f24275a.mo34522p()) - rect.left;
            }
        }

        /* renamed from: a */
        public final void mo34505a(int i) {
            this.f24270q = i;
        }

        /* renamed from: a */
        public final void mo34506a(CommentBean.CommentDetail commentDetail) {
            this.f24273t = commentDetail;
        }

        /* renamed from: b */
        public final void mo34508b(int i) {
            if (i > 0) {
                this.f24272s.mo34918b(this.f24254a.getImageSize());
                ViewGroup.LayoutParams layoutParams = this.f24269p.getLayoutParams();
                int imageSize = this.f24254a.getImageSize() + this.f24254a.getImageItemMargin();
                int i2 = this.f24270q;
                layoutParams.height = imageSize * (((i + i2) - 1) / i2);
                this.f24269p.setLayoutParams(layoutParams);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ContentViewHolder(CardAdapter2 cardAdapter2, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f24254a = cardAdapter2;
            View findViewById = view.findViewById(R.id.comment_card_holder);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.comment_card_holder)");
            this.f24255b = findViewById;
            View findViewById2 = view.findViewById(R.id.tv_content_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.tv_content_translate)");
            CommentTextView commentTextView = (CommentTextView) findViewById2;
            this.f24256c = commentTextView;
            View findViewById3 = view.findViewById(R.id.iv_translate);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_translate)");
            this.f24257d = (BearLottieView) findViewById3;
            View findViewById4 = view.findViewById(R.id.user_msg_image);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.user_msg_image)");
            this.f24258e = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tv_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.tv_name)");
            this.f24259f = (TextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tv_create_at);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.tv_create_at)");
            this.f24260g = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.tv_content);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.tv_content)");
            CommentTextView commentTextView2 = (CommentTextView) findViewById7;
            this.f24261h = commentTextView2;
            View findViewById8 = view.findViewById(R.id.tv_opt_comment);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.tv_opt_comment)");
            this.f24262i = findViewById8;
            View findViewById9 = view.findViewById(R.id.reaction_layout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById9, "itemView.findViewById(R.id.reaction_layout)");
            this.f24263j = (ReactionFlowLayout) findViewById9;
            View findViewById10 = view.findViewById(R.id.comment_loading);
            Intrinsics.checkExpressionValueIsNotNull(findViewById10, "itemView.findViewById(R.id.comment_loading)");
            this.f24264k = (LottieAnimationView) findViewById10;
            View findViewById11 = view.findViewById(R.id.comment_fail_img);
            Intrinsics.checkExpressionValueIsNotNull(findViewById11, "itemView.findViewById(R.id.comment_fail_img)");
            this.f24265l = findViewById11;
            View findViewById12 = view.findViewById(R.id.comment_retry);
            Intrinsics.checkExpressionValueIsNotNull(findViewById12, "itemView.findViewById(R.id.comment_retry)");
            this.f24266m = findViewById12;
            View findViewById13 = view.findViewById(R.id.comment_send_fail);
            Intrinsics.checkExpressionValueIsNotNull(findViewById13, "itemView.findViewById(R.id.comment_send_fail)");
            this.f24267n = (TextView) findViewById13;
            View findViewById14 = view.findViewById(R.id.delete_comment);
            Intrinsics.checkExpressionValueIsNotNull(findViewById14, "itemView.findViewById(R.id.delete_comment)");
            this.f24268o = findViewById14;
            View findViewById15 = view.findViewById(R.id.rv_comment_image_list);
            Intrinsics.checkExpressionValueIsNotNull(findViewById15, "itemView.findViewById(R.id.rv_comment_image_list)");
            RecyclerView recyclerView = (RecyclerView) findViewById15;
            this.f24269p = recyclerView;
            C9003a aVar = new C9003a(this);
            this.f24271r = aVar;
            C9201a aVar2 = new C9201a(cardAdapter2.getConfig().mo35279a());
            this.f24272s = aVar2;
            aVar2.mo34915a(false);
            aVar2.mo34907a(new C9201a.AbstractC9202a(this) {
                /* class com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2.ContentViewHolder.C90021 */

                /* renamed from: a */
                final /* synthetic */ ContentViewHolder f24274a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f24274a = r1;
                }

                @Override // com.bytedance.ee.bear.middleground.comment.p447e.C9201a.AbstractC9202a
                /* renamed from: a */
                public void mo34525a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
                    String str;
                    String reply_id;
                    if (commentImageEntity != null) {
                        CommentBean.CommentDetail r = this.f24274a.mo34524r();
                        if (r != null) {
                            str = this.f24274a.f24254a.getCommentId(r);
                        } else {
                            str = null;
                        }
                        Function4<String, String, CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> onClickImageItem = this.f24274a.f24254a.getOnClickImageItem();
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        CommentBean.CommentDetail r2 = this.f24274a.mo34524r();
                        if (!(r2 == null || (reply_id = r2.getReply_id()) == null)) {
                            str2 = reply_id;
                        }
                        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> b = this.f24274a.mo34523q().mo34917b();
                        Intrinsics.checkExpressionValueIsNotNull(b, "commentListAdapter.selectedImageList");
                        onClickImageItem.invoke(str, str2, commentImageEntity, b);
                    }
                }
            });
            aVar2.mo34918b(cardAdapter2.getImageSize());
            aVar2.mo34913a(cardAdapter2.getConfig().mo35329h());
            aVar2.mo34906a(cardAdapter2.getConfig().mo35332j().mo32555b());
            recyclerView.setLayoutManager(new GridLayoutManager(cardAdapter2.getConfig().mo35279a(), 3));
            recyclerView.addItemDecoration(aVar);
            recyclerView.setAdapter(aVar2);
            if (cardAdapter2.getConfig().mo35349z()) {
                C25649b.m91857a(commentTextView2, LarkFont.BODY2);
                C25649b.m91857a(commentTextView, LarkFont.BODY2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$QuoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2;Landroid/view/View;)V", "divider", "getDivider", "()Landroid/view/View;", "quoteText", "Landroid/widget/TextView;", "getQuoteText", "()Landroid/widget/TextView;", "resolveView", "Landroid/widget/ImageView;", "getResolveView", "()Landroid/widget/ImageView;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$d */
    public final class QuoteViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24276a;

        /* renamed from: b */
        private final View f24277b;

        /* renamed from: c */
        private final TextView f24278c;

        /* renamed from: d */
        private final ImageView f24279d;

        /* renamed from: a */
        public final TextView mo34526a() {
            return this.f24278c;
        }

        /* renamed from: b */
        public final ImageView mo34527b() {
            return this.f24279d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public QuoteViewHolder(CardAdapter2 cardAdapter2, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f24276a = cardAdapter2;
            View findViewById = view.findViewById(R.id.comment_card_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.comment_card_divider)");
            this.f24277b = findViewById;
            View findViewById2 = view.findViewById(R.id.comment_card_quote);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.comment_card_quote)");
            TextView textView = (TextView) findViewById2;
            this.f24278c = textView;
            View findViewById3 = view.findViewById(R.id.comment_card_reply);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.comment_card_reply)");
            this.f24279d = (ImageView) findViewById3;
            if (cardAdapter2.getConfig().mo35349z()) {
                C25649b.m91857a(textView, LarkFont.BODY2);
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            layoutParams.height = (int) LKUIDisplayManager.m91865a(context, LarkFont.BODY2);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public Map<Object, Object> getBizParam() {
        return this.bizParams;
    }

    public final Map<Object, Object> getBizParams() {
        return this.bizParams;
    }

    /* access modifiers changed from: protected */
    public final Config getConfig() {
        return this.config;
    }

    public final AbstractC10460a.AbstractC10461a getContentLinkClickListener() {
        return this.contentLinkClickListener;
    }

    public final String getCurrentReplyId() {
        return this.currentReplyId;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public List<CommentBean.CommentDetail> getData() {
        return this.commentDetails;
    }

    public final int getImageItemMargin() {
        return this.imageItemMargin;
    }

    public final int getImageSize() {
        return this.imageSize;
    }

    public final Function0<Unit> getOnClickEmpty() {
        return this.onClickEmpty;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.p<? super java.lang.String, ? super java.lang.String, ? super com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity, ? super java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity>, kotlin.Unit>, kotlin.jvm.functions.p<java.lang.String, java.lang.String, com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity, java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity>, kotlin.Unit> */
    public final Function4<String, String, CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> getOnClickImageItem() {
        return this.onClickImageItem;
    }

    public final Function0<Unit> getOnResolve() {
        return this.onResolve;
    }

    public final String getParentToken() {
        return this.parentToken;
    }

    public final String getParentType() {
        return this.parentType;
    }

    public final String getPosition() {
        return this.position;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String getPostion() {
        return this.position;
    }

    public final String getQuote() {
        return this.quote;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.commentDetails.size();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$s */
    public static final class RunnableC9020s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24313a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24314b;

        RunnableC9020s(CardAdapter2 cardAdapter2, ContentViewHolder bVar) {
            this.f24313a = cardAdapter2;
            this.f24314b = bVar;
        }

        public final void run() {
            this.f24313a.adjustTouchArea(this.f24314b.mo34509c());
        }
    }

    private final boolean isInEdit() {
        List<CommentBean.CommentDetail> list = this.commentDetails;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isEditStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void updateImageSize() {
        this.imageSize = ((C52990a.m205242e(this.config.mo35279a()) - C52990a.m205224a((Context) this.config.mo35279a(), 89.0f)) - (this.imageItemMargin * 2)) / 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$adjustPosition$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$e */
    public static final class ViewTreeObserver$OnPreDrawListenerC9004e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ TextView f24280a;

        /* renamed from: b */
        final /* synthetic */ View f24281b;

        public boolean onPreDraw() {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.f24280a.getGlobalVisibleRect(rect);
            this.f24281b.getGlobalVisibleRect(rect2);
            String obj = this.f24280a.getText().toString();
            int lineCount = this.f24280a.getLineCount();
            if (this.f24280a.getLayout() == null) {
                this.f24280a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            int i = lineCount - 1;
            int lineStart = this.f24280a.getLayout().getLineStart(i);
            int lineEnd = this.f24280a.getLayout().getLineEnd(i);
            if (obj != null) {
                String substring = obj.substring(lineStart, lineEnd);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                ConstraintLayout.LayoutParams layoutParams = null;
                if (((float) (rect2.left - rect.left)) <= this.f24280a.getPaint().measureText(StringsKt.replace$default(substring, "<doc.at.~#_%=`>", "     ", false, 4, (Object) null))) {
                    View view = this.f24281b;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (!(layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
                        layoutParams2 = null;
                    }
                    ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
                    if (layoutParams3 != null) {
                        layoutParams3.f2817i = R.id.tv_content_translate;
                        layoutParams3.f2819k = -1;
                        layoutParams = layoutParams3;
                    }
                    view.setLayoutParams(layoutParams);
                } else {
                    View view2 = this.f24281b;
                    ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                    if (!(layoutParams4 instanceof ConstraintLayout.LayoutParams)) {
                        layoutParams4 = null;
                    }
                    ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
                    if (layoutParams5 != null) {
                        layoutParams5.f2819k = R.id.tv_content_translate;
                        layoutParams5.f2817i = -1;
                        layoutParams = layoutParams5;
                    }
                    view2.setLayoutParams(layoutParams);
                }
                this.f24280a.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }

        ViewTreeObserver$OnPreDrawListenerC9004e(TextView textView, View view) {
            this.f24280a = textView;
            this.f24281b = view;
        }
    }

    public final void setBizParams(Map<Object, ? extends Object> map) {
        this.bizParams = map;
    }

    public final void setCurrentReplyId(String str) {
        this.currentReplyId = str;
    }

    public final void setImageItemMargin(int i) {
        this.imageItemMargin = i;
    }

    public final void setImageSize(int i) {
        this.imageSize = i;
    }

    public final void setOnClickEmpty(Function0<Unit> function0) {
        this.onClickEmpty = function0;
    }

    public final void setOnResolve(Function0<Unit> function0) {
        this.onResolve = function0;
    }

    public final void setParentToken(String str) {
        this.parentToken = str;
    }

    public final void setParentType(String str) {
        this.parentType = str;
    }

    public final void setPosition(String str) {
        this.position = str;
    }

    public final void setQuote(String str) {
        this.quote = str;
    }

    public final void setContentLinkClickListener(AbstractC10460a.AbstractC10461a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.contentLinkClickListener = aVar;
    }

    public final void setOnClickImageItem(Function4<? super String, ? super String, ? super CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, ? super List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "<set-?>");
        this.onClickImageItem = pVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter2$PlaceHolderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$c */
    public static final class PlaceHolderViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PlaceHolderViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$f */
    public static final class View$OnClickListenerC9005f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24282a;

        View$OnClickListenerC9005f(CardAdapter2 cardAdapter2) {
            this.f24282a = cardAdapter2;
        }

        public final void onClick(View view) {
            Function0<Unit> onClickEmpty = this.f24282a.getOnClickEmpty();
            if (onClickEmpty != null) {
                onClickEmpty.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$h */
    public static final class View$OnClickListenerC9007h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24284a;

        View$OnClickListenerC9007h(CardAdapter2 cardAdapter2) {
            this.f24284a = cardAdapter2;
        }

        public final void onClick(View view) {
            Function0<Unit> onResolve = this.f24284a.getOnResolve();
            if (onResolve != null) {
                onResolve.invoke();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String getCommentId(CommentBean.CommentDetail commentDetail) {
        Intrinsics.checkParameterIsNotNull(commentDetail, "item");
        String comment_id = commentDetail.getComment_id();
        if (comment_id != null) {
            return comment_id;
        }
        return "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return CardAdapterHelper.f24333a.mo34548a(i, this.commentDetails);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public List<CommentBean.CommentDetail> getLast3Item(String str) {
        Intrinsics.checkParameterIsNotNull(str, "replyId");
        return new ArrayList();
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public void setData(List<? extends CommentBean.CommentDetail> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.commentDetails = C69121n.m265989f(list);
    }

    public final void setReactionTouchT(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.actionControl.mo34629a((float) iArr[1]);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$ab */
    public static final class View$OnClickListenerC9000ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24249a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24250b;

        View$OnClickListenerC9000ab(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24249a = cardAdapter2;
            this.f24250b = commentDetail;
        }

        public final void onClick(View view) {
            ICommentFunction eVar = this.f24249a.actionControl;
            String comment_id = this.f24250b.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24250b.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar.mo34650b(comment_id, reply_id);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$n */
    public static final class View$OnClickListenerC9015n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24301a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24302b;

        View$OnClickListenerC9015n(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24301a = cardAdapter2;
            this.f24302b = commentDetail;
        }

        public final void onClick(View view) {
            ICommentFunction eVar = this.f24301a.actionControl;
            String comment_id = this.f24302b.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24302b.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar.mo34650b(comment_id, reply_id);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$q */
    public static final class C9018q implements C9201a.AbstractC9204c {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24307a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24308b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24309c;

        C9018q(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24307a = cardAdapter2;
            this.f24308b = bVar;
            this.f24309c = commentDetail;
        }

        @Override // com.bytedance.ee.bear.middleground.comment.p447e.C9201a.AbstractC9204c
        /* renamed from: a */
        public final void mo34540a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
            ICommentFunction eVar = this.f24307a.actionControl;
            View view = this.f24308b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            eVar.mo34630a(view, this.f24309c, this.f24307a, this.f24308b.getAdapterPosition());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$r */
    public static final class View$OnLongClickListenerC9019r implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24310a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24311b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24312c;

        View$OnLongClickListenerC9019r(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24310a = cardAdapter2;
            this.f24311b = bVar;
            this.f24312c = commentDetail;
        }

        public final boolean onLongClick(View view) {
            ICommentFunction eVar = this.f24310a.actionControl;
            View view2 = this.f24311b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24312c, this.f24310a, this.f24311b.getAdapterPosition());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReactionClicked"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$y */
    public static final class C9026y implements ReactionBaseFlowLayout.AbstractC53049d {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24329a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24330b;

        C9026y(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24329a = cardAdapter2;
            this.f24330b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53049d
        public final void onReactionClicked(String str) {
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            this.f24329a.actionControl.mo34638a(this.f24329a, str, this.f24330b, (View) null);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public String findReplyIdByPosition(int i) {
        if (i >= this.commentDetails.size()) {
            return "";
        }
        String reply_id = this.commentDetails.get(i).getReply_id();
        Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetails[position].reply_id");
        return reply_id;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$p */
    public static final class C9017p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ContentViewHolder f24306a;

        C9017p(ContentViewHolder bVar) {
            this.f24306a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View a = this.f24306a.mo34504a();
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                a.setBackgroundTintList(ColorStateList.valueOf(((Integer) animatedValue).intValue()));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$t */
    public static final class View$OnClickListenerC9021t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24315a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24316b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24317c;

        View$OnClickListenerC9021t(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24315a = cardAdapter2;
            this.f24316b = bVar;
            this.f24317c = commentDetail;
        }

        public final void onClick(View view) {
            CardAdapter2 cardAdapter2 = this.f24315a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            cardAdapter2.setReactionTouchT(view);
            ICommentFunction eVar = this.f24315a.actionControl;
            View view2 = this.f24316b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24317c, this.f24315a, this.f24316b.getAdapterPosition());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$u */
    public static final class View$OnLongClickListenerC9022u implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24318a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24319b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24320c;

        View$OnLongClickListenerC9022u(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24318a = cardAdapter2;
            this.f24319b = bVar;
            this.f24320c = commentDetail;
        }

        public final boolean onLongClick(View view) {
            CardAdapter2 cardAdapter2 = this.f24318a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            cardAdapter2.setReactionTouchT(view);
            ICommentFunction eVar = this.f24318a.actionControl;
            View view2 = this.f24319b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24320c, this.f24318a, this.f24319b.getAdapterPosition());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$v */
    public static final class View$OnLongClickListenerC9023v implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24321a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24322b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24323c;

        View$OnLongClickListenerC9023v(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24321a = cardAdapter2;
            this.f24322b = bVar;
            this.f24323c = commentDetail;
        }

        public final boolean onLongClick(View view) {
            CardAdapter2 cardAdapter2 = this.f24321a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            cardAdapter2.setReactionTouchT(view);
            ICommentFunction eVar = this.f24321a.actionControl;
            View view2 = this.f24322b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24323c, this.f24321a, this.f24322b.getAdapterPosition());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$w */
    public static final class View$OnLongClickListenerC9024w implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24324a;

        /* renamed from: b */
        final /* synthetic */ ContentViewHolder f24325b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24326c;

        View$OnLongClickListenerC9024w(CardAdapter2 cardAdapter2, ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
            this.f24324a = cardAdapter2;
            this.f24325b = bVar;
            this.f24326c = commentDetail;
        }

        public final boolean onLongClick(View view) {
            CardAdapter2 cardAdapter2 = this.f24324a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            cardAdapter2.setReactionTouchT(view);
            ICommentFunction eVar = this.f24324a.actionControl;
            View view2 = this.f24325b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            eVar.mo34630a(view2, this.f24326c, this.f24324a, this.f24325b.getAdapterPosition());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$x */
    public static final class View$OnClickListenerC9025x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24327a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24328b;

        View$OnClickListenerC9025x(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24327a = cardAdapter2;
            this.f24328b = commentDetail;
        }

        public final void onClick(View view) {
            if (!this.f24328b.isAnonymous()) {
                AbstractC9106c a = C9185d.m37997a();
                if (a == null || !a.mo34729b()) {
                    this.f24327a.commentListeners.mo34289M().invoke(this.f24328b.getUser_id());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "reactionKey", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$z */
    public static final class C9027z implements ReactionBaseFlowLayout.AbstractC53047b {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24331a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24332b;

        C9027z(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24331a = cardAdapter2;
            this.f24332b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53047b
        public final void perform(String str) {
            ICommentFunction eVar = this.f24331a.actionControl;
            FragmentManager supportFragmentManager = this.f24331a.getConfig().mo35279a().getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "config.activity.supportFragmentManager");
            CommentBean.CommentDetail commentDetail = this.f24332b;
            Intrinsics.checkExpressionValueIsNotNull(str, "reactionKey");
            eVar.mo34633a(supportFragmentManager, commentDetail, str);
        }
    }

    private final boolean shouldHideDeleteButton(CommentBean.CommentDetail commentDetail) {
        if (commentDetail.getError().isSuccess() || Intrinsics.areEqual(commentDetail.getRetryType(), "delete") || Intrinsics.areEqual(commentDetail.getRetryType(), "update")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "perform"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$aa */
    public static final class C8999aa implements ReactionBaseFlowLayout.AbstractC53046a {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24247a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24248b;

        C8999aa(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail) {
            this.f24247a = cardAdapter2;
            this.f24248b = commentDetail;
        }

        @Override // com.ss.android.lark.reaction.widget.flowlayout.ReactionBaseFlowLayout.AbstractC53046a
        public final void perform(String str) {
            List<ReactionDetailUserInfo> userList;
            boolean z = false;
            try {
                List<Reaction> reaction = this.f24248b.getReaction();
                if (reaction != null) {
                    for (T t : reaction) {
                        ReactionDetailUserInfo reactionDetailUserInfo = null;
                        if (!(t == null || (userList = t.getUserList()) == null)) {
                            Iterator<T> it = userList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                T t2 = next;
                                if (Intrinsics.areEqual(t2 != null ? t2.getUserId() : null, str)) {
                                    reactionDetailUserInfo = next;
                                    break;
                                }
                            }
                            reactionDetailUserInfo = reactionDetailUserInfo;
                        }
                        if (reactionDetailUserInfo != null) {
                            z = reactionDetailUserInfo.isAnonymous();
                        }
                    }
                }
                if (!z) {
                    AbstractC9106c a = C9185d.m37997a();
                    Intrinsics.checkExpressionValueIsNotNull(a, "CommentServiceImpl.getCommentService()");
                    if (a.mo34729b()) {
                        return;
                    }
                    this.f24247a.commentListeners.mo34289M().invoke(str);
                }
            } catch (Exception e) {
                C13479a.m54761a("CardAdapter2", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$j */
    public static final class View$OnClickListenerC9009j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24286a;

        /* renamed from: b */
        final /* synthetic */ int f24287b;

        View$OnClickListenerC9009j(CardAdapter2 cardAdapter2, int i) {
            this.f24286a = cardAdapter2;
            this.f24287b = i;
        }

        public final void onClick(View view) {
            CommentInputRequest commentInputRequest = new CommentInputRequest();
            commentInputRequest.is_whole = true;
            commentInputRequest.doc_token = this.f24286a.getConfig().mo35329h();
            commentInputRequest.type = 0;
            commentInputRequest.show_voice = true;
            commentInputRequest.show_comment_image = true;
            commentInputRequest.show_insert_image = true;
            ICommentListeners fVar = this.f24286a.commentListeners;
            if (fVar != null) {
                ((Comment) fVar).mo34302a(commentInputRequest);
                this.f24286a.commentDetails.get(this.f24287b).setInReply(true);
                ((Comment) this.f24286a.commentListeners).mo34298a(this.f24286a.getItemCount() - 2);
                CardAdapter2 cardAdapter2 = this.f24286a;
                cardAdapter2.notifyItemChanged(cardAdapter2.getItemCount() - 1);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.comment.Comment");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$m */
    public static final class View$OnClickListenerC9014m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24298a;

        /* renamed from: b */
        final /* synthetic */ boolean f24299b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24300c;

        View$OnClickListenerC9014m(CardAdapter2 cardAdapter2, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24298a = cardAdapter2;
            this.f24299b = z;
            this.f24300c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24299b) {
                ICommentFunction eVar = this.f24298a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24300c;
                CardAdapter2 cardAdapter2 = this.f24298a;
                eVar.mo34625a(commentDetail, cardAdapter2, cardAdapter2.getQuote(), 2, this.f24298a.getParentType(), this.f24298a.getParentToken(), this.f24298a.getBizParams());
                return;
            }
            ICommentFunction eVar2 = this.f24298a.actionControl;
            String content = this.f24300c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24300c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String comment_id = this.f24300c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24300c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar2.mo34643a(content, list, comment_id, reply_id, this.f24298a.getPosition(), this.f24298a.getBizParams());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$o */
    public static final class View$OnClickListenerC9016o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24303a;

        /* renamed from: b */
        final /* synthetic */ boolean f24304b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24305c;

        View$OnClickListenerC9016o(CardAdapter2 cardAdapter2, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24303a = cardAdapter2;
            this.f24304b = z;
            this.f24305c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24304b) {
                ICommentFunction eVar = this.f24303a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24305c;
                CardAdapter2 cardAdapter2 = this.f24303a;
                eVar.mo34625a(commentDetail, cardAdapter2, cardAdapter2.getQuote(), 1, this.f24303a.getParentType(), this.f24303a.getParentToken(), this.f24303a.getBizParams());
                return;
            }
            ICommentFunction eVar2 = this.f24303a.actionControl;
            String content = this.f24305c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24305c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String comment_id = this.f24305c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24305c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            eVar2.mo34643a(content, list, comment_id, reply_id, this.f24303a.getPosition(), this.f24303a.getBizParams());
        }
    }

    public final void adjustTouchArea(View view) {
        if (view.getVisibility() != 0) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((View) parent).setTouchDelegate(null);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            ((View) parent2).setTouchDelegate(new TouchDelegate(new Rect(rect.left - 200, rect.top - 30, rect.right + LocationRequest.PRIORITY_HD_ACCURACY, rect.bottom + LocationRequest.PRIORITY_HD_ACCURACY), view));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$ac */
    public static final class View$OnClickListenerC9001ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24251a;

        /* renamed from: b */
        final /* synthetic */ CommentBean.CommentDetail f24252b;

        /* renamed from: c */
        final /* synthetic */ ContentViewHolder f24253c;

        View$OnClickListenerC9001ac(CardAdapter2 cardAdapter2, CommentBean.CommentDetail commentDetail, ContentViewHolder bVar) {
            this.f24251a = cardAdapter2;
            this.f24252b = commentDetail;
            this.f24253c = bVar;
        }

        public final void onClick(View view) {
            if (this.f24252b.getTranslate_status() == null || Intrinsics.areEqual(this.f24252b.getTranslate_status(), "default")) {
                this.f24252b.setTranslate_status("loading");
                this.f24251a.notifyItemChanged(this.f24253c.getLayoutPosition());
                ICommentFunction eVar = this.f24251a.actionControl;
                String commentId = this.f24251a.getCommentId(this.f24252b);
                String reply_id = this.f24252b.getReply_id();
                Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
                eVar.mo34640a(commentId, reply_id);
            } else if (Intrinsics.areEqual(this.f24252b.getTranslate_status(), "success") || Intrinsics.areEqual(this.f24252b.getTranslate_status(), "error")) {
                this.f24251a.getConfig().mo35325e().mo35302a("show_original_click", this.f24251a.getCommentId(this.f24252b), this.f24252b.getReply_id(), null);
                CommentTranslate.f24837a.mo35291a().put(this.f24252b.getReply_id(), Boolean.valueOf(!Intrinsics.areEqual((Object) CommentTranslate.f24837a.mo35291a().get(this.f24252b.getReply_id()), (Object) true)));
                this.f24251a.notifyItemChanged(this.f24253c.getLayoutPosition());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$l */
    public static final class View$OnClickListenerC9013l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardAdapter2 f24295a;

        /* renamed from: b */
        final /* synthetic */ boolean f24296b;

        /* renamed from: c */
        final /* synthetic */ CommentBean.CommentDetail f24297c;

        View$OnClickListenerC9013l(CardAdapter2 cardAdapter2, boolean z, CommentBean.CommentDetail commentDetail) {
            this.f24295a = cardAdapter2;
            this.f24296b = z;
            this.f24297c = commentDetail;
        }

        public final void onClick(View view) {
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
            if (this.f24296b) {
                ICommentFunction eVar = this.f24295a.actionControl;
                CommentBean.CommentDetail commentDetail = this.f24297c;
                CardAdapter2 cardAdapter2 = this.f24295a;
                eVar.mo34625a(commentDetail, cardAdapter2, cardAdapter2.getQuote(), 0, this.f24295a.getParentType(), this.f24295a.getParentToken(), this.f24295a.getBizParams());
                return;
            }
            ICommentFunction eVar2 = this.f24295a.actionControl;
            String content = this.f24297c.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "item.content");
            CommentBean.CommentDetail.ExtraEntity extra = this.f24297c.getExtra();
            if (extra != null) {
                list = extra.getImage_list();
            } else {
                list = null;
            }
            String quote = this.f24295a.getQuote();
            String comment_id = this.f24297c.getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "item.comment_id");
            String reply_id = this.f24297c.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "item.reply_id");
            ICommentFunction.C9099a.m37775a(eVar2, content, list, quote, comment_id, reply_id, this.f24295a.getParentType(), this.f24295a.getParentToken(), null, this.f24295a.getPosition(), this.f24295a.getBizParams(), SmActions.ACTION_ONTHECALL_EXIT, null);
        }
    }

    private final void setProfile(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        bVar.mo34510d().setOnClickListener(new View$OnClickListenerC9025x(this, commentDetail));
    }

    private final void adjustPosition(TextView textView, View view) {
        if (textView.getVisibility() == 0 && view.getVisibility() == 0) {
            textView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC9004e(textView, view));
        }
    }

    private final void setLoaddingStatus(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        if (commentDetail.isSending()) {
            bVar.mo34516j().setVisibility(0);
            bVar.mo34516j().playAnimation();
            return;
        }
        bVar.mo34516j().setVisibility(8);
    }

    private final void setReslove(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        if (this.onResolve == null || commentDetail.isSending()) {
            bVar.itemView.setOnLongClickListener(null);
            bVar.mo34513g().setOnLongClickListener(null);
        }
    }

    private final void setAvatar(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        View view = bVar.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
        ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(view.getContext()).mo10414a(new C13664a(commentDetail.getAvatar_url())).mo11129a(AbstractC2354j.f7813c)).mo11123a(R.drawable.facade_common_avatar_place_holder)).mo10399a(bVar.mo34510d());
    }

    private final void setBackGround(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        boolean isEditStatus = commentDetail.isEditStatus();
        int i2 = R.drawable.facade_round_around_m;
        if (!isEditStatus) {
            i = R.color.bg_float;
        } else if (commentDetail.isWholeComment()) {
            i2 = R.drawable.facade_rectangle;
            i = R.color.ud_N100;
        } else {
            i = R.color.comment_rounded_conner_bg_color;
        }
        bVar.mo34504a().setBackgroundResource(i2);
        bVar.mo34504a().setBackgroundTintList(bVar.mo34504a().getResources().getColorStateList(i));
    }

    private final void bindContentViewHolder(ContentViewHolder bVar, int i) {
        CommentBean.CommentDetail commentDetail = this.commentDetails.get(i);
        if (commentDetail.getReply_id() != null) {
            setBackGround(bVar, commentDetail);
            setReslove(bVar, commentDetail);
            setAvatar(bVar, commentDetail);
            setProfile(bVar, commentDetail);
            setTranslateIcon(bVar, commentDetail);
            setContent(bVar, commentDetail);
            bVar.mo34511e().setText(commentDetail.getName());
            setTime(commentDetail, bVar);
            setReaction(bVar, commentDetail);
            setTranslateContent(bVar, commentDetail);
            setMore(bVar, commentDetail);
            setCommentImageList(bVar, commentDetail);
            setAnim(bVar, commentDetail);
            setLoaddingStatus(bVar, commentDetail);
            setRetryView(bVar, commentDetail);
        }
    }

    private final void setAnim(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        if (!TextUtils.isEmpty(this.currentReplyId) && Intrinsics.areEqual(this.currentReplyId, commentDetail.getReply_id())) {
            View view = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            int color = view.getResources().getColor(R.color.comment_rounded_conner_bg_color);
            View view2 = bVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            int color2 = view2.getResources().getColor(R.color.bg_float);
            bVar.mo34504a().setBackgroundTintList(ColorStateList.valueOf(color));
            ValueAnimator ofInt = ValueAnimator.ofInt(color, color2);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.addUpdateListener(new C9017p(bVar));
            ofInt.setDuration(500L);
            Intrinsics.checkExpressionValueIsNotNull(ofInt, "valueAnimator");
            ofInt.setStartDelay(1000);
            ofInt.start();
            this.currentReplyId = null;
        }
    }

    private final void setContent(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        CommentTextView g = bVar.mo34513g();
        if (!TextUtils.isEmpty(commentDetail.getContent())) {
            i = 0;
        } else {
            i = 8;
        }
        g.setVisibility(i);
        RichTextInjector.m38468a(bVar.mo34513g(), this.userId, this.contentLinkClickListener);
        bVar.mo34513g().setMovementMethod(C7727a.m30901a());
        if (CommentTranslate.f24837a.mo35292a(this.config.mo35342t(), commentDetail)) {
            bVar.mo34513g().setRawString(commentDetail.getTranslate_content());
        } else {
            bVar.mo34513g().setRawString(commentDetail.getContent());
        }
        adjustPosition(bVar.mo34513g(), bVar.mo34509c());
        bVar.mo34513g().post(new RunnableC9020s(this, bVar));
    }

    private final void setMore(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        View h = bVar.mo34514h();
        if (!commentDetail.isSending()) {
            ErrorBean error = commentDetail.getError();
            Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
            if (error.isSuccess() && (!isInEdit() || commentDetail.isWholeComment())) {
                i = 0;
                h.setVisibility(i);
                bVar.mo34514h().setOnClickListener(new View$OnClickListenerC9021t(this, bVar, commentDetail));
                bVar.itemView.setOnLongClickListener(new View$OnLongClickListenerC9022u(this, bVar, commentDetail));
                bVar.mo34513g().setOnLongClickListener(new View$OnLongClickListenerC9023v(this, bVar, commentDetail));
                bVar.mo34507b().setOnLongClickListener(new View$OnLongClickListenerC9024w(this, bVar, commentDetail));
            }
        }
        i = 8;
        h.setVisibility(i);
        bVar.mo34514h().setOnClickListener(new View$OnClickListenerC9021t(this, bVar, commentDetail));
        bVar.itemView.setOnLongClickListener(new View$OnLongClickListenerC9022u(this, bVar, commentDetail));
        bVar.mo34513g().setOnLongClickListener(new View$OnLongClickListenerC9023v(this, bVar, commentDetail));
        bVar.mo34507b().setOnLongClickListener(new View$OnLongClickListenerC9024w(this, bVar, commentDetail));
    }

    private final void setRetryView(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        int i2;
        retry(commentDetail, bVar.mo34519m());
        retry(commentDetail, bVar.mo34518l());
        retry(commentDetail, bVar.mo34517k());
        ErrorBean error = commentDetail.getError();
        Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
        if (error.isNetFail()) {
            i = R.string.Doc_Comment_Send_Fail_By_Net;
        } else {
            ErrorBean error2 = commentDetail.getError();
            Intrinsics.checkExpressionValueIsNotNull(error2, "item.error");
            if (error2.isReviewFail()) {
                i = ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39495a();
            } else {
                i = R.string.Doc_Comment_CommentSendFailed;
            }
        }
        bVar.mo34519m().setText(this.config.mo35279a().getText(i));
        View n = bVar.mo34520n();
        if (shouldHideDeleteButton(commentDetail)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        n.setVisibility(i2);
        bVar.mo34520n().setOnClickListener(new View$OnClickListenerC9000ab(this, commentDetail));
    }

    private final void setTime(CommentBean.CommentDetail commentDetail, ContentViewHolder bVar) {
        String str;
        try {
            if (commentDetail.getModify() == 1) {
                long update_timestamp = ((long) commentDetail.getUpdate_timestamp()) * ((long) 1000);
                str = C13723a.m55654a(bVar.mo34512f().getContext(), update_timestamp) + bVar.mo34512f().getResources().getString(R.string.Doc_Comment_Edited);
            } else {
                str = C13723a.m55654a(bVar.mo34510d().getContext(), ((long) commentDetail.getCreate_timestamp()) * ((long) 1000));
            }
            bVar.mo34512f().setText(str);
        } catch (Exception unused) {
            C13479a.m54775e("CardAdapter2", "the time isn't right");
            bVar.mo34512f().setText(String.valueOf(commentDetail.getCreate_timestamp()));
        }
    }

    private final void setTranslateContent(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        bVar.mo34507b().setMaxWidth(C13749l.m55736a() - C13749l.m55738a(86));
        if (CommentTranslate.f24837a.mo35297f(this.config.mo35342t(), commentDetail)) {
            RichTextInjector.m38468a(bVar.mo34507b(), this.userId, this.contentLinkClickListener);
            bVar.mo34507b().setMovementMethod(C7727a.m30901a());
            bVar.mo34507b().setVisibility(0);
            if (CommentTranslate.f24837a.mo35298g(this.config.mo35342t(), commentDetail)) {
                bVar.mo34507b().setRawString(commentDetail.getContent());
            } else {
                bVar.mo34507b().setRawString(commentDetail.getTranslate_content());
            }
        } else {
            bVar.mo34507b().setVisibility(8);
        }
        adjustPosition(bVar.mo34507b(), bVar.mo34509c());
    }

    private final void setTranslateIcon(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        int i;
        BearLottieView c = bVar.mo34509c();
        if (CommentTranslate.f24837a.mo35293b(this.config.mo35342t(), commentDetail)) {
            i = 0;
        } else {
            i = 8;
        }
        c.setVisibility(i);
        if (Intrinsics.areEqual(commentDetail.getTranslate_status(), "loading")) {
            bVar.mo34509c().playAnimation();
        } else {
            bVar.mo34509c().cancelAnimation();
            bVar.mo34509c().setFrame(0);
        }
        bVar.mo34509c().setOnClickListener(new View$OnClickListenerC9001ac(this, commentDetail, bVar));
    }

    private final void retry(CommentBean.CommentDetail commentDetail, View view) {
        ErrorBean error = commentDetail.getError();
        Intrinsics.checkExpressionValueIsNotNull(error, "item.error");
        if (error.isSuccess()) {
            view.setVisibility(8);
            view.setOnClickListener(null);
            return;
        }
        view.setVisibility(0);
        boolean a = ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39496a(commentDetail.getError().code);
        String retryType = commentDetail.getRetryType();
        if (retryType != null) {
            switch (retryType.hashCode()) {
                case -1335458389:
                    if (retryType.equals("delete")) {
                        view.setOnClickListener(new View$OnClickListenerC9015n(this, commentDetail));
                        return;
                    }
                    break;
                case -838846263:
                    if (retryType.equals("update")) {
                        view.setOnClickListener(new View$OnClickListenerC9016o(this, a, commentDetail));
                        return;
                    }
                    break;
                case 96417:
                    if (retryType.equals("add")) {
                        view.setOnClickListener(new View$OnClickListenerC9013l(this, a, commentDetail));
                        return;
                    }
                    break;
                case 108401386:
                    if (retryType.equals("reply")) {
                        view.setOnClickListener(new View$OnClickListenerC9014m(this, a, commentDetail));
                        return;
                    }
                    break;
            }
        }
        view.setOnClickListener(null);
    }

    private final void setCommentImageList(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list;
        int i;
        int i2;
        C13479a.m54764b("CardAdapter2", "setCommentImageList....");
        CommentBean.CommentDetail.ExtraEntity extra = commentDetail.getExtra();
        if (extra != null) {
            list = extra.getImage_list();
        } else {
            list = null;
        }
        int i3 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        RecyclerView o = bVar.mo34521o();
        if (!this.config.mo35348y() || i == 0) {
            i3 = 8;
        }
        o.setVisibility(i3);
        if (i != 0) {
            updateImageSize();
            bVar.mo34506a(commentDetail);
            RecyclerView.LayoutManager layoutManager = bVar.mo34521o().getLayoutManager();
            if (layoutManager != null) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                if (i == 4) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                gridLayoutManager.mo6500a(i2);
                bVar.mo34505a(gridLayoutManager.mo6502b());
                bVar.mo34508b(i);
                bVar.mo34523q().mo34914a(list);
                bVar.mo34523q().mo34909a(new C9018q(this, bVar, commentDetail));
                C9237i.m38343a(bVar.mo34521o(), new View$OnLongClickListenerC9019r(this, bVar, commentDetail));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        }
    }

    private final void setReaction(ContentViewHolder bVar, CommentBean.CommentDetail commentDetail) {
        List<C53061a> reactionFlowData = commentDetail.getReactionFlowData();
        if (!this.config.mo35341s() || reactionFlowData == null || reactionFlowData.isEmpty()) {
            bVar.mo34515i().setVisibility(8);
            ICommentFunction eVar = this.actionControl;
            String reply_id = commentDetail.getReply_id();
            Intrinsics.checkExpressionValueIsNotNull(reply_id, "commentDetail.reply_id");
            eVar.mo34641a(reply_id, new ArrayList());
            return;
        }
        C13479a.m54764b("CardAdapter2", "setReaction size:" + reactionFlowData.size());
        ICommentFunction eVar2 = this.actionControl;
        String reply_id2 = commentDetail.getReply_id();
        Intrinsics.checkExpressionValueIsNotNull(reply_id2, "commentDetail.reply_id");
        eVar2.mo34641a(reply_id2, reactionFlowData);
        bVar.mo34515i().setVisibility(0);
        bVar.mo34515i().setTagBackground(this.config.mo35279a().getResources().getDrawable(R.drawable.space_comment_bubble_reaction_black_bg));
        bVar.mo34515i().setDivideLineColor(this.config.mo35279a().getResources().getColor(R.color.line_divider_default));
        bVar.mo34515i().setup(reactionFlowData);
        bVar.mo34515i().setReactionClickListener(new C9026y(this, commentDetail));
        bVar.mo34515i().setOnReactionMoreTrigger(new C9027z(this, commentDetail));
        bVar.mo34515i().setOnReactionNameTrigger(new C8999aa(this, commentDetail));
        C52990a.m205231a(bVar.mo34515i(), this.config.mo35335m().mo17184b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        int i3 = 0;
        if (viewHolder instanceof PlaceHolderViewHolder) {
            int b = C13749l.m55748b();
            int itemCount = getItemCount();
            if (itemCount == 3) {
                i2 = b / 2;
            } else if (itemCount != 4) {
                i2 = b / 3;
            } else {
                i2 = (int) (((float) b) * 0.4f);
            }
            if (this.config.mo35337o()) {
                i3 = (int) (((double) C13749l.m55748b()) * 0.2d);
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i2 - i3);
            View view = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
            view.setLayoutParams(layoutParams);
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC9005f(this));
            viewHolder.itemView.setOnLongClickListener(View$OnLongClickListenerC9006g.f24283a);
        } else if (viewHolder instanceof QuoteViewHolder) {
            QuoteViewHolder dVar = (QuoteViewHolder) viewHolder;
            dVar.mo34526a().setText(this.quote);
            if (this.onResolve != null) {
                dVar.mo34527b().setVisibility(0);
                dVar.mo34527b().setOnClickListener(new View$OnClickListenerC9007h(this));
            } else {
                dVar.mo34527b().setVisibility(8);
                dVar.mo34527b().setOnClickListener(null);
            }
            viewHolder.itemView.setOnClickListener(View$OnClickListenerC9008i.f24285a);
        } else if (viewHolder instanceof ContentViewHolder) {
            ContentViewHolder bVar = (ContentViewHolder) viewHolder;
            RichTextInjector.m38468a(bVar.mo34513g(), (String) null, (AbstractC10460a.AbstractC10461a) null);
            RichTextInjector.m38468a(bVar.mo34507b(), (String) null, (AbstractC10460a.AbstractC10461a) null);
            bindContentViewHolder(bVar, i);
        } else if (viewHolder instanceof InputViewHolder) {
            viewHolder.itemView.setOnClickListener(new View$OnClickListenerC9009j(this, i));
            View view2 = viewHolder.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            if (this.commentDetails.get(i).isInReply()) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == CardAdapterHelper.ItemType.PLACEHOLDER.getType()) {
            return new PlaceHolderViewHolder(new View(this.config.mo35279a()));
        }
        if (i == CardAdapterHelper.ItemType.QUOTE.getType()) {
            View inflate = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_card_quote, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(conf…           parent, false)");
            return new QuoteViewHolder(this, inflate);
        } else if (i == CardAdapterHelper.ItemType.PART_CONTENT.getType()) {
            View inflate2 = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_card_content, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "LayoutInflater.from(conf…           parent, false)");
            return new ContentViewHolder(this, inflate2);
        } else if (i == CardAdapterHelper.ItemType.WHOLE_CONTENT.getType()) {
            View inflate3 = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_card_content_whole, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "LayoutInflater.from(conf…           parent, false)");
            return new ContentViewHolder(this, inflate3);
        } else if (i == CardAdapterHelper.ItemType.WHOLE_TEXT.getType()) {
            View inflate4 = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_whole_text, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate4, "LayoutInflater.from(conf…           parent, false)");
            return new TextViewHolder(inflate4);
        } else if (i == CardAdapterHelper.ItemType.WHOLE_INPUT.getType()) {
            View inflate5 = LayoutInflater.from(this.config.mo35279a()).inflate(R.layout.comment_whole_input, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate5, "LayoutInflater.from(conf…           parent, false)");
            return new InputViewHolder(inflate5);
        } else {
            throw new RuntimeException("type is  Invalid");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICardAdapter
    public void onItemVisible(int i, int i2) {
        C13479a.m54764b("CardAdapter2", "onItemVisible, first: " + i + ", last: " + i2);
        if (!this.commentDetails.isEmpty()) {
            if (i >= this.commentDetails.size()) {
                i = this.commentDetails.size() - 1;
            }
            if (i2 >= this.commentDetails.size()) {
                i2 = this.commentDetails.size() - 1;
            }
            ArrayList arrayList = new ArrayList();
            if (i <= i2) {
                while (true) {
                    CommentBean.CommentDetail commentDetail = this.commentDetails.get(i);
                    if (!TextUtils.isEmpty(commentDetail.getMessageId()) && commentDetail.getReadStatus() == 1) {
                        String messageId = commentDetail.getMessageId();
                        Intrinsics.checkExpressionValueIsNotNull(messageId, "item.messageId");
                        arrayList.add(messageId);
                        commentDetail.setReadStatus(2);
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                C13479a.m54764b("CardAdapter2", "readMessage: " + arrayList);
                this.actionControl.mo34645a(arrayList);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        boolean z;
        int i2;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list;
        List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list2;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        if (!list.isEmpty()) {
            int i3 = 0;
            Object obj = list.get(0);
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
            } else if (!((Bundle) obj).isEmpty() && !(viewHolder instanceof QuoteViewHolder) && !(viewHolder instanceof PlaceHolderViewHolder)) {
                if (viewHolder instanceof ContentViewHolder) {
                    ContentViewHolder bVar = (ContentViewHolder) viewHolder;
                    RichTextInjector.m38468a(bVar.mo34513g(), (String) null, (AbstractC10460a.AbstractC10461a) null);
                    RichTextInjector.m38468a(bVar.mo34507b(), (String) null, (AbstractC10460a.AbstractC10461a) null);
                    CommentBean.CommentDetail commentDetail = this.commentDetails.get(i);
                    Object obj2 = list.get(0);
                    if (obj2 != null) {
                        Bundle bundle = (Bundle) obj2;
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35266a(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            setContent(bVar, commentDetail);
                            setTime(commentDetail, bVar);
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35269b(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            setReaction(bVar, commentDetail);
                            setMore(bVar, commentDetail);
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35270c(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            setBackGround(bVar, commentDetail);
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35271d(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            setLoaddingStatus(bVar, commentDetail);
                            setReslove(bVar, commentDetail);
                            setMore(bVar, commentDetail);
                            setRetryView(bVar, commentDetail);
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35272e(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            bVar.mo34511e().setText(commentDetail.getName());
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35274g(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bundle.getInt(CommentDiffUtils.f24823a.mo35273f(), 0) == CommentDiffUtils.f24823a.mo35275h()) {
                            setCommentImageList(bVar, commentDetail);
                            return;
                        } else if (z) {
                            CommentBean.CommentDetail.ExtraEntity extra = commentDetail.getExtra();
                            if (extra == null || (image_list2 = extra.getImage_list()) == null) {
                                i2 = 0;
                            } else {
                                i2 = image_list2.size();
                            }
                            if (i2 > 0) {
                                updateImageSize();
                                CommentBean.CommentDetail.ExtraEntity extra2 = commentDetail.getExtra();
                                if (!(extra2 == null || (image_list = extra2.getImage_list()) == null)) {
                                    i3 = image_list.size();
                                }
                                bVar.mo34508b(i3);
                                bVar.mo34523q().notifyDataSetChanged();
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.os.Bundle");
                    }
                } else {
                    return;
                }
            }
        }
        onBindViewHolder(viewHolder, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "commentId", "", "replyId", "selectedImage", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "imageList", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2$k */
    static final class C9010k extends Lambda implements Function4<String, String, CommentBean.CommentDetail.ExtraEntity.CommentImageEntity, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> {
        final /* synthetic */ CardAdapter2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9010k(CardAdapter2 cardAdapter2) {
            super(4);
            this.this$0 = cardAdapter2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            invoke(str, str2, commentImageEntity, list);
            return Unit.INSTANCE;
        }

        public final void invoke(final String str, final String str2, CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
            Intrinsics.checkParameterIsNotNull(str, "commentId");
            Intrinsics.checkParameterIsNotNull(str2, "replyId");
            Intrinsics.checkParameterIsNotNull(commentImageEntity, "selectedImage");
            Intrinsics.checkParameterIsNotNull(list, "imageList");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) null;
            if (objectRef.element == null) {
                objectRef.element = (T) ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20682a(this.this$0.getConfig().mo35279a(), this.this$0.getConfig().mo35279a().getSupportFragmentManager(), C4957m.m20521a(R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation, R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation), this.this$0.getConfig().mo35328g(), C9229c.m38281a(commentImageEntity, list), "CardAdapter2", this.this$0.getConfig().mo35329h(), this.this$0.getConfig().mo35332j().mo32555b());
                int indexOf = list.indexOf(commentImageEntity);
                if (indexOf == 0) {
                    this.this$0.commentListeners.mo34294R().invoke(str, str2, Integer.valueOf(indexOf));
                }
                T t = objectRef.element;
                if (t != null) {
                    t.mo20678a(new AbstractC5188c(this) {
                        /* class com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2.C9010k.C90111 */

                        /* renamed from: a */
                        final /* synthetic */ C9010k f24288a;

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
                        /* renamed from: a */
                        public void mo20757a() {
                        }

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
                        /* renamed from: b */
                        public void mo20759b() {
                            objectRef.element = (T) null;
                        }

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
                        /* renamed from: a */
                        public void mo20758a(String str) {
                            ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20684a(this.f24288a.this$0.getConfig().mo35279a().getSupportFragmentManager(), "CardAdapter2");
                            this.f24288a.this$0.commentListeners.mo34294R().invoke(str, str2, -1);
                        }

                        {
                            this.f24288a = r1;
                        }
                    });
                }
                T t2 = objectRef.element;
                if (t2 != null) {
                    t2.mo20677a(new AbstractC5187b(this) {
                        /* class com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2.C9010k.C90122 */

                        /* renamed from: a */
                        final /* synthetic */ C9010k f24292a;

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
                        /* renamed from: a */
                        public void mo20754a() {
                        }

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
                        /* renamed from: b */
                        public void mo20756b(String str, int i) {
                            Intrinsics.checkParameterIsNotNull(str, "uuid");
                        }

                        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
                        /* renamed from: a */
                        public void mo20755a(String str, int i) {
                            Intrinsics.checkParameterIsNotNull(str, "uuid");
                            this.f24292a.this$0.commentListeners.mo34294R().invoke(str, str2, Integer.valueOf(i));
                        }

                        {
                            this.f24292a = r1;
                        }
                    });
                }
            }
        }
    }

    public CardAdapter2(Config fVar, String str, ICommentListeners fVar2, ICommentFunction eVar, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        this.config = fVar;
        this.userId = str;
        this.commentListeners = fVar2;
        this.actionControl = eVar;
        this.clickLink = function0;
        this.imageItemMargin = C52990a.m205224a((Context) fVar.mo35279a(), 4.0f);
        fVar2.mo34359z().add(new Function2<Integer, Boolean, Unit>(this) {
            /* class com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2.C89971 */
            final /* synthetic */ CardAdapter2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
                invoke(num.intValue(), bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i, boolean z) {
                T t;
                if (i == 0) {
                    int i2 = 0;
                    for (T t2 : this.this$0.commentDetails) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        T t3 = t2;
                        if (t3.isEditStatus()) {
                            t3.setEditStatus(false);
                            if (t3.isWholeComment()) {
                                this.this$0.notifyItemChanged(i2);
                            } else {
                                this.this$0.notifyDataSetChanged();
                            }
                        }
                        i2 = i3;
                    }
                    Iterator<T> it = this.this$0.commentDetails.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.isInReply()) {
                            break;
                        }
                    }
                    T t4 = t;
                    if (t4 != null) {
                        t4.setInReply(false);
                        CardAdapter2 cardAdapter2 = this.this$0;
                        cardAdapter2.notifyItemChanged(cardAdapter2.getItemCount() - 1);
                    }
                }
            }
        });
        this.contentLinkClickListener = eVar.mo34627a(new C8969a.AbstractC8970a(this) {
            /* class com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter2.C89982 */

            /* renamed from: a */
            final /* synthetic */ CardAdapter2 f24246a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f24246a = r1;
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: a */
            public boolean mo34412a(String str) {
                if (str == null || !this.f24246a.commentListeners.mo34277A().invoke(str).booleanValue()) {
                    return false;
                }
                return true;
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: b */
            public void mo34413b(String str) {
                Function0<Unit> function0 = this.f24246a.clickLink;
                if (function0 != null) {
                    function0.invoke();
                }
                if (str != null) {
                    this.f24246a.commentListeners.mo34278B().invoke(str);
                }
            }

            @Override // com.bytedance.ee.bear.middleground.comment.p443a.C8969a.AbstractC8970a
            /* renamed from: c */
            public void mo34414c(String str) {
                Intrinsics.checkParameterIsNotNull(str, "uuid");
                this.f24246a.commentListeners.mo34289M().invoke(str);
            }
        });
        this.onClickImageItem = new C9010k(this);
    }
}
