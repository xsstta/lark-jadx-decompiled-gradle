package com.ss.android.vc.meeting.module.tab.history.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.MainTabItemView;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.module.foregroundservice.C61869a;
import com.ss.android.vc.meeting.module.tab.p3168a.C63224c;
import com.ss.android.vc.meeting.module.tab.widgets.C63323c;

public class VideoChatTabView extends MainTabItemView {

    /* renamed from: a */
    public int f159717a;

    /* renamed from: b */
    private C63224c f159718b;

    /* renamed from: f */
    private C61869a.AbstractC61872b f159719f;

    /* renamed from: c */
    public boolean mo137108c() {
        if (this.f159717a > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ Drawable m247988j() {
        return UDIconUtils.getIconDrawable(getContext(), R.drawable.ud_icon_tab_video_colorful);
    }

    @Override // com.ss.android.lark.widget.tab.MainTabItemView
    /* renamed from: b */
    public void mo110683b() {
        C60700b.m235851b("VideoChatTab_VideoChatTabView", "[handleTabUnSelected]", "handleTabUnSelected");
        super.mo110683b();
    }

    /* renamed from: e */
    private void m247986e() {
        C60700b.m235851b("VideoChatTab_VideoChatTabView", "[register]", "register");
        C63224c cVar = this.f159718b;
        if (cVar != null) {
            cVar.mo218815a();
        }
    }

    /* renamed from: i */
    private void m247987i() {
        C60700b.m235851b("VideoChatTab_VideoChatTabView", "[unRegister]", "unRegister");
        C63224c cVar = this.f159718b;
        if (cVar != null) {
            cVar.mo218817b();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m247986e();
        this.f159719f = new C61869a.AbstractC61872b() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatTabView.C633051 */

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: a */
            public long mo212168a() {
                return 3000;
            }

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: c */
            public boolean mo214251c() {
                return false;
            }

            @Override // com.ss.android.vc.meeting.module.foregroundservice.C61869a.AbstractC61872b
            /* renamed from: a */
            public void mo212169a(boolean z, long j) {
                C60700b.m235851b("VideoChatTab_VideoChatTabView", "[IdleHandlerManager]", "VCTabGuideComponent.startGuide");
                C63323c.m248039a().mo219111a(VideoChatTabView.this);
            }
        };
        C61869a.m241680a().mo214246a(this.f159719f);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m247987i();
        if (this.f159719f != null) {
            C61869a.m241680a().mo214248b(this.f159719f);
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: d */
    private void m247985d() {
        C60700b.m235851b("VideoChatTab_VideoChatTabView", "[initView]", "initView");
        setId(R.id.id_vc_tab);
        mo201235a(UDIconUtils.getIconDrawable(getContext(), (int) R.drawable.ud_icon_tab_video_filled, C60773o.m236126d(R.color.ud_N500)), new MainTabItemView.AbstractC59196a() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.$$Lambda$VideoChatTabView$kc9aymohP91uFaqTEH33acZWxhY */

            @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
            public final Drawable getDrawable() {
                return VideoChatTabView.this.m247988j();
            }
        });
        setTabTitle(getResources().getString(R.string.Lark_Legacy_VideoMeetingsSideBarNew));
        C63224c cVar = new C63224c(new C63224c.AbstractC63227a() {
            /* class com.ss.android.vc.meeting.module.tab.history.view.VideoChatTabView.C633062 */

            @Override // com.ss.android.vc.meeting.module.tab.p3168a.C63224c.AbstractC63227a
            /* renamed from: a */
            public void mo218820a(C59204a aVar) {
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
                layoutParams.f2815g = R.id.icon;
                layoutParams.f2813e = R.id.icon;
                layoutParams.f2816h = R.id.icon;
                layoutParams.f2818j = R.id.icon;
                VideoChatTabView.this.mo201236a(aVar, layoutParams);
            }

            @Override // com.ss.android.vc.meeting.module.tab.p3168a.C63224c.AbstractC63227a
            /* renamed from: a */
            public void mo218819a(int i) {
                C60700b.m235851b("VideoChatTab_VideoChatTabView", "[onShowRedDot]", "count= " + i);
                VideoChatTabView.this.f159717a = i;
                VideoChatTabView.this.mo201233a(i);
            }
        });
        this.f159718b = cVar;
        cVar.mo218816a(getContext());
    }

    public VideoChatTabView(Context context) {
        this(context, null);
    }

    public VideoChatTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoChatTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m247985d();
    }
}
