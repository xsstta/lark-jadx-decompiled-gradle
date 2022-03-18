package com.tt.miniapp.component.nativeview;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65903j;
import com.tt.miniapp.component.nativeview.p3271c.C65854a;
import com.tt.miniapp.component.nativeview.p3271c.C65868b;
import com.tt.miniapp.p3307n.C66493a;
import com.tt.miniapp.util.C67047m;
import com.tt.miniapp.view.webcore.C67231a;
import com.tt.miniapp.view.webcore.C67257d;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.WebEventCallback;

/* renamed from: com.tt.miniapp.component.nativeview.k */
public class C65911k implements NativeViewManager {

    /* renamed from: a */
    private C67257d f166316a;

    /* renamed from: b */
    private int f166317b;

    /* renamed from: c */
    private RenderViewManager.IRender f166318c;

    /* renamed from: d */
    private String f166319d;

    /* renamed from: e */
    private IAppContext f166320e;

    /* renamed from: f */
    private SparseArray<View> f166321f = new SparseArray<>();

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public SparseArray<View> getAllNativeViews() {
        return this.f166321f;
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public String getViewType() {
        return this.f166319d;
    }

    /* renamed from: a */
    public C65887g mo230780a() {
        int size = this.f166321f.size();
        for (int i = 0; i < size; i++) {
            View valueAt = this.f166321f.valueAt(i);
            if (valueAt instanceof C65887g) {
                return (C65887g) valueAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo230786b() {
        SparseArray<View> sparseArray = this.f166321f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                mo230782a(this.f166321f.keyAt(size), null);
            }
        }
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public String getCurrentUrl() {
        WebView webView;
        C65887g a = mo230780a();
        if (a == null || (webView = a.getWebView()) == null) {
            return null;
        }
        return webView.getUrl();
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public View getFocusedInput() {
        SparseArray<View> sparseArray = this.f166321f;
        if (sparseArray == null) {
            return null;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = this.f166321f.get(this.f166321f.keyAt(i));
            if ((view instanceof AbstractC65853c) && view.isFocused()) {
                return view;
            }
        }
        return null;
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public InputBean getCurrentInputValue() {
        InputBean inputBean = new InputBean();
        inputBean.inputId = -1;
        int size = this.f166321f.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.f166321f.keyAt(i);
            View view = this.f166321f.get(keyAt);
            if (view instanceof AbstractC65853c) {
                AbstractC65853c cVar = (AbstractC65853c) view;
                String type = cVar.getType();
                mo230785a(type);
                this.f166316a.setShowConfirmBar(Boolean.valueOf(cVar.getConfirm()));
                if (cVar.hasFocus()) {
                    inputBean.inputId = keyAt;
                    inputBean.value = cVar.getValue();
                    inputBean.cursor = cVar.getCursor();
                    inputBean.height = C66493a.m259858a(this.f166320e);
                    inputBean.type = type;
                    inputBean.scrollTop = cVar.getScrollTop();
                    return inputBean;
                }
            }
        }
        return inputBean;
    }

    /* renamed from: a */
    public void mo230785a(String str) {
        this.f166319d = str;
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public View getView(int i) {
        return this.f166321f.get(i);
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public void setShowConfirmBar(boolean z) {
        C67257d dVar = this.f166316a;
        if (dVar != null) {
            dVar.setShowConfirmBar(Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private C67231a m258188a(View view) {
        C67231a availableLayout = this.f166316a.getAvailableLayout();
        if (view == null) {
            return availableLayout;
        }
        if ((view instanceof C65844b) || (view instanceof C65887g) || !HostDependManager.getInst().enableTTRender(view)) {
            return this.f166316a.getAbsoluteLayout();
        }
        return availableLayout;
    }

    /* renamed from: c */
    private boolean m258190c(String str) {
        if (TextUtils.equals(str, "text") || TextUtils.equals(str, "digit") || TextUtils.equals(str, "number") || TextUtils.equals(str, "idcard")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private C67231a m258189b(String str) {
        C67231a aVar;
        String str2;
        if (TextUtils.equals(str, "textarea") || TextUtils.equals(str, "video") || TextUtils.equals(str, "map")) {
            aVar = this.f166316a.getAvailableLayout();
        } else {
            aVar = this.f166316a.getAbsoluteLayout();
        }
        Object[] objArr = new Object[2];
        objArr[0] = "use AbsoluteLayout: ";
        if (aVar == this.f166316a.getAbsoluteLayout()) {
            str2 = "AbsoluteLayout";
        } else {
            str2 = "BackAbsoluteLayout";
        }
        objArr[1] = str2;
        AppBrandLogger.m52828d("tma_NativeViewManager", objArr);
        return aVar;
    }

    /* renamed from: a */
    public void mo230781a(int i) {
        View view = this.f166321f.get(i);
        if (view != null && (view instanceof EditText)) {
            C67047m.m261305a(view, view.getContext().getApplicationContext());
        }
    }

    @Override // com.tt.miniapp.component.nativeview.NativeViewManager
    public View findViewWithCoordinates(float f, float f2) {
        int size = this.f166321f.size();
        for (int i = 0; i < size; i++) {
            View valueAt = this.f166321f.valueAt(i);
            if (valueAt != null && ((float) valueAt.getRight()) > f && ((float) valueAt.getTop()) < f2 && ((float) valueAt.getBottom()) > f2 && ((float) valueAt.getLeft()) < f) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo230782a(int i, WebEventCallback webEventCallback) {
        AppBrandLogger.m52830i("tma_NativeViewManager", "removeView viewId ", Integer.valueOf(i));
        View view = this.f166321f.get(i);
        if (view != null) {
            if (view instanceof AbstractC65886f) {
                ((AbstractC65886f) view).mo48876a(i, webEventCallback);
            }
            this.f166321f.delete(i);
            m258188a(view).removeView(view);
        }
    }

    /* renamed from: a */
    public void mo230783a(int i, String str, WebEventCallback webEventCallback) {
        View view = this.f166321f.get(i);
        if (view instanceof AbstractC65886f) {
            ((AbstractC65886f) view).mo48877a(str, webEventCallback);
            return;
        }
        AppBrandLogger.m52831w("tma_NativeViewManager", "updateView, invalid view: ", view);
    }

    public C65911k(RenderViewManager.IRender iRender, C67257d dVar, int i, IAppContext iAppContext) {
        this.f166320e = iAppContext;
        this.f166316a = dVar;
        this.f166317b = i;
        this.f166318c = iRender;
    }

    /* renamed from: a */
    public void mo230784a(int i, String str, String str2, WebEventCallback webEventCallback) {
        AppBrandLogger.m52830i("tma_NativeViewManager", "viewType ", str, ", viewId ", Integer.valueOf(i));
        C67231a b = m258189b(str);
        AbstractC65886f nativeComponentView = HostDependManager.getInst().getNativeComponentView(str, i, this.f166317b, b, this.f166316a, this.f166318c);
        if (nativeComponentView == null) {
            if (TextUtils.equals(str, "textarea")) {
                nativeComponentView = new C65854a(i, b, this.f166318c, this.f166317b, this.f166316a);
            } else if (TextUtils.equals(str, "textarea2")) {
                nativeComponentView = new C65868b(i, b, this.f166318c, this.f166317b, this.f166316a);
            } else if (m258190c(str)) {
                nativeComponentView = C65844b.m258013a(i, b, this.f166318c, this.f166317b, str, this.f166316a);
            } else if (TextUtils.equals(str, "webHtml")) {
                nativeComponentView = new C65887g(i, b, this.f166318c);
            } else if (TextUtils.equals(str, "adWebHtml")) {
                nativeComponentView = new C65878e(i, b, this.f166318c);
            } else if (TextUtils.equals(str, "video")) {
                C65903j.C65910c a = C65903j.C65910c.m258187a(str2, this.f166320e);
                a.f166290a = i;
                nativeComponentView = new C65903j(b, this.f166318c, a);
            }
        }
        if (nativeComponentView == null || !(nativeComponentView instanceof View)) {
            AppBrandLogger.m52831w("tma_NativeViewManager", "addView, invalid component: ", nativeComponentView);
            return;
        }
        nativeComponentView.setAppContext(this.f166320e);
        View view = (View) nativeComponentView;
        view.setId(i);
        nativeComponentView.mo48878b(str2, webEventCallback);
        this.f166321f.put(i, view);
        b.mo233798a(view);
    }
}
