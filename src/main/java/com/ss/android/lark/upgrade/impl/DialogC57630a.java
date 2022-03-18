package com.ss.android.lark.upgrade.impl;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.enity.UpgradeInfo;
import com.ss.android.lark.upgrade.p2895c.AbstractC57625c;
import com.ss.android.lark.upgrade.p2896d.C57626a;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;

/* renamed from: com.ss.android.lark.upgrade.impl.a */
public class DialogC57630a extends BaseDialog {

    /* renamed from: A */
    private View f141996A;

    /* renamed from: B */
    private View f141997B;

    /* renamed from: C */
    private View f141998C;

    /* renamed from: D */
    private View f141999D;

    /* renamed from: E */
    private AbstractC57625c f142000E;

    /* renamed from: F */
    private FrameLayout f142001F;

    /* renamed from: G */
    private FrameLayout f142002G;

    /* renamed from: H */
    private FrameLayout f142003H;

    /* renamed from: I */
    private FrameLayout f142004I;

    /* renamed from: J */
    private FrameLayout f142005J;

    /* renamed from: a */
    public Context f142006a;

    /* renamed from: b */
    public boolean f142007b = false;

    /* renamed from: c */
    public UpgradeInfo f142008c;

    /* renamed from: d */
    public String f142009d;

    /* renamed from: e */
    public long f142010e;

    /* renamed from: f */
    ValueAnimator f142011f;

    /* renamed from: g */
    private String f142012g;

    /* renamed from: h */
    private String f142013h;

    /* renamed from: i */
    private ProgressBar f142014i;

    /* renamed from: j */
    private TextView f142015j;

    /* renamed from: k */
    private TextView f142016k;

    /* renamed from: l */
    private TextView f142017l;

    /* renamed from: m */
    private TextView f142018m;

    /* renamed from: n */
    private TextView f142019n;

    /* renamed from: o */
    private TextView f142020o;

    /* renamed from: p */
    private TextView f142021p;

    /* renamed from: q */
    private TextView f142022q;

    /* renamed from: r */
    private TextView f142023r;

    /* renamed from: s */
    private TextView f142024s;

    /* renamed from: t */
    private LinearLayout f142025t;

    /* renamed from: u */
    private LinearLayout f142026u;

    /* renamed from: v */
    private LinearLayout f142027v;

    /* renamed from: w */
    private LinearLayout f142028w;

    /* renamed from: x */
    private LinearLayout f142029x;

    /* renamed from: y */
    private LinearLayout f142030y;

    /* renamed from: z */
    private LinearLayout f142031z;

    /* renamed from: h */
    private ViewGroup m223778h() {
        return this.f142001F;
    }

    /* renamed from: i */
    private ViewGroup m223779i() {
        return this.f142002G;
    }

    /* renamed from: j */
    private ViewGroup m223780j() {
        return this.f142003H;
    }

    /* renamed from: k */
    private ViewGroup m223781k() {
        return this.f142004I;
    }

    /* renamed from: l */
    private ViewGroup m223782l() {
        return this.f142005J;
    }

    /* renamed from: q */
    private void m223787q() {
        m223788r();
    }

    /* renamed from: a */
    public void mo195689a() {
        m223784n();
    }

