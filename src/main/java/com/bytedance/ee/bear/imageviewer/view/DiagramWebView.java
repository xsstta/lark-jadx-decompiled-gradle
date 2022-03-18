package com.bytedance.ee.bear.imageviewer.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.widgets.RotateLoadingView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class DiagramWebView extends WebView {

    /* renamed from: a */
    public View.OnClickListener f21232a;

    /* renamed from: b */
    private GestureDetector f21233b;

    /* renamed from: c */
    private LazyLoadingHelper f21234c;

    /* renamed from: a */
    public void mo30679a() {
        clearHistory();
        loadUrl("about:blank");
    }

    /* renamed from: b */
    private void m31551b() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWebChromeClient(new WebChromeClient());
        setBackgroundColor(getResources().getColor(R.color.space_kit_black));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RotateLoadingView rotateLoadingView = new RotateLoadingView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13749l.m55738a(42), C13749l.m55738a(42));
        layoutParams.addRule(13);
        relativeLayout.addView(rotateLoadingView, layoutParams);
        addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        LazyLoadingHelper aVar = new LazyLoadingHelper(relativeLayout);
        this.f21234c = aVar;
        aVar.mo30695a();
        this.f21233b = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.imageviewer.view.DiagramWebView.C78641 */

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                if (DiagramWebView.this.f21232a == null) {
                    return false;
                }
                DiagramWebView.this.f21232a.onClick(DiagramWebView.this);
                return false;
            }
        });
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f21232a = onClickListener;
    }

    public DiagramWebView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m31552c(String str) {
        C13479a.m54772d("DiagramWebView", "notifyJSRenderSVG()... JS onReceiveValue");
        this.f21234c.mo30696b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f21233b.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo30680a(final String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DiagramWebView", "loadSVG()... svgString is empty");
            return;
        }
        setWebViewClient(new WebViewClient() {
            /* class com.bytedance.ee.bear.imageviewer.view.DiagramWebView.C78652 */

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                DiagramWebView.this.mo30681b(str);
            }
        });
        loadUrl("file:///android_asset/diagram/diagram_template.html");
    }

    /* renamed from: b */
    public void mo30681b(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("svgString", (Object) str);
        C13742g.m55705a(new Runnable(jSONObject) {
            /* class com.bytedance.ee.bear.imageviewer.view.$$Lambda$DiagramWebView$aODELACi2QucW7hmF8R7DkBjLk */
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                DiagramWebView.m269544lambda$aODELACi2QucW7hmF8R7DkBjLk(DiagramWebView.this, this.f$1);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m31550a(JSONObject jSONObject) {
        evaluateJavascript("javascript:setSVGContent(" + jSONObject.toJSONString() + ")", new ValueCallback() {
            /* class com.bytedance.ee.bear.imageviewer.view.$$Lambda$DiagramWebView$gY3Uw3AwthXm76iCQZ39JWUNsO0 */

            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                DiagramWebView.lambda$gY3Uw3AwthXm76iCQZ39JWUNsO0(DiagramWebView.this, (String) obj);
            }
        });
    }

    public DiagramWebView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public DiagramWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31551b();
    }
}
