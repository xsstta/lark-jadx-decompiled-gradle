package com.ss.android.vc.meeting.module.follow.p3120a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.module.follow.common.C61805a;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.e */
public class C61763e extends FrameLayout {

    /* renamed from: a */
    private TextView f154982a;

    /* renamed from: b */
    private TextView f154983b;

    /* renamed from: c */
    private TextView f154984c;

    /* renamed from: d */
    private TextView f154985d;

    /* renamed from: e */
    private TextView f154986e;

    /* renamed from: f */
    private TextView f154987f;

    /* renamed from: g */
    private IconFontView f154988g;

    /* renamed from: h */
    private AbstractC61769l f154989h;

    /* renamed from: i */
    private C61805a f154990i;

    /* renamed from: j */
    private Context f154991j;

    /* renamed from: k */
    private View f154992k;

    /* renamed from: c */
    public void mo213970c() {
        m241170a(this.f154983b);
        m241170a(this.f154982a);
    }

    /* renamed from: a */
    public void mo213964a() {
        C61805a aVar = this.f154990i;
        if (aVar != null) {
            aVar.mo211398c();
            this.f154990i = null;
        }
    }

    /* renamed from: d */
    private void m241175d() {
        this.f154982a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$JuIhl_AaorYX4TzbaITPADzoYPQ */

            public final void onClick(View view) {
                C61763e.this.m241179g(view);
            }
        });
        this.f154983b.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$2MSGqy7sKD6XO3h2Vym1ERmDFEk */

            public final void onClick(View view) {
                C61763e.this.m241178f(view);
            }
        });
        this.f154988g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$1TysGhSiTVaLNB4bX2h8Go7MXh4 */

            public final void onClick(View view) {
                C61763e.this.m241177e(view);
            }
        });
        this.f154985d.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$Pct2ZhohjnP2xe83GhN45LoDPo */

            public final void onClick(View view) {
                C61763e.this.m241176d(view);
            }
        });
    }

    /* renamed from: b */
    public void mo213968b() {
        this.f154982a.setVisibility(0);
        this.f154983b.setVisibility(8);
        if (!C61999a.m242220f()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f154985d.getLayoutParams();
            marginLayoutParams.rightMargin = C60773o.m236115a(12.0d);
            this.f154985d.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m241173b(View view) {
        this.f154989h.mo213990m();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m241174c(View view) {
        this.f154989h.mo213991n();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m241177e(View view) {
        this.f154989h.mo213982e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m241178f(View view) {
        this.f154989h.mo213980c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m241179g(View view) {
        this.f154989h.mo213978b();
    }

    /* renamed from: a */
    private void m241170a(View view) {
        view.setOnHoverListener(new View.OnHoverListener(view) {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$VqWDOvmKB8tmQuoFxhp29nDNhKE */
            public final /* synthetic */ View f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return C61763e.m241172a(this.f$0, view, motionEvent);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m241176d(View view) {
        C61805a aVar = (C61805a) C61805a.m241458a(this.f154991j, this.f154989h).mo219699g();
        this.f154990i = aVar;
        if (aVar != null) {
            aVar.mo214103a(this.f154985d);
        }
    }

    public void setTopBtnMinWidth(boolean z) {
        int i;
        if (DesktopUtil.m144307b() || z) {
            i = 0;
        } else {
            i = (int) (((double) C60776r.m236139a()) * 0.18d);
        }
        this.f154982a.setMinWidth(i);
        this.f154983b.setMinWidth(i);
    }

    /* renamed from: a */
    private void m241171a(ViewGroup viewGroup) {
        this.f154982a = (TextView) viewGroup.findViewById(R.id.agent_follow_action_stop_sharing);
        this.f154983b = (TextView) viewGroup.findViewById(R.id.agent_follow_action_to_presenter);
        this.f154987f = (TextView) viewGroup.findViewById(R.id.agent_follow_action_takecontrol_tool);
        this.f154986e = (TextView) viewGroup.findViewById(R.id.agent_follow_action_passsharing_tool);
        this.f154988g = (IconFontView) viewGroup.findViewById(R.id.follow_icon_back);
        this.f154984c = (TextView) viewGroup.findViewById(R.id.follow_share_title);
        this.f154985d = (TextView) viewGroup.findViewById(R.id.agent_follow_action_more);
    }

    /* renamed from: b */
    public void mo213969b(boolean z) {
        int i;
        TextView textView = this.f154983b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (C61999a.m242220f()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f154985d.getLayoutParams();
            marginLayoutParams.rightMargin = 0;
            this.f154985d.setLayoutParams(marginLayoutParams);
        } else if (this.f154983b.getVisibility() == 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f154985d.getLayoutParams();
            marginLayoutParams2.rightMargin = 0;
            this.f154985d.setLayoutParams(marginLayoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f154985d.getLayoutParams();
            marginLayoutParams3.rightMargin = C60773o.m236115a(12.0d);
            this.f154985d.setLayoutParams(marginLayoutParams3);
        }
    }

    /* renamed from: a */
    public void mo213965a(int i) {
        int i2;
        IconFontView iconFontView = this.f154988g;
        if (iconFontView != null) {
            if (i > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            iconFontView.setVisibility(i2);
        }
    }

    /* renamed from: c */
    public void mo213971c(boolean z) {
        if (!this.f154989h.mo213981d()) {
            this.f154986e.setVisibility(8);
            this.f154987f.setVisibility(8);
        } else if (z) {
            if (ParticipantUtil.m248737e(this.f154989h.mo213988k().mo212091I().mo212494b().mo212601f()).size() > 1) {
                this.f154986e.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) this.f154992k.findViewById(R.id.agent_follow_action_right_container);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.leftMargin = C60773o.m236115a(12.0d);
                viewGroup.setLayoutParams(marginLayoutParams);
            } else {
                this.f154986e.setVisibility(8);
                ViewGroup viewGroup2 = (ViewGroup) this.f154992k.findViewById(R.id.agent_follow_action_right_container);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams();
                marginLayoutParams2.leftMargin = 0;
                viewGroup2.setLayoutParams(marginLayoutParams2);
            }
            this.f154987f.setVisibility(8);
            this.f154986e.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$PVVjKSWqDiGrW2tSshkP9P2jPT0 */

                public final void onClick(View view) {
                    C61763e.this.m241174c((C61763e) view);
                }
            });
        } else {
            this.f154986e.setVisibility(8);
            this.f154987f.setVisibility(0);
            this.f154987f.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$e$U9qVD5T4VdxakBzXAUFgoDKZcsY */

                public final void onClick(View view) {
                    C61763e.this.m241173b((C61763e) view);
                }
            });
        }
        if (z) {
            mo213968b();
        } else {
            mo213967a(false);
            mo213969b(this.f154989h.mo213988k().ab().mo213896v());
        }
        C61805a aVar = this.f154990i;
        if (aVar != null) {
            aVar.mo211398c();
            this.f154990i = null;
        }
    }

    /* renamed from: a */
    public void mo213966a(String str) {
        TextView textView = this.f154984c;
        if (textView != null) {
            textView.setText(str);
            this.f154984c.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo213967a(boolean z) {
        int i;
        TextView textView = this.f154982a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public C61763e(Context context, ViewGroup viewGroup, AbstractC61769l lVar) {
        super(context);
        this.f154989h = lVar;
        this.f154991j = context;
        m241171a(viewGroup);
        m241175d();
        this.f154992k = viewGroup;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m241172a(View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            view.setPressed(true);
            view.setHovered(true);
            return true;
        } else if (motionEvent.getAction() != 10) {
            return false;
        } else {
            view.setPressed(false);
            view.setHovered(false);
            return true;
        }
    }
}
