package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.atfinder.AbstractC4270e;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.larkwebview.bridge.BridgeHandler;
import com.bytedance.ee.util.p707j.C13684a;

public interface DocSdkV2 {

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2$b */
    public interface AbstractC9329b extends DocSdkV2 {
        /* renamed from: a */
        void mo35591a(ViewGroup viewGroup);

        /* renamed from: c */
        void mo35592c();
    }

    void registerCustomJSHandler(String str, AbstractC7943b bVar);

    void registerCustomJSHandler(String str, BridgeHandler cVar);

    void unregisterCustomJSHandler(String str);

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2$a */
    public static class C9328a {

        /* renamed from: a */
        final WebView f25074a;

        /* renamed from: b */
        final C7939a f25075b;

        /* renamed from: c */
        LifecycleOwner f25076c;

        /* renamed from: d */
        boolean f25077d;

        /* renamed from: e */
        PopupWindow f25078e;

        /* renamed from: f */
        ViewGroup f25079f;

        /* renamed from: g */
        AbstractC4270e f25080g;

        /* renamed from: h */
        C13684a.AbstractC13685a f25081h;

        /* renamed from: a */
        public C9328a mo35587a(AbstractC4270e eVar) {
            this.f25080g = eVar;
            return this;
        }

        /* renamed from: a */
        public C9328a mo35588a(C13684a.AbstractC13685a aVar) {
            this.f25081h = aVar;
            return this;
        }

        /* renamed from: a */
        public C9328a mo35589a(boolean z) {
            this.f25077d = z;
            return this;
        }

        /* renamed from: a */
        public AbstractC9329b mo35590a(Fragment fragment) {
            this.f25076c = fragment;
            return new FragmentDocSdkImpl(fragment, this);
        }

        public C9328a(WebView webView, C7939a aVar) {
            this.f25074a = webView;
            this.f25075b = aVar;
        }

        /* renamed from: a */
        public C9328a mo35586a(PopupWindow popupWindow, ViewGroup viewGroup) {
            this.f25078e = popupWindow;
            this.f25079f = viewGroup;
            return this;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2$c */
    public static class C9330c {
        /* renamed from: a */
        public static C7939a m38537a(WebView webView) {
            C7939a aVar = new C7939a(new C9345d(webView));
            webView.addJavascriptInterface(aVar, "_DocsBridge");
            return aVar;
        }
    }
}
