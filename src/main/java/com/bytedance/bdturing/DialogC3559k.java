package com.bytedance.bdturing;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bdturing.EventReport;
import com.bytedance.bdturing.p207c.AbstractC3528a;
import com.bytedance.bdturing.p207c.C3529b;
import com.bytedance.bdturing.p207c.C3534c;
import com.bytedance.bdturing.p207c.C3537e;
import com.bytedance.bdturing.p209e.C3542b;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import com.bytedance.bdturing.verify.request.RiskInfoRequest;
import com.bytedance.bdturing.verify.request.SmarterVerifyRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdturing.k */
public class DialogC3559k extends Dialog {

    /* renamed from: a */
    public VerifyWebView f11247a;

    /* renamed from: b */
    public ViewGroup f11248b;

    /* renamed from: c */
    public boolean f11249c = false;

    /* renamed from: d */
    public boolean f11250d = false;

    /* renamed from: e */
    public boolean f11251e = false;

    /* renamed from: f */
    public boolean f11252f = false;

    /* renamed from: g */
    public String f11253g = null;

    /* renamed from: h */
    public AbstractC3526b f11254h;

    /* renamed from: i */
    public DialogInterface.OnDismissListener f11255i;

    /* renamed from: j */
    public EventReport.CloseType f11256j = EventReport.CloseType.CLOSE_REASON_APP;

    /* renamed from: k */
    public int f11257k;

    /* renamed from: l */
    public AbstractRequest f11258l;

    /* renamed from: m */
    private C3529b f11259m;

    /* renamed from: n */
    private ImageView f11260n;

    /* renamed from: o */
    private TextView f11261o;

    /* renamed from: p */
    private Button f11262p;

    /* renamed from: q */
    private Button f11263q;

    /* renamed from: r */
    private Context f11264r;

    /* renamed from: s */
    private FrameLayout f11265s;

    /* renamed from: t */
    private String f11266t;

    /* renamed from: u */
    private C3550g f11267u = null;

    /* renamed from: v */
    private C3543f f11268v;

    /* renamed from: w */
    private int f11269w;

    /* renamed from: x */
    private AbstractC3528a f11270x = new C3537e() {
        /* class com.bytedance.bdturing.DialogC3559k.C35645 */

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14319a() {
            DialogC3559k.this.mo14371b();
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: b */
        public void mo14322b() {
            JSONObject j;
            if ((DialogC3559k.this.f11258l instanceof SmarterVerifyRequest) && (j = ((SmarterVerifyRequest) DialogC3559k.this.f11258l).mo14352j()) != null) {
                DialogC3559k.this.mo14370a(C3534c.m14872a(1, "bytedcert.verifyData", "call", j, "bytedcert.verifyData"));
            }
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14248a(C3534c cVar) {
            cVar.mo14311a(1, C3520a.m14831a().mo14275c().mo14212b(DialogC3559k.this.f11257k));
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14320a(int i, int i2) {
            DialogC3559k.this.mo14369a(i, i2, false);
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14249a(String str, AbstractC3526b bVar) {
            RiskInfoRequest jVar = new RiskInfoRequest(str);
            jVar.mo14344c(false);
            jVar.mo14342b(false);
            DialogC3559k.this.f11255i.onDismiss(DialogC3559k.this);
            C3520a.m14831a().mo14272a(DialogC3559k.this.f11258l.mo14338a(), jVar, bVar);
        }

        @Override // com.bytedance.bdturing.p207c.C3537e
        /* renamed from: a */
        public void mo14247a(int i, String str, String str2, String str3, String str4) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            EventReport.m14806a(i);
            if (DialogC3559k.this.f11254h != null) {
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("token", str3);
                        jSONObject.put("mobile", str4);
                    } catch (JSONException e) {
                        LogUtil.m14894a(e);
                    }
                    DialogC3559k.this.f11254h.mo14294b(i, jSONObject);
                } else {
                    DialogC3559k.this.f11254h.mo14293a(i, null);
                }
                DialogC3559k.this.f11254h = null;
            }
            DialogC3559k.this.f11250d = true;
            DialogC3559k.this.dismiss();
        }
    };

    /* renamed from: y */
    private AbstractC3571m f11271y = new AbstractC3571m() {
        /* class com.bytedance.bdturing.DialogC3559k.C35656 */

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14250a() {
            DialogC3559k.this.f11249c = true;
            EventReport.m14807a(0, "success");
        }

        @Override // com.bytedance.bdturing.AbstractC3571m
        /* renamed from: a */
        public void mo14251a(int i, String str) {
            DialogC3559k.this.f11249c = false;
            if (!DialogC3559k.this.f11251e) {
                DialogC3559k kVar = DialogC3559k.this;
                kVar.f11253g = kVar.mo14367a(i);
            }
            EventReport.m14807a(i, str);
        }
    };

    /* renamed from: z */
    private ComponentCallbacks f11272z = new ComponentCallbacks() {
        /* class com.bytedance.bdturing.DialogC3559k.ComponentCallbacksC35667 */

        public void onLowMemory() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            int i;
            boolean z;
            if (configuration.orientation == 1 || configuration.orientation == 2) {
                if (configuration.orientation == 1) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (DialogC3559k.this.f11258l.mo14348f() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                LogUtil.m14899d("VerifyDialog", "canOrientation: " + z);
                if (z) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("orientation", i);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String a = C3534c.m14872a(1, "bytedcert.orientation_changing", "call", jSONObject, "bytedcert.orientation_changing");
                    DialogC3559k.this.f11252f = true;
                    DialogC3559k.this.mo14370a(a);
                    EventReport.m14816c(i);
                }
            }
        }
    };

