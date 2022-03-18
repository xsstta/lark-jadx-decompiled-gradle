package com.bytedance.ee.bear.middleground.comment.card;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.drive.AbstractC5141c;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.card.ICardComment;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReviewException;
import com.bytedance.ee.bear.middleground.comment.input.InputViewModel;
import com.bytedance.ee.bear.middleground.comment.p449g.C9226a;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.middleground.comment.widget.CommentTextView;
import com.bytedance.ee.bear.middleground.comment.widget.RichTextInjector;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.bear.widgets.CardIndicator;
import com.bytedance.ee.bear.widgets.viewpager.VerticalViewPager;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\u0018\u0000 n2\u00020\u0001:\u0001nBG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\b\u0010I\u001a\u00020\rH\u0002J\u0010\u0010J\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u0010H\u0002J\u001a\u0010L\u001a\u00020\r2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0018\u0010O\u001a\u0002022\u000e\u0010P\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0002J\u0010\u0010Q\u001a\u00020\r2\u0006\u0010R\u001a\u00020\u0010H\u0016J\b\u0010S\u001a\u00020\rH\u0016J\b\u0010T\u001a\u00020\rH\u0002J\b\u0010U\u001a\u00020\rH\u0002J\b\u0010V\u001a\u00020\u0010H\u0016J\b\u0010W\u001a\u00020\rH\u0002J\u0010\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020!H\u0016J\u0010\u0010Z\u001a\u00020\r2\u0006\u0010[\u001a\u000202H\u0002J\b\u0010\\\u001a\u00020\rH\u0002J\u0010\u0010]\u001a\u00020\r2\u0006\u0010^\u001a\u00020\u0010H\u0002J\b\u0010_\u001a\u00020\rH\u0002J\b\u0010`\u001a\u00020\rH\u0002J\u0016\u0010a\u001a\u00020\r2\u0006\u0010b\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u0010J\u001f\u0010d\u001a\u00020\r2\u0006\u0010e\u001a\u0002022\b\u0010f\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010gJ\u0010\u0010h\u001a\u00020\r2\u0006\u0010[\u001a\u000202H\u0016J\"\u0010i\u001a\u00020\r2\b\u0010j\u001a\u0004\u0018\u0001022\u000e\u0010P\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0002J\u0010\u0010k\u001a\u00020\r2\u0006\u0010l\u001a\u00020\u0010H\u0016J\u0010\u0010m\u001a\u00020\r2\u0006\u0010[\u001a\u000202H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010*\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u000e\u0010-\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0004\n\u0002\u0010/R6\u00100\u001a*\u0012\u0004\u0012\u000202\u0012\f\u0012\n\u0012\u0004\u0012\u000204\u0018\u000103\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u000102\u0012\u0004\u0012\u00020\r01X\u0004¢\u0006\u0002\n\u0000R \u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r06X\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000202X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X.¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020!X.¢\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX.¢\u0006\u0002\n\u0000¨\u0006o"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardComment2;", "Lcom/bytedance/ee/bear/middleground/comment/card/ICardComment;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "relpy", "Lkotlin/Function1;", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "", "interceptClickEmpty", "Lkotlin/Function0;", "", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "backPress", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "commentTv", "Lcom/bytedance/ee/bear/middleground/comment/widget/CommentTextView;", "currentPos", "", "getCurrentPos", "()I", "setCurrentPos", "(I)V", "dataViewModel", "Lcom/bytedance/ee/bear/middleground/comment/card/CardDataViewModel;", "hasPerReply", "inputCommentTop", "inputCommentView", "Landroid/view/View;", "inputViewModel", "Lcom/bytedance/ee/bear/middleground/comment/input/InputViewModel;", "mEnterAnimator", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "getMEnterAnimator", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;", "setMEnterAnimator", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentAnimationParam;)V", "mExitAnimator", "getMExitAnimator", "setMExitAnimator", "oldLightStatusBar", "oldStatusBarColor", "Ljava/lang/Integer;", "onInputClose", "Lkotlin/Function4;", "", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "onInputCommentTopChange", "Lkotlin/Function2;", "onLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "originContent", "pagerAdapter", "Lcom/bytedance/ee/bear/middleground/comment/card/CommentPagerAdapter2;", "pagerIndicator", "Lcom/bytedance/ee/bear/widgets/CardIndicator;", "rootView", "selectedImages", "sendIv", "Landroid/widget/ImageView;", "statusBarLastStatusIsFullScreen", "getStatusBarLastStatusIsFullScreen", "()Z", "setStatusBarLastStatusIsFullScreen", "(Z)V", "viewPager", "Lcom/bytedance/ee/bear/widgets/viewpager/VerticalViewPager;", "addReplyFuntionIfNeed", "banSwitchCard", "banSwitch", "calculatePadding", "view", "Landroidx/recyclerview/widget/RecyclerView;", "convert2TextString", "images", "dismiss", "shouldShowAnimator", "dismissInputComment", "fixVPLocation", "initDefaultData", "isShowing", "onFinishClose", "onReactionAdd", "itemView", "replyComment", "commentId", "saveStatusbarState", "setInputViewVisibility", "visiable", "setListener", "setUiStatus", "setViewPagerItem", "pos", "smooth", "show", "targetId", "height", "(Ljava/lang/String;Ljava/lang/Integer;)V", "switchCard", "updateInputUi", "content", "updatePanel", "forceContentDiff", "updateTargetId", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.card.c */
public final class CardComment2 implements ICardComment {

    /* renamed from: E */
    private static int f24560E = C13749l.m55738a(96);

    /* renamed from: F */
    private static final int f24561F = 1;

    /* renamed from: p */
    public static final Companion f24562p = new Companion(null);

    /* renamed from: A */
    private boolean f24563A;

    /* renamed from: B */
    private int f24564B;

    /* renamed from: C */
    private final AbstractC7666d f24565C;

    /* renamed from: D */
    private final Function1<CommentInputRequest, Unit> f24566D;

    /* renamed from: a */
    public VerticalViewPager f24567a;

    /* renamed from: b */
    public CardIndicator f24568b;

    /* renamed from: c */
    public CommentPagerAdapter2 f24569c;

    /* renamed from: d */
    public CardDataViewModel f24570d;

    /* renamed from: e */
    public CommentTextView f24571e;

    /* renamed from: f */
    public boolean f24572f;

    /* renamed from: g */
    public final InputViewModel f24573g;

    /* renamed from: h */
    public String f24574h = "";

    /* renamed from: i */
    public List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> f24575i;

    /* renamed from: j */
    public int f24576j;

    /* renamed from: k */
    public final Config f24577k;

    /* renamed from: l */
    public final ICommentListeners f24578l;

    /* renamed from: m */
    public final DataControl f24579m;

    /* renamed from: n */
    public final ICommentFunction f24580n;

    /* renamed from: o */
    public final Function0<Boolean> f24581o;

    /* renamed from: q */
    private View f24582q;

    /* renamed from: r */
    private Integer f24583r;

    /* renamed from: s */
    private boolean f24584s;

    /* renamed from: t */
    private ImageView f24585t;

    /* renamed from: u */
    private View f24586u;

    /* renamed from: v */
    private CommentAnimationParam f24587v;

    /* renamed from: w */
    private CommentAnimationParam f24588w;

    /* renamed from: x */
    private final Function2<Integer, Boolean, Unit> f24589x = new C9148g(this);

    /* renamed from: y */
    private final View.OnLayoutChangeListener f24590y = new View$OnLayoutChangeListenerC9151h(this);

    /* renamed from: z */
    private final Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> f24591z = new C9147f(this);

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: e */
    public void mo34749e() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/card/CardComment2$Companion;", "", "()V", "BOTTOM_MARGIN", "", "COMMENT_VIEW_PAGER_OFFSCREEN_PAGE_LIMIT", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public CommentAnimationParam mo34785a() {
        return this.f24588w;
    }

    /* renamed from: c */
    public final int mo34790c() {
        return this.f24564B;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$b */
    static final class C9143b implements AbstractC7666d {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24592a;

        C9143b(CardComment2 cVar) {
            this.f24592a = cVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            this.f24592a.mo34739a(true);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$d */
    public static final class C9145d extends Lambda implements Function0<Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9145d(CardComment2 cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.f24578l.mo34283G().invoke(0);
            ICardComment.C9184a.m37996b(this.this$0, false, 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$r */
    public static final class C9163r extends Lambda implements Function0<Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9163r(CardComment2 cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (!this.this$0.f24581o.invoke().booleanValue()) {
                ICardComment.C9184a.m37996b(this.this$0, false, 1, null);
            }
        }
    }

    /* renamed from: j */
    private final void m37889j() {
        mo34792c(this.f24577k.mo35335m().mo17184b());
        this.f24572f = this.f24577k.mo35335m().mo17184b();
    }

    /* renamed from: b */
    public final void mo34789b() {
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager.postDelayed(new RunnableC9144c(this), 50);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$c */
    public static final class RunnableC9144c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24593a;

        RunnableC9144c(CardComment2 cVar) {
            this.f24593a = cVar;
        }

        public final void run() {
            RecyclerView.LayoutManager layoutManager;
            int max = Math.max(0, Math.min(this.f24593a.mo34790c(), CardComment2.m37879a(this.f24593a).getItemCount() - 1));
            RecyclerView recyclerView = CardComment2.m37881b(this.f24593a).mRecyclerView;
            LinearLayoutManager linearLayoutManager = null;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = layoutManager;
            }
            LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
            if (linearLayoutManager2 != null) {
                linearLayoutManager2.scrollToPositionWithOffset(Math.max(0, max), 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$i */
    static final class RunnableC9152i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24599a;

        /* renamed from: b */
        final /* synthetic */ View f24600b;

        RunnableC9152i(CardComment2 cVar, View view) {
            this.f24599a = cVar;
            this.f24600b = view;
        }

        public final void run() {
            RecyclerView a;
            Rect rect = new Rect();
            this.f24599a.f24571e.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            this.f24600b.getGlobalVisibleRect(rect2);
            if (rect.top - 30 < rect2.bottom && (a = CardComment2.m37879a(this.f24599a).mo34854a(CardComment2.m37881b(this.f24599a).getCurrentItem())) != null) {
                a.scrollBy(0, this.f24600b.getHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$q */
    public static final class C9162q extends Lambda implements Function0<Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9162q(CardComment2 cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            boolean z;
            this.this$0.f24578l.mo34358y().invoke();
            ICommentFunction eVar = this.this$0.f24580n;
            String e = CardComment2.m37882c(this.this$0).mo34830e(CardComment2.m37881b(this.this$0).getCurrentItem());
            if (this.this$0.f24577k.mo35333k() == 0) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo34644a(e, z);
        }
    }

    /* renamed from: f */
    private final void m37885f() {
        this.f24578l.mo34285I().invoke();
        this.f24578l.mo34281E().invoke(false);
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            View view2 = this.f24582q;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            viewGroup.removeView(view2);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: d */
    public boolean mo34748d() {
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        if (view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private final void m37888i() {
        if (this.f24577k.mo35335m().mo17185c()) {
            CommentPagerAdapter2 fVar = this.f24569c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            fVar.mo34862a(new C9162q(this));
        } else {
            CommentPagerAdapter2 fVar2 = this.f24569c;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            fVar2.mo34862a((Function0<Unit>) null);
        }
        m37889j();
        CommentPagerAdapter2 fVar3 = this.f24569c;
        if (fVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        fVar3.mo34865b(new C9163r(this));
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        RecyclerView recyclerView = verticalViewPager.mRecyclerView;
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "viewPager.mRecyclerView");
        recyclerView.setItemAnimator(null);
        VerticalViewPager verticalViewPager2 = this.f24567a;
        if (verticalViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager2.setOnClickListener(new View$OnClickListenerC9164s(this));
    }

    /* renamed from: k */
    private final void m37890k() {
        boolean z;
        Window window = this.f24577k.mo35279a().getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "config.activity.window");
        this.f24583r = Integer.valueOf(window.getStatusBarColor());
        if (Build.VERSION.SDK_INT >= 23) {
            Window window2 = this.f24577k.mo35279a().getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window2, "config.activity.window");
            View decorView = window2.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "config.activity.window.decorView");
            if ((decorView.getSystemUiVisibility() & 8192) == 8192) {
                z = true;
            } else {
                z = false;
            }
            this.f24584s = z;
        }
    }

    /* renamed from: g */
    private final void m37886g() {
        C13479a.m54764b("CardComment", "initDefaultData");
        CardDataViewModel dVar = new CardDataViewModel();
        this.f24570d = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34819a(this.f24577k.mo35329h(), this.f24579m);
        ICommentListeners fVar = this.f24578l;
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        fVar.mo34299a(view);
        CommentPagerAdapter2 fVar2 = new CommentPagerAdapter2();
        this.f24569c = fVar2;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        Config fVar3 = this.f24577k;
        FragmentActivity a = fVar3.mo35279a();
        ICommentPermission m = this.f24577k.mo35335m();
        String c = C4484g.m18494b().mo17252c();
        Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
        fVar2.mo34859a(fVar3, a, m, c, this.f24578l, this.f24580n, new C9145d(this), new C9146e(this));
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        CommentPagerAdapter2 fVar4 = this.f24569c;
        if (fVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        verticalViewPager.setAdapter(fVar4);
        CommentPagerAdapter2 fVar5 = this.f24569c;
        if (fVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        VerticalViewPager verticalViewPager2 = this.f24567a;
        if (verticalViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        fVar5.mo45593b(verticalViewPager2);
        CardIndicator cardIndicator = this.f24568b;
        if (cardIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerIndicator");
        }
        VerticalViewPager verticalViewPager3 = this.f24567a;
        if (verticalViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        cardIndicator.setViewPager2(verticalViewPager3);
        m37888i();
    }

    /* renamed from: h */
    private final void m37887h() {
        if (this.f24578l.mo34351r().invoke().booleanValue()) {
            View view = this.f24582q;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            view.setOnClickListener(new View$OnClickListenerC9153j(this));
        }
        CardIndicator cardIndicator = this.f24568b;
        if (cardIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerIndicator");
        }
        cardIndicator.setOnClickListener(new View$OnClickListenerC9154k(this));
        this.f24586u.setOnClickListener(new View$OnClickListenerC9155l(this));
        this.f24571e.setOnClickListener(new View$OnClickListenerC9156m(this));
        this.f24571e.setOnLongClickListener(new View$OnLongClickListenerC9157n(this));
        this.f24585t.setOnClickListener(new View$OnClickListenerC9158o(this));
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = 0;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager.registerOnPageChangeCallback(new C9161p(this, booleanRef, longRef, objectRef));
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34742b(CommentAnimationParam aVar) {
        this.f24588w = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$k */
    public static final class View$OnClickListenerC9154k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24602a;

        View$OnClickListenerC9154k(CardComment2 cVar) {
            this.f24602a = cVar;
        }

        public final void onClick(View view) {
            this.f24602a.mo34739a(false);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34736a(CommentAnimationParam aVar) {
        this.f24587v = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/middleground/comment/card/CardComment2$setListener$7", "Lcom/bytedance/ee/bear/widgets/viewpager/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageScrollStateChanged", "", UpdateKey.STATUS, "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$p */
    public static final class C9161p extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24609a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f24610b;

        /* renamed from: c */
        final /* synthetic */ Ref.LongRef f24611c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f24612d;

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            Ref.BooleanRef booleanRef = this.f24610b;
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            booleanRef.element = z;
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            boolean z;
            if (this.f24609a.mo34790c() == i || !this.f24609a.f24577k.mo35337o()) {
                T t = (T) CardComment2.m37882c(this.f24609a).mo34830e(i);
                this.f24609a.f24578l.mo34284H().invoke(t);
                if (!Intrinsics.areEqual((Object) this.f24612d.element, (Object) t)) {
                    RecyclerView a = CardComment2.m37879a(this.f24609a).mo34854a(CardComment2.m37881b(this.f24609a).getCurrentItem());
                    if (a == null || a.isVerticalFadingEdgeEnabled()) {
                        CardComment2.m37879a(this.f24609a).mo34860a(CardComment2.m37881b(this.f24609a));
                    }
                    this.f24609a.mo34788a((String) null, (List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>) null);
                }
                this.f24612d.element = t;
                C9226a e = this.f24609a.f24577k.mo35325e();
                String e2 = CardComment2.m37882c(this.f24609a).mo34830e(i);
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                e.mo35303a("bubble_comment_page_slide", null, e2, "", z);
                C13479a.m54764b("CardComment", "detectVisibleItem onPageSelected, position: " + i);
                CardComment2.m37879a(this.f24609a).mo34869c(i);
                return;
            }
            this.f24609a.mo34789b();
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            if (CardComment2.m37882c(this.f24609a).mo34829d(i) && this.f24610b.element && System.currentTimeMillis() - this.f24611c.element > ((long) 2000)) {
                this.f24611c.element = System.currentTimeMillis();
                Toast.showText(this.f24609a.f24577k.mo35279a(), (int) R.string.Doc_Comment_NoMoreComments);
            }
        }

        C9161p(CardComment2 cVar, Ref.BooleanRef booleanRef, Ref.LongRef longRef, Ref.ObjectRef objectRef) {
            this.f24609a = cVar;
            this.f24610b = booleanRef;
            this.f24611c = longRef;
            this.f24612d = objectRef;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CommentPagerAdapter2 m37879a(CardComment2 cVar) {
        CommentPagerAdapter2 fVar = cVar.f24569c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        return fVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ VerticalViewPager m37881b(CardComment2 cVar) {
        VerticalViewPager verticalViewPager = cVar.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        return verticalViewPager;
    }

    /* renamed from: c */
    public static final /* synthetic */ CardDataViewModel m37882c(CardComment2 cVar) {
        CardDataViewModel dVar = cVar.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        return dVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ CardIndicator m37883d(CardComment2 cVar) {
        CardIndicator cardIndicator = cVar.f24568b;
        if (cardIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerIndicator");
        }
        return cardIndicator;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$o */
    public static final class View$OnClickListenerC9158o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24606a;

        View$OnClickListenerC9158o(CardComment2 cVar) {
            this.f24606a = cVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "newData", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$o$a */
        static final class C9159a<T> implements Consumer<String> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC9158o f24607a;

            C9159a(View$OnClickListenerC9158o oVar) {
                this.f24607a = oVar;
            }

            /* renamed from: a */
            public final void accept(String str) {
                DataControl cVar = this.f24607a.f24606a.f24579m;
                Intrinsics.checkExpressionValueIsNotNull(str, "newData");
                cVar.mo34705a(str, Action.PUBLISH);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$o$b */
        static final class C9160b<T> implements Consumer<Throwable> {

            /* renamed from: a */
            final /* synthetic */ View$OnClickListenerC9158o f24608a;

            C9160b(View$OnClickListenerC9158o oVar) {
                this.f24608a = oVar;
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                this.f24608a.f24606a.f24573g.mo35435a(this.f24608a.f24606a.f24578l, th instanceof ReviewException);
            }
        }

        public final void onClick(View view) {
            String str;
            Map<Object, Object> map;
            Disposable disposable;
            String e = CardComment2.m37882c(this.f24606a).mo34830e(CardComment2.m37881b(this.f24606a).getCurrentItem());
            CommentBean f = CardComment2.m37882c(this.f24606a).mo34831f(CardComment2.m37881b(this.f24606a).getCurrentItem());
            if (this.f24606a.f24571e.getRawString() != null) {
                String str2 = this.f24606a.f24574h;
                List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list = this.f24606a.f24575i;
                this.f24606a.mo34788a((String) null, (List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>) null);
                DataControl cVar = this.f24606a.f24579m;
                if (f != null) {
                    str = f.getPosition();
                } else {
                    str = null;
                }
                if (f != null) {
                    map = f.getBizParams();
                } else {
                    map = null;
                }
                AbstractC68307f a = C9232e.m38293a(DataControl.C9096a.m37730a(cVar, str2, list, e, false, null, null, false, null, str, map, 240, null), null, 1, null);
                if (a != null) {
                    disposable = a.mo238001b(new C9159a(this), new C9160b(this));
                } else {
                    disposable = null;
                }
                CardComment2.m37882c(this.f24606a).mo16331a(disposable);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$l */
    public static final class View$OnClickListenerC9155l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24603a;

        View$OnClickListenerC9155l(CardComment2 cVar) {
            this.f24603a = cVar;
        }

        public final void onClick(View view) {
            CardComment2 cVar = this.f24603a;
            cVar.mo34791c(CardComment2.m37882c(cVar).mo34830e(CardComment2.m37881b(this.f24603a).getCurrentItem()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$m */
    public static final class View$OnClickListenerC9156m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24604a;

        View$OnClickListenerC9156m(CardComment2 cVar) {
            this.f24604a = cVar;
        }

        public final void onClick(View view) {
            CardComment2 cVar = this.f24604a;
            cVar.mo34791c(CardComment2.m37882c(cVar).mo34830e(CardComment2.m37881b(this.f24604a).getCurrentItem()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$n */
    public static final class View$OnLongClickListenerC9157n implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24605a;

        View$OnLongClickListenerC9157n(CardComment2 cVar) {
            this.f24605a = cVar;
        }

        public final boolean onLongClick(View view) {
            CardComment2 cVar = this.f24605a;
            cVar.mo34791c(CardComment2.m37882c(cVar).mo34830e(CardComment2.m37881b(this.f24605a).getCurrentItem()));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$s */
    public static final class View$OnClickListenerC9164s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24613a;

        View$OnClickListenerC9164s(CardComment2 cVar) {
            this.f24613a = cVar;
        }

        public final void onClick(View view) {
            if (!this.f24613a.f24581o.invoke().booleanValue()) {
                ICardComment.C9184a.m37996b(this.f24613a, false, 1, null);
            }
        }
    }

    /* renamed from: d */
    private final void m37884d(boolean z) {
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        RecyclerView.Adapter adapter = verticalViewPager.getAdapter();
        if (!(adapter instanceof CommentPagerAdapter2)) {
            adapter = null;
        }
        CommentPagerAdapter2 fVar = (CommentPagerAdapter2) adapter;
        if (fVar != null) {
            fVar.mo34863a(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$j */
    public static final class View$OnClickListenerC9153j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24601a;

        View$OnClickListenerC9153j(CardComment2 cVar) {
            this.f24601a = cVar;
        }

        public final void onClick(View view) {
            if (!this.f24601a.f24581o.invoke().booleanValue()) {
                this.f24601a.f24578l.mo34283G().invoke(0);
                CommentAnimationParam a = this.f24601a.mo34785a();
                if (a != null) {
                    a.mo35243a(true);
                }
                this.f24601a.mo34739a(true);
                CommentAnimationParam a2 = this.f24601a.mo34785a();
                if (a2 != null) {
                    a2.mo35243a(false);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34735a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        view.postDelayed(new RunnableC9152i(this, view), 200);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34743b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        CardDataViewModel dVar = this.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34823b(str);
    }

    /* renamed from: a */
    private final String m37880a(List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        String str = '[' + this.f24577k.mo35279a().getString(((AbstractC5141c) KoinJavaComponent.m268613a(AbstractC5141c.class, null, null, 6, null)).mo20430a()) + ']';
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: b */
    public void mo34744b(boolean z) {
        m37889j();
        CommentPagerAdapter2 fVar = this.f24569c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        fVar.mo34870c(z);
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        RecyclerView recyclerView = verticalViewPager.mRecyclerView;
        if (recyclerView != null) {
            int i = this.f24564B;
            CommentPagerAdapter2 fVar2 = this.f24569c;
            if (fVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            recyclerView.scrollToPosition(Math.max(0, Math.min(i, fVar2.getItemCount() - 1)));
        }
    }

    /* renamed from: c */
    public final void mo34792c(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (z) {
            Resources resources = this.f24577k.mo35279a().getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "config.activity.resources");
            if (resources.getConfiguration().orientation != 2) {
                VerticalViewPager verticalViewPager = this.f24567a;
                if (verticalViewPager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewPager");
                }
                ViewGroup.LayoutParams layoutParams = verticalViewPager.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = layoutParams;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) marginLayoutParams;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.bottomMargin = f24560E;
                }
                this.f24586u.setVisibility(0);
                return;
            }
        }
        VerticalViewPager verticalViewPager2 = this.f24567a;
        if (verticalViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        ViewGroup.LayoutParams layoutParams2 = verticalViewPager2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams;
        if (marginLayoutParams3 != null) {
            marginLayoutParams3.bottomMargin = 0;
        }
        this.f24586u.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo34791c(String str) {
        String str2;
        Map<Object, Object> map;
        this.f24577k.mo35325e().mo35303a("reply_comment", null, str, null, false);
        CardDataViewModel dVar = this.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        CommentBean f = dVar.mo34831f(verticalViewPager.getCurrentItem());
        this.f24571e.getRawString();
        CommentInputRequest commentInputRequest = new CommentInputRequest();
        commentInputRequest.comment_id = str;
        commentInputRequest.is_whole = false;
        commentInputRequest.keyboard_pop = true;
        commentInputRequest.show_voice = true;
        commentInputRequest.show_insert_image = this.f24577k.mo35347x();
        commentInputRequest.doc_url = this.f24577k.mo35331i();
        commentInputRequest.show_comment_image = this.f24577k.mo35348y();
        commentInputRequest.type = 2;
        commentInputRequest.canUseBlankContent = true;
        commentInputRequest.content = this.f24574h;
        CommentBean.CommentDetail.ExtraEntity extraEntity = null;
        if (f != null) {
            str2 = f.getPosition();
        } else {
            str2 = null;
        }
        commentInputRequest.position = str2;
        if (f != null) {
            map = f.getBizParams();
        } else {
            map = null;
        }
        commentInputRequest.bizParams = map;
        List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list = this.f24575i;
        if (list != null && (!list.isEmpty())) {
            extraEntity = new CommentBean.CommentDetail.ExtraEntity();
            extraEntity.setImage_list(new ArrayList());
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> image_list = extraEntity.getImage_list();
            List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2 = this.f24575i;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            image_list.addAll(list2);
        }
        commentInputRequest.extra = extraEntity;
        this.f24566D.invoke(commentInputRequest);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$t */
    static final class C9165t<T> implements AbstractC1178x<List<CommentBean>> {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24614a;

        C9165t(CardComment2 cVar) {
            this.f24614a = cVar;
        }

        /* renamed from: a */
        public final void onChanged(List<CommentBean> list) {
            boolean z;
            if (list == null) {
                C13479a.m54775e("CardComment", "data is null");
                return;
            }
            this.f24614a.f24578l.mo34357x().invoke(Integer.valueOf(list.size()));
            if (list.isEmpty()) {
                C13479a.m54758a("CardComment", "data is empty");
                this.f24614a.mo34739a(true);
                return;
            }
            C13479a.m54764b("CardComment", "data size = " + list.size());
            CommentPagerAdapter2 a = CardComment2.m37879a(this.f24614a);
            String c = C9185d.m37997a().mo34730c();
            Intrinsics.checkExpressionValueIsNotNull(c, "CommentServiceImpl.getCommentService().findUid()");
            a.mo34861a(c, list);
            CardComment2.m37879a(this.f24614a).notifyDataSetChanged();
            int a2 = CardComment2.m37882c(this.f24614a).mo34813a(CardComment2.m37881b(this.f24614a));
            if (a2 == CardComment2.m37881b(this.f24614a).getCurrentItem()) {
                C13479a.m54764b("CardComment", "detectVisibleItem when showDataLiveData changed, position: " + a2);
                CardComment2.m37879a(this.f24614a).mo34869c(a2);
            }
            boolean z2 = false;
            this.f24614a.mo34786a(a2, false);
            CardComment2.m37883d(this.f24614a).mo45163a();
            CardComment2 cVar = this.f24614a;
            if (!cVar.f24572f || !CardComment2.m37882c(this.f24614a).mo34826c(CardComment2.m37881b(this.f24614a).getCurrentItem())) {
                z = false;
            } else {
                z = true;
            }
            cVar.mo34792c(z);
            Function1<String, Unit> H = this.f24614a.f24578l.mo34284H();
            String comment_id = list.get(a2).getComment_id();
            Intrinsics.checkExpressionValueIsNotNull(comment_id, "data[position].comment_id");
            H.invoke(comment_id);
            String i = this.f24614a.f24580n.mo34658i();
            if (i != null && (!StringsKt.isBlank(i))) {
                List<CommentBean.CommentDetail> comment_list = list.get(a2).getComment_list();
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
                            if (Intrinsics.areEqual(next.getReply_id(), i)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
                this.f24614a.f24580n.mo34656g();
            }
        }
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34737a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        CardDataViewModel dVar = this.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34818a(str);
        CardDataViewModel dVar2 = this.f24570d;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        mo34786a(dVar2.mo34813a(verticalViewPager), false);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34739a(boolean z) {
        this.f24580n.mo34656g();
        ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20684a(this.f24577k.mo35279a().getSupportFragmentManager(), "CardAdapter2");
        AnimatorUtils.m37824b(false);
        if (!this.f24577k.mo35337o() && this.f24577k.mo35338p()) {
            Integer num = this.f24583r;
            if (num != null) {
                C11789c.m48865a(this.f24577k.mo35279a(), num.intValue(), this.f24584s);
                this.f24583r = null;
            }
            if (this.f24563A) {
                Window window = this.f24577k.mo35279a().getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "config.activity.window");
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | DynamicModule.f58006b);
                this.f24563A = false;
            }
        }
        CommentPagerAdapter2 fVar = this.f24569c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        fVar.mo34868c();
        this.f24578l.mo34359z().remove(this.f24589x);
        this.f24578l.mo34356w().remove(this.f24591z);
        this.f24577k.mo35327f().removeOnLayoutChangeListener(this.f24590y);
        AbstractC7665c g = this.f24578l.mo34334g();
        if (g != null) {
            g.mo30122b(this.f24565C);
        }
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        view.setPadding(0, 0, 0, 0);
        C10599b.m43901a();
        CardDataViewModel dVar = this.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c = dVar.mo34825c();
        if (c != null) {
            c.mo5922a(this.f24577k.mo35279a());
        }
        CardDataViewModel dVar2 = this.f24570d;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar2.mo16330a();
        m37885f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "pos", "", "smooth", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$e */
    public static final class C9146e extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9146e(CardComment2 cVar) {
            super(2);
            this.this$0 = cVar;
        }

        public final void invoke(int i, boolean z) {
            this.this$0.mo34786a(i, z);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            invoke(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$g */
    static final class C9148g extends Lambda implements Function2<Integer, Boolean, Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9148g(CardComment2 cVar) {
            super(2);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            invoke(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i, boolean z) {
            C13479a.m54764b("CardComment", "onInputCommentTopChange: " + i);
            this.this$0.f24576j = i;
            final RecyclerView a = CardComment2.m37879a(this.this$0).mo34854a(this.this$0.mo34790c());
            if (i == 0) {
                CardComment2.m37883d(this.this$0).setVisibility(0);
                if (a != null) {
                    a.setVerticalFadingEdgeEnabled(true);
                }
            } else {
                CardComment2.m37883d(this.this$0).setVisibility(4);
                if (CardComment2.m37879a(this.this$0).mo34872d()) {
                    final int currentItem = CardComment2.m37881b(this.this$0).getCurrentItem();
                    if (a != null) {
                        a.postDelayed(new Runnable(this) {
                            /* class com.bytedance.ee.bear.middleground.comment.card.CardComment2.C9148g.RunnableC91502 */

                            /* renamed from: a */
                            final /* synthetic */ C9148g f24595a;

                            {
                                this.f24595a = r1;
                            }

                            public final void run() {
                                a.scrollToPosition(CardComment2.m37879a(this.f24595a.this$0).mo34864b(currentItem));
                            }
                        }, 100);
                    }
                } else if (a != null) {
                    a.postDelayed(new Runnable() {
                        /* class com.bytedance.ee.bear.middleground.comment.card.CardComment2.C9148g.RunnableC91491 */

                        public final void run() {
                            RecyclerView recyclerView = a;
                            RecyclerView.Adapter adapter = recyclerView.getAdapter();
                            if (adapter == null) {
                                Intrinsics.throwNpe();
                            }
                            Intrinsics.checkExpressionValueIsNotNull(adapter, "rv.adapter!!");
                            recyclerView.scrollToPosition(adapter.getItemCount() - 1);
                        }
                    }, 100);
                }
                if (a != null) {
                    a.setVerticalFadingEdgeEnabled(false);
                }
            }
            this.this$0.mo34787a(a, i);
        }
    }

    /* renamed from: a */
    public final void mo34786a(int i, boolean z) {
        this.f24564B = i;
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager.setCurrentItem(i, z);
    }

    /* renamed from: a */
    public final void mo34787a(RecyclerView recyclerView, int i) {
        C13479a.m54764b("CardComment", "inputCommentTop = " + i + "  rv = " + String.valueOf(recyclerView));
        if (i <= 0) {
            m37884d(false);
            CommentPagerAdapter2 fVar = this.f24569c;
            if (fVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
            }
            fVar.mo34868c();
            if (this.f24577k.mo35337o()) {
                mo34789b();
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        VerticalViewPager verticalViewPager = this.f24567a;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager.getLocationOnScreen(iArr);
        int i2 = iArr[1];
        VerticalViewPager verticalViewPager2 = this.f24567a;
        if (verticalViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        int height = (i2 + verticalViewPager2.getHeight()) - i;
        StringBuilder sb = new StringBuilder();
        sb.append("calculatePadding diff = ");
        sb.append(height);
        sb.append("  viewPager.location[1] = ");
        sb.append(iArr[1]);
        sb.append(" viewPager.height = ");
        VerticalViewPager verticalViewPager3 = this.f24567a;
        if (verticalViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        sb.append(verticalViewPager3.getHeight());
        sb.append(" inputCommentTop = ");
        sb.append(i);
        sb.append(' ');
        C13479a.m54764b("CardComment", sb.toString());
        if (height >= 0 && recyclerView != null) {
            recyclerView.setPadding(0, 0, 0, height);
        }
        m37884d(true);
    }

    @Override // com.bytedance.ee.bear.middleground.comment.card.ICardComment
    /* renamed from: a */
    public void mo34738a(String str, Integer num) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        AnimatorUtils.m37824b(true);
        m37890k();
        if (!this.f24577k.mo35337o() && this.f24577k.mo35338p()) {
            Window window = this.f24577k.mo35279a().getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "config.activity.window");
            View decorView = window.getDecorView();
            Intrinsics.checkExpressionValueIsNotNull(decorView, "config.activity.window.decorView");
            if ((decorView.getSystemUiVisibility() & 1024) == 1024) {
                Window window2 = this.f24577k.mo35279a().getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window2, "config.activity.window");
                C11789c.m48870b(this.f24577k.mo35279a(), window2.getDecorView().getSystemUiVisibility() & -1025 & -257);
                this.f24563A = true;
            }
            C11789c.m48865a(this.f24577k.mo35279a(), this.f24577k.mo35279a().getResources().getColor(R.color.bg_mask), this.f24584s);
        }
        CardIndicator cardIndicator = this.f24568b;
        if (cardIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerIndicator");
        }
        cardIndicator.setVisibility(0);
        m37884d(false);
        this.f24578l.mo34359z().add(this.f24589x);
        this.f24578l.mo34356w().add(this.f24591z);
        m37888i();
        CardDataViewModel dVar = this.f24570d;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar.mo34823b(str);
        CommentPagerAdapter2 fVar = this.f24569c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
        }
        fVar.mo34866b(true);
        CardDataViewModel dVar2 = this.f24570d;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c = dVar2.mo34825c();
        if (c != null) {
            c.mo5922a(this.f24577k.mo35279a());
        }
        CardDataViewModel dVar3 = this.f24570d;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        C1177w<List<CommentBean>> c2 = dVar3.mo34825c();
        if (c2 != null) {
            c2.mo5923a(this.f24577k.mo35279a(), new C9165t(this));
        }
        C13479a.m54764b("CardComment", "show card comment");
        this.f24577k.mo35325e().mo35303a("view_docs_message_sub_page", null, "", "", true);
        CardDataViewModel dVar4 = this.f24570d;
        if (dVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        dVar4.mo34817a(num);
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            View view2 = this.f24582q;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            viewGroup.removeView(view2);
        }
        this.f24577k.mo35327f().addOnLayoutChangeListener(this.f24590y);
        FrameLayout f = this.f24577k.mo35327f();
        View view3 = this.f24582q;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        f.addView(view3);
        AbstractC7665c g = this.f24578l.mo34334g();
        if (g != null) {
            g.mo30121a(this.f24565C);
        }
    }

    /* renamed from: a */
    public final void mo34788a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        String str2;
        boolean z;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        this.f24574h = str2;
        this.f24575i = list;
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (list != null && !list.isEmpty())) {
            this.f24585t.setEnabled(true);
            this.f24571e.setRawString(Intrinsics.stringPlus(str, m37880a(list)));
            return;
        }
        this.f24585t.setEnabled(false);
        this.f24571e.setRawString("");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "content", "", "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "bySend", "", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$f */
    static final class C9147f extends Lambda implements Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> {
        final /* synthetic */ CardComment2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9147f(CardComment2 cVar) {
            super(4);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function4
        public /* synthetic */ Unit invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, Boolean bool, String str2) {
            invoke(str, list, bool.booleanValue(), str2);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            if (z) {
                this.this$0.mo34788a("", (List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>) null);
            } else {
                this.this$0.mo34788a(str, list);
            }
            CardComment2.m37879a(this.this$0).mo34868c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CardComment2(Config fVar, ICommentListeners fVar2, DataControl cVar, ICommentFunction eVar, Function1<? super CommentInputRequest, Unit> function1, Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        Intrinsics.checkParameterIsNotNull(function1, "relpy");
        Intrinsics.checkParameterIsNotNull(function0, "interceptClickEmpty");
        this.f24577k = fVar;
        this.f24578l = fVar2;
        this.f24579m = cVar;
        this.f24580n = eVar;
        this.f24566D = function1;
        this.f24581o = function0;
        this.f24573g = new InputViewModel(fVar, cVar);
        View inflate = LayoutInflater.from(fVar.mo35279a()).inflate(R.layout.comment_card_layout2, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(conf…mment_card_layout2, null)");
        this.f24582q = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById = inflate.findViewById(R.id.comment_indicator);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.comment_indicator)");
        this.f24568b = (CardIndicator) findViewById;
        View view = this.f24582q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById2 = view.findViewById(R.id.doc_comment_viewpager);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.doc_comment_viewpager)");
        VerticalViewPager verticalViewPager = (VerticalViewPager) findViewById2;
        this.f24567a = verticalViewPager;
        if (verticalViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager.setOrientation(1);
        VerticalViewPager verticalViewPager2 = this.f24567a;
        if (verticalViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        verticalViewPager2.setOffscreenPageLimit(f24561F);
        View view2 = this.f24582q;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById3 = view2.findViewById(R.id.doc_publish_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.doc_publish_btn)");
        this.f24585t = (ImageView) findViewById3;
        View view3 = this.f24582q;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById4 = view3.findViewById(R.id.doc_comment_input);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.doc_comment_input)");
        CommentTextView commentTextView = (CommentTextView) findViewById4;
        this.f24571e = commentTextView;
        RichTextInjector.m38468a(commentTextView, (String) null, (AbstractC10460a.AbstractC10461a) null);
        if (fVar.mo35349z()) {
            C25649b.m91857a(this.f24571e, LarkFont.BODY0);
        }
        View view4 = this.f24582q;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById5 = view4.findViewById(R.id.input_comment);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.input_comment)");
        this.f24586u = findViewById5;
        m37886g();
        m37887h();
        this.f24565C = new C9143b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "onLayoutChange"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.c$h */
    static final class View$OnLayoutChangeListenerC9151h implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CardComment2 f24598a;

        View$OnLayoutChangeListenerC9151h(CardComment2 cVar) {
            this.f24598a = cVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i4 - i2 != i8 - i6) {
                C13479a.m54764b("CardComment", "onLayoutChangeListener : bottom = " + i4);
                RecyclerView a = CardComment2.m37879a(this.f24598a).mo34854a(this.f24598a.mo34790c());
                CardComment2 cVar = this.f24598a;
                cVar.mo34787a(a, cVar.f24576j);
            }
        }
    }
}
