package com.ss.android.lark.mail.impl.message.view.p2212c;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.C42097j;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.MailMessage;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.template.C43032aa;
import com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2176d.C42349b;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43720d;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.message.view.c.a */
public class C43194a extends C43725f {

    /* renamed from: a */
    protected AbstractC43720d f109944a;

    /* renamed from: b */
    ViewPager f109945b;

    /* renamed from: c */
    private final String f109946c;

    /* renamed from: d */
    private C43199a.AbstractC43200a f109947d;

    /* renamed from: e */
    private C43199a f109948e;

    /* renamed from: f */
    private long f109949f;

    /* renamed from: g */
    private boolean f109950g;

    /* renamed from: h */
    private View f109951h;

    public C43728g getMailWebClient() {
        return this.f110963y;
    }

    public long getWebLoadDataLen() {
        return this.f109949f;
    }

    /* renamed from: b */
    public void mo22336b() {
        getWebView().loadData("<html>\n\n<head>\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=2.0, minimum-scale=0.01, shrink-to-fit=no\">\n</head>\n\n<body>\n</body>\n</html>", "text/html", null);
    }

    /* renamed from: c */
    public void mo154604c() {
        if (this.f110963y != null) {
            this.f110963y.mo155867i();
        }
    }

    /* renamed from: d */
    public void mo154606d() {
        if (this.f110963y != null) {
            this.f110963y.mo155868j();
        }
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f
    /* renamed from: f */
    public void mo153475f() {
        super.mo153475f();
        this.f109947d = null;
        this.f109944a = null;
        this.f109949f = 0;
        this.f109945b = null;
    }

    public Context getWebContext() {
        Context context = getContext();
        if (context instanceof MutableContextWrapper) {
            return ((MutableContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: a */
    public boolean mo19616a() {
        return this.f109950g;
    }

    /* renamed from: a */
    public void mo154596a(View view) {
        this.f109951h = view;
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    public void setWebViewTouchListener(AbstractC43720d dVar) {
        this.f109944a = dVar;
    }

    public C43194a(Context context) {
        this(context, false);
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    /* renamed from: a */
    public MailImage mo22331a(String str) {
        return this.f110963y.mo155861c(str);
    }

    public void setWebJsPromptListener(C43199a.AbstractC43200a aVar) {
        this.f109947d = aVar;
        C43199a aVar2 = this.f109948e;
        if (aVar2 != null) {
            aVar2.mo154617a(aVar);
        }
    }

    /* renamed from: a */
    private void m171672a(MailMessage mailMessage) {
        if (mailMessage != null) {
            String b = mailMessage.mo151581b();
            for (MailImage mailImage : mailMessage.mo151611k()) {
                mailImage.mo151470a(b);
            }
        }
    }

    /* renamed from: b */
    private ViewPager m171673b(View view) {
        if (!(view.getParent() instanceof View)) {
            return null;
        }
        View view2 = (View) view.getParent();
        if (view2 instanceof ViewPager) {
            return (ViewPager) view2;
        }
        return m171673b(view2);
    }

    /* renamed from: a */
    public void mo154598a(C42097j jVar) {
        m171672a(jVar.mo151964g());
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(jVar.mo151964g().mo151611k());
        this.f110963y.mo155857a(arrayList);
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            if (this.f109945b == null) {
                this.f109945b = m171673b(getWebView());
            }
            ViewPager viewPager = this.f109945b;
            if (viewPager != null) {
                viewPager.requestDisallowInterceptTouchEvent(true);
            }
        }
        AbstractC43720d dVar = this.f109944a;
        if (dVar != null) {
            dVar.mo154429a(motionEvent);
        }
        ((C42349b) C42344d.m169091a(C42349b.class, getWebContext())).mo152459a(getWebView(), motionEvent, C42187a.C42190b.f107399b);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo154595a(Context context) {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setAllowFileAccess(true);
        C43199a aVar = new C43199a();
        this.f109948e = aVar;
        addJavascriptInterface(aVar, "messagelist");
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        mo30810a("biz.mail.tracker", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.message.view.p2212c.C43194a.C431951 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String optString = jSONObject.optString("event");
                    boolean optBoolean = jSONObject.optBoolean("isStart");
                    int optInt = jSONObject.optInt("timestamp");
                    JSONObject optJSONObject = jSONObject.optJSONObject("params");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("isStart", optBoolean);
                    jSONObject2.put("timestamp", optInt);
                    jSONObject2.put("params", optJSONObject);
                    C42187a.m168487a(optString, jSONObject2);
                } catch (Exception e) {
                    Log.m165384e("MailMessageWebView", "BIZ_MAIL_TRACKER", e);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            setOnScrollChangeListener(new View.OnScrollChangeListener() {
                /* class com.ss.android.lark.mail.impl.message.view.p2212c.C43194a.View$OnScrollChangeListenerC431962 */

                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    ((C42349b) C42344d.m169091a(C42349b.class, C43194a.this.getWebContext())).mo152458a(view, i, i2, i3, i4, C42187a.C42190b.f107399b);
                }
            });
        }
    }

    /* renamed from: a */
    public String[] mo154602a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return strArr;
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = C43032aa.m171193e(str);
            }
            i++;
        }
        return strArr2;
    }

    /* renamed from: a */
    public void mo154599a(AbstractC43719c cVar, AbstractC43201b bVar) {
        C43728g gVar = new C43728g(this);
        gVar.mo155854a(bVar);
        mo155848a(gVar, cVar);
    }

    public C43194a(Context context, boolean z) {
        super(context);
        this.f109946c = "MailMessageWebView";
        this.f109950g = z;
        mo154595a(context);
        C41816b.m166115a().mo150126a(getWebView(), "mail_message_webView");
    }

    /* renamed from: a */
    public void mo154600a(List<MailImage> list, C43728g.C43743a aVar) {
        if (this.f110963y != null) {
            this.f110963y.mo155858a(list, aVar);
        }
    }

    /* renamed from: a */
    public void mo154601a(List<C42097j> list, String str) {
        if (!(list == null || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (C42097j jVar : list) {
                MailMessage g = jVar.mo151964g();
                if (g != null) {
                    m171672a(g);
                    arrayList.addAll(g.mo151611k());
                }
            }
            mo154600a(arrayList, new C43728g.C43743a.C43744a().mo155881a(str).mo155882a(true).mo155883a());
        }
    }

    /* renamed from: c */
    public void mo154605c(final ValueCallback<String> valueCallback, final String str, final String... strArr) {
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.mail.impl.message.view.p2212c.C43194a.RunnableC431973 */

            public void run() {
                final StringBuilder sb = new StringBuilder();
                String[] a = C43194a.this.mo154602a(strArr);
                sb.append("javascript:");
                sb.append(str);
                sb.append("(");
                if (a != null && a.length > 0) {
                    for (String str : a) {
                        sb.append("\"");
                        sb.append(str);
                        sb.append("\"");
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append(")");
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.message.view.p2212c.C43194a.RunnableC431973.RunnableC431981 */

                    public void run() {
                        C43194a.this.evaluateJavascript(sb.toString(), valueCallback);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo154603b(ValueCallback<String> valueCallback, String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(str);
        sb.append("(");
        if (strArr != null && strArr.length > 0) {
            for (String str2 : strArr) {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(")");
        evaluateJavascript(sb.toString(), valueCallback);
    }

    /* renamed from: a */
    public void mo154597a(ValueCallback<String> valueCallback, String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        String[] a = mo154602a(strArr);
        sb.append("javascript:");
        sb.append(str);
        sb.append("(");
        if (a != null && a.length > 0) {
            for (String str2 : a) {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(")");
        loadUrl(sb.toString());
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (z) {
            if (this.f109945b == null) {
                this.f109945b = m171673b(getWebView());
            }
            ViewPager viewPager = this.f109945b;
            if (viewPager != null) {
                viewPager.requestDisallowInterceptTouchEvent(false);
            }
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // com.bytedance.ee.bear.webview.fps.FpsWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC43720d dVar = this.f109944a;
        if (dVar != null) {
            dVar.mo154428a(i, i2, i3, i4);
        }
        if (C42871i.m170779b() && (view = this.f109951h) != null) {
            view.scrollTo(0, i2);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        if (!TextUtils.isEmpty(str2)) {
            this.f109949f = (long) str2.length();
        }
    }
}
