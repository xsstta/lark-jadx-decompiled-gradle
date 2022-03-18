package com.ss.android.lark.live.webview;

import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.utils.C47117q;

/* renamed from: com.ss.android.lark.live.webview.d */
public class C41538d {

    /* renamed from: a */
    private VcWebViewAdapter f105599a;

    /* renamed from: b */
    private final Runnable f105600b = new Runnable() {
        /* class com.ss.android.lark.live.webview.$$Lambda$d$2wzwcxFWNjJXwy2rM2koRVPKPA */

        public final void run() {
            C41538d.this.m164839e();
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.live.webview.d$a */
    public static class C41539a {

        /* renamed from: a */
        public static final C41538d f105601a = new C41538d();
    }

    /* renamed from: a */
    public static C41538d m164835a() {
        return C41539a.f105601a;
    }

    /* renamed from: d */
    private void m164838d() {
        C45855f.m181664c("VcLiveWebAdapterCache", "[cancelCleanTask]");
        C45859k.m181687b(this.f105600b);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m164839e() {
        C45855f.m181664c("VcLiveWebAdapterCache", "[run] execute clearCache");
        mo149457b();
    }

    /* renamed from: c */
    private void m164837c() {
        C45855f.m181664c("VcLiveWebAdapterCache", "[startCleanTask]");
        C45859k.m181687b(this.f105600b);
        C45859k.m181686a(this.f105600b, 10000);
    }

    /* renamed from: b */
    public synchronized void mo149457b() {
        VcWebViewAdapter vcWebViewAdapter = this.f105599a;
        if (vcWebViewAdapter != null) {
            vcWebViewAdapter.mo149438f();
            this.f105599a = null;
            C45855f.m181664c("VcLiveWebAdapterCache", "[clearCache] success");
        } else {
            C45855f.m181664c("VcLiveWebAdapterCache", "[clearCache2] failed, no cached adapter");
        }
    }

    /* renamed from: a */
    public synchronized VcWebViewAdapter mo149455a(String str) {
        VcWebViewAdapter vcWebViewAdapter = this.f105599a;
        if (vcWebViewAdapter != null) {
            if (m164836a(str, vcWebViewAdapter.mo149433b().getUrl())) {
                VcWebViewAdapter vcWebViewAdapter2 = this.f105599a;
                this.f105599a = null;
                m164838d();
                C45855f.m181663b("VcLiveWebAdapterCache", "[getCache] hit cache " + str);
                return vcWebViewAdapter2;
            }
            mo149457b();
            m164838d();
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void mo149456a(VcWebViewAdapter vcWebViewAdapter) {
        VcWebViewAdapter vcWebViewAdapter2 = this.f105599a;
        if (vcWebViewAdapter2 != null) {
            vcWebViewAdapter2.mo149438f();
        }
        if (vcWebViewAdapter != null) {
            C47117q.m186583a(vcWebViewAdapter.mo149433b());
            vcWebViewAdapter.mo149433b().setWebChromeClient(null);
            vcWebViewAdapter.mo149433b().setWebViewClient(null);
            vcWebViewAdapter.mo149431a((Runnable) null);
            vcWebViewAdapter.mo149434b((Runnable) null);
            this.f105599a = vcWebViewAdapter;
            m164837c();
        }
    }

    /* renamed from: a */
    public static boolean m164836a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (!TextUtils.equals(parse.getHost(), parse2.getHost()) || !TextUtils.equals(parse.getPath(), parse2.getPath())) {
            return false;
        }
        return true;
    }
}
