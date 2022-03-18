package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2513c;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bumptech.glide.request.p096b.AbstractC2529b;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceTagTextView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u000256B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020'H\u0002J\b\u0010(\u001a\u00020'H\u0002J\u0010\u0010)\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010+J\u000e\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020\bJ\u0015\u0010.\u001a\u00020'2\b\u0010/\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u00100J\u0010\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020\"H\u0002J\u0010\u00103\u001a\u00020'2\b\u00104\u001a\u0004\u0018\u00010%R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00067"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "floating_title_bar", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "isDarkCover", "", "()Z", "setDarkCover", "(Z)V", "moreRectF", "Landroid/graphics/RectF;", "getMoreRectF", "()Landroid/graphics/RectF;", "setMoreRectF", "(Landroid/graphics/RectF;)V", "moreView", "Landroid/view/View;", "getMoreView", "()Landroid/view/View;", "setMoreView", "(Landroid/view/View;)V", "searchView", "viewDelegate", "Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$ViewDelegate;", "getViewDelegate", "()Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$ViewDelegate;", "setViewDelegate", "(Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$ViewDelegate;)V", "getBackgroundColor", "", "isGraphDark", "colorValue", "", "initListener", "", "initView", "setCover", "spaceCover", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiDocument$SpaceCover;", "setFloatingTitleBar", "floatingTitleBar", "setScope", "isPublicScope", "(Ljava/lang/Boolean;)V", "setTextIconColor", "colorRes", "setTitle", "title", "Companion", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SpaceCoverView extends RelativeLayout {

    /* renamed from: b */
    public static final Companion f33326b = new Companion(null);

    /* renamed from: a */
    public View f33327a;

    /* renamed from: c */
    private BaseTitleBar f33328c;

    /* renamed from: d */
    private View f33329d;

    /* renamed from: e */
    private boolean f33330e;

    /* renamed from: f */
    private ViewDelegate f33331f;

    /* renamed from: g */
    private RectF f33332g;

    /* renamed from: h */
    private HashMap f33333h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$ViewDelegate;", "", "onMoreClick", "", "onSearchClick", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$b */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo47329a();

        /* renamed from: b */
        void mo47330b();
    }

    /* renamed from: a */
    public View mo47316a(int i) {
        if (this.f33333h == null) {
            this.f33333h = new HashMap();
        }
        View view = (View) this.f33333h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33333h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J2\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J:\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$setCover$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$f */
    public static final class C12421f implements AbstractC2536f<Drawable> {
        /* renamed from: a */
        public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
            Intrinsics.checkParameterIsNotNull(obj, "model");
            Intrinsics.checkParameterIsNotNull(jVar, "target");
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            return false;
        }

        C12421f() {
        }

        @Override // com.bumptech.glide.request.AbstractC2536f
        /* renamed from: a */
        public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(obj, "model");
            Intrinsics.checkParameterIsNotNull(jVar, "target");
            C13479a.m54759a("Wiki_WikiCoverView", "bindImage glide onException", glideException);
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo47317a() {
        return this.f33330e;
    }

    public final RectF getMoreRectF() {
        return this.f33332g;
    }

    public final ViewDelegate getViewDelegate() {
        return this.f33331f;
    }

    public final View getMoreView() {
        View view = this.f33327a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreView");
        }
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$initView$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$e */
    public static final class ViewTreeObserver$OnPreDrawListenerC12420e implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33336a;

        public boolean onPreDraw() {
            SpaceCoverView spaceCoverView = this.f33336a;
            spaceCoverView.setMoreRectF(C13749l.m55759d(spaceCoverView.getMoreView()));
            this.f33336a.getMoreView().getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC12420e(SpaceCoverView spaceCoverView) {
            this.f33336a = spaceCoverView;
        }
    }

    /* renamed from: c */
    private final void m51666c() {
        View view = this.f33329d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
        }
        view.setOnClickListener(new View$OnClickListenerC12418c(this));
        View view2 = this.f33327a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreView");
        }
        view2.setOnClickListener(new View$OnClickListenerC12419d(this));
    }

    /* renamed from: b */
    private final void m51665b() {
        ((BaseTitleBar) mo47316a(R.id.wiki_fixed_title_bar)).setBackgroundColor(0);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((SpaceTagTextView) mo47316a(R.id.tv_scope)).mo45486a(new UDTagsDrawable.TagModel.Builder(context).mo91418a(getContext().getText(R.string.Doc_Wiki_Home_Public).toString()).mo91417a(UDTagsDrawable.TagColorSet.DARK_BLUE).mo91427g());
        View a = ((BaseTitleBar) mo47316a(R.id.wiki_fixed_title_bar)).mo45070a(new BaseTitleBar.C11803d((int) R.drawable.ud_icon_search_outlined));
        Intrinsics.checkExpressionValueIsNotNull(a, "wiki_fixed_title_bar.add…ud_icon_search_outlined))");
        this.f33329d = a;
        View a2 = ((BaseTitleBar) mo47316a(R.id.wiki_fixed_title_bar)).mo45070a(new BaseTitleBar.C11803d((int) R.drawable.ud_icon_more_outlined));
        Intrinsics.checkExpressionValueIsNotNull(a2, "wiki_fixed_title_bar.add…e.ud_icon_more_outlined))");
        this.f33327a = a2;
        if (a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreView");
        }
        a2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC12420e(this));
    }

    public final void setDarkCover(boolean z) {
        this.f33330e = z;
    }

    public final void setMoreRectF(RectF rectF) {
        this.f33332g = rectF;
    }

    public final void setViewDelegate(ViewDelegate bVar) {
        this.f33331f = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J$\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0000\u0012\u0004\u0018\u00010\u0002\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/wikiv2/wikitreev2/main/SpaceCoverView$setCover$2", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadCleared", "", "placeholder", "onLoadFailed", "errorDrawable", "onLoadStarted", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$g */
    public static final class C12422g extends AbstractC2513c<Drawable> {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33337a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12422g(SpaceCoverView spaceCoverView) {
            this.f33337a = spaceCoverView;
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public void mo11036a(Drawable drawable) {
            if (drawable != null) {
                ((ImageView) this.f33337a.mo47316a(R.id.iv_wiki_cover)).setImageDrawable(drawable);
            }
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: b */
        public void mo10444b(Drawable drawable) {
            if (drawable != null) {
                ((ImageView) this.f33337a.mo47316a(R.id.iv_wiki_cover)).setImageDrawable(drawable);
            }
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2513c, com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: c */
        public void mo11172c(Drawable drawable) {
            if (drawable != null) {
                ((ImageView) this.f33337a.mo47316a(R.id.iv_wiki_cover)).setImageDrawable(drawable);
            }
        }

        @Override // com.bumptech.glide.request.p095a.AbstractC2522j
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10442a(Object obj, AbstractC2529b bVar) {
            mo47335a((Drawable) obj, (AbstractC2529b<? super Drawable>) bVar);
        }

        /* renamed from: a */
        public void mo47335a(Drawable drawable, AbstractC2529b<? super Drawable> bVar) {
            Intrinsics.checkParameterIsNotNull(drawable, "resource");
            ((ImageView) this.f33337a.mo47316a(R.id.iv_wiki_cover)).setImageDrawable(drawable);
        }
    }

    public final void setMoreView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "<set-?>");
        this.f33327a = view;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$c */
    public static final class View$OnClickListenerC12418c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33334a;

        View$OnClickListenerC12418c(SpaceCoverView spaceCoverView) {
            this.f33334a = spaceCoverView;
        }

        public final void onClick(View view) {
            ViewDelegate viewDelegate = this.f33334a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47329a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$d */
    public static final class View$OnClickListenerC12419d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33335a;

        View$OnClickListenerC12419d(SpaceCoverView spaceCoverView) {
            this.f33335a = spaceCoverView;
        }

        public final void onClick(View view) {
            ViewDelegate viewDelegate = this.f33335a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47330b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$h */
    static final class View$OnClickListenerC12423h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33338a;

        View$OnClickListenerC12423h(SpaceCoverView spaceCoverView) {
            this.f33338a = spaceCoverView;
        }

        public final void onClick(View view) {
            ViewDelegate viewDelegate = this.f33338a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47329a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.SpaceCoverView$i */
    static final class View$OnClickListenerC12424i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpaceCoverView f33339a;

        View$OnClickListenerC12424i(SpaceCoverView spaceCoverView) {
            this.f33339a = spaceCoverView;
        }

        public final void onClick(View view) {
            ViewDelegate viewDelegate = this.f33339a.getViewDelegate();
            if (viewDelegate != null) {
                viewDelegate.mo47330b();
            }
        }
    }

    public final void setScope(Boolean bool) {
        int i;
        SpaceTagTextView spaceTagTextView = (SpaceTagTextView) mo47316a(R.id.tv_scope);
        Intrinsics.checkExpressionValueIsNotNull(spaceTagTextView, "tv_scope");
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            i = 0;
        } else {
            i = 8;
        }
        spaceTagTextView.setVisibility(i);
    }

    public final void setTitle(String str) {
        String str2;
        TextView textView = (TextView) mo47316a(R.id.tv_wiki_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tv_wiki_title");
        if (str != null) {
            str2 = str;
        }
        textView.setText(str2);
        BaseTitleBar baseTitleBar = this.f33328c;
        if (baseTitleBar != null) {
            baseTitleBar.setTitle(str);
        }
    }

    public final void setFloatingTitleBar(BaseTitleBar baseTitleBar) {
        View view;
        Intrinsics.checkParameterIsNotNull(baseTitleBar, "floatingTitleBar");
        this.f33328c = baseTitleBar;
        View view2 = null;
        if (baseTitleBar != null) {
            view = baseTitleBar.mo45070a(new BaseTitleBar.C11803d((int) R.drawable.ud_icon_search_outlined));
        } else {
            view = null;
        }
        BaseTitleBar baseTitleBar2 = this.f33328c;
        if (baseTitleBar2 != null) {
            view2 = baseTitleBar2.mo45070a(new BaseTitleBar.C11803d((int) R.drawable.ud_icon_more_outlined));
        }
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC12423h(this));
        }
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC12424i(this));
        }
    }

    private final void setTextIconColor(int i) {
        ((TextView) mo47316a(R.id.tv_wiki_title)).setTextColor(getResources().getColor(i));
        BaseTitleBar baseTitleBar = (BaseTitleBar) mo47316a(R.id.wiki_fixed_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(baseTitleBar, "wiki_fixed_title_bar");
        ImageView leftImage = baseTitleBar.getLeftImage();
        Intrinsics.checkExpressionValueIsNotNull(leftImage, "wiki_fixed_title_bar.leftImage");
        leftImage.getDrawable().setTint(getResources().getColor(i));
        View view = this.f33329d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchView");
        }
        View findViewById = view.findViewById(R.id.widgetTitleMenuImg);
        if (findViewById instanceof ImageView) {
            ((ImageView) findViewById).getDrawable().setTint(getResources().getColor(i));
        }
        View view2 = this.f33327a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moreView");
        }
        View findViewById2 = view2.findViewById(R.id.widgetTitleMenuImg);
        if (findViewById2 instanceof ImageView) {
            ((ImageView) findViewById2).getDrawable().setTint(getResources().getColor(i));
        }
    }

    public final void setCover(WikiDocument.SpaceCover spaceCover) {
        if (spaceCover != null) {
            boolean d = spaceCover.mo21034d();
            this.f33330e = d;
            if (d) {
                setTextIconColor(R.color.static_white);
            } else {
                setTextIconColor(R.color.static_black);
            }
            boolean d2 = spaceCover.mo21034d();
            String e = spaceCover.mo21036e();
            Intrinsics.checkExpressionValueIsNotNull(e, "spaceCover.getColorValue()");
            int a = m51664a(d2, e);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(a);
            if (TextUtils.isEmpty(spaceCover.mo21026a())) {
                C13479a.m54764b("Wiki_WikiCoverView", "bindImage spaceCover.thumbnail is empty");
                ((ImageView) mo47316a(R.id.iv_wiki_cover)).setImageDrawable(gradientDrawable);
                return;
            }
            GradientDrawable gradientDrawable2 = gradientDrawable;
            Intrinsics.checkExpressionValueIsNotNull(((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9141a(this).mo10414a(new C13664a(spaceCover.mo21026a())).mo11125a((Drawable) gradientDrawable2)).mo11140b((Drawable) gradientDrawable2)).mo10392a((AbstractC2536f) new C12421f()).mo10397a((AbstractC2522j) new C12422g(this)), "Glide.with(this)\n       … }\n                    })");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.wiki_tree_cover_view, this);
        m51665b();
        m51666c();
    }

    /* renamed from: a */
    private final int m51664a(boolean z, String str) {
        int i;
        String str2;
        if (z) {
            i = getResources().getColor(R.color.space_kit_n950);
        } else {
            i = getResources().getColor(R.color.static_white);
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (TextUtils.isEmpty(str) || StringsKt.startsWith$default(str, "#", false, 2, (Object) null)) {
                str2 = str;
            } else {
                str2 = '#' + str;
            }
            i = Color.parseColor(str2);
        } catch (Exception e) {
            C13479a.m54758a("Wiki_WikiCoverView", e.toString());
        }
        C13479a.m54764b("Wiki_WikiCoverView", "colorValue:  " + str + "   color:  " + i);
        return i;
    }
}
