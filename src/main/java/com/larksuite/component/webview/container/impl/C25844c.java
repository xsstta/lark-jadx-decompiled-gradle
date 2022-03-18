package com.larksuite.component.webview.container.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.larksuite.component.webview.container.impl.c */
public class C25844c {

    /* renamed from: a */
    private HashSet<String> f63939a = new HashSet<>();

    /* renamed from: b */
    private HashSet<String> f63940b = new HashSet<>();

    /* renamed from: c */
    private String f63941c;

    /* renamed from: d */
    private IWebContainerContract.AbstractC25826a f63942d;

    /* renamed from: a */
    private boolean m93508a() {
        AbstractC25820a a = C25821b.m93347a();
        if (a == null) {
            Log.m165389i("SecurityLinkChecker", "WebContainerDependency.getDependency() is null");
            return false;
        } else if (!this.f63942d.mo67343c() || !a.mo91848a("lark.browser.security.link")) {
            return false;
        } else {
            return true;
        }
    }

    public C25844c(IWebContainerContract.AbstractC25826a aVar) {
        this.f63942d = aVar;
        if (m93508a()) {
            this.f63941c = C25821b.m93347a().mo91849b();
        }
    }

    /* renamed from: b */
    public void mo91940b(String str) {
        if (m93508a() && !TextUtils.isEmpty(this.f63941c)) {
            if (!str.startsWith("https://" + this.f63941c)) {
                this.f63939a.clear();
                this.f63940b.add(str);
            }
        }
    }

    /* renamed from: a */
    public String mo91938a(String str) {
        if (!m93508a() || TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f63941c)) {
            return str;
        }
        List<String> c = C25821b.m93347a().mo91851c();
        try {
            String b = aq.m95059b(str);
            if (!TextUtils.isEmpty(b) && !CollectionUtils.isEmpty(c)) {
                for (String str2 : c) {
                    if (Pattern.compile(str2).matcher(b).matches()) {
                        return str;
                    }
                }
            }
        } catch (PatternSyntaxException e) {
            Log.m165391i("SecurityLinkChecker", e);
        } catch (UnsupportedOperationException e2) {
            Log.m165391i("SecurityLinkChecker", e2);
        } catch (IllegalArgumentException e3) {
            Log.m165391i("SecurityLinkChecker", e3);
        } catch (Exception e4) {
            Log.m165391i("SecurityLinkChecker", e4);
        }
        if (str.startsWith(this.f63941c) || this.f63939a.contains(str) || this.f63940b.contains(str)) {
            return str;
        }
        this.f63939a.add(str);
        String str3 = "https://" + this.f63941c + "/link/safety?scene=messenger&target=" + Uri.encode(str);
        if (C26284k.m95185a(C25821b.m93347a().mo91844a())) {
            Log.m165379d("SecurityLinkChecker", "getSecurityLink : from " + str + " to " + str3);
        }
        return str3;
    }

    /* renamed from: a */
    public boolean mo91939a(WebView webView, String str) {
        if (!m93508a()) {
            return false;
        }
        if (webView.getTag(R.id.from_window_open) == true) {
            webView.setTag(R.id.from_window_open, false);
            return false;
        } else if (webView.getHitTestResult() == null || webView.getHitTestResult().getType() == 0) {
            this.f63940b.add(str);
            return false;
        } else {
            String a = mo91938a(str);
            if (TextUtils.equals(a, str)) {
                return false;
            }
            webView.post(new Runnable(webView, a) {
                /* class com.larksuite.component.webview.container.impl.$$Lambda$c$yNOP1abaknZR6oOgzsnpvx7Jis */
                public final /* synthetic */ WebView f$0;
                public final /* synthetic */ String f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    this.f$0.loadUrl(this.f$1);
                }
            });
            return true;
        }
    }
}
