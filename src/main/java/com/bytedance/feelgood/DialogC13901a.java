package com.bytedance.feelgood;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.feelgood.p735a.C13910a;
import com.bytedance.feelgood.p735a.C13911b;
import com.bytedance.feelgood.p737c.AbstractC13920a;
import com.bytedance.feelgood.p737c.AbstractC13924d;
import com.bytedance.feelgood.p737c.AbstractC13926f;
import com.bytedance.feelgood.p737c.C13921b;
import com.bytedance.feelgood.p737c.C13922c;
import com.bytedance.feelgood.p738d.C13929a;
import com.bytedance.feelgood.p738d.C13930b;
import com.bytedance.feelgood.p738d.C13931c;
import com.bytedance.feelgood.p738d.C13932d;
import com.bytedance.feelgood.p739e.AbstractDialogC13935a;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.feelgood.a */
public class DialogC13901a extends AbstractDialogC13935a {

    /* renamed from: a */
    public FrameLayout f36340a;

    /* renamed from: b */
    public WebView f36341b;

    /* renamed from: c */
    public String f36342c;

    /* renamed from: d */
    public boolean f36343d = true;

    /* renamed from: e */
    public DialogC13901a f36344e = this;

    /* renamed from: f */
    public boolean f36345f = true;

    /* renamed from: g */
    public C13911b f36346g;

    /* renamed from: h */
    public AbstractC13919c f36347h;

    /* renamed from: i */
    public AbstractC13926f f36348i;

    /* renamed from: j */
    private FrameLayout f36349j;

    /* renamed from: k */
    private ProgressBar f36350k;

    /* renamed from: l */
    private boolean f36351l;

    /* renamed from: m */
    private boolean f36352m = true;

    /* renamed from: n */
    private final String f36353n = "ADFeelgoodDialog";

    /* renamed from: o */
    private AbstractC13924d f36354o;

    /* renamed from: p */
    private Date f36355p;

    /* renamed from: q */
    private C13910a f36356q;

    /* renamed from: r */
    private AbstractC13920a f36357r;

    /* renamed from: b */
    public boolean mo51212b() {
        return this.f36352m;
    }

    /* renamed from: a */
    public void mo51201a() {
        WebView webView = this.f36341b;
        if (webView != null) {
            webView.removeAllViews();
            this.f36341b.destroy();
            this.f36341b = null;
        }
    }

    public void show() {
        super.show();
        AbstractC13919c cVar = this.f36347h;
        if (cVar != null) {
            cVar.mo51267b(this.f36346g.mo51255f());
        }
        AbstractC13926f fVar = this.f36348i;
        if (fVar != null) {
            fVar.mo51275b(this.f36346g.mo51255f());
        }
    }

    /* renamed from: c */
    public boolean mo51214c() {
        Date time = Calendar.getInstance().getTime();
        Date date = this.f36355p;
        if (date != null && time.after(date)) {
            return false;
        }
        AbstractC13919c cVar = this.f36347h;
        if (cVar != null) {
            boolean a = cVar.mo51266a(this.f36346g.mo51255f());
            AbstractC13920a aVar = this.f36357r;
            if (aVar != null) {
                aVar.mo51196a(a);
            }
            return a;
        }
        AbstractC13926f fVar = this.f36348i;
        if (fVar == null) {
            return true;
        }
        boolean a2 = fVar.mo51274a(this.f36346g.mo51255f());
        AbstractC13920a aVar2 = this.f36357r;
        if (aVar2 != null) {
            aVar2.mo51196a(a2);
        }
        return a2;
    }

    /* renamed from: a */
    public void mo51202a(AbstractC13920a aVar) {
        this.f36357r = aVar;
    }

