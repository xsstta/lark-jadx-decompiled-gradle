package com.ss.android.vc.meeting.module.follow.common;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28459a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.utils.popup.AbstractC63524a;

public class FollowOnBoardingPopupView extends AbstractC63524a<FollowOnBoardingPopupView> {

    /* renamed from: a */
    private Type f155116a;

    /* renamed from: b */
    private TextView f155117b;

    /* renamed from: c */
    private Handler f155118c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private View f155119d;

    /* renamed from: p */
    private View f155120p;

    /* renamed from: q */
    private ImageView f155121q;

    /* renamed from: r */
    private ImageView f155122r;

    /* renamed from: s */
    private ImageView f155123s;

    public enum Type {
        VERTICAL_FREE_BROWSE,
        HORIZONTAL_FREE_BROWSE,
        VERTICAL_TO_PRESENTER,
        HORIZONTAL_TO_PRESENTER,
        TO_PRESENTER_GUEST_MODE,
        VERTICAL_GO_BACK,
        HORIZONTAL_GO_BACK
    }

    private FollowOnBoardingPopupView() {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.utils.popup.AbstractC63524a
    /* renamed from: a */
    public void mo211394a() {
        mo219686a(R.layout.follow_onboarding_layout);
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
            C60700b.m235851b("FollowLog_FollowOnBoardingPopupVi", "[dismiss]", e.getMessage());
        }
        this.f155118c.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$1 */
    static /* synthetic */ class C618031 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155124a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a = r0
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.HORIZONTAL_FREE_BROWSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.VERTICAL_FREE_BROWSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.VERTICAL_TO_PRESENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.HORIZONTAL_TO_PRESENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.VERTICAL_GO_BACK     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.f155124a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView$Type r1 = com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.Type.HORIZONTAL_GO_BACK     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.follow.common.FollowOnBoardingPopupView.C618031.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo214088a(Type type) {
        this.f155116a = type;
    }

    /* renamed from: a */
    public static FollowOnBoardingPopupView m241448a(Context context) {
        return new FollowOnBoardingPopupView(context);
    }

    private FollowOnBoardingPopupView(Context context) {
        mo219694b(context);
    }

    /* renamed from: a */
    public void mo214089a(String str) {
        TextView textView = this.f155117b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public void mo214086a(View view) {
        if (view == null) {
            C60700b.m235851b("FollowLog_FollowOnBoardingPopupVi", "[show]", "anchor view is null");
            return;
        }
        switch (C618031.f155124a[this.f155116a.ordinal()]) {
            case 1:
            case 2:
                this.f155121q.setVisibility(0);
                this.f155123s.setVisibility(8);
                mo219697b(view, 17, 0, (mo219703k().getMeasuredHeight() / 2) - (mo219703k().findViewById(R.id.follow_onboarding_tips_up_click_circle).getMeasuredHeight() / 2));
                return;
            case 3:
            case 4:
                this.f155119d.setVisibility(8);
                this.f155121q.setVisibility(8);
                this.f155123s.setVisibility(0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f155123s.getLayoutParams();
                layoutParams.gravity = 8388613;
                layoutParams.rightMargin = C28459a.m104293b(ar.m236694a(), 37);
                this.f155123s.setLayoutParams(layoutParams);
                mo219690a(view, 1, 0);
                return;
            case 5:
            case 6:
                this.f155119d.setVisibility(8);
                this.f155121q.setVisibility(8);
                this.f155123s.setVisibility(0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f155123s.getLayoutParams();
                layoutParams2.gravity = 8388611;
                layoutParams2.leftMargin = C28459a.m104293b(ar.m236694a(), 7);
                this.f155123s.setLayoutParams(layoutParams2);
                mo219690a(view, 1, 0);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211396a(View view, FollowOnBoardingPopupView followOnBoardingPopupView) {
        this.f155117b = (TextView) mo219693b(R.id.follow_onboarding_tips_text);
        this.f155119d = mo219693b(R.id.follow_onboarding_tips_up_click_circle);
        this.f155120p = mo219693b(R.id.follow_onboarding_tips_left_click_circle);
        this.f155121q = (ImageView) mo219693b(R.id.follow_tips_up_arrow);
        this.f155122r = (ImageView) mo219693b(R.id.follow_tips_left_arrow);
        this.f155123s = (ImageView) mo219693b(R.id.follow_tips_down_arrow);
    }
}
