package com.larksuite.component.webview.container;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.p677e.C13439c;
import com.larksuite.component.webview.container.dto.C25834e;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.aq;
import com.ss.android.lark.log.Log;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.larksuite.component.webview.container.a */
public class C25819a {

    /* renamed from: a */
    private static final String[] f63895a = {"tel", "voicemail", "sms", "smsto", "mms", "mmsto", "mailto", "geo"};

    /* renamed from: a */
    public static boolean m93327a(String str) {
        if (!TextUtils.isEmpty(str) && m93333d(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m93332c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : f63895a) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m93330b(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(aq.m95057a(str), "intent")) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(Intent.parseUri(str, 1).getStringExtra("browser_fallback_url"))) {
                return false;
            }
            return true;
        } catch (URISyntaxException e) {
            Log.m165386e("WebContainerUrlInterceptor", e);
            return false;
        } catch (Exception e2) {
            Log.m165386e("WebContainerUrlInterceptor", e2);
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m93333d(String str) {
        try {
            if (!TextUtils.isEmpty(Uri.parse(str).getScheme()) && !aq.m95060c(str) && !str.startsWith("larkbridge://") && !str.startsWith("larkbridge://return/")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m93329b(Context context, String str) {
        return m93331c(context, str).mo91905a();
    }

    /* renamed from: a */
    public static boolean m93325a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !m93333d(str)) {
            return false;
        }
        String a = aq.m95057a(str);
        if (TextUtils.isEmpty(a)) {
            return true;
        }
        if (m93332c(a)) {
            Log.m165389i("WebContainerUrlInterceptor", "intercept system schema");
            return m93329b(context, str);
        }
        Log.m165389i("WebContainerUrlInterceptor", "intercept unknown schema abort loading");
        return true;
    }

    /* renamed from: a */
    private static ArrayList<String> m93323a(List<ResolveInfo> list, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list == null) {
            return arrayList;
        }
        for (ResolveInfo resolveInfo : list) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && (!(intentFilter.countDataAuthorities() == 0 && intentFilter.countDataPaths() == 0) && (TextUtils.isEmpty(str) || (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(str))))) {
                if (resolveInfo.activityInfo != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                } else {
                    arrayList.add("");
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static C25834e m93331c(Context context, String str) {
        ResolveInfo resolveInfo;
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.addCategory("android.intent.category.BROWSABLE");
            parseUri.setComponent(null);
            parseUri.addFlags(268435456);
            try {
                resolveInfo = context.getPackageManager().resolveActivity(parseUri, 0);
            } catch (Exception e) {
                Log.m165384e("WebContainerUrlInterceptor", "customUrlInterceptor resolveActivity exception", e);
                resolveInfo = null;
            }
            if (resolveInfo == null) {
                Log.m165383e("WebContainerUrlInterceptor", "customUrlInterceptor resolveActivity is null, url:" + str);
                C13439c.m54612a().mo49846a(new Runnable(context) {
                    /* class com.larksuite.component.webview.container.$$Lambda$a$EKi9vvv_MFVhqNQkE8Y8dHi5qv0 */
                    public final /* synthetic */ Context f$0;

                    {
                        this.f$0 = r1;
                    }

                    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
                        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
                        	at java.base/java.util.ArrayList.get(ArrayList.java:459)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.replaceUnknownTypes(MethodInvokeVisitor.java:299)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:258)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                        */
                    public final void run() {
                        /*
                            r1 = this;
                            android.content.Context r0 = r1.f$0
                            com.larksuite.component.webview.container.C25819a.lambda$EKi9vvv_MFVhqNQkE8Y8dHi5qv0(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.webview.container.$$Lambda$a$EKi9vvv_MFVhqNQkE8Y8dHi5qv0.run():void");
                    }
                });
                return new C25834e(true, true);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(resolveInfo);
            parseUri.putExtra("org.chromium.chrome.browser.eenp", m93323a(arrayList, (String) null));
            try {
                context.startActivity(parseUri);
            } catch (Exception e2) {
                Log.m165384e("WebContainerUrlInterceptor", "customUrlInterceptor startActivity exception", e2);
            }
            return new C25834e(true, false);
        } catch (Exception e3) {
            Log.m165384e("WebContainerUrlInterceptor", "customUrlInterceptor parseUri exception", e3);
            return new C25834e(false, false);
        }
    }

    /* renamed from: a */
    public static boolean m93326a(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(aq.m95057a(str), "intent")) {
            return false;
        }
        try {
            String stringExtra = Intent.parseUri(str, 1).getStringExtra("browser_fallback_url");
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            webView.stopLoading();
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable(webView, stringExtra) {
                /* class com.larksuite.component.webview.container.$$Lambda$a$Bc4UiRobk0SEeiWwbPEqpCZ3kSc */
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
        } catch (URISyntaxException e) {
            Log.m165386e("WebContainerUrlInterceptor", e);
            return false;
        } catch (Exception e2) {
            Log.m165386e("WebContainerUrlInterceptor", e2);
            return false;
        }
    }
}
