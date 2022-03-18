package com.ss.android.lark.browser.impl.translate.mvp.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0002;<B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u0006\u0010(\u001a\u00020&J\u0006\u0010)\u001a\u00020&J\u0006\u0010*\u001a\u00020&J\u0014\u0010+\u001a\u00020\u00122\n\u0010,\u001a\u00020-\"\u00020\nH\u0002J\b\u0010.\u001a\u00020&H\u0002J\n\u0010/\u001a\u0004\u0018\u00010 H\u0016J\b\u00100\u001a\u0004\u0018\u000101J\u0006\u00102\u001a\u00020&J\b\u00103\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020&2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u00105\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u000107J\u0010\u00108\u001a\u00020&2\b\u00106\u001a\u0004\u0018\u000107J\b\u00109\u001a\u00020&H\u0002J\u0006\u0010:\u001a\u00020&R\u000e\u0010\u000e\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006="}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApiProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "animHeight", "closeBtnIV", "Landroid/widget/ImageView;", "hideAnimator", "Landroid/animation/ValueAnimator;", "isHide", "", "listener", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar$WebTranslateListener;", "loadingPB", "Landroid/widget/ProgressBar;", "originLangTV", "Landroid/widget/TextView;", "progressBarMinMargin", "settingBtnIV", "showAnimator", "targetLangTV", "translateHandlerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "getTranslateHandlerApi", "()Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "setTranslateHandlerApi", "(Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;)V", "animHide", "", "animShow", "changToTargetLangSelected", "changeToLoading", "changeToOriginSelected", "createAnimator", "values", "", "findViews", "getHandlerApi", "getSettingBtnView", "Landroid/view/View;", "hide", "initViews", "setListener", "setOriginLangText", "langText", "", "setTargetLangText", "setupListener", "show", "Companion", "WebTranslateListener", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WebTranslateBar extends LinearLayout implements TranslateJSApi.IHandlerApiProvider {

    /* renamed from: c */
    public static final Companion f74786c = new Companion(null);

    /* renamed from: a */
    public int f74787a = -1;

    /* renamed from: b */
    public WebTranslateListener f74788b;

    /* renamed from: d */
    private TextView f74789d;

    /* renamed from: e */
    private TextView f74790e;

    /* renamed from: f */
    private ProgressBar f74791f;

    /* renamed from: g */
    private ImageView f74792g;

    /* renamed from: h */
    private ImageView f74793h;

    /* renamed from: i */
    private ValueAnimator f74794i;

    /* renamed from: j */
    private ValueAnimator f74795j;

    /* renamed from: k */
    private boolean f74796k;

    /* renamed from: l */
    private TranslateJSApi.IHandlerApi f74797l;

    /* renamed from: m */
    private int f74798m = UIHelper.dp2px(25.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar$WebTranslateListener;", "", "onClose", "", "onOpenSetting", "onOriginLangClick", "onTargetLangClick", "isSelected", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$b */
    public interface WebTranslateListener {
        /* renamed from: a */
        void mo108007a();

        /* renamed from: a */
        void mo108008a(boolean z);

        /* renamed from: b */
        void mo108009b();

        /* renamed from: c */
        void mo108010c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar$Companion;", "", "()V", "TAG", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApiProvider
    public TranslateJSApi.IHandlerApi getHandlerApi() {
        return this.f74797l;
    }

    public final TranslateJSApi.IHandlerApi getTranslateHandlerApi() {
        return this.f74797l;
    }

    /* renamed from: d */
    public final void mo108025d() {
        if (getVisibility() == 8) {
            setVisibility(0);
        }
    }

    /* renamed from: e */
    public final void mo108026e() {
        if (getVisibility() == 0) {
            setVisibility(8);
        }
    }

    public final View getSettingBtnView() {
        ImageView imageView = this.f74792g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingBtnIV");
        }
        return imageView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar$initViews$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$d */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC29979d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74800a;

        public void onGlobalLayout() {
            if (this.f74800a.getHeight() > 0) {
                WebTranslateBar webTranslateBar = this.f74800a;
                webTranslateBar.f74787a = webTranslateBar.getHeight();
                this.f74800a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC29979d(WebTranslateBar webTranslateBar) {
            this.f74800a = webTranslateBar;
        }
    }

    /* renamed from: a */
    public final void mo108022a() {
        TextView textView = this.f74789d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originLangTV");
        }
        textView.setSelected(true);
        TextView textView2 = this.f74790e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView2.setSelected(false);
        TextView textView3 = this.f74790e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView3.setVisibility(0);
        ProgressBar progressBar = this.f74791f;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
        }
        progressBar.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo108023b() {
        TextView textView = this.f74789d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originLangTV");
        }
        textView.setSelected(false);
        TextView textView2 = this.f74790e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView2.setSelected(true);
        TextView textView3 = this.f74790e;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView3.setVisibility(0);
        ProgressBar progressBar = this.f74791f;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
        }
        progressBar.setVisibility(8);
    }

    /* renamed from: h */
    private final void m110900h() {
        View.inflate(getContext(), R.layout.web_translate_bar, this);
        this.f74787a = getMeasuredHeight();
        m110901i();
        TextView textView = this.f74790e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView.setVisibility(0);
        ProgressBar progressBar = this.f74791f;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
        }
        progressBar.setVisibility(8);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC29979d(this));
        m110902j();
    }

    /* renamed from: i */
    private final void m110901i() {
        View findViewById = findViewById(R.id.web_translate_bar_origin_language);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "this.findViewById(R.id.w…late_bar_origin_language)");
        this.f74789d = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.web_translate_bar_target_language);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "this.findViewById(R.id.w…late_bar_target_language)");
        this.f74790e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.web_translate_bar_translate_loading);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "this.findViewById(R.id.w…te_bar_translate_loading)");
        this.f74791f = (ProgressBar) findViewById3;
        View findViewById4 = findViewById(R.id.web_translate_bar_setting);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "this.findViewById(R.id.web_translate_bar_setting)");
        this.f74792g = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.web_translate_bar_close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "this.findViewById(R.id.web_translate_bar_close)");
        this.f74793h = (ImageView) findViewById5;
    }

    /* renamed from: j */
    private final void m110902j() {
        setOnClickListener(View$OnClickListenerC29980e.f74801a);
        TextView textView = this.f74789d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originLangTV");
        }
        textView.setOnClickListener(new View$OnClickListenerC29981f(this));
        TextView textView2 = this.f74790e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView2.setOnClickListener(new View$OnClickListenerC29982g(this));
        ImageView imageView = this.f74792g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settingBtnIV");
        }
        imageView.setOnClickListener(new View$OnClickListenerC29983h(this));
        ImageView imageView2 = this.f74793h;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeBtnIV");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC29984i(this));
    }

    /* renamed from: f */
    public final void mo108027f() {
        if (this.f74787a <= 0) {
            if (getVisibility() == 8) {
                setVisibility(0);
            }
        } else if (this.f74796k) {
            if (getVisibility() == 8) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = 0;
                setLayoutParams(layoutParams);
                setVisibility(0);
            }
            ValueAnimator valueAnimator = this.f74794i;
            if (valueAnimator == null) {
                this.f74794i = m110899a(0, this.f74787a);
            } else if (valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.f74795j;
            if (valueAnimator2 != null) {
                if (!valueAnimator2.isRunning()) {
                    valueAnimator2 = null;
                }
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            ValueAnimator valueAnimator3 = this.f74794i;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            this.f74796k = false;
        }
    }

    /* renamed from: g */
    public final void mo108028g() {
        int i = this.f74787a;
        if (i <= 0) {
            if (getVisibility() == 0) {
                setVisibility(8);
            }
        } else if (!this.f74796k) {
            ValueAnimator valueAnimator = this.f74795j;
            if (valueAnimator == null) {
                this.f74795j = m110899a(i, 0);
            } else if (valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.f74794i;
            if (valueAnimator2 != null) {
                if (!valueAnimator2.isRunning()) {
                    valueAnimator2 = null;
                }
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
            }
            ValueAnimator valueAnimator3 = this.f74795j;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            this.f74796k = true;
        }
    }

    /* renamed from: c */
    public final void mo108024c() {
        int i;
        TextView textView = this.f74789d;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("originLangTV");
        }
        boolean z = false;
        textView.setSelected(false);
        TextView textView2 = this.f74790e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView2.setVisibility(4);
        ProgressBar progressBar = this.f74791f;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
        }
        progressBar.setVisibility(0);
        ProgressBar progressBar2 = this.f74791f;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
        }
        ViewGroup.LayoutParams layoutParams = progressBar2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            TextView textView3 = this.f74790e;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
            }
            Integer valueOf = Integer.valueOf(textView3.getWidth());
            if (valueOf.intValue() > 0) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
            } else {
                TextView textView4 = this.f74790e;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
                }
                i = UIUtils.getWidth(textView4);
            }
            int i2 = (i / 2) - (layoutParams.width / 2);
            if (i2 <= 0) {
                i2 = this.f74798m;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i2);
            ProgressBar progressBar3 = this.f74791f;
            if (progressBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingPB");
            }
            progressBar3.setLayoutParams(layoutParams);
        }
    }

    public final void setListener(WebTranslateListener bVar) {
        this.f74788b = bVar;
    }

    public final void setTranslateHandlerApi(TranslateJSApi.IHandlerApi cVar) {
        this.f74797l = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$e */
    public static final class View$OnClickListenerC29980e implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC29980e f74801a = new View$OnClickListenerC29980e();

        View$OnClickListenerC29980e() {
        }

        public final void onClick(View view) {
            Log.m165379d("WebTranslateBar", "consume this event");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$h */
    public static final class View$OnClickListenerC29983h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74804a;

        View$OnClickListenerC29983h(WebTranslateBar webTranslateBar) {
            this.f74804a = webTranslateBar;
        }

        public final void onClick(View view) {
            WebTranslateListener bVar = this.f74804a.f74788b;
            if (bVar != null) {
                bVar.mo108009b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$i */
    public static final class View$OnClickListenerC29984i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74805a;

        View$OnClickListenerC29984i(WebTranslateBar webTranslateBar) {
            this.f74805a = webTranslateBar;
        }

        public final void onClick(View view) {
            WebTranslateListener bVar = this.f74805a.f74788b;
            if (bVar != null) {
                bVar.mo108010c();
            }
        }
    }

    public final void setOriginLangText(String str) {
        TextView textView = this.f74790e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView.setText(str);
    }

    public final void setTargetLangText(String str) {
        TextView textView = this.f74790e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetLangTV");
        }
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$f */
    public static final class View$OnClickListenerC29981f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74802a;

        View$OnClickListenerC29981f(WebTranslateBar webTranslateBar) {
            this.f74802a = webTranslateBar;
        }

        public final void onClick(View view) {
            WebTranslateListener bVar;
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (!view.isSelected() && (bVar = this.f74802a.f74788b) != null) {
                bVar.mo108007a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$g */
    public static final class View$OnClickListenerC29982g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74803a;

        View$OnClickListenerC29982g(WebTranslateBar webTranslateBar) {
            this.f74803a = webTranslateBar;
        }

        public final void onClick(View view) {
            WebTranslateListener bVar = this.f74803a.f74788b;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                bVar.mo108008a(view.isSelected());
            }
        }
    }

    public WebTranslateBar(Context context) {
        super(context);
        m110900h();
    }

    /* renamed from: a */
    private final ValueAnimator m110899a(int... iArr) {
        ValueAnimator ofInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        ofInt.addUpdateListener(new C29978c(this));
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "animator");
        ofInt.setDuration(500L);
        return ofInt;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar$c */
    public static final class C29978c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateBar f74799a;

        C29978c(WebTranslateBar webTranslateBar) {
            this.f74799a = webTranslateBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.checkParameterIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this.f74799a.getLayoutParams();
                layoutParams.height = intValue;
                this.f74799a.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public WebTranslateBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m110900h();
    }

    public WebTranslateBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m110900h();
    }
}
