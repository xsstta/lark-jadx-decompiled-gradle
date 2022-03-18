package com.bytedance.ee.webapp;

import android.app.Activity;
import android.content.Context;
import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.webapp.v2.WebAppContainerDelegate;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.webapp.f */
public interface AbstractC13794f {

    /* renamed from: com.bytedance.ee.webapp.f$a */
    public interface AbstractC13795a {
        /* renamed from: a */
        boolean mo50848a(String str);

        /* renamed from: b */
        void mo50849b(String str);
    }

    /* renamed from: com.bytedance.ee.webapp.f$b */
    public interface AbstractC13796b {
        /* renamed from: a */
        String mo50850a();

        /* renamed from: a */
        void mo50851a(String str);

        /* renamed from: b */
        String mo50852b();

        /* renamed from: c */
        String mo50853c();

        /* renamed from: d */
        void mo50854d();
    }

    /* renamed from: com.bytedance.ee.webapp.f$c */
    public interface AbstractC13797c {
        void itemClicked(int i);
    }

    /* renamed from: com.bytedance.ee.webapp.f$d */
    public interface AbstractC13798d {
        /* renamed from: a */
        void mo50856a(ClientCertRequest clientCertRequest);
    }

    /* renamed from: com.bytedance.ee.webapp.f$e */
    public interface AbstractC13799e {
        /* renamed from: a */
        boolean mo50857a(Context context, String str);

        /* renamed from: a */
        boolean mo50858a(String str);
    }

    /* renamed from: com.bytedance.ee.webapp.f$f */
    public interface AbstractC13800f {
        /* renamed from: a */
        void mo50859a(Activity activity);

        /* renamed from: a */
        void mo50860a(AbstractInjectWebViewDelegate.AbstractC25823a aVar, Activity activity);

        /* renamed from: a */
        boolean mo50861a();
    }

    /* renamed from: com.bytedance.ee.webapp.f$g */
    public interface AbstractC13801g {
        /* renamed from: a */
        void mo50862a(WebView webView, String str);

        /* renamed from: a */
        void mo50863a(IWebContainerContract.IWebContainerView iWebContainerView, Context context);

        /* renamed from: a */
        void mo50864a(IWebContainerContract.IWebContainerView iWebContainerView, WebView webView, Context context);
    }

    /* renamed from: a */
    String mo50830a();

    /* renamed from: a */
    ArrayList<C25838g> mo50831a(Activity activity, Fragment fragment, AbstractC13797c cVar);

    /* renamed from: a */
    void mo50832a(Activity activity, String str, String str2, String str3, String str4);

    /* renamed from: a */
    void mo50833a(Activity activity, String str, String str2, String str3, String str4, String str5);

    /* renamed from: a */
    void mo50834a(Fragment fragment);

    /* renamed from: a */
    void mo50835a(WebAppContainerDelegate webAppContainerDelegate, String str);

    /* renamed from: a */
    void mo50836a(String str, AbstractC13753a aVar);

    /* renamed from: a */
    void mo50837a(String str, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    boolean mo50838a(String str);

    /* renamed from: b */
    AbstractC13796b mo50839b();

    /* renamed from: b */
    void mo50840b(String str);

    /* renamed from: c */
    AbstractC13801g mo50841c();

    /* renamed from: c */
    C13808i mo50842c(String str);

    /* renamed from: d */
    AbstractC13795a mo50843d();

    /* renamed from: e */
    AbstractC48762d mo50844e();

    /* renamed from: f */
    AbstractC13800f mo50845f();

    /* renamed from: g */
    AbstractC13798d mo50846g();

    /* renamed from: h */
    AbstractC13799e mo50847h();
}
