package com.ss.android.lark.guide.biz.p1915a.p1920c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.C1733a;
import com.airbnb.lottie.C1868o;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.common.popup.GuidePopupBuilder;
import com.ss.android.lark.guide.ui.common.popup.HighlightHandler;
import com.ss.android.lark.guide.ui.common.popup.IGuide;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.ImageConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.guide.biz.a.c.b */
public class C38576b {

    /* renamed from: a */
    public boolean f99119a;

    /* renamed from: b */
    public GuideDelegate f99120b;

    /* renamed from: com.ss.android.lark.guide.biz.a.c.b$a */
    public static class C38582a {

        /* renamed from: a */
        public static C38576b f99130a = new C38576b();
    }

    /* renamed from: a */
    public static /* synthetic */ Rect m152146a(Rect rect, Rect rect2) {
        return rect;
    }

    private C38576b() {
    }

    /* renamed from: a */
    public static C38576b m152148a() {
        return C38582a.f99130a;
    }

    /* renamed from: b */
    public boolean mo141330b() {
        GuideDelegate gVar = this.f99120b;
        if (gVar == null || !gVar.mo141658a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private View m152147a(final Context context) {
        final LKUILottieAnimationView lKUILottieAnimationView = new LKUILottieAnimationView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C57582a.m223600a(240), C57582a.m223600a(146));
        layoutParams.gravity = 17;
        lKUILottieAnimationView.setLayoutParams(layoutParams);
        lKUILottieAnimationView.setRepeatCount(-1);
        lKUILottieAnimationView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b.View$OnAttachStateChangeListenerC385782 */

            public void onViewAttachedToWindow(View view) {
                lKUILottieAnimationView.playAnimation();
            }

            public void onViewDetachedFromWindow(View view) {
                lKUILottieAnimationView.pauseAnimation();
            }
        });
        lKUILottieAnimationView.setAnimation("ug/switch_tenant_animation.json.zip");
        C1868o oVar = new C1868o(lKUILottieAnimationView);
        oVar.mo9313a("{{TEAM_1}}", context.getString(R.string.Lark_Guide_SwitchTeamsGifTeam1));
        oVar.mo9313a("{{TEAM_2}}", context.getString(R.string.Lark_Guide_SwitchTeamsGifTeam2));
        oVar.mo9313a("{{JC_TEAM}}", context.getString(R.string.Lark_Guide_SwitchTeamsGifTeamJoinOrCreate));
        lKUILottieAnimationView.setTextDelegate(oVar);
        lKUILottieAnimationView.setFontAssetDelegate(new C1733a() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b.C385793 */

            @Override // com.airbnb.lottie.C1733a
            /* renamed from: a */
            public Typeface mo8928a(String str) {
                try {
                    return Typeface.createFromAsset(context.getAssets(), str);
                } catch (Exception unused) {
                    return Typeface.DEFAULT;
                }
            }
        });
        return lKUILottieAnimationView;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m152149a(View.OnClickListener onClickListener, View view) {
        this.f99119a = true;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: a */
    public void mo141327a(View view, Activity activity, final View.OnClickListener onClickListener) {
        GuideDelegate gVar = this.f99120b;
        if (gVar == null || !gVar.mo141658a()) {
            String string = UIHelper.getString(R.string.Lark_Guide_SwitchTeamsMessageAfterTip);
            String string2 = UIHelper.getString(R.string.Lark_Guide_SwitchTeamsButtonGotIt);
            View a = m152147a(activity);
            ButtonBubbleConfig dVar = new ButtonBubbleConfig(new AnchorConfig(view, AnchorConfig.AnchorGravity.END, new Point()), new MaskConfig(76, 10.0f, MaskConfig.ShapeType.CIRCLE, null, null), null, string, new ImageConfig(a), null, new ButtonConfig(string2, new ButtonConfig.ButtonAction() {
                /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b.C385771 */

                @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
                public void onClick(View view, GuideDelegate gVar) {
                    gVar.mo141659b();
                    View.OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (C38576b.this.f99120b != null) {
                        C38576b.this.f99120b = null;
                    }
                    OnboardingHitPoint.f99379a.mo141633j();
                }
            }));
            dVar.mo141757a((Boolean) false);
            dVar.mo141759b(false);
            this.f99120b = GuideComponent.m152612a(activity, dVar);
            OnboardingHitPoint.f99379a.mo141631i();
            return;
        }
        Log.m165389i("TenantPickGuide", "showTenantSwitchGuidanceV3 -> Guide is showing.");
    }

    /* renamed from: a */
    public void mo141328a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener) {
        IGuide a = new GuidePopupBuilder().mo141718a(new C38574a(view, str, str2, new View.OnClickListener(onClickListener) {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.$$Lambda$b$NQdHKRDK51Nw2o5cgK28VNoz9mk */
            public final /* synthetic */ View.OnClickListener f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C38576b.lambda$NQdHKRDK51Nw2o5cgK28VNoz9mk(C38576b.this, this.f$1, view);
            }
        })).mo141716a(view).mo141721a(true).mo141724b(0).mo141715a(76).mo141722a(true, activity).mo141725b(true).mo141719a(new HighlightHandler() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b.C385804 */

            @Override // com.ss.android.lark.guide.ui.common.popup.HighlightHandler
            public Rect computeHighlightArea(Rect rect) {
                return rect;
            }
        }).mo141728d(0).mo141721a(false).mo141723a();
        if (a != null) {
            a.mo141707b();
        }
    }

    /* renamed from: a */
    public void mo141329a(View view, Rect rect, String str, String str2, final View.OnClickListener onClickListener) {
        IGuide a;
        if (this.f99119a && (a = new GuidePopupBuilder().mo141718a(new C38583c(view, rect, str, str2, new View.OnClickListener() {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.C38576b.View$OnClickListenerC385815 */

            public void onClick(View view) {
                C38576b.this.f99119a = false;
                View.OnClickListener onClickListener = onClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        })).mo141716a(view).mo141721a(true).mo141724b(0).mo141715a(76).mo141722a(true, (Activity) view.getContext()).mo141725b(true).mo141719a(new HighlightHandler(rect) {
            /* class com.ss.android.lark.guide.biz.p1915a.p1920c.$$Lambda$b$NlaOvm1Jh57qzd844FZ3a9hfiFM */
            public final /* synthetic */ Rect f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.guide.ui.common.popup.HighlightHandler
            public final Rect computeHighlightArea(Rect rect) {
                return C38576b.lambda$NlaOvm1Jh57qzd844FZ3a9hfiFM(this.f$0, rect);
            }
        }).mo141728d(1).mo141726c(UIHelper.dp2px(2.0f)).mo141721a(false).mo141723a()) != null) {
            a.mo141707b();
        }
    }
}
