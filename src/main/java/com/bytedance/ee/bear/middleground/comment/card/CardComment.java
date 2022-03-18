package com.bytedance.ee.bear.middleground.comment.card;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.AbstractC4242i;
import com.bytedance.ee.bear.at.C4227b;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.audio.AbstractC9037a;
import com.bytedance.ee.bear.middleground.comment.audio.MotionImageView;
import com.bytedance.ee.bear.middleground.comment.audio.RecordViewModel;
import com.bytedance.ee.bear.middleground.comment.card.ICardComment;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.detail.CommentDetailViewModel;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReviewException;
import com.bytedance.ee.bear.middleground.comment.input.ICommentInput;
import com.bytedance.ee.bear.middleground.comment.input.InputComment;
import com.bytedance.ee.bear.middleground.comment.input.InputViewModel;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9105b;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.p449g.C9226a;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.uitls.CommentTo;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.CommentEditText;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.widgets.CardIndicator;
import com.bytedance.ee.bear.widgets.ScrollControlViewPager;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.bear.widgets.universedesign.SpaceShadowLayout;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 u2\u00020\u0001:\u0001uB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010N\u001a\u00020\u0010H\u0002J\u0010\u0010O\u001a\u00020\u00102\u0006\u0010P\u001a\u00020\u000fH\u0016J\b\u0010Q\u001a\u00020\u0010H\u0016J\u0016\u0010R\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010S\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J\b\u0010T\u001a\u00020\u0010H\u0002J \u0010U\u001a\u00020+2\u0006\u0010V\u001a\u00020S2\u0006\u0010W\u001a\u00020S2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020\u000fH\u0016J\u001c\u0010[\u001a\u00020\u00102\b\b\u0002\u0010\\\u001a\u00020\u000f2\b\b\u0002\u0010]\u001a\u00020\u000fH\u0002J\u0010\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u0018H\u0016J\b\u0010`\u001a\u00020\u0010H\u0002J\u0012\u0010a\u001a\u00020\u00102\b\b\u0002\u0010b\u001a\u00020\u000fH\u0002J\u001f\u0010c\u001a\u00020\u00102\u0006\u0010d\u001a\u00020S2\b\u0010e\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0002\u0010fJ\u0012\u0010g\u001a\u00020\u00102\b\u0010h\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010i\u001a\u00020\u00102\u0006\u0010j\u001a\u00020SH\u0016J\u0010\u0010k\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\u000fH\u0002J\b\u0010m\u001a\u00020\u0010H\u0002J\u0010\u0010n\u001a\u00020\u00102\u0006\u0010o\u001a\u00020\u000fH\u0002J\u0010\u0010p\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u000fH\u0016J\u0010\u0010r\u001a\u00020\u00102\u0006\u0010j\u001a\u00020SH\u0016J\u0010\u0010s\u001a\u00020\u00102\u0006\u0010t\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107X\u000e¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u0002080:X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardComment;", "Lcom/bytedance/ee/bear/middleground/comment/card/ICardComment;", "configComment", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;)V", "atButton", "Landroid/widget/ImageView;", "atOpenOrCloseListener", "Lkotlin/Function1;", "", "", "getAtOpenOrCloseListener", "()Lkotlin/jvm/functions/Function1;", "setAtOpenOrCloseListener", "(Lkotlin/jvm/functions/Function1;)V", "backPress", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "backView", "Landroid/view/View;", "closeView", "commentEditText", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentEditText;", "contentView", "dataViewModel", "Lcom/bytedance/ee/bear/middleground/comment/card/CardDataViewModel;", "detailViewModel", "Lcom/bytedance/ee/bear/middleground/comment/detail/CommentDetailViewModel;", "divider", "dragTitle", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceShadowLayout;", "emptyView", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceEmptyState;", "guideLine", "Landroidx/constraintlayout/widget/Guideline;", "hasPerReply", "hasPerResolve", "inputComment", "Lcom/bytedance/ee/bear/middleground/comment/input/ICommentInput;", "inputParent", "mEnterAnimator", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "getMEnterAnimator", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "setMEnterAnimator", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;)V", "mExitAnimator", "getMExitAnimator", "setMExitAnimator", "netLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "netStatus", "Landroidx/lifecycle/Observer;", "pagerAdapter", "Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter;", "pagerIndicator", "Lcom/bytedance/ee/bear/widgets/CardIndicator;", "recordViewModel", "Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;", "resolveView", "rootView", "sendView", "titleView", "Landroid/widget/TextView;", "viewModel", "Lcom/bytedance/ee/bear/middleground/comment/input/InputViewModel;", "viewPager", "Lcom/bytedance/ee/bear/widgets/ScrollControlViewPager;", "voiceButton", "Lcom/bytedance/ee/bear/middleground/comment/audio/MotionImageView;", "windowUtils", "Lcom/bytedance/ee/bear/facade/common/widget/helper/DragView;", "bindAt", "dismiss", "shouldShowAnimator", "dismissInputComment", "getVipCb", "", "initDefaultData", "initInputComment", "content", "clickCommentId", "keyBoardHeightSP", "", "isShowing", "onFinishClose", "shouldResetHeight", "hasAnim", "onReactionAdd", "itemView", "setListener", "setUiStatus", "exitFullScreen", "show", "targetId", "height", "(Ljava/lang/String;Ljava/lang/Integer;)V", "startAnimator", "paramComment", "switchCard", "commentId", "switchEditTextStatus", "expand", "switchToPartScreen", "toDetail", "showRecord", "updatePanel", "forceContentDiff", "updateTargetId", "updateUiStyle", "fullScreen", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.b */
public final class CardComment implements ICardComment {

    /* renamed from: x */
    public static final Companion f24491x = new Companion(null);

    /* renamed from: A */
    private View f24492A;

    /* renamed from: B */
    private SpaceShadowLayout f24493B;

    /* renamed from: C */
    private View f24494C;

    /* renamed from: D */
    private Guideline f24495D;

    /* renamed from: E */
    private final InputViewModel f24496E;

    /* renamed from: F */
    private Function1<? super Boolean, Unit> f24497F;

    /* renamed from: G */
    private CommentAnimationParam f24498G;

    /* renamed from: H */
    private CommentAnimationParam f24499H;

    /* renamed from: I */
    private LiveData<ConnectionService.NetworkState> f24500I;

    /* renamed from: J */
    private final AbstractC1178x<ConnectionService.NetworkState> f24501J = new C9119i(this);

    /* renamed from: K */
    private final AbstractC7666d f24502K;

    /* renamed from: a */
    public C7728a f24503a;

    /* renamed from: b */
    public ICommentInput f24504b;

    /* renamed from: c */
    public View f24505c;

    /* renamed from: d */
    public TextView f24506d;

    /* renamed from: e */
    public View f24507e;

    /* renamed from: f */
    public ScrollControlViewPager f24508f;

    /* renamed from: g */
    public CardIndicator f24509g;

    /* renamed from: h */
    public View f24510h;

    /* renamed from: i */
    public SpaceEmptyState f24511i;

    /* renamed from: j */
    public CommentPagerAdapter f24512j;

    /* renamed from: k */
    public CardDataViewModel f24513k;

    /* renamed from: l */
    public CommentDetailViewModel f24514l;

    /* renamed from: m */
    public RecordViewModel f24515m;

    /* renamed from: n */
    public MotionImageView f24516n;

    /* renamed from: o */
    public CommentEditText f24517o;

    /* renamed from: p */
    public ImageView f24518p;

    /* renamed from: q */
    public ImageView f24519q;

    /* renamed from: r */
    public boolean f24520r;

    /* renamed from: s */
    public boolean f24521s;

    /* renamed from: t */
    public final Config f24522t;

    /* renamed from: u */
    public final ICommentListeners f24523u;

    /* renamed from: v */
    public final DataControl f24524v;

    /* renamed from: w */
    public final ICommentFunction f24525w;

    /* renamed from: y */
    private View f24526y;

    /* renamed from: z */
    private View f24527z;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$k */
    public static final class View$OnClickListenerC9121k implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9121k f24538a = new View$OnClickListenerC9121k();

        View$OnClickListenerC9121k() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardComment$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    /* renamed from: a */
    public final Function1<Boolean, Unit> mo34734a() {
        return this.f24497F;
    }

    /* renamed from: b */
    public CommentAnimationParam mo34741b() {
        return this.f24498G;
    }

    /* renamed from: c */
    public CommentAnimationParam mo34745c() {
        return this.f24499H;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$b */
    static final class C9112b implements AbstractC7666d {

        /* renamed from: a */
        final /* synthetic */ CardComment f24532a;

        C9112b(CardComment bVar) {
            this.f24532a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            this.f24532a.mo34739a(true);
            return true;
        }
    }

    /* renamed from: g */
    public final Function1<String, Unit> mo34753g() {
        return new C9115e(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$ad */
    public static final class RunnableC9111ad implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f24530a;

        /* renamed from: b */
        final /* synthetic */ int f24531b;

        RunnableC9111ad(RecyclerView recyclerView, int i) {
            this.f24530a = recyclerView;
            this.f24531b = i;
        }

        public final void run() {
            RecyclerView recyclerView = this.f24530a;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(this.f24531b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$setListener$11", "Lcom/bytedance/ee/bear/middleground/comment/audio/AbsMotionCallbackListener;", "onClick", "", "onLongPressed", "onPressFinished", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$m */
    public static final class C9126m extends AbstractC9037a {

        /* renamed from: c */
        final /* synthetic */ CardComment f24544c;

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: b */
        public void mo34581b() {
            C13479a.m54764b("CardComment", "onClick: boiceButton");
            this.f24544c.f24515m.mo34598a(new C9127a(this));
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: c */
        public void mo34582c() {
            C13479a.m54764b("CardComment", "onLongPressed");
            this.f24544c.f24515m.mo34598a(new C9128b(this));
        }

        @Override // com.bytedance.ee.bear.middleground.comment.audio.AbstractC9039c
        /* renamed from: d */
        public void mo34583d() {
            C13479a.m54764b("CardComment", "onPressFinished");
            this.f24544c.f24515m.mo34605e();
            this.f24544c.mo34752f(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9126m(CardComment bVar) {
            this.f24544c = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$m$a */
        static final class C9127a extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ C9126m this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9127a(C9126m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    this.this$0.f24544c.f24522t.mo35325e().mo35304a(false);
                    this.this$0.f24544c.mo34750e(true);
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$m$b */
        public static final class C9128b extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ C9126m this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9128b(C9126m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z && this.this$0.f24362b) {
                    this.this$0.f24544c.f24522t.mo35325e().mo35304a(true);
                    this.this$0.f24544c.mo34752f(true);
                    CardComment.m37835d(this.this$0.f24544c).mo35489c();
                    this.this$0.f24544c.f24515m.mo34599a(new Function3<String, Boolean, int[], Unit>(this) {
                        /* class com.bytedance.ee.bear.middleground.comment.card.CardComment.C9126m.C9128b.C91291 */
                        final /* synthetic */ C9128b this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function3
                        public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
                            invoke(str, bool.booleanValue(), iArr);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(String str, boolean z, int[] iArr) {
                            Intrinsics.checkParameterIsNotNull(str, "str");
                            Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
                            CardComment.m37835d(this.this$0.this$0.f24544c).mo35488a(str, z, iArr);
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: d */
    public boolean mo34748d() {
        if (this.f24505c.getParent() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: e */
    public void mo34749e() {
        ICommentInput aVar = this.f24504b;
        if (aVar != null) {
            ICommentInput.C9239a.m38353a(aVar, false, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$j */
    static final class RunnableC9120j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardComment f24536a;

        /* renamed from: b */
        final /* synthetic */ View f24537b;

        RunnableC9120j(CardComment bVar, View view) {
            this.f24536a = bVar;
            this.f24537b = view;
        }

        public final void run() {
            RecyclerView a;
            Rect rect = new Rect();
            this.f24536a.f24509g.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            this.f24537b.getGlobalVisibleRect(rect2);
            if (rect.top - 30 < rect2.bottom && (a = CardComment.m37832b(this.f24536a).mo34833a(this.f24536a.f24508f.getCurrentItem())) != null) {
                a.scrollBy(0, this.f24537b.getHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$f */
    public static final class C9116f extends Lambda implements Function0<Unit> {
        final /* synthetic */ CardComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9116f(CardComment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            int i;
            float f;
            if (CardComment.m37829a(this.this$0).mo34824b() && this.this$0.mo34748d()) {
                Integer d = CardComment.m37829a(this.this$0).mo34828d();
                if (d != null) {
                    i = d.intValue();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    C7728a aVar = this.this$0.f24503a;
                    Integer d2 = CardComment.m37829a(this.this$0).mo34828d();
                    if (d2 != null) {
                        f = (float) d2.intValue();
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    aVar.mo30249a(f);
                } else {
                    this.this$0.f24503a.mo30262h();
                }
                this.this$0.mo34751f();
            }
            this.this$0.f24523u.mo34283G().invoke(0);
            ICardComment.C9184a.m37996b(this.this$0, false, 1, null);
        }
    }

    /* renamed from: f */
    public final void mo34751f() {
        C13479a.m54764b("CardComment", "switchToPartScreen:");
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f24505c.getPaddingBottom(), 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "valueAnimator");
        ofInt.setDuration(100L);
        ofInt.addUpdateListener(new C9108aa(this));
        Function1<String, Unit> K = this.f24523u.mo34287K();
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        K.invoke(dVar.mo34830e(this.f24508f.getCurrentItem()));
        ofInt.addListener(new C9109ab(this));
        ofInt.start();
    }

    /* renamed from: h */
    private final void m37839h() {
        C13479a.m54764b("CardComment", "initDefaultData");
        CardDataViewModel dVar = new CardDataViewModel();
        this.f24513k = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34819a(this.f24522t.mo35329h(), this.f24524v);
        this.f24523u.mo34299a(this.f24505c);
        this.f24523u.mo34315b(this.f24526y);
        m37830a(this, false, 1, null);
        m37840i();
        CommentPagerAdapter eVar = new CommentPagerAdapter();
        this.f24512j = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        Config fVar = this.f24522t;
        FragmentActivity a = fVar.mo35279a();
        ICommentPermission m = this.f24522t.mo35335m();
        String c = C4484g.m18494b().mo17252c();
        Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
        eVar.mo34835a(fVar, a, m, c, this.f24523u, this.f24525w, new C9116f(this));
        ScrollControlViewPager scrollControlViewPager = this.f24508f;
        CommentPagerAdapter eVar2 = this.f24512j;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        scrollControlViewPager.setAdapter(eVar2);
        CommentPagerAdapter eVar3 = this.f24512j;
        if (eVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        eVar3.mo34836a((FixPageTransformerViewPager) this.f24508f);
        this.f24509g.setViewPager(this.f24508f);
    }

    /* renamed from: i */
    private final void m37840i() {
        FragmentActivity a = this.f24522t.mo35279a();
        AbstractC4242i a2 = C4227b.m17586a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AtModule.getDependency()");
        C4233d a3 = new C4233d(a, a2.mo16664c(), this.f24522t.mo35332j(), this.f24522t.mo35329h(), "part_comment", "part_comment").mo16653a(this.f24510h).mo16652a((int) (((double) C13749l.m55748b()) * 0.4d)).mo16654a(((AbstractC9105b) KoinJavaComponent.m268613a(AbstractC9105b.class, null, null, 6, null)).mo30708a());
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText.mo44988a(a3);
        CommentEditText commentEditText2 = this.f24517o;
        if (commentEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText2.getAtWindow().mo16629a(new C9113c(this));
        CommentEditText commentEditText3 = this.f24517o;
        if (commentEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        AbstractC4230c atWindow = commentEditText3.getAtWindow();
        if (atWindow != null) {
            atWindow.mo16640a(new C9114d(this));
        }
    }

    /* renamed from: j */
    private final void m37841j() {
        this.f24526y.setOnClickListener(View$OnClickListenerC9121k.f24538a);
        if (this.f24523u.mo34351r().invoke().booleanValue()) {
            this.f24505c.setOnClickListener(new View$OnClickListenerC9132p(this));
        }
        this.f24507e.setOnClickListener(new View$OnClickListenerC9133q(this));
        this.f24527z.setOnClickListener(new View$OnClickListenerC9134r(this));
        this.f24492A.setOnClickListener(new View$OnClickListenerC9135s(this));
        this.f24503a.mo30253a(new C9136t(this));
        this.f24508f.mo45500a(new C9137u(this));
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText.setOnLongClickListener(new View$OnLongClickListenerC9138v(this));
        CommentEditText commentEditText2 = this.f24517o;
        if (commentEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText2.setOnClickListener(new View$OnClickListenerC9139w(this));
        ImageView imageView = this.f24518p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendView");
        }
        imageView.setOnClickListener(new View$OnClickListenerC9122l(this));
        MotionImageView motionImageView = this.f24516n;
        if (motionImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceButton");
        }
        motionImageView.setMotionCallbackListener(new C9126m(this));
        ImageView imageView2 = this.f24519q;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atButton");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC9130n(this));
        CommentEditText commentEditText3 = this.f24517o;
        if (commentEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText3.addTextChangedListener(new C9131o(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$switchToPartScreen$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$ab */
    public static final class C9109ab extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CardComment f24529a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9109ab(CardComment bVar) {
            this.f24529a = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24529a.mo34747d(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "content", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$ac */
    public static final class C9110ac extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ boolean $showAt;
        final /* synthetic */ boolean $showRecord;
        final /* synthetic */ CardComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9110ac(CardComment bVar, boolean z, boolean z2) {
            super(1);
            this.this$0 = bVar;
            this.$showRecord = z;
            this.$showAt = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            int j = this.this$0.f24522t.mo35336n().mo39936j();
            String e = CardComment.m37829a(this.this$0).mo34830e(this.this$0.f24508f.getCurrentItem());
            this.this$0.f24523u.mo34286J().invoke(e);
            this.this$0.f24522t.mo35325e().mo35303a("click_docs_message_sub_page_reply_begin", null, e, "", false);
            this.this$0.f24514l = new CommentDetailViewModel();
            CardComment.m37837f(this.this$0).mo34885a(this.this$0.f24522t, this.this$0.f24524v, e, CardComment.m37829a(this.this$0).mo34816a(this.this$0.f24508f.getCurrentItem()));
            CardComment bVar = this.this$0;
            bVar.f24504b = bVar.mo34733a(str, e, j);
            this.this$0.mo34747d(true);
            this.this$0.f24503a.mo30260f();
            ICommentInput aVar = this.this$0.f24504b;
            if (aVar != null) {
                ICommentInput.C9239a.m38354a(aVar, this.$showRecord, this.$showAt, false, 4, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$bindAt$1", "Lcom/bytedance/ee/bear/at/AtWindow$ShowAtWindowListener;", "onFinderViewHeightChange", "", "windowHeight", "", "contentHeight", "onShowAtWindow", "isShow", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$c */
    public static final class C9113c implements AbstractC4230c.AbstractC4232b {

        /* renamed from: a */
        final /* synthetic */ CardComment f24533a;

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
        /* renamed from: a */
        public void mo16650a(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9113c(CardComment bVar) {
            this.f24533a = bVar;
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4232b
        /* renamed from: a */
        public void mo16651a(boolean z) {
            CardComment.m37833c(this.f24533a).setSelected(z);
            Function1<Boolean, Unit> a = this.f24533a.mo34734a();
            if (a != null) {
                a.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$bindAt$2", "Lcom/bytedance/ee/bear/at/AtWindow$OnAtSelectedCallback;", "onExistResult", "", "keyword", "", "onSearchEmpty", "onSelectedAt", "at", "Lcom/bytedance/ee/bear/bean/At;", "fromToolbar", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$d */
    public static final class C9114d implements AbstractC4230c.AbstractC4231a {

        /* renamed from: a */
        final /* synthetic */ CardComment f24534a;

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: a */
        public void mo16648a(String str) {
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: b */
        public void mo16649b(String str) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9114d(CardComment bVar) {
            this.f24534a = bVar;
        }

        @Override // com.bytedance.ee.bear.at.AbstractC4230c.AbstractC4231a
        /* renamed from: a */
        public void mo16647a(C4517a aVar, boolean z) {
            CardComment.m37835d(this.f24534a).mo44989a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$e */
    public static final class C9115e extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ CardComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9115e(CardComment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            if (str != null) {
                ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36669a(this.this$0.f24522t.mo35279a(), str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$setListener$13", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$o */
    public static final class C9131o implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ CardComment f24546a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9131o(CardComment bVar) {
            this.f24546a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            ImageView e = CardComment.m37836e(this.f24546a);
            boolean z = false;
            if (editable != null) {
                i = editable.length();
            } else {
                i = 0;
            }
            if (i > 0) {
                z = true;
            }
            e.setEnabled(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$r */
    public static final class View$OnClickListenerC9134r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24549a;

        View$OnClickListenerC9134r(CardComment bVar) {
            this.f24549a = bVar;
        }

        public final void onClick(View view) {
            this.f24549a.mo34739a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$setListener$7", "Lcom/bytedance/ee/bear/widgets/viewpager/FixPageTransformerViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "position", "", "onPageScrolled", "p1", "", "p2", "onPageSelected", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$u */
    public static final class C9137u implements FixPageTransformerViewPager.AbstractC11859d {

        /* renamed from: a */
        final /* synthetic */ CardComment f24552a;

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: a */
        public void mo18471a(int i, float f, int i2) {
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: b */
        public void mo18472b(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9137u(CardComment bVar) {
            this.f24552a = bVar;
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.AbstractC11859d
        /* renamed from: a */
        public void mo18470a(int i) {
            int i2;
            boolean z;
            this.f24552a.f24506d.setText(CardComment.m37829a(this.f24552a).mo34822b(this.f24552a.f24508f.getCurrentItem()));
            View view = this.f24552a.f24510h;
            int i3 = 8;
            if (!this.f24552a.f24520r || !CardComment.m37829a(this.f24552a).mo34826c(i)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
            View view2 = this.f24552a.f24507e;
            if (this.f24552a.f24521s && CardComment.m37829a(this.f24552a).mo34826c(i)) {
                i3 = 0;
            }
            view2.setVisibility(i3);
            this.f24552a.f24523u.mo34284H().invoke(CardComment.m37829a(this.f24552a).mo34830e(i));
            C9226a e = this.f24552a.f24522t.mo35325e();
            String e2 = CardComment.m37829a(this.f24552a).mo34830e(i);
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            e.mo35303a("bubble_comment_page_slide", null, e2, "", z);
            C13479a.m54764b("CardComment", "detectVisibleItem onPageSelected, position: " + i);
            CardComment.m37832b(this.f24552a).mo34841b(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$v */
    public static final class View$OnLongClickListenerC9138v implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24553a;

        View$OnLongClickListenerC9138v(CardComment bVar) {
            this.f24553a = bVar;
        }

        public final boolean onLongClick(View view) {
            this.f24553a.mo34750e(false);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$w */
    public static final class View$OnClickListenerC9139w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24554a;

        View$OnClickListenerC9139w(CardComment bVar) {
            this.f24554a = bVar;
        }

        public final void onClick(View view) {
            this.f24554a.mo34750e(false);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34736a(CommentAnimationParam aVar) {
        this.f24498G = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34742b(CommentAnimationParam aVar) {
        this.f24499H = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$h */
    public static final class C9118h extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ int $keyBoardHeightSP;
        final /* synthetic */ CardComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9118h(CardComment bVar, int i) {
            super(1);
            this.this$0 = bVar;
            this.$keyBoardHeightSP = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int i2;
            if (i >= ((int) this.this$0.f24522t.mo35279a().getResources().getDimension(R.dimen.record_panel_height))) {
                i2 = 0;
            } else {
                i2 = this.$keyBoardHeightSP;
            }
            this.this$0.f24505c.setPadding(0, 0, 0, i2 + i);
            C13479a.m54764b("CardComment", "initInputComment2 height:" + i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$s */
    public static final class View$OnClickListenerC9135s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24550a;

        View$OnClickListenerC9135s(CardComment bVar) {
            this.f24550a = bVar;
        }

        public final void onClick(View view) {
            ICommentInput aVar = this.f24550a.f24504b;
            if (aVar != null) {
                ICommentInput.C9239a.m38353a(aVar, false, 1, null);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CardDataViewModel m37829a(CardComment bVar) {
        CardDataViewModel dVar = bVar.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ CommentPagerAdapter m37832b(CardComment bVar) {
        CommentPagerAdapter eVar = bVar.f24512j;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        return eVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m37833c(CardComment bVar) {
        ImageView imageView = bVar.f24519q;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atButton");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CommentEditText m37835d(CardComment bVar) {
        CommentEditText commentEditText = bVar.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        return commentEditText;
    }

    /* renamed from: e */
    public static final /* synthetic */ ImageView m37836e(CardComment bVar) {
        ImageView imageView = bVar.f24518p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendView");
        }
        return imageView;
    }

    /* renamed from: f */
    public static final /* synthetic */ CommentDetailViewModel m37837f(CardComment bVar) {
        CommentDetailViewModel aVar = bVar.f24514l;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailViewModel");
        }
        return aVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ MotionImageView m37838g(CardComment bVar) {
        MotionImageView motionImageView = bVar.f24516n;
        if (motionImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceButton");
        }
        return motionImageView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$l */
    public static final class View$OnClickListenerC9122l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24539a;

        View$OnClickListenerC9122l(CardComment bVar) {
            this.f24539a = bVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "newData", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$l$b */
        static final class C9124b<T> implements Consumer<String> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC9122l f24542a;

            C9124b(View$OnClickListenerC9122l lVar) {
                this.f24542a = lVar;
            }

            /* renamed from: a */
            public final void accept(String str) {
                DataControl cVar = this.f24542a.f24539a.f24524v;
                Intrinsics.checkExpressionValueIsNotNull(str, "newData");
                cVar.mo34705a(str, Action.PUBLISH);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$l$a */
        static final class C9123a<T, R> implements Function<T, AbstractC70020b<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC9122l f24540a;

            /* renamed from: b */
            final /* synthetic */ String f24541b;

            C9123a(View$OnClickListenerC9122l lVar, String str) {
                this.f24540a = lVar;
                this.f24541b = str;
            }

            /* renamed from: a */
            public final AbstractC68307f<String> apply(String str) {
                boolean z;
                Intrinsics.checkParameterIsNotNull(str, "it");
                CardComment.m37836e(this.f24540a.f24539a).setEnabled(true);
                CardComment.m37835d(this.f24540a.f24539a).setText("");
                DataControl cVar = this.f24540a.f24539a.f24524v;
                String str2 = this.f24541b;
                if (this.f24540a.f24539a.f24522t.mo35333k() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                return DataControl.C9096a.m37730a(cVar, str, null, str2, z, null, null, false, null, null, null, 1008, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$l$c */
        static final class C9125c<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC9122l f24543a;

            C9125c(View$OnClickListenerC9122l lVar) {
                this.f24543a = lVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("CardComment", "send data error: ", th);
                if (th instanceof ReviewException) {
                    ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39497a(this.f24543a.f24539a.f24522t.mo35279a());
                } else {
                    Toast.showFailureText(this.f24543a.f24539a.f24522t.mo35279a(), this.f24543a.f24539a.f24522t.mo35279a().getString(R.string.Doc_Comment_CommentSendFailed), 0);
                }
            }
        }

        public final void onClick(View view) {
            Disposable disposable;
            AbstractC68307f<String> flowable;
            AbstractC68307f<R> c;
            AbstractC68307f<String> a;
            CardComment.m37835d(this.f24539a).getAtWindow().mo16645e();
            String e = CardComment.m37829a(this.f24539a).mo34830e(this.f24539a.f24508f.getCurrentItem());
            Single<String> richText = CardComment.m37835d(this.f24539a).getRichText();
            if (richText == null || (flowable = richText.toFlowable()) == null || (c = flowable.mo238014c(new C9123a(this, e))) == null || (a = C9232e.m38292a(c, this.f24539a.mo34753g())) == null) {
                disposable = null;
            } else {
                disposable = a.mo238001b(new C9124b(this), new C9125c(this));
            }
            CardComment.m37829a(this.f24539a).mo16331a(disposable);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34743b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34818a(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$aa */
    public static final class C9108aa implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24528a;

        C9108aa(CardComment bVar) {
            this.f24528a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f24528a.f24505c.setPadding(0, 0, 0, ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$n */
    public static final class View$OnClickListenerC9130n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24545a;

        View$OnClickListenerC9130n(CardComment bVar) {
            this.f24545a = bVar;
        }

        public final void onClick(View view) {
            AbstractC4230c atWindow = CardComment.m37835d(this.f24545a).getAtWindow();
            if (atWindow == null || !atWindow.mo16642b()) {
                CardComment.m37835d(this.f24545a).mo45000i();
                return;
            }
            AbstractC4230c atWindow2 = CardComment.m37835d(this.f24545a).getAtWindow();
            if (atWindow2 != null) {
                atWindow2.mo16645e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$p */
    public static final class View$OnClickListenerC9132p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24547a;

        View$OnClickListenerC9132p(CardComment bVar) {
            this.f24547a = bVar;
        }

        public final void onClick(View view) {
            this.f24547a.f24523u.mo34283G().invoke(0);
            CommentAnimationParam c = this.f24547a.mo34745c();
            if (c != null) {
                c.mo35243a(true);
            }
            this.f24547a.mo34739a(true);
            CommentAnimationParam c2 = this.f24547a.mo34745c();
            if (c2 != null) {
                c2.mo35243a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$q */
    public static final class View$OnClickListenerC9133q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment f24548a;

        View$OnClickListenerC9133q(CardComment bVar) {
            this.f24548a = bVar;
        }

        public final void onClick(View view) {
            boolean z;
            this.f24548a.f24523u.mo34358y().invoke();
            ICommentFunction eVar = this.f24548a.f24525w;
            String e = CardComment.m37829a(this.f24548a).mo34830e(this.f24548a.f24508f.getCurrentItem());
            if (this.f24548a.f24522t.mo35333k() == 0) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo34644a(e, z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onHeightChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$t */
    public static final class C9136t implements C7728a.AbstractC7730a {

        /* renamed from: a */
        final /* synthetic */ CardComment f24551a;

        C9136t(CardComment bVar) {
            this.f24551a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
        public final void onHeightChange(int i) {
            AnimatorUtils.m37823b(i);
            this.f24551a.f24523u.mo34283G().invoke(Integer.valueOf(i));
            CardComment.m37829a(this.f24551a).mo34817a(Integer.valueOf(i));
            if (i == 0 && this.f24551a.mo34748d()) {
                ICardComment.C9184a.m37996b(this.f24551a, false, 1, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment$startAnimator$1$3", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$z */
    public static final class C9142z extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CommentAnimationParam f24558a;

        /* renamed from: b */
        final /* synthetic */ CardComment f24559b;

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f24558a.mo35245b()) {
                this.f24559b.f24505c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            } else {
                this.f24559b.f24505c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            if (this.f24558a.mo35248e()) {
                try {
                    this.f24559b.mo34740a(this.f24558a.mo35249f(), true);
                } catch (Exception e) {
                    C13606d.m55245a("CardComment", e);
                }
            }
        }

        C9142z(CommentAnimationParam aVar, CardComment bVar) {
            this.f24558a = aVar;
            this.f24559b = bVar;
        }
    }

    /* renamed from: f */
    public final void mo34752f(boolean z) {
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        ViewGroup.LayoutParams layoutParams = commentEditText.getLayoutParams();
        if (z) {
            if (layoutParams != null) {
                layoutParams.height = (int) this.f24522t.mo35279a().getResources().getDimension(R.dimen.audio_edit_text_height);
            }
        } else if (layoutParams != null) {
            layoutParams.height = -2;
        }
        CommentEditText commentEditText2 = this.f24517o;
        if (commentEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        commentEditText2.requestLayout();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "value", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/bytedance/ee/bear/middleground/comment/card/CardComment$startAnimator$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$y */
    public static final class C9141y implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CommentAnimationParam f24556a;

        /* renamed from: b */
        final /* synthetic */ CardComment f24557b;

        C9141y(CommentAnimationParam aVar, CardComment bVar) {
            this.f24556a = aVar;
            this.f24557b = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f24556a.mo35245b()) {
                View view = this.f24557b.f24505c;
                Function1<Float, Float> i = this.f24556a.mo35252i();
                Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "value");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    view.setTranslationX(i.invoke((Float) animatedValue).floatValue());
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            View view2 = this.f24557b.f24505c;
            Function1<Float, Float> i2 = this.f24556a.mo35252i();
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "value");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if (animatedValue2 != null) {
                view2.setTranslationY(i2.invoke((Float) animatedValue2).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: c */
    private final void m37834c(CommentAnimationParam aVar) {
        if (aVar != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(aVar.mo35246c(), aVar.mo35247d());
            ofFloat.addUpdateListener(new C9141y(aVar, this));
            Animator.AnimatorListener h = aVar.mo35251h();
            if (h != null) {
                ofFloat.addListener(h);
            }
            ofFloat.addListener(new C9142z(aVar, this));
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "valueAnimator");
            ofFloat.setDuration(aVar.mo35253j());
            ofFloat.start();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$i */
    static final class C9119i<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ CardComment f24535a;

        C9119i(CardComment bVar) {
            this.f24535a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
            if (r3 != false) goto L_0x0059;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onChanged(com.bytedance.ee.bear.contract.ConnectionService.NetworkState r6) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.card.CardComment.C9119i.onChanged(com.bytedance.ee.bear.contract.ConnectionService$NetworkState):void");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34735a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        view.postDelayed(new RunnableC9120j(this, view), 200);
    }

    /* renamed from: c */
    public final void mo34746c(boolean z) {
        String str;
        int i;
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        if (this.f24522t.mo35333k() == 0) {
            str = this.f24522t.mo35279a().getString(R.string.Doc_Comment_Comment);
        } else {
            str = this.f24522t.mo35279a().getString(R.string.Doc_Comment_ReplyCommentDot);
        }
        commentEditText.setHint(str);
        int i2 = 0;
        if (z) {
            mo34747d(false);
        }
        boolean c = this.f24522t.mo35335m().mo17185c();
        this.f24521s = c;
        View view = this.f24507e;
        if (c) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        boolean b = this.f24522t.mo35335m().mo17184b();
        this.f24520r = b;
        View view2 = this.f24510h;
        if (!b) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* renamed from: e */
    public final void mo34750e(boolean z) {
        boolean z2;
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        AbstractC4230c atWindow = commentEditText.getAtWindow();
        Intrinsics.checkExpressionValueIsNotNull(atWindow, "commentEditText.atWindow");
        boolean b = atWindow.mo16642b();
        if (b) {
            CommentEditText commentEditText2 = this.f24517o;
            if (commentEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
            }
            Editable text = commentEditText2.getText();
            if (text == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(text, "commentEditText.text!!");
            if (text.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                CommentEditText commentEditText3 = this.f24517o;
                if (commentEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
                }
                Editable text2 = commentEditText3.getText();
                if (text2 == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(text2, "commentEditText.text!!");
                int lastIndex = StringsKt.getLastIndex(text2);
                CommentEditText commentEditText4 = this.f24517o;
                if (commentEditText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
                }
                Editable text3 = commentEditText4.getText();
                if (text3 == null) {
                    Intrinsics.throwNpe();
                }
                text3.delete(lastIndex, lastIndex + 1);
            }
        }
        CommentTo dVar = CommentTo.f24850a;
        CommentEditText commentEditText5 = this.f24517o;
        if (commentEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        Disposable a = dVar.mo35311a(commentEditText5, new C9110ac(this, z, b));
        CardDataViewModel dVar2 = this.f24513k;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar2.mo16331a(a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$x */
    static final class C9140x<T> implements AbstractC1178x<List<CommentBean>> {

        /* renamed from: a */
        final /* synthetic */ CardComment f24555a;

        C9140x(CardComment bVar) {
            this.f24555a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(List<CommentBean> list) {
            int i;
            if (list == null) {
                C13479a.m54758a("CardComment", "data is null");
                return;
            }
            this.f24555a.f24523u.mo34357x().invoke(Integer.valueOf(list.size()));
            if (!list.isEmpty() || this.f24555a.f24522t.mo35344u()) {
                int i2 = 8;
                boolean z = false;
                if (this.f24555a.f24522t.mo35344u()) {
                    if (!list.isEmpty()) {
                        this.f24555a.f24511i.setVisibility(8);
                        if (!CardComment.m37829a(this.f24555a).mo34824b()) {
                            this.f24555a.mo34746c(false);
                        }
                    } else if (CardComment.m37829a(this.f24555a).mo34824b()) {
                        ICardComment.C9184a.m37996b(this.f24555a, false, 1, null);
                        return;
                    } else {
                        this.f24555a.f24511i.setVisibility(0);
                        this.f24555a.f24510h.setVisibility(8);
                        this.f24555a.f24507e.setVisibility(8);
                    }
                }
                C13479a.m54764b("CardComment", "data size = " + list.size());
                CommentPagerAdapter b = CardComment.m37832b(this.f24555a);
                String c = C9185d.m37997a().mo34730c();
                Intrinsics.checkExpressionValueIsNotNull(c, "CommentServiceImpl.getCommentService().findUid()");
                b.mo34837a(c, list);
                CardComment.m37832b(this.f24555a).mo34842c();
                int a = CardComment.m37829a(this.f24555a).mo34812a(this.f24555a.f24508f);
                if (this.f24555a.f24508f.getCurrentItem() == a) {
                    C13479a.m54764b("CardComment", "detectVisibleItem when showDataLiveData changed, position: " + a);
                    CardComment.m37832b(this.f24555a).mo34841b(a);
                }
                this.f24555a.f24508f.mo45497a(a, false);
                View view = this.f24555a.f24510h;
                if (!this.f24555a.f24520r || !CardComment.m37829a(this.f24555a).mo34826c(this.f24555a.f24508f.getCurrentItem()) || CardComment.m37829a(this.f24555a).mo34824b()) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                View view2 = this.f24555a.f24507e;
                if (this.f24555a.f24521s && CardComment.m37829a(this.f24555a).mo34826c(this.f24555a.f24508f.getCurrentItem())) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                int currentItem = this.f24555a.f24508f.getCurrentItem();
                this.f24555a.f24523u.mo34284H().invoke(CardComment.m37829a(this.f24555a).mo34830e(currentItem));
                if (!CardComment.m37829a(this.f24555a).mo34824b()) {
                    this.f24555a.f24509g.mo45163a();
                }
                this.f24555a.f24506d.setText(CardComment.m37829a(this.f24555a).mo34822b(currentItem));
                String i3 = this.f24555a.f24525w.mo34658i();
                if (i3 != null && (!StringsKt.isBlank(i3))) {
                    List<CommentBean.CommentDetail> comment_list = list.get(a).getComment_list();
                    if (comment_list != null) {
                        List<CommentBean.CommentDetail> list2 = comment_list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                T next = it.next();
                                Intrinsics.checkExpressionValueIsNotNull(next, "it");
                                if (Intrinsics.areEqual(next.getReply_id(), i3)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (z) {
                            return;
                        }
                    }
                    this.f24555a.f24525w.mo34656g();
                    return;
                }
                return;
            }
            C13479a.m54758a("CardComment", "data is empty");
            this.f24555a.mo34739a(true);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34737a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34818a(str);
        ScrollControlViewPager scrollControlViewPager = this.f24508f;
        CardDataViewModel dVar2 = this.f24513k;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        scrollControlViewPager.mo45497a(dVar2.mo34812a(this.f24508f), false);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34744b(boolean z) {
        int i;
        if (this.f24522t.mo35345v()) {
            this.f24503a.mo30250a((float) this.f24522t.mo35320b(), (float) this.f24522t.mo35322c(), (float) this.f24522t.mo35324d());
        } else {
            this.f24503a.mo30258d();
        }
        this.f24503a.mo30259e();
        Resources resources = this.f24522t.mo35279a().getResources();
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        commentEditText.setHint(dVar.mo34814a(resources, this.f24522t.mo35333k()));
        CardDataViewModel dVar2 = this.f24513k;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        commentEditText.setEnabled(dVar2.mo34827c(resources));
        CardDataViewModel dVar3 = this.f24513k;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        commentEditText.setText(dVar3.mo34815a(resources, String.valueOf(commentEditText.getText())));
        ImageView imageView = this.f24518p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendView");
        }
        CardDataViewModel dVar4 = this.f24513k;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        imageView.setVisibility(dVar4.mo34811a(resources));
        MotionImageView motionImageView = this.f24516n;
        if (motionImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("voiceButton");
        }
        CardDataViewModel dVar5 = this.f24513k;
        if (dVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        if (dVar5.mo34811a(resources) != 0 || !this.f24496E.mo35449e()) {
            i = 8;
        } else {
            i = 0;
        }
        motionImageView.setVisibility(i);
        ImageView imageView2 = this.f24519q;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("atButton");
        }
        CardDataViewModel dVar6 = this.f24513k;
        if (dVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        imageView2.setVisibility(dVar6.mo34811a(resources));
        AbstractC9106c a = C9185d.m37997a();
        if (a != null && a.mo34729b()) {
            ImageView imageView3 = this.f24519q;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("atButton");
            }
            imageView3.setVisibility(8);
        }
        Guideline guideline = this.f24495D;
        CardDataViewModel dVar7 = this.f24513k;
        if (dVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        guideline.setGuidelineEnd(dVar7.mo34821b(resources));
        CommentPagerAdapter eVar = this.f24512j;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        eVar.mo34838a(z);
    }

    /* renamed from: d */
    public final void mo34747d(boolean z) {
        int i;
        RecyclerView.LayoutManager layoutManager;
        int i2;
        C13479a.m54764b("CardComment", "updateUiStyle:" + z);
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34820a(z);
        LinearLayoutManager linearLayoutManager = null;
        if (z) {
            CommentEditText commentEditText = this.f24517o;
            if (commentEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
            }
            AbstractC4230c atWindow = commentEditText.getAtWindow();
            if (atWindow != null) {
                atWindow.mo16645e();
            }
            this.f24526y.setBackgroundResource(R.color.bg_body);
            int[] iArr = new int[2];
            this.f24505c.getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                i = C13746i.m55722a((Context) this.f24522t.mo35279a());
            } else {
                i = 0;
            }
            View view = this.f24526y;
            view.setPadding(0, i, 0, view.getPaddingBottom());
            CommentPagerAdapter eVar = this.f24512j;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            RecyclerView a = eVar.mo34833a(this.f24508f.getCurrentItem());
            if (a != null) {
                layoutManager = a.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            if (linearLayoutManager2 != null) {
                i2 = linearLayoutManager2.findLastVisibleItemPosition();
            } else {
                i2 = 0;
            }
            C13742g.m55705a(new RunnableC9111ad(a, i2));
            this.f24494C.setVisibility(8);
            this.f24510h.setVisibility(8);
            this.f24492A.setVisibility(0);
            this.f24506d.setVisibility(8);
            this.f24527z.setVisibility(4);
            this.f24494C.setVisibility(8);
            this.f24509g.setVisibility(8);
            this.f24493B.setShadowSize(UDShadowLayout.Size.NONE);
        } else {
            this.f24526y.setBackgroundResource(R.color.color_transparent);
            ICommentInput aVar = this.f24504b;
            if (aVar != null) {
                ICommentInput.C9239a.m38353a(aVar, false, 1, null);
            }
            this.f24494C.setVisibility(0);
            this.f24510h.setVisibility(0);
            this.f24492A.setVisibility(8);
            this.f24494C.setVisibility(0);
            if (this.f24508f.getChildCount() > 1) {
                this.f24509g.setVisibility(0);
            }
            if (this.f24522t.mo35334l() == 1) {
                this.f24506d.setVisibility(0);
                this.f24527z.setVisibility(0);
            } else {
                this.f24506d.setVisibility(0);
                this.f24527z.setVisibility(4);
            }
            this.f24493B.setShadowSize(UDShadowLayout.Size.L);
        }
        this.f24508f.setCanScroll(!z);
        this.f24493B.setEnabled(!z);
        this.f24505c.setEnabled(!z);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34739a(boolean z) {
        ICommentInput aVar;
        this.f24525w.mo34656g();
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24522t.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30122b(this.f24502K);
        }
        CommentEditText commentEditText = this.f24517o;
        if (commentEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
        }
        AbstractC4230c atWindow = commentEditText.getAtWindow();
        boolean z2 = true;
        if (atWindow != null && atWindow.mo16642b()) {
            CommentEditText commentEditText2 = this.f24517o;
            if (commentEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("commentEditText");
            }
            AbstractC4230c atWindow2 = commentEditText2.getAtWindow();
            if (atWindow2 != null) {
                atWindow2.mo16645e();
            }
        }
        ICommentInput aVar2 = this.f24504b;
        if (!(aVar2 == null || !aVar2.mo35374b() || (aVar = this.f24504b) == null)) {
            ICommentInput.C9239a.m38353a(aVar, false, 1, null);
        }
        this.f24505c.setPadding(0, 0, 0, 0);
        this.f24511i.setVisibility(8);
        C10599b.m43901a();
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c = dVar.mo34825c();
        if (c != null) {
            c.mo5922a(this.f24522t.mo35279a());
        }
        LiveData<ConnectionService.NetworkState> liveData = this.f24500I;
        if (liveData != null) {
            liveData.mo5928b(this.f24501J);
        }
        CardDataViewModel dVar2 = this.f24513k;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar2.mo16330a();
        CommentAnimationParam c2 = mo34745c();
        if (c2 == null || !c2.mo35248e() || !c2.mo35244a() || c2.mo35250g()) {
            z2 = false;
        }
        if (!z || mo34745c() == null || z2) {
            m37831a(this, false, false, 3, null);
        } else {
            m37834c(mo34745c());
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34738a(String str, Integer num) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        ViewGroup viewGroup = null;
        m37830a(this, false, 1, null);
        ICardComment.C9184a.m37995a(this, false, 1, null);
        CardDataViewModel dVar = this.f24513k;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34823b(str);
        CardDataViewModel dVar2 = this.f24513k;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c = dVar2.mo34825c();
        if (c != null) {
            c.mo5922a(this.f24522t.mo35279a());
        }
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        this.f24500I = a;
        if (a != null) {
            a.mo5923a(this.f24522t.mo35279a(), this.f24501J);
        }
        CardDataViewModel dVar3 = this.f24513k;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c2 = dVar3.mo34825c();
        if (c2 != null) {
            c2.mo5923a(this.f24522t.mo35279a(), new C9140x(this));
        }
        C13479a.m54764b("CardComment", "show card comment");
        this.f24522t.mo35325e().mo35305b();
        this.f24522t.mo35325e().mo35303a("view_docs_message_sub_page", null, "", "", true);
        this.f24503a.mo30259e();
        this.f24503a.mo30261g();
        if (num == null && !AnimatorUtils.m37825c()) {
            num = Integer.valueOf(AnimatorUtils.m37822b());
        }
        if (num != null) {
            this.f24503a.mo30249a((float) num.intValue());
        }
        CardDataViewModel dVar4 = this.f24513k;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar4.mo34817a(num);
        ViewParent parent = this.f24505c.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = parent;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            viewGroup2.removeView(this.f24505c);
        }
        this.f24522t.mo35327f().addView(this.f24505c);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24522t.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30121a(this.f24502K);
        }
        m37834c(mo34741b());
    }

    /* renamed from: a */
    public final void mo34740a(boolean z, boolean z2) {
        if (z) {
            this.f24503a.mo30259e();
        }
        ViewParent parent = this.f24505c.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.f24505c);
        }
        this.f24523u.mo34285I().invoke();
        this.f24523u.mo34281E().invoke(Boolean.valueOf(z2));
    }

    /* renamed from: a */
    public final ICommentInput mo34733a(String str, String str2, int i) {
        Config fVar = this.f24522t;
        ICommentListeners fVar2 = this.f24523u;
        DataControl cVar = this.f24524v;
        CommentDetailViewModel aVar = this.f24514l;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailViewModel");
        }
        return new InputComment(fVar, fVar2, cVar, null, aVar.mo34884a(str, null, null, null, null, null), new C9117g(this, str2), new C9118h(this, i), false, 8, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "inputContent", "", "<anonymous parameter 1>", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "bySend", "", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.b$g */
    public static final class C9117g extends Lambda implements Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> {
        final /* synthetic */ String $clickCommentId;
        final /* synthetic */ CardComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9117g(CardComment bVar, String str) {
            super(4);
            this.this$0 = bVar;
            this.$clickCommentId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, Boolean bool, String str2) {
            invoke(str, list, bool.booleanValue(), str2);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2) {
            int i;
            float f;
            Intrinsics.checkParameterIsNotNull(str, "inputContent");
            C13479a.m54764b("CardComment", "toDetail: inputComment dismiss");
            this.this$0.f24504b = null;
            this.this$0.f24522t.mo35325e().mo35303a("click_docs_message_sub_page_reply_finish", null, this.$clickCommentId, "", false);
            CommentEditText d = CardComment.m37835d(this.this$0);
            if (z) {
                str = "";
            }
            d.setText(str);
            CardComment.m37837f(this.this$0).mo16330a();
            this.this$0.f24525w.mo34660k();
            if (this.this$0.mo34748d()) {
                Integer d2 = CardComment.m37829a(this.this$0).mo34828d();
                if (d2 != null) {
                    i = d2.intValue();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    C7728a aVar = this.this$0.f24503a;
                    Integer d3 = CardComment.m37829a(this.this$0).mo34828d();
                    if (d3 != null) {
                        f = (float) d3.intValue();
                    } else {
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    aVar.mo30249a(f);
                } else {
                    this.this$0.f24503a.mo30262h();
                }
                this.this$0.mo34751f();
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m37830a(CardComment bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        bVar.mo34746c(z);
    }

    public CardComment(Config fVar, ICommentListeners fVar2, DataControl cVar, ICommentFunction eVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "configComment");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        this.f24522t = fVar;
        this.f24523u = fVar2;
        this.f24524v = cVar;
        this.f24525w = eVar;
        this.f24515m = new RecordViewModel(fVar);
        this.f24496E = new InputViewModel(fVar, cVar);
        fVar2.mo34345l(new Function1<CommentInputRequest, Unit>(this) {
            /* class com.bytedance.ee.bear.middleground.comment.card.CardComment.C91071 */
            final /* synthetic */ CardComment this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CommentInputRequest commentInputRequest) {
                invoke(commentInputRequest);
                return Unit.INSTANCE;
            }

            public final void invoke(CommentInputRequest commentInputRequest) {
                String str;
                boolean z;
                CommentInputRequest a;
                Intrinsics.checkParameterIsNotNull(commentInputRequest, "it");
                if (!CardComment.m37829a(this.this$0).mo34824b()) {
                    str = CardComment.m37835d(this.this$0).getRichText().blockingGet();
                } else {
                    ICommentInput aVar = this.this$0.f24504b;
                    if (aVar == null || (a = aVar.mo35368a()) == null || (str = a.content) == null) {
                        str = "";
                    }
                }
                String str2 = commentInputRequest.content;
                String str3 = str;
                if (str3 == null || str3.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str2 != null && !str2.equals(str)) {
                    str2 = str2 + str;
                }
                if (!CardComment.m37829a(this.this$0).mo34824b()) {
                    CardComment.m37835d(this.this$0).setRichText(str2);
                    this.this$0.mo34750e(false);
                    return;
                }
                ICommentInput aVar2 = this.this$0.f24504b;
                if (aVar2 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(str2, "text");
                    aVar2.mo35370a(str2);
                }
            }
        });
        View inflate = LayoutInflater.from(fVar.mo35279a()).inflate(R.layout.comment_card_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(conf…omment_card_layout, null)");
        this.f24505c = inflate;
        View findViewById = inflate.findViewById(R.id.pop_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.pop_content)");
        this.f24526y = findViewById;
        this.f24503a = new C7728a(fVar.mo35279a(), this.f24526y);
        View findViewById2 = this.f24505c.findViewById(R.id.rl_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.rl_title)");
        SpaceShadowLayout spaceShadowLayout = (SpaceShadowLayout) findViewById2;
        this.f24493B = spaceShadowLayout;
        this.f24503a.mo30252a(spaceShadowLayout);
        View findViewById3 = this.f24505c.findViewById(R.id.comment_back_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.comment_back_arrow)");
        this.f24527z = findViewById3;
        View findViewById4 = this.f24505c.findViewById(R.id.comment_close_full);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.comment_close_full)");
        this.f24492A = findViewById4;
        View findViewById5 = this.f24505c.findViewById(R.id.tv_page_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.tv_page_title)");
        this.f24506d = (TextView) findViewById5;
        View findViewById6 = this.f24505c.findViewById(R.id.tv_opt_comment);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.tv_opt_comment)");
        this.f24507e = findViewById6;
        View findViewById7 = this.f24505c.findViewById(R.id.doc_comment_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.doc_comment_viewpager)");
        this.f24508f = (ScrollControlViewPager) findViewById7;
        View findViewById8 = this.f24505c.findViewById(R.id.doc_comment_indicator);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.doc_comment_indicator)");
        this.f24509g = (CardIndicator) findViewById8;
        View findViewById9 = this.f24505c.findViewById(R.id.doc_comment_sender);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.doc_comment_sender)");
        this.f24510h = findViewById9;
        View findViewById10 = this.f24505c.findViewById(R.id.et_sender);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.et_sender)");
        this.f24517o = (CommentEditText) findViewById10;
        View findViewById11 = this.f24505c.findViewById(R.id.comment_send_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.id.comment_send_btn)");
        this.f24518p = (ImageView) findViewById11;
        View findViewById12 = this.f24505c.findViewById(R.id.comment_at_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.id.comment_at_btn)");
        this.f24519q = (ImageView) findViewById12;
        View findViewById13 = this.f24505c.findViewById(R.id.comment_top_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.id.comment_top_divider)");
        this.f24494C = findViewById13;
        View findViewById14 = this.f24505c.findViewById(R.id.no_comment);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "rootView.findViewById(R.id.no_comment)");
        this.f24511i = (SpaceEmptyState) findViewById14;
        View findViewById15 = this.f24505c.findViewById(R.id.commentVoice);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "rootView.findViewById(R.id.commentVoice)");
        this.f24516n = (MotionImageView) findViewById15;
        View findViewById16 = this.f24505c.findViewById(R.id.toolbar_guide_line);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "rootView.findViewById(R.id.toolbar_guide_line)");
        this.f24495D = (Guideline) findViewById16;
        m37839h();
        ImageView imageView = this.f24518p;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sendView");
        }
        imageView.setEnabled(false);
        m37841j();
        this.f24502K = new C9112b(this);
    }

    /* renamed from: a */
    static /* synthetic */ void m37831a(CardComment bVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        bVar.mo34740a(z, z2);
    }
}
