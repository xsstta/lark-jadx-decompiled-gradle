package com.bytedance.ee.bear.onboarding.view;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.onboarding.export.AbstractC10400d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0016JM\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\u0002\u0010 J \u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0018H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/CardOnBoardingDialog;", "Lcom/bytedance/ee/bear/onboarding/view/BaseOnBoardingDialog;", "activity", "Landroidx/fragment/app/FragmentActivity;", "currentActiveWindow", "Landroid/view/Window;", "(Landroidx/fragment/app/FragmentActivity;Landroid/view/Window;)V", "animView", "Lcom/bytedance/ee/bear/facade/common/widget/BearLottieView;", "closeView", "Landroid/view/View;", "confirmButton", "Landroid/widget/Button;", "hintTv", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "panel", "tipsLayout", "titleTv", "dismiss", "", "initView", "imageRes", "", "fileName", "", "title", "hint", "confirmButtonText", "onBoardingColorStyle", "Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/onboarding/export/OnBoardingColorStyle;)V", "setStyleColor", "bgColor", "shadowColor", "maskColor", "Companion", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.view.b */
public final class CardOnBoardingDialog extends AbstractDialogC10436a {

    /* renamed from: e */
    public static final String f28038e;

    /* renamed from: f */
    public static final Companion f28039f = new Companion(null);

    /* renamed from: g */
    private final TextView f28040g;

    /* renamed from: h */
    private final TextView f28041h;

    /* renamed from: i */
    private final Button f28042i;

    /* renamed from: j */
    private final View f28043j;

    /* renamed from: k */
    private final View f28044k;

    /* renamed from: l */
    private final View f28045l;

    /* renamed from: m */
    private final BearLottieView f28046m;

    /* renamed from: n */
    private final ImageView f28047n;

    /* renamed from: o */
    private final FragmentActivity f28048o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/onboarding/view/CardOnBoardingDialog$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo39710a() {
            return CardOnBoardingDialog.f28038e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = CardOnBoardingDialog.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "CardOnBoardingDialog::class.java.simpleName");
        f28038e = simpleName;
    }

    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    public void dismiss() {
        super.dismiss();
        if (this.f28046m.isAnimating()) {
            this.f28046m.cancelAnimation();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/CardOnBoardingDialog$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.b$b */
    public static final class C10442b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CardOnBoardingDialog f28049a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10442b(CardOnBoardingDialog bVar) {
            this.f28049a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f28049a.f28023b = true;
            AbstractC10400d.AbstractC10402b bVar = this.f28049a.f28025d;
            if (bVar != null) {
                bVar.mo39600a();
            }
            this.f28049a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/onboarding/view/CardOnBoardingDialog$initView$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "onboarding_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.b$c */
    public static final class C10443c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ CardOnBoardingDialog f28050a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10443c(CardOnBoardingDialog bVar) {
            this.f28050a = bVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f28050a.f28023b = true;
            AbstractC10400d.AbstractC10402b bVar = this.f28050a.f28025d;
            if (bVar != null) {
                bVar.mo39602b();
            }
            this.f28050a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.onboarding.view.b$d */
    public static final class View$OnClickListenerC10444d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC10444d f28051a = new View$OnClickListenerC10444d();

        View$OnClickListenerC10444d() {
        }

        public final void onClick(View view) {
            C13479a.m54772d(CardOnBoardingDialog.f28039f.mo39710a(), "clicked background ... ");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardOnBoardingDialog(FragmentActivity fragmentActivity, Window window) {
        super(fragmentActivity, window);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(window, "currentActiveWindow");
        this.f28048o = fragmentActivity;
        this.f28022a = LayoutInflater.from(fragmentActivity).inflate(R.layout.onboarding_card_onboarding, (ViewGroup) null);
        View findViewById = this.f28022a.findViewById(R.id.onBoarding_card_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "root.findViewById(R.id.onBoarding_card_title)");
        this.f28040g = (TextView) findViewById;
        View findViewById2 = this.f28022a.findViewById(R.id.onBoarding_card_hint);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "root.findViewById(R.id.onBoarding_card_hint)");
        this.f28041h = (TextView) findViewById2;
        View findViewById3 = this.f28022a.findViewById(R.id.onBoarding_card_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "root.findViewById(R.id.onBoarding_card_layout)");
        this.f28044k = findViewById3;
        View findViewById4 = this.f28022a.findViewById(R.id.onBoarding_card_fl_close);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "root.findViewById(R.id.onBoarding_card_fl_close)");
        this.f28043j = findViewById4;
        View findViewById5 = this.f28022a.findViewById(R.id.onBoarding_card_btn_confirm);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "root.findViewById(R.id.o…oarding_card_btn_confirm)");
        this.f28042i = (Button) findViewById5;
        View findViewById6 = this.f28022a.findViewById(R.id.onBoarding_card_tips_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "root.findViewById(R.id.o…oarding_card_tips_layout)");
        this.f28045l = findViewById6;
        View findViewById7 = this.f28022a.findViewById(R.id.onBoarding_card_anim_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "root.findViewById(R.id.onBoarding_card_anim_image)");
        this.f28046m = (BearLottieView) findViewById7;
        View findViewById8 = this.f28022a.findViewById(R.id.onBoarding_card_image);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "root.findViewById(R.id.onBoarding_card_image)");
        this.f28047n = (ImageView) findViewById8;
        this.f28022a.setBackgroundColor(C25653b.m91893a(C13749l.m55755c(getContext(), R.color.static_black), 0.2f));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.onboarding.view.AbstractDialogC10436a
    /* renamed from: a */
    public void mo39697a(int i, int i2, int i3) {
        this.f28022a.setBackgroundColor(i3);
        this.f28045l.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f28042i.setTextColor(i);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f28044k.setOutlineSpotShadowColor(i2);
            this.f28044k.setOutlineAmbientShadowColor(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39709a(java.lang.Integer r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle r8) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.onboarding.view.CardOnBoardingDialog.mo39709a(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ee.bear.onboarding.export.OnBoardingColorStyle):void");
    }
}
