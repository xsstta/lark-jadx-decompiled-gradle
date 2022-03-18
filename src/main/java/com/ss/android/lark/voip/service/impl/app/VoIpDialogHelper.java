package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.voip.C57977a;
import com.ss.android.lark.voip.service.impl.C58151d;
import com.ss.android.lark.widget.floatwindow.C58452b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.module.fastentry.ActivityFloatingView;
import com.ss.ttm.player.MediaPlayer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VoIpDialogHelper {

    /* renamed from: c */
    private static VoIpDialogHelper f142756c;

    /* renamed from: a */
    public Context f142757a = C57977a.m224905c().getContext();

    /* renamed from: b */
    public TextView f142758b;

    /* renamed from: d */
    private int f142759d;

    /* renamed from: e */
    private WindowManager f142760e;

    /* renamed from: f */
    private WindowManager.LayoutParams f142761f;

    /* renamed from: g */
    private View f142762g;

    /* renamed from: h */
    private boolean f142763h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PLAN {
    }

    /* renamed from: b */
    public boolean mo196763b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo196764c() {
        return this.f142763h;
    }

    /* renamed from: a */
    public static VoIpDialogHelper m225111a() {
        if (f142756c == null) {
            f142756c = new VoIpDialogHelper();
        }
        return f142756c;
    }

    /* renamed from: j */
    private void m225118j() {
        ActivityFloatingView.m240633b().removeView();
        this.f142762g = null;
    }

    /* renamed from: d */
    public void mo196765d() {
        C58151d.m225577a("VoIpDialogHelper", "wakeUpActivity");
        View view = this.f142762g;
        if (view != null) {
            view.callOnClick();
        }
    }

    private VoIpDialogHelper() {
        m225114f();
    }

    /* renamed from: h */
    private void m225116h() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = C60776r.m236148f();
        ActivityFloatingView.m240633b().mo213568a(this.f142762g, layoutParams);
    }

    /* renamed from: i */
    private void m225117i() {
        View view;
        if (this.f142760e != null && (view = this.f142762g) != null && view.isAttachedToWindow()) {
            try {
                this.f142760e.removeViewImmediate(this.f142762g);
                this.f142762g = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public void mo196766e() {
        this.f142763h = false;
        if (this.f142759d == 2) {
            C58151d.m225578a("ui", "ui", "dismiss activity view", "[VoIpDialogHelper] dismiss: activity view");
            m225118j();
            return;
        }
        C58151d.m225578a("ui", "ui", "dismiss window", "[VoIpDialogHelper] dismiss: window");
        m225117i();
    }

    /* renamed from: g */
    private void m225115g() {
        if (this.f142762g == null) {
            this.f142762g = LayoutInflater.from(this.f142757a).inflate(R.layout.dialog_voip_layout, (ViewGroup) null);
        }
        this.f142762g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpDialogHelper.View$OnClickListenerC580332 */

            public void onClick(View view) {
                C58151d.m225578a("ui", "ui", "stop VoIpDialogHelper", "[VoIpDialogHelper] onStop: ");
                C58103o.m225371a().mo196944c(VoIpDialogHelper.this.f142757a);
                VoIpDialogHelper.this.mo196766e();
            }
        });
        this.f142758b = (TextView) this.f142762g.findViewById(R.id.tips);
    }

    /* renamed from: f */
    private void m225114f() {
        if (C58452b.m226635a(this.f142757a)) {
            this.f142759d = 0;
        } else if (Build.VERSION.SDK_INT >= 25) {
            this.f142759d = 2;
        } else if (RomUtils.m94950f()) {
            this.f142759d = 1;
        } else {
            this.f142759d = 2;
        }
        C58151d.m225578a("ui", "ui", "initPlan: " + this.f142759d, "[VoIpDialogHelper] initPlan: " + this.f142759d);
    }

    /* renamed from: a */
    public void mo196761a(final long j) {
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.voip.service.impl.app.VoIpDialogHelper.RunnableC580321 */

            public void run() {
                if (VoIpDialogHelper.this.f142758b == null) {
                    return;
                }
                if (j >= 3600) {
                    TextView textView = VoIpDialogHelper.this.f142758b;
                    textView.setText(VoIpDialogHelper.this.f142757a.getResources().getString(R.string.View_G_BackToCall) + String.format(" %d:%02d:%02d", Long.valueOf(j / 3600), Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)));
                    return;
                }
                TextView textView2 = VoIpDialogHelper.this.f142758b;
                textView2.setText(VoIpDialogHelper.this.f142757a.getResources().getString(R.string.View_G_BackToCall) + String.format(" %02d:%02d", Long.valueOf((j % 3600) / 60), Long.valueOf(j % 60)));
            }
        });
    }

    /* renamed from: a */
    public void mo196762a(Context context) {
        C58151d.m225578a("ui", "ui", "show float voip dialog", "[VoIpDialogHelper] show: float voip dialog");
        m225115g();
        m225114f();
        this.f142763h = true;
        m225113b(context);
    }

    /* renamed from: b */
    private void m225113b(Context context) {
        C58151d.m225578a("ui", "ui", "showDingDialogDelegate plan: " + this.f142759d, "[VoIpDialogHelper] showDingDialogDelegate plan: " + this.f142759d);
        try {
            int i = this.f142759d;
            if (i == 0) {
                m225112a(true);
            } else if (i == 1) {
                m225112a(false);
            } else if (i == 2) {
                m225116h();
            }
        } catch (Exception e) {
            C58151d.m225579b("ui", "ui", "showDingDialogDelegate error", "[VoIpDialogHelper] showDingDialogDelegate error: " + e.toString());
        }
    }

    /* renamed from: a */
    private void m225112a(boolean z) {
        if (this.f142760e == null) {
            this.f142760e = (WindowManager) this.f142757a.getSystemService("window");
        }
        if (this.f142761f == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.f142761f = layoutParams;
            if (!z) {
                layoutParams.type = 2005;
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.f142761f.type = 2038;
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.f142761f.type = 2005;
            } else {
                this.f142761f.type = 2003;
            }
            this.f142761f.format = 1;
            this.f142761f.windowAnimations = R.style.AnimBottom;
            this.f142761f.flags = 8;
            this.f142761f.flags |= 262144;
            this.f142761f.flags |= MediaPlayer.MEDIA_PLAYER_OPTION_APPID;
            this.f142761f.alpha = 1.0f;
            this.f142761f.gravity = 49;
            this.f142761f.x = 0;
            this.f142761f.y = 0;
            this.f142761f.width = -1;
            this.f142761f.height = -2;
        }
        this.f142760e.addView(this.f142762g, this.f142761f);
    }
}
