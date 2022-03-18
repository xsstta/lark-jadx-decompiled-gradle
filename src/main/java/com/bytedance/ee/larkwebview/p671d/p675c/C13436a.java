package com.bytedance.ee.larkwebview.p671d.p675c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.BaseWebView;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import com.bytedance.ee.larkwebview.p668b.AbstractC13397a;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.log.Log;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.bytedance.ee.larkwebview.d.c.a */
public class C13436a {

    /* renamed from: a */
    private HashSet<String> f35411a = new HashSet<>();

    /* renamed from: b */
    private HashSet<String> f35412b = new HashSet<>();

    /* renamed from: c */
    private String f35413c;

    /* renamed from: d */
    private AbstractC13402a f35414d;

    public C13436a(AbstractC13402a aVar) {
        this.f35414d = aVar;
        AbstractC13397a a = C13398b.m54466a();
        if (a != null) {
            this.f35413c = a.mo22589a();
        } else {
            Log.m165389i("SecurityLinkChecker", "securityLink check host null");
        }
    }

    /* renamed from: b */
    public void mo49839b(String str) {
        if (!TextUtils.isEmpty(this.f35413c)) {
            if (!str.startsWith("https://" + this.f35413c)) {
                this.f35411a.clear();
                this.f35412b.add(str);
            }
        }
    }

    /* renamed from: a */
    public String mo49837a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("SecurityLinkChecker", "originUrl is empty so return originUrl");
            return str;
        } else if (TextUtils.isEmpty(this.f35413c)) {
            Log.m165389i("SecurityLinkChecker", "SecurityLinkCheckHost is empty so return origin Url");
            return str;
        } else {
            AbstractC13397a a = C13398b.m54466a();
            if (a == null) {
                Log.m165389i("SecurityLinkChecker", "ILarkWebViewDependency == null , so return origin url");
                return str;
            }
            List<String> b = a.mo22592b();
            if (CollectionUtils.isEmpty(b)) {
                Log.m165389i("SecurityLinkChecker", "allowList is empty so return origin url");
                return str;
            }
            try {
                String b2 = aq.m95059b(str);
                if (!TextUtils.isEmpty(b2)) {
                    for (String str2 : b) {
                        if (Pattern.compile(str2).matcher(b2).matches()) {
                            Log.m165389i("SecurityLinkChecker", "match allowList , so return origin url");
                            return str;
                        }
                    }
                }
            } catch (PatternSyntaxException e) {
                Log.m165383e("SecurityLinkChecker", "getSecurityLink , PatternSyntaxException = " + e);
            } catch (UnsupportedOperationException e2) {
                Log.m165383e("SecurityLinkChecker", "getSecurityLink , UnsupportedOperationException = " + e2);
            } catch (IllegalArgumentException e3) {
                Log.m165383e("SecurityLinkChecker", "getSecurityLink , IllegalArgumentException = " + e3);
            } catch (Exception e4) {
                Log.m165383e("SecurityLinkChecker", "getSecurityLink , Exception = " + e4);
            }
            if (str.startsWith(this.f35413c) || this.f35411a.contains(str) || this.f35412b.contains(str)) {
                Log.m165389i("SecurityLinkChecker", "default return originUrl");
                return str;
            }
            this.f35411a.add(str);
            String str3 = "https://" + this.f35413c + "/link/safety?scene=messenger&target=" + Uri.encode(str);
            Log.m165389i("SecurityLinkChecker", "join security link " + str3);
            return str3;
        }
    }

    /* renamed from: a */
    public boolean mo49838a(BaseWebView baseWebView, String str) {
        if (baseWebView.mo49719p()) {
            baseWebView.setOpenFromMultiWindow(false);
            Log.m165389i("SecurityLinkChecker", "shouldInterceptUrlLoading is openFromMulti so return false");
            return false;
        } else if (baseWebView.getHitTestResult() == null || baseWebView.getHitTestResult().getType() == 0) {
            this.f35412b.add(str);
            Log.m165389i("SecurityLinkChecker", "shouldInterceptUrlLoading hitTestResult = null || unknown so return false");
            return false;
        } else {
            String a = mo49837a(str);
            if (!TextUtils.equals(a, str)) {
                baseWebView.post(new Runnable(a) {
                    /* class com.bytedance.ee.larkwebview.p671d.p675c.$$Lambda$a$FfRW0ef7eGeW9nLtiyMnNYIyY0 */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        BaseWebView.this.loadUrl(this.f$1);
                    }
                });
                Log.m165389i("SecurityLinkChecker", "shouldInterceptUrlLoading not safeUrl so load safeUrl , return true");
                WebMonitorManager.f35486a.mo49880d(baseWebView);
                return true;
            }
            Log.m165389i("SecurityLinkChecker", "shouldInterceptUrlLoading default return false");
            return false;
        }
    }
}