    /* renamed from: r */
    private void m223788r() {
        if (this.f142000E == null) {
            this.f142000E = new AbstractC57625c() {
                /* class com.ss.android.lark.upgrade.impl.DialogC57630a.C576377 */

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: a */
                public void mo195616a(long j) {
                    DialogC57630a.this.f142010e = 0;
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.upgrade.impl.DialogC57630a.C576377.RunnableC576381 */

                        public void run() {
                            DialogC57630a.this.cancel();
                        }
                    });
                }

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: b */
                public void mo195617b(long j) {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.upgrade.impl.DialogC57630a.C576377.RunnableC576392 */

                        public void run() {
                            if (DialogC57630a.this.isShowing()) {
                                DialogC57630a.this.mo195698g();
                            }
                        }
                    });
                }

                @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57625c
                /* renamed from: a */
                public void mo195615a(int i, final long j, final long j2) {
                    long j3 = (long) i;
                    if (DialogC57630a.this.f142010e < j3) {
                        DialogC57630a.this.mo195693b(i);
                        UICallbackExecutor.execute(new Runnable() {
                            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.C576377.RunnableC576403 */

                            public void run() {
                                DialogC57630a aVar = DialogC57630a.this;
                                aVar.mo195691a(DialogC57630a.this.mo195688a(j) + "/" + DialogC57630a.this.mo195688a(j2));
                            }
                        });
                        DialogC57630a.this.f142010e = j3;
                    }
                }
            };
        }
        C57626a.m223732a().mo195618a(this.f142000E);
    }

    /* renamed from: d */
    public void mo195695d() {
        C57642b.m223804a().mo195722a(new WeakReference<>(this.f142006a), new WeakReference<>(this), this.f142008c, false);
    }

    /* renamed from: e */
    public boolean mo195696e() {
        return C57642b.m223804a().mo195724a(this.f142006a, new File(C57626a.m223733a(this.f142008c.getVersion())));
    }

    /* renamed from: m */
    private void m223783m() {
        this.f142001F = (FrameLayout) findViewById(R.id.dialog_title_container);
        this.f142002G = (FrameLayout) findViewById(R.id.dialog_content_container);
        this.f142003H = (FrameLayout) findViewById(R.id.dialog_content_divider_container);
        this.f142004I = (FrameLayout) findViewById(R.id.dialog_buttons_container);
        this.f142005J = (FrameLayout) findViewById(R.id.dialog_bottom_holder);
    }

    /* renamed from: n */
    private void m223784n() {
        setCanceledOnTouchOutside(this.f142007b);
        setCancelable(this.f142007b);
        if (getWindow() != null) {
            getWindow().setDimAmount(0.3f);
        }
        m223785o();
        mo195692b();
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        float f;
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = UIHelper.dp2px(300.0f);
            if (DesktopUtil.m144307b()) {
                f = 40.0f;
            } else {
                f = 24.0f;
            }
            attributes.y = UIHelper.dp2px(f);
            window.setAttributes(attributes);
        }
        super.show();
    }

    /* renamed from: p */
    private void m223786p() {
        String str;
        if (this.f142008c.getUpgradePlan().enableSnooze()) {
            str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_UpgradeNewVersionTitle, HiAnalyticsConstant.HaKey.BI_KEY_VERSION, this.f142013h);
        } else {
            str = UIHelper.getString(R.string.Lark_Legacy_SafetyUpgradeNotesTitle);
        }
        this.f142015j.setText(str);
        m223776b(this.f141996A);
        this.f142020o.setText(UIHelper.getString(R.string.Lark_Legacy_UpgradeNotesTitle, this.f142013h));
        this.f142021p.setText(this.f142012g);
        m223777c(this.f141997B);
    }

    /* renamed from: b */
    public void mo195692b() {
        this.f142022q.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576311 */

            public void onClick(View view) {
                UpgradeHitPoint.f141994a.mo195625a("snooze");
                UpgradeHitPoint.f141994a.mo195630b(DialogC57630a.this.f142008c.getUpgradePlan(), DialogC57630a.this.f142009d);
                DialogC57630a.this.cancel();
                UserSP.getInstance().putLong(DialogC57630a.this.f142008c.getVersion(), System.currentTimeMillis());
            }
        });
        View$OnClickListenerC576322 r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576322 */

            public void onClick(View view) {
                if (DialogC57630a.this.f142007b) {
                    DialogC57630a.this.cancel();
                }
            }
        };
        this.f142030y.setOnClickListener(r0);
        this.f142019n.setOnClickListener(r0);
        this.f142019n.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576333 */

            public void onClick(View view) {
                UpgradeHitPoint.f141994a.mo195625a("background_download");
                DialogC57630a.this.cancel();
            }
        });
        this.f142016k.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576344 */

            public void onClick(View view) {
                UserSP.getInstance().putLong(DialogC57630a.this.f142008c.getVersion(), System.currentTimeMillis());
                UpgradeHitPoint.f141994a.mo195630b(DialogC57630a.this.f142008c.getUpgradePlan(), DialogC57630a.this.f142009d);
                DialogC57630a.this.cancel();
            }
        });
        this.f142017l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576355 */

            public void onClick(View view) {
                UserSP.getInstance().putLong(DialogC57630a.this.f142008c.getVersion(), -1);
                if (NetworkUtils.m153070c(DialogC57630a.this.f142006a)) {
                    DialogC57630a.this.mo195697f();
                    DialogC57630a.this.mo195695d();
                    return;
                }
                LKUIToast.show(DialogC57630a.this.f142006a, UIUtils.getString(DialogC57630a.this.f142006a, R.string.Lark_Legacy_NetUnavailableNow));
            }
        });
        this.f142018m.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.View$OnClickListenerC576366 */

            public void onClick(View view) {
                UserSP.getInstance().putLong(DialogC57630a.this.f142008c.getVersion(), -1);
                UpgradeHitPoint.f141994a.mo195624a(DialogC57630a.this.f142008c.getUpgradePlan(), DialogC57630a.this.f142009d);
                boolean b = C57607a.m223662a().mo177708b();
                boolean b2 = C57642b.m223804a().mo195729b();
                if (!C26284k.m95185a(DialogC57630a.this.f142006a) && b && b2) {
                    DialogC57630a.this.mo195694c();
                } else if (DialogC57630a.this.f142008c.isApkFileReady() && DialogC57630a.this.mo195696e()) {
                    DialogC57630a.this.dismiss();
                } else if (NetworkUtils.m153070c(DialogC57630a.this.f142006a)) {
                    DialogC57630a.this.mo195697f();
                    DialogC57630a.this.mo195695d();
                } else {
                    DialogC57630a.this.mo195698g();
                }
            }
        });
        m223775a(this.f141998C);
    }

    /* renamed from: c */
    public void mo195694c() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + this.f142006a.getPackageName()));
        intent.setPackage("com.android.vending");
        try {
            if (intent.resolveActivity(this.f142006a.getPackageManager()) != null) {
                this.f142006a.startActivity(intent);
                return;
            }
            Context context = this.f142006a;
            C26323w.m95324a(context, "https://play.google.com/store/apps/details?id=" + this.f142006a.getPackageName());
        } catch (Exception e) {
            Log.m165386e("jumpToGooglePlayMarket Error", e);
            LKUIToast.show(this.f142006a.getApplicationContext(), (int) R.string.Lark_Legacy_InstallFailed);
        }
    }

    /* renamed from: f */
    public void mo195697f() {
        this.f142031z.setVisibility(0);
        this.f142026u.setVisibility(8);
        this.f142025t.setVisibility(8);
        this.f142027v.setVisibility(8);
        this.f142028w.setVisibility(8);
        this.f142029x.setVisibility(0);
        this.f141997B.getLayoutParams().height = UIHelper.dp2px(269.5f);
        m223779i().setBackgroundColor(this.f142006a.getResources().getColor(R.color.lkui_N00));
        this.f142015j.setText(UIHelper.getString(R.string.Lark_Legacy_Updating_V2));
        m223787q();
    }

    /* renamed from: g */
    public void mo195698g() {
        this.f142031z.setVisibility(8);
        this.f142026u.setVisibility(0);
        this.f141997B.getLayoutParams().height = UIHelper.dp2px(269.5f);
        m223779i().setBackgroundColor(this.f142006a.getResources().getColor(R.color.lkui_N00));
        this.f142025t.setVisibility(8);
        this.f142015j.setText(UIHelper.getString(R.string.Lark_Legacy_ErrorTitle));
        this.f142027v.setVisibility(0);
        this.f142028w.setVisibility(8);
        this.f142029x.setVisibility(8);
    }

    /* renamed from: o */
    private void m223785o() {
        int i;
        m223778h().removeAllViews();
        View inflate = LayoutInflater.from(this.f142006a).inflate(R.layout.view_dialog_update_title, m223778h(), false);
        this.f141996A = inflate;
        this.f142015j = (TextView) inflate.findViewById(R.id.dialog_title);
        ViewGroup i2 = m223779i();
        i2.removeAllViews();
        i2.setPadding(0, 0, 0, 0);
        View inflate2 = LayoutInflater.from(this.f142006a).inflate(R.layout.view_dialog_update_note, m223779i(), false);
        this.f141997B = inflate2;
        this.f142020o = (TextView) inflate2.findViewById(R.id.dialog_version_message);
        this.f142021p = (TextView) this.f141997B.findViewById(R.id.dialog_message);
        this.f142025t = (LinearLayout) this.f141997B.findViewById(R.id.dialog_content_layout);
        this.f142026u = (LinearLayout) this.f141997B.findViewById(R.id.dialog_fail_layout);
        this.f142031z = (LinearLayout) this.f141997B.findViewById(R.id.progress_zone);
        this.f142014i = (ProgressBar) this.f141997B.findViewById(R.id.progress_bar);
        int i3 = 8;
        this.f142031z.setVisibility(8);
        this.f142024s = (TextView) this.f141997B.findViewById(R.id.tv_progress_downloaded_size);
        m223780j().setVisibility(8);
        m223781k().removeAllViews();
        View inflate3 = LayoutInflater.from(this.f142006a).inflate(R.layout.view_dialog_update_btns, m223779i(), false);
        this.f141998C = inflate3;
        this.f142027v = (LinearLayout) inflate3.findViewById(R.id.dialog_update_fail_btn_layout);
        this.f142028w = (LinearLayout) this.f141998C.findViewById(R.id.dialog_update_fine_btn_layout);
        this.f142029x = (LinearLayout) this.f141998C.findViewById(R.id.dialog_update_background_btn_layout);
        this.f142016k = (TextView) this.f141998C.findViewById(R.id.feed_back_tv);
        this.f142017l = (TextView) this.f141998C.findViewById(R.id.retry_tv);
        this.f142018m = (TextView) this.f141998C.findViewById(R.id.update_now_btn);
        this.f142019n = (TextView) this.f141998C.findViewById(R.id.update_background_btn);
        this.f142022q = (TextView) this.f141998C.findViewById(R.id.update_ignore_btn);
        this.f142023r = (TextView) this.f141998C.findViewById(R.id.tv_update_ignore_divide_line);
        boolean enableSnooze = this.f142008c.getUpgradePlan().enableSnooze();
        TextView textView = this.f142022q;
        if (enableSnooze) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f142023r;
        if (enableSnooze) {
            i3 = 0;
        }
        textView2.setVisibility(i3);
        this.f142012g = this.f142008c.getReleaseNote();
        this.f142013h = this.f142008c.getVersion();
        m223786p();
        ViewGroup l = m223782l();
        this.f141999D = l;
        this.f142030y = (LinearLayout) l.findViewById(R.id.dialog_bottom_holder_layout);
        m223782l().setVisibility(0);
        m223782l().findViewById(R.id.dialog_bottom_holder_for_statusbar).setLayoutParams(new LinearLayout.LayoutParams(-1, CommonTitleBar.getStatusBarHeight()));
    }

    /* renamed from: a */
    private void m223775a(View view) {
        this.f142004I.addView(view);
    }

    /* renamed from: b */
    private void m223776b(View view) {
        this.f142001F.addView(view);
    }

    /* renamed from: c */
    private void m223777c(View view) {
        this.f142002G.setVisibility(0);
        this.f142002G.addView(view);
    }

    /* renamed from: a */
    public void mo195691a(String str) {
        this.f142024s.setText(str);
    }

    /* renamed from: a */
    public void mo195690a(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f142014i.setProgress(i, true);
        } else {
            this.f142014i.setProgress(i);
        }
    }

    /* renamed from: b */
    public void mo195693b(int i) {
        ValueAnimator valueAnimator = this.f142011f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f142011f.pause();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f142014i.getProgress(), i);
        this.f142011f = ofInt;
        ofInt.setDuration(300L);
        this.f142011f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.upgrade.impl.DialogC57630a.C576418 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DialogC57630a.this.mo195690a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        this.f142011f.start();
    }

    /* renamed from: a */
    public String mo195688a(long j) {
        double d = (double) j;
        double d2 = d / 1024.0d;
        double d3 = d2 / 1024.0d;
        double d4 = d3 / 1024.0d;
        double d5 = d4 / 1024.0d;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (d5 > 1.0d) {
            return decimalFormat.format(d5).concat(" TB");
        }
        if (d4 > 1.0d) {
            return decimalFormat.format(d4).concat(" GB");
        }
        if (d3 > 1.0d) {
            return decimalFormat.format(d3).concat(" MB");
        }
        if (d2 > 1.0d) {
            return decimalFormat.format(d2).concat(" KB");
        }
        return decimalFormat.format(d).concat(" B");
    }

    public DialogC57630a(Context context, UpgradeInfo upgradeInfo, String str) {
        super(context, R.style.CommonDialog);
        setContentView(R.layout.common_dialog_layout);
        m223783m();
        this.f142006a = context;
        this.f142008c = upgradeInfo;
        this.f142009d = str;
        m223784n();
    }
}