    /* renamed from: c */
    public AbstractRequest mo14372c() {
        return this.f11258l;
    }

    /* renamed from: g */
    private void m15014g() {
        setOnKeyListener(new DialogInterface.OnKeyListener() {
            /* class com.bytedance.bdturing.DialogC3559k.DialogInterface$OnKeyListenerC35634 */

            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                int action = keyEvent.getAction();
                if (keyCode != 4 || action != 1) {
                    return false;
                }
                if (DialogC3559k.this.f11248b.getVisibility() == 0) {
                    DialogC3559k.this.f11256j = EventReport.CloseType.CLOSE_FB_SYSTEM;
                    return false;
                } else if (DialogC3559k.this.f11247a == null || !DialogC3559k.this.f11247a.canGoBack()) {
                    DialogC3559k.this.f11256j = EventReport.CloseType.CLOSE_REASON_BACK;
                    return false;
                } else {
                    DialogC3559k.this.f11247a.goBack();
                    return true;
                }
            }
        });
    }

    /* renamed from: d */
    private void m15011d() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: e */
    private void m15012e() {
        if (this.f11258l.mo14347e()) {
            RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.f11260n.startAnimation(rotateAnimation);
            this.f11265s.setBackgroundColor(-2013265920);
            return;
        }
        this.f11260n.setVisibility(8);
    }

    /* renamed from: a */
    public void mo14368a() {
        if (this.f11258l.mo14347e()) {
            this.f11260n.clearAnimation();
            this.f11260n.setVisibility(8);
        }
        if (this.f11258l.mo14346d()) {
            this.f11265s.setBackgroundColor(-2013265920);
        }
    }

    /* renamed from: b */
    public synchronized void mo14371b() {
        LogUtil.m14895a("VerifyDialog", "clearResource()");
        if (this.f11264r != null || this.f11259m != null) {
            this.f11264r = null;
            this.f11259m.mo14303a();
            this.f11259m = null;
        }
    }

    /* renamed from: f */
    private void m15013f() {
        this.f11248b = (ViewGroup) findViewById(R.id.view_feedback);
        this.f11261o = (TextView) findViewById(R.id.text_feedback_content);
        this.f11262p = (Button) findViewById(R.id.btn_feedback);
        this.f11263q = (Button) findViewById(R.id.btn_feedback_close);
        this.f11260n = (ImageView) findViewById(R.id.loading);
        this.f11247a = (VerifyWebView) findViewById(R.id.verify_webview);
        this.f11265s = (FrameLayout) findViewById(R.id.dialog_framelayout);
        View$OnClickListenerC35601 r0 = new View.OnClickListener() {
            /* class com.bytedance.bdturing.DialogC3559k.View$OnClickListenerC35601 */

            public void onClick(View view) {
                int id = view.getId();
                if (id == R.id.btn_feedback_close) {
                    DialogC3559k.this.f11256j = EventReport.CloseType.CLOSE_FB_CLOSE;
                } else if (id == R.id.btn_feedback) {
                    DialogC3559k.this.f11256j = EventReport.CloseType.CLOSE_FB_FEEDBACK;
                }
                DialogC3559k.this.dismiss();
            }
        };
        this.f11262p.setOnClickListener(r0);
        this.f11263q.setOnClickListener(r0);
        this.f11247a.mo14257a(this.f11271y);
        C3550g gVar = new C3550g(this.f11258l.mo14350h());
        this.f11267u = gVar;
        this.f11247a.setOnTouchListener(gVar);
    }

    public void dismiss() {
        if (this.f11247a != null) {
            getWindow().getDecorView().post(new Runnable() {
                /* class com.bytedance.bdturing.DialogC3559k.RunnableC35623 */

                /* renamed from: b */
                private WebView f11279b;

                public void run() {
                    ViewParent parent;
                    LogUtil.m14897b("VerifyDialog", "remove webview");
                    WebView webView = this.f11279b;
                    if (webView != null && (parent = webView.getParent()) != null && (parent instanceof ViewGroup)) {
                        ((ViewGroup) parent).removeView(this.f11279b);
                    }
                }

                {
                    this.f11279b = DialogC3559k.this.f11247a;
                }
            });
            this.f11247a = null;
        }
        if (!this.f11251e) {
            this.f11251e = true;
            super.dismiss();
            if (this.f11258l.mo14338a() != null) {
                this.f11258l.mo14338a().unregisterComponentCallbacks(this.f11272z);
            }
            C3543f fVar = this.f11268v;
            if (fVar != null) {
                fVar.mo14328b();
                this.f11268v = null;
            }
            DialogInterface.OnDismissListener onDismissListener = this.f11255i;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            C3567l.m15030a().mo14384a(1, this, 10000);
            AbstractC3526b bVar = this.f11254h;
            if (bVar != null && !this.f11249c) {
                bVar.mo14293a(3, null);
                this.f11254h = null;
            }
            if (!this.f11250d) {
                m15010b(this.f11256j.getName());
            }
            if (!this.f11249c) {
                EventReport.m14810a(this.f11256j);
                mo14371b();
            }
            C3567l.m15030a().mo14383a(3, null);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f11255i = onDismissListener;
    }

    /* renamed from: b */
    private void m15010b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("style", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mo14370a(C3534c.m14872a(1, "bytedcert.goToClose", "call", jSONObject, "bytedcert.goToClose"));
    }

    /* renamed from: a */
    public String mo14367a(int i) {
        return "Service error" + i + ", Please feed back to us";
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f11267u.mo14358a(motionEvent);
        if (this.f11258l.mo14345c()) {
            if (this.f11248b.getVisibility() == 0) {
                this.f11256j = EventReport.CloseType.CLOSE_FB_MASK;
            } else {
                this.f11256j = EventReport.CloseType.CLOSE_REASON_MASK;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public boolean mo14370a(String str) {
        C3529b bVar = this.f11259m;
        if (bVar == null) {
            LogUtil.m14898c("VerifyDialog", "(mJsBridge == null) ");
            return false;
        }
        bVar.mo14304a(str);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(this.f11264r).inflate(R.layout.layout_verify_dialog, (ViewGroup) null));
        m15011d();
        m15013f();
        m15012e();
        if (this.f11258l.mo14338a() != null) {
            this.f11258l.mo14338a().registerComponentCallbacks(this.f11272z);
        }
        this.f11268v.mo14327a();
        setCanceledOnTouchOutside(this.f11258l.mo14345c());
        setCancelable(true);
        this.f11259m = new C3529b(this.f11270x, this.f11247a);
        LogUtil.m14895a("VerifyDialog", "loadUrl = " + this.f11266t);
        this.f11247a.loadUrl(this.f11266t);
        if (this.f11258l.mo14343b()) {
            DisplayMetrics displayMetrics = this.f11264r.getResources().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams = this.f11247a.getLayoutParams();
            layoutParams.width = displayMetrics.widthPixels;
            layoutParams.height = displayMetrics.heightPixels;
            this.f11247a.setLayoutParams(layoutParams);
            this.f11247a.setVisibility(0);
        }
    }

    public DialogC3559k(AbstractRequest aVar, AbstractC3526b bVar) {
        super(aVar.mo14338a(), R.style.VerifyDialogTheme);
        this.f11258l = aVar;
        this.f11257k = aVar.mo14348f();
        this.f11266t = this.f11258l.mo14351i();
        this.f11254h = bVar;
        this.f11269w = C3542b.m14900a(this.f11258l.mo14338a());
        this.f11268v = new C3543f(this.f11258l.mo14338a());
        this.f11264r = aVar.mo14338a();
        m15014g();
    }

    /* renamed from: a */
    public void mo14369a(final int i, final int i2, boolean z) {
        LogUtil.m14899d("VerifyDialog", "changeDialog width = " + i + ", height = " + i2);
        if (!this.f11251e && isShowing()) {
            if (this.f11258l.mo14343b()) {
                i = -1;
                i2 = -1;
            }
            if (i > 0 && i2 > 0) {
                float b = C3542b.m14906b(this.f11264r);
                i = Math.round(((float) i) * b);
                i2 = Math.round(b * ((float) i2));
            }
            final ViewGroup.LayoutParams layoutParams = this.f11247a.getLayoutParams();
            if (!this.f11252f || layoutParams.width <= 0 || layoutParams.height <= 0) {
                this.f11247a.post(new Runnable() {
                    /* class com.bytedance.bdturing.DialogC3559k.RunnableC35612 */

                    public void run() {
                        if (!DialogC3559k.this.f11251e) {
                            DialogC3559k.this.mo14368a();
                            layoutParams.width = i;
                            layoutParams.height = i2;
                            DialogC3559k.this.f11247a.setLayoutParams(layoutParams);
                            DialogC3559k.this.f11247a.setVisibility(0);
                        }
                    }
                });
                return;
            }
            this.f11247a.mo14256a(i, i2, layoutParams.width, layoutParams.height);
            this.f11252f = false;
        }
    }
}
