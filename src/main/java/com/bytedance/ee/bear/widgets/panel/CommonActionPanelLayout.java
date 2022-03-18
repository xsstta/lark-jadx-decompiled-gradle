package com.bytedance.ee.bear.widgets.panel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.widgets.panel.InterceptTouchRecyclerView;
import com.bytedance.ee.util.C13655e;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0003GHIB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0012J\b\u0010\u001e\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0012J\u0012\u0010\"\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010#\u001a\u00020\u0014H\u0002J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001cJ\u000e\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001cJ\u0018\u0010'\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001cJ\u0010\u0010-\u001a\u00020\u00142\b\u0010.\u001a\u0004\u0018\u00010\u0010J\u000e\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u000200J\u000e\u00101\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001cJ\u0018\u00102\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\tJ\u000e\u00103\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u001cJ\u0012\u00104\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u00020 2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u00108\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u00010)J\u000e\u0010:\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001cJ\u0018\u0010;\u001a\u00020\u00142\u0006\u00107\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001cH\u0002J\u000e\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>J\u001e\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u001cJ\u000e\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020CJ\u001e\u0010A\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020CR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contentContainer", "Landroid/view/ViewGroup;", "mDragUtil", "Lcom/bytedance/ee/bear/facade/common/widget/helper/DragView;", "mOnActionListener", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$OnActionListener;", "topBarContainer", "Landroid/view/View;", "addView", "", "child", "index", "params", "Landroid/view/ViewGroup$LayoutParams;", "decorateTitle", "enableDragUp", "enable", "", "getDragHandler", "getDragUtil", "getTitleTV", "Landroid/widget/TextView;", "getTopBar", "init", "initDragView", "setDividerVisible", "visible", "setLeftIconVisible", "setLeftText", "text", "", "textColor", "setLeftTextEnabled", "enabled", "setOnActionListener", "listener", "setOnDragViewHeightChangeListener", "Lcom/bytedance/ee/bear/facade/common/widget/helper/DragView$OnHeightChangeListener;", "setRightIconVisible", "setRightText", "setRightTextEnabled", "setSlideView", "slideView", "setText", "view", "setTitle", "title", "setTitleBarVisible", "setVisible", "supportInnerRVNestScroll", "recyclerView", "Lcom/bytedance/ee/bear/widgets/panel/InterceptTouchRecyclerView;", "supportNestScrollUp", "supportNestScrollDown", "updateDragViewHeight", "targetHeight", "", "min", "mid", "max", "MenuType", "OnActionListener", "SimpleActionListener", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public class CommonActionPanelLayout extends LinearLayout {

    /* renamed from: a */
    public C7728a f31989a;

    /* renamed from: b */
    public OnActionListener f31990b;

    /* renamed from: c */
    private View f31991c;

    /* renamed from: d */
    private ViewGroup f31992d;

    /* renamed from: e */
    private HashMap f31993e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$MenuType;", "", "Companion", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MenuType {
        public static final Companion Companion = Companion.f31994a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$MenuType$Companion;", "", "()V", "ICON", "", "TEXT", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$MenuType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f31994a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$OnActionListener;", "", "onClickLeftIcon", "", "onClickLeftText", "onClickRightIcon", "onClickRightText", "onDragPanelToClose", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$a */
    public interface OnActionListener {
        /* renamed from: a */
        void mo18276a();

        /* renamed from: b */
        void mo18277b();

        /* renamed from: c */
        void mo18786c();

        /* renamed from: d */
        void mo18838d();

        /* renamed from: e */
        void mo42228e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$SimpleActionListener;", "Lcom/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$OnActionListener;", "()V", "onClickLeftIcon", "", "onClickLeftText", "onClickRightIcon", "onClickRightText", "onDragPanelToClose", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$b */
    public static class SimpleActionListener implements OnActionListener {
        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener
        /* renamed from: a */
        public void mo18276a() {
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener
        /* renamed from: b */
        public void mo18277b() {
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener
        /* renamed from: c */
        public void mo18786c() {
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener
        /* renamed from: d */
        public void mo18838d() {
        }

        @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener
        /* renamed from: e */
        public void mo42228e() {
        }
    }

    /* renamed from: a */
    public View mo45434a(int i) {
        if (this.f31993e == null) {
            this.f31993e = new HashMap();
        }
        View view = (View) this.f31993e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f31993e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C7728a getDragUtil() {
        return this.f31989a;
    }

    /* renamed from: a */
    public final void mo45439a(CharSequence charSequence, int i) {
        TextView textView = (TextView) mo45434a(R.id.leftTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "leftTV");
        m49171a((View) textView, true);
        TextView textView2 = (TextView) mo45434a(R.id.leftTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "leftTV");
        m49172a(textView2, charSequence);
        ((TextView) mo45434a(R.id.leftTV)).setTextColor(getResources().getColorStateList(i));
    }

    public final View getDragHandler() {
        View a = mo45434a(R.id.dragHandler);
        Intrinsics.checkExpressionValueIsNotNull(a, "dragHandler");
        return a;
    }

    public final TextView getTitleTV() {
        TextView textView = (TextView) mo45434a(R.id.titleTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "titleTV");
        return textView;
    }

    public final View getTopBar() {
        LinearLayout linearLayout = (LinearLayout) mo45434a(R.id.topBar);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "topBar");
        return linearLayout;
    }

    /* renamed from: a */
    private final void mo17963a() {
        C7728a aVar = new C7728a(getContext(), getRootView());
        this.f31989a = aVar;
        if (aVar != null) {
            aVar.mo30252a((LinearLayout) mo45434a(R.id.topBar));
            aVar.mo30255a(false);
            aVar.mo30253a(new C11846g(this));
        }
    }

    /* renamed from: b */
    private final void mo42244b() {
        TextView textView = (TextView) mo45434a(R.id.titleTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "titleTV");
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "titleTV.paint");
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        TextView textView2 = (TextView) mo45434a(R.id.titleTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "titleTV");
        TextPaint paint2 = textView2.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint2, "titleTV.paint");
        paint2.setStrokeWidth(1.0f);
        TextView textView3 = (TextView) mo45434a(R.id.titleTV);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "titleTV");
        textView3.setGravity(17);
        if (getContext() != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ImageView imageView = (ImageView) mo45434a(R.id.leftIconIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "leftIconIV");
            if (imageView.getVisibility() == 0) {
                ((ImageView) mo45434a(R.id.leftIconIV)).measure(makeMeasureSpec, makeMeasureSpec);
            }
            ImageView imageView2 = (ImageView) mo45434a(R.id.rightIconIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView2, "rightIconIV");
            if (imageView2.getVisibility() == 0) {
                ((ImageView) mo45434a(R.id.rightIconIV)).measure(makeMeasureSpec, makeMeasureSpec);
            }
            TextView textView4 = (TextView) mo45434a(R.id.leftTV);
            Intrinsics.checkExpressionValueIsNotNull(textView4, "leftTV");
            if (textView4.getVisibility() == 0) {
                ((TextView) mo45434a(R.id.leftTV)).measure(makeMeasureSpec, makeMeasureSpec);
            }
            TextView textView5 = (TextView) mo45434a(R.id.rightTV);
            Intrinsics.checkExpressionValueIsNotNull(textView5, "rightTV");
            if (textView5.getVisibility() == 0) {
                ((TextView) mo45434a(R.id.rightTV)).measure(makeMeasureSpec, makeMeasureSpec);
            }
            ImageView imageView3 = (ImageView) mo45434a(R.id.leftIconIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "leftIconIV");
            int measuredWidth = imageView3.getMeasuredWidth();
            ImageView imageView4 = (ImageView) mo45434a(R.id.rightIconIV);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "rightIconIV");
            int max = Math.max(measuredWidth, imageView4.getMeasuredWidth());
            TextView textView6 = (TextView) mo45434a(R.id.leftTV);
            Intrinsics.checkExpressionValueIsNotNull(textView6, "leftTV");
            int max2 = Math.max(max, textView6.getMeasuredWidth());
            TextView textView7 = (TextView) mo45434a(R.id.rightTV);
            Intrinsics.checkExpressionValueIsNotNull(textView7, "rightTV");
            int max3 = Math.max(max2, textView7.getMeasuredWidth());
            TextView textView8 = (TextView) mo45434a(R.id.titleTV);
            Intrinsics.checkExpressionValueIsNotNull(textView8, "titleTV");
            ViewGroup.LayoutParams layoutParams = textView8.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.addRule(13, -1);
                layoutParams2.width = C13655e.m55415b(getContext()) - (max3 * 2);
            }
        }
    }

    public final void setOnActionListener(OnActionListener aVar) {
        this.f31990b = aVar;
    }

    public CommonActionPanelLayout(Context context) {
        super(context);
        m49170a((AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo45435a(float f) {
        C7728a aVar = this.f31989a;
        if (aVar != null) {
            aVar.mo30249a(f);
        }
    }

    /* renamed from: c */
    public final void mo45442c(boolean z) {
        C7728a aVar = this.f31989a;
        if (aVar != null) {
            aVar.mo30255a(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$c */
    public static final class View$OnClickListenerC11842c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f31995a;

        View$OnClickListenerC11842c(CommonActionPanelLayout commonActionPanelLayout) {
            this.f31995a = commonActionPanelLayout;
        }

        public final void onClick(View view) {
            OnActionListener aVar = this.f31995a.f31990b;
            if (aVar != null) {
                aVar.mo18838d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$d */
    public static final class View$OnClickListenerC11843d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f31996a;

        View$OnClickListenerC11843d(CommonActionPanelLayout commonActionPanelLayout) {
            this.f31996a = commonActionPanelLayout;
        }

        public final void onClick(View view) {
            OnActionListener aVar = this.f31996a.f31990b;
            if (aVar != null) {
                aVar.mo42228e();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$e */
    public static final class View$OnClickListenerC11844e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f31997a;

        View$OnClickListenerC11844e(CommonActionPanelLayout commonActionPanelLayout) {
            this.f31997a = commonActionPanelLayout;
        }

        public final void onClick(View view) {
            OnActionListener aVar = this.f31997a.f31990b;
            if (aVar != null) {
                aVar.mo18276a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$f */
    public static final class View$OnClickListenerC11845f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f31998a;

        View$OnClickListenerC11845f(CommonActionPanelLayout commonActionPanelLayout) {
            this.f31998a = commonActionPanelLayout;
        }

        public final void onClick(View view) {
            OnActionListener aVar = this.f31998a.f31990b;
            if (aVar != null) {
                aVar.mo18277b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onHeightChange", "com/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$initDragView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$g */
    public static final class C11846g implements C7728a.AbstractC7730a {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f31999a;

        C11846g(CommonActionPanelLayout commonActionPanelLayout) {
            this.f31999a = commonActionPanelLayout;
        }

        @Override // com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.AbstractC7730a
        public final void onHeightChange(int i) {
            OnActionListener aVar;
            if (i == 0 && (aVar = this.f31999a.f31990b) != null) {
                aVar.mo18786c();
            }
        }
    }

    public final void setDividerVisible(boolean z) {
        View a = mo45434a(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(a, "divider");
        m49171a(a, z);
    }

    public final void setOnDragViewHeightChangeListener(C7728a.AbstractC7730a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        C7728a aVar2 = this.f31989a;
        if (aVar2 != null) {
            aVar2.mo30253a(aVar);
        }
    }

    public void setSlideView(View view) {
        C7728a aVar;
        if (view != null && (aVar = this.f31989a) != null) {
            aVar.mo30252a(view);
        }
    }

    public final void setLeftIconVisible(boolean z) {
        ImageView imageView = (ImageView) mo45434a(R.id.leftIconIV);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "leftIconIV");
        m49171a(imageView, z);
    }

    public final void setLeftTextEnabled(boolean z) {
        TextView textView = (TextView) mo45434a(R.id.leftTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "leftTV");
        textView.setEnabled(z);
    }

    public final void setRightIconVisible(boolean z) {
        ImageView imageView = (ImageView) mo45434a(R.id.rightIconIV);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "rightIconIV");
        m49171a(imageView, z);
    }

    public final void setRightTextEnabled(boolean z) {
        TextView textView = (TextView) mo45434a(R.id.rightTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightTV");
        textView.setEnabled(z);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) mo45434a(R.id.titleTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "titleTV");
        m49172a(textView, charSequence);
    }

    public final void setTitleBarVisible(boolean z) {
        RelativeLayout relativeLayout = (RelativeLayout) mo45434a(R.id.titleBar);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "titleBar");
        m49171a(relativeLayout, z);
    }

    /* renamed from: a */
    private final void m49170a(AttributeSet attributeSet) {
        boolean z;
        setOrientation(1);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.common_panel_topbar_container_layout, (ViewGroup) this, false);
        this.f31991c = inflate;
        addView(inflate);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = linearLayout;
        this.f31992d = linearLayout2;
        addView(linearLayout2, new LinearLayout.LayoutParams(-1, -1));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.panel_background_color, R.attr.panel_custom_left_icon, R.attr.panel_custom_right_icon, R.attr.panel_enable_drag, R.attr.panel_left_text, R.attr.panel_left_text_color, R.attr.panel_menu_type, R.attr.panel_right_text, R.attr.panel_right_text_color, R.attr.panel_show_divider, R.attr.panel_show_drag_handler, R.attr.panel_show_left_icon, R.attr.panel_show_titlebar, R.attr.panel_title});
            int integer = obtainStyledAttributes.getInteger(6, 0);
            if (integer != 0 || !obtainStyledAttributes.getBoolean(11, true)) {
                z = false;
            } else {
                z = true;
            }
            setLeftIconVisible(z);
            if (integer == 0) {
                Drawable drawable = obtainStyledAttributes.getDrawable(1);
                if (drawable != null) {
                    ((ImageView) mo45434a(R.id.leftIconIV)).setImageDrawable(drawable);
                }
                Drawable drawable2 = obtainStyledAttributes.getDrawable(2);
                if (drawable2 != null) {
                    setRightIconVisible(true);
                    ((ImageView) mo45434a(R.id.rightIconIV)).setImageDrawable(drawable2);
                }
            }
            int i = 8;
            if (integer == 1) {
                mo45439a(obtainStyledAttributes.getString(4), obtainStyledAttributes.getResourceId(5, R.color.text_title));
                mo45441b(obtainStyledAttributes.getString(7), obtainStyledAttributes.getResourceId(8, R.color.text_title));
            }
            setTitleBarVisible(obtainStyledAttributes.getBoolean(12, true));
            setTitle(obtainStyledAttributes.getString(13));
            mo42244b();
            setDividerVisible(obtainStyledAttributes.getBoolean(9, true));
            boolean z2 = obtainStyledAttributes.getBoolean(10, false);
            View a = mo45434a(R.id.dragHandler);
            Intrinsics.checkExpressionValueIsNotNull(a, "dragHandler");
            if (z2) {
                i = 0;
            }
            a.setVisibility(i);
            if (obtainStyledAttributes.getBoolean(3, false)) {
                mo17963a();
            }
            int resourceId = obtainStyledAttributes.getResourceId(0, R.color.bg_body);
            LinearLayout linearLayout3 = (LinearLayout) mo45434a(R.id.topBar);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "topBar");
            linearLayout3.setBackgroundTintList(getResources().getColorStateList(resourceId));
            ViewGroup viewGroup = this.f31992d;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(getResources().getColor(resourceId));
            }
            obtainStyledAttributes.recycle();
        }
        ((ImageView) mo45434a(R.id.leftIconIV)).setOnClickListener(new View$OnClickListenerC11842c(this));
        ((ImageView) mo45434a(R.id.rightIconIV)).setOnClickListener(new View$OnClickListenerC11843d(this));
        ((TextView) mo45434a(R.id.leftTV)).setOnClickListener(new View$OnClickListenerC11844e(this));
        ((TextView) mo45434a(R.id.rightTV)).setOnClickListener(new View$OnClickListenerC11845f(this));
    }

    /* renamed from: a */
    public final void mo45437a(InterceptTouchRecyclerView interceptTouchRecyclerView) {
        Intrinsics.checkParameterIsNotNull(interceptTouchRecyclerView, "recyclerView");
        mo45438a(interceptTouchRecyclerView, true, true);
    }

    public CommonActionPanelLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49170a(attributeSet);
    }

    /* renamed from: a */
    private final void m49171a(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private final void m49172a(TextView textView, CharSequence charSequence) {
        if (charSequence == null) {
        }
        textView.setText(charSequence);
    }

    /* renamed from: b */
    public final void mo45441b(CharSequence charSequence, int i) {
        TextView textView = (TextView) mo45434a(R.id.rightTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rightTV");
        m49171a((View) textView, true);
        TextView textView2 = (TextView) mo45434a(R.id.rightTV);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "rightTV");
        m49172a(textView2, charSequence);
        ((TextView) mo45434a(R.id.rightTV)).setTextColor(getResources().getColorStateList(i));
    }

    public CommonActionPanelLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49170a(attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (Intrinsics.areEqual(view, this.f31991c) || Intrinsics.areEqual(view, this.f31992d)) {
            super.addView(view, i, layoutParams);
            return;
        }
        ViewGroup viewGroup = this.f31992d;
        if (viewGroup != null) {
            viewGroup.addView(view, i, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo45436a(float f, float f2, float f3) {
        C7728a aVar = this.f31989a;
        if (aVar != null) {
            aVar.mo30250a(f, f2, f3);
        }
    }

    /* renamed from: a */
    public final void mo45438a(InterceptTouchRecyclerView interceptTouchRecyclerView, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(interceptTouchRecyclerView, "recyclerView");
        if (this.f31989a != null) {
            interceptTouchRecyclerView.setTouchInterceptor(new C11847h(this, z, z2, interceptTouchRecyclerView));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/widgets/panel/CommonActionPanelLayout$supportInnerRVNestScroll$1", "Lcom/bytedance/ee/bear/widgets/panel/InterceptTouchRecyclerView$ITouchInterceptor;", "OFFSET_THRESHOLD", "", "originY", "onIntercept", "", "ev", "Landroid/view/MotionEvent;", "offsetX", "", "offsetY", "dx", "dy", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout$h */
    public static final class C11847h implements InterceptTouchRecyclerView.ITouchInterceptor {

        /* renamed from: a */
        final /* synthetic */ CommonActionPanelLayout f32000a;

        /* renamed from: b */
        final /* synthetic */ boolean f32001b;

        /* renamed from: c */
        final /* synthetic */ boolean f32002c;

        /* renamed from: d */
        final /* synthetic */ InterceptTouchRecyclerView f32003d;

        /* renamed from: e */
        private int f32004e;

        /* renamed from: f */
        private final int f32005f = 100;

        C11847h(CommonActionPanelLayout commonActionPanelLayout, boolean z, boolean z2, InterceptTouchRecyclerView interceptTouchRecyclerView) {
            this.f32000a = commonActionPanelLayout;
            this.f32001b = z;
            this.f32002c = z2;
            this.f32003d = interceptTouchRecyclerView;
        }

        @Override // com.bytedance.ee.bear.widgets.panel.InterceptTouchRecyclerView.ITouchInterceptor
        /* renamed from: a */
        public boolean mo45460a(MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            C7728a aVar;
            if (motionEvent == null || motionEvent.getAction() != 0) {
                boolean z = true;
                if ((motionEvent == null || motionEvent.getAction() != 3) && (motionEvent == null || motionEvent.getAction() != 1)) {
                    float f5 = (float) 0;
                    if (f2 > f5 && this.f32001b && ((aVar = this.f32000a.f31989a) == null || !aVar.mo30267m())) {
                        C7728a aVar2 = this.f32000a.f31989a;
                        if (aVar2 != null) {
                            aVar2.mo30249a(((float) this.f32004e) + f2);
                        }
                        return true;
                    } else if (f2 >= f5 || !this.f32002c || !(!this.f32003d.canScrollVertically(-1))) {
                        return false;
                    } else {
                        C7728a aVar3 = this.f32000a.f31989a;
                        if (aVar3 != null) {
                            aVar3.mo30249a(((float) this.f32000a.getHeight()) + f4);
                        }
                        return true;
                    }
                } else {
                    if (Math.abs(f2) > ((float) this.f32005f)) {
                        C7728a aVar4 = this.f32000a.f31989a;
                        if (aVar4 != null) {
                            if (f2 >= ((float) 0)) {
                                z = false;
                            }
                            aVar4.mo30257b(z);
                        }
                    } else {
                        C7728a aVar5 = this.f32000a.f31989a;
                        if (aVar5 != null) {
                            aVar5.mo30256b((float) this.f32004e);
                        }
                    }
                    return false;
                }
            } else {
                this.f32004e = this.f32000a.getHeight();
                return false;
            }
        }
    }
}
