package com.ss.android.lark.mail.impl.settings.subsetting.signature;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.view.p2212c.AbstractC43201b;
import com.ss.android.lark.mail.impl.message.view.p2212c.p2213a.C43199a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43720d;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43728g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.signature.i */
public class C43589i extends C43725f {

    /* renamed from: a */
    protected AbstractC43720d f110604a;

    /* renamed from: b */
    ViewPager f110605b;

    /* renamed from: c */
    private final String f110606c;

    /* renamed from: d */
    private C43199a.AbstractC43200a f110607d;

    /* renamed from: e */
    private C43199a f110608e;

    /* renamed from: f */
    private long f110609f;

    /* renamed from: g */
    private boolean f110610g;

    /* renamed from: h */
    private View f110611h;

    public C43728g getMailWebClient() {
        return this.f110963y;
    }

    public long getWebLoadDataLen() {
        return this.f110609f;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f
    /* renamed from: f */
    public void mo153475f() {
        super.mo153475f();
        this.f110607d = null;
        this.f110604a = null;
        this.f110609f = 0;
        this.f110605b = null;
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2, com.bytedance.ee.larkwebview.base.BaseWebView, com.bytedance.ee.larkwebview.base.LarkWebView
    public void loadUrl(String str) {
        super.loadUrl(str);
    }

    public void setWebViewTouchListener(AbstractC43720d dVar) {
        this.f110604a = dVar;
    }

    public C43589i(Context context) {
        this(context, false);
    }

    public void setWebJsPromptListener(C43199a.AbstractC43200a aVar) {
        this.f110607d = aVar;
        C43199a aVar2 = this.f110608e;
        if (aVar2 != null) {
            aVar2.mo154617a(aVar);
        }
    }

    /* renamed from: a */
    public void mo155585a(Context context) {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getSettings().setAllowFileAccess(true);
        C43199a aVar = new C43199a();
        this.f110608e = aVar;
        addJavascriptInterface(aVar, "signatureList");
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
    }

    public void setSignatureItem(List<MailEntSignature> list) {
        if (!(list == null || list.isEmpty())) {
            List<MailImage> arrayList = new ArrayList<>();
            for (MailEntSignature mailEntSignature : list) {
                List<MailImage> e = mailEntSignature.mo151393e();
                if (e != null) {
                    m173031a(mailEntSignature.mo151380a(), e);
                    arrayList.addAll(e);
                }
            }
            mo155587a(arrayList, (C43728g.C43743a) null);
        }
    }

    /* renamed from: a */
    public void mo155586a(AbstractC43719c cVar, AbstractC43201b bVar) {
        C43728g gVar = new C43728g(this);
        gVar.mo155854a(bVar);
        mo155848a(gVar, cVar);
    }

    public C43589i(Context context, boolean z) {
        super(context);
        this.f110606c = "MailSignatureWebView";
        this.f110610g = z;
        mo155585a(context);
        C41816b.m166115a().mo150126a(getWebView(), "mail_message_webView");
    }

    /* renamed from: a */
    private void m173031a(String str, List<MailImage> list) {
        if (!(list == null || TextUtils.isEmpty(str))) {
            for (MailImage mailImage : list) {
                mailImage.mo151470a(str);
            }
        }
    }

    /* renamed from: a */
    public void mo155587a(List<MailImage> list, C43728g.C43743a aVar) {
        if (this.f110963y != null) {
            this.f110963y.mo155858a(list, aVar);
        }
    }

    @Override // com.bytedance.ee.bear.webview.fps.FpsWebViewV2, com.bytedance.ee.larkwebview.base.LarkWebView
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC43720d dVar = this.f110604a;
        if (dVar != null) {
            dVar.mo154428a(i, i2, i3, i4);
        }
        if (C42871i.m170779b() && (view = this.f110611h) != null) {
            view.scrollTo(0, i2);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        if (!TextUtils.isEmpty(str2)) {
            this.f110609f = (long) str2.length();
        }
    }
}