    @Override // com.bytedance.feelgood.p739e.AbstractDialogC13935a
    /* renamed from: d */
    public void mo51215d(boolean z) {
        this.f36352m = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.feelgood.a$a */
    public class C13909a extends WebViewClient {
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return true;
        }

        private C13909a() {
        }

        /* renamed from: a */
        private void m56317a(Uri uri) {
            if (DialogC13901a.this.f36342c != null && DialogC13901a.this.f36342c.equals(uri.toString()) && DialogC13901a.this.f36343d) {
                DialogC13901a.this.mo51213c(true);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            DialogC13901a.this.mo51211b(false);
            if (DialogC13901a.this.f36345f && !DialogC13901a.this.f36343d && DialogC13901a.this.f36342c != null && DialogC13901a.this.f36342c.equals(str) && !DialogC13901a.this.f36344e.isShowing() && DialogC13901a.this.mo51214c()) {
                C13921b.m56358a(DialogC13901a.this.f36344e);
            }
            if (DialogC13901a.this.f36345f) {
                DialogC13901a.this.f36344e.f36341b.setVisibility(0);
            }
            DialogC13901a.this.f36345f = true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            DialogC13901a.this.mo51211b(true);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            DialogC13901a.this.f36345f = false;
            if (Build.VERSION.SDK_INT >= 21) {
                m56317a(webResourceRequest.getUrl());
            }
            if (DialogC13901a.this.f36347h != null) {
                DialogC13901a.this.f36347h.mo51262a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), DialogC13901a.this.f36346g.mo51255f());
            }
            if (DialogC13901a.this.f36348i != null) {
                DialogC13901a.this.f36348i.mo51271a(webResourceError.getErrorCode(), webResourceError.getDescription().toString(), DialogC13901a.this.f36346g.mo51255f());
            }
        }

        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            DialogC13901a.this.f36345f = false;
            if (Build.VERSION.SDK_INT >= 21) {
                m56317a(webResourceRequest.getUrl());
            }
            if (DialogC13901a.this.f36347h != null) {
                DialogC13901a.this.f36347h.mo51262a(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), DialogC13901a.this.f36346g.mo51255f());
            }
            if (DialogC13901a.this.f36348i != null) {
                DialogC13901a.this.f36348i.mo51271a(webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), DialogC13901a.this.f36346g.mo51255f());
            }
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (DialogC13901a.this.f36347h != null) {
                DialogC13901a.this.f36347h.mo51262a(sslError.getPrimaryError(), sslError.getCertificate().toString(), DialogC13901a.this.f36346g.mo51255f());
            }
            if (DialogC13901a.this.f36348i != null) {
                DialogC13901a.this.f36348i.mo51271a(sslError.getPrimaryError(), sslError.getCertificate().toString(), DialogC13901a.this.f36346g.mo51255f());
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* renamed from: a */
    public void mo51203a(AbstractC13926f fVar) {
        this.f36348i = fVar;
    }

    /* renamed from: a */
    public void mo51204a(AbstractC13919c cVar) {
        this.f36347h = cVar;
    }

    /* renamed from: b */
    public void mo51211b(boolean z) {
        int i = 8;
        if (!this.f36343d) {
            this.f36350k.setVisibility(8);
            return;
        }
        ProgressBar progressBar = this.f36350k;
        if (z) {
            i = 0;
        }
        progressBar.setVisibility(i);
    }

    /* renamed from: b */
    private WebView m56298b(Context context) {
        final WebView webView = new WebView(context);
        webView.setBackgroundColor(context.getResources().getColor(17170445));
        C13932d.m56386a(context).mo51282a(webView);
        webView.setWebViewClient(new C13909a());
        webView.addJavascriptInterface(new C13929a(this, new AbstractC13928d() {
            /* class com.bytedance.feelgood.DialogC13901a.C139054 */

            @Override // com.bytedance.feelgood.AbstractC13928d
            /* renamed from: a */
            public void mo51220a(String str) {
            }

            @Override // com.bytedance.feelgood.AbstractC13928d
            /* renamed from: a */
            public void mo51221a(String str, String str2) {
                boolean z;
                if (DialogC13901a.this.f36347h != null) {
                    z = DialogC13901a.this.f36347h.mo51265a(webView, str2);
                } else {
                    z = false;
                }
                if (DialogC13901a.this.f36348i != null) {
                    z = DialogC13901a.this.f36348i.mo51273a(webView, str2);
                }
                DialogC13901a.this.mo51207a(str, z);
            }
        }, new AbstractC13934e() {
            /* class com.bytedance.feelgood.DialogC13901a.C139065 */

            @Override // com.bytedance.feelgood.AbstractC13934e
            /* renamed from: a */
            public void mo51222a(C13931c cVar) {
                DialogC13901a.this.mo51205a(cVar);
            }
        }), C13929a.f36405a);
        return webView;
    }

    /* renamed from: a */
    public void mo51205a(final C13931c cVar) {
        this.f36340a.post(new Runnable() {
            /* class com.bytedance.feelgood.DialogC13901a.RunnableC139076 */

            public void run() {
                DialogC13901a.this.mo51210b(cVar);
            }
        });
    }

    /* renamed from: c */
    public void mo51213c(boolean z) {
        if (this.f36351l != z) {
            this.f36351l = z;
            WebView webView = this.f36341b;
            int i = 8;
            if (webView != null) {
                if (z) {
                    webView.setVisibility(8);
                } else {
                    webView.loadUrl(this.f36342c);
                }
            }
            FrameLayout frameLayout = this.f36349j;
            if (z) {
                i = 0;
            }
            frameLayout.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo51206a(String str) {
        if (this.f36341b != null && !TextUtils.isEmpty(str)) {
            this.f36342c = str;
            this.f36341b.loadUrl(str);
        }
    }

    /* renamed from: a */
    private void m56297a(Context context) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.fg_layout_feelgood, (ViewGroup) null, false);
        this.f36340a = frameLayout;
        frameLayout.post(new Runnable() {
            /* class com.bytedance.feelgood.DialogC13901a.RunnableC139021 */

            public void run() {
                C13922c.m56361a(DialogC13901a.this.f36340a, DialogC13901a.this.getWindow());
            }
        });
        this.f36341b = m56298b(context);
        this.f36341b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f36340a.addView(this.f36341b);
        this.f36349j = (FrameLayout) this.f36340a.findViewById(R.id.ll_fail);
        ProgressBar progressBar = (ProgressBar) this.f36340a.findViewById(R.id.progress);
        this.f36350k = progressBar;
        progressBar.setVisibility(8);
        this.f36349j.setVisibility(8);
        this.f36349j.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.feelgood.DialogC13901a.View$OnClickListenerC139032 */

            public void onClick(View view) {
                DialogC13901a.this.dismiss();
            }
        });
        this.f36340a.findViewById(R.id.tv_refresh).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.feelgood.DialogC13901a.View$OnClickListenerC139043 */

            public void onClick(View view) {
                DialogC13901a.this.mo51213c(false);
                DialogC13901a.this.mo51211b(true);
            }
        });
        setContentView(this.f36340a);
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.fg_dialogAnim);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.alpha = 1.0f;
            attributes.dimAmount = 0.5f;
            window.setAttributes(attributes);
            AbstractC13924d dVar = this.f36354o;
            if (dVar != null) {
                dVar.mo51270a(window);
            }
        }
        setCancelable(true);
    }

    /* renamed from: b */
    public void mo51210b(C13931c cVar) {
        C13930b a = C13930b.m56381a().mo51279a(cVar.f36412a).mo51280a("channel", this.f36356q.mo51236b()).mo51280a("language", this.f36356q.mo51237c()).mo51280a("taskID", this.f36346g.mo51255f()).mo51280a("taskSetting", this.f36346g.mo51256g()).mo51280a("nativePlatform", "android").mo51280a("appKey", this.f36356q.mo51233a());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("user_id", this.f36356q.mo51240f());
            jSONObject.put("user_name", this.f36356q.mo51241g());
            jSONObject.put("web_id", this.f36356q.mo51239e());
            jSONObject.put("os_name", "android");
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_name", Build.MODEL);
            C13910a aVar = this.f36356q;
            if (!(aVar == null || aVar.mo51243i() == null)) {
                jSONObject.put("app_version", this.f36356q.mo51243i());
            }
            if (this.f36356q.mo51242h() != null) {
                for (Map.Entry<String, String> entry : this.f36356q.mo51242h().entrySet()) {
                    jSONObject.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            if (this.f36346g.mo51254e() != null) {
                for (Map.Entry<String, String> entry2 : this.f36346g.mo51254e().entrySet()) {
                    jSONObject.put(entry2.getKey().toString(), entry2.getValue().toString());
                }
            }
            a.mo51280a("user", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (this.f36341b != null) {
            String str = "javascript:DpSdk2JSBridge._handleMessageFromApp(" + a.mo51281b() + ")";
            if (Build.VERSION.SDK_INT >= 19) {
                this.f36341b.evaluateJavascript(str, null);
            } else {
                this.f36341b.loadUrl(str);
            }
        }
    }

    /* renamed from: a */
    public void mo51208a(Date date) {
        this.f36355p = date;
    }

    /* renamed from: a */
    public void mo51209a(boolean z) {
        this.f36343d = z;
    }

    /* renamed from: a */
    public void mo51207a(final String str, final boolean z) {
        FrameLayout frameLayout = this.f36340a;
        if (frameLayout != null) {
            frameLayout.post(new Runnable() {
                /* class com.bytedance.feelgood.DialogC13901a.RunnableC139087 */

                public void run() {
                    C13930b a = C13930b.m56381a().mo51279a(str).mo51280a("result", Boolean.valueOf(z));
                    if (DialogC13901a.this.f36341b != null) {
                        String str = "javascript:DpSdk2JSBridge._handleMessageFromApp(" + a.mo51281b() + ")";
                        if (Build.VERSION.SDK_INT >= 19) {
                            DialogC13901a.this.f36341b.evaluateJavascript(str, null);
                        } else {
                            DialogC13901a.this.f36341b.loadUrl(str);
                        }
                    }
                }
            });
        }
    }

    DialogC13901a(Context context, C13910a aVar, C13911b bVar) {
        super(context, R.style.fg_CalendarTitleDialog);
        this.f36356q = aVar;
        this.f36346g = bVar;
        this.f36354o = bVar.mo51257h();
        m56297a(context);
    }
}
