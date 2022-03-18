package com.bytedance.lark.webview.container.impl.p835a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25852c;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h;
import com.larksuite.component.webview.container.impl.p1172c.C25845a;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* renamed from: com.bytedance.lark.webview.container.impl.a.c */
public class C19853c implements AbstractC25857h {

    /* renamed from: a */
    protected static final FrameLayout.LayoutParams f48454a = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: b */
    private Fragment f48455b;

    /* renamed from: c */
    private LarkWebView f48456c;

    /* renamed from: d */
    private Activity f48457d;

    /* renamed from: e */
    private View f48458e;

    /* renamed from: f */
    private WebChromeClient.CustomViewCallback f48459f;

    /* renamed from: g */
    private int f48460g;

    /* renamed from: h */
    private C19854a f48461h;

    /* renamed from: i */
    private AbstractC25852c f48462i;

    /* renamed from: j */
    private Bundle f48463j;

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public void mo67252a() {
        m72412d();
    }

    /* renamed from: c */
    public AbstractC25852c mo67260c() {
        return this.f48462i;
    }

    /* renamed from: b */
    public boolean mo67259b() {
        if (m72412d()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private boolean m72412d() {
        if (this.f48458e == null) {
            return false;
        }
        boolean z = true;
        this.f48456c.setVisibility(0);
        ((FrameLayout) this.f48457d.getWindow().getDecorView()).removeView(this.f48461h);
        this.f48458e = null;
        this.f48461h = null;
        try {
            this.f48459f.onCustomViewHidden();
            this.f48459f = null;
        } catch (Exception unused) {
            this.f48459f = null;
            z = false;
        } catch (Throwable th) {
            this.f48459f = null;
            throw th;
        }
        this.f48456c.setVisibility(0);
        this.f48457d.setRequestedOrientation(this.f48460g);
        StatusBarUtil.showStatusBar(this.f48457d);
        this.f48457d.getWindow().clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lark.webview.container.impl.a.c$a */
    public static class C19854a extends FrameLayout {
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* renamed from: a */
        public void mo67261a(View view) {
            addView(view, C19853c.f48454a);
        }

        public C19854a(Context context) {
            super(context);
            setBackgroundColor(context.getResources().getColor(17170444));
        }
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public void mo67255a(WebView webView) {
        Activity activity = this.f48457d;
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: a */
    public void mo67256a(LarkWebView larkWebView) {
        this.f48456c = larkWebView;
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public void mo67254a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        mo67253a(view, 6, customViewCallback);
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public void mo67253a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        m72411b(view, i, customViewCallback);
    }

    public C19853c(Fragment fragment, LarkWebView larkWebView, Bundle bundle) {
        this.f48455b = fragment;
        this.f48456c = larkWebView;
        this.f48463j = bundle;
        this.f48457d = fragment.getActivity();
    }

    /* renamed from: b */
    private void m72411b(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.f48457d;
        if (activity != null) {
            if (this.f48458e != null || !activity.getWindow().isActive()) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f48460g = this.f48457d.getRequestedOrientation();
            C19854a aVar = new C19854a(view.getContext());
            this.f48461h = aVar;
            aVar.mo67261a(view);
            ((FrameLayout) this.f48457d.getWindow().getDecorView()).addView(this.f48461h, new FrameLayout.LayoutParams(-1, -1));
            this.f48456c.setVisibility(8);
            this.f48458e = view;
            this.f48459f = customViewCallback;
            this.f48457d.setRequestedOrientation(i);
            StatusBarUtil.hideStatusBar(this.f48457d);
            this.f48457d.getWindow().addFlags(SmActions.ACTION_ONTHECALL_EXIT);
        }
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public boolean mo67257a(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        C25845a aVar = new C25845a(this.f48455b);
        this.f48462i = aVar;
        aVar.mo91945a(valueCallback, fileChooserParams);
        return true;
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25857h
    /* renamed from: a */
    public boolean mo67258a(WebView webView, boolean z, boolean z2, Message message) {
        C19849a.m72399a().mo67250a(this.f48457d, webView, message, this.f48463j);
        return true;
    }
}
