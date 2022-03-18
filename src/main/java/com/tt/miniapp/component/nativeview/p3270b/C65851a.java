package com.tt.miniapp.component.nativeview.p3270b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lynx.webview.glue.TTWebViewPlugin;
import com.tt.miniapp.view.webcore.C67231a;

/* renamed from: com.tt.miniapp.component.nativeview.b.a */
public class C65851a extends TTWebViewPlugin {

    /* renamed from: a */
    private int f165991a;

    /* renamed from: b */
    private Context f165992b;

    /* renamed from: c */
    private ViewGroup f165993c;

    /* renamed from: d */
    private int f165994d;

    /* renamed from: e */
    private int f165995e;

    /* renamed from: f */
    private int f165996f;

    /* renamed from: g */
    private int f165997g;

    /* renamed from: h */
    private int f165998h;

    /* renamed from: i */
    private int f165999i;

    /* renamed from: j */
    private C67231a f166000j;

    @Override // com.bytedance.lynx.webview.glue.TTWebViewPlugin
    public Object get(String str) {
        return null;
    }

    /* renamed from: a */
    private void m258022a() {
        this.f165992b = null;
        this.f166000j = null;
        this.f165993c = null;
        AppBrandLogger.m52828d("PlatformView destroy", new Object[0]);
    }

    /* renamed from: b */
    private void m258024b(Bundle bundle) {
        if (bundle != null) {
            this.f165998h = bundle.getInt("x");
            int i = bundle.getInt("y");
            this.f165999i = i;
            this.f166000j.mo233796a(this.f165991a, this.f165998h, i);
        }
    }

    /* renamed from: a */
    public void mo230609a(C67231a aVar) {
        this.f166000j = aVar;
        if (this.f165993c.getChildCount() == 0) {
            this.f165993c.addView(this.f166000j);
        }
    }

    public C65851a(Object obj) {
        super(obj);
        try {
            this.f165991a = Integer.parseInt((String) query("viewID"));
        } catch (NumberFormatException unused) {
            this.f165991a = 0;
        }
        this.f165992b = (Context) query("context");
        this.f165993c = (ViewGroup) query("container");
    }

    /* renamed from: a */
    private void m258023a(Bundle bundle) {
        if (bundle != null) {
            this.f165994d = bundle.getInt("x");
            this.f165995e = bundle.getInt("y");
            this.f165996f = bundle.getInt("width");
            this.f165997g = bundle.getInt("height");
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
                m258023a(bundle);
                break;
            case 1:
                m258024b(bundle);
                break;
            case 2:
                m258022a();
                break;
            default:
                return false;
        }
        return true;
    }
}
