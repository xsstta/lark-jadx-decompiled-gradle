package com.ss.android.vc.meeting.module.floatingwindow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.FloatBubble;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.AbstractC60877ac;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.floatingwindow.IFloatWindowPresent;
import com.ss.android.vc.meeting.module.follow.common.VCShadowLayout;
import com.ss.android.vc.statistics.event.C63742at;

public class GeneralFloatingWindow extends BaseFloatingWindow implements AbstractC61732e {

    /* renamed from: k */
    private FloatBubble f154777k;

    /* renamed from: l */
    private boolean f154778l;

    /* renamed from: m */
    private boolean f154779m;

    /* renamed from: n */
    private Boolean f154780n;

    @Override // com.ss.android.vc.meeting.module.floatingwindow.BaseFloatingWindow, com.ss.android.vc.meeting.module.floatingwindow.AbstractC61735h
    /* renamed from: p */
    public void mo213671p() {
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m240775w() {
        mo213666k();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m240776x() {
        mo213669n();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61732e
    /* renamed from: f */
    public View mo213580f() {
        if (this.f154769j) {
            return this.f154762c;
        }
        m240772t();
        return this.f154777k;
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61732e
    /* renamed from: q */
    public boolean mo213675q() {
        if (this.f154769j) {
            return this.f154778l;
        }
        FloatBubble floatBubble = this.f154777k;
        if (floatBubble == null || !floatBubble.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m240772t() {
        if (this.f154777k == null) {
            FloatBubble a = FloatBubble.m104274a(ar.m236697b(), (View) this.f154762c, this.f154779m);
            this.f154777k = a;
            if (a != null) {
                a.mo101311a(new FloatBubble.AbstractC28457b() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$ZWqMoU4tLh4GFx9ewA8BgtkORuM */

                    @Override // com.ss.android.floatbubble.FloatBubble.AbstractC28457b
                    public final void onDismiss() {
                        GeneralFloatingWindow.this.m240776x();
                    }
                });
                this.f154777k.mo101312a(new FloatBubble.AbstractC28458c() {
                    /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$9INR6eDD9fSsMH3xB6AmG51I8G0 */

                    @Override // com.ss.android.floatbubble.FloatBubble.AbstractC28458c
                    public final void onShow() {
                        GeneralFloatingWindow.this.m240775w();
                    }
                });
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m240773u() {
        if (this.f154778l) {
            C60700b.m235851b("GeneralFloatingWindow", "[removeAppFloatView]", "" + this.f154762c);
            this.f154778l = false;
            mo213669n();
            VideoChatModuleDependency.getMultiTaskDependency().mo196449a((AbstractC60877ac.AbstractC60878a) null);
            VideoChatModuleDependency.getMultiTaskDependency().mo196451b(this.f154762c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m240774v() {
        if (mo212181b() == null || !mo212181b().aE().mo208293c() || !mo212181b().aE().mo208292b()) {
            C60700b.m235851b("GeneralFloatingWindow", "[addAppFloatView]", "" + this.f154762c);
            VideoChatModuleDependency.getMultiTaskDependency().mo196449a(new AbstractC60877ac.AbstractC60878a() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$chUAI0lUUfgnyJe6PbjSaZnz0b0 */

                @Override // com.ss.android.vc.dependency.AbstractC60877ac.AbstractC60878a
                public final void onChanged(boolean z) {
                    GeneralFloatingWindow.this.m240770a((GeneralFloatingWindow) z);
                }
            });
            VideoChatModuleDependency.getMultiTaskDependency().mo196447a(this.f154762c);
            this.f154778l = true;
            mo213666k();
            return;
        }
        C60700b.m235851b("GeneralFloatingWindow", "[showFloatBubble]", "MeetingActivity active will not show float window");
        mo213669n();
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61732e
    /* renamed from: r */
    public boolean mo213676r() {
        C60700b.m235851b("GeneralFloatingWindow", "[showFloatBubble]", "" + this.f154762c);
        C63742at.m250087c(mo212181b().mo212056e(), true);
        if (this.f154769j) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$Z61zMIDqcEmxjZ_f60DjAep9W04 */

                public final void run() {
                    GeneralFloatingWindow.this.m240774v();
                }
            });
            return true;
        } else if (this.f154777k == null || mo213675q()) {
            return false;
        } else {
            this.f154777k.mo101313a(true);
            this.f154777k.mo101317c(1);
            this.f154777k.mo101315b(8388661);
            this.f154777k.mo101310a(0, SmEvents.EVENT_NE_RR);
            this.f154777k.mo101316b();
            return true;
        }
    }

    @Override // com.ss.android.vc.meeting.module.floatingwindow.AbstractC61732e
    /* renamed from: s */
    public void mo213677s() {
        C60700b.m235851b("GeneralFloatingWindow", "[dismissFloatBubble]", "" + this.f154769j);
        if (mo213675q()) {
            C63742at.m250087c(mo212181b().mo212056e(), false);
        }
        if (this.f154769j) {
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$sWxoqQj34ZvTZ9rcbANSot9cVug */

                public final void run() {
                    GeneralFloatingWindow.this.m240773u();
                }
            });
            return;
        }
        FloatBubble floatBubble = this.f154777k;
        if (floatBubble != null) {
            floatBubble.mo101314a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m240770a(boolean z) {
        Boolean bool = this.f154780n;
        if (bool == null || bool.booleanValue() != z) {
            C60700b.m235851b("GeneralFloatingWindow", "[adjustUI]", "refresh: " + z + ", " + this.f154780n);
            this.f154780n = Boolean.valueOf(z);
            C60735ab.m236001a(new Runnable(z) {
                /* class com.ss.android.vc.meeting.module.floatingwindow.$$Lambda$GeneralFloatingWindow$r0C_ND7y9JGxLR_qjfCVH3iflZ8 */
                public final /* synthetic */ boolean f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    GeneralFloatingWindow.this.m240771b((GeneralFloatingWindow) this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m240771b(boolean z) {
        View findViewById;
        if (this.f154762c != null && (findViewById = this.f154762c.findViewById(R.id.root_view)) != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                findViewById.setLayoutParams(layoutParams);
            }
            if (z) {
                if (mo212181b().mo212056e() == null || mo212181b().mo212056e().getVideoChatSettings() == null || mo212181b().mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
                    findViewById.setBackgroundResource(R.drawable.bg_float_view_2);
                    findViewById.setPadding(UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED), UIHelper.dp2px(BitmapDescriptorFactory.HUE_RED));
                    layoutParams.width = UIHelper.getDimens(R.dimen.fv_noshadow_width);
                    layoutParams.height = UIHelper.getDimens(R.dimen.fv_noshadow_height);
                    return;
                }
                VCShadowLayout vCShadowLayout = (VCShadowLayout) this.f154762c.findViewById(R.id.float_shadow);
                View findViewById2 = this.f154762c.findViewById(R.id.float_view_layout);
                if (findViewById2 != null) {
                    findViewById2.setBackground(C60773o.m236128f(R.drawable.bg_local_share_float_window));
                }
                if (vCShadowLayout != null) {
                    vCShadowLayout.setShadowRadius((float) UIHelper.dp2px(4.0f));
                } else {
                    C60700b.m235851b("GeneralFloatingWindow", "[adjustUI2]", "cannot find shadowLayout");
                }
            } else if (mo212181b().mo212056e() == null || mo212181b().mo212056e().getVideoChatSettings() == null || mo212181b().mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE) {
                findViewById.setBackgroundResource(R.drawable.bg_floatwindow);
                findViewById.setPadding(0, 0, 0, 0);
                int dp2px = UIHelper.dp2px(13.0f);
                layoutParams.width = UIHelper.getDimens(R.dimen.fv_width) - dp2px;
                layoutParams.height = UIHelper.getDimens(R.dimen.fv_height) - dp2px;
            } else {
                VCShadowLayout vCShadowLayout2 = (VCShadowLayout) this.f154762c.findViewById(R.id.float_shadow);
                View findViewById3 = this.f154762c.findViewById(R.id.float_view_layout);
                if (findViewById3 != null) {
                    findViewById3.setBackgroundColor(C60773o.m236126d(R.color.vc_bg_float_video));
                }
                if (vCShadowLayout2 != null) {
                    vCShadowLayout2.setShadowRadius(BitmapDescriptorFactory.HUE_RED);
                } else {
                    C60700b.m235851b("GeneralFloatingWindow", "[adjustUI3]", "cannot find shadowLayout");
                }
            }
        }
    }

    public GeneralFloatingWindow(C61303k kVar, boolean z) {
        super(kVar, IFloatWindowPresent.FloatWindowType.BUBBLE);
        this.f154779m = z;
        C60700b.m235851b("GeneralFloatingWindow", "[init]", "multiTaskFloating: " + this.f154769j);
        if (this.f154769j) {
            this.f154762c = new FrameLayout(ar.m236694a());
            return;
        }
        this.f154762c = (FrameLayout) LayoutInflater.from(ar.m236694a()).inflate(R.layout.window_meeting_new, (ViewGroup) null);
        m240772t();
    }
}
