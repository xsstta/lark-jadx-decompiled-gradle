package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60902q;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.p */
public class C62271p extends AbstractC63524a<C62271p> {

    /* renamed from: c */
    private static final AbstractC60902q f156442c = VideoChatModule.getDependency().getGuideDependency();

    /* renamed from: a */
    private TextView f156443a;

    /* renamed from: b */
    private ImageView f156444b;

    private C62271p() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.labs_entry_onboarding_layout);
        mo219688a(true);
        mo219695b(false);
    }

    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: c */
    public void mo211398c() {
        try {
            if (mo219704l()) {
                super.mo211398c();
            }
        } catch (Exception e) {
            C60700b.m235851b("LabsOnBoardingView", "[dismiss]", e.getMessage());
        }
    }

    private C62271p(Context context) {
        mo219694b(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m243199d(View view) {
        ((C62271p) new C62271p(view.getContext()).mo219699g()).m243198c(view);
    }

    /* renamed from: a */
    public static void m243197a(View view) {
        AbstractC60902q qVar = f156442c;
        boolean checkToShow = qVar.checkToShow("mobile_vc_beautyandfilterandanimoji");
        C60700b.m235851b("LabsOnBoardingView", "[checkLabsOnBoarding]", "shouldShowAtTip= " + checkToShow);
        if (checkToShow) {
            view.post(new Runnable(view) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$p$yMW67_5WWJWnj5JHWViY6T32i84 */
                public final /* synthetic */ View f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C62271p.lambda$yMW67_5WWJWnj5JHWViY6T32i84(this.f$0);
                }
            });
            qVar.completeGuide("mobile_vc_beautyandfilterandanimoji", true);
        }
    }

    /* renamed from: c */
    private void m243198c(View view) {
        if (view == null) {
            C60700b.m235851b("LabsOnBoardingView", "[showInner]", "anchor view is null");
            return;
        }
        this.f156443a.setMaxWidth((DeviceUtils.getScreenWidth(view.getContext()) - UIHelper.dp2px(32.0f)) - view.getWidth());
        mo219692a(view, 0, 1, view.getWidth() / 3, -UIHelper.dp2px(4.0f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, C62271p pVar) {
        this.f156443a = (TextView) mo219693b(R.id.tips_text);
        this.f156444b = (ImageView) mo219693b(R.id.right_arrow);
        if (this.f156443a.getBackground() instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.f156443a.getBackground();
            gradientDrawable.setCornerRadius((float) UIHelper.dp2px(8.0f));
            gradientDrawable.setColor(C60773o.m236126d(R.color.ud_B400));
        }
        this.f156444b.setColorFilter(C60773o.m236126d(R.color.ud_B400), PorterDuff.Mode.SRC_ATOP);
        if (LabsUtils.m242918j()) {
            this.f156443a.setText(R.string.View_G_EffectsOnboardingMobileLark);
        } else {
            this.f156443a.setText(R.string.View_G_EffectsOnboardingMobile);
        }
    }
}
