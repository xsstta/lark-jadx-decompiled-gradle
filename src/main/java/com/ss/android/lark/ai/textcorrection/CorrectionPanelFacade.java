package com.ss.android.lark.ai.textcorrection;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cJ0\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/CorrectionPanelFacade;", "", "context", "Landroid/content/Context;", "anchorView", "Landroid/view/View;", "firstLineH", "", "lastLineH", "verticals", "(Landroid/content/Context;Landroid/view/View;[I[I[I)V", "mAnchorView", "mContentView", "mContext", "mPopupWindow", "Lcom/larksuite/framework/ui/BasePopupWindow;", "mRootView", "mTextCorrection", "Landroid/widget/TextView;", "onApplyListener", "Landroid/view/View$OnClickListener;", "onDismissListener", "Landroid/widget/PopupWindow$OnDismissListener;", "onIgnoreListener", "dismiss", "", "initPopupWindow", "text", "", "setOnApplyClicked", "listener", "setOnDismissListener", "setOnIgnoreClicked", "show", "Landroid/widget/PopupWindow;", "correction", "updateBackground", "extendToTop", "", "posX", "", "posY", "contentX", "anchorViewLoc", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.a */
public final class CorrectionPanelFacade {

    /* renamed from: a */
    public static final Companion f71693a = new Companion(null);

    /* renamed from: b */
    private Context f71694b;

    /* renamed from: c */
    private BasePopupWindow f71695c;

    /* renamed from: d */
    private View f71696d;

    /* renamed from: e */
    private TextView f71697e;

    /* renamed from: f */
    private View f71698f;

    /* renamed from: g */
    private View f71699g;

    /* renamed from: h */
    private View.OnClickListener f71700h;

    /* renamed from: i */
    private View.OnClickListener f71701i;

    /* renamed from: j */
    private PopupWindow.OnDismissListener f71702j;

    /* renamed from: k */
    private int[] f71703k;

    /* renamed from: l */
    private int[] f71704l;

    /* renamed from: m */
    private int[] f71705m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/CorrectionPanelFacade$Companion;", "", "()V", "MAX_WINDOW_WIDTH_DP", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo101606a() {
        BasePopupWindow basePopupWindow = this.f71695c;
        if (basePopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        if (basePopupWindow != null) {
            BasePopupWindow basePopupWindow2 = this.f71695c;
            if (basePopupWindow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
            }
            if (basePopupWindow2.isShowing()) {
                BasePopupWindow basePopupWindow3 = this.f71695c;
                if (basePopupWindow3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
                }
                basePopupWindow3.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo101607a(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        this.f71700h = onClickListener;
    }

    /* renamed from: b */
    public final void mo101609b(View.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(onClickListener, "listener");
        this.f71701i = onClickListener;
    }

    /* renamed from: a */
    public final void mo101608a(PopupWindow.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(onDismissListener, "listener");
        this.f71702j = onDismissListener;
    }

    /* renamed from: b */
    private final void m104636b(String str) {
        View inflate = LayoutInflater.from(this.f71694b).inflate(R.layout.correction_panel_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(mCon…ction_panel_layout, null)");
        this.f71696d = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = inflate.findViewById(R.id.ll_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.ll_content)");
        this.f71699g = findViewById;
        View view = this.f71696d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view.findViewById(R.id.tv_text_correction);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.tv_text_correction)");
        TextView textView = (TextView) findViewById2;
        this.f71697e = textView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextCorrection");
        }
        textView.setText(str);
        View view2 = this.f71696d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        BasePopupWindow basePopupWindow = new BasePopupWindow(view2, -2, -2, true);
        this.f71695c = basePopupWindow;
        if (basePopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow.setBackgroundDrawable(new ColorDrawable(0));
        BasePopupWindow basePopupWindow2 = this.f71695c;
        if (basePopupWindow2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow2.setOutsideTouchable(true);
        BasePopupWindow basePopupWindow3 = this.f71695c;
        if (basePopupWindow3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow3.setFocusable(false);
        BasePopupWindow basePopupWindow4 = this.f71695c;
        if (basePopupWindow4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow4.setTouchable(true);
        BasePopupWindow basePopupWindow5 = this.f71695c;
        if (basePopupWindow5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow5.setAnimationStyle(R.style.ReactionPanelAnimation);
        TextView textView2 = this.f71697e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTextCorrection");
        }
        textView2.setOnClickListener(this.f71700h);
        View view3 = this.f71696d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ((ImageView) view3.findViewById(R.id.iv_ignore)).setOnClickListener(this.f71701i);
        BasePopupWindow basePopupWindow6 = this.f71695c;
        if (basePopupWindow6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow6.setOnDismissListener(this.f71702j);
    }

    /* renamed from: a */
    public final PopupWindow mo101605a(String str) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "correction");
        m104636b(str);
        View view = this.f71696d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(C57582a.m223601a(this.f71694b, (float) 280), Integer.MIN_VALUE), 0);
        int realScreenHeight = DeviceUtils.getRealScreenHeight(this.f71694b);
        int[] iArr = new int[2];
        this.f71698f.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        int[] iArr2 = this.f71705m;
        if (iArr2[0] > realScreenHeight - iArr2[1]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr3 = this.f71703k;
            i = (iArr3[0] + iArr3[1]) / 2;
        } else {
            int[] iArr4 = this.f71704l;
            i = (iArr4[0] + iArr4[1]) / 2;
        }
        float f = (float) 8;
        int coerceAtLeast = RangesKt.coerceAtLeast(i - UIUtils.dp2px(this.f71694b, 45.0f), C57582a.m223601a(this.f71694b, f));
        int screenWidth = DeviceUtils.getScreenWidth(this.f71694b);
        BasePopupWindow basePopupWindow = this.f71695c;
        if (basePopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        View contentView = basePopupWindow.getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "mPopupWindow.contentView");
        int coerceAtMost = RangesKt.coerceAtMost(coerceAtLeast, (screenWidth - contentView.getMeasuredWidth()) - C57582a.m223601a(this.f71694b, f));
        View view2 = this.f71699g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (z) {
                i2 = (realScreenHeight - i3) - ((this.f71705m[0] - iArr[1]) - UIUtils.dp2px(this.f71694b, 4.0f));
                View view3 = this.f71699g;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContentView");
                }
                view3.setPadding(0, 0, 0, UIUtils.dp2px(this.f71694b, 6.0f));
                layoutParams2.topMargin = UIUtils.getDimens(this.f71694b, R.dimen.dp_8);
                layoutParams2.bottomMargin = UIUtils.dp2px(this.f71694b, 1.0f);
            } else {
                i2 = (this.f71705m[1] - iArr[1]) + UIUtils.dp2px(this.f71694b, 4.0f) + i3;
                View view4 = this.f71699g;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContentView");
                }
                view4.setPadding(0, UIUtils.dp2px(this.f71694b, 6.0f), 0, 0);
                layoutParams2.bottomMargin = UIUtils.getDimens(this.f71694b, R.dimen.dp_8);
                layoutParams2.topMargin = UIUtils.dp2px(this.f71694b, 1.0f);
            }
            m104635a(z, i, i2, coerceAtMost, iArr);
            BasePopupWindow basePopupWindow2 = this.f71695c;
            if (basePopupWindow2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
            }
            basePopupWindow2.update();
            if (z) {
                BasePopupWindow basePopupWindow3 = this.f71695c;
                if (basePopupWindow3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
                }
                basePopupWindow3.showAtLocation(this.f71698f, 8388691, coerceAtMost, i2);
            } else {
                BasePopupWindow basePopupWindow4 = this.f71695c;
                if (basePopupWindow4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
                }
                basePopupWindow4.showAtLocation(this.f71698f, 8388659, coerceAtMost, i2);
            }
            BasePopupWindow basePopupWindow5 = this.f71695c;
            if (basePopupWindow5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
            }
            return basePopupWindow5;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public CorrectionPanelFacade(Context context, View view, int[] iArr, int[] iArr2, int[] iArr3) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        Intrinsics.checkParameterIsNotNull(iArr, "firstLineH");
        Intrinsics.checkParameterIsNotNull(iArr2, "lastLineH");
        Intrinsics.checkParameterIsNotNull(iArr3, "verticals");
        this.f71703k = iArr;
        this.f71704l = iArr2;
        this.f71705m = iArr3;
        this.f71694b = context;
        this.f71698f = view;
    }

    /* renamed from: a */
    private final void m104635a(boolean z, int i, int i2, int i3, int[] iArr) {
        C28543f fVar = new C28543f();
        fVar.mo101624a(new int[]{i3, iArr[1]});
        fVar.mo101626b(new int[]{i, i2});
        fVar.mo101632g(UIUtils.getDimens(this.f71694b, R.dimen.dp_8));
        BasePopupWindow basePopupWindow = this.f71695c;
        if (basePopupWindow == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        View contentView = basePopupWindow.getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView, "mPopupWindow.contentView");
        fVar.mo101630e(contentView.getMeasuredWidth());
        BasePopupWindow basePopupWindow2 = this.f71695c;
        if (basePopupWindow2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        View contentView2 = basePopupWindow2.getContentView();
        Intrinsics.checkExpressionValueIsNotNull(contentView2, "mPopupWindow.contentView");
        fVar.mo101631f(contentView2.getMeasuredHeight());
        fVar.mo101623a(!z);
        fVar.mo101636i(UIUtils.dp2px(this.f71694b, 6.0f));
        fVar.mo101635h(UIUtils.getDimens(this.f71694b, R.dimen.dp_14));
        fVar.mo101625b(UIUtils.getColor(this.f71694b, R.color.line_border_card));
        fVar.mo101627c(UIUtils.dp2px(this.f71694b, 1.0f));
        fVar.mo101628d(UIUtils.getColor(this.f71694b, R.color.bg_float));
        fVar.mo101622a(UIUtils.getColor(this.f71694b, R.color.bg_float));
        View view = this.f71699g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentView");
        }
        view.setBackground(fVar);
        BasePopupWindow basePopupWindow3 = this.f71695c;
        if (basePopupWindow3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPopupWindow");
        }
        basePopupWindow3.update();
    }
}
