package com.bytedance.ee.bear.bizwidget.shareview;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.bizwidget.shareview.C4887d;
import com.bytedance.ee.util.p701d.C13614b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bizwidget.shareview.d */
public class C4887d {

    /* renamed from: a */
    public Dialog f14388a;

    /* renamed from: b */
    public TextView f14389b;

    /* renamed from: c */
    public TextView f14390c;

    /* renamed from: d */
    public View f14391d;

    /* renamed from: e */
    public ImageView f14392e;

    /* renamed from: f */
    public TextView f14393f;

    /* renamed from: g */
    public TextView f14394g;

    /* renamed from: h */
    private Context f14395h;

    /* renamed from: i */
    private View f14396i;

    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.d$b */
    public interface AbstractC4889b {
        /* renamed from: a */
        void mo19201a();
    }

    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.d$c */
    public interface AbstractC4890c {
        /* renamed from: a */
        void mo19202a();
    }

    /* renamed from: e */
    private void m20150e() {
        this.f14394g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.bizwidget.shareview.$$Lambda$d$uFO5N5sGtRwEXbpHBV5b6NJDycE */

            public final void onClick(View view) {
                C4887d.lambda$uFO5N5sGtRwEXbpHBV5b6NJDycE(C4887d.this, view);
            }
        });
    }

    /* renamed from: b */
    public void mo19192b() {
        Dialog dialog = this.f14388a;
        if (dialog != null && dialog.isShowing()) {
            this.f14388a.dismiss();
        }
    }

    /* renamed from: a */
    public void mo19191a() {
        Dialog dialog = this.f14388a;
        if (dialog != null && !dialog.isShowing()) {
            this.f14388a.show();
        }
    }

    /* renamed from: d */
    private void m20149d() {
        Dialog dialog = new Dialog(this.f14395h, R.style.ShareLinkDialogStyle);
        this.f14388a = dialog;
        dialog.setContentView(this.f14396i);
        Window window = this.f14388a.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.space_kit_trans);
        }
    }

    /* renamed from: c */
    private void m20148c() {
        this.f14389b = (TextView) this.f14396i.findViewById(R.id.title);
        this.f14390c = (TextView) this.f14396i.findViewById(R.id.content);
        this.f14391d = this.f14396i.findViewById(R.id.share_btn);
        this.f14392e = (ImageView) this.f14396i.findViewById(R.id.external_app_icon);
        this.f14393f = (TextView) this.f14396i.findViewById(R.id.share_channel_text);
        this.f14394g = (TextView) this.f14396i.findViewById(R.id.cancel_btn);
    }

    /* renamed from: com.bytedance.ee.bear.bizwidget.shareview.d$a */
    public static final class C4888a {

        /* renamed from: a */
        private C4887d f14397a;

        /* renamed from: b */
        private Context f14398b;

        /* renamed from: a */
        public C4887d mo19197a() {
            this.f14397a.mo19191a();
            return this.f14397a;
        }

        /* renamed from: a */
        public C4888a mo19196a(String str) {
            this.f14397a.f14389b.setText(str);
            return this;
        }

        /* renamed from: c */
        public C4888a mo19200c(String str) {
            this.f14397a.f14393f.setText(str);
            return this;
        }

        public C4888a(Context context) {
            this.f14398b = context;
            this.f14397a = new C4887d(context);
        }

        /* renamed from: a */
        public C4888a mo19194a(AbstractC4889b bVar) {
            this.f14397a.f14388a.setOnDismissListener(new DialogInterface.OnDismissListener() {
                /* class com.bytedance.ee.bear.bizwidget.shareview.$$Lambda$d$a$u0yDegdZfkZhRL1C3pkw7RRaYI */

                public final void onDismiss(DialogInterface dialogInterface) {
                    C4887d.C4888a.m269134lambda$u0yDegdZfkZhRL1C3pkw7RRaYI(C4887d.AbstractC4889b.this, dialogInterface);
                }
            });
            return this;
        }

        /* renamed from: b */
        public C4888a mo19198b(AbstractC4890c cVar) {
            this.f14397a.f14394g.setOnClickListener(new View.OnClickListener(cVar) {
                /* class com.bytedance.ee.bear.bizwidget.shareview.$$Lambda$d$a$uYkkQhcLqPVw7kVcX7atzdiNy08 */
                public final /* synthetic */ C4887d.AbstractC4890c f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C4887d.C4888a.lambda$uYkkQhcLqPVw7kVcX7atzdiNy08(C4887d.C4888a.this, this.f$1, view);
                }
            });
            return this;
        }

        /* renamed from: a */
        public C4888a mo19195a(AbstractC4890c cVar) {
            this.f14397a.f14391d.setOnClickListener(new View.OnClickListener(cVar) {
                /* class com.bytedance.ee.bear.bizwidget.shareview.$$Lambda$d$a$PhwaLbSAHe45R0qSnK6ZZQDECE */
                public final /* synthetic */ C4887d.AbstractC4890c f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C4887d.C4888a.m269133lambda$PhwaLbSAHe45R0qSnK6ZZQDECE(C4887d.C4888a.this, this.f$1, view);
                }
            });
            return this;
        }

        /* renamed from: b */
        public C4888a mo19199b(String str) {
            this.f14397a.f14390c.setVisibility(0);
            this.f14397a.f14390c.setText(str);
            C13614b.m55259a(this.f14398b, str);
            return this;
        }

        /* renamed from: a */
        public C4888a mo19193a(ShareType shareType) {
            if (shareType == ShareType.Wechat) {
                this.f14397a.f14391d.setBackgroundResource(R.drawable.share_wechat_button_bg);
                this.f14397a.f14392e.setImageResource(R.drawable.icon_pop_wechat_mini_nor);
            } else if (shareType == ShareType.WechatMoments) {
                this.f14397a.f14391d.setBackgroundResource(R.drawable.share_wechat_button_bg);
                this.f14397a.f14392e.setImageResource(R.drawable.icon_pop_moments_mini_nor);
            } else if (shareType == ShareType.QQ) {
                this.f14397a.f14391d.setBackgroundResource(R.drawable.share_qq_button_bg);
                this.f14397a.f14392e.setImageResource(R.drawable.icon_pop_qq_mini_nor);
            }
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m20155b(AbstractC4890c cVar, View view) {
            cVar.mo19202a();
            this.f14397a.mo19192b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m20154a(AbstractC4890c cVar, View view) {
            cVar.mo19202a();
            if (this.f14397a.f14388a != null && this.f14397a.f14388a.isShowing()) {
                this.f14397a.f14388a.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20147a(View view) {
        Dialog dialog = this.f14388a;
        if (dialog != null && dialog.isShowing()) {
            this.f14388a.dismiss();
        }
    }

    public C4887d(Context context) {
        this.f14395h = context;
        this.f14396i = LayoutInflater.from(context).inflate(R.layout.share_link_dialog_layout, (ViewGroup) null);
        m20148c();
        m20149d();
        m20150e();
    }
}
