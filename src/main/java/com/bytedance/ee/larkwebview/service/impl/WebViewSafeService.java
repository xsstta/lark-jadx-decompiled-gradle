package com.bytedance.ee.larkwebview.service.impl;

import android.webkit.ValueCallback;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.quality.safe.ISafeService;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewSafeService;", "Lcom/bytedance/ee/larkwebview/quality/safe/ISafeService;", "()V", "mConsoleInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mEnable", "", "mLarkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "detach", "", "enableVConsole", "handleVConsole", "init", "larkWebView", "isVConsoleEnable", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.service.a.f */
public final class WebViewSafeService implements ISafeService {

    /* renamed from: a */
    public static final Companion f35512a = new Companion(null);

    /* renamed from: b */
    private final AtomicBoolean f35513b = new AtomicBoolean(false);

    /* renamed from: c */
    private LarkWebView f35514c;

    /* renamed from: d */
    private boolean f35515d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/larkwebview/service/impl/WebViewSafeService$Companion;", "", "()V", "TAG", "", "VCONSOLE_JS", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.service.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.larkwebview.quality.safe.ISafeService
    /* renamed from: a */
    public void mo49834a() {
        if (this.f35515d && !this.f35513b.get()) {
            LarkWebView larkWebView = this.f35514c;
            if (larkWebView != null) {
                larkWebView.evaluateJavascript("if(!document.getElementById(\"lkwScript\")){var lkwScript=document.createElement(\"script\");lkwScript.setAttribute(\"id\",\"lkwScript\");lkwScript.setAttribute(\"type\",\"text/javascript\");lkwScript.onload=function(){var vConsole=new VConsole()};lkwScript.setAttribute(\"src\",\"https://cdn.bootcdn.net/ajax/libs/vConsole/3.3.4/vconsole.min.js\");document.getElementsByTagName(\"head\")[0].appendChild(lkwScript)};", C13466b.f35516a);
            }
            this.f35513b.set(true);
        }
    }

    @Override // com.bytedance.ee.larkwebview.quality.safe.ISafeService
    /* renamed from: a */
    public void mo49835a(LarkWebView larkWebView) {
        this.f35514c = larkWebView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onReceiveValue"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.service.a.f$b */
    static final class C13466b<T> implements ValueCallback<String> {

        /* renamed from: a */
        public static final C13466b f35516a = new C13466b();

        C13466b() {
        }

        /* renamed from: a */
        public final void onReceiveValue(String str) {
            Log.m165379d("WebViewSafeService", "receive callback " + str);
        }
    }
}
