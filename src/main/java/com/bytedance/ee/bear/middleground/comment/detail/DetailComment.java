package com.bytedance.ee.bear.middleground.comment.detail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.bear.middleground.comment.adapter.CardAdapter;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentFunction;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.input.ICommentInput;
import com.bytedance.ee.bear.middleground.comment.input.InputComment;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13746i;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 @2\u00020\u0001:\u0001@Bé\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012@\b\u0002\u0010\u0013\u001a:\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"J\u0006\u00108\u001a\u00020\u0019J\u0012\u00109\u001a\u00020!2\b\u00105\u001a\u0004\u0018\u00010(H\u0002J\b\u0010:\u001a\u00020\u0019H\u0002J\b\u0010;\u001a\u00020,H\u0002J\u0006\u0010<\u001a\u00020=J\b\u0010>\u001a\u00020\u0019H\u0002J\u0006\u0010?\u001a\u00020\u0019R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0004¢\u0006\u0002\n\u0000RF\u0010\u0013\u001a:\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bX\u0004¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010!X\u0004¢\u0006\u0004\n\u0002\u00104R\u0010\u00105\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/detail/DetailComment;", "", "configComment", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "actionControl", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;", "commentId", "", "commentRecord", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail;", "defaultText", "defaultImageList", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "closeFull", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "editContent", "commentImages", "", "resolve", "Lkotlin/Function0;", "clickLink", "quote", "parentToken", "parentType", "retryType", "", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;Lcom/bytedance/ee/bear/middleground/comment/control/ICommentFunction;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "adapter", "Lcom/bytedance/ee/bear/middleground/comment/adapter/CardAdapter;", "backPress", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "backView", "Landroid/view/View;", "getCommentId", "()Ljava/lang/String;", "createComment", "Lcom/bytedance/ee/bear/middleground/comment/input/ICommentInput;", "dataViewModel", "Lcom/bytedance/ee/bear/middleground/comment/detail/CommentDetailViewModel;", "inputHeight", "keyBoardHeightSP", "recyclerView", "Lcom/ss/android/lark/widget/recyclerview/PointRecoderRecyclerView;", "resolveView", "Ljava/lang/Integer;", "rootView", "selfUid", "titleView", "dismiss", "getRootViewPaddingTop", "initDefaultData", "initInputComment", "isShowing", "", "setListener", "show", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.d.b */
public final class DetailComment {

    /* renamed from: j */
    public static final Companion f24696j = new Companion(null);

    /* renamed from: A */
    private final String f24697A;

    /* renamed from: B */
    private final Integer f24698B;

    /* renamed from: a */
    public View f24699a;

    /* renamed from: b */
    public int f24700b;

    /* renamed from: c */
    public int f24701c;

    /* renamed from: d */
    public final Config f24702d;

    /* renamed from: e */
    public final ICommentListeners f24703e;

    /* renamed from: f */
    public final ICommentFunction f24704f;

    /* renamed from: g */
    public final Function2<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> f24705g;

    /* renamed from: h */
    public final Function0<Unit> f24706h;

    /* renamed from: i */
    public final Function0<Unit> f24707i;

    /* renamed from: k */
    private View f24708k;

    /* renamed from: l */
    private View f24709l;

    /* renamed from: m */
    private View f24710m;

    /* renamed from: n */
    private PointRecoderRecyclerView f24711n;

    /* renamed from: o */
    private ICommentInput f24712o;

    /* renamed from: p */
    private CommentDetailViewModel f24713p;

    /* renamed from: q */
    private CardAdapter f24714q;

    /* renamed from: r */
    private String f24715r;

    /* renamed from: s */
    private final AbstractC7666d f24716s;

    /* renamed from: t */
    private final DataControl f24717t;

    /* renamed from: u */
    private final String f24718u;

    /* renamed from: v */
    private final List<CommentBean.CommentDetail> f24719v;

    /* renamed from: w */
    private final String f24720w;

    /* renamed from: x */
    private final List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> f24721x;

    /* renamed from: y */
    private final String f24722y;

    /* renamed from: z */
    private final String f24723z;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$f */
    public static final class View$OnClickListenerC9197f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC9197f f24726a = new View$OnClickListenerC9197f();

