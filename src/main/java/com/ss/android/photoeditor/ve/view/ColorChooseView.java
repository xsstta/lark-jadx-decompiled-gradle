package com.ss.android.photoeditor.ve.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.larksuite.suite.R;
import com.ss.android.ttve.utils.C60275a;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 02\u00020\u0001:\u000201B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\r\u0010\u001f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\r\u0010!\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\r\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010 J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020'J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\tH\u0002J\u0006\u0010+\u001a\u00020\u001eJ\u000e\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u0019J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ColorChooseView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorMargin", "", "layoutId", "paintColorBlack", "Landroid/widget/ImageView;", "paintColorBlue", "paintColorGreen", "paintColorMap", "Ljava/util/HashMap;", "paintColorPink", "paintColorRed", "paintColorWhite", "paintColorYellow", "selectColorChangedListener", "Lcom/ss/android/photoeditor/ve/view/ColorChooseView$OnSelectColorChangedListener;", "selectColorType", "view", "Landroid/view/View;", "checkModifyMargin", "", "getBlackColor", "()Ljava/lang/Integer;", "getSelectColor", "getWhiteColor", "initColorMap", "initListener", "initView", "isSelectBlack", "", "isSelectWhite", "onSelectColor", "colorType", "setInitSelectColor", "setOnSelectColorChangeListener", "listener", "setSelectColor", "textColor", "Companion", "OnSelectColorChangedListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ColorChooseView extends LinearLayout {

    /* renamed from: a */
    public static final Companion f149407a = new Companion(null);

    /* renamed from: b */
    private final int f149408b = R.layout.view_choose_color;

    /* renamed from: c */
    private View f149409c;

    /* renamed from: d */
    private HashMap<Integer, Integer> f149410d;

    /* renamed from: e */
    private ImageView f149411e;

    /* renamed from: f */
    private ImageView f149412f;

    /* renamed from: g */
    private ImageView f149413g;

    /* renamed from: h */
    private ImageView f149414h;

    /* renamed from: i */
    private ImageView f149415i;

    /* renamed from: j */
    private ImageView f149416j;

    /* renamed from: k */
    private ImageView f149417k;

    /* renamed from: l */
    private OnSelectColorChangedListener f149418l;

    /* renamed from: m */
    private int f149419m;

    /* renamed from: n */
    private float f149420n = C60275a.m234185a(getContext(), 10.0f);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ColorChooseView$OnSelectColorChangedListener;", "", "onSelectColor", "", "color", "", "(Ljava/lang/Integer;)V", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$b */
    public interface OnSelectColorChangedListener {
        /* renamed from: a */
        void mo204074a(Integer num);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/photoeditor/ve/view/ColorChooseView$Companion;", "", "()V", "COLOR_BLACK", "", "COLOR_BLUE", "COLOR_GREEN", "COLOR_PINK", "COLOR_RED", "COLOR_WHITE", "COLOR_YELLOW", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo204128a() {
        mo204129a(1);
    }

    /* renamed from: b */
    public final boolean mo204130b() {
        if (this.f149419m == 2) {
            return true;
        }
        return false;
    }

    public final Integer getBlackColor() {
        HashMap<Integer, Integer> hashMap = this.f149410d;
        if (hashMap != null) {
            return hashMap.get(3);
        }
        return null;
    }

    public final Integer getSelectColor() {
        HashMap<Integer, Integer> hashMap = this.f149410d;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(this.f149419m));
        }
        return null;
    }

    public final Integer getWhiteColor() {
        HashMap<Integer, Integer> hashMap = this.f149410d;
        if (hashMap != null) {
            return hashMap.get(2);
        }
        return null;
    }

    /* renamed from: d */
    private final void m232657d() {
        ImageView imageView = this.f149411e;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC59940c(this));
        }
        ImageView imageView2 = this.f149412f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View$OnClickListenerC59941d(this));
        }
        ImageView imageView3 = this.f149413g;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View$OnClickListenerC59942e(this));
        }
        ImageView imageView4 = this.f149414h;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View$OnClickListenerC59943f(this));
        }
        ImageView imageView5 = this.f149415i;
        if (imageView5 != null) {
            imageView5.setOnClickListener(new View$OnClickListenerC59944g(this));
        }
        ImageView imageView6 = this.f149416j;
        if (imageView6 != null) {
            imageView6.setOnClickListener(new View$OnClickListenerC59945h(this));
        }
        ImageView imageView7 = this.f149417k;
        if (imageView7 != null) {
            imageView7.setOnClickListener(new View$OnClickListenerC59946i(this));
        }
    }

    /* renamed from: e */
    private final void m232658e() {
        this.f149411e = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_red);
        this.f149412f = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_white);
        this.f149413g = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_black);
        this.f149414h = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_green);
        this.f149415i = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_yellow);
        this.f149416j = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_blue);
        this.f149417k = (ImageView) this.f149409c.findViewById(R.id.iv_paint_color_pink);
        m232659f();
    }

    /* renamed from: c */
    private final void m232656c() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        this.f149410d = hashMap;
        if (hashMap != null) {
            HashMap<Integer, Integer> hashMap2 = hashMap;
            hashMap2.put(1, Integer.valueOf(getResources().getColor(R.color.lkui_R500)));
            hashMap2.put(2, Integer.valueOf(getResources().getColor(R.color.lkui_N00)));
            hashMap2.put(3, Integer.valueOf(getResources().getColor(R.color.lkui_N1000)));
            hashMap2.put(4, Integer.valueOf(getResources().getColor(R.color.lkui_G500)));
            hashMap2.put(5, Integer.valueOf(getResources().getColor(R.color.lkui_Y500)));
            hashMap2.put(6, Integer.valueOf(getResources().getColor(R.color.lkui_B400)));
            hashMap2.put(7, Integer.valueOf(getResources().getColor(R.color.lkui_C500)));
        }
    }

    /* renamed from: f */
    private final void m232659f() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        ViewGroup.LayoutParams layoutParams5;
        float f = (float) 3;
        float f2 = (float) 7;
        float f3 = (float) 6;
        boolean z = false;
        if (((((((float) C60275a.m234186a(getContext())) - C60275a.m234185a(getContext(), 40.0f)) - (C60275a.m234185a(getContext(), 24.0f) * f)) - C60275a.m234185a(getContext(), 1.0f)) - (C60275a.m234185a(getContext(), 26.0f) * f2)) - (C60275a.m234185a(getContext(), 10.0f) * f3) < ((float) 0)) {
            z = true;
        }
        if (z) {
            this.f149420n = ((((((float) C60275a.m234186a(getContext())) - C60275a.m234185a(getContext(), 40.0f)) - (C60275a.m234185a(getContext(), 24.0f) * f)) - C60275a.m234185a(getContext(), 1.0f)) - (C60275a.m234185a(getContext(), 26.0f) * f2)) / f3;
            ImageView imageView = this.f149411e;
            ViewGroup.LayoutParams layoutParams6 = null;
            if (imageView != null) {
                layoutParams = imageView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = (int) this.f149420n;
                ImageView imageView2 = this.f149412f;
                if (imageView2 != null) {
                    layoutParams2 = imageView2.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = (int) this.f149420n;
                    ImageView imageView3 = this.f149413g;
                    if (imageView3 != null) {
                        layoutParams3 = imageView3.getLayoutParams();
                    } else {
                        layoutParams3 = null;
                    }
                    if (layoutParams3 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) this.f149420n;
                        ImageView imageView4 = this.f149414h;
                        if (imageView4 != null) {
                            layoutParams4 = imageView4.getLayoutParams();
                        } else {
                            layoutParams4 = null;
                        }
                        if (layoutParams4 != null) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = (int) this.f149420n;
                            ImageView imageView5 = this.f149415i;
                            if (imageView5 != null) {
                                layoutParams5 = imageView5.getLayoutParams();
                            } else {
                                layoutParams5 = null;
                            }
                            if (layoutParams5 != null) {
                                ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) this.f149420n;
                                ImageView imageView6 = this.f149416j;
                                if (imageView6 != null) {
                                    layoutParams6 = imageView6.getLayoutParams();
                                }
                                if (layoutParams6 != null) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = (int) this.f149420n;
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$c */
    public static final class View$OnClickListenerC59940c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149421a;

        View$OnClickListenerC59940c(ColorChooseView colorChooseView) {
            this.f149421a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149421a.mo204129a(1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$d */
    public static final class View$OnClickListenerC59941d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149422a;

        View$OnClickListenerC59941d(ColorChooseView colorChooseView) {
            this.f149422a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149422a.mo204129a(2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$e */
    public static final class View$OnClickListenerC59942e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149423a;

        View$OnClickListenerC59942e(ColorChooseView colorChooseView) {
            this.f149423a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149423a.mo204129a(3);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$f */
    public static final class View$OnClickListenerC59943f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149424a;

        View$OnClickListenerC59943f(ColorChooseView colorChooseView) {
            this.f149424a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149424a.mo204129a(4);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$g */
    public static final class View$OnClickListenerC59944g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149425a;

        View$OnClickListenerC59944g(ColorChooseView colorChooseView) {
            this.f149425a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149425a.mo204129a(5);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$h */
    public static final class View$OnClickListenerC59945h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149426a;

        View$OnClickListenerC59945h(ColorChooseView colorChooseView) {
            this.f149426a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149426a.mo204129a(6);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.view.ColorChooseView$i */
    public static final class View$OnClickListenerC59946i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ColorChooseView f149427a;

        View$OnClickListenerC59946i(ColorChooseView colorChooseView) {
            this.f149427a = colorChooseView;
        }

        public final void onClick(View view) {
            this.f149427a.mo204129a(7);
        }
    }

    public final void setOnSelectColorChangeListener(OnSelectColorChangedListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f149418l = bVar;
    }

    public ColorChooseView(Context context) {
        super(context);
        View inflate = View.inflate(getContext(), R.layout.view_choose_color, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149409c = inflate;
        m232656c();
        m232658e();
        m232657d();
    }

    public final void setSelectColor(int i) {
        Set<Integer> keySet;
        HashMap<Integer, Integer> hashMap = this.f149410d;
        int i2 = 0;
        if (!(hashMap == null || (keySet = hashMap.keySet()) == null)) {
            for (T t : keySet) {
                HashMap<Integer, Integer> hashMap2 = this.f149410d;
                if (hashMap2 == null) {
                    Intrinsics.throwNpe();
                }
                Integer num = hashMap2.get(t);
                if (num != null && num.intValue() == i) {
                    Intrinsics.checkExpressionValueIsNotNull(t, "key");
                    i2 = t.intValue();
                }
            }
        }
        mo204129a(i2);
    }

    /* renamed from: a */
    public final void mo204129a(int i) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        if (this.f149419m != i) {
            this.f149419m = i;
            ImageView imageView = this.f149411e;
            Integer num = null;
            if (imageView != null) {
                if (i == 1) {
                    drawable7 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable7 = null;
                }
                imageView.setBackground(drawable7);
            }
            ImageView imageView2 = this.f149412f;
            if (imageView2 != null) {
                if (i == 2) {
                    drawable6 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable6 = null;
                }
                imageView2.setBackground(drawable6);
            }
            ImageView imageView3 = this.f149413g;
            if (imageView3 != null) {
                if (i == 3) {
                    drawable5 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable5 = null;
                }
                imageView3.setBackground(drawable5);
            }
            ImageView imageView4 = this.f149414h;
            if (imageView4 != null) {
                if (i == 4) {
                    drawable4 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable4 = null;
                }
                imageView4.setBackground(drawable4);
            }
            ImageView imageView5 = this.f149415i;
            if (imageView5 != null) {
                if (i == 5) {
                    drawable3 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable3 = null;
                }
                imageView5.setBackground(drawable3);
            }
            ImageView imageView6 = this.f149416j;
            if (imageView6 != null) {
                if (i == 6) {
                    drawable2 = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable2 = null;
                }
                imageView6.setBackground(drawable2);
            }
            ImageView imageView7 = this.f149417k;
            if (imageView7 != null) {
                if (i == 7) {
                    drawable = getResources().getDrawable(R.drawable.bg_color_selected);
                } else {
                    drawable = null;
                }
                imageView7.setBackground(drawable);
            }
            OnSelectColorChangedListener bVar = this.f149418l;
            if (bVar != null) {
                HashMap<Integer, Integer> hashMap = this.f149410d;
                if (hashMap != null) {
                    num = hashMap.get(Integer.valueOf(i));
                }
                bVar.mo204074a(num);
            }
        }
    }

    public ColorChooseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(getContext(), R.layout.view_choose_color, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149409c = inflate;
        m232656c();
        m232658e();
        m232657d();
    }

    public ColorChooseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(getContext(), R.layout.view_choose_color, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149409c = inflate;
        m232656c();
        m232658e();
        m232657d();
    }
}
