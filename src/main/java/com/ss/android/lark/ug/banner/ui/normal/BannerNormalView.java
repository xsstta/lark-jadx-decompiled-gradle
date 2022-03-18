package com.ss.android.lark.ug.banner.ui.normal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.ug.banner.ui.BannerListener;
import com.ss.android.lark.ug.banner.ui.ext.StyleHelper;
import com.ss.android.lark.ug.banner.ui.p2858a.C57379a;
import com.ss.android.lark.ug.banner.ui.view.BaseBannerView;
import com.ss.android.lark.ug.banner.ui.view.CloseIcon;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 @2\u00020\u0001:\u0003?@AB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\bJ\u0010\u0010!\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0005J\u0010\u0010#\u001a\u00020\u00192\b\b\u0001\u0010$\u001a\u00020\u0005J\u0010\u0010#\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\bJ\u0010\u0010&\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0005J\u0010\u0010'\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*J\u001a\u0010+\u001a\u00020\u00192\b\b\u0001\u0010,\u001a\u00020\u00052\b\b\u0001\u0010-\u001a\u00020\u0005J\u0010\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010\bJ\u0010\u00100\u001a\u00020\u00192\b\b\u0001\u0010$\u001a\u00020\u0005J\u0010\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010\bJ\u0010\u00102\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0005J\u0010\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u000105J\u0010\u00103\u001a\u00020\u00192\b\u00106\u001a\u0004\u0018\u000107J\u0010\u00103\u001a\u00020\u00192\b\b\u0001\u00108\u001a\u00020\u0005J\u0010\u00103\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010\bJ\u0010\u00109\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010\u0014J\u0010\u0010;\u001a\u00020\u00192\b\b\u0001\u0010$\u001a\u00020\u0005J\u0010\u0010;\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010\bJ\u0010\u0010=\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020\u0005J\b\u0010>\u001a\u00020\u0019H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView;", "Lcom/ss/android/lark/ug/banner/ui/view/BaseBannerView;", "context", "Landroid/content/Context;", "style", "", "(Landroid/content/Context;I)V", "btnLink", "", "btnTv", "Landroid/widget/TextView;", "closeIc", "Lcom/ss/android/lark/ug/banner/ui/view/CloseIcon;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerBgImg", "Landroid/widget/ImageView;", "contentTv", "iconIv", "mListener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "getStyle", "()I", "titleTv", "adjustLineCounts", "", "inflateLayout", "Landroid/view/ViewGroup;", "init", "initViews", "makeToMatchParent", "setBtnLink", "link", "setButtonBg", "color", "setButtonText", "stringResId", "text", "setButtonTextColor", "setCloseIconColor", "setCloseIconVisible", "visible", "", "setContainerBg", "bgColor", "borderColor", "setContainerBgImage", "imgUrl", "setContent", "content", "setContentColor", "setIcon", "bitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableResId", "setListener", "listener", "setTitle", "title", "setTitleColor", "setupListeners", "Builder", "Companion", "LayoutStyle", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BannerNormalView extends BaseBannerView {

    /* renamed from: f */
    public static final Companion f141251f = new Companion(null);

    /* renamed from: a */
    public ConstraintLayout f141252a;

    /* renamed from: b */
    public ImageView f141253b;

    /* renamed from: c */
    public ImageView f141254c;

    /* renamed from: d */
    public BannerListener f141255d;

    /* renamed from: e */
    public String f141256e;

    /* renamed from: g */
    private TextView f141257g;

    /* renamed from: h */
    private TextView f141258h;

    /* renamed from: i */
    private TextView f141259i;

    /* renamed from: j */
    private CloseIcon f141260j;

    /* renamed from: k */
    private final int f141261k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView$LayoutStyle;", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LayoutStyle {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView$Companion;", "", "()V", "BANNER_BORDER_SIZE", "", "BANNER_CORNER_SIZE", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getStyle() {
        return this.f141261k;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/ug/banner/ui/normal/BannerNormalView$setContainerBgImage$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$e */
    public static final class RunnableC57382e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IRequestCreator f141280a;

        /* renamed from: b */
        final /* synthetic */ BannerNormalView f141281b;

        RunnableC57382e(IRequestCreator iRequestCreator, BannerNormalView bannerNormalView) {
            this.f141280a = iRequestCreator;
            this.f141281b = bannerNormalView;
        }

        public final void run() {
            this.f141280a.into(this.f141281b.f141253b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/ug/banner/ui/normal/BannerNormalView$setIcon$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$f */
    public static final class RunnableC57383f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IRequestCreator f141282a;

        /* renamed from: b */
        final /* synthetic */ BannerNormalView f141283b;

        RunnableC57383f(IRequestCreator iRequestCreator, BannerNormalView bannerNormalView) {
            this.f141282a = iRequestCreator;
            this.f141283b = bannerNormalView;
        }

        public final void run() {
            this.f141282a.into(this.f141283b.f141254c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/ug/banner/ui/normal/BannerNormalView$initViews$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC57381d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ BannerNormalView f141279a;

        public void onGlobalLayout() {
            this.f141279a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f141279a.mo194571a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC57381d(BannerNormalView bannerNormalView) {
            this.f141279a = bannerNormalView;
        }
    }

    /* renamed from: b */
    private final void m222432b() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        m222431a(context, this);
        m222433c();
        m222434d();
    }

    /* renamed from: d */
    private final void m222434d() {
        ConstraintLayout constraintLayout = this.f141252a;
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View$OnClickListenerC57384g(this));
        }
        CloseIcon closeIcon = this.f141260j;
        if (closeIcon != null) {
            closeIcon.setOnClickListener(new View$OnClickListenerC57385h(this));
        }
    }

    /* renamed from: a */
    public final void mo194571a() {
        TextView textView;
        TextView textView2 = this.f141257g;
        if (textView2 != null && (textView = this.f141258h) != null) {
            int lineCount = 4 - textView2.getLineCount();
            if (lineCount <= 0) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setMaxLines(lineCount);
        }
    }

    /* renamed from: c */
    private final void m222433c() {
        this.f141252a = (ConstraintLayout) findViewById(R.id.container);
        this.f141253b = (ImageView) findViewById(R.id.container_bg_img);
        this.f141254c = (ImageView) findViewById(R.id.icon);
        this.f141257g = (TextView) findViewById(R.id.title);
        this.f141258h = (TextView) findViewById(R.id.content);
        this.f141259i = (TextView) findViewById(R.id.button);
        this.f141260j = (CloseIcon) findViewById(R.id.close);
        setButtonBg(getResources().getColor(R.color.lkui_B500));
        mo194572a(getResources().getColor(R.color.lkui_B100), 0);
        ConstraintLayout constraintLayout = this.f141252a;
        if (constraintLayout != null) {
            constraintLayout.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC57380c(this));
        }
        if (this.f141261k > 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC57381d(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\u0004J\u0015\u0010\u001d\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010!\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0007J\u0010\u0010$\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020\u0004J\u0010\u0010&\u001a\u00020\u00002\b\u0010'\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u0015\u0010)\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u0015\u0010+\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0015\u0010,\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007J\u0015\u0010.\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007J\u0015\u00100\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u001eR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005¨\u00061"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView$Builder;", "", "()V", "backgroundColor", "", "Ljava/lang/Integer;", "backgroundPic", "", "bannerCloseable", "", "bannerCloseableColor", "bannerIcon", "bannerIconResId", "bannerListener", "Lcom/ss/android/lark/ug/banner/ui/BannerListener;", "buttonLink", "ctaBackgroundColor", "ctaTitle", "ctaTitleColor", "frameColor", "subTitle", "subTitleColor", "title", "titleColor", "build", "Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView;", "context", "Landroid/content/Context;", "style", "setBackgroundColor", "(Ljava/lang/Integer;)Lcom/ss/android/lark/ug/banner/ui/normal/BannerNormalView$Builder;", "setBackgroundPic", "setBannerCloseable", "setBannerCloseableColor", "setBannerIcon", "icon", "setBannerIconResId", "resId", "setBannerListener", "listener", "setButtonLink", "setCtaBackgroundColor", "setCtaTitle", "setCtaTitleColor", "setFrameColor", "setSubTitle", "setSubTitleColor", "setTitle", "setTitleColor", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$a */
    public static final class Builder {

        /* renamed from: a */
        private Integer f141262a;

        /* renamed from: b */
        private String f141263b;

        /* renamed from: c */
        private int f141264c;

        /* renamed from: d */
        private String f141265d;

        /* renamed from: e */
        private String f141266e;

        /* renamed from: f */
        private Integer f141267f;

        /* renamed from: g */
        private String f141268g;

        /* renamed from: h */
        private Integer f141269h;

        /* renamed from: i */
        private String f141270i;

        /* renamed from: j */
        private Integer f141271j;

        /* renamed from: k */
        private Integer f141272k;

        /* renamed from: l */
        private boolean f141273l;

        /* renamed from: m */
        private Integer f141274m;

        /* renamed from: n */
        private String f141275n;

        /* renamed from: o */
        private Integer f141276o;

        /* renamed from: p */
        private BannerListener f141277p;

        /* renamed from: a */
        public final Builder mo194593a(BannerListener aVar) {
            this.f141277p = aVar;
            return this;
        }

        /* renamed from: b */
        public final Builder mo194598b(Integer num) {
            this.f141267f = num;
            return this;
        }

        /* renamed from: c */
        public final Builder mo194600c(Integer num) {
            this.f141269h = num;
            return this;
        }

        /* renamed from: d */
        public final Builder mo194602d(Integer num) {
            this.f141271j = num;
            return this;
        }

        /* renamed from: e */
        public final Builder mo194604e(Integer num) {
            this.f141272k = num;
            return this;
        }

        /* renamed from: f */
        public final Builder mo194606f(Integer num) {
            this.f141274m = num;
            return this;
        }

        /* renamed from: g */
        public final Builder mo194608g(Integer num) {
            this.f141276o = num;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194594a(Integer num) {
            this.f141262a = num;
            return this;
        }

        /* renamed from: b */
        public final Builder mo194599b(String str) {
            this.f141263b = str;
            return this;
        }

        /* renamed from: c */
        public final Builder mo194601c(String str) {
            this.f141266e = str;
            return this;
        }

        /* renamed from: d */
        public final Builder mo194603d(String str) {
            this.f141268g = str;
            return this;
        }

        /* renamed from: e */
        public final Builder mo194605e(String str) {
            this.f141270i = str;
            return this;
        }

        /* renamed from: f */
        public final Builder mo194607f(String str) {
            this.f141275n = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194595a(String str) {
            this.f141265d = str;
            return this;
        }

        /* renamed from: a */
        public final Builder mo194596a(boolean z) {
            this.f141273l = z;
            return this;
        }

        /* renamed from: a */
        public final BannerNormalView mo194597a(Context context, @LayoutStyle int i) {
            int i2;
            int i3;
            Intrinsics.checkParameterIsNotNull(context, "context");
            BannerNormalView bannerNormalView = new BannerNormalView(context, i);
            int i4 = 0;
            if (!TextUtils.isEmpty(this.f141265d)) {
                bannerNormalView.setContainerBgImage(this.f141265d);
                Integer num = this.f141276o;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                bannerNormalView.mo194572a(0, i3);
            } else {
                Integer num2 = this.f141262a;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                Integer num3 = this.f141276o;
                if (num3 != null) {
                    i4 = num3.intValue();
                }
                bannerNormalView.mo194572a(i2, i4);
            }
            if (!TextUtils.isEmpty(this.f141263b)) {
                bannerNormalView.setIcon(this.f141263b);
            } else {
                bannerNormalView.setIcon(this.f141264c);
            }
            bannerNormalView.setTitle(this.f141266e);
            Integer num4 = this.f141267f;
            if (num4 != null) {
                bannerNormalView.setTitleColor(num4.intValue());
            }
            bannerNormalView.setContent(this.f141268g);
            Integer num5 = this.f141269h;
            if (num5 != null) {
                bannerNormalView.setContentColor(num5.intValue());
            }
            bannerNormalView.setButtonText(this.f141270i);
            Integer num6 = this.f141271j;
            if (num6 != null) {
                bannerNormalView.setButtonTextColor(num6.intValue());
            }
            Integer num7 = this.f141272k;
            if (num7 != null) {
                bannerNormalView.setButtonBg(num7.intValue());
            }
            bannerNormalView.setCloseIconVisible(this.f141273l);
            Integer num8 = this.f141274m;
            if (num8 != null) {
                bannerNormalView.setCloseIconColor(num8.intValue());
            }
            bannerNormalView.setBtnLink(this.f141275n);
            bannerNormalView.setListener(this.f141277p);
            return bannerNormalView;
        }
    }

    public final void setBtnLink(String str) {
        this.f141256e = str;
    }

    public final void setListener(BannerListener aVar) {
        this.f141255d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/banner/ui/normal/BannerNormalView$initViews$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$c */
    public static final class View$OnAttachStateChangeListenerC57380c implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ BannerNormalView f141278a;

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnAttachStateChangeListenerC57380c(BannerNormalView bannerNormalView) {
            this.f141278a = bannerNormalView;
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            BannerListener aVar = this.f141278a.f141255d;
            if (aVar != null) {
                aVar.mo194550a((BaseBannerView) this.f141278a);
            }
            ConstraintLayout constraintLayout = this.f141278a.f141252a;
            if (constraintLayout != null) {
                constraintLayout.removeOnAttachStateChangeListener(this);
            }
        }
    }

    public final void setButtonText(int i) {
        TextView textView = this.f141259i;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setButtonTextColor(int i) {
        TextView textView = this.f141259i;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setCloseIconColor(int i) {
        CloseIcon closeIcon = this.f141260j;
        if (closeIcon != null) {
            closeIcon.setIconColor(i);
        }
    }

    public final void setContent(int i) {
        TextView textView = this.f141258h;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setContentColor(int i) {
        TextView textView = this.f141258h;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public final void setIcon(int i) {
        ImageView imageView = this.f141254c;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    public final void setTitle(int i) {
        TextView textView = this.f141257g;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void setTitleColor(int i) {
        TextView textView = this.f141257g;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$g */
    public static final class View$OnClickListenerC57384g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerNormalView f141284a;

        View$OnClickListenerC57384g(BannerNormalView bannerNormalView) {
            this.f141284a = bannerNormalView;
        }

        public final void onClick(View view) {
            BannerListener aVar = this.f141284a.f141255d;
            if (aVar != null) {
                aVar.mo194549a(view, this.f141284a.f141256e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.normal.BannerNormalView$h */
    public static final class View$OnClickListenerC57385h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BannerNormalView f141285a;

        View$OnClickListenerC57385h(BannerNormalView bannerNormalView) {
            this.f141285a = bannerNormalView;
        }

        public final void onClick(View view) {
            BannerListener aVar = this.f141285a.f141255d;
            if (aVar != null) {
                aVar.mo194548a(view);
            }
        }
    }

    public final void setButtonText(String str) {
        TextView textView = this.f141259i;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setCloseIconVisible(boolean z) {
        int i;
        CloseIcon closeIcon = this.f141260j;
        if (closeIcon != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            closeIcon.setVisibility(i);
        }
    }

    public final void setContent(String str) {
        TextView textView = this.f141258h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setIcon(Bitmap bitmap) {
        ImageView imageView = this.f141254c;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void setTitle(String str) {
        TextView textView = this.f141257g;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setIcon(Drawable drawable) {
        ImageView imageView = this.f141254c;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void setButtonBg(int i) {
        TextView textView = this.f141259i;
        if (textView != null) {
            StyleHelper.Companion aVar = StyleHelper.f141250a;
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            textView.setBackground(aVar.mo194570c(context, (float) UIUtils.dp2px(getContext(), 6.0f), i, 0, 0));
        }
    }

    public final void setContainerBgImage(String str) {
        if (!TextUtils.isEmpty(str)) {
            UICallbackExecutor.execute(new RunnableC57382e(ImageLoader.with(getContext()).load(str).asDrawable(), this));
        }
    }

    public final void setIcon(String str) {
        if (!TextUtils.isEmpty(str) && this.f141254c != null) {
            UICallbackExecutor.execute(new RunnableC57383f(ImageLoader.with(getContext()).load(str).asDrawable(), this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerNormalView(Context context, @LayoutStyle int i) {
        super(context, null, 2, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f141261k = i;
        m222432b();
    }

    /* renamed from: a */
    private final void m222431a(Context context, ViewGroup viewGroup) {
        int i = this.f141261k;
        if (i == 1) {
            LayoutInflater.from(context).inflate(R.layout.ug_normal_banner, viewGroup);
        } else if (i != 2) {
            LayoutInflater.from(context).inflate(R.layout.ug_normal_banner_0, viewGroup);
        } else {
            LayoutInflater.from(context).inflate(R.layout.ug_normal_banner_2, viewGroup);
        }
    }

    /* renamed from: a */
    public final void mo194572a(int i, int i2) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        int a = C57379a.m222424a(context, i);
        float dp2px = (float) UIUtils.dp2px(getContext(), (float) 8);
        int dp2px2 = UIUtils.dp2px(getContext(), 0.5f);
        StyleHelper.Companion aVar = StyleHelper.f141250a;
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        Drawable a2 = aVar.mo194568a(context2, dp2px, a, dp2px2, i2);
        ConstraintLayout constraintLayout = this.f141252a;
        if (constraintLayout != null) {
            constraintLayout.setBackground(a2);
        }
    }
}
