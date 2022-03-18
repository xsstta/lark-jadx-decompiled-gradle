package com.larksuite.component.webview.container.dto;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19872b;
import com.larksuite.framework.callback.CallbackManager;
import com.ss.android.lark.openapi.jsapi.AbstractC48761c;
import com.ss.android.lark.openapi.permission.C48765a;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IWebContainerContract {

    public interface IWebContainerView {

        public interface IWebContainerTitleBar extends IActionTitlebar {

            @Retention(RetentionPolicy.SOURCE)
            public @interface AddType {
            }

            /* renamed from: a */
            void mo67315a(int i);

            /* renamed from: a */
            void mo67316a(C25835f fVar);

            /* renamed from: a */
            void mo67317a(C25838g gVar);

            /* renamed from: a */
            void mo67318a(C25838g gVar, int i);

            /* renamed from: a */
            void mo67319a(OnSingleClickListener onSingleClickListener);

            /* renamed from: a */
            void mo67320a(String str);

            /* renamed from: a */
            void mo67321a(boolean z);

            /* renamed from: a */
            boolean mo67322a();

            /* renamed from: b */
            void mo67324b(int i);

            /* renamed from: b */
            void mo67325b(OnSingleClickListener onSingleClickListener);

            /* renamed from: b */
            void mo67326b(String str);

            /* renamed from: b */
            void mo67327b(boolean z);

            /* renamed from: b */
            boolean mo67328b();

            /* renamed from: c */
            void mo67329c();

            /* renamed from: c */
            void mo67330c(int i);

            /* renamed from: c */
            void mo67331c(boolean z);

            /* renamed from: d */
            void mo67332d(boolean z);

            /* renamed from: e */
            void mo67333e(boolean z);

            /* renamed from: f */
            void mo67334f(boolean z);
        }

        /* renamed from: com.larksuite.component.webview.container.dto.IWebContainerContract$IWebContainerView$a */
        public interface AbstractC25824a {

            /* renamed from: com.larksuite.component.webview.container.dto.IWebContainerContract$IWebContainerView$a$-CC  reason: invalid class name */
            public final /* synthetic */ class CC {
                public static void $default$a(AbstractC25824a aVar, Configuration configuration) {
                }

                public static void $default$a(AbstractC25824a aVar, WebView webView, int i) {
                }

                public static boolean $default$a(AbstractC25824a aVar, View view) {
                    return false;
                }
            }

            /* renamed from: a */
            WebResourceResponse mo91871a(WebView webView, WebResourceRequest webResourceRequest);

            /* renamed from: a */
            void mo91873a(Configuration configuration);

            /* renamed from: a */
            void mo50975a(WebView webView, int i);

            /* renamed from: a */
            void mo50976a(WebView webView, int i, String str, String str2);

            /* renamed from: a */
            void mo50977a(WebView webView, ClientCertRequest clientCertRequest);

            /* renamed from: a */
            void mo50978a(WebView webView, String str);

            /* renamed from: a */
            boolean mo91875a(View view);

            /* renamed from: b */
            void mo50995b(WebView webView, String str);

            /* renamed from: b */
            boolean mo50998b(String str);

            /* renamed from: c */
            boolean mo51002c(WebView webView, String str);

            /* renamed from: d */
            void mo51004d(WebView webView, String str);
        }

        /* renamed from: com.larksuite.component.webview.container.dto.IWebContainerContract$IWebContainerView$b */
        public interface AbstractC25825b {
            /* renamed from: a */
            void mo91877a(boolean z);
        }

        /* renamed from: a */
        AbstractC25825b mo67305a();

        /* renamed from: a */
        void mo67307a(boolean z);

        /* renamed from: b */
        IWebContainerTitleBar mo67308b();

        /* renamed from: b */
        void mo67309b(boolean z);

        /* renamed from: c */
        boolean mo67310c();

        /* renamed from: d */
        ViewStub mo67311d();

        /* renamed from: f */
        ViewGroup mo67313f();

        /* renamed from: g */
        WebView mo67314g();
    }

    /* renamed from: com.larksuite.component.webview.container.dto.IWebContainerContract$a */
    public interface AbstractC25826a {

        /* renamed from: com.larksuite.component.webview.container.dto.IWebContainerContract$a$a */
        public interface AbstractC25827a {
            /* renamed from: a */
            C48765a mo67344a();

            /* renamed from: a */
            boolean mo67345a(String str);

            /* renamed from: b */
            String mo67346b();
        }

        /* renamed from: a */
        CallbackManager mo67337a();

        /* renamed from: a */
        String mo67338a(Context context);

        /* renamed from: a */
        void mo67339a(String str, AbstractC19872b<?> bVar);

        /* renamed from: a */
        void mo67340a(String str, AbstractC48761c<?> cVar);

        /* renamed from: a */
        void mo67341a(boolean z);

        /* renamed from: b */
        AbstractC25827a mo67342b();

        /* renamed from: c */
        boolean mo67343c();
    }
}
