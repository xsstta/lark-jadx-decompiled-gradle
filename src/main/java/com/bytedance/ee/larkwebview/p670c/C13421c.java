package com.bytedance.ee.larkwebview.p670c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lynx.webview.glue.TTWebViewPlugin;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.c.c */
public class C13421c extends TTWebViewPlugin {

    /* renamed from: a */
    private String f35374a;

    /* renamed from: b */
    private Context f35375b;

    /* renamed from: c */
    private ViewGroup f35376c;

    /* renamed from: d */
    private View f35377d;

    /* renamed from: e */
    private int f35378e;

    /* renamed from: f */
    private int f35379f;

    /* renamed from: g */
    private int f35380g;

    /* renamed from: h */
    private int f35381h;

    /* renamed from: i */
    private int f35382i;

    /* renamed from: j */
    private int f35383j;

    /* renamed from: k */
    private AbstractC13420b f35384k;

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPlugin
    public Object get(String str) {
        return null;
    }

    /* renamed from: b */
    public String mo49808b() {
        return this.f35374a;
    }

    /* renamed from: e */
    private void m54555e() {
        View view;
        ViewGroup viewGroup = this.f35376c;
        if (viewGroup != null && (view = this.f35377d) != null) {
            viewGroup.removeView(view);
            this.f35377d = null;
            AbstractC13420b bVar = this.f35384k;
            if (bVar != null) {
                bVar.mo48175c();
            }
        }
    }

    /* renamed from: d */
    private void m54554d() {
        View view = this.f35377d;
        if (view == null) {
            Log.m165389i("PlatformViewPlugin", "layout is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            this.f35377d.setX((float) (this.f35378e - this.f35382i));
            this.f35377d.setY((float) (this.f35379f - this.f35383j));
            layoutParams.width = this.f35380g;
            layoutParams.height = this.f35381h;
            this.f35377d.requestLayout();
        }
    }

    /* renamed from: c */
    private void m54553c() {
        if (this.f35375b == null || this.f35376c == null) {
            Log.m165388i("context is " + this.f35375b + ", container is " + this.f35376c);
            return;
        }
        View view = this.f35377d;
        if (view != null) {
            if (view.getParent() == null) {
                this.f35376c.addView(this.f35377d);
                Log.m165389i("PlatformViewPlugin", "mixrender add view");
            } else {
                Log.m165389i("PlatformViewPlugin", "mixrender has parent so do nothing when show");
            }
        }
        m54554d();
    }

    /* renamed from: a */
    public void mo49807a() {
        Object query = query("viewID");
        if (query instanceof String) {
            this.f35374a = (String) query;
            Log.m165389i("PlatformViewPlugin", "mViewID=" + this.f35374a);
            Object query2 = query("context");
            if (query2 instanceof Context) {
                this.f35375b = (Context) query2;
                Object query3 = query("container");
                if (query3 instanceof ViewGroup) {
                    this.f35376c = (ViewGroup) query3;
                    AbstractC13420b b = C13422d.m54558a().mo49813b(this.f35374a);
                    this.f35384k = b;
                    if (b == null) {
                        Log.m165389i("PlatformViewPlugin", "factory is null, viewID: " + this.f35374a);
                        return;
                    }
                    this.f35378e = 0;
                    this.f35379f = 0;
                    this.f35380g = 0;
                    this.f35381h = 0;
                    this.f35382i = 0;
                    this.f35383j = 0;
                    this.f35377d = b.mo48174b();
                    m54553c();
                    return;
                }
                Log.m165389i("PlatformViewPlugin", "container is not ViewGroup type");
                return;
            }
            Log.m165389i("PlatformViewPlugin", "context is not context type");
            return;
        }
        Log.m165389i("PlatformViewPlugin", "viewId is not string type");
    }

    public C13421c(Object obj) {
        super(obj);
        mo49807a();
    }

    /* renamed from: a */
    private void m54551a(Bundle bundle) {
        if (bundle != null) {
            this.f35378e = bundle.getInt("x");
            this.f35379f = bundle.getInt("y");
            this.f35380g = bundle.getInt("width");
            this.f35381h = bundle.getInt("height");
            m54554d();
            AbstractC13420b bVar = this.f35384k;
            if (bVar != null) {
                bVar.mo48173a(this.f35378e, this.f35379f, this.f35380g, this.f35381h);
            }
        }
    }

    /* renamed from: b */
    private void m54552b(Bundle bundle) {
        if (bundle != null) {
            this.f35382i = bundle.getInt("x");
            this.f35383j = bundle.getInt("y");
            m54554d();
            AbstractC13420b bVar = this.f35384k;
            if (bVar != null) {
                bVar.mo48172a(this.f35382i, this.f35383j);
            }
        }
    }

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPlugin
    public boolean execute(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1431461666:
                if (str.equals("updateBounds")) {
                    c = 0;
                    break;
                }
                break;
            case -955936522:
                if (str.equals("updateScroll")) {
                    c = 1;
                    break;
                }
                break;
            case 1557372922:
                if (str.equals("destroy")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m54551a(bundle);
                break;
            case 1:
                m54552b(bundle);
                break;
            case 2:
                m54555e();
                break;
            default:
                return false;
        }
        return true;
    }
}