        View$OnClickListenerC9197f() {
        }

        public final void onClick(View view) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/detail/DetailComment$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onBackPressed"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$b */
    static final class C9193b implements AbstractC7666d {

        /* renamed from: a */
        final /* synthetic */ DetailComment f24725a;

        C9193b(DetailComment bVar) {
            this.f24725a = bVar;
        }

        @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
        public final boolean onBackPressed() {
            this.f24725a.mo34892b();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$c */
    public static final class C9194c extends Lambda implements Function0<Unit> {
        final /* synthetic */ DetailComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9194c(DetailComment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo34892b();
            this.this$0.f24707i.invoke();
        }
    }

    /* renamed from: d */
    private final ICommentInput m38021d() {
        Config fVar = this.f24702d;
        ICommentListeners fVar2 = this.f24703e;
        DataControl cVar = this.f24717t;
        CommentDetailViewModel aVar = this.f24713p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        return new InputComment(fVar, fVar2, cVar, null, aVar.mo34884a(this.f24720w, this.f24721x, this.f24722y, this.f24723z, this.f24697A, this.f24698B), new C9195d(this), new C9196e(this), false, 8, null);
    }

    /* renamed from: e */
    private final void m38022e() {
        View view = this.f24708k;
        if (view != null) {
            view.setOnClickListener(View$OnClickListenerC9197f.f24726a);
        }
        View view2 = this.f24709l;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC9198g(this));
        }
        View view3 = this.f24710m;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC9199h(this));
        }
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f24711n;
        if (pointRecoderRecyclerView != null) {
            pointRecoderRecyclerView.setTouchViewListener(new C9200i(this));
        }
    }

    /* renamed from: a */
    public final void mo34891a() {
        ICommentListeners fVar = this.f24703e;
        ViewParent viewParent = null;
        if (!(fVar instanceof Comment)) {
            fVar = null;
        }
        Comment aVar = (Comment) fVar;
        if (aVar != null) {
            aVar.mo34344l();
        }
        View view = this.f24699a;
        if (view != null) {
            viewParent = view.getParent();
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(this.f24699a);
        }
        this.f24702d.mo35327f().addView(this.f24699a);
        ICommentInput aVar2 = this.f24712o;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createComment");
        }
        ICommentInput.C9239a.m38354a(aVar2, false, false, false, 6, null);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24702d.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30121a(this.f24716s);
        }
    }

    /* renamed from: b */
    public final void mo34892b() {
        ViewParent viewParent;
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(this.f24702d.mo35279a(), AbstractC7665c.class);
        if (cVar != null) {
            cVar.mo30122b(this.f24716s);
        }
        this.f24704f.mo34660k();
        this.f24703e.mo34287K().invoke(this.f24718u);
        CommentDetailViewModel aVar = this.f24713p;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        aVar.mo16330a();
        View view = this.f24699a;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (!(viewParent instanceof ViewGroup)) {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView(this.f24699a);
        }
        ICommentInput aVar2 = this.f24712o;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createComment");
        }
        if (aVar2.mo35374b()) {
            ICommentInput aVar3 = this.f24712o;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createComment");
            }
            ICommentInput.C9239a.m38353a(aVar3, false, 1, null);
        }
    }

    /* renamed from: c */
    private final void m38020c() {
        CommentDetailViewModel aVar = new CommentDetailViewModel();
        this.f24713p = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        aVar.mo34885a(this.f24702d, this.f24717t, this.f24718u, this.f24719v);
        CommentDetailViewModel aVar2 = this.f24713p;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        if (aVar2.mo34888d()) {
            CommentDetailViewModel aVar3 = this.f24713p;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
            }
            aVar3.mo34886b();
        }
        this.f24712o = m38021d();
        CommentDetailViewModel aVar4 = this.f24713p;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        if (aVar4.mo34888d()) {
            View view = this.f24710m;
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (this.f24702d.mo35335m().mo17185c()) {
            View view2 = this.f24710m;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View view3 = this.f24710m;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        }
        Config fVar = this.f24702d;
        String c = C4484g.m18494b().mo17252c();
        Intrinsics.checkExpressionValueIsNotNull(c, "SdkLocaleServiceWrapper.…tance().provideLanguage()");
        String c2 = C9185d.m37997a().mo34730c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "CommentServiceImpl.getCommentService().findUid()");
        ICommentListeners fVar2 = this.f24703e;
        ICommentFunction eVar = this.f24704f;
        CommentDetailViewModel aVar5 = this.f24713p;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
        }
        CardAdapter cardAdapter = new CardAdapter(fVar, c, c2, fVar2, eVar, aVar5.mo34888d(), new C9194c(this));
        this.f24714q = cardAdapter;
        PointRecoderRecyclerView pointRecoderRecyclerView = this.f24711n;
        if (pointRecoderRecyclerView != null) {
            pointRecoderRecyclerView.setAdapter(cardAdapter);
        }
        PointRecoderRecyclerView pointRecoderRecyclerView2 = this.f24711n;
        if (pointRecoderRecyclerView2 != null) {
            pointRecoderRecyclerView2.setLayoutManager(new LinearLayoutManager(this.f24702d.mo35279a()));
        }
        CardAdapter cardAdapter2 = this.f24714q;
        if (cardAdapter2 != null) {
            CommentDetailViewModel aVar6 = this.f24713p;
            if (aVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dataViewModel");
            }
            cardAdapter2.setData(aVar6.mo34889e());
        }
        CardAdapter cardAdapter3 = this.f24714q;
        if (cardAdapter3 != null) {
            cardAdapter3.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$g */
    public static final class View$OnClickListenerC9198g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DetailComment f24727a;

        View$OnClickListenerC9198g(DetailComment bVar) {
            this.f24727a = bVar;
        }

        public final void onClick(View view) {
            this.f24727a.mo34892b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$e */
    public static final class C9196e extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ DetailComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9196e(DetailComment bVar) {
            super(1);
            this.this$0 = bVar;
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
            this.this$0.f24701c = i;
            C13479a.m54764b("DetailComment", "inputHeight: " + i);
            if (i >= ((int) this.this$0.f24702d.mo35279a().getResources().getDimension(R.dimen.record_panel_height))) {
                i2 = 0;
            } else {
                i2 = this.this$0.f24700b;
            }
            View view = this.this$0.f24699a;
            if (view != null) {
                DetailComment bVar = this.this$0;
                view.setPadding(0, bVar.mo34890a(bVar.f24699a), 0, i2 + i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$h */
    public static final class View$OnClickListenerC9199h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DetailComment f24728a;

        View$OnClickListenerC9199h(DetailComment bVar) {
            this.f24728a = bVar;
        }

        public final void onClick(View view) {
            this.f24728a.f24703e.mo34358y().invoke();
            this.f24728a.f24706h.invoke();
            this.f24728a.mo34892b();
        }
    }

    /* renamed from: a */
    public final int mo34890a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == 0) {
            return C13746i.m55722a(view.getContext());
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "x", "", "y", "onTouchiew"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$i */
    public static final class C9200i implements PointRecoderRecyclerView.AbstractC58964a {

        /* renamed from: a */
        final /* synthetic */ DetailComment f24729a;

        C9200i(DetailComment bVar) {
            this.f24729a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.PointRecoderRecyclerView.AbstractC58964a
        public final void onTouchiew(float f, float f2) {
            this.f24729a.f24704f.mo34629a(f2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "content", "", "images", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "bySend", "", "<anonymous parameter 3>", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.d.b$d */
    public static final class C9195d extends Lambda implements Function4<String, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Boolean, String, Unit> {
        final /* synthetic */ DetailComment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9195d(DetailComment bVar) {
            super(4);
            this.this$0 = bVar;
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
            this.this$0.f24705g.invoke(str, list);
            this.this$0.mo34892b();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity> */
    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: kotlin.jvm.functions.k<? super java.lang.String, ? super java.util.List<? extends com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean$CommentDetail$ExtraEntity$CommentImageEntity>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public DetailComment(Config fVar, ICommentListeners fVar2, DataControl cVar, ICommentFunction eVar, String str, List<CommentBean.CommentDetail> list, String str2, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2, Function2<? super String, ? super List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity>, Unit> kVar, Function0<Unit> function0, Function0<Unit> function02, String str3, String str4, String str5, Integer num) {
        View view;
        View view2;
        View view3;
        Intrinsics.checkParameterIsNotNull(fVar, "configComment");
        Intrinsics.checkParameterIsNotNull(fVar2, "commentListeners");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        Intrinsics.checkParameterIsNotNull(eVar, "actionControl");
        Intrinsics.checkParameterIsNotNull(str, "commentId");
        Intrinsics.checkParameterIsNotNull(list, "commentRecord");
        Intrinsics.checkParameterIsNotNull(str2, "defaultText");
        Intrinsics.checkParameterIsNotNull(kVar, "closeFull");
        Intrinsics.checkParameterIsNotNull(function0, "resolve");
        Intrinsics.checkParameterIsNotNull(function02, "clickLink");
        this.f24702d = fVar;
        this.f24703e = fVar2;
        this.f24717t = cVar;
        this.f24704f = eVar;
        this.f24718u = str;
        this.f24719v = list;
        this.f24720w = str2;
        this.f24721x = list2;
        this.f24705g = kVar;
        this.f24706h = function0;
        this.f24707i = function02;
        this.f24722y = str3;
        this.f24723z = str4;
        this.f24697A = str5;
        this.f24698B = num;
        PointRecoderRecyclerView pointRecoderRecyclerView = null;
        this.f24699a = LayoutInflater.from(fVar.mo35279a()).inflate(R.layout.comment_detail_layout, (ViewGroup) null);
        this.f24700b = fVar.mo35336n().mo39936j();
        C13479a.m54764b("DetailComment", "keyBoard height: " + this.f24700b);
        View view4 = this.f24699a;
        if (view4 != null) {
            view4.post(new Runnable(this) {
                /* class com.bytedance.ee.bear.middleground.comment.detail.DetailComment.RunnableC91924 */

                /* renamed from: a */
                final /* synthetic */ DetailComment f24724a;

                {
                    this.f24724a = r1;
                }

                public final void run() {
                    View view = this.f24724a.f24699a;
                    if (view != null) {
                        DetailComment bVar = this.f24724a;
                        view.setPadding(0, bVar.mo34890a(bVar.f24699a), 0, this.f24724a.f24700b);
                    }
                }
            });
        }
        View view5 = this.f24699a;
        if (view5 != null) {
            view = view5.findViewById(R.id.img_down_arrow);
        } else {
            view = null;
        }
        this.f24709l = view;
        View view6 = this.f24699a;
        if (view6 != null) {
            view2 = view6.findViewById(R.id.rl_title);
        } else {
            view2 = null;
        }
        this.f24708k = view2;
        View view7 = this.f24699a;
        if (view7 != null) {
            view3 = view7.findViewById(R.id.tv_opt_comment);
        } else {
            view3 = null;
        }
        this.f24710m = view3;
        View view8 = this.f24699a;
        this.f24711n = view8 != null ? (PointRecoderRecyclerView) view8.findViewById(R.id.comment_list) : pointRecoderRecyclerView;
        String c = C9185d.m37997a().mo34730c();
        Intrinsics.checkExpressionValueIsNotNull(c, "CommentServiceImpl.getCommentService().findUid()");
        this.f24715r = c;
        m38020c();
        m38022e();
        this.f24716s = new C9193b(this);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DetailComment(com.bytedance.ee.bear.middleground.comment.uitls.Config r19, com.bytedance.ee.bear.middleground.comment.control.ICommentListeners r20, com.bytedance.ee.bear.middleground.comment.control.DataControl r21, com.bytedance.ee.bear.middleground.comment.control.ICommentFunction r22, java.lang.String r23, java.util.List r24, java.lang.String r25, java.util.List r26, kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.Integer r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.detail.DetailComment.<init>(com.bytedance.ee.bear.middleground.comment.g.f, com.bytedance.ee.bear.middleground.comment.b.f, com.bytedance.ee.bear.middleground.comment.b.c, com.bytedance.ee.bear.middleground.comment.b.e, java.lang.String, java.util.List, java.lang.String, java.util.List, kotlin.jvm.functions.k, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
