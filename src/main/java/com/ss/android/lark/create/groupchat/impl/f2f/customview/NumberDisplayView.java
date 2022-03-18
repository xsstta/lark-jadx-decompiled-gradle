package com.ss.android.lark.create.groupchat.impl.f2f.customview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.transition.C1556v;
import androidx.transition.Fade;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C69120l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u0000 32\u00020\u00012\u00020\u0002:\u0003345B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000fJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0002J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0006\u0010+\u001a\u00020\u0019J\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0002J\f\u00101\u001a\u000202*\u00020\bH\u0002R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/transition/Transition$TransitionListener;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentMargin", "displayTypeFace", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "enableInput", "", "holders", "", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$NumberHolder;", "nextPost", "numberFilledListener", "Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$NumberFilledListener;", "numbers", "", "addNumber", "", "num", "clearAll", "showAnimation", "fold", "getCodeString", "", "getDotBgDrawable", "Landroid/graphics/drawable/GradientDrawable;", "getIds", "", "onTransitionCancel", "transition", "Landroidx/transition/Transition;", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart", "removeNumber", "setNumberFilledListener", "setupChildren", "setupMarginForChild", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "lp", "dp", "", "Companion", "NumberFilledListener", "NumberHolder", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class NumberDisplayView extends ConstraintLayout implements Transition.AbstractC1505d {

    /* renamed from: a */
    public static final List<Integer> f93663a = new ArrayList();

    /* renamed from: b */
    public static final Companion f93664b = new Companion(null);

    /* renamed from: c */
    private final Typeface f93665c;

    /* renamed from: d */
    private int f93666d;

    /* renamed from: e */
    private NumberFilledListener f93667e;

    /* renamed from: f */
    private boolean f93668f;

    /* renamed from: g */
    private int f93669g;

    /* renamed from: h */
    private final int[] f93670h;

    /* renamed from: i */
    private final List<NumberHolder> f93671i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$NumberFilledListener;", "", "onNumberFilled", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberDisplayView$b */
    public interface NumberFilledListener {
        /* renamed from: a */
        void mo133940a();
    }

    public NumberDisplayView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NumberDisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$Companion;", "", "()V", "EXPANDED_MARGIN", "", "FOLD_MARGIN", "IDS", "", "getIDS", "()Ljava/util/List;", "LOG_TAG", "", "MATCH_PARENT", "MAX_NUMBERS", "PARENT_ID", "TTF_PATH", "WRAP_CONTENT", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberDisplayView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/f2f/customview/NumberDisplayView$NumberHolder;", "", "numberView", "Landroid/widget/TextView;", "dotView", "Landroid/widget/ImageView;", "(Landroid/widget/TextView;Landroid/widget/ImageView;)V", "removeNumber", "", "setNumber", "number", "", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.f2f.customview.NumberDisplayView$c */
    public static final class NumberHolder {

        /* renamed from: a */
        private final TextView f93672a;

        /* renamed from: b */
        private final ImageView f93673b;

        /* renamed from: a */
        public final void mo133954a() {
            this.f93672a.setVisibility(4);
            this.f93673b.setVisibility(0);
        }

        /* renamed from: a */
        public final void mo133955a(int i) {
            this.f93672a.setText(String.valueOf(i));
            this.f93672a.setVisibility(0);
            this.f93673b.setVisibility(4);
        }

        public NumberHolder(TextView textView, ImageView imageView) {
            Intrinsics.checkParameterIsNotNull(textView, "numberView");
            Intrinsics.checkParameterIsNotNull(imageView, "dotView");
            this.f93672a = textView;
            this.f93673b = imageView;
        }
    }

    static {
        Iterator it = new IntRange(1, 4).iterator();
        while (it.hasNext()) {
            ((IntIterator) it).mo238946b();
            f93663a.add(Integer.valueOf(View.generateViewId()));
        }
    }

    private final GradientDrawable getDotBgDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = m142955b(25);
        }
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setSize((int) m142955b(18), (int) m142955b(18));
        gradientDrawable.setColor(ContextCompat.getColor(getContext(), R.color.fill_disable));
        return gradientDrawable;
    }

    private final List<Integer> getIds() {
        C69120l lVar = new C69120l(3);
        lVar.mo239354b(0);
        Object[] array = f93663a.toArray(new Integer[0]);
        if (array != null) {
            lVar.mo239352a((Object) array);
            lVar.mo239354b(0);
            return CollectionsKt.mutableListOf((Integer[]) lVar.mo239353a((Object[]) new Integer[lVar.mo239351a()]));
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public final void mo133952b() {
        int i = this.f93669g;
        if (i > 0 && this.f93668f) {
            int i2 = i - 1;
            this.f93669g = i2;
            int i3 = this.f93670h[i2];
            this.f93671i.get(i2).mo133954a();
        }
    }

    /* renamed from: a */
    public final void mo133949a() {
        this.f93666d = (int) m142955b(4);
        Iterator it = RangesKt.until(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((IntIterator) it).mo238946b());
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                childAt.setLayoutParams(m142953a((ConstraintLayout.LayoutParams) layoutParams));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    public final String getCodeString() {
        Iterator it = RangesKt.until(0, this.f93669g).iterator();
        String str = "";
        while (it.hasNext()) {
            int b = ((IntIterator) it).mo238946b();
            str = str + this.f93670h[b];
        }
        Log.m165379d("NumberDisplayView", "getCodeString: " + str);
        return str;
    }

    /* renamed from: c */
    private final void m142956c() {
        List<Integer> ids = getIds();
        Iterator it = new IntRange(1, 4).iterator();
        while (it.hasNext()) {
            int b = ((IntIterator) it).mo238946b();
            FrameLayout frameLayout = new FrameLayout(getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            if (b == 1) {
                layoutParams.f2812d = ids.get(b - 1).intValue();
            } else {
                layoutParams.f2813e = ids.get(b - 1).intValue();
            }
            if (b == 4) {
                layoutParams.f2815g = ids.get(b + 1).intValue();
            } else {
                layoutParams.f2814f = ids.get(b + 1).intValue();
            }
            m142953a(layoutParams);
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            layoutParams.f2789G = 1;
            frameLayout.setMinimumWidth((int) m142955b(30));
            frameLayout.setMinimumHeight((int) m142955b(34));
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setId(ids.get(b).intValue());
            TextView textView = new TextView(getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            textView.setLayoutParams(layoutParams2);
            textView.setGravity(17);
            textView.setTextSize(48.0f);
            textView.setTypeface(this.f93665c);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.function_info_500));
            textView.setText(String.valueOf(b));
            textView.setVisibility(4);
            ImageView imageView = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            imageView.setLayoutParams(layoutParams3);
            imageView.setBackground(getDotBgDrawable());
            frameLayout.addView(textView);
            frameLayout.addView(imageView);
            addView(frameLayout);
            this.f93671i.add(new NumberHolder(textView, imageView));
        }
    }

    /* renamed from: a */
    public final NumberDisplayView mo133948a(NumberFilledListener bVar) {
        NumberDisplayView numberDisplayView = this;
        numberDisplayView.f93667e = bVar;
        return numberDisplayView;
    }

    @Override // androidx.transition.Transition.AbstractC1505d
    /* renamed from: b */
    public void mo7816b(Transition transition) {
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        this.f93668f = true;
    }

    @Override // androidx.transition.Transition.AbstractC1505d
    /* renamed from: c */
    public void mo7817c(Transition transition) {
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        this.f93668f = true;
    }

    @Override // androidx.transition.Transition.AbstractC1505d
    /* renamed from: d */
    public void mo7818d(Transition transition) {
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        this.f93668f = false;
    }

    @Override // androidx.transition.Transition.AbstractC1505d
    /* renamed from: e */
    public void mo7931e(Transition transition) {
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        this.f93668f = false;
    }

    /* renamed from: a */
    private final ConstraintLayout.LayoutParams m142953a(ConstraintLayout.LayoutParams layoutParams) {
        if (layoutParams.f2812d != 0) {
            layoutParams.leftMargin = this.f93666d;
        }
        if (layoutParams.f2815g != 0) {
            layoutParams.rightMargin = this.f93666d;
        }
        return layoutParams;
    }

    /* renamed from: b */
    private final float m142955b(int i) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return ((float) i) * resources.getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void mo133950a(int i) {
        NumberFilledListener bVar;
        int i2 = this.f93669g;
        int[] iArr = this.f93670h;
        if (i2 < iArr.length && this.f93668f) {
            iArr[i2] = i;
            this.f93671i.get(i2).mo133955a(i);
            int i3 = this.f93669g + 1;
            this.f93669g = i3;
            if (i3 == 4 && (bVar = this.f93667e) != null) {
                bVar.mo133940a();
            }
        }
    }

    @Override // androidx.transition.Transition.AbstractC1505d
    /* renamed from: a */
    public void mo7815a(Transition transition) {
        Intrinsics.checkParameterIsNotNull(transition, "transition");
        this.f93668f = true;
    }

    /* renamed from: a */
    public final void mo133951a(boolean z) {
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.mo7874a(0);
            transitionSet.mo7933a(new Fade(2)).mo7933a(new Fade(1));
            transitionSet.mo7880a((Transition.AbstractC1505d) this);
            C1556v.m7131a(this, transitionSet);
        }
        while (this.f93669g > 0) {
            mo133952b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NumberDisplayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f93665c = Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf");
        this.f93666d = (int) m142955b(20);
        this.f93668f = true;
        this.f93670h = new int[4];
        this.f93671i = new ArrayList();
        m142956c();
    }

    /* renamed from: a */
    public static /* synthetic */ void m142954a(NumberDisplayView numberDisplayView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        numberDisplayView.mo133951a(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NumberDisplayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
